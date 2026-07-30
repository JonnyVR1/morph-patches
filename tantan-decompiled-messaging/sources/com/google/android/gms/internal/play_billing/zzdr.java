package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p149l.jnu0;
import p149l.jxt0;
import p149l.lmr;
import p149l.pou0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdr extends zzcw {
    static final zzdr zzc;
    final transient zzco zzd;

    static {
        int i = zzco.zzd;
        zzc = new zzdr(zzdk.zza, zzdc.zza);
    }

    public zzdr(zzco zzcoVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzcoVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        zzco zzcoVar = this.zzd;
        int iZzt = zzt(obj, true);
        if (iZzt == zzcoVar.size()) {
            return null;
        }
        return this.zzd.get(iZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzcw) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof jxt0) {
            collection = ((jxt0) collection).zza();
        }
        if (!C2379d.m14756a(((zzcw) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        pou0 pou0VarListIterator = this.zzd.listIterator(0);
        Iterator it = collection.iterator();
        if (!pou0VarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = pou0VarListIterator.next();
        while (true) {
            try {
                int iCompare = ((zzcw) this).zza.compare(next2, next);
                if (iCompare < 0) {
                    if (!pou0VarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = pou0VarListIterator.next();
                } else {
                    if (iCompare != 0) {
                        return false;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!C2379d.m14756a(((zzcw) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            pou0 pou0VarListIterator = this.zzd.listIterator(0);
            while (pou0VarListIterator.hasNext()) {
                E next = pou0VarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || ((zzcw) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.zzd.get(0);
        }
        lmr.m150601a();
        return null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iZzs = zzs(obj, true) - 1;
        if (iZzs == -1) {
            return null;
        }
        return this.zzd.get(iZzs);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    public final Object higher(Object obj) {
        zzco zzcoVar = this.zzd;
        int iZzt = zzt(obj, false);
        if (iZzt == zzcoVar.size()) {
            return null;
        }
        return this.zzd.get(iZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            lmr.m150601a();
            return null;
        }
        zzco zzcoVar = this.zzd;
        return zzcoVar.get(zzcoVar.size() - 1);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iZzs = zzs(obj, false) - 1;
        if (iZzs == -1) {
            return null;
        }
        return this.zzd.get(iZzs);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zza(Object[] objArr, int i) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    public final zzco zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    /* JADX INFO: renamed from: zze */
    public final jnu0 iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] zzg() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final zzcw zzl() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(((zzcw) this).zza);
        return isEmpty() ? zzcw.zzq(comparatorReverseOrder) : new zzdr(this.zzd.zzh(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final zzcw zzm(Object obj, boolean z) {
        return zzu(0, zzs(obj, z));
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final zzcw zzo(Object obj, boolean z, Object obj2, boolean z2) {
        return zzp(obj, z).zzm(obj2, z2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final zzcw zzp(Object obj, boolean z) {
        return zzu(zzt(obj, z), this.zzd.size());
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final jnu0 descendingIterator() {
        return this.zzd.zzh().listIterator(0);
    }

    public final int zzs(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzcw) this).zza);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int zzt(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzcw) this).zza);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final zzdr zzu(int i, int i2) {
        if (i == 0) {
            if (i2 == this.zzd.size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return zzcw.zzq(((zzcw) this).zza);
        }
        zzco zzcoVar = this.zzd;
        return new zzdr(zzcoVar.subList(i, i2), ((zzcw) this).zza);
    }
}
