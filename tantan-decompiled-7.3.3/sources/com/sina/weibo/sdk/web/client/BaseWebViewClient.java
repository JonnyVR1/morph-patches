package com.sina.weibo.sdk.web.client;

import android.annotation.TargetApi;
import android.app.Activity;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sina.weibo.sdk.web.WebViewRequestCallback;
import com.sina.weibo.sdk.web.param.BaseWebViewRequestParam;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseWebViewClient extends WebViewClient {
    protected BaseWebViewRequestParam param;
    protected WebViewRequestCallback requestCallback;

    public BaseWebViewClient(WebViewRequestCallback webViewRequestCallback, BaseWebViewRequestParam baseWebViewRequestParam) {
        this.requestCallback = webViewRequestCallback;
        this.param = baseWebViewRequestParam;
    }

    public void closeWeb() {
    }

    public void errorBack(Activity activity, String str) {
    }

    public boolean onBackKeyDown() {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.onReceivedSslErrorCallBack(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.shouldOverrideUrlLoadingCallBack(webView, webResourceRequest.getUrl().toString());
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.shouldOverrideUrlLoadingCallBack(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
