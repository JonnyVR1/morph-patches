package com.google.android.gms.internal.consent_sdk;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p149l.ult0;

/* JADX INFO: loaded from: classes6.dex */
final class zzcz extends zzda {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzda zzc;

    public zzcz(zzda zzdaVar, int i, int i2) {
        this.zzc = zzdaVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ult0.m194265a(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    /* JADX INFO: renamed from: zzf */
    public final zzda subList(int i, int i2) {
        ult0.m194267c(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
