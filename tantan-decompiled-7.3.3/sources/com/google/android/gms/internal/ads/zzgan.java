package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p153l.eow0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgan extends AbstractSequentialList implements Serializable {
    final List zza;
    final eow0 zzb;

    public zzgan(List list, eow0 eow0Var) {
        this.zza = list;
        this.zzb = eow0Var;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C2314y2(this, this.zza.listIterator(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.zza.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
