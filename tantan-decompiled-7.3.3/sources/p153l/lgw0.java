package p153l;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class lgw0 extends kgw0 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public lgw0(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m149773j(webView);
    }
}
