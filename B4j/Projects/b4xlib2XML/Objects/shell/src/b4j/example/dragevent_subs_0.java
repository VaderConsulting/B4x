package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dragevent_subs_0 {


public static RemoteObject  _accepttransfermodes(RemoteObject __ref,RemoteObject _modes) throws Exception{
try {
		Debug.PushSubsStack("AcceptTransferModes (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("accepttransfermodes")) { return __ref.runUserSub(false, "dragevent","accepttransfermodes", __ref, _modes);}
Debug.locals.put("Modes", _modes);
 BA.debugLineNum = 14;BA.debugLine="Public Sub AcceptTransferModes(Modes() As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="TJO.RunMethod(\"acceptTransferModes\",Array(Modes))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tjo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("acceptTransferModes")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_modes)})));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private TJO As JavaObject";
dragevent._tjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_tjo",dragevent._tjo);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getacceptedtransfermode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAcceptedTransferMode (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("getacceptedtransfermode")) { return __ref.runUserSub(false, "dragevent","getacceptedtransfermode", __ref);}
 BA.debugLineNum = 18;BA.debugLine="Public Sub GetAcceptedTransferMode As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="Return TJO.RunMethod(\"getAcceptedTransferMode\",N";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAcceptedTransferMode")),(Object)((dragevent.__c.getField(false,"Null"))));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getacceptingobject(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAcceptingObject (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("getacceptingobject")) { return __ref.runUserSub(false, "dragevent","getacceptingobject", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Public Sub GetAcceptingObject As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="Return TJO.RunMethod(\"getAcceptingObject\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAcceptingObject")),(Object)((dragevent.__c.getField(false,"Null"))));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdataids(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDataIds (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("getdataids")) { return __ref.runUserSub(false, "dragevent","getdataids", __ref);}
RemoteObject _reflectarray = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _dataformat = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _strings = null;
int _i = 0;
RemoteObject _s = null;
RemoteObject _strings2 = null;
RemoteObject _str = RemoteObject.createImmutable("");
int _j = 0;
 BA.debugLineNum = 100;BA.debugLine="Public Sub GetDataIds As String()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="Dim ReflectArray As JavaObject";
Debug.JustUpdateDeviceLine();
_reflectarray = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ReflectArray", _reflectarray);
 BA.debugLineNum = 102;BA.debugLine="ReflectArray.InitializeStatic(\"java.lang.reflect.";
Debug.JustUpdateDeviceLine();
_reflectarray.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.lang.reflect.Array")));
 BA.debugLineNum = 103;BA.debugLine="Dim DataFormat As JavaObject";
Debug.JustUpdateDeviceLine();
_dataformat = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("DataFormat", _dataformat);
 BA.debugLineNum = 104;BA.debugLine="DataFormat.InitializeArray(\"javafx.scene.input.Da";
Debug.JustUpdateDeviceLine();
_dataformat.runVoidMethod ("InitializeArray",(Object)(BA.ObjectToString("javafx.scene.input.DataFormat")),(Object)((__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getDragboard")),(Object)((dragevent.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getContentTypes")),(Object)((dragevent.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toArray")),(Object)((dragevent.__c.getField(false,"Null")))))));
 BA.debugLineNum = 105;BA.debugLine="Dim Strings(ReflectArray.RunMethod(\"getLength\",Ar";
Debug.JustUpdateDeviceLine();
_strings = RemoteObject.createNewArray ("String", new int[] {(int)(BA.ObjectToNumber(_reflectarray.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getLength")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_dataformat.getObject())})))).<Double>get().doubleValue())}, new Object[]{});Debug.locals.put("Strings", _strings);
 BA.debugLineNum = 106;BA.debugLine="For i = 0  To Strings.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_strings.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 107;BA.debugLine="Dim S(1) As String";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNewArray ("String", new int[] {1}, new Object[]{});Debug.locals.put("S", _s);
 BA.debugLineNum = 108;BA.debugLine="Dim Strings2() As String = ReflectArray.RunMetho";
Debug.JustUpdateDeviceLine();
_strings2 = (_reflectarray.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_dataformat.getObject()),RemoteObject.createImmutable((_i))}))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getIdentifiers")),(Object)((dragevent.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toArray")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_s)}))));Debug.locals.put("Strings2", _strings2);Debug.locals.put("Strings2", _strings2);
 BA.debugLineNum = 109;BA.debugLine="Dim Str As String";
Debug.JustUpdateDeviceLine();
_str = RemoteObject.createImmutable("");Debug.locals.put("Str", _str);
 BA.debugLineNum = 110;BA.debugLine="For j = 0 To Strings2.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_strings2.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step10 > 0 && _j <= limit10) || (step10 < 0 && _j >= limit10) ;_j = ((int)(0 + _j + step10))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 111;BA.debugLine="Str = Str & Strings2(j) & \",\"";
Debug.JustUpdateDeviceLine();
_str = RemoteObject.concat(_str,_strings2.getArrayElement(true,BA.numberCast(int.class, _j)),RemoteObject.createImmutable(","));Debug.locals.put("Str", _str);
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 113;BA.debugLine="Str = Str.SubString2(0,Str.Length - 1)";
Debug.JustUpdateDeviceLine();
_str = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("Str", _str);
 BA.debugLineNum = 114;BA.debugLine="Strings(i) = Str";
Debug.JustUpdateDeviceLine();
_strings.setArrayElement (_str,BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 116;BA.debugLine="Return Strings";
Debug.JustUpdateDeviceLine();
if (true) return _strings;
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdataidslist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDataIDsList (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("getdataidslist")) { return __ref.runUserSub(false, "dragevent","getdataidslist", __ref);}
 BA.debugLineNum = 120;BA.debugLine="Public Sub GetDataIDsList As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="Return GetDataIds";
Debug.JustUpdateDeviceLine();
if (true) return dragevent.__c.runMethod(false, "ArrayToList", (Object)(__ref.runClassMethod (b4j.example.dragevent.class, "_getdataids" /*RemoteObject*/ )));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdataobjectforid(RemoteObject __ref,RemoteObject _dataid) throws Exception{
try {
		Debug.PushSubsStack("GetDataObjectForId (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("getdataobjectforid")) { return __ref.runUserSub(false, "dragevent","getdataobjectforid", __ref, _dataid);}
RemoteObject _dataformat = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ldf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("DataId", _dataid);
 BA.debugLineNum = 125;BA.debugLine="Public Sub GetDataObjectForId(DataId As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="Dim DataFormat As JavaObject";
Debug.JustUpdateDeviceLine();
_dataformat = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("DataFormat", _dataformat);
 BA.debugLineNum = 127;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input.D";
Debug.JustUpdateDeviceLine();
_dataformat.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("javafx.scene.input.DataFormat")));
 BA.debugLineNum = 128;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"loo";
Debug.JustUpdateDeviceLine();
_ldf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_ldf.setObject(_dataformat.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("lookupMimeType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_dataid)}))));Debug.locals.put("LDF", _ldf);
 BA.debugLineNum = 129;BA.debugLine="If LDF.IsInitialized = False Then LDF.InitializeN";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ldf.runMethod(true,"IsInitialized"),dragevent.__c.getField(true,"False"))) { 
_ldf.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.input.DataFormat")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_dataid}))})));};
 BA.debugLineNum = 130;BA.debugLine="Return TJO.RunMethodJO(\"getDragboard\",Null).RunMe";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getDragboard")),(Object)((dragevent.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getContent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ldf.getObject())})));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdragboard(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDragboard (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("getdragboard")) { return __ref.runUserSub(false, "dragevent","getdragboard", __ref);}
RemoteObject _db = RemoteObject.declareNull("b4j.example.dragboard");
 BA.debugLineNum = 26;BA.debugLine="Public Sub GetDragboard As Dragboard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="Dim DB As Dragboard";
Debug.JustUpdateDeviceLine();
_db = RemoteObject.createNew ("b4j.example.dragboard");Debug.locals.put("DB", _db);
 BA.debugLineNum = 28;BA.debugLine="DB.Initialize";
Debug.JustUpdateDeviceLine();
_db.runClassMethod (b4j.example.dragboard.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="DB.SetObject(TJO.RunMethod(\"getDragboard\",Null))";
Debug.JustUpdateDeviceLine();
_db.runClassMethod (b4j.example.dragboard.class, "_setobject" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDragboard")),(Object)((dragevent.__c.getField(false,"Null"))))));
 BA.debugLineNum = 30;BA.debugLine="Return DB";
Debug.JustUpdateDeviceLine();
if (true) return _db;
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteventsource(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetEventSource (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("geteventsource")) { return __ref.runUserSub(false, "dragevent","geteventsource", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Public Sub GetEventSource As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Return TJO.RunMethod(\"getSource\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSource")),(Object)((dragevent.__c.getField(false,"Null"))));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteventtarget(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetEventTarget (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("geteventtarget")) { return __ref.runUserSub(false, "dragevent","geteventtarget", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub GetEventTarget As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="Return TJO.RunMethod(\"getTarget\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTarget")),(Object)((dragevent.__c.getField(false,"Null"))));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteventtype(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetEventType (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("geteventtype")) { return __ref.runUserSub(false, "dragevent","geteventtype", __ref);}
 BA.debugLineNum = 33;BA.debugLine="Public Sub GetEventType As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="Return TJO.RunMethod(\"getEventType\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getEventType")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgesturesource(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetGestureSource (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("getgesturesource")) { return __ref.runUserSub(false, "dragevent","getgesturesource", __ref);}
 BA.debugLineNum = 37;BA.debugLine="Public Sub GetGestureSource As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="Return TJO.RunMethod(\"getGestureSource\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getGestureSource")),(Object)((dragevent.__c.getField(false,"Null"))));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgesturetarget(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetGestureTarget (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("getgesturetarget")) { return __ref.runUserSub(false, "dragevent","getgesturetarget", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Public Sub GetGestureTarget As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="Return TJO.RunMethod(\"getGestureTarget\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getGestureTarget")),(Object)((dragevent.__c.getField(false,"Null"))));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getobject(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetObject (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("getobject")) { return __ref.runUserSub(false, "dragevent","getobject", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Public Sub GetObject As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="Return TJO";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_tjo" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getobjectjo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetObjectJO (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("getobjectjo")) { return __ref.runUserSub(false, "dragevent","getobjectjo", __ref);}
 BA.debugLineNum = 139;BA.debugLine="Public Sub GetObjectJO As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Return TJO";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ );
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpickresult(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPickResult (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getpickresult")) { return __ref.runUserSub(false, "dragevent","getpickresult", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub GetPickResult As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Return TJO.RunMethod(\"getPickResult\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPickResult")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscenex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSceneX (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("getscenex")) { return __ref.runUserSub(false, "dragevent","getscenex", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Public Sub GetSceneX As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Return TJO.RunMethod(\"getSceneX\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSceneX")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsceney(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSceneY (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("getsceney")) { return __ref.runUserSub(false, "dragevent","getsceney", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Public Sub GetSceneY As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Return TJO.RunMethod(\"getSceneY\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSceneY")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscreenx(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScreenX (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("getscreenx")) { return __ref.runUserSub(false, "dragevent","getscreenx", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Public Sub GetScreenX As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="Return TJO.RunMethod(\"getScreenX\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenX")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscreeny(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScreenY (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("getscreeny")) { return __ref.runUserSub(false, "dragevent","getscreeny", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Public Sub GetScreenY As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="Return TJO.RunMethod(\"getScreenY\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenY")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettag(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTag (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("gettag")) { return __ref.runUserSub(false, "dragevent","gettag", __ref);}
 BA.debugLineNum = 155;BA.debugLine="Public Sub GetTag As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 156;BA.debugLine="Return TJO.RunMethod(\"getUserData\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUserData")),(Object)((dragevent.__c.getField(false,"Null"))));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettransfermode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTransferMode (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("gettransfermode")) { return __ref.runUserSub(false, "dragevent","gettransfermode", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Public Sub GetTransferMode As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Return TJO.RunMethod(\"getTransferMode\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTransferMode")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getx(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getX (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("getx")) { return __ref.runUserSub(false, "dragevent","getx", __ref);}
 BA.debugLineNum = 75;BA.debugLine="Public Sub getX As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="Return TJO.RunMethod(\"getX\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getX")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gety(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getY (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("gety")) { return __ref.runUserSub(false, "dragevent","gety", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Public Sub getY As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="Return TJO.RunMethod(\"getY\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getY")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getz(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getZ (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("getz")) { return __ref.runUserSub(false, "dragevent","getz", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Public Sub getZ As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="Return TJO.RunMethod(\"getZ\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getZ")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dragevent","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isaccepted(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsAccepted (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("isaccepted")) { return __ref.runUserSub(false, "dragevent","isaccepted", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Public Sub IsAccepted As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="Return TJO.RunMethod(\"isAccepted\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isAccepted")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isdropcompleted(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsDropCompleted (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("isdropcompleted")) { return __ref.runUserSub(false, "dragevent","isdropcompleted", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Public Sub IsDropCompleted As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="Return TJO.RunMethod(\"isDropCompleted\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isDropCompleted")),(Object)((dragevent.__c.getField(false,"Null")))));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdropcompleted(RemoteObject __ref,RemoteObject _istransferdone) throws Exception{
try {
		Debug.PushSubsStack("SetDropCompleted (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setdropcompleted")) { return __ref.runUserSub(false, "dragevent","setdropcompleted", __ref, _istransferdone);}
Debug.locals.put("IsTransferDone", _istransferdone);
 BA.debugLineNum = 95;BA.debugLine="Public Sub SetDropCompleted(IsTransferDone As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="TJO.RunMethod(\"setDropCompleted\",Array As Object";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tjo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDropCompleted")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_istransferdone)})));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setobject(RemoteObject __ref,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("SetObject (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setobject")) { return __ref.runUserSub(false, "dragevent","setobject", __ref, _obj);}
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 145;BA.debugLine="Public Sub SetObject(Obj As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="TJO = Obj";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tjo" /*RemoteObject*/ ).setObject (_obj);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settag(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("SetTag (dragevent) ","dragevent",11,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("settag")) { return __ref.runUserSub(false, "dragevent","settag", __ref, _tag);}
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 150;BA.debugLine="Public Sub SetTag(Tag As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 151;BA.debugLine="TJO.RunMethod(\"setUserData\",Array(Tag))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tjo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setUserData")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_tag})));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}