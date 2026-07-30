package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.aag0;
import p149l.b0y0;
import p149l.b6y0;
import p149l.cbx0;
import p149l.ctx0;
import p149l.e6y0;
import p149l.g0y0;
import p149l.gyx0;
import p149l.hmx0;
import p149l.i3y0;
import p149l.ig3;
import p149l.kyx0;
import p149l.ltx0;
import p149l.m3y0;
import p149l.m8y0;
import p149l.o1y0;
import p149l.p2y0;
import p149l.p3y0;
import p149l.prx0;
import p149l.t2y0;
import p149l.uwx0;
import p149l.x9g0;
import p149l.y2y0;
import p149l.y5y0;
import p149l.yqx0;
import p149l.yrx0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2353w0<T> implements i3y0<T> {

    /* JADX INFO: renamed from: q */
    public static final int[] f10272q = new int[0];

    /* JADX INFO: renamed from: r */
    public static final Unsafe f10273r = e6y0.m115143p();

    /* JADX INFO: renamed from: a */
    public final int[] f10274a;

    /* JADX INFO: renamed from: b */
    public final Object[] f10275b;

    /* JADX INFO: renamed from: c */
    public final int f10276c;

    /* JADX INFO: renamed from: d */
    public final int f10277d;

    /* JADX INFO: renamed from: e */
    public final g0y0 f10278e;

    /* JADX INFO: renamed from: f */
    public final boolean f10279f;

    /* JADX INFO: renamed from: g */
    public final boolean f10280g;

    /* JADX INFO: renamed from: h */
    public final boolean f10281h;

    /* JADX INFO: renamed from: i */
    public final int[] f10282i;

    /* JADX INFO: renamed from: j */
    public final int f10283j;

    /* JADX INFO: renamed from: k */
    public final int f10284k;

    /* JADX INFO: renamed from: l */
    public final o1y0 f10285l;

    /* JADX INFO: renamed from: m */
    public final uwx0 f10286m;

    /* JADX INFO: renamed from: n */
    public final b6y0<?, ?> f10287n;

    /* JADX INFO: renamed from: o */
    public final yqx0<?> f10288o;

    /* JADX INFO: renamed from: p */
    public final kyx0 f10289p;

    public C2353w0(int[] iArr, Object[] objArr, int i, int i2, g0y0 g0y0Var, boolean z, int[] iArr2, int i3, int i4, o1y0 o1y0Var, uwx0 uwx0Var, b6y0<?, ?> b6y0Var, yqx0<?> yqx0Var, kyx0 kyx0Var) {
        this.f10274a = iArr;
        this.f10275b = objArr;
        this.f10276c = i;
        this.f10277d = i2;
        this.f10280g = g0y0Var instanceof AbstractC2349u0;
        this.f10279f = yqx0Var != null && yqx0Var.mo14338h(g0y0Var);
        this.f10281h = false;
        this.f10282i = iArr2;
        this.f10283j = i3;
        this.f10284k = i4;
        this.f10285l = o1y0Var;
        this.f10286m = uwx0Var;
        this.f10287n = b6y0Var;
        this.f10288o = yqx0Var;
        this.f10278e = g0y0Var;
        this.f10289p = kyx0Var;
    }

    /* JADX INFO: renamed from: F */
    public static <T> int m14431F(T t, long j) {
        return ((Integer) e6y0.m115123B(t, j)).intValue();
    }

    /* JADX INFO: renamed from: G */
    public static y5y0 m14432G(Object obj) {
        AbstractC2349u0 abstractC2349u0 = (AbstractC2349u0) obj;
        y5y0 y5y0Var = abstractC2349u0.zzb;
        if (y5y0Var != y5y0.m213023k()) {
            return y5y0Var;
        }
        y5y0 y5y0VarM213024l = y5y0.m213024l();
        abstractC2349u0.zzb = y5y0VarM213024l;
        return y5y0VarM213024l;
    }

    /* JADX INFO: renamed from: K */
    public static <T> long m14433K(T t, long j) {
        return ((Long) e6y0.m115123B(t, j)).longValue();
    }

    /* JADX INFO: renamed from: N */
    public static <T> boolean m14434N(T t, long j) {
        return ((Boolean) e6y0.m115123B(t, j)).booleanValue();
    }

    /* JADX INFO: renamed from: P */
    public static void m14435P(Object obj) {
        if (m14437R(obj)) {
            return;
        }
        ig3.m135964a("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m14436Q(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m14437R(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2349u0) {
            return ((AbstractC2349u0) obj).m14353A();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static <T> double m14438g(T t, long j) {
        return ((Double) e6y0.m115123B(t, j)).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:123:0x026a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0271  */
    /* JADX WARN: Code duplicated, block: B:128:0x0287  */
    /* JADX WARN: Code duplicated, block: B:129:0x028a  */
    /* JADX INFO: renamed from: k */
    public static <T> C2353w0<T> m14439k(Class<T> cls, b0y0 b0y0Var, o1y0 o1y0Var, uwx0 uwx0Var, b6y0<?, ?> b6y0Var, yqx0<?> yqx0Var, kyx0 kyx0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
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
        y2y0 y2y0Var;
        int i17;
        int[] iArr2;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        int iObjectFieldOffset2;
        int iObjectFieldOffset3;
        int i21;
        Field fieldM14440p;
        int i22;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldM14440p2;
        int i26;
        Object obj2;
        Field fieldM14440p3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        if (!(b0y0Var instanceof y2y0)) {
            throw new NoSuchMethodError();
        }
        y2y0 y2y0Var2 = (y2y0) b0y0Var;
        String strM212754a = y2y0Var2.m212754a();
        int length = strM212754a.length();
        char c = 55296;
        if (strM212754a.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (strM212754a.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt2 = strM212754a.charAt(i);
        if (iCharAt2 >= 55296) {
            int i33 = iCharAt2 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = strM212754a.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt2 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i5 = 0;
            iCharAt = 0;
            i2 = 0;
            i4 = 0;
            i7 = 0;
            iArr = f10272q;
            i6 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt3 = strM212754a.charAt(i32);
            if (iCharAt3 >= 55296) {
                int i36 = iCharAt3 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    cCharAt8 = strM212754a.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                iCharAt3 = i36 | (cCharAt8 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int iCharAt4 = strM212754a.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt7 = strM212754a.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                iCharAt4 = i39 | (cCharAt7 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int iCharAt5 = strM212754a.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt6 = strM212754a.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                iCharAt5 = i42 | (cCharAt6 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt6 = strM212754a.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt5 = strM212754a.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                iCharAt6 = i45 | (cCharAt5 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            iCharAt = strM212754a.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt4 = strM212754a.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt = i48 | (cCharAt4 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int iCharAt7 = strM212754a.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt3 = strM212754a.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                iCharAt7 = i51 | (cCharAt3 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int iCharAt8 = strM212754a.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt2 = strM212754a.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                iCharAt8 = i54 | (cCharAt2 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int iCharAt9 = strM212754a.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    cCharAt = strM212754a.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                iCharAt9 = i57 | (cCharAt << i58);
                i56 = i8;
            }
            int[] iArr3 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i59 = (iCharAt3 << 1) + iCharAt4;
            int i60 = iCharAt7;
            i2 = iCharAt5;
            i3 = i60;
            i4 = iCharAt6;
            i5 = i59;
            iArr = iArr3;
            i6 = iCharAt3;
            i7 = iCharAt9;
            i32 = i56;
        }
        Unsafe unsafe = f10273r;
        Object[] objArrM212755b = y2y0Var2.m212755b();
        Class<?> cls2 = y2y0Var2.zza().getClass();
        int[] iArr4 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt << 1];
        int i61 = i7 + i3;
        int i62 = i7;
        int i63 = i61;
        int i64 = 0;
        int i65 = 0;
        while (i32 < length) {
            int i66 = i32 + 1;
            int iCharAt10 = strM212754a.charAt(i32);
            if (iCharAt10 >= c) {
                int i67 = iCharAt10 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i29 = i68 + 1;
                    cCharAt12 = strM212754a.charAt(i68);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i67 |= (cCharAt12 & 8191) << i69;
                    i69 += 13;
                    i68 = i29;
                }
                iCharAt10 = i67 | (cCharAt12 << i69);
                i16 = i29;
            } else {
                i16 = i66;
            }
            int i70 = i16 + 1;
            int iCharAt11 = strM212754a.charAt(i16);
            if (iCharAt11 >= c) {
                int i71 = iCharAt11 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i28 = i72 + 1;
                    cCharAt11 = strM212754a.charAt(i72);
                    y2y0Var = y2y0Var2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i72 = i28;
                    y2y0Var2 = y2y0Var;
                }
                iCharAt11 = i71 | (cCharAt11 << i73);
                i17 = i28;
            } else {
                y2y0Var = y2y0Var2;
                i17 = i70;
            }
            int i74 = iCharAt11 & 255;
            int i75 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            int i76 = iCharAt10;
            if (i74 >= 51) {
                i20 = i17 + 1;
                int iCharAt12 = strM212754a.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = 13;
                    while (true) {
                        i27 = i20 + 1;
                        cCharAt10 = strM212754a.charAt(i20);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i77 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i20 = i27;
                        c2 = 55296;
                    }
                    iCharAt12 = i77 | (cCharAt10 << i78);
                    i20 = i27;
                }
                int i79 = i74 - 51;
                int i80 = iCharAt12;
                if (i79 == 9 || i79 == 17) {
                    i24 = i5 + 1;
                    objArr[((i64 / 3) << 1) + 1] = objArrM212755b[i5];
                } else {
                    if (i79 == 12 && (y2y0Var.zzb().equals(zzln.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i24 = i5 + 1;
                        objArr[((i64 / 3) << 1) + 1] = objArrM212755b[i5];
                    }
                    i25 = i80 << 1;
                    obj = objArrM212755b[i25];
                    if (obj instanceof Field) {
                        fieldM14440p2 = (Field) obj;
                    } else {
                        fieldM14440p2 = m14440p(cls2, (String) obj);
                        objArrM212755b[i25] = fieldM14440p2;
                    }
                    iArr2 = iArr4;
                    i18 = i6;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14440p2);
                    i26 = i25 + 1;
                    obj2 = objArrM212755b[i26];
                    if (obj2 instanceof Field) {
                        fieldM14440p3 = (Field) obj2;
                    } else {
                        fieldM14440p3 = m14440p(cls2, (String) obj2);
                        objArrM212755b[i26] = fieldM14440p3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM14440p3);
                    i21 = i5;
                    strM212754a = strM212754a;
                    i19 = 0;
                }
                i5 = i24;
                i25 = i80 << 1;
                obj = objArrM212755b[i25];
                if (obj instanceof Field) {
                    fieldM14440p2 = (Field) obj;
                } else {
                    fieldM14440p2 = m14440p(cls2, (String) obj);
                    objArrM212755b[i25] = fieldM14440p2;
                }
                iArr2 = iArr4;
                i18 = i6;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14440p2);
                i26 = i25 + 1;
                obj2 = objArrM212755b[i26];
                if (obj2 instanceof Field) {
                    fieldM14440p3 = (Field) obj2;
                } else {
                    fieldM14440p3 = m14440p(cls2, (String) obj2);
                    objArrM212755b[i26] = fieldM14440p3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM14440p3);
                i21 = i5;
                strM212754a = strM212754a;
                i19 = 0;
            } else {
                iArr2 = iArr4;
                i18 = i6;
                int i81 = i5 + 1;
                Field fieldM14440p4 = m14440p(cls2, (String) objArrM212755b[i5]);
                if (i74 == 9 || i74 == 17) {
                    objArr[((i64 / 3) << 1) + 1] = fieldM14440p4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i23 = i5 + 2;
                        objArr[((i64 / 3) << 1) + 1] = objArrM212755b[i81];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        if (y2y0Var.zzb() == zzln.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i23 = i5 + 2;
                            objArr[((i64 / 3) << 1) + 1] = objArrM212755b[i81];
                        }
                    } else if (i74 == 50) {
                        int i82 = i62 + 1;
                        iArr[i62] = i64;
                        int i83 = (i64 / 3) << 1;
                        int i84 = i5 + 2;
                        objArr[i83] = objArrM212755b[i81];
                        if ((iCharAt11 & 2048) != 0) {
                            i81 = i5 + 3;
                            objArr[i83 + 1] = objArrM212755b[i84];
                            i62 = i82;
                        } else {
                            i62 = i82;
                            i81 = i84;
                        }
                    }
                    i81 = i23;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM14440p4);
                if ((iCharAt11 & 4096) == 0 || i74 > 17) {
                    iObjectFieldOffset = 1048575;
                    i19 = 0;
                } else {
                    int i85 = i17 + 1;
                    int iCharAt13 = strM212754a.charAt(i17);
                    if (iCharAt13 >= 55296) {
                        int i86 = iCharAt13 & 8191;
                        int i87 = 13;
                        while (true) {
                            i22 = i85 + 1;
                            cCharAt9 = strM212754a.charAt(i85);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i86 |= (cCharAt9 & 8191) << i87;
                            i87 += 13;
                            i85 = i22;
                        }
                        iCharAt13 = i86 | (cCharAt9 << i87);
                        i85 = i22;
                    }
                    int i88 = (i18 << 1) + (iCharAt13 / 32);
                    Object obj3 = objArrM212755b[i88];
                    int i89 = iCharAt13;
                    if (obj3 instanceof Field) {
                        fieldM14440p = (Field) obj3;
                    } else {
                        fieldM14440p = m14440p(cls2, (String) obj3);
                        objArrM212755b[i88] = fieldM14440p;
                    }
                    i19 = i89 % 32;
                    int i90 = i85;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14440p);
                    i17 = i90;
                }
                if (i74 < 18 || i74 > 49) {
                    int i91 = i81;
                    i20 = i17;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    iObjectFieldOffset3 = iObjectFieldOffset;
                    i21 = i91;
                } else {
                    int i92 = i63 + 1;
                    iArr[i63] = iObjectFieldOffset4;
                    int i93 = i81;
                    i20 = i17;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    iObjectFieldOffset3 = iObjectFieldOffset;
                    i21 = i93;
                    i63 = i92;
                }
            }
            int i94 = i64 + 1;
            iArr2[i64] = i76;
            int i95 = i64 + 2;
            iArr2[i94] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | iObjectFieldOffset2;
            i64 += 3;
            iArr2[i95] = (i19 << 20) | iObjectFieldOffset3;
            i32 = i20;
            strM212754a = strM212754a;
            length = i75;
            y2y0Var2 = y2y0Var;
            i6 = i18;
            c = 55296;
            i5 = i21;
            iArr4 = iArr2;
        }
        return new C2353w0<>(iArr4, objArr, i2, i4, y2y0Var2.zza(), false, iArr, i7, i61, o1y0Var, uwx0Var, b6y0Var, yqx0Var, kyx0Var);
    }

    /* JADX INFO: renamed from: p */
    public static Field m14440p(Class<?> cls, String str) {
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

    /* JADX INFO: renamed from: q */
    public static void m14441q(int i, Object obj, m8y0 m8y0Var) throws IOException {
        if (obj instanceof String) {
            m8y0Var.mo153541d(i, (String) obj);
        } else {
            m8y0Var.mo153563z(i, (zzik) obj);
        }
    }

    /* JADX INFO: renamed from: v */
    public static <UT, UB> void m14442v(b6y0<UT, UB> b6y0Var, T t, m8y0 m8y0Var) throws IOException {
        b6y0Var.mo14537n(b6y0Var.mo14540q(t), m8y0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static boolean m14443y(Object obj, int i, i3y0 i3y0Var) {
        return i3y0Var.mo14457b(e6y0.m115123B(obj, i & 1048575));
    }

    /* JADX INFO: renamed from: z */
    public static <T> float m14444z(T t, long j) {
        return ((Float) e6y0.m115123B(t, j)).floatValue();
    }

    /* JADX INFO: renamed from: A */
    public final int m14445A(int i) {
        return this.f10274a[i + 2];
    }

    /* JADX INFO: renamed from: B */
    public final void m14446B(T t, int i) {
        int iM14445A = m14445A(i);
        long j = 1048575 & iM14445A;
        if (j == 1048575) {
            return;
        }
        e6y0.m115135h(t, j, (1 << (iM14445A >>> 20)) | e6y0.m115147t(t, j));
    }

    /* JADX INFO: renamed from: C */
    public final void m14447C(T t, int i, int i2) {
        e6y0.m115135h(t, m14445A(i2) & 1048575, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m14448D(T t, T t2, int i) {
        int i2 = this.f10274a[i];
        if (m14451I(t2, i2, i)) {
            long jM14449E = m14449E(i) & 1048575;
            Unsafe unsafe = f10273r;
            Object object = unsafe.getObject(t2, jM14449E);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f10274a[i] + " is present but null: " + String.valueOf(t2));
            }
            i3y0 i3y0VarM14454M = m14454M(i);
            if (!m14451I(t, i2, i)) {
                if (m14437R(object)) {
                    Object objZza = i3y0VarM14454M.zza();
                    i3y0VarM14454M.mo14458c(objZza, object);
                    unsafe.putObject(t, jM14449E, objZza);
                } else {
                    unsafe.putObject(t, jM14449E, object);
                }
                m14447C(t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jM14449E);
            if (!m14437R(object2)) {
                Object objZza2 = i3y0VarM14454M.zza();
                i3y0VarM14454M.mo14458c(objZza2, object2);
                unsafe.putObject(t, jM14449E, objZza2);
                object2 = objZza2;
            }
            i3y0VarM14454M.mo14458c(object2, object);
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m14449E(int i) {
        return this.f10274a[i + 1];
    }

    /* JADX INFO: renamed from: H */
    public final boolean m14450H(T t, int i) {
        int iM14445A = m14445A(i);
        long j = iM14445A & 1048575;
        if (j != 1048575) {
            return ((1 << (iM14445A >>> 20)) & e6y0.m115147t(t, j)) != 0;
        }
        int iM14449E = m14449E(i);
        long j2 = iM14449E & 1048575;
        switch ((iM14449E & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(e6y0.m115128a(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(e6y0.m115141n(t, j2)) != 0;
            case 2:
                return e6y0.m115151x(t, j2) != 0;
            case 3:
                return e6y0.m115151x(t, j2) != 0;
            case 4:
                return e6y0.m115147t(t, j2) != 0;
            case 5:
                return e6y0.m115151x(t, j2) != 0;
            case 6:
                return e6y0.m115147t(t, j2) != 0;
            case 7:
                return e6y0.m115127F(t, j2);
            case 8:
                Object objM115123B = e6y0.m115123B(t, j2);
                if (objM115123B instanceof String) {
                    return !((String) objM115123B).isEmpty();
                }
                if (objM115123B instanceof zzik) {
                    return !zzik.zza.equals(objM115123B);
                }
                x9g0.m207497a();
                return false;
            case 9:
                return e6y0.m115123B(t, j2) != null;
            case 10:
                return !zzik.zza.equals(e6y0.m115123B(t, j2));
            case 11:
                return e6y0.m115147t(t, j2) != 0;
            case 12:
                return e6y0.m115147t(t, j2) != 0;
            case 13:
                return e6y0.m115147t(t, j2) != 0;
            case 14:
                return e6y0.m115151x(t, j2) != 0;
            case 15:
                return e6y0.m115147t(t, j2) != 0;
            case 16:
                return e6y0.m115151x(t, j2) != 0;
            case 17:
                return e6y0.m115123B(t, j2) != null;
            default:
                x9g0.m207497a();
                return false;
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14451I(T t, int i, int i2) {
        return e6y0.m115147t(t, (long) (m14445A(i2) & 1048575)) == i;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m14452J(T t, T t2, int i) {
        return m14450H(t, i) == m14450H(t2, i);
    }

    /* JADX INFO: renamed from: L */
    public final ltx0 m14453L(int i) {
        return (ltx0) this.f10275b[((i / 3) << 1) + 1];
    }

    /* JADX INFO: renamed from: M */
    public final i3y0 m14454M(int i) {
        int i2 = (i / 3) << 1;
        i3y0 i3y0Var = (i3y0) this.f10275b[i2];
        if (i3y0Var != null) {
            return i3y0Var;
        }
        i3y0<T> i3y0VarM167230b = p2y0.m167229a().m167230b((Class) this.f10275b[i2 + 1]);
        this.f10275b[i2] = i3y0VarM167230b;
        return i3y0VarM167230b;
    }

    /* JADX INFO: renamed from: O */
    public final Object m14455O(int i) {
        return this.f10275b[(i / 3) << 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:176:0x054b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // p149l.i3y0
    /* JADX INFO: renamed from: a */
    public final void mo14456a(T t, m8y0 m8y0Var) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i;
        int i2;
        int i3;
        Iterator itM171088m;
        Map.Entry<?, ?> entry2;
        C2353w0<T> c2353w0 = this;
        int i4 = 267386880;
        boolean z = true;
        int i5 = 1048575;
        if (m8y0Var.zza() == 2) {
            m14442v(c2353w0.f10287n, t, m8y0Var);
            if (c2353w0.f10279f) {
                prx0<T> prx0VarMo14334d = c2353w0.f10288o.mo14334d(t);
                if (prx0VarMo14334d.f150958a.isEmpty()) {
                    itM171088m = null;
                    entry2 = null;
                } else {
                    itM171088m = prx0VarMo14334d.m171088m();
                    entry2 = (Map.Entry) itM171088m.next();
                }
            } else {
                itM171088m = null;
                entry2 = null;
            }
            for (int length = c2353w0.f10274a.length - 3; length >= 0; length -= 3) {
                int iM14449E = c2353w0.m14449E(length);
                int i6 = c2353w0.f10274a[length];
                while (entry2 != null && c2353w0.f10288o.mo14331a(entry2) > i6) {
                    c2353w0.f10288o.mo14337g(m8y0Var, entry2);
                    entry2 = itM171088m.hasNext() ? (Map.Entry) itM171088m.next() : null;
                }
                switch ((iM14449E & 267386880) >>> 20) {
                    case 0:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153555r(i6, e6y0.m115128a(t, iM14449E & 1048575));
                        }
                        break;
                    case 1:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153556s(i6, e6y0.m115141n(t, iM14449E & 1048575));
                        }
                        break;
                    case 2:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153547j(i6, e6y0.m115151x(t, iM14449E & 1048575));
                        }
                        break;
                    case 3:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153561x(i6, e6y0.m115151x(t, iM14449E & 1048575));
                        }
                        break;
                    case 4:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153550m(i6, e6y0.m115147t(t, iM14449E & 1048575));
                        }
                        break;
                    case 5:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153539b(i6, e6y0.m115151x(t, iM14449E & 1048575));
                        }
                        break;
                    case 6:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153548k(i6, e6y0.m115147t(t, iM14449E & 1048575));
                        }
                        break;
                    case 7:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153545h(i6, e6y0.m115127F(t, iM14449E & 1048575));
                        }
                        break;
                    case 8:
                        if (c2353w0.m14450H(t, length)) {
                            m14441q(i6, e6y0.m115123B(t, iM14449E & 1048575), m8y0Var);
                        }
                        break;
                    case 9:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153531G(i6, e6y0.m115123B(t, iM14449E & 1048575), c2353w0.m14454M(length));
                        }
                        break;
                    case 10:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153563z(i6, (zzik) e6y0.m115123B(t, iM14449E & 1048575));
                        }
                        break;
                    case 11:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153557t(i6, e6y0.m115147t(t, iM14449E & 1048575));
                        }
                        break;
                    case 12:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153554q(i6, e6y0.m115147t(t, iM14449E & 1048575));
                        }
                        break;
                    case 13:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153558u(i6, e6y0.m115147t(t, iM14449E & 1048575));
                        }
                        break;
                    case 14:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153551n(i6, e6y0.m115151x(t, iM14449E & 1048575));
                        }
                        break;
                    case 15:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153560w(i6, e6y0.m115147t(t, iM14449E & 1048575));
                        }
                        break;
                    case 16:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153559v(i6, e6y0.m115151x(t, iM14449E & 1048575));
                        }
                        break;
                    case 17:
                        if (c2353w0.m14450H(t, length)) {
                            m8y0Var.mo153530F(i6, e6y0.m115123B(t, iM14449E & 1048575), c2353w0.m14454M(length));
                        }
                        break;
                    case 18:
                        p3y0.m167328w(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 19:
                        p3y0.m167289I(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 20:
                        p3y0.m167295O(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 21:
                        p3y0.m167305Y(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 22:
                        p3y0.m167292L(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 23:
                        p3y0.m167286F(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 24:
                        p3y0.m167283C(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 25:
                        p3y0.m167316k(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 26:
                        p3y0.m167326u(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var);
                        break;
                    case 27:
                        p3y0.m167327v(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, c2353w0.m14454M(length));
                        break;
                    case 28:
                        p3y0.m167314i(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var);
                        break;
                    case 29:
                        p3y0.m167304X(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 30:
                        p3y0.m167331z(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 31:
                        p3y0.m167298R(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 32:
                        p3y0.m167301U(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 33:
                        p3y0.m167302V(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 34:
                        p3y0.m167303W(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, false);
                        break;
                    case 35:
                        p3y0.m167328w(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 36:
                        p3y0.m167289I(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 37:
                        p3y0.m167295O(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 38:
                        p3y0.m167305Y(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 39:
                        p3y0.m167292L(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 40:
                        p3y0.m167286F(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 41:
                        p3y0.m167283C(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 42:
                        p3y0.m167316k(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 43:
                        p3y0.m167304X(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 44:
                        p3y0.m167331z(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 45:
                        p3y0.m167298R(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 46:
                        p3y0.m167301U(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 47:
                        p3y0.m167302V(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 48:
                        p3y0.m167303W(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, true);
                        break;
                    case 49:
                        p3y0.m167315j(c2353w0.f10274a[length], (List) e6y0.m115123B(t, iM14449E & 1048575), m8y0Var, c2353w0.m14454M(length));
                        break;
                    case 50:
                        c2353w0.m14473w(m8y0Var, i6, e6y0.m115123B(t, iM14449E & 1048575), length);
                        break;
                    case 51:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153555r(i6, m14438g(t, iM14449E & 1048575));
                        }
                        break;
                    case 52:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153556s(i6, m14444z(t, iM14449E & 1048575));
                        }
                        break;
                    case 53:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153547j(i6, m14433K(t, iM14449E & 1048575));
                        }
                        break;
                    case 54:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153561x(i6, m14433K(t, iM14449E & 1048575));
                        }
                        break;
                    case 55:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153550m(i6, m14431F(t, iM14449E & 1048575));
                        }
                        break;
                    case 56:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153539b(i6, m14433K(t, iM14449E & 1048575));
                        }
                        break;
                    case 57:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153548k(i6, m14431F(t, iM14449E & 1048575));
                        }
                        break;
                    case 58:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153545h(i6, m14434N(t, iM14449E & 1048575));
                        }
                        break;
                    case 59:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m14441q(i6, e6y0.m115123B(t, iM14449E & 1048575), m8y0Var);
                        }
                        break;
                    case 60:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153531G(i6, e6y0.m115123B(t, iM14449E & 1048575), c2353w0.m14454M(length));
                        }
                        break;
                    case 61:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153563z(i6, (zzik) e6y0.m115123B(t, iM14449E & 1048575));
                        }
                        break;
                    case 62:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153557t(i6, m14431F(t, iM14449E & 1048575));
                        }
                        break;
                    case 63:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153554q(i6, m14431F(t, iM14449E & 1048575));
                        }
                        break;
                    case 64:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153558u(i6, m14431F(t, iM14449E & 1048575));
                        }
                        break;
                    case 65:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153551n(i6, m14433K(t, iM14449E & 1048575));
                        }
                        break;
                    case 66:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153560w(i6, m14431F(t, iM14449E & 1048575));
                        }
                        break;
                    case 67:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153559v(i6, m14433K(t, iM14449E & 1048575));
                        }
                        break;
                    case 68:
                        if (c2353w0.m14451I(t, i6, length)) {
                            m8y0Var.mo153530F(i6, e6y0.m115123B(t, iM14449E & 1048575), c2353w0.m14454M(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                c2353w0.f10288o.mo14337g(m8y0Var, entry2);
                entry2 = itM171088m.hasNext() ? (Map.Entry) itM171088m.next() : null;
            }
            return;
        }
        if (c2353w0.f10279f) {
            prx0<T> prx0VarMo14334d2 = c2353w0.f10288o.mo14334d(t);
            if (prx0VarMo14334d2.f150958a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itM171089p = prx0VarMo14334d2.m171089p();
                entry = (Map.Entry) itM171089p.next();
                it = itM171089p;
            }
        } else {
            entry = null;
            it = null;
        }
        int length2 = c2353w0.f10274a.length;
        Unsafe unsafe = f10273r;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i7 < length2) {
            int iM14449E2 = c2353w0.m14449E(i7);
            int i10 = i4;
            int[] iArr = c2353w0.f10274a;
            int i11 = iArr[i7];
            int i12 = (iM14449E2 & i10) >>> 20;
            boolean z2 = z;
            if (i12 <= 17) {
                int i13 = iArr[i7 + 2];
                int i14 = i13 & i5;
                if (i14 != i9) {
                    i8 = i14 == i5 ? 0 : unsafe.getInt(t, i14);
                    i9 = i14;
                }
                i = i9;
                i2 = i8;
                i3 = (z2 ? 1 : 0) << (i13 >>> 20);
            } else {
                i = i9;
                i2 = i8;
                i3 = 0;
            }
            while (entry != null && c2353w0.f10288o.mo14331a(entry) <= i11) {
                c2353w0.f10288o.mo14337g(m8y0Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            Iterator it2 = it;
            long j = iM14449E2 & i5;
            switch (i12) {
                case 0:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153555r(i11, e6y0.m115128a(t, j));
                    }
                    break;
                case 1:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153556s(i11, e6y0.m115141n(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 2:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153547j(i11, unsafe.getLong(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 3:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153561x(i11, unsafe.getLong(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 4:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153550m(i11, unsafe.getInt(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 5:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153539b(i11, unsafe.getLong(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 6:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153548k(i11, unsafe.getInt(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 7:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153545h(i11, e6y0.m115127F(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 8:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m14441q(i11, unsafe.getObject(t, j), m8y0Var);
                    }
                    c2353w0 = this;
                    break;
                case 9:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153531G(i11, unsafe.getObject(t, j), c2353w0.m14454M(i7));
                    }
                    break;
                case 10:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153563z(i11, (zzik) unsafe.getObject(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 11:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153557t(i11, unsafe.getInt(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 12:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153554q(i11, unsafe.getInt(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 13:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153558u(i11, unsafe.getInt(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 14:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153551n(i11, unsafe.getLong(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 15:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153560w(i11, unsafe.getInt(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 16:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153559v(i11, unsafe.getLong(t, j));
                    }
                    c2353w0 = this;
                    break;
                case 17:
                    z = z2 ? 1 : 0;
                    if (c2353w0.m14474x(t, i7, i, i2, i3)) {
                        m8y0Var.mo153530F(i11, unsafe.getObject(t, j), c2353w0.m14454M(i7));
                    }
                    break;
                case 18:
                    z = z2 ? 1 : 0;
                    p3y0.m167328w(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 19:
                    z = z2 ? 1 : 0;
                    p3y0.m167289I(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 20:
                    z = z2 ? 1 : 0;
                    p3y0.m167295O(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 21:
                    z = z2 ? 1 : 0;
                    p3y0.m167305Y(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 22:
                    z = z2 ? 1 : 0;
                    p3y0.m167292L(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 23:
                    z = z2 ? 1 : 0;
                    p3y0.m167286F(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 24:
                    z = z2 ? 1 : 0;
                    p3y0.m167283C(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 25:
                    z = z2 ? 1 : 0;
                    p3y0.m167316k(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 26:
                    z = z2 ? 1 : 0;
                    p3y0.m167326u(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var);
                    break;
                case 27:
                    z = z2 ? 1 : 0;
                    p3y0.m167327v(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, c2353w0.m14454M(i7));
                    break;
                case 28:
                    z = z2 ? 1 : 0;
                    p3y0.m167314i(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var);
                    break;
                case 29:
                    z = z2 ? 1 : 0;
                    p3y0.m167304X(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 30:
                    z = z2 ? 1 : 0;
                    p3y0.m167331z(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 31:
                    z = z2 ? 1 : 0;
                    p3y0.m167298R(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 32:
                    z = z2 ? 1 : 0;
                    p3y0.m167301U(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 33:
                    z = z2 ? 1 : 0;
                    p3y0.m167302V(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 34:
                    z = z2 ? 1 : 0;
                    p3y0.m167303W(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, false);
                    break;
                case 35:
                    z = z2 ? 1 : 0;
                    p3y0.m167328w(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 36:
                    z = z2 ? 1 : 0;
                    p3y0.m167289I(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 37:
                    z = z2 ? 1 : 0;
                    p3y0.m167295O(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 38:
                    z = z2 ? 1 : 0;
                    p3y0.m167305Y(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 39:
                    z = z2 ? 1 : 0;
                    p3y0.m167292L(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 40:
                    z = z2 ? 1 : 0;
                    p3y0.m167286F(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 41:
                    z = z2 ? 1 : 0;
                    p3y0.m167283C(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 42:
                    z = z2 ? 1 : 0;
                    p3y0.m167316k(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 43:
                    z = z2 ? 1 : 0;
                    p3y0.m167304X(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 44:
                    z = z2 ? 1 : 0;
                    p3y0.m167331z(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 45:
                    z = z2 ? 1 : 0;
                    p3y0.m167298R(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 46:
                    z = z2 ? 1 : 0;
                    p3y0.m167301U(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 47:
                    z = z2 ? 1 : 0;
                    p3y0.m167302V(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, z);
                    break;
                case 48:
                    int i15 = c2353w0.f10274a[i7];
                    List list = (List) unsafe.getObject(t, j);
                    z = z2 ? 1 : 0;
                    p3y0.m167303W(i15, list, m8y0Var, z);
                    break;
                case 49:
                    p3y0.m167315j(c2353w0.f10274a[i7], (List) unsafe.getObject(t, j), m8y0Var, c2353w0.m14454M(i7));
                    z = z2 ? 1 : 0;
                    break;
                case 50:
                    c2353w0.m14473w(m8y0Var, i11, unsafe.getObject(t, j), i7);
                    z = z2 ? 1 : 0;
                    break;
                case 51:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153555r(i11, m14438g(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 52:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153556s(i11, m14444z(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 53:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153547j(i11, m14433K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 54:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153561x(i11, m14433K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 55:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153550m(i11, m14431F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 56:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153539b(i11, m14433K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 57:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153548k(i11, m14431F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 58:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153545h(i11, m14434N(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 59:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m14441q(i11, unsafe.getObject(t, j), m8y0Var);
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 60:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153531G(i11, unsafe.getObject(t, j), c2353w0.m14454M(i7));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 61:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153563z(i11, (zzik) unsafe.getObject(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 62:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153557t(i11, m14431F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 63:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153554q(i11, m14431F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 64:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153558u(i11, m14431F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 65:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153551n(i11, m14433K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 66:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153560w(i11, m14431F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 67:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153559v(i11, m14433K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 68:
                    if (c2353w0.m14451I(t, i11, i7)) {
                        m8y0Var.mo153530F(i11, unsafe.getObject(t, j), c2353w0.m14454M(i7));
                    }
                    z = z2 ? 1 : 0;
                    break;
                default:
                    z = z2 ? 1 : 0;
                    break;
            }
            i7 += 3;
            i8 = i2;
            it = it2;
            i5 = 1048575;
            i9 = i;
            entry = entry;
            i4 = i10;
        }
        Iterator it3 = it;
        while (entry != null) {
            c2353w0.f10288o.mo14337g(m8y0Var, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        m14442v(c2353w0.f10287n, t, m8y0Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb A[LOOP:1: B:45:0x00aa->B:50:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.i3y0
    /* JADX INFO: renamed from: b */
    public final boolean mo14457b(T t) {
        int i;
        int i2;
        C2353w0<T> c2353w0;
        T t2;
        List list;
        i3y0 i3y0VarM14454M;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.f10283j) {
            int i7 = this.f10282i[i5];
            int i8 = this.f10274a[i7];
            int iM14449E = this.m14449E(i7);
            int i9 = this.f10274a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i6 = f10273r.getInt(t, i10);
                }
                i2 = i6;
                i = i10;
            } else {
                i = i4;
                i2 = i6;
            }
            if ((268435456 & iM14449E) != 0) {
                c2353w0 = this;
                t2 = t;
                if (!c2353w0.m14474x(t2, i7, i, i2, i11)) {
                    return false;
                }
            } else {
                c2353w0 = this;
                t2 = t;
            }
            int i12 = (267386880 & iM14449E) >>> 20;
            if (i12 == 9 || i12 == 17) {
                if (c2353w0.m14474x(t2, i7, i, i2, i11) && !m14443y(t2, iM14449E, c2353w0.m14454M(i7))) {
                    return false;
                }
            } else if (i12 == 27) {
                list = (List) e6y0.m115123B(t2, iM14449E & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    i3y0VarM14454M = c2353w0.m14454M(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!i3y0VarM14454M.mo14457b(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i12 == 60 || i12 == 68) {
                if (c2353w0.m14451I(t2, i8, i7) && !m14443y(t2, iM14449E, c2353w0.m14454M(i7))) {
                    return false;
                }
            } else if (i12 == 49) {
                list = (List) e6y0.m115123B(t2, iM14449E & 1048575);
                if (list.isEmpty()) {
                    i3y0VarM14454M = c2353w0.m14454M(i7);
                    while (i3 < list.size()) {
                        if (!i3y0VarM14454M.mo14457b(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i12 == 50 && !c2353w0.f10289p.zzd(e6y0.m115123B(t2, iM14449E & 1048575)).isEmpty()) {
                c2353w0.f10289p.zza(c2353w0.m14455O(i7));
                throw null;
            }
            i5++;
            this = c2353w0;
            t = t2;
            i4 = i;
            i6 = i2;
        }
        C2353w0<T> c2353w1 = this;
        return !c2353w1.f10279f || c2353w1.f10288o.mo14334d(t).m171092s();
    }

    @Override // p149l.i3y0
    /* JADX INFO: renamed from: c */
    public final void mo14458c(T t, T t2) {
        m14435P(t);
        t2.getClass();
        for (int i = 0; i < this.f10274a.length; i += 3) {
            int iM14449E = m14449E(i);
            long j = 1048575 & iM14449E;
            int i2 = this.f10274a[i];
            switch ((iM14449E & 267386880) >>> 20) {
                case 0:
                    if (m14450H(t2, i)) {
                        e6y0.m115133f(t, j, e6y0.m115128a(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 1:
                    if (m14450H(t2, i)) {
                        e6y0.m115134g(t, j, e6y0.m115141n(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 2:
                    if (m14450H(t2, i)) {
                        e6y0.m115136i(t, j, e6y0.m115151x(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 3:
                    if (m14450H(t2, i)) {
                        e6y0.m115136i(t, j, e6y0.m115151x(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 4:
                    if (m14450H(t2, i)) {
                        e6y0.m115135h(t, j, e6y0.m115147t(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 5:
                    if (m14450H(t2, i)) {
                        e6y0.m115136i(t, j, e6y0.m115151x(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 6:
                    if (m14450H(t2, i)) {
                        e6y0.m115135h(t, j, e6y0.m115147t(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 7:
                    if (m14450H(t2, i)) {
                        e6y0.m115149v(t, j, e6y0.m115127F(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 8:
                    if (m14450H(t2, i)) {
                        e6y0.m115137j(t, j, e6y0.m115123B(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 9:
                    m14472u(t, t2, i);
                    break;
                case 10:
                    if (m14450H(t2, i)) {
                        e6y0.m115137j(t, j, e6y0.m115123B(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 11:
                    if (m14450H(t2, i)) {
                        e6y0.m115135h(t, j, e6y0.m115147t(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 12:
                    if (m14450H(t2, i)) {
                        e6y0.m115135h(t, j, e6y0.m115147t(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 13:
                    if (m14450H(t2, i)) {
                        e6y0.m115135h(t, j, e6y0.m115147t(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 14:
                    if (m14450H(t2, i)) {
                        e6y0.m115136i(t, j, e6y0.m115151x(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 15:
                    if (m14450H(t2, i)) {
                        e6y0.m115135h(t, j, e6y0.m115147t(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 16:
                    if (m14450H(t2, i)) {
                        e6y0.m115136i(t, j, e6y0.m115151x(t2, j));
                        m14446B(t, i);
                    }
                    break;
                case 17:
                    m14472u(t, t2, i);
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
                    this.f10286m.mo176932a(t, t2, j);
                    break;
                case 50:
                    p3y0.m167319n(this.f10289p, t, t2, j);
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
                    if (m14451I(t2, i2, i)) {
                        e6y0.m115137j(t, j, e6y0.m115123B(t2, j));
                        m14447C(t, i2, i);
                    }
                    break;
                case 60:
                    m14448D(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m14451I(t2, i2, i)) {
                        e6y0.m115137j(t, j, e6y0.m115123B(t2, j));
                        m14447C(t, i2, i);
                    }
                    break;
                case 68:
                    m14448D(t, t2, i);
                    break;
            }
        }
        p3y0.m167320o(this.f10287n, t, t2);
        if (this.f10279f) {
            p3y0.m167318m(this.f10288o, t, t2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x0763 A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:23:0x0057, B:189:0x075e, B:191:0x0763, B:192:0x0768, B:82:0x0134, B:83:0x0146, B:84:0x015e, B:85:0x0176, B:86:0x018e, B:87:0x01a6, B:89:0x01b6, B:92:0x01bd, B:93:0x01c3, B:94:0x01d1, B:95:0x01e9, B:96:0x01fd, B:97:0x0215, B:98:0x0223, B:99:0x023b, B:100:0x0253, B:101:0x026b, B:102:0x0283, B:103:0x029b, B:104:0x02b3, B:105:0x02cb, B:106:0x02e3, B:109:0x02fb, B:113:0x0318, B:110:0x0303, B:112:0x0309, B:114:0x0328, B:115:0x0340, B:116:0x0354, B:117:0x0368, B:118:0x037c, B:119:0x0390, B:128:0x03c3, B:129:0x03d1, B:130:0x03e5, B:131:0x03f9, B:132:0x040d, B:133:0x0421, B:134:0x0435, B:135:0x0449, B:136:0x045d, B:137:0x0471, B:138:0x0485, B:139:0x0499, B:140:0x04ad, B:141:0x04c1, B:146:0x04e8, B:147:0x04f6, B:148:0x050a, B:149:0x0522, B:153:0x0533, B:154:0x053c, B:155:0x0548, B:156:0x055c, B:157:0x0570, B:158:0x0584, B:159:0x0598, B:160:0x05ac, B:161:0x05c0, B:162:0x05d4, B:163:0x05e8, B:164:0x0600, B:165:0x0614, B:166:0x0627, B:167:0x063a, B:168:0x064d, B:170:0x065c, B:173:0x0663, B:175:0x066d, B:176:0x0676, B:177:0x0689, B:178:0x069c, B:179:0x06b3, B:180:0x06c0, B:181:0x06d3, B:182:0x06e6, B:183:0x06fa, B:184:0x070e, B:185:0x0722, B:186:0x0736, B:187:0x074a), top: B:216:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0776 A[LOOP:3: B:195:0x0772->B:197:0x0776, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x0789  */
    /* JADX WARN: Code duplicated, block: B:202:0x078d  */
    /* JADX WARN: Code duplicated, block: B:208:0x079b A[LOOP:2: B:206:0x0797->B:208:0x079b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:311:0x076f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [l.t2y0] */
    @Override // p149l.i3y0
    /* JADX INFO: renamed from: d */
    public final void mo14459d(T t, t2y0 t2y0Var, C2345s0 c2345s0) throws Throwable {
        T t2;
        int i;
        Object objM14468o;
        T t3;
        C2353w0<T> c2353w0;
        T t4;
        T t5;
        b6y0 b6y0Var;
        yqx0<?> yqx0Var;
        C2345s0 c2345s1;
        prx0 prx0Var;
        Object objM167312g;
        b6y0 b6y0Var2;
        b6y0 b6y0Var3;
        int i2;
        Object objM14468o2;
        T t6;
        C2353w0<T> c2353w1 = this;
        C2345s0 c2345s2 = c2345s0;
        c2345s2.getClass();
        m14435P(t);
        b6y0 b6y0Var4 = c2353w1.f10287n;
        yqx0<?> yqx0Var2 = c2353w1.f10288o;
        Object obj = null;
        Object objMo14538o = null;
        prx0 prx0VarMo14339i = null;
        while (true) {
            try {
                int iZzc = t2y0Var.zzc();
                int iM14462h = c2353w1.m14462h(iZzc);
                if (iM14462h < 0) {
                    if (iZzc == Integer.MAX_VALUE) {
                        int i3 = c2353w1.f10283j;
                        Object objM14468o3 = objMo14538o;
                        while (i3 < c2353w1.f10284k) {
                            objM14468o3 = c2353w1.m14468o(t, c2353w1.f10282i[i3], objM14468o3, b6y0Var4, t);
                            i3++;
                            c2353w1 = c2353w1;
                        }
                        if (objM14468o3 != null) {
                            b6y0Var4.mo14536m(t, objM14468o3);
                            return;
                        }
                        return;
                    }
                    c2353w0 = c2353w1;
                    t4 = t;
                    try {
                        Object objMo14332b = !c2353w0.f10279f ? obj : yqx0Var2.mo14332b(c2345s2, c2353w0.f10278e, iZzc);
                        if (objMo14332b != null) {
                            if (prx0VarMo14339i == null) {
                                try {
                                    prx0VarMo14339i = yqx0Var2.mo14339i(t4);
                                } catch (Throwable th) {
                                    th = th;
                                    t2 = t4;
                                }
                            }
                            prx0 prx0Var2 = prx0VarMo14339i;
                            b6y0 b6y0Var5 = b6y0Var4;
                            try {
                                objMo14538o = yqx0Var2.mo14333c(t4, t2y0Var, objMo14332b, c2345s2, prx0Var2, objMo14538o, b6y0Var5);
                                prx0Var = prx0Var2;
                                b6y0Var4 = b6y0Var5;
                                yqx0Var = yqx0Var2;
                                c2345s1 = c2345s2;
                                c2353w1 = c2353w0;
                                prx0VarMo14339i = prx0Var;
                                c2345s2 = c2345s1;
                                yqx0Var2 = yqx0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                t2 = t4;
                                b6y0Var4 = b6y0Var5;
                            }
                        } else {
                            yqx0Var = yqx0Var2;
                            t2 = t4;
                            c2345s1 = c2345s2;
                            try {
                                b6y0Var4.mo14533j(t2y0Var);
                                if (objMo14538o == null) {
                                    try {
                                        objMo14538o = b6y0Var4.mo14538o(t2);
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                if (!b6y0Var4.m100481i(objMo14538o, t2y0Var, 0)) {
                                    int i4 = c2353w0.f10283j;
                                    Object objM14468o4 = objMo14538o;
                                    while (i4 < c2353w0.f10284k) {
                                        C2353w0<T> c2353w2 = c2353w0;
                                        objM14468o4 = c2353w2.m14468o(t2, c2353w0.f10282i[i4], objM14468o4, b6y0Var4, t);
                                        i4++;
                                        b6y0Var4 = b6y0Var4;
                                        c2353w0 = c2353w2;
                                    }
                                    b6y0 b6y0Var6 = b6y0Var4;
                                    if (objM14468o4 != null) {
                                        b6y0Var6.mo14536m(t2, objM14468o4);
                                        return;
                                    }
                                    return;
                                }
                                c2353w1 = c2353w0;
                                b6y0Var4 = b6y0Var4;
                                prx0VarMo14339i = prx0VarMo14339i;
                                c2345s2 = c2345s1;
                                yqx0Var2 = yqx0Var;
                            } catch (Throwable th4) {
                                th = th4;
                                c2353w1 = c2353w0;
                                b6y0Var = b6y0Var4;
                                b6y0Var4 = b6y0Var;
                                i = c2353w1.f10283j;
                                objM14468o = objMo14538o;
                                while (i < c2353w1.f10284k) {
                                    objM14468o = c2353w1.m14468o(t2, c2353w1.f10282i[i], objM14468o, b6y0Var4, t);
                                    i++;
                                    c2353w1 = this;
                                }
                                t3 = t2;
                                if (objM14468o != null) {
                                    b6y0Var4.mo14536m(t3, objM14468o);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        b6y0 b6y0Var7 = b6y0Var4;
                        t5 = t4;
                        c2353w1 = c2353w0;
                        b6y0Var = b6y0Var7;
                        t2 = t5;
                        b6y0Var4 = b6y0Var;
                        i = c2353w1.f10283j;
                        objM14468o = objMo14538o;
                        while (i < c2353w1.f10284k) {
                            objM14468o = c2353w1.m14468o(t2, c2353w1.f10282i[i], objM14468o, b6y0Var4, t);
                            i++;
                            c2353w1 = this;
                        }
                        t3 = t2;
                        if (objM14468o != null) {
                            b6y0Var4.mo14536m(t3, objM14468o);
                        }
                        throw th;
                    }
                    c2353w1 = c2353w0;
                    i = c2353w1.f10283j;
                    objM14468o = objMo14538o;
                    while (i < c2353w1.f10284k) {
                        objM14468o = c2353w1.m14468o(t2, c2353w1.f10282i[i], objM14468o, b6y0Var4, t);
                        i++;
                        c2353w1 = this;
                    }
                    t3 = t2;
                    if (objM14468o != null) {
                        b6y0Var4.mo14536m(t3, objM14468o);
                    }
                    throw th;
                }
                yqx0Var = yqx0Var2;
                c2345s1 = c2345s2;
                b6y0Var = b6y0Var4;
                t5 = t;
                try {
                    int iM14449E = c2353w1.m14449E(iM14462h);
                    switch ((267386880 & iM14449E) >>> 20) {
                        case 0:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115133f(t5, iM14449E & 1048575, t2y0Var.zza());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 1:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115134g(t5, iM14449E & 1048575, t2y0Var.zzb());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 2:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115136i(t5, iM14449E & 1048575, t2y0Var.zzl());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 3:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115136i(t5, iM14449E & 1048575, t2y0Var.zzo());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 4:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115135h(t5, iM14449E & 1048575, t2y0Var.zzg());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 5:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115136i(t5, iM14449E & 1048575, t2y0Var.zzk());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 6:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115135h(t5, iM14449E & 1048575, t2y0Var.zzf());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 7:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115149v(t5, iM14449E & 1048575, t2y0Var.zzs());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 8:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            c2353w0.m14471t(t5, iM14449E, t2y0Var);
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 9:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            g0y0 g0y0Var = (g0y0) c2353w0.m14466m(t5, iM14462h);
                            t2y0Var.mo187076n(g0y0Var, c2353w0.m14454M(iM14462h), c2345s1);
                            c2353w0.m14470s(t5, iM14462h, g0y0Var);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 10:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, t2y0Var.zzp());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 11:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115135h(t5, iM14449E & 1048575, t2y0Var.zzj());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 12:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            int iZze = t2y0Var.zze();
                            ltx0 ltx0VarM14453L = c2353w0.m14453L(iM14462h);
                            if (ltx0VarM14453L == null || ltx0VarM14453L.zza(iZze)) {
                                e6y0.m115135h(t5, iM14449E & 1048575, iZze);
                                c2353w0.m14446B(t5, iM14462h);
                            } else {
                                objMo14538o = p3y0.m167311f(t5, iZzc, iZze, objMo14538o, b6y0Var4);
                            }
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 13:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115135h(t5, iM14449E & 1048575, t2y0Var.zzh());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 14:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115136i(t5, iM14449E & 1048575, t2y0Var.zzm());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 15:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115135h(t5, iM14449E & 1048575, t2y0Var.zzi());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 16:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115136i(t5, iM14449E & 1048575, t2y0Var.zzn());
                            c2353w0.m14446B(t5, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 17:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            g0y0 g0y0Var2 = (g0y0) c2353w0.m14466m(t5, iM14462h);
                            t2y0Var.mo187077o(g0y0Var2, c2353w0.m14454M(iM14462h), c2345s1);
                            c2353w0.m14470s(t5, iM14462h, g0y0Var2);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 18:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187078p(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 19:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187073l(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 20:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187063c(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 21:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187065e(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 22:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187072k(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 23:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187069h0(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 24:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187079q(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 25:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187083u(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 26:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            boolean zM14436Q = m14436Q(iM14449E);
                            uwx0 uwx0Var = c2353w0.f10286m;
                            if (zM14436Q) {
                                t2y0Var.mo187064d(uwx0Var.mo176933b(t5, iM14449E & 1048575));
                            } else {
                                t2y0Var.mo187070i(uwx0Var.mo176933b(t5, iM14449E & 1048575));
                            }
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 27:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187082t(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575), c2353w0.m14454M(iM14462h), c2345s1);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 28:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187075m0(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 29:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187062b(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 30:
                            c2353w0 = c2353w1;
                            List listMo176933b = c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575);
                            t2y0Var.mo187080r(listMo176933b);
                            objM167312g = p3y0.m167312g(t5, iZzc, listMo176933b, c2353w0.m14453L(iM14462h), objMo14538o, b6y0Var);
                            b6y0Var4 = b6y0Var;
                            objMo14538o = objM167312g;
                            prx0Var = prx0VarMo14339i;
                            c2353w1 = c2353w0;
                            prx0VarMo14339i = prx0Var;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            break;
                        case 31:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187074m(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 32:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187068h(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 33:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187066f(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 34:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187071j(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 35:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187078p(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 36:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187073l(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 37:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187063c(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 38:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187065e(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 39:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187072k(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 40:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187069h0(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 41:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187079q(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 42:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187083u(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 43:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187062b(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 44:
                            c2353w0 = c2353w1;
                            t4 = t5;
                            List listMo176933b2 = c2353w0.f10286m.mo176933b(t4, iM14449E & 1048575);
                            t2y0Var.mo187080r(listMo176933b2);
                            ltx0 ltx0VarM14453L2 = c2353w0.m14453L(iM14462h);
                            Object obj2 = objMo14538o;
                            try {
                                objM167312g = p3y0.m167312g(t4, iZzc, listMo176933b2, ltx0VarM14453L2, obj2, b6y0Var);
                                b6y0Var4 = b6y0Var;
                                objMo14538o = objM167312g;
                                prx0Var = prx0VarMo14339i;
                                c2353w1 = c2353w0;
                                prx0VarMo14339i = prx0Var;
                                c2345s2 = c2345s1;
                                yqx0Var2 = yqx0Var;
                            } catch (zzke unused) {
                                b6y0Var3 = b6y0Var;
                                objMo14538o = obj2;
                                b6y0Var4 = b6y0Var3;
                                b6y0Var4.mo14533j(t2y0Var);
                                if (objMo14538o == null) {
                                    objMo14538o = b6y0Var4.mo14538o(t4);
                                }
                                if (!b6y0Var4.m100481i(objMo14538o, t2y0Var, 0)) {
                                    i2 = c2353w0.f10283j;
                                    objM14468o2 = objMo14538o;
                                    while (i2 < c2353w0.f10284k) {
                                        T t7 = t4;
                                        objM14468o2 = c2353w0.m14468o(t7, c2353w0.f10282i[i2], objM14468o2, b6y0Var4, t);
                                        i2++;
                                        t4 = t7;
                                    }
                                    t6 = t4;
                                    if (objM14468o2 != null) {
                                        b6y0Var4.mo14536m(t6, objM14468o2);
                                        return;
                                    }
                                    return;
                                }
                                c2353w1 = c2353w0;
                                c2345s2 = c2345s1;
                                yqx0Var2 = yqx0Var;
                                obj = null;
                            } catch (Throwable th6) {
                                th = th6;
                                b6y0Var2 = b6y0Var;
                                objMo14538o = obj2;
                                b6y0Var4 = b6y0Var2;
                                t2 = t4;
                                c2353w1 = c2353w0;
                                i = c2353w1.f10283j;
                                objM14468o = objMo14538o;
                                while (i < c2353w1.f10284k) {
                                    objM14468o = c2353w1.m14468o(t2, c2353w1.f10282i[i], objM14468o, b6y0Var4, t);
                                    i++;
                                    c2353w1 = this;
                                }
                                t3 = t2;
                                if (objM14468o != null) {
                                    b6y0Var4.mo14536m(t3, objM14468o);
                                }
                                throw th;
                            }
                            break;
                        case 45:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187074m(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 46:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187068h(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 47:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187066f(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 48:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187071j(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575));
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 49:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            t2y0Var.mo187081s(c2353w0.f10286m.mo176933b(t5, iM14449E & 1048575), c2353w0.m14454M(iM14462h), c2345s1);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 50:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            Object objM14455O = c2353w0.m14455O(iM14462h);
                            long jM14449E = c2353w0.m14449E(iM14462h) & 1048575;
                            Object objM115123B = e6y0.m115123B(t5, jM14449E);
                            kyx0 kyx0Var = c2353w0.f10289p;
                            if (objM115123B == null) {
                                objM115123B = kyx0Var.zzb(objM14455O);
                                e6y0.m115137j(t5, jM14449E, objM115123B);
                            } else if (kyx0Var.mo147907a(objM115123B)) {
                                Object objZzb = c2353w0.f10289p.zzb(objM14455O);
                                c2353w0.f10289p.mo147909c(objZzb, objM115123B);
                                e6y0.m115137j(t5, jM14449E, objZzb);
                                objM115123B = objZzb;
                            }
                            Map<?, ?> mapMo147908b = c2353w0.f10289p.mo147908b(objM115123B);
                            c2353w0.f10289p.zza(objM14455O);
                            t2y0Var.mo187067g(mapMo147908b, obj, c2345s1);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 51:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Double.valueOf(t2y0Var.zza()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 52:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Float.valueOf(t2y0Var.zzb()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 53:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Long.valueOf(t2y0Var.zzl()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 54:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Long.valueOf(t2y0Var.zzo()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 55:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Integer.valueOf(t2y0Var.zzg()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 56:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Long.valueOf(t2y0Var.zzk()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 57:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Integer.valueOf(t2y0Var.zzf()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 58:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Boolean.valueOf(t2y0Var.zzs()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 59:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            c2353w0.m14471t(t5, iM14449E, t2y0Var);
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 60:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            g0y0 g0y0Var3 = (g0y0) c2353w0.m14467n(t5, iZzc, iM14462h);
                            t2y0Var.mo187076n(g0y0Var3, c2353w0.m14454M(iM14462h), c2345s1);
                            c2353w0.m14469r(t5, iZzc, iM14462h, g0y0Var3);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 61:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, t2y0Var.zzp());
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 62:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Integer.valueOf(t2y0Var.zzj()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 63:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            int iZze2 = t2y0Var.zze();
                            ltx0 ltx0VarM14453L3 = c2353w0.m14453L(iM14462h);
                            if (ltx0VarM14453L3 != null && !ltx0VarM14453L3.zza(iZze2)) {
                                objMo14538o = p3y0.m167311f(t5, iZzc, iZze2, objMo14538o, b6y0Var4);
                                prx0Var = prx0VarMo14339i;
                                c2353w1 = c2353w0;
                                prx0VarMo14339i = prx0Var;
                                c2345s2 = c2345s1;
                                yqx0Var2 = yqx0Var;
                            }
                            e6y0.m115137j(t5, iM14449E & 1048575, Integer.valueOf(iZze2));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 64:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Integer.valueOf(t2y0Var.zzh()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 65:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Long.valueOf(t2y0Var.zzm()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 66:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Integer.valueOf(t2y0Var.zzi()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 67:
                            c2353w0 = c2353w1;
                            b6y0Var4 = b6y0Var;
                            e6y0.m115137j(t5, iM14449E & 1048575, Long.valueOf(t2y0Var.zzn()));
                            c2353w0.m14447C(t5, iZzc, iM14462h);
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        case 68:
                            c2353w0 = c2353w1;
                            t4 = t5;
                            b6y0Var4 = b6y0Var;
                            try {
                                g0y0 g0y0Var4 = (g0y0) c2353w0.m14467n(t4, iZzc, iM14462h);
                                t2y0Var.mo187077o(g0y0Var4, c2353w0.m14454M(iM14462h), c2345s1);
                                c2353w0.m14469r(t4, iZzc, iM14462h, g0y0Var4);
                            } catch (zzke unused2) {
                                b6y0Var4.mo14533j(t2y0Var);
                                if (objMo14538o == null) {
                                    objMo14538o = b6y0Var4.mo14538o(t4);
                                }
                                if (!b6y0Var4.m100481i(objMo14538o, t2y0Var, 0)) {
                                    i2 = c2353w0.f10283j;
                                    objM14468o2 = objMo14538o;
                                    while (i2 < c2353w0.f10284k) {
                                        T t8 = t4;
                                        objM14468o2 = c2353w0.m14468o(t8, c2353w0.f10282i[i2], objM14468o2, b6y0Var4, t);
                                        i2++;
                                        t4 = t8;
                                    }
                                    t6 = t4;
                                    if (objM14468o2 != null) {
                                        b6y0Var4.mo14536m(t6, objM14468o2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            c2353w1 = c2353w0;
                            c2345s2 = c2345s1;
                            yqx0Var2 = yqx0Var;
                            obj = null;
                            break;
                        default:
                            if (objMo14538o == null) {
                                try {
                                    objMo14538o = b6y0Var.mo14538o(t5);
                                } catch (zzke unused3) {
                                    b6y0Var3 = b6y0Var;
                                    c2353w0 = c2353w1;
                                    t4 = t5;
                                    b6y0Var4 = b6y0Var3;
                                    b6y0Var4.mo14533j(t2y0Var);
                                    if (objMo14538o == null) {
                                        objMo14538o = b6y0Var4.mo14538o(t4);
                                    }
                                    if (!b6y0Var4.m100481i(objMo14538o, t2y0Var, 0)) {
                                        i2 = c2353w0.f10283j;
                                        objM14468o2 = objMo14538o;
                                        while (i2 < c2353w0.f10284k) {
                                            T t9 = t4;
                                            objM14468o2 = c2353w0.m14468o(t9, c2353w0.f10282i[i2], objM14468o2, b6y0Var4, t);
                                            i2++;
                                            t4 = t9;
                                        }
                                        t6 = t4;
                                        if (objM14468o2 != null) {
                                            b6y0Var4.mo14536m(t6, objM14468o2);
                                            return;
                                        }
                                        return;
                                    }
                                    c2353w1 = c2353w0;
                                    c2345s2 = c2345s1;
                                    yqx0Var2 = yqx0Var;
                                    obj = null;
                                }
                            }
                            try {
                                if (!b6y0Var.m100481i(objMo14538o, t2y0Var, 0)) {
                                    int i5 = c2353w1.f10283j;
                                    Object objM14468o5 = objMo14538o;
                                    while (i5 < c2353w1.f10284k) {
                                        T t10 = t5;
                                        b6y0 b6y0Var8 = b6y0Var;
                                        objM14468o5 = c2353w1.m14468o(t10, c2353w1.f10282i[i5], objM14468o5, b6y0Var8, t);
                                        i5++;
                                        t5 = t10;
                                        c2353w1 = c2353w1;
                                        b6y0Var = b6y0Var8;
                                    }
                                    T t11 = t5;
                                    b6y0 b6y0Var9 = b6y0Var;
                                    if (objM14468o5 != null) {
                                        b6y0Var9.mo14536m(t11, objM14468o5);
                                        return;
                                    }
                                    return;
                                }
                                c2353w0 = c2353w1;
                                b6y0Var4 = b6y0Var;
                                prx0Var = prx0VarMo14339i;
                                c2353w1 = c2353w0;
                                prx0VarMo14339i = prx0Var;
                                c2345s2 = c2345s1;
                                yqx0Var2 = yqx0Var;
                            } catch (Throwable th7) {
                                th = th7;
                                b6y0Var2 = b6y0Var;
                                c2353w0 = c2353w1;
                                t4 = t5;
                                b6y0Var4 = b6y0Var2;
                                t2 = t4;
                                c2353w1 = c2353w0;
                                i = c2353w1.f10283j;
                                objM14468o = objMo14538o;
                                while (i < c2353w1.f10284k) {
                                    objM14468o = c2353w1.m14468o(t2, c2353w1.f10282i[i], objM14468o, b6y0Var4, t);
                                    i++;
                                    c2353w1 = this;
                                }
                                t3 = t2;
                                if (objM14468o != null) {
                                    b6y0Var4.mo14536m(t3, objM14468o);
                                }
                                throw th;
                            }
                            break;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    t2 = t5;
                    b6y0Var4 = b6y0Var;
                    i = c2353w1.f10283j;
                    objM14468o = objMo14538o;
                    while (i < c2353w1.f10284k) {
                        objM14468o = c2353w1.m14468o(t2, c2353w1.f10282i[i], objM14468o, b6y0Var4, t);
                        i++;
                        c2353w1 = this;
                    }
                    t3 = t2;
                    if (objM14468o != null) {
                        b6y0Var4.mo14536m(t3, objM14468o);
                    }
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                t2 = t;
            }
        }
    }

    @Override // p149l.i3y0
    /* JADX INFO: renamed from: e */
    public final void mo14460e(T t, byte[] bArr, int i, int i2, hmx0 hmx0Var) throws IOException {
        m14464j(t, bArr, i, i2, 0, hmx0Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // p149l.i3y0
    /* JADX INFO: renamed from: f */
    public final boolean mo14461f(T t, T t2) {
        int length = this.f10274a.length;
        int i = 0;
        while (true) {
            boolean zM167321p = true;
            if (i >= length) {
                if (!this.f10287n.mo14540q(t).equals(this.f10287n.mo14540q(t2))) {
                    return false;
                }
                if (this.f10279f) {
                    return this.f10288o.mo14334d(t).equals(this.f10288o.mo14334d(t2));
                }
                return true;
            }
            int iM14449E = m14449E(i);
            long j = iM14449E & 1048575;
            switch ((iM14449E & 267386880) >>> 20) {
                case 0:
                    if (!m14452J(t, t2, i) || Double.doubleToLongBits(e6y0.m115128a(t, j)) != Double.doubleToLongBits(e6y0.m115128a(t2, j))) {
                        zM167321p = false;
                    }
                    break;
                case 1:
                    if (!m14452J(t, t2, i) || Float.floatToIntBits(e6y0.m115141n(t, j)) != Float.floatToIntBits(e6y0.m115141n(t2, j))) {
                        zM167321p = false;
                    }
                    break;
                case 2:
                    if (!m14452J(t, t2, i) || e6y0.m115151x(t, j) != e6y0.m115151x(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 3:
                    if (!m14452J(t, t2, i) || e6y0.m115151x(t, j) != e6y0.m115151x(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 4:
                    if (!m14452J(t, t2, i) || e6y0.m115147t(t, j) != e6y0.m115147t(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 5:
                    if (!m14452J(t, t2, i) || e6y0.m115151x(t, j) != e6y0.m115151x(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 6:
                    if (!m14452J(t, t2, i) || e6y0.m115147t(t, j) != e6y0.m115147t(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 7:
                    if (!m14452J(t, t2, i) || e6y0.m115127F(t, j) != e6y0.m115127F(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 8:
                    if (!m14452J(t, t2, i) || !p3y0.m167321p(e6y0.m115123B(t, j), e6y0.m115123B(t2, j))) {
                        zM167321p = false;
                    }
                    break;
                case 9:
                    if (!m14452J(t, t2, i) || !p3y0.m167321p(e6y0.m115123B(t, j), e6y0.m115123B(t2, j))) {
                        zM167321p = false;
                    }
                    break;
                case 10:
                    if (!m14452J(t, t2, i) || !p3y0.m167321p(e6y0.m115123B(t, j), e6y0.m115123B(t2, j))) {
                        zM167321p = false;
                    }
                    break;
                case 11:
                    if (!m14452J(t, t2, i) || e6y0.m115147t(t, j) != e6y0.m115147t(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 12:
                    if (!m14452J(t, t2, i) || e6y0.m115147t(t, j) != e6y0.m115147t(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 13:
                    if (!m14452J(t, t2, i) || e6y0.m115147t(t, j) != e6y0.m115147t(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 14:
                    if (!m14452J(t, t2, i) || e6y0.m115151x(t, j) != e6y0.m115151x(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 15:
                    if (!m14452J(t, t2, i) || e6y0.m115147t(t, j) != e6y0.m115147t(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 16:
                    if (!m14452J(t, t2, i) || e6y0.m115151x(t, j) != e6y0.m115151x(t2, j)) {
                        zM167321p = false;
                    }
                    break;
                case 17:
                    if (!m14452J(t, t2, i) || !p3y0.m167321p(e6y0.m115123B(t, j), e6y0.m115123B(t2, j))) {
                        zM167321p = false;
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
                    zM167321p = p3y0.m167321p(e6y0.m115123B(t, j), e6y0.m115123B(t2, j));
                    break;
                case 50:
                    zM167321p = p3y0.m167321p(e6y0.m115123B(t, j), e6y0.m115123B(t2, j));
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
                    long jM14445A = m14445A(i) & 1048575;
                    if (e6y0.m115147t(t, jM14445A) != e6y0.m115147t(t2, jM14445A) || !p3y0.m167321p(e6y0.m115123B(t, j), e6y0.m115123B(t2, j))) {
                        zM167321p = false;
                    }
                    break;
            }
            if (!zM167321p) {
                return false;
            }
            i += 3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m14462h(int i) {
        if (i < this.f10276c || i > this.f10277d) {
            return -1;
        }
        return m14463i(i, 0);
    }

    /* JADX INFO: renamed from: i */
    public final int m14463i(int i, int i2) {
        int length = (this.f10274a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f10274a[i4];
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35821. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: j */
    public final int m14464j(T r32, byte[] r33, int r34, int r35, int r36, p149l.hmx0 r37) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2353w0.m14464j(java.lang.Object, byte[], int, int, int, l.hmx0):int");
    }

    /* JADX INFO: renamed from: l */
    public final <K, V, UT, UB> UB m14465l(int i, int i2, Map<K, V> map, ltx0 ltx0Var, UB ub, b6y0<UT, UB> b6y0Var, Object obj) {
        this.f10289p.zza(m14455O(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!ltx0Var.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = b6y0Var.mo14538o(obj);
                }
                C2341q0 c2341q0Zzc = zzik.zzc(gyx0.m128787a(null, next.getKey(), next.getValue()));
                try {
                    gyx0.m128788b(c2341q0Zzc.m14277b(), null, next.getKey(), next.getValue());
                    b6y0Var.mo14530f(ub, i2, c2341q0Zzc.m14276a());
                    it.remove();
                } catch (IOException e) {
                    aag0.m95543a(e);
                    return null;
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final Object m14466m(T t, int i) {
        i3y0 i3y0VarM14454M = m14454M(i);
        long jM14449E = m14449E(i) & 1048575;
        if (!m14450H(t, i)) {
            return i3y0VarM14454M.zza();
        }
        Object object = f10273r.getObject(t, jM14449E);
        if (m14437R(object)) {
            return object;
        }
        Object objZza = i3y0VarM14454M.zza();
        if (object != null) {
            i3y0VarM14454M.mo14458c(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final Object m14467n(T t, int i, int i2) {
        i3y0 i3y0VarM14454M = m14454M(i2);
        if (!m14451I(t, i, i2)) {
            return i3y0VarM14454M.zza();
        }
        Object object = f10273r.getObject(t, m14449E(i2) & 1048575);
        if (m14437R(object)) {
            return object;
        }
        Object objZza = i3y0VarM14454M.zza();
        if (object != null) {
            i3y0VarM14454M.mo14458c(objZza, object);
        }
        return objZza;
    }

    /* JADX INFO: renamed from: o */
    public final <UT, UB> UB m14468o(Object obj, int i, UB ub, b6y0<UT, UB> b6y0Var, Object obj2) {
        ltx0 ltx0VarM14453L;
        int i2 = this.f10274a[i];
        Object objM115123B = e6y0.m115123B(obj, m14449E(i) & 1048575);
        return (objM115123B == null || (ltx0VarM14453L = m14453L(i)) == null) ? ub : (UB) m14465l(i, i2, this.f10289p.mo147908b(objM115123B), ltx0VarM14453L, ub, b6y0Var, obj2);
    }

    /* JADX INFO: renamed from: r */
    public final void m14469r(T t, int i, int i2, Object obj) {
        f10273r.putObject(t, m14449E(i2) & 1048575, obj);
        m14447C(t, i, i2);
    }

    /* JADX INFO: renamed from: s */
    public final void m14470s(T t, int i, Object obj) {
        f10273r.putObject(t, m14449E(i) & 1048575, obj);
        m14446B(t, i);
    }

    /* JADX INFO: renamed from: t */
    public final void m14471t(Object obj, int i, t2y0 t2y0Var) throws IOException {
        if (m14436Q(i)) {
            e6y0.m115137j(obj, i & 1048575, t2y0Var.zzr());
        } else if (this.f10280g) {
            e6y0.m115137j(obj, i & 1048575, t2y0Var.mo187061a());
        } else {
            e6y0.m115137j(obj, i & 1048575, t2y0Var.zzp());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final void m14472u(T t, T t2, int i) {
        if (m14450H(t2, i)) {
            long jM14449E = m14449E(i) & 1048575;
            Unsafe unsafe = f10273r;
            Object object = unsafe.getObject(t2, jM14449E);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f10274a[i] + " is present but null: " + String.valueOf(t2));
            }
            i3y0 i3y0VarM14454M = m14454M(i);
            if (!m14450H(t, i)) {
                if (m14437R(object)) {
                    Object objZza = i3y0VarM14454M.zza();
                    i3y0VarM14454M.mo14458c(objZza, object);
                    unsafe.putObject(t, jM14449E, objZza);
                } else {
                    unsafe.putObject(t, jM14449E, object);
                }
                m14446B(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jM14449E);
            if (!m14437R(object2)) {
                Object objZza2 = i3y0VarM14454M.zza();
                i3y0VarM14454M.mo14458c(objZza2, object2);
                unsafe.putObject(t, jM14449E, objZza2);
                object2 = objZza2;
            }
            i3y0VarM14454M.mo14458c(object2, object);
        }
    }

    /* JADX INFO: renamed from: w */
    public final <K, V> void m14473w(m8y0 m8y0Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f10289p.zza(m14455O(i2));
            m8y0Var.mo153537M(i, null, this.f10289p.zzd(obj));
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m14474x(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m14450H(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:201:0x04d7 A[PHI: r0 r1
      0x04d7: PHI (r0v6 com.google.android.gms.internal.measurement.w0<T>) = 
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v28 com.google.android.gms.internal.measurement.w0<T>)
      (r0v34 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
      (r0v1 com.google.android.gms.internal.measurement.w0<T>)
     binds: [B:18:0x0053, B:199:0x04cd, B:169:0x0431, B:155:0x03e8, B:147:0x03c1, B:141:0x039a, B:121:0x02b9, B:118:0x02a3, B:115:0x028d, B:112:0x0277, B:109:0x0261, B:106:0x024b, B:103:0x0235, B:100:0x021f, B:97:0x020a, B:94:0x01f5, B:91:0x01e0, B:88:0x01cb, B:85:0x01b6, B:81:0x019c, B:76:0x0168, B:73:0x015c, B:70:0x014c, B:67:0x013c, B:64:0x012c, B:61:0x0120, B:58:0x0114, B:55:0x0108, B:49:0x00ea, B:46:0x00d7, B:43:0x00c6, B:40:0x00b7, B:37:0x00a8, B:34:0x009d, B:31:0x0092, B:28:0x0083, B:25:0x0074, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x04d7: PHI (r1v9 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v10 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:18:0x0053, B:199:0x04cd, B:169:0x0431, B:155:0x03e8, B:147:0x03c1, B:141:0x039a, B:121:0x02b9, B:118:0x02a3, B:115:0x028d, B:112:0x0277, B:109:0x0261, B:106:0x024b, B:103:0x0235, B:100:0x021f, B:97:0x020a, B:94:0x01f5, B:91:0x01e0, B:88:0x01cb, B:85:0x01b6, B:81:0x019c, B:76:0x0168, B:73:0x015c, B:70:0x014c, B:67:0x013c, B:64:0x012c, B:61:0x0120, B:58:0x0114, B:55:0x0108, B:49:0x00ea, B:46:0x00d7, B:43:0x00c6, B:40:0x00b7, B:37:0x00a8, B:34:0x009d, B:31:0x0092, B:28:0x0083, B:25:0x0074, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p149l.i3y0
    public final int zza(T t) {
        int i;
        int iM14652e;
        int iM14654f;
        int iM14649c0;
        int iM167282B;
        int iM14674w0;
        int iM14678z0;
        C2353w0<T> c2353w0 = this;
        T t2 = t;
        Unsafe unsafe = f10273r;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i4 < c2353w0.f10274a.length) {
            int iM14449E = c2353w0.m14449E(i4);
            int i8 = (267386880 & iM14449E) >>> 20;
            int[] iArr = c2353w0.f10274a;
            int i9 = iArr[i4];
            int i10 = iArr[i4 + 2];
            int i11 = i10 & i3;
            if (i8 <= 17) {
                if (i11 != i7) {
                    i5 = i11 == i3 ? 0 : unsafe.getInt(t2, i11);
                    i7 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iM14449E & i3;
            if (i8 >= zzjn.zza.zza()) {
                zzjn.zzb.zza();
            }
            int i12 = i6;
            switch (i8) {
                case 0:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14652e = zzjc.m14652e(i9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 1:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14654f = zzjc.m14654f(i9, 0.0f);
                        i6 = i12 + iM14654f;
                        c2353w0 = this;
                        t2 = t;
                    }
                    c2353w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 2:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14649c0 = zzjc.m14649c0(i9, unsafe.getLong(t2, j));
                        i6 = i12 + iM14649c0;
                        c2353w0 = this;
                    }
                    c2353w0 = this;
                    i6 = i12;
                    break;
                case 3:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14649c0 = zzjc.m14670q0(i9, unsafe.getLong(t2, j));
                        i6 = i12 + iM14649c0;
                        c2353w0 = this;
                    }
                    c2353w0 = this;
                    i6 = i12;
                    break;
                case 4:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14649c0 = zzjc.m14669p0(i9, unsafe.getInt(t2, j));
                        i6 = i12 + iM14649c0;
                        c2353w0 = this;
                    }
                    c2353w0 = this;
                    i6 = i12;
                    break;
                case 5:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14654f = zzjc.m14641T(i9, 0L);
                        i6 = i12 + iM14654f;
                        c2353w0 = this;
                        t2 = t;
                    }
                    c2353w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 6:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14654f = zzjc.m14665l0(i9, 0);
                        i6 = i12 + iM14654f;
                        c2353w0 = this;
                        t2 = t;
                    }
                    c2353w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 7:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14654f = zzjc.m14635D(i9, true);
                        i6 = i12 + iM14654f;
                        c2353w0 = this;
                        t2 = t;
                    }
                    c2353w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 8:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        Object object = unsafe.getObject(t2, j);
                        iM14649c0 = object instanceof zzik ? zzjc.m14642U(i9, (zzik) object) : zzjc.m14677z(i9, (String) object);
                        i6 = i12 + iM14649c0;
                        c2353w0 = this;
                    }
                    c2353w0 = this;
                    i6 = i12;
                    break;
                case 9:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14652e = p3y0.m167306a(i9, unsafe.getObject(t2, j), c2353w0.m14454M(i4));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 10:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14649c0 = zzjc.m14642U(i9, (zzik) unsafe.getObject(t2, j));
                        i6 = i12 + iM14649c0;
                        c2353w0 = this;
                    }
                    c2353w0 = this;
                    i6 = i12;
                    break;
                case 11:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14649c0 = zzjc.m14632A0(i9, unsafe.getInt(t2, j));
                        i6 = i12 + iM14649c0;
                        c2353w0 = this;
                    }
                    c2353w0 = this;
                    i6 = i12;
                    break;
                case 12:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14649c0 = zzjc.m14658h0(i9, unsafe.getInt(t2, j));
                        i6 = i12 + iM14649c0;
                        c2353w0 = this;
                    }
                    c2353w0 = this;
                    i6 = i12;
                    break;
                case 13:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14654f = zzjc.m14673t0(i9, 0);
                        i6 = i12 + iM14654f;
                        c2353w0 = this;
                        t2 = t;
                    }
                    c2353w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 14:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14654f = zzjc.m14660i0(i9, 0L);
                        i6 = i12 + iM14654f;
                        c2353w0 = this;
                        t2 = t;
                    }
                    c2353w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 15:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14649c0 = zzjc.m14675x0(i9, unsafe.getInt(t2, j));
                        i6 = i12 + iM14649c0;
                        c2353w0 = this;
                    }
                    c2353w0 = this;
                    i6 = i12;
                    break;
                case 16:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14649c0 = zzjc.m14666m0(i9, unsafe.getLong(t2, j));
                        i6 = i12 + iM14649c0;
                        c2353w0 = this;
                    }
                    c2353w0 = this;
                    i6 = i12;
                    break;
                case 17:
                    if (c2353w0.m14474x(t2, i4, i7, i5, i)) {
                        iM14652e = zzjc.m14634C(i9, (g0y0) unsafe.getObject(t2, j), c2353w0.m14454M(i4));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 18:
                    iM14652e = p3y0.m167281A(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 19:
                    iM14652e = p3y0.m167329x(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 20:
                    iM14652e = p3y0.m167287G(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 21:
                    iM14652e = p3y0.m167299S(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 22:
                    iM14652e = p3y0.m167284D(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 23:
                    iM14652e = p3y0.m167281A(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 24:
                    iM14652e = p3y0.m167329x(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 25:
                    iM14652e = p3y0.m167309d(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 26:
                    iM14652e = p3y0.m167322q(i9, (List) unsafe.getObject(t2, j));
                    i6 = i12 + iM14652e;
                    break;
                case 27:
                    iM14652e = p3y0.m167323r(i9, (List) unsafe.getObject(t2, j), c2353w0.m14454M(i4));
                    i6 = i12 + iM14652e;
                    break;
                case 28:
                    iM14652e = p3y0.m167307b(i9, (List) unsafe.getObject(t2, j));
                    i6 = i12 + iM14652e;
                    break;
                case 29:
                    iM14652e = p3y0.m167296P(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 30:
                    iM14652e = p3y0.m167324s(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 31:
                    iM14652e = p3y0.m167329x(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 32:
                    iM14652e = p3y0.m167281A(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 33:
                    iM14652e = p3y0.m167290J(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 34:
                    iM14652e = p3y0.m167293M(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14652e;
                    break;
                case 35:
                    iM167282B = p3y0.m167282B((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 36:
                    iM167282B = p3y0.m167330y((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 37:
                    iM167282B = p3y0.m167288H((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 38:
                    iM167282B = p3y0.m167300T((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 39:
                    iM167282B = p3y0.m167285E((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 40:
                    iM167282B = p3y0.m167282B((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 41:
                    iM167282B = p3y0.m167330y((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 42:
                    iM167282B = p3y0.m167310e((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 43:
                    iM167282B = p3y0.m167297Q((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 44:
                    iM167282B = p3y0.m167325t((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 45:
                    iM167282B = p3y0.m167330y((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 46:
                    iM167282B = p3y0.m167282B((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 47:
                    iM167282B = p3y0.m167291K((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 48:
                    iM167282B = p3y0.m167294N((List) unsafe.getObject(t2, j));
                    if (iM167282B > 0) {
                        iM14674w0 = zzjc.m14674w0(i9);
                        iM14678z0 = zzjc.m14678z0(iM167282B);
                        i6 = i12 + iM14674w0 + iM14678z0 + iM167282B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 49:
                    iM14652e = p3y0.m167308c(i9, (List) unsafe.getObject(t2, j), c2353w0.m14454M(i4));
                    i6 = i12 + iM14652e;
                    break;
                case 50:
                    iM14652e = c2353w0.f10289p.mo147911e(i9, unsafe.getObject(t2, j), c2353w0.m14455O(i4));
                    i6 = i12 + iM14652e;
                    break;
                case 51:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14652e(i9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 52:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14654f(i9, 0.0f);
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 53:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14649c0(i9, m14433K(t2, j));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 54:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14670q0(i9, m14433K(t2, j));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 55:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14669p0(i9, m14431F(t2, j));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 56:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14641T(i9, 0L);
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 57:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14665l0(i9, 0);
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 58:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14635D(i9, true);
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 59:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        Object object2 = unsafe.getObject(t2, j);
                        iM14652e = object2 instanceof zzik ? zzjc.m14642U(i9, (zzik) object2) : zzjc.m14677z(i9, (String) object2);
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 60:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = p3y0.m167306a(i9, unsafe.getObject(t2, j), c2353w0.m14454M(i4));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 61:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14642U(i9, (zzik) unsafe.getObject(t2, j));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 62:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14632A0(i9, m14431F(t2, j));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 63:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14658h0(i9, m14431F(t2, j));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 64:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14673t0(i9, 0);
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 65:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14660i0(i9, 0L);
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 66:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14675x0(i9, m14431F(t2, j));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 67:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14666m0(i9, m14433K(t2, j));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 68:
                    if (c2353w0.m14451I(t2, i9, i4)) {
                        iM14652e = zzjc.m14634C(i9, (g0y0) unsafe.getObject(t2, j), c2353w0.m14454M(i4));
                        i6 = i12 + iM14652e;
                    } else {
                        i6 = i12;
                    }
                    break;
                default:
                    i6 = i12;
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        b6y0<?, ?> b6y0Var = c2353w0.f10287n;
        int iMo14525a = i6 + b6y0Var.mo14525a(b6y0Var.mo14540q(t2));
        if (!c2353w0.f10279f) {
            return iMo14525a;
        }
        prx0<T> prx0VarMo14334d = c2353w0.f10288o.mo14334d(t2);
        int iM152969a = prx0VarMo14334d.f150958a.m152969a();
        int iM171077e = 0;
        while (true) {
            m3y0<T, Object> m3y0Var = prx0VarMo14334d.f150958a;
            if (i2 >= iM152969a) {
                for (Map.Entry entry : m3y0Var.m152973g()) {
                    iM171077e += prx0.m171077e((yrx0) entry.getKey(), entry.getValue());
                }
                return iMo14525a + iM171077e;
            }
            Map.Entry entryM152972f = m3y0Var.m152972f(i2);
            iM171077e += prx0.m171077e((yrx0) entryM152972f.getKey(), entryM152972f.getValue());
            i2++;
        }
    }

    @Override // p149l.i3y0
    public final int zzb(T t) {
        int i;
        int iM108704b;
        int length = this.f10274a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iM14449E = m14449E(i3);
            int i4 = this.f10274a[i3];
            long j = 1048575 & iM14449E;
            int iHashCode = 37;
            switch ((iM14449E & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iM108704b = ctx0.m108704b(Double.doubleToLongBits(e6y0.m115128a(t, j)));
                    i2 = i + iM108704b;
                    break;
                case 1:
                    i = i2 * 53;
                    iM108704b = Float.floatToIntBits(e6y0.m115141n(t, j));
                    i2 = i + iM108704b;
                    break;
                case 2:
                    i = i2 * 53;
                    iM108704b = ctx0.m108704b(e6y0.m115151x(t, j));
                    i2 = i + iM108704b;
                    break;
                case 3:
                    i = i2 * 53;
                    iM108704b = ctx0.m108704b(e6y0.m115151x(t, j));
                    i2 = i + iM108704b;
                    break;
                case 4:
                    i = i2 * 53;
                    iM108704b = e6y0.m115147t(t, j);
                    i2 = i + iM108704b;
                    break;
                case 5:
                    i = i2 * 53;
                    iM108704b = ctx0.m108704b(e6y0.m115151x(t, j));
                    i2 = i + iM108704b;
                    break;
                case 6:
                    i = i2 * 53;
                    iM108704b = e6y0.m115147t(t, j);
                    i2 = i + iM108704b;
                    break;
                case 7:
                    i = i2 * 53;
                    iM108704b = ctx0.m108705c(e6y0.m115127F(t, j));
                    i2 = i + iM108704b;
                    break;
                case 8:
                    i = i2 * 53;
                    iM108704b = ((String) e6y0.m115123B(t, j)).hashCode();
                    i2 = i + iM108704b;
                    break;
                case 9:
                    Object objM115123B = e6y0.m115123B(t, j);
                    if (objM115123B != null) {
                        iHashCode = objM115123B.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iM108704b = e6y0.m115123B(t, j).hashCode();
                    i2 = i + iM108704b;
                    break;
                case 11:
                    i = i2 * 53;
                    iM108704b = e6y0.m115147t(t, j);
                    i2 = i + iM108704b;
                    break;
                case 12:
                    i = i2 * 53;
                    iM108704b = e6y0.m115147t(t, j);
                    i2 = i + iM108704b;
                    break;
                case 13:
                    i = i2 * 53;
                    iM108704b = e6y0.m115147t(t, j);
                    i2 = i + iM108704b;
                    break;
                case 14:
                    i = i2 * 53;
                    iM108704b = ctx0.m108704b(e6y0.m115151x(t, j));
                    i2 = i + iM108704b;
                    break;
                case 15:
                    i = i2 * 53;
                    iM108704b = e6y0.m115147t(t, j);
                    i2 = i + iM108704b;
                    break;
                case 16:
                    i = i2 * 53;
                    iM108704b = ctx0.m108704b(e6y0.m115151x(t, j));
                    i2 = i + iM108704b;
                    break;
                case 17:
                    Object objM115123B2 = e6y0.m115123B(t, j);
                    if (objM115123B2 != null) {
                        iHashCode = objM115123B2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iM108704b = e6y0.m115123B(t, j).hashCode();
                    i2 = i + iM108704b;
                    break;
                case 50:
                    i = i2 * 53;
                    iM108704b = e6y0.m115123B(t, j).hashCode();
                    i2 = i + iM108704b;
                    break;
                case 51:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = ctx0.m108704b(Double.doubleToLongBits(m14438g(t, j)));
                        i2 = i + iM108704b;
                    }
                    break;
                case 52:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = Float.floatToIntBits(m14444z(t, j));
                        i2 = i + iM108704b;
                    }
                    break;
                case 53:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = ctx0.m108704b(m14433K(t, j));
                        i2 = i + iM108704b;
                    }
                    break;
                case 54:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = ctx0.m108704b(m14433K(t, j));
                        i2 = i + iM108704b;
                    }
                    break;
                case 55:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = m14431F(t, j);
                        i2 = i + iM108704b;
                    }
                    break;
                case 56:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = ctx0.m108704b(m14433K(t, j));
                        i2 = i + iM108704b;
                    }
                    break;
                case 57:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = m14431F(t, j);
                        i2 = i + iM108704b;
                    }
                    break;
                case 58:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = ctx0.m108705c(m14434N(t, j));
                        i2 = i + iM108704b;
                    }
                    break;
                case 59:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = ((String) e6y0.m115123B(t, j)).hashCode();
                        i2 = i + iM108704b;
                    }
                    break;
                case 60:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = e6y0.m115123B(t, j).hashCode();
                        i2 = i + iM108704b;
                    }
                    break;
                case 61:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = e6y0.m115123B(t, j).hashCode();
                        i2 = i + iM108704b;
                    }
                    break;
                case 62:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = m14431F(t, j);
                        i2 = i + iM108704b;
                    }
                    break;
                case 63:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = m14431F(t, j);
                        i2 = i + iM108704b;
                    }
                    break;
                case 64:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = m14431F(t, j);
                        i2 = i + iM108704b;
                    }
                    break;
                case 65:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = ctx0.m108704b(m14433K(t, j));
                        i2 = i + iM108704b;
                    }
                    break;
                case 66:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = m14431F(t, j);
                        i2 = i + iM108704b;
                    }
                    break;
                case 67:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = ctx0.m108704b(m14433K(t, j));
                        i2 = i + iM108704b;
                    }
                    break;
                case 68:
                    if (m14451I(t, i4, i3)) {
                        i = i2 * 53;
                        iM108704b = e6y0.m115123B(t, j).hashCode();
                        i2 = i + iM108704b;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.f10287n.mo14540q(t).hashCode();
        return this.f10279f ? (iHashCode2 * 53) + this.f10288o.mo14334d(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.i3y0
    public final void zzd(T t) {
        if (m14437R(t)) {
            if (t instanceof AbstractC2349u0) {
                AbstractC2349u0 abstractC2349u0 = (AbstractC2349u0) t;
                abstractC2349u0.mo14253f(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                abstractC2349u0.zza = 0;
                abstractC2349u0.m14366z();
            }
            int length = this.f10274a.length;
            for (int i = 0; i < length; i += 3) {
                int iM14449E = m14449E(i);
                long j = 1048575 & iM14449E;
                int i2 = (iM14449E & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 17:
                                if (m14450H(t, i)) {
                                    m14454M(i).zzd(f10273r.getObject(t, j));
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
                                this.f10286m.mo176934c(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = f10273r;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.f10289p.mo147910d(object));
                                }
                                break;
                        }
                    } else if (m14451I(t, this.f10274a[i], i)) {
                        m14454M(i).zzd(f10273r.getObject(t, j));
                    }
                } else if (m14450H(t, i)) {
                    m14454M(i).zzd(f10273r.getObject(t, j));
                }
            }
            this.f10287n.mo14542s(t);
            if (this.f10279f) {
                this.f10288o.mo14340j(t);
            }
        }
    }

    @Override // p149l.i3y0
    public final T zza() {
        return (T) this.f10285l.zza(this.f10278e);
    }
}
