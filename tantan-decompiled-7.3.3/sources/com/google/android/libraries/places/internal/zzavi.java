package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.fig0;
import p153l.hkx0;
import p153l.ikx0;
import p153l.wg3;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
final class zzavi<T> implements zzavt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzawx.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzavf zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzaut zzm;
    private final zzawn zzn;
    private final zzatg zzo;
    private final zzavl zzp;
    private final zzava zzq;

    private zzavi(int[] iArr, Object[] objArr, int i, int i2, zzavf zzavfVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzavl zzavlVar, zzaut zzautVar, zzawn zzawnVar, zzatg zzatgVar, zzava zzavaVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzavfVar instanceof zzatu;
        boolean z2 = false;
        if (zzatgVar != null && zzatgVar.zzi(zzavfVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzavlVar;
        this.zzm = zzautVar;
        this.zzn = zzawnVar;
        this.zzo = zzatgVar;
        this.zzg = zzavfVar;
        this.zzq = zzavaVar;
    }

    private final void zzA(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int iZzp = zzp(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzp;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                hkx0.m135653a(obj2, this.zzc[i]);
                return;
            }
            zzavt zzavtVarZzs = zzs(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object objZzc = zzavtVarZzs.zzc();
                    zzavtVarZzs.zze(objZzc, object);
                    unsafe.putObject(obj, j, objZzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZzc2 = zzavtVarZzs.zzc();
                zzavtVarZzs.zze(objZzc2, object2);
                unsafe.putObject(obj, j, objZzc2);
                object2 = objZzc2;
            }
            zzavtVarZzs.zze(object2, object);
        }
    }

    private final void zzB(Object obj, int i, zzavs zzavsVar) throws IOException {
        long j = i & 1048575;
        if (zzH(i)) {
            zzawx.zzs(obj, j, zzavsVar.zzs());
        } else if (this.zzi) {
            zzawx.zzs(obj, j, zzavsVar.zzr());
        } else {
            zzawx.zzs(obj, j, zzavsVar.zzp());
        }
    }

    private final void zzC(Object obj, int i) {
        int iZzn = zzn(i);
        long j = 1048575 & iZzn;
        if (j == 1048575) {
            return;
        }
        zzawx.zzq(obj, j, (1 << (iZzn >>> 20)) | zzawx.zzc(obj, j));
    }

    private final void zzD(Object obj, int i, int i2) {
        zzawx.zzq(obj, zzn(i2) & 1048575, i);
    }

    private final void zzE(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzp(i) & 1048575, obj2);
        zzC(obj, i);
    }

    private final void zzF(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzp(i2) & 1048575, obj2);
        zzD(obj, i, i2);
    }

    private final boolean zzG(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private static boolean zzH(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzI(Object obj, int i) {
        int iZzn = zzn(i);
        long j = iZzn & 1048575;
        if (j != 1048575) {
            return ((1 << (iZzn >>> 20)) & zzawx.zzc(obj, j)) != 0;
        }
        int iZzp = zzp(i);
        long j2 = iZzp & 1048575;
        switch (zzo(iZzp)) {
            case 0:
                return Double.doubleToRawLongBits(zzawx.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzawx.zzb(obj, j2)) != 0;
            case 2:
                return zzawx.zzd(obj, j2) != 0;
            case 3:
                return zzawx.zzd(obj, j2) != 0;
            case 4:
                return zzawx.zzc(obj, j2) != 0;
            case 5:
                return zzawx.zzd(obj, j2) != 0;
            case 6:
                return zzawx.zzc(obj, j2) != 0;
            case 7:
                return zzawx.zzw(obj, j2);
            case 8:
                Object objZzf = zzawx.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzask) {
                    return !zzask.zzb.equals(objZzf);
                }
                fig0.m125680a();
                return false;
            case 9:
                return zzawx.zzf(obj, j2) != null;
            case 10:
                return !zzask.zzb.equals(zzawx.zzf(obj, j2));
            case 11:
                return zzawx.zzc(obj, j2) != 0;
            case 12:
                return zzawx.zzc(obj, j2) != 0;
            case 13:
                return zzawx.zzc(obj, j2) != 0;
            case 14:
                return zzawx.zzd(obj, j2) != 0;
            case 15:
                return zzawx.zzc(obj, j2) != 0;
            case 16:
                return zzawx.zzd(obj, j2) != 0;
            case 17:
                return zzawx.zzf(obj, j2) != null;
            default:
                fig0.m125680a();
                return false;
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzI(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzavt zzavtVar) {
        return zzavtVar.zzh(zzawx.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzatu) {
            return ((zzatu) obj).zzaH();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzawx.zzc(obj, (long) (zzn(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzawx.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzasy zzasyVar) throws IOException {
        if (obj instanceof String) {
            zzasyVar.zzG(i, (String) obj);
        } else {
            zzasyVar.zzd(i, (zzask) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0268  */
    /* JADX WARN: Code duplicated, block: B:127:0x026e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0284  */
    /* JADX WARN: Code duplicated, block: B:131:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x0351  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ad  */
    public static zzavi zzi(Class cls, zzavc zzavcVar, zzavl zzavlVar, zzaut zzautVar, zzawn zzawnVar, zzatg zzatgVar, zzava zzavaVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int iObjectFieldOffset2;
        int i21;
        int iObjectFieldOffset3;
        Field fieldZzx;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZzx2;
        int i27;
        Object obj2;
        Field fieldZzx3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zzavcVar instanceof zzavr)) {
            throw null;
        }
        zzavr zzavrVar = (zzavr) zzavcVar;
        String strZzd = zzavrVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strZzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strZzd.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i2 = 0;
            i6 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strZzd.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strZzd.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = strZzd.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strZzd.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strZzd.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strZzd.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strZzd.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strZzd.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = strZzd.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strZzd.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strZzd.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strZzd.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strZzd.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strZzd.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strZzd.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strZzd.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            i2 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i60 = iCharAt7;
            i3 = iCharAt5;
            i4 = i60;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = iCharAt9;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzavrVar.zze();
        Class<?> cls2 = zzavrVar.zza().getClass();
        int i61 = i6 + i4;
        int i62 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i62];
        int i63 = 0;
        int i64 = 0;
        int i65 = i6;
        int i66 = i61;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt10 = strZzd.charAt(i33);
            if (iCharAt10 >= c) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = strZzd.charAt(i69);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i16 = i30;
            } else {
                i16 = i67;
            }
            int i71 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = strZzd.charAt(i73);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i17 = i29;
            } else {
                i17 = i71;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt11 & 2048;
            zzavr zzavrVar2 = zzavrVar;
            if (i75 >= 51) {
                int i77 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        cCharAt10 = strZzd.charAt(i79);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i79 = i28;
                        c2 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i80);
                    i24 = i28;
                } else {
                    i24 = i77;
                }
                int i81 = i24;
                int i82 = i75 - 51;
                if (i82 == 9 || i82 == 17) {
                    i25 = i2 + 1;
                    int i83 = i63 / 3;
                    objArr[i83 + i83 + 1] = objArrZze[i2];
                } else {
                    if (i82 == 12) {
                        if (zzavrVar2.zzc() == 1 || i76 != 0) {
                            i25 = i2 + 1;
                            int i84 = i63 / 3;
                            objArr[i84 + i84 + 1] = objArrZze[i2];
                        } else {
                            i76 = 0;
                        }
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i26];
                    if (obj instanceof Field) {
                        fieldZzx2 = (Field) obj;
                    } else {
                        fieldZzx2 = zzx(cls2, (String) obj);
                        objArrZze[i26] = fieldZzx2;
                    }
                    int i85 = iCharAt10;
                    int i86 = i76;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzx2);
                    i27 = i26 + 1;
                    obj2 = objArrZze[i27];
                    if (obj2 instanceof Field) {
                        fieldZzx3 = (Field) obj2;
                    } else {
                        fieldZzx3 = zzx(cls2, (String) obj2);
                        objArrZze[i27] = fieldZzx3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzx3);
                    strZzd = strZzd;
                    i20 = i81;
                    i76 = i86;
                    i21 = 0;
                    i18 = i85;
                }
                i2 = i25;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrZze[i26];
                if (obj instanceof Field) {
                    fieldZzx2 = (Field) obj;
                } else {
                    fieldZzx2 = zzx(cls2, (String) obj);
                    objArrZze[i26] = fieldZzx2;
                }
                int i87 = iCharAt10;
                int i88 = i76;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzx2);
                i27 = i26 + 1;
                obj2 = objArrZze[i27];
                if (obj2 instanceof Field) {
                    fieldZzx3 = (Field) obj2;
                } else {
                    fieldZzx3 = zzx(cls2, (String) obj2);
                    objArrZze[i27] = fieldZzx3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzx3);
                strZzd = strZzd;
                i20 = i81;
                i76 = i88;
                i21 = 0;
                i18 = i87;
            } else {
                i18 = iCharAt10;
                int i89 = i2 + 1;
                Field fieldZzx4 = zzx(cls2, (String) objArrZze[i2]);
                if (i75 == 9 || i75 == 17) {
                    int i90 = i63 / 3;
                    objArr[i90 + i90 + 1] = fieldZzx4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i23 = i2 + 2;
                            i22 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i18 = i18;
                            if (zzavrVar2.zzc() == 1 || i76 != 0) {
                                i23 = i2 + 2;
                                int i91 = i63 / 3;
                                objArr[i91 + i91 + 1] = objArrZze[i89];
                                i19 = i23;
                            } else {
                                i19 = i89;
                                i76 = 0;
                            }
                        } else if (i75 == 50) {
                            i19 = i2 + 2;
                            int i92 = i65 + 1;
                            iArr[i65] = i63;
                            int i93 = i63 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArrZze[i89];
                            if (i76 != 0) {
                                objArr[i94 + 1] = objArrZze[i19];
                                i19 = i2 + 3;
                                i65 = i92;
                                i18 = i18;
                            } else {
                                i65 = i92;
                                i76 = 0;
                                i18 = i18;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzx4);
                        iCharAt11 = iCharAt11;
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            i20 = i17;
                            iObjectFieldOffset2 = 1048575;
                            i21 = 0;
                        } else {
                            int i95 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i20 = i95 + 1;
                                    cCharAt9 = strZzd.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i20;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i20 = i95;
                            }
                            int i98 = i7 + i7 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i98];
                            if (obj3 instanceof Field) {
                                fieldZzx = (Field) obj3;
                            } else {
                                fieldZzx = zzx(cls2, (String) obj3);
                                objArrZze[i98] = fieldZzx;
                            }
                            i21 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzx);
                        }
                        if (i75 >= 18 && i75 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        i2 = i19;
                    } else {
                        i22 = 1;
                        i23 = i2 + 2;
                    }
                    int i99 = i63 / 3;
                    objArr[i99 + i99 + i22] = objArrZze[i89];
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzx4);
                    iCharAt11 = iCharAt11;
                    if ((iCharAt11 & 4096) != 0) {
                        i20 = i17;
                        iObjectFieldOffset2 = 1048575;
                        i21 = 0;
                    } else {
                        i20 = i17;
                        iObjectFieldOffset2 = 1048575;
                        i21 = 0;
                    }
                    if (i75 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                    iObjectFieldOffset3 = iObjectFieldOffset;
                    i2 = i19;
                }
                i19 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzx4);
                iCharAt11 = iCharAt11;
                if ((iCharAt11 & 4096) != 0) {
                    i20 = i17;
                    iObjectFieldOffset2 = 1048575;
                    i21 = 0;
                } else {
                    i20 = i17;
                    iObjectFieldOffset2 = 1048575;
                    i21 = 0;
                }
                if (i75 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
                iObjectFieldOffset3 = iObjectFieldOffset;
                i2 = i19;
            }
            int i100 = i63 + 1;
            iArr3[i63] = i18;
            int i101 = i63 + 2;
            iArr3[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | (i76 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | iObjectFieldOffset3;
            i63 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i33 = i20;
            zzavrVar = zzavrVar2;
            strZzd = strZzd;
            length = length;
            c = 55296;
        }
        zzavr zzavrVar3 = zzavrVar;
        return new zzavi(iArr3, objArr, i3, i5, zzavrVar3.zza(), zzavrVar3.zzc(), false, iArr, i6, i61, zzavlVar, zzautVar, zzawnVar, zzatgVar, zzavaVar);
    }

    private static double zzk(Object obj, long j) {
        return ((Double) zzawx.zzf(obj, j)).doubleValue();
    }

    private static float zzl(Object obj, long j) {
        return ((Float) zzawx.zzf(obj, j)).floatValue();
    }

    private static int zzm(Object obj, long j) {
        return ((Integer) zzawx.zzf(obj, j)).intValue();
    }

    private final int zzn(int i) {
        return this.zzc[i + 2];
    }

    private static int zzo(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzp(int i) {
        return this.zzc[i + 1];
    }

    private static long zzq(Object obj, long j) {
        return ((Long) zzawx.zzf(obj, j)).longValue();
    }

    private final zzaty zzr(int i) {
        int i2 = i / 3;
        return (zzaty) this.zzd[i2 + i2 + 1];
    }

    private final zzavt zzs(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzavt zzavtVar = (zzavt) objArr[i3];
        if (zzavtVar != null) {
            return zzavtVar;
        }
        zzavt zzavtVarZzb = zzavp.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzavtVarZzb;
        return zzavtVarZzb;
    }

    private final Object zzt(Object obj, int i, Object obj2, zzawn zzawnVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzawx.zzf(obj, zzp(i) & 1048575);
        if (objZzf == null || zzr(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzu(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzv(Object obj, int i) {
        zzavt zzavtVarZzs = zzs(i);
        int iZzp = zzp(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzavtVarZzs.zzc();
        }
        Object object = zzb.getObject(obj, iZzp);
        if (zzL(object)) {
            return object;
        }
        Object objZzc = zzavtVarZzs.zzc();
        if (object != null) {
            zzavtVarZzs.zze(objZzc, object);
        }
        return objZzc;
    }

    private final Object zzw(Object obj, int i, int i2) {
        zzavt zzavtVarZzs = zzs(i2);
        if (!zzM(obj, i, i2)) {
            return zzavtVarZzs.zzc();
        }
        Object object = zzb.getObject(obj, zzp(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZzc = zzavtVarZzs.zzc();
        if (object != null) {
            zzavtVarZzs.zze(objZzc, object);
        }
        return objZzc;
    }

    private static Field zzx(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            ikx0.m140521a(str, cls.getName(), Arrays.toString(declaredFields));
            return null;
        }
    }

    private static void zzy(Object obj) {
        if (zzL(obj)) {
            return;
        }
        wg3.m206174a("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzz(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzp = zzp(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzp;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                hkx0.m135653a(obj2, this.zzc[i]);
                return;
            }
            zzavt zzavtVarZzs = zzs(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZzc = zzavtVarZzs.zzc();
                    zzavtVarZzs.zze(objZzc, object);
                    unsafe.putObject(obj, j, objZzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzC(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZzc2 = zzavtVarZzs.zzc();
                zzavtVarZzs.zze(objZzc2, object2);
                unsafe.putObject(obj, j, objZzc2);
                object2 = objZzc2;
            }
            zzavtVarZzs.zze(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x038a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0481  */
    /* JADX WARN: Code duplicated, block: B:282:0x071e A[PHI: r0 r1
      0x071e: PHI (r0v6 com.google.android.libraries.places.internal.zzavi<T>) = 
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v37 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v46 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
      (r0v1 com.google.android.libraries.places.internal.zzavi<T>)
     binds: [B:18:0x004f, B:280:0x0714, B:250:0x0650, B:234:0x05e9, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x071e: PHI (r1v7 java.lang.Object) = 
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v8 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
     binds: [B:18:0x004f, B:280:0x0714, B:250:0x0650, B:234:0x05e9, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.libraries.places.internal.zzavt
    public final int zza(Object obj) {
        int i;
        int iZzB;
        int iZzB2;
        int iZzB3;
        int iZzC;
        int iZzB4;
        int iZzB5;
        int iZzB6;
        int iZzd;
        int iZzB7;
        int iZzh;
        int i2;
        int iZzg;
        int size;
        int iZzl;
        int iZzB8;
        int iZzB9;
        int iZzB10;
        int iZzC2;
        int iZze;
        int iZzB11;
        int iZzB12;
        int iZzy;
        int iZzB13;
        int iZzB14;
        int iZzd2;
        int iZzB15;
        zzavi<T> zzaviVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i5 < zzaviVar.zzc.length) {
            int iZzp = zzaviVar.zzp(i5);
            int iZzo = zzo(iZzp);
            int[] iArr = zzaviVar.zzc;
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i4;
            if (iZzo <= 17) {
                if (i11 != i8) {
                    i6 = i11 == i4 ? 0 : unsafe.getInt(obj2, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = iZzp & i4;
            if (iZzo >= zzatl.zzJ.zza()) {
                zzatl.zzW.zza();
            }
            int i13 = i7;
            long j = i12;
            switch (iZzo) {
                case 0:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        iZzB = zzasx.zzB(i9 << 3);
                        iZzh = iZzB + 8;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 1:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        iZzB2 = zzasx.zzB(i9 << 3);
                        iZzB5 = iZzB2 + 4;
                        i7 = i13 + iZzB5;
                        zzaviVar = this;
                        obj2 = obj;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    obj2 = obj;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 2:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        iZzB3 = zzasx.zzB(i9 << 3);
                        iZzC = zzasx.zzC(j2);
                        i2 = iZzB3 + iZzC;
                        i7 = i13 + i2;
                        zzaviVar = this;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 3:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        iZzB3 = zzasx.zzB(i9 << 3);
                        iZzC = zzasx.zzC(j3);
                        i2 = iZzB3 + iZzC;
                        i7 = i13 + i2;
                        zzaviVar = this;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 4:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        iZzB3 = zzasx.zzB(i9 << 3);
                        iZzC = zzasx.zzC(j4);
                        i2 = iZzB3 + iZzC;
                        i7 = i13 + i2;
                        zzaviVar = this;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 5:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        iZzB4 = zzasx.zzB(i9 << 3);
                        iZzB5 = iZzB4 + 8;
                        i7 = i13 + iZzB5;
                        zzaviVar = this;
                        obj2 = obj;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    obj2 = obj;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 6:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        iZzB2 = zzasx.zzB(i9 << 3);
                        iZzB5 = iZzB2 + 4;
                        i7 = i13 + iZzB5;
                        zzaviVar = this;
                        obj2 = obj;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    obj2 = obj;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 7:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        iZzB5 = zzasx.zzB(i9 << 3) + 1;
                        i7 = i13 + iZzB5;
                        zzaviVar = this;
                        obj2 = obj;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    obj2 = obj;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 8:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        int i14 = i9 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzask) {
                            iZzB6 = zzasx.zzB(i14);
                            iZzd = ((zzask) object).zzd();
                            iZzB7 = zzasx.zzB(iZzd);
                            i2 = iZzB6 + iZzB7 + iZzd;
                            i7 = i13 + i2;
                            zzaviVar = this;
                            i5 += 3;
                            i4 = 1048575;
                        } else {
                            iZzB3 = zzasx.zzB(i14);
                            iZzC = zzasx.zzA((String) object);
                            i2 = iZzB3 + iZzC;
                            i7 = i13 + i2;
                            zzaviVar = this;
                            i5 += 3;
                            i4 = 1048575;
                        }
                    }
                    zzaviVar = this;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 9:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        iZzh = zzavv.zzh(i9, unsafe.getObject(obj2, j), zzaviVar.zzs(i5));
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 10:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzask zzaskVar = (zzask) unsafe.getObject(obj2, j);
                        iZzB6 = zzasx.zzB(i9 << 3);
                        iZzd = zzaskVar.zzd();
                        iZzB7 = zzasx.zzB(iZzd);
                        i2 = iZzB6 + iZzB7 + iZzd;
                        i7 = i13 + i2;
                        zzaviVar = this;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 11:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        iZzB3 = zzasx.zzB(i9 << 3);
                        iZzC = zzasx.zzB(i15);
                        i2 = iZzB3 + iZzC;
                        i7 = i13 + i2;
                        zzaviVar = this;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 12:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        iZzB3 = zzasx.zzB(i9 << 3);
                        iZzC = zzasx.zzC(j5);
                        i2 = iZzB3 + iZzC;
                        i7 = i13 + i2;
                        zzaviVar = this;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 13:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        iZzB2 = zzasx.zzB(i9 << 3);
                        iZzB5 = iZzB2 + 4;
                        i7 = i13 + iZzB5;
                        zzaviVar = this;
                        obj2 = obj;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    obj2 = obj;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 14:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        iZzB4 = zzasx.zzB(i9 << 3);
                        iZzB5 = iZzB4 + 8;
                        i7 = i13 + iZzB5;
                        zzaviVar = this;
                        obj2 = obj;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    obj2 = obj;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 15:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        iZzB3 = zzasx.zzB(i9 << 3);
                        iZzC = zzasx.zzB((i16 >> 31) ^ (i16 + i16));
                        i2 = iZzB3 + iZzC;
                        i7 = i13 + i2;
                        zzaviVar = this;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 16:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        iZzB3 = zzasx.zzB(i9 << 3);
                        iZzC = zzasx.zzC((j6 >> 63) ^ (j6 + j6));
                        i2 = iZzB3 + iZzC;
                        i7 = i13 + i2;
                        zzaviVar = this;
                        i5 += 3;
                        i4 = 1048575;
                    }
                    zzaviVar = this;
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 17:
                    if (zzaviVar.zzJ(obj2, i5, i8, i6, i)) {
                        iZzh = zzasx.zzy(i9, (zzavf) unsafe.getObject(obj2, j), zzaviVar.zzs(i5));
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 18:
                    iZzh = zzavv.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 19:
                    iZzh = zzavv.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzavv.zza;
                    if (list.size() == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzavv.zzg(list) + (list.size() * zzasx.zzB(i9 << 3));
                    }
                    i7 = iZzg + i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzavv.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzavv.zzl(list2);
                        iZzB8 = zzasx.zzB(i9 << 3);
                        iZzC2 = size * iZzB8;
                        iZzh = iZzl + iZzC2;
                    }
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzavv.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzavv.zzf(list3);
                        iZzB8 = zzasx.zzB(i9 << 3);
                        iZzC2 = size * iZzB8;
                        iZzh = iZzl + iZzC2;
                    }
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 23:
                    iZzh = zzavv.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 24:
                    iZzh = zzavv.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzavv.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = size2 * (zzasx.zzB(i9 << 3) + 1);
                    }
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzavv.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzasx.zzB(i9 << 3) * size3;
                        if (list5 instanceof zzaun) {
                            zzaun zzaunVar = (zzaun) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object objZzf = zzaunVar.zzf(i22);
                                if (objZzf instanceof zzask) {
                                    int iZzd3 = ((zzask) objZzf).zzd();
                                    iZzg += zzasx.zzB(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzasx.zzA((String) objZzf);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzask) {
                                    int iZzd4 = ((zzask) obj3).zzd();
                                    iZzg += zzasx.zzB(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzasx.zzA((String) obj3);
                                }
                            }
                        }
                    }
                    i7 = iZzg + i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzavt zzavtVarZzs = zzaviVar.zzs(i5);
                    int i24 = zzavv.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzB9 = 0;
                    } else {
                        iZzB9 = zzasx.zzB(i9 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zzaul) {
                                int iZza = ((zzaul) obj4).zza();
                                iZzB9 += zzasx.zzB(iZza) + iZza;
                            } else {
                                iZzB9 += zzasx.zzz((zzavf) obj4, zzavtVarZzs);
                            }
                        }
                    }
                    i7 = i13 + iZzB9;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzavv.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzB10 = 0;
                    } else {
                        iZzB10 = size5 * zzasx.zzB(i9 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int iZzd5 = ((zzask) list7.get(i27)).zzd();
                            iZzB10 += zzasx.zzB(iZzd5) + iZzd5;
                        }
                    }
                    i7 = i13 + iZzB10;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzavv.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzavv.zzk(list8);
                        iZzB8 = zzasx.zzB(i9 << 3);
                        iZzC2 = size * iZzB8;
                        iZzh = iZzl + iZzC2;
                    }
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzavv.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzavv.zza(list9);
                        iZzB8 = zzasx.zzB(i9 << 3);
                        iZzC2 = size * iZzB8;
                        iZzh = iZzl + iZzC2;
                    }
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 31:
                    iZzh = zzavv.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 32:
                    iZzh = zzavv.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzavv.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzavv.zzi(list10);
                        iZzB8 = zzasx.zzB(i9 << 3);
                        iZzC2 = size * iZzB8;
                        iZzh = iZzl + iZzC2;
                    }
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzavv.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzavv.zzj(list11);
                        iZzB8 = zzasx.zzB(i9 << 3);
                        iZzC2 = size * iZzB8;
                        iZzh = iZzl + iZzC2;
                    }
                    i7 = i13 + iZzh;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 35:
                    iZze = zzavv.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 36:
                    iZze = zzavv.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 37:
                    iZze = zzavv.zzg((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 38:
                    iZze = zzavv.zzl((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 39:
                    iZze = zzavv.zzf((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 40:
                    iZze = zzavv.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 41:
                    iZze = zzavv.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzavv.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 43:
                    iZze = zzavv.zzk((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 44:
                    iZze = zzavv.zza((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 45:
                    iZze = zzavv.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 46:
                    iZze = zzavv.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 47:
                    iZze = zzavv.zzi((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 48:
                    iZze = zzavv.zzj((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzB11 = zzasx.zzB(i9 << 3);
                        iZzB12 = zzasx.zzB(iZze);
                        iZzB10 = iZzB11 + iZzB12 + iZze;
                        i7 = i13 + iZzB10;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzavt zzavtVarZzs2 = zzaviVar.zzs(i5);
                    int i33 = zzavv.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzy = 0;
                    } else {
                        iZzy = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            iZzy += zzasx.zzy(i9, (zzavf) list13.get(i34), zzavtVarZzs2);
                        }
                    }
                    i7 = i13 + iZzy;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 50:
                    zzauz zzauzVar = (zzauz) unsafe.getObject(obj2, j);
                    if (!zzauzVar.isEmpty()) {
                        Iterator it = zzauzVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 51:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        iZzB = zzasx.zzB(i9 << 3);
                        iZzh = iZzB + 8;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 52:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        iZzB13 = zzasx.zzB(i9 << 3);
                        iZzh = iZzB13 + 4;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 53:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        long jZzq = zzq(obj2, j);
                        iZzl = zzasx.zzB(i9 << 3);
                        iZzC2 = zzasx.zzC(jZzq);
                        iZzh = iZzl + iZzC2;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 54:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        long jZzq2 = zzq(obj2, j);
                        iZzl = zzasx.zzB(i9 << 3);
                        iZzC2 = zzasx.zzC(jZzq2);
                        iZzh = iZzl + iZzC2;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 55:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        long jZzm = zzm(obj2, j);
                        iZzl = zzasx.zzB(i9 << 3);
                        iZzC2 = zzasx.zzC(jZzm);
                        iZzh = iZzl + iZzC2;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 56:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        iZzB = zzasx.zzB(i9 << 3);
                        iZzh = iZzB + 8;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 57:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        iZzB13 = zzasx.zzB(i9 << 3);
                        iZzh = iZzB13 + 4;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 58:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        iZzh = zzasx.zzB(i9 << 3) + 1;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 59:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        int i35 = i9 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzask) {
                            iZzB14 = zzasx.zzB(i35);
                            iZzd2 = ((zzask) object2).zzd();
                            iZzB15 = zzasx.zzB(iZzd2);
                            iZzh = iZzB14 + iZzB15 + iZzd2;
                            i7 = i13 + iZzh;
                        } else {
                            iZzl = zzasx.zzB(i35);
                            iZzC2 = zzasx.zzA((String) object2);
                            iZzh = iZzl + iZzC2;
                            i7 = i13 + iZzh;
                        }
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 60:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        iZzh = zzavv.zzh(i9, unsafe.getObject(obj2, j), zzaviVar.zzs(i5));
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 61:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        zzask zzaskVar2 = (zzask) unsafe.getObject(obj2, j);
                        iZzB14 = zzasx.zzB(i9 << 3);
                        iZzd2 = zzaskVar2.zzd();
                        iZzB15 = zzasx.zzB(iZzd2);
                        iZzh = iZzB14 + iZzB15 + iZzd2;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 62:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        int iZzm = zzm(obj2, j);
                        iZzl = zzasx.zzB(i9 << 3);
                        iZzC2 = zzasx.zzB(iZzm);
                        iZzh = iZzl + iZzC2;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 63:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        long jZzm2 = zzm(obj2, j);
                        iZzl = zzasx.zzB(i9 << 3);
                        iZzC2 = zzasx.zzC(jZzm2);
                        iZzh = iZzl + iZzC2;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 64:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        iZzB13 = zzasx.zzB(i9 << 3);
                        iZzh = iZzB13 + 4;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 65:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        iZzB = zzasx.zzB(i9 << 3);
                        iZzh = iZzB + 8;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 66:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        int iZzm2 = zzm(obj2, j);
                        iZzl = zzasx.zzB(i9 << 3);
                        iZzC2 = zzasx.zzB((iZzm2 >> 31) ^ (iZzm2 + iZzm2));
                        iZzh = iZzl + iZzC2;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 67:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        long jZzq3 = zzq(obj2, j);
                        iZzl = zzasx.zzB(i9 << 3);
                        iZzC2 = zzasx.zzC((jZzq3 >> 63) ^ (jZzq3 + jZzq3));
                        iZzh = iZzl + iZzC2;
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 68:
                    if (zzaviVar.zzM(obj2, i9, i5)) {
                        iZzh = zzasx.zzy(i9, (zzavf) unsafe.getObject(obj2, j), zzaviVar.zzs(i5));
                        i7 = i13 + iZzh;
                    } else {
                        i7 = i13;
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                default:
                    i7 = i13;
                    i5 += 3;
                    i4 = 1048575;
                    break;
            }
        }
        zzawn zzawnVar = zzaviVar.zzn;
        int iZza2 = i7 + zzawnVar.zza(zzawnVar.zzd(obj2));
        if (!zzaviVar.zzh) {
            return iZza2;
        }
        zzatk zzatkVarZzb = zzaviVar.zzo.zzb(obj2);
        int iZzb = 0;
        while (true) {
            int iZzb2 = zzatkVarZzb.zza.zzb();
            zzawg zzawgVar = zzatkVarZzb.zza;
            if (i3 >= iZzb2) {
                for (Map.Entry entry2 : zzawgVar.zzc()) {
                    iZzb += zzatk.zzb((zzatj) entry2.getKey(), entry2.getValue());
                }
                return iZza2 + iZzb;
            }
            Map.Entry entryZzg = zzawgVar.zzg(i3);
            iZzb += zzatk.zzb((zzatj) entryZzg.getKey(), entryZzg.getValue());
            i3++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzavt
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzp = zzp(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzp;
            int iZzo = zzo(iZzp);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzo) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzawx.zza(obj, j));
                    byte[] bArr = zzaud.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzawx.zzb(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzawx.zzd(obj, j);
                    byte[] bArr2 = zzaud.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzawx.zzd(obj, j);
                    byte[] bArr3 = zzaud.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = zzawx.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzawx.zzd(obj, j);
                    byte[] bArr4 = zzaud.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = zzawx.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = zzaud.zza(zzawx.zzw(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzawx.zzf(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzf = zzawx.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = zzawx.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = zzawx.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = zzawx.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = zzawx.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzawx.zzd(obj, j);
                    byte[] bArr5 = zzaud.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = zzawx.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzawx.zzd(obj, j);
                    byte[] bArr6 = zzaud.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzf2 = zzawx.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iFloatToIntBits = zzawx.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = zzawx.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzk(obj, j));
                        byte[] bArr7 = zzaud.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzl(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr8 = zzaud.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr9 = zzaud.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr10 = zzaud.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzaud.zza(zzN(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzawx.zzf(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzawx.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzawx.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr11 = zzaud.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzm(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzq(obj, j);
                        byte[] bArr12 = zzaud.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzawx.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzn.zzd(obj).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode2;
    }

    @Override // com.google.android.libraries.places.internal.zzavt
    public final Object zzc() {
        return ((zzatu) this.zzg).zzat();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzavt
    public final void zzd(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzatu) {
                zzatu zzatuVar = (zzatu) obj;
                zzatuVar.zzaF(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzatuVar.zza = 0;
                zzatuVar.zzaD();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzp = zzp(i);
                int i2 = 1048575 & iZzp;
                int iZzo = zzo(iZzp);
                long j = i2;
                if (iZzo != 9) {
                    if (iZzo != 60 && iZzo != 68) {
                        switch (iZzo) {
                            case 17:
                                if (zzI(obj, i)) {
                                    zzs(i).zzd(zzb.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzm.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzauz) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzs(i).zzd(zzb.getObject(obj, j));
                    }
                } else if (zzI(obj, i)) {
                    zzs(i).zzd(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzavt
    public final void zze(Object obj, Object obj2) {
        zzy(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzp = zzp(i);
            int i2 = 1048575 & iZzp;
            int[] iArr = this.zzc;
            int iZzo = zzo(iZzp);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzo) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzawx.zzo(obj, j, zzawx.zza(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i)) {
                        zzawx.zzp(obj, j, zzawx.zzb(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i)) {
                        zzawx.zzr(obj, j, zzawx.zzd(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i)) {
                        zzawx.zzr(obj, j, zzawx.zzd(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i)) {
                        zzawx.zzq(obj, j, zzawx.zzc(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i)) {
                        zzawx.zzr(obj, j, zzawx.zzd(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i)) {
                        zzawx.zzq(obj, j, zzawx.zzc(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i)) {
                        zzawx.zzm(obj, j, zzawx.zzw(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i)) {
                        zzawx.zzs(obj, j, zzawx.zzf(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 9:
                    zzz(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzawx.zzs(obj, j, zzawx.zzf(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i)) {
                        zzawx.zzq(obj, j, zzawx.zzc(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i)) {
                        zzawx.zzq(obj, j, zzawx.zzc(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i)) {
                        zzawx.zzq(obj, j, zzawx.zzc(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i)) {
                        zzawx.zzr(obj, j, zzawx.zzd(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i)) {
                        zzawx.zzq(obj, j, zzawx.zzc(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i)) {
                        zzawx.zzr(obj, j, zzawx.zzd(obj2, j));
                        zzC(obj, i);
                    }
                    break;
                case 17:
                    zzz(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzavv.zza;
                    zzawx.zzs(obj, j, zzava.zza(zzawx.zzf(obj, j), zzawx.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i3, i)) {
                        zzawx.zzs(obj, j, zzawx.zzf(obj2, j));
                        zzD(obj, i3, i);
                    }
                    break;
                case 60:
                    zzA(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzawx.zzs(obj, j, zzawx.zzf(obj2, j));
                        zzD(obj, i3, i);
                    }
                    break;
                case 68:
                    zzA(obj, obj2, i);
                    break;
            }
        }
        zzavv.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzavv.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x06fd A[Catch: all -> 0x0729, TryCatch #4 {all -> 0x0729, blocks: (B:87:0x0131, B:195:0x06f8, B:197:0x06fd, B:198:0x0702, B:88:0x0144, B:90:0x0153, B:91:0x015a, B:92:0x0170, B:93:0x0186, B:94:0x019c, B:96:0x01aa, B:99:0x01b1, B:100:0x01b7, B:101:0x01c5, B:102:0x01dc, B:103:0x01ef, B:104:0x0205, B:105:0x0211, B:106:0x0228, B:107:0x023f, B:108:0x0256, B:109:0x026d, B:110:0x0284, B:111:0x029b, B:112:0x02b2, B:113:0x02c9, B:115:0x02dd, B:117:0x02e6, B:119:0x0301, B:120:0x0305, B:118:0x02f6, B:121:0x0306, B:122:0x031c, B:123:0x032e, B:124:0x0340, B:125:0x0352, B:126:0x0364, B:135:0x0397, B:136:0x03a5, B:137:0x03b7, B:138:0x03c9, B:139:0x03db, B:140:0x03ed, B:141:0x03ff, B:142:0x0411, B:143:0x0423, B:144:0x0435, B:145:0x0447, B:146:0x0459, B:147:0x046b, B:148:0x047d, B:153:0x04a0, B:154:0x04ae, B:155:0x04c0, B:156:0x04d6, B:160:0x04e5, B:161:0x04f1, B:162:0x0500, B:163:0x0512, B:164:0x0524, B:165:0x0536, B:166:0x0548, B:167:0x055a, B:168:0x056c, B:169:0x057e, B:170:0x0590, B:171:0x05a6, B:172:0x05b9, B:173:0x05cc, B:174:0x05df, B:175:0x05f2, B:177:0x0600, B:180:0x0607, B:181:0x060d, B:182:0x0618, B:183:0x062b, B:184:0x063e, B:185:0x0654, B:186:0x0660, B:187:0x0673, B:188:0x0686, B:189:0x0699, B:190:0x06ac, B:191:0x06bf, B:192:0x06d2, B:193:0x06e5), top: B:227:0x0131 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x070f A[LOOP:4: B:201:0x070b->B:203:0x070f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0722  */
    /* JADX WARN: Code duplicated, block: B:208:0x0726  */
    /* JADX WARN: Code duplicated, block: B:214:0x0734 A[LOOP:3: B:212:0x0730->B:214:0x0734, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x0747  */
    /* JADX WARN: Code duplicated, block: B:250:0x0708 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzavt
    public final void zzf(Object obj, zzavs zzavsVar, zzatf zzatfVar) throws Throwable {
        Object obj2;
        int i;
        Object objZzt;
        Object obj3;
        Object objZzt2;
        Object obj4;
        zzavi<T> zzaviVar;
        Object obj5;
        int i2;
        Object objZzo;
        zzavi<T> zzaviVar2 = this;
        zzatf zzatfVar2 = zzatfVar;
        zzatfVar2.getClass();
        zzy(obj);
        zzawn zzawnVar = zzaviVar2.zzn;
        zzatg zzatgVar = zzaviVar2.zzo;
        Object objZzc = null;
        zzatk zzatkVarZzc = null;
        while (true) {
            try {
                int iZzc = zzavsVar.zzc();
                int i3 = -1;
                if (iZzc >= zzaviVar2.zze && iZzc <= zzaviVar2.zzf) {
                    int length = (zzaviVar2.zzc.length / 3) - 1;
                    int i4 = 0;
                    while (i4 <= length) {
                        int i5 = (length + i4) >>> 1;
                        int i6 = i5 * 3;
                        int i7 = zzaviVar2.zzc[i6];
                        if (iZzc == i7) {
                            i3 = i6;
                        } else if (iZzc < i7) {
                            length = i5 - 1;
                        } else {
                            i4 = i5 + 1;
                        }
                    }
                }
                if (i3 >= 0) {
                    obj4 = obj;
                    zzatg zzatgVar2 = zzatgVar;
                    zzatf zzatfVar3 = zzatfVar2;
                    try {
                        int iZzp = zzaviVar2.zzp(i3);
                        try {
                            try {
                                switch (zzo(iZzp)) {
                                    case 0:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzo(obj4, iZzp & 1048575, zzavsVar.zza());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 1:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzp(obj4, iZzp & 1048575, zzavsVar.zzb());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 2:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzr(obj4, iZzp & 1048575, zzavsVar.zzl());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 3:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzr(obj4, iZzp & 1048575, zzavsVar.zzo());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 4:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzq(obj4, iZzp & 1048575, zzavsVar.zzg());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 5:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzr(obj4, iZzp & 1048575, zzavsVar.zzk());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 6:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzq(obj4, iZzp & 1048575, zzavsVar.zzf());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 7:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzm(obj4, iZzp & 1048575, zzavsVar.zzN());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 8:
                                        zzaviVar = zzaviVar2;
                                        zzaviVar.zzB(obj4, iZzp, zzavsVar);
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 9:
                                        zzaviVar = zzaviVar2;
                                        zzavf zzavfVar = (zzavf) zzaviVar.zzv(obj4, i3);
                                        zzavsVar.zzu(zzavfVar, zzaviVar.zzs(i3), zzatfVar3);
                                        zzaviVar.zzE(obj4, i3, zzavfVar);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 10:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, zzavsVar.zzp());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 11:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzq(obj4, iZzp & 1048575, zzavsVar.zzj());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 12:
                                        zzaviVar = zzaviVar2;
                                        int iZze = zzavsVar.zze();
                                        zzaty zzatyVarZzr = zzaviVar.zzr(i3);
                                        if (zzatyVarZzr == null || zzatyVarZzr.zza(iZze)) {
                                            zzawx.zzq(obj4, iZzp & 1048575, iZze);
                                            zzaviVar.zzC(obj4, i3);
                                        } else {
                                            objZzc = zzavv.zzp(obj4, iZzc, iZze, objZzc, zzawnVar);
                                        }
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 13:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzq(obj4, iZzp & 1048575, zzavsVar.zzh());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 14:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzr(obj4, iZzp & 1048575, zzavsVar.zzm());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 15:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzq(obj4, iZzp & 1048575, zzavsVar.zzi());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 16:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzr(obj4, iZzp & 1048575, zzavsVar.zzn());
                                        zzaviVar.zzC(obj4, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 17:
                                        zzaviVar = zzaviVar2;
                                        zzavf zzavfVar2 = (zzavf) zzaviVar.zzv(obj4, i3);
                                        zzavsVar.zzt(zzavfVar2, zzaviVar.zzs(i3), zzatfVar3);
                                        zzaviVar.zzE(obj4, i3, zzavfVar2);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 18:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzx(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 19:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzB(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 20:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzE(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 21:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzM(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 22:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzD(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 23:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzA(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 24:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzz(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 25:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzv(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 26:
                                        zzaviVar = zzaviVar2;
                                        boolean zZzH = zzH(iZzp);
                                        zzaut zzautVar = zzaviVar.zzm;
                                        if (zZzH) {
                                            ((zzasr) zzavsVar).zzK(zzautVar.zza(obj4, iZzp & 1048575), true);
                                        } else {
                                            ((zzasr) zzavsVar).zzK(zzautVar.zza(obj4, iZzp & 1048575), false);
                                        }
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 27:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzF(zzaviVar.zzm.zza(obj4, iZzp & 1048575), zzaviVar.zzs(i3), zzatfVar3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 28:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzw(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 29:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzL(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 30:
                                        zzaviVar = zzaviVar2;
                                        List listZza = zzaviVar.zzm.zza(obj4, iZzp & 1048575);
                                        zzavsVar.zzy(listZza);
                                        Object obj6 = objZzc;
                                        zzawn zzawnVar2 = zzawnVar;
                                        objZzo = zzavv.zzo(obj4, iZzc, listZza, zzaviVar.zzr(i3), obj6, zzawnVar2);
                                        zzawnVar = zzawnVar2;
                                        objZzc = objZzo;
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 31:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzG(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 32:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzH(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 33:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzI(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 34:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzJ(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 35:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzx(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 36:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzB(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 37:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzE(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 38:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzM(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 39:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzD(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 40:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzA(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 41:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzz(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 42:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzv(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 43:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzL(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 44:
                                        zzaviVar = zzaviVar2;
                                        obj5 = obj4;
                                        List listZza2 = zzaviVar.zzm.zza(obj5, iZzp & 1048575);
                                        zzavsVar.zzy(listZza2);
                                        Object obj7 = objZzc;
                                        zzawn zzawnVar3 = zzawnVar;
                                        try {
                                            objZzo = zzavv.zzo(obj5, iZzc, listZza2, zzaviVar.zzr(i3), obj7, zzawnVar3);
                                            zzawnVar = zzawnVar3;
                                            objZzc = objZzo;
                                        } catch (zzaue unused) {
                                            objZzc = obj7;
                                            zzawnVar = zzawnVar3;
                                            zzawnVar.zzq(zzavsVar);
                                            if (objZzc == null) {
                                                objZzc = zzawnVar.zzc(obj5);
                                            }
                                            if (!zzawnVar.zzp(objZzc, zzavsVar)) {
                                                i2 = zzaviVar.zzk;
                                                objZzt2 = objZzc;
                                                while (i2 < zzaviVar.zzl) {
                                                    Object obj8 = obj5;
                                                    objZzt2 = zzaviVar.zzt(obj8, zzaviVar.zzj[i2], objZzt2, zzawnVar, obj);
                                                    i2++;
                                                    obj5 = obj8;
                                                }
                                                obj2 = obj5;
                                                if (objZzt2 != null) {
                                                    zzawnVar.zzn(obj2, objZzt2);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            objZzc = obj7;
                                            zzawnVar = zzawnVar3;
                                            obj2 = obj5;
                                            zzaviVar2 = zzaviVar;
                                            i = zzaviVar2.zzk;
                                            objZzt = objZzc;
                                            while (i < zzaviVar2.zzl) {
                                                objZzt = zzaviVar2.zzt(obj2, zzaviVar2.zzj[i], objZzt, zzawnVar, obj);
                                                i++;
                                                zzaviVar2 = this;
                                            }
                                            obj3 = obj2;
                                            if (objZzt != null) {
                                                zzawnVar.zzn(obj3, objZzt);
                                            }
                                            throw th;
                                        }
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 45:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzG(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 46:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzH(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 47:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzI(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 48:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzJ(zzaviVar.zzm.zza(obj4, iZzp & 1048575));
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 49:
                                        zzaviVar = zzaviVar2;
                                        zzavsVar.zzC(zzaviVar.zzm.zza(obj4, iZzp & 1048575), zzaviVar.zzs(i3), zzatfVar3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 50:
                                        zzaviVar = zzaviVar2;
                                        obj5 = obj4;
                                        Object objZzu = zzaviVar.zzu(i3);
                                        long jZzp = zzaviVar.zzp(i3) & 1048575;
                                        Object objZzf = zzawx.zzf(obj5, jZzp);
                                        if (objZzf == null) {
                                            objZzf = zzauz.zza().zzb();
                                            zzawx.zzs(obj5, jZzp, objZzf);
                                        } else if (!((zzauz) objZzf).zze()) {
                                            Object objZzb = zzauz.zza().zzb();
                                            zzava.zza(objZzb, objZzf);
                                            zzawx.zzs(obj5, jZzp, objZzb);
                                            objZzf = objZzb;
                                        }
                                        throw null;
                                    case 51:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Double.valueOf(zzavsVar.zza()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 52:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Float.valueOf(zzavsVar.zzb()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 53:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Long.valueOf(zzavsVar.zzl()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 54:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Long.valueOf(zzavsVar.zzo()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 55:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Integer.valueOf(zzavsVar.zzg()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 56:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Long.valueOf(zzavsVar.zzk()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 57:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Integer.valueOf(zzavsVar.zzf()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 58:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Boolean.valueOf(zzavsVar.zzN()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 59:
                                        zzaviVar = zzaviVar2;
                                        zzaviVar.zzB(obj4, iZzp, zzavsVar);
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 60:
                                        zzaviVar = zzaviVar2;
                                        zzavf zzavfVar3 = (zzavf) zzaviVar.zzw(obj4, iZzc, i3);
                                        zzavsVar.zzu(zzavfVar3, zzaviVar.zzs(i3), zzatfVar3);
                                        zzaviVar.zzF(obj4, iZzc, i3, zzavfVar3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 61:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, zzavsVar.zzp());
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 62:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Integer.valueOf(zzavsVar.zzj()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 63:
                                        zzaviVar = zzaviVar2;
                                        int iZze2 = zzavsVar.zze();
                                        zzaty zzatyVarZzr2 = zzaviVar.zzr(i3);
                                        if (zzatyVarZzr2 == null || zzatyVarZzr2.zza(iZze2)) {
                                            zzawx.zzs(obj4, iZzp & 1048575, Integer.valueOf(iZze2));
                                            zzaviVar.zzD(obj4, iZzc, i3);
                                        } else {
                                            objZzc = zzavv.zzp(obj4, iZzc, iZze2, objZzc, zzawnVar);
                                        }
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 64:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Integer.valueOf(zzavsVar.zzh()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 65:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Long.valueOf(zzavsVar.zzm()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 66:
                                        zzaviVar = zzaviVar2;
                                        zzawx.zzs(obj4, iZzp & 1048575, Integer.valueOf(zzavsVar.zzi()));
                                        zzaviVar.zzD(obj4, iZzc, i3);
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 67:
                                        zzaviVar = zzaviVar2;
                                        obj5 = obj4;
                                        try {
                                            zzawx.zzs(obj5, iZzp & 1048575, Long.valueOf(zzavsVar.zzn()));
                                            zzaviVar.zzD(obj5, iZzc, i3);
                                        } catch (zzaue unused2) {
                                            zzawnVar.zzq(zzavsVar);
                                            if (objZzc == null) {
                                                objZzc = zzawnVar.zzc(obj5);
                                            }
                                            if (!zzawnVar.zzp(objZzc, zzavsVar)) {
                                                i2 = zzaviVar.zzk;
                                                objZzt2 = objZzc;
                                                while (i2 < zzaviVar.zzl) {
                                                    Object obj9 = obj5;
                                                    objZzt2 = zzaviVar.zzt(obj9, zzaviVar.zzj[i2], objZzt2, zzawnVar, obj);
                                                    i2++;
                                                    obj5 = obj9;
                                                }
                                                obj2 = obj5;
                                                if (objZzt2 != null) {
                                                    zzawnVar.zzn(obj2, objZzt2);
                                                }
                                            }
                                        }
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    case 68:
                                        zzaviVar = zzaviVar2;
                                        obj5 = obj4;
                                        try {
                                            try {
                                                zzavf zzavfVar4 = (zzavf) zzaviVar.zzw(obj5, iZzc, i3);
                                                zzavsVar.zzt(zzavfVar4, zzaviVar.zzs(i3), zzatfVar3);
                                                zzaviVar.zzF(obj5, iZzc, i3, zzavfVar4);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj2 = obj5;
                                                zzaviVar2 = zzaviVar;
                                                i = zzaviVar2.zzk;
                                                objZzt = objZzc;
                                                while (i < zzaviVar2.zzl) {
                                                    objZzt = zzaviVar2.zzt(obj2, zzaviVar2.zzj[i], objZzt, zzawnVar, obj);
                                                    i++;
                                                    zzaviVar2 = this;
                                                }
                                                obj3 = obj2;
                                                if (objZzt != null) {
                                                    zzawnVar.zzn(obj3, objZzt);
                                                }
                                                throw th;
                                            }
                                        } catch (zzaue unused3) {
                                            zzawnVar.zzq(zzavsVar);
                                            if (objZzc == null) {
                                                objZzc = zzawnVar.zzc(obj5);
                                            }
                                            if (!zzawnVar.zzp(objZzc, zzavsVar)) {
                                                i2 = zzaviVar.zzk;
                                                objZzt2 = objZzc;
                                                while (i2 < zzaviVar.zzl) {
                                                    Object obj10 = obj5;
                                                    objZzt2 = zzaviVar.zzt(obj10, zzaviVar.zzj[i2], objZzt2, zzawnVar, obj);
                                                    i2++;
                                                    obj5 = obj10;
                                                }
                                                obj2 = obj5;
                                                if (objZzt2 != null) {
                                                    zzawnVar.zzn(obj2, objZzt2);
                                                }
                                            }
                                        }
                                        zzatfVar2 = zzatfVar3;
                                        zzatgVar = zzatgVar2;
                                        zzaviVar2 = zzaviVar;
                                        break;
                                    default:
                                        if (objZzc == null) {
                                            objZzc = zzawnVar.zzc(obj4);
                                        }
                                        if (zzawnVar.zzp(objZzc, zzavsVar)) {
                                            zzaviVar = zzaviVar2;
                                            zzatfVar2 = zzatfVar3;
                                            zzatgVar = zzatgVar2;
                                            zzaviVar2 = zzaviVar;
                                        } else {
                                            int i8 = zzaviVar2.zzk;
                                            objZzt2 = objZzc;
                                            while (i8 < zzaviVar2.zzl) {
                                                Object obj11 = obj4;
                                                objZzt2 = zzaviVar2.zzt(obj11, zzaviVar2.zzj[i8], objZzt2, zzawnVar, obj);
                                                i8++;
                                                obj4 = obj11;
                                                zzaviVar2 = zzaviVar2;
                                            }
                                            obj2 = obj4;
                                        }
                                        break;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                zzaviVar = zzaviVar2;
                                obj5 = obj4;
                            }
                        } catch (zzaue unused4) {
                            zzaviVar = zzaviVar2;
                            obj5 = obj4;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj2 = obj4;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i9 = zzaviVar2.zzk;
                    objZzt2 = objZzc;
                    while (i9 < zzaviVar2.zzl) {
                        objZzt2 = zzaviVar2.zzt(obj, zzaviVar2.zzj[i9], objZzt2, zzawnVar, obj);
                        i9++;
                        zzaviVar2 = zzaviVar2;
                    }
                    obj2 = obj;
                } else {
                    zzavi<T> zzaviVar3 = zzaviVar2;
                    try {
                        Object objZzd = !zzaviVar3.zzh ? null : zzatgVar.zzd(zzatfVar2, zzaviVar3.zzg, iZzc);
                        if (objZzd != null) {
                            if (zzatkVarZzc == null) {
                                try {
                                    zzatkVarZzc = zzatgVar.zzc(obj);
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj;
                                    zzaviVar2 = zzaviVar3;
                                    i = zzaviVar2.zzk;
                                    objZzt = objZzc;
                                    while (i < zzaviVar2.zzl) {
                                        objZzt = zzaviVar2.zzt(obj2, zzaviVar2.zzj[i], objZzt, zzawnVar, obj);
                                        i++;
                                        zzaviVar2 = this;
                                    }
                                    obj3 = obj2;
                                    if (objZzt != null) {
                                        zzawnVar.zzn(obj3, objZzt);
                                    }
                                    throw th;
                                }
                            }
                            zzatk zzatkVar = zzatkVarZzc;
                            zzawn zzawnVar4 = zzawnVar;
                            try {
                                objZzc = zzatgVar.zze(obj, zzavsVar, objZzd, zzatfVar2, zzatkVar, objZzc, zzawnVar4);
                                zzatkVarZzc = zzatkVar;
                                zzawnVar = zzawnVar4;
                                zzaviVar2 = zzaviVar3;
                                zzatfVar2 = zzatfVar2;
                                zzatgVar = zzatgVar;
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = obj;
                                zzawnVar = zzawnVar4;
                                zzaviVar2 = zzaviVar3;
                                i = zzaviVar2.zzk;
                                objZzt = objZzc;
                                while (i < zzaviVar2.zzl) {
                                    objZzt = zzaviVar2.zzt(obj2, zzaviVar2.zzj[i], objZzt, zzawnVar, obj);
                                    i++;
                                    zzaviVar2 = this;
                                }
                                obj3 = obj2;
                                if (objZzt != null) {
                                    zzawnVar.zzn(obj3, objZzt);
                                }
                                throw th;
                            }
                        } else {
                            obj2 = obj;
                            try {
                                zzawnVar.zzq(zzavsVar);
                                if (objZzc == null) {
                                    try {
                                        objZzc = zzawnVar.zzc(obj2);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        zzaviVar2 = zzaviVar3;
                                        i = zzaviVar2.zzk;
                                        objZzt = objZzc;
                                        while (i < zzaviVar2.zzl) {
                                            objZzt = zzaviVar2.zzt(obj2, zzaviVar2.zzj[i], objZzt, zzawnVar, obj);
                                            i++;
                                            zzaviVar2 = this;
                                        }
                                        obj3 = obj2;
                                        if (objZzt != null) {
                                            zzawnVar.zzn(obj3, objZzt);
                                        }
                                        throw th;
                                    }
                                }
                                if (zzawnVar.zzp(objZzc, zzavsVar)) {
                                    zzaviVar2 = zzaviVar3;
                                    zzatfVar2 = zzatfVar2;
                                    zzatgVar = zzatgVar;
                                } else {
                                    objZzt2 = objZzc;
                                    for (int i10 = zzaviVar3.zzk; i10 < zzaviVar3.zzl; i10++) {
                                        objZzt2 = zzaviVar3.zzt(obj2, zzaviVar3.zzj[i10], objZzt2, zzawnVar, obj);
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        obj4 = obj;
                        zzaviVar2 = zzaviVar3;
                        obj2 = obj4;
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                obj2 = obj;
            }
            i = zzaviVar2.zzk;
            objZzt = objZzc;
            while (i < zzaviVar2.zzl) {
                objZzt = zzaviVar2.zzt(obj2, zzaviVar2.zzj[i], objZzt, zzawnVar, obj);
                i++;
                zzaviVar2 = this;
            }
            obj3 = obj2;
            if (objZzt != null) {
                zzawnVar.zzn(obj3, objZzt);
            }
            throw th;
        }
        if (objZzt2 != null) {
            zzawnVar.zzn(obj2, objZzt2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzavt
    public final boolean zzg(Object obj, Object obj2) {
        boolean zZzt;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzp = zzp(i);
            long j = iZzp & 1048575;
            switch (zzo(iZzp)) {
                case 0:
                    if (!zzG(obj, obj2, i) || Double.doubleToLongBits(zzawx.zza(obj, j)) != Double.doubleToLongBits(zzawx.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzG(obj, obj2, i) || Float.floatToIntBits(zzawx.zzb(obj, j)) != Float.floatToIntBits(zzawx.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzG(obj, obj2, i) || zzawx.zzd(obj, j) != zzawx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzG(obj, obj2, i) || zzawx.zzd(obj, j) != zzawx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzG(obj, obj2, i) || zzawx.zzc(obj, j) != zzawx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzG(obj, obj2, i) || zzawx.zzd(obj, j) != zzawx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzG(obj, obj2, i) || zzawx.zzc(obj, j) != zzawx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzG(obj, obj2, i) || zzawx.zzw(obj, j) != zzawx.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzG(obj, obj2, i) || !zzavv.zzt(zzawx.zzf(obj, j), zzawx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzG(obj, obj2, i) || !zzavv.zzt(zzawx.zzf(obj, j), zzawx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzG(obj, obj2, i) || !zzavv.zzt(zzawx.zzf(obj, j), zzawx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzG(obj, obj2, i) || zzawx.zzc(obj, j) != zzawx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzG(obj, obj2, i) || zzawx.zzc(obj, j) != zzawx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzG(obj, obj2, i) || zzawx.zzc(obj, j) != zzawx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzG(obj, obj2, i) || zzawx.zzd(obj, j) != zzawx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzG(obj, obj2, i) || zzawx.zzc(obj, j) != zzawx.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzG(obj, obj2, i) || zzawx.zzd(obj, j) != zzawx.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzG(obj, obj2, i) || !zzavv.zzt(zzawx.zzf(obj, j), zzawx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzt = zzavv.zzt(zzawx.zzf(obj, j), zzawx.zzf(obj2, j));
                    break;
                case 50:
                    zZzt = zzavv.zzt(zzawx.zzf(obj, j), zzawx.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzn = zzn(i) & 1048575;
                    if (zzawx.zzc(obj, jZzn) != zzawx.zzc(obj2, jZzn) || !zzavv.zzt(zzawx.zzf(obj, j), zzawx.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzt) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.zzavt
    public final boolean zzh(Object obj) {
        int i;
        int i2;
        List list;
        zzavt zzavtVarZzs;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr2[i7];
            int iZzp = this.zzp(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i6;
                i2 = i5;
            }
            zzavi<T> zzaviVar = this;
            Object obj2 = obj;
            if ((268435456 & iZzp) != 0 && !zzaviVar.zzJ(obj2, i7, i, i2, i11)) {
                return false;
            }
            int iZzo = zzo(iZzp);
            if (iZzo == 9 || iZzo == 17) {
                if (zzaviVar.zzJ(obj2, i7, i, i2, i11) && !zzK(obj2, iZzp, zzaviVar.zzs(i7))) {
                    return false;
                }
            } else if (iZzo == 27) {
                list = (List) zzawx.zzf(obj2, iZzp & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzavtVarZzs = zzaviVar.zzs(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzavtVarZzs.zzh(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzo == 60 || iZzo == 68) {
                if (zzaviVar.zzM(obj2, i8, i7) && !zzK(obj2, iZzp, zzaviVar.zzs(i7))) {
                    return false;
                }
            } else if (iZzo == 49) {
                list = (List) zzawx.zzf(obj2, iZzp & 1048575);
                if (list.isEmpty()) {
                    zzavtVarZzs = zzaviVar.zzs(i7);
                    while (i3 < list.size()) {
                        if (!zzavtVarZzs.zzh(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzo == 50 && !((zzauz) zzawx.zzf(obj2, iZzp & 1048575)).isEmpty()) {
                throw null;
            }
            i4++;
            this = zzaviVar;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        zzavi<T> zzaviVar2 = this;
        return !zzaviVar2.zzh || zzaviVar2.zzo.zzb(obj).zzj();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzavt
    public final void zzj(Object obj, zzasy zzasyVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i;
        int i2;
        int i3;
        int i4;
        zzavi<T> zzaviVar = this;
        if (zzaviVar.zzh) {
            zzatk zzatkVarZzb = zzaviVar.zzo.zzb(obj);
            if (zzatkVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzatkVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzaviVar.zzc;
        Unsafe unsafe = zzb;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i5 < iArr.length) {
            int iZzp = zzaviVar.zzp(i5);
            int[] iArr2 = zzaviVar.zzc;
            int iZzo = zzo(iZzp);
            int i8 = iArr2[i5];
            if (iZzo <= 17) {
                int i9 = iArr2[i5 + 2];
                int i10 = i9 & 1048575;
                if (i10 != i6) {
                    i = 1;
                    i7 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                    i6 = i10;
                } else {
                    i = 1;
                }
                i2 = i6;
                i3 = i7;
                i4 = i << (i9 >>> 20);
            } else {
                i = 1;
                i2 = i6;
                i3 = i7;
                i4 = 0;
            }
            while (entry != null && zzaviVar.zzo.zza(entry) <= i8) {
                zzaviVar.zzo.zzj(zzasyVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzp & 1048575;
            switch (iZzo) {
                case 0:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzf(i8, zzawx.zza(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 1:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzo(i8, zzawx.zzb(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 2:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzt(i8, unsafe.getLong(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 3:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzK(i8, unsafe.getLong(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 4:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzr(i8, unsafe.getInt(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 5:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzm(i8, unsafe.getLong(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 6:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 7:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzb(i8, zzawx.zzw(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 8:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzO(i8, unsafe.getObject(obj, j), zzasyVar);
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 9:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzv(i8, unsafe.getObject(obj, j), zzaviVar.zzs(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 10:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzd(i8, (zzask) unsafe.getObject(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 11:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzI(i8, unsafe.getInt(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 12:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 13:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzx(i8, unsafe.getInt(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 14:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzz(i8, unsafe.getLong(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 15:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzB(i8, unsafe.getInt(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 16:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzD(i8, unsafe.getLong(obj, j));
                    }
                    zzaviVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 17:
                    if (zzaviVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzasyVar.zzq(i8, unsafe.getObject(obj, j), zzaviVar.zzs(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 18:
                    zzavv.zzv(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 19:
                    zzavv.zzz(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 20:
                    zzavv.zzB(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 21:
                    zzavv.zzH(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 22:
                    zzavv.zzA(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 23:
                    zzavv.zzy(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 24:
                    zzavv.zzx(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 25:
                    zzavv.zzu(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 26:
                    int i11 = zzaviVar.zzc[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzavv.zza;
                    if (list != null && !list.isEmpty()) {
                        zzasyVar.zzH(i11, list);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 27:
                    int i13 = zzaviVar.zzc[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzavt zzavtVarZzs = zzaviVar.zzs(i5);
                    int i14 = zzavv.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            zzasyVar.zzv(i13, list2.get(i15), zzavtVarZzs);
                        }
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 28:
                    int i16 = zzaviVar.zzc[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzavv.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzasyVar.zze(i16, list3);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 29:
                    zzavv.zzG(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 30:
                    zzavv.zzw(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 31:
                    zzavv.zzC(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 32:
                    zzavv.zzD(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 33:
                    zzavv.zzE(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 34:
                    zzavv.zzF(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 35:
                    zzavv.zzv(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 36:
                    zzavv.zzz(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 37:
                    zzavv.zzB(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 38:
                    zzavv.zzH(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 39:
                    zzavv.zzA(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 40:
                    zzavv.zzy(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 41:
                    zzavv.zzx(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 42:
                    zzavv.zzu(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 43:
                    zzavv.zzG(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 44:
                    zzavv.zzw(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 45:
                    zzavv.zzC(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 46:
                    zzavv.zzD(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 47:
                    zzavv.zzE(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 48:
                    zzavv.zzF(zzaviVar.zzc[i5], (List) unsafe.getObject(obj, j), zzasyVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 49:
                    int i18 = zzaviVar.zzc[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzavt zzavtVarZzs2 = zzaviVar.zzs(i5);
                    int i19 = zzavv.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            zzasyVar.zzq(i18, list4.get(i20), zzavtVarZzs2);
                        }
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 51:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzf(i8, zzk(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 52:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzo(i8, zzl(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 53:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzt(i8, zzq(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 54:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzK(i8, zzq(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 55:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzr(i8, zzm(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 56:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzm(i8, zzq(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 57:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzk(i8, zzm(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 58:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzb(i8, zzN(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 59:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzO(i8, unsafe.getObject(obj, j), zzasyVar);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 60:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzv(i8, unsafe.getObject(obj, j), zzaviVar.zzs(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 61:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzd(i8, (zzask) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 62:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzI(i8, zzm(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 63:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzi(i8, zzm(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 64:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzx(i8, zzm(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 65:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzz(i8, zzq(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 66:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzB(i8, zzm(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 67:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzD(i8, zzq(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 68:
                    if (zzaviVar.zzM(obj, i8, i5)) {
                        zzasyVar.zzq(i8, unsafe.getObject(obj, j), zzaviVar.zzs(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                default:
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zzaviVar.zzo.zzj(zzasyVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        zzawn zzawnVar = zzaviVar.zzn;
        zzawnVar.zzs(zzawnVar.zzd(obj), zzasyVar);
    }
}
