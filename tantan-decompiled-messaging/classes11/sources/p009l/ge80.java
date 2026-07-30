package p009l;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ge80 {

    /* JADX INFO: renamed from: a */
    public String f13453a;

    /* JADX INFO: renamed from: b */
    public Activity f13454b;

    /* JADX INFO: renamed from: c */
    public WebViewX f13455c;

    /* JADX INFO: renamed from: d */
    public final he80 f13456d;

    /* JADX INFO: renamed from: e */
    public String f13457e;

    public ge80(Activity activity, String str, WebViewX webViewX) {
        this.f13453a = str;
        this.f13454b = activity;
        this.f13455c = webViewX;
        webViewX.setCurrentUrlCallback(new WebViewX.a() { // from class: l.fe80
            /* JADX INFO: renamed from: a */
            public final void m14411a(WebView webView, String str2) {
                this.f12963a.m14917c(webView, str2);
            }
        });
        this.f13456d = new he80(activity, webViewX);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14916b() {
        Activity activity = this.f13454b;
        return activity == null || activity.isFinishing() || this.f13455c == null;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m14917c(WebView webView, String str) {
        this.f13457e = str;
    }

    @JavascriptInterface
    public boolean canIUse(String str) {
        Iterator<Class> it = doq.m13424e().m13427c().iterator();
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
    public void m14918d() {
        if (NullChecker.a(this.f13455c)) {
            this.f13455c.setCurrentUrlCallback((WebViewX.a) null);
            doq.m13424e().m13426b(this.f13455c);
        }
        this.f13454b = null;
        this.f13455c = null;
    }

    @JavascriptInterface
    public String dispatch(String str, String str2) {
        if (m14916b()) {
            m14919e(str, "isActInvalid", this.f13457e);
            return "";
        }
        if (TextUtils.equals("closeWebview", str)) {
            this.f13454b.finish();
        }
        return "";
    }

    /* JADX INFO: renamed from: e */
    public final void m14919e(String str, String str2, String str3) {
        if (TextUtils.equals(str, "getSystemInfo") || TextUtils.equals(str, "getAuthorizationHeader") || TextUtils.equals(str, "getAbHeader")) {
            CrashHelper.d(new Exception(doq.class.getName() + " methodName =  " + str + " " + str2 + " url = " + str3), 100);
        }
    }

    @JavascriptInterface
    public String triggerAction(String str, String str2) {
        return dispatch(str, str2);
    }
}
