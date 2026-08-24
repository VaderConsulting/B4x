package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class map2xml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.map2xml", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.map2xml.class).invoke(this, new Object[] {null});
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
public com.jamesmurty.utils.XMLBuilder _builder = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.transfermode _transfermode = null;
public String  _initialize(b4j.example.map2xml __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _maptoxml(b4j.example.map2xml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "maptoxml", true))
	 {return ((String) Debug.delegate(ba, "maptoxml", new Object[] {_m}));}
String _k = "";
anywheresoftware.b4a.objects.collections.Map _props = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub MapToXml (m As Map) As String";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="builder = builder.create(k)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .create(_k);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="HandleElement(\"\", m.Get(k))";
__ref._handleelement /*String*/ (null,"",_m.Get((Object)(_k)));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="builder = builder.up";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Dim props As Map";
_props = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="props.Initialize";
_props.Initialize();
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="props.Put(\"{http://xml.apache.org/xslt}indent-amo";
_props.Put((Object)("{http://xml.apache.org/xslt}indent-amount"),(Object)("4"));
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="props.Put(\"indent\", \"yes\")";
_props.Put((Object)("indent"),(Object)("yes"));
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="Return builder.asString2(props)";
if (true) return __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .asString2((java.util.Map)(_props.getObject()));
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.map2xml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Private builder As XMLBuilder";
_builder = new com.jamesmurty.utils.XMLBuilder();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _handleelement(b4j.example.map2xml __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handleelement", true))
	 {return ((String) Debug.delegate(ba, "handleelement", new Object[] {_key,_value}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub HandleElement (key As String, value As";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If value Is Map Then";
if (_value instanceof anywheresoftware.b4a.objects.collections.Map.MyMap) { 
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If key <> \"\" Then builder = builder.element(key)";
if ((_key).equals("") == false) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .element(_key);};
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="HandleMapElement(value)";
__ref._handlemapelement /*String*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_value)));
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="If key <> \"\" Then builder = builder.up";
if ((_key).equals("") == false) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();};
 }else 
{RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="Else if value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="HandleListElement (key, value)";
__ref._handlelistelement /*String*/ (null,_key,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
 }else {
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="builder = builder.element(key)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .element(_key);
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="builder = builder.text(value)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .text(BA.ObjectToString(_value));
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="builder = builder.up";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();
 }}
;
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="End Sub";
return "";
}
public String  _handlemapelement(b4j.example.map2xml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handlemapelement", true))
	 {return ((String) Debug.delegate(ba, "handlemapelement", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.Map _attributes = null;
String _attr = "";
String _k = "";
Object _value = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub HandleMapElement (m As Map)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim attributes As Map = m.Get(\"Attributes\")";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
_attributes.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_m.Get((Object)("Attributes"))));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="If attributes.IsInitialized Then";
if (_attributes.IsInitialized()) { 
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="For Each attr As String In attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _attributes.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_attr = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="builder.attribute(attr, attributes.Get(attr))";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .attribute(_attr,BA.ObjectToString(_attributes.Get((Object)(_attr))));
 }
};
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="If m.ContainsKey(\"Text\") Then builder.text(m.Get";
if (_m.ContainsKey((Object)("Text"))) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .text(BA.ObjectToString(_m.Get((Object)("Text"))));};
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="m.Remove(\"Attributes\")";
_m.Remove((Object)("Attributes"));
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="m.Remove(\"Text\")";
_m.Remove((Object)("Text"));
 };
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _m.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_k = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Dim value As Object = m.Get(k)";
_value = _m.Get((Object)(_k));
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="HandleElement(k, value)";
__ref._handleelement /*String*/ (null,_k,_value);
 }
};
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="End Sub";
return "";
}
public String  _handlelistelement(b4j.example.map2xml __ref,String _key,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handlelistelement", true))
	 {return ((String) Debug.delegate(ba, "handlelistelement", new Object[] {_key,_lst}));}
Object _value = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub HandleListElement (key As String, lst";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="For Each value As Object In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_value = group1.Get(index1);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="HandleElement(key, value)";
__ref._handleelement /*String*/ (null,_key,_value);
 }
};
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="End Sub";
return "";
}
}