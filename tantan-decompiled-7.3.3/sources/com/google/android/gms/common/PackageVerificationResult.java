package com.google.android.gms.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    private final String zzc;
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i, boolean z, String str2, Throwable th) {
        this.zza = str;
        this.zzb = z;
        this.zzc = str2;
        this.zzd = th;
    }

    @NonNull
    public static PackageVerificationResult zza(@NonNull String str, @NonNull String str2, Throwable th) {
        return new PackageVerificationResult(str, 1, false, str2, th);
    }

    @NonNull
    public static PackageVerificationResult zzd(@NonNull String str, int i) {
        return new PackageVerificationResult(str, i, true, null, null);
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        String str = this.zzc;
        Throwable th = this.zzd;
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(str));
        if (th == null) {
            throw new SecurityException(strConcat);
        }
        throw new SecurityException(strConcat, th);
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
