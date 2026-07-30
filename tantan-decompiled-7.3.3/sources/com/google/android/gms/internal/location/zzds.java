package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p153l.auu0;
import p153l.bju0;
import p153l.hpu0;
import p153l.iku0;
import p153l.ivu0;
import p153l.psw0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzds extends zzdp implements List, RandomAccess {
    private static final ivu0 zza = new hpu0(zzdt.zza, 0);

    public static zzds zzi(Object[] objArr, int i) {
        return i == 0 ? zzdt.zza : new zzdt(objArr, i);
    }

    public static zzds zzj(Collection collection) {
        if (collection instanceof zzdp) {
            zzds zzdsVarZzd = ((zzdp) collection).zzd();
            if (!zzdsVarZzd.zzf()) {
                return zzdsVarZzd;
            }
            Object[] array = zzdsVarZzd.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                psw0.m173697a(i);
                return null;
            }
        }
        return zzi(array2, length);
    }

    public static zzds zzk() {
        return zzdt.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!bju0.m104772a(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !bju0.m104772a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.location.zzdp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    @Deprecated
    public final zzds zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    /* JADX INFO: renamed from: zze */
    public final auu0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzds subList(int i, int i2) {
        iku0.m140418c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? zzdt.zza : new zzdr(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final ivu0 listIterator(int i) {
        iku0.m140417b(i, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new hpu0(this, i);
    }
}
