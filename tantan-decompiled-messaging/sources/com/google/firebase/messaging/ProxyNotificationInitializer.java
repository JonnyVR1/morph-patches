package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p149l.rfx;
import p149l.sei0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
final class ProxyNotificationInitializer {
    private static final String MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED = "firebase_messaging_notification_delegation_enabled";

    private ProxyNotificationInitializer() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16826a(Context context, boolean z, sei0 sei0Var) {
        try {
            if (!allowedToUse(context)) {
                Log.e(Constants.TAG, "error configuring notification delegate for package " + context.getPackageName());
            } else {
                ProxyNotificationPreferences.setProxyNotificationsInitialized(context, true);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            sei0Var.m183661e(null);
        }
    }

    private static boolean allowedToUse(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    @WorkerThread
    public static void initialize(Context context) {
        if (ProxyNotificationPreferences.isProxyNotificationInitialized(context)) {
            return;
        }
        setEnableProxyNotification(new rfx(), context, shouldEnableProxyNotification(context));
    }

    public static boolean isProxyNotificationEnabled(Context context) {
        if (!PlatformVersion.isAtLeastQ()) {
            Log.isLoggable(Constants.TAG, 3);
            return false;
        }
        if (allowedToUse(context)) {
            if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                return false;
            }
            Log.isLoggable(Constants.TAG, 3);
            return true;
        }
        Log.e(Constants.TAG, "error retrieving notification delegate for package " + context.getPackageName());
        return false;
    }

    @TargetApi(29)
    public static Task<Void> setEnableProxyNotification(Executor executor, final Context context, final boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return tfi0.m188734f(null);
        }
        final sei0 sei0Var = new sei0();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.i
            @Override // java.lang.Runnable
            public final void run() {
                ProxyNotificationInitializer.m16826a(context, z, sei0Var);
            }
        });
        return sei0Var.m183657a();
    }

    private static boolean shouldEnableProxyNotification(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
