package com.google.android.gms.common.util;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import com.google.android.gms.common.annotation.KeepForSdk;
import p149l.ah3;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @ChecksSdkIntAtLeast(api = 11)
    @KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 12)
    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 14)
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 15)
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 16)
    @KeepForSdk
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 17)
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 18)
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 19)
    @KeepForSdk
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 20)
    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 21)
    @KeepForSdk
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 22)
    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 23)
    @KeepForSdk
    public static boolean isAtLeastM() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 24)
    @KeepForSdk
    public static boolean isAtLeastN() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 26)
    @KeepForSdk
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @ChecksSdkIntAtLeast(api = 28)
    @KeepForSdk
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @ChecksSdkIntAtLeast(api = 29)
    @KeepForSdk
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @ChecksSdkIntAtLeast(api = 30)
    @KeepForSdk
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @ChecksSdkIntAtLeast(api = 31)
    @KeepForSdk
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @ChecksSdkIntAtLeast(api = 32)
    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @ChecksSdkIntAtLeast(api = 33)
    @KeepForSdk
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "UpsideDownCake")
    @KeepForSdk
    public static boolean isAtLeastU() {
        if (isAtLeastT()) {
            return ah3.m96363b();
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 34, codename = "VanillaIceCream")
    @KeepForSdk
    public static boolean isAtLeastV() {
        if (isAtLeastU()) {
            return ah3.m96364c();
        }
        return false;
    }
}
