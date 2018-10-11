/**
 */
package promise.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import promise.util.PromiseAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PromiseItemProviderAdapterFactory extends PromiseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromiseItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.FallBackOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FallBackOpItemProvider fallBackOpItemProvider;

	/**
	 * This creates an adapter for a {@link promise.FallBackOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFallBackOpAdapter() {
		if (fallBackOpItemProvider == null) {
			fallBackOpItemProvider = new FallBackOpItemProvider(this);
		}

		return fallBackOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.SequenceOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceOpItemProvider sequenceOpItemProvider;

	/**
	 * This creates an adapter for a {@link promise.SequenceOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceOpAdapter() {
		if (sequenceOpItemProvider == null) {
			sequenceOpItemProvider = new SequenceOpItemProvider(this);
		}

		return sequenceOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.ParallelOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelOpItemProvider parallelOpItemProvider;

	/**
	 * This creates an adapter for a {@link promise.ParallelOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelOpAdapter() {
		if (parallelOpItemProvider == null) {
			parallelOpItemProvider = new ParallelOpItemProvider(this);
		}

		return parallelOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.EventHandlerOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventHandlerOpItemProvider eventHandlerOpItemProvider;

	/**
	 * This creates an adapter for a {@link promise.EventHandlerOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventHandlerOpAdapter() {
		if (eventHandlerOpItemProvider == null) {
			eventHandlerOpItemProvider = new EventHandlerOpItemProvider(this);
		}

		return eventHandlerOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.ConditionOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionOpItemProvider conditionOpItemProvider;

	/**
	 * This creates an adapter for a {@link promise.ConditionOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionOpAdapter() {
		if (conditionOpItemProvider == null) {
			conditionOpItemProvider = new ConditionOpItemProvider(this);
		}

		return conditionOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.Mission} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionItemProvider missionItemProvider;

	/**
	 * This creates an adapter for a {@link promise.Mission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMissionAdapter() {
		if (missionItemProvider == null) {
			missionItemProvider = new MissionItemProvider(this);
		}

		return missionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.Robot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotItemProvider robotItemProvider;

	/**
	 * This creates an adapter for a {@link promise.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRobotAdapter() {
		if (robotItemProvider == null) {
			robotItemProvider = new RobotItemProvider(this);
		}

		return robotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link promise.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.DelegateOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegateOpItemProvider delegateOpItemProvider;

	/**
	 * This creates an adapter for a {@link promise.DelegateOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegateOpAdapter() {
		if (delegateOpItemProvider == null) {
			delegateOpItemProvider = new DelegateOpItemProvider(this);
		}

		return delegateOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link promise.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.Visit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisitItemProvider visitItemProvider;

	/**
	 * This creates an adapter for a {@link promise.Visit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisitAdapter() {
		if (visitItemProvider == null) {
			visitItemProvider = new VisitItemProvider(this);
		}

		return visitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.SequencedVisit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequencedVisitItemProvider sequencedVisitItemProvider;

	/**
	 * This creates an adapter for a {@link promise.SequencedVisit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequencedVisitAdapter() {
		if (sequencedVisitItemProvider == null) {
			sequencedVisitItemProvider = new SequencedVisitItemProvider(this);
		}

		return sequencedVisitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.OrderderVisit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderderVisitItemProvider orderderVisitItemProvider;

	/**
	 * This creates an adapter for a {@link promise.OrderderVisit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderderVisitAdapter() {
		if (orderderVisitItemProvider == null) {
			orderderVisitItemProvider = new OrderderVisitItemProvider(this);
		}

		return orderderVisitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.StrictOrderedVisit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrictOrderedVisitItemProvider strictOrderedVisitItemProvider;

	/**
	 * This creates an adapter for a {@link promise.StrictOrderedVisit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStrictOrderedVisitAdapter() {
		if (strictOrderedVisitItemProvider == null) {
			strictOrderedVisitItemProvider = new StrictOrderedVisitItemProvider(this);
		}

		return strictOrderedVisitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.FairVisit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FairVisitItemProvider fairVisitItemProvider;

	/**
	 * This creates an adapter for a {@link promise.FairVisit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFairVisitAdapter() {
		if (fairVisitItemProvider == null) {
			fairVisitItemProvider = new FairVisitItemProvider(this);
		}

		return fairVisitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.Patrolling} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatrollingItemProvider patrollingItemProvider;

	/**
	 * This creates an adapter for a {@link promise.Patrolling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPatrollingAdapter() {
		if (patrollingItemProvider == null) {
			patrollingItemProvider = new PatrollingItemProvider(this);
		}

		return patrollingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.SequencedPatrolling} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequencedPatrollingItemProvider sequencedPatrollingItemProvider;

	/**
	 * This creates an adapter for a {@link promise.SequencedPatrolling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequencedPatrollingAdapter() {
		if (sequencedPatrollingItemProvider == null) {
			sequencedPatrollingItemProvider = new SequencedPatrollingItemProvider(this);
		}

		return sequencedPatrollingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.OrderedPatrolling} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedPatrollingItemProvider orderedPatrollingItemProvider;

	/**
	 * This creates an adapter for a {@link promise.OrderedPatrolling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderedPatrollingAdapter() {
		if (orderedPatrollingItemProvider == null) {
			orderedPatrollingItemProvider = new OrderedPatrollingItemProvider(this);
		}

		return orderedPatrollingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.StrictOreredPatrolling} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrictOreredPatrollingItemProvider strictOreredPatrollingItemProvider;

	/**
	 * This creates an adapter for a {@link promise.StrictOreredPatrolling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStrictOreredPatrollingAdapter() {
		if (strictOreredPatrollingItemProvider == null) {
			strictOreredPatrollingItemProvider = new StrictOreredPatrollingItemProvider(this);
		}

		return strictOreredPatrollingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.FairPatrolling} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FairPatrollingItemProvider fairPatrollingItemProvider;

	/**
	 * This creates an adapter for a {@link promise.FairPatrolling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFairPatrollingAdapter() {
		if (fairPatrollingItemProvider == null) {
			fairPatrollingItemProvider = new FairPatrollingItemProvider(this);
		}

		return fairPatrollingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.UpperRestrictedAvoidance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpperRestrictedAvoidanceItemProvider upperRestrictedAvoidanceItemProvider;

	/**
	 * This creates an adapter for a {@link promise.UpperRestrictedAvoidance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpperRestrictedAvoidanceAdapter() {
		if (upperRestrictedAvoidanceItemProvider == null) {
			upperRestrictedAvoidanceItemProvider = new UpperRestrictedAvoidanceItemProvider(this);
		}

		return upperRestrictedAvoidanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.ExactRestrictedAvoidance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExactRestrictedAvoidanceItemProvider exactRestrictedAvoidanceItemProvider;

	/**
	 * This creates an adapter for a {@link promise.ExactRestrictedAvoidance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExactRestrictedAvoidanceAdapter() {
		if (exactRestrictedAvoidanceItemProvider == null) {
			exactRestrictedAvoidanceItemProvider = new ExactRestrictedAvoidanceItemProvider(this);
		}

		return exactRestrictedAvoidanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.LowerRestrictedAvoidance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerRestrictedAvoidanceItemProvider lowerRestrictedAvoidanceItemProvider;

	/**
	 * This creates an adapter for a {@link promise.LowerRestrictedAvoidance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLowerRestrictedAvoidanceAdapter() {
		if (lowerRestrictedAvoidanceItemProvider == null) {
			lowerRestrictedAvoidanceItemProvider = new LowerRestrictedAvoidanceItemProvider(this);
		}

		return lowerRestrictedAvoidanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.FutureAvoidance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FutureAvoidanceItemProvider futureAvoidanceItemProvider;

	/**
	 * This creates an adapter for a {@link promise.FutureAvoidance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFutureAvoidanceAdapter() {
		if (futureAvoidanceItemProvider == null) {
			futureAvoidanceItemProvider = new FutureAvoidanceItemProvider(this);
		}

		return futureAvoidanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.GlobalAvoidance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalAvoidanceItemProvider globalAvoidanceItemProvider;

	/**
	 * This creates an adapter for a {@link promise.GlobalAvoidance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalAvoidanceAdapter() {
		if (globalAvoidanceItemProvider == null) {
			globalAvoidanceItemProvider = new GlobalAvoidanceItemProvider(this);
		}

		return globalAvoidanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.PastAvoidance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PastAvoidanceItemProvider pastAvoidanceItemProvider;

	/**
	 * This creates an adapter for a {@link promise.PastAvoidance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPastAvoidanceAdapter() {
		if (pastAvoidanceItemProvider == null) {
			pastAvoidanceItemProvider = new PastAvoidanceItemProvider(this);
		}

		return pastAvoidanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.Wait} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitItemProvider waitItemProvider;

	/**
	 * This creates an adapter for a {@link promise.Wait}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWaitAdapter() {
		if (waitItemProvider == null) {
			waitItemProvider = new WaitItemProvider(this);
		}

		return waitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.DelayedReaction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayedReactionItemProvider delayedReactionItemProvider;

	/**
	 * This creates an adapter for a {@link promise.DelayedReaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelayedReactionAdapter() {
		if (delayedReactionItemProvider == null) {
			delayedReactionItemProvider = new DelayedReactionItemProvider(this);
		}

		return delayedReactionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.InstantReaction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantReactionItemProvider instantReactionItemProvider;

	/**
	 * This creates an adapter for a {@link promise.InstantReaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstantReactionAdapter() {
		if (instantReactionItemProvider == null) {
			instantReactionItemProvider = new InstantReactionItemProvider(this);
		}

		return instantReactionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.Context} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextItemProvider contextItemProvider;

	/**
	 * This creates an adapter for a {@link promise.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextAdapter() {
		if (contextItemProvider == null) {
			contextItemProvider = new ContextItemProvider(this);
		}

		return contextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.OrderedLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedLocationItemProvider orderedLocationItemProvider;

	/**
	 * This creates an adapter for a {@link promise.OrderedLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderedLocationAdapter() {
		if (orderedLocationItemProvider == null) {
			orderedLocationItemProvider = new OrderedLocationItemProvider(this);
		}

		return orderedLocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.NotOrderedLocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotOrderedLocationItemProvider notOrderedLocationItemProvider;

	/**
	 * This creates an adapter for a {@link promise.NotOrderedLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotOrderedLocationAdapter() {
		if (notOrderedLocationItemProvider == null) {
			notOrderedLocationItemProvider = new NotOrderedLocationItemProvider(this);
		}

		return notOrderedLocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link promise.SimpleAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleActionItemProvider simpleActionItemProvider;

	/**
	 * This creates an adapter for a {@link promise.SimpleAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleActionAdapter() {
		if (simpleActionItemProvider == null) {
			simpleActionItemProvider = new SimpleActionItemProvider(this);
		}

		return simpleActionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (fallBackOpItemProvider != null) fallBackOpItemProvider.dispose();
		if (sequenceOpItemProvider != null) sequenceOpItemProvider.dispose();
		if (parallelOpItemProvider != null) parallelOpItemProvider.dispose();
		if (eventHandlerOpItemProvider != null) eventHandlerOpItemProvider.dispose();
		if (conditionOpItemProvider != null) conditionOpItemProvider.dispose();
		if (missionItemProvider != null) missionItemProvider.dispose();
		if (robotItemProvider != null) robotItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (delegateOpItemProvider != null) delegateOpItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (visitItemProvider != null) visitItemProvider.dispose();
		if (sequencedVisitItemProvider != null) sequencedVisitItemProvider.dispose();
		if (orderderVisitItemProvider != null) orderderVisitItemProvider.dispose();
		if (strictOrderedVisitItemProvider != null) strictOrderedVisitItemProvider.dispose();
		if (fairVisitItemProvider != null) fairVisitItemProvider.dispose();
		if (patrollingItemProvider != null) patrollingItemProvider.dispose();
		if (sequencedPatrollingItemProvider != null) sequencedPatrollingItemProvider.dispose();
		if (orderedPatrollingItemProvider != null) orderedPatrollingItemProvider.dispose();
		if (strictOreredPatrollingItemProvider != null) strictOreredPatrollingItemProvider.dispose();
		if (fairPatrollingItemProvider != null) fairPatrollingItemProvider.dispose();
		if (upperRestrictedAvoidanceItemProvider != null) upperRestrictedAvoidanceItemProvider.dispose();
		if (exactRestrictedAvoidanceItemProvider != null) exactRestrictedAvoidanceItemProvider.dispose();
		if (lowerRestrictedAvoidanceItemProvider != null) lowerRestrictedAvoidanceItemProvider.dispose();
		if (futureAvoidanceItemProvider != null) futureAvoidanceItemProvider.dispose();
		if (globalAvoidanceItemProvider != null) globalAvoidanceItemProvider.dispose();
		if (pastAvoidanceItemProvider != null) pastAvoidanceItemProvider.dispose();
		if (waitItemProvider != null) waitItemProvider.dispose();
		if (delayedReactionItemProvider != null) delayedReactionItemProvider.dispose();
		if (instantReactionItemProvider != null) instantReactionItemProvider.dispose();
		if (contextItemProvider != null) contextItemProvider.dispose();
		if (orderedLocationItemProvider != null) orderedLocationItemProvider.dispose();
		if (notOrderedLocationItemProvider != null) notOrderedLocationItemProvider.dispose();
		if (simpleActionItemProvider != null) simpleActionItemProvider.dispose();
	}

}
