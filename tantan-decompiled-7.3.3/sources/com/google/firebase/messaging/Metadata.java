package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
public class Metadata {
    private static final String ACTION_C2DM_REGISTER = "com.google.android.c2dm.intent.REGISTER";
    private static final String ACTION_IID_TOKEN_REQUEST = "com.google.iid.TOKEN_REQUEST";
    static final int GMSCORE_NOT_FOUND = 0;
    private static final String GMSCORE_SEND_PERMISSION = "com.google.android.c2dm.permission.SEND";
    static final String GMS_PACKAGE = "com.google.android.gms";
    static final int IID_VIA_RECEIVER = 2;
    static final int IID_VIA_SERVICE = 1;

    @GuardedBy("this")
    private String appVersionCode;

    @GuardedBy("this")
    private String appVersionName;
    private final Context context;

    @GuardedBy("this")
    private int gmsVersionCode;

    @GuardedBy("this")
    private int iidImplementation = 0;

    public Metadata(Context context) {
        this.context = context;
    }

    public static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo getPackageInfo(String str) {
        try {
            return this.context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    private synchronized void populateAppVersionInfo() {
        PackageInfo packageInfo = getPackageInfo(this.context.getPackageName());
        if (packageInfo != null) {
            this.appVersionCode = Integer.toString(packageInfo.versionCode);
            this.appVersionName = packageInfo.versionName;
        }
    }

    public synchronized String getAppVersionCode() {
        try {
            if (this.appVersionCode == null) {
                populateAppVersionInfo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.appVersionCode;
    }

    public synchronized String getAppVersionName() {
        try {
            if (this.appVersionName == null) {
                populateAppVersionInfo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.appVersionName;
    }

    public synchronized int getGmsVersionCode() {
        PackageInfo packageInfo;
        try {
            if (this.gmsVersionCode == 0 && (packageInfo = getPackageInfo("com.google.android.gms")) != null) {
                this.gmsVersionCode = packageInfo.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.gmsVersionCode;
    }

    public synchronized int getIidImplementation() {
        int i = this.iidImplementation;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager.checkPermission(GMSCORE_SEND_PERMISSION, "com.google.android.gms") == -1) {
            Log.e(Constants.TAG, "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent(ACTION_C2DM_REGISTER);
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.iidImplementation = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent(ACTION_IID_TOKEN_REQUEST);
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.iidImplementation = 2;
            return 2;
        }
        if (PlatformVersion.isAtLeastO()) {
            this.iidImplementation = 2;
        } else {
            this.iidImplementation = 1;
        }
        return this.iidImplementation;
    }

    public boolean isGmscorePresent() {
        return getIidImplementation() != 0;
    }
}
