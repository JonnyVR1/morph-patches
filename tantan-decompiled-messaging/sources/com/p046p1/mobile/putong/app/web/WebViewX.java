package com.p046p1.mobile.putong.app.web;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p147v.VWebView;
import p149l.thp0;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewX extends VWebView {

    /* JADX INFO: renamed from: d */
    public static String f17203d = "";

    /* JADX INFO: renamed from: a */
    public boolean f17204a;

    /* JADX INFO: renamed from: b */
    public WebViewClientX f17205b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4702a f17206c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.web.WebViewX$a */
    public interface InterfaceC4702a {
        /* JADX INFO: renamed from: a */
        void mo29699a(WebView webView, String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.web.WebViewX$b */
    public interface InterfaceC4703b {
    }

    public WebViewX(Context context) {
        super(m29695g(context));
    }

    /* JADX INFO: renamed from: g */
    public static Context m29695g(Context context) {
        return context;
    }

    @Override // p147v.VWebView
    /* JADX INFO: renamed from: a */
    public void mo29696a() {
        if (TextUtils.isEmpty(f17203d)) {
            f17203d = getSettings().getUserAgentString();
        }
        m223315d();
    }

    /* JADX INFO: renamed from: f */
    public void m29697f(String str, byte[] bArr) {
        if (this.f17205b.continuePostUrl(str, bArr)) {
            super.loadUrl(str);
        } else {
            super.postUrl(str, bArr);
        }
    }

    public int getHeightX() {
        return getHeight();
    }

    public int getWidthX() {
        return getWidth();
    }

    /* JADX INFO: renamed from: h */
    public void m29698h(boolean z) {
        this.f17204a = z;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onCheckIsTextEditor() {
        return this.f17204a;
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        m29697f(str, bArr);
    }

    public void setCurrentUrlCallback(InterfaceC4702a interfaceC4702a) {
        this.f17206c = interfaceC4702a;
    }

    public void setOverScrollListener(InterfaceC4703b interfaceC4703b) {
    }

    @Override // android.webkit.WebView
    @Deprecated
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        throw new RuntimeException("you should use the method setWebChromeClientX(WebChromeClientX)");
    }

    public void setWebChromeClientX(thp0 thp0Var) {
        super.setWebChromeClient(thp0Var);
    }

    @Override // android.webkit.WebView
    @Deprecated
    public void setWebViewClient(WebViewClient webViewClient) {
        throw new RuntimeException("you should use the method setWebViewClientX(WebViewClientX)");
    }

    public void setWebViewClientX(WebViewClientX webViewClientX) {
        this.f17205b = webViewClientX;
        super.setWebViewClient(webViewClientX);
    }

    public WebViewX(Context context, AttributeSet attributeSet, int i) {
        super(m29695g(context), attributeSet, i);
    }

    public WebViewX(Context context, AttributeSet attributeSet) {
        super(m29695g(context), attributeSet);
    }
}
