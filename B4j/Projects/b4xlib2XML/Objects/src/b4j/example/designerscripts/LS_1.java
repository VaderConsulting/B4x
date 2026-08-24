package b4j.example.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_1{

public static void LS_general(anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale) {
;
//BA.debugLineNum = 2;BA.debugLine="Label1.HorizontalCenter = 50%x"[1/General script]
views.get("label1").setLeft((int)((50d / 100 * width) - (views.get("label1").getPrefWidth() / 2)));
//BA.debugLineNum = 3;BA.debugLine="Label1.VerticalCenter = 50%y"[1/General script]
views.get("label1").setTop((int)((50d / 100 * height) - (views.get("label1").getPrefHeight() / 2)));

}
}