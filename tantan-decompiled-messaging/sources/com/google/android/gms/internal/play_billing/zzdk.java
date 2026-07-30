package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import p149l.m5s0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdk extends zzco {
    static final zzco zza = new zzdk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzdk(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m5s0.m153142a(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] zzg() {
        return this.zzb;
    }
}
