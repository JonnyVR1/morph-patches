package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p149l.dhw0;
import p149l.efw0;
import p149l.nfw0;
import p149l.okw0;
import p149l.wgw0;

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
        int iM111843b = dhw0.m111843b(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iM203083c = wgw0.m203083c(obj2, iM111843b & iZzv);
        if (iM203083c != 0) {
            int i = ~iZzv;
            int i2 = iM111843b & i;
            do {
                int i3 = iM203083c - 1;
                int i4 = zzA()[i3];
                if ((i4 & i) == i2 && efw0.m116096a(obj, zzB()[i3])) {
                    return i3;
                }
                iM203083c = i4 & iZzv;
            } while (iM203083c != 0);
        }
        return -1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objM203084d = wgw0.m203084d(i2);
        if (i4 != 0) {
            wgw0.m203085e(objM203084d, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM203083c = wgw0.m203083c(obj, i6);
            while (iM203083c != 0) {
                int i7 = iM203083c - 1;
                int i8 = iArrZzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM203083c2 = wgw0.m203083c(objM203084d, i10);
                wgw0.m203085e(objM203084d, i10, iM203083c);
                iArrZzA[i7] = ((~i5) & i9) | (iM203083c2 & i5);
                iM203083c = i8 & i;
            }
        }
        this.zze = objM203084d;
        zzz(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iM203082b = wgw0.m203082b(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iM203082b != -1) {
                Object obj3 = zzC()[iM203082b];
                zzq(iM203082b, iZzv);
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
            this.zzf = okw0.m164906b(size(), 3, 1073741823);
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
            if (efw0.m116096a(obj, zzC()[i])) {
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
        C2235r2 c2235r2 = new C2235r2(this);
        this.zzi = c2235r2;
        return c2235r2;
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
        C2251t2 c2251t2 = new C2251t2(this);
        this.zzh = c2251t2;
        return c2251t2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (zzr()) {
            nfw0.m159288j(zzr(), "Arrays already allocated");
            int i2 = this.zzf;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = wgw0.m203084d(iMax2);
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
        int iM111843b = dhw0.m111843b(obj);
        int iZzv = zzv();
        int i5 = iM111843b & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iM203083c = wgw0.m203083c(obj3, i5);
        if (iM203083c == 0) {
            if (i4 > iZzv) {
                iZzv = zzx(iZzv, wgw0.m203081a(iZzv), iM111843b, i3);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                wgw0.m203085e(obj4, i5, i4);
            }
            i = 1;
        } else {
            int i6 = ~iZzv;
            int i7 = iM111843b & i6;
            int i8 = 0;
            while (true) {
                int i9 = iM203083c - 1;
                int i10 = iArrZzA[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && efw0.m116096a(obj, objArrZzB[i9])) {
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
                        iZzv = zzx(iZzv, wgw0.m203081a(iZzv), iM111843b, i3);
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
                iM203083c = i12;
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
        zzA()[i3] = (~iZzv) & iM111843b;
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
        C2267v2 c2267v2 = new C2267v2(this);
        this.zzj = c2267v2;
        return c2267v2;
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
        this.zzf = okw0.m164906b(8, 1, 1073741823);
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
        int iM111843b = dhw0.m111843b(obj2) & i2;
        int iM203083c = wgw0.m203083c(obj, iM111843b);
        if (iM203083c == size) {
            wgw0.m203085e(obj, iM111843b, i4);
            return;
        }
        while (true) {
            int i5 = iM203083c - 1;
            int i6 = iArrZzA[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrZzA[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iM203083c = i7;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzfzj() {
        zzp(3);
    }
}
