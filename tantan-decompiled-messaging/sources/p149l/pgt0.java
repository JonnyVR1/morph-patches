package p149l;

import android.webkit.WebView;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class pgt0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("WebViewUtil.class")
    public static Boolean f148827a;

    /* JADX INFO: renamed from: a */
    public static void m168901a(WebView webView, String str) {
        boolean zBooleanValue;
        synchronized (pgt0.class) {
            if (f148827a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f148827a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    f148827a = Boolean.FALSE;
                }
                zBooleanValue = f148827a.booleanValue();
            } else {
                zBooleanValue = f148827a.booleanValue();
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
