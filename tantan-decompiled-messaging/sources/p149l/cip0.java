package p149l;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public interface cip0 {
    /* JADX INFO: renamed from: a */
    void mo107088a(WebView webView, String str, Bitmap bitmap);

    /* JADX INFO: renamed from: b */
    void mo107089b(WebView webView, String str);

    /* JADX INFO: renamed from: c */
    void mo107090c(String str, Exception exc);

    /* JADX INFO: renamed from: d */
    void mo107091d(String str, int i, String str2, String str3);

    void dispose();

    /* JADX INFO: renamed from: e */
    void mo107092e(String str, SslErrorHandler sslErrorHandler, SslError sslError);

    /* JADX INFO: renamed from: f */
    void mo107093f(WebView webView, int i);
}
