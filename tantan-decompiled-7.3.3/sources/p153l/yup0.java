package p153l;

import android.app.Application;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.p051p1.mobile.putong.app.web.WebViewClientX;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class yup0 {

    /* JADX INFO: renamed from: a */
    public static SoftReference<WebViewX> f201655a;

    /* JADX INFO: renamed from: l.yup0$a */
    public class C21687a extends WebViewClientX {
        @Override // com.p051p1.mobile.putong.app.web.WebViewClientX, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m217462a() {
        String strM80485F = RemoteConfig.m80481x().m80485F("webview_preInit");
        if (TextUtils.isEmpty(strM80485F)) {
            return false;
        }
        try {
            return new JSONObject(strM80485F).optBoolean("enable");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m217463b(Application application) {
        try {
            if (m217462a()) {
                System.currentTimeMillis();
                f201655a = new SoftReference<>(new WebViewX(application));
                m217464c();
            }
            MKConfigSetter.INSTANCE.m17768k();
        } catch (Throwable th) {
            CrashHelper.m82483g(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m217464c() {
        WebViewX webViewX = f201655a.get();
        if (NullChecker.m82486a(webViewX)) {
            webViewX.setWebViewClientX(new C21687a());
        }
    }
}
