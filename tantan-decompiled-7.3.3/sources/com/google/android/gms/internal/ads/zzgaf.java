package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import p153l.btw0;
import p153l.etw0;
import p153l.jqw0;
import p153l.qsw0;
import p153l.tow0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzgaf extends zzfzv implements Set {
    private transient zzgaa zza;

    public static int zzh(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            tow0.m192091f(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static C2306x2 zzj(int i) {
        return new C2306x2(i);
    }

    public static zzgaf zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgaf zzm(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgcb(objArr[0]);
        }
        return zzgbq.zza;
    }

    public static zzgaf zzn() {
        return zzgbq.zza;
    }

    public static zzgaf zzo(Object obj) {
        return new zzgcb(obj);
    }

    public static zzgaf zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgaf zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgaf zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgaf zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzv(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgaf zzv(int i, Object... objArr) {
        if (i == 0) {
            return zzgbq.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgcb(obj);
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i2 = iZzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            qsw0.m177819a(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iM146640a = jqw0.m146640a(iHashCode);
            while (true) {
                int i6 = iM146640a & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM146640a++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgcb(obj4);
        }
        if (zzh(i4) < iZzh / 2) {
            return zzv(i4, objArr);
        }
        if (zzw(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzgbq(objArr, i3, objArr2, i2, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgaf) && zzu() && ((zzgaf) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return btw0.m106406d(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return btw0.m106403a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public zzgaa zzd() {
        zzgaa zzgaaVar = this.zza;
        if (zzgaaVar != null) {
            return zzgaaVar;
        }
        zzgaa zzgaaVarZzi = zzi();
        this.zza = zzgaaVarZzi;
        return zzgaaVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract etw0 iterator();

    public zzgaa zzi() {
        Object[] array = toArray();
        int i = zzgaa.zzd;
        return zzgaa.zzi(array, array.length);
    }

    public boolean zzu() {
        return false;
    }
}
