package com.google.android.gms.internal.consent_sdk;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import p149l.ult0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdd extends zzda {
    static final zzda zza = new zzdd(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzdd(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ult0.m194265a(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda, com.google.android.gms.internal.consent_sdk.zzcx
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final Object[] zze() {
        return this.zzb;
    }
}
