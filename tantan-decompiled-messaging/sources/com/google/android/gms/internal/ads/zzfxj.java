package com.google.android.gms.internal.ads;

import p149l.nfw0;
import p149l.yew0;

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
    public final zzfwz zza(yew0 yew0Var) {
        Object objApply = yew0Var.apply(this.zza);
        nfw0.m159281c(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzfxj(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
