package com.clevertap.android.sdk.pushnotification;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import p153l.h4a;
import p153l.k30;
import p153l.kob0;
import p153l.oz40;

/* JADX INFO: loaded from: classes.dex */
public class PushNotificationHandler implements k30 {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.PushNotificationHandler$b */
    public static class C1330b {
        private static final PushNotificationHandler INSTANCE = new PushNotificationHandler();
    }

    /* JADX INFO: renamed from: d */
    public static oz40 m6977d() {
        return C1330b.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    private boolean m6978e(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "signedcall".equals(bundle.getString("source"));
    }

    public static boolean isForPushTemplates(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("pt_id");
        return ("0".equals(string) || string == null || string.isEmpty()) ? false : true;
    }

    @Override // p153l.oz40
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo6979a(Context context, Bundle bundle, String str) {
        try {
            bundle.putLong(Constants.OMR_INVOKE_TIME_IN_MILLIS, System.currentTimeMillis());
            CleverTapAPI globalInstance = CleverTapAPI.getGlobalInstance(context, PushNotificationUtil.getAccountIdFromNotificationBundle(bundle));
            if (!CleverTapAPI.getNotificationInfo(bundle).fromCleverTap) {
                return false;
            }
            if (globalInstance != null) {
                globalInstance.m5847H().getConfig().log("PushProvider", str + "received notification from CleverTap: " + bundle.toString());
                if (isForPushTemplates(bundle) && CleverTapAPI.m5810P() != null) {
                    CleverTapAPI.m5810P().mo6979a(context, bundle, str);
                } else if (!m6978e(bundle) || CleverTapAPI.m5812R() == null) {
                    globalInstance.m5870s0(new h4a(), context, bundle);
                } else {
                    CleverTapAPI.m5812R().mo6979a(context, bundle, str);
                }
            } else {
                Logger.m5920d("PushProvider", str + "received notification from CleverTap: " + bundle.toString());
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" not renderning since cleverTapAPI is null");
                Logger.m5920d("PushProvider", sb.toString());
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oz40
    /* JADX INFO: renamed from: b */
    public boolean mo6980b(Context context, String str, kob0 kob0Var) {
        CleverTapAPI.m5801A0(context, str, kob0Var);
        return true;
    }

    @Override // p153l.k30
    /* JADX INFO: renamed from: c */
    public boolean mo6981c(Context context, Bundle bundle, int i) {
        return false;
    }

    private PushNotificationHandler() {
    }
}
