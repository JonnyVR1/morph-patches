package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p046p1.mobile.putong.api.api.Network;
import p149l.ii5;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1uSDK implements AFd1vSDK {

    @VisibleForTesting
    private static IntentFilter getMonetizationNetwork = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFd1vSDK
    @NonNull
    public final AFd1vSDK.AFa1ySDK getMonetizationNetwork(@NonNull Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent intentM136342l = ii5.m136342l(context, null, getMonetizationNetwork);
            if (intentM136342l != null) {
                if (2 == intentM136342l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) {
                    int intExtra = intentM136342l.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = Network.AUTH_CORE;
                    } else if (intExtra != 2) {
                        str = intExtra != 4 ? "other" : "wireless";
                    } else {
                        str = "usb";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = intentM136342l.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
                int intExtra3 = intentM136342l.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
        }
        return new AFd1vSDK.AFa1ySDK(f, str);
    }
}
