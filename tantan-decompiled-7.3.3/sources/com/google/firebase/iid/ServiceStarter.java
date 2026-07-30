package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class ServiceStarter {
    public static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";

    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    private static ServiceStarter instance;
    private Boolean hasWakeLockPermission = null;
    private Boolean hasAccessNetworkStatePermission = null;

    private ServiceStarter() {
    }

    @KeepForSdk
    public static synchronized ServiceStarter getInstance() {
        try {
            if (instance == null) {
                instance = new ServiceStarter();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    @VisibleForTesting
    public static void setForTesting(ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }

    public boolean hasAccessNetworkStatePermission(Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    public boolean hasWakeLockPermission(Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.hasWakeLockPermission.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.hasWakeLockPermission.booleanValue();
    }
}
