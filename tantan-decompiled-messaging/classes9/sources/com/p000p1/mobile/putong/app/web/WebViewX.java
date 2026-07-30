package com.p000p1.mobile.putong.app.web;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p006l.thp0;
import v.VWebView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class WebViewX extends VWebView {

    /* JADX INFO: renamed from: d */
    public static String f1192d = "";

    /* JADX INFO: renamed from: a */
    public boolean f1193a;

    /* JADX INFO: renamed from: b */
    public WebViewClientX f1194b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0128a f1195c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.web.WebViewX$a */
    public interface InterfaceC0128a {
        /* JADX INFO: renamed from: a */
        void m1609a(WebView webView, String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.web.WebViewX$b */
    public interface InterfaceC0129b {
    }

    public WebViewX(Context context) {
        super(m1605g(context));
    }

    /* JADX INFO: renamed from: g */
    public static Context m1605g(Context context) {
        return context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m1606a() {
        if (TextUtils.isEmpty(f1192d)) {
            f1192d = getSettings().getUserAgentString();
        }
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m1607f(String str, byte[] bArr) {
        if (this.f1194b.continuePostUrl(str, bArr)) {
            super/*android.webkit.WebView*/.loadUrl(str);
        } else {
            super/*android.webkit.WebView*/.postUrl(str, bArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getHeightX() {
        return getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getWidthX() {
        return getWidth();
    }

    /* JADX INFO: renamed from: h */
    public void m1608h(boolean z) {
        this.f1193a = z;
    }

    public boolean onCheckIsTextEditor() {
        return this.f1193a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super/*android.view.View*/.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public void postUrl(String str, byte[] bArr) {
        m1607f(str, bArr);
    }

    public void setCurrentUrlCallback(InterfaceC0128a interfaceC0128a) {
        this.f1195c = interfaceC0128a;
    }

    public void setOverScrollListener(InterfaceC0129b interfaceC0129b) {
    }

    @Deprecated
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        throw new RuntimeException("you should use the method setWebChromeClientX(WebChromeClientX)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebChromeClientX(thp0 thp0Var) {
        super/*android.webkit.WebView*/.setWebChromeClient(thp0Var);
    }

    @Deprecated
    public void setWebViewClient(WebViewClient webViewClient) {
        throw new RuntimeException("you should use the method setWebViewClientX(WebViewClientX)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClientX(WebViewClientX webViewClientX) {
        this.f1194b = webViewClientX;
        super/*android.webkit.WebView*/.setWebViewClient(webViewClientX);
    }

    public WebViewX(Context context, AttributeSet attributeSet, int i) {
        super(m1605g(context), attributeSet, i);
    }

    public WebViewX(Context context, AttributeSet attributeSet) {
        super(m1605g(context), attributeSet);
    }
}
