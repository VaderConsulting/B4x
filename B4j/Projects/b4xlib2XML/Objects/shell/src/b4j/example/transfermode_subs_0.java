package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class transfermode_subs_0 {


public static RemoteObject  _asjo(RemoteObject _jo) throws Exception{
try {
		Debug.PushSubsStack("ASJO (transfermode) ","transfermode",12,transfermode.ba,transfermode.mostCurrent,51);
if (RapidSub.canDelegate("asjo")) { return b4j.example.transfermode.remoteMe.runUserSub(false, "transfermode","asjo", _jo);}
Debug.locals.put("JO", _jo);
 BA.debugLineNum = 51;BA.debugLine="Private Sub ASJO(JO As JavaObject) As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Return JO";
Debug.JustUpdateDeviceLine();
if (true) return _jo;
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
public static RemoteObject  _initialize() throws Exception{
try {
		Debug.PushSubsStack("Initialize (transfermode) ","transfermode",12,transfermode.ba,transfermode.mostCurrent,25);
if (RapidSub.canDelegate("initialize")) { return b4j.example.transfermode.remoteMe.runUserSub(false, "transfermode","initialize");}
 BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="If Initialized Then Return";
Debug.JustUpdateDeviceLine();
if (transfermode._initialized.<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 27;BA.debugLine="TJO.InitializeStatic(\"javafx.scene.input.Transfer";
Debug.JustUpdateDeviceLine();
transfermode._tjo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("javafx.scene.input.TransferMode")));
 BA.debugLineNum = 28;BA.debugLine="UpdateConstants";
Debug.JustUpdateDeviceLine();
_updateconstants();
 BA.debugLineNum = 29;BA.debugLine="Initialized = True";
Debug.JustUpdateDeviceLine();
transfermode._initialized = transfermode.__c.getField(true,"True");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private TJO As JavaObject";
transfermode._tjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 8;BA.debugLine="Public ANY As Object";
transfermode._any = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 10;BA.debugLine="Public COPY_OR_MOVE As Object";
transfermode._copy_or_move = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 14;BA.debugLine="Public COPY As Object";
transfermode._copy = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 16;BA.debugLine="Public MOVE As Object";
transfermode._move = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 18;BA.debugLine="Public LINK As Object";
transfermode._link = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 20;BA.debugLine="Private Initialized As Boolean";
transfermode._initialized = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tostring(RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("ToString (transfermode) ","transfermode",12,transfermode.ba,transfermode.mostCurrent,47);
if (RapidSub.canDelegate("tostring")) { return b4j.example.transfermode.remoteMe.runUserSub(false, "transfermode","tostring", _mode);}
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 47;BA.debugLine="Public Sub ToString(Mode As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="Return ASJO(Mode).RunMethod(\"toString\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_asjo(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _mode)).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((transfermode.__c.getField(false,"Null")))));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateconstants() throws Exception{
try {
		Debug.PushSubsStack("UpdateConstants (transfermode) ","transfermode",12,transfermode.ba,transfermode.mostCurrent,32);
if (RapidSub.canDelegate("updateconstants")) { return b4j.example.transfermode.remoteMe.runUserSub(false, "transfermode","updateconstants");}
RemoteObject _arr = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 32;BA.debugLine="Private Sub UpdateConstants";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="ANY = TJO.GetField(\"ANY\")";
Debug.JustUpdateDeviceLine();
transfermode._any = transfermode._tjo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("ANY")));
 BA.debugLineNum = 34;BA.debugLine="COPY_OR_MOVE = TJO.GetField(\"COPY_OR_MOVE\")";
Debug.JustUpdateDeviceLine();
transfermode._copy_or_move = transfermode._tjo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("COPY_OR_MOVE")));
 BA.debugLineNum = 36;BA.debugLine="Dim Arr As JavaObject";
Debug.JustUpdateDeviceLine();
_arr = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("Arr", _arr);
 BA.debugLineNum = 37;BA.debugLine="Arr.InitializeArray(\"javafx.scene.input.TransferM";
Debug.JustUpdateDeviceLine();
_arr.runVoidMethod ("InitializeArray",(Object)(BA.ObjectToString("javafx.scene.input.TransferMode")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {transfermode._tjo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("valueOf")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("COPY"))})))})));
 BA.debugLineNum = 38;BA.debugLine="COPY = Arr";
Debug.JustUpdateDeviceLine();
transfermode._copy = (_arr.getObject());
 BA.debugLineNum = 39;BA.debugLine="Dim Arr As JavaObject";
Debug.JustUpdateDeviceLine();
_arr = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("Arr", _arr);
 BA.debugLineNum = 40;BA.debugLine="Arr.InitializeArray(\"javafx.scene.input.TransferM";
Debug.JustUpdateDeviceLine();
_arr.runVoidMethod ("InitializeArray",(Object)(BA.ObjectToString("javafx.scene.input.TransferMode")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {transfermode._tjo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("valueOf")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("MOVE"))})))})));
 BA.debugLineNum = 41;BA.debugLine="MOVE = Arr";
Debug.JustUpdateDeviceLine();
transfermode._move = (_arr.getObject());
 BA.debugLineNum = 42;BA.debugLine="Dim Arr As JavaObject";
Debug.JustUpdateDeviceLine();
_arr = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("Arr", _arr);
 BA.debugLineNum = 43;BA.debugLine="Arr.InitializeArray(\"javafx.scene.input.TransferM";
Debug.JustUpdateDeviceLine();
_arr.runVoidMethod ("InitializeArray",(Object)(BA.ObjectToString("javafx.scene.input.TransferMode")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {transfermode._tjo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("valueOf")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("LINK"))})))})));
 BA.debugLineNum = 44;BA.debugLine="LINK = Arr";
Debug.JustUpdateDeviceLine();
transfermode._link = (_arr.getObject());
 BA.debugLineNum = 45;BA.debugLine="End Sub";
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