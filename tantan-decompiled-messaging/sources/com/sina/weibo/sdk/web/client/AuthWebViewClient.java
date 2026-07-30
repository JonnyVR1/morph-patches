package com.sina.weibo.sdk.web.client;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sina.weibo.sdk.auth.AccessTokenKeeper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.auth.WbConnectErrorMessage;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.Utility;
import com.sina.weibo.sdk.web.WebViewRequestCallback;
import com.sina.weibo.sdk.web.WeiboCallbackManager;
import com.sina.weibo.sdk.web.WeiboSdkWebActivity;
import com.sina.weibo.sdk.web.param.BaseWebViewRequestParam;
import com.tencent.youtu.sdkkitframework.common.StateEvent;

/* JADX INFO: loaded from: classes11.dex */
public class AuthWebViewClient extends BaseWebViewClient {
    private static final String TAG = "AuthWebViewClient";
    private boolean authed;
    private Context context;

    public AuthWebViewClient(WebViewRequestCallback webViewRequestCallback, Context context, BaseWebViewRequestParam baseWebViewRequestParam) {
        super(webViewRequestCallback, baseWebViewRequestParam);
        this.authed = false;
        this.context = context;
    }

    private void handleRedirectUrl(String str) {
        WbAuthListener weiboAuthListener;
        Bundle url = Utility.parseUrl(str);
        String string = url.getString("error");
        String string2 = url.getString(StateEvent.Name.ERROR_CODE);
        String string3 = url.getString("error_description");
        if (this.param.getBaseData() == null || TextUtils.isEmpty(this.param.getBaseData().getCallback())) {
            weiboAuthListener = null;
        } else {
            String callback = this.param.getBaseData().getCallback();
            WeiboCallbackManager weiboCallbackManager = WeiboCallbackManager.getInstance();
            weiboAuthListener = weiboCallbackManager.getWeiboAuthListener(callback);
            weiboCallbackManager.removeWeiboAuthListener(callback);
        }
        if (string != null || string2 != null) {
            if (weiboAuthListener != null) {
                weiboAuthListener.onFailure(new WbConnectErrorMessage(string2, string3));
            }
        } else if (weiboAuthListener != null) {
            Oauth2AccessToken accessToken = Oauth2AccessToken.parseAccessToken(url);
            AccessTokenKeeper.writeAccessToken(this.context, accessToken);
            weiboAuthListener.onSuccess(accessToken);
        }
    }

    private boolean isMatchWithRedirectUrl(String str) {
        Uri uri = Uri.parse(this.param.getBaseData().getAuthInfo().getRedirectUrl());
        Uri uri2 = Uri.parse(str);
        String host = uri.getHost();
        return !TextUtils.isEmpty(host) && host.equals(uri2.getHost());
    }

    private boolean needOverLoad(WebView webView, String str) {
        if (str.startsWith("sms:")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.putExtra(PlaceTypes.ADDRESS, str.replace("sms:", ""));
                intent.setType("vnd.android-dir/mms-sms");
                this.context.startActivity(intent);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        if (!str.startsWith(WeiboSdkWebActivity.BROWSER_CLOSE_SCHEME)) {
            return isMatchWithRedirectUrl(str) && !TextUtils.isEmpty(Utility.parseUrl(str).getString("access_token"));
        }
        if (this.param.getBaseData() != null && !TextUtils.isEmpty(this.param.getBaseData().getCallback())) {
            String callback = this.param.getBaseData().getCallback();
            WeiboCallbackManager weiboCallbackManager = WeiboCallbackManager.getInstance();
            if (weiboCallbackManager.getWeiboAuthListener(callback) != null) {
                weiboCallbackManager.getWeiboAuthListener(callback).cancel();
            }
            weiboCallbackManager.removeWeiboAuthListener(callback);
        }
        return true;
    }

    @Override // com.sina.weibo.sdk.web.client.BaseWebViewClient
    public void closeWeb() {
        super.closeWeb();
        if (this.param.getBaseData() == null || TextUtils.isEmpty(this.param.getBaseData().getCallback())) {
            return;
        }
        String callback = this.param.getBaseData().getCallback();
        WeiboCallbackManager weiboCallbackManager = WeiboCallbackManager.getInstance();
        if (weiboCallbackManager.getWeiboAuthListener(callback) != null) {
            weiboCallbackManager.getWeiboAuthListener(callback).cancel();
        }
        weiboCallbackManager.removeWeiboAuthListener(callback);
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
        LogUtil.m80478d(TAG, "onPageFinished:");
        super.onPageFinished(webView, str);
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.onPageFinishedCallBack(webView, str);
        }
        if (!isMatchWithRedirectUrl(str) || this.authed) {
            return;
        }
        this.authed = true;
        handleRedirectUrl(str);
        webView.stopLoading();
        WebViewRequestCallback webViewRequestCallback2 = this.requestCallback;
        if (webViewRequestCallback2 != null) {
            webViewRequestCallback2.closePage();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        LogUtil.m80478d(TAG, "onPageStarted:");
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.onPageStartedCallBack(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        LogUtil.m80478d(TAG, "onReceivedError");
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.onReceivedErrorCallBack(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }

    @Override // com.sina.weibo.sdk.web.client.BaseWebViewClient, android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        LogUtil.m80478d(TAG, "shouldOverrideUrlLoading,request.getUrl()");
        return needOverLoad(webView, webResourceRequest.getUrl().toString());
    }

    @Override // com.sina.weibo.sdk.web.client.BaseWebViewClient, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        LogUtil.m80478d(TAG, "shouldOverrideUrlLoading,url");
        return needOverLoad(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        LogUtil.m80478d(TAG, "onReceivedError");
        WebViewRequestCallback webViewRequestCallback = this.requestCallback;
        if (webViewRequestCallback != null) {
            webViewRequestCallback.onReceivedErrorCallBack(webView, i, str, str2);
        }
    }
}
