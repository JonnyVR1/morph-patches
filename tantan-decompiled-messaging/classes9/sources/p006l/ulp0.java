package p006l;

import android.app.Application;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.p000p1.mobile.putong.app.web.WebViewClientX;
import com.p000p1.mobile.putong.app.web.WebViewX;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.SoftReference;
import l.shw;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ulp0 {

    /* JADX INFO: renamed from: a */
    public static SoftReference<WebViewX> f23633a;

    /* JADX INFO: renamed from: l.ulp0$a */
    public class C1349a extends WebViewClientX {
        @Override // com.p000p1.mobile.putong.app.web.WebViewClientX, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m25271a() {
        String strF = RemoteConfig.x().F("webview_preInit");
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        try {
            return new JSONObject(strF).optBoolean("enable");
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25272b(Application application) {
        try {
            if (m25271a()) {
                System.currentTimeMillis();
                f23633a = new SoftReference<>(new WebViewX(application));
                m25273c();
            }
            shw.z();
        } catch (Throwable th) {
            CrashHelper.g(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m25273c() {
        WebViewX webViewX = f23633a.get();
        if (NullChecker.a(webViewX)) {
            webViewX.setWebViewClientX(new C1349a());
        }
    }
}
