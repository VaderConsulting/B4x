package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class draganddrop extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.draganddrop", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.draganddrop.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.JFX _fx = null;
public Object _mode = null;
public String[] _dataid = null;
public Object[] _dataobject = null;
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _dragboardimg = null;
public double _dragboardimgoffsetx = 0;
public double _dragboardimgoffsety = 0;
public boolean _startdrag = false;
public Object _callback = null;
public String _seventname = "";
public String _teventname = "";
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.transfermode _transfermode = null;
public String  _initialize(b4j.example.draganddrop __ref,anywheresoftware.b4a.BA _ba,Object _vcallback) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub Initialize(vCallBack As Object)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="CallBack = vCallBack";
__ref._callback /*Object*/  = _vcallback;
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="TransferMode.Initialize";
_transfermode._initialize /*String*/ ();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="End Sub";
return "";
}
public String  _makedragtarget(b4j.example.draganddrop __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _pnode,String _veventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "makedragtarget", true))
	 {return ((String) Debug.delegate(ba, "makedragtarget", new Object[] {_pnode,_veventname}));}
Object _event = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub MakeDragTarget(pNode As Node, vEventNam";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="tEventName = vEventName";
__ref._teventname /*String*/  = _veventname;
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragOver\") T";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragOver")) { 
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragOver",__c.Null);
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragOver\",Array(Even";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragOver",new Object[]{_event});
 };
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragEntered\"";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragEntered")) { 
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragEntered",__c.Null);
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragEntered\",Array(E";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragEntered",new Object[]{_event});
 };
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragExited\")";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragExited")) { 
RDebugUtils.currentLine=5767179;
 //BA.debugLineNum = 5767179;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragExited",__c.Null);
RDebugUtils.currentLine=5767180;
 //BA.debugLineNum = 5767180;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragExited\",Array(Ev";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragExited",new Object[]{_event});
 };
RDebugUtils.currentLine=5767182;
 //BA.debugLineNum = 5767182;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragDropped\"";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragDropped")) { 
RDebugUtils.currentLine=5767183;
 //BA.debugLineNum = 5767183;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragDropped",__c.Null);
RDebugUtils.currentLine=5767184;
 //BA.debugLineNum = 5767184;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragDropped\",Array(E";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragDropped",new Object[]{_event});
 };
RDebugUtils.currentLine=5767186;
 //BA.debugLineNum = 5767186;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.example.draganddrop __ref,anywheresoftware.b4j.object.JavaObject _jo) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "asjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_jo}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub AsJO(JO As JavaObject) As JavaObject";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Return JO";
if (true) return _jo;
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper  _asmouseevent(b4j.example.draganddrop __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "asmouseevent", true))
	 {return ((anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper) Debug.delegate(ba, "asmouseevent", new Object[] {_m}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub AsMouseEvent(M As MouseEvent) As Mouse";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Return M";
if (true) return _m;
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.draganddrop __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Private Mode As Object";
_mode = new Object();
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Private DataID() As String";
_dataid = new String[(int) (0)];
java.util.Arrays.fill(_dataid,"");
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="Private DataObject() As Object";
_dataobject = new Object[(int) (0)];
{
int d0 = _dataobject.length;
for (int i0 = 0;i0 < d0;i0++) {
_dataobject[i0] = new Object();
}
}
;
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="Private DragboardImg As Image";
_dragboardimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Private DragboardImgOffsetX,DragboardImgOffsetY A";
_dragboardimgoffsetx = 0;
_dragboardimgoffsety = 0;
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="Private StartDrag As Boolean";
_startdrag = false;
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="Private CallBack As Object";
_callback = new Object();
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="Private sEventName,tEventName As String";
_seventname = "";
_teventname = "";
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="End Sub";
return "";
}
public Object  _dragdetected_event(b4j.example.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragdetected_event", true))
	 {return ((Object) Debug.delegate(ba, "dragdetected_event", new Object[] {_methodname,_args}));}
anywheresoftware.b4j.object.JavaObject _dataformat = null;
b4j.example.dragboard _db = null;
int _i = 0;
anywheresoftware.b4j.object.JavaObject _ldf = null;
anywheresoftware.b4j.object.JavaObject _clipboardcontent = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub DragDetected_Event(MethodName As Stri";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="CallSub2(CallBack,sEventName & \"_DragDetected\",A";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._seventname /*String*/ +"_DragDetected",(Object)(__ref._asmouseevent /*anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper*/ (null,(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper(), (javafx.scene.input.MouseEvent)(_args[(int) (0)])))));
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="If StartDrag Then";
if (__ref._startdrag /*boolean*/ ) { 
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input";
_dataformat.InitializeStatic("javafx.scene.input.DataFormat");
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="Dim DB As Dragboard";
_db = new b4j.example.dragboard();
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="DB.Initialize";
_db._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="DB.SetObject(AsJO(Args(0)).RunMethodJO(\"getSour";
_db._setobject /*String*/ (null,__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_args[(int) (0)]))).RunMethodJO("getSource",(Object[])(__c.Null)).RunMethod("startDragAndDrop",new Object[]{__ref._mode /*Object*/ }));
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="For i = 0 To DataID.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._dataid /*String[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"";
_ldf = new anywheresoftware.b4j.object.JavaObject();
_ldf.setObject((java.lang.Object)(_dataformat.RunMethod("lookupMimeType",new Object[]{(Object)(__ref._dataid /*String[]*/ [_i])})));
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="If LDF.IsInitialized = False Then LDF.Initiali";
if (_ldf.IsInitialized()==__c.False) { 
_ldf.InitializeNewInstance("javafx.scene.input.DataFormat",new Object[]{(Object)(new String[]{__ref._dataid /*String[]*/ [_i]})});};
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="If DragboardImg.IsInitialized Then DB.SetDragV";
if (__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .IsInitialized()) { 
_db._setdragview /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null,__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ ,__ref._dragboardimgoffsetx /*double*/ ,__ref._dragboardimgoffsety /*double*/ );};
RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="Dim ClipboardContent As JavaObject";
_clipboardcontent = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="ClipboardContent.InitializeNewInstance(\"javafx";
_clipboardcontent.InitializeNewInstance("javafx.scene.input.ClipboardContent",(Object[])(__c.Null));
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="If DataObject(i) Is Image Then";
if (__ref._dataobject /*Object[]*/ [_i] instanceof javafx.scene.image.Image) { 
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="ClipboardContent.RunMethod(\"putImage\",Array(D";
_clipboardcontent.RunMethod("putImage",new Object[]{__ref._dataobject /*Object[]*/ [_i]});
 }else {
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="ClipboardContent.RunMethod(\"put\",Array(LDF,Da";
_clipboardcontent.RunMethod("put",new Object[]{(Object)(_ldf.getObject()),__ref._dataobject /*Object[]*/ [_i]});
 };
RDebugUtils.currentLine=5439509;
 //BA.debugLineNum = 5439509;BA.debugLine="DB.setContent(ClipboardContent)";
_db._setcontent /*String*/ (null,(Object)(_clipboardcontent.getObject()));
 }
};
 };
RDebugUtils.currentLine=5439513;
 //BA.debugLineNum = 5439513;BA.debugLine="End Sub";
return null;
}
public Object  _dragdone_event(b4j.example.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragdone_event", true))
	 {return ((Object) Debug.delegate(ba, "dragdone_event", new Object[] {_methodname,_args}));}
b4j.example.dragevent _de = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub DragDone_Event(MethodName As String,A";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.example.dragevent();
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="CallSub2(CallBack,sEventName & \"_DragDone\",DE)";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._seventname /*String*/ +"_DragDone",(Object)(_de));
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="End Sub";
return null;
}
public Object  _dragdropped_event(b4j.example.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragdropped_event", true))
	 {return ((Object) Debug.delegate(ba, "dragdropped_event", new Object[] {_methodname,_args}));}
b4j.example.dragevent _de = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub DragDropped_Event(MethodName As Strin";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.example.dragevent();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragDropped\",DE";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragDropped",(Object)(_de));
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="End Sub";
return null;
}
public Object  _dragentered_event(b4j.example.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragentered_event", true))
	 {return ((Object) Debug.delegate(ba, "dragentered_event", new Object[] {_methodname,_args}));}
b4j.example.dragevent _de = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub DragEntered_Event(MethodName As Strin";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.example.dragevent();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragEntered\",DE";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragEntered",(Object)(_de));
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="End Sub";
return null;
}
public Object  _dragexited_event(b4j.example.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragexited_event", true))
	 {return ((Object) Debug.delegate(ba, "dragexited_event", new Object[] {_methodname,_args}));}
b4j.example.dragevent _de = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub DragExited_Event(MethodName As String";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.example.dragevent();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragExited\",DE)";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragExited",(Object)(_de));
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="End Sub";
return null;
}
public Object  _dragover_event(b4j.example.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragover_event", true))
	 {return ((Object) Debug.delegate(ba, "dragover_event", new Object[] {_methodname,_args}));}
b4j.example.dragevent _de = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub DragOver_Event(MethodName As String,A";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.example.dragevent();
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragOver\",DE)";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragOver",(Object)(_de));
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="End Sub";
return null;
}
public String  _makedragsource(b4j.example.draganddrop __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _pnode,String _veventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "makedragsource", true))
	 {return ((String) Debug.delegate(ba, "makedragsource", new Object[] {_pnode,_veventname}));}
Object _event = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub MakeDragSource(pNode As Node, vEventNam";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="sEventName = vEventName";
__ref._seventname /*String*/  = _veventname;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="If SubExists(CallBack,sEventName & \"_DragDetected";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._seventname /*String*/ +"_DragDetected")) { 
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragDetected",__c.Null);
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragDetected\",Array(";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragDetected",new Object[]{_event});
 };
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="If SubExists(CallBack,sEventName & \"_DragDone\") T";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._seventname /*String*/ +"_DragDone")) { 
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragDone",__c.Null);
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragDone\",Array(Even";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragDone",new Object[]{_event});
 };
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="End Sub";
return "";
}
public String  _setdragmodeanddata(b4j.example.draganddrop __ref,Object _tmode,String[] _dataids,Object[] _dataobjects) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "setdragmodeanddata", true))
	 {return ((String) Debug.delegate(ba, "setdragmodeanddata", new Object[] {_tmode,_dataids,_dataobjects}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub SetDragModeAndData(tMode As Object,Data";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Mode = tMode";
__ref._mode /*Object*/  = _tmode;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="DataID = DataIDs";
__ref._dataid /*String[]*/  = _dataids;
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="DataObject = DataObjects";
__ref._dataobject /*Object[]*/  = _dataobjects;
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="StartDrag = True";
__ref._startdrag /*boolean*/  = __c.True;
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="DragboardImg = Null";
__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .setObject((javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="DragboardImgOffsetX = 0";
__ref._dragboardimgoffsetx /*double*/  = 0;
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="DragboardImgOffsetY = 0";
__ref._dragboardimgoffsety /*double*/  = 0;
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="End Sub";
return "";
}
public String  _setdragmodeanddata2(b4j.example.draganddrop __ref,Object _tmode,String[] _dataids,Object[] _dataobjects,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _dragboardimage) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "setdragmodeanddata2", true))
	 {return ((String) Debug.delegate(ba, "setdragmodeanddata2", new Object[] {_tmode,_dataids,_dataobjects,_dragboardimage}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub SetDragModeAndData2(tMode As Object,Dat";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Mode = tMode";
__ref._mode /*Object*/  = _tmode;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="DataID = DataIDs";
__ref._dataid /*String[]*/  = _dataids;
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="DataObject = DataObjects";
__ref._dataobject /*Object[]*/  = _dataobjects;
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="StartDrag = True";
__ref._startdrag /*boolean*/  = __c.True;
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="DragboardImg = DragboardImage";
__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/  = _dragboardimage;
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="DragboardImgOffsetX = 0";
__ref._dragboardimgoffsetx /*double*/  = 0;
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="DragboardImgOffsetY = 0";
__ref._dragboardimgoffsety /*double*/  = 0;
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="End Sub";
return "";
}
public String  _setdragmodeanddata3(b4j.example.draganddrop __ref,Object _tmode,String[] _dataids,Object[] _dataobjects,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _dragboardimage,double _imageoffsetx,double _imageoffsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "setdragmodeanddata3", true))
	 {return ((String) Debug.delegate(ba, "setdragmodeanddata3", new Object[] {_tmode,_dataids,_dataobjects,_dragboardimage,_imageoffsetx,_imageoffsety}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub SetDragModeAndData3(tMode As Object,Dat";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Mode = tMode";
__ref._mode /*Object*/  = _tmode;
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="DataID = DataIDs";
__ref._dataid /*String[]*/  = _dataids;
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="DataObject = DataObjects";
__ref._dataobject /*Object[]*/  = _dataobjects;
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="StartDrag = True";
__ref._startdrag /*boolean*/  = __c.True;
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="DragboardImg = DragboardImage";
__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/  = _dragboardimage;
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="DragboardImgOffsetX = ImageOffsetX";
__ref._dragboardimgoffsetx /*double*/  = _imageoffsetx;
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="DragboardImgOffsetY = ImageOffsetY";
__ref._dragboardimgoffsety /*double*/  = _imageoffsety;
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="End Sub";
return "";
}
}