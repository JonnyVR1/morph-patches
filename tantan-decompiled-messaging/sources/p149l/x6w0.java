package p149l;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class x6w0 {

    /* JADX INFO: renamed from: a */
    public static final x6w0 f191290a = new x6w0();

    /* JADX INFO: renamed from: a */
    public static final x6w0 m207211a() {
        return f191290a;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m207212i(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
            return true;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final void m207213b(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            y5w0.f196487a.getClass();
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("\"\"");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m207212i(webView, string2);
        } else {
            handler.post(new w6w0(this, webView, string2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m207214c(WebView webView) {
        m207213b(webView, "finishSession", new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public final void m207215d(WebView webView, JSONObject jSONObject) {
        m207213b(webView, "init", jSONObject);
    }

    /* JADX INFO: renamed from: e */
    public final void m207216e(WebView webView, float f) {
        m207213b(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* JADX INFO: renamed from: f */
    public final void m207217f(WebView webView, @NonNull JSONObject jSONObject) {
        m207213b(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: g */
    public final void m207218g(WebView webView, String str) {
        m207213b(webView, "setNativeViewHierarchy", str);
    }

    /* JADX INFO: renamed from: h */
    public final void m207219h(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m207213b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
