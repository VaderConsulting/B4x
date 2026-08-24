package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class dragboard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.dragboard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.dragboard.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List  _getfiles(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getfiles", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getfiles", null));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub GetFiles As List";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Return TJO.RunMethod(\"getFiles\",Null)";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getFiles",(Object[])(__c.Null))));
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return null;
}
public boolean  _hasfiles(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasfiles", true))
	 {return ((Boolean) Debug.delegate(ba, "hasfiles", null));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub HasFiles As Boolean";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Return TJO.RunMethod(\"hasFiles\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasFiles",(Object[])(__c.Null)));
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.dragboard __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return "";
}
public String  _setobject(b4j.example.dragboard __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setobject", true))
	 {return ((String) Debug.delegate(ba, "setobject", new Object[] {_obj}));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub SetObject(Obj As Object)";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="TJO = Obj";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .setObject((java.lang.Object)(_obj));
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _setdragview(b4j.example.dragboard __ref,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img,double _xoffset,double _yoffset) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setdragview", true))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "setdragview", new Object[] {_img,_xoffset,_yoffset}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub SetDragView(Img As Image,XOffset As Dou";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Return TJO.RunMethod(\"setDragView\",Array(Img,XOf";
if (true) return (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDragView",new Object[]{(Object)(_img.getObject()),(Object)(_xoffset),(Object)(_yoffset)})));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return null;
}
public String  _setcontent(b4j.example.dragboard __ref,Object _content) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setcontent", true))
	 {return ((String) Debug.delegate(ba, "setcontent", new Object[] {_content}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub SetContent(Content As Object)";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="TJO.RunMethod(\"setContent\",Array(Content))";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setContent",new Object[]{_content});
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Private TJO As JavaObject";
_tjo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return "";
}
public Object  _getcontent(b4j.example.dragboard __ref,String _str) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((Object) Debug.delegate(ba, "getcontent", new Object[] {_str}));}
anywheresoftware.b4j.object.JavaObject _dataformat = null;
anywheresoftware.b4j.object.JavaObject _ldf = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub GetContent(Str As String) As Object";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input.D";
_dataformat.InitializeStatic("javafx.scene.input.DataFormat");
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"loo";
_ldf = new anywheresoftware.b4j.object.JavaObject();
_ldf.setObject((java.lang.Object)(_dataformat.RunMethod("lookupMimeType",new Object[]{(Object)(_str)})));
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="If LDF.IsInitialized = False Then LDF.InitializeN";
if (_ldf.IsInitialized()==__c.False) { 
_ldf.InitializeNewInstance("javafx.scene.input.DataFormat",new Object[]{(Object)(new String[]{_str})});};
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Return TJO.RunMethod(\"getContent\",Array As Object";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getContent",new Object[]{(Object)(_ldf.getObject())});
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _getdragview(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getdragview", true))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "getdragview", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub GetDragView As Image";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Return TJO.RunMethod(\"getDragView\",Null)";
if (true) return (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDragView",(Object[])(__c.Null))));
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="End Sub";
return null;
}
public double  _getdragviewoffsetx(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getdragviewoffsetx", true))
	 {return ((Double) Debug.delegate(ba, "getdragviewoffsetx", null));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub GetDragViewOffsetX As Double";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Return TJO.RunMethod(\"getDragViewOffsetX\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDragViewOffsetX",(Object[])(__c.Null))));
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return 0;
}
public double  _getdragviewoffsety(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getdragviewoffsety", true))
	 {return ((Double) Debug.delegate(ba, "getdragviewoffsety", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub GetDragViewOffsetY As Double";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Return TJO.RunMethod(\"getDragViewOffsetY\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDragViewOffsetY",(Object[])(__c.Null))));
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return 0;
}
public String  _gethtml(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "gethtml", true))
	 {return ((String) Debug.delegate(ba, "gethtml", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub GetHtml As String";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Return TJO.RunMethod(\"getHtml\",Null)";
if (true) return BA.ObjectToString(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getHtml",(Object[])(__c.Null)));
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _getimage(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getimage", true))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "getimage", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub GetImage As Image";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Return TJO.RunMethod(\"getImage\",Null)";
if (true) return (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getImage",(Object[])(__c.Null))));
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return null;
}
public Object  _getobject(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getobject", true))
	 {return ((Object) Debug.delegate(ba, "getobject", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub GetObject As Object";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Return TJO";
if (true) return (Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .getObject());
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getobjectjo(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getobjectjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getobjectjo", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub GetObjectJO As JavaObject";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Return TJO";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ ;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return null;
}
public String  _getrtf(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getrtf", true))
	 {return ((String) Debug.delegate(ba, "getrtf", null));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub GetRtf As String";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Return TJO.RunMethod(\"getRtf\",Null)";
if (true) return BA.ObjectToString(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getRtf",(Object[])(__c.Null)));
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return "";
}
public String  _getstring(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Return TJO.RunMethod(\"getString\",Null)";
if (true) return BA.ObjectToString(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getString",(Object[])(__c.Null)));
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public String  _geturl(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "geturl", true))
	 {return ((String) Debug.delegate(ba, "geturl", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub GetUrl As String";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Return TJO.RunMethod(\"getUrl\",Null)";
if (true) return BA.ObjectToString(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getUrl",(Object[])(__c.Null)));
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
public boolean  _hascontent(b4j.example.dragboard __ref,String _str) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hascontent", true))
	 {return ((Boolean) Debug.delegate(ba, "hascontent", new Object[] {_str}));}
anywheresoftware.b4j.object.JavaObject _dataformat = null;
anywheresoftware.b4j.object.JavaObject _ldf = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub HasContent(Str As String) As Boolean";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input.D";
_dataformat.InitializeStatic("javafx.scene.input.DataFormat");
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"loo";
_ldf = new anywheresoftware.b4j.object.JavaObject();
_ldf.setObject((java.lang.Object)(_dataformat.RunMethod("lookupMimeType",new Object[]{(Object)(_str)})));
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="If LDF.IsInitialized = False Then LDF.InitializeN";
if (_ldf.IsInitialized()==__c.False) { 
_ldf.InitializeNewInstance("javafx.scene.input.DataFormat",new Object[]{(Object)(new String[]{_str})});};
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Return TJO.RunMethod(\"hasContent\",Array As Obje";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasContent",new Object[]{(Object)(_ldf.getObject())}));
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="End Sub";
return false;
}
public boolean  _hashtml(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hashtml", true))
	 {return ((Boolean) Debug.delegate(ba, "hashtml", null));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub HasHtml As Boolean";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Return TJO.RunMethod(\"hasHtml\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasHtml",(Object[])(__c.Null)));
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="End Sub";
return false;
}
public boolean  _hasimage(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasimage", true))
	 {return ((Boolean) Debug.delegate(ba, "hasimage", null));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub HasImage As Boolean";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Return TJO.RunMethod(\"hasImage\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasImage",(Object[])(__c.Null)));
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return false;
}
public boolean  _hasrtf(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasrtf", true))
	 {return ((Boolean) Debug.delegate(ba, "hasrtf", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub HasRtf As Boolean";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Return TJO.RunMethod(\"hasRtf\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasRtf",(Object[])(__c.Null)));
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="End Sub";
return false;
}
public boolean  _hasstring(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasstring", true))
	 {return ((Boolean) Debug.delegate(ba, "hasstring", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub HasString As Boolean";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Return TJO.RunMethod(\"hasString\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasString",(Object[])(__c.Null)));
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return false;
}
public boolean  _hasurl(b4j.example.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasurl", true))
	 {return ((Boolean) Debug.delegate(ba, "hasurl", null));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub HasUrl As Boolean";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Return TJO.RunMethod(\"hasUrl\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasUrl",(Object[])(__c.Null)));
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return false;
}
public String  _setdragviewoffsetx(b4j.example.dragboard __ref,double _offsetx) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setdragviewoffsetx", true))
	 {return ((String) Debug.delegate(ba, "setdragviewoffsetx", new Object[] {_offsetx}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub SetDragViewOffsetX(OffsetX As Double)";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="TJO.RunMethod(\"setDragViewOffsetX\",Array As Obje";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDragViewOffsetX",new Object[]{(Object)(_offsetx)});
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public String  _setdragviewoffsety(b4j.example.dragboard __ref,double _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setdragviewoffsety", true))
	 {return ((String) Debug.delegate(ba, "setdragviewoffsety", new Object[] {_offsety}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub SetDragViewOffsetY(OffsetY As Double)";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="TJO.RunMethod(\"setDragViewOffsetY\",Array As Obje";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDragViewOffsetY",new Object[]{(Object)(_offsety)});
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return "";
}
}