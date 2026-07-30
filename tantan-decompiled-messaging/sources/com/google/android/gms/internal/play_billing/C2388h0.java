package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.aix0;
import p149l.aox0;
import p149l.bbx0;
import p149l.cbx0;
import p149l.erx0;
import p149l.fmx0;
import p149l.ig3;
import p149l.iix0;
import p149l.irx0;
import p149l.itx0;
import p149l.jox0;
import p149l.ksx0;
import p149l.m1x0;
import p149l.mix0;
import p149l.nnx0;
import p149l.oox0;
import p149l.oqx0;
import p149l.sax0;
import p149l.sgw0;
import p149l.smx0;
import p149l.t9x0;
import p149l.tjx0;
import p149l.wlx0;
import p149l.wpx0;
import p149l.x9g0;
import p149l.xjx0;
import p149l.y5x0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2388h0<T> implements oox0<T> {

    /* JADX INFO: renamed from: l */
    public static final int[] f10332l = new int[0];

    /* JADX INFO: renamed from: m */
    public static final Unsafe f10333m = ksx0.m147120l();

    /* JADX INFO: renamed from: a */
    public final int[] f10334a;

    /* JADX INFO: renamed from: b */
    public final Object[] f10335b;

    /* JADX INFO: renamed from: c */
    public final int f10336c;

    /* JADX INFO: renamed from: d */
    public final int f10337d;

    /* JADX INFO: renamed from: e */
    public final smx0 f10338e;

    /* JADX INFO: renamed from: f */
    public final boolean f10339f;

    /* JADX INFO: renamed from: g */
    public final int[] f10340g;

    /* JADX INFO: renamed from: h */
    public final int f10341h;

    /* JADX INFO: renamed from: i */
    public final int f10342i;

    /* JADX INFO: renamed from: j */
    public final erx0 f10343j;

    /* JADX INFO: renamed from: k */
    public final y5x0 f10344k;

    public C2388h0(int[] iArr, Object[] objArr, int i, int i2, smx0 smx0Var, boolean z, int[] iArr2, int i3, int i4, nnx0 nnx0Var, xjx0 xjx0Var, erx0 erx0Var, y5x0 y5x0Var, wlx0 wlx0Var) {
        this.f10334a = iArr;
        this.f10335b = objArr;
        this.f10336c = i;
        this.f10337d = i2;
        boolean z2 = false;
        if (y5x0Var != null && (smx0Var instanceof AbstractC2378c0)) {
            z2 = true;
        }
        this.f10339f = z2;
        this.f10340g = iArr2;
        this.f10341h = i3;
        this.f10342i = i4;
        this.f10343j = erx0Var;
        this.f10344k = y5x0Var;
        this.f10338e = smx0Var;
    }

    /* JADX INFO: renamed from: C */
    public static int m14793C(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: E */
    public static long m14794E(Object obj, long j) {
        return ((Long) ksx0.m147119k(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: K */
    public static Field m14795K(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            cbx0.m106034a(str, cls.getName(), Arrays.toString(declaredFields));
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14796f(Object obj) {
        if (m14798q(obj)) {
            return;
        }
        ig3.m135964a("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m14797p(Object obj, int i, oox0 oox0Var) {
        return oox0Var.mo14816c(ksx0.m147119k(obj, i & 1048575));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m14798q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2380d0) {
            return ((AbstractC2380d0) obj).m14768e();
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m14799s(Object obj, long j) {
        return ((Boolean) ksx0.m147119k(obj, j)).booleanValue();
    }

    /* JADX INFO: renamed from: t */
    public static final void m14800t(int i, Object obj, itx0 itx0Var) throws IOException {
        if (obj instanceof String) {
            itx0Var.mo138297j(i, (String) obj);
        } else {
            itx0Var.mo138312y(i, (zzgk) obj);
        }
    }

    /* JADX INFO: renamed from: v */
    public static irx0 m14801v(Object obj) {
        AbstractC2380d0 abstractC2380d0 = (AbstractC2380d0) obj;
        irx0 irx0Var = abstractC2380d0.zzc;
        if (irx0Var != irx0.m137921c()) {
            return irx0Var;
        }
        irx0 irx0VarM137923f = irx0.m137923f();
        abstractC2380d0.zzc = irx0VarM137923f;
        return irx0VarM137923f;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    /* JADX INFO: renamed from: w */
    public static C2388h0 m14802w(Class cls, fmx0 fmx0Var, nnx0 nnx0Var, xjx0 xjx0Var, erx0 erx0Var, y5x0 y5x0Var, wlx0 wlx0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
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
        int iObjectFieldOffset;
        char c;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        Field fieldM14795K;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldM14795K2;
        int i27;
        Object obj2;
        Field fieldM14795K3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(fmx0Var instanceof jox0)) {
            throw null;
        }
        jox0 jox0Var = (jox0) fmx0Var;
        String strM142537a = jox0Var.m142537a();
        int length = strM142537a.length();
        char c2 = 55296;
        if (strM142537a.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strM142537a.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strM142537a.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strM142537a.charAt(i33);
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
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = f10332l;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strM142537a.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strM142537a.charAt(i36);
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
            int iCharAt4 = strM142537a.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strM142537a.charAt(i39);
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
            int iCharAt5 = strM142537a.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strM142537a.charAt(i42);
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
            int iCharAt6 = strM142537a.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strM142537a.charAt(i45);
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
            iCharAt = strM142537a.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strM142537a.charAt(i48);
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
            int iCharAt7 = strM142537a.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strM142537a.charAt(i51);
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
            int iCharAt8 = strM142537a.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strM142537a.charAt(i54);
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
            int iCharAt9 = strM142537a.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strM142537a.charAt(i57);
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
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt6;
            i5 = iCharAt9;
            i6 = i60;
            iArr = iArr2;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = f10333m;
        Object[] objArrM142538b = jox0Var.m142538b();
        Class<?> cls2 = jox0Var.zza().getClass();
        int i62 = i5 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i63];
        int i64 = i5;
        int i65 = i62;
        int i66 = 0;
        int i67 = 0;
        while (i33 < length) {
            int i68 = i33 + 1;
            int iCharAt10 = strM142537a.charAt(i33);
            if (iCharAt10 >= c2) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = strM142537a.charAt(i70);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i16 = i30;
            } else {
                i16 = i68;
            }
            int i72 = i16 + 1;
            int iCharAt11 = strM142537a.charAt(i16);
            if (iCharAt11 >= c2) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i29 = i74 + 1;
                    cCharAt11 = strM142537a.charAt(i74);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i29;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i17 = i29;
            } else {
                i17 = i72;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i67] = i66;
                i67++;
            }
            int i76 = iCharAt11 & 255;
            jox0 jox0Var2 = jox0Var;
            int i77 = iCharAt11 & 2048;
            if (i76 >= 51) {
                int i78 = i17 + 1;
                int iCharAt12 = strM142537a.charAt(i17);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        cCharAt10 = strM142537a.charAt(i80);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i80 = i28;
                        c3 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i81);
                    i23 = i28;
                } else {
                    i23 = i78;
                }
                int i82 = i23;
                int i83 = i76 - 51;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    int i84 = i66 / 3;
                    objArr[i84 + i84 + 1] = objArrM142538b[i6];
                } else {
                    if (i83 != 12) {
                        i25 = i77;
                    } else if (jox0Var2.zzc() == 1 || i77 != 0) {
                        i24 = i6 + 1;
                        int i85 = i66 / 3;
                        objArr[i85 + i85 + 1] = objArrM142538b[i6];
                    } else {
                        i25 = 0;
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrM142538b[i26];
                    int i86 = i25;
                    if (obj instanceof Field) {
                        fieldM14795K2 = (Field) obj;
                    } else {
                        fieldM14795K2 = m14795K(cls2, (String) obj);
                        objArrM142538b[i26] = fieldM14795K2;
                    }
                    int i87 = i7;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14795K2);
                    i27 = i26 + 1;
                    obj2 = objArrM142538b[i27];
                    i18 = i87;
                    if (obj2 instanceof Field) {
                        fieldM14795K3 = (Field) obj2;
                    } else {
                        fieldM14795K3 = m14795K(cls2, (String) obj2);
                        objArrM142538b[i27] = fieldM14795K3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14795K3);
                    strM142537a = strM142537a;
                    i20 = i86;
                    i17 = i82;
                    i19 = 0;
                    c = 55296;
                }
                i6 = i24;
                i25 = i77;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrM142538b[i26];
                int i88 = i25;
                if (obj instanceof Field) {
                    fieldM14795K2 = (Field) obj;
                } else {
                    fieldM14795K2 = m14795K(cls2, (String) obj);
                    objArrM142538b[i26] = fieldM14795K2;
                }
                int i89 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14795K2);
                i27 = i26 + 1;
                obj2 = objArrM142538b[i27];
                i18 = i89;
                if (obj2 instanceof Field) {
                    fieldM14795K3 = (Field) obj2;
                } else {
                    fieldM14795K3 = m14795K(cls2, (String) obj2);
                    objArrM142538b[i27] = fieldM14795K3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14795K3);
                strM142537a = strM142537a;
                i20 = i88;
                i17 = i82;
                i19 = 0;
                c = 55296;
            } else {
                i18 = i7;
                int i90 = i6 + 1;
                Field fieldM14795K4 = m14795K(cls2, (String) objArrM142538b[i6]);
                if (i76 == 9 || i76 == 17) {
                    int i91 = i66 / 3;
                    objArr[i91 + i91 + 1] = fieldM14795K4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i6 += 2;
                            i22 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            if (jox0Var2.zzc() == 1 || i77 != 0) {
                                i6 += 2;
                                int i92 = i66 / 3;
                                objArr[i92 + i92 + 1] = objArrM142538b[i90];
                            } else {
                                i6 = i90;
                                i77 = 0;
                            }
                        } else if (i76 == 50) {
                            int i93 = i6 + 2;
                            int i94 = i64 + 1;
                            iArr[i64] = i66;
                            int i95 = i66 / 3;
                            int i96 = i95 + i95;
                            objArr[i96] = objArrM142538b[i90];
                            if (i77 != 0) {
                                objArr[i96 + 1] = objArrM142538b[i93];
                                i6 += 3;
                                i64 = i94;
                            } else {
                                i6 = i93;
                                i64 = i94;
                                i77 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14795K4);
                        if ((iCharAt11 & 4096) != 0 || i76 > 17) {
                            c = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i19 = 0;
                        } else {
                            int i97 = i17 + 1;
                            int iCharAt13 = strM142537a.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i21 = i97 + 1;
                                    cCharAt9 = strM142537a.charAt(i97);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i21;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                            } else {
                                i21 = i97;
                            }
                            int i100 = i18 + i18 + (iCharAt13 / 32);
                            Object obj3 = objArrM142538b[i100];
                            if (obj3 instanceof Field) {
                                fieldM14795K = (Field) obj3;
                            } else {
                                fieldM14795K = m14795K(cls2, (String) obj3);
                                objArrM142538b[i100] = fieldM14795K;
                            }
                            int i101 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM14795K);
                            i19 = i101 % 32;
                            i17 = i21;
                            c = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i65] = iObjectFieldOffset;
                            i65++;
                        }
                        i20 = i77;
                    } else {
                        i22 = 1;
                        i6 += 2;
                    }
                    int i102 = i66 / 3;
                    objArr[i102 + i102 + i22] = objArrM142538b[i90];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14795K4);
                    if ((iCharAt11 & 4096) != 0) {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    } else {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    }
                    if (i76 >= 18) {
                        iArr[i65] = iObjectFieldOffset;
                        i65++;
                    }
                    i20 = i77;
                }
                i6 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14795K4);
                if ((iCharAt11 & 4096) != 0) {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                } else {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                }
                if (i76 >= 18) {
                    iArr[i65] = iObjectFieldOffset;
                    i65++;
                }
                i20 = i77;
            }
            int i103 = i66 + 1;
            iArr3[i66] = iCharAt10;
            int i104 = i66 + 2;
            iArr3[i103] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | iObjectFieldOffset;
            i66 += 3;
            iArr3[i104] = (i19 << 20) | iObjectFieldOffset2;
            i33 = i17;
            strM142537a = strM142537a;
            c2 = c;
            jox0Var = jox0Var2;
            length = length;
            i7 = i18;
        }
        return new C2388h0(iArr3, objArr, i2, i4, jox0Var.zza(), false, iArr, i5, i62, nnx0Var, xjx0Var, erx0Var, y5x0Var, wlx0Var);
    }

    /* JADX INFO: renamed from: x */
    public static double m14803x(Object obj, long j) {
        return ((Double) ksx0.m147119k(obj, j)).doubleValue();
    }

    /* JADX INFO: renamed from: y */
    public static float m14804y(Object obj, long j) {
        return ((Float) ksx0.m147119k(obj, j)).floatValue();
    }

    /* JADX INFO: renamed from: z */
    public static int m14805z(Object obj, long j) {
        return ((Integer) ksx0.m147119k(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: A */
    public final int m14806A(int i) {
        return this.f10334a[i + 2];
    }

    /* JADX INFO: renamed from: B */
    public final int m14807B(int i, int i2) {
        int length = (this.f10334a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f10334a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public final int m14808D(int i) {
        return this.f10334a[i + 1];
    }

    /* JADX INFO: renamed from: F */
    public final aix0 m14809F(int i) {
        int i2 = i / 3;
        return (aix0) this.f10335b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: G */
    public final oox0 m14810G(int i) {
        Object[] objArr = this.f10335b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        oox0 oox0Var = (oox0) objArr[i3];
        if (oox0Var != null) {
            return oox0Var;
        }
        oox0 oox0VarM98002b = aox0.m98001a().m98002b((Class) objArr[i3 + 1]);
        this.f10335b[i3] = oox0VarM98002b;
        return oox0VarM98002b;
    }

    /* JADX INFO: renamed from: H */
    public final Object m14811H(int i) {
        int i2 = i / 3;
        return this.f10335b[i2 + i2];
    }

    /* JADX INFO: renamed from: I */
    public final Object m14812I(Object obj, int i) {
        oox0 oox0VarM14810G = m14810G(i);
        int iM14808D = m14808D(i) & 1048575;
        if (!m14826n(obj, i)) {
            return oox0VarM14810G.zze();
        }
        Object object = f10333m.getObject(obj, iM14808D);
        if (m14798q(object)) {
            return object;
        }
        Object objZze = oox0VarM14810G.zze();
        if (object != null) {
            oox0VarM14810G.zzg(objZze, object);
        }
        return objZze;
    }

    /* JADX INFO: renamed from: J */
    public final Object m14813J(Object obj, int i, int i2) {
        oox0 oox0VarM14810G = m14810G(i2);
        if (!m14828r(obj, i, i2)) {
            return oox0VarM14810G.zze();
        }
        Object object = f10333m.getObject(obj, m14808D(i2) & 1048575);
        if (m14798q(object)) {
            return object;
        }
        Object objZze = oox0VarM14810G.zze();
        if (object != null) {
            oox0VarM14810G.zzg(objZze, object);
        }
        return objZze;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // p149l.oox0
    /* JADX INFO: renamed from: a */
    public final void mo14814a(Object obj) {
        if (m14798q(obj)) {
            if (obj instanceof AbstractC2380d0) {
                AbstractC2380d0 abstractC2380d0 = (AbstractC2380d0) obj;
                abstractC2380d0.m14777w(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                abstractC2380d0.zza = 0;
                abstractC2380d0.m14776u();
            }
            int[] iArr = this.f10334a;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM14808D = m14808D(i);
                int i2 = 1048575 & iM14808D;
                int iM14793C = m14793C(iM14808D);
                long j = i2;
                if (iM14793C != 9) {
                    if (iM14793C != 60 && iM14793C != 68) {
                        switch (iM14793C) {
                            case 17:
                                if (m14826n(obj, i)) {
                                    m14810G(i).mo14814a(f10333m.getObject(obj, j));
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
                                ((iix0) ksx0.m147119k(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f10333m;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzig) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m14828r(obj, this.f10334a[i], i)) {
                        m14810G(i).mo14814a(f10333m.getObject(obj, j));
                    }
                } else if (m14826n(obj, i)) {
                    m14810G(i).mo14814a(f10333m.getObject(obj, j));
                }
            }
            this.f10343j.mo14862a(obj);
            if (this.f10339f) {
                this.f10344k.mo14750a(obj);
            }
        }
    }

    @Override // p149l.oox0
    /* JADX INFO: renamed from: b */
    public final boolean mo14815b(Object obj, Object obj2) {
        boolean zM14840e;
        for (int i = 0; i < this.f10334a.length; i += 3) {
            int iM14808D = m14808D(i);
            long j = iM14808D & 1048575;
            switch (m14793C(iM14808D)) {
                case 0:
                    if (!m14825m(obj, obj2, i) || Double.doubleToLongBits(ksx0.m147114f(obj, j)) != Double.doubleToLongBits(ksx0.m147114f(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!m14825m(obj, obj2, i) || Float.floatToIntBits(ksx0.m147115g(obj, j)) != Float.floatToIntBits(ksx0.m147115g(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!m14825m(obj, obj2, i) || ksx0.m147117i(obj, j) != ksx0.m147117i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!m14825m(obj, obj2, i) || ksx0.m147117i(obj, j) != ksx0.m147117i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!m14825m(obj, obj2, i) || ksx0.m147116h(obj, j) != ksx0.m147116h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!m14825m(obj, obj2, i) || ksx0.m147117i(obj, j) != ksx0.m147117i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!m14825m(obj, obj2, i) || ksx0.m147116h(obj, j) != ksx0.m147116h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!m14825m(obj, obj2, i) || ksx0.m147105B(obj, j) != ksx0.m147105B(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!m14825m(obj, obj2, i) || !C2392j0.m14840e(ksx0.m147119k(obj, j), ksx0.m147119k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!m14825m(obj, obj2, i) || !C2392j0.m14840e(ksx0.m147119k(obj, j), ksx0.m147119k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!m14825m(obj, obj2, i) || !C2392j0.m14840e(ksx0.m147119k(obj, j), ksx0.m147119k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!m14825m(obj, obj2, i) || ksx0.m147116h(obj, j) != ksx0.m147116h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!m14825m(obj, obj2, i) || ksx0.m147116h(obj, j) != ksx0.m147116h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!m14825m(obj, obj2, i) || ksx0.m147116h(obj, j) != ksx0.m147116h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!m14825m(obj, obj2, i) || ksx0.m147117i(obj, j) != ksx0.m147117i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!m14825m(obj, obj2, i) || ksx0.m147116h(obj, j) != ksx0.m147116h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!m14825m(obj, obj2, i) || ksx0.m147117i(obj, j) != ksx0.m147117i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!m14825m(obj, obj2, i) || !C2392j0.m14840e(ksx0.m147119k(obj, j), ksx0.m147119k(obj2, j))) {
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
                    zM14840e = C2392j0.m14840e(ksx0.m147119k(obj, j), ksx0.m147119k(obj2, j));
                    break;
                case 50:
                    zM14840e = C2392j0.m14840e(ksx0.m147119k(obj, j), ksx0.m147119k(obj2, j));
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
                    long jM14806A = m14806A(i) & 1048575;
                    if (ksx0.m147116h(obj, jM14806A) != ksx0.m147116h(obj2, jM14806A) || !C2392j0.m14840e(ksx0.m147119k(obj, j), ksx0.m147119k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zM14840e) {
                return false;
            }
        }
        if (!((AbstractC2380d0) obj).zzc.equals(((AbstractC2380d0) obj2).zzc)) {
            return false;
        }
        if (this.f10339f) {
            return ((AbstractC2378c0) obj).zzb.equals(((AbstractC2378c0) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // p149l.oox0
    /* JADX INFO: renamed from: c */
    public final boolean mo14816c(Object obj) {
        int i;
        int i2;
        List list;
        oox0 oox0VarM14810G;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.f10341h) {
            int[] iArr = this.f10340g;
            int[] iArr2 = this.f10334a;
            int i7 = iArr[i4];
            int i8 = iArr2[i7];
            int iM14808D = this.m14808D(i7);
            int i9 = this.f10334a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i5 = f10333m.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i6;
                i2 = i5;
            }
            C2388h0<T> c2388h0 = this;
            Object obj2 = obj;
            if ((268435456 & iM14808D) != 0 && !c2388h0.m14827o(obj2, i7, i, i2, i11)) {
                return false;
            }
            int iM14793C = m14793C(iM14808D);
            if (iM14793C == 9 || iM14793C == 17) {
                if (c2388h0.m14827o(obj2, i7, i, i2, i11) && !m14797p(obj2, iM14808D, c2388h0.m14810G(i7))) {
                    return false;
                }
            } else if (iM14793C == 27) {
                list = (List) ksx0.m147119k(obj2, iM14808D & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    oox0VarM14810G = c2388h0.m14810G(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!oox0VarM14810G.mo14816c(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iM14793C == 60 || iM14793C == 68) {
                if (c2388h0.m14828r(obj2, i8, i7) && !m14797p(obj2, iM14808D, c2388h0.m14810G(i7))) {
                    return false;
                }
            } else if (iM14793C == 49) {
                list = (List) ksx0.m147119k(obj2, iM14808D & 1048575);
                if (list.isEmpty()) {
                    oox0VarM14810G = c2388h0.m14810G(i7);
                    while (i3 < list.size()) {
                        if (!oox0VarM14810G.mo14816c(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iM14793C == 50 && !((zzig) ksx0.m147119k(obj2, iM14808D & 1048575)).isEmpty()) {
                throw null;
            }
            i4++;
            this = c2388h0;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.f10339f || ((AbstractC2378c0) obj).zzb.m183126h();
    }

    @Override // p149l.oox0
    /* JADX INFO: renamed from: d */
    public final void mo14817d(Object obj, byte[] bArr, int i, int i2, sgw0 sgw0Var) throws IOException {
        m14829u(obj, bArr, i, i2, 0, sgw0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // p149l.oox0
    /* JADX INFO: renamed from: e */
    public final void mo14818e(Object obj, itx0 itx0Var) throws IOException {
        Map.Entry entry;
        int i;
        C2388h0<T> c2388h0 = this;
        if (c2388h0.f10339f) {
            sax0 sax0Var = ((AbstractC2378c0) obj).zzb;
            if (sax0Var.f163460a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) sax0Var.m183123e().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = c2388h0.f10334a;
        Unsafe unsafe = f10333m;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iM14808D = c2388h0.m14808D(i4);
            int[] iArr2 = c2388h0.f10334a;
            int iM14793C = m14793C(iM14808D);
            int i6 = iArr2[i4];
            if (iM14793C <= 17) {
                int i7 = iArr2[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iM14808D & i2;
            switch (iM14793C) {
                case 0:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138300m(i6, ksx0.m147114f(obj, j));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 1:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138310w(i6, ksx0.m147115g(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 2:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138282E(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 3:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138280C(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 4:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138284G(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 5:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138295h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 6:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138305r(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 7:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138298k(i6, ksx0.m147105B(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 8:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        m14800t(i6, unsafe.getObject(obj, j), itx0Var);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 9:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138313z(i6, unsafe.getObject(obj, j), c2388h0.m14810G(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 10:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138312y(i6, (zzgk) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 11:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138304q(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 12:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138308u(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 13:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138286I(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 14:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138289L(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 15:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138302o(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 16:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138301n(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 17:
                    if (c2388h0.m14827o(obj, i4, i3, i5, i)) {
                        itx0Var.mo138306s(i6, unsafe.getObject(obj, j), c2388h0.m14810G(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 18:
                    C2392j0.m14858w(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 19:
                    C2392j0.m14831A(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 20:
                    C2392j0.m14833C(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 21:
                    C2392j0.m14839d(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 22:
                    C2392j0.m14832B(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 23:
                    C2392j0.m14861z(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 24:
                    C2392j0.m14860y(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 25:
                    C2392j0.m14857v(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 26:
                    int i9 = c2388h0.f10334a[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var = C2392j0.f10351a;
                    if (list != null && !list.isEmpty()) {
                        itx0Var.mo138279B(i9, list);
                    }
                    break;
                case 27:
                    int i10 = c2388h0.f10334a[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    oox0 oox0VarM14810G = c2388h0.m14810G(i4);
                    erx0 erx0Var2 = C2392j0.f10351a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i11 = 0; i11 < list2.size(); i11++) {
                            ((m1x0) itx0Var).mo138313z(i10, list2.get(i11), oox0VarM14810G);
                        }
                    }
                    break;
                case 28:
                    int i12 = c2388h0.f10334a[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var3 = C2392j0.f10351a;
                    if (list3 != null && !list3.isEmpty()) {
                        itx0Var.mo138281D(i12, list3);
                    }
                    break;
                case 29:
                    C2392j0.m14838c(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 30:
                    C2392j0.m14859x(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 31:
                    C2392j0.m14834D(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 32:
                    C2392j0.m14835E(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 33:
                    C2392j0.m14836a(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 34:
                    C2392j0.m14837b(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2388h0 = this;
                    break;
                case 35:
                    C2392j0.m14858w(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 36:
                    C2392j0.m14831A(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 37:
                    C2392j0.m14833C(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 38:
                    C2392j0.m14839d(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 39:
                    C2392j0.m14832B(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 40:
                    C2392j0.m14861z(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 41:
                    C2392j0.m14860y(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 42:
                    C2392j0.m14857v(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 43:
                    C2392j0.m14838c(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 44:
                    C2392j0.m14859x(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 45:
                    C2392j0.m14834D(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 46:
                    C2392j0.m14835E(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 47:
                    C2392j0.m14836a(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 48:
                    C2392j0.m14837b(c2388h0.f10334a[i4], (List) unsafe.getObject(obj, j), itx0Var, true);
                    break;
                case 49:
                    int i13 = c2388h0.f10334a[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    oox0 oox0VarM14810G2 = c2388h0.m14810G(i4);
                    erx0 erx0Var4 = C2392j0.f10351a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i14 = 0; i14 < list4.size(); i14++) {
                            ((m1x0) itx0Var).mo138306s(i13, list4.get(i14), oox0VarM14810G2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138300m(i6, m14803x(obj, j));
                    }
                    break;
                case 52:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138310w(i6, m14804y(obj, j));
                    }
                    break;
                case 53:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138282E(i6, m14794E(obj, j));
                    }
                    break;
                case 54:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138280C(i6, m14794E(obj, j));
                    }
                    break;
                case 55:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138284G(i6, m14805z(obj, j));
                    }
                    break;
                case 56:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138295h(i6, m14794E(obj, j));
                    }
                    break;
                case 57:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138305r(i6, m14805z(obj, j));
                    }
                    break;
                case 58:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138298k(i6, m14799s(obj, j));
                    }
                    break;
                case 59:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        m14800t(i6, unsafe.getObject(obj, j), itx0Var);
                    }
                    break;
                case 60:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138313z(i6, unsafe.getObject(obj, j), c2388h0.m14810G(i4));
                    }
                    break;
                case 61:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138312y(i6, (zzgk) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138304q(i6, m14805z(obj, j));
                    }
                    break;
                case 63:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138308u(i6, m14805z(obj, j));
                    }
                    break;
                case 64:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138286I(i6, m14805z(obj, j));
                    }
                    break;
                case 65:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138289L(i6, m14794E(obj, j));
                    }
                    break;
                case 66:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138302o(i6, m14805z(obj, j));
                    }
                    break;
                case 67:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138301n(i6, m14794E(obj, j));
                    }
                    break;
                case 68:
                    if (c2388h0.m14828r(obj, i6, i4)) {
                        itx0Var.mo138306s(i6, unsafe.getObject(obj, j), c2388h0.m14810G(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            c2388h0 = this;
        }
        if (entry != null) {
            throw null;
        }
        ((AbstractC2380d0) obj).zzc.m137932l(itx0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m14819g(Object obj, Object obj2, int i) {
        if (m14826n(obj2, i)) {
            int iM14808D = m14808D(i) & 1048575;
            Unsafe unsafe = f10333m;
            long j = iM14808D;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                bbx0.m101038a(obj2, this.f10334a[i]);
                return;
            }
            oox0 oox0VarM14810G = m14810G(i);
            if (!m14826n(obj, i)) {
                if (m14798q(object)) {
                    Object objZze = oox0VarM14810G.zze();
                    oox0VarM14810G.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m14821i(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m14798q(object2)) {
                Object objZze2 = oox0VarM14810G.zze();
                oox0VarM14810G.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            oox0VarM14810G.zzg(object2, object);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14820h(Object obj, Object obj2, int i) {
        int i2 = this.f10334a[i];
        if (m14828r(obj2, i2, i)) {
            int iM14808D = m14808D(i) & 1048575;
            Unsafe unsafe = f10333m;
            long j = iM14808D;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                bbx0.m101038a(obj2, this.f10334a[i]);
                return;
            }
            oox0 oox0VarM14810G = m14810G(i);
            if (!m14828r(obj, i2, i)) {
                if (m14798q(object)) {
                    Object objZze = oox0VarM14810G.zze();
                    oox0VarM14810G.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m14822j(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m14798q(object2)) {
                Object objZze2 = oox0VarM14810G.zze();
                oox0VarM14810G.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            oox0VarM14810G.zzg(object2, object);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m14821i(Object obj, int i) {
        int iM14806A = m14806A(i);
        long j = 1048575 & iM14806A;
        if (j == 1048575) {
            return;
        }
        ksx0.m147130v(obj, j, (1 << (iM14806A >>> 20)) | ksx0.m147116h(obj, j));
    }

    /* JADX INFO: renamed from: j */
    public final void m14822j(Object obj, int i, int i2) {
        ksx0.m147130v(obj, m14806A(i2) & 1048575, i);
    }

    /* JADX INFO: renamed from: k */
    public final void m14823k(Object obj, int i, Object obj2) {
        f10333m.putObject(obj, m14808D(i) & 1048575, obj2);
        m14821i(obj, i);
    }

    /* JADX INFO: renamed from: l */
    public final void m14824l(Object obj, int i, int i2, Object obj2) {
        f10333m.putObject(obj, m14808D(i2) & 1048575, obj2);
        m14822j(obj, i, i2);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m14825m(Object obj, Object obj2, int i) {
        return m14826n(obj, i) == m14826n(obj2, i);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m14826n(Object obj, int i) {
        int iM14806A = m14806A(i);
        long j = iM14806A & 1048575;
        if (j != 1048575) {
            return ((1 << (iM14806A >>> 20)) & ksx0.m147116h(obj, j)) != 0;
        }
        int iM14808D = m14808D(i);
        long j2 = iM14808D & 1048575;
        switch (m14793C(iM14808D)) {
            case 0:
                return Double.doubleToRawLongBits(ksx0.m147114f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(ksx0.m147115g(obj, j2)) != 0;
            case 2:
                return ksx0.m147117i(obj, j2) != 0;
            case 3:
                return ksx0.m147117i(obj, j2) != 0;
            case 4:
                return ksx0.m147116h(obj, j2) != 0;
            case 5:
                return ksx0.m147117i(obj, j2) != 0;
            case 6:
                return ksx0.m147116h(obj, j2) != 0;
            case 7:
                return ksx0.m147105B(obj, j2);
            case 8:
                Object objM147119k = ksx0.m147119k(obj, j2);
                if (objM147119k instanceof String) {
                    return !((String) objM147119k).isEmpty();
                }
                if (objM147119k instanceof zzgk) {
                    return !zzgk.zzb.equals(objM147119k);
                }
                x9g0.m207497a();
                return false;
            case 9:
                return ksx0.m147119k(obj, j2) != null;
            case 10:
                return !zzgk.zzb.equals(ksx0.m147119k(obj, j2));
            case 11:
                return ksx0.m147116h(obj, j2) != 0;
            case 12:
                return ksx0.m147116h(obj, j2) != 0;
            case 13:
                return ksx0.m147116h(obj, j2) != 0;
            case 14:
                return ksx0.m147117i(obj, j2) != 0;
            case 15:
                return ksx0.m147116h(obj, j2) != 0;
            case 16:
                return ksx0.m147117i(obj, j2) != 0;
            case 17:
                return ksx0.m147119k(obj, j2) != null;
            default:
                x9g0.m207497a();
                return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m14827o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m14826n(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m14828r(Object obj, int i, int i2) {
        return ksx0.m147116h(obj, (long) (m14806A(i2) & 1048575)) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: u */
    public final int m14829u(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, p149l.sgw0 r41) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2388h0.m14829u(java.lang.Object, byte[], int, int, int, l.sgw0):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x038a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0481  */
    /* JADX WARN: Code duplicated, block: B:280:0x0714 A[PHI: r0
      0x0714: PHI (r0v8 com.google.android.gms.internal.play_billing.h0<T>) = 
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v45 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
      (r0v1 com.google.android.gms.internal.play_billing.h0<T>)
     binds: [B:18:0x004f, B:278:0x0707, B:248:0x0643, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p149l.oox0
    public final int zza(Object obj) {
        int i;
        int iM14717B;
        int iM14717B2;
        int iM14718a;
        int iM14717B3;
        int iM14717B4;
        int iM14717B5;
        int iZzd;
        int iM14717B6;
        int iM14848m;
        int iM14847l;
        int size;
        int iM14852q;
        int iM14717B7;
        int iM14717B8;
        int iM14717B9;
        int iM14718a2;
        int iM14845j;
        int iM14717B10;
        int iM14717B11;
        int iM14720y;
        int iM14717B12;
        int iM14717B13;
        int iM14717B14;
        int iZzd2;
        int iM14717B15;
        C2388h0<T> c2388h0 = this;
        Unsafe unsafe = f10333m;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iM14717B16 = 0;
        int i6 = 1048575;
        while (i4 < c2388h0.f10334a.length) {
            int iM14808D = c2388h0.m14808D(i4);
            int iM14793C = m14793C(iM14808D);
            int[] iArr = c2388h0.f10334a;
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & i3;
            if (iM14793C <= 17) {
                if (i9 != i6) {
                    i5 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            int i10 = iM14808D & i3;
            if (iM14793C >= zzhc.zzJ.zza()) {
                zzhc.zzW.zza();
            }
            int i11 = iM14717B16;
            long j = i10;
            switch (iM14793C) {
                case 0:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        iM14717B16 = i11 + AbstractC2372a0.m14717B(i7 << 3) + 8;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        iM14717B = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B4 = iM14717B + 4;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iM14717B2 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a = AbstractC2372a0.m14718a(j2);
                        iM14717B4 = iM14717B2 + iM14718a;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iM14717B2 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a = AbstractC2372a0.m14718a(j3);
                        iM14717B4 = iM14717B2 + iM14718a;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iM14717B2 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a = AbstractC2372a0.m14718a(j4);
                        iM14717B4 = iM14717B2 + iM14718a;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        iM14717B3 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B4 = iM14717B3 + 8;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        iM14717B = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B4 = iM14717B + 4;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        iM14717B4 = AbstractC2372a0.m14717B(i7 << 3) + 1;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        int i12 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgk) {
                            iM14717B5 = AbstractC2372a0.m14717B(i12);
                            iZzd = ((zzgk) object).zzd();
                            iM14717B6 = AbstractC2372a0.m14717B(iZzd);
                            iM14717B4 = iM14717B5 + iM14717B6 + iZzd;
                            iM14717B16 = i11 + iM14717B4;
                            c2388h0 = this;
                            i4 += 3;
                            i3 = 1048575;
                        } else {
                            iM14717B2 = AbstractC2372a0.m14717B(i12);
                            iM14718a = AbstractC2372a0.m14716A((String) object);
                            iM14717B4 = iM14717B2 + iM14718a;
                            iM14717B16 = i11 + iM14717B4;
                            c2388h0 = this;
                            i4 += 3;
                            i3 = 1048575;
                        }
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        iM14848m = C2392j0.m14848m(i7, unsafe.getObject(obj, j), c2388h0.m14810G(i4));
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj, j);
                        iM14717B5 = AbstractC2372a0.m14717B(i7 << 3);
                        iZzd = zzgkVar.zzd();
                        iM14717B6 = AbstractC2372a0.m14717B(iZzd);
                        iM14717B4 = iM14717B5 + iM14717B6 + iZzd;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        int i13 = unsafe.getInt(obj, j);
                        iM14717B2 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a = AbstractC2372a0.m14717B(i13);
                        iM14717B4 = iM14717B2 + iM14718a;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iM14717B2 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a = AbstractC2372a0.m14718a(j5);
                        iM14717B4 = iM14717B2 + iM14718a;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        iM14717B = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B4 = iM14717B + 4;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        iM14717B3 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B4 = iM14717B3 + 8;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        int i14 = unsafe.getInt(obj, j);
                        iM14717B2 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a = AbstractC2372a0.m14717B((i14 >> 31) ^ (i14 + i14));
                        iM14717B4 = iM14717B2 + iM14718a;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iM14717B2 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a = AbstractC2372a0.m14718a((j6 >> 63) ^ (j6 + j6));
                        iM14717B4 = iM14717B2 + iM14718a;
                        iM14717B16 = i11 + iM14717B4;
                        c2388h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2388h0 = this;
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (c2388h0.m14827o(obj, i4, i6, i5, i)) {
                        iM14848m = AbstractC2372a0.m14720y(i7, (smx0) unsafe.getObject(obj, j), c2388h0.m14810G(i4));
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    iM14848m = C2392j0.m14844i(i7, (List) unsafe.getObject(obj, j), false);
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    iM14848m = C2392j0.m14842g(i7, (List) unsafe.getObject(obj, j), false);
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var = C2392j0.f10351a;
                    if (list.size() == 0) {
                        iM14847l = 0;
                    } else {
                        iM14847l = C2392j0.m14847l(list) + (list.size() * AbstractC2372a0.m14717B(i7 << 3));
                    }
                    iM14717B16 = iM14847l + i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var2 = C2392j0.f10351a;
                    size = list2.size();
                    if (size == 0) {
                        iM14848m = 0;
                    } else {
                        iM14852q = C2392j0.m14852q(list2);
                        iM14717B7 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = size * iM14717B7;
                        iM14848m = iM14852q + iM14718a2;
                    }
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var3 = C2392j0.f10351a;
                    size = list3.size();
                    if (size == 0) {
                        iM14848m = 0;
                    } else {
                        iM14852q = C2392j0.m14846k(list3);
                        iM14717B7 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = size * iM14717B7;
                        iM14848m = iM14852q + iM14718a2;
                    }
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    iM14848m = C2392j0.m14844i(i7, (List) unsafe.getObject(obj, j), false);
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    iM14848m = C2392j0.m14842g(i7, (List) unsafe.getObject(obj, j), false);
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var4 = C2392j0.f10351a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM14848m = 0;
                    } else {
                        iM14848m = size2 * (AbstractC2372a0.m14717B(i7 << 3) + 1);
                    }
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var5 = C2392j0.f10351a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM14847l = 0;
                    } else {
                        iM14847l = AbstractC2372a0.m14717B(i7 << 3) * size3;
                        if (list5 instanceof tjx0) {
                            tjx0 tjx0Var = (tjx0) list5;
                            for (int i15 = 0; i15 < size3; i15++) {
                                Object objZzc = tjx0Var.zzc();
                                if (objZzc instanceof zzgk) {
                                    int iZzd3 = ((zzgk) objZzc).zzd();
                                    iM14847l += AbstractC2372a0.m14717B(iZzd3) + iZzd3;
                                } else {
                                    iM14847l += AbstractC2372a0.m14716A((String) objZzc);
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < size3; i16++) {
                                Object obj2 = list5.get(i16);
                                if (obj2 instanceof zzgk) {
                                    int iZzd4 = ((zzgk) obj2).zzd();
                                    iM14847l += AbstractC2372a0.m14717B(iZzd4) + iZzd4;
                                } else {
                                    iM14847l += AbstractC2372a0.m14716A((String) obj2);
                                }
                            }
                        }
                    }
                    iM14717B16 = iM14847l + i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    oox0 oox0VarM14810G = c2388h0.m14810G(i4);
                    erx0 erx0Var6 = C2392j0.f10351a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM14717B8 = 0;
                    } else {
                        iM14717B8 = AbstractC2372a0.m14717B(i7 << 3) * size4;
                        for (int i17 = 0; i17 < size4; i17++) {
                            Object obj3 = list6.get(i17);
                            if (obj3 instanceof C2382e0) {
                                int iM14785a = ((C2382e0) obj3).m14785a();
                                iM14717B8 += AbstractC2372a0.m14717B(iM14785a) + iM14785a;
                            } else {
                                iM14717B8 += AbstractC2372a0.m14721z((smx0) obj3, oox0VarM14810G);
                            }
                        }
                    }
                    iM14717B16 = i11 + iM14717B8;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var7 = C2392j0.f10351a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM14717B9 = 0;
                    } else {
                        iM14717B9 = size5 * AbstractC2372a0.m14717B(i7 << 3);
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int iZzd5 = ((zzgk) list7.get(i18)).zzd();
                            iM14717B9 += AbstractC2372a0.m14717B(iZzd5) + iZzd5;
                        }
                    }
                    iM14717B16 = i11 + iM14717B9;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var8 = C2392j0.f10351a;
                    size = list8.size();
                    if (size == 0) {
                        iM14848m = 0;
                    } else {
                        iM14852q = C2392j0.m14851p(list8);
                        iM14717B7 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = size * iM14717B7;
                        iM14848m = iM14852q + iM14718a2;
                    }
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var9 = C2392j0.f10351a;
                    size = list9.size();
                    if (size == 0) {
                        iM14848m = 0;
                    } else {
                        iM14852q = C2392j0.m14841f(list9);
                        iM14717B7 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = size * iM14717B7;
                        iM14848m = iM14852q + iM14718a2;
                    }
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    iM14848m = C2392j0.m14842g(i7, (List) unsafe.getObject(obj, j), false);
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    iM14848m = C2392j0.m14844i(i7, (List) unsafe.getObject(obj, j), false);
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var10 = C2392j0.f10351a;
                    size = list10.size();
                    if (size == 0) {
                        iM14848m = 0;
                    } else {
                        iM14852q = C2392j0.m14849n(list10);
                        iM14717B7 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = size * iM14717B7;
                        iM14848m = iM14852q + iM14718a2;
                    }
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var11 = C2392j0.f10351a;
                    size = list11.size();
                    if (size == 0) {
                        iM14848m = 0;
                    } else {
                        iM14852q = C2392j0.m14850o(list11);
                        iM14717B7 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = size * iM14717B7;
                        iM14848m = iM14852q + iM14718a2;
                    }
                    iM14717B16 = i11 + iM14848m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    iM14845j = C2392j0.m14845j((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 36:
                    iM14845j = C2392j0.m14843h((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 37:
                    iM14845j = C2392j0.m14847l((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    iM14845j = C2392j0.m14852q((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 39:
                    iM14845j = C2392j0.m14846k((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 40:
                    iM14845j = C2392j0.m14845j((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 41:
                    iM14845j = C2392j0.m14843h((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    erx0 erx0Var12 = C2392j0.f10351a;
                    iM14845j = list12.size();
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    iM14845j = C2392j0.m14851p((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 44:
                    iM14845j = C2392j0.m14841f((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 45:
                    iM14845j = C2392j0.m14843h((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 46:
                    iM14845j = C2392j0.m14845j((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 47:
                    iM14845j = C2392j0.m14849n((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 48:
                    iM14845j = C2392j0.m14850o((List) unsafe.getObject(obj, j));
                    if (iM14845j > 0) {
                        iM14717B10 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14717B11 = AbstractC2372a0.m14717B(iM14845j);
                        iM14717B9 = iM14717B10 + iM14717B11 + iM14845j;
                        iM14717B16 = i11 + iM14717B9;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    oox0 oox0VarM14810G2 = c2388h0.m14810G(i4);
                    erx0 erx0Var13 = C2392j0.f10351a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iM14720y = 0;
                    } else {
                        iM14720y = 0;
                        for (int i19 = 0; i19 < size6; i19++) {
                            iM14720y += AbstractC2372a0.m14720y(i7, (smx0) list13.get(i19), oox0VarM14810G2);
                        }
                    }
                    iM14717B16 = i11 + iM14720y;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 50:
                    zzig zzigVar = (zzig) unsafe.getObject(obj, j);
                    if (!zzigVar.isEmpty()) {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 51:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        iM14717B12 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14848m = iM14717B12 + 8;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 52:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        iM14717B13 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14848m = iM14717B13 + 4;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        long jM14794E = m14794E(obj, j);
                        iM14852q = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = AbstractC2372a0.m14718a(jM14794E);
                        iM14848m = iM14852q + iM14718a2;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        long jM14794E2 = m14794E(obj, j);
                        iM14852q = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = AbstractC2372a0.m14718a(jM14794E2);
                        iM14848m = iM14852q + iM14718a2;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        long jM14805z = m14805z(obj, j);
                        iM14852q = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = AbstractC2372a0.m14718a(jM14805z);
                        iM14848m = iM14852q + iM14718a2;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        iM14717B12 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14848m = iM14717B12 + 8;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        iM14717B13 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14848m = iM14717B13 + 4;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        iM14848m = AbstractC2372a0.m14717B(i7 << 3) + 1;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        int i20 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgk) {
                            iM14717B14 = AbstractC2372a0.m14717B(i20);
                            iZzd2 = ((zzgk) object2).zzd();
                            iM14717B15 = AbstractC2372a0.m14717B(iZzd2);
                            iM14848m = iM14717B14 + iM14717B15 + iZzd2;
                            iM14717B16 = i11 + iM14848m;
                        } else {
                            iM14852q = AbstractC2372a0.m14717B(i20);
                            iM14718a2 = AbstractC2372a0.m14716A((String) object2);
                            iM14848m = iM14852q + iM14718a2;
                            iM14717B16 = i11 + iM14848m;
                        }
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        iM14848m = C2392j0.m14848m(i7, unsafe.getObject(obj, j), c2388h0.m14810G(i4));
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj, j);
                        iM14717B14 = AbstractC2372a0.m14717B(i7 << 3);
                        iZzd2 = zzgkVar2.zzd();
                        iM14717B15 = AbstractC2372a0.m14717B(iZzd2);
                        iM14848m = iM14717B14 + iM14717B15 + iZzd2;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        int iM14805z = m14805z(obj, j);
                        iM14852q = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = AbstractC2372a0.m14717B(iM14805z);
                        iM14848m = iM14852q + iM14718a2;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        long jM14805z2 = m14805z(obj, j);
                        iM14852q = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = AbstractC2372a0.m14718a(jM14805z2);
                        iM14848m = iM14852q + iM14718a2;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        iM14717B13 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14848m = iM14717B13 + 4;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        iM14717B12 = AbstractC2372a0.m14717B(i7 << 3);
                        iM14848m = iM14717B12 + 8;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        int iM14805z2 = m14805z(obj, j);
                        iM14852q = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = AbstractC2372a0.m14717B((iM14805z2 >> 31) ^ (iM14805z2 + iM14805z2));
                        iM14848m = iM14852q + iM14718a2;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        long jM14794E3 = m14794E(obj, j);
                        iM14852q = AbstractC2372a0.m14717B(i7 << 3);
                        iM14718a2 = AbstractC2372a0.m14718a((jM14794E3 >> 63) ^ (jM14794E3 + jM14794E3));
                        iM14848m = iM14852q + iM14718a2;
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (c2388h0.m14828r(obj, i7, i4)) {
                        iM14848m = AbstractC2372a0.m14720y(i7, (smx0) unsafe.getObject(obj, j), c2388h0.m14810G(i4));
                        iM14717B16 = i11 + iM14848m;
                    } else {
                        iM14717B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                default:
                    iM14717B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
            }
        }
        int iM137924a = iM14717B16 + ((AbstractC2380d0) obj).zzc.m137924a();
        if (!c2388h0.f10339f) {
            return iM137924a;
        }
        sax0 sax0Var = ((AbstractC2378c0) obj).zzb;
        int iM165500c = sax0Var.f163460a.m165500c();
        int iM183116b = 0;
        while (true) {
            oqx0 oqx0Var = sax0Var.f163460a;
            if (i2 >= iM165500c) {
                for (Map.Entry entry2 : oqx0Var.m165501d()) {
                    iM183116b += sax0.m183116b((t9x0) entry2.getKey(), entry2.getValue());
                }
                return iM137924a + iM183116b;
            }
            Map.Entry entryM165503g = oqx0Var.m165503g(i2);
            iM183116b += sax0.m183116b((t9x0) ((wpx0) entryM165503g).m204951a(), entryM165503g.getValue());
            i2++;
        }
    }

    @Override // p149l.oox0
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f10334a.length; i4 += 3) {
            int iM14808D = m14808D(i4);
            int[] iArr = this.f10334a;
            int i5 = 1048575 & iM14808D;
            int iM14793C = m14793C(iM14808D);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iM14793C) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(ksx0.m147114f(obj, j));
                    Charset charset = mix0.f134047a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(ksx0.m147115g(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = ksx0.m147117i(obj, j);
                    Charset charset2 = mix0.f134047a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = ksx0.m147117i(obj, j);
                    Charset charset3 = mix0.f134047a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = ksx0.m147116h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = ksx0.m147117i(obj, j);
                    Charset charset4 = mix0.f134047a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = ksx0.m147116h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = mix0.m154765a(ksx0.m147105B(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) ksx0.m147119k(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objM147119k = ksx0.m147119k(obj, j);
                    if (objM147119k != null) {
                        iHashCode = objM147119k.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = ksx0.m147119k(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = ksx0.m147116h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = ksx0.m147116h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = ksx0.m147116h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = ksx0.m147117i(obj, j);
                    Charset charset5 = mix0.f134047a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = ksx0.m147116h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = ksx0.m147117i(obj, j);
                    Charset charset6 = mix0.f134047a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objM147119k2 = ksx0.m147119k(obj, j);
                    if (objM147119k2 != null) {
                        iHashCode = objM147119k2.hashCode();
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
                    iFloatToIntBits = ksx0.m147119k(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = ksx0.m147119k(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(m14803x(obj, j));
                        Charset charset7 = mix0.f134047a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(m14804y(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14794E(obj, j);
                        Charset charset8 = mix0.f134047a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14794E(obj, j);
                        Charset charset9 = mix0.f134047a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14805z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14794E(obj, j);
                        Charset charset10 = mix0.f134047a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14805z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = mix0.m154765a(m14799s(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) ksx0.m147119k(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ksx0.m147119k(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ksx0.m147119k(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14805z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14805z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14805z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14794E(obj, j);
                        Charset charset11 = mix0.f134047a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14805z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14794E(obj, j);
                        Charset charset12 = mix0.f134047a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (m14828r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ksx0.m147119k(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + ((AbstractC2380d0) obj).zzc.hashCode();
        return this.f10339f ? (iHashCode2 * 53) + ((AbstractC2378c0) obj).zzb.f163460a.hashCode() : iHashCode2;
    }

    @Override // p149l.oox0
    public final Object zze() {
        return ((AbstractC2380d0) this.f10338e).m14773m();
    }

    @Override // p149l.oox0
    public final void zzg(Object obj, Object obj2) {
        m14796f(obj);
        obj2.getClass();
        for (int i = 0; i < this.f10334a.length; i += 3) {
            int iM14808D = m14808D(i);
            int i2 = 1048575 & iM14808D;
            int[] iArr = this.f10334a;
            int iM14793C = m14793C(iM14808D);
            int i3 = iArr[i];
            long j = i2;
            switch (iM14793C) {
                case 0:
                    if (m14826n(obj2, i)) {
                        ksx0.m147128t(obj, j, ksx0.m147114f(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 1:
                    if (m14826n(obj2, i)) {
                        ksx0.m147129u(obj, j, ksx0.m147115g(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 2:
                    if (m14826n(obj2, i)) {
                        ksx0.m147131w(obj, j, ksx0.m147117i(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 3:
                    if (m14826n(obj2, i)) {
                        ksx0.m147131w(obj, j, ksx0.m147117i(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 4:
                    if (m14826n(obj2, i)) {
                        ksx0.m147130v(obj, j, ksx0.m147116h(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 5:
                    if (m14826n(obj2, i)) {
                        ksx0.m147131w(obj, j, ksx0.m147117i(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 6:
                    if (m14826n(obj2, i)) {
                        ksx0.m147130v(obj, j, ksx0.m147116h(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 7:
                    if (m14826n(obj2, i)) {
                        ksx0.m147126r(obj, j, ksx0.m147105B(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 8:
                    if (m14826n(obj2, i)) {
                        ksx0.m147132x(obj, j, ksx0.m147119k(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 9:
                    m14819g(obj, obj2, i);
                    break;
                case 10:
                    if (m14826n(obj2, i)) {
                        ksx0.m147132x(obj, j, ksx0.m147119k(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 11:
                    if (m14826n(obj2, i)) {
                        ksx0.m147130v(obj, j, ksx0.m147116h(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 12:
                    if (m14826n(obj2, i)) {
                        ksx0.m147130v(obj, j, ksx0.m147116h(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 13:
                    if (m14826n(obj2, i)) {
                        ksx0.m147130v(obj, j, ksx0.m147116h(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 14:
                    if (m14826n(obj2, i)) {
                        ksx0.m147131w(obj, j, ksx0.m147117i(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 15:
                    if (m14826n(obj2, i)) {
                        ksx0.m147130v(obj, j, ksx0.m147116h(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 16:
                    if (m14826n(obj2, i)) {
                        ksx0.m147131w(obj, j, ksx0.m147117i(obj2, j));
                        m14821i(obj, i);
                    }
                    break;
                case 17:
                    m14819g(obj, obj2, i);
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
                    iix0 iix0VarZzd = (iix0) ksx0.m147119k(obj, j);
                    iix0 iix0Var = (iix0) ksx0.m147119k(obj2, j);
                    int size = iix0VarZzd.size();
                    int size2 = iix0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!iix0VarZzd.zzc()) {
                            iix0VarZzd = iix0VarZzd.zzd(size2 + size);
                        }
                        iix0VarZzd.addAll(iix0Var);
                    }
                    if (size > 0) {
                        iix0Var = iix0VarZzd;
                    }
                    ksx0.m147132x(obj, j, iix0Var);
                    break;
                case 50:
                    erx0 erx0Var = C2392j0.f10351a;
                    ksx0.m147132x(obj, j, wlx0.m203960a(ksx0.m147119k(obj, j), ksx0.m147119k(obj2, j)));
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
                    if (m14828r(obj2, i3, i)) {
                        ksx0.m147132x(obj, j, ksx0.m147119k(obj2, j));
                        m14822j(obj, i3, i);
                    }
                    break;
                case 60:
                    m14820h(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m14828r(obj2, i3, i)) {
                        ksx0.m147132x(obj, j, ksx0.m147119k(obj2, j));
                        m14822j(obj, i3, i);
                    }
                    break;
                case 68:
                    m14820h(obj, obj2, i);
                    break;
            }
        }
        C2392j0.m14856u(this.f10343j, obj, obj2);
        if (this.f10339f) {
            C2392j0.m14855t(this.f10344k, obj, obj2);
        }
    }
}
