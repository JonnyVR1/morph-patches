package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p153l.cqw0;
import p153l.jqw0;
import p153l.kow0;
import p153l.tow0;
import p153l.utw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzfzj extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzfzj(int i) {
        zzp(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzfzj zzfzjVar, int i) {
        return zzfzjVar.zzB()[i];
    }

    public static /* synthetic */ Object zzi(zzfzj zzfzjVar) {
        Object obj = zzfzjVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzfzj zzfzjVar, int i) {
        return zzfzjVar.zzC()[i];
    }

    public static /* synthetic */ void zzn(zzfzj zzfzjVar, int i, Object obj) {
        zzfzjVar.zzC()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int iM146641b = jqw0.m146641b(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iM111995c = cqw0.m111995c(obj2, iM146641b & iZzv);
        if (iM111995c != 0) {
            int i = ~iZzv;
            int i2 = iM146641b & i;
            do {
                int i3 = iM111995c - 1;
                int i4 = zzA()[i3];
                if ((i4 & i) == i2 && kow0.m150688a(obj, zzB()[i3])) {
                    return i3;
                }
                iM111995c = i4 & iZzv;
            } while (iM111995c != 0);
        }
        return -1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objM111996d = cqw0.m111996d(i2);
        if (i4 != 0) {
            cqw0.m111997e(objM111996d, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM111995c = cqw0.m111995c(obj, i6);
            while (iM111995c != 0) {
                int i7 = iM111995c - 1;
                int i8 = iArrZzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM111995c2 = cqw0.m111995c(objM111996d, i10);
                cqw0.m111997e(objM111996d, i10, iM111995c);
                iArrZzA[i7] = ((~i5) & i9) | (iM111995c2 & i5);
                iM111995c = i8 & i;
            }
        }
        this.zze = objM111996d;
        zzz(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iM111994b = cqw0.m111994b(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iM111994b != -1) {
                Object obj3 = zzC()[iM111994b];
                zzq(iM111994b, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = utw0.m198112b(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (kow0.m150688a(obj, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        C2258r2 c2258r2 = new C2258r2(this);
        this.zzi = c2258r2;
        return c2258r2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        C2274t2 c2274t2 = new C2274t2(this);
        this.zzh = c2274t2;
        return c2274t2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (zzr()) {
            tow0.m192095j(zzr(), "Arrays already allocated");
            int i2 = this.zzf;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = cqw0.m111996d(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i2];
            this.zzb = new Object[i2];
            this.zzc = new Object[i2];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int iM146641b = jqw0.m146641b(obj);
        int iZzv = zzv();
        int i5 = iM146641b & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iM111995c = cqw0.m111995c(obj3, i5);
        if (iM111995c == 0) {
            if (i4 > iZzv) {
                iZzv = zzx(iZzv, cqw0.m111993a(iZzv), iM146641b, i3);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                cqw0.m111997e(obj4, i5, i4);
            }
            i = 1;
        } else {
            int i6 = ~iZzv;
            int i7 = iM146641b & i6;
            int i8 = 0;
            while (true) {
                int i9 = iM111995c - 1;
                int i10 = iArrZzA[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && kow0.m150688a(obj, objArrZzB[i9])) {
                    Object obj5 = objArrZzC[i9];
                    objArrZzC[i9] = obj2;
                    return obj5;
                }
                int i12 = i10 & iZzv;
                i8++;
                if (i12 == 0) {
                    if (i8 < 9) {
                        if (i4 <= iZzv) {
                            iArrZzA[i9] = (i4 & iZzv) | i11;
                            break;
                        }
                        iZzv = zzx(iZzv, cqw0.m111993a(iZzv), iM146641b, i3);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzo();
                    return linkedHashMap.put(obj, obj2);
                }
                iM111995c = i12;
            }
        }
        int length = zzA().length;
        if (i4 > length) {
            int i13 = i;
            int iMin = Math.min(1073741823, (Math.max(i13, length >>> 1) + length) | i13);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzA(), iMin);
                this.zzb = Arrays.copyOf(zzB(), iMin);
                this.zzc = Arrays.copyOf(zzC(), iMin);
            }
        }
        zzA()[i3] = (~iZzv) & iM146641b;
        zzB()[i3] = obj;
        zzC()[i3] = obj2;
        this.zzg = i4;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        C2290v2 c2290v2 = new C2290v2(this);
        this.zzj = c2290v2;
        return c2290v2;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i) {
        this.zzf = utw0.m198112b(8, 1, 1073741823);
    }

    public final void zzq(int i, int i2) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrZzB[i] = null;
            objArrZzC[i] = null;
            iArrZzA[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrZzB[i3];
        objArrZzB[i] = obj2;
        objArrZzC[i] = objArrZzC[i3];
        objArrZzB[i3] = null;
        objArrZzC[i3] = null;
        iArrZzA[i] = iArrZzA[i3];
        iArrZzA[i3] = 0;
        int iM146641b = jqw0.m146641b(obj2) & i2;
        int iM111995c = cqw0.m111995c(obj, iM146641b);
        if (iM111995c == size) {
            cqw0.m111997e(obj, iM146641b, i4);
            return;
        }
        while (true) {
            int i5 = iM111995c - 1;
            int i6 = iArrZzA[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrZzA[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iM111995c = i7;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzfzj() {
        zzp(3);
    }
}
