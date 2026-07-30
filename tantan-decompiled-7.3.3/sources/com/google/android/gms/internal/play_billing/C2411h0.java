package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.cvx0;
import p153l.czx0;
import p153l.dtx0;
import p153l.efx0;
import p153l.fig0;
import p153l.grx0;
import p153l.gxx0;
import p153l.hkx0;
import p153l.ikx0;
import p153l.k0y0;
import p153l.lvx0;
import p153l.o0y0;
import p153l.o2y0;
import p153l.orx0;
import p153l.pxx0;
import p153l.q1y0;
import p153l.sax0;
import p153l.srx0;
import p153l.twx0;
import p153l.uxx0;
import p153l.uzx0;
import p153l.wg3;
import p153l.yjx0;
import p153l.ypw0;
import p153l.yvx0;
import p153l.zix0;
import p153l.zsx0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2411h0<T> implements uxx0<T> {

    /* JADX INFO: renamed from: l */
    public static final int[] f10369l = new int[0];

    /* JADX INFO: renamed from: m */
    public static final Unsafe f10370m = q1y0.m174946l();

    /* JADX INFO: renamed from: a */
    public final int[] f10371a;

    /* JADX INFO: renamed from: b */
    public final Object[] f10372b;

    /* JADX INFO: renamed from: c */
    public final int f10373c;

    /* JADX INFO: renamed from: d */
    public final int f10374d;

    /* JADX INFO: renamed from: e */
    public final yvx0 f10375e;

    /* JADX INFO: renamed from: f */
    public final boolean f10376f;

    /* JADX INFO: renamed from: g */
    public final int[] f10377g;

    /* JADX INFO: renamed from: h */
    public final int f10378h;

    /* JADX INFO: renamed from: i */
    public final int f10379i;

    /* JADX INFO: renamed from: j */
    public final k0y0 f10380j;

    /* JADX INFO: renamed from: k */
    public final efx0 f10381k;

    public C2411h0(int[] iArr, Object[] objArr, int i, int i2, yvx0 yvx0Var, boolean z, int[] iArr2, int i3, int i4, twx0 twx0Var, dtx0 dtx0Var, k0y0 k0y0Var, efx0 efx0Var, cvx0 cvx0Var) {
        this.f10371a = iArr;
        this.f10372b = objArr;
        this.f10373c = i;
        this.f10374d = i2;
        boolean z2 = false;
        if (efx0Var != null && (yvx0Var instanceof AbstractC2401c0)) {
            z2 = true;
        }
        this.f10376f = z2;
        this.f10377g = iArr2;
        this.f10378h = i3;
        this.f10379i = i4;
        this.f10380j = k0y0Var;
        this.f10381k = efx0Var;
        this.f10375e = yvx0Var;
    }

    /* JADX INFO: renamed from: C */
    public static int m14847C(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: E */
    public static long m14848E(Object obj, long j) {
        return ((Long) q1y0.m174945k(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: K */
    public static Field m14849K(Class cls, String str) {
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

    /* JADX INFO: renamed from: f */
    public static void m14850f(Object obj) {
        if (m14852q(obj)) {
            return;
        }
        wg3.m206174a("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m14851p(Object obj, int i, uxx0 uxx0Var) {
        return uxx0Var.mo14870c(q1y0.m174945k(obj, i & 1048575));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m14852q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2403d0) {
            return ((AbstractC2403d0) obj).m14822e();
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m14853s(Object obj, long j) {
        return ((Boolean) q1y0.m174945k(obj, j)).booleanValue();
    }

    /* JADX INFO: renamed from: t */
    public static final void m14854t(int i, Object obj, o2y0 o2y0Var) throws IOException {
        if (obj instanceof String) {
            o2y0Var.mo165814j(i, (String) obj);
        } else {
            o2y0Var.mo165829y(i, (zzgk) obj);
        }
    }

    /* JADX INFO: renamed from: v */
    public static o0y0 m14855v(Object obj) {
        AbstractC2403d0 abstractC2403d0 = (AbstractC2403d0) obj;
        o0y0 o0y0Var = abstractC2403d0.zzc;
        if (o0y0Var != o0y0.m165555c()) {
            return o0y0Var;
        }
        o0y0 o0y0VarM165557f = o0y0.m165557f();
        abstractC2403d0.zzc = o0y0VarM165557f;
        return o0y0VarM165557f;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    /* JADX INFO: renamed from: w */
    public static C2411h0 m14856w(Class cls, lvx0 lvx0Var, twx0 twx0Var, dtx0 dtx0Var, k0y0 k0y0Var, efx0 efx0Var, cvx0 cvx0Var) {
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
        Field fieldM14849K;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldM14849K2;
        int i27;
        Object obj2;
        Field fieldM14849K3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(lvx0Var instanceof pxx0)) {
            throw null;
        }
        pxx0 pxx0Var = (pxx0) lvx0Var;
        String strM174253a = pxx0Var.m174253a();
        int length = strM174253a.length();
        char c2 = 55296;
        if (strM174253a.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strM174253a.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strM174253a.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strM174253a.charAt(i33);
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
            iArr = f10369l;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strM174253a.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strM174253a.charAt(i36);
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
            int iCharAt4 = strM174253a.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strM174253a.charAt(i39);
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
            int iCharAt5 = strM174253a.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strM174253a.charAt(i42);
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
            int iCharAt6 = strM174253a.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strM174253a.charAt(i45);
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
            iCharAt = strM174253a.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strM174253a.charAt(i48);
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
            int iCharAt7 = strM174253a.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strM174253a.charAt(i51);
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
            int iCharAt8 = strM174253a.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strM174253a.charAt(i54);
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
            int iCharAt9 = strM174253a.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strM174253a.charAt(i57);
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
        Unsafe unsafe = f10370m;
        Object[] objArrM174254b = pxx0Var.m174254b();
        Class<?> cls2 = pxx0Var.zza().getClass();
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
            int iCharAt10 = strM174253a.charAt(i33);
            if (iCharAt10 >= c2) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = strM174253a.charAt(i70);
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
            int iCharAt11 = strM174253a.charAt(i16);
            if (iCharAt11 >= c2) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i29 = i74 + 1;
                    cCharAt11 = strM174253a.charAt(i74);
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
            pxx0 pxx0Var2 = pxx0Var;
            int i77 = iCharAt11 & 2048;
            if (i76 >= 51) {
                int i78 = i17 + 1;
                int iCharAt12 = strM174253a.charAt(i17);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        cCharAt10 = strM174253a.charAt(i80);
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
                    objArr[i84 + i84 + 1] = objArrM174254b[i6];
                } else {
                    if (i83 != 12) {
                        i25 = i77;
                    } else if (pxx0Var2.zzc() == 1 || i77 != 0) {
                        i24 = i6 + 1;
                        int i85 = i66 / 3;
                        objArr[i85 + i85 + 1] = objArrM174254b[i6];
                    } else {
                        i25 = 0;
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrM174254b[i26];
                    int i86 = i25;
                    if (obj instanceof Field) {
                        fieldM14849K2 = (Field) obj;
                    } else {
                        fieldM14849K2 = m14849K(cls2, (String) obj);
                        objArrM174254b[i26] = fieldM14849K2;
                    }
                    int i87 = i7;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14849K2);
                    i27 = i26 + 1;
                    obj2 = objArrM174254b[i27];
                    i18 = i87;
                    if (obj2 instanceof Field) {
                        fieldM14849K3 = (Field) obj2;
                    } else {
                        fieldM14849K3 = m14849K(cls2, (String) obj2);
                        objArrM174254b[i27] = fieldM14849K3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14849K3);
                    strM174253a = strM174253a;
                    i20 = i86;
                    i17 = i82;
                    i19 = 0;
                    c = 55296;
                }
                i6 = i24;
                i25 = i77;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrM174254b[i26];
                int i88 = i25;
                if (obj instanceof Field) {
                    fieldM14849K2 = (Field) obj;
                } else {
                    fieldM14849K2 = m14849K(cls2, (String) obj);
                    objArrM174254b[i26] = fieldM14849K2;
                }
                int i89 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14849K2);
                i27 = i26 + 1;
                obj2 = objArrM174254b[i27];
                i18 = i89;
                if (obj2 instanceof Field) {
                    fieldM14849K3 = (Field) obj2;
                } else {
                    fieldM14849K3 = m14849K(cls2, (String) obj2);
                    objArrM174254b[i27] = fieldM14849K3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14849K3);
                strM174253a = strM174253a;
                i20 = i88;
                i17 = i82;
                i19 = 0;
                c = 55296;
            } else {
                i18 = i7;
                int i90 = i6 + 1;
                Field fieldM14849K4 = m14849K(cls2, (String) objArrM174254b[i6]);
                if (i76 == 9 || i76 == 17) {
                    int i91 = i66 / 3;
                    objArr[i91 + i91 + 1] = fieldM14849K4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i6 += 2;
                            i22 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            if (pxx0Var2.zzc() == 1 || i77 != 0) {
                                i6 += 2;
                                int i92 = i66 / 3;
                                objArr[i92 + i92 + 1] = objArrM174254b[i90];
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
                            objArr[i96] = objArrM174254b[i90];
                            if (i77 != 0) {
                                objArr[i96 + 1] = objArrM174254b[i93];
                                i6 += 3;
                                i64 = i94;
                            } else {
                                i6 = i93;
                                i64 = i94;
                                i77 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14849K4);
                        if ((iCharAt11 & 4096) != 0 || i76 > 17) {
                            c = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i19 = 0;
                        } else {
                            int i97 = i17 + 1;
                            int iCharAt13 = strM174253a.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i21 = i97 + 1;
                                    cCharAt9 = strM174253a.charAt(i97);
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
                            Object obj3 = objArrM174254b[i100];
                            if (obj3 instanceof Field) {
                                fieldM14849K = (Field) obj3;
                            } else {
                                fieldM14849K = m14849K(cls2, (String) obj3);
                                objArrM174254b[i100] = fieldM14849K;
                            }
                            int i101 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM14849K);
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
                    objArr[i102 + i102 + i22] = objArrM174254b[i90];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14849K4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14849K4);
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
            iArr3[i103] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | iObjectFieldOffset;
            i66 += 3;
            iArr3[i104] = (i19 << 20) | iObjectFieldOffset2;
            i33 = i17;
            strM174253a = strM174253a;
            c2 = c;
            pxx0Var = pxx0Var2;
            length = length;
            i7 = i18;
        }
        return new C2411h0(iArr3, objArr, i2, i4, pxx0Var.zza(), false, iArr, i5, i62, twx0Var, dtx0Var, k0y0Var, efx0Var, cvx0Var);
    }

    /* JADX INFO: renamed from: x */
    public static double m14857x(Object obj, long j) {
        return ((Double) q1y0.m174945k(obj, j)).doubleValue();
    }

    /* JADX INFO: renamed from: y */
    public static float m14858y(Object obj, long j) {
        return ((Float) q1y0.m174945k(obj, j)).floatValue();
    }

    /* JADX INFO: renamed from: z */
    public static int m14859z(Object obj, long j) {
        return ((Integer) q1y0.m174945k(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: A */
    public final int m14860A(int i) {
        return this.f10371a[i + 2];
    }

    /* JADX INFO: renamed from: B */
    public final int m14861B(int i, int i2) {
        int length = (this.f10371a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f10371a[i4];
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
    public final int m14862D(int i) {
        return this.f10371a[i + 1];
    }

    /* JADX INFO: renamed from: F */
    public final grx0 m14863F(int i) {
        int i2 = i / 3;
        return (grx0) this.f10372b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: G */
    public final uxx0 m14864G(int i) {
        Object[] objArr = this.f10372b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        uxx0 uxx0Var = (uxx0) objArr[i3];
        if (uxx0Var != null) {
            return uxx0Var;
        }
        uxx0 uxx0VarM132929b = gxx0.m132928a().m132929b((Class) objArr[i3 + 1]);
        this.f10372b[i3] = uxx0VarM132929b;
        return uxx0VarM132929b;
    }

    /* JADX INFO: renamed from: H */
    public final Object m14865H(int i) {
        int i2 = i / 3;
        return this.f10372b[i2 + i2];
    }

    /* JADX INFO: renamed from: I */
    public final Object m14866I(Object obj, int i) {
        uxx0 uxx0VarM14864G = m14864G(i);
        int iM14862D = m14862D(i) & 1048575;
        if (!m14880n(obj, i)) {
            return uxx0VarM14864G.zze();
        }
        Object object = f10370m.getObject(obj, iM14862D);
        if (m14852q(object)) {
            return object;
        }
        Object objZze = uxx0VarM14864G.zze();
        if (object != null) {
            uxx0VarM14864G.zzg(objZze, object);
        }
        return objZze;
    }

    /* JADX INFO: renamed from: J */
    public final Object m14867J(Object obj, int i, int i2) {
        uxx0 uxx0VarM14864G = m14864G(i2);
        if (!m14882r(obj, i, i2)) {
            return uxx0VarM14864G.zze();
        }
        Object object = f10370m.getObject(obj, m14862D(i2) & 1048575);
        if (m14852q(object)) {
            return object;
        }
        Object objZze = uxx0VarM14864G.zze();
        if (object != null) {
            uxx0VarM14864G.zzg(objZze, object);
        }
        return objZze;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // p153l.uxx0
    /* JADX INFO: renamed from: a */
    public final void mo14868a(Object obj) {
        if (m14852q(obj)) {
            if (obj instanceof AbstractC2403d0) {
                AbstractC2403d0 abstractC2403d0 = (AbstractC2403d0) obj;
                abstractC2403d0.m14831w(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                abstractC2403d0.zza = 0;
                abstractC2403d0.m14830u();
            }
            int[] iArr = this.f10371a;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM14862D = m14862D(i);
                int i2 = 1048575 & iM14862D;
                int iM14847C = m14847C(iM14862D);
                long j = i2;
                if (iM14847C != 9) {
                    if (iM14847C != 60 && iM14847C != 68) {
                        switch (iM14847C) {
                            case 17:
                                if (m14880n(obj, i)) {
                                    m14864G(i).mo14868a(f10370m.getObject(obj, j));
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
                                ((orx0) q1y0.m174945k(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f10370m;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzig) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m14882r(obj, this.f10371a[i], i)) {
                        m14864G(i).mo14868a(f10370m.getObject(obj, j));
                    }
                } else if (m14880n(obj, i)) {
                    m14864G(i).mo14868a(f10370m.getObject(obj, j));
                }
            }
            this.f10380j.mo14916a(obj);
            if (this.f10376f) {
                this.f10381k.mo14804a(obj);
            }
        }
    }

    @Override // p153l.uxx0
    /* JADX INFO: renamed from: b */
    public final boolean mo14869b(Object obj, Object obj2) {
        boolean zM14894e;
        for (int i = 0; i < this.f10371a.length; i += 3) {
            int iM14862D = m14862D(i);
            long j = iM14862D & 1048575;
            switch (m14847C(iM14862D)) {
                case 0:
                    if (!m14879m(obj, obj2, i) || Double.doubleToLongBits(q1y0.m174940f(obj, j)) != Double.doubleToLongBits(q1y0.m174940f(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!m14879m(obj, obj2, i) || Float.floatToIntBits(q1y0.m174941g(obj, j)) != Float.floatToIntBits(q1y0.m174941g(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!m14879m(obj, obj2, i) || q1y0.m174943i(obj, j) != q1y0.m174943i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!m14879m(obj, obj2, i) || q1y0.m174943i(obj, j) != q1y0.m174943i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!m14879m(obj, obj2, i) || q1y0.m174942h(obj, j) != q1y0.m174942h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!m14879m(obj, obj2, i) || q1y0.m174943i(obj, j) != q1y0.m174943i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!m14879m(obj, obj2, i) || q1y0.m174942h(obj, j) != q1y0.m174942h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!m14879m(obj, obj2, i) || q1y0.m174931B(obj, j) != q1y0.m174931B(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!m14879m(obj, obj2, i) || !C2415j0.m14894e(q1y0.m174945k(obj, j), q1y0.m174945k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!m14879m(obj, obj2, i) || !C2415j0.m14894e(q1y0.m174945k(obj, j), q1y0.m174945k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!m14879m(obj, obj2, i) || !C2415j0.m14894e(q1y0.m174945k(obj, j), q1y0.m174945k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!m14879m(obj, obj2, i) || q1y0.m174942h(obj, j) != q1y0.m174942h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!m14879m(obj, obj2, i) || q1y0.m174942h(obj, j) != q1y0.m174942h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!m14879m(obj, obj2, i) || q1y0.m174942h(obj, j) != q1y0.m174942h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!m14879m(obj, obj2, i) || q1y0.m174943i(obj, j) != q1y0.m174943i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!m14879m(obj, obj2, i) || q1y0.m174942h(obj, j) != q1y0.m174942h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!m14879m(obj, obj2, i) || q1y0.m174943i(obj, j) != q1y0.m174943i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!m14879m(obj, obj2, i) || !C2415j0.m14894e(q1y0.m174945k(obj, j), q1y0.m174945k(obj2, j))) {
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
                    zM14894e = C2415j0.m14894e(q1y0.m174945k(obj, j), q1y0.m174945k(obj2, j));
                    break;
                case 50:
                    zM14894e = C2415j0.m14894e(q1y0.m174945k(obj, j), q1y0.m174945k(obj2, j));
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
                    long jM14860A = m14860A(i) & 1048575;
                    if (q1y0.m174942h(obj, jM14860A) != q1y0.m174942h(obj2, jM14860A) || !C2415j0.m14894e(q1y0.m174945k(obj, j), q1y0.m174945k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zM14894e) {
                return false;
            }
        }
        if (!((AbstractC2403d0) obj).zzc.equals(((AbstractC2403d0) obj2).zzc)) {
            return false;
        }
        if (this.f10376f) {
            return ((AbstractC2401c0) obj).zzb.equals(((AbstractC2401c0) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // p153l.uxx0
    /* JADX INFO: renamed from: c */
    public final boolean mo14870c(Object obj) {
        int i;
        int i2;
        List list;
        uxx0 uxx0VarM14864G;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.f10378h) {
            int[] iArr = this.f10377g;
            int[] iArr2 = this.f10371a;
            int i7 = iArr[i4];
            int i8 = iArr2[i7];
            int iM14862D = this.m14862D(i7);
            int i9 = this.f10371a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i5 = f10370m.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i6;
                i2 = i5;
            }
            C2411h0<T> c2411h0 = this;
            Object obj2 = obj;
            if ((268435456 & iM14862D) != 0 && !c2411h0.m14881o(obj2, i7, i, i2, i11)) {
                return false;
            }
            int iM14847C = m14847C(iM14862D);
            if (iM14847C == 9 || iM14847C == 17) {
                if (c2411h0.m14881o(obj2, i7, i, i2, i11) && !m14851p(obj2, iM14862D, c2411h0.m14864G(i7))) {
                    return false;
                }
            } else if (iM14847C == 27) {
                list = (List) q1y0.m174945k(obj2, iM14862D & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    uxx0VarM14864G = c2411h0.m14864G(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!uxx0VarM14864G.mo14870c(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iM14847C == 60 || iM14847C == 68) {
                if (c2411h0.m14882r(obj2, i8, i7) && !m14851p(obj2, iM14862D, c2411h0.m14864G(i7))) {
                    return false;
                }
            } else if (iM14847C == 49) {
                list = (List) q1y0.m174945k(obj2, iM14862D & 1048575);
                if (list.isEmpty()) {
                    uxx0VarM14864G = c2411h0.m14864G(i7);
                    while (i3 < list.size()) {
                        if (!uxx0VarM14864G.mo14870c(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iM14847C == 50 && !((zzig) q1y0.m174945k(obj2, iM14862D & 1048575)).isEmpty()) {
                throw null;
            }
            i4++;
            this = c2411h0;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.f10376f || ((AbstractC2401c0) obj).zzb.m216464h();
    }

    @Override // p153l.uxx0
    /* JADX INFO: renamed from: d */
    public final void mo14871d(Object obj, byte[] bArr, int i, int i2, ypw0 ypw0Var) throws IOException {
        m14883u(obj, bArr, i, i2, 0, ypw0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // p153l.uxx0
    /* JADX INFO: renamed from: e */
    public final void mo14872e(Object obj, o2y0 o2y0Var) throws IOException {
        Map.Entry entry;
        int i;
        C2411h0<T> c2411h0 = this;
        if (c2411h0.f10376f) {
            yjx0 yjx0Var = ((AbstractC2401c0) obj).zzb;
            if (yjx0Var.f200355a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) yjx0Var.m216461e().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = c2411h0.f10371a;
        Unsafe unsafe = f10370m;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iM14862D = c2411h0.m14862D(i4);
            int[] iArr2 = c2411h0.f10371a;
            int iM14847C = m14847C(iM14862D);
            int i6 = iArr2[i4];
            if (iM14847C <= 17) {
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
            long j = iM14862D & i2;
            switch (iM14847C) {
                case 0:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165817m(i6, q1y0.m174940f(obj, j));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 1:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165827w(i6, q1y0.m174941g(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 2:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165799E(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 3:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165797C(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 4:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165801G(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 5:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165812h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 6:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165822r(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 7:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165815k(i6, q1y0.m174931B(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 8:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        m14854t(i6, unsafe.getObject(obj, j), o2y0Var);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 9:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165830z(i6, unsafe.getObject(obj, j), c2411h0.m14864G(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 10:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165829y(i6, (zzgk) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 11:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165821q(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 12:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165825u(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 13:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165803I(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 14:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165806L(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 15:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165819o(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 16:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165818n(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 17:
                    if (c2411h0.m14881o(obj, i4, i3, i5, i)) {
                        o2y0Var.mo165823s(i6, unsafe.getObject(obj, j), c2411h0.m14864G(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 18:
                    C2415j0.m14912w(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 19:
                    C2415j0.m14885A(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 20:
                    C2415j0.m14887C(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 21:
                    C2415j0.m14893d(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 22:
                    C2415j0.m14886B(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 23:
                    C2415j0.m14915z(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 24:
                    C2415j0.m14914y(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 25:
                    C2415j0.m14911v(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 26:
                    int i9 = c2411h0.f10371a[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var = C2415j0.f10388a;
                    if (list != null && !list.isEmpty()) {
                        o2y0Var.mo165796B(i9, list);
                    }
                    break;
                case 27:
                    int i10 = c2411h0.f10371a[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    uxx0 uxx0VarM14864G = c2411h0.m14864G(i4);
                    k0y0 k0y0Var2 = C2415j0.f10388a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i11 = 0; i11 < list2.size(); i11++) {
                            ((sax0) o2y0Var).mo165830z(i10, list2.get(i11), uxx0VarM14864G);
                        }
                    }
                    break;
                case 28:
                    int i12 = c2411h0.f10371a[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var3 = C2415j0.f10388a;
                    if (list3 != null && !list3.isEmpty()) {
                        o2y0Var.mo165798D(i12, list3);
                    }
                    break;
                case 29:
                    C2415j0.m14892c(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 30:
                    C2415j0.m14913x(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 31:
                    C2415j0.m14888D(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 32:
                    C2415j0.m14889E(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 33:
                    C2415j0.m14890a(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 34:
                    C2415j0.m14891b(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    c2411h0 = this;
                    break;
                case 35:
                    C2415j0.m14912w(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 36:
                    C2415j0.m14885A(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 37:
                    C2415j0.m14887C(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 38:
                    C2415j0.m14893d(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 39:
                    C2415j0.m14886B(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 40:
                    C2415j0.m14915z(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 41:
                    C2415j0.m14914y(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 42:
                    C2415j0.m14911v(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 43:
                    C2415j0.m14892c(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 44:
                    C2415j0.m14913x(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 45:
                    C2415j0.m14888D(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 46:
                    C2415j0.m14889E(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 47:
                    C2415j0.m14890a(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 48:
                    C2415j0.m14891b(c2411h0.f10371a[i4], (List) unsafe.getObject(obj, j), o2y0Var, true);
                    break;
                case 49:
                    int i13 = c2411h0.f10371a[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    uxx0 uxx0VarM14864G2 = c2411h0.m14864G(i4);
                    k0y0 k0y0Var4 = C2415j0.f10388a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i14 = 0; i14 < list4.size(); i14++) {
                            ((sax0) o2y0Var).mo165823s(i13, list4.get(i14), uxx0VarM14864G2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165817m(i6, m14857x(obj, j));
                    }
                    break;
                case 52:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165827w(i6, m14858y(obj, j));
                    }
                    break;
                case 53:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165799E(i6, m14848E(obj, j));
                    }
                    break;
                case 54:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165797C(i6, m14848E(obj, j));
                    }
                    break;
                case 55:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165801G(i6, m14859z(obj, j));
                    }
                    break;
                case 56:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165812h(i6, m14848E(obj, j));
                    }
                    break;
                case 57:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165822r(i6, m14859z(obj, j));
                    }
                    break;
                case 58:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165815k(i6, m14853s(obj, j));
                    }
                    break;
                case 59:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        m14854t(i6, unsafe.getObject(obj, j), o2y0Var);
                    }
                    break;
                case 60:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165830z(i6, unsafe.getObject(obj, j), c2411h0.m14864G(i4));
                    }
                    break;
                case 61:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165829y(i6, (zzgk) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165821q(i6, m14859z(obj, j));
                    }
                    break;
                case 63:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165825u(i6, m14859z(obj, j));
                    }
                    break;
                case 64:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165803I(i6, m14859z(obj, j));
                    }
                    break;
                case 65:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165806L(i6, m14848E(obj, j));
                    }
                    break;
                case 66:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165819o(i6, m14859z(obj, j));
                    }
                    break;
                case 67:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165818n(i6, m14848E(obj, j));
                    }
                    break;
                case 68:
                    if (c2411h0.m14882r(obj, i6, i4)) {
                        o2y0Var.mo165823s(i6, unsafe.getObject(obj, j), c2411h0.m14864G(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            c2411h0 = this;
        }
        if (entry != null) {
            throw null;
        }
        ((AbstractC2403d0) obj).zzc.m165566l(o2y0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m14873g(Object obj, Object obj2, int i) {
        if (m14880n(obj2, i)) {
            int iM14862D = m14862D(i) & 1048575;
            Unsafe unsafe = f10370m;
            long j = iM14862D;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                hkx0.m135653a(obj2, this.f10371a[i]);
                return;
            }
            uxx0 uxx0VarM14864G = m14864G(i);
            if (!m14880n(obj, i)) {
                if (m14852q(object)) {
                    Object objZze = uxx0VarM14864G.zze();
                    uxx0VarM14864G.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m14875i(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m14852q(object2)) {
                Object objZze2 = uxx0VarM14864G.zze();
                uxx0VarM14864G.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            uxx0VarM14864G.zzg(object2, object);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14874h(Object obj, Object obj2, int i) {
        int i2 = this.f10371a[i];
        if (m14882r(obj2, i2, i)) {
            int iM14862D = m14862D(i) & 1048575;
            Unsafe unsafe = f10370m;
            long j = iM14862D;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                hkx0.m135653a(obj2, this.f10371a[i]);
                return;
            }
            uxx0 uxx0VarM14864G = m14864G(i);
            if (!m14882r(obj, i2, i)) {
                if (m14852q(object)) {
                    Object objZze = uxx0VarM14864G.zze();
                    uxx0VarM14864G.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m14876j(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m14852q(object2)) {
                Object objZze2 = uxx0VarM14864G.zze();
                uxx0VarM14864G.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            uxx0VarM14864G.zzg(object2, object);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m14875i(Object obj, int i) {
        int iM14860A = m14860A(i);
        long j = 1048575 & iM14860A;
        if (j == 1048575) {
            return;
        }
        q1y0.m174956v(obj, j, (1 << (iM14860A >>> 20)) | q1y0.m174942h(obj, j));
    }

    /* JADX INFO: renamed from: j */
    public final void m14876j(Object obj, int i, int i2) {
        q1y0.m174956v(obj, m14860A(i2) & 1048575, i);
    }

    /* JADX INFO: renamed from: k */
    public final void m14877k(Object obj, int i, Object obj2) {
        f10370m.putObject(obj, m14862D(i) & 1048575, obj2);
        m14875i(obj, i);
    }

    /* JADX INFO: renamed from: l */
    public final void m14878l(Object obj, int i, int i2, Object obj2) {
        f10370m.putObject(obj, m14862D(i2) & 1048575, obj2);
        m14876j(obj, i, i2);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m14879m(Object obj, Object obj2, int i) {
        return m14880n(obj, i) == m14880n(obj2, i);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m14880n(Object obj, int i) {
        int iM14860A = m14860A(i);
        long j = iM14860A & 1048575;
        if (j != 1048575) {
            return ((1 << (iM14860A >>> 20)) & q1y0.m174942h(obj, j)) != 0;
        }
        int iM14862D = m14862D(i);
        long j2 = iM14862D & 1048575;
        switch (m14847C(iM14862D)) {
            case 0:
                return Double.doubleToRawLongBits(q1y0.m174940f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(q1y0.m174941g(obj, j2)) != 0;
            case 2:
                return q1y0.m174943i(obj, j2) != 0;
            case 3:
                return q1y0.m174943i(obj, j2) != 0;
            case 4:
                return q1y0.m174942h(obj, j2) != 0;
            case 5:
                return q1y0.m174943i(obj, j2) != 0;
            case 6:
                return q1y0.m174942h(obj, j2) != 0;
            case 7:
                return q1y0.m174931B(obj, j2);
            case 8:
                Object objM174945k = q1y0.m174945k(obj, j2);
                if (objM174945k instanceof String) {
                    return !((String) objM174945k).isEmpty();
                }
                if (objM174945k instanceof zzgk) {
                    return !zzgk.zzb.equals(objM174945k);
                }
                fig0.m125680a();
                return false;
            case 9:
                return q1y0.m174945k(obj, j2) != null;
            case 10:
                return !zzgk.zzb.equals(q1y0.m174945k(obj, j2));
            case 11:
                return q1y0.m174942h(obj, j2) != 0;
            case 12:
                return q1y0.m174942h(obj, j2) != 0;
            case 13:
                return q1y0.m174942h(obj, j2) != 0;
            case 14:
                return q1y0.m174943i(obj, j2) != 0;
            case 15:
                return q1y0.m174942h(obj, j2) != 0;
            case 16:
                return q1y0.m174943i(obj, j2) != 0;
            case 17:
                return q1y0.m174945k(obj, j2) != null;
            default:
                fig0.m125680a();
                return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m14881o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m14880n(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m14882r(Object obj, int i, int i2) {
        return q1y0.m174942h(obj, (long) (m14860A(i2) & 1048575)) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: u */
    public final int m14883u(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, p153l.ypw0 r41) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2411h0.m14883u(java.lang.Object, byte[], int, int, int, l.ypw0):int");
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
    @Override // p153l.uxx0
    public final int zza(Object obj) {
        int i;
        int iM14771B;
        int iM14771B2;
        int iM14772a;
        int iM14771B3;
        int iM14771B4;
        int iM14771B5;
        int iZzd;
        int iM14771B6;
        int iM14902m;
        int iM14901l;
        int size;
        int iM14906q;
        int iM14771B7;
        int iM14771B8;
        int iM14771B9;
        int iM14772a2;
        int iM14899j;
        int iM14771B10;
        int iM14771B11;
        int iM14774y;
        int iM14771B12;
        int iM14771B13;
        int iM14771B14;
        int iZzd2;
        int iM14771B15;
        C2411h0<T> c2411h0 = this;
        Unsafe unsafe = f10370m;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iM14771B16 = 0;
        int i6 = 1048575;
        while (i4 < c2411h0.f10371a.length) {
            int iM14862D = c2411h0.m14862D(i4);
            int iM14847C = m14847C(iM14862D);
            int[] iArr = c2411h0.f10371a;
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & i3;
            if (iM14847C <= 17) {
                if (i9 != i6) {
                    i5 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            int i10 = iM14862D & i3;
            if (iM14847C >= zzhc.zzJ.zza()) {
                zzhc.zzW.zza();
            }
            int i11 = iM14771B16;
            long j = i10;
            switch (iM14847C) {
                case 0:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        iM14771B16 = i11 + AbstractC2395a0.m14771B(i7 << 3) + 8;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        iM14771B = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B4 = iM14771B + 4;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iM14771B2 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a = AbstractC2395a0.m14772a(j2);
                        iM14771B4 = iM14771B2 + iM14772a;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iM14771B2 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a = AbstractC2395a0.m14772a(j3);
                        iM14771B4 = iM14771B2 + iM14772a;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iM14771B2 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a = AbstractC2395a0.m14772a(j4);
                        iM14771B4 = iM14771B2 + iM14772a;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        iM14771B3 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B4 = iM14771B3 + 8;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        iM14771B = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B4 = iM14771B + 4;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        iM14771B4 = AbstractC2395a0.m14771B(i7 << 3) + 1;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        int i12 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgk) {
                            iM14771B5 = AbstractC2395a0.m14771B(i12);
                            iZzd = ((zzgk) object).zzd();
                            iM14771B6 = AbstractC2395a0.m14771B(iZzd);
                            iM14771B4 = iM14771B5 + iM14771B6 + iZzd;
                            iM14771B16 = i11 + iM14771B4;
                            c2411h0 = this;
                            i4 += 3;
                            i3 = 1048575;
                        } else {
                            iM14771B2 = AbstractC2395a0.m14771B(i12);
                            iM14772a = AbstractC2395a0.m14770A((String) object);
                            iM14771B4 = iM14771B2 + iM14772a;
                            iM14771B16 = i11 + iM14771B4;
                            c2411h0 = this;
                            i4 += 3;
                            i3 = 1048575;
                        }
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        iM14902m = C2415j0.m14902m(i7, unsafe.getObject(obj, j), c2411h0.m14864G(i4));
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj, j);
                        iM14771B5 = AbstractC2395a0.m14771B(i7 << 3);
                        iZzd = zzgkVar.zzd();
                        iM14771B6 = AbstractC2395a0.m14771B(iZzd);
                        iM14771B4 = iM14771B5 + iM14771B6 + iZzd;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        int i13 = unsafe.getInt(obj, j);
                        iM14771B2 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a = AbstractC2395a0.m14771B(i13);
                        iM14771B4 = iM14771B2 + iM14772a;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iM14771B2 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a = AbstractC2395a0.m14772a(j5);
                        iM14771B4 = iM14771B2 + iM14772a;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        iM14771B = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B4 = iM14771B + 4;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        iM14771B3 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B4 = iM14771B3 + 8;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        int i14 = unsafe.getInt(obj, j);
                        iM14771B2 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a = AbstractC2395a0.m14771B((i14 >> 31) ^ (i14 + i14));
                        iM14771B4 = iM14771B2 + iM14772a;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iM14771B2 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a = AbstractC2395a0.m14772a((j6 >> 63) ^ (j6 + j6));
                        iM14771B4 = iM14771B2 + iM14772a;
                        iM14771B16 = i11 + iM14771B4;
                        c2411h0 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2411h0 = this;
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (c2411h0.m14881o(obj, i4, i6, i5, i)) {
                        iM14902m = AbstractC2395a0.m14774y(i7, (yvx0) unsafe.getObject(obj, j), c2411h0.m14864G(i4));
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    iM14902m = C2415j0.m14898i(i7, (List) unsafe.getObject(obj, j), false);
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    iM14902m = C2415j0.m14896g(i7, (List) unsafe.getObject(obj, j), false);
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var = C2415j0.f10388a;
                    if (list.size() == 0) {
                        iM14901l = 0;
                    } else {
                        iM14901l = C2415j0.m14901l(list) + (list.size() * AbstractC2395a0.m14771B(i7 << 3));
                    }
                    iM14771B16 = iM14901l + i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var2 = C2415j0.f10388a;
                    size = list2.size();
                    if (size == 0) {
                        iM14902m = 0;
                    } else {
                        iM14906q = C2415j0.m14906q(list2);
                        iM14771B7 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = size * iM14771B7;
                        iM14902m = iM14906q + iM14772a2;
                    }
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var3 = C2415j0.f10388a;
                    size = list3.size();
                    if (size == 0) {
                        iM14902m = 0;
                    } else {
                        iM14906q = C2415j0.m14900k(list3);
                        iM14771B7 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = size * iM14771B7;
                        iM14902m = iM14906q + iM14772a2;
                    }
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    iM14902m = C2415j0.m14898i(i7, (List) unsafe.getObject(obj, j), false);
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    iM14902m = C2415j0.m14896g(i7, (List) unsafe.getObject(obj, j), false);
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var4 = C2415j0.f10388a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM14902m = 0;
                    } else {
                        iM14902m = size2 * (AbstractC2395a0.m14771B(i7 << 3) + 1);
                    }
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var5 = C2415j0.f10388a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM14901l = 0;
                    } else {
                        iM14901l = AbstractC2395a0.m14771B(i7 << 3) * size3;
                        if (list5 instanceof zsx0) {
                            zsx0 zsx0Var = (zsx0) list5;
                            for (int i15 = 0; i15 < size3; i15++) {
                                Object objZzc = zsx0Var.zzc();
                                if (objZzc instanceof zzgk) {
                                    int iZzd3 = ((zzgk) objZzc).zzd();
                                    iM14901l += AbstractC2395a0.m14771B(iZzd3) + iZzd3;
                                } else {
                                    iM14901l += AbstractC2395a0.m14770A((String) objZzc);
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < size3; i16++) {
                                Object obj2 = list5.get(i16);
                                if (obj2 instanceof zzgk) {
                                    int iZzd4 = ((zzgk) obj2).zzd();
                                    iM14901l += AbstractC2395a0.m14771B(iZzd4) + iZzd4;
                                } else {
                                    iM14901l += AbstractC2395a0.m14770A((String) obj2);
                                }
                            }
                        }
                    }
                    iM14771B16 = iM14901l + i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    uxx0 uxx0VarM14864G = c2411h0.m14864G(i4);
                    k0y0 k0y0Var6 = C2415j0.f10388a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM14771B8 = 0;
                    } else {
                        iM14771B8 = AbstractC2395a0.m14771B(i7 << 3) * size4;
                        for (int i17 = 0; i17 < size4; i17++) {
                            Object obj3 = list6.get(i17);
                            if (obj3 instanceof C2405e0) {
                                int iM14839a = ((C2405e0) obj3).m14839a();
                                iM14771B8 += AbstractC2395a0.m14771B(iM14839a) + iM14839a;
                            } else {
                                iM14771B8 += AbstractC2395a0.m14775z((yvx0) obj3, uxx0VarM14864G);
                            }
                        }
                    }
                    iM14771B16 = i11 + iM14771B8;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var7 = C2415j0.f10388a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM14771B9 = 0;
                    } else {
                        iM14771B9 = size5 * AbstractC2395a0.m14771B(i7 << 3);
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int iZzd5 = ((zzgk) list7.get(i18)).zzd();
                            iM14771B9 += AbstractC2395a0.m14771B(iZzd5) + iZzd5;
                        }
                    }
                    iM14771B16 = i11 + iM14771B9;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var8 = C2415j0.f10388a;
                    size = list8.size();
                    if (size == 0) {
                        iM14902m = 0;
                    } else {
                        iM14906q = C2415j0.m14905p(list8);
                        iM14771B7 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = size * iM14771B7;
                        iM14902m = iM14906q + iM14772a2;
                    }
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var9 = C2415j0.f10388a;
                    size = list9.size();
                    if (size == 0) {
                        iM14902m = 0;
                    } else {
                        iM14906q = C2415j0.m14895f(list9);
                        iM14771B7 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = size * iM14771B7;
                        iM14902m = iM14906q + iM14772a2;
                    }
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    iM14902m = C2415j0.m14896g(i7, (List) unsafe.getObject(obj, j), false);
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    iM14902m = C2415j0.m14898i(i7, (List) unsafe.getObject(obj, j), false);
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var10 = C2415j0.f10388a;
                    size = list10.size();
                    if (size == 0) {
                        iM14902m = 0;
                    } else {
                        iM14906q = C2415j0.m14903n(list10);
                        iM14771B7 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = size * iM14771B7;
                        iM14902m = iM14906q + iM14772a2;
                    }
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var11 = C2415j0.f10388a;
                    size = list11.size();
                    if (size == 0) {
                        iM14902m = 0;
                    } else {
                        iM14906q = C2415j0.m14904o(list11);
                        iM14771B7 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = size * iM14771B7;
                        iM14902m = iM14906q + iM14772a2;
                    }
                    iM14771B16 = i11 + iM14902m;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    iM14899j = C2415j0.m14899j((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 36:
                    iM14899j = C2415j0.m14897h((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 37:
                    iM14899j = C2415j0.m14901l((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    iM14899j = C2415j0.m14906q((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 39:
                    iM14899j = C2415j0.m14900k((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 40:
                    iM14899j = C2415j0.m14899j((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 41:
                    iM14899j = C2415j0.m14897h((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    k0y0 k0y0Var12 = C2415j0.f10388a;
                    iM14899j = list12.size();
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    iM14899j = C2415j0.m14905p((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 44:
                    iM14899j = C2415j0.m14895f((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 45:
                    iM14899j = C2415j0.m14897h((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 46:
                    iM14899j = C2415j0.m14899j((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 47:
                    iM14899j = C2415j0.m14903n((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 48:
                    iM14899j = C2415j0.m14904o((List) unsafe.getObject(obj, j));
                    if (iM14899j > 0) {
                        iM14771B10 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14771B11 = AbstractC2395a0.m14771B(iM14899j);
                        iM14771B9 = iM14771B10 + iM14771B11 + iM14899j;
                        iM14771B16 = i11 + iM14771B9;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    uxx0 uxx0VarM14864G2 = c2411h0.m14864G(i4);
                    k0y0 k0y0Var13 = C2415j0.f10388a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iM14774y = 0;
                    } else {
                        iM14774y = 0;
                        for (int i19 = 0; i19 < size6; i19++) {
                            iM14774y += AbstractC2395a0.m14774y(i7, (yvx0) list13.get(i19), uxx0VarM14864G2);
                        }
                    }
                    iM14771B16 = i11 + iM14774y;
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
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 51:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        iM14771B12 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14902m = iM14771B12 + 8;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 52:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        iM14771B13 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14902m = iM14771B13 + 4;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        long jM14848E = m14848E(obj, j);
                        iM14906q = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = AbstractC2395a0.m14772a(jM14848E);
                        iM14902m = iM14906q + iM14772a2;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        long jM14848E2 = m14848E(obj, j);
                        iM14906q = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = AbstractC2395a0.m14772a(jM14848E2);
                        iM14902m = iM14906q + iM14772a2;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        long jM14859z = m14859z(obj, j);
                        iM14906q = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = AbstractC2395a0.m14772a(jM14859z);
                        iM14902m = iM14906q + iM14772a2;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        iM14771B12 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14902m = iM14771B12 + 8;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        iM14771B13 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14902m = iM14771B13 + 4;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        iM14902m = AbstractC2395a0.m14771B(i7 << 3) + 1;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        int i20 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgk) {
                            iM14771B14 = AbstractC2395a0.m14771B(i20);
                            iZzd2 = ((zzgk) object2).zzd();
                            iM14771B15 = AbstractC2395a0.m14771B(iZzd2);
                            iM14902m = iM14771B14 + iM14771B15 + iZzd2;
                            iM14771B16 = i11 + iM14902m;
                        } else {
                            iM14906q = AbstractC2395a0.m14771B(i20);
                            iM14772a2 = AbstractC2395a0.m14770A((String) object2);
                            iM14902m = iM14906q + iM14772a2;
                            iM14771B16 = i11 + iM14902m;
                        }
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        iM14902m = C2415j0.m14902m(i7, unsafe.getObject(obj, j), c2411h0.m14864G(i4));
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj, j);
                        iM14771B14 = AbstractC2395a0.m14771B(i7 << 3);
                        iZzd2 = zzgkVar2.zzd();
                        iM14771B15 = AbstractC2395a0.m14771B(iZzd2);
                        iM14902m = iM14771B14 + iM14771B15 + iZzd2;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        int iM14859z = m14859z(obj, j);
                        iM14906q = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = AbstractC2395a0.m14771B(iM14859z);
                        iM14902m = iM14906q + iM14772a2;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        long jM14859z2 = m14859z(obj, j);
                        iM14906q = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = AbstractC2395a0.m14772a(jM14859z2);
                        iM14902m = iM14906q + iM14772a2;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        iM14771B13 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14902m = iM14771B13 + 4;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        iM14771B12 = AbstractC2395a0.m14771B(i7 << 3);
                        iM14902m = iM14771B12 + 8;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        int iM14859z2 = m14859z(obj, j);
                        iM14906q = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = AbstractC2395a0.m14771B((iM14859z2 >> 31) ^ (iM14859z2 + iM14859z2));
                        iM14902m = iM14906q + iM14772a2;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        long jM14848E3 = m14848E(obj, j);
                        iM14906q = AbstractC2395a0.m14771B(i7 << 3);
                        iM14772a2 = AbstractC2395a0.m14772a((jM14848E3 >> 63) ^ (jM14848E3 + jM14848E3));
                        iM14902m = iM14906q + iM14772a2;
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (c2411h0.m14882r(obj, i7, i4)) {
                        iM14902m = AbstractC2395a0.m14774y(i7, (yvx0) unsafe.getObject(obj, j), c2411h0.m14864G(i4));
                        iM14771B16 = i11 + iM14902m;
                    } else {
                        iM14771B16 = i11;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                default:
                    iM14771B16 = i11;
                    i4 += 3;
                    i3 = 1048575;
                    break;
            }
        }
        int iM165558a = iM14771B16 + ((AbstractC2403d0) obj).zzc.m165558a();
        if (!c2411h0.f10376f) {
            return iM165558a;
        }
        yjx0 yjx0Var = ((AbstractC2401c0) obj).zzb;
        int iM198869c = yjx0Var.f200355a.m198869c();
        int iM216454b = 0;
        while (true) {
            uzx0 uzx0Var = yjx0Var.f200355a;
            if (i2 >= iM198869c) {
                for (Map.Entry entry2 : uzx0Var.m198870d()) {
                    iM216454b += yjx0.m216454b((zix0) entry2.getKey(), entry2.getValue());
                }
                return iM165558a + iM216454b;
            }
            Map.Entry entryM198872g = uzx0Var.m198872g(i2);
            iM216454b += yjx0.m216454b((zix0) ((czx0) entryM198872g).m113352a(), entryM198872g.getValue());
            i2++;
        }
    }

    @Override // p153l.uxx0
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f10371a.length; i4 += 3) {
            int iM14862D = m14862D(i4);
            int[] iArr = this.f10371a;
            int i5 = 1048575 & iM14862D;
            int iM14847C = m14847C(iM14862D);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iM14847C) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(q1y0.m174940f(obj, j));
                    Charset charset = srx0.f170385a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(q1y0.m174941g(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = q1y0.m174943i(obj, j);
                    Charset charset2 = srx0.f170385a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = q1y0.m174943i(obj, j);
                    Charset charset3 = srx0.f170385a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = q1y0.m174942h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = q1y0.m174943i(obj, j);
                    Charset charset4 = srx0.f170385a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = q1y0.m174942h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = srx0.m187640a(q1y0.m174931B(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) q1y0.m174945k(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objM174945k = q1y0.m174945k(obj, j);
                    if (objM174945k != null) {
                        iHashCode = objM174945k.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = q1y0.m174945k(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = q1y0.m174942h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = q1y0.m174942h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = q1y0.m174942h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = q1y0.m174943i(obj, j);
                    Charset charset5 = srx0.f170385a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = q1y0.m174942h(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = q1y0.m174943i(obj, j);
                    Charset charset6 = srx0.f170385a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objM174945k2 = q1y0.m174945k(obj, j);
                    if (objM174945k2 != null) {
                        iHashCode = objM174945k2.hashCode();
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
                    iFloatToIntBits = q1y0.m174945k(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = q1y0.m174945k(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(m14857x(obj, j));
                        Charset charset7 = srx0.f170385a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(m14858y(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14848E(obj, j);
                        Charset charset8 = srx0.f170385a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14848E(obj, j);
                        Charset charset9 = srx0.f170385a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14859z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14848E(obj, j);
                        Charset charset10 = srx0.f170385a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14859z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = srx0.m187640a(m14853s(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) q1y0.m174945k(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = q1y0.m174945k(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = q1y0.m174945k(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14859z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14859z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14859z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14848E(obj, j);
                        Charset charset11 = srx0.f170385a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m14859z(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m14848E(obj, j);
                        Charset charset12 = srx0.f170385a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (m14882r(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = q1y0.m174945k(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + ((AbstractC2403d0) obj).zzc.hashCode();
        return this.f10376f ? (iHashCode2 * 53) + ((AbstractC2401c0) obj).zzb.f200355a.hashCode() : iHashCode2;
    }

    @Override // p153l.uxx0
    public final Object zze() {
        return ((AbstractC2403d0) this.f10375e).m14827m();
    }

    @Override // p153l.uxx0
    public final void zzg(Object obj, Object obj2) {
        m14850f(obj);
        obj2.getClass();
        for (int i = 0; i < this.f10371a.length; i += 3) {
            int iM14862D = m14862D(i);
            int i2 = 1048575 & iM14862D;
            int[] iArr = this.f10371a;
            int iM14847C = m14847C(iM14862D);
            int i3 = iArr[i];
            long j = i2;
            switch (iM14847C) {
                case 0:
                    if (m14880n(obj2, i)) {
                        q1y0.m174954t(obj, j, q1y0.m174940f(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 1:
                    if (m14880n(obj2, i)) {
                        q1y0.m174955u(obj, j, q1y0.m174941g(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 2:
                    if (m14880n(obj2, i)) {
                        q1y0.m174957w(obj, j, q1y0.m174943i(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 3:
                    if (m14880n(obj2, i)) {
                        q1y0.m174957w(obj, j, q1y0.m174943i(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 4:
                    if (m14880n(obj2, i)) {
                        q1y0.m174956v(obj, j, q1y0.m174942h(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 5:
                    if (m14880n(obj2, i)) {
                        q1y0.m174957w(obj, j, q1y0.m174943i(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 6:
                    if (m14880n(obj2, i)) {
                        q1y0.m174956v(obj, j, q1y0.m174942h(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 7:
                    if (m14880n(obj2, i)) {
                        q1y0.m174952r(obj, j, q1y0.m174931B(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 8:
                    if (m14880n(obj2, i)) {
                        q1y0.m174958x(obj, j, q1y0.m174945k(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 9:
                    m14873g(obj, obj2, i);
                    break;
                case 10:
                    if (m14880n(obj2, i)) {
                        q1y0.m174958x(obj, j, q1y0.m174945k(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 11:
                    if (m14880n(obj2, i)) {
                        q1y0.m174956v(obj, j, q1y0.m174942h(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 12:
                    if (m14880n(obj2, i)) {
                        q1y0.m174956v(obj, j, q1y0.m174942h(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 13:
                    if (m14880n(obj2, i)) {
                        q1y0.m174956v(obj, j, q1y0.m174942h(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 14:
                    if (m14880n(obj2, i)) {
                        q1y0.m174957w(obj, j, q1y0.m174943i(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 15:
                    if (m14880n(obj2, i)) {
                        q1y0.m174956v(obj, j, q1y0.m174942h(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 16:
                    if (m14880n(obj2, i)) {
                        q1y0.m174957w(obj, j, q1y0.m174943i(obj2, j));
                        m14875i(obj, i);
                    }
                    break;
                case 17:
                    m14873g(obj, obj2, i);
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
                    orx0 orx0VarZzd = (orx0) q1y0.m174945k(obj, j);
                    orx0 orx0Var = (orx0) q1y0.m174945k(obj2, j);
                    int size = orx0VarZzd.size();
                    int size2 = orx0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!orx0VarZzd.zzc()) {
                            orx0VarZzd = orx0VarZzd.zzd(size2 + size);
                        }
                        orx0VarZzd.addAll(orx0Var);
                    }
                    if (size > 0) {
                        orx0Var = orx0VarZzd;
                    }
                    q1y0.m174958x(obj, j, orx0Var);
                    break;
                case 50:
                    k0y0 k0y0Var = C2415j0.f10388a;
                    q1y0.m174958x(obj, j, cvx0.m112892a(q1y0.m174945k(obj, j), q1y0.m174945k(obj2, j)));
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
                    if (m14882r(obj2, i3, i)) {
                        q1y0.m174958x(obj, j, q1y0.m174945k(obj2, j));
                        m14876j(obj, i3, i);
                    }
                    break;
                case 60:
                    m14874h(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m14882r(obj2, i3, i)) {
                        q1y0.m174958x(obj, j, q1y0.m174945k(obj2, j));
                        m14876j(obj, i3, i);
                    }
                    break;
                case 68:
                    m14874h(obj, obj2, i);
                    break;
            }
        }
        C2415j0.m14910u(this.f10380j, obj, obj2);
        if (this.f10376f) {
            C2415j0.m14909t(this.f10381k, obj, obj2);
        }
    }
}
