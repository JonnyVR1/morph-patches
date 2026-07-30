package com.google.android.gms.internal.mlkit_language_id_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p153l.j3y0;

/* JADX INFO: loaded from: classes6.dex */
final class zzt extends zzu {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzu zzc;

    public zzt(zzu zzuVar, int i, int i2) {
        this.zzc = zzuVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j3y0.m143368a(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzu, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzu
    /* JADX INFO: renamed from: zzf */
    public final zzu subList(int i, int i2) {
        j3y0.m143370c(i, i2, this.zzb);
        zzu zzuVar = this.zzc;
        int i3 = this.zza;
        return zzuVar.subList(i + i3, i2 + i3);
    }
}
