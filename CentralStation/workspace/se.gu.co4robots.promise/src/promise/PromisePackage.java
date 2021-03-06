/**
 */
package promise;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see promise.PromiseFactory
 * @model kind="package"
 * @generated
 */
public interface PromisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "promise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gu.se/co4robots.promise";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co4robots.promise";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PromisePackage eINSTANCE = promise.impl.PromisePackageImpl.init();

	/**
	 * The meta object id for the '{@link promise.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.OperatorImpl
	 * @see promise.impl.PromisePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__EVENT_ASSIGNED = 1;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promise.impl.CompositionOperatorImpl <em>Composition Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.CompositionOperatorImpl
	 * @see promise.impl.PromisePackageImpl#getCompositionOperator()
	 * @generated
	 */
	int COMPOSITION_OPERATOR = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR__PARENT = OPERATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR__EVENT_ASSIGNED = OPERATOR__EVENT_ASSIGNED;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR__INPUT_OPERATORS = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.FallBackOpImpl <em>Fall Back Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.FallBackOpImpl
	 * @see promise.impl.PromisePackageImpl#getFallBackOp()
	 * @generated
	 */
	int FALL_BACK_OP = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALL_BACK_OP__PARENT = COMPOSITION_OPERATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALL_BACK_OP__EVENT_ASSIGNED = COMPOSITION_OPERATOR__EVENT_ASSIGNED;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALL_BACK_OP__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The number of structural features of the '<em>Fall Back Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALL_BACK_OP_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fall Back Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALL_BACK_OP_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.SequenceOpImpl <em>Sequence Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.SequenceOpImpl
	 * @see promise.impl.PromisePackageImpl#getSequenceOp()
	 * @generated
	 */
	int SEQUENCE_OP = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OP__PARENT = COMPOSITION_OPERATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OP__EVENT_ASSIGNED = COMPOSITION_OPERATOR__EVENT_ASSIGNED;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OP__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The number of structural features of the '<em>Sequence Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OP_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OP_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ParallelOpImpl <em>Parallel Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ParallelOpImpl
	 * @see promise.impl.PromisePackageImpl#getParallelOp()
	 * @generated
	 */
	int PARALLEL_OP = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP__PARENT = COMPOSITION_OPERATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP__EVENT_ASSIGNED = COMPOSITION_OPERATOR__EVENT_ASSIGNED;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The feature id for the '<em><b>Input Robots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP__INPUT_ROBOTS = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parallel Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.EventBasedOperatorImpl <em>Event Based Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.EventBasedOperatorImpl
	 * @see promise.impl.PromisePackageImpl#getEventBasedOperator()
	 * @generated
	 */
	int EVENT_BASED_OPERATOR = 40;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_OPERATOR__PARENT = COMPOSITION_OPERATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_OPERATOR__EVENT_ASSIGNED = COMPOSITION_OPERATOR__EVENT_ASSIGNED;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_OPERATOR__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_OPERATOR__INPUT_EVENTS = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Based Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_OPERATOR_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Based Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_OPERATOR_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.EventHandlerOpImpl <em>Event Handler Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.EventHandlerOpImpl
	 * @see promise.impl.PromisePackageImpl#getEventHandlerOp()
	 * @generated
	 */
	int EVENT_HANDLER_OP = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP__PARENT = EVENT_BASED_OPERATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP__EVENT_ASSIGNED = EVENT_BASED_OPERATOR__EVENT_ASSIGNED;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP__INPUT_OPERATORS = EVENT_BASED_OPERATOR__INPUT_OPERATORS;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP__INPUT_EVENTS = EVENT_BASED_OPERATOR__INPUT_EVENTS;

	/**
	 * The number of structural features of the '<em>Event Handler Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP_FEATURE_COUNT = EVENT_BASED_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Handler Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP_OPERATION_COUNT = EVENT_BASED_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ConditionOpImpl <em>Condition Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ConditionOpImpl
	 * @see promise.impl.PromisePackageImpl#getConditionOp()
	 * @generated
	 */
	int CONDITION_OP = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__PARENT = EVENT_BASED_OPERATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__EVENT_ASSIGNED = EVENT_BASED_OPERATOR__EVENT_ASSIGNED;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__INPUT_OPERATORS = EVENT_BASED_OPERATOR__INPUT_OPERATORS;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__INPUT_EVENTS = EVENT_BASED_OPERATOR__INPUT_EVENTS;

	/**
	 * The number of structural features of the '<em>Condition Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP_FEATURE_COUNT = EVENT_BASED_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP_OPERATION_COUNT = EVENT_BASED_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.MissionImpl
	 * @see promise.impl.PromisePackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 6;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__ROBOTS = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__LOCATIONS = 4;

	/**
	 * The feature id for the '<em><b>Eventassignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__EVENTASSIGNMENT = 5;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promise.impl.TasksImpl <em>Tasks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.TasksImpl
	 * @see promise.impl.PromisePackageImpl#getTasks()
	 * @generated
	 */
	int TASKS = 7;

	/**
	 * The number of structural features of the '<em>Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promise.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.NamedElementImpl
	 * @see promise.impl.PromisePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promise.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.RobotImpl
	 * @see promise.impl.PromisePackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.EventImpl
	 * @see promise.impl.PromisePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.DelegateOpImpl <em>Delegate Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.DelegateOpImpl
	 * @see promise.impl.PromisePackageImpl#getDelegateOp()
	 * @generated
	 */
	int DELEGATE_OP = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__PARENT = OPERATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__EVENT_ASSIGNED = OPERATOR__EVENT_ASSIGNED;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__TASK = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__INPUT_ACTION = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stopping Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__STOPPING_EVENT = OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__INPUT_LOCATIONS = OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__INPUT_RESOURCE = OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Delegate Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Delegate Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ActionImpl
	 * @see promise.impl.PromisePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.MovementPatternsImpl <em>Movement Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.MovementPatternsImpl
	 * @see promise.impl.PromisePackageImpl#getMovementPatterns()
	 * @generated
	 */
	int MOVEMENT_PATTERNS = 14;

	/**
	 * The number of structural features of the '<em>Movement Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_PATTERNS_FEATURE_COUNT = TASKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Movement Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_PATTERNS_OPERATION_COUNT = TASKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.VisitImpl <em>Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.VisitImpl
	 * @see promise.impl.PromisePackageImpl#getVisit()
	 * @generated
	 */
	int VISIT = 15;

	/**
	 * The number of structural features of the '<em>Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.SequencedVisitImpl <em>Sequenced Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.SequencedVisitImpl
	 * @see promise.impl.PromisePackageImpl#getSequencedVisit()
	 * @generated
	 */
	int SEQUENCED_VISIT = 16;

	/**
	 * The number of structural features of the '<em>Sequenced Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCED_VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequenced Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCED_VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.OrderderVisitImpl <em>Orderder Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.OrderderVisitImpl
	 * @see promise.impl.PromisePackageImpl#getOrderderVisit()
	 * @generated
	 */
	int ORDERDER_VISIT = 17;

	/**
	 * The number of structural features of the '<em>Orderder Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERDER_VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Orderder Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERDER_VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.StrictOrderedVisitImpl <em>Strict Ordered Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.StrictOrderedVisitImpl
	 * @see promise.impl.PromisePackageImpl#getStrictOrderedVisit()
	 * @generated
	 */
	int STRICT_ORDERED_VISIT = 18;

	/**
	 * The number of structural features of the '<em>Strict Ordered Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORDERED_VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strict Ordered Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORDERED_VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.FairVisitImpl <em>Fair Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.FairVisitImpl
	 * @see promise.impl.PromisePackageImpl#getFairVisit()
	 * @generated
	 */
	int FAIR_VISIT = 19;

	/**
	 * The number of structural features of the '<em>Fair Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fair Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.PatrollingImpl <em>Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.PatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getPatrolling()
	 * @generated
	 */
	int PATROLLING = 20;

	/**
	 * The number of structural features of the '<em>Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.SequencedPatrollingImpl <em>Sequenced Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.SequencedPatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getSequencedPatrolling()
	 * @generated
	 */
	int SEQUENCED_PATROLLING = 21;

	/**
	 * The number of structural features of the '<em>Sequenced Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCED_PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequenced Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCED_PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.OrderedPatrollingImpl <em>Ordered Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.OrderedPatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getOrderedPatrolling()
	 * @generated
	 */
	int ORDERED_PATROLLING = 22;

	/**
	 * The number of structural features of the '<em>Ordered Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.StrictOreredPatrollingImpl <em>Strict Orered Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.StrictOreredPatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getStrictOreredPatrolling()
	 * @generated
	 */
	int STRICT_ORERED_PATROLLING = 23;

	/**
	 * The number of structural features of the '<em>Strict Orered Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORERED_PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strict Orered Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORERED_PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.FairPatrollingImpl <em>Fair Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.FairPatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getFairPatrolling()
	 * @generated
	 */
	int FAIR_PATROLLING = 24;

	/**
	 * The number of structural features of the '<em>Fair Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fair Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.AvoidancePatternsImpl <em>Avoidance Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.AvoidancePatternsImpl
	 * @see promise.impl.PromisePackageImpl#getAvoidancePatterns()
	 * @generated
	 */
	int AVOIDANCE_PATTERNS = 25;

	/**
	 * The number of structural features of the '<em>Avoidance Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOIDANCE_PATTERNS_FEATURE_COUNT = TASKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avoidance Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOIDANCE_PATTERNS_OPERATION_COUNT = TASKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.UpperRestrictedAvoidanceImpl <em>Upper Restricted Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.UpperRestrictedAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getUpperRestrictedAvoidance()
	 * @generated
	 */
	int UPPER_RESTRICTED_AVOIDANCE = 26;

	/**
	 * The number of structural features of the '<em>Upper Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_RESTRICTED_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Upper Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_RESTRICTED_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ExactRestrictedAvoidanceImpl <em>Exact Restricted Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ExactRestrictedAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getExactRestrictedAvoidance()
	 * @generated
	 */
	int EXACT_RESTRICTED_AVOIDANCE = 27;

	/**
	 * The number of structural features of the '<em>Exact Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_RESTRICTED_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exact Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_RESTRICTED_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.LowerRestrictedAvoidanceImpl <em>Lower Restricted Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.LowerRestrictedAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getLowerRestrictedAvoidance()
	 * @generated
	 */
	int LOWER_RESTRICTED_AVOIDANCE = 28;

	/**
	 * The number of structural features of the '<em>Lower Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_RESTRICTED_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_RESTRICTED_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.FutureAvoidanceImpl <em>Future Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.FutureAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getFutureAvoidance()
	 * @generated
	 */
	int FUTURE_AVOIDANCE = 29;

	/**
	 * The number of structural features of the '<em>Future Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Future Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.GlobalAvoidanceImpl <em>Global Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.GlobalAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getGlobalAvoidance()
	 * @generated
	 */
	int GLOBAL_AVOIDANCE = 30;

	/**
	 * The number of structural features of the '<em>Global Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Global Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.PastAvoidanceImpl <em>Past Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.PastAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getPastAvoidance()
	 * @generated
	 */
	int PAST_AVOIDANCE = 31;

	/**
	 * The number of structural features of the '<em>Past Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Past Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.TriggerPatternsImpl <em>Trigger Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.TriggerPatternsImpl
	 * @see promise.impl.PromisePackageImpl#getTriggerPatterns()
	 * @generated
	 */
	int TRIGGER_PATTERNS = 32;

	/**
	 * The number of structural features of the '<em>Trigger Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PATTERNS_FEATURE_COUNT = TASKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trigger Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PATTERNS_OPERATION_COUNT = TASKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.WaitImpl
	 * @see promise.impl.PromisePackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 33;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DESCRIPTION = TRIGGER_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = TRIGGER_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = TRIGGER_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.DelayedReactionImpl <em>Delayed Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.DelayedReactionImpl
	 * @see promise.impl.PromisePackageImpl#getDelayedReaction()
	 * @generated
	 */
	int DELAYED_REACTION = 34;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_REACTION__DESCRIPTION = TRIGGER_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delayed Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_REACTION_FEATURE_COUNT = TRIGGER_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delayed Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_REACTION_OPERATION_COUNT = TRIGGER_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.InstantReactionImpl <em>Instant Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.InstantReactionImpl
	 * @see promise.impl.PromisePackageImpl#getInstantReaction()
	 * @generated
	 */
	int INSTANT_REACTION = 35;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_REACTION__DESCRIPTION = TRIGGER_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instant Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_REACTION_FEATURE_COUNT = TRIGGER_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instant Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_REACTION_OPERATION_COUNT = TRIGGER_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.LocationImpl
	 * @see promise.impl.PromisePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.SimpleActionImpl <em>Simple Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.SimpleActionImpl
	 * @see promise.impl.PromisePackageImpl#getSimpleAction()
	 * @generated
	 */
	int SIMPLE_ACTION = 37;

	/**
	 * The number of structural features of the '<em>Simple Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_FEATURE_COUNT = TASKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_OPERATION_COUNT = TASKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.TaskCombinationOpImpl <em>Task Combination Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.TaskCombinationOpImpl
	 * @see promise.impl.PromisePackageImpl#getTaskCombinationOp()
	 * @generated
	 */
	int TASK_COMBINATION_OP = 38;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMBINATION_OP__PARENT = COMPOSITION_OPERATOR__PARENT;

	/**
	 * The feature id for the '<em><b>Event Assigned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMBINATION_OP__EVENT_ASSIGNED = COMPOSITION_OPERATOR__EVENT_ASSIGNED;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMBINATION_OP__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The number of structural features of the '<em>Task Combination Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMBINATION_OP_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Combination Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMBINATION_OP_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.EventAssignmentImpl <em>Event Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.EventAssignmentImpl
	 * @see promise.impl.PromisePackageImpl#getEventAssignment()
	 * @generated
	 */
	int EVENT_ASSIGNMENT = 39;

	/**
	 * The feature id for the '<em><b>Input Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ASSIGNMENT__INPUT_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ASSIGNMENT__INPUT_OPERATORS = 1;

	/**
	 * The feature id for the '<em><b>Parent event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ASSIGNMENT__PARENT_EVENT = 2;

	/**
	 * The number of structural features of the '<em>Event Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ASSIGNMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link promise.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.CheckImpl
	 * @see promise.impl.PromisePackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 41;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.CheckAndDeliverImpl <em>Check And Deliver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.CheckAndDeliverImpl
	 * @see promise.impl.PromisePackageImpl#getCheckAndDeliver()
	 * @generated
	 */
	int CHECK_AND_DELIVER = 42;

	/**
	 * The number of structural features of the '<em>Check And Deliver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_AND_DELIVER_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Check And Deliver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_AND_DELIVER_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.CheckSuppliesImpl <em>Check Supplies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.CheckSuppliesImpl
	 * @see promise.impl.PromisePackageImpl#getCheckSupplies()
	 * @generated
	 */
	int CHECK_SUPPLIES = 43;

	/**
	 * The number of structural features of the '<em>Check Supplies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_SUPPLIES_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Check Supplies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_SUPPLIES_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.CheckAndDeliverQChImpl <em>Check And Deliver QCh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.CheckAndDeliverQChImpl
	 * @see promise.impl.PromisePackageImpl#getCheckAndDeliverQCh()
	 * @generated
	 */
	int CHECK_AND_DELIVER_QCH = 44;

	/**
	 * The number of structural features of the '<em>Check And Deliver QCh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_AND_DELIVER_QCH_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Check And Deliver QCh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_AND_DELIVER_QCH_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.TestITAAPAsImpl <em>Test ITAAP As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.TestITAAPAsImpl
	 * @see promise.impl.PromisePackageImpl#getTestITAAPAs()
	 * @generated
	 */
	int TEST_ITAAP_AS = 45;

	/**
	 * The number of structural features of the '<em>Test ITAAP As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ITAAP_AS_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Test ITAAP As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ITAAP_AS_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link promise.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see promise.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the container reference '{@link promise.Operator#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see promise.Operator#getParent()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Parent();

	/**
	 * Returns the meta object for the container reference '{@link promise.Operator#getEventAssigned <em>Event Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Event Assigned</em>'.
	 * @see promise.Operator#getEventAssigned()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_EventAssigned();

	/**
	 * Returns the meta object for class '{@link promise.FallBackOp <em>Fall Back Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fall Back Op</em>'.
	 * @see promise.FallBackOp
	 * @generated
	 */
	EClass getFallBackOp();

	/**
	 * Returns the meta object for class '{@link promise.SequenceOp <em>Sequence Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Op</em>'.
	 * @see promise.SequenceOp
	 * @generated
	 */
	EClass getSequenceOp();

	/**
	 * Returns the meta object for class '{@link promise.ParallelOp <em>Parallel Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Op</em>'.
	 * @see promise.ParallelOp
	 * @generated
	 */
	EClass getParallelOp();

	/**
	 * Returns the meta object for the reference list '{@link promise.ParallelOp#getInputRobots <em>Input Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Robots</em>'.
	 * @see promise.ParallelOp#getInputRobots()
	 * @see #getParallelOp()
	 * @generated
	 */
	EReference getParallelOp_InputRobots();

	/**
	 * Returns the meta object for class '{@link promise.EventHandlerOp <em>Event Handler Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler Op</em>'.
	 * @see promise.EventHandlerOp
	 * @generated
	 */
	EClass getEventHandlerOp();

	/**
	 * Returns the meta object for class '{@link promise.ConditionOp <em>Condition Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Op</em>'.
	 * @see promise.ConditionOp
	 * @generated
	 */
	EClass getConditionOp();

	/**
	 * Returns the meta object for class '{@link promise.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see promise.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operator</em>'.
	 * @see promise.Mission#getOperator()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robots</em>'.
	 * @see promise.Mission#getRobots()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Robots();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see promise.Mission#getActions()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see promise.Mission#getEvents()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see promise.Mission#getLocations()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getEventassignment <em>Eventassignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eventassignment</em>'.
	 * @see promise.Mission#getEventassignment()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Eventassignment();

	/**
	 * Returns the meta object for class '{@link promise.Tasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasks</em>'.
	 * @see promise.Tasks
	 * @generated
	 */
	EClass getTasks();

	/**
	 * Returns the meta object for class '{@link promise.CompositionOperator <em>Composition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Operator</em>'.
	 * @see promise.CompositionOperator
	 * @generated
	 */
	EClass getCompositionOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.CompositionOperator#getInputOperators <em>Input Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Operators</em>'.
	 * @see promise.CompositionOperator#getInputOperators()
	 * @see #getCompositionOperator()
	 * @generated
	 */
	EReference getCompositionOperator_InputOperators();

	/**
	 * Returns the meta object for class '{@link promise.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see promise.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for class '{@link promise.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see promise.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link promise.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see promise.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link promise.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see promise.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link promise.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see promise.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for class '{@link promise.DelegateOp <em>Delegate Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegate Op</em>'.
	 * @see promise.DelegateOp
	 * @generated
	 */
	EClass getDelegateOp();

	/**
	 * Returns the meta object for the containment reference '{@link promise.DelegateOp#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see promise.DelegateOp#getTask()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_Task();

	/**
	 * Returns the meta object for the reference list '{@link promise.DelegateOp#getInputAction <em>Input Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Action</em>'.
	 * @see promise.DelegateOp#getInputAction()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_InputAction();

	/**
	 * Returns the meta object for the reference list '{@link promise.DelegateOp#getStoppingEvent <em>Stopping Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stopping Event</em>'.
	 * @see promise.DelegateOp#getStoppingEvent()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_StoppingEvent();

	/**
	 * Returns the meta object for the reference list '{@link promise.DelegateOp#getInputLocations <em>Input Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Locations</em>'.
	 * @see promise.DelegateOp#getInputLocations()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_InputLocations();

	/**
	 * Returns the meta object for the reference list '{@link promise.DelegateOp#getInputResource <em>Input Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Resource</em>'.
	 * @see promise.DelegateOp#getInputResource()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_InputResource();

	/**
	 * Returns the meta object for class '{@link promise.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see promise.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link promise.Action#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see promise.Action#getDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Description();

	/**
	 * Returns the meta object for class '{@link promise.MovementPatterns <em>Movement Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement Patterns</em>'.
	 * @see promise.MovementPatterns
	 * @generated
	 */
	EClass getMovementPatterns();

	/**
	 * Returns the meta object for class '{@link promise.Visit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visit</em>'.
	 * @see promise.Visit
	 * @generated
	 */
	EClass getVisit();

	/**
	 * Returns the meta object for class '{@link promise.SequencedVisit <em>Sequenced Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequenced Visit</em>'.
	 * @see promise.SequencedVisit
	 * @generated
	 */
	EClass getSequencedVisit();

	/**
	 * Returns the meta object for class '{@link promise.OrderderVisit <em>Orderder Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orderder Visit</em>'.
	 * @see promise.OrderderVisit
	 * @generated
	 */
	EClass getOrderderVisit();

	/**
	 * Returns the meta object for class '{@link promise.StrictOrderedVisit <em>Strict Ordered Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strict Ordered Visit</em>'.
	 * @see promise.StrictOrderedVisit
	 * @generated
	 */
	EClass getStrictOrderedVisit();

	/**
	 * Returns the meta object for class '{@link promise.FairVisit <em>Fair Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fair Visit</em>'.
	 * @see promise.FairVisit
	 * @generated
	 */
	EClass getFairVisit();

	/**
	 * Returns the meta object for class '{@link promise.Patrolling <em>Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patrolling</em>'.
	 * @see promise.Patrolling
	 * @generated
	 */
	EClass getPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.SequencedPatrolling <em>Sequenced Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequenced Patrolling</em>'.
	 * @see promise.SequencedPatrolling
	 * @generated
	 */
	EClass getSequencedPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.OrderedPatrolling <em>Ordered Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Patrolling</em>'.
	 * @see promise.OrderedPatrolling
	 * @generated
	 */
	EClass getOrderedPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.StrictOreredPatrolling <em>Strict Orered Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strict Orered Patrolling</em>'.
	 * @see promise.StrictOreredPatrolling
	 * @generated
	 */
	EClass getStrictOreredPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.FairPatrolling <em>Fair Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fair Patrolling</em>'.
	 * @see promise.FairPatrolling
	 * @generated
	 */
	EClass getFairPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.AvoidancePatterns <em>Avoidance Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avoidance Patterns</em>'.
	 * @see promise.AvoidancePatterns
	 * @generated
	 */
	EClass getAvoidancePatterns();

	/**
	 * Returns the meta object for class '{@link promise.UpperRestrictedAvoidance <em>Upper Restricted Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Restricted Avoidance</em>'.
	 * @see promise.UpperRestrictedAvoidance
	 * @generated
	 */
	EClass getUpperRestrictedAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.ExactRestrictedAvoidance <em>Exact Restricted Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exact Restricted Avoidance</em>'.
	 * @see promise.ExactRestrictedAvoidance
	 * @generated
	 */
	EClass getExactRestrictedAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.LowerRestrictedAvoidance <em>Lower Restricted Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Restricted Avoidance</em>'.
	 * @see promise.LowerRestrictedAvoidance
	 * @generated
	 */
	EClass getLowerRestrictedAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.FutureAvoidance <em>Future Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Future Avoidance</em>'.
	 * @see promise.FutureAvoidance
	 * @generated
	 */
	EClass getFutureAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.GlobalAvoidance <em>Global Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Avoidance</em>'.
	 * @see promise.GlobalAvoidance
	 * @generated
	 */
	EClass getGlobalAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.PastAvoidance <em>Past Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Past Avoidance</em>'.
	 * @see promise.PastAvoidance
	 * @generated
	 */
	EClass getPastAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.TriggerPatterns <em>Trigger Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Patterns</em>'.
	 * @see promise.TriggerPatterns
	 * @generated
	 */
	EClass getTriggerPatterns();

	/**
	 * Returns the meta object for class '{@link promise.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see promise.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link promise.Wait#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see promise.Wait#getDescription()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Description();

	/**
	 * Returns the meta object for class '{@link promise.DelayedReaction <em>Delayed Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delayed Reaction</em>'.
	 * @see promise.DelayedReaction
	 * @generated
	 */
	EClass getDelayedReaction();

	/**
	 * Returns the meta object for the attribute '{@link promise.DelayedReaction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see promise.DelayedReaction#getDescription()
	 * @see #getDelayedReaction()
	 * @generated
	 */
	EAttribute getDelayedReaction_Description();

	/**
	 * Returns the meta object for class '{@link promise.InstantReaction <em>Instant Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant Reaction</em>'.
	 * @see promise.InstantReaction
	 * @generated
	 */
	EClass getInstantReaction();

	/**
	 * Returns the meta object for the attribute '{@link promise.InstantReaction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see promise.InstantReaction#getDescription()
	 * @see #getInstantReaction()
	 * @generated
	 */
	EAttribute getInstantReaction_Description();

	/**
	 * Returns the meta object for class '{@link promise.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see promise.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link promise.SimpleAction <em>Simple Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Action</em>'.
	 * @see promise.SimpleAction
	 * @generated
	 */
	EClass getSimpleAction();

	/**
	 * Returns the meta object for class '{@link promise.TaskCombinationOp <em>Task Combination Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Combination Op</em>'.
	 * @see promise.TaskCombinationOp
	 * @generated
	 */
	EClass getTaskCombinationOp();

	/**
	 * Returns the meta object for class '{@link promise.EventAssignment <em>Event Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Assignment</em>'.
	 * @see promise.EventAssignment
	 * @generated
	 */
	EClass getEventAssignment();

	/**
	 * Returns the meta object for the reference '{@link promise.EventAssignment#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Event</em>'.
	 * @see promise.EventAssignment#getInputEvent()
	 * @see #getEventAssignment()
	 * @generated
	 */
	EReference getEventAssignment_InputEvent();

	/**
	 * Returns the meta object for the containment reference '{@link promise.EventAssignment#getInputOperators <em>Input Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Operators</em>'.
	 * @see promise.EventAssignment#getInputOperators()
	 * @see #getEventAssignment()
	 * @generated
	 */
	EReference getEventAssignment_InputOperators();

	/**
	 * Returns the meta object for the container reference '{@link promise.EventAssignment#getParent_event <em>Parent event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent event</em>'.
	 * @see promise.EventAssignment#getParent_event()
	 * @see #getEventAssignment()
	 * @generated
	 */
	EReference getEventAssignment_Parent_event();

	/**
	 * Returns the meta object for class '{@link promise.EventBasedOperator <em>Event Based Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Based Operator</em>'.
	 * @see promise.EventBasedOperator
	 * @generated
	 */
	EClass getEventBasedOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.EventBasedOperator#getInputEvents <em>Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Events</em>'.
	 * @see promise.EventBasedOperator#getInputEvents()
	 * @see #getEventBasedOperator()
	 * @generated
	 */
	EReference getEventBasedOperator_InputEvents();

	/**
	 * Returns the meta object for class '{@link promise.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see promise.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for class '{@link promise.CheckAndDeliver <em>Check And Deliver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check And Deliver</em>'.
	 * @see promise.CheckAndDeliver
	 * @generated
	 */
	EClass getCheckAndDeliver();

	/**
	 * Returns the meta object for class '{@link promise.CheckSupplies <em>Check Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Supplies</em>'.
	 * @see promise.CheckSupplies
	 * @generated
	 */
	EClass getCheckSupplies();

	/**
	 * Returns the meta object for class '{@link promise.CheckAndDeliverQCh <em>Check And Deliver QCh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check And Deliver QCh</em>'.
	 * @see promise.CheckAndDeliverQCh
	 * @generated
	 */
	EClass getCheckAndDeliverQCh();

	/**
	 * Returns the meta object for class '{@link promise.TestITAAPAs <em>Test ITAAP As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test ITAAP As</em>'.
	 * @see promise.TestITAAPAs
	 * @generated
	 */
	EClass getTestITAAPAs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PromiseFactory getPromiseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link promise.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.OperatorImpl
		 * @see promise.impl.PromisePackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__PARENT = eINSTANCE.getOperator_Parent();

		/**
		 * The meta object literal for the '<em><b>Event Assigned</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__EVENT_ASSIGNED = eINSTANCE.getOperator_EventAssigned();

		/**
		 * The meta object literal for the '{@link promise.impl.FallBackOpImpl <em>Fall Back Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.FallBackOpImpl
		 * @see promise.impl.PromisePackageImpl#getFallBackOp()
		 * @generated
		 */
		EClass FALL_BACK_OP = eINSTANCE.getFallBackOp();

		/**
		 * The meta object literal for the '{@link promise.impl.SequenceOpImpl <em>Sequence Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.SequenceOpImpl
		 * @see promise.impl.PromisePackageImpl#getSequenceOp()
		 * @generated
		 */
		EClass SEQUENCE_OP = eINSTANCE.getSequenceOp();

		/**
		 * The meta object literal for the '{@link promise.impl.ParallelOpImpl <em>Parallel Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ParallelOpImpl
		 * @see promise.impl.PromisePackageImpl#getParallelOp()
		 * @generated
		 */
		EClass PARALLEL_OP = eINSTANCE.getParallelOp();

		/**
		 * The meta object literal for the '<em><b>Input Robots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_OP__INPUT_ROBOTS = eINSTANCE.getParallelOp_InputRobots();

		/**
		 * The meta object literal for the '{@link promise.impl.EventHandlerOpImpl <em>Event Handler Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.EventHandlerOpImpl
		 * @see promise.impl.PromisePackageImpl#getEventHandlerOp()
		 * @generated
		 */
		EClass EVENT_HANDLER_OP = eINSTANCE.getEventHandlerOp();

		/**
		 * The meta object literal for the '{@link promise.impl.ConditionOpImpl <em>Condition Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ConditionOpImpl
		 * @see promise.impl.PromisePackageImpl#getConditionOp()
		 * @generated
		 */
		EClass CONDITION_OP = eINSTANCE.getConditionOp();

		/**
		 * The meta object literal for the '{@link promise.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.MissionImpl
		 * @see promise.impl.PromisePackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__OPERATOR = eINSTANCE.getMission_Operator();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__ROBOTS = eINSTANCE.getMission_Robots();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__ACTIONS = eINSTANCE.getMission_Actions();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__EVENTS = eINSTANCE.getMission_Events();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__LOCATIONS = eINSTANCE.getMission_Locations();

		/**
		 * The meta object literal for the '<em><b>Eventassignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__EVENTASSIGNMENT = eINSTANCE.getMission_Eventassignment();

		/**
		 * The meta object literal for the '{@link promise.impl.TasksImpl <em>Tasks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.TasksImpl
		 * @see promise.impl.PromisePackageImpl#getTasks()
		 * @generated
		 */
		EClass TASKS = eINSTANCE.getTasks();

		/**
		 * The meta object literal for the '{@link promise.impl.CompositionOperatorImpl <em>Composition Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.CompositionOperatorImpl
		 * @see promise.impl.PromisePackageImpl#getCompositionOperator()
		 * @generated
		 */
		EClass COMPOSITION_OPERATOR = eINSTANCE.getCompositionOperator();

		/**
		 * The meta object literal for the '<em><b>Input Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_OPERATOR__INPUT_OPERATORS = eINSTANCE.getCompositionOperator_InputOperators();

		/**
		 * The meta object literal for the '{@link promise.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.RobotImpl
		 * @see promise.impl.PromisePackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '{@link promise.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.NamedElementImpl
		 * @see promise.impl.PromisePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link promise.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.EventImpl
		 * @see promise.impl.PromisePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '{@link promise.impl.DelegateOpImpl <em>Delegate Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.DelegateOpImpl
		 * @see promise.impl.PromisePackageImpl#getDelegateOp()
		 * @generated
		 */
		EClass DELEGATE_OP = eINSTANCE.getDelegateOp();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__TASK = eINSTANCE.getDelegateOp_Task();

		/**
		 * The meta object literal for the '<em><b>Input Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__INPUT_ACTION = eINSTANCE.getDelegateOp_InputAction();

		/**
		 * The meta object literal for the '<em><b>Stopping Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__STOPPING_EVENT = eINSTANCE.getDelegateOp_StoppingEvent();

		/**
		 * The meta object literal for the '<em><b>Input Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__INPUT_LOCATIONS = eINSTANCE.getDelegateOp_InputLocations();

		/**
		 * The meta object literal for the '<em><b>Input Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__INPUT_RESOURCE = eINSTANCE.getDelegateOp_InputResource();

		/**
		 * The meta object literal for the '{@link promise.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ActionImpl
		 * @see promise.impl.PromisePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DESCRIPTION = eINSTANCE.getAction_Description();

		/**
		 * The meta object literal for the '{@link promise.impl.MovementPatternsImpl <em>Movement Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.MovementPatternsImpl
		 * @see promise.impl.PromisePackageImpl#getMovementPatterns()
		 * @generated
		 */
		EClass MOVEMENT_PATTERNS = eINSTANCE.getMovementPatterns();

		/**
		 * The meta object literal for the '{@link promise.impl.VisitImpl <em>Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.VisitImpl
		 * @see promise.impl.PromisePackageImpl#getVisit()
		 * @generated
		 */
		EClass VISIT = eINSTANCE.getVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.SequencedVisitImpl <em>Sequenced Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.SequencedVisitImpl
		 * @see promise.impl.PromisePackageImpl#getSequencedVisit()
		 * @generated
		 */
		EClass SEQUENCED_VISIT = eINSTANCE.getSequencedVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.OrderderVisitImpl <em>Orderder Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.OrderderVisitImpl
		 * @see promise.impl.PromisePackageImpl#getOrderderVisit()
		 * @generated
		 */
		EClass ORDERDER_VISIT = eINSTANCE.getOrderderVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.StrictOrderedVisitImpl <em>Strict Ordered Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.StrictOrderedVisitImpl
		 * @see promise.impl.PromisePackageImpl#getStrictOrderedVisit()
		 * @generated
		 */
		EClass STRICT_ORDERED_VISIT = eINSTANCE.getStrictOrderedVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.FairVisitImpl <em>Fair Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.FairVisitImpl
		 * @see promise.impl.PromisePackageImpl#getFairVisit()
		 * @generated
		 */
		EClass FAIR_VISIT = eINSTANCE.getFairVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.PatrollingImpl <em>Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.PatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getPatrolling()
		 * @generated
		 */
		EClass PATROLLING = eINSTANCE.getPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.SequencedPatrollingImpl <em>Sequenced Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.SequencedPatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getSequencedPatrolling()
		 * @generated
		 */
		EClass SEQUENCED_PATROLLING = eINSTANCE.getSequencedPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.OrderedPatrollingImpl <em>Ordered Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.OrderedPatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getOrderedPatrolling()
		 * @generated
		 */
		EClass ORDERED_PATROLLING = eINSTANCE.getOrderedPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.StrictOreredPatrollingImpl <em>Strict Orered Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.StrictOreredPatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getStrictOreredPatrolling()
		 * @generated
		 */
		EClass STRICT_ORERED_PATROLLING = eINSTANCE.getStrictOreredPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.FairPatrollingImpl <em>Fair Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.FairPatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getFairPatrolling()
		 * @generated
		 */
		EClass FAIR_PATROLLING = eINSTANCE.getFairPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.AvoidancePatternsImpl <em>Avoidance Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.AvoidancePatternsImpl
		 * @see promise.impl.PromisePackageImpl#getAvoidancePatterns()
		 * @generated
		 */
		EClass AVOIDANCE_PATTERNS = eINSTANCE.getAvoidancePatterns();

		/**
		 * The meta object literal for the '{@link promise.impl.UpperRestrictedAvoidanceImpl <em>Upper Restricted Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.UpperRestrictedAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getUpperRestrictedAvoidance()
		 * @generated
		 */
		EClass UPPER_RESTRICTED_AVOIDANCE = eINSTANCE.getUpperRestrictedAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.ExactRestrictedAvoidanceImpl <em>Exact Restricted Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ExactRestrictedAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getExactRestrictedAvoidance()
		 * @generated
		 */
		EClass EXACT_RESTRICTED_AVOIDANCE = eINSTANCE.getExactRestrictedAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.LowerRestrictedAvoidanceImpl <em>Lower Restricted Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.LowerRestrictedAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getLowerRestrictedAvoidance()
		 * @generated
		 */
		EClass LOWER_RESTRICTED_AVOIDANCE = eINSTANCE.getLowerRestrictedAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.FutureAvoidanceImpl <em>Future Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.FutureAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getFutureAvoidance()
		 * @generated
		 */
		EClass FUTURE_AVOIDANCE = eINSTANCE.getFutureAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.GlobalAvoidanceImpl <em>Global Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.GlobalAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getGlobalAvoidance()
		 * @generated
		 */
		EClass GLOBAL_AVOIDANCE = eINSTANCE.getGlobalAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.PastAvoidanceImpl <em>Past Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.PastAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getPastAvoidance()
		 * @generated
		 */
		EClass PAST_AVOIDANCE = eINSTANCE.getPastAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.TriggerPatternsImpl <em>Trigger Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.TriggerPatternsImpl
		 * @see promise.impl.PromisePackageImpl#getTriggerPatterns()
		 * @generated
		 */
		EClass TRIGGER_PATTERNS = eINSTANCE.getTriggerPatterns();

		/**
		 * The meta object literal for the '{@link promise.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.WaitImpl
		 * @see promise.impl.PromisePackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__DESCRIPTION = eINSTANCE.getWait_Description();

		/**
		 * The meta object literal for the '{@link promise.impl.DelayedReactionImpl <em>Delayed Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.DelayedReactionImpl
		 * @see promise.impl.PromisePackageImpl#getDelayedReaction()
		 * @generated
		 */
		EClass DELAYED_REACTION = eINSTANCE.getDelayedReaction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAYED_REACTION__DESCRIPTION = eINSTANCE.getDelayedReaction_Description();

		/**
		 * The meta object literal for the '{@link promise.impl.InstantReactionImpl <em>Instant Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.InstantReactionImpl
		 * @see promise.impl.PromisePackageImpl#getInstantReaction()
		 * @generated
		 */
		EClass INSTANT_REACTION = eINSTANCE.getInstantReaction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT_REACTION__DESCRIPTION = eINSTANCE.getInstantReaction_Description();

		/**
		 * The meta object literal for the '{@link promise.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.LocationImpl
		 * @see promise.impl.PromisePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link promise.impl.SimpleActionImpl <em>Simple Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.SimpleActionImpl
		 * @see promise.impl.PromisePackageImpl#getSimpleAction()
		 * @generated
		 */
		EClass SIMPLE_ACTION = eINSTANCE.getSimpleAction();

		/**
		 * The meta object literal for the '{@link promise.impl.TaskCombinationOpImpl <em>Task Combination Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.TaskCombinationOpImpl
		 * @see promise.impl.PromisePackageImpl#getTaskCombinationOp()
		 * @generated
		 */
		EClass TASK_COMBINATION_OP = eINSTANCE.getTaskCombinationOp();

		/**
		 * The meta object literal for the '{@link promise.impl.EventAssignmentImpl <em>Event Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.EventAssignmentImpl
		 * @see promise.impl.PromisePackageImpl#getEventAssignment()
		 * @generated
		 */
		EClass EVENT_ASSIGNMENT = eINSTANCE.getEventAssignment();

		/**
		 * The meta object literal for the '<em><b>Input Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ASSIGNMENT__INPUT_EVENT = eINSTANCE.getEventAssignment_InputEvent();

		/**
		 * The meta object literal for the '<em><b>Input Operators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ASSIGNMENT__INPUT_OPERATORS = eINSTANCE.getEventAssignment_InputOperators();

		/**
		 * The meta object literal for the '<em><b>Parent event</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ASSIGNMENT__PARENT_EVENT = eINSTANCE.getEventAssignment_Parent_event();

		/**
		 * The meta object literal for the '{@link promise.impl.EventBasedOperatorImpl <em>Event Based Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.EventBasedOperatorImpl
		 * @see promise.impl.PromisePackageImpl#getEventBasedOperator()
		 * @generated
		 */
		EClass EVENT_BASED_OPERATOR = eINSTANCE.getEventBasedOperator();

		/**
		 * The meta object literal for the '<em><b>Input Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BASED_OPERATOR__INPUT_EVENTS = eINSTANCE.getEventBasedOperator_InputEvents();

		/**
		 * The meta object literal for the '{@link promise.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.CheckImpl
		 * @see promise.impl.PromisePackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '{@link promise.impl.CheckAndDeliverImpl <em>Check And Deliver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.CheckAndDeliverImpl
		 * @see promise.impl.PromisePackageImpl#getCheckAndDeliver()
		 * @generated
		 */
		EClass CHECK_AND_DELIVER = eINSTANCE.getCheckAndDeliver();

		/**
		 * The meta object literal for the '{@link promise.impl.CheckSuppliesImpl <em>Check Supplies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.CheckSuppliesImpl
		 * @see promise.impl.PromisePackageImpl#getCheckSupplies()
		 * @generated
		 */
		EClass CHECK_SUPPLIES = eINSTANCE.getCheckSupplies();

		/**
		 * The meta object literal for the '{@link promise.impl.CheckAndDeliverQChImpl <em>Check And Deliver QCh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.CheckAndDeliverQChImpl
		 * @see promise.impl.PromisePackageImpl#getCheckAndDeliverQCh()
		 * @generated
		 */
		EClass CHECK_AND_DELIVER_QCH = eINSTANCE.getCheckAndDeliverQCh();

		/**
		 * The meta object literal for the '{@link promise.impl.TestITAAPAsImpl <em>Test ITAAP As</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.TestITAAPAsImpl
		 * @see promise.impl.PromisePackageImpl#getTestITAAPAs()
		 * @generated
		 */
		EClass TEST_ITAAP_AS = eINSTANCE.getTestITAAPAs();

	}

} //PromisePackage
