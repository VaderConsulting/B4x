package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xmlgenerator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xmlgenerator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.xmlgenerator.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _parameter{
public boolean IsInitialized;
public String Name;
public String VarType;
public void Initialize() {
IsInitialized = true;
Name = "";
VarType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _member{
public boolean IsInitialized;
public String MemberType;
public String Name;
public String Comment;
public String ReturnType;
public anywheresoftware.b4a.objects.collections.List Parameters;
public void Initialize() {
IsInitialized = true;
MemberType = "";
Name = "";
Comment = "";
ReturnType = "";
Parameters = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _class{
public boolean IsInitialized;
public String Name;
public String ShortName;
public String Comment;
public b4j.example.b4xset Events;
public anywheresoftware.b4a.objects.collections.Map Members;
public void Initialize() {
IsInitialized = true;
Name = "";
ShortName = "";
Comment = "";
Events = new b4j.example.b4xset();
Members = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _tempfolder = "";
public String _currentcomment = "";
public b4j.example.main _main = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.transfermode _transfermode = null;
public String  _initialize(b4j.example.xmlgenerator __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="File.MakeDir(File.DirApp, \"temp\")";
__c.File.MakeDir(__c.File.getDirApp(),"temp");
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="TempFolder = File.Combine(File.DirApp, \"temp\")";
__ref._tempfolder /*String*/  = __c.File.Combine(__c.File.getDirApp(),"temp");
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return "";
}
public String  _parselib(b4j.example.xmlgenerator __ref,String _b4xlib) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "parselib", false))
	 {return ((String) Debug.delegate(ba, "parselib", new Object[] {_b4xlib}));}
anywheresoftware.b4a.objects.collections.List _files = null;
String[] _manifest = null;
anywheresoftware.b4a.objects.collections.List _classes = null;
String _f = "";
anywheresoftware.b4a.objects.collections.Map _manifestmap = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub ParseLib (b4xlib As String) As String";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="PrepareFiles(b4xlib)";
__ref._preparefiles /*String*/ (null,_b4xlib);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Dim manifest(1) As String";
_manifest = new String[(int) (1)];
java.util.Arrays.fill(_manifest,"");
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="FindBasFiles(TempFolder, files, manifest)";
__ref._findbasfiles /*String*/ (null,__ref._tempfolder /*String*/ ,_files,_manifest);
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Dim classes As List";
_classes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="classes.Initialize";
_classes.Initialize();
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="For Each f As String In files";
{
final anywheresoftware.b4a.BA.IterableList group8 = _files;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_f = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="classes.Add(ParseModule(f))";
_classes.Add((Object)(__ref._parsemodule /*b4j.example.xmlgenerator._class*/ (null,_f)));
 }
};
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="Dim ManifestMap As Map = CreateMap()";
_manifestmap = new anywheresoftware.b4a.objects.collections.Map();
_manifestmap = __c.createMap(new Object[] {});
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="If manifest(0) <> \"\" Then";
if ((_manifest[(int) (0)]).equals("") == false) { 
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="ManifestMap = ParseManifest(manifest(0))";
_manifestmap = __ref._parsemanifest /*anywheresoftware.b4a.objects.collections.Map*/ (null,_manifest[(int) (0)]);
 };
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="Return GenerateXML(classes, ManifestMap)";
if (true) return __ref._generatexml /*String*/ (null,_classes,_manifestmap);
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _addmembers(b4j.example.xmlgenerator __ref,anywheresoftware.b4a.objects.collections.Map _members,String _membertype) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "addmembers", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "addmembers", new Object[] {_members,_membertype}));}
anywheresoftware.b4a.objects.collections.List _res = null;
b4j.example.xmlgenerator._member _member = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _parameters = null;
b4j.example.xmlgenerator._parameter _param = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub AddMembers (members As Map, MemberType";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="For Each Member As Member In members.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _members.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_member = (b4j.example.xmlgenerator._member)(group3.Get(index3));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="If Member.MemberType <> MemberType Then Continue";
if ((_member.MemberType /*String*/ ).equals(_membertype) == false) { 
if (true) continue;};
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Dim m As Map = CreateMap(\"name\": Member.Name, \"c";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("name"),(Object)(_member.Name /*String*/ ),(Object)("comment"),(Object)(_member.Comment /*String*/ ),(Object)("returntype"),(Object)(_member.ReturnType /*String*/ )});
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="If Member.Parameters.IsInitialized And Member.Pa";
if (_member.Parameters /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && _member.Parameters /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Dim parameters As List";
_parameters = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="parameters.Initialize";
_parameters.Initialize();
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="For Each param As Parameter In Member.Parameter";
{
final anywheresoftware.b4a.BA.IterableList group9 = _member.Parameters /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_param = (b4j.example.xmlgenerator._parameter)(group9.Get(index9));
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="parameters.Add(CreateMap(\"name\": param.Name, \"";
_parameters.Add((Object)(__c.createMap(new Object[] {(Object)("name"),(Object)(_param.Name /*String*/ ),(Object)("type"),(Object)(_param.VarType /*String*/ )}).getObject()));
 }
};
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="m.Put(\"parameter\", parameters)";
_m.Put((Object)("parameter"),(Object)(_parameters.getObject()));
 };
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="res.Add(m)";
_res.Add((Object)(_m.getObject()));
 }
};
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.xmlgenerator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Private TempFolder As String";
_tempfolder = "";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Type Parameter (Name As String, VarType As String";
;
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Type Member (MemberType As String, Name As String";
;
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Type Class (Name As String, ShortName As String,";
;
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Private CurrentComment As String";
_currentcomment = "";
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="End Sub";
return "";
}
public String  _deletefolder(b4j.example.xmlgenerator __ref,String _folder) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "deletefolder", false))
	 {return ((String) Debug.delegate(ba, "deletefolder", new Object[] {_folder}));}
String _f = "";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub DeleteFolder (folder As String)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="For Each f As String In File.ListFiles(folder)";
{
final anywheresoftware.b4a.BA.IterableList group1 = __c.File.ListFiles(_folder);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_f = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="If File.IsDirectory(folder, f) Then";
if (__c.File.IsDirectory(_folder,_f)) { 
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="DeleteFolder(File.Combine(folder, f))";
__ref._deletefolder /*String*/ (null,__c.File.Combine(_folder,_f));
 };
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="File.Delete(folder, f)";
__c.File.Delete(_folder,_f);
 }
};
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="End Sub";
return "";
}
public String  _findbasfiles(b4j.example.xmlgenerator __ref,String _folder,anywheresoftware.b4a.objects.collections.List _files,String[] _manifest) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "findbasfiles", false))
	 {return ((String) Debug.delegate(ba, "findbasfiles", new Object[] {_folder,_files,_manifest}));}
String _f = "";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub FindBasFiles (Folder As String, Files";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="For Each f As String In File.ListFiles(Folder)";
{
final anywheresoftware.b4a.BA.IterableList group1 = __c.File.ListFiles(_folder);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_f = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="If File.IsDirectory(Folder, f) Then";
if (__c.File.IsDirectory(_folder,_f)) { 
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="FindBasFiles(File.Combine(Folder, f), Files, Ma";
__ref._findbasfiles /*String*/ (null,__c.File.Combine(_folder,_f),_files,_manifest);
 };
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="If f.ToLowerCase.EndsWith(\".bas\") Then Files.Add";
if (_f.toLowerCase().endsWith(".bas")) { 
_files.Add((Object)(__c.File.Combine(_folder,_f)));};
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="If f.ToLowerCase = \"manifest.txt\" Then Manifest(";
if ((_f.toLowerCase()).equals("manifest.txt")) { 
_manifest[(int) (0)] = __c.File.Combine(_folder,_f);};
 }
};
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="End Sub";
return "";
}
public String  _generatexml(b4j.example.xmlgenerator __ref,anywheresoftware.b4a.objects.collections.List _classes,anywheresoftware.b4a.objects.collections.Map _manifestmap) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "generatexml", false))
	 {return ((String) Debug.delegate(ba, "generatexml", new Object[] {_classes,_manifestmap}));}
b4j.example.map2xml _m2x = null;
anywheresoftware.b4a.objects.collections.Map _libraryattributes = null;
anywheresoftware.b4a.objects.collections.List _classeselements = null;
b4j.example.xmlgenerator._class _cls = null;
anywheresoftware.b4a.objects.collections.Map _c = null;
String _t = "";
anywheresoftware.b4a.objects.collections.List _members = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub GenerateXML (Classes As List, Manifest";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim m2x As Map2Xml";
_m2x = new b4j.example.map2xml();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="m2x.Initialize";
_m2x._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Dim LibraryAttributes As Map = CreateMap()";
_libraryattributes = new anywheresoftware.b4a.objects.collections.Map();
_libraryattributes = __c.createMap(new Object[] {});
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="LibraryAttributes.Put(\"NOTE\", \"This XML file shou";
_libraryattributes.Put((Object)("NOTE"),(Object)("This XML file should only be used for documentation purposes."));
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="LibraryAttributes.Put(\"doclet-version-NOT-library";
_libraryattributes.Put((Object)("doclet-version-NOT-library-version"),(Object)("0"));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Dim ClassesElements As List";
_classeselements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="ClassesElements.Initialize";
_classeselements.Initialize();
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="For Each cls As Class In Classes";
{
final anywheresoftware.b4a.BA.IterableList group8 = _classes;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_cls = (b4j.example.xmlgenerator._class)(group8.Get(index8));
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Dim c As Map = CreateMap(\"name\": cls.Name, \"shor";
_c = new anywheresoftware.b4a.objects.collections.Map();
_c = __c.createMap(new Object[] {(Object)("name"),(Object)(_cls.Name /*String*/ ),(Object)("shortname"),(Object)(_cls.ShortName /*String*/ )});
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="If cls.Events.Size > 0 Then";
if (_cls.Events /*b4j.example.b4xset*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="c.Put(\"event\", cls.Events.AsList)";
_c.Put((Object)("event"),(Object)(_cls.Events /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()));
 };
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="PutIfNotEmpty(c, \"comment\", cls.Comment)";
__ref._putifnotempty /*String*/ (null,_c,"comment",_cls.Comment /*String*/ );
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="For Each t As String In Array(\"method\", \"field\",";
{
final Object[] group14 = new Object[]{(Object)("method"),(Object)("field"),(Object)("property")};
final int groupLen14 = group14.length
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_t = BA.ObjectToString(group14[index14]);
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="Dim members As List = AddMembers(cls.Members, t";
_members = new anywheresoftware.b4a.objects.collections.List();
_members = __ref._addmembers /*anywheresoftware.b4a.objects.collections.List*/ (null,_cls.Members /*anywheresoftware.b4a.objects.collections.Map*/ ,_t);
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="If members.Size > 0 Then c.Put(t, members)";
if (_members.getSize()>0) { 
_c.Put((Object)(_t),(Object)(_members.getObject()));};
 }
};
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="ClassesElements.Add(c)";
_classeselements.Add((Object)(_c.getObject()));
 }
};
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="LibraryAttributes.Put(\"class\", ClassesElements)";
_libraryattributes.Put((Object)("class"),(Object)(_classeselements.getObject()));
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="PutIfNotEmpty(LibraryAttributes, \"version\", Manif";
__ref._putifnotempty /*String*/ (null,_libraryattributes,"version",BA.ObjectToString(_manifestmap.GetDefault((Object)("version"),(Object)(""))));
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="PutIfNotEmpty(LibraryAttributes, \"author\", Manife";
__ref._putifnotempty /*String*/ (null,_libraryattributes,"author",BA.ObjectToString(_manifestmap.GetDefault((Object)("author"),(Object)(""))));
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="Return m2x.MapToXml(CreateMap(\"root\": LibraryAttr";
if (true) return _m2x._maptoxml /*String*/ (null,__c.createMap(new Object[] {(Object)("root"),(Object)(_libraryattributes.getObject())}));
RDebugUtils.currentLine=1114137;
 //BA.debugLineNum = 1114137;BA.debugLine="End Sub";
return "";
}
public String  _putifnotempty(b4j.example.xmlgenerator __ref,anywheresoftware.b4a.objects.collections.Map _m,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "putifnotempty", false))
	 {return ((String) Debug.delegate(ba, "putifnotempty", new Object[] {_m,_key,_value}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub PutIfNotEmpty(m As Map, key As String,";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="value = value.Trim";
_value = _value.trim();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If value <> \"\" Then m.Put(key, value)";
if ((_value).equals("") == false) { 
_m.Put((Object)(_key),(Object)(_value));};
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return "";
}
public String  _preparefiles(b4j.example.xmlgenerator __ref,String _b4xlib) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "preparefiles", false))
	 {return ((String) Debug.delegate(ba, "preparefiles", new Object[] {_b4xlib}));}
flm.b4a.archiver.ArchiverForB4A _a = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub PrepareFiles (b4xlib As String)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="DeleteFolder(TempFolder)";
__ref._deletefolder /*String*/ (null,__ref._tempfolder /*String*/ );
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim a As Archiver";
_a = new flm.b4a.archiver.ArchiverForB4A();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="a.UnZip(\"\", b4xlib, TempFolder, \"\")";
_a.UnZip(ba,"",_b4xlib,__ref._tempfolder /*String*/ ,"");
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="End Sub";
return "";
}
public b4j.example.xmlgenerator._class  _parsemodule(b4j.example.xmlgenerator __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "parsemodule", false))
	 {return ((b4j.example.xmlgenerator._class) Debug.delegate(ba, "parsemodule", new Object[] {_filename}));}
b4j.example.xmlgenerator._class _cls = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
String _line = "";
b4j.example.xmlgenerator._member _member = null;
b4j.example.xmlgenerator._member _field = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub ParseModule (FileName As String) As Cl";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Dim cls As Class";
_cls = new b4j.example.xmlgenerator._class();
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="cls.Initialize";
_cls.Initialize();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="cls.Members.Initialize";
_cls.Members /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="cls.Events.Initialize";
_cls.Events /*b4j.example.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim m As Matcher = Regex.Matcher2(\".*\\\\([^\\\\]+)\\.";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher2(".*\\\\([^\\\\]+)\\.bas",__c.Regex.CASE_INSENSITIVE,_filename);
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="m.Find";
_m.Find();
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="cls.Name = m.Group(1)";
_cls.Name /*String*/  = _m.Group((int) (1));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="cls.ShortName = cls.Name";
_cls.ShortName /*String*/  = _cls.Name /*String*/ ;
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="For Each line As String In File.ReadList(FileName";
{
final anywheresoftware.b4a.BA.IterableList group9 = __c.File.ReadList(_filename,"");
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_line = BA.ObjectToString(group9.Get(index9));
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="m = Regex.Matcher(\"^\\s*'(.*)\", line)";
_m = __c.Regex.Matcher("^\\s*'(.*)",_line);
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="CurrentComment = CurrentComment & CRLF & m.Grou";
__ref._currentcomment /*String*/  = __ref._currentcomment /*String*/ +__c.CRLF+_m.Group((int) (1)).trim();
 }else 
{RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Else If Regex.IsMatch2(\"^\\s*public\\s*sub\\s+.*\",";
if (__c.Regex.IsMatch2("^\\s*public\\s*sub\\s+.*",__c.Regex.CASE_INSENSITIVE,_line)) { 
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Dim member As Member = ParseSubLine(line)";
_member = __ref._parsesubline /*b4j.example.xmlgenerator._member*/ (null,_line);
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="If member <> Null And cls.Members.ContainsKey(m";
if (_member!= null && _cls.Members /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_member.Name /*String*/ .toLowerCase()))==__c.False) { 
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="cls.Members.Put(member.Name.ToLowerCase, membe";
_cls.Members /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_member.Name /*String*/ .toLowerCase()),(Object)(_member));
 };
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="CurrentComment = \"\"";
__ref._currentcomment /*String*/  = "";
 }else {
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="m = Regex.Matcher2(\"^\\s*#Event:\\s*(.*)$\", Regex";
_m = __c.Regex.Matcher2("^\\s*#Event:\\s*(.*)$",__c.Regex.CASE_INSENSITIVE,_line);
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="cls.Events.Add(m.Group(1))";
_cls.Events /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_m.Group((int) (1))));
 }else {
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="m = Regex.Matcher2(\"^\\s*public\\s+([\\w_]+)\\s+as";
_m = __c.Regex.Matcher2("^\\s*public\\s+([\\w_]+)\\s+as\\s+([\\w_]+)",__c.Regex.CASE_INSENSITIVE,_line);
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="Dim field As Member";
_field = new b4j.example.xmlgenerator._member();
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="field.Initialize";
_field.Initialize();
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="field.MemberType = \"field\"";
_field.MemberType /*String*/  = "field";
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="field.Name = m.Group(1)";
_field.Name /*String*/  = _m.Group((int) (1));
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="field.ReturnType = m.Group(2)";
_field.ReturnType /*String*/  = _m.Group((int) (2));
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="field.Comment = CurrentComment";
_field.Comment /*String*/  = __ref._currentcomment /*String*/ ;
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="cls.Members.Put(field.Name.ToLowerCase, field";
_cls.Members /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_field.Name /*String*/ .toLowerCase()),(Object)(_field));
 };
 };
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="CurrentComment = \"\"";
__ref._currentcomment /*String*/  = "";
 }}
;
 }
};
RDebugUtils.currentLine=983079;
 //BA.debugLineNum = 983079;BA.debugLine="Return cls";
if (true) return _cls;
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _parsemanifest(b4j.example.xmlgenerator __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "parsemanifest", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parsemanifest", new Object[] {_filename}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
String _line = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub ParseManifest (FileName As String) As";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim res As Map = CreateMap()";
_res = new anywheresoftware.b4a.objects.collections.Map();
_res = __c.createMap(new Object[] {});
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="For Each line As String In File.ReadList(FileName";
{
final anywheresoftware.b4a.BA.IterableList group2 = __c.File.ReadList(_filename,"");
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_line = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"^([^=]+)=(.*)$";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher("^([^=]+)=(.*)$",_line);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="res.Put(m.Group(1).ToLowerCase, m.Group(2).Trim";
_res.Put((Object)(_m.Group((int) (1)).toLowerCase()),(Object)(_m.Group((int) (2)).trim()));
 };
 }
};
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="End Sub";
return null;
}
public b4j.example.xmlgenerator._member  _parsesubline(b4j.example.xmlgenerator __ref,String _line) throws Exception{
__ref = this;
RDebugUtils.currentModule="xmlgenerator";
if (Debug.shouldDelegate(ba, "parsesubline", false))
	 {return ((b4j.example.xmlgenerator._member) Debug.delegate(ba, "parsesubline", new Object[] {_line}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
b4j.example.xmlgenerator._member _member = null;
int _i1 = 0;
int _i2 = 0;
b4j.example.xmlgenerator._parameter _p = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub ParseSubLine (Line As String) As Membe";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim m As Matcher = Regex.Matcher2(\"^\\s*public\\s*s";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher2("^\\s*public\\s*sub\\s+([^\\s(]+)",__c.Regex.CASE_INSENSITIVE,_line);
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If m.Find = False Then Return Null";
if (_m.Find()==__c.False) { 
if (true) return (b4j.example.xmlgenerator._member)(__c.Null);};
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Dim member As Member";
_member = new b4j.example.xmlgenerator._member();
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="member.Initialize";
_member.Initialize();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="member.MemberType = \"method\"";
_member.MemberType /*String*/  = "method";
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="member.Name = m.Group(1)";
_member.Name /*String*/  = _m.Group((int) (1));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="If member.Name.StartsWith(\"get\") Or member.Name.S";
if (_member.Name /*String*/ .startsWith("get") || _member.Name /*String*/ .startsWith("set")) { 
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="member.MemberType = \"property\"";
_member.MemberType /*String*/  = "property";
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="member.Name = member.Name.SubString(3)";
_member.Name /*String*/  = _member.Name /*String*/ .substring((int) (3));
 };
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="member.Parameters.Initialize";
_member.Parameters /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="member.Comment = CurrentComment.Trim";
_member.Comment /*String*/  = __ref._currentcomment /*String*/ .trim();
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="Dim i1 As Int = Line.IndexOf(\"(\")";
_i1 = _line.indexOf("(");
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="Dim i2 As Int = Line.LastIndexOf(\")\")";
_i2 = _line.lastIndexOf(")");
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="If i1 > -1 And i2 > -1 Then";
if (_i1>-1 && _i2>-1) { 
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="m = Regex.Matcher2(\"([\\w_]+)(?:\\(\\))?\\s+as\\s+([\\";
_m = __c.Regex.Matcher2("([\\w_]+)(?:\\(\\))?\\s+as\\s+([\\w_]+)",__c.Regex.CASE_INSENSITIVE,_line.substring((int) (_i1+1),_i2));
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="Do While m.Find";
while (_m.Find()) {
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="Dim p As Parameter";
_p = new b4j.example.xmlgenerator._parameter();
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="p.Name = m.Group(1)";
_p.Name /*String*/  = _m.Group((int) (1));
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="p.VarType = m.Group(2)";
_p.VarType /*String*/  = _m.Group((int) (2));
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="member.Parameters.Add(p)";
_member.Parameters /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p));
 }
;
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="m = Regex.Matcher2(\"as\\s+([\\w_]+(?:\\(\\))?)$\", Re";
_m = __c.Regex.Matcher2("as\\s+([\\w_]+(?:\\(\\))?)$",__c.Regex.CASE_INSENSITIVE,_line);
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="member.ReturnType = m.Group(1)";
_member.ReturnType /*String*/  = _m.Group((int) (1));
 };
 }else {
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="m = Regex.Matcher2(\"as\\s+([\\w_]+(?:\\(\\))?)$\", Re";
_m = __c.Regex.Matcher2("as\\s+([\\w_]+(?:\\(\\))?)$",__c.Regex.CASE_INSENSITIVE,_line);
RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="member.ReturnType = m.Group(1)";
_member.ReturnType /*String*/  = _m.Group((int) (1));
 };
 };
RDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="Return member";
if (true) return _member;
RDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="End Sub";
return null;
}
}