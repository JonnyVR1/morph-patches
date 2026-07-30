package com.google.android.gms.internal.ads;

import java.util.Iterator;
import p153l.etw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgbn extends zzgaf {
    private final transient zzgad zza;
    private final transient zzgaa zzb;

    public zzgbn(zzgad zzgadVar, zzgaa zzgaaVar) {
        this.zza = zzgadVar;
        this.zzb = zzgaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    public final zzgaa zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    /* JADX INFO: renamed from: zze */
    public final etw0 iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final boolean zzf() {
        throw null;
    }
}
