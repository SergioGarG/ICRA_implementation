package se.gu.co4robots.xtext.promise.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import promise.Action;
import promise.CompositionOperator;
import promise.ConditionOp;
import promise.DelegateOp;
import promise.Event;
import promise.EventAssignment;
import promise.EventHandlerOp;
import promise.FallBackOp;
import promise.Operator;
import promise.ParallelOp;
import promise.Robot;
import promise.SequenceOp;
import promise.TaskCombinationOp;
import se.gu.co4robots.xtext.promise.generator.robotClass;

@SuppressWarnings("all")
public class PromiseGenerator extends AbstractGenerator {
  private ArrayList<ArrayList<robotClass>> robotsList = new ArrayList<ArrayList<robotClass>>();
  
  private ArrayList<String> availableRobots = new ArrayList<String>();
  
  private ArrayList<String> stoppingEvents = new ArrayList<String>();
  
  private ArrayList<String> textarray = new ArrayList<String>();
  
  private String text = new String();
  
  private String template = new String();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    File[] _listFiles = new File("/Users/gsergio/repos/PROMISE_implementation/CentralStation/workspace/Promise/src-gen").listFiles();
    for (final File file : _listFiles) {
      boolean _isDirectory = file.isDirectory();
      boolean _not = (!_isDirectory);
      if (_not) {
        file.delete();
      }
    }
    for (int i = (((Object[])Conversions.unwrapArray(this.robotsList, Object.class)).length - 1); (i >= 0); i--) {
      for (int j = (((Object[])Conversions.unwrapArray(this.robotsList.get(i), Object.class)).length - 1); (j >= 0); j--) {
        this.robotsList.get(i).remove(j);
      }
    }
    for (int i = (((Object[])Conversions.unwrapArray(this.availableRobots, Object.class)).length - 1); (i >= 0); i--) {
      this.availableRobots.remove(i);
    }
    for (int i = (((Object[])Conversions.unwrapArray(this.textarray, Object.class)).length - 1); (i >= 0); i--) {
      this.textarray.remove(i);
    }
    for (int i = (((Object[])Conversions.unwrapArray(this.stoppingEvents, Object.class)).length - 1); (i >= 0); i--) {
      this.stoppingEvents.remove(i);
    }
    int _length = ((Object[])Conversions.unwrapArray(IteratorExtensions.<Robot>toIterable(Iterators.<Robot>filter(resource.getAllContents(), Robot.class)), Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        this.availableRobots.add((((Robot[])Conversions.unwrapArray(IteratorExtensions.<Robot>toIterable(Iterators.<Robot>filter(resource.getAllContents(), Robot.class)), Robot.class))[(i).intValue()]).getName());
        ArrayList<robotClass> _arrayList = new ArrayList<robotClass>();
        this.robotsList.add(_arrayList);
      }
    }
    ArrayList<robotClass> _get = this.robotsList.get(0);
    String _name = (((Robot[])Conversions.unwrapArray(IteratorExtensions.<Robot>toIterable(Iterators.<Robot>filter(resource.getAllContents(), Robot.class)), Robot.class))[0]).getName();
    ArrayList<String> _arrayList = new ArrayList<String>();
    robotClass _robotClass = new robotClass(_name, _arrayList, 0);
    _get.add(_robotClass);
    Operator _get_1 = ((Operator[])Conversions.unwrapArray(IteratorExtensions.<Operator>toIterable(Iterators.<Operator>filter(resource.getAllContents(), Operator.class)), Operator.class))[0];
    int _size = ((CompositionOperator) _get_1).getInputOperators().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      this.doLogic(((Operator[])Conversions.unwrapArray(IteratorExtensions.<Operator>toIterable(Iterators.<Operator>filter(resource.getAllContents(), Operator.class)), Operator.class))[0], 0, 0, 0, this.availableRobots.get(0), "");
    }
    ArrayList<ArrayList<String>> missionsList = new ArrayList<ArrayList<String>>();
    ArrayList<String> missions = new ArrayList<String>();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Robots [ ");
    {
      Iterable<Robot> _iterable = IteratorExtensions.<Robot>toIterable(Iterators.<Robot>filter(resource.getAllContents(), Robot.class));
      for(final Robot robot : _iterable) {
        String _name_1 = robot.getName();
        _builder.append(_name_1);
        _builder.append(",");
      }
    }
    _builder.append(" ]");
    _builder.newLineIfNotEmpty();
    _builder.append("Events [ ");
    {
      Iterable<Event> _iterable_1 = IteratorExtensions.<Event>toIterable(Iterators.<Event>filter(resource.getAllContents(), Event.class));
      for(final Event condition : _iterable_1) {
        String _name_2 = condition.getName();
        _builder.append(_name_2);
        _builder.append(" ");
        String _description = condition.getDescription();
        _builder.append(_description);
        _builder.append(",");
      }
    }
    _builder.append(" ]");
    _builder.newLineIfNotEmpty();
    _builder.append("Actions [ ");
    {
      Iterable<Action> _iterable_2 = IteratorExtensions.<Action>toIterable(Iterators.<Action>filter(resource.getAllContents(), Action.class));
      for(final Action condition_1 : _iterable_2) {
        String _name_3 = condition_1.getName();
        _builder.append(_name_3);
        _builder.append(" ");
        String _description_1 = condition_1.getDescription();
        _builder.append(_description_1);
        _builder.append(",");
      }
    }
    _builder.append(" ]");
    _builder.newLineIfNotEmpty();
    _builder.append("StoppingEvents [ ");
    {
      int _length_1 = ((Object[])Conversions.unwrapArray(this.stoppingEvents, Object.class)).length;
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _length_1, true);
      for(final Integer j : _doubleDotLessThan_1) {
        _builder.append("{");
        String _get_2 = this.stoppingEvents.get((j).intValue());
        _builder.append(_get_2);
        _builder.append("}");
      }
    }
    _builder.append(" ]");
    _builder.newLineIfNotEmpty();
    fsa.generateFile("mission_data.ms", _builder);
    int _size_1 = this.robotsList.size();
    boolean _greaterThan_1 = (_size_1 > 0);
    if (_greaterThan_1) {
      for (int i_1 = 0; (i_1 < ((Object[])Conversions.unwrapArray(this.availableRobots, Object.class)).length); i_1++) {
        {
          String _get_3 = this.availableRobots.get(i_1);
          String _plus = ("mission_" + _get_3);
          String _plus_1 = (_plus + ".ms");
          StringConcatenation _builder_1 = new StringConcatenation();
          {
            int _length_2 = ((Object[])Conversions.unwrapArray(this.robotsList.get(i_1), Object.class)).length;
            ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _length_2, true);
            for(final Integer j_1 : _doubleDotLessThan_2) {
              {
                if ((this.robotsList.get(i_1).get((j_1).intValue()).indentation == 0)) {
                  _builder_1.append(this.robotsList.get(i_1).get((j_1).intValue()).name);
                  _builder_1.append(missions = this.robotsList.get(i_1).get((j_1).intValue()).missionList);
                  _builder_1.newLineIfNotEmpty();
                } else {
                  if ((this.robotsList.get(i_1).get((j_1).intValue()).indentation == 1)) {
                    _builder_1.newLine();
                    _builder_1.append("\t");
                    _builder_1.append(this.robotsList.get(i_1).get((j_1).intValue()).name, "\t");
                    _builder_1.append(missions = this.robotsList.get(i_1).get((j_1).intValue()).missionList, "\t");
                    _builder_1.newLineIfNotEmpty();
                  } else {
                    if ((this.robotsList.get(i_1).get((j_1).intValue()).indentation == 2)) {
                      _builder_1.newLine();
                      _builder_1.append("\t\t");
                      _builder_1.append(this.robotsList.get(i_1).get((j_1).intValue()).name, "\t\t");
                      _builder_1.append(missions = this.robotsList.get(i_1).get((j_1).intValue()).missionList, "\t\t");
                      _builder_1.newLineIfNotEmpty();
                    } else {
                      if ((this.robotsList.get(i_1).get((j_1).intValue()).indentation == 3)) {
                        _builder_1.newLine();
                        _builder_1.append("\t\t\t");
                        _builder_1.append(this.robotsList.get(i_1).get((j_1).intValue()).name, "\t\t\t");
                        _builder_1.append(missions = this.robotsList.get(i_1).get((j_1).intValue()).missionList, "\t\t\t");
                        _builder_1.newLineIfNotEmpty();
                      } else {
                        if ((this.robotsList.get(i_1).get((j_1).intValue()).indentation == 4)) {
                          _builder_1.newLine();
                          _builder_1.append("\t\t\t\t");
                          _builder_1.append(this.robotsList.get(i_1).get((j_1).intValue()).name, "\t\t\t\t");
                          _builder_1.append(missions = this.robotsList.get(i_1).get((j_1).intValue()).missionList, "\t\t\t\t");
                          _builder_1.newLineIfNotEmpty();
                        } else {
                          if ((this.robotsList.get(i_1).get((j_1).intValue()).indentation == 5)) {
                            _builder_1.newLine();
                            _builder_1.append("\t\t\t\t\t");
                            _builder_1.append(this.robotsList.get(i_1).get((j_1).intValue()).name, "\t\t\t\t\t");
                            _builder_1.append(missions = this.robotsList.get(i_1).get((j_1).intValue()).missionList, "\t\t\t\t\t");
                            _builder_1.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          fsa.generateFile(_plus_1, _builder_1);
          if (((((Object[])Conversions.unwrapArray(this.robotsList.get(i_1), Object.class)).length > 0) && (((Object[])Conversions.unwrapArray(this.textarray, Object.class)).length > 0))) {
            String _get_4 = this.availableRobots.get(i_1);
            String _plus_2 = ("readme_mission_" + _get_4);
            String _plus_3 = (_plus_2 + ".txt");
            StringConcatenation _builder_2 = new StringConcatenation();
            String _get_5 = this.textarray.get(i_1);
            _builder_2.append(_get_5);
            _builder_2.newLineIfNotEmpty();
            fsa.generateFile(_plus_3, _builder_2);
            InputOutput.<String>println(this.textarray.get(i_1));
          }
        }
      }
    }
  }
  
  public Object nestedMethod(final CompositionOperator in, final int index, final int suboperator, final int robot, final int indentation, final String parent) {
    return this.doLogic(in.getInputOperators().get(suboperator), index, robot, indentation, parent, "");
  }
  
  protected Object _doLogic(final SequenceOp in, final int index, final int robot, final int indentation, final String parent, final String hybrid) {
    ArrayList<String> names = new ArrayList<String>();
    int counter = 0;
    boolean _isEmpty = this.robotsList.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      for (counter = 0; (counter < ((Object[])Conversions.unwrapArray(this.robotsList.get(robot), Object.class)).length); counter++) {
        names.add(this.robotsList.get(robot).get(counter).name);
      }
    }
    int _length = in.getInputOperators().toArray().length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        if (((i).intValue() > 0)) {
          this.text = (this.text + " and then ");
        }
        this.nestedMethod(in, index, (i).intValue(), robot, indentation, parent);
      }
    }
    return null;
  }
  
  protected Object _doLogic(final ParallelOp in, final int index, final int robot, final int indentation, final String parent, final String hybrid) {
    String _get = this.availableRobots.get(robot);
    String _plus = ("Robot " + _get);
    String _plus_1 = (_plus + " does ");
    this.text = _plus_1;
    this.nestedMethod(in, index, 0, robot, indentation, this.availableRobots.get(robot));
    this.textarray.add(this.text);
    ArrayList<ArrayList<String>> names = new ArrayList<ArrayList<String>>();
    ArrayList<Integer> counter = new ArrayList<Integer>();
    boolean _isEmpty = this.robotsList.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(this.robotsList, Object.class)).length); i++) {
        {
          counter.add(Integer.valueOf(0));
          ArrayList<String> _arrayList = new ArrayList<String>();
          names.add(_arrayList);
          for (int j = 0; (j < ((Object[])Conversions.unwrapArray(this.robotsList.get(i), Object.class)).length); j++) {
            {
              counter.add(i, Integer.valueOf(j));
              names.get((robot + i)).add(this.robotsList.get((robot + i)).get((counter.get(j)).intValue()).name);
            }
          }
        }
      }
    }
    int _length = ((Object[])Conversions.unwrapArray(in.getInputOperators(), Object.class)).length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      int _length_1 = ((Object[])Conversions.unwrapArray(in.getInputOperators(), Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _length_1, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          ArrayList<robotClass> _get_1 = this.robotsList.get((robot + (i).intValue()));
          String _get_2 = this.availableRobots.get((robot + (i).intValue()));
          ArrayList<String> _arrayList = new ArrayList<String>();
          robotClass _robotClass = new robotClass(_get_2, _arrayList, indentation);
          _get_1.add(_robotClass);
          names.get((robot + (i).intValue())).add(this.robotsList.get((robot + (i).intValue())).get(0).name);
          String _get_3 = this.availableRobots.get((robot + (i).intValue()));
          String _plus_2 = ("Robot " + _get_3);
          String _plus_3 = (_plus_2 + " does ");
          this.text = _plus_3;
          this.nestedMethod(in, names.get((i).intValue()).indexOf(this.availableRobots.get((robot + (i).intValue()))), (i).intValue(), (robot + (i).intValue()), indentation, this.availableRobots.get((robot + (i).intValue())));
          this.textarray.add(this.text);
        }
      }
    }
    return null;
  }
  
  protected Object _doLogic(final EventHandlerOp in, final int index, final int robot, final int indentation, final String parent, final String hybrid) {
    this.text = (this.text + "by default ");
    this.robotsList.get(robot).get(index).missionList.add("eh");
    int counter = ((Object[])Conversions.unwrapArray(this.robotsList.get(robot), Object.class)).length;
    ArrayList<robotClass> _get = this.robotsList.get(robot);
    ArrayList<String> _arrayList = new ArrayList<String>();
    robotClass _robotClass = new robotClass("eh_default", _arrayList, (indentation + 1));
    _get.add(_robotClass);
    this.nestedMethod(in, counter, 0, robot, (indentation + 1), "eh_default");
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputEvents(), Object.class)).length); i++) {
      {
        counter = ((Object[])Conversions.unwrapArray(this.robotsList.get(robot), Object.class)).length;
        ArrayList<robotClass> _get_1 = this.robotsList.get(robot);
        String _name = in.getInputEvents().get(i).getInputEvent().getName();
        String _plus = ("eh_" + _name);
        ArrayList<String> _arrayList_1 = new ArrayList<String>();
        robotClass _robotClass_1 = new robotClass(_plus, _arrayList_1, (indentation + 1));
        _get_1.add(_robotClass_1);
        String _name_1 = in.getInputEvents().get(i).getInputEvent().getName();
        String _plus_1 = ((this.text + ", and if event ") + _name_1);
        String _plus_2 = (_plus_1 + " occurs, it will ");
        this.text = _plus_2;
        Operator _inputOperators = in.getInputEvents().get(i).getInputOperators();
        String _name_2 = in.getInputEvents().get(i).getInputEvent().getName();
        String _plus_3 = ("cond_" + _name_2);
        this.doLogic(_inputOperators, counter, robot, (indentation + 1), _plus_3, "");
      }
    }
    return null;
  }
  
  protected Object _doLogic(final FallBackOp in, final int index, final int robot, final int indentation, final String parent, final String hybrid) {
    this.robotsList.get(robot).get(index).missionList.add("fb");
    int counter = ((Object[])Conversions.unwrapArray(this.robotsList.get(robot), Object.class)).length;
    for (int i = 1; (i <= ((Object[])Conversions.unwrapArray(in.getInputOperators(), Object.class)).length); i++) {
      {
        counter = ((Object[])Conversions.unwrapArray(this.robotsList.get(robot), Object.class)).length;
        ArrayList<robotClass> _get = this.robotsList.get(robot);
        ArrayList<String> _arrayList = new ArrayList<String>();
        robotClass _robotClass = new robotClass(("fb_" + Integer.valueOf(i)), _arrayList, (indentation + 1));
        _get.add(_robotClass);
        if ((i > 1)) {
          this.text = (this.text + " if it fails, it tries to ");
        }
        int _plusPlus = counter++;
        this.nestedMethod(in, _plusPlus, (i - 1), robot, (indentation + 1), ("fb_" + Integer.valueOf(i)));
      }
    }
    return null;
  }
  
  protected Object _doLogic(final ConditionOp in, final int index, final int robot, final int indentation, final String parent, final String hybrid) {
    this.robotsList.get(robot).get(index).missionList.add("cond");
    int counter = ((Object[])Conversions.unwrapArray(this.robotsList.get(robot), Object.class)).length;
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputEvents(), Object.class)).length); i++) {
      {
        counter = ((Object[])Conversions.unwrapArray(this.robotsList.get(robot), Object.class)).length;
        ArrayList<robotClass> _get = this.robotsList.get(robot);
        String _name = in.getInputEvents().get(i).getInputEvent().getName();
        String _plus = ("cond_" + _name);
        ArrayList<String> _arrayList = new ArrayList<String>();
        robotClass _robotClass = new robotClass(_plus, _arrayList, (indentation + 1));
        _get.add(_robotClass);
        String _name_1 = in.getInputEvents().get(i).getInputEvent().getName();
        String _plus_1 = ((this.text + " if event ") + _name_1);
        String _plus_2 = (_plus_1 + " holds, ");
        this.text = _plus_2;
        Operator _inputOperators = in.getInputEvents().get(i).getInputOperators();
        String _name_2 = in.getInputEvents().get(i).getInputEvent().getName();
        String _plus_3 = ("cond_" + _name_2);
        this.doLogic(_inputOperators, counter, robot, (indentation + 1), _plus_3, "");
      }
    }
    return null;
  }
  
  protected Object _doLogic(final TaskCombinationOp in, final int index, final int robot, final int indentation, final String parent, final String hybrid) {
    this.doLogic(in.getInputOperators().get(0), index, robot, indentation, parent, "left");
    for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputOperators(), Object.class)).length); i++) {
      {
        this.text = (this.text + " and ");
        this.doLogic(in.getInputOperators().get(i), index, robot, indentation, parent, "middle");
      }
    }
    return null;
  }
  
  protected Object _doLogic(final DelegateOp in, final int index, final int robot, final int indentation, final String parent, final String hybrid) {
    Object _xblockexpression = null;
    {
      this.template = "";
      String _name = in.getTask().eClass().getName();
      boolean _equals = Objects.equal(_name, "Check");
      if (_equals) {
        this.text = (this.text + " visit assembly station(s) ");
        for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
          {
            if ((i > 0)) {
              this.template = (this.template + " & ");
              this.text = (this.text + ", ");
            }
            String _name_1 = in.getInputLocations().get(i).getName();
            String _plus = ((this.template + "F (at_assembly_") + _name_1);
            String _plus_1 = (_plus + " & ! as_unknown)");
            this.template = _plus_1;
            String _name_2 = in.getInputLocations().get(i).getName();
            String _plus_2 = (this.text + _name_2);
            this.text = _plus_2;
          }
        }
        this.text = (this.text + " and checks whether it has finished its product.");
      } else {
        String _name_1 = in.getTask().eClass().getName();
        boolean _equals_1 = Objects.equal(_name_1, "CheckAndDeliver");
        if (_equals_1) {
          this.text = (this.text + " visit assembly station(s) ");
          for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
            {
              if ((i > 0)) {
                this.template = (this.template + " & ");
                this.text = (this.text + ", ");
              }
              String _name_2 = in.getInputLocations().get(i).getName();
              String _plus = ((this.template + "F (at_assembly_") + _name_2);
              String _plus_1 = (_plus + " & ! as_unknown & (as_ready -> F delivered_final_");
              String _name_3 = in.getInputLocations().get(i).getName();
              String _plus_2 = (_plus_1 + _name_3);
              String _plus_3 = (_plus_2 + ")) & ");
              this.template = _plus_3;
              String _name_4 = in.getInputLocations().get(i).getName();
              String _plus_4 = ((this.template + "G (at_assembly_") + _name_4);
              String _plus_5 = (_plus_4 + " & ! as_unknown & as_ready -> G!(at_assembly_");
              String _name_5 = in.getInputLocations().get(i).getName();
              String _plus_6 = (_plus_5 + _name_5);
              String _plus_7 = (_plus_6 + " & !as_ready & !as_unknown)) & ");
              this.template = _plus_7;
              String _name_6 = in.getInputLocations().get(i).getName();
              String _plus_8 = ((this.template + "G (at_assembly_") + _name_6);
              String _plus_9 = (_plus_8 + " & ! as_unknown & ! as_ready -> G!(at_assembly_");
              String _name_7 = in.getInputLocations().get(i).getName();
              String _plus_10 = (_plus_9 + _name_7);
              String _plus_11 = (_plus_10 + " & as_ready))");
              this.template = _plus_11;
              String _name_8 = in.getInputLocations().get(i).getName();
              String _plus_12 = (this.text + _name_8);
              this.text = _plus_12;
            }
          }
          this.text = (this.text + ", checks whether it has finished its product, and if finished it delivers the product to the final location.");
        } else {
          String _name_2 = in.getTask().eClass().getName();
          boolean _equals_2 = Objects.equal(_name_2, "CheckSupplies");
          if (_equals_2) {
            this.text = (this.text + " visit assembly station(s) ");
            for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
              {
                if ((i > 0)) {
                  this.template = (this.template + " & ");
                  this.text = (this.text + ", ");
                }
                String _name_3 = in.getInputLocations().get(i).getName();
                String _plus = ((this.template + "F (at_assembly_") + _name_3);
                String _plus_1 = (_plus + " & ! as_need_unknown & (as_need_");
                String _name_4 = in.getInputResource().get(0).getName();
                String _plus_2 = (_plus_1 + _name_4);
                String _plus_3 = (_plus_2 + " -> F delivered_");
                String _name_5 = in.getInputResource().get(0).getName();
                String _plus_4 = (_plus_3 + _name_5);
                String _plus_5 = (_plus_4 + ")) & ");
                this.template = _plus_5;
                String _name_6 = in.getInputLocations().get(i).getName();
                String _plus_6 = ((this.template + "G (at_assembly_") + _name_6);
                String _plus_7 = (_plus_6 + " & ! as_need_unknown & as_need_");
                String _name_7 = in.getInputResource().get(0).getName();
                String _plus_8 = (_plus_7 + _name_7);
                String _plus_9 = (_plus_8 + " -> G!(at_assembly_");
                String _name_8 = in.getInputLocations().get(i).getName();
                String _plus_10 = (_plus_9 + _name_8);
                String _plus_11 = (_plus_10 + " & !as_need_");
                String _name_9 = in.getInputResource().get(0).getName();
                String _plus_12 = (_plus_11 + _name_9);
                String _plus_13 = (_plus_12 + " & !as_need_unknown))");
                this.template = _plus_13;
                String _name_10 = in.getInputLocations().get(i).getName();
                String _plus_14 = (this.text + _name_10);
                this.text = _plus_14;
              }
            }
            this.text = (this.text + " and check whether it needs supplies. ");
            String _name_3 = in.getInputResource().get(0).getName();
            String _plus = ((this.text + "If it is the case, the robot provides resource ") + _name_3);
            String _plus_1 = (_plus + ".");
            this.text = _plus_1;
          } else {
            String _name_4 = in.getTask().eClass().getName();
            boolean _equals_3 = Objects.equal(_name_4, "CheckAndDeliverQCh");
            if (_equals_3) {
              this.text = (this.text + " visit assembly station(s) ");
              for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                {
                  if ((i > 0)) {
                    this.template = (this.template + " & ");
                    this.text = (this.text + ", ");
                  }
                  String _name_5 = in.getInputLocations().get(i).getName();
                  String _plus_2 = ((this.template + "F (at_assembly_") + _name_5);
                  String _plus_3 = (_plus_2 + " & ! as_unknown & (as_ready -> F delivered_final_");
                  String _name_6 = in.getInputLocations().get(i).getName();
                  String _plus_4 = (_plus_3 + _name_6);
                  String _plus_5 = (_plus_4 + " & ");
                  this.template = _plus_5;
                  this.template = (this.template + "F (piece_checked & (piece_faulty -> F discarded_piece))) )) & ");
                  String _name_7 = in.getInputLocations().get(i).getName();
                  String _plus_6 = ((this.template + "G (at_assembly_") + _name_7);
                  String _plus_7 = (_plus_6 + " & ! as_unknown & as_ready -> G!(at_assembly_");
                  String _name_8 = in.getInputLocations().get(i).getName();
                  String _plus_8 = (_plus_7 + _name_8);
                  String _plus_9 = (_plus_8 + " & !as_ready & !as_unknown)) & ");
                  this.template = _plus_9;
                  String _name_9 = in.getInputLocations().get(i).getName();
                  String _plus_10 = ((this.template + "G (at_assembly_") + _name_9);
                  String _plus_11 = (_plus_10 + " & ! as_unknown & ! as_ready -> G!(at_assembly_");
                  String _name_10 = in.getInputLocations().get(i).getName();
                  String _plus_12 = (_plus_11 + _name_10);
                  String _plus_13 = (_plus_12 + " & as_ready))");
                  this.template = _plus_13;
                  String _name_11 = in.getInputLocations().get(i).getName();
                  String _plus_14 = (this.text + _name_11);
                  this.text = _plus_14;
                }
              }
              this.text = (this.text + ", checks whether it has finished its product, and if finished it delivers the product to the final location. ");
              this.text = (this.text + "Upon delivery, performs a quality check of one piece and discards it if there is an issue");
            } else {
              String _name_5 = in.getTask().eClass().getName();
              boolean _equals_4 = Objects.equal(_name_5, "TestITAAPAs");
              if (_equals_4) {
                this.template = "F (piece_checked & (piece_faulty -> F discarded_piece))";
                this.text = (this.text + " test the ITA-APAS integration.");
              } else {
                String _name_6 = in.getTask().eClass().getName();
                boolean _equals_5 = Objects.equal(_name_6, "Visit");
                if (_equals_5) {
                  String _name_7 = in.getInputLocations().get(0).getName();
                  String _plus_2 = ("<> (" + _name_7);
                  String _plus_3 = (_plus_2 + ")");
                  this.template = _plus_3;
                  String _name_8 = in.getInputLocations().get(0).getName();
                  String _plus_4 = ((this.text + " visit (without any specific order) location(s) ") + _name_8);
                  this.text = _plus_4;
                  for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                    {
                      String _name_9 = in.getInputLocations().get(i).getName();
                      String _plus_5 = ((this.template + " && <> (") + _name_9);
                      String _plus_6 = (_plus_5 + ")");
                      this.template = _plus_6;
                      String _name_10 = in.getInputLocations().get(i).getName();
                      String _plus_7 = ((this.text + ", ") + _name_10);
                      this.text = _plus_7;
                    }
                  }
                } else {
                  String _name_9 = in.getTask().eClass().getName();
                  boolean _equals_6 = Objects.equal(_name_9, "FairVisit");
                  if (_equals_6) {
                    String _name_10 = in.getInputLocations().get(0).getName();
                    String _plus_5 = ("<> (" + _name_10);
                    String _plus_6 = (_plus_5 + ")");
                    this.template = _plus_6;
                    this.text = (this.text + "visit (without any specific order) location(s) ");
                    for (int j = 0; (j < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); j++) {
                      if ((j == 0)) {
                        for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                          String _name_11 = in.getInputLocations().get(i).getName();
                          String _plus_7 = ((this.template + " && <> (") + _name_11);
                          String _plus_8 = (_plus_7 + ")");
                          this.template = _plus_8;
                        }
                        String _name_11 = in.getInputLocations().get(j).getName();
                        String _plus_7 = ((this.template + " && [] ((") + _name_11);
                        String _plus_8 = (_plus_7 + ") -> X (((!");
                        String _name_12 = in.getInputLocations().get(j).getName();
                        String _plus_9 = (_plus_8 + _name_12);
                        String _plus_10 = (_plus_9 + ") U (");
                        String _name_13 = in.getInputLocations().get((j + 1)).getName();
                        String _plus_11 = (_plus_10 + _name_13);
                        String _plus_12 = (_plus_11 + ")) || ([] (!");
                        String _name_14 = in.getInputLocations().get(j).getName();
                        String _plus_13 = (_plus_12 + _name_14);
                        String _plus_14 = (_plus_13 + "))))");
                        this.template = _plus_14;
                        for (int i = 2; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                          String _name_15 = in.getInputLocations().get(j).getName();
                          String _plus_15 = ((this.template + " && (((!") + _name_15);
                          String _plus_16 = (_plus_15 + ") U (");
                          String _name_16 = in.getInputLocations().get((j + 1)).getName();
                          String _plus_17 = (_plus_16 + _name_16);
                          String _plus_18 = (_plus_17 + ")) || ([] (!");
                          String _name_17 = in.getInputLocations().get(j).getName();
                          String _plus_19 = (_plus_18 + _name_17);
                          String _plus_20 = (_plus_19 + ")))");
                          this.template = _plus_20;
                        }
                        String _name_15 = in.getInputLocations().get(j).getName();
                        String _plus_15 = (this.text + _name_15);
                        this.text = _plus_15;
                      } else {
                        String _name_16 = in.getInputLocations().get(j).getName();
                        String _plus_16 = ((this.template + " && [] ((") + _name_16);
                        String _plus_17 = (_plus_16 + ") -> X (((!");
                        String _name_17 = in.getInputLocations().get(j).getName();
                        String _plus_18 = (_plus_17 + _name_17);
                        String _plus_19 = (_plus_18 + ") U (");
                        String _name_18 = in.getInputLocations().get(0).getName();
                        String _plus_20 = (_plus_19 + _name_18);
                        String _plus_21 = (_plus_20 + ")) || ([] (!");
                        String _name_19 = in.getInputLocations().get(j).getName();
                        String _plus_22 = (_plus_21 + _name_19);
                        String _plus_23 = (_plus_22 + "))))");
                        this.template = _plus_23;
                        for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                          if ((i != j)) {
                            String _name_20 = in.getInputLocations().get(j).getName();
                            String _plus_24 = ((this.template + " && (((!") + _name_20);
                            String _plus_25 = (_plus_24 + ") U (");
                            String _name_21 = in.getInputLocations().get(i).getName();
                            String _plus_26 = (_plus_25 + _name_21);
                            String _plus_27 = (_plus_26 + ")) || ([] (!");
                            String _name_22 = in.getInputLocations().get(j).getName();
                            String _plus_28 = (_plus_27 + _name_22);
                            String _plus_29 = (_plus_28 + ")))");
                            this.template = _plus_29;
                          }
                        }
                        String _name_20 = in.getInputLocations().get(j).getName();
                        String _plus_24 = ((this.text + ", ") + _name_20);
                        this.text = _plus_24;
                      }
                    }
                    this.text = (this.text + "the same number of times");
                  } else {
                    String _name_11 = in.getTask().eClass().getName();
                    boolean _equals_7 = Objects.equal(_name_11, "OrderderVisit");
                    if (_equals_7) {
                      String _name_12 = in.getInputLocations().get(0).getName();
                      String _plus_7 = ("(<> (" + _name_12);
                      String _plus_8 = (_plus_7 + ")");
                      this.template = _plus_8;
                      this.text = (this.text + "visit (with a specific order) location(s) ");
                      for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                        String _name_13 = in.getInputLocations().get(i).getName();
                        String _plus_9 = ((this.template + " && ((<> ") + _name_13);
                        String _plus_10 = (_plus_9 + ")");
                        this.template = _plus_10;
                      }
                      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                        {
                          this.template = (this.template + ")");
                          String _name_13 = in.getInputLocations().get(i).getName();
                          String _plus_9 = (this.text + _name_13);
                          String _plus_10 = (_plus_9 + ", ");
                          this.text = _plus_10;
                        }
                      }
                      for (int j = (((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length - 1); (j > 0); j--) {
                        for (int i = (j - 1); (i >= 0); i--) {
                          String _name_13 = in.getInputLocations().get(j).getName();
                          String _plus_9 = ((this.template + " && ((!") + _name_13);
                          String _plus_10 = (_plus_9 + ") U (");
                          String _name_14 = in.getInputLocations().get(i).getName();
                          String _plus_11 = (_plus_10 + _name_14);
                          String _plus_12 = (_plus_11 + "))");
                          this.template = _plus_12;
                        }
                      }
                    } else {
                      String _name_13 = in.getTask().eClass().getName();
                      boolean _equals_8 = Objects.equal(_name_13, "SequencedVisit");
                      if (_equals_8) {
                        String _name_14 = in.getInputLocations().get(0).getName();
                        String _plus_9 = ("<> ((" + _name_14);
                        String _plus_10 = (_plus_9 + ")");
                        this.template = _plus_10;
                        this.text = (this.text + "visit in sequence location(s) ");
                        for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                          String _name_15 = in.getInputLocations().get(i).getName();
                          String _plus_11 = ((this.template + " && (<> (") + _name_15);
                          String _plus_12 = (_plus_11 + ")");
                          this.template = _plus_12;
                        }
                        for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                          {
                            this.template = (this.template + ")");
                            String _name_15 = in.getInputLocations().get(i).getName();
                            String _plus_11 = (this.text + _name_15);
                            String _plus_12 = (_plus_11 + ", ");
                            this.text = _plus_12;
                          }
                        }
                      } else {
                        String _name_15 = in.getTask().eClass().getName();
                        boolean _equals_9 = Objects.equal(_name_15, "StrictOrderedVisit");
                        if (_equals_9) {
                          String _name_16 = in.getInputLocations().get(0).getName();
                          String _plus_11 = ("(<> (" + _name_16);
                          String _plus_12 = (_plus_11 + ")");
                          this.template = _plus_12;
                          this.text = (this.text + "visit (with a strict order) location(s) ");
                          for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                            String _name_17 = in.getInputLocations().get(i).getName();
                            String _plus_13 = ((this.template + " && ((<> ") + _name_17);
                            String _plus_14 = (_plus_13 + ")");
                            this.template = _plus_14;
                          }
                          for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                            {
                              this.template = (this.template + ")");
                              String _name_17 = in.getInputLocations().get(i).getName();
                              String _plus_13 = (this.text + _name_17);
                              String _plus_14 = (_plus_13 + ", ");
                              this.text = _plus_14;
                            }
                          }
                          for (int j = (((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length - 1); (j > 0); j--) {
                            for (int i = (j - 1); (i >= 0); i--) {
                              String _name_17 = in.getInputLocations().get(j).getName();
                              String _plus_13 = ((this.template + " && ((!") + _name_17);
                              String _plus_14 = (_plus_13 + ") U (");
                              String _name_18 = in.getInputLocations().get(i).getName();
                              String _plus_15 = (_plus_14 + _name_18);
                              String _plus_16 = (_plus_15 + "))");
                              this.template = _plus_16;
                            }
                          }
                          for (int j = (((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length - 1); (j > 0); j--) {
                            for (int i = (j - 1); (i >= 0); i--) {
                              if ((i != j)) {
                                String _name_17 = in.getInputLocations().get(j).getName();
                                String _plus_13 = ((this.template + " && (!(") + _name_17);
                                String _plus_14 = (_plus_13 + ") U (");
                                String _name_18 = in.getInputLocations().get(j).getName();
                                String _plus_15 = (_plus_14 + _name_18);
                                String _plus_16 = (_plus_15 + " && X(!(");
                                String _name_19 = in.getInputLocations().get(j).getName();
                                String _plus_17 = (_plus_16 + _name_19);
                                String _plus_18 = (_plus_17 + ") U ");
                                String _name_20 = in.getInputLocations().get(i).getName();
                                String _plus_19 = (_plus_18 + _name_20);
                                String _plus_20 = (_plus_19 + ")))");
                                this.template = _plus_20;
                              }
                            }
                          }
                        } else {
                          String _name_17 = in.getTask().eClass().getName();
                          boolean _equals_10 = Objects.equal(_name_17, "Patrolling");
                          if (_equals_10) {
                            String _name_18 = in.getInputLocations().get(0).getName();
                            String _plus_13 = ("[] (<> (" + _name_18);
                            String _plus_14 = (_plus_13 + ")");
                            this.template = _plus_14;
                            String _name_19 = in.getInputLocations().get(0).getName();
                            String _plus_15 = ((this.text + "patrol location(s) ") + _name_19);
                            this.text = _plus_15;
                            for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                              {
                                String _name_20 = in.getInputLocations().get(i).getName();
                                String _plus_16 = ((this.template + " && <> (") + _name_20);
                                String _plus_17 = (_plus_16 + ")");
                                this.template = _plus_17;
                                String _name_21 = in.getInputLocations().get(i).getName();
                                String _plus_18 = ((this.text + ", ") + _name_21);
                                this.text = _plus_18;
                              }
                            }
                            this.template = (this.template + ")");
                          } else {
                            String _name_20 = in.getTask().eClass().getName();
                            boolean _equals_11 = Objects.equal(_name_20, "FairPatrolling");
                            if (_equals_11) {
                              String _name_21 = in.getInputLocations().get(0).getName();
                              String _plus_16 = ("[] (<> (" + _name_21);
                              String _plus_17 = (_plus_16 + ")");
                              this.template = _plus_17;
                              this.text = (this.text + "patrol (without any specific order) location(s) ");
                              for (int j = 0; (j < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); j++) {
                                if ((j == 0)) {
                                  for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                    String _name_22 = in.getInputLocations().get(i).getName();
                                    String _plus_18 = ((this.template + " && <> (") + _name_22);
                                    String _plus_19 = (_plus_18 + ")");
                                    this.template = _plus_19;
                                  }
                                  String _name_22 = in.getInputLocations().get(j).getName();
                                  String _plus_18 = ((this.template + " && [] ((") + _name_22);
                                  String _plus_19 = (_plus_18 + ") -> X (((!");
                                  String _name_23 = in.getInputLocations().get(j).getName();
                                  String _plus_20 = (_plus_19 + _name_23);
                                  String _plus_21 = (_plus_20 + ") U (");
                                  String _name_24 = in.getInputLocations().get((j + 1)).getName();
                                  String _plus_22 = (_plus_21 + _name_24);
                                  String _plus_23 = (_plus_22 + ")) || ([] (!");
                                  String _name_25 = in.getInputLocations().get(j).getName();
                                  String _plus_24 = (_plus_23 + _name_25);
                                  String _plus_25 = (_plus_24 + "))))");
                                  this.template = _plus_25;
                                  for (int i = 2; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                    String _name_26 = in.getInputLocations().get(j).getName();
                                    String _plus_26 = ((this.template + " && (((!") + _name_26);
                                    String _plus_27 = (_plus_26 + ") U (");
                                    String _name_27 = in.getInputLocations().get((j + 1)).getName();
                                    String _plus_28 = (_plus_27 + _name_27);
                                    String _plus_29 = (_plus_28 + ")) || ([] (!");
                                    String _name_28 = in.getInputLocations().get(j).getName();
                                    String _plus_30 = (_plus_29 + _name_28);
                                    String _plus_31 = (_plus_30 + ")))");
                                    this.template = _plus_31;
                                  }
                                  String _name_26 = in.getInputLocations().get(j).getName();
                                  String _plus_26 = (this.text + _name_26);
                                  this.text = _plus_26;
                                } else {
                                  String _name_27 = in.getInputLocations().get(j).getName();
                                  String _plus_27 = ((this.template + " && [] ((") + _name_27);
                                  String _plus_28 = (_plus_27 + ") -> X (((!");
                                  String _name_28 = in.getInputLocations().get(j).getName();
                                  String _plus_29 = (_plus_28 + _name_28);
                                  String _plus_30 = (_plus_29 + ") U (");
                                  String _name_29 = in.getInputLocations().get(0).getName();
                                  String _plus_31 = (_plus_30 + _name_29);
                                  String _plus_32 = (_plus_31 + ")) || ([] (!");
                                  String _name_30 = in.getInputLocations().get(j).getName();
                                  String _plus_33 = (_plus_32 + _name_30);
                                  String _plus_34 = (_plus_33 + "))))");
                                  this.template = _plus_34;
                                  String _name_31 = in.getInputLocations().get(j).getName();
                                  String _plus_35 = ((this.text + ", ") + _name_31);
                                  this.text = _plus_35;
                                  for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                    if ((i != j)) {
                                      String _name_32 = in.getInputLocations().get(j).getName();
                                      String _plus_36 = ((this.template + " && (((!") + _name_32);
                                      String _plus_37 = (_plus_36 + ") U (");
                                      String _name_33 = in.getInputLocations().get(i).getName();
                                      String _plus_38 = (_plus_37 + _name_33);
                                      String _plus_39 = (_plus_38 + ")) || ([] (!");
                                      String _name_34 = in.getInputLocations().get(j).getName();
                                      String _plus_40 = (_plus_39 + _name_34);
                                      String _plus_41 = (_plus_40 + ")))");
                                      this.template = _plus_41;
                                    }
                                  }
                                }
                              }
                              this.template = (this.template + ")");
                              this.text = (this.text + "the same number of times");
                            } else {
                              String _name_22 = in.getTask().eClass().getName();
                              boolean _equals_12 = Objects.equal(_name_22, "OrderedPatrolling");
                              if (_equals_12) {
                                String _name_23 = in.getInputLocations().get(0).getName();
                                String _plus_18 = ("[] (<> ((" + _name_23);
                                String _plus_19 = (_plus_18 + ")");
                                this.template = _plus_19;
                                this.text = (this.text + "patrol (with a specific order) location(s) ");
                                for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                  String _name_24 = in.getInputLocations().get(i).getName();
                                  String _plus_20 = ((this.template + " && <> (") + _name_24);
                                  String _plus_21 = (_plus_20 + ")");
                                  this.template = _plus_21;
                                }
                                for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                  {
                                    this.template = (this.template + ")");
                                    String _name_24 = in.getInputLocations().get(i).getName();
                                    String _plus_20 = (this.text + _name_24);
                                    String _plus_21 = (_plus_20 + ", ");
                                    this.text = _plus_21;
                                  }
                                }
                                for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                  this.template = (this.template + ")");
                                }
                                for (int j = (((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length - 1); (j >= 0); j--) {
                                  for (int i = (j - 1); (i >= 0); i--) {
                                    String _name_24 = in.getInputLocations().get(j).getName();
                                    String _plus_20 = ((this.template + " && ((!") + _name_24);
                                    String _plus_21 = (_plus_20 + ") U (");
                                    String _name_25 = in.getInputLocations().get(i).getName();
                                    String _plus_22 = (_plus_21 + _name_25);
                                    String _plus_23 = (_plus_22 + "))");
                                    this.template = _plus_23;
                                  }
                                }
                                for (int j = (((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length - 1); (j > 0); j--) {
                                  for (int i = (j - 1); (i >= 0); i--) {
                                    if ((i != j)) {
                                      String _name_24 = in.getInputLocations().get(j).getName();
                                      String _plus_20 = ((this.template + " && [] (") + _name_24);
                                      String _plus_21 = (_plus_20 + " -> X((! ");
                                      String _name_25 = in.getInputLocations().get(j).getName();
                                      String _plus_22 = (_plus_21 + _name_25);
                                      String _plus_23 = (_plus_22 + ") U ");
                                      String _name_26 = in.getInputLocations().get(i).getName();
                                      String _plus_24 = (_plus_23 + _name_26);
                                      String _plus_25 = (_plus_24 + "))");
                                      this.template = _plus_25;
                                    }
                                  }
                                }
                              } else {
                                String _name_24 = in.getTask().eClass().getName();
                                boolean _equals_13 = Objects.equal(_name_24, "StrictOreredPatrolling");
                                if (_equals_13) {
                                  String _name_25 = in.getInputLocations().get(0).getName();
                                  String _plus_20 = ("[] (<> (" + _name_25);
                                  String _plus_21 = (_plus_20 + ")");
                                  this.template = _plus_21;
                                  String _name_26 = in.getInputLocations().get(0).getName();
                                  String _plus_22 = ((this.text + "patrol (with a strict order) location(s) ") + _name_26);
                                  this.text = _plus_22;
                                  for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                    {
                                      String _name_27 = in.getInputLocations().get(i).getName();
                                      String _plus_23 = ((this.template + " && <> ((") + _name_27);
                                      String _plus_24 = (_plus_23 + ")");
                                      this.template = _plus_24;
                                      String _name_28 = in.getInputLocations().get(i).getName();
                                      String _plus_25 = ((this.text + ", ") + _name_28);
                                      this.text = _plus_25;
                                    }
                                  }
                                  for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                    this.template = (this.template + ")");
                                  }
                                  for (int j = (((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length - 1); (j >= 0); j--) {
                                    for (int i = (j - 1); (i >= 0); i--) {
                                      String _name_27 = in.getInputLocations().get(j).getName();
                                      String _plus_23 = ((this.template + " && ((!") + _name_27);
                                      String _plus_24 = (_plus_23 + ") U (");
                                      String _name_28 = in.getInputLocations().get(i).getName();
                                      String _plus_25 = (_plus_24 + _name_28);
                                      String _plus_26 = (_plus_25 + "))");
                                      this.template = _plus_26;
                                    }
                                  }
                                  for (int j = (((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length - 1); (j > 0); j--) {
                                    for (int i = (j - 1); (i >= 0); i--) {
                                      if ((i != j)) {
                                        String _name_27 = in.getInputLocations().get(j).getName();
                                        String _plus_23 = ((this.template + " && [] (") + _name_27);
                                        String _plus_24 = (_plus_23 + " -> X((! ");
                                        String _name_28 = in.getInputLocations().get(j).getName();
                                        String _plus_25 = (_plus_24 + _name_28);
                                        String _plus_26 = (_plus_25 + ") U ");
                                        String _name_29 = in.getInputLocations().get(i).getName();
                                        String _plus_27 = (_plus_26 + _name_29);
                                        String _plus_28 = (_plus_27 + "))");
                                        this.template = _plus_28;
                                      }
                                    }
                                  }
                                  for (int j = 0; (j < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); j++) {
                                    for (int i = (j + 1); (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                      if ((i != j)) {
                                        String _name_27 = in.getInputLocations().get(j).getName();
                                        String _plus_23 = ((this.template + " && [] (") + _name_27);
                                        String _plus_24 = (_plus_23 + " -> X((! ");
                                        String _name_28 = in.getInputLocations().get(j).getName();
                                        String _plus_25 = (_plus_24 + _name_28);
                                        String _plus_26 = (_plus_25 + ") U (");
                                        String _name_29 = in.getInputLocations().get(i).getName();
                                        String _plus_27 = (_plus_26 + _name_29);
                                        String _plus_28 = (_plus_27 + ")))");
                                        this.template = _plus_28;
                                      }
                                    }
                                  }
                                } else {
                                  String _name_27 = in.getTask().eClass().getName();
                                  boolean _equals_14 = Objects.equal(_name_27, "SequencedPatrolling");
                                  if (_equals_14) {
                                    String _name_28 = in.getInputLocations().get(0).getName();
                                    String _plus_23 = ("[] (<> ((" + _name_28);
                                    String _plus_24 = (_plus_23 + ")");
                                    this.template = _plus_24;
                                    String _name_29 = in.getInputLocations().get(0).getName();
                                    String _plus_25 = ((this.text + "patrol in sequence location(s) ") + _name_29);
                                    this.text = _plus_25;
                                    for (int i = 1; (i < ((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length); i++) {
                                      {
                                        String _name_30 = in.getInputLocations().get(i).getName();
                                        String _plus_26 = ((this.template + " && <> ((") + _name_30);
                                        String _plus_27 = (_plus_26 + ")");
                                        this.template = _plus_27;
                                        String _name_31 = in.getInputLocations().get(i).getName();
                                        String _plus_28 = ((this.text + ", ") + _name_31);
                                        this.text = _plus_28;
                                      }
                                    }
                                    for (int i = 0; (i < ((((Object[])Conversions.unwrapArray(in.getInputLocations(), Object.class)).length * 2) - 1)); i++) {
                                      this.template = (this.template + ")");
                                    }
                                  } else {
                                    String _name_30 = in.getTask().eClass().getName();
                                    boolean _equals_15 = Objects.equal(_name_30, "ExactRestrictedAvoidance");
                                    if (_equals_15) {
                                      boolean _isEmpty = in.getInputAction().isEmpty();
                                      if (_isEmpty) {
                                        String _name_31 = in.getInputLocations().get(0).getName();
                                        String _plus_26 = ("(! (" + _name_31);
                                        String _plus_27 = (_plus_26 + ")) U (");
                                        String _name_32 = in.getInputLocations().get(0).getName();
                                        String _plus_28 = (_plus_27 + _name_32);
                                        String _plus_29 = (_plus_28 + " && (X ((! ");
                                        String _name_33 = in.getInputLocations().get(0).getName();
                                        String _plus_30 = (_plus_29 + _name_33);
                                        String _plus_31 = (_plus_30 + ") U (");
                                        String _name_34 = in.getInputLocations().get(0).getName();
                                        String _plus_32 = (_plus_31 + _name_34);
                                        String _plus_33 = (_plus_32 + " && (X ((! ");
                                        String _name_35 = in.getInputLocations().get(0).getName();
                                        String _plus_34 = (_plus_33 + _name_35);
                                        String _plus_35 = (_plus_34 + ") U (");
                                        String _name_36 = in.getInputLocations().get(0).getName();
                                        String _plus_36 = (_plus_35 + _name_36);
                                        String _plus_37 = (_plus_36 + " && (X ([] (!  ");
                                        String _name_37 = in.getInputLocations().get(0).getName();
                                        String _plus_38 = (_plus_37 + _name_37);
                                        String _plus_39 = (_plus_38 + "))))))))))");
                                        this.template = _plus_39;
                                        String _name_38 = in.getInputLocations().get(0).getName();
                                        String _plus_40 = ((this.text + "visit location ") + _name_38);
                                        String _plus_41 = (_plus_40 + " an exact number of times");
                                        this.text = _plus_41;
                                      } else {
                                        boolean _isEmpty_1 = in.getInputLocations().isEmpty();
                                        if (_isEmpty_1) {
                                          String _name_39 = in.getInputAction().get(0).getName();
                                          String _plus_42 = ("(! (" + _name_39);
                                          String _plus_43 = (_plus_42 + ")) U (");
                                          String _name_40 = in.getInputAction().get(0).getName();
                                          String _plus_44 = (_plus_43 + _name_40);
                                          String _plus_45 = (_plus_44 + " && (X ((! ");
                                          String _name_41 = in.getInputAction().get(0).getName();
                                          String _plus_46 = (_plus_45 + _name_41);
                                          String _plus_47 = (_plus_46 + ") U (");
                                          String _name_42 = in.getInputAction().get(0).getName();
                                          String _plus_48 = (_plus_47 + _name_42);
                                          String _plus_49 = (_plus_48 + " && (X ((! ");
                                          String _name_43 = in.getInputAction().get(0).getName();
                                          String _plus_50 = (_plus_49 + _name_43);
                                          String _plus_51 = (_plus_50 + ") U (");
                                          String _name_44 = in.getInputAction().get(0).getName();
                                          String _plus_52 = (_plus_51 + _name_44);
                                          String _plus_53 = (_plus_52 + " && (X ([] (!  ");
                                          String _name_45 = in.getInputAction().get(0).getName();
                                          String _plus_54 = (_plus_53 + _name_45);
                                          String _plus_55 = (_plus_54 + "))))))))))");
                                          this.template = _plus_55;
                                          String _name_46 = in.getInputAction().get(0).getName();
                                          String _plus_56 = ((this.text + "perform ") + _name_46);
                                          String _plus_57 = (_plus_56 + " an exact number of times");
                                          this.text = _plus_57;
                                        }
                                      }
                                    } else {
                                      String _name_47 = in.getTask().eClass().getName();
                                      boolean _equals_16 = Objects.equal(_name_47, "FutureAvoidance");
                                      if (_equals_16) {
                                        boolean _isEmpty_2 = in.getInputAction().isEmpty();
                                        if (_isEmpty_2) {
                                          EventAssignment _eventAssigned = in.getEventAssigned();
                                          String _plus_58 = ("[] ((" + _eventAssigned);
                                          String _plus_59 = (_plus_58 + "-> ([] ! (");
                                          String _name_48 = in.getInputLocations().get(0).getName();
                                          String _plus_60 = (_plus_59 + _name_48);
                                          String _plus_61 = (_plus_60 + "))");
                                          this.template = _plus_61;
                                          String _name_49 = in.getInputLocations().get(0).getName();
                                          String _plus_62 = ((this.text + "avoid location ") + _name_49);
                                          String _plus_63 = (_plus_62 + " if ");
                                          EventAssignment _eventAssigned_1 = in.getEventAssigned();
                                          String _plus_64 = (_plus_63 + _eventAssigned_1);
                                          String _plus_65 = (_plus_64 + " occurs");
                                          this.text = _plus_65;
                                        } else {
                                          boolean _isEmpty_3 = in.getInputLocations().isEmpty();
                                          if (_isEmpty_3) {
                                            EventAssignment _eventAssigned_2 = in.getEventAssigned();
                                            String _plus_66 = ("[] ((" + _eventAssigned_2);
                                            String _plus_67 = (_plus_66 + "-> ([] ! (");
                                            String _name_50 = in.getInputAction().get(0).getName();
                                            String _plus_68 = (_plus_67 + _name_50);
                                            String _plus_69 = (_plus_68 + "))");
                                            this.template = _plus_69;
                                            String _name_51 = in.getInputAction().get(0).getName();
                                            String _plus_70 = ((this.text + "avoid action ") + _name_51);
                                            String _plus_71 = (_plus_70 + " if ");
                                            EventAssignment _eventAssigned_3 = in.getEventAssigned();
                                            String _plus_72 = (_plus_71 + _eventAssigned_3);
                                            String _plus_73 = (_plus_72 + " occurs");
                                            this.text = _plus_73;
                                          }
                                        }
                                      } else {
                                        String _name_52 = in.getTask().eClass().getName();
                                        boolean _equals_17 = Objects.equal(_name_52, "GlobalAvoidance");
                                        if (_equals_17) {
                                          boolean _isEmpty_4 = in.getInputAction().isEmpty();
                                          if (_isEmpty_4) {
                                            String _name_53 = in.getInputLocations().get(0).getName();
                                            String _plus_74 = ("[] (! (" + _name_53);
                                            String _plus_75 = (_plus_74 + "))");
                                            this.template = _plus_75;
                                            String _name_54 = in.getInputLocations().get(0).getName();
                                            String _plus_76 = ((this.text + "avoid location ") + _name_54);
                                            this.text = _plus_76;
                                          } else {
                                            boolean _isEmpty_5 = in.getInputLocations().isEmpty();
                                            if (_isEmpty_5) {
                                              String _name_55 = in.getInputAction().get(0).getName();
                                              String _plus_77 = ("[] (! (" + _name_55);
                                              String _plus_78 = (_plus_77 + "))");
                                              this.template = _plus_78;
                                              String _name_56 = in.getInputAction().get(0).getName();
                                              String _plus_79 = ((this.text + "avoid action ") + _name_56);
                                              this.text = _plus_79;
                                            }
                                          }
                                        } else {
                                          String _name_57 = in.getTask().eClass().getName();
                                          boolean _equals_18 = Objects.equal(_name_57, "LowerRestricedAvoidance");
                                          if (_equals_18) {
                                            boolean _isEmpty_6 = in.getInputAction().isEmpty();
                                            if (_isEmpty_6) {
                                              String _name_58 = in.getInputLocations().get(0).getName();
                                              String _plus_80 = ("<> ((" + _name_58);
                                              String _plus_81 = (_plus_80 + ") && X (<>((");
                                              String _name_59 = in.getInputLocations().get(0).getName();
                                              String _plus_82 = (_plus_81 + _name_59);
                                              String _plus_83 = (_plus_82 + ") && X <>( (");
                                              String _name_60 = in.getInputLocations().get(0).getName();
                                              String _plus_84 = (_plus_83 + _name_60);
                                              String _plus_85 = (_plus_84 + ")))))");
                                              this.template = _plus_85;
                                              String _name_61 = in.getInputLocations().get(0).getName();
                                              String _plus_86 = ((this.text + "visit location ") + _name_61);
                                              String _plus_87 = (_plus_86 + " at least N times");
                                              this.text = _plus_87;
                                            } else {
                                              boolean _isEmpty_7 = in.getInputLocations().isEmpty();
                                              if (_isEmpty_7) {
                                                String _name_62 = in.getInputAction().get(0).getName();
                                                String _plus_88 = ("<> ((" + _name_62);
                                                String _plus_89 = (_plus_88 + ") && X (<>((");
                                                String _name_63 = in.getInputAction().get(0).getName();
                                                String _plus_90 = (_plus_89 + _name_63);
                                                String _plus_91 = (_plus_90 + ") && X <>( (");
                                                String _name_64 = in.getInputAction().get(0).getName();
                                                String _plus_92 = (_plus_91 + _name_64);
                                                String _plus_93 = (_plus_92 + ")))))");
                                                this.template = _plus_93;
                                                String _name_65 = in.getInputAction().get(0).getName();
                                                String _plus_94 = ((this.text + "perform ") + _name_65);
                                                String _plus_95 = (_plus_94 + " at least N times");
                                                this.text = _plus_95;
                                              }
                                            }
                                          } else {
                                            String _name_66 = in.getTask().eClass().getName();
                                            boolean _equals_19 = Objects.equal(_name_66, "PastAvoidance");
                                            if (_equals_19) {
                                              boolean _isEmpty_8 = in.getInputAction().isEmpty();
                                              if (_isEmpty_8) {
                                                String _name_67 = in.getInputLocations().get(0).getName();
                                                String _plus_96 = ("((! (" + _name_67);
                                                String _plus_97 = (_plus_96 + ")) U ");
                                                EventAssignment _eventAssigned_4 = in.getEventAssigned();
                                                String _plus_98 = (_plus_97 + _eventAssigned_4);
                                                String _plus_99 = (_plus_98 + ")");
                                                this.template = _plus_99;
                                                String _name_68 = in.getInputLocations().get(0).getName();
                                                String _plus_100 = ((this.text + "avoid location ") + _name_68);
                                                String _plus_101 = (_plus_100 + " until ");
                                                EventAssignment _eventAssigned_5 = in.getEventAssigned();
                                                String _plus_102 = (_plus_101 + _eventAssigned_5);
                                                String _plus_103 = (_plus_102 + " occurs");
                                                this.text = _plus_103;
                                              } else {
                                                boolean _isEmpty_9 = in.getInputLocations().isEmpty();
                                                if (_isEmpty_9) {
                                                  String _name_69 = in.getInputAction().get(0).getName();
                                                  String _plus_104 = ("((! (" + _name_69);
                                                  String _plus_105 = (_plus_104 + ")) U ");
                                                  EventAssignment _eventAssigned_6 = in.getEventAssigned();
                                                  String _plus_106 = (_plus_105 + _eventAssigned_6);
                                                  String _plus_107 = (_plus_106 + ")");
                                                  this.template = _plus_107;
                                                  String _name_70 = in.getInputAction().get(0).getName();
                                                  String _plus_108 = ((this.text + "avoid performing ") + _name_70);
                                                  String _plus_109 = (_plus_108 + " until ");
                                                  EventAssignment _eventAssigned_7 = in.getEventAssigned();
                                                  String _plus_110 = (_plus_109 + _eventAssigned_7);
                                                  String _plus_111 = (_plus_110 + " occurs");
                                                  this.text = _plus_111;
                                                }
                                              }
                                            } else {
                                              String _name_71 = in.getTask().eClass().getName();
                                              boolean _equals_20 = Objects.equal(_name_71, "UpperRestricedAvoidance");
                                              if (_equals_20) {
                                                boolean _isEmpty_10 = in.getInputAction().isEmpty();
                                                if (_isEmpty_10) {
                                                  String _name_72 = in.getInputLocations().get(0).getName();
                                                  String _plus_112 = ("! <> ((" + _name_72);
                                                  String _plus_113 = (_plus_112 + ") && X (<>((");
                                                  String _name_73 = in.getInputLocations().get(0).getName();
                                                  String _plus_114 = (_plus_113 + _name_73);
                                                  String _plus_115 = (_plus_114 + ") && X <>( (");
                                                  String _name_74 = in.getInputLocations().get(0).getName();
                                                  String _plus_116 = (_plus_115 + _name_74);
                                                  String _plus_117 = (_plus_116 + ")))))");
                                                  this.template = _plus_117;
                                                  String _name_75 = in.getInputLocations().get(0).getName();
                                                  String _plus_118 = ((this.text + "visit location ") + _name_75);
                                                  String _plus_119 = (_plus_118 + " at most N times");
                                                  this.text = _plus_119;
                                                } else {
                                                  boolean _isEmpty_11 = in.getInputLocations().isEmpty();
                                                  if (_isEmpty_11) {
                                                    String _name_76 = in.getInputAction().get(0).getName();
                                                    String _plus_120 = ("! <> ((" + _name_76);
                                                    String _plus_121 = (_plus_120 + ") && X (<>((");
                                                    String _name_77 = in.getInputAction().get(0).getName();
                                                    String _plus_122 = (_plus_121 + _name_77);
                                                    String _plus_123 = (_plus_122 + ") && X <>( (");
                                                    String _name_78 = in.getInputAction().get(0).getName();
                                                    String _plus_124 = (_plus_123 + _name_78);
                                                    String _plus_125 = (_plus_124 + ")))))");
                                                    this.template = _plus_125;
                                                    String _name_79 = in.getInputAction().get(0).getName();
                                                    String _plus_126 = ((this.text + "perform ") + _name_79);
                                                    String _plus_127 = (_plus_126 + " at most N times");
                                                    this.text = _plus_127;
                                                  }
                                                }
                                              } else {
                                                String _name_80 = in.getTask().eClass().getName();
                                                boolean _equals_21 = Objects.equal(_name_80, "InstantReaction");
                                                if (_equals_21) {
                                                  boolean _isEmpty_12 = in.getInputAction().isEmpty();
                                                  if (_isEmpty_12) {
                                                    EventAssignment _eventAssigned_8 = in.getEventAssigned();
                                                    String _plus_128 = ("[] (" + _eventAssigned_8);
                                                    String _plus_129 = (_plus_128 + " -> ");
                                                    String _name_81 = in.getInputLocations().get(0).getName();
                                                    String _plus_130 = (_plus_129 + _name_81);
                                                    String _plus_131 = (_plus_130 + ")");
                                                    this.template = _plus_131;
                                                    String _name_82 = in.getInputLocations().get(0).getName();
                                                    String _plus_132 = ((this.text + "visit ") + _name_82);
                                                    String _plus_133 = (_plus_132 + " every time ");
                                                    EventAssignment _eventAssigned_9 = in.getEventAssigned();
                                                    String _plus_134 = (_plus_133 + _eventAssigned_9);
                                                    String _plus_135 = (_plus_134 + " occurs");
                                                    this.text = _plus_135;
                                                  } else {
                                                    boolean _isEmpty_13 = in.getInputLocations().isEmpty();
                                                    if (_isEmpty_13) {
                                                      EventAssignment _eventAssigned_10 = in.getEventAssigned();
                                                      String _plus_136 = ("[] (" + _eventAssigned_10);
                                                      String _plus_137 = (_plus_136 + " -> ");
                                                      String _name_83 = in.getInputAction().get(0).getName();
                                                      String _plus_138 = (_plus_137 + _name_83);
                                                      String _plus_139 = (_plus_138 + ")");
                                                      this.template = _plus_139;
                                                      String _name_84 = in.getInputAction().get(0).getName();
                                                      String _plus_140 = ((this.text + "perform ") + _name_84);
                                                      String _plus_141 = (_plus_140 + " every time ");
                                                      EventAssignment _eventAssigned_11 = in.getEventAssigned();
                                                      String _plus_142 = (_plus_141 + _eventAssigned_11);
                                                      String _plus_143 = (_plus_142 + " occurs");
                                                      this.text = _plus_143;
                                                    }
                                                  }
                                                } else {
                                                  String _name_85 = in.getTask().eClass().getName();
                                                  boolean _equals_22 = Objects.equal(_name_85, "DelayedReaction");
                                                  if (_equals_22) {
                                                    boolean _isEmpty_14 = in.getInputAction().isEmpty();
                                                    if (_isEmpty_14) {
                                                      EventAssignment _eventAssigned_12 = in.getEventAssigned();
                                                      String _plus_144 = ("[] (" + _eventAssigned_12);
                                                      String _plus_145 = (_plus_144 + " -> (<>(");
                                                      String _name_86 = in.getInputLocations().get(0).getName();
                                                      String _plus_146 = (_plus_145 + _name_86);
                                                      String _plus_147 = (_plus_146 + ")))");
                                                      this.template = _plus_147;
                                                      String _name_87 = in.getInputLocations().get(0).getName();
                                                      String _plus_148 = ((this.text + "visit at some point later ") + _name_87);
                                                      String _plus_149 = (_plus_148 + " every time ");
                                                      EventAssignment _eventAssigned_13 = in.getEventAssigned();
                                                      String _plus_150 = (_plus_149 + _eventAssigned_13);
                                                      String _plus_151 = (_plus_150 + " occurs");
                                                      this.text = _plus_151;
                                                    } else {
                                                      boolean _isEmpty_15 = in.getInputLocations().isEmpty();
                                                      if (_isEmpty_15) {
                                                        EventAssignment _eventAssigned_14 = in.getEventAssigned();
                                                        String _plus_152 = ("[] (" + _eventAssigned_14);
                                                        String _plus_153 = (_plus_152 + " -> (<>(");
                                                        String _name_88 = in.getInputAction().get(0).getName();
                                                        String _plus_154 = (_plus_153 + _name_88);
                                                        String _plus_155 = (_plus_154 + ")))");
                                                        this.template = _plus_155;
                                                        String _name_89 = in.getInputAction().get(0).getName();
                                                        String _plus_156 = ((this.text + "perform  at some point later ") + _name_89);
                                                        String _plus_157 = (_plus_156 + " every time ");
                                                        EventAssignment _eventAssigned_15 = in.getEventAssigned();
                                                        String _plus_158 = (_plus_157 + _eventAssigned_15);
                                                        String _plus_159 = (_plus_158 + " occurs");
                                                        this.text = _plus_159;
                                                      }
                                                    }
                                                  } else {
                                                    String _name_90 = in.getTask().eClass().getName();
                                                    boolean _equals_23 = Objects.equal(_name_90, "Wait");
                                                    if (_equals_23) {
                                                      String _name_91 = in.getInputLocations().get(0).getName();
                                                      String _plus_160 = ("[] (<> (" + _name_91);
                                                      String _plus_161 = (_plus_160 + "))");
                                                      this.template = _plus_161;
                                                      String _name_92 = in.getInputLocations().get(0).getName();
                                                      String _plus_162 = ((this.text + "wait in location ") + _name_92);
                                                      this.text = _plus_162;
                                                    } else {
                                                      String _name_93 = in.getTask().eClass().getName();
                                                      boolean _equals_24 = Objects.equal(_name_93, "SimpleAction");
                                                      if (_equals_24) {
                                                        String _name_94 = in.getInputAction().get(0).getName();
                                                        String _plus_163 = ("X (" + _name_94);
                                                        String _plus_164 = (_plus_163 + ")");
                                                        this.template = _plus_164;
                                                        String _name_95 = in.getInputAction().get(0).getName();
                                                        String _plus_165 = ((this.text + " perform action ") + _name_95);
                                                        this.text = _plus_165;
                                                      } else {
                                                        this.template = "Task not recognized";
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      int _size = in.getStoppingEvent().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        for (int i = 0; (i < ((Object[])Conversions.unwrapArray(in.getStoppingEvent(), Object.class)).length); i++) {
          String _get = this.availableRobots.get(robot);
          String _plus_166 = (_get + ",");
          String _plus_167 = (_plus_166 + this.template);
          String _plus_168 = (_plus_167 + ",");
          String _name_96 = in.getStoppingEvent().get(i).getName();
          String _plus_169 = (_plus_168 + _name_96);
          this.stoppingEvents.add(_plus_169);
        }
      }
      Object _xifexpression = null;
      boolean _equals_25 = Objects.equal(hybrid, "");
      if (_equals_25) {
        _xifexpression = Boolean.valueOf(this.robotsList.get(robot).get(index).missionList.add(this.template));
      } else {
        Object _xifexpression_1 = null;
        boolean _equals_26 = Objects.equal(hybrid, "left");
        if (_equals_26) {
          _xifexpression_1 = Boolean.valueOf(this.robotsList.get(robot).get(index).missionList.add(this.template));
        } else {
          String _xifexpression_2 = null;
          boolean _equals_27 = Objects.equal(hybrid, "middle");
          if (_equals_27) {
            int _size_1 = this.robotsList.get(robot).get(index).missionList.size();
            int _minus = (_size_1 - 1);
            int _size_2 = this.robotsList.get(robot).get(index).missionList.size();
            int _minus_1 = (_size_2 - 1);
            String _get = this.robotsList.get(robot).get(index).missionList.get(_minus_1);
            String _plus_166 = (_get + " && ");
            String _plus_167 = (_plus_166 + this.template);
            _xifexpression_2 = this.robotsList.get(robot).get(index).missionList.set(_minus, _plus_167);
          } else {
            String _xifexpression_3 = null;
            boolean _equals_28 = Objects.equal(hybrid, "right");
            if (_equals_28) {
              int _size_3 = this.robotsList.get(robot).get(index).missionList.size();
              int _minus_2 = (_size_3 - 1);
              int _size_4 = this.robotsList.get(robot).get(index).missionList.size();
              int _minus_3 = (_size_4 - 1);
              String _get_1 = this.robotsList.get(robot).get(index).missionList.get(_minus_3);
              String _plus_168 = (_get_1 + this.template);
              _xifexpression_3 = this.robotsList.get(robot).get(index).missionList.set(_minus_2, _plus_168);
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = ((Object)_xifexpression_1);
      }
      _xblockexpression = ((Object)_xifexpression);
    }
    return _xblockexpression;
  }
  
  public Object doLogic(final Operator in, final int index, final int robot, final int indentation, final String parent, final String hybrid) {
    if (in instanceof ConditionOp) {
      return _doLogic((ConditionOp)in, index, robot, indentation, parent, hybrid);
    } else if (in instanceof EventHandlerOp) {
      return _doLogic((EventHandlerOp)in, index, robot, indentation, parent, hybrid);
    } else if (in instanceof FallBackOp) {
      return _doLogic((FallBackOp)in, index, robot, indentation, parent, hybrid);
    } else if (in instanceof ParallelOp) {
      return _doLogic((ParallelOp)in, index, robot, indentation, parent, hybrid);
    } else if (in instanceof SequenceOp) {
      return _doLogic((SequenceOp)in, index, robot, indentation, parent, hybrid);
    } else if (in instanceof TaskCombinationOp) {
      return _doLogic((TaskCombinationOp)in, index, robot, indentation, parent, hybrid);
    } else if (in instanceof DelegateOp) {
      return _doLogic((DelegateOp)in, index, robot, indentation, parent, hybrid);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(in, index, robot, indentation, parent, hybrid).toString());
    }
  }
}
