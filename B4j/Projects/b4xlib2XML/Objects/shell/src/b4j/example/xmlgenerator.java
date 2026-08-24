
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xmlgenerator {
    public static RemoteObject myClass;
	public xmlgenerator() {
	}
    public static PCBA staticBA = new PCBA(null, xmlgenerator.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tempfolder = RemoteObject.createImmutable("");
public static RemoteObject _currentcomment = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.transfermode _transfermode = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CurrentComment",_ref.getField(false, "_currentcomment"),"TempFolder",_ref.getField(false, "_tempfolder")};
}
}