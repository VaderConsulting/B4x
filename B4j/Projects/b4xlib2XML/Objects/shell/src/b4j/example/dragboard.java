
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class dragboard {
    public static RemoteObject myClass;
	public dragboard() {
	}
    public static PCBA staticBA = new PCBA(null, dragboard.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.transfermode _transfermode = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"TJO",_ref.getField(false, "_tjo")};
}
}