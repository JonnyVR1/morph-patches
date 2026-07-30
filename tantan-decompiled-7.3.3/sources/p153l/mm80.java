package p153l;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class mm80 {

    /* JADX INFO: renamed from: a */
    public String f137516a;

    /* JADX INFO: renamed from: b */
    public Activity f137517b;

    /* JADX INFO: renamed from: c */
    public WebViewX f137518c;

    /* JADX INFO: renamed from: d */
    public final nm80 f137519d;

    /* JADX INFO: renamed from: e */
    public String f137520e;

    public mm80(Activity activity, String str, WebViewX webViewX) {
        this.f137516a = str;
        this.f137517b = activity;
        this.f137518c = webViewX;
        webViewX.setCurrentUrlCallback(new WebViewX.InterfaceC4853a() { // from class: l.lm80
            @Override // com.p051p1.mobile.putong.app.web.WebViewX.InterfaceC4853a
            /* JADX INFO: renamed from: a */
            public final void mo30697a(WebView webView, String str2) {
                this.f132653a.m159048c(webView, str2);
            }
        });
        this.f137519d = new nm80(activity, webViewX);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m159047b() {
        Activity activity = this.f137517b;
        return activity == null || activity.isFinishing() || this.f137518c == null;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m159048c(WebView webView, String str) {
        this.f137520e = str;
    }

    @JavascriptInterface
    public boolean canIUse(String str) {
        Iterator<Class> it = cqq.m111970e().m111973c().iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            for (Method method : it.next().getMethods()) {
                if (method.isAnnotationPresent(lkq.class) && ((lkq) method.getAnnotation(lkq.class)).key().equals(str)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m159049d() {
        if (NullChecker.m82486a(this.f137518c)) {
            this.f137518c.setCurrentUrlCallback(null);
            cqq.m111970e().m111972b(this.f137518c);
        }
        this.f137517b = null;
        this.f137518c = null;
    }

    @JavascriptInterface
    public String dispatch(String str, String str2) {
        if (m159047b()) {
            m159050e(str, "isActInvalid", this.f137520e);
            return "";
        }
        if (TextUtils.equals("closeWebview", str)) {
            this.f137517b.finish();
        }
        return "";
    }

    /* JADX INFO: renamed from: e */
    public final void m159050e(String str, String str2, String str3) {
        if (TextUtils.equals(str, "getSystemInfo") || TextUtils.equals(str, "getAuthorizationHeader") || TextUtils.equals(str, "getAbHeader")) {
            CrashHelper.m82480d(new Exception(cqq.class.getName() + " methodName =  " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + " url = " + str3), 100);
        }
    }

    @JavascriptInterface
    public String triggerAction(String str, String str2) {
        return dispatch(str, str2);
    }
}
