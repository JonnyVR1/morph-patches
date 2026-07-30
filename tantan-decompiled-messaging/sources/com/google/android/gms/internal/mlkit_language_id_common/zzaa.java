package com.google.android.gms.internal.mlkit_language_id_common;

import java.util.Iterator;
import java.util.Map;
import p149l.w8r0;

/* JADX INFO: loaded from: classes6.dex */
final class zzaa extends zzx {
    private final transient zzw zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzaa(zzw zzwVar, Object[] objArr, int i, int i2) {
        this.zza = zzwVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzx, com.google.android.gms.internal.mlkit_language_id_common.zzq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzx, com.google.android.gms.internal.mlkit_language_id_common.zzq
    /* JADX INFO: renamed from: zzd */
    public final w8r0 iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzx
    public final zzu zzg() {
        return new zzz(this);
    }
}
