package p149l;

import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class ztr {
    /* JADX INFO: renamed from: a */
    public static void m220136a(Exception exc) {
        CrashHelper.m81296c(exc);
    }

    /* JADX INFO: renamed from: b */
    public static void m220137b(int i, String str, String str2, String str3) {
        CrashHelper.m81296c(new Exception("onLiveWebViewLoadError  url = " + str2 + " description = " + str + " errorCode = " + i + " location = " + str3));
    }

    /* JADX INFO: renamed from: c */
    public static void m220138c(WebViewX webViewX, wip0 wip0Var, vip0 vip0Var, String str) {
        CrashHelper.m81296c(new Exception("onLiveWebViewResLoadError  webUrl = " + webViewX.getUrl() + " resUrl" + wip0Var.getUrl() + " description = " + ((Object) vip0Var.m198600a()) + " errorCode = " + vip0Var.m198601b() + " location = " + str));
    }

    /* JADX INFO: renamed from: d */
    public static void m220139d(Exception exc) {
        CrashHelper.m81296c(exc);
    }

    /* JADX INFO: renamed from: e */
    public static void m220140e(BLiveJsDialogItemType bLiveJsDialogItemType, String str, Exception exc) {
        CrashHelper.m81296c(new Exception("reportJsDialogException url = " + str + " itemType = " + bLiveJsDialogItemType.toJson(), exc));
    }

    /* JADX INFO: renamed from: f */
    public static void m220141f() {
        CrashHelper.m81296c(new Exception("showGiftDialogError errorMessage : info == null "));
    }
}
