package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.WbAppInfo;
import com.sina.weibo.sdk.network.intercept.CommonParamInterception;
import com.sina.weibo.sdk.sso.WeiboSsoManager;
import java.util.List;
import p149l.upk0;

/* JADX INFO: loaded from: classes11.dex */
public class WbSdk {
    private static AuthInfo authInfo = null;
    private static boolean init = false;

    public static void checkInit() {
        if (init) {
            return;
        }
        upk0.m194883a("weibo sdk was not initall! please use: WbSdk.install() in your app Application or your main Activity. when you want to use weibo sdk function, make sure call WbSdk.install() before this function");
    }

    public static AuthInfo getAuthInfo() {
        checkInit();
        return authInfo;
    }

    public static void install(Context context, AuthInfo authInfo2) {
        if (init) {
            return;
        }
        if (authInfo2 == null || TextUtils.isEmpty(authInfo2.getAppKey()) || TextUtils.isEmpty(authInfo2.getRedirectUrl())) {
            upk0.m194883a("please set right app info (appKey,redirect");
            return;
        }
        authInfo = authInfo2;
        CommonParamInterception.setAppKey(authInfo2.getAppKey());
        WeiboSsoManager.getInstance().init(context, authInfo2.getAppKey());
        init = true;
    }

    public static boolean isWbInstall(Context context) {
        Intent intent = new Intent(WeiboAppManager.WEIBO_IDENTITY_ACTION);
        intent.addCategory("android.intent.category.DEFAULT");
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    public static boolean supportMultiImage(Context context) {
        WbAppInfo wbAppInfo;
        return isWbInstall(context) && (wbAppInfo = WeiboAppManager.getInstance(context).getWbAppInfo()) != null && wbAppInfo.getSupportVersion() >= 10772;
    }
}
