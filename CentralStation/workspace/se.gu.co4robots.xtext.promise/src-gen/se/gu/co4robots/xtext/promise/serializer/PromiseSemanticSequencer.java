/*
 * generated by Xtext 2.12.0
 */
package se.gu.co4robots.xtext.promise.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import promise.Check;
import promise.CheckAndDeliver;
import promise.CheckAndDeliverQCh;
import promise.CheckSupplies;
import promise.ConditionOp;
import promise.DelayedReaction;
import promise.DelegateOp;
import promise.Event;
import promise.EventAssignment;
import promise.EventHandlerOp;
import promise.ExactRestrictedAvoidance;
import promise.FairPatrolling;
import promise.FairVisit;
import promise.FallBackOp;
import promise.FutureAvoidance;
import promise.GlobalAvoidance;
import promise.InstantReaction;
import promise.Location;
import promise.LowerRestrictedAvoidance;
import promise.Mission;
import promise.OrderderVisit;
import promise.OrderedPatrolling;
import promise.ParallelOp;
import promise.PastAvoidance;
import promise.Patrolling;
import promise.PromisePackage;
import promise.Robot;
import promise.SequenceOp;
import promise.SequencedPatrolling;
import promise.SequencedVisit;
import promise.SimpleAction;
import promise.StrictOrderedVisit;
import promise.StrictOreredPatrolling;
import promise.TaskCombinationOp;
import promise.TestITAAPAs;
import promise.UpperRestrictedAvoidance;
import promise.Visit;
import promise.Wait;
import se.gu.co4robots.xtext.promise.services.PromiseGrammarAccess;

@SuppressWarnings("all")
public class PromiseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PromiseGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PromisePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PromisePackage.ACTION:
				sequence_Action(context, (promise.Action) semanticObject); 
				return; 
			case PromisePackage.CHECK:
				sequence_Check(context, (Check) semanticObject); 
				return; 
			case PromisePackage.CHECK_AND_DELIVER:
				sequence_CheckAndDeliver(context, (CheckAndDeliver) semanticObject); 
				return; 
			case PromisePackage.CHECK_AND_DELIVER_QCH:
				sequence_CheckAndDeliverQCh(context, (CheckAndDeliverQCh) semanticObject); 
				return; 
			case PromisePackage.CHECK_SUPPLIES:
				sequence_CheckSupplies(context, (CheckSupplies) semanticObject); 
				return; 
			case PromisePackage.CONDITION_OP:
				sequence_ConditionOp(context, (ConditionOp) semanticObject); 
				return; 
			case PromisePackage.DELAYED_REACTION:
				sequence_DelayedReaction(context, (DelayedReaction) semanticObject); 
				return; 
			case PromisePackage.DELEGATE_OP:
				sequence_DelegateOp(context, (DelegateOp) semanticObject); 
				return; 
			case PromisePackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case PromisePackage.EVENT_ASSIGNMENT:
				sequence_EventAssignment(context, (EventAssignment) semanticObject); 
				return; 
			case PromisePackage.EVENT_HANDLER_OP:
				sequence_EventHandlerOp(context, (EventHandlerOp) semanticObject); 
				return; 
			case PromisePackage.EXACT_RESTRICTED_AVOIDANCE:
				sequence_ExactRestrictedAvoidance(context, (ExactRestrictedAvoidance) semanticObject); 
				return; 
			case PromisePackage.FAIR_PATROLLING:
				sequence_FairPatrolling(context, (FairPatrolling) semanticObject); 
				return; 
			case PromisePackage.FAIR_VISIT:
				sequence_FairVisit(context, (FairVisit) semanticObject); 
				return; 
			case PromisePackage.FALL_BACK_OP:
				sequence_FallBackOp(context, (FallBackOp) semanticObject); 
				return; 
			case PromisePackage.FUTURE_AVOIDANCE:
				sequence_FutureAvoidance(context, (FutureAvoidance) semanticObject); 
				return; 
			case PromisePackage.GLOBAL_AVOIDANCE:
				sequence_GlobalAvoidance(context, (GlobalAvoidance) semanticObject); 
				return; 
			case PromisePackage.INSTANT_REACTION:
				sequence_InstantReaction(context, (InstantReaction) semanticObject); 
				return; 
			case PromisePackage.LOCATION:
				sequence_Location(context, (Location) semanticObject); 
				return; 
			case PromisePackage.LOWER_RESTRICTED_AVOIDANCE:
				sequence_LowerRestrictedAvoidance(context, (LowerRestrictedAvoidance) semanticObject); 
				return; 
			case PromisePackage.MISSION:
				sequence_Mission(context, (Mission) semanticObject); 
				return; 
			case PromisePackage.ORDERDER_VISIT:
				sequence_OrderderVisit(context, (OrderderVisit) semanticObject); 
				return; 
			case PromisePackage.ORDERED_PATROLLING:
				sequence_OrderedPatrolling(context, (OrderedPatrolling) semanticObject); 
				return; 
			case PromisePackage.PARALLEL_OP:
				sequence_ParallelOp(context, (ParallelOp) semanticObject); 
				return; 
			case PromisePackage.PAST_AVOIDANCE:
				sequence_PastAvoidance(context, (PastAvoidance) semanticObject); 
				return; 
			case PromisePackage.PATROLLING:
				sequence_Patrolling(context, (Patrolling) semanticObject); 
				return; 
			case PromisePackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			case PromisePackage.SEQUENCE_OP:
				sequence_SequenceOp(context, (SequenceOp) semanticObject); 
				return; 
			case PromisePackage.SEQUENCED_PATROLLING:
				sequence_SequencedPatrolling(context, (SequencedPatrolling) semanticObject); 
				return; 
			case PromisePackage.SEQUENCED_VISIT:
				sequence_SequencedVisit(context, (SequencedVisit) semanticObject); 
				return; 
			case PromisePackage.SIMPLE_ACTION:
				sequence_SimpleAction(context, (SimpleAction) semanticObject); 
				return; 
			case PromisePackage.STRICT_ORDERED_VISIT:
				sequence_StrictOrderedVisit(context, (StrictOrderedVisit) semanticObject); 
				return; 
			case PromisePackage.STRICT_ORERED_PATROLLING:
				sequence_StrictOreredPatrolling(context, (StrictOreredPatrolling) semanticObject); 
				return; 
			case PromisePackage.TASK_COMBINATION_OP:
				sequence_TaskCombinationOp(context, (TaskCombinationOp) semanticObject); 
				return; 
			case PromisePackage.TEST_ITAAP_AS:
				sequence_TestITAAPAs(context, (TestITAAPAs) semanticObject); 
				return; 
			case PromisePackage.UPPER_RESTRICTED_AVOIDANCE:
				sequence_UpperRestrictedAvoidance(context, (UpperRestrictedAvoidance) semanticObject); 
				return; 
			case PromisePackage.VISIT:
				sequence_Visit(context, (Visit) semanticObject); 
				return; 
			case PromisePackage.WAIT:
				sequence_Wait(context, (Wait) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (name=EString description=EString)
	 */
	protected void sequence_Action(ISerializationContext context, promise.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PromisePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromisePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, PromisePackage.Literals.ACTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromisePackage.Literals.ACTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionAccess().getDescriptionEStringParserRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns CheckAndDeliverQCh
	 *     CheckAndDeliverQCh returns CheckAndDeliverQCh
	 *
	 * Constraint:
	 *     {CheckAndDeliverQCh}
	 */
	protected void sequence_CheckAndDeliverQCh(ISerializationContext context, CheckAndDeliverQCh semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns CheckAndDeliver
	 *     CheckAndDeliver returns CheckAndDeliver
	 *
	 * Constraint:
	 *     {CheckAndDeliver}
	 */
	protected void sequence_CheckAndDeliver(ISerializationContext context, CheckAndDeliver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns CheckSupplies
	 *     CheckSupplies returns CheckSupplies
	 *
	 * Constraint:
	 *     {CheckSupplies}
	 */
	protected void sequence_CheckSupplies(ISerializationContext context, CheckSupplies semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns Check
	 *     Check returns Check
	 *
	 * Constraint:
	 *     {Check}
	 */
	protected void sequence_Check(ISerializationContext context, Check semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns ConditionOp
	 *     ConditionOp returns ConditionOp
	 *
	 * Constraint:
	 *     inputEvents+=EventAssignment+
	 */
	protected void sequence_ConditionOp(ISerializationContext context, ConditionOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns DelayedReaction
	 *     DelayedReaction returns DelayedReaction
	 *
	 * Constraint:
	 *     {DelayedReaction}
	 */
	protected void sequence_DelayedReaction(ISerializationContext context, DelayedReaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns DelegateOp
	 *     DelegateOp returns DelegateOp
	 *
	 * Constraint:
	 *     (
	 *         task=Tasks 
	 *         (inputLocations+=[Location|EString] inputLocations+=[Location|EString]*)? 
	 *         (inputAction+=[Action|EString] inputAction+=[Action|EString]*)? 
	 *         (stoppingEvent+=[Event|EString] stoppingEvent+=[Event|EString]*)?
	 *     )
	 */
	protected void sequence_DelegateOp(ISerializationContext context, DelegateOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventAssignment returns EventAssignment
	 *
	 * Constraint:
	 *     (inputEvent=[Event|EString] inputOperators=Operator)
	 */
	protected void sequence_EventAssignment(ISerializationContext context, EventAssignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PromisePackage.Literals.EVENT_ASSIGNMENT__INPUT_EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromisePackage.Literals.EVENT_ASSIGNMENT__INPUT_EVENT));
			if (transientValues.isValueTransient(semanticObject, PromisePackage.Literals.EVENT_ASSIGNMENT__INPUT_OPERATORS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromisePackage.Literals.EVENT_ASSIGNMENT__INPUT_OPERATORS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventAssignmentAccess().getInputEventEventEStringParserRuleCall_0_0_1(), semanticObject.eGet(PromisePackage.Literals.EVENT_ASSIGNMENT__INPUT_EVENT, false));
		feeder.accept(grammarAccess.getEventAssignmentAccess().getInputOperatorsOperatorParserRuleCall_2_0(), semanticObject.getInputOperators());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns EventHandlerOp
	 *     EventHandlerOp returns EventHandlerOp
	 *
	 * Constraint:
	 *     (inputOperators+=Operator inputEvents+=EventAssignment+)
	 */
	protected void sequence_EventHandlerOp(ISerializationContext context, EventHandlerOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (name=EString description=EString)
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PromisePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromisePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, PromisePackage.Literals.EVENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromisePackage.Literals.EVENT__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEventAccess().getDescriptionEStringParserRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns ExactRestrictedAvoidance
	 *     ExactRestrictedAvoidance returns ExactRestrictedAvoidance
	 *
	 * Constraint:
	 *     {ExactRestrictedAvoidance}
	 */
	protected void sequence_ExactRestrictedAvoidance(ISerializationContext context, ExactRestrictedAvoidance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns FairPatrolling
	 *     FairPatrolling returns FairPatrolling
	 *
	 * Constraint:
	 *     {FairPatrolling}
	 */
	protected void sequence_FairPatrolling(ISerializationContext context, FairPatrolling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns FairVisit
	 *     FairVisit returns FairVisit
	 *
	 * Constraint:
	 *     {FairVisit}
	 */
	protected void sequence_FairVisit(ISerializationContext context, FairVisit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns FallBackOp
	 *     FallBackOp returns FallBackOp
	 *
	 * Constraint:
	 *     (inputOperators+=Operator inputOperators+=Operator*)
	 */
	protected void sequence_FallBackOp(ISerializationContext context, FallBackOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns FutureAvoidance
	 *     FutureAvoidance returns FutureAvoidance
	 *
	 * Constraint:
	 *     {FutureAvoidance}
	 */
	protected void sequence_FutureAvoidance(ISerializationContext context, FutureAvoidance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns GlobalAvoidance
	 *     GlobalAvoidance returns GlobalAvoidance
	 *
	 * Constraint:
	 *     {GlobalAvoidance}
	 */
	protected void sequence_GlobalAvoidance(ISerializationContext context, GlobalAvoidance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns InstantReaction
	 *     InstantReaction returns InstantReaction
	 *
	 * Constraint:
	 *     {InstantReaction}
	 */
	protected void sequence_InstantReaction(ISerializationContext context, InstantReaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Location returns Location
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Location(ISerializationContext context, Location semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PromisePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromisePackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns LowerRestrictedAvoidance
	 *     LowerRestrictedAvoidance returns LowerRestrictedAvoidance
	 *
	 * Constraint:
	 *     {LowerRestrictedAvoidance}
	 */
	protected void sequence_LowerRestrictedAvoidance(ISerializationContext context, LowerRestrictedAvoidance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mission returns Mission
	 *
	 * Constraint:
	 *     (
	 *         (events+=Event events+=Event*)? 
	 *         (actions+=Action actions+=Action*)? 
	 *         robots+=Robot 
	 *         robots+=Robot* 
	 *         (locations+=Location locations+=Location*)? 
	 *         operator+=Operator 
	 *         operator+=Operator*
	 *     )
	 */
	protected void sequence_Mission(ISerializationContext context, Mission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns OrderderVisit
	 *     OrderderVisit returns OrderderVisit
	 *
	 * Constraint:
	 *     {OrderderVisit}
	 */
	protected void sequence_OrderderVisit(ISerializationContext context, OrderderVisit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns OrderedPatrolling
	 *     OrderedPatrolling returns OrderedPatrolling
	 *
	 * Constraint:
	 *     {OrderedPatrolling}
	 */
	protected void sequence_OrderedPatrolling(ISerializationContext context, OrderedPatrolling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns ParallelOp
	 *     ParallelOp returns ParallelOp
	 *
	 * Constraint:
	 *     (inputRobots+=[Robot|EString] inputOperators+=Operator (inputRobots+=[Robot|EString] inputOperators+=Operator)*)?
	 */
	protected void sequence_ParallelOp(ISerializationContext context, ParallelOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns PastAvoidance
	 *     PastAvoidance returns PastAvoidance
	 *
	 * Constraint:
	 *     {PastAvoidance}
	 */
	protected void sequence_PastAvoidance(ISerializationContext context, PastAvoidance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns Patrolling
	 *     Patrolling returns Patrolling
	 *
	 * Constraint:
	 *     {Patrolling}
	 */
	protected void sequence_Patrolling(ISerializationContext context, Patrolling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PromisePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromisePackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns SequenceOp
	 *     SequenceOp returns SequenceOp
	 *
	 * Constraint:
	 *     (inputOperators+=Operator inputOperators+=Operator*)
	 */
	protected void sequence_SequenceOp(ISerializationContext context, SequenceOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns SequencedPatrolling
	 *     SequencedPatrolling returns SequencedPatrolling
	 *
	 * Constraint:
	 *     {SequencedPatrolling}
	 */
	protected void sequence_SequencedPatrolling(ISerializationContext context, SequencedPatrolling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns SequencedVisit
	 *     SequencedVisit returns SequencedVisit
	 *
	 * Constraint:
	 *     {SequencedVisit}
	 */
	protected void sequence_SequencedVisit(ISerializationContext context, SequencedVisit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns SimpleAction
	 *     SimpleAction returns SimpleAction
	 *
	 * Constraint:
	 *     {SimpleAction}
	 */
	protected void sequence_SimpleAction(ISerializationContext context, SimpleAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns StrictOrderedVisit
	 *     StrictOrderedVisit returns StrictOrderedVisit
	 *
	 * Constraint:
	 *     {StrictOrderedVisit}
	 */
	protected void sequence_StrictOrderedVisit(ISerializationContext context, StrictOrderedVisit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns StrictOreredPatrolling
	 *     StrictOreredPatrolling returns StrictOreredPatrolling
	 *
	 * Constraint:
	 *     {StrictOreredPatrolling}
	 */
	protected void sequence_StrictOreredPatrolling(ISerializationContext context, StrictOreredPatrolling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operator returns TaskCombinationOp
	 *     TaskCombinationOp returns TaskCombinationOp
	 *
	 * Constraint:
	 *     (inputOperators+=Operator inputOperators+=Operator+)
	 */
	protected void sequence_TaskCombinationOp(ISerializationContext context, TaskCombinationOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns TestITAAPAs
	 *     TestITAAPAs returns TestITAAPAs
	 *
	 * Constraint:
	 *     {TestITAAPAs}
	 */
	protected void sequence_TestITAAPAs(ISerializationContext context, TestITAAPAs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns UpperRestrictedAvoidance
	 *     UpperRestrictedAvoidance returns UpperRestrictedAvoidance
	 *
	 * Constraint:
	 *     {UpperRestrictedAvoidance}
	 */
	protected void sequence_UpperRestrictedAvoidance(ISerializationContext context, UpperRestrictedAvoidance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns Visit
	 *     Visit returns Visit
	 *
	 * Constraint:
	 *     {Visit}
	 */
	protected void sequence_Visit(ISerializationContext context, Visit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tasks returns Wait
	 *     Wait returns Wait
	 *
	 * Constraint:
	 *     {Wait}
	 */
	protected void sequence_Wait(ISerializationContext context, Wait semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
