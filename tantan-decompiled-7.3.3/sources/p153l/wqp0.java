package p153l;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.p051p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes9.dex */
public class wqp0 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return webView instanceof WebViewX ? onShowFileChooserX((WebViewX) webView, new v0l0<>(valueCallback), new lii(fileChooserParams)) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public boolean onShowFileChooserX(WebViewX webViewX, v0l0<Uri[]> v0l0Var, lii liiVar) {
        return super.onShowFileChooser(webViewX, v0l0Var.f181884a, liiVar.f132222a);
    }
}
