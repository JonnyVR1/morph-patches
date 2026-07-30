package com.p051p1.mobile.putong.app.web;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p151v.VWebView;
import p153l.wqp0;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewX extends VWebView {

    /* JADX INFO: renamed from: d */
    public static String f17922d = "";

    /* JADX INFO: renamed from: a */
    public boolean f17923a;

    /* JADX INFO: renamed from: b */
    public WebViewClientX f17924b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4853a f17925c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.web.WebViewX$a */
    public interface InterfaceC4853a {
        /* JADX INFO: renamed from: a */
        void mo30697a(WebView webView, String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.web.WebViewX$b */
    public interface InterfaceC4854b {
    }

    public WebViewX(Context context) {
        super(m30693g(context));
    }

    /* JADX INFO: renamed from: g */
    public static Context m30693g(Context context) {
        return context;
    }

    @Override // p151v.VWebView
    /* JADX INFO: renamed from: a */
    public void mo30694a() {
        if (TextUtils.isEmpty(f17922d)) {
            f17922d = getSettings().getUserAgentString();
        }
        m224561d();
    }

    /* JADX INFO: renamed from: f */
    public void m30695f(String str, byte[] bArr) {
        if (this.f17924b.continuePostUrl(str, bArr)) {
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
    public void m30696h(boolean z) {
        this.f17923a = z;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onCheckIsTextEditor() {
        return this.f17923a;
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        m30695f(str, bArr);
    }

    public void setCurrentUrlCallback(InterfaceC4853a interfaceC4853a) {
        this.f17925c = interfaceC4853a;
    }

    public void setOverScrollListener(InterfaceC4854b interfaceC4854b) {
    }

    @Override // android.webkit.WebView
    @Deprecated
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        throw new RuntimeException("you should use the method setWebChromeClientX(WebChromeClientX)");
    }

    public void setWebChromeClientX(wqp0 wqp0Var) {
        super.setWebChromeClient(wqp0Var);
    }

    @Override // android.webkit.WebView
    @Deprecated
    public void setWebViewClient(WebViewClient webViewClient) {
        throw new RuntimeException("you should use the method setWebViewClientX(WebViewClientX)");
    }

    public void setWebViewClientX(WebViewClientX webViewClientX) {
        this.f17924b = webViewClientX;
        super.setWebViewClient(webViewClientX);
    }

    public WebViewX(Context context, AttributeSet attributeSet, int i) {
        super(m30693g(context), attributeSet, i);
    }

    public WebViewX(Context context, AttributeSet attributeSet) {
        super(m30693g(context), attributeSet);
    }
}
