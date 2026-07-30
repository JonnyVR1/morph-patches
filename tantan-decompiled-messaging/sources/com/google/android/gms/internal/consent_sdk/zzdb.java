package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p149l.ig3;
import p149l.jjw0;
import p149l.n3u0;
import p149l.rpt0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzdb extends zzcx implements Set {
    private transient zzda zza;

    public static int zzf(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        ig3.m135964a("collection too large");
        return 0;
    }

    public static zzdb zzi() {
        return zzde.zza;
    }

    public static zzdb zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    private static zzdb zzl(int i, Object... objArr) {
        if (i == 0) {
            return zzde.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzdf(obj);
        }
        int iZzf = zzf(i);
        Object[] objArr2 = new Object[iZzf];
        int i2 = iZzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                jjw0.m141817a(i5);
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iM180399a = rpt0.m180399a(iHashCode);
            while (true) {
                int i6 = iM180399a & i2;
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
                iM180399a++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzdf(obj4);
        }
        if (zzf(i4) < iZzf / 2) {
            return zzl(i4, objArr);
        }
        if (i4 < 3) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzde(objArr, i3, objArr2, i2, i4);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdb) && zzk() && ((zzdb) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract n3u0 iterator();

    public final zzda zzg() {
        zzda zzdaVar = this.zza;
        if (zzdaVar != null) {
            return zzdaVar;
        }
        zzda zzdaVarZzh = zzh();
        this.zza = zzdaVarZzh;
        return zzdaVarZzh;
    }

    public zzda zzh() {
        Object[] array = toArray();
        int i = zzda.zzd;
        return zzda.zzg(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
