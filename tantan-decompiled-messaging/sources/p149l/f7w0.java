package p149l;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class f7w0 extends e7w0 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public f7w0(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m115225j(webView);
    }
}
