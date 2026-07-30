package com.clevertap.android.sdk.pushnotification;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import p149l.ar40;
import p149l.ggb0;
import p149l.q30;
import p149l.w2a;

/* JADX INFO: loaded from: classes.dex */
public class PushNotificationHandler implements q30 {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.PushNotificationHandler$b */
    public static class C1307b {
        private static final PushNotificationHandler INSTANCE = new PushNotificationHandler();
    }

    /* JADX INFO: renamed from: d */
    public static ar40 m6923d() {
        return C1307b.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    private boolean m6924e(Bundle bundle) {
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

    @Override // p149l.ar40
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo6925a(Context context, Bundle bundle, String str) {
        try {
            bundle.putLong(Constants.OMR_INVOKE_TIME_IN_MILLIS, System.currentTimeMillis());
            CleverTapAPI globalInstance = CleverTapAPI.getGlobalInstance(context, PushNotificationUtil.getAccountIdFromNotificationBundle(bundle));
            if (!CleverTapAPI.getNotificationInfo(bundle).fromCleverTap) {
                return false;
            }
            if (globalInstance != null) {
                globalInstance.m5793H().getConfig().log("PushProvider", str + "received notification from CleverTap: " + bundle.toString());
                if (isForPushTemplates(bundle) && CleverTapAPI.m5756P() != null) {
                    CleverTapAPI.m5756P().mo6925a(context, bundle, str);
                } else if (!m6924e(bundle) || CleverTapAPI.m5758R() == null) {
                    globalInstance.m5816s0(new w2a(), context, bundle);
                } else {
                    CleverTapAPI.m5758R().mo6925a(context, bundle, str);
                }
            } else {
                Logger.m5866d("PushProvider", str + "received notification from CleverTap: " + bundle.toString());
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" not renderning since cleverTapAPI is null");
                Logger.m5866d("PushProvider", sb.toString());
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ar40
    /* JADX INFO: renamed from: b */
    public boolean mo6926b(Context context, String str, ggb0 ggb0Var) {
        CleverTapAPI.m5747A0(context, str, ggb0Var);
        return true;
    }

    @Override // p149l.q30
    /* JADX INFO: renamed from: c */
    public boolean mo6927c(Context context, Bundle bundle, int i) {
        return false;
    }

    private PushNotificationHandler() {
    }
}
