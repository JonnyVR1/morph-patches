package com.google.android.libraries.places.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zznx extends zznt implements List, RandomAccess {
    private static final zzoy zza = new zznv(zzom.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zznx zzi(Object[] objArr, int i) {
        return i == 0 ? zzom.zza : new zzom(objArr, i);
    }

    public static zznx zzj(Collection collection) {
        if (!(collection instanceof zznt)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzoi.zzb(array, length);
            return zzi(array, length);
        }
        zznx zznxVarZzd = ((zznt) collection).zzd();
        if (!zznxVarZzd.zzf()) {
            return zznxVarZzd;
        }
        Object[] array2 = zznxVarZzd.toArray();
        return zzi(array2, array2.length);
    }

    public static zznx zzk(Object[] objArr) {
        if (objArr.length == 0) {
            return zzom.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzoi.zzb(objArr2, length);
        return zzi(objArr2, length);
    }

    public static zznx zzl() {
        return zzom.zza;
    }

    public static zznx zzm(Object obj) {
        Object[] objArr = {obj};
        zzoi.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zznx zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzoi.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    @SafeVarargs
    public static zznx zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Object[] objArr2 = new Object[39];
        objArr2[0] = "accessibilityOptions";
        objArr2[1] = "addressComponents";
        objArr2[2] = "attributions";
        objArr2[3] = "businessStatus";
        objArr2[4] = "curbsidePickup";
        objArr2[5] = "currentOpeningHours";
        objArr2[6] = "delivery";
        objArr2[7] = "dineIn";
        objArr2[8] = "displayName";
        objArr2[9] = "editorialSummary";
        objArr2[10] = "formattedAddress";
        objArr2[11] = "iconBackgroundColor";
        System.arraycopy(objArr, 0, objArr2, 12, 27);
        zzoi.zzb(objArr2, 39);
        return zzi(objArr2, 39);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zznx zzp(Comparator comparator, Iterable iterable) {
        Object[] array = iterable.toArray();
        int length = array.length;
        zzoi.zzb(array, length);
        Arrays.sort(array, comparator);
        return zzi(array, length);
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

    @Override // com.google.android.libraries.places.internal.zznt, java.util.AbstractCollection, java.util.Collection
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
                if (!zzmo.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzmo.zza(it.next(), it2.next())) {
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

    @Override // com.google.android.libraries.places.internal.zznt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.libraries.places.internal.zznt
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.libraries.places.internal.zznt
    @Deprecated
    public final zznx zzd() {
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznt
    /* JADX INFO: renamed from: zze */
    public final zzox iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zznx subList(int i, int i2) {
        zzmt.zzn(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? zzom.zza : new zznw(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final zzoy listIterator(int i) {
        zzmt.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zznv(this, i);
    }
}
