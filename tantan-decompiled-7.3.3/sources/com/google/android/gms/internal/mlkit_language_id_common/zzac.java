package com.google.android.gms.internal.mlkit_language_id_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import p153l.j3y0;

/* JADX INFO: loaded from: classes6.dex */
final class zzac extends zzu {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzac(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j3y0.m143368a(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
