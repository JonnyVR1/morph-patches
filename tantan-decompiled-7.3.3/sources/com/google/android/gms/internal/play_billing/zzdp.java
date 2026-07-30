package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;
import p153l.b1t0;
import p153l.net0;
import p153l.ses0;
import p153l.zpt0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdp extends zzcr {
    static final zzcr zza = new zzdp(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzdp(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static zzdp zzg(int i, Object[] objArr, C2397b c2397b) {
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        zpt0 zpt0Var;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return (zzdp) zza;
        }
        zpt0 zpt0Var2 = null;
        ?? r5 = 0;
        zpt0 zpt0Var3 = null;
        zpt0 zpt0Var4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            b1t0.m101504b(obj, obj2);
            return new zzdp(null, objArrCopyOf, 1);
        }
        ses0.m185567b(i4, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iZzh = zzcv.zzh(i4);
        char c3 = 2;
        if (i4 != 1) {
            int i6 = iZzh - 1;
            if (iZzh <= 128) {
                byte[] bArr = new byte[iZzh];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj3 = objArrCopyOf[i10];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i10 ^ i5];
                    Objects.requireNonNull(obj4);
                    b1t0.m101504b(obj3, obj4);
                    int iM162908a = net0.m162908a(obj3.hashCode());
                    while (true) {
                        int i11 = iM162908a & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = obj3;
                                objArrCopyOf[i9 ^ 1] = obj4;
                            }
                            i8++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj5 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            zpt0 zpt0Var5 = new zpt0(obj3, obj4, obj5);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj4;
                            zpt0Var3 = zpt0Var5;
                            break;
                        }
                        iM162908a = i11 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    r5 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = zpt0Var3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (iZzh <= 32768) {
                    sArr = new short[iZzh];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj6 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj7);
                        b1t0.m101504b(obj6, obj7);
                        int iM162908a2 = net0.m162908a(obj6.hashCode());
                        while (true) {
                            int i18 = iM162908a2 & i6;
                            char c4 = (char) sArr[i18];
                            if (c4 == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArrCopyOf[i16] = obj6;
                                    objArrCopyOf[i16 ^ 1] = obj7;
                                }
                                i14++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c4])) {
                                int i19 = c4 ^ 1;
                                Object obj8 = objArrCopyOf[i19 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zpt0 zpt0Var6 = new zpt0(obj6, obj7, obj8);
                                objArrCopyOf[i19 == true ? 1 : 0] = obj7;
                                zpt0Var4 = zpt0Var6;
                                break;
                            }
                            iM162908a2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), zpt0Var4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iZzh];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj9 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj10);
                        b1t0.m101504b(obj9, obj10);
                        int iM162908a3 = net0.m162908a(obj9.hashCode());
                        while (true) {
                            int i24 = iM162908a3 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArrCopyOf[i22] = obj9;
                                    objArrCopyOf[i22 ^ 1] = obj10;
                                }
                                i21++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj9.equals(objArrCopyOf[i25])) {
                                int i26 = i25 ^ 1;
                                Object obj11 = objArrCopyOf[i26];
                                Objects.requireNonNull(obj11);
                                zpt0 zpt0Var7 = new zpt0(obj9, obj10, obj11);
                                objArrCopyOf[i26] = obj10;
                                zpt0Var2 = zpt0Var7;
                                break;
                            }
                            iM162908a3 = i24 + 1;
                            c3 = c2;
                        }
                        i20++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i21 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i21);
                        objArr3[c] = zpt0Var2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                zpt0Var = (zpt0) objArr2[c];
                if (c2397b != null) {
                    throw zpt0Var.m220930a();
                }
                c2397b.f10346c = zpt0Var;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj12;
                i4 = iIntValue;
            }
            return new zzdp(r4, objArrCopyOf, i4);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        b1t0.m101504b(obj13, obj14);
        z4 = false;
        i4 = 1;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            zpt0Var = (zpt0) objArr2[c];
            if (c2397b != null) {
                throw zpt0Var.m220930a();
            }
            c2397b.f10346c = zpt0Var;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj15;
            i4 = iIntValue2;
        }
        return new zzdp(r4, objArrCopyOf, i4);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.zzcr, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM162908a = net0.m162908a(obj.hashCode());
                    while (true) {
                        int i2 = iM162908a & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iM162908a = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM162908a2 = net0.m162908a(obj.hashCode());
                    while (true) {
                        int i4 = iM162908a2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iM162908a2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM162908a3 = net0.m162908a(obj.hashCode());
                    while (true) {
                        int i5 = iM162908a3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iM162908a3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcr
    public final zzcj zza() {
        return new zzdo(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcr
    public final zzcv zzd() {
        return new zzdm(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcr
    public final zzcv zze() {
        return new zzdn(this, new zzdo(this.zzb, 0, this.zzd));
    }
}
