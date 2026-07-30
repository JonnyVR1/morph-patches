package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class DeviceProperties {

    @Nullable
    private static Boolean zza;

    @Nullable
    private static Boolean zzb;

    @Nullable
    private static Boolean zzc;

    @Nullable
    private static Boolean zzd;

    @Nullable
    private static Boolean zze;

    @Nullable
    private static Boolean zzf;

    @Nullable
    private static Boolean zzg;

    @Nullable
    private static Boolean zzh;

    @Nullable
    private static Boolean zzi;

    @Nullable
    private static Boolean zzj;

    @Nullable
    private static Boolean zzk;

    @Nullable
    private static Boolean zzl;

    @Nullable
    private static Boolean zzm;

    @Nullable
    private static Boolean zzn;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean isAuto(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            zzj = Boolean.valueOf(z);
        }
        return zzj.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(@NonNull Context context) {
        if (zzm == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            zzm = Boolean.valueOf(z);
        }
        return zzm.booleanValue();
    }

    @KeepForSdk
    public static boolean isFoldable(@NonNull Context context) {
        if (zzc == null) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            boolean z = false;
            if (PlatformVersion.isAtLeastR() && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                z = true;
            }
            zzc = Boolean.valueOf(z);
        }
        return zzc.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(@NonNull Context context) {
        if (zzg == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            zzg = Boolean.valueOf(z);
        }
        return zzg.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    @KeepForSdk
    public static boolean isPhone(@NonNull Context context) {
        if (zza == null) {
            boolean z = true;
            if (!isFoldable(context)) {
                if (isTablet(context) || isWearable(context) || zzb(context)) {
                    z = false;
                } else {
                    if (zzi == null) {
                        zzi = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                    }
                    if (zzi.booleanValue() || isAuto(context) || isTv(context)) {
                        z = false;
                    } else {
                        if (zzl == null) {
                            zzl = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                        }
                        if (zzl.booleanValue() || isBstar(context) || isXr(context)) {
                            z = false;
                        }
                    }
                }
            }
            zza = Boolean.valueOf(z);
        }
        return zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(@NonNull Context context) {
        return zzc(context.getResources());
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean isSidewinder(@NonNull Context context) {
        return zza(context);
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            zzb = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources));
        }
        return zzb.booleanValue();
    }

    @KeepForSdk
    public static boolean isTv(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzk == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            zzk = Boolean.valueOf(z);
        }
        return zzk.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @KeepForSdk
    @TargetApi(20)
    public static boolean isWearable(@NonNull Context context) {
        return zzd(context.getPackageManager());
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(@NonNull Context context) {
        if (isWearable(context) && !PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zza(context)) {
            return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
        }
        return false;
    }

    @KeepForSdk
    public static boolean isXr(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzn == null) {
            zzn = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.immersive"));
        }
        return zzn.booleanValue();
    }

    @TargetApi(21)
    public static boolean zza(@NonNull Context context) {
        if (zzf == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            zzf = Boolean.valueOf(z);
        }
        return zzf.booleanValue();
    }

    public static boolean zzb(@NonNull Context context) {
        if (zzh == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            zzh = Boolean.valueOf(z);
        }
        return zzh.booleanValue();
    }

    public static boolean zzc(@NonNull Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (zzd == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            zzd = Boolean.valueOf(z);
        }
        return zzd.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean zzd(@NonNull PackageManager packageManager) {
        if (zze == null) {
            boolean z = false;
            if (PlatformVersion.isAtLeastKitKatWatch() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            zze = Boolean.valueOf(z);
        }
        return zze.booleanValue();
    }

    @KeepForSdk
    public static boolean isTablet(@NonNull Context context) {
        return isTablet(context.getResources());
    }
}
