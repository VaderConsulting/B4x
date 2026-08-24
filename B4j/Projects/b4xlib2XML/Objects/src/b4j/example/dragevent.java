package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class dragevent extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.dragevent", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.dragevent.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _tjo = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.transfermode _transfermode = null;
public b4j.example.dragboard  _getdragboard(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getdragboard", true))
	 {return ((b4j.example.dragboard) Debug.delegate(ba, "getdragboard", null));}
b4j.example.dragboard _db = null;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub GetDragboard As Dragboard";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Dim DB As Dragboard";
_db = new b4j.example.dragboard();
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="DB.Initialize";
_db._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="DB.SetObject(TJO.RunMethod(\"getDragboard\",Null))";
_db._setobject /*String*/ (null,__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDragboard",(Object[])(__c.Null)));
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Return DB";
if (true) return _db;
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="End Sub";
return null;
}
public String  _setdropcompleted(b4j.example.dragevent __ref,boolean _istransferdone) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "setdropcompleted", true))
	 {return ((String) Debug.delegate(ba, "setdropcompleted", new Object[] {_istransferdone}));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub SetDropCompleted(IsTransferDone As Bool";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="TJO.RunMethod(\"setDropCompleted\",Array As Object";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDropCompleted",new Object[]{(Object)(_istransferdone)});
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return "";
}
public String  _accepttransfermodes(b4j.example.dragevent __ref,Object[] _modes) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "accepttransfermodes", true))
	 {return ((String) Debug.delegate(ba, "accepttransfermodes", new Object[] {_modes}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub AcceptTransferModes(Modes() As Object)";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="TJO.RunMethod(\"acceptTransferModes\",Array(Modes))";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("acceptTransferModes",new Object[]{(Object)(_modes)});
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.dragevent __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="End Sub";
return "";
}
public String  _setobject(b4j.example.dragevent __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "setobject", true))
	 {return ((String) Debug.delegate(ba, "setobject", new Object[] {_obj}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub SetObject(Obj As Object)";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="TJO = Obj";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .setObject((java.lang.Object)(_obj));
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Private TJO As JavaObject";
_tjo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="End Sub";
return "";
}
public Object  _getacceptedtransfermode(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getacceptedtransfermode", true))
	 {return ((Object) Debug.delegate(ba, "getacceptedtransfermode", null));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub GetAcceptedTransferMode As Object";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Return TJO.RunMethod(\"getAcceptedTransferMode\",N";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getAcceptedTransferMode",(Object[])(__c.Null));
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return null;
}
public Object  _getacceptingobject(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getacceptingobject", true))
	 {return ((Object) Debug.delegate(ba, "getacceptingobject", null));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub GetAcceptingObject As Object";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Return TJO.RunMethod(\"getAcceptingObject\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getAcceptingObject",(Object[])(__c.Null));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="End Sub";
return null;
}
public String[]  _getdataids(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getdataids", true))
	 {return ((String[]) Debug.delegate(ba, "getdataids", null));}
anywheresoftware.b4j.object.JavaObject _reflectarray = null;
anywheresoftware.b4j.object.JavaObject _dataformat = null;
String[] _strings = null;
int _i = 0;
String[] _s = null;
String[] _strings2 = null;
String _str = "";
int _j = 0;
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub GetDataIds As String()";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Dim ReflectArray As JavaObject";
_reflectarray = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="ReflectArray.InitializeStatic(\"java.lang.reflect.";
_reflectarray.InitializeStatic("java.lang.reflect.Array");
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="DataFormat.InitializeArray(\"javafx.scene.input.Da";
_dataformat.InitializeArray("javafx.scene.input.DataFormat",(Object[])(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getDragboard",(Object[])(__c.Null)).RunMethodJO("getContentTypes",(Object[])(__c.Null)).RunMethod("toArray",(Object[])(__c.Null))));
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="Dim Strings(ReflectArray.RunMethod(\"getLength\",Ar";
_strings = new String[(int)(BA.ObjectToNumber(_reflectarray.RunMethod("getLength",new Object[]{(Object)(_dataformat.getObject())})))];
java.util.Arrays.fill(_strings,"");
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="For i = 0  To Strings.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_strings.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="Dim S(1) As String";
_s = new String[(int) (1)];
java.util.Arrays.fill(_s,"");
RDebugUtils.currentLine=9437192;
 //BA.debugLineNum = 9437192;BA.debugLine="Dim Strings2() As String = ReflectArray.RunMetho";
_strings2 = (String[])(_reflectarray.RunMethodJO("get",new Object[]{(Object)(_dataformat.getObject()),(Object)(_i)}).RunMethodJO("getIdentifiers",(Object[])(__c.Null)).RunMethod("toArray",new Object[]{(Object)(_s)}));
RDebugUtils.currentLine=9437193;
 //BA.debugLineNum = 9437193;BA.debugLine="Dim Str As String";
_str = "";
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="For j = 0 To Strings2.Length - 1";
{
final int step10 = 1;
final int limit10 = (int) (_strings2.length-1);
_j = (int) (0) ;
for (;_j <= limit10 ;_j = _j + step10 ) {
RDebugUtils.currentLine=9437195;
 //BA.debugLineNum = 9437195;BA.debugLine="Str = Str & Strings2(j) & \",\"";
_str = _str+_strings2[_j]+",";
 }
};
RDebugUtils.currentLine=9437197;
 //BA.debugLineNum = 9437197;BA.debugLine="Str = Str.SubString2(0,Str.Length - 1)";
_str = _str.substring((int) (0),(int) (_str.length()-1));
RDebugUtils.currentLine=9437198;
 //BA.debugLineNum = 9437198;BA.debugLine="Strings(i) = Str";
_strings[_i] = _str;
 }
};
RDebugUtils.currentLine=9437200;
 //BA.debugLineNum = 9437200;BA.debugLine="Return Strings";
if (true) return _strings;
RDebugUtils.currentLine=9437201;
 //BA.debugLineNum = 9437201;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getdataidslist(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getdataidslist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getdataidslist", null));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub GetDataIDsList As List";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Return GetDataIds";
if (true) return anywheresoftware.b4a.keywords.Common.ArrayToList(__ref._getdataids /*String[]*/ (null));
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="End Sub";
return null;
}
public Object  _getdataobjectforid(b4j.example.dragevent __ref,String _dataid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getdataobjectforid", true))
	 {return ((Object) Debug.delegate(ba, "getdataobjectforid", new Object[] {_dataid}));}
anywheresoftware.b4j.object.JavaObject _dataformat = null;
anywheresoftware.b4j.object.JavaObject _ldf = null;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub GetDataObjectForId(DataId As String) As";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input.D";
_dataformat.InitializeStatic("javafx.scene.input.DataFormat");
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"loo";
_ldf = new anywheresoftware.b4j.object.JavaObject();
_ldf.setObject((java.lang.Object)(_dataformat.RunMethod("lookupMimeType",new Object[]{(Object)(_dataid)})));
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="If LDF.IsInitialized = False Then LDF.InitializeN";
if (_ldf.IsInitialized()==__c.False) { 
_ldf.InitializeNewInstance("javafx.scene.input.DataFormat",new Object[]{(Object)(new String[]{_dataid})});};
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="Return TJO.RunMethodJO(\"getDragboard\",Null).RunMe";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getDragboard",(Object[])(__c.Null)).RunMethod("getContent",new Object[]{(Object)(_ldf.getObject())});
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="End Sub";
return null;
}
public Object  _geteventsource(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "geteventsource", true))
	 {return ((Object) Debug.delegate(ba, "geteventsource", null));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub GetEventSource As Object";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Return TJO.RunMethod(\"getSource\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSource",(Object[])(__c.Null));
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return null;
}
public Object  _geteventtarget(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "geteventtarget", true))
	 {return ((Object) Debug.delegate(ba, "geteventtarget", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub GetEventTarget As Object";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Return TJO.RunMethod(\"getTarget\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getTarget",(Object[])(__c.Null));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _geteventtype(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "geteventtype", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "geteventtype", null));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub GetEventType As JavaObject";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Return TJO.RunMethod(\"getEventType\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getEventType",(Object[])(__c.Null))));
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="End Sub";
return null;
}
public Object  _getgesturesource(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getgesturesource", true))
	 {return ((Object) Debug.delegate(ba, "getgesturesource", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub GetGestureSource As Object";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Return TJO.RunMethod(\"getGestureSource\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getGestureSource",(Object[])(__c.Null));
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="End Sub";
return null;
}
public Object  _getgesturetarget(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getgesturetarget", true))
	 {return ((Object) Debug.delegate(ba, "getgesturetarget", null));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub GetGestureTarget As Object";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Return TJO.RunMethod(\"getGestureTarget\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getGestureTarget",(Object[])(__c.Null));
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return null;
}
public Object  _getobject(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getobject", true))
	 {return ((Object) Debug.delegate(ba, "getobject", null));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub GetObject As Object";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Return TJO";
if (true) return (Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .getObject());
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getobjectjo(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getobjectjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getobjectjo", null));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub GetObjectJO As JavaObject";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Return TJO";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ ;
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getpickresult(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getpickresult", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getpickresult", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub GetPickResult As JavaObject";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Return TJO.RunMethod(\"getPickResult\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getPickResult",(Object[])(__c.Null))));
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return null;
}
public double  _getscenex(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getscenex", true))
	 {return ((Double) Debug.delegate(ba, "getscenex", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub GetSceneX As Double";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Return TJO.RunMethod(\"getSceneX\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSceneX",(Object[])(__c.Null))));
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return 0;
}
public double  _getsceney(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getsceney", true))
	 {return ((Double) Debug.delegate(ba, "getsceney", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub GetSceneY As Double";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Return TJO.RunMethod(\"getSceneY\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSceneY",(Object[])(__c.Null))));
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="End Sub";
return 0;
}
public double  _getscreenx(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getscreenx", true))
	 {return ((Double) Debug.delegate(ba, "getscreenx", null));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub GetScreenX As Double";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Return TJO.RunMethod(\"getScreenX\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getScreenX",(Object[])(__c.Null))));
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
return 0;
}
public double  _getscreeny(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getscreeny", true))
	 {return ((Double) Debug.delegate(ba, "getscreeny", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub GetScreenY As Double";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Return TJO.RunMethod(\"getScreenY\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getScreenY",(Object[])(__c.Null))));
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "gettag", true))
	 {return ((Object) Debug.delegate(ba, "gettag", null));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub GetTag As Object";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Return TJO.RunMethod(\"getUserData\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getUserData",(Object[])(__c.Null));
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _gettransfermode(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "gettransfermode", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "gettransfermode", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub GetTransferMode As JavaObject";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Return TJO.RunMethod(\"getTransferMode\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getTransferMode",(Object[])(__c.Null))));
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return null;
}
public double  _getx(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getx", true))
	 {return ((Double) Debug.delegate(ba, "getx", null));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub getX As Double";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Return TJO.RunMethod(\"getX\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getX",(Object[])(__c.Null))));
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="End Sub";
return 0;
}
public double  _gety(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "gety", true))
	 {return ((Double) Debug.delegate(ba, "gety", null));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub getY As Double";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Return TJO.RunMethod(\"getY\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getY",(Object[])(__c.Null))));
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="End Sub";
return 0;
}
public double  _getz(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getz", true))
	 {return ((Double) Debug.delegate(ba, "getz", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub getZ As Double";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Return TJO.RunMethod(\"getZ\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getZ",(Object[])(__c.Null))));
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return 0;
}
public boolean  _isaccepted(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "isaccepted", true))
	 {return ((Boolean) Debug.delegate(ba, "isaccepted", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub IsAccepted As Boolean";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Return TJO.RunMethod(\"isAccepted\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("isAccepted",(Object[])(__c.Null)));
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="End Sub";
return false;
}
public boolean  _isdropcompleted(b4j.example.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "isdropcompleted", true))
	 {return ((Boolean) Debug.delegate(ba, "isdropcompleted", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub IsDropCompleted As Boolean";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Return TJO.RunMethod(\"isDropCompleted\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("isDropCompleted",(Object[])(__c.Null)));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="End Sub";
return false;
}
public String  _settag(b4j.example.dragevent __ref,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "settag", true))
	 {return ((String) Debug.delegate(ba, "settag", new Object[] {_tag}));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub SetTag(Tag As Object)";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="TJO.RunMethod(\"setUserData\",Array(Tag))";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setUserData",new Object[]{_tag});
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="End Sub";
return "";
}
}