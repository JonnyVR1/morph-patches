package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();

    @NonNull
    protected final String zza;

    @NonNull
    protected final Object zzb;

    @Nullable
    private Object zzd = null;

    public GservicesValue(@NonNull String str, @NonNull Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Boolean> value(@NonNull String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get() {
        T t;
        T t2 = (T) this.zzd;
        if (t2 != null) {
            return t2;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
        try {
            t = (T) zza(this.zza);
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                t = (T) zza(this.zza);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return t;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @KeepForSdk
    @VisibleForTesting
    public void override(@NonNull T t) {
        this.zzd = t;
        Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @KeepForSdk
    @VisibleForTesting
    public void resetOverride() {
        this.zzd = null;
    }

    @NonNull
    public abstract Object zza(@NonNull String str);

    @NonNull
    @KeepForSdk
    public static GservicesValue<Integer> value(@NonNull String str, @NonNull Integer num) {
        return new zzc(str, num);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Long> value(@NonNull String str, @NonNull Long l2) {
        return new zzb(str, l2);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<String> value(@NonNull String str, @NonNull String str2) {
        return new zze(str, str2);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Float> value(@NonNull String str, @NonNull Float f) {
        return new zzd(str, f);
    }
}
