package com.google.android.gms.internal.mlkit_language_id_common;

import java.util.Iterator;
import p149l.w8r0;

/* JADX INFO: loaded from: classes6.dex */
final class zzab extends zzx {
    private final transient zzw zza;
    private final transient zzu zzb;

    public zzab(zzw zzwVar, zzu zzuVar) {
        this.zza = zzwVar;
        this.zzb = zzuVar;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzx, com.google.android.gms.internal.mlkit_language_id_common.zzq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzx, com.google.android.gms.internal.mlkit_language_id_common.zzq
    /* JADX INFO: renamed from: zzd */
    public final w8r0 iterator() {
        return this.zzb.listIterator(0);
    }
}
