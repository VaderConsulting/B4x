package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dragboard_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private TJO As JavaObject";
dragboard._tjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_tjo",dragboard._tjo);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("GetContent (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "dragboard","getcontent", __ref, _str);}
RemoteObject _dataformat = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ldf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 38;BA.debugLine="Public Sub GetContent(Str As String) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="Dim DataFormat As JavaObject";
Debug.JustUpdateDeviceLine();
_dataformat = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("DataFormat", _dataformat);
 BA.debugLineNum = 40;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input.D";
Debug.JustUpdateDeviceLine();
_dataformat.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("javafx.scene.input.DataFormat")));
 BA.debugLineNum = 41;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"loo";
Debug.JustUpdateDeviceLine();
_ldf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_ldf.setObject(_dataformat.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("lookupMimeType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)}))));Debug.locals.put("LDF", _ldf);
 BA.debugLineNum = 42;BA.debugLine="If LDF.IsInitialized = False Then LDF.InitializeN";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ldf.runMethod(true,"IsInitialized"),dragboard.__c.getField(true,"False"))) { 
_ldf.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.input.DataFormat")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_str}))})));};
 BA.debugLineNum = 43;BA.debugLine="Return TJO.RunMethod(\"getContent\",Array As Object";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getContent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ldf.getObject())})));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdragview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDragView (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("getdragview")) { return __ref.runUserSub(false, "dragboard","getdragview", __ref);}
 BA.debugLineNum = 17;BA.debugLine="Public Sub GetDragView As Image";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="Return TJO.RunMethod(\"getDragView\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDragView")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdragviewoffsetx(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDragViewOffsetX (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("getdragviewoffsetx")) { return __ref.runUserSub(false, "dragboard","getdragviewoffsetx", __ref);}
 BA.debugLineNum = 21;BA.debugLine="Public Sub GetDragViewOffsetX As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="Return TJO.RunMethod(\"getDragViewOffsetX\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDragViewOffsetX")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdragviewoffsety(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDragViewOffsetY (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("getdragviewoffsety")) { return __ref.runUserSub(false, "dragboard","getdragviewoffsety", __ref);}
 BA.debugLineNum = 25;BA.debugLine="Public Sub GetDragViewOffsetY As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="Return TJO.RunMethod(\"getDragViewOffsetY\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDragViewOffsetY")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfiles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetFiles (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getfiles")) { return __ref.runUserSub(false, "dragboard","getfiles", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub GetFiles As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="Return TJO.RunMethod(\"getFiles\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getFiles")),(Object)((dragboard.__c.getField(false,"Null")))));
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
public static RemoteObject  _gethtml(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetHtml (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("gethtml")) { return __ref.runUserSub(false, "dragboard","gethtml", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub GetHtml As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Return TJO.RunMethod(\"getHtml\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getHtml")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetImage (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("getimage")) { return __ref.runUserSub(false, "dragboard","getimage", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Public Sub GetImage As Image";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Return TJO.RunMethod(\"getImage\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getImage")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetObject (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("getobject")) { return __ref.runUserSub(false, "dragboard","getobject", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Public Sub GetObject As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Return TJO";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_tjo" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 110;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetObjectJO (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("getobjectjo")) { return __ref.runUserSub(false, "dragboard","getobjectjo", __ref);}
 BA.debugLineNum = 113;BA.debugLine="Public Sub GetObjectJO As JavaObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="Return TJO";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tjo" /*RemoteObject*/ );
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrtf(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRtf (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("getrtf")) { return __ref.runUserSub(false, "dragboard","getrtf", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Public Sub GetRtf As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Return TJO.RunMethod(\"getRtf\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRtf")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetString (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("getstring")) { return __ref.runUserSub(false, "dragboard","getstring", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Public Sub GetString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="Return TJO.RunMethod(\"getString\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getString")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geturl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetUrl (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("geturl")) { return __ref.runUserSub(false, "dragboard","geturl", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Public Sub GetUrl As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="Return TJO.RunMethod(\"getUrl\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUrl")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hascontent(RemoteObject __ref,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("HasContent (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("hascontent")) { return __ref.runUserSub(false, "dragboard","hascontent", __ref, _str);}
RemoteObject _dataformat = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ldf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Str", _str);
 BA.debugLineNum = 71;BA.debugLine="Public Sub HasContent(Str As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Dim DataFormat As JavaObject";
Debug.JustUpdateDeviceLine();
_dataformat = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("DataFormat", _dataformat);
 BA.debugLineNum = 73;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input.D";
Debug.JustUpdateDeviceLine();
_dataformat.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("javafx.scene.input.DataFormat")));
 BA.debugLineNum = 74;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"loo";
Debug.JustUpdateDeviceLine();
_ldf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_ldf.setObject(_dataformat.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("lookupMimeType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)}))));Debug.locals.put("LDF", _ldf);
 BA.debugLineNum = 75;BA.debugLine="If LDF.IsInitialized = False Then LDF.InitializeN";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ldf.runMethod(true,"IsInitialized"),dragboard.__c.getField(true,"False"))) { 
_ldf.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.input.DataFormat")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_str}))})));};
 BA.debugLineNum = 76;BA.debugLine="Return TJO.RunMethod(\"hasContent\",Array As Obje";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hasContent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ldf.getObject())}))));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasfiles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasFiles (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("hasfiles")) { return __ref.runUserSub(false, "dragboard","hasfiles", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Public Sub HasFiles As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="Return TJO.RunMethod(\"hasFiles\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hasFiles")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hashtml(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasHtml (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("hashtml")) { return __ref.runUserSub(false, "dragboard","hashtml", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Public Sub HasHtml As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="Return TJO.RunMethod(\"hasHtml\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hasHtml")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasImage (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("hasimage")) { return __ref.runUserSub(false, "dragboard","hasimage", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Public Sub HasImage As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="Return TJO.RunMethod(\"hasImage\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hasImage")),(Object)((dragboard.__c.getField(false,"Null")))));
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
public static RemoteObject  _hasrtf(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasRtf (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("hasrtf")) { return __ref.runUserSub(false, "dragboard","hasrtf", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Public Sub HasRtf As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="Return TJO.RunMethod(\"hasRtf\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hasRtf")),(Object)((dragboard.__c.getField(false,"Null")))));
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
public static RemoteObject  _hasstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasString (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("hasstring")) { return __ref.runUserSub(false, "dragboard","hasstring", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Public Sub HasString As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Return TJO.RunMethod(\"hasString\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hasString")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasurl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasUrl (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("hasurl")) { return __ref.runUserSub(false, "dragboard","hasurl", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Public Sub HasUrl As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="Return TJO.RunMethod(\"hasUrl\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hasUrl")),(Object)((dragboard.__c.getField(false,"Null")))));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dragboard","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcontent(RemoteObject __ref,RemoteObject _content) throws Exception{
try {
		Debug.PushSubsStack("SetContent (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("setcontent")) { return __ref.runUserSub(false, "dragboard","setcontent", __ref, _content);}
Debug.locals.put("Content", _content);
 BA.debugLineNum = 103;BA.debugLine="Public Sub SetContent(Content As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="TJO.RunMethod(\"setContent\",Array(Content))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tjo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_content})));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdragview(RemoteObject __ref,RemoteObject _img,RemoteObject _xoffset,RemoteObject _yoffset) throws Exception{
try {
		Debug.PushSubsStack("SetDragView (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("setdragview")) { return __ref.runUserSub(false, "dragboard","setdragview", __ref, _img, _xoffset, _yoffset);}
Debug.locals.put("Img", _img);
Debug.locals.put("XOffset", _xoffset);
Debug.locals.put("YOffset", _yoffset);
 BA.debugLineNum = 13;BA.debugLine="Public Sub SetDragView(Img As Image,XOffset As Dou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="Return TJO.RunMethod(\"setDragView\",Array(Img,XOf";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), __ref.getField(false,"_tjo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("setDragView")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_img.getObject()),(_xoffset),(_yoffset)}))));
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdragviewoffsetx(RemoteObject __ref,RemoteObject _offsetx) throws Exception{
try {
		Debug.PushSubsStack("SetDragViewOffsetX (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("setdragviewoffsetx")) { return __ref.runUserSub(false, "dragboard","setdragviewoffsetx", __ref, _offsetx);}
Debug.locals.put("OffsetX", _offsetx);
 BA.debugLineNum = 29;BA.debugLine="Public Sub SetDragViewOffsetX(OffsetX As Double)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="TJO.RunMethod(\"setDragViewOffsetX\",Array As Obje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tjo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDragViewOffsetX")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_offsetx)})));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdragviewoffsety(RemoteObject __ref,RemoteObject _offsety) throws Exception{
try {
		Debug.PushSubsStack("SetDragViewOffsetY (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setdragviewoffsety")) { return __ref.runUserSub(false, "dragboard","setdragviewoffsety", __ref, _offsety);}
Debug.locals.put("OffsetY", _offsety);
 BA.debugLineNum = 33;BA.debugLine="Public Sub SetDragViewOffsetY(OffsetY As Double)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="TJO.RunMethod(\"setDragViewOffsetY\",Array As Obje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tjo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDragViewOffsetY")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_offsety)})));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetObject (dragboard) ","dragboard",10,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("setobject")) { return __ref.runUserSub(false, "dragboard","setobject", __ref, _obj);}
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 119;BA.debugLine="Public Sub SetObject(Obj As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="TJO = Obj";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tjo" /*RemoteObject*/ ).setObject (_obj);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
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