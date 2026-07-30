package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;
import p149l.dhw0;
import p149l.miw0;
import p149l.nfw0;
import p149l.ngw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgbp extends zzgad {
    static final zzgad zza = new zzgbp(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgbp(Object obj, Object[] objArr, int i) {
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
    public static zzgbp zzj(int i, Object[] objArr, C2275w2 c2275w2) {
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
        miw0 miw0Var;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return (zzgbp) zza;
        }
        miw0 miw0Var2 = null;
        ?? r5 = 0;
        miw0 miw0Var3 = null;
        miw0 miw0Var4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            ngw0.m159362b(obj, obj2);
            return new zzgbp(null, objArrCopyOf, 1);
        }
        nfw0.m159280b(i4, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iZzh = zzgaf.zzh(i4);
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
                    ngw0.m159362b(obj3, obj4);
                    int iM111842a = dhw0.m111842a(obj3.hashCode());
                    while (true) {
                        int i11 = iM111842a & i6;
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
                            miw0 miw0Var5 = new miw0(obj3, obj4, obj5);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj4;
                            miw0Var3 = miw0Var5;
                            break;
                        }
                        iM111842a = i11 + 1;
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
                    sArr[2] = miw0Var3;
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
                        ngw0.m159362b(obj6, obj7);
                        int iM111842a2 = dhw0.m111842a(obj6.hashCode());
                        while (true) {
                            int i18 = iM111842a2 & i6;
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
                                miw0 miw0Var6 = new miw0(obj6, obj7, obj8);
                                objArrCopyOf[i19 == true ? 1 : 0] = obj7;
                                miw0Var4 = miw0Var6;
                                break;
                            }
                            iM111842a2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), miw0Var4};
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
                        ngw0.m159362b(obj9, obj10);
                        int iM111842a3 = dhw0.m111842a(obj9.hashCode());
                        while (true) {
                            int i24 = iM111842a3 & i6;
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
                                miw0 miw0Var7 = new miw0(obj9, obj10, obj11);
                                objArrCopyOf[i26] = obj10;
                                miw0Var2 = miw0Var7;
                                break;
                            }
                            iM111842a3 = i24 + 1;
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
                        objArr3[c] = miw0Var2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                miw0Var = (miw0) objArr2[c];
                if (c2275w2 != null) {
                    throw miw0Var.m154763a();
                }
                c2275w2.f10098c = miw0Var;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj12;
                i4 = iIntValue;
            }
            return new zzgbp(r4, objArrCopyOf, i4);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        ngw0.m159362b(obj13, obj14);
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
            miw0Var = (miw0) objArr2[c];
            if (c2275w2 != null) {
                throw miw0Var.m154763a();
            }
            c2275w2.f10098c = miw0Var;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj15;
            i4 = iIntValue2;
        }
        return new zzgbp(r4, objArrCopyOf, i4);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.zzgad, java.util.Map
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
                    int iM111842a = dhw0.m111842a(obj.hashCode());
                    while (true) {
                        int i2 = iM111842a & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iM111842a = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM111842a2 = dhw0.m111842a(obj.hashCode());
                    while (true) {
                        int i4 = iM111842a2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iM111842a2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM111842a3 = dhw0.m111842a(obj.hashCode());
                    while (true) {
                        int i5 = iM111842a3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iM111842a3 = i5 + 1;
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

    @Override // com.google.android.gms.internal.ads.zzgad
    public final zzfzv zza() {
        return new zzgbo(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final zzgaf zzf() {
        return new zzgbm(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final zzgaf zzg() {
        return new zzgbn(this, new zzgbo(this.zzb, 0, this.zzd));
    }
}
