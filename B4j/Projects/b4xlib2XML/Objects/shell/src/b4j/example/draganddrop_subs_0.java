package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class draganddrop_subs_0 {


public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _jo) throws Exception{
try {
		Debug.PushSubsStack("AsJO (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "draganddrop","asjo", __ref, _jo);}
Debug.locals.put("JO", _jo);
 BA.debugLineNum = 242;BA.debugLine="Private Sub AsJO(JO As JavaObject) As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="Return JO";
Debug.JustUpdateDeviceLine();
if (true) return _jo;
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asmouseevent(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("AsMouseEvent (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("asmouseevent")) { return __ref.runUserSub(false, "draganddrop","asmouseevent", __ref, _m);}
Debug.locals.put("M", _m);
 BA.debugLineNum = 239;BA.debugLine="Private Sub AsMouseEvent(M As MouseEvent) As Mouse";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 240;BA.debugLine="Return M";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
draganddrop._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",draganddrop._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private Mode As Object";
draganddrop._mode = RemoteObject.createNew ("Object");__ref.setField("_mode",draganddrop._mode);
 //BA.debugLineNum = 6;BA.debugLine="Private DataID() As String";
draganddrop._dataid = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});__ref.setField("_dataid",draganddrop._dataid);
 //BA.debugLineNum = 7;BA.debugLine="Private DataObject() As Object";
draganddrop._dataobject = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_dataobject",draganddrop._dataobject);
 //BA.debugLineNum = 8;BA.debugLine="Private DragboardImg As Image";
draganddrop._dragboardimg = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");__ref.setField("_dragboardimg",draganddrop._dragboardimg);
 //BA.debugLineNum = 9;BA.debugLine="Private DragboardImgOffsetX,DragboardImgOffsetY A";
draganddrop._dragboardimgoffsetx = RemoteObject.createImmutable(0);__ref.setField("_dragboardimgoffsetx",draganddrop._dragboardimgoffsetx);
draganddrop._dragboardimgoffsety = RemoteObject.createImmutable(0);__ref.setField("_dragboardimgoffsety",draganddrop._dragboardimgoffsety);
 //BA.debugLineNum = 10;BA.debugLine="Private StartDrag As Boolean";
draganddrop._startdrag = RemoteObject.createImmutable(false);__ref.setField("_startdrag",draganddrop._startdrag);
 //BA.debugLineNum = 11;BA.debugLine="Private CallBack As Object";
draganddrop._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",draganddrop._callback);
 //BA.debugLineNum = 12;BA.debugLine="Private sEventName,tEventName As String";
draganddrop._seventname = RemoteObject.createImmutable("");__ref.setField("_seventname",draganddrop._seventname);
draganddrop._teventname = RemoteObject.createImmutable("");__ref.setField("_teventname",draganddrop._teventname);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dragdetected_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("DragDetected_Event (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("dragdetected_event")) { return __ref.runUserSub(false, "draganddrop","dragdetected_event", __ref, _methodname, _args);}
RemoteObject _dataformat = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _db = RemoteObject.declareNull("b4j.example.dragboard");
int _i = 0;
RemoteObject _ldf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _clipboardcontent = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 53;BA.debugLine="Private Sub DragDetected_Event(MethodName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="CallSub2(CallBack,sEventName & \"_DragDetected\",A";
Debug.JustUpdateDeviceLine();
draganddrop.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_seventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragDetected"))),(Object)((__ref.runClassMethod (b4j.example.draganddrop.class, "_asmouseevent" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper"), _args.getArrayElement(false,BA.numberCast(int.class, 0)))))));
 BA.debugLineNum = 57;BA.debugLine="If StartDrag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_startdrag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="Dim DataFormat As JavaObject";
Debug.JustUpdateDeviceLine();
_dataformat = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("DataFormat", _dataformat);
 BA.debugLineNum = 59;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input";
Debug.JustUpdateDeviceLine();
_dataformat.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("javafx.scene.input.DataFormat")));
 BA.debugLineNum = 60;BA.debugLine="Dim DB As Dragboard";
Debug.JustUpdateDeviceLine();
_db = RemoteObject.createNew ("b4j.example.dragboard");Debug.locals.put("DB", _db);
 BA.debugLineNum = 61;BA.debugLine="DB.Initialize";
Debug.JustUpdateDeviceLine();
_db.runClassMethod (b4j.example.dragboard.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 62;BA.debugLine="DB.SetObject(AsJO(Args(0)).RunMethodJO(\"getSour";
Debug.JustUpdateDeviceLine();
_db.runClassMethod (b4j.example.dragboard.class, "_setobject" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _args.getArrayElement(false,BA.numberCast(int.class, 0)))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSource")),(Object)((draganddrop.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("startDragAndDrop")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_mode" /*RemoteObject*/ )})))));
 BA.debugLineNum = 63;BA.debugLine="For i = 0 To DataID.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dataid" /*RemoteObject*/ ).getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"";
Debug.JustUpdateDeviceLine();
_ldf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_ldf.setObject(_dataformat.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("lookupMimeType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_dataid" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i)))}))));Debug.locals.put("LDF", _ldf);
 BA.debugLineNum = 65;BA.debugLine="If LDF.IsInitialized = False Then LDF.Initiali";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ldf.runMethod(true,"IsInitialized"),draganddrop.__c.getField(true,"False"))) { 
_ldf.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.input.DataFormat")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createNewArray("String",new int[] {1},new Object[] {__ref.getField(false,"_dataid" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i))}))})));};
 BA.debugLineNum = 66;BA.debugLine="If DragboardImg.IsInitialized Then DB.SetDragV";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_dragboardimg" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_db.runClassMethod (b4j.example.dragboard.class, "_setdragview" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dragboardimg" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dragboardimgoffsetx" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dragboardimgoffsety" /*RemoteObject*/ )));};
 BA.debugLineNum = 67;BA.debugLine="Dim ClipboardContent As JavaObject";
Debug.JustUpdateDeviceLine();
_clipboardcontent = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ClipboardContent", _clipboardcontent);
 BA.debugLineNum = 68;BA.debugLine="ClipboardContent.InitializeNewInstance(\"javafx";
Debug.JustUpdateDeviceLine();
_clipboardcontent.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.input.ClipboardContent")),(Object)((draganddrop.__c.getField(false,"Null"))));
 BA.debugLineNum = 69;BA.debugLine="If DataObject(i) Is Image Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",__ref.getField(false,"_dataobject" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i)), RemoteObject.createImmutable("javafx.scene.image.Image"))) { 
 BA.debugLineNum = 70;BA.debugLine="ClipboardContent.RunMethod(\"putImage\",Array(D";
Debug.JustUpdateDeviceLine();
_clipboardcontent.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("putImage")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_dataobject" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i))})));
 }else {
 BA.debugLineNum = 72;BA.debugLine="ClipboardContent.RunMethod(\"put\",Array(LDF,Da";
Debug.JustUpdateDeviceLine();
_clipboardcontent.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("put")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_ldf.getObject()),__ref.getField(false,"_dataobject" /*RemoteObject*/ ).getArrayElement(false,BA.numberCast(int.class, _i))})));
 };
 BA.debugLineNum = 74;BA.debugLine="DB.setContent(ClipboardContent)";
Debug.JustUpdateDeviceLine();
_db.runClassMethod (b4j.example.dragboard.class, "_setcontent" /*RemoteObject*/ ,(Object)((_clipboardcontent.getObject())));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dragdone_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("DragDone_Event (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("dragdone_event")) { return __ref.runUserSub(false, "draganddrop","dragdone_event", __ref, _methodname, _args);}
RemoteObject _de = RemoteObject.declareNull("b4j.example.dragevent");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 80;BA.debugLine="Private Sub DragDone_Event(MethodName As String,A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="Dim DE As DragEvent";
Debug.JustUpdateDeviceLine();
_de = RemoteObject.createNew ("b4j.example.dragevent");Debug.locals.put("DE", _de);
 BA.debugLineNum = 82;BA.debugLine="DE.Initialize";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 83;BA.debugLine="DE.SetObject(Args(0))";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_setobject" /*RemoteObject*/ ,(Object)(_args.getArrayElement(false,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 84;BA.debugLine="CallSub2(CallBack,sEventName & \"_DragDone\",DE)";
Debug.JustUpdateDeviceLine();
draganddrop.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_seventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragDone"))),(Object)((_de)));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dragdropped_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("DragDropped_Event (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("dragdropped_event")) { return __ref.runUserSub(false, "draganddrop","dragdropped_event", __ref, _methodname, _args);}
RemoteObject _de = RemoteObject.declareNull("b4j.example.dragevent");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 230;BA.debugLine="Private Sub DragDropped_Event(MethodName As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="Dim DE As DragEvent";
Debug.JustUpdateDeviceLine();
_de = RemoteObject.createNew ("b4j.example.dragevent");Debug.locals.put("DE", _de);
 BA.debugLineNum = 232;BA.debugLine="DE.Initialize";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 233;BA.debugLine="DE.SetObject(Args(0))";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_setobject" /*RemoteObject*/ ,(Object)(_args.getArrayElement(false,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 234;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragDropped\",DE";
Debug.JustUpdateDeviceLine();
draganddrop.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_teventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragDropped"))),(Object)((_de)));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dragentered_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("DragEntered_Event (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("dragentered_event")) { return __ref.runUserSub(false, "draganddrop","dragentered_event", __ref, _methodname, _args);}
RemoteObject _de = RemoteObject.declareNull("b4j.example.dragevent");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 216;BA.debugLine="Private Sub DragEntered_Event(MethodName As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="Dim DE As DragEvent";
Debug.JustUpdateDeviceLine();
_de = RemoteObject.createNew ("b4j.example.dragevent");Debug.locals.put("DE", _de);
 BA.debugLineNum = 218;BA.debugLine="DE.Initialize";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 219;BA.debugLine="DE.SetObject(Args(0))";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_setobject" /*RemoteObject*/ ,(Object)(_args.getArrayElement(false,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 220;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragEntered\",DE";
Debug.JustUpdateDeviceLine();
draganddrop.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_teventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragEntered"))),(Object)((_de)));
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dragexited_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("DragExited_Event (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("dragexited_event")) { return __ref.runUserSub(false, "draganddrop","dragexited_event", __ref, _methodname, _args);}
RemoteObject _de = RemoteObject.declareNull("b4j.example.dragevent");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 223;BA.debugLine="Private Sub DragExited_Event(MethodName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="Dim DE As DragEvent";
Debug.JustUpdateDeviceLine();
_de = RemoteObject.createNew ("b4j.example.dragevent");Debug.locals.put("DE", _de);
 BA.debugLineNum = 225;BA.debugLine="DE.Initialize";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 226;BA.debugLine="DE.SetObject(Args(0))";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_setobject" /*RemoteObject*/ ,(Object)(_args.getArrayElement(false,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 227;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragExited\",DE)";
Debug.JustUpdateDeviceLine();
draganddrop.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_teventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragExited"))),(Object)((_de)));
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dragover_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("DragOver_Event (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("dragover_event")) { return __ref.runUserSub(false, "draganddrop","dragover_event", __ref, _methodname, _args);}
RemoteObject _de = RemoteObject.declareNull("b4j.example.dragevent");
Debug.locals.put("MethodName", _methodname);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 209;BA.debugLine="Private Sub DragOver_Event(MethodName As String,A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 210;BA.debugLine="Dim DE As DragEvent";
Debug.JustUpdateDeviceLine();
_de = RemoteObject.createNew ("b4j.example.dragevent");Debug.locals.put("DE", _de);
 BA.debugLineNum = 211;BA.debugLine="DE.Initialize";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 212;BA.debugLine="DE.SetObject(Args(0))";
Debug.JustUpdateDeviceLine();
_de.runClassMethod (b4j.example.dragevent.class, "_setobject" /*RemoteObject*/ ,(Object)(_args.getArrayElement(false,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 213;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragOver\",DE)";
Debug.JustUpdateDeviceLine();
draganddrop.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_teventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragOver"))),(Object)((_de)));
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback) throws Exception{
try {
		Debug.PushSubsStack("Initialize (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "draganddrop","initialize", __ref, _ba, _vcallback);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallBack", _vcallback);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(vCallBack As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 17;BA.debugLine="CallBack = vCallBack";
Debug.JustUpdateDeviceLine();
__ref.setField ("_callback" /*RemoteObject*/ ,_vcallback);
 BA.debugLineNum = 18;BA.debugLine="TransferMode.Initialize";
Debug.JustUpdateDeviceLine();
draganddrop._transfermode.runVoidMethod ("_initialize" /*RemoteObject*/ );
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedragsource(RemoteObject __ref,RemoteObject _pnode,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("MakeDragSource (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("makedragsource")) { return __ref.runUserSub(false, "draganddrop","makedragsource", __ref, _pnode, _veventname);}
RemoteObject _event = RemoteObject.declareNull("Object");
Debug.locals.put("pNode", _pnode);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 36;BA.debugLine="Public Sub MakeDragSource(pNode As Node, vEventNam";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="sEventName = vEventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_seventname" /*RemoteObject*/ ,_veventname);
 BA.debugLineNum = 38;BA.debugLine="If SubExists(CallBack,sEventName & \"_DragDetected";
Debug.JustUpdateDeviceLine();
if (draganddrop.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_seventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragDetected")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 39;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
Debug.JustUpdateDeviceLine();
_event = __ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.event.EventHandler")),(Object)(BA.ObjectToString("DragDetected")),(Object)(draganddrop.__c.getField(false,"Null")));Debug.locals.put("Event", _event);Debug.locals.put("Event", _event);
 BA.debugLineNum = 40;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragDetected\",Array(";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnDragDetected")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_event})));
 };
 BA.debugLineNum = 43;BA.debugLine="If SubExists(CallBack,sEventName & \"_DragDone\") T";
Debug.JustUpdateDeviceLine();
if (draganddrop.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_seventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragDone")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 44;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
Debug.JustUpdateDeviceLine();
_event = __ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.event.EventHandler")),(Object)(BA.ObjectToString("DragDone")),(Object)(draganddrop.__c.getField(false,"Null")));Debug.locals.put("Event", _event);Debug.locals.put("Event", _event);
 BA.debugLineNum = 45;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragDone\",Array(Even";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnDragDone")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_event})));
 };
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedragtarget(RemoteObject __ref,RemoteObject _pnode,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("MakeDragTarget (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("makedragtarget")) { return __ref.runUserSub(false, "draganddrop","makedragtarget", __ref, _pnode, _veventname);}
RemoteObject _event = RemoteObject.declareNull("Object");
Debug.locals.put("pNode", _pnode);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 187;BA.debugLine="Public Sub MakeDragTarget(pNode As Node, vEventNam";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 188;BA.debugLine="tEventName = vEventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_teventname" /*RemoteObject*/ ,_veventname);
 BA.debugLineNum = 189;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragOver\") T";
Debug.JustUpdateDeviceLine();
if (draganddrop.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_teventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragOver")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 190;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
Debug.JustUpdateDeviceLine();
_event = __ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.event.EventHandler")),(Object)(BA.ObjectToString("DragOver")),(Object)(draganddrop.__c.getField(false,"Null")));Debug.locals.put("Event", _event);Debug.locals.put("Event", _event);
 BA.debugLineNum = 191;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragOver\",Array(Even";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnDragOver")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_event})));
 };
 BA.debugLineNum = 193;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragEntered\"";
Debug.JustUpdateDeviceLine();
if (draganddrop.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_teventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragEntered")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 194;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
Debug.JustUpdateDeviceLine();
_event = __ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.event.EventHandler")),(Object)(BA.ObjectToString("DragEntered")),(Object)(draganddrop.__c.getField(false,"Null")));Debug.locals.put("Event", _event);Debug.locals.put("Event", _event);
 BA.debugLineNum = 195;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragEntered\",Array(E";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnDragEntered")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_event})));
 };
 BA.debugLineNum = 197;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragExited\")";
Debug.JustUpdateDeviceLine();
if (draganddrop.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_teventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragExited")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 198;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
Debug.JustUpdateDeviceLine();
_event = __ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.event.EventHandler")),(Object)(BA.ObjectToString("DragExited")),(Object)(draganddrop.__c.getField(false,"Null")));Debug.locals.put("Event", _event);Debug.locals.put("Event", _event);
 BA.debugLineNum = 199;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragExited\",Array(Ev";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnDragExited")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_event})));
 };
 BA.debugLineNum = 201;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragDropped\"";
Debug.JustUpdateDeviceLine();
if (draganddrop.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_teventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DragDropped")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 202;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
Debug.JustUpdateDeviceLine();
_event = __ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("javafx.event.EventHandler")),(Object)(BA.ObjectToString("DragDropped")),(Object)(draganddrop.__c.getField(false,"Null")));Debug.locals.put("Event", _event);Debug.locals.put("Event", _event);
 BA.debugLineNum = 203;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragDropped\",Array(E";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.draganddrop.class, "_asjo" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnode.getObject())).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnDragDropped")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_event})));
 };
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdragmodeanddata(RemoteObject __ref,RemoteObject _tmode,RemoteObject _dataids,RemoteObject _dataobjects) throws Exception{
try {
		Debug.PushSubsStack("SetDragModeAndData (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("setdragmodeanddata")) { return __ref.runUserSub(false, "draganddrop","setdragmodeanddata", __ref, _tmode, _dataids, _dataobjects);}
Debug.locals.put("tMode", _tmode);
Debug.locals.put("DataIDs", _dataids);
Debug.locals.put("DataObjects", _dataobjects);
 BA.debugLineNum = 103;BA.debugLine="Public Sub SetDragModeAndData(tMode As Object,Data";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="Mode = tMode";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mode" /*RemoteObject*/ ,_tmode);
 BA.debugLineNum = 105;BA.debugLine="DataID = DataIDs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dataid" /*RemoteObject*/ ,_dataids);
 BA.debugLineNum = 106;BA.debugLine="DataObject = DataObjects";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dataobject" /*RemoteObject*/ ,_dataobjects);
 BA.debugLineNum = 107;BA.debugLine="StartDrag = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_startdrag" /*RemoteObject*/ ,draganddrop.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="DragboardImg = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dragboardimg" /*RemoteObject*/ ).setObject (draganddrop.__c.getField(false,"Null"));
 BA.debugLineNum = 109;BA.debugLine="DragboardImgOffsetX = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dragboardimgoffsetx" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 110;BA.debugLine="DragboardImgOffsetY = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dragboardimgoffsety" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdragmodeanddata2(RemoteObject __ref,RemoteObject _tmode,RemoteObject _dataids,RemoteObject _dataobjects,RemoteObject _dragboardimage) throws Exception{
try {
		Debug.PushSubsStack("SetDragModeAndData2 (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("setdragmodeanddata2")) { return __ref.runUserSub(false, "draganddrop","setdragmodeanddata2", __ref, _tmode, _dataids, _dataobjects, _dragboardimage);}
Debug.locals.put("tMode", _tmode);
Debug.locals.put("DataIDs", _dataids);
Debug.locals.put("DataObjects", _dataobjects);
Debug.locals.put("DragboardImage", _dragboardimage);
 BA.debugLineNum = 129;BA.debugLine="Public Sub SetDragModeAndData2(tMode As Object,Dat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="Mode = tMode";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mode" /*RemoteObject*/ ,_tmode);
 BA.debugLineNum = 131;BA.debugLine="DataID = DataIDs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dataid" /*RemoteObject*/ ,_dataids);
 BA.debugLineNum = 132;BA.debugLine="DataObject = DataObjects";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dataobject" /*RemoteObject*/ ,_dataobjects);
 BA.debugLineNum = 133;BA.debugLine="StartDrag = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_startdrag" /*RemoteObject*/ ,draganddrop.__c.getField(true,"True"));
 BA.debugLineNum = 134;BA.debugLine="DragboardImg = DragboardImage";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dragboardimg" /*RemoteObject*/ ,_dragboardimage);
 BA.debugLineNum = 135;BA.debugLine="DragboardImgOffsetX = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dragboardimgoffsetx" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 136;BA.debugLine="DragboardImgOffsetY = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dragboardimgoffsety" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdragmodeanddata3(RemoteObject __ref,RemoteObject _tmode,RemoteObject _dataids,RemoteObject _dataobjects,RemoteObject _dragboardimage,RemoteObject _imageoffsetx,RemoteObject _imageoffsety) throws Exception{
try {
		Debug.PushSubsStack("SetDragModeAndData3 (draganddrop) ","draganddrop",9,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("setdragmodeanddata3")) { return __ref.runUserSub(false, "draganddrop","setdragmodeanddata3", __ref, _tmode, _dataids, _dataobjects, _dragboardimage, _imageoffsetx, _imageoffsety);}
Debug.locals.put("tMode", _tmode);
Debug.locals.put("DataIDs", _dataids);
Debug.locals.put("DataObjects", _dataobjects);
Debug.locals.put("DragboardImage", _dragboardimage);
Debug.locals.put("ImageOffsetX", _imageoffsetx);
Debug.locals.put("ImageOffsetY", _imageoffsety);
 BA.debugLineNum = 157;BA.debugLine="Public Sub SetDragModeAndData3(tMode As Object,Dat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="Mode = tMode";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mode" /*RemoteObject*/ ,_tmode);
 BA.debugLineNum = 159;BA.debugLine="DataID = DataIDs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dataid" /*RemoteObject*/ ,_dataids);
 BA.debugLineNum = 160;BA.debugLine="DataObject = DataObjects";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dataobject" /*RemoteObject*/ ,_dataobjects);
 BA.debugLineNum = 161;BA.debugLine="StartDrag = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_startdrag" /*RemoteObject*/ ,draganddrop.__c.getField(true,"True"));
 BA.debugLineNum = 162;BA.debugLine="DragboardImg = DragboardImage";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dragboardimg" /*RemoteObject*/ ,_dragboardimage);
 BA.debugLineNum = 163;BA.debugLine="DragboardImgOffsetX = ImageOffsetX";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dragboardimgoffsetx" /*RemoteObject*/ ,_imageoffsetx);
 BA.debugLineNum = 164;BA.debugLine="DragboardImgOffsetY = ImageOffsetY";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dragboardimgoffsety" /*RemoteObject*/ ,_imageoffsety);
 BA.debugLineNum = 165;BA.debugLine="End Sub";
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