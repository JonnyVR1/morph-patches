package com.sina.weibo.sdk.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.api.StoryMessage;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AccessTokenKeeper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAppInfo;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.utils.FileUtils;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.MD5;
import com.sina.weibo.sdk.utils.Utility;
import com.sina.weibo.sdk.utils.WbSdkVersion;
import com.sina.weibo.sdk.web.WebRequestType;
import com.sina.weibo.sdk.web.param.ShareWebViewRequestParam;
import l.qkq0;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WbShareHandler {
    public static final int WB_SHARE_REQUEST = 1;
    private Activity context;
    private boolean hasRegister = false;
    private int progressColor = -1;
    private int progressId = -1;

    public WbShareHandler(Activity activity) {
        this.context = activity;
    }

    private void sendBroadcast(Context context, String str, String str2, String str3, Bundle bundle) {
        Intent intent = new Intent(str);
        String packageName = context.getPackageName();
        intent.putExtra(WBConstants.Base.SDK_VER, WbSdkVersion.WEIBO_SDK_VERSION_CODE);
        intent.putExtra(WBConstants.Base.APP_PKG, packageName);
        intent.putExtra(WBConstants.Base.APP_KEY, str2);
        intent.putExtra(WBConstants.SDK.FLAG, WBConstants.WEIBO_FLAG_SDK);
        intent.putExtra(WBConstants.SIGN, MD5.hexdigest(Utility.getSign(context, packageName)));
        if (!TextUtils.isEmpty(str3)) {
            intent.setPackage(str3);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.sendBroadcast(intent, WBConstants.ACTION_WEIBO_SDK_PERMISSION);
    }

    private void startClientShare(WeiboMultiMessage weiboMultiMessage) {
        Bundle bundle = new Bundle();
        bundle.putInt(WBConstants.COMMAND_TYPE_KEY, 1);
        bundle.putString(WBConstants.TRAN, String.valueOf(System.currentTimeMillis()));
        bundle.putLong(WBConstants.SHARE_CALLBACK_ID, 0L);
        bundle.putAll(weiboMultiMessage.toBundle(bundle));
        Intent intent = new Intent();
        intent.setClass(this.context, WbShareTransActivity.class);
        intent.putExtra(WBConstants.SHARE_START_FLAG, 0);
        intent.putExtra(WBConstants.SHARE_START_ACTIVITY, this.context.getClass().getName());
        intent.putExtra(WBConstants.TRANS_PROGRESS_COLOR, this.progressColor);
        intent.putExtra(WBConstants.TRANS_PROGRESS_ID, this.progressId);
        intent.putExtras(bundle);
        try {
            this.context.startActivityForResult(intent, 1);
        } catch (Exception e) {
            LogUtil.m10832v("weibo sdk error ", e.toString());
        }
    }

    private void startWebShare(WeiboMultiMessage weiboMultiMessage) {
        LogUtil.m10831i("Share", "startWebShare");
        Intent intent = new Intent(this.context, (Class<?>) WbShareTransActivity.class);
        String packageName = this.context.getPackageName();
        ShareWebViewRequestParam shareWebViewRequestParam = new ShareWebViewRequestParam(WbSdk.getAuthInfo(), WebRequestType.SHARE, "", 1, "微博分享", null, this.context);
        shareWebViewRequestParam.setContext(this.context);
        shareWebViewRequestParam.setHashKey("");
        shareWebViewRequestParam.setPackageName(packageName);
        Oauth2AccessToken accessToken = AccessTokenKeeper.readAccessToken(this.context);
        if (accessToken != null && !TextUtils.isEmpty(accessToken.getToken())) {
            shareWebViewRequestParam.setToken(accessToken.getToken());
        }
        shareWebViewRequestParam.setMultiMessage(weiboMultiMessage);
        Bundle bundle = new Bundle();
        shareWebViewRequestParam.fillBundle(bundle);
        intent.putExtras(bundle);
        intent.putExtra(WBConstants.SHARE_START_FLAG, 0);
        intent.putExtra(WBConstants.SHARE_START_ACTIVITY, this.context.getClass().getName());
        intent.putExtra(WBConstants.SHARE_START_ACTION, WBConstants.ACTIVITY_WEIBO);
        intent.putExtra(WBConstants.SHARE_START_GOTO_ACTIVITY, "com.sina.weibo.sdk.web.WeiboSdkWebActivity");
        this.context.startActivityForResult(intent, 1);
    }

    public void doResultIntent(Intent intent, WbShareCallback wbShareCallback) {
        Bundle extras;
        if (wbShareCallback == null || intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        int i = extras.getInt(WBConstants.Response.ERRCODE, -1);
        if (i == 0) {
            wbShareCallback.onWbShareSuccess();
        } else if (i == 1) {
            wbShareCallback.onWbShareCancel();
        } else {
            if (i != 2) {
                return;
            }
            wbShareCallback.onWbShareFail();
        }
    }

    @Deprecated
    public boolean isWbAppInstalled() {
        return WbSdk.isWbInstall(this.context);
    }

    public boolean registerApp() {
        sendBroadcast(this.context, WBConstants.ACTION_WEIBO_REGISTER, WbSdk.getAuthInfo().getAppKey(), null, null);
        this.hasRegister = true;
        return true;
    }

    public void setProgressColor(int i) {
        this.progressColor = i;
    }

    public void setProgressId(int i) {
        this.progressId = i;
    }

    public void shareMessage(WeiboMultiMessage weiboMultiMessage, boolean z) {
        if (!this.hasRegister) {
            upk0.a("please call WbShareHandler.registerApp(),before use share function");
            return;
        }
        if (WbSdk.isWbInstall(this.context) || !z) {
            if (z) {
                startClientShare(weiboMultiMessage);
                return;
            }
            WbAppInfo wbAppInfo = WeiboAppManager.getInstance(this.context).getWbAppInfo();
            if (!WbSdk.isWbInstall(this.context) || wbAppInfo == null || wbAppInfo.getSupportVersion() <= 10000) {
                startWebShare(weiboMultiMessage);
            } else {
                startClientShare(weiboMultiMessage);
            }
        }
    }

    public void shareToStory(StoryMessage storyMessage) {
        Uri imageUri = storyMessage.getImageUri();
        Uri videoUri = storyMessage.getVideoUri();
        if ((imageUri == null || !FileUtils.isImageFile(this.context, imageUri)) && (videoUri == null || !FileUtils.isVideoFile(this.context, videoUri))) {
            qkq0.a("File only can be Image or Video. ");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(WBConstants.Msg.STORY, storyMessage);
        intent.putExtra(WBConstants.SHARE_START_ACTIVITY, this.context.getClass().getName());
        intent.putExtra(WBConstants.SHARE_START_PACKAGE, WeiboAppManager.getInstance(this.context).getWbAppInfo().getPackageName());
        intent.putExtra(WBConstants.TRANS_PROGRESS_COLOR, this.progressColor);
        intent.putExtra(WBConstants.TRANS_PROGRESS_ID, this.progressId);
        intent.putExtra(WBConstants.SHARE_START_FLAG, 0);
        intent.setClass(this.context, WbShareToStoryActivity.class);
        this.context.startActivityForResult(intent, 1);
    }

    public boolean supportMulti() {
        return false;
    }
}
