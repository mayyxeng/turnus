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

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turnus.model.analysis.scheduling.FSM#getStates <em>States</em>}</li>
 *   <li>{@link turnus.model.analysis.scheduling.FSM#getVars <em>Vars</em>}</li>
 *   <li>{@link turnus.model.analysis.scheduling.FSM#getStartState <em>Start State</em>}</li>
 *   <li>{@link turnus.model.analysis.scheduling.FSM#getTerminalState <em>Terminal State</em>}</li>
 * </ul>
 *
 * @see turnus.model.analysis.scheduling.SchedulingPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends ActorSelectionSchedule {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link turnus.model.analysis.scheduling.FSMState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see turnus.model.analysis.scheduling.SchedulingPackage#getFSM_States()
	 * @model containment="true"
	 * @generated
	 */
	List<FSMState> getStates();

	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link turnus.model.analysis.scheduling.FSMVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see turnus.model.analysis.scheduling.SchedulingPackage#getFSM_Vars()
	 * @model containment="true"
	 * @generated
	 */
	List<FSMVar> getVars();

	/**
	 * Returns the value of the '<em><b>Start State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start State</em>' attribute.
	 * @see #setStartState(String)
	 * @see turnus.model.analysis.scheduling.SchedulingPackage#getFSM_StartState()
	 * @model
	 * @generated
	 */
	String getStartState();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.scheduling.FSM#getStartState <em>Start State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start State</em>' attribute.
	 * @see #getStartState()
	 * @generated
	 */
	void setStartState(String value);

	/**
	 * Returns the value of the '<em><b>Terminal State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal State</em>' attribute.
	 * @see #setTerminalState(String)
	 * @see turnus.model.analysis.scheduling.SchedulingPackage#getFSM_TerminalState()
	 * @model
	 * @generated
	 */
	String getTerminalState();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.scheduling.FSM#getTerminalState <em>Terminal State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal State</em>' attribute.
	 * @see #getTerminalState()
	 * @generated
	 */
	void setTerminalState(String value);

} // FSM
