package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p153l.pf60;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class PackageManagerWrapper {

    @NonNull
    protected final Context zza;

    public PackageManagerWrapper(@NonNull Context context) {
        this.zza = context;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(@NonNull String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public int checkPermission(@NonNull String str, @NonNull String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public ApplicationInfo getApplicationInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationInfo(str, i);
    }

    @NonNull
    @KeepForSdk
    public CharSequence getApplicationLabel(@NonNull String str) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public pf60<CharSequence, Drawable> getApplicationLabelAndIcon(@NonNull String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return pf60.m172085a(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public PackageInfo getPackageInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getPackageInfo(str, i);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (!PlatformVersion.isAtLeastO() || (nameForUid = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zza.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean zza(int i, @NonNull String str) {
        boolean zIsAtLeastKitKat = PlatformVersion.isAtLeastKitKat();
        Context context = this.zza;
        if (zIsAtLeastKitKat) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
