package com.google.android.libraries.places.internal;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
final class zzrm extends AbstractSet {
    final int zza = -1;
    final /* synthetic */ zzrn zzb;

    public zzrm(zzrn zzrnVar, int i) {
        this.zzb = zzrnVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.zzb.zzb, zzb(), zza(), obj, this.zza == -1 ? zzrn.zza : zzrp.zza) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzrl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza() - zzb();
    }

    public final int zza() {
        return this.zzb.zzc[this.zza + 1];
    }

    public final int zzb() {
        if (this.zza == -1) {
            return 0;
        }
        return this.zzb.zzc[0];
    }
}
