package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p149l.yew0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgan extends AbstractSequentialList implements Serializable {
    final List zza;
    final yew0 zzb;

    public zzgan(List list, yew0 yew0Var) {
        this.zza = list;
        this.zzb = yew0Var;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C2291y2(this, this.zza.listIterator(i));
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
