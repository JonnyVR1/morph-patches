package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p153l.tow0;

/* JADX INFO: loaded from: classes6.dex */
final class zzfzz extends zzgaa {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgaa zzc;

    public zzfzz(zzgaa zzgaaVar, int i, int i2) {
        this.zzc = zzgaaVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tow0.m192086a(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    /* JADX INFO: renamed from: zzh */
    public final zzgaa subList(int i, int i2) {
        tow0.m192093h(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
