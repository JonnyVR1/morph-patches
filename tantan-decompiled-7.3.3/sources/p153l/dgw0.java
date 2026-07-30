package p153l;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class dgw0 {

    /* JADX INFO: renamed from: a */
    public static final dgw0 f88399a = new dgw0();

    /* JADX INFO: renamed from: a */
    public static final dgw0 m115758a() {
        return f88399a;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m115759i(WebView webView, String str) {
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
    public final void m115760b(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            efw0.f93875a.getClass();
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
            m115759i(webView, string2);
        } else {
            handler.post(new cgw0(this, webView, string2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m115761c(WebView webView) {
        m115760b(webView, "finishSession", new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public final void m115762d(WebView webView, JSONObject jSONObject) {
        m115760b(webView, "init", jSONObject);
    }

    /* JADX INFO: renamed from: e */
    public final void m115763e(WebView webView, float f) {
        m115760b(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* JADX INFO: renamed from: f */
    public final void m115764f(WebView webView, @NonNull JSONObject jSONObject) {
        m115760b(webView, "setLastActivity", jSONObject);
    }

    /* JADX INFO: renamed from: g */
    public final void m115765g(WebView webView, String str) {
        m115760b(webView, "setNativeViewHierarchy", str);
    }

    /* JADX INFO: renamed from: h */
    public final void m115766h(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m115760b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
