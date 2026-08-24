
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class transfermode implements IRemote{
	public static transfermode mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public transfermode() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new transfermode();
		remoteMe = RemoteObject.declareNull("b4j.example.transfermode");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("transfermode"), "b4j.example.transfermode");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, transfermode.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, transfermode.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _any = RemoteObject.declareNull("Object");
public static RemoteObject _copy_or_move = RemoteObject.declareNull("Object");
public static RemoteObject _copy = RemoteObject.declareNull("Object");
public static RemoteObject _move = RemoteObject.declareNull("Object");
public static RemoteObject _link = RemoteObject.declareNull("Object");
public static RemoteObject _initialized = RemoteObject.createImmutable(false);
public static b4j.example.main _main = null;
public static b4j.example.b4xcollections _b4xcollections = null;
  public Object[] GetGlobals() {
		return new Object[] {"ANY",transfermode._any,"B4XCollections",Debug.moduleToString(b4j.example.b4xcollections.class),"COPY",transfermode._copy,"COPY_OR_MOVE",transfermode._copy_or_move,"Initialized",transfermode._initialized,"LINK",transfermode._link,"Main",Debug.moduleToString(b4j.example.main.class),"MOVE",transfermode._move,"TJO",transfermode._tjo};
}
}