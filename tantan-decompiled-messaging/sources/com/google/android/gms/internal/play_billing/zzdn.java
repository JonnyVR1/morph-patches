package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import p149l.jnu0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdn extends zzcv {
    private final transient zzcr zza;
    private final transient zzco zzb;

    public zzdn(zzcr zzcrVar, zzco zzcoVar) {
        this.zza = zzcrVar;
        this.zzb = zzcoVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    public final zzco zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    /* JADX INFO: renamed from: zze */
    public final jnu0 iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        throw null;
    }
}
