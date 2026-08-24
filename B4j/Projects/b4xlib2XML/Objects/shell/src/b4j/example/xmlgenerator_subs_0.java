package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xmlgenerator_subs_0 {


public static RemoteObject  _addmembers(RemoteObject __ref,RemoteObject _members,RemoteObject _membertype) throws Exception{
try {
		Debug.PushSubsStack("AddMembers (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("addmembers")) { return __ref.runUserSub(false, "xmlgenerator","addmembers", __ref, _members, _membertype);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _member = RemoteObject.declareNull("b4j.example.xmlgenerator._member");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parameters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _param = RemoteObject.declareNull("b4j.example.xmlgenerator._parameter");
Debug.locals.put("members", _members);
Debug.locals.put("MemberType", _membertype);
 BA.debugLineNum = 178;BA.debugLine="Private Sub AddMembers (members As Map, MemberType";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Dim res As List";
Debug.ShouldStop(262144);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 180;BA.debugLine="res.Initialize";
Debug.ShouldStop(524288);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 181;BA.debugLine="For Each Member As Member In members.Values";
Debug.ShouldStop(1048576);
{
final RemoteObject group3 = _members.runMethod(false,"Values");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_member = (group3.runMethod(false,"Get",index3));Debug.locals.put("Member", _member);
Debug.locals.put("Member", _member);
 BA.debugLineNum = 182;BA.debugLine="If Member.MemberType <> MemberType Then Continue";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_member.getField(true,"MemberType" /*RemoteObject*/ ),_membertype)) { 
if (true) continue;};
 BA.debugLineNum = 183;BA.debugLine="Dim m As Map = CreateMap(\"name\": Member.Name, \"c";
Debug.ShouldStop(4194304);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = xmlgenerator.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),(_member.getField(true,"Name" /*RemoteObject*/ )),RemoteObject.createImmutable(("comment")),(_member.getField(true,"Comment" /*RemoteObject*/ )),RemoteObject.createImmutable(("returntype")),(_member.getField(true,"ReturnType" /*RemoteObject*/ ))}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 184;BA.debugLine="If Member.Parameters.IsInitialized And Member.Pa";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(".",_member.getField(false,"Parameters" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_member.getField(false,"Parameters" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 185;BA.debugLine="Dim parameters As List";
Debug.ShouldStop(16777216);
_parameters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("parameters", _parameters);
 BA.debugLineNum = 186;BA.debugLine="parameters.Initialize";
Debug.ShouldStop(33554432);
_parameters.runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="For Each param As Parameter In Member.Parameter";
Debug.ShouldStop(67108864);
{
final RemoteObject group9 = _member.getField(false,"Parameters" /*RemoteObject*/ );
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_param = (group9.runMethod(false,"Get",index9));Debug.locals.put("param", _param);
Debug.locals.put("param", _param);
 BA.debugLineNum = 188;BA.debugLine="parameters.Add(CreateMap(\"name\": param.Name, \"";
Debug.ShouldStop(134217728);
_parameters.runVoidMethod ("Add",(Object)((xmlgenerator.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),(_param.getField(true,"Name" /*RemoteObject*/ )),RemoteObject.createImmutable(("type")),(_param.getField(true,"VarType" /*RemoteObject*/ ))})).getObject())));
 }
}Debug.locals.put("param", _param);
;
 BA.debugLineNum = 190;BA.debugLine="m.Put(\"parameter\", parameters)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("parameter"))),(Object)((_parameters.getObject())));
 };
 BA.debugLineNum = 192;BA.debugLine="res.Add(m)";
Debug.ShouldStop(-2147483648);
_res.runVoidMethod ("Add",(Object)((_m.getObject())));
 }
}Debug.locals.put("Member", _member);
;
 BA.debugLineNum = 194;BA.debugLine="Return res";
Debug.ShouldStop(2);
if (true) return _res;
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private TempFolder As String";
xmlgenerator._tempfolder = RemoteObject.createImmutable("");__ref.setField("_tempfolder",xmlgenerator._tempfolder);
 //BA.debugLineNum = 4;BA.debugLine="Type Parameter (Name As String, VarType As String";
;
 //BA.debugLineNum = 5;BA.debugLine="Type Member (MemberType As String, Name As String";
;
 //BA.debugLineNum = 6;BA.debugLine="Type Class (Name As String, ShortName As String,";
;
 //BA.debugLineNum = 7;BA.debugLine="Private CurrentComment As String";
xmlgenerator._currentcomment = RemoteObject.createImmutable("");__ref.setField("_currentcomment",xmlgenerator._currentcomment);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _deletefolder(RemoteObject __ref,RemoteObject _folder) throws Exception{
try {
		Debug.PushSubsStack("DeleteFolder (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("deletefolder")) { return __ref.runUserSub(false, "xmlgenerator","deletefolder", __ref, _folder);}
RemoteObject _f = RemoteObject.createImmutable("");
Debug.locals.put("folder", _folder);
 BA.debugLineNum = 52;BA.debugLine="Private Sub DeleteFolder (folder As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="For Each f As String In File.ListFiles(folder)";
Debug.ShouldStop(1048576);
{
final RemoteObject group1 = xmlgenerator.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_folder));
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_f = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("f", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 54;BA.debugLine="If File.IsDirectory(folder, f) Then";
Debug.ShouldStop(2097152);
if (xmlgenerator.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_folder),(Object)(_f)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 55;BA.debugLine="DeleteFolder(File.Combine(folder, f))";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.xmlgenerator.class, "_deletefolder" /*RemoteObject*/ ,(Object)(xmlgenerator.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_folder),(Object)(_f))));
 };
 BA.debugLineNum = 57;BA.debugLine="File.Delete(folder, f)";
Debug.ShouldStop(16777216);
xmlgenerator.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_folder),(Object)(_f));
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findbasfiles(RemoteObject __ref,RemoteObject _folder,RemoteObject _files,RemoteObject _manifest) throws Exception{
try {
		Debug.PushSubsStack("FindBasFiles (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("findbasfiles")) { return __ref.runUserSub(false, "xmlgenerator","findbasfiles", __ref, _folder, _files, _manifest);}
RemoteObject _f = RemoteObject.createImmutable("");
Debug.locals.put("Folder", _folder);
Debug.locals.put("Files", _files);
Debug.locals.put("Manifest", _manifest);
 BA.debugLineNum = 41;BA.debugLine="Private Sub FindBasFiles (Folder As String, Files";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="For Each f As String In File.ListFiles(Folder)";
Debug.ShouldStop(512);
{
final RemoteObject group1 = xmlgenerator.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_folder));
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_f = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("f", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 43;BA.debugLine="If File.IsDirectory(Folder, f) Then";
Debug.ShouldStop(1024);
if (xmlgenerator.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_folder),(Object)(_f)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 44;BA.debugLine="FindBasFiles(File.Combine(Folder, f), Files, Ma";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.xmlgenerator.class, "_findbasfiles" /*RemoteObject*/ ,(Object)(xmlgenerator.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_folder),(Object)(_f))),(Object)(_files),(Object)(_manifest));
 };
 BA.debugLineNum = 46;BA.debugLine="If f.ToLowerCase.EndsWith(\".bas\") Then Files.Add";
Debug.ShouldStop(8192);
if (_f.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".bas"))).<Boolean>get().booleanValue()) { 
_files.runVoidMethod ("Add",(Object)((xmlgenerator.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_folder),(Object)(_f)))));};
 BA.debugLineNum = 47;BA.debugLine="If f.ToLowerCase = \"manifest.txt\" Then Manifest(";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_f.runMethod(true,"toLowerCase"),BA.ObjectToString("manifest.txt"))) { 
_manifest.setArrayElement (xmlgenerator.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_folder),(Object)(_f)),BA.numberCast(int.class, 0));};
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generatexml(RemoteObject __ref,RemoteObject _classes,RemoteObject _manifestmap) throws Exception{
try {
		Debug.PushSubsStack("GenerateXML (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("generatexml")) { return __ref.runUserSub(false, "xmlgenerator","generatexml", __ref, _classes, _manifestmap);}
RemoteObject _m2x = RemoteObject.declareNull("b4j.example.map2xml");
RemoteObject _libraryattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _classeselements = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cls = RemoteObject.declareNull("b4j.example.xmlgenerator._class");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _t = RemoteObject.createImmutable("");
RemoteObject _members = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Classes", _classes);
Debug.locals.put("ManifestMap", _manifestmap);
 BA.debugLineNum = 151;BA.debugLine="Private Sub GenerateXML (Classes As List, Manifest";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Dim m2x As Map2Xml";
Debug.ShouldStop(8388608);
_m2x = RemoteObject.createNew ("b4j.example.map2xml");Debug.locals.put("m2x", _m2x);
 BA.debugLineNum = 153;BA.debugLine="m2x.Initialize";
Debug.ShouldStop(16777216);
_m2x.runClassMethod (b4j.example.map2xml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 154;BA.debugLine="Dim LibraryAttributes As Map = CreateMap()";
Debug.ShouldStop(33554432);
_libraryattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_libraryattributes = xmlgenerator.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("LibraryAttributes", _libraryattributes);Debug.locals.put("LibraryAttributes", _libraryattributes);
 BA.debugLineNum = 155;BA.debugLine="LibraryAttributes.Put(\"NOTE\", \"This XML file shou";
Debug.ShouldStop(67108864);
_libraryattributes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NOTE"))),(Object)((RemoteObject.createImmutable("This XML file should only be used for documentation purposes."))));
 BA.debugLineNum = 156;BA.debugLine="LibraryAttributes.Put(\"doclet-version-NOT-library";
Debug.ShouldStop(134217728);
_libraryattributes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("doclet-version-NOT-library-version"))),(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 157;BA.debugLine="Dim ClassesElements As List";
Debug.ShouldStop(268435456);
_classeselements = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ClassesElements", _classeselements);
 BA.debugLineNum = 158;BA.debugLine="ClassesElements.Initialize";
Debug.ShouldStop(536870912);
_classeselements.runVoidMethod ("Initialize");
 BA.debugLineNum = 159;BA.debugLine="For Each cls As Class In Classes";
Debug.ShouldStop(1073741824);
{
final RemoteObject group8 = _classes;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_cls = (group8.runMethod(false,"Get",index8));Debug.locals.put("cls", _cls);
Debug.locals.put("cls", _cls);
 BA.debugLineNum = 160;BA.debugLine="Dim c As Map = CreateMap(\"name\": cls.Name, \"shor";
Debug.ShouldStop(-2147483648);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_c = xmlgenerator.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),(_cls.getField(true,"Name" /*RemoteObject*/ )),RemoteObject.createImmutable(("shortname")),(_cls.getField(true,"ShortName" /*RemoteObject*/ ))}));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 161;BA.debugLine="If cls.Events.Size > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_cls.getField(false,"Events" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 162;BA.debugLine="c.Put(\"event\", cls.Events.AsList)";
Debug.ShouldStop(2);
_c.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("event"))),(Object)((_cls.getField(false,"Events" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xset.class, "_aslist" /*RemoteObject*/ ).getObject())));
 };
 BA.debugLineNum = 164;BA.debugLine="PutIfNotEmpty(c, \"comment\", cls.Comment)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.xmlgenerator.class, "_putifnotempty" /*RemoteObject*/ ,(Object)(_c),(Object)(BA.ObjectToString("comment")),(Object)(_cls.getField(true,"Comment" /*RemoteObject*/ )));
 BA.debugLineNum = 165;BA.debugLine="For Each t As String In Array(\"method\", \"field\",";
Debug.ShouldStop(16);
{
final RemoteObject group14 = RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("method")),RemoteObject.createImmutable(("field")),(RemoteObject.createImmutable("property"))});
final int groupLen14 = group14.getField(true,"length").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_t = BA.ObjectToString(group14.getArrayElement(false,RemoteObject.createImmutable(index14)));Debug.locals.put("t", _t);
Debug.locals.put("t", _t);
 BA.debugLineNum = 166;BA.debugLine="Dim members As List = AddMembers(cls.Members, t";
Debug.ShouldStop(32);
_members = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_members = __ref.runClassMethod (b4j.example.xmlgenerator.class, "_addmembers" /*RemoteObject*/ ,(Object)(_cls.getField(false,"Members" /*RemoteObject*/ )),(Object)(_t));Debug.locals.put("members", _members);Debug.locals.put("members", _members);
 BA.debugLineNum = 167;BA.debugLine="If members.Size > 0 Then c.Put(t, members)";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_members.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_c.runVoidMethod ("Put",(Object)((_t)),(Object)((_members.getObject())));};
 }
}Debug.locals.put("t", _t);
;
 BA.debugLineNum = 169;BA.debugLine="ClassesElements.Add(c)";
Debug.ShouldStop(256);
_classeselements.runVoidMethod ("Add",(Object)((_c.getObject())));
 }
}Debug.locals.put("cls", _cls);
;
 BA.debugLineNum = 171;BA.debugLine="LibraryAttributes.Put(\"class\", ClassesElements)";
Debug.ShouldStop(1024);
_libraryattributes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("class"))),(Object)((_classeselements.getObject())));
 BA.debugLineNum = 172;BA.debugLine="PutIfNotEmpty(LibraryAttributes, \"version\", Manif";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.xmlgenerator.class, "_putifnotempty" /*RemoteObject*/ ,(Object)(_libraryattributes),(Object)(BA.ObjectToString("version")),(Object)(BA.ObjectToString(_manifestmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("version"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 173;BA.debugLine="PutIfNotEmpty(LibraryAttributes, \"author\", Manife";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.xmlgenerator.class, "_putifnotempty" /*RemoteObject*/ ,(Object)(_libraryattributes),(Object)(BA.ObjectToString("author")),(Object)(BA.ObjectToString(_manifestmap.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("author"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 175;BA.debugLine="Return m2x.MapToXml(CreateMap(\"root\": LibraryAttr";
Debug.ShouldStop(16384);
if (true) return _m2x.runClassMethod (b4j.example.map2xml.class, "_maptoxml" /*RemoteObject*/ ,(Object)(xmlgenerator.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("root")),(_libraryattributes.getObject())}))));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "xmlgenerator","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="File.MakeDir(File.DirApp, \"temp\")";
Debug.ShouldStop(1024);
xmlgenerator.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(xmlgenerator.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("temp")));
 BA.debugLineNum = 12;BA.debugLine="TempFolder = File.Combine(File.DirApp, \"temp\")";
Debug.ShouldStop(2048);
__ref.setField ("_tempfolder" /*RemoteObject*/ ,xmlgenerator.__c.getField(false,"File").runMethod(true,"Combine",(Object)(xmlgenerator.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("temp"))));
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parselib(RemoteObject __ref,RemoteObject _b4xlib) throws Exception{
try {
		Debug.PushSubsStack("ParseLib (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("parselib")) { return __ref.runUserSub(false, "xmlgenerator","parselib", __ref, _b4xlib);}
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _manifest = null;
RemoteObject _classes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject _manifestmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("b4xlib", _b4xlib);
 BA.debugLineNum = 15;BA.debugLine="Public Sub ParseLib (b4xlib As String) As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="PrepareFiles(b4xlib)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.xmlgenerator.class, "_preparefiles" /*RemoteObject*/ ,(Object)(_b4xlib));
 BA.debugLineNum = 17;BA.debugLine="Dim files As List";
Debug.ShouldStop(65536);
_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("files", _files);
 BA.debugLineNum = 18;BA.debugLine="files.Initialize";
Debug.ShouldStop(131072);
_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 19;BA.debugLine="Dim manifest(1) As String";
Debug.ShouldStop(262144);
_manifest = RemoteObject.createNewArray ("String", new int[] {1}, new Object[]{});Debug.locals.put("manifest", _manifest);
 BA.debugLineNum = 20;BA.debugLine="FindBasFiles(TempFolder, files, manifest)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.xmlgenerator.class, "_findbasfiles" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tempfolder" /*RemoteObject*/ )),(Object)(_files),(Object)(_manifest));
 BA.debugLineNum = 21;BA.debugLine="Dim classes As List";
Debug.ShouldStop(1048576);
_classes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("classes", _classes);
 BA.debugLineNum = 22;BA.debugLine="classes.Initialize";
Debug.ShouldStop(2097152);
_classes.runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="For Each f As String In files";
Debug.ShouldStop(4194304);
{
final RemoteObject group8 = _files;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_f = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("f", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 24;BA.debugLine="classes.Add(ParseModule(f))";
Debug.ShouldStop(8388608);
_classes.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.xmlgenerator.class, "_parsemodule" /*RemoteObject*/ ,(Object)(_f)))));
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 26;BA.debugLine="Dim ManifestMap As Map = CreateMap()";
Debug.ShouldStop(33554432);
_manifestmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_manifestmap = xmlgenerator.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("ManifestMap", _manifestmap);Debug.locals.put("ManifestMap", _manifestmap);
 BA.debugLineNum = 27;BA.debugLine="If manifest(0) <> \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",_manifest.getArrayElement(true,BA.numberCast(int.class, 0)),BA.ObjectToString(""))) { 
 BA.debugLineNum = 28;BA.debugLine="ManifestMap = ParseManifest(manifest(0))";
Debug.ShouldStop(134217728);
_manifestmap = __ref.runClassMethod (b4j.example.xmlgenerator.class, "_parsemanifest" /*RemoteObject*/ ,(Object)(_manifest.getArrayElement(true,BA.numberCast(int.class, 0))));Debug.locals.put("ManifestMap", _manifestmap);
 };
 BA.debugLineNum = 30;BA.debugLine="Return GenerateXML(classes, ManifestMap)";
Debug.ShouldStop(536870912);
if (true) return __ref.runClassMethod (b4j.example.xmlgenerator.class, "_generatexml" /*RemoteObject*/ ,(Object)(_classes),(Object)(_manifestmap));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsemanifest(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ParseManifest (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("parsemanifest")) { return __ref.runUserSub(false, "xmlgenerator","parsemanifest", __ref, _filename);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 61;BA.debugLine="Private Sub ParseManifest (FileName As String) As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim res As Map = CreateMap()";
Debug.ShouldStop(536870912);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_res = xmlgenerator.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 63;BA.debugLine="For Each line As String In File.ReadList(FileName";
Debug.ShouldStop(1073741824);
{
final RemoteObject group2 = xmlgenerator.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(_filename),(Object)(RemoteObject.createImmutable("")));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_line = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 64;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"^([^=]+)=(.*)$";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = xmlgenerator.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^([^=]+)=(.*)$")),(Object)(_line));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 65;BA.debugLine="If m.Find Then";
Debug.ShouldStop(1);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 66;BA.debugLine="res.Put(m.Group(1).ToLowerCase, m.Group(2).Trim";
Debug.ShouldStop(2);
_res.runVoidMethod ("Put",(Object)((_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"toLowerCase"))),(Object)((_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"trim"))));
 };
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 69;BA.debugLine="Return res";
Debug.ShouldStop(16);
if (true) return _res;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsemodule(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ParseModule (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("parsemodule")) { return __ref.runUserSub(false, "xmlgenerator","parsemodule", __ref, _filename);}
RemoteObject _cls = RemoteObject.declareNull("b4j.example.xmlgenerator._class");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _member = RemoteObject.declareNull("b4j.example.xmlgenerator._member");
RemoteObject _field = RemoteObject.declareNull("b4j.example.xmlgenerator._member");
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 72;BA.debugLine="Private Sub ParseModule (FileName As String) As Cl";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Dim cls As Class";
Debug.ShouldStop(256);
_cls = RemoteObject.createNew ("b4j.example.xmlgenerator._class");Debug.locals.put("cls", _cls);
 BA.debugLineNum = 74;BA.debugLine="cls.Initialize";
Debug.ShouldStop(512);
_cls.runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="cls.Members.Initialize";
Debug.ShouldStop(1024);
_cls.getField(false,"Members" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="cls.Events.Initialize";
Debug.ShouldStop(2048);
_cls.getField(false,"Events" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 77;BA.debugLine="Dim m As Matcher = Regex.Matcher2(\".*\\\\([^\\\\]+)\\.";
Debug.ShouldStop(4096);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = xmlgenerator.__c.getField(false,"Regex").runMethod(false,"Matcher2",(Object)(BA.ObjectToString(".*\\\\([^\\\\]+)\\.bas")),(Object)(xmlgenerator.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_filename));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 78;BA.debugLine="m.Find";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Find");
 BA.debugLineNum = 79;BA.debugLine="cls.Name = m.Group(1)";
Debug.ShouldStop(16384);
_cls.setField ("Name" /*RemoteObject*/ ,_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 80;BA.debugLine="cls.ShortName = cls.Name";
Debug.ShouldStop(32768);
_cls.setField ("ShortName" /*RemoteObject*/ ,_cls.getField(true,"Name" /*RemoteObject*/ ));
 BA.debugLineNum = 81;BA.debugLine="For Each line As String In File.ReadList(FileName";
Debug.ShouldStop(65536);
{
final RemoteObject group9 = xmlgenerator.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(_filename),(Object)(RemoteObject.createImmutable("")));
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_line = BA.ObjectToString(group9.runMethod(false,"Get",index9));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 82;BA.debugLine="m = Regex.Matcher(\"^\\s*'(.*)\", line)";
Debug.ShouldStop(131072);
_m = xmlgenerator.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^\\s*'(.*)")),(Object)(_line));Debug.locals.put("m", _m);
 BA.debugLineNum = 83;BA.debugLine="If m.Find Then";
Debug.ShouldStop(262144);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 84;BA.debugLine="CurrentComment = CurrentComment & CRLF & m.Grou";
Debug.ShouldStop(524288);
__ref.setField ("_currentcomment" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_currentcomment" /*RemoteObject*/ ),xmlgenerator.__c.getField(true,"CRLF"),_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"trim")));
 }else 
{ BA.debugLineNum = 85;BA.debugLine="Else If Regex.IsMatch2(\"^\\s*public\\s*sub\\s+.*\",";
Debug.ShouldStop(1048576);
if (xmlgenerator.__c.getField(false,"Regex").runMethod(true,"IsMatch2",(Object)(BA.ObjectToString("^\\s*public\\s*sub\\s+.*")),(Object)(xmlgenerator.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_line)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="Dim member As Member = ParseSubLine(line)";
Debug.ShouldStop(2097152);
_member = __ref.runClassMethod (b4j.example.xmlgenerator.class, "_parsesubline" /*RemoteObject*/ ,(Object)(_line));Debug.locals.put("member", _member);Debug.locals.put("member", _member);
 BA.debugLineNum = 87;BA.debugLine="If member <> Null And cls.Members.ContainsKey(m";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("N",_member) && RemoteObject.solveBoolean("=",_cls.getField(false,"Members" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_member.getField(true,"Name" /*RemoteObject*/ ).runMethod(true,"toLowerCase")))),xmlgenerator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 88;BA.debugLine="cls.Members.Put(member.Name.ToLowerCase, membe";
Debug.ShouldStop(8388608);
_cls.getField(false,"Members" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_member.getField(true,"Name" /*RemoteObject*/ ).runMethod(true,"toLowerCase"))),(Object)((_member)));
 };
 BA.debugLineNum = 90;BA.debugLine="CurrentComment = \"\"";
Debug.ShouldStop(33554432);
__ref.setField ("_currentcomment" /*RemoteObject*/ ,BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 92;BA.debugLine="m = Regex.Matcher2(\"^\\s*#Event:\\s*(.*)$\", Regex";
Debug.ShouldStop(134217728);
_m = xmlgenerator.__c.getField(false,"Regex").runMethod(false,"Matcher2",(Object)(BA.ObjectToString("^\\s*#Event:\\s*(.*)$")),(Object)(xmlgenerator.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_line));Debug.locals.put("m", _m);
 BA.debugLineNum = 93;BA.debugLine="If m.Find Then";
Debug.ShouldStop(268435456);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="cls.Events.Add(m.Group(1))";
Debug.ShouldStop(536870912);
_cls.getField(false,"Events" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))))));
 }else {
 BA.debugLineNum = 96;BA.debugLine="m = Regex.Matcher2(\"^\\s*public\\s+([\\w_]+)\\s+as";
Debug.ShouldStop(-2147483648);
_m = xmlgenerator.__c.getField(false,"Regex").runMethod(false,"Matcher2",(Object)(BA.ObjectToString("^\\s*public\\s+([\\w_]+)\\s+as\\s+([\\w_]+)")),(Object)(xmlgenerator.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_line));Debug.locals.put("m", _m);
 BA.debugLineNum = 97;BA.debugLine="If m.Find Then";
Debug.ShouldStop(1);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 98;BA.debugLine="Dim field As Member";
Debug.ShouldStop(2);
_field = RemoteObject.createNew ("b4j.example.xmlgenerator._member");Debug.locals.put("field", _field);
 BA.debugLineNum = 99;BA.debugLine="field.Initialize";
Debug.ShouldStop(4);
_field.runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="field.MemberType = \"field\"";
Debug.ShouldStop(8);
_field.setField ("MemberType" /*RemoteObject*/ ,BA.ObjectToString("field"));
 BA.debugLineNum = 101;BA.debugLine="field.Name = m.Group(1)";
Debug.ShouldStop(16);
_field.setField ("Name" /*RemoteObject*/ ,_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 102;BA.debugLine="field.ReturnType = m.Group(2)";
Debug.ShouldStop(32);
_field.setField ("ReturnType" /*RemoteObject*/ ,_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 103;BA.debugLine="field.Comment = CurrentComment";
Debug.ShouldStop(64);
_field.setField ("Comment" /*RemoteObject*/ ,__ref.getField(true,"_currentcomment" /*RemoteObject*/ ));
 BA.debugLineNum = 104;BA.debugLine="cls.Members.Put(field.Name.ToLowerCase, field";
Debug.ShouldStop(128);
_cls.getField(false,"Members" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_field.getField(true,"Name" /*RemoteObject*/ ).runMethod(true,"toLowerCase"))),(Object)((_field)));
 };
 };
 BA.debugLineNum = 108;BA.debugLine="CurrentComment = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_currentcomment" /*RemoteObject*/ ,BA.ObjectToString(""));
 }}
;
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 111;BA.debugLine="Return cls";
Debug.ShouldStop(16384);
if (true) return _cls;
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsesubline(RemoteObject __ref,RemoteObject _line) throws Exception{
try {
		Debug.PushSubsStack("ParseSubLine (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("parsesubline")) { return __ref.runUserSub(false, "xmlgenerator","parsesubline", __ref, _line);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _member = RemoteObject.declareNull("b4j.example.xmlgenerator._member");
RemoteObject _i1 = RemoteObject.createImmutable(0);
RemoteObject _i2 = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("b4j.example.xmlgenerator._parameter");
Debug.locals.put("Line", _line);
 BA.debugLineNum = 114;BA.debugLine="Private Sub ParseSubLine (Line As String) As Membe";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Dim m As Matcher = Regex.Matcher2(\"^\\s*public\\s*s";
Debug.ShouldStop(262144);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = xmlgenerator.__c.getField(false,"Regex").runMethod(false,"Matcher2",(Object)(BA.ObjectToString("^\\s*public\\s*sub\\s+([^\\s(]+)")),(Object)(xmlgenerator.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_line));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 116;BA.debugLine="If m.Find = False Then Return Null";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"Find"),xmlgenerator.__c.getField(true,"False"))) { 
if (true) return (xmlgenerator.__c.getField(false,"Null"));};
 BA.debugLineNum = 117;BA.debugLine="Dim member As Member";
Debug.ShouldStop(1048576);
_member = RemoteObject.createNew ("b4j.example.xmlgenerator._member");Debug.locals.put("member", _member);
 BA.debugLineNum = 118;BA.debugLine="member.Initialize";
Debug.ShouldStop(2097152);
_member.runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="member.MemberType = \"method\"";
Debug.ShouldStop(4194304);
_member.setField ("MemberType" /*RemoteObject*/ ,BA.ObjectToString("method"));
 BA.debugLineNum = 120;BA.debugLine="member.Name = m.Group(1)";
Debug.ShouldStop(8388608);
_member.setField ("Name" /*RemoteObject*/ ,_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 121;BA.debugLine="If member.Name.StartsWith(\"get\") Or member.Name.S";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",_member.getField(true,"Name" /*RemoteObject*/ ).runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("get")))) || RemoteObject.solveBoolean(".",_member.getField(true,"Name" /*RemoteObject*/ ).runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("set"))))) { 
 BA.debugLineNum = 122;BA.debugLine="member.MemberType = \"property\"";
Debug.ShouldStop(33554432);
_member.setField ("MemberType" /*RemoteObject*/ ,BA.ObjectToString("property"));
 BA.debugLineNum = 123;BA.debugLine="member.Name = member.Name.SubString(3)";
Debug.ShouldStop(67108864);
_member.setField ("Name" /*RemoteObject*/ ,_member.getField(true,"Name" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 3))));
 };
 BA.debugLineNum = 125;BA.debugLine="member.Parameters.Initialize";
Debug.ShouldStop(268435456);
_member.getField(false,"Parameters" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 126;BA.debugLine="member.Comment = CurrentComment.Trim";
Debug.ShouldStop(536870912);
_member.setField ("Comment" /*RemoteObject*/ ,__ref.getField(true,"_currentcomment" /*RemoteObject*/ ).runMethod(true,"trim"));
 BA.debugLineNum = 127;BA.debugLine="Dim i1 As Int = Line.IndexOf(\"(\")";
Debug.ShouldStop(1073741824);
_i1 = _line.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("(")));Debug.locals.put("i1", _i1);Debug.locals.put("i1", _i1);
 BA.debugLineNum = 128;BA.debugLine="Dim i2 As Int = Line.LastIndexOf(\")\")";
Debug.ShouldStop(-2147483648);
_i2 = _line.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(")")));Debug.locals.put("i2", _i2);Debug.locals.put("i2", _i2);
 BA.debugLineNum = 129;BA.debugLine="If i1 > -1 And i2 > -1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_i1,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean(">",_i2,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 130;BA.debugLine="m = Regex.Matcher2(\"([\\w_]+)(?:\\(\\))?\\s+as\\s+([\\";
Debug.ShouldStop(2);
_m = xmlgenerator.__c.getField(false,"Regex").runMethod(false,"Matcher2",(Object)(BA.ObjectToString("([\\w_]+)(?:\\(\\))?\\s+as\\s+([\\w_]+)")),(Object)(xmlgenerator.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_line.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i1,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_i2))));Debug.locals.put("m", _m);
 BA.debugLineNum = 131;BA.debugLine="Do While m.Find";
Debug.ShouldStop(4);
while (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 132;BA.debugLine="Dim p As Parameter";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("b4j.example.xmlgenerator._parameter");Debug.locals.put("p", _p);
 BA.debugLineNum = 133;BA.debugLine="p.Initialize";
Debug.ShouldStop(16);
_p.runVoidMethod ("Initialize");
 BA.debugLineNum = 134;BA.debugLine="p.Name = m.Group(1)";
Debug.ShouldStop(32);
_p.setField ("Name" /*RemoteObject*/ ,_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 135;BA.debugLine="p.VarType = m.Group(2)";
Debug.ShouldStop(64);
_p.setField ("VarType" /*RemoteObject*/ ,_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 136;BA.debugLine="member.Parameters.Add(p)";
Debug.ShouldStop(128);
_member.getField(false,"Parameters" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_p)));
 }
;
 BA.debugLineNum = 138;BA.debugLine="m = Regex.Matcher2(\"as\\s+([\\w_]+(?:\\(\\))?)$\", Re";
Debug.ShouldStop(512);
_m = xmlgenerator.__c.getField(false,"Regex").runMethod(false,"Matcher2",(Object)(BA.ObjectToString("as\\s+([\\w_]+(?:\\(\\))?)$")),(Object)(xmlgenerator.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_line));Debug.locals.put("m", _m);
 BA.debugLineNum = 139;BA.debugLine="If m.Find Then";
Debug.ShouldStop(1024);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 140;BA.debugLine="member.ReturnType = m.Group(1)";
Debug.ShouldStop(2048);
_member.setField ("ReturnType" /*RemoteObject*/ ,_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 }else {
 BA.debugLineNum = 143;BA.debugLine="m = Regex.Matcher2(\"as\\s+([\\w_]+(?:\\(\\))?)$\", Re";
Debug.ShouldStop(16384);
_m = xmlgenerator.__c.getField(false,"Regex").runMethod(false,"Matcher2",(Object)(BA.ObjectToString("as\\s+([\\w_]+(?:\\(\\))?)$")),(Object)(xmlgenerator.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_line));Debug.locals.put("m", _m);
 BA.debugLineNum = 144;BA.debugLine="If m.Find Then";
Debug.ShouldStop(32768);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 145;BA.debugLine="member.ReturnType = m.Group(1)";
Debug.ShouldStop(65536);
_member.setField ("ReturnType" /*RemoteObject*/ ,_m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));
 };
 };
 BA.debugLineNum = 148;BA.debugLine="Return member";
Debug.ShouldStop(524288);
if (true) return _member;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparefiles(RemoteObject __ref,RemoteObject _b4xlib) throws Exception{
try {
		Debug.PushSubsStack("PrepareFiles (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("preparefiles")) { return __ref.runUserSub(false, "xmlgenerator","preparefiles", __ref, _b4xlib);}
RemoteObject _a = RemoteObject.declareNull("flm.b4a.archiver.ArchiverForB4A");
Debug.locals.put("b4xlib", _b4xlib);
 BA.debugLineNum = 34;BA.debugLine="Private Sub PrepareFiles (b4xlib As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="DeleteFolder(TempFolder)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.xmlgenerator.class, "_deletefolder" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tempfolder" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="Dim a As Archiver";
Debug.ShouldStop(8);
_a = RemoteObject.createNew ("flm.b4a.archiver.ArchiverForB4A");Debug.locals.put("a", _a);
 BA.debugLineNum = 37;BA.debugLine="a.UnZip(\"\", b4xlib, TempFolder, \"\")";
Debug.ShouldStop(16);
_a.runVoidMethod ("UnZip",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(_b4xlib),(Object)(__ref.getField(true,"_tempfolder" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putifnotempty(RemoteObject __ref,RemoteObject _m,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("PutIfNotEmpty (xmlgenerator) ","xmlgenerator",1,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("putifnotempty")) { return __ref.runUserSub(false, "xmlgenerator","putifnotempty", __ref, _m, _key, _value);}
Debug.locals.put("m", _m);
Debug.locals.put("key", _key);
Debug.locals.put("value", _value);
 BA.debugLineNum = 197;BA.debugLine="Private Sub PutIfNotEmpty(m As Map, key As String,";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="value = value.Trim";
Debug.ShouldStop(32);
_value = _value.runMethod(true,"trim");Debug.locals.put("value", _value);
 BA.debugLineNum = 199;BA.debugLine="If value <> \"\" Then m.Put(key, value)";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_value,BA.ObjectToString(""))) { 
_m.runVoidMethod ("Put",(Object)((_key)),(Object)((_value)));};
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}