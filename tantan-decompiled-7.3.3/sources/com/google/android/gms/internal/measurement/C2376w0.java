package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.a6y0;
import p153l.e0y0;
import p153l.e1y0;
import p153l.ecy0;
import p153l.efy0;
import p153l.fig0;
import p153l.h9y0;
import p153l.hfy0;
import p153l.i2y0;
import p153l.iig0;
import p153l.ikx0;
import p153l.kfy0;
import p153l.m7y0;
import p153l.m9y0;
import p153l.nvx0;
import p153l.ocy0;
import p153l.q7y0;
import p153l.r2y0;
import p153l.scy0;
import p153l.shy0;
import p153l.uay0;
import p153l.v0y0;
import p153l.vby0;
import p153l.vcy0;
import p153l.wg3;
import p153l.zby0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2376w0<T> implements ocy0<T> {

    /* JADX INFO: renamed from: q */
    public static final int[] f10309q = new int[0];

    /* JADX INFO: renamed from: r */
    public static final Unsafe f10310r = kfy0.m149653p();

    /* JADX INFO: renamed from: a */
    public final int[] f10311a;

    /* JADX INFO: renamed from: b */
    public final Object[] f10312b;

    /* JADX INFO: renamed from: c */
    public final int f10313c;

    /* JADX INFO: renamed from: d */
    public final int f10314d;

    /* JADX INFO: renamed from: e */
    public final m9y0 f10315e;

    /* JADX INFO: renamed from: f */
    public final boolean f10316f;

    /* JADX INFO: renamed from: g */
    public final boolean f10317g;

    /* JADX INFO: renamed from: h */
    public final boolean f10318h;

    /* JADX INFO: renamed from: i */
    public final int[] f10319i;

    /* JADX INFO: renamed from: j */
    public final int f10320j;

    /* JADX INFO: renamed from: k */
    public final int f10321k;

    /* JADX INFO: renamed from: l */
    public final uay0 f10322l;

    /* JADX INFO: renamed from: m */
    public final a6y0 f10323m;

    /* JADX INFO: renamed from: n */
    public final hfy0<?, ?> f10324n;

    /* JADX INFO: renamed from: o */
    public final e0y0<?> f10325o;

    /* JADX INFO: renamed from: p */
    public final q7y0 f10326p;

    public C2376w0(int[] iArr, Object[] objArr, int i, int i2, m9y0 m9y0Var, boolean z, int[] iArr2, int i3, int i4, uay0 uay0Var, a6y0 a6y0Var, hfy0<?, ?> hfy0Var, e0y0<?> e0y0Var, q7y0 q7y0Var) {
        this.f10311a = iArr;
        this.f10312b = objArr;
        this.f10313c = i;
        this.f10314d = i2;
        this.f10317g = m9y0Var instanceof AbstractC2372u0;
        this.f10316f = e0y0Var != null && e0y0Var.mo14392h(m9y0Var);
        this.f10318h = false;
        this.f10319i = iArr2;
        this.f10320j = i3;
        this.f10321k = i4;
        this.f10322l = uay0Var;
        this.f10323m = a6y0Var;
        this.f10324n = hfy0Var;
        this.f10325o = e0y0Var;
        this.f10315e = m9y0Var;
        this.f10326p = q7y0Var;
    }

    /* JADX INFO: renamed from: F */
    public static <T> int m14485F(T t, long j) {
        return ((Integer) kfy0.m149633B(t, j)).intValue();
    }

    /* JADX INFO: renamed from: G */
    public static efy0 m14486G(Object obj) {
        AbstractC2372u0 abstractC2372u0 = (AbstractC2372u0) obj;
        efy0 efy0Var = abstractC2372u0.zzb;
        if (efy0Var != efy0.m120738k()) {
            return efy0Var;
        }
        efy0 efy0VarM120739l = efy0.m120739l();
        abstractC2372u0.zzb = efy0VarM120739l;
        return efy0VarM120739l;
    }

    /* JADX INFO: renamed from: K */
    public static <T> long m14487K(T t, long j) {
        return ((Long) kfy0.m149633B(t, j)).longValue();
    }

    /* JADX INFO: renamed from: N */
    public static <T> boolean m14488N(T t, long j) {
        return ((Boolean) kfy0.m149633B(t, j)).booleanValue();
    }

    /* JADX INFO: renamed from: P */
    public static void m14489P(Object obj) {
        if (m14491R(obj)) {
            return;
        }
        wg3.m206174a("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m14490Q(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m14491R(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2372u0) {
            return ((AbstractC2372u0) obj).m14407A();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static <T> double m14492g(T t, long j) {
        return ((Double) kfy0.m149633B(t, j)).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:123:0x026a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0271  */
    /* JADX WARN: Code duplicated, block: B:128:0x0287  */
    /* JADX WARN: Code duplicated, block: B:129:0x028a  */
    /* JADX INFO: renamed from: k */
    public static <T> C2376w0<T> m14493k(Class<T> cls, h9y0 h9y0Var, uay0 uay0Var, a6y0 a6y0Var, hfy0<?, ?> hfy0Var, e0y0<?> e0y0Var, q7y0 q7y0Var) {
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
        ecy0 ecy0Var;
        int i17;
        int[] iArr2;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        int iObjectFieldOffset2;
        int iObjectFieldOffset3;
        int i21;
        Field fieldM14494p;
        int i22;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldM14494p2;
        int i26;
        Object obj2;
        Field fieldM14494p3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        if (!(h9y0Var instanceof ecy0)) {
            throw new NoSuchMethodError();
        }
        ecy0 ecy0Var2 = (ecy0) h9y0Var;
        String strM120412a = ecy0Var2.m120412a();
        int length = strM120412a.length();
        char c = 55296;
        if (strM120412a.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (strM120412a.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt2 = strM120412a.charAt(i);
        if (iCharAt2 >= 55296) {
            int i33 = iCharAt2 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = strM120412a.charAt(i32);
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
            iArr = f10309q;
            i6 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt3 = strM120412a.charAt(i32);
            if (iCharAt3 >= 55296) {
                int i36 = iCharAt3 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    cCharAt8 = strM120412a.charAt(i35);
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
            int iCharAt4 = strM120412a.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt7 = strM120412a.charAt(i38);
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
            int iCharAt5 = strM120412a.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt6 = strM120412a.charAt(i41);
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
            int iCharAt6 = strM120412a.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt5 = strM120412a.charAt(i44);
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
            iCharAt = strM120412a.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt4 = strM120412a.charAt(i47);
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
            int iCharAt7 = strM120412a.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt3 = strM120412a.charAt(i50);
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
            int iCharAt8 = strM120412a.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt2 = strM120412a.charAt(i53);
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
            int iCharAt9 = strM120412a.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    cCharAt = strM120412a.charAt(i56);
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
        Unsafe unsafe = f10310r;
        Object[] objArrM120413b = ecy0Var2.m120413b();
        Class<?> cls2 = ecy0Var2.zza().getClass();
        int[] iArr4 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt << 1];
        int i61 = i7 + i3;
        int i62 = i7;
        int i63 = i61;
        int i64 = 0;
        int i65 = 0;
        while (i32 < length) {
            int i66 = i32 + 1;
            int iCharAt10 = strM120412a.charAt(i32);
            if (iCharAt10 >= c) {
                int i67 = iCharAt10 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i29 = i68 + 1;
                    cCharAt12 = strM120412a.charAt(i68);
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
            int iCharAt11 = strM120412a.charAt(i16);
            if (iCharAt11 >= c) {
                int i71 = iCharAt11 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i28 = i72 + 1;
                    cCharAt11 = strM120412a.charAt(i72);
                    ecy0Var = ecy0Var2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i73;
                    i73 += 13;
                    i72 = i28;
                    ecy0Var2 = ecy0Var;
                }
                iCharAt11 = i71 | (cCharAt11 << i73);
                i17 = i28;
            } else {
                ecy0Var = ecy0Var2;
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
                int iCharAt12 = strM120412a.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = 13;
                    while (true) {
                        i27 = i20 + 1;
                        cCharAt10 = strM120412a.charAt(i20);
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
                    objArr[((i64 / 3) << 1) + 1] = objArrM120413b[i5];
                } else {
                    if (i79 == 12 && (ecy0Var.zzb().equals(zzln.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i24 = i5 + 1;
                        objArr[((i64 / 3) << 1) + 1] = objArrM120413b[i5];
                    }
                    i25 = i80 << 1;
                    obj = objArrM120413b[i25];
                    if (obj instanceof Field) {
                        fieldM14494p2 = (Field) obj;
                    } else {
                        fieldM14494p2 = m14494p(cls2, (String) obj);
                        objArrM120413b[i25] = fieldM14494p2;
                    }
                    iArr2 = iArr4;
                    i18 = i6;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14494p2);
                    i26 = i25 + 1;
                    obj2 = objArrM120413b[i26];
                    if (obj2 instanceof Field) {
                        fieldM14494p3 = (Field) obj2;
                    } else {
                        fieldM14494p3 = m14494p(cls2, (String) obj2);
                        objArrM120413b[i26] = fieldM14494p3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM14494p3);
                    i21 = i5;
                    strM120412a = strM120412a;
                    i19 = 0;
                }
                i5 = i24;
                i25 = i80 << 1;
                obj = objArrM120413b[i25];
                if (obj instanceof Field) {
                    fieldM14494p2 = (Field) obj;
                } else {
                    fieldM14494p2 = m14494p(cls2, (String) obj);
                    objArrM120413b[i25] = fieldM14494p2;
                }
                iArr2 = iArr4;
                i18 = i6;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14494p2);
                i26 = i25 + 1;
                obj2 = objArrM120413b[i26];
                if (obj2 instanceof Field) {
                    fieldM14494p3 = (Field) obj2;
                } else {
                    fieldM14494p3 = m14494p(cls2, (String) obj2);
                    objArrM120413b[i26] = fieldM14494p3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM14494p3);
                i21 = i5;
                strM120412a = strM120412a;
                i19 = 0;
            } else {
                iArr2 = iArr4;
                i18 = i6;
                int i81 = i5 + 1;
                Field fieldM14494p4 = m14494p(cls2, (String) objArrM120413b[i5]);
                if (i74 == 9 || i74 == 17) {
                    objArr[((i64 / 3) << 1) + 1] = fieldM14494p4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i23 = i5 + 2;
                        objArr[((i64 / 3) << 1) + 1] = objArrM120413b[i81];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        if (ecy0Var.zzb() == zzln.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i23 = i5 + 2;
                            objArr[((i64 / 3) << 1) + 1] = objArrM120413b[i81];
                        }
                    } else if (i74 == 50) {
                        int i82 = i62 + 1;
                        iArr[i62] = i64;
                        int i83 = (i64 / 3) << 1;
                        int i84 = i5 + 2;
                        objArr[i83] = objArrM120413b[i81];
                        if ((iCharAt11 & 2048) != 0) {
                            i81 = i5 + 3;
                            objArr[i83 + 1] = objArrM120413b[i84];
                            i62 = i82;
                        } else {
                            i62 = i82;
                            i81 = i84;
                        }
                    }
                    i81 = i23;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM14494p4);
                if ((iCharAt11 & 4096) == 0 || i74 > 17) {
                    iObjectFieldOffset = 1048575;
                    i19 = 0;
                } else {
                    int i85 = i17 + 1;
                    int iCharAt13 = strM120412a.charAt(i17);
                    if (iCharAt13 >= 55296) {
                        int i86 = iCharAt13 & 8191;
                        int i87 = 13;
                        while (true) {
                            i22 = i85 + 1;
                            cCharAt9 = strM120412a.charAt(i85);
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
                    Object obj3 = objArrM120413b[i88];
                    int i89 = iCharAt13;
                    if (obj3 instanceof Field) {
                        fieldM14494p = (Field) obj3;
                    } else {
                        fieldM14494p = m14494p(cls2, (String) obj3);
                        objArrM120413b[i88] = fieldM14494p;
                    }
                    i19 = i89 % 32;
                    int i90 = i85;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14494p);
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
            iArr2[i94] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | iObjectFieldOffset2;
            i64 += 3;
            iArr2[i95] = (i19 << 20) | iObjectFieldOffset3;
            i32 = i20;
            strM120412a = strM120412a;
            length = i75;
            ecy0Var2 = ecy0Var;
            i6 = i18;
            c = 55296;
            i5 = i21;
            iArr4 = iArr2;
        }
        return new C2376w0<>(iArr4, objArr, i2, i4, ecy0Var2.zza(), false, iArr, i7, i61, uay0Var, a6y0Var, hfy0Var, e0y0Var, q7y0Var);
    }

    /* JADX INFO: renamed from: p */
    public static Field m14494p(Class<?> cls, String str) {
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

    /* JADX INFO: renamed from: q */
    public static void m14495q(int i, Object obj, shy0 shy0Var) throws IOException {
        if (obj instanceof String) {
            shy0Var.mo185970d(i, (String) obj);
        } else {
            shy0Var.mo185992z(i, (zzik) obj);
        }
    }

    /* JADX INFO: renamed from: v */
    public static <UT, UB> void m14496v(hfy0<UT, UB> hfy0Var, T t, shy0 shy0Var) throws IOException {
        hfy0Var.mo14591n(hfy0Var.mo14594q(t), shy0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static boolean m14497y(Object obj, int i, ocy0 ocy0Var) {
        return ocy0Var.mo14511b(kfy0.m149633B(obj, i & 1048575));
    }

    /* JADX INFO: renamed from: z */
    public static <T> float m14498z(T t, long j) {
        return ((Float) kfy0.m149633B(t, j)).floatValue();
    }

    /* JADX INFO: renamed from: A */
    public final int m14499A(int i) {
        return this.f10311a[i + 2];
    }

    /* JADX INFO: renamed from: B */
    public final void m14500B(T t, int i) {
        int iM14499A = m14499A(i);
        long j = 1048575 & iM14499A;
        if (j == 1048575) {
            return;
        }
        kfy0.m149645h(t, j, (1 << (iM14499A >>> 20)) | kfy0.m149657t(t, j));
    }

    /* JADX INFO: renamed from: C */
    public final void m14501C(T t, int i, int i2) {
        kfy0.m149645h(t, m14499A(i2) & 1048575, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m14502D(T t, T t2, int i) {
        int i2 = this.f10311a[i];
        if (m14505I(t2, i2, i)) {
            long jM14503E = m14503E(i) & 1048575;
            Unsafe unsafe = f10310r;
            Object object = unsafe.getObject(t2, jM14503E);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f10311a[i] + " is present but null: " + String.valueOf(t2));
            }
            ocy0 ocy0VarM14508M = m14508M(i);
            if (!m14505I(t, i2, i)) {
                if (m14491R(object)) {
                    Object objZza = ocy0VarM14508M.zza();
                    ocy0VarM14508M.mo14512c(objZza, object);
                    unsafe.putObject(t, jM14503E, objZza);
                } else {
                    unsafe.putObject(t, jM14503E, object);
                }
                m14501C(t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jM14503E);
            if (!m14491R(object2)) {
                Object objZza2 = ocy0VarM14508M.zza();
                ocy0VarM14508M.mo14512c(objZza2, object2);
                unsafe.putObject(t, jM14503E, objZza2);
                object2 = objZza2;
            }
            ocy0VarM14508M.mo14512c(object2, object);
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m14503E(int i) {
        return this.f10311a[i + 1];
    }

    /* JADX INFO: renamed from: H */
    public final boolean m14504H(T t, int i) {
        int iM14499A = m14499A(i);
        long j = iM14499A & 1048575;
        if (j != 1048575) {
            return ((1 << (iM14499A >>> 20)) & kfy0.m149657t(t, j)) != 0;
        }
        int iM14503E = m14503E(i);
        long j2 = iM14503E & 1048575;
        switch ((iM14503E & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(kfy0.m149638a(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(kfy0.m149651n(t, j2)) != 0;
            case 2:
                return kfy0.m149661x(t, j2) != 0;
            case 3:
                return kfy0.m149661x(t, j2) != 0;
            case 4:
                return kfy0.m149657t(t, j2) != 0;
            case 5:
                return kfy0.m149661x(t, j2) != 0;
            case 6:
                return kfy0.m149657t(t, j2) != 0;
            case 7:
                return kfy0.m149637F(t, j2);
            case 8:
                Object objM149633B = kfy0.m149633B(t, j2);
                if (objM149633B instanceof String) {
                    return !((String) objM149633B).isEmpty();
                }
                if (objM149633B instanceof zzik) {
                    return !zzik.zza.equals(objM149633B);
                }
                fig0.m125680a();
                return false;
            case 9:
                return kfy0.m149633B(t, j2) != null;
            case 10:
                return !zzik.zza.equals(kfy0.m149633B(t, j2));
            case 11:
                return kfy0.m149657t(t, j2) != 0;
            case 12:
                return kfy0.m149657t(t, j2) != 0;
            case 13:
                return kfy0.m149657t(t, j2) != 0;
            case 14:
                return kfy0.m149661x(t, j2) != 0;
            case 15:
                return kfy0.m149657t(t, j2) != 0;
            case 16:
                return kfy0.m149661x(t, j2) != 0;
            case 17:
                return kfy0.m149633B(t, j2) != null;
            default:
                fig0.m125680a();
                return false;
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14505I(T t, int i, int i2) {
        return kfy0.m149657t(t, (long) (m14499A(i2) & 1048575)) == i;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m14506J(T t, T t2, int i) {
        return m14504H(t, i) == m14504H(t2, i);
    }

    /* JADX INFO: renamed from: L */
    public final r2y0 m14507L(int i) {
        return (r2y0) this.f10312b[((i / 3) << 1) + 1];
    }

    /* JADX INFO: renamed from: M */
    public final ocy0 m14508M(int i) {
        int i2 = (i / 3) << 1;
        ocy0 ocy0Var = (ocy0) this.f10312b[i2];
        if (ocy0Var != null) {
            return ocy0Var;
        }
        ocy0<T> ocy0VarM200748b = vby0.m200747a().m200748b((Class) this.f10312b[i2 + 1]);
        this.f10312b[i2] = ocy0VarM200748b;
        return ocy0VarM200748b;
    }

    /* JADX INFO: renamed from: O */
    public final Object m14509O(int i) {
        return this.f10312b[(i / 3) << 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:176:0x054b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // p153l.ocy0
    /* JADX INFO: renamed from: a */
    public final void mo14510a(T t, shy0 shy0Var) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i;
        int i2;
        int i3;
        Iterator itM198958m;
        Map.Entry<?, ?> entry2;
        C2376w0<T> c2376w0 = this;
        int i4 = 267386880;
        boolean z = true;
        int i5 = 1048575;
        if (shy0Var.zza() == 2) {
            m14496v(c2376w0.f10324n, t, shy0Var);
            if (c2376w0.f10316f) {
                v0y0<T> v0y0VarMo14388d = c2376w0.f10325o.mo14388d(t);
                if (v0y0VarMo14388d.f181911a.isEmpty()) {
                    itM198958m = null;
                    entry2 = null;
                } else {
                    itM198958m = v0y0VarMo14388d.m198958m();
                    entry2 = (Map.Entry) itM198958m.next();
                }
            } else {
                itM198958m = null;
                entry2 = null;
            }
            for (int length = c2376w0.f10311a.length - 3; length >= 0; length -= 3) {
                int iM14503E = c2376w0.m14503E(length);
                int i6 = c2376w0.f10311a[length];
                while (entry2 != null && c2376w0.f10325o.mo14385a(entry2) > i6) {
                    c2376w0.f10325o.mo14391g(shy0Var, entry2);
                    entry2 = itM198958m.hasNext() ? (Map.Entry) itM198958m.next() : null;
                }
                switch ((iM14503E & 267386880) >>> 20) {
                    case 0:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185984r(i6, kfy0.m149638a(t, iM14503E & 1048575));
                        }
                        break;
                    case 1:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185985s(i6, kfy0.m149651n(t, iM14503E & 1048575));
                        }
                        break;
                    case 2:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185976j(i6, kfy0.m149661x(t, iM14503E & 1048575));
                        }
                        break;
                    case 3:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185990x(i6, kfy0.m149661x(t, iM14503E & 1048575));
                        }
                        break;
                    case 4:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185979m(i6, kfy0.m149657t(t, iM14503E & 1048575));
                        }
                        break;
                    case 5:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185968b(i6, kfy0.m149661x(t, iM14503E & 1048575));
                        }
                        break;
                    case 6:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185977k(i6, kfy0.m149657t(t, iM14503E & 1048575));
                        }
                        break;
                    case 7:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185974h(i6, kfy0.m149637F(t, iM14503E & 1048575));
                        }
                        break;
                    case 8:
                        if (c2376w0.m14504H(t, length)) {
                            m14495q(i6, kfy0.m149633B(t, iM14503E & 1048575), shy0Var);
                        }
                        break;
                    case 9:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185960G(i6, kfy0.m149633B(t, iM14503E & 1048575), c2376w0.m14508M(length));
                        }
                        break;
                    case 10:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185992z(i6, (zzik) kfy0.m149633B(t, iM14503E & 1048575));
                        }
                        break;
                    case 11:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185986t(i6, kfy0.m149657t(t, iM14503E & 1048575));
                        }
                        break;
                    case 12:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185983q(i6, kfy0.m149657t(t, iM14503E & 1048575));
                        }
                        break;
                    case 13:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185987u(i6, kfy0.m149657t(t, iM14503E & 1048575));
                        }
                        break;
                    case 14:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185980n(i6, kfy0.m149661x(t, iM14503E & 1048575));
                        }
                        break;
                    case 15:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185989w(i6, kfy0.m149657t(t, iM14503E & 1048575));
                        }
                        break;
                    case 16:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185988v(i6, kfy0.m149661x(t, iM14503E & 1048575));
                        }
                        break;
                    case 17:
                        if (c2376w0.m14504H(t, length)) {
                            shy0Var.mo185959F(i6, kfy0.m149633B(t, iM14503E & 1048575), c2376w0.m14508M(length));
                        }
                        break;
                    case 18:
                        vcy0.m200888w(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 19:
                        vcy0.m200849I(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 20:
                        vcy0.m200855O(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 21:
                        vcy0.m200865Y(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 22:
                        vcy0.m200852L(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 23:
                        vcy0.m200846F(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 24:
                        vcy0.m200843C(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 25:
                        vcy0.m200876k(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 26:
                        vcy0.m200886u(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var);
                        break;
                    case 27:
                        vcy0.m200887v(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, c2376w0.m14508M(length));
                        break;
                    case 28:
                        vcy0.m200874i(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var);
                        break;
                    case 29:
                        vcy0.m200864X(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 30:
                        vcy0.m200891z(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 31:
                        vcy0.m200858R(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 32:
                        vcy0.m200861U(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 33:
                        vcy0.m200862V(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 34:
                        vcy0.m200863W(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, false);
                        break;
                    case 35:
                        vcy0.m200888w(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 36:
                        vcy0.m200849I(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 37:
                        vcy0.m200855O(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 38:
                        vcy0.m200865Y(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 39:
                        vcy0.m200852L(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 40:
                        vcy0.m200846F(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 41:
                        vcy0.m200843C(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 42:
                        vcy0.m200876k(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 43:
                        vcy0.m200864X(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 44:
                        vcy0.m200891z(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 45:
                        vcy0.m200858R(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 46:
                        vcy0.m200861U(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 47:
                        vcy0.m200862V(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 48:
                        vcy0.m200863W(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, true);
                        break;
                    case 49:
                        vcy0.m200875j(c2376w0.f10311a[length], (List) kfy0.m149633B(t, iM14503E & 1048575), shy0Var, c2376w0.m14508M(length));
                        break;
                    case 50:
                        c2376w0.m14527w(shy0Var, i6, kfy0.m149633B(t, iM14503E & 1048575), length);
                        break;
                    case 51:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185984r(i6, m14492g(t, iM14503E & 1048575));
                        }
                        break;
                    case 52:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185985s(i6, m14498z(t, iM14503E & 1048575));
                        }
                        break;
                    case 53:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185976j(i6, m14487K(t, iM14503E & 1048575));
                        }
                        break;
                    case 54:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185990x(i6, m14487K(t, iM14503E & 1048575));
                        }
                        break;
                    case 55:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185979m(i6, m14485F(t, iM14503E & 1048575));
                        }
                        break;
                    case 56:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185968b(i6, m14487K(t, iM14503E & 1048575));
                        }
                        break;
                    case 57:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185977k(i6, m14485F(t, iM14503E & 1048575));
                        }
                        break;
                    case 58:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185974h(i6, m14488N(t, iM14503E & 1048575));
                        }
                        break;
                    case 59:
                        if (c2376w0.m14505I(t, i6, length)) {
                            m14495q(i6, kfy0.m149633B(t, iM14503E & 1048575), shy0Var);
                        }
                        break;
                    case 60:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185960G(i6, kfy0.m149633B(t, iM14503E & 1048575), c2376w0.m14508M(length));
                        }
                        break;
                    case 61:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185992z(i6, (zzik) kfy0.m149633B(t, iM14503E & 1048575));
                        }
                        break;
                    case 62:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185986t(i6, m14485F(t, iM14503E & 1048575));
                        }
                        break;
                    case 63:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185983q(i6, m14485F(t, iM14503E & 1048575));
                        }
                        break;
                    case 64:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185987u(i6, m14485F(t, iM14503E & 1048575));
                        }
                        break;
                    case 65:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185980n(i6, m14487K(t, iM14503E & 1048575));
                        }
                        break;
                    case 66:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185989w(i6, m14485F(t, iM14503E & 1048575));
                        }
                        break;
                    case 67:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185988v(i6, m14487K(t, iM14503E & 1048575));
                        }
                        break;
                    case 68:
                        if (c2376w0.m14505I(t, i6, length)) {
                            shy0Var.mo185959F(i6, kfy0.m149633B(t, iM14503E & 1048575), c2376w0.m14508M(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                c2376w0.f10325o.mo14391g(shy0Var, entry2);
                entry2 = itM198958m.hasNext() ? (Map.Entry) itM198958m.next() : null;
            }
            return;
        }
        if (c2376w0.f10316f) {
            v0y0<T> v0y0VarMo14388d2 = c2376w0.f10325o.mo14388d(t);
            if (v0y0VarMo14388d2.f181911a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itM198959p = v0y0VarMo14388d2.m198959p();
                entry = (Map.Entry) itM198959p.next();
                it = itM198959p;
            }
        } else {
            entry = null;
            it = null;
        }
        int length2 = c2376w0.f10311a.length;
        Unsafe unsafe = f10310r;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i7 < length2) {
            int iM14503E2 = c2376w0.m14503E(i7);
            int i10 = i4;
            int[] iArr = c2376w0.f10311a;
            int i11 = iArr[i7];
            int i12 = (iM14503E2 & i10) >>> 20;
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
            while (entry != null && c2376w0.f10325o.mo14385a(entry) <= i11) {
                c2376w0.f10325o.mo14391g(shy0Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            Iterator it2 = it;
            long j = iM14503E2 & i5;
            switch (i12) {
                case 0:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185984r(i11, kfy0.m149638a(t, j));
                    }
                    break;
                case 1:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185985s(i11, kfy0.m149651n(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 2:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185976j(i11, unsafe.getLong(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 3:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185990x(i11, unsafe.getLong(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 4:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185979m(i11, unsafe.getInt(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 5:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185968b(i11, unsafe.getLong(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 6:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185977k(i11, unsafe.getInt(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 7:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185974h(i11, kfy0.m149637F(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 8:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        m14495q(i11, unsafe.getObject(t, j), shy0Var);
                    }
                    c2376w0 = this;
                    break;
                case 9:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185960G(i11, unsafe.getObject(t, j), c2376w0.m14508M(i7));
                    }
                    break;
                case 10:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185992z(i11, (zzik) unsafe.getObject(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 11:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185986t(i11, unsafe.getInt(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 12:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185983q(i11, unsafe.getInt(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 13:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185987u(i11, unsafe.getInt(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 14:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185980n(i11, unsafe.getLong(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 15:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185989w(i11, unsafe.getInt(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 16:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185988v(i11, unsafe.getLong(t, j));
                    }
                    c2376w0 = this;
                    break;
                case 17:
                    z = z2 ? 1 : 0;
                    if (c2376w0.m14528x(t, i7, i, i2, i3)) {
                        shy0Var.mo185959F(i11, unsafe.getObject(t, j), c2376w0.m14508M(i7));
                    }
                    break;
                case 18:
                    z = z2 ? 1 : 0;
                    vcy0.m200888w(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 19:
                    z = z2 ? 1 : 0;
                    vcy0.m200849I(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 20:
                    z = z2 ? 1 : 0;
                    vcy0.m200855O(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 21:
                    z = z2 ? 1 : 0;
                    vcy0.m200865Y(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 22:
                    z = z2 ? 1 : 0;
                    vcy0.m200852L(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 23:
                    z = z2 ? 1 : 0;
                    vcy0.m200846F(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 24:
                    z = z2 ? 1 : 0;
                    vcy0.m200843C(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 25:
                    z = z2 ? 1 : 0;
                    vcy0.m200876k(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 26:
                    z = z2 ? 1 : 0;
                    vcy0.m200886u(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var);
                    break;
                case 27:
                    z = z2 ? 1 : 0;
                    vcy0.m200887v(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, c2376w0.m14508M(i7));
                    break;
                case 28:
                    z = z2 ? 1 : 0;
                    vcy0.m200874i(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var);
                    break;
                case 29:
                    z = z2 ? 1 : 0;
                    vcy0.m200864X(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 30:
                    z = z2 ? 1 : 0;
                    vcy0.m200891z(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 31:
                    z = z2 ? 1 : 0;
                    vcy0.m200858R(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 32:
                    z = z2 ? 1 : 0;
                    vcy0.m200861U(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 33:
                    z = z2 ? 1 : 0;
                    vcy0.m200862V(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 34:
                    z = z2 ? 1 : 0;
                    vcy0.m200863W(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, false);
                    break;
                case 35:
                    z = z2 ? 1 : 0;
                    vcy0.m200888w(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 36:
                    z = z2 ? 1 : 0;
                    vcy0.m200849I(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 37:
                    z = z2 ? 1 : 0;
                    vcy0.m200855O(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 38:
                    z = z2 ? 1 : 0;
                    vcy0.m200865Y(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 39:
                    z = z2 ? 1 : 0;
                    vcy0.m200852L(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 40:
                    z = z2 ? 1 : 0;
                    vcy0.m200846F(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 41:
                    z = z2 ? 1 : 0;
                    vcy0.m200843C(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 42:
                    z = z2 ? 1 : 0;
                    vcy0.m200876k(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 43:
                    z = z2 ? 1 : 0;
                    vcy0.m200864X(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 44:
                    z = z2 ? 1 : 0;
                    vcy0.m200891z(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 45:
                    z = z2 ? 1 : 0;
                    vcy0.m200858R(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 46:
                    z = z2 ? 1 : 0;
                    vcy0.m200861U(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 47:
                    z = z2 ? 1 : 0;
                    vcy0.m200862V(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, z);
                    break;
                case 48:
                    int i15 = c2376w0.f10311a[i7];
                    List list = (List) unsafe.getObject(t, j);
                    z = z2 ? 1 : 0;
                    vcy0.m200863W(i15, list, shy0Var, z);
                    break;
                case 49:
                    vcy0.m200875j(c2376w0.f10311a[i7], (List) unsafe.getObject(t, j), shy0Var, c2376w0.m14508M(i7));
                    z = z2 ? 1 : 0;
                    break;
                case 50:
                    c2376w0.m14527w(shy0Var, i11, unsafe.getObject(t, j), i7);
                    z = z2 ? 1 : 0;
                    break;
                case 51:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185984r(i11, m14492g(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 52:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185985s(i11, m14498z(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 53:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185976j(i11, m14487K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 54:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185990x(i11, m14487K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 55:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185979m(i11, m14485F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 56:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185968b(i11, m14487K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 57:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185977k(i11, m14485F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 58:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185974h(i11, m14488N(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 59:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        m14495q(i11, unsafe.getObject(t, j), shy0Var);
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 60:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185960G(i11, unsafe.getObject(t, j), c2376w0.m14508M(i7));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 61:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185992z(i11, (zzik) unsafe.getObject(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 62:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185986t(i11, m14485F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 63:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185983q(i11, m14485F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 64:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185987u(i11, m14485F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 65:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185980n(i11, m14487K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 66:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185989w(i11, m14485F(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 67:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185988v(i11, m14487K(t, j));
                    }
                    z = z2 ? 1 : 0;
                    break;
                case 68:
                    if (c2376w0.m14505I(t, i11, i7)) {
                        shy0Var.mo185959F(i11, unsafe.getObject(t, j), c2376w0.m14508M(i7));
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
            c2376w0.f10325o.mo14391g(shy0Var, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        m14496v(c2376w0.f10324n, t, shy0Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb A[LOOP:1: B:45:0x00aa->B:50:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ocy0
    /* JADX INFO: renamed from: b */
    public final boolean mo14511b(T t) {
        int i;
        int i2;
        C2376w0<T> c2376w0;
        T t2;
        List list;
        ocy0 ocy0VarM14508M;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.f10320j) {
            int i7 = this.f10319i[i5];
            int i8 = this.f10311a[i7];
            int iM14503E = this.m14503E(i7);
            int i9 = this.f10311a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i6 = f10310r.getInt(t, i10);
                }
                i2 = i6;
                i = i10;
            } else {
                i = i4;
                i2 = i6;
            }
            if ((268435456 & iM14503E) != 0) {
                c2376w0 = this;
                t2 = t;
                if (!c2376w0.m14528x(t2, i7, i, i2, i11)) {
                    return false;
                }
            } else {
                c2376w0 = this;
                t2 = t;
            }
            int i12 = (267386880 & iM14503E) >>> 20;
            if (i12 == 9 || i12 == 17) {
                if (c2376w0.m14528x(t2, i7, i, i2, i11) && !m14497y(t2, iM14503E, c2376w0.m14508M(i7))) {
                    return false;
                }
            } else if (i12 == 27) {
                list = (List) kfy0.m149633B(t2, iM14503E & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ocy0VarM14508M = c2376w0.m14508M(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!ocy0VarM14508M.mo14511b(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i12 == 60 || i12 == 68) {
                if (c2376w0.m14505I(t2, i8, i7) && !m14497y(t2, iM14503E, c2376w0.m14508M(i7))) {
                    return false;
                }
            } else if (i12 == 49) {
                list = (List) kfy0.m149633B(t2, iM14503E & 1048575);
                if (list.isEmpty()) {
                    ocy0VarM14508M = c2376w0.m14508M(i7);
                    while (i3 < list.size()) {
                        if (!ocy0VarM14508M.mo14511b(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i12 == 50 && !c2376w0.f10326p.zzd(kfy0.m149633B(t2, iM14503E & 1048575)).isEmpty()) {
                c2376w0.f10326p.zza(c2376w0.m14509O(i7));
                throw null;
            }
            i5++;
            this = c2376w0;
            t = t2;
            i4 = i;
            i6 = i2;
        }
        C2376w0<T> c2376w1 = this;
        return !c2376w1.f10316f || c2376w1.f10325o.mo14388d(t).m198962s();
    }

    @Override // p153l.ocy0
    /* JADX INFO: renamed from: c */
    public final void mo14512c(T t, T t2) {
        m14489P(t);
        t2.getClass();
        for (int i = 0; i < this.f10311a.length; i += 3) {
            int iM14503E = m14503E(i);
            long j = 1048575 & iM14503E;
            int i2 = this.f10311a[i];
            switch ((iM14503E & 267386880) >>> 20) {
                case 0:
                    if (m14504H(t2, i)) {
                        kfy0.m149643f(t, j, kfy0.m149638a(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 1:
                    if (m14504H(t2, i)) {
                        kfy0.m149644g(t, j, kfy0.m149651n(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 2:
                    if (m14504H(t2, i)) {
                        kfy0.m149646i(t, j, kfy0.m149661x(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 3:
                    if (m14504H(t2, i)) {
                        kfy0.m149646i(t, j, kfy0.m149661x(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 4:
                    if (m14504H(t2, i)) {
                        kfy0.m149645h(t, j, kfy0.m149657t(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 5:
                    if (m14504H(t2, i)) {
                        kfy0.m149646i(t, j, kfy0.m149661x(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 6:
                    if (m14504H(t2, i)) {
                        kfy0.m149645h(t, j, kfy0.m149657t(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 7:
                    if (m14504H(t2, i)) {
                        kfy0.m149659v(t, j, kfy0.m149637F(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 8:
                    if (m14504H(t2, i)) {
                        kfy0.m149647j(t, j, kfy0.m149633B(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 9:
                    m14526u(t, t2, i);
                    break;
                case 10:
                    if (m14504H(t2, i)) {
                        kfy0.m149647j(t, j, kfy0.m149633B(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 11:
                    if (m14504H(t2, i)) {
                        kfy0.m149645h(t, j, kfy0.m149657t(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 12:
                    if (m14504H(t2, i)) {
                        kfy0.m149645h(t, j, kfy0.m149657t(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 13:
                    if (m14504H(t2, i)) {
                        kfy0.m149645h(t, j, kfy0.m149657t(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 14:
                    if (m14504H(t2, i)) {
                        kfy0.m149646i(t, j, kfy0.m149661x(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 15:
                    if (m14504H(t2, i)) {
                        kfy0.m149645h(t, j, kfy0.m149657t(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 16:
                    if (m14504H(t2, i)) {
                        kfy0.m149646i(t, j, kfy0.m149661x(t2, j));
                        m14500B(t, i);
                    }
                    break;
                case 17:
                    m14526u(t, t2, i);
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
                    this.f10323m.mo96348a(t, t2, j);
                    break;
                case 50:
                    vcy0.m200879n(this.f10326p, t, t2, j);
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
                    if (m14505I(t2, i2, i)) {
                        kfy0.m149647j(t, j, kfy0.m149633B(t2, j));
                        m14501C(t, i2, i);
                    }
                    break;
                case 60:
                    m14502D(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m14505I(t2, i2, i)) {
                        kfy0.m149647j(t, j, kfy0.m149633B(t2, j));
                        m14501C(t, i2, i);
                    }
                    break;
                case 68:
                    m14502D(t, t2, i);
                    break;
            }
        }
        vcy0.m200880o(this.f10324n, t, t2);
        if (this.f10316f) {
            vcy0.m200878m(this.f10325o, t, t2);
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
    /* JADX WARN: Type inference failed for: r20v0, types: [l.zby0] */
    @Override // p153l.ocy0
    /* JADX INFO: renamed from: d */
    public final void mo14513d(T t, zby0 zby0Var, C2368s0 c2368s0) throws Throwable {
        T t2;
        int i;
        Object objM14522o;
        T t3;
        C2376w0<T> c2376w0;
        T t4;
        T t5;
        hfy0 hfy0Var;
        e0y0<?> e0y0Var;
        C2368s0 c2368s1;
        v0y0 v0y0Var;
        Object objM200872g;
        hfy0 hfy0Var2;
        hfy0 hfy0Var3;
        int i2;
        Object objM14522o2;
        T t6;
        C2376w0<T> c2376w1 = this;
        C2368s0 c2368s2 = c2368s0;
        c2368s2.getClass();
        m14489P(t);
        hfy0 hfy0Var4 = c2376w1.f10324n;
        e0y0<?> e0y0Var2 = c2376w1.f10325o;
        Object obj = null;
        Object objMo14592o = null;
        v0y0 v0y0VarMo14393i = null;
        while (true) {
            try {
                int iZzc = zby0Var.zzc();
                int iM14516h = c2376w1.m14516h(iZzc);
                if (iM14516h < 0) {
                    if (iZzc == Integer.MAX_VALUE) {
                        int i3 = c2376w1.f10320j;
                        Object objM14522o3 = objMo14592o;
                        while (i3 < c2376w1.f10321k) {
                            objM14522o3 = c2376w1.m14522o(t, c2376w1.f10319i[i3], objM14522o3, hfy0Var4, t);
                            i3++;
                            c2376w1 = c2376w1;
                        }
                        if (objM14522o3 != null) {
                            hfy0Var4.mo14590m(t, objM14522o3);
                            return;
                        }
                        return;
                    }
                    c2376w0 = c2376w1;
                    t4 = t;
                    try {
                        Object objMo14386b = !c2376w0.f10316f ? obj : e0y0Var2.mo14386b(c2368s2, c2376w0.f10315e, iZzc);
                        if (objMo14386b != null) {
                            if (v0y0VarMo14393i == null) {
                                try {
                                    v0y0VarMo14393i = e0y0Var2.mo14393i(t4);
                                } catch (Throwable th) {
                                    th = th;
                                    t2 = t4;
                                }
                            }
                            v0y0 v0y0Var2 = v0y0VarMo14393i;
                            hfy0 hfy0Var5 = hfy0Var4;
                            try {
                                objMo14592o = e0y0Var2.mo14387c(t4, zby0Var, objMo14386b, c2368s2, v0y0Var2, objMo14592o, hfy0Var5);
                                v0y0Var = v0y0Var2;
                                hfy0Var4 = hfy0Var5;
                                e0y0Var = e0y0Var2;
                                c2368s1 = c2368s2;
                                c2376w1 = c2376w0;
                                v0y0VarMo14393i = v0y0Var;
                                c2368s2 = c2368s1;
                                e0y0Var2 = e0y0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                t2 = t4;
                                hfy0Var4 = hfy0Var5;
                            }
                        } else {
                            e0y0Var = e0y0Var2;
                            t2 = t4;
                            c2368s1 = c2368s2;
                            try {
                                hfy0Var4.mo14587j(zby0Var);
                                if (objMo14592o == null) {
                                    try {
                                        objMo14592o = hfy0Var4.mo14592o(t2);
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                if (!hfy0Var4.m134887i(objMo14592o, zby0Var, 0)) {
                                    int i4 = c2376w0.f10320j;
                                    Object objM14522o4 = objMo14592o;
                                    while (i4 < c2376w0.f10321k) {
                                        C2376w0<T> c2376w2 = c2376w0;
                                        objM14522o4 = c2376w2.m14522o(t2, c2376w0.f10319i[i4], objM14522o4, hfy0Var4, t);
                                        i4++;
                                        hfy0Var4 = hfy0Var4;
                                        c2376w0 = c2376w2;
                                    }
                                    hfy0 hfy0Var6 = hfy0Var4;
                                    if (objM14522o4 != null) {
                                        hfy0Var6.mo14590m(t2, objM14522o4);
                                        return;
                                    }
                                    return;
                                }
                                c2376w1 = c2376w0;
                                hfy0Var4 = hfy0Var4;
                                v0y0VarMo14393i = v0y0VarMo14393i;
                                c2368s2 = c2368s1;
                                e0y0Var2 = e0y0Var;
                            } catch (Throwable th4) {
                                th = th4;
                                c2376w1 = c2376w0;
                                hfy0Var = hfy0Var4;
                                hfy0Var4 = hfy0Var;
                                i = c2376w1.f10320j;
                                objM14522o = objMo14592o;
                                while (i < c2376w1.f10321k) {
                                    objM14522o = c2376w1.m14522o(t2, c2376w1.f10319i[i], objM14522o, hfy0Var4, t);
                                    i++;
                                    c2376w1 = this;
                                }
                                t3 = t2;
                                if (objM14522o != null) {
                                    hfy0Var4.mo14590m(t3, objM14522o);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        hfy0 hfy0Var7 = hfy0Var4;
                        t5 = t4;
                        c2376w1 = c2376w0;
                        hfy0Var = hfy0Var7;
                        t2 = t5;
                        hfy0Var4 = hfy0Var;
                        i = c2376w1.f10320j;
                        objM14522o = objMo14592o;
                        while (i < c2376w1.f10321k) {
                            objM14522o = c2376w1.m14522o(t2, c2376w1.f10319i[i], objM14522o, hfy0Var4, t);
                            i++;
                            c2376w1 = this;
                        }
                        t3 = t2;
                        if (objM14522o != null) {
                            hfy0Var4.mo14590m(t3, objM14522o);
                        }
                        throw th;
                    }
                    c2376w1 = c2376w0;
                    i = c2376w1.f10320j;
                    objM14522o = objMo14592o;
                    while (i < c2376w1.f10321k) {
                        objM14522o = c2376w1.m14522o(t2, c2376w1.f10319i[i], objM14522o, hfy0Var4, t);
                        i++;
                        c2376w1 = this;
                    }
                    t3 = t2;
                    if (objM14522o != null) {
                        hfy0Var4.mo14590m(t3, objM14522o);
                    }
                    throw th;
                }
                e0y0Var = e0y0Var2;
                c2368s1 = c2368s2;
                hfy0Var = hfy0Var4;
                t5 = t;
                try {
                    int iM14503E = c2376w1.m14503E(iM14516h);
                    switch ((267386880 & iM14503E) >>> 20) {
                        case 0:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149643f(t5, iM14503E & 1048575, zby0Var.zza());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 1:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149644g(t5, iM14503E & 1048575, zby0Var.zzb());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 2:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149646i(t5, iM14503E & 1048575, zby0Var.zzl());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 3:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149646i(t5, iM14503E & 1048575, zby0Var.zzo());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 4:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149645h(t5, iM14503E & 1048575, zby0Var.zzg());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 5:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149646i(t5, iM14503E & 1048575, zby0Var.zzk());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 6:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149645h(t5, iM14503E & 1048575, zby0Var.zzf());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 7:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149659v(t5, iM14503E & 1048575, zby0Var.zzs());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 8:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            c2376w0.m14525t(t5, iM14503E, zby0Var);
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 9:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            m9y0 m9y0Var = (m9y0) c2376w0.m14520m(t5, iM14516h);
                            zby0Var.mo101118n(m9y0Var, c2376w0.m14508M(iM14516h), c2368s1);
                            c2376w0.m14524s(t5, iM14516h, m9y0Var);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 10:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, zby0Var.zzp());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 11:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149645h(t5, iM14503E & 1048575, zby0Var.zzj());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 12:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            int iZze = zby0Var.zze();
                            r2y0 r2y0VarM14507L = c2376w0.m14507L(iM14516h);
                            if (r2y0VarM14507L == null || r2y0VarM14507L.zza(iZze)) {
                                kfy0.m149645h(t5, iM14503E & 1048575, iZze);
                                c2376w0.m14500B(t5, iM14516h);
                            } else {
                                objMo14592o = vcy0.m200871f(t5, iZzc, iZze, objMo14592o, hfy0Var4);
                            }
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 13:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149645h(t5, iM14503E & 1048575, zby0Var.zzh());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 14:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149646i(t5, iM14503E & 1048575, zby0Var.zzm());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 15:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149645h(t5, iM14503E & 1048575, zby0Var.zzi());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 16:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149646i(t5, iM14503E & 1048575, zby0Var.zzn());
                            c2376w0.m14500B(t5, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 17:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            m9y0 m9y0Var2 = (m9y0) c2376w0.m14520m(t5, iM14516h);
                            zby0Var.mo101119o(m9y0Var2, c2376w0.m14508M(iM14516h), c2368s1);
                            c2376w0.m14524s(t5, iM14516h, m9y0Var2);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 18:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101120p(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 19:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101115l(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 20:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101105c(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 21:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101107e(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 22:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101114k(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 23:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101111h0(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 24:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101121q(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 25:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101125u(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 26:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            boolean zM14490Q = m14490Q(iM14503E);
                            a6y0 a6y0Var = c2376w0.f10323m;
                            if (zM14490Q) {
                                zby0Var.mo101106d(a6y0Var.mo96349b(t5, iM14503E & 1048575));
                            } else {
                                zby0Var.mo101112i(a6y0Var.mo96349b(t5, iM14503E & 1048575));
                            }
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 27:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101124t(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575), c2376w0.m14508M(iM14516h), c2368s1);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 28:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101117m0(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 29:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101104b(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 30:
                            c2376w0 = c2376w1;
                            List listMo96349b = c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575);
                            zby0Var.mo101122r(listMo96349b);
                            objM200872g = vcy0.m200872g(t5, iZzc, listMo96349b, c2376w0.m14507L(iM14516h), objMo14592o, hfy0Var);
                            hfy0Var4 = hfy0Var;
                            objMo14592o = objM200872g;
                            v0y0Var = v0y0VarMo14393i;
                            c2376w1 = c2376w0;
                            v0y0VarMo14393i = v0y0Var;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            break;
                        case 31:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101116m(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 32:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101110h(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 33:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101108f(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 34:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101113j(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 35:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101120p(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 36:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101115l(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 37:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101105c(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 38:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101107e(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 39:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101114k(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 40:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101111h0(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 41:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101121q(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 42:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101125u(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 43:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101104b(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 44:
                            c2376w0 = c2376w1;
                            t4 = t5;
                            List listMo96349b2 = c2376w0.f10323m.mo96349b(t4, iM14503E & 1048575);
                            zby0Var.mo101122r(listMo96349b2);
                            r2y0 r2y0VarM14507L2 = c2376w0.m14507L(iM14516h);
                            Object obj2 = objMo14592o;
                            try {
                                objM200872g = vcy0.m200872g(t4, iZzc, listMo96349b2, r2y0VarM14507L2, obj2, hfy0Var);
                                hfy0Var4 = hfy0Var;
                                objMo14592o = objM200872g;
                                v0y0Var = v0y0VarMo14393i;
                                c2376w1 = c2376w0;
                                v0y0VarMo14393i = v0y0Var;
                                c2368s2 = c2368s1;
                                e0y0Var2 = e0y0Var;
                            } catch (zzke unused) {
                                hfy0Var3 = hfy0Var;
                                objMo14592o = obj2;
                                hfy0Var4 = hfy0Var3;
                                hfy0Var4.mo14587j(zby0Var);
                                if (objMo14592o == null) {
                                    objMo14592o = hfy0Var4.mo14592o(t4);
                                }
                                if (!hfy0Var4.m134887i(objMo14592o, zby0Var, 0)) {
                                    i2 = c2376w0.f10320j;
                                    objM14522o2 = objMo14592o;
                                    while (i2 < c2376w0.f10321k) {
                                        T t7 = t4;
                                        objM14522o2 = c2376w0.m14522o(t7, c2376w0.f10319i[i2], objM14522o2, hfy0Var4, t);
                                        i2++;
                                        t4 = t7;
                                    }
                                    t6 = t4;
                                    if (objM14522o2 != null) {
                                        hfy0Var4.mo14590m(t6, objM14522o2);
                                        return;
                                    }
                                    return;
                                }
                                c2376w1 = c2376w0;
                                c2368s2 = c2368s1;
                                e0y0Var2 = e0y0Var;
                                obj = null;
                            } catch (Throwable th6) {
                                th = th6;
                                hfy0Var2 = hfy0Var;
                                objMo14592o = obj2;
                                hfy0Var4 = hfy0Var2;
                                t2 = t4;
                                c2376w1 = c2376w0;
                                i = c2376w1.f10320j;
                                objM14522o = objMo14592o;
                                while (i < c2376w1.f10321k) {
                                    objM14522o = c2376w1.m14522o(t2, c2376w1.f10319i[i], objM14522o, hfy0Var4, t);
                                    i++;
                                    c2376w1 = this;
                                }
                                t3 = t2;
                                if (objM14522o != null) {
                                    hfy0Var4.mo14590m(t3, objM14522o);
                                }
                                throw th;
                            }
                            break;
                        case 45:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101116m(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 46:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101110h(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 47:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101108f(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 48:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101113j(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575));
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 49:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            zby0Var.mo101123s(c2376w0.f10323m.mo96349b(t5, iM14503E & 1048575), c2376w0.m14508M(iM14516h), c2368s1);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 50:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            Object objM14509O = c2376w0.m14509O(iM14516h);
                            long jM14503E = c2376w0.m14503E(iM14516h) & 1048575;
                            Object objM149633B = kfy0.m149633B(t5, jM14503E);
                            q7y0 q7y0Var = c2376w0.f10326p;
                            if (objM149633B == null) {
                                objM149633B = q7y0Var.zzb(objM14509O);
                                kfy0.m149647j(t5, jM14503E, objM149633B);
                            } else if (q7y0Var.mo114983a(objM149633B)) {
                                Object objZzb = c2376w0.f10326p.zzb(objM14509O);
                                c2376w0.f10326p.mo114985c(objZzb, objM149633B);
                                kfy0.m149647j(t5, jM14503E, objZzb);
                                objM149633B = objZzb;
                            }
                            Map<?, ?> mapMo114984b = c2376w0.f10326p.mo114984b(objM149633B);
                            c2376w0.f10326p.zza(objM14509O);
                            zby0Var.mo101109g(mapMo114984b, obj, c2368s1);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 51:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Double.valueOf(zby0Var.zza()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 52:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Float.valueOf(zby0Var.zzb()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 53:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Long.valueOf(zby0Var.zzl()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 54:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Long.valueOf(zby0Var.zzo()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 55:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Integer.valueOf(zby0Var.zzg()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 56:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Long.valueOf(zby0Var.zzk()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 57:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Integer.valueOf(zby0Var.zzf()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 58:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Boolean.valueOf(zby0Var.zzs()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 59:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            c2376w0.m14525t(t5, iM14503E, zby0Var);
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 60:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            m9y0 m9y0Var3 = (m9y0) c2376w0.m14521n(t5, iZzc, iM14516h);
                            zby0Var.mo101118n(m9y0Var3, c2376w0.m14508M(iM14516h), c2368s1);
                            c2376w0.m14523r(t5, iZzc, iM14516h, m9y0Var3);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 61:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, zby0Var.zzp());
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 62:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Integer.valueOf(zby0Var.zzj()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 63:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            int iZze2 = zby0Var.zze();
                            r2y0 r2y0VarM14507L3 = c2376w0.m14507L(iM14516h);
                            if (r2y0VarM14507L3 != null && !r2y0VarM14507L3.zza(iZze2)) {
                                objMo14592o = vcy0.m200871f(t5, iZzc, iZze2, objMo14592o, hfy0Var4);
                                v0y0Var = v0y0VarMo14393i;
                                c2376w1 = c2376w0;
                                v0y0VarMo14393i = v0y0Var;
                                c2368s2 = c2368s1;
                                e0y0Var2 = e0y0Var;
                            }
                            kfy0.m149647j(t5, iM14503E & 1048575, Integer.valueOf(iZze2));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 64:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Integer.valueOf(zby0Var.zzh()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 65:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Long.valueOf(zby0Var.zzm()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 66:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Integer.valueOf(zby0Var.zzi()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 67:
                            c2376w0 = c2376w1;
                            hfy0Var4 = hfy0Var;
                            kfy0.m149647j(t5, iM14503E & 1048575, Long.valueOf(zby0Var.zzn()));
                            c2376w0.m14501C(t5, iZzc, iM14516h);
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        case 68:
                            c2376w0 = c2376w1;
                            t4 = t5;
                            hfy0Var4 = hfy0Var;
                            try {
                                m9y0 m9y0Var4 = (m9y0) c2376w0.m14521n(t4, iZzc, iM14516h);
                                zby0Var.mo101119o(m9y0Var4, c2376w0.m14508M(iM14516h), c2368s1);
                                c2376w0.m14523r(t4, iZzc, iM14516h, m9y0Var4);
                            } catch (zzke unused2) {
                                hfy0Var4.mo14587j(zby0Var);
                                if (objMo14592o == null) {
                                    objMo14592o = hfy0Var4.mo14592o(t4);
                                }
                                if (!hfy0Var4.m134887i(objMo14592o, zby0Var, 0)) {
                                    i2 = c2376w0.f10320j;
                                    objM14522o2 = objMo14592o;
                                    while (i2 < c2376w0.f10321k) {
                                        T t8 = t4;
                                        objM14522o2 = c2376w0.m14522o(t8, c2376w0.f10319i[i2], objM14522o2, hfy0Var4, t);
                                        i2++;
                                        t4 = t8;
                                    }
                                    t6 = t4;
                                    if (objM14522o2 != null) {
                                        hfy0Var4.mo14590m(t6, objM14522o2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            c2376w1 = c2376w0;
                            c2368s2 = c2368s1;
                            e0y0Var2 = e0y0Var;
                            obj = null;
                            break;
                        default:
                            if (objMo14592o == null) {
                                try {
                                    objMo14592o = hfy0Var.mo14592o(t5);
                                } catch (zzke unused3) {
                                    hfy0Var3 = hfy0Var;
                                    c2376w0 = c2376w1;
                                    t4 = t5;
                                    hfy0Var4 = hfy0Var3;
                                    hfy0Var4.mo14587j(zby0Var);
                                    if (objMo14592o == null) {
                                        objMo14592o = hfy0Var4.mo14592o(t4);
                                    }
                                    if (!hfy0Var4.m134887i(objMo14592o, zby0Var, 0)) {
                                        i2 = c2376w0.f10320j;
                                        objM14522o2 = objMo14592o;
                                        while (i2 < c2376w0.f10321k) {
                                            T t9 = t4;
                                            objM14522o2 = c2376w0.m14522o(t9, c2376w0.f10319i[i2], objM14522o2, hfy0Var4, t);
                                            i2++;
                                            t4 = t9;
                                        }
                                        t6 = t4;
                                        if (objM14522o2 != null) {
                                            hfy0Var4.mo14590m(t6, objM14522o2);
                                            return;
                                        }
                                        return;
                                    }
                                    c2376w1 = c2376w0;
                                    c2368s2 = c2368s1;
                                    e0y0Var2 = e0y0Var;
                                    obj = null;
                                }
                            }
                            try {
                                if (!hfy0Var.m134887i(objMo14592o, zby0Var, 0)) {
                                    int i5 = c2376w1.f10320j;
                                    Object objM14522o5 = objMo14592o;
                                    while (i5 < c2376w1.f10321k) {
                                        T t10 = t5;
                                        hfy0 hfy0Var8 = hfy0Var;
                                        objM14522o5 = c2376w1.m14522o(t10, c2376w1.f10319i[i5], objM14522o5, hfy0Var8, t);
                                        i5++;
                                        t5 = t10;
                                        c2376w1 = c2376w1;
                                        hfy0Var = hfy0Var8;
                                    }
                                    T t11 = t5;
                                    hfy0 hfy0Var9 = hfy0Var;
                                    if (objM14522o5 != null) {
                                        hfy0Var9.mo14590m(t11, objM14522o5);
                                        return;
                                    }
                                    return;
                                }
                                c2376w0 = c2376w1;
                                hfy0Var4 = hfy0Var;
                                v0y0Var = v0y0VarMo14393i;
                                c2376w1 = c2376w0;
                                v0y0VarMo14393i = v0y0Var;
                                c2368s2 = c2368s1;
                                e0y0Var2 = e0y0Var;
                            } catch (Throwable th7) {
                                th = th7;
                                hfy0Var2 = hfy0Var;
                                c2376w0 = c2376w1;
                                t4 = t5;
                                hfy0Var4 = hfy0Var2;
                                t2 = t4;
                                c2376w1 = c2376w0;
                                i = c2376w1.f10320j;
                                objM14522o = objMo14592o;
                                while (i < c2376w1.f10321k) {
                                    objM14522o = c2376w1.m14522o(t2, c2376w1.f10319i[i], objM14522o, hfy0Var4, t);
                                    i++;
                                    c2376w1 = this;
                                }
                                t3 = t2;
                                if (objM14522o != null) {
                                    hfy0Var4.mo14590m(t3, objM14522o);
                                }
                                throw th;
                            }
                            break;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    t2 = t5;
                    hfy0Var4 = hfy0Var;
                    i = c2376w1.f10320j;
                    objM14522o = objMo14592o;
                    while (i < c2376w1.f10321k) {
                        objM14522o = c2376w1.m14522o(t2, c2376w1.f10319i[i], objM14522o, hfy0Var4, t);
                        i++;
                        c2376w1 = this;
                    }
                    t3 = t2;
                    if (objM14522o != null) {
                        hfy0Var4.mo14590m(t3, objM14522o);
                    }
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                t2 = t;
            }
        }
    }

    @Override // p153l.ocy0
    /* JADX INFO: renamed from: e */
    public final void mo14514e(T t, byte[] bArr, int i, int i2, nvx0 nvx0Var) throws IOException {
        m14518j(t, bArr, i, i2, 0, nvx0Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // p153l.ocy0
    /* JADX INFO: renamed from: f */
    public final boolean mo14515f(T t, T t2) {
        int length = this.f10311a.length;
        int i = 0;
        while (true) {
            boolean zM200881p = true;
            if (i >= length) {
                if (!this.f10324n.mo14594q(t).equals(this.f10324n.mo14594q(t2))) {
                    return false;
                }
                if (this.f10316f) {
                    return this.f10325o.mo14388d(t).equals(this.f10325o.mo14388d(t2));
                }
                return true;
            }
            int iM14503E = m14503E(i);
            long j = iM14503E & 1048575;
            switch ((iM14503E & 267386880) >>> 20) {
                case 0:
                    if (!m14506J(t, t2, i) || Double.doubleToLongBits(kfy0.m149638a(t, j)) != Double.doubleToLongBits(kfy0.m149638a(t2, j))) {
                        zM200881p = false;
                    }
                    break;
                case 1:
                    if (!m14506J(t, t2, i) || Float.floatToIntBits(kfy0.m149651n(t, j)) != Float.floatToIntBits(kfy0.m149651n(t2, j))) {
                        zM200881p = false;
                    }
                    break;
                case 2:
                    if (!m14506J(t, t2, i) || kfy0.m149661x(t, j) != kfy0.m149661x(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 3:
                    if (!m14506J(t, t2, i) || kfy0.m149661x(t, j) != kfy0.m149661x(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 4:
                    if (!m14506J(t, t2, i) || kfy0.m149657t(t, j) != kfy0.m149657t(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 5:
                    if (!m14506J(t, t2, i) || kfy0.m149661x(t, j) != kfy0.m149661x(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 6:
                    if (!m14506J(t, t2, i) || kfy0.m149657t(t, j) != kfy0.m149657t(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 7:
                    if (!m14506J(t, t2, i) || kfy0.m149637F(t, j) != kfy0.m149637F(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 8:
                    if (!m14506J(t, t2, i) || !vcy0.m200881p(kfy0.m149633B(t, j), kfy0.m149633B(t2, j))) {
                        zM200881p = false;
                    }
                    break;
                case 9:
                    if (!m14506J(t, t2, i) || !vcy0.m200881p(kfy0.m149633B(t, j), kfy0.m149633B(t2, j))) {
                        zM200881p = false;
                    }
                    break;
                case 10:
                    if (!m14506J(t, t2, i) || !vcy0.m200881p(kfy0.m149633B(t, j), kfy0.m149633B(t2, j))) {
                        zM200881p = false;
                    }
                    break;
                case 11:
                    if (!m14506J(t, t2, i) || kfy0.m149657t(t, j) != kfy0.m149657t(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 12:
                    if (!m14506J(t, t2, i) || kfy0.m149657t(t, j) != kfy0.m149657t(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 13:
                    if (!m14506J(t, t2, i) || kfy0.m149657t(t, j) != kfy0.m149657t(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 14:
                    if (!m14506J(t, t2, i) || kfy0.m149661x(t, j) != kfy0.m149661x(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 15:
                    if (!m14506J(t, t2, i) || kfy0.m149657t(t, j) != kfy0.m149657t(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 16:
                    if (!m14506J(t, t2, i) || kfy0.m149661x(t, j) != kfy0.m149661x(t2, j)) {
                        zM200881p = false;
                    }
                    break;
                case 17:
                    if (!m14506J(t, t2, i) || !vcy0.m200881p(kfy0.m149633B(t, j), kfy0.m149633B(t2, j))) {
                        zM200881p = false;
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
                    zM200881p = vcy0.m200881p(kfy0.m149633B(t, j), kfy0.m149633B(t2, j));
                    break;
                case 50:
                    zM200881p = vcy0.m200881p(kfy0.m149633B(t, j), kfy0.m149633B(t2, j));
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
                    long jM14499A = m14499A(i) & 1048575;
                    if (kfy0.m149657t(t, jM14499A) != kfy0.m149657t(t2, jM14499A) || !vcy0.m200881p(kfy0.m149633B(t, j), kfy0.m149633B(t2, j))) {
                        zM200881p = false;
                    }
                    break;
            }
            if (!zM200881p) {
                return false;
            }
            i += 3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m14516h(int i) {
        if (i < this.f10313c || i > this.f10314d) {
            return -1;
        }
        return m14517i(i, 0);
    }

    /* JADX INFO: renamed from: i */
    public final int m14517i(int i, int i2) {
        int length = (this.f10311a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f10311a[i4];
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
    public final int m14518j(T r32, byte[] r33, int r34, int r35, int r36, p153l.nvx0 r37) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2376w0.m14518j(java.lang.Object, byte[], int, int, int, l.nvx0):int");
    }

    /* JADX INFO: renamed from: l */
    public final <K, V, UT, UB> UB m14519l(int i, int i2, Map<K, V> map, r2y0 r2y0Var, UB ub, hfy0<UT, UB> hfy0Var, Object obj) {
        this.f10326p.zza(m14509O(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!r2y0Var.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = hfy0Var.mo14592o(obj);
                }
                C2364q0 c2364q0Zzc = zzik.zzc(m7y0.m157349a(null, next.getKey(), next.getValue()));
                try {
                    m7y0.m157350b(c2364q0Zzc.m14331b(), null, next.getKey(), next.getValue());
                    hfy0Var.mo14584f(ub, i2, c2364q0Zzc.m14330a());
                    it.remove();
                } catch (IOException e) {
                    iig0.m140070a(e);
                    return null;
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final Object m14520m(T t, int i) {
        ocy0 ocy0VarM14508M = m14508M(i);
        long jM14503E = m14503E(i) & 1048575;
        if (!m14504H(t, i)) {
            return ocy0VarM14508M.zza();
        }
        Object object = f10310r.getObject(t, jM14503E);
        if (m14491R(object)) {
            return object;
        }
        Object objZza = ocy0VarM14508M.zza();
        if (object != null) {
            ocy0VarM14508M.mo14512c(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final Object m14521n(T t, int i, int i2) {
        ocy0 ocy0VarM14508M = m14508M(i2);
        if (!m14505I(t, i, i2)) {
            return ocy0VarM14508M.zza();
        }
        Object object = f10310r.getObject(t, m14503E(i2) & 1048575);
        if (m14491R(object)) {
            return object;
        }
        Object objZza = ocy0VarM14508M.zza();
        if (object != null) {
            ocy0VarM14508M.mo14512c(objZza, object);
        }
        return objZza;
    }

    /* JADX INFO: renamed from: o */
    public final <UT, UB> UB m14522o(Object obj, int i, UB ub, hfy0<UT, UB> hfy0Var, Object obj2) {
        r2y0 r2y0VarM14507L;
        int i2 = this.f10311a[i];
        Object objM149633B = kfy0.m149633B(obj, m14503E(i) & 1048575);
        return (objM149633B == null || (r2y0VarM14507L = m14507L(i)) == null) ? ub : (UB) m14519l(i, i2, this.f10326p.mo114984b(objM149633B), r2y0VarM14507L, ub, hfy0Var, obj2);
    }

    /* JADX INFO: renamed from: r */
    public final void m14523r(T t, int i, int i2, Object obj) {
        f10310r.putObject(t, m14503E(i2) & 1048575, obj);
        m14501C(t, i, i2);
    }

    /* JADX INFO: renamed from: s */
    public final void m14524s(T t, int i, Object obj) {
        f10310r.putObject(t, m14503E(i) & 1048575, obj);
        m14500B(t, i);
    }

    /* JADX INFO: renamed from: t */
    public final void m14525t(Object obj, int i, zby0 zby0Var) throws IOException {
        if (m14490Q(i)) {
            kfy0.m149647j(obj, i & 1048575, zby0Var.zzr());
        } else if (this.f10317g) {
            kfy0.m149647j(obj, i & 1048575, zby0Var.mo101103a());
        } else {
            kfy0.m149647j(obj, i & 1048575, zby0Var.zzp());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final void m14526u(T t, T t2, int i) {
        if (m14504H(t2, i)) {
            long jM14503E = m14503E(i) & 1048575;
            Unsafe unsafe = f10310r;
            Object object = unsafe.getObject(t2, jM14503E);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f10311a[i] + " is present but null: " + String.valueOf(t2));
            }
            ocy0 ocy0VarM14508M = m14508M(i);
            if (!m14504H(t, i)) {
                if (m14491R(object)) {
                    Object objZza = ocy0VarM14508M.zza();
                    ocy0VarM14508M.mo14512c(objZza, object);
                    unsafe.putObject(t, jM14503E, objZza);
                } else {
                    unsafe.putObject(t, jM14503E, object);
                }
                m14500B(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jM14503E);
            if (!m14491R(object2)) {
                Object objZza2 = ocy0VarM14508M.zza();
                ocy0VarM14508M.mo14512c(objZza2, object2);
                unsafe.putObject(t, jM14503E, objZza2);
                object2 = objZza2;
            }
            ocy0VarM14508M.mo14512c(object2, object);
        }
    }

    /* JADX INFO: renamed from: w */
    public final <K, V> void m14527w(shy0 shy0Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f10326p.zza(m14509O(i2));
            shy0Var.mo185966M(i, null, this.f10326p.zzd(obj));
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m14528x(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m14504H(t, i);
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
    @Override // p153l.ocy0
    public final int zza(T t) {
        int i;
        int iM14706e;
        int iM14708f;
        int iM14703c0;
        int iM200842B;
        int iM14728w0;
        int iM14732z0;
        C2376w0<T> c2376w0 = this;
        T t2 = t;
        Unsafe unsafe = f10310r;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i4 < c2376w0.f10311a.length) {
            int iM14503E = c2376w0.m14503E(i4);
            int i8 = (267386880 & iM14503E) >>> 20;
            int[] iArr = c2376w0.f10311a;
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
            long j = iM14503E & i3;
            if (i8 >= zzjn.zza.zza()) {
                zzjn.zzb.zza();
            }
            int i12 = i6;
            switch (i8) {
                case 0:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14706e = zzjc.m14706e(i9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 1:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14708f = zzjc.m14708f(i9, 0.0f);
                        i6 = i12 + iM14708f;
                        c2376w0 = this;
                        t2 = t;
                    }
                    c2376w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 2:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14703c0 = zzjc.m14703c0(i9, unsafe.getLong(t2, j));
                        i6 = i12 + iM14703c0;
                        c2376w0 = this;
                    }
                    c2376w0 = this;
                    i6 = i12;
                    break;
                case 3:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14703c0 = zzjc.m14724q0(i9, unsafe.getLong(t2, j));
                        i6 = i12 + iM14703c0;
                        c2376w0 = this;
                    }
                    c2376w0 = this;
                    i6 = i12;
                    break;
                case 4:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14703c0 = zzjc.m14723p0(i9, unsafe.getInt(t2, j));
                        i6 = i12 + iM14703c0;
                        c2376w0 = this;
                    }
                    c2376w0 = this;
                    i6 = i12;
                    break;
                case 5:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14708f = zzjc.m14695T(i9, 0L);
                        i6 = i12 + iM14708f;
                        c2376w0 = this;
                        t2 = t;
                    }
                    c2376w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 6:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14708f = zzjc.m14719l0(i9, 0);
                        i6 = i12 + iM14708f;
                        c2376w0 = this;
                        t2 = t;
                    }
                    c2376w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 7:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14708f = zzjc.m14689D(i9, true);
                        i6 = i12 + iM14708f;
                        c2376w0 = this;
                        t2 = t;
                    }
                    c2376w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 8:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        Object object = unsafe.getObject(t2, j);
                        iM14703c0 = object instanceof zzik ? zzjc.m14696U(i9, (zzik) object) : zzjc.m14731z(i9, (String) object);
                        i6 = i12 + iM14703c0;
                        c2376w0 = this;
                    }
                    c2376w0 = this;
                    i6 = i12;
                    break;
                case 9:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14706e = vcy0.m200866a(i9, unsafe.getObject(t2, j), c2376w0.m14508M(i4));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 10:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14703c0 = zzjc.m14696U(i9, (zzik) unsafe.getObject(t2, j));
                        i6 = i12 + iM14703c0;
                        c2376w0 = this;
                    }
                    c2376w0 = this;
                    i6 = i12;
                    break;
                case 11:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14703c0 = zzjc.m14686A0(i9, unsafe.getInt(t2, j));
                        i6 = i12 + iM14703c0;
                        c2376w0 = this;
                    }
                    c2376w0 = this;
                    i6 = i12;
                    break;
                case 12:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14703c0 = zzjc.m14712h0(i9, unsafe.getInt(t2, j));
                        i6 = i12 + iM14703c0;
                        c2376w0 = this;
                    }
                    c2376w0 = this;
                    i6 = i12;
                    break;
                case 13:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14708f = zzjc.m14727t0(i9, 0);
                        i6 = i12 + iM14708f;
                        c2376w0 = this;
                        t2 = t;
                    }
                    c2376w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 14:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14708f = zzjc.m14714i0(i9, 0L);
                        i6 = i12 + iM14708f;
                        c2376w0 = this;
                        t2 = t;
                    }
                    c2376w0 = this;
                    t2 = t;
                    i6 = i12;
                    break;
                case 15:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14703c0 = zzjc.m14729x0(i9, unsafe.getInt(t2, j));
                        i6 = i12 + iM14703c0;
                        c2376w0 = this;
                    }
                    c2376w0 = this;
                    i6 = i12;
                    break;
                case 16:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14703c0 = zzjc.m14720m0(i9, unsafe.getLong(t2, j));
                        i6 = i12 + iM14703c0;
                        c2376w0 = this;
                    }
                    c2376w0 = this;
                    i6 = i12;
                    break;
                case 17:
                    if (c2376w0.m14528x(t2, i4, i7, i5, i)) {
                        iM14706e = zzjc.m14688C(i9, (m9y0) unsafe.getObject(t2, j), c2376w0.m14508M(i4));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 18:
                    iM14706e = vcy0.m200841A(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 19:
                    iM14706e = vcy0.m200889x(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 20:
                    iM14706e = vcy0.m200847G(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 21:
                    iM14706e = vcy0.m200859S(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 22:
                    iM14706e = vcy0.m200844D(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 23:
                    iM14706e = vcy0.m200841A(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 24:
                    iM14706e = vcy0.m200889x(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 25:
                    iM14706e = vcy0.m200869d(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 26:
                    iM14706e = vcy0.m200882q(i9, (List) unsafe.getObject(t2, j));
                    i6 = i12 + iM14706e;
                    break;
                case 27:
                    iM14706e = vcy0.m200883r(i9, (List) unsafe.getObject(t2, j), c2376w0.m14508M(i4));
                    i6 = i12 + iM14706e;
                    break;
                case 28:
                    iM14706e = vcy0.m200867b(i9, (List) unsafe.getObject(t2, j));
                    i6 = i12 + iM14706e;
                    break;
                case 29:
                    iM14706e = vcy0.m200856P(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 30:
                    iM14706e = vcy0.m200884s(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 31:
                    iM14706e = vcy0.m200889x(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 32:
                    iM14706e = vcy0.m200841A(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 33:
                    iM14706e = vcy0.m200850J(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 34:
                    iM14706e = vcy0.m200853M(i9, (List) unsafe.getObject(t2, j), false);
                    i6 = i12 + iM14706e;
                    break;
                case 35:
                    iM200842B = vcy0.m200842B((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 36:
                    iM200842B = vcy0.m200890y((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 37:
                    iM200842B = vcy0.m200848H((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 38:
                    iM200842B = vcy0.m200860T((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 39:
                    iM200842B = vcy0.m200845E((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 40:
                    iM200842B = vcy0.m200842B((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 41:
                    iM200842B = vcy0.m200890y((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 42:
                    iM200842B = vcy0.m200870e((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 43:
                    iM200842B = vcy0.m200857Q((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 44:
                    iM200842B = vcy0.m200885t((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 45:
                    iM200842B = vcy0.m200890y((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 46:
                    iM200842B = vcy0.m200842B((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 47:
                    iM200842B = vcy0.m200851K((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 48:
                    iM200842B = vcy0.m200854N((List) unsafe.getObject(t2, j));
                    if (iM200842B > 0) {
                        iM14728w0 = zzjc.m14728w0(i9);
                        iM14732z0 = zzjc.m14732z0(iM200842B);
                        i6 = i12 + iM14728w0 + iM14732z0 + iM200842B;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 49:
                    iM14706e = vcy0.m200868c(i9, (List) unsafe.getObject(t2, j), c2376w0.m14508M(i4));
                    i6 = i12 + iM14706e;
                    break;
                case 50:
                    iM14706e = c2376w0.f10326p.mo114987e(i9, unsafe.getObject(t2, j), c2376w0.m14509O(i4));
                    i6 = i12 + iM14706e;
                    break;
                case 51:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14706e(i9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 52:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14708f(i9, 0.0f);
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 53:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14703c0(i9, m14487K(t2, j));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 54:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14724q0(i9, m14487K(t2, j));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 55:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14723p0(i9, m14485F(t2, j));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 56:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14695T(i9, 0L);
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 57:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14719l0(i9, 0);
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 58:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14689D(i9, true);
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 59:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        Object object2 = unsafe.getObject(t2, j);
                        iM14706e = object2 instanceof zzik ? zzjc.m14696U(i9, (zzik) object2) : zzjc.m14731z(i9, (String) object2);
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 60:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = vcy0.m200866a(i9, unsafe.getObject(t2, j), c2376w0.m14508M(i4));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 61:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14696U(i9, (zzik) unsafe.getObject(t2, j));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 62:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14686A0(i9, m14485F(t2, j));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 63:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14712h0(i9, m14485F(t2, j));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 64:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14727t0(i9, 0);
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 65:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14714i0(i9, 0L);
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 66:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14729x0(i9, m14485F(t2, j));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 67:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14720m0(i9, m14487K(t2, j));
                        i6 = i12 + iM14706e;
                    } else {
                        i6 = i12;
                    }
                    break;
                case 68:
                    if (c2376w0.m14505I(t2, i9, i4)) {
                        iM14706e = zzjc.m14688C(i9, (m9y0) unsafe.getObject(t2, j), c2376w0.m14508M(i4));
                        i6 = i12 + iM14706e;
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
        hfy0<?, ?> hfy0Var = c2376w0.f10324n;
        int iMo14579a = i6 + hfy0Var.mo14579a(hfy0Var.mo14594q(t2));
        if (!c2376w0.f10316f) {
            return iMo14579a;
        }
        v0y0<T> v0y0VarMo14388d = c2376w0.f10325o.mo14388d(t2);
        int iM185401a = v0y0VarMo14388d.f181911a.m185401a();
        int iM198947e = 0;
        while (true) {
            scy0<T, Object> scy0Var = v0y0VarMo14388d.f181911a;
            if (i2 >= iM185401a) {
                for (Map.Entry entry : scy0Var.m185405g()) {
                    iM198947e += v0y0.m198947e((e1y0) entry.getKey(), entry.getValue());
                }
                return iMo14579a + iM198947e;
            }
            Map.Entry entryM185404f = scy0Var.m185404f(i2);
            iM198947e += v0y0.m198947e((e1y0) entryM185404f.getKey(), entryM185404f.getValue());
            i2++;
        }
    }

    @Override // p153l.ocy0
    public final int zzb(T t) {
        int i;
        int iM138250b;
        int length = this.f10311a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iM14503E = m14503E(i3);
            int i4 = this.f10311a[i3];
            long j = 1048575 & iM14503E;
            int iHashCode = 37;
            switch ((iM14503E & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iM138250b = i2y0.m138250b(Double.doubleToLongBits(kfy0.m149638a(t, j)));
                    i2 = i + iM138250b;
                    break;
                case 1:
                    i = i2 * 53;
                    iM138250b = Float.floatToIntBits(kfy0.m149651n(t, j));
                    i2 = i + iM138250b;
                    break;
                case 2:
                    i = i2 * 53;
                    iM138250b = i2y0.m138250b(kfy0.m149661x(t, j));
                    i2 = i + iM138250b;
                    break;
                case 3:
                    i = i2 * 53;
                    iM138250b = i2y0.m138250b(kfy0.m149661x(t, j));
                    i2 = i + iM138250b;
                    break;
                case 4:
                    i = i2 * 53;
                    iM138250b = kfy0.m149657t(t, j);
                    i2 = i + iM138250b;
                    break;
                case 5:
                    i = i2 * 53;
                    iM138250b = i2y0.m138250b(kfy0.m149661x(t, j));
                    i2 = i + iM138250b;
                    break;
                case 6:
                    i = i2 * 53;
                    iM138250b = kfy0.m149657t(t, j);
                    i2 = i + iM138250b;
                    break;
                case 7:
                    i = i2 * 53;
                    iM138250b = i2y0.m138251c(kfy0.m149637F(t, j));
                    i2 = i + iM138250b;
                    break;
                case 8:
                    i = i2 * 53;
                    iM138250b = ((String) kfy0.m149633B(t, j)).hashCode();
                    i2 = i + iM138250b;
                    break;
                case 9:
                    Object objM149633B = kfy0.m149633B(t, j);
                    if (objM149633B != null) {
                        iHashCode = objM149633B.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iM138250b = kfy0.m149633B(t, j).hashCode();
                    i2 = i + iM138250b;
                    break;
                case 11:
                    i = i2 * 53;
                    iM138250b = kfy0.m149657t(t, j);
                    i2 = i + iM138250b;
                    break;
                case 12:
                    i = i2 * 53;
                    iM138250b = kfy0.m149657t(t, j);
                    i2 = i + iM138250b;
                    break;
                case 13:
                    i = i2 * 53;
                    iM138250b = kfy0.m149657t(t, j);
                    i2 = i + iM138250b;
                    break;
                case 14:
                    i = i2 * 53;
                    iM138250b = i2y0.m138250b(kfy0.m149661x(t, j));
                    i2 = i + iM138250b;
                    break;
                case 15:
                    i = i2 * 53;
                    iM138250b = kfy0.m149657t(t, j);
                    i2 = i + iM138250b;
                    break;
                case 16:
                    i = i2 * 53;
                    iM138250b = i2y0.m138250b(kfy0.m149661x(t, j));
                    i2 = i + iM138250b;
                    break;
                case 17:
                    Object objM149633B2 = kfy0.m149633B(t, j);
                    if (objM149633B2 != null) {
                        iHashCode = objM149633B2.hashCode();
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
                    iM138250b = kfy0.m149633B(t, j).hashCode();
                    i2 = i + iM138250b;
                    break;
                case 50:
                    i = i2 * 53;
                    iM138250b = kfy0.m149633B(t, j).hashCode();
                    i2 = i + iM138250b;
                    break;
                case 51:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = i2y0.m138250b(Double.doubleToLongBits(m14492g(t, j)));
                        i2 = i + iM138250b;
                    }
                    break;
                case 52:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = Float.floatToIntBits(m14498z(t, j));
                        i2 = i + iM138250b;
                    }
                    break;
                case 53:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = i2y0.m138250b(m14487K(t, j));
                        i2 = i + iM138250b;
                    }
                    break;
                case 54:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = i2y0.m138250b(m14487K(t, j));
                        i2 = i + iM138250b;
                    }
                    break;
                case 55:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = m14485F(t, j);
                        i2 = i + iM138250b;
                    }
                    break;
                case 56:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = i2y0.m138250b(m14487K(t, j));
                        i2 = i + iM138250b;
                    }
                    break;
                case 57:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = m14485F(t, j);
                        i2 = i + iM138250b;
                    }
                    break;
                case 58:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = i2y0.m138251c(m14488N(t, j));
                        i2 = i + iM138250b;
                    }
                    break;
                case 59:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = ((String) kfy0.m149633B(t, j)).hashCode();
                        i2 = i + iM138250b;
                    }
                    break;
                case 60:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = kfy0.m149633B(t, j).hashCode();
                        i2 = i + iM138250b;
                    }
                    break;
                case 61:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = kfy0.m149633B(t, j).hashCode();
                        i2 = i + iM138250b;
                    }
                    break;
                case 62:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = m14485F(t, j);
                        i2 = i + iM138250b;
                    }
                    break;
                case 63:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = m14485F(t, j);
                        i2 = i + iM138250b;
                    }
                    break;
                case 64:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = m14485F(t, j);
                        i2 = i + iM138250b;
                    }
                    break;
                case 65:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = i2y0.m138250b(m14487K(t, j));
                        i2 = i + iM138250b;
                    }
                    break;
                case 66:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = m14485F(t, j);
                        i2 = i + iM138250b;
                    }
                    break;
                case 67:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = i2y0.m138250b(m14487K(t, j));
                        i2 = i + iM138250b;
                    }
                    break;
                case 68:
                    if (m14505I(t, i4, i3)) {
                        i = i2 * 53;
                        iM138250b = kfy0.m149633B(t, j).hashCode();
                        i2 = i + iM138250b;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.f10324n.mo14594q(t).hashCode();
        return this.f10316f ? (iHashCode2 * 53) + this.f10325o.mo14388d(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ocy0
    public final void zzd(T t) {
        if (m14491R(t)) {
            if (t instanceof AbstractC2372u0) {
                AbstractC2372u0 abstractC2372u0 = (AbstractC2372u0) t;
                abstractC2372u0.mo14307f(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                abstractC2372u0.zza = 0;
                abstractC2372u0.m14420z();
            }
            int length = this.f10311a.length;
            for (int i = 0; i < length; i += 3) {
                int iM14503E = m14503E(i);
                long j = 1048575 & iM14503E;
                int i2 = (iM14503E & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 17:
                                if (m14504H(t, i)) {
                                    m14508M(i).zzd(f10310r.getObject(t, j));
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
                                this.f10323m.mo96350c(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = f10310r;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.f10326p.mo114986d(object));
                                }
                                break;
                        }
                    } else if (m14505I(t, this.f10311a[i], i)) {
                        m14508M(i).zzd(f10310r.getObject(t, j));
                    }
                } else if (m14504H(t, i)) {
                    m14508M(i).zzd(f10310r.getObject(t, j));
                }
            }
            this.f10324n.mo14596s(t);
            if (this.f10316f) {
                this.f10325o.mo14394j(t);
            }
        }
    }

    @Override // p153l.ocy0
    public final T zza() {
        return (T) this.f10322l.zza(this.f10315e);
    }
}
