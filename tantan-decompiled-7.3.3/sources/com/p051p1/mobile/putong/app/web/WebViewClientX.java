package com.p051p1.mobile.putong.app.web;

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
import p153l.asp0;
import p153l.bsp0;
import p153l.csp0;
import p153l.dsp0;
import p153l.ive0;
import p153l.jj5;
import p153l.jzv;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewClientX extends WebViewClient {
    public static final String TAG = "WebViewClientX";
    private static boolean enableWebViewDNS;
    private InterfaceC4852a mOnRenderProcessGoneListener;
    private Map<String, byte[]> postMap = new HashMap();

    public static class WebViewException extends Exception {
        public WebViewException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.app.web.WebViewClientX$a */
    public interface InterfaceC4852a {
    }

    private static boolean getWebDnsEnable() {
        return enableWebViewDNS;
    }

    private WebResourceResponse handleAllRequest(WebView webView, String str, String str2, WebResourceRequest webResourceRequest) {
        System.currentTimeMillis();
        webResourceRequest.getMethod();
        if (getWebDnsEnable() && MDDNSEntrance.getInstance().useDNS(Uri.parse(str).getHost())) {
            return jj5.m145011e(this.postMap.remove(str), webView, webResourceRequest);
        }
        return null;
    }

    public static void setEnableWebViewDNS(boolean z) {
        enableWebViewDNS = z;
    }

    public boolean continuePostUrl(String str, byte[] bArr) {
        jzv.m147728a(TAG, "WebViewClientX postUrl " + str);
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
            WebViewX.InterfaceC4853a interfaceC4853a = webViewX.f17925c;
            if (interfaceC4853a != null) {
                interfaceC4853a.mo30697a(webView, str);
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
            onReceivedErrorX((WebViewX) webView, webResourceRequest != null ? new bsp0(webResourceRequest) : null, webResourceError != null ? new asp0(webResourceError) : null);
        }
    }

    @SuppressLint({"NewApi"})
    public void onReceivedErrorX(WebViewX webViewX, bsp0 bsp0Var, asp0 asp0Var) {
        if (bsp0Var == null || asp0Var == null) {
            return;
        }
        super.onReceivedError(webViewX, bsp0Var.f78184a, asp0Var.f73162a);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    @Deprecated
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webView instanceof WebViewX) {
            WebViewX webViewX = (WebViewX) webView;
            dsp0 dsp0Var = null;
            bsp0 bsp0Var = webResourceRequest != null ? new bsp0(webResourceRequest) : null;
            if (webResourceResponse != null) {
                dsp0Var = new dsp0();
                dsp0Var.f90502a = webResourceResponse;
                dsp0Var.f90504c = webResourceResponse.getEncoding();
                dsp0Var.f90508g = webResourceResponse.getData();
                dsp0Var.f90503b = webResourceResponse.getMimeType();
                dsp0Var.f90506e = webResourceResponse.getReasonPhrase();
                dsp0Var.f90507f = webResourceResponse.getResponseHeaders();
                dsp0Var.f90505d = webResourceResponse.getStatusCode();
            }
            onReceivedHttpErrorX(webViewX, bsp0Var, dsp0Var);
        }
    }

    @RequiresApi(api = 23)
    public void onReceivedHttpErrorX(WebViewX webViewX, bsp0 bsp0Var, dsp0 dsp0Var) {
        super.onReceivedHttpError(webViewX, bsp0Var, dsp0Var.f90502a);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (!renderProcessGoneDetail.didCrash()) {
            return true;
        }
        if (!ive0.m142299m()) {
            return false;
        }
        CrashHelper.m82479c(new WebViewException("WebView rendering process crashed!"));
        return true;
    }

    public void setOnRenderProcessGoneListener(InterfaceC4852a interfaceC4852a) {
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (!(webView instanceof WebViewX)) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        csp0 csp0VarShouldInterceptRequestX = shouldInterceptRequestX((WebViewX) webView, new bsp0(webResourceRequest));
        if (csp0VarShouldInterceptRequestX == null || TextUtils.isEmpty(csp0VarShouldInterceptRequestX.f83475b) || TextUtils.isEmpty(csp0VarShouldInterceptRequestX.f83474a) || csp0VarShouldInterceptRequestX.f83479f == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(csp0VarShouldInterceptRequestX.f83474a, csp0VarShouldInterceptRequestX.f83475b, csp0VarShouldInterceptRequestX.f83479f);
        if (csp0VarShouldInterceptRequestX.f83476c != -1 && !TextUtils.isEmpty(csp0VarShouldInterceptRequestX.f83477d)) {
            webResourceResponse.setStatusCodeAndReasonPhrase(csp0VarShouldInterceptRequestX.f83476c, csp0VarShouldInterceptRequestX.f83477d);
        }
        Map<String, String> map = csp0VarShouldInterceptRequestX.f83478e;
        if (map != null) {
            webResourceResponse.setResponseHeaders(map);
        }
        return webResourceResponse;
    }

    public csp0 shouldInterceptRequestX(WebViewX webViewX, bsp0 bsp0Var) {
        WebResourceResponse webResourceResponseHandleAllRequest = handleAllRequest(webViewX, bsp0Var.getUrl().toString(), bsp0Var.getMethod(), bsp0Var);
        if (webResourceResponseHandleAllRequest == null) {
            return null;
        }
        csp0 csp0Var = new csp0(webResourceResponseHandleAllRequest.getMimeType(), webResourceResponseHandleAllRequest.getEncoding(), webResourceResponseHandleAllRequest.getData());
        csp0Var.f83476c = webResourceResponseHandleAllRequest.getStatusCode();
        csp0Var.f83477d = webResourceResponseHandleAllRequest.getReasonPhrase();
        csp0Var.f83478e = webResourceResponseHandleAllRequest.getResponseHeaders();
        return csp0Var;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewX.InterfaceC4853a interfaceC4853a;
        if (!(webView instanceof WebViewX)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        WebViewX webViewX = (WebViewX) webView;
        boolean zShouldOverrideUrlLoadingX = shouldOverrideUrlLoadingX(webViewX, str);
        if (!zShouldOverrideUrlLoadingX && (interfaceC4853a = webViewX.f17925c) != null) {
            interfaceC4853a.mo30697a(webView, str);
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
