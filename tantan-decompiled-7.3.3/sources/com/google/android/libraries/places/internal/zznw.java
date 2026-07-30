package com.google.android.libraries.places.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zznw extends zznx {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zznx zzc;

    public zznw(zznx zznxVar, int i, int i2) {
        this.zzc = zznxVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzmt.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zznx, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zznt
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zznt
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zznt
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zznt
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zznx
    /* JADX INFO: renamed from: zzh */
    public final zznx subList(int i, int i2) {
        zzmt.zzn(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
