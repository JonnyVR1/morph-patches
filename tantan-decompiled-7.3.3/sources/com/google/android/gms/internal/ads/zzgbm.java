package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import p153l.etw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgbm extends zzgaf {
    private final transient zzgad zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgbm(zzgad zzgadVar, Object[] objArr, int i, int i2) {
        this.zza = zzgadVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
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

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final int zza(Object[] objArr, int i) {
        return zzd().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgaf, com.google.android.gms.internal.ads.zzfzv
    /* JADX INFO: renamed from: zze */
    public final etw0 iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgaf
    public final zzgaa zzi() {
        return new zzgbl(this);
    }
}
