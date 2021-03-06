package se.gu.co4robots.xtext.promise.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import promise.Action;
import promise.Event;
import promise.FallBackOp;
import promise.Location;
import promise.Mission;
import promise.Operator;
import promise.Robot;
import se.gu.co4robots.xtext.promise.services.PromiseGrammarAccess;

@SuppressWarnings("all")
public class PromiseFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private PromiseGrammarAccess _promiseGrammarAccess;
  
  protected void _format(final Mission mission, @Extension final IFormattableDocument document) {
    EList<Event> _events = mission.getEvents();
    for (final Event event : _events) {
      document.<Event>format(event);
    }
    EList<Action> _actions = mission.getActions();
    for (final Action action : _actions) {
      document.<Action>format(action);
    }
    EList<Robot> _robots = mission.getRobots();
    for (final Robot robot : _robots) {
      document.<Robot>format(robot);
    }
    EList<Location> _locations = mission.getLocations();
    for (final Location location : _locations) {
      document.<Location>format(location);
    }
    EList<Operator> _operator = mission.getOperator();
    for (final Operator operator : _operator) {
      document.<Operator>format(operator);
    }
  }
  
  protected void _format(final FallBackOp fallBackOp, @Extension final IFormattableDocument document) {
    EList<Operator> _inputOperators = fallBackOp.getInputOperators();
    for (final Operator operator : _inputOperators) {
      document.<Operator>format(operator);
    }
  }
  
  public void format(final Object fallBackOp, final IFormattableDocument document) {
    if (fallBackOp instanceof XtextResource) {
      _format((XtextResource)fallBackOp, document);
      return;
    } else if (fallBackOp instanceof FallBackOp) {
      _format((FallBackOp)fallBackOp, document);
      return;
    } else if (fallBackOp instanceof Mission) {
      _format((Mission)fallBackOp, document);
      return;
    } else if (fallBackOp instanceof EObject) {
      _format((EObject)fallBackOp, document);
      return;
    } else if (fallBackOp == null) {
      _format((Void)null, document);
      return;
    } else if (fallBackOp != null) {
      _format(fallBackOp, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(fallBackOp, document).toString());
    }
  }
}
