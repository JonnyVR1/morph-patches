package com.sina.weibo.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import com.sina.weibo.sdk.ApiUtils;
import com.sina.weibo.sdk.auth.WbAppInfo;
import com.sina.weibo.sdk.constant.WBConstants;

/* JADX INFO: loaded from: classes11.dex */
public class SecurityHelper {
    public static boolean checkResponseAppLegal(Context context, WbAppInfo wbAppInfo, Intent intent) {
        if ((wbAppInfo != null && wbAppInfo.getSupportVersion() <= 10352) || wbAppInfo == null) {
            return true;
        }
        String stringExtra = intent != null ? intent.getStringExtra(WBConstants.Base.APP_PKG) : null;
        return (stringExtra == null || intent.getStringExtra(WBConstants.TRAN) == null || !ApiUtils.validateWeiboSign(context, stringExtra)) ? false : true;
    }

    public static boolean containSign(Signature[] signatureArr, String str) {
        if (signatureArr != null && str != null) {
            for (Signature signature : signatureArr) {
                if (str.equals(MD5.hexdigest(signature.toByteArray()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean validateAppSignatureForIntent(Context context, Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) == null) {
            return false;
        }
        try {
            return containSign(packageManager.getPackageInfo(resolveInfoResolveActivity.activityInfo.packageName, 64).signatures, WBConstants.WEIBO_SIGN);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
