package com.p000p1.mobile.putong.app.web;

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
import l.bne0;
import l.ii5;
import l.mxv;
import l.y9t0;
import p006l.vip0;
import p006l.wip0;
import p006l.xip0;
import p006l.yip0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class WebViewClientX extends WebViewClient {
    public static final String TAG = "WebViewClientX";
    private static boolean enableWebViewDNS;
    private InterfaceC0127a mOnRenderProcessGoneListener;
    private Map<String, byte[]> postMap = new HashMap();

    public static class WebViewException extends Exception {
        public WebViewException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.web.WebViewClientX$a */
    public interface InterfaceC0127a {
    }

    private static boolean getWebDnsEnable() {
        return enableWebViewDNS;
    }

    private WebResourceResponse handleAllRequest(WebView webView, String str, String str2, WebResourceRequest webResourceRequest) {
        System.currentTimeMillis();
        webResourceRequest.getMethod();
        if (getWebDnsEnable() && MDDNSEntrance.getInstance().useDNS(Uri.parse(str).getHost())) {
            return ii5.e(this.postMap.remove(str), webView, webResourceRequest);
        }
        return null;
    }

    public static void setEnableWebViewDNS(boolean z) {
        enableWebViewDNS = z;
    }

    public boolean continuePostUrl(String str, byte[] bArr) {
        mxv.a(TAG, "WebViewClientX postUrl " + str);
        if (!getWebDnsEnable() || !MDDNSEntrance.getInstance().useDNS(Uri.parse(str).getHost())) {
            return false;
        }
        this.postMap.put(str, bArr);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onPageFinished(WebView webView, String str) {
        if (webView instanceof WebViewX) {
            onPageFinishedX((WebViewX) webView, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPageFinishedX(WebViewX webViewX, String str) {
        super.onPageFinished(webViewX, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof WebViewX) {
            WebViewX webViewX = (WebViewX) webView;
            onPageStartedX(webViewX, str, bitmap);
            WebViewX.InterfaceC0128a interfaceC0128a = webViewX.f1195c;
            if (interfaceC0128a != null) {
                interfaceC0128a.m1609a(webView, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPageStartedX(WebViewX webViewX, String str, Bitmap bitmap) {
        super.onPageStarted(webViewX, str, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webView instanceof WebViewX) {
            onReceivedErrorX((WebViewX) webView, webResourceRequest != null ? new wip0(webResourceRequest) : null, webResourceError != null ? new vip0(webResourceError) : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    public void onReceivedErrorX(WebViewX webViewX, wip0 wip0Var, vip0 vip0Var) {
        if (wip0Var == null || vip0Var == null) {
            return;
        }
        super.onReceivedError(webViewX, wip0Var.f25173a, vip0Var.f24338a);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                yip0Var.f28238a = webResourceResponse;
                yip0Var.f28240c = webResourceResponse.getEncoding();
                yip0Var.f28244g = webResourceResponse.getData();
                yip0Var.f28239b = webResourceResponse.getMimeType();
                yip0Var.f28242e = webResourceResponse.getReasonPhrase();
                yip0Var.f28243f = webResourceResponse.getResponseHeaders();
                yip0Var.f28241d = webResourceResponse.getStatusCode();
            }
            onReceivedHttpErrorX(webViewX, wip0Var, yip0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RequiresApi(api = 23)
    public void onReceivedHttpErrorX(WebViewX webViewX, wip0 wip0Var, yip0 yip0Var) {
        super.onReceivedHttpError(webViewX, wip0Var, yip0Var.f28238a);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (!y9t0.a(renderProcessGoneDetail)) {
            return true;
        }
        if (!bne0.m()) {
            return false;
        }
        CrashHelper.c(new WebViewException("WebView rendering process crashed!"));
        return true;
    }

    public void setOnRenderProcessGoneListener(InterfaceC0127a interfaceC0127a) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (!(webView instanceof WebViewX)) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        xip0 xip0VarShouldInterceptRequestX = shouldInterceptRequestX((WebViewX) webView, new wip0(webResourceRequest));
        if (xip0VarShouldInterceptRequestX == null || TextUtils.isEmpty(xip0VarShouldInterceptRequestX.f27536b) || TextUtils.isEmpty(xip0VarShouldInterceptRequestX.f27535a) || xip0VarShouldInterceptRequestX.f27540f == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(xip0VarShouldInterceptRequestX.f27535a, xip0VarShouldInterceptRequestX.f27536b, xip0VarShouldInterceptRequestX.f27540f);
        if (xip0VarShouldInterceptRequestX.f27537c != -1 && !TextUtils.isEmpty(xip0VarShouldInterceptRequestX.f27538d)) {
            webResourceResponse.setStatusCodeAndReasonPhrase(xip0VarShouldInterceptRequestX.f27537c, xip0VarShouldInterceptRequestX.f27538d);
        }
        Map<String, String> map = xip0VarShouldInterceptRequestX.f27539e;
        if (map != null) {
            webResourceResponse.setResponseHeaders(map);
        }
        return webResourceResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xip0 shouldInterceptRequestX(WebViewX webViewX, wip0 wip0Var) {
        WebResourceResponse webResourceResponseHandleAllRequest = handleAllRequest(webViewX, wip0Var.getUrl().toString(), wip0Var.getMethod(), wip0Var);
        if (webResourceResponseHandleAllRequest == null) {
            return null;
        }
        xip0 xip0Var = new xip0(webResourceResponseHandleAllRequest.getMimeType(), webResourceResponseHandleAllRequest.getEncoding(), webResourceResponseHandleAllRequest.getData());
        xip0Var.f27537c = webResourceResponseHandleAllRequest.getStatusCode();
        xip0Var.f27538d = webResourceResponseHandleAllRequest.getReasonPhrase();
        xip0Var.f27539e = webResourceResponseHandleAllRequest.getResponseHeaders();
        return xip0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    @Deprecated
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewX.InterfaceC0128a interfaceC0128a;
        if (!(webView instanceof WebViewX)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        WebViewX webViewX = (WebViewX) webView;
        boolean zShouldOverrideUrlLoadingX = shouldOverrideUrlLoadingX(webViewX, str);
        if (!zShouldOverrideUrlLoadingX && (interfaceC0128a = webViewX.f1195c) != null) {
            interfaceC0128a.m1609a(webView, str);
        }
        return zShouldOverrideUrlLoadingX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean shouldOverrideUrlLoadingX(WebViewX webViewX, String str) {
        return super.shouldOverrideUrlLoading((WebView) webViewX, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onReceivedErrorX(WebViewX webViewX, int i, String str, String str2) {
        super.onReceivedError(webViewX, i, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    @Deprecated
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (webView instanceof WebViewX) {
            onReceivedErrorX((WebViewX) webView, i, str, str2);
        }
    }
}
