package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import p149l.brt0;
import p149l.cwt0;
import p149l.jnu0;
import p149l.x9g0;
import p149l.xku0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzcw extends zzcv implements NavigableSet, xku0 {
    final transient Comparator zza;
    transient zzcw zzb;

    public zzcw(Comparator comparator) {
        this.zza = comparator;
    }

    public static zzdr zzq(Comparator comparator) {
        if (zzdc.zza.equals(comparator)) {
            return zzdr.zzc;
        }
        int i = zzco.zzd;
        return new zzdr(zzdk.zza, comparator);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        obj.getClass();
        return brt0.m103599a(zzp(obj, true), null);
    }

    @Override // java.util.SortedSet, p149l.xku0
    public final Comparator comparator() {
        return this.zza;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        zzcw zzcwVar = this.zzb;
        if (zzcwVar != null) {
            return zzcwVar;
        }
        zzcw zzcwVarZzl = zzl();
        this.zzb = zzcwVarZzl;
        zzcwVarZzl.zzb = this;
        return zzcwVarZzl;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        obj.getClass();
        return cwt0.m109067a(zzm(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return zzm(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        obj.getClass();
        return brt0.m103599a(zzp(obj, false), null);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        obj.getClass();
        return cwt0.m109067a(zzm(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return zzp(obj, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract jnu0 iterator();

    public abstract zzcw zzl();

    public abstract zzcw zzm(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzcw subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.zza.compare(obj, obj2) <= 0) {
            return zzo(obj, z, obj2, z2);
        }
        x9g0.m207497a();
        return null;
    }

    public abstract zzcw zzo(Object obj, boolean z, Object obj2, boolean z2);

    public abstract zzcw zzp(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: zzr */
    public abstract jnu0 descendingIterator();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return zzm(obj, z);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return zzp(obj, z);
    }
}
