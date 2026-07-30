package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import p149l.nfw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgbo extends zzgaa {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzgbo(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nfw0.m159279a(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i + i + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final boolean zzf() {
        return true;
    }
}
