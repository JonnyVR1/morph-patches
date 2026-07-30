package p006l;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.p000p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class thp0 extends WebChromeClient {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return webView instanceof WebViewX ? onShowFileChooserX((WebViewX) webView, new prk0<>(valueCallback), new ofi(fileChooserParams)) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onShowFileChooserX(WebViewX webViewX, prk0<Uri[]> prk0Var, ofi ofiVar) {
        return super.onShowFileChooser(webViewX, prk0Var.f19276a, ofiVar.f18222a);
    }
}
