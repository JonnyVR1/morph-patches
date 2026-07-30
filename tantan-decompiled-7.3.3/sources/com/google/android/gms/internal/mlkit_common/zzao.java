package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import p153l.wyr0;

/* JADX INFO: loaded from: classes6.dex */
final class zzao extends zzaj {
    private final transient zzai zza;
    private final transient zzaf zzb;

    public zzao(zzai zzaiVar, zzaf zzafVar) {
        this.zza = zzaiVar;
        this.zzb = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: zzd */
    public final wyr0 iterator() {
        return this.zzb.listIterator(0);
    }
}
