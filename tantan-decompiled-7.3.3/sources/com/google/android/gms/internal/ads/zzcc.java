package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class zzcc extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzcc(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzcc zza(@Nullable String str, @Nullable Throwable th) {
        return new zzcc(str, th, true, 1);
    }

    public static zzcc zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzcc(str, th, true, 0);
    }

    public static zzcc zzc(@Nullable String str) {
        return new zzcc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
