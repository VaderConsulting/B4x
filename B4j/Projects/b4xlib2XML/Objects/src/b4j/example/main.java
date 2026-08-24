package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _paneinput = null;
public static b4j.example.draganddrop _dd = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.xmlgenerator _gen = null;
public static anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
public static float _version = 0f;
public static String _lastsavedfolder = "";
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.transfermode _transfermode = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\")";
_mainform.getRootPane().LoadLayout(ba,"1");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Title = \"b4xlib2XML v\" & NumberFormat2(v";
_mainform.setTitle("b4xlib2XML v"+anywheresoftware.b4a.keywords.Common.NumberFormat2(_version,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="dd.Initialize(Me)";
_dd._initialize /*String*/ (null,ba,main.getObject());
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="dd.MakeDragTarget(paneInput, \"DropTarget\")";
_dd._makedragtarget /*String*/ (null,(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneinput.getObject())),"DropTarget");
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="gen.Initialize";
_gen._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="fc.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="If File.Exists(File.DirApp, \"settings.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"settings.txt")) { 
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="LastSavedFolder = File.ReadMap(File.DirApp, \"set";
_lastsavedfolder = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"settings.txt").GetDefault((Object)("last"),(Object)("")));
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="fc.InitialDirectory = LastSavedFolder";
_fc.setInitialDirectory(_lastsavedfolder);
 };
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="End Sub";
return "";
}
public static void  _droptarget_dragdropped(b4j.example.dragevent _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "droptarget_dragdropped", false))
	 {Debug.delegate(ba, "droptarget_dragdropped", new Object[] {_e}); return;}
ResumableSub_DropTarget_DragDropped rsub = new ResumableSub_DropTarget_DragDropped(null,_e);
rsub.resume(ba, null);
}
public static class ResumableSub_DropTarget_DragDropped extends BA.ResumableSub {
public ResumableSub_DropTarget_DragDropped(b4j.example.main parent,b4j.example.dragevent _e) {
this.parent = parent;
this._e = _e;
}
b4j.example.main parent;
b4j.example.dragevent _e;
String _filename = "";
String _s = "";
String _target = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Log(\"drag dropped\")";
anywheresoftware.b4a.keywords.Common.Log("drag dropped");
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim filename As String = e.GetDragboard.GetFiles.";
_filename = BA.ObjectToString(_e._getdragboard /*b4j.example.dragboard*/ (null)._getfiles /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0)));
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="e.SetDropCompleted(True)";
_e._setdropcompleted /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Dim s As String = gen.ParseLib(filename)";
_s = parent._gen._parselib /*String*/ (null,_filename);
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "droptarget_dragdropped"),(int) (100));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="fc.SetExtensionFilter(\"XML\", Array(\"*.xml\"))";
parent._fc.SetExtensionFilter("XML",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*.xml")}));
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="fc.InitialFileName = File.GetName(filename.Replac";
parent._fc.setInitialFileName(anywheresoftware.b4a.keywords.Common.File.GetName(_filename.replace(".b4xlib",".xml")));
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Dim target As String = fc.ShowSave(MainForm)";
_target = parent._fc.ShowSave(parent._mainform);
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="If target <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_target).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="File.WriteString(target, \"\", s)";
anywheresoftware.b4a.keywords.Common.File.WriteString(_target,"",_s);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _droptarget_dragentered(b4j.example.dragevent _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "droptarget_dragentered", false))
	 {return ((String) Debug.delegate(ba, "droptarget_dragentered", new Object[] {_e}));}
int _clr = 0;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub DropTarget_DragEntered(e As DragEvent)";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Log(\"DragEntered\")";
anywheresoftware.b4a.keywords.Common.Log("DragEntered");
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="If IsValidDropEvent(e) Then";
if (_isvaliddropevent(_e)) { 
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="clr = xui.Color_Green";
_clr = _xui.Color_Green;
 }else {
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="clr = xui.Color_Red";
_clr = _xui.Color_Red;
 };
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="paneInput.SetColorAndBorder(xui.Color_White, 4dip";
_paneinput.SetColorAndBorder(_xui.Color_White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4)),_clr,0);
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="End Sub";
return "";
}
public static boolean  _isvaliddropevent(b4j.example.dragevent _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "isvaliddropevent", false))
	 {return ((Boolean) Debug.delegate(ba, "isvaliddropevent", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.List _files = null;
String _filename = "";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub IsValidDropEvent(e As DragEvent) As Boolean";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If e.GetDragboard.HasFiles Then";
if (_e._getdragboard /*b4j.example.dragboard*/ (null)._hasfiles /*boolean*/ (null)) { 
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Dim files As List = e.GetDragboard.GetFiles";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = _e._getdragboard /*b4j.example.dragboard*/ (null)._getfiles /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="If files.Size = 1 Then";
if (_files.getSize()==1) { 
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Dim filename As String = files.Get(0)";
_filename = BA.ObjectToString(_files.Get((int) (0)));
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Return filename.EndsWith(\".b4xlib\")";
if (true) return _filename.endsWith(".b4xlib");
 };
 };
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="End Sub";
return false;
}
public static String  _droptarget_dragexited(b4j.example.dragevent _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "droptarget_dragexited", false))
	 {return ((String) Debug.delegate(ba, "droptarget_dragexited", new Object[] {_e}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub DropTarget_DragExited(e As DragEvent)";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="paneInput.SetColorAndBorder(xui.Color_White, 0, 0";
_paneinput.SetColorAndBorder(_xui.Color_White,0,(int) (0),0);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _droptarget_dragover(b4j.example.dragevent _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "droptarget_dragover", false))
	 {return ((String) Debug.delegate(ba, "droptarget_dragover", new Object[] {_e}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub DropTarget_DragOver(e As DragEvent)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If IsValidDropEvent(e) Then e.AcceptTransferModes";
if (_isvaliddropevent(_e)) { 
_e._accepttransfermodes /*String*/ (null,(Object[])(_transfermode._copy /*Object*/ ));};
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closed() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_closed", false))
	 {return ((String) Debug.delegate(ba, "mainform_closed", null));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub MainForm_Closed";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="File.WriteMap(File.DirApp, \"settings.txt\", Create";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"settings.txt",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("last"),(Object)(_fc.getInitialDirectory())}));
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="End Sub";
return "";
}
}