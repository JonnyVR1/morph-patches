package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class GmsLogger {
    private final String zza;

    @Nullable
    private final String zzb;

    @KeepForSdk
    public GmsLogger(@NonNull String str, @Nullable String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        this.zzb = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    private final String zza(String str) {
        String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    private final String zzb(String str, Object... objArr) {
        String str2 = this.zzb;
        String str3 = String.format(str, objArr);
        return str2 == null ? str3 : str2.concat(str3);
    }

    @KeepForSdk
    public boolean canLog(int i) {
        return Log.isLoggable(this.zza, i);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m12507d(@NonNull String str, @NonNull String str2) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public void m12509e(@NonNull String str, @NonNull String str2) {
        if (canLog(6)) {
            Log.e(str, zza(str2));
        }
    }

    @KeepForSdk
    public void efmt(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (canLog(6)) {
            Log.e(str, zzb(str2, objArr));
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: i */
    public void m12511i(@NonNull String str, @NonNull String str2) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2) {
    }

    @KeepForSdk
    /* JADX INFO: renamed from: v */
    public void m12513v(@NonNull String str, @NonNull String str2) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: w */
    public void m12515w(@NonNull String str, @NonNull String str2) {
        if (canLog(5)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void wfmt(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (canLog(5)) {
            zzb(str2, objArr);
        }
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(7)) {
            Log.e(str, zza(str2), th);
            Log.wtf(str, zza(str2), th);
        }
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m12508d(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: i */
    public void m12512i(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: v */
    public void m12514v(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: w */
    public void m12516w(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(5)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public void m12510e(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(6)) {
            Log.e(str, zza(str2), th);
        }
    }

    @KeepForSdk
    public GmsLogger(@NonNull String str) {
        this(str, null);
    }
}
