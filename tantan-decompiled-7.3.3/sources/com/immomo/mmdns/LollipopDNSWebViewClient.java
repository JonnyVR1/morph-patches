package com.immomo.mmdns;

import android.annotation.TargetApi;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p153l.jj5;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(21)
public class LollipopDNSWebViewClient extends WebViewClient {
    private boolean enableWebDns;
    private WebView mWebView;

    public LollipopDNSWebViewClient(boolean z, WebView webView) {
        this.enableWebDns = z;
        this.mWebView = webView;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebView webView2 = this.mWebView;
        if (webView2 == null) {
            return true;
        }
        ViewParent parent = webView2.getParent();
        if (!(parent instanceof ViewGroup)) {
            return true;
        }
        ((ViewGroup) parent).removeView(this.mWebView);
        this.mWebView.destroy();
        this.mWebView = null;
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, byte[] bArr) {
        WebResourceResponse webResourceResponseM145011e;
        return (!this.enableWebDns || (webResourceResponseM145011e = jj5.m145011e(bArr, webView, webResourceRequest)) == null) ? super.shouldInterceptRequest(webView, webResourceRequest) : webResourceResponseM145011e;
    }

    public LollipopDNSWebViewClient(boolean z) {
        this.enableWebDns = z;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, webResourceRequest, null);
    }
}
