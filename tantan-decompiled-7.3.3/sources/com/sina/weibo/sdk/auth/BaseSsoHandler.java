package com.sina.weibo.sdk.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.sina.weibo.sdk.sso.WeiboSsoManager;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.NetworkHelper;
import com.sina.weibo.sdk.utils.SecurityHelper;
import com.sina.weibo.sdk.utils.UIUtils;
import com.sina.weibo.sdk.utils.Utility;
import com.sina.weibo.sdk.utils.WbAuthConstants;
import com.sina.weibo.sdk.utils.WbSdkVersion;
import com.sina.weibo.sdk.web.WebRequestType;
import com.sina.weibo.sdk.web.WeiboCallbackManager;
import com.sina.weibo.sdk.web.WeiboSdkWebActivity;
import com.sina.weibo.sdk.web.param.AuthWebViewRequestParam;
import p153l.azk0;

/* JADX INFO: loaded from: classes11.dex */
public class BaseSsoHandler {
    public static final String OAUTH2_BASE_URL = "https://open.weibo.cn/oauth2/authorize?";
    private static final String TAG = "BaseSsoHandler";
    protected WbAuthListener authListener;
    protected Context mAuthActivity;
    protected final int SSO_TYPE_INVALID = 3;
    protected int ssoRequestCode = -1;
    protected int ssoRequestType = 3;

    public enum AuthType {
        ALL,
        SsoOnly,
        WebOnly
    }

    public BaseSsoHandler(Activity activity) {
        this.mAuthActivity = activity;
        WeiboSsoManager.getInstance().init(activity, WbSdk.getAuthInfo().getAppKey());
    }

    private void authorize(int i, WbAuthListener wbAuthListener, AuthType authType) {
        resetIntentFillData();
        if (wbAuthListener == null) {
            azk0.m101074a("please set auth listener");
            return;
        }
        this.authListener = wbAuthListener;
        if (authType == AuthType.WebOnly) {
            startWebAuth();
            return;
        }
        boolean z = authType == AuthType.SsoOnly;
        WbAppInfo wbAppInfo = WeiboAppManager.getInstance(this.mAuthActivity).getWbAppInfo();
        if (isWbAppInstalled() && wbAppInfo != null) {
            startClientAuth(i);
        } else if (z) {
            this.authListener.onFailure(new WbConnectErrorMessage());
        } else {
            startWebAuth();
        }
    }

    public void authorizeCallBack(int i, int i2, Intent intent) {
        if (32973 == i) {
            if (i2 != -1) {
                if (i2 == 0) {
                    this.authListener.cancel();
                    return;
                }
                return;
            }
            Context context = this.mAuthActivity;
            if (!SecurityHelper.checkResponseAppLegal(context, WeiboAppManager.getInstance(context).getWbAppInfo(), intent)) {
                this.authListener.onFailure(new WbConnectErrorMessage(WbAuthConstants.AUTH_FAILED_INSTALL_APP_COUNTERFEIT_MESSAGE, WbAuthConstants.AUTH_FAILED_INSTALL_APP_COUNTERFEIT_CODE));
                return;
            }
            String strSafeString = Utility.safeString(intent.getStringExtra("error"));
            String strSafeString2 = Utility.safeString(intent.getStringExtra("error_type"));
            String strSafeString3 = Utility.safeString(intent.getStringExtra("error_description"));
            LogUtil.m81661d(TAG, "error: " + strSafeString + ", error_type: " + strSafeString2 + ", error_description: " + strSafeString3);
            if (TextUtils.isEmpty(strSafeString) && TextUtils.isEmpty(strSafeString2) && TextUtils.isEmpty(strSafeString3)) {
                Oauth2AccessToken accessToken = Oauth2AccessToken.parseAccessToken(intent.getExtras());
                if (accessToken == null || !accessToken.isSessionValid()) {
                    return;
                }
                LogUtil.m81661d(TAG, "Login Success! " + accessToken.toString());
                AccessTokenKeeper.writeAccessToken(this.mAuthActivity, accessToken);
                this.authListener.onSuccess(accessToken);
                return;
            }
            if ("access_denied".equals(strSafeString) || "OAuthAccessDeniedException".equals(strSafeString)) {
                LogUtil.m81661d(TAG, "Login canceled by user.");
                this.authListener.cancel();
            } else {
                LogUtil.m81661d(TAG, "Login failed: " + strSafeString);
                this.authListener.onFailure(new WbConnectErrorMessage(strSafeString2, strSafeString3));
            }
        }
    }

    public void authorizeClientSso(WbAuthListener wbAuthListener) {
        authorize(WbAuthConstants.REQUEST_CODE_SSO_AUTH, wbAuthListener, AuthType.SsoOnly);
    }

    public void authorizeWeb(WbAuthListener wbAuthListener) {
        authorize(WbAuthConstants.REQUEST_CODE_SSO_AUTH, wbAuthListener, AuthType.WebOnly);
    }

    public void fillExtraIntent(Intent intent, int i) {
    }

    @Deprecated
    public boolean isWbAppInstalled() {
        return WbSdk.isWbInstall(this.mAuthActivity);
    }

    public void resetIntentFillData() {
        this.ssoRequestCode = WbAuthConstants.REQUEST_CODE_SSO_AUTH;
    }

    public void startClientAuth(int i) {
        try {
            WbAppInfo wbAppInfo = WeiboAppManager.getInstance(this.mAuthActivity).getWbAppInfo();
            Intent intent = new Intent();
            intent.setClassName(wbAppInfo.getPackageName(), wbAppInfo.getAuthActivityName());
            intent.putExtras(WbSdk.getAuthInfo().getAuthBundle());
            intent.putExtra(WBConstants.COMMAND_TYPE_KEY, 3);
            intent.putExtra(WBConstants.TRAN, String.valueOf(System.currentTimeMillis()));
            intent.putExtra("aid", Utility.getAid(this.mAuthActivity, WbSdk.getAuthInfo().getAppKey()));
            if (!SecurityHelper.validateAppSignatureForIntent(this.mAuthActivity, intent)) {
                this.authListener.onFailure(new WbConnectErrorMessage(WbAuthConstants.AUTH_FAILED_INSTALL_APP_COUNTERFEIT_MESSAGE, WbAuthConstants.AUTH_FAILED_INSTALL_APP_COUNTERFEIT_CODE));
                return;
            }
            fillExtraIntent(intent, i);
            try {
                ((Activity) this.mAuthActivity).startActivityForResult(intent, this.ssoRequestCode);
            } catch (Exception unused) {
                WbAuthListener wbAuthListener = this.authListener;
                if (wbAuthListener != null) {
                    wbAuthListener.onFailure(new WbConnectErrorMessage());
                }
            }
        } catch (Exception unused2) {
        }
    }

    public void startWebAuth() {
        String strGenCallbackKey;
        AuthInfo authInfo = WbSdk.getAuthInfo();
        WeiboParameters weiboParameters = new WeiboParameters(authInfo.getAppKey());
        weiboParameters.put("client_id", authInfo.getAppKey());
        weiboParameters.put(WBConstants.AUTH_PARAMS_REDIRECT_URL, authInfo.getRedirectUrl());
        weiboParameters.put("scope", authInfo.getScope());
        weiboParameters.put(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, "code");
        weiboParameters.put(WBConstants.AUTH_PARAMS_VERSION, WbSdkVersion.WEIBO_SDK_VERSION_CODE);
        weiboParameters.put("luicode", "10000360");
        Oauth2AccessToken accessToken = AccessTokenKeeper.readAccessToken(this.mAuthActivity);
        if (accessToken != null && !TextUtils.isEmpty(accessToken.getToken())) {
            weiboParameters.put("trans_token", accessToken.getToken());
            weiboParameters.put("trans_access_token", accessToken.getToken());
        }
        weiboParameters.put("lfid", "OP_" + authInfo.getAppKey());
        String aid = Utility.getAid(this.mAuthActivity, authInfo.getAppKey());
        if (!TextUtils.isEmpty(aid)) {
            weiboParameters.put("aid", aid);
        }
        weiboParameters.put("packagename", authInfo.getPackageName());
        weiboParameters.put("key_hash", authInfo.getKeyHash());
        String str = OAUTH2_BASE_URL + weiboParameters.encodeUrl();
        if (!NetworkHelper.hasInternetPermission(this.mAuthActivity)) {
            UIUtils.showAlert(this.mAuthActivity, "Error", "Application requires permission to access the Internet");
            return;
        }
        if (this.authListener != null) {
            WeiboCallbackManager weiboCallbackManager = WeiboCallbackManager.getInstance();
            strGenCallbackKey = weiboCallbackManager.genCallbackKey();
            weiboCallbackManager.setWeiboAuthListener(strGenCallbackKey, this.authListener);
        } else {
            strGenCallbackKey = null;
        }
        AuthWebViewRequestParam authWebViewRequestParam = new AuthWebViewRequestParam(authInfo, WebRequestType.AUTH, strGenCallbackKey, "微博登录", str, this.mAuthActivity);
        Intent intent = new Intent(this.mAuthActivity, (Class<?>) WeiboSdkWebActivity.class);
        Bundle bundle = new Bundle();
        authWebViewRequestParam.fillBundle(bundle);
        intent.putExtras(bundle);
        this.mAuthActivity.startActivity(intent);
    }

    public BaseSsoHandler(Context context) {
        this.mAuthActivity = context;
        WeiboSsoManager.getInstance().init(context, WbSdk.getAuthInfo().getAppKey());
    }

    public void authorize(WbAuthListener wbAuthListener) {
        authorize(WbAuthConstants.REQUEST_CODE_SSO_AUTH, wbAuthListener, AuthType.ALL);
    }
}
