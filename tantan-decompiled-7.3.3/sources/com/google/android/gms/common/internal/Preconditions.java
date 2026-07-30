package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p153l.bkq0;
import p153l.fig0;
import p153l.mnd0;
import p153l.un80;
import p153l.wg3;
import p153l.wpg0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d, double d2, double d3, @NonNull String str) {
        if (d < d2) {
            wg3.m206174a(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (d <= d3) {
            return d;
        }
        wg3.m206174a(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            bkq0.m104842a("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", ".");
        }
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (com.google.android.gms.common.util.zzb.zza()) {
            return;
        }
        wtq0.m207906a(str);
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        wg3.m206174a("Given String is empty or null");
        return null;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(@NonNull String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                wtq0.m207906a(str);
            }
        }
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (com.google.android.gms.common.util.zzb.zza()) {
            wtq0.m207906a(str);
        }
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static <T> T checkNotNull(@NonNull T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        wg3.m206174a("Given Long is zero");
        return 0L;
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i = 0;
        int i2 = 0;
        while (i < 3 && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < 3) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < 3; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        }
        return sb.toString();
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @NonNull Object obj) {
        if (z) {
            return;
        }
        un80.m196830a(obj);
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static <T> T checkNotNull(@Nullable T t) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a("null reference");
        return null;
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        wpg0.m207458a();
    }

    @KeepForSdk
    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        fig0.m125680a();
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str, @NonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        un80.m196830a(obj);
        return null;
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static int checkNotZero(int i, @NonNull Object obj) {
        if (i != 0) {
            return i;
        }
        un80.m196830a(obj);
        return 0;
    }

    @KeepForSdk
    public static int checkNotZero(int i) {
        if (i != 0) {
            return i;
        }
        wg3.m206174a("Given Integer is zero");
        return 0;
    }

    @KeepForSdk
    public static long checkNotZero(long j, @NonNull Object obj) {
        if (j != 0) {
            return j;
        }
        un80.m196830a(obj);
        return 0L;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler, @NonNull String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        wtq0.m207906a(str);
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f, float f2, float f3, @NonNull String str) {
        if (f < f2) {
            wg3.m206174a(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
            return 0.0f;
        }
        if (f <= f3) {
            return f;
        }
        wg3.m206174a(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
        return 0.0f;
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i, int i2, int i3, @NonNull String str) {
        if (i < i2) {
            wg3.m206174a(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
            return 0;
        }
        if (i <= i3) {
            return i;
        }
        wg3.m206174a(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        return 0;
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j, long j2, long j3, @NonNull String str) {
        if (j < j2) {
            wg3.m206174a(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
            return 0L;
        }
        if (j <= j3) {
            return j;
        }
        wg3.m206174a(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
        return 0L;
    }
}
