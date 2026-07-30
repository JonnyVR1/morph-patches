package p149l;

import android.app.Application;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.p046p1.mobile.putong.app.web.WebViewClientX;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ulp0 {

    /* JADX INFO: renamed from: a */
    public static SoftReference<WebViewX> f177087a;

    /* JADX INFO: renamed from: l.ulp0$a */
    public class C20455a extends WebViewClientX {
        @Override // com.p046p1.mobile.putong.app.web.WebViewClientX, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m194255a() {
        String strM79302F = RemoteConfig.m79298x().m79302F("webview_preInit");
        if (TextUtils.isEmpty(strM79302F)) {
            return false;
        }
        try {
            return new JSONObject(strM79302F).optBoolean("enable");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m194256b(Application application) {
        try {
            if (m194255a()) {
                System.currentTimeMillis();
                f177087a = new SoftReference<>(new WebViewX(application));
                m194257c();
            }
            shw.m184306z();
        } catch (Throwable th) {
            CrashHelper.m81300g(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m194257c() {
        WebViewX webViewX = f177087a.get();
        if (NullChecker.m81303a(webViewX)) {
            webViewX.setWebViewClientX(new C20455a());
        }
    }
}
