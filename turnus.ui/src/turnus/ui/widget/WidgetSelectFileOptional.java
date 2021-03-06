/* 
 * TURNUS - www.turnus.co
 * 
 * Copyright (C) 2010-2016 EPFL SCI STI MM
 *
 * This file is part of TURNUS.
 *
 * TURNUS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TURNUS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TURNUS.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Additional permission under GNU GPL version 3 section 7
 * 
 * If you modify this Program, or any covered work, by linking or combining it
 * with Eclipse (or a modified version of Eclipse or an Eclipse plugin or 
 * an Eclipse library), containing parts covered by the terms of the 
 * Eclipse Public License (EPL), the licensors of this Program grant you 
 * additional permission to convey the resulting work.  Corresponding Source 
 * for a non-source form of such a combination shall include the source code 
 * for the parts of Eclipse libraries used as well as that of the  covered work.
 * 
 */
package turnus.ui.widget;

import java.io.File;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import turnus.common.configuration.Option;
import turnus.common.util.FileUtils;
import turnus.ui.Icon;

/**
 * 
 * @author Simone Casale Brunet
 *
 */
public class WidgetSelectFileOptional extends Widget<File> {

	private Label lbl;
	/** the widget text */
	private Text wtext;
	/** the widget error icon */
	private Label errorIcon;
	/** the browse button */
	private Button browse;
	/** the clear button */
	private Button clear;

	protected final String[] fileExtensions;

	public WidgetSelectFileOptional(Option<File> option, String fileExtension, File initialValue, Composite parent) {
		this(option.name(), option.description(), fileExtension, initialValue, parent);
	}

	public WidgetSelectFileOptional(Option<File> option, String[] fileExtensions, File initialValue, Composite parent) {
		this(option.name(), option.description(), fileExtensions, initialValue, parent);
	}

	public WidgetSelectFileOptional(String text, String toolTip, String fileExtension, File initialValue,
			Composite parent) {
		this(text, toolTip, new String[] { fileExtension }, initialValue, parent);
	}

	public WidgetSelectFileOptional(String text, String toolTip, String[] fileExtensions, File initialValue,
			Composite parent) {
		super(text, toolTip, initialValue, 5, parent);
		this.fileExtensions = FileUtils.formatFileExtension(fileExtensions);
		setValue(initialValue, true);
	}

	@Override
	protected void createWidgets(final String text, final String toolTip, File initialValue) {
		lbl = new Label(this, SWT.NONE);
		lbl.setText(text.concat(":"));

		wtext = new Text(this, SWT.BORDER | SWT.SINGLE);
		wtext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		wtext.setToolTipText(toolTip);
		wtext.setEditable(false);

		browse = new Button(this, SWT.PUSH);
		browse.setText("&Browse...");
		browse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell(), SWT.SINGLE);
				dialog.setText(getText().concat(": ").concat(getToolTip()));

				String extensions[] = new String[fileExtensions.length + 1];
				String names[] = new String[fileExtensions.length + 1];

				String all = "";
				for (String ext : fileExtensions) {
					all = all + ";" + ext;
				}
				extensions[0] = all.replaceFirst(";", "");
				names[0] = "*.*";

				for (int i = 0; i < fileExtensions.length; i++) {
					extensions[i + 1] = fileExtensions[i];
					names[i + 1] = fileExtensions[i];
				}

				dialog.setFilterExtensions(extensions);
				dialog.setFilterNames(names);

				String path = dialog.open();
				if (path != null) {
					setValue(new File(path), true);
				}
			}
		});

		clear = new Button(this, SWT.PUSH);
		clear.setText("&Clear...");
		clear.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				setValue(null, true);
			}
		});

		errorIcon = new Label(this, SWT.NONE);
		errorIcon.setImage(Icon.getImage(Icon.EXCLAMATION_RED));
		errorIcon.setVisible(false);

	}

	@Override
	public String getValueAsString() {
		File value = getValue();
		return value != null ? value.getAbsolutePath() : null;
	}

	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		browse.setEnabled(enabled);
		clear.setEnabled(enabled);
		errorIcon.setVisible(enabled && !isValid());
	}

	@Override
	public void setRawValue(String value) {
		if (value == null || value.isEmpty()) {
			setValue(null);
		} else {
			setValue(new File(value));
		}
	}

	@Override
	public void setText(String text) {
		lbl.setText(text);
		super.setText(text);
	}

	@Override
	public void setTooltip(String text) {
		lbl.setToolTipText(text);
		wtext.setToolTipText(text);
		super.setTooltip(text);
	}

	@Override
	public void setValue(File value, boolean redraw) {
		if (value != null) {
			wtext.setText(value.getAbsolutePath());
		} else {
			wtext.setText("");
		}

		if (value == null || value.getAbsolutePath().isEmpty()) {
			setErrorMessage(null);
			errorIcon.setVisible(false);
			errorIcon.setToolTipText("");
		} else if (!value.isFile() || !value.exists()) {
			String error = "\"" + text + "\" contains an invalid file";
			errorIcon.setVisible(true);
			errorIcon.setToolTipText(error);
			setErrorMessage(error);
			value = null;
		}

		super.setValue(value, redraw);
	}

}
