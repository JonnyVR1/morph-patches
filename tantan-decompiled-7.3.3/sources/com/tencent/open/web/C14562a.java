package com.tencent.open.web;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.tencent.open.log.SLog;

/* JADX INFO: renamed from: com.tencent.open.web.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14562a {
    /* JADX INFO: renamed from: a */
    private static void m85701a(WebSettings webSettings) {
        try {
            webSettings.setSavePassword(false);
            webSettings.setAllowFileAccess(false);
            webSettings.setAllowFileAccessFromFileURLs(false);
            webSettings.setAllowUniversalAccessFromFileURLs(false);
        } catch (Exception e) {
            SLog.m85491e("WebViewUtils", "Exception", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m85704b(WebView webView) {
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
    }

    /* JADX INFO: renamed from: b */
    private static void m85703b(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m85702a(WebView webView) {
        if (webView == null) {
            return;
        }
        m85704b(webView);
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            m85701a(settings);
            m85703b(settings);
        }
    }
}
