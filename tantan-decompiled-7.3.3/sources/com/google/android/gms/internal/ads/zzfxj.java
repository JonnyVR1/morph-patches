package com.google.android.gms.internal.ads;

import p153l.eow0;
import p153l.tow0;

/* JADX INFO: loaded from: classes6.dex */
final class zzfxj extends zzfwz {
    private final Object zza;

    public zzfxj(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfxj) {
            return this.zza.equals(((zzfxj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    public final zzfwz zza(eow0 eow0Var) {
        Object objApply = eow0Var.apply(this.zza);
        tow0.m192088c(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzfxj(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
