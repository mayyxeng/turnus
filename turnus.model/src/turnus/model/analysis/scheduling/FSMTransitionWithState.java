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
package turnus.model.analysis.scheduling;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM Transition With State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turnus.model.analysis.scheduling.FSMTransitionWithState#getVarStates <em>Var States</em>}</li>
 * </ul>
 *
 * @see turnus.model.analysis.scheduling.SchedulingPackage#getFSMTransitionWithState()
 * @model
 * @generated
 */
public interface FSMTransitionWithState extends FSMTransition {
	/**
	 * Returns the value of the '<em><b>Var States</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var States</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var States</em>' map.
	 * @see turnus.model.analysis.scheduling.SchedulingPackage#getFSMTransitionWithState_VarStates()
	 * @model mapType="turnus.model.analysis.map.StringToIntegerMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	Map<String, Integer> getVarStates();

} // FSMTransitionWithState
