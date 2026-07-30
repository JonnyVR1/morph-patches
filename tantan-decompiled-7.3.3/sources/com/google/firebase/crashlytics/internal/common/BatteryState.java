package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.Logger;
import com.momo.mcamera.mask.BigEyeFilter;
import p153l.jj5;

/* JADX INFO: loaded from: classes7.dex */
class BatteryState {
    static final int VELOCITY_CHARGING = 2;
    static final int VELOCITY_FULL = 3;
    static final int VELOCITY_UNPLUGGED = 1;
    private final Float level;
    private final boolean powerConnected;

    private BatteryState(Float f, boolean z) {
        this.powerConnected = z;
        this.level = f;
    }

    public static BatteryState get(Context context) {
        boolean zIsPowerConnected = false;
        Float level = null;
        try {
            Intent intentM145018l = jj5.m145018l(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentM145018l != null) {
                zIsPowerConnected = isPowerConnected(intentM145018l);
                level = getLevel(intentM145018l);
            }
        } catch (IllegalStateException e) {
            Logger.getLogger().m16779e("An error occurred getting battery state.", e);
        }
        return new BatteryState(level, zIsPowerConnected);
    }

    private static Float getLevel(Intent intent) {
        int intExtra = intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
        int intExtra2 = intent.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean isPowerConnected(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float getBatteryLevel() {
        return this.level;
    }

    public int getBatteryVelocity() {
        Float f;
        if (!this.powerConnected || (f = this.level) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    public boolean isPowerConnected() {
        return this.powerConnected;
    }
}
