package p153l;

import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class awr {
    /* JADX INFO: renamed from: a */
    public static void m100707a(Exception exc) {
        CrashHelper.m82479c(exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m100708b(int i, String str, String str2, String str3) {
        CrashHelper.m82479c(new Exception("onLiveWebViewLoadError  url = " + str2 + " description = " + str + " errorCode = " + i + " location = " + str3));
    }

    /* JADX INFO: renamed from: c */
    public static void m100709c(WebViewX webViewX, bsp0 bsp0Var, asp0 asp0Var, String str) {
        CrashHelper.m82479c(new Exception("onLiveWebViewResLoadError  webUrl = " + webViewX.getUrl() + " resUrl" + bsp0Var.getUrl() + " description = " + ((Object) asp0Var.m99963a()) + " errorCode = " + asp0Var.m99964b() + " location = " + str));
    }

    /* JADX INFO: renamed from: d */
    public static void m100710d(Exception exc) {
        CrashHelper.m82479c(exc);
    }

    /* JADX INFO: renamed from: e */
    public static void m100711e(BLiveJsDialogItemType bLiveJsDialogItemType, String str, Exception exc) {
        CrashHelper.m82479c(new Exception("reportJsDialogException url = " + str + " itemType = " + bLiveJsDialogItemType.toJson(), exc));
    }

    /* JADX INFO: renamed from: f */
    public static void m100712f() {
        CrashHelper.m82479c(new Exception("showGiftDialogError errorMessage : info == null "));
    }
}
