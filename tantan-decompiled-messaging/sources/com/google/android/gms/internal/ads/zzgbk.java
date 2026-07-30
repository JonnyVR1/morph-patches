package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import p149l.nfw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgbk extends zzgaa {
    static final zzgaa zza = new zzgbk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzgbk(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nfw0.m159279a(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa, com.google.android.gms.internal.ads.zzfzv
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final Object[] zzg() {
        return this.zzb;
    }
}
