package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,18);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 18;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(262144);
main._mainform = _form1;
 BA.debugLineNum = 20;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\")";
Debug.ShouldStop(524288);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 21;BA.debugLine="MainForm.Title = \"b4xlib2XML v\" & NumberFormat2(v";
Debug.ShouldStop(1048576);
main._mainform.runMethod(true,"setTitle",RemoteObject.concat(RemoteObject.createImmutable("b4xlib2XML v"),main.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, main._version)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(main.__c.getField(true,"False")))));
 BA.debugLineNum = 22;BA.debugLine="MainForm.Show";
Debug.ShouldStop(2097152);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 23;BA.debugLine="dd.Initialize(Me)";
Debug.ShouldStop(4194304);
main._dd.runClassMethod (b4j.example.draganddrop.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main.getObject()));
 BA.debugLineNum = 24;BA.debugLine="dd.MakeDragTarget(paneInput, \"DropTarget\")";
Debug.ShouldStop(8388608);
main._dd.runClassMethod (b4j.example.draganddrop.class, "_makedragtarget" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), main._paneinput.getObject()),(Object)(RemoteObject.createImmutable("DropTarget")));
 BA.debugLineNum = 25;BA.debugLine="gen.Initialize";
Debug.ShouldStop(16777216);
main._gen.runClassMethod (b4j.example.xmlgenerator.class, "_initialize" /*RemoteObject*/ ,main.ba);
 BA.debugLineNum = 26;BA.debugLine="fc.Initialize";
Debug.ShouldStop(33554432);
main._fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="If File.Exists(File.DirApp, \"settings.txt\") Then";
Debug.ShouldStop(67108864);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("settings.txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 28;BA.debugLine="LastSavedFolder = File.ReadMap(File.DirApp, \"set";
Debug.ShouldStop(134217728);
main._lastsavedfolder = BA.ObjectToString(main.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("settings.txt"))).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("last"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 29;BA.debugLine="fc.InitialDirectory = LastSavedFolder";
Debug.ShouldStop(268435456);
main._fc.runMethod(true,"setInitialDirectory",main._lastsavedfolder);
 };
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
public static void  _droptarget_dragdropped(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragDropped (main) ","main",0,main.ba,main.mostCurrent,68);
if (RapidSub.canDelegate("droptarget_dragdropped")) { b4j.example.main.remoteMe.runUserSub(false, "main","droptarget_dragdropped", _e); return;}
ResumableSub_DropTarget_DragDropped rsub = new ResumableSub_DropTarget_DragDropped(null,_e);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DropTarget_DragDropped extends BA.ResumableSub {
public ResumableSub_DropTarget_DragDropped(b4j.example.main parent,RemoteObject _e) {
this.parent = parent;
this._e = _e;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _e;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _target = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragDropped (main) ","main",0,main.ba,main.mostCurrent,68);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("e", _e);
 BA.debugLineNum = 69;BA.debugLine="Log(\"drag dropped\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("drag dropped")));
 BA.debugLineNum = 70;BA.debugLine="Dim filename As String = e.GetDragboard.GetFiles.";
Debug.ShouldStop(32);
_filename = BA.ObjectToString(_e.runClassMethod (b4j.example.dragevent.class, "_getdragboard" /*RemoteObject*/ ).runClassMethod (b4j.example.dragboard.class, "_getfiles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 71;BA.debugLine="e.SetDropCompleted(True)";
Debug.ShouldStop(64);
_e.runClassMethod (b4j.example.dragevent.class, "_setdropcompleted" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 72;BA.debugLine="Dim s As String = gen.ParseLib(filename)";
Debug.ShouldStop(128);
_s = parent._gen.runClassMethod (b4j.example.xmlgenerator.class, "_parselib" /*RemoteObject*/ ,(Object)(_filename));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 73;BA.debugLine="Sleep(100)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "droptarget_dragdropped"),BA.numberCast(int.class, 100));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 74;BA.debugLine="fc.SetExtensionFilter(\"XML\", Array(\"*.xml\"))";
Debug.ShouldStop(512);
parent._fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("XML")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*.xml"))})))));
 BA.debugLineNum = 75;BA.debugLine="fc.InitialFileName = File.GetName(filename.Replac";
Debug.ShouldStop(1024);
parent._fc.runMethod(true,"setInitialFileName",parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename.runMethod(true,"replace",(Object)(BA.ObjectToString(".b4xlib")),(Object)(RemoteObject.createImmutable(".xml"))))));
 BA.debugLineNum = 76;BA.debugLine="Dim target As String = fc.ShowSave(MainForm)";
Debug.ShouldStop(2048);
_target = parent._fc.runMethodAndSync(true,"ShowSave",(Object)(parent._mainform));Debug.locals.put("target", _target);Debug.locals.put("target", _target);
 BA.debugLineNum = 77;BA.debugLine="If target <> \"\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_target,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 78;BA.debugLine="File.WriteString(target, \"\", s)";
Debug.ShouldStop(8192);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_target),(Object)(BA.ObjectToString("")),(Object)(_s));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _droptarget_dragentered(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragEntered (main) ","main",0,main.ba,main.mostCurrent,38);
if (RapidSub.canDelegate("droptarget_dragentered")) { return b4j.example.main.remoteMe.runUserSub(false, "main","droptarget_dragentered", _e);}
RemoteObject _clr = RemoteObject.createImmutable(0);
Debug.locals.put("e", _e);
 BA.debugLineNum = 38;BA.debugLine="Sub DropTarget_DragEntered(e As DragEvent)";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Log(\"DragEntered\")";
Debug.ShouldStop(64);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("DragEntered")));
 BA.debugLineNum = 40;BA.debugLine="Dim clr As Int";
Debug.ShouldStop(128);
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 41;BA.debugLine="If IsValidDropEvent(e) Then";
Debug.ShouldStop(256);
if (_isvaliddropevent(_e).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="clr = xui.Color_Green";
Debug.ShouldStop(512);
_clr = main._xui.getField(true,"Color_Green");Debug.locals.put("clr", _clr);
 }else {
 BA.debugLineNum = 44;BA.debugLine="clr = xui.Color_Red";
Debug.ShouldStop(2048);
_clr = main._xui.getField(true,"Color_Red");Debug.locals.put("clr", _clr);
 };
 BA.debugLineNum = 46;BA.debugLine="paneInput.SetColorAndBorder(xui.Color_White, 4dip";
Debug.ShouldStop(8192);
main._paneinput.runVoidMethod ("SetColorAndBorder",(Object)(main._xui.getField(true,"Color_White")),(Object)(BA.numberCast(double.class, main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))),(Object)(_clr),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptarget_dragexited(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragExited (main) ","main",0,main.ba,main.mostCurrent,49);
if (RapidSub.canDelegate("droptarget_dragexited")) { return b4j.example.main.remoteMe.runUserSub(false, "main","droptarget_dragexited", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 49;BA.debugLine="Sub DropTarget_DragExited(e As DragEvent)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="paneInput.SetColorAndBorder(xui.Color_White, 0, 0";
Debug.ShouldStop(131072);
main._paneinput.runVoidMethod ("SetColorAndBorder",(Object)(main._xui.getField(true,"Color_White")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptarget_dragover(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("DropTarget_DragOver (main) ","main",0,main.ba,main.mostCurrent,53);
if (RapidSub.canDelegate("droptarget_dragover")) { return b4j.example.main.remoteMe.runUserSub(false, "main","droptarget_dragover", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 53;BA.debugLine="Sub DropTarget_DragOver(e As DragEvent)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="If IsValidDropEvent(e) Then e.AcceptTransferModes";
Debug.ShouldStop(2097152);
if (_isvaliddropevent(_e).<Boolean>get().booleanValue()) { 
_e.runClassMethod (b4j.example.dragevent.class, "_accepttransfermodes" /*RemoteObject*/ ,(Object)((main._transfermode._copy /*RemoteObject*/ )));};
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvaliddropevent(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("IsValidDropEvent (main) ","main",0,main.ba,main.mostCurrent,57);
if (RapidSub.canDelegate("isvaliddropevent")) { return b4j.example.main.remoteMe.runUserSub(false, "main","isvaliddropevent", _e);}
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 57;BA.debugLine="Sub IsValidDropEvent(e As DragEvent) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="If e.GetDragboard.HasFiles Then";
Debug.ShouldStop(33554432);
if (_e.runClassMethod (b4j.example.dragevent.class, "_getdragboard" /*RemoteObject*/ ).runClassMethod (b4j.example.dragboard.class, "_hasfiles" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 59;BA.debugLine="Dim files As List = e.GetDragboard.GetFiles";
Debug.ShouldStop(67108864);
_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_files = _e.runClassMethod (b4j.example.dragevent.class, "_getdragboard" /*RemoteObject*/ ).runClassMethod (b4j.example.dragboard.class, "_getfiles" /*RemoteObject*/ );Debug.locals.put("files", _files);Debug.locals.put("files", _files);
 BA.debugLineNum = 60;BA.debugLine="If files.Size = 1 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_files.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 61;BA.debugLine="Dim filename As String = files.Get(0)";
Debug.ShouldStop(268435456);
_filename = BA.ObjectToString(_files.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 62;BA.debugLine="Return filename.EndsWith(\".b4xlib\")";
Debug.ShouldStop(536870912);
if (true) return _filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".b4xlib")));
 };
 };
 BA.debugLineNum = 65;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) return main.__c.getField(true,"False");
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closed() throws Exception{
try {
		Debug.PushSubsStack("MainForm_Closed (main) ","main",0,main.ba,main.mostCurrent,33);
if (RapidSub.canDelegate("mainform_closed")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closed");}
 BA.debugLineNum = 33;BA.debugLine="Sub MainForm_Closed";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="File.WriteMap(File.DirApp, \"settings.txt\", Create";
Debug.ShouldStop(4);
main.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("settings.txt")),(Object)(main.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("last")),(main._fc.runMethod(true,"getInitialDirectory"))}))));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
transfermode_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
xmlgenerator.myClass = BA.getDeviceClass ("b4j.example.xmlgenerator");
map2xml.myClass = BA.getDeviceClass ("b4j.example.map2xml");
xml2map.myClass = BA.getDeviceClass ("b4j.example.xml2map");
b4xbitset.myClass = BA.getDeviceClass ("b4j.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4j.example.b4xbytesbuilder");
b4xcollections.myClass = BA.getDeviceClass ("b4j.example.b4xcollections");
b4xorderedmap.myClass = BA.getDeviceClass ("b4j.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4j.example.b4xset");
draganddrop.myClass = BA.getDeviceClass ("b4j.example.draganddrop");
dragboard.myClass = BA.getDeviceClass ("b4j.example.dragboard");
dragevent.myClass = BA.getDeviceClass ("b4j.example.dragevent");
transfermode.myClass = BA.getDeviceClass ("b4j.example.transfermode");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private paneInput As B4XView";
main._paneinput = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private dd As DragAndDrop";
main._dd = RemoteObject.createNew ("b4j.example.draganddrop");
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 12;BA.debugLine="Private gen As XMLGenerator";
main._gen = RemoteObject.createNew ("b4j.example.xmlgenerator");
 //BA.debugLineNum = 13;BA.debugLine="Private fc As FileChooser";
main._fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private version As Float = 1.22";
main._version = BA.numberCast(float.class, 1.22);
 //BA.debugLineNum = 15;BA.debugLine="Private LastSavedFolder As String";
main._lastsavedfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}