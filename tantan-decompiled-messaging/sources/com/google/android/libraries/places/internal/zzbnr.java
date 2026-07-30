package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbnr extends zzbbf {
    private final zzayj zza;
    private final zzbcf zzb;
    private final zzbcl zzc;

    public zzbnr(zzbcl zzbclVar, zzbcf zzbcfVar, zzayj zzayjVar) {
        zzmt.zzc(zzbclVar, FirebaseAnalytics.Param.METHOD);
        this.zzc = zzbclVar;
        this.zzb = zzbcfVar;
        zzmt.zzc(zzayjVar, "callOptions");
        this.zza = zzayjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbnr.class == obj.getClass()) {
            zzbnr zzbnrVar = (zzbnr) obj;
            if (zzmo.zza(this.zza, zzbnrVar.zza) && zzmo.zza(this.zzb, zzbnrVar.zzb) && zzmo.zza(this.zzc, zzbnrVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        zzayj zzayjVar = this.zza;
        zzbcf zzbcfVar = this.zzb;
        return "[method=" + this.zzc.toString() + " headers=" + zzbcfVar.toString() + " callOptions=" + zzayjVar.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.libraries.places.internal.zzbbf
    public final zzayj zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbbf
    public final zzbcf zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbbf
    public final zzbcl zzc() {
        return this.zzc;
    }
}
