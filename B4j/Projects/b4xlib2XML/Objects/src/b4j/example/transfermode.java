package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class transfermode extends Object{
public static transfermode mostCurrent = new transfermode();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.transfermode", null);
		ba.loadHtSubs(transfermode.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.transfermode", ba);
		}
	}
    public static Class<?> getObject() {
		return transfermode.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.object.JavaObject _tjo = null;
public static Object _any = null;
public static Object _copy_or_move = null;
public static Object _copy = null;
public static Object _move = null;
public static Object _link = null;
public static boolean _initialized = false;
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _initialize() throws Exception{
RDebugUtils.currentModule="transfermode";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", null));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="If Initialized Then Return";
if (_initialized) { 
if (true) return "";};
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="TJO.InitializeStatic(\"javafx.scene.input.Transfer";
_tjo.InitializeStatic("javafx.scene.input.TransferMode");
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="UpdateConstants";
_updateconstants();
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="Initialized = True";
_initialized = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.object.JavaObject  _asjo(anywheresoftware.b4j.object.JavaObject _jo) throws Exception{
RDebugUtils.currentModule="transfermode";
if (Debug.shouldDelegate(ba, "asjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_jo}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub ASJO(JO As JavaObject) As JavaObject";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Return JO";
if (true) return _jo;
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="End Sub";
return null;
}
public static String  _updateconstants() throws Exception{
RDebugUtils.currentModule="transfermode";
if (Debug.shouldDelegate(ba, "updateconstants", true))
	 {return ((String) Debug.delegate(ba, "updateconstants", null));}
anywheresoftware.b4j.object.JavaObject _arr = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub UpdateConstants";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="ANY = TJO.GetField(\"ANY\")";
_any = _tjo.GetField("ANY");
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="COPY_OR_MOVE = TJO.GetField(\"COPY_OR_MOVE\")";
_copy_or_move = _tjo.GetField("COPY_OR_MOVE");
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="Dim Arr As JavaObject";
_arr = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="Arr.InitializeArray(\"javafx.scene.input.TransferM";
_arr.InitializeArray("javafx.scene.input.TransferMode",new Object[]{_tjo.RunMethod("valueOf",new Object[]{(Object)("COPY")})});
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="COPY = Arr";
_copy = (Object)(_arr.getObject());
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="Dim Arr As JavaObject";
_arr = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="Arr.InitializeArray(\"javafx.scene.input.TransferM";
_arr.InitializeArray("javafx.scene.input.TransferMode",new Object[]{_tjo.RunMethod("valueOf",new Object[]{(Object)("MOVE")})});
RDebugUtils.currentLine=10092553;
 //BA.debugLineNum = 10092553;BA.debugLine="MOVE = Arr";
_move = (Object)(_arr.getObject());
RDebugUtils.currentLine=10092554;
 //BA.debugLineNum = 10092554;BA.debugLine="Dim Arr As JavaObject";
_arr = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=10092555;
 //BA.debugLineNum = 10092555;BA.debugLine="Arr.InitializeArray(\"javafx.scene.input.TransferM";
_arr.InitializeArray("javafx.scene.input.TransferMode",new Object[]{_tjo.RunMethod("valueOf",new Object[]{(Object)("LINK")})});
RDebugUtils.currentLine=10092556;
 //BA.debugLineNum = 10092556;BA.debugLine="LINK = Arr";
_link = (Object)(_arr.getObject());
RDebugUtils.currentLine=10092557;
 //BA.debugLineNum = 10092557;BA.debugLine="End Sub";
return "";
}
public static String  _tostring(Object _mode) throws Exception{
RDebugUtils.currentModule="transfermode";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", new Object[] {_mode}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub ToString(Mode As Object) As String";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Return ASJO(Mode).RunMethod(\"toString\",Null)";
if (true) return BA.ObjectToString(_asjo((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mode))).RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return "";
}
}