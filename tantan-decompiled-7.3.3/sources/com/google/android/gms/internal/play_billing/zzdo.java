package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import p153l.ses0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdo extends zzco {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzdo(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ses0.m185566a(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i + i + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        return true;
    }
}
