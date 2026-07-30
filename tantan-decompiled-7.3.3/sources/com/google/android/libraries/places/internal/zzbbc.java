package com.google.android.libraries.places.internal;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbbc extends zzbbk {
    private final zzbbe zza;

    public zzbbc(zzbbe zzbbeVar) {
        zzmt.zzc(zzbbeVar, LovePlanetStage.result);
        this.zza = zzbbeVar;
    }

    public final String toString() {
        return "FixedResultPicker(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.libraries.places.internal.zzbbk
    public final zzbbe zza(zzbbf zzbbfVar) {
        return this.zza;
    }
}
