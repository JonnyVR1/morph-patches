package p149l;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class ge80 {

    /* JADX INFO: renamed from: a */
    public String f102162a;

    /* JADX INFO: renamed from: b */
    public Activity f102163b;

    /* JADX INFO: renamed from: c */
    public WebViewX f102164c;

    /* JADX INFO: renamed from: d */
    public final he80 f102165d;

    /* JADX INFO: renamed from: e */
    public String f102166e;

    public ge80(Activity activity, String str, WebViewX webViewX) {
        this.f102162a = str;
        this.f102163b = activity;
        this.f102164c = webViewX;
        webViewX.setCurrentUrlCallback(new WebViewX.InterfaceC4702a() { // from class: l.fe80
            @Override // com.p046p1.mobile.putong.app.web.WebViewX.InterfaceC4702a
            /* JADX INFO: renamed from: a */
            public final void mo29699a(WebView webView, String str2) {
                this.f97105a.m125683c(webView, str2);
            }
        });
        this.f102165d = new he80(activity, webViewX);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m125682b() {
        Activity activity = this.f102163b;
        return activity == null || activity.isFinishing() || this.f102164c == null;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m125683c(WebView webView, String str) {
        this.f102166e = str;
    }

    @JavascriptInterface
    public boolean canIUse(String str) {
        Iterator<Class> it = doq.m112810e().m112813c().iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            for (Method method : it.next().getMethods()) {
                if (method.isAnnotationPresent(liq.class) && ((liq) method.getAnnotation(liq.class)).key().equals(str)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m125684d() {
        if (NullChecker.m81303a(this.f102164c)) {
            this.f102164c.setCurrentUrlCallback(null);
            doq.m112810e().m112812b(this.f102164c);
        }
        this.f102163b = null;
        this.f102164c = null;
    }

    @JavascriptInterface
    public String dispatch(String str, String str2) {
        if (m125682b()) {
            m125685e(str, "isActInvalid", this.f102166e);
            return "";
        }
        if (TextUtils.equals("closeWebview", str)) {
            this.f102163b.finish();
        }
        return "";
    }

    /* JADX INFO: renamed from: e */
    public final void m125685e(String str, String str2, String str3) {
        if (TextUtils.equals(str, "getSystemInfo") || TextUtils.equals(str, "getAuthorizationHeader") || TextUtils.equals(str, "getAbHeader")) {
            CrashHelper.m81297d(new Exception(doq.class.getName() + " methodName =  " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + " url = " + str3), 100);
        }
    }

    @JavascriptInterface
    public String triggerAction(String str, String str2) {
        return dispatch(str, str2);
    }
}
