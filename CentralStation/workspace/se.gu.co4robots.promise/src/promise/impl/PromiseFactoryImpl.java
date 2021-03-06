/**
 */
package promise.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import promise.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PromiseFactoryImpl extends EFactoryImpl implements PromiseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PromiseFactory init() {
		try {
			PromiseFactory thePromiseFactory = (PromiseFactory)EPackage.Registry.INSTANCE.getEFactory(PromisePackage.eNS_URI);
			if (thePromiseFactory != null) {
				return thePromiseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PromiseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromiseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PromisePackage.FALL_BACK_OP: return createFallBackOp();
			case PromisePackage.SEQUENCE_OP: return createSequenceOp();
			case PromisePackage.PARALLEL_OP: return createParallelOp();
			case PromisePackage.EVENT_HANDLER_OP: return createEventHandlerOp();
			case PromisePackage.CONDITION_OP: return createConditionOp();
			case PromisePackage.MISSION: return createMission();
			case PromisePackage.ROBOT: return createRobot();
			case PromisePackage.EVENT: return createEvent();
			case PromisePackage.DELEGATE_OP: return createDelegateOp();
			case PromisePackage.ACTION: return createAction();
			case PromisePackage.VISIT: return createVisit();
			case PromisePackage.SEQUENCED_VISIT: return createSequencedVisit();
			case PromisePackage.ORDERDER_VISIT: return createOrderderVisit();
			case PromisePackage.STRICT_ORDERED_VISIT: return createStrictOrderedVisit();
			case PromisePackage.FAIR_VISIT: return createFairVisit();
			case PromisePackage.PATROLLING: return createPatrolling();
			case PromisePackage.SEQUENCED_PATROLLING: return createSequencedPatrolling();
			case PromisePackage.ORDERED_PATROLLING: return createOrderedPatrolling();
			case PromisePackage.STRICT_ORERED_PATROLLING: return createStrictOreredPatrolling();
			case PromisePackage.FAIR_PATROLLING: return createFairPatrolling();
			case PromisePackage.UPPER_RESTRICTED_AVOIDANCE: return createUpperRestrictedAvoidance();
			case PromisePackage.EXACT_RESTRICTED_AVOIDANCE: return createExactRestrictedAvoidance();
			case PromisePackage.LOWER_RESTRICTED_AVOIDANCE: return createLowerRestrictedAvoidance();
			case PromisePackage.FUTURE_AVOIDANCE: return createFutureAvoidance();
			case PromisePackage.GLOBAL_AVOIDANCE: return createGlobalAvoidance();
			case PromisePackage.PAST_AVOIDANCE: return createPastAvoidance();
			case PromisePackage.WAIT: return createWait();
			case PromisePackage.DELAYED_REACTION: return createDelayedReaction();
			case PromisePackage.INSTANT_REACTION: return createInstantReaction();
			case PromisePackage.LOCATION: return createLocation();
			case PromisePackage.SIMPLE_ACTION: return createSimpleAction();
			case PromisePackage.TASK_COMBINATION_OP: return createTaskCombinationOp();
			case PromisePackage.EVENT_ASSIGNMENT: return createEventAssignment();
			case PromisePackage.CHECK: return createCheck();
			case PromisePackage.CHECK_AND_DELIVER: return createCheckAndDeliver();
			case PromisePackage.CHECK_SUPPLIES: return createCheckSupplies();
			case PromisePackage.CHECK_AND_DELIVER_QCH: return createCheckAndDeliverQCh();
			case PromisePackage.TEST_ITAAP_AS: return createTestITAAPAs();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FallBackOp createFallBackOp() {
		FallBackOpImpl fallBackOp = new FallBackOpImpl();
		return fallBackOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceOp createSequenceOp() {
		SequenceOpImpl sequenceOp = new SequenceOpImpl();
		return sequenceOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelOp createParallelOp() {
		ParallelOpImpl parallelOp = new ParallelOpImpl();
		return parallelOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventHandlerOp createEventHandlerOp() {
		EventHandlerOpImpl eventHandlerOp = new EventHandlerOpImpl();
		return eventHandlerOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionOp createConditionOp() {
		ConditionOpImpl conditionOp = new ConditionOpImpl();
		return conditionOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DelegateOp createDelegateOp() {
		DelegateOpImpl delegateOp = new DelegateOpImpl();
		return delegateOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visit createVisit() {
		VisitImpl visit = new VisitImpl();
		return visit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequencedVisit createSequencedVisit() {
		SequencedVisitImpl sequencedVisit = new SequencedVisitImpl();
		return sequencedVisit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderderVisit createOrderderVisit() {
		OrderderVisitImpl orderderVisit = new OrderderVisitImpl();
		return orderderVisit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrictOrderedVisit createStrictOrderedVisit() {
		StrictOrderedVisitImpl strictOrderedVisit = new StrictOrderedVisitImpl();
		return strictOrderedVisit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FairVisit createFairVisit() {
		FairVisitImpl fairVisit = new FairVisitImpl();
		return fairVisit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patrolling createPatrolling() {
		PatrollingImpl patrolling = new PatrollingImpl();
		return patrolling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequencedPatrolling createSequencedPatrolling() {
		SequencedPatrollingImpl sequencedPatrolling = new SequencedPatrollingImpl();
		return sequencedPatrolling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedPatrolling createOrderedPatrolling() {
		OrderedPatrollingImpl orderedPatrolling = new OrderedPatrollingImpl();
		return orderedPatrolling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrictOreredPatrolling createStrictOreredPatrolling() {
		StrictOreredPatrollingImpl strictOreredPatrolling = new StrictOreredPatrollingImpl();
		return strictOreredPatrolling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FairPatrolling createFairPatrolling() {
		FairPatrollingImpl fairPatrolling = new FairPatrollingImpl();
		return fairPatrolling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpperRestrictedAvoidance createUpperRestrictedAvoidance() {
		UpperRestrictedAvoidanceImpl upperRestrictedAvoidance = new UpperRestrictedAvoidanceImpl();
		return upperRestrictedAvoidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExactRestrictedAvoidance createExactRestrictedAvoidance() {
		ExactRestrictedAvoidanceImpl exactRestrictedAvoidance = new ExactRestrictedAvoidanceImpl();
		return exactRestrictedAvoidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowerRestrictedAvoidance createLowerRestrictedAvoidance() {
		LowerRestrictedAvoidanceImpl lowerRestrictedAvoidance = new LowerRestrictedAvoidanceImpl();
		return lowerRestrictedAvoidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FutureAvoidance createFutureAvoidance() {
		FutureAvoidanceImpl futureAvoidance = new FutureAvoidanceImpl();
		return futureAvoidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalAvoidance createGlobalAvoidance() {
		GlobalAvoidanceImpl globalAvoidance = new GlobalAvoidanceImpl();
		return globalAvoidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PastAvoidance createPastAvoidance() {
		PastAvoidanceImpl pastAvoidance = new PastAvoidanceImpl();
		return pastAvoidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DelayedReaction createDelayedReaction() {
		DelayedReactionImpl delayedReaction = new DelayedReactionImpl();
		return delayedReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstantReaction createInstantReaction() {
		InstantReactionImpl instantReaction = new InstantReactionImpl();
		return instantReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleAction createSimpleAction() {
		SimpleActionImpl simpleAction = new SimpleActionImpl();
		return simpleAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskCombinationOp createTaskCombinationOp() {
		TaskCombinationOpImpl taskCombinationOp = new TaskCombinationOpImpl();
		return taskCombinationOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventAssignment createEventAssignment() {
		EventAssignmentImpl eventAssignment = new EventAssignmentImpl();
		return eventAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Check createCheck() {
		CheckImpl check = new CheckImpl();
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckAndDeliver createCheckAndDeliver() {
		CheckAndDeliverImpl checkAndDeliver = new CheckAndDeliverImpl();
		return checkAndDeliver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckSupplies createCheckSupplies() {
		CheckSuppliesImpl checkSupplies = new CheckSuppliesImpl();
		return checkSupplies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckAndDeliverQCh createCheckAndDeliverQCh() {
		CheckAndDeliverQChImpl checkAndDeliverQCh = new CheckAndDeliverQChImpl();
		return checkAndDeliverQCh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestITAAPAs createTestITAAPAs() {
		TestITAAPAsImpl testITAAPAs = new TestITAAPAsImpl();
		return testITAAPAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromisePackage getPromisePackage() {
		return (PromisePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PromisePackage getPackage() {
		return PromisePackage.eINSTANCE;
	}

} //PromiseFactoryImpl
