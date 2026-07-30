package com.p046p1.mobile.putong.app.web;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.immomo.mmdns.MDDNSEntrance;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.Map;
import p149l.bne0;
import p149l.ii5;
import p149l.mxv;
import p149l.vip0;
import p149l.wip0;
import p149l.xip0;
import p149l.yip0;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewClientX extends WebViewClient {
    public static final String TAG = "WebViewClientX";
    private static boolean enableWebViewDNS;
    private InterfaceC4701a mOnRenderProcessGoneListener;
    private Map<String, byte[]> postMap = new HashMap();

    public static class WebViewException extends Exception {
        public WebViewException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.web.WebViewClientX$a */
    public interface InterfaceC4701a {
    }

    private static boolean getWebDnsEnable() {
        return enableWebViewDNS;
    }

    private WebResourceResponse handleAllRequest(WebView webView, String str, String str2, WebResourceRequest webResourceRequest) {
        System.currentTimeMillis();
        webResourceRequest.getMethod();
        if (getWebDnsEnable() && MDDNSEntrance.getInstance().useDNS(Uri.parse(str).getHost())) {
            return ii5.m136335e(this.postMap.remove(str), webView, webResourceRequest);
        }
        return null;
    }

    public static void setEnableWebViewDNS(boolean z) {
        enableWebViewDNS = z;
    }

    public boolean continuePostUrl(String str, byte[] bArr) {
        mxv.m156926a(TAG, "WebViewClientX postUrl " + str);
        if (!getWebDnsEnable() || !MDDNSEntrance.getInstance().useDNS(Uri.parse(str).getHost())) {
            return false;
        }
        this.postMap.put(str, bArr);
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onPageFinished(WebView webView, String str) {
        if (webView instanceof WebViewX) {
            onPageFinishedX((WebViewX) webView, str);
        }
    }

    public void onPageFinishedX(WebViewX webViewX, String str) {
        super.onPageFinished(webViewX, str);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof WebViewX) {
            WebViewX webViewX = (WebViewX) webView;
            onPageStartedX(webViewX, str, bitmap);
            WebViewX.InterfaceC4702a interfaceC4702a = webViewX.f17206c;
            if (interfaceC4702a != null) {
                interfaceC4702a.mo29699a(webView, str);
            }
        }
    }

    public void onPageStartedX(WebViewX webViewX, String str, Bitmap bitmap) {
        super.onPageStarted(webViewX, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webView instanceof WebViewX) {
            onReceivedErrorX((WebViewX) webView, webResourceRequest != null ? new wip0(webResourceRequest) : null, webResourceError != null ? new vip0(webResourceError) : null);
        }
    }

    @SuppressLint({"NewApi"})
    public void onReceivedErrorX(WebViewX webViewX, wip0 wip0Var, vip0 vip0Var) {
        if (wip0Var == null || vip0Var == null) {
            return;
        }
        super.onReceivedError(webViewX, wip0Var.f186561a, vip0Var.f181630a);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    @Deprecated
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webView instanceof WebViewX) {
            WebViewX webViewX = (WebViewX) webView;
            yip0 yip0Var = null;
            wip0 wip0Var = webResourceRequest != null ? new wip0(webResourceRequest) : null;
            if (webResourceResponse != null) {
                yip0Var = new yip0();
                yip0Var.f198530a = webResourceResponse;
                yip0Var.f198532c = webResourceResponse.getEncoding();
                yip0Var.f198536g = webResourceResponse.getData();
                yip0Var.f198531b = webResourceResponse.getMimeType();
                yip0Var.f198534e = webResourceResponse.getReasonPhrase();
                yip0Var.f198535f = webResourceResponse.getResponseHeaders();
                yip0Var.f198533d = webResourceResponse.getStatusCode();
            }
            onReceivedHttpErrorX(webViewX, wip0Var, yip0Var);
        }
    }

    @RequiresApi(api = 23)
    public void onReceivedHttpErrorX(WebViewX webViewX, wip0 wip0Var, yip0 yip0Var) {
        super.onReceivedHttpError(webViewX, wip0Var, yip0Var.f198530a);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (!renderProcessGoneDetail.didCrash()) {
            return true;
        }
        if (!bne0.m102784m()) {
            return false;
        }
        CrashHelper.m81296c(new WebViewException("WebView rendering process crashed!"));
        return true;
    }

    public void setOnRenderProcessGoneListener(InterfaceC4701a interfaceC4701a) {
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (!(webView instanceof WebViewX)) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        xip0 xip0VarShouldInterceptRequestX = shouldInterceptRequestX((WebViewX) webView, new wip0(webResourceRequest));
        if (xip0VarShouldInterceptRequestX == null || TextUtils.isEmpty(xip0VarShouldInterceptRequestX.f193143b) || TextUtils.isEmpty(xip0VarShouldInterceptRequestX.f193142a) || xip0VarShouldInterceptRequestX.f193147f == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(xip0VarShouldInterceptRequestX.f193142a, xip0VarShouldInterceptRequestX.f193143b, xip0VarShouldInterceptRequestX.f193147f);
        if (xip0VarShouldInterceptRequestX.f193144c != -1 && !TextUtils.isEmpty(xip0VarShouldInterceptRequestX.f193145d)) {
            webResourceResponse.setStatusCodeAndReasonPhrase(xip0VarShouldInterceptRequestX.f193144c, xip0VarShouldInterceptRequestX.f193145d);
        }
        Map<String, String> map = xip0VarShouldInterceptRequestX.f193146e;
        if (map != null) {
            webResourceResponse.setResponseHeaders(map);
        }
        return webResourceResponse;
    }

    public xip0 shouldInterceptRequestX(WebViewX webViewX, wip0 wip0Var) {
        WebResourceResponse webResourceResponseHandleAllRequest = handleAllRequest(webViewX, wip0Var.getUrl().toString(), wip0Var.getMethod(), wip0Var);
        if (webResourceResponseHandleAllRequest == null) {
            return null;
        }
        xip0 xip0Var = new xip0(webResourceResponseHandleAllRequest.getMimeType(), webResourceResponseHandleAllRequest.getEncoding(), webResourceResponseHandleAllRequest.getData());
        xip0Var.f193144c = webResourceResponseHandleAllRequest.getStatusCode();
        xip0Var.f193145d = webResourceResponseHandleAllRequest.getReasonPhrase();
        xip0Var.f193146e = webResourceResponseHandleAllRequest.getResponseHeaders();
        return xip0Var;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewX.InterfaceC4702a interfaceC4702a;
        if (!(webView instanceof WebViewX)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        WebViewX webViewX = (WebViewX) webView;
        boolean zShouldOverrideUrlLoadingX = shouldOverrideUrlLoadingX(webViewX, str);
        if (!zShouldOverrideUrlLoadingX && (interfaceC4702a = webViewX.f17206c) != null) {
            interfaceC4702a.mo29699a(webView, str);
        }
        return zShouldOverrideUrlLoadingX;
    }

    public boolean shouldOverrideUrlLoadingX(WebViewX webViewX, String str) {
        return super.shouldOverrideUrlLoading(webViewX, str);
    }

    public void onReceivedErrorX(WebViewX webViewX, int i, String str, String str2) {
        super.onReceivedError(webViewX, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (webView instanceof WebViewX) {
            onReceivedErrorX((WebViewX) webView, i, str, str2);
        }
    }
}
