package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xml2map extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xml2map", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xml2map.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _xmlelement{
public boolean IsInitialized;
public String Name;
public anywheresoftware.b4a.objects.collections.List Children;
public String Text;
public anywheresoftware.b4a.objects.collections.Map Attributes;
public void Initialize() {
IsInitialized = true;
Name = "";
Children = new anywheresoftware.b4a.objects.collections.List();
Text = "";
Attributes = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.SaxParser _parser = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.transfermode _transfermode = null;
public String  _class_globals(b4j.example.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Private parser As SaxParser";
_parser = new anywheresoftware.b4a.objects.SaxParser();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Type XmlElement (Name As String, Children As List";
;
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Private elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="End Sub";
return "";
}
public b4j.example.xml2map._xmlelement  _createelement(b4j.example.xml2map __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "createelement", true))
	 {return ((b4j.example.xml2map._xmlelement) Debug.delegate(ba, "createelement", new Object[] {_name}));}
b4j.example.xml2map._xmlelement _xe = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub CreateElement (Name As String) As XmlE";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim xe As XmlElement";
_xe = new b4j.example.xml2map._xmlelement();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="xe.Initialize";
_xe.Initialize();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="xe.Children.Initialize";
_xe.Children /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="xe.Name = Name";
_xe.Name /*String*/  = _name;
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Return xe";
if (true) return _xe;
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="End Sub";
return null;
}
public Object  _elementtoobject(b4j.example.xml2map __ref,b4j.example.xml2map._xmlelement _element) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "elementtoobject", true))
	 {return ((Object) Debug.delegate(ba, "elementtoobject", new Object[] {_element}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.example.xml2map._xmlelement _child = null;
Object _childobject = null;
Object _currentitem = null;
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub ElementToObject (Element As XmlElement";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="If Element.Children.Size = 0 And Element.Attribut";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (Object)(_element.Text /*String*/ );};
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="If Element.Attributes.IsInitialized Then m.Put(\"A";
if (_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_m.Put((Object)("Attributes"),(Object)(_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="If Element.Children.Size = 0 Then m.Put(\"Text\", E";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
_m.Put((Object)("Text"),(Object)(_element.Text /*String*/ ));};
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="For Each child As XmlElement In Element.Children";
{
final anywheresoftware.b4a.BA.IterableList group6 = _element.Children /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_child = (b4j.example.xml2map._xmlelement)(group6.Get(index6));
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Dim childObject As Object = ElementToObject(chil";
_childobject = __ref._elementtoobject /*Object*/ (null,_child);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="If m.ContainsKey(child.Name) Then";
if (_m.ContainsKey((Object)(_child.Name /*String*/ ))) { 
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="Dim currentItem As Object = m.Get(child.Name)";
_currentitem = _m.Get((Object)(_child.Name /*String*/ ));
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="If currentItem Is List Then";
if (_currentitem instanceof java.util.List) { 
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="list = currentItem";
_list.setObject((java.util.List)(_currentitem));
 }else {
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="list.Initialize";
_list.Initialize();
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="list.Add(currentItem)";
_list.Add(_currentitem);
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="m.Put(child.Name, list)";
_m.Put((Object)(_child.Name /*String*/ ),(Object)(_list.getObject()));
 };
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="list.Add(childObject)";
_list.Add(_childobject);
 }else {
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="m.Put(child.Name, childObject)";
_m.Put((Object)(_child.Name /*String*/ ),_childobject);
 };
 }
};
RDebugUtils.currentLine=1966103;
 //BA.debugLineNum = 1966103;BA.debugLine="Return m";
if (true) return (Object)(_m.getObject());
RDebugUtils.currentLine=1966104;
 //BA.debugLineNum = 1966104;BA.debugLine="End Sub";
return null;
}
public b4j.example.xml2map._xmlelement  _getlastelement(b4j.example.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "getlastelement", true))
	 {return ((b4j.example.xml2map._xmlelement) Debug.delegate(ba, "getlastelement", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub GetLastElement As XmlElement";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Return elements.Get(elements.Size - 1)";
if (true) return (b4j.example.xml2map._xmlelement)(__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.xml2map __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="parser.Initialize";
__ref._parser /*anywheresoftware.b4a.objects.SaxParser*/ .Initialize(ba);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _parse(b4j.example.xml2map __ref,String _xml) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parse", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parse", new Object[] {_xml}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
byte[] _b = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub Parse(XML As String) As Map";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim b() As Byte = XML.GetBytes(\"UTF8\")";
_b = _xml.getBytes("UTF8");
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
_in.InitializeFromBytesArray(_b,(int) (0),_b.length);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Return Parse2(in)";
if (true) return __ref._parse2 /*anywheresoftware.b4a.objects.collections.Map*/ (null,_in);
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _parse2(b4j.example.xml2map __ref,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _input) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parse2", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parse2", new Object[] {_input}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Parse2(Input As InputStream) As Map";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="elements.Initialize";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="elements.Add(CreateElement(\"stub\"))";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createelement /*b4j.example.xml2map._xmlelement*/ (null,"stub")));
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="parser.Parse(Input, \"parser\")";
__ref._parser /*anywheresoftware.b4a.objects.SaxParser*/ .Parse((java.io.InputStream)(_input.getObject()),"parser");
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Dim m As Map = ElementToObject(elements.Get(0))";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._elementtoobject /*Object*/ (null,(b4j.example.xml2map._xmlelement)(__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))));
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="End Sub";
return null;
}
public String  _parser_endelement(b4j.example.xml2map __ref,String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parser_endelement", true))
	 {return ((String) Debug.delegate(ba, "parser_endelement", new Object[] {_uri,_name,_text}));}
b4j.example.xml2map._xmlelement _element = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub Parser_EndElement (Uri As String, Name";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim Element As XmlElement = GetLastElement";
_element = __ref._getlastelement /*b4j.example.xml2map._xmlelement*/ (null);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Element.Text = Text.ToString";
_element.Text /*String*/  = _text.ToString();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="elements.RemoveAt(elements.Size - 1)";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public String  _parser_startelement(b4j.example.xml2map __ref,String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parser_startelement", true))
	 {return ((String) Debug.delegate(ba, "parser_startelement", new Object[] {_uri,_name,_attributes}));}
b4j.example.xml2map._xmlelement _element = null;
anywheresoftware.b4a.objects.collections.Map _att = null;
int _i = 0;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub Parser_StartElement (Uri As String, Na";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim Element As XmlElement = CreateElement(Name)";
_element = __ref._createelement /*b4j.example.xml2map._xmlelement*/ (null,_name);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="If Attributes.IsInitialized And Attributes.Size >";
if (_attributes.IsInitialized() && _attributes.getSize()>0) { 
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Dim att As Map";
_att = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="att.Initialize";
_att.Initialize();
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="For i = 0 To Attributes.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_attributes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="att.Put(Attributes.GetName(i), Attributes.GetVa";
_att.Put((Object)(_attributes.GetName(_i)),(Object)(_attributes.GetValue(_i)));
 }
};
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="Element.Attributes = att";
_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/  = _att;
 };
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="GetLastElement.Children.Add(Element)";
__ref._getlastelement /*b4j.example.xml2map._xmlelement*/ (null).Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_element));
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="elements.Add(Element)";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_element));
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="End Sub";
return "";
}
}