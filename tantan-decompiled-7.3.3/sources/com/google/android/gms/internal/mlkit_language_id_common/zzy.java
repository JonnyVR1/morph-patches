package com.google.android.gms.internal.mlkit_language_id_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import p153l.j3y0;

/* JADX INFO: loaded from: classes6.dex */
final class zzy extends zzu {
    static final zzu zza = new zzy(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzy(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j3y0.m143368a(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzu, com.google.android.gms.internal.mlkit_language_id_common.zzq
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq
    public final Object[] zze() {
        return this.zzb;
    }
}
