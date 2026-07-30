package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p153l.etw0;
import p153l.ftw0;
import p153l.kow0;
import p153l.nqw0;
import p153l.qsw0;
import p153l.tow0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzgaa<E> extends zzfzv<E> implements List<E>, RandomAccess {
    private static final ftw0 zza = new nqw0(zzgbk.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzgaa zzi(Object[] objArr, int i) {
        return i == 0 ? zzgbk.zza : new zzgbk(objArr, i);
    }

    public static zzgaa zzj(Collection collection) {
        if (!(collection instanceof zzfzv)) {
            Object[] array = collection.toArray();
            int length = array.length;
            qsw0.m177820b(array, length);
            return zzi(array, length);
        }
        zzgaa zzgaaVarZzd = ((zzfzv) collection).zzd();
        if (!zzgaaVarZzd.zzf()) {
            return zzgaaVarZzd;
        }
        Object[] array2 = zzgaaVarZzd.toArray();
        return zzi(array2, array2.length);
    }

    public static zzgaa zzk(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgbk.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        qsw0.m177820b(objArr2, length);
        return zzi(objArr2, length);
    }

    public static zzgaa zzl() {
        return zzgbk.zza;
    }

    public static zzgaa zzm(Object obj) {
        Object[] objArr = {obj};
        qsw0.m177820b(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzgaa zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        qsw0.m177820b(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzgaa zzo(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        qsw0.m177820b(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzgaa zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        qsw0.m177820b(objArr, 5);
        return zzi(objArr, 5);
    }

    public static zzgaa zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        qsw0.m177820b(objArr, 6);
        return zzi(objArr, 6);
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

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
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
                if (!kow0.m150688a(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<E> it = iterator();
        Iterator<E> it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !kow0.m150688a(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.ads.zzfzv
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    @Deprecated
    public final zzgaa zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    /* JADX INFO: renamed from: zze */
    public final etw0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgaa subList(int i, int i2) {
        tow0.m192093h(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? zzgbk.zza : new zzfzz(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final ftw0 listIterator(int i) {
        tow0.m192087b(i, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new nqw0(this, i);
    }
}
