package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class zzaws extends AbstractList implements RandomAccess, zzaun {
    private final zzaun zza;

    public zzaws(zzaun zzaunVar) {
        this.zza = zzaunVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzaum) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzawr(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzawq(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.libraries.places.internal.zzaun
    public final zzaun zze() {
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzaun
    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.libraries.places.internal.zzaun
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.libraries.places.internal.zzaun
    public final void zzi(zzask zzaskVar) {
        throw new UnsupportedOperationException();
    }
}
