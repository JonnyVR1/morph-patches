package p153l;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public interface grp0 {
    /* JADX INFO: renamed from: a */
    void mo18260a(WebView webView, String str, Bitmap bitmap);

    /* JADX INFO: renamed from: b */
    void mo18261b(WebView webView, String str);

    /* JADX INFO: renamed from: c */
    void mo18262c(String str, Exception exc);

    /* JADX INFO: renamed from: d */
    void mo18263d(String str, int i, String str2, String str3);

    void dispose();

    /* JADX INFO: renamed from: e */
    void mo18264e(String str, SslErrorHandler sslErrorHandler, SslError sslError);

    /* JADX INFO: renamed from: f */
    void mo18265f(WebView webView, int i);
}
