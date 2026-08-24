
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class draganddrop {
    public static RemoteObject myClass;
	public draganddrop() {
	}
    public static PCBA staticBA = new PCBA(null, draganddrop.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mode = RemoteObject.declareNull("Object");
public static RemoteObject _dataid = null;
public static RemoteObject _dataobject = null;
public static RemoteObject _dragboardimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
public static RemoteObject _dragboardimgoffsetx = RemoteObject.createImmutable(0);
public static RemoteObject _dragboardimgoffsety = RemoteObject.createImmutable(0);
public static RemoteObject _startdrag = RemoteObject.createImmutable(false);
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _seventname = RemoteObject.createImmutable("");
public static RemoteObject _teventname = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.transfermode _transfermode = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CallBack",_ref.getField(false, "_callback"),"DataID",_ref.getField(false, "_dataid"),"DataObject",_ref.getField(false, "_dataobject"),"DragboardImg",_ref.getField(false, "_dragboardimg"),"DragboardImgOffsetX",_ref.getField(false, "_dragboardimgoffsetx"),"DragboardImgOffsetY",_ref.getField(false, "_dragboardimgoffsety"),"fx",_ref.getField(false, "_fx"),"Mode",_ref.getField(false, "_mode"),"sEventName",_ref.getField(false, "_seventname"),"StartDrag",_ref.getField(false, "_startdrag"),"tEventName",_ref.getField(false, "_teventname")};
}
}