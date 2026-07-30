package com.sina.weibo.sdk.web.client;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.WbUtils;
import com.sina.weibo.sdk.web.WebViewRequestCallback;
import com.sina.weibo.sdk.web.WeiboCallbackManager;
import com.sina.weibo.sdk.web.WeiboSdkWebActivity;
import com.sina.weibo.sdk.web.param.BaseWebViewRequestParam;

/* JADX INFO: loaded from: classes11.dex */
public class ShareWebViewClient extends BaseWebViewClient {
    private static final String RESP_PARAM_CODE = "code";
    private static final String RESP_PARAM_MSG = "msg";
    private static final String RESP_SUCC_CODE = "0";
    private Activity activity;
    private boolean hasCallbacked;

    public ShareWebViewClient(Activity activity, WebViewRequestCallback webViewRequestCallback, BaseWebViewRequestParam baseWebViewRequestParam) {
        super(webViewRequestCallback, baseWebViewRequestParam);
        this.hasCallbacked = false;
        this.activity = activity;
    }

    private boolean needOverLoad(String str) {
        if (!str.startsWith(WeiboSdkWebActivity.BROWSER_CLOSE_SCHEME)) {
            return false;
        }
        Bundle uri = WbUtils.parseUri(str);
        if (this.param.getBaseData() != null && !TextUtils.isEmpty(this.param.getBaseData().getCallback())) {
            String callback = this.param.getBaseData().getCallback();
            WeiboCallbackManager weiboCallbackManager = WeiboCallbackManager.getInstance();
            if (weiboCallbackManager.getWeiboAuthListener(callback) != null && !uri.isEmpty()) {
                weiboCallbackManager.removeWeiboAuthListener(callback);
            }
        }
        String string = uri.getString("code");
        String string2 = uri.getString("msg");
        if (TextUtils.isEmpty(string)) {
            sendSdkCancleResponse(this.activity);
        } else {
            boolean zEquals = "0".equals(string);
            Activity activity = this.activity;
            if (zEquals) {
                sendSdkOkResponse(activity);
            } else {
                sendSdkErrorResponse(activity, string2);
            }
        }
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback == null) {
            return true;
        }
        webViewRequestCallback.closePage();
        return true;
    }

    private void sendSdkResponse(Activity activity, int i, String str) {
        LogUtil.m80480i("Share", "WebActivity.sendSdkResponse,errCode:" + i + ",errMsg:" + str);
        Bundle extras = activity.getIntent().getExtras();
        if (extras == null || this.hasCallbacked) {
            return;
        }
        Intent intent = new Intent(WBConstants.ACTIVITY_REQ_SDK);
        String string = extras.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        intent.setFlags(131072);
        intent.setPackage(string);
        intent.putExtras(extras);
        intent.putExtra(WBConstants.Base.APP_PKG, activity.getPackageName());
        intent.putExtra(WBConstants.Response.ERRCODE, i);
        intent.putExtra(WBConstants.Response.ERRMSG, str);
        try {
            activity.startActivityForResult(intent, WBConstants.SDK_ACTIVITY_FOR_RESULT_CODE);
        } catch (ActivityNotFoundException unused) {
        }
        this.hasCallbacked = true;
    }

    @Override // com.sina.weibo.sdk.web.client.BaseWebViewClient
    public void closeWeb() {
        super.closeWeb();
        sendSdkCancleResponse(this.activity);
    }

    @Override // com.sina.weibo.sdk.web.client.BaseWebViewClient
    public void errorBack(Activity activity, String str) {
        super.errorBack(activity, str);
        sendSdkErrorResponse(activity, str);
    }

    @Override // com.sina.weibo.sdk.web.client.BaseWebViewClient
    public boolean onBackKeyDown() {
        closeWeb();
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback == null) {
            return true;
        }
        webViewRequestCallback.closePage();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.onPageFinishedCallBack(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.onPageStartedCallBack(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.onReceivedErrorCallBack(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }

    public void sendSdkCancleResponse(Activity activity) {
        sendSdkResponse(activity, 1, "send cancel!!!");
    }

    public void sendSdkErrorResponse(Activity activity, String str) {
        sendSdkResponse(activity, 2, str);
    }

    public void sendSdkOkResponse(Activity activity) {
        sendSdkResponse(activity, 0, "send ok!!!");
    }

    @Override // com.sina.weibo.sdk.web.client.BaseWebViewClient, android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return needOverLoad(webResourceRequest.getUrl().toString());
    }

    @Override // com.sina.weibo.sdk.web.client.BaseWebViewClient, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.shouldOverrideUrlLoadingCallBack(webView, str);
        }
        return needOverLoad(str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.onReceivedErrorCallBack(webView, i, str, str2);
        }
    }
}
