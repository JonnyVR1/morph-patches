package p153l;

import android.webkit.WebView;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class vpt0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("WebViewUtil.class")
    public static Boolean f185303a;

    /* JADX INFO: renamed from: a */
    public static void m202343a(WebView webView, String str) {
        boolean zBooleanValue;
        synchronized (vpt0.class) {
            if (f185303a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f185303a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    f185303a = Boolean.FALSE;
                }
                zBooleanValue = f185303a.booleanValue();
            } else {
                zBooleanValue = f185303a.booleanValue();
            }
            throw th;
        }
        if (zBooleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
