package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.aax0;
import p149l.bbx0;
import p149l.cbx0;
import p149l.d8x0;
import p149l.dax0;
import p149l.dbx0;
import p149l.e8x0;
import p149l.hbx0;
import p149l.i8x0;
import p149l.icx0;
import p149l.ig3;
import p149l.jax0;
import p149l.jbx0;
import p149l.jcx0;
import p149l.kbx0;
import p149l.obx0;
import p149l.pax0;
import p149l.r7x0;
import p149l.rcx0;
import p149l.t8x0;
import p149l.ubx0;
import p149l.wax0;
import p149l.x6x0;
import p149l.x9g0;
import p149l.z7x0;
import p149l.zax0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2246s5<T> implements obx0<T> {

    /* JADX INFO: renamed from: p */
    public static final int[] f10035p = new int[0];

    /* JADX INFO: renamed from: q */
    public static final Unsafe f10036q = rcx0.m178839q();

    /* JADX INFO: renamed from: a */
    public final int[] f10037a;

    /* JADX INFO: renamed from: b */
    public final Object[] f10038b;

    /* JADX INFO: renamed from: c */
    public final int f10039c;

    /* JADX INFO: renamed from: d */
    public final int f10040d;

    /* JADX INFO: renamed from: e */
    public final zax0 f10041e;

    /* JADX INFO: renamed from: f */
    public final boolean f10042f;

    /* JADX INFO: renamed from: g */
    public final boolean f10043g;

    /* JADX INFO: renamed from: h */
    public final int[] f10044h;

    /* JADX INFO: renamed from: i */
    public final int f10045i;

    /* JADX INFO: renamed from: j */
    public final int f10046j;

    /* JADX INFO: renamed from: k */
    public final jax0 f10047k;

    /* JADX INFO: renamed from: l */
    public final icx0 f10048l;

    /* JADX INFO: renamed from: m */
    public final e8x0 f10049m;

    /* JADX INFO: renamed from: n */
    public final dbx0 f10050n;

    /* JADX INFO: renamed from: o */
    public final pax0 f10051o;

    public C2246s5(int[] iArr, Object[] objArr, int i, int i2, zax0 zax0Var, int i3, boolean z, int[] iArr2, int i4, int i5, dbx0 dbx0Var, jax0 jax0Var, icx0 icx0Var, e8x0 e8x0Var, pax0 pax0Var) {
        this.f10037a = iArr;
        this.f10038b = objArr;
        this.f10039c = i;
        this.f10040d = i2;
        this.f10043g = zax0Var instanceof AbstractC2222p5;
        boolean z2 = false;
        if (e8x0Var != null && e8x0Var.mo115314h(zax0Var)) {
            z2 = true;
        }
        this.f10042f = z2;
        this.f10044h = iArr2;
        this.f10045i = i4;
        this.f10046j = i5;
        this.f10050n = dbx0Var;
        this.f10047k = jax0Var;
        this.f10048l = icx0Var;
        this.f10049m = e8x0Var;
        this.f10041e = zax0Var;
        this.f10051o = pax0Var;
    }

    /* JADX INFO: renamed from: B */
    public static jcx0 m13261B(Object obj) {
        AbstractC2222p5 abstractC2222p5 = (AbstractC2222p5) obj;
        jcx0 jcx0Var = abstractC2222p5.zzc;
        if (jcx0Var != jcx0.m140997c()) {
            return jcx0Var;
        }
        jcx0 jcx0VarM140999f = jcx0.m140999f();
        abstractC2222p5.zzc = jcx0VarM140999f;
        return jcx0VarM140999f;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0268  */
    /* JADX WARN: Code duplicated, block: B:127:0x026e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0284  */
    /* JADX WARN: Code duplicated, block: B:131:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x0351  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ad  */
    /* JADX INFO: renamed from: C */
    public static C2246s5 m13262C(Class cls, wax0 wax0Var, dbx0 dbx0Var, jax0 jax0Var, icx0 icx0Var, e8x0 e8x0Var, pax0 pax0Var) {
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
        Field fieldM13268i;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldM13268i2;
        int i27;
        Object obj2;
        Field fieldM13268i3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(wax0Var instanceof jbx0)) {
            throw null;
        }
        jbx0 jbx0Var = (jbx0) wax0Var;
        String strM140829a = jbx0Var.m140829a();
        int length = strM140829a.length();
        char c = 55296;
        if (strM140829a.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strM140829a.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strM140829a.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strM140829a.charAt(i33);
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
            iArr = f10035p;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strM140829a.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strM140829a.charAt(i36);
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
            int iCharAt4 = strM140829a.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strM140829a.charAt(i39);
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
            int iCharAt5 = strM140829a.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strM140829a.charAt(i42);
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
            int iCharAt6 = strM140829a.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strM140829a.charAt(i45);
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
            iCharAt = strM140829a.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strM140829a.charAt(i48);
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
            int iCharAt7 = strM140829a.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strM140829a.charAt(i51);
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
            int iCharAt8 = strM140829a.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strM140829a.charAt(i54);
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
            int iCharAt9 = strM140829a.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strM140829a.charAt(i57);
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
        Unsafe unsafe = f10036q;
        Object[] objArrM140830b = jbx0Var.m140830b();
        Class<?> cls2 = jbx0Var.zza().getClass();
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
            int iCharAt10 = strM140829a.charAt(i33);
            if (iCharAt10 >= c) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = strM140829a.charAt(i69);
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
            int iCharAt11 = strM140829a.charAt(i16);
            if (iCharAt11 >= c) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = strM140829a.charAt(i73);
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
            jbx0 jbx0Var2 = jbx0Var;
            if (i75 >= 51) {
                int i77 = i17 + 1;
                int iCharAt12 = strM140829a.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        cCharAt10 = strM140829a.charAt(i79);
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
                    objArr[i83 + i83 + 1] = objArrM140830b[i2];
                } else {
                    if (i82 == 12) {
                        if (jbx0Var2.zzc() == 1 || i76 != 0) {
                            i25 = i2 + 1;
                            int i84 = i63 / 3;
                            objArr[i84 + i84 + 1] = objArrM140830b[i2];
                        } else {
                            i76 = 0;
                        }
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrM140830b[i26];
                    if (obj instanceof Field) {
                        fieldM13268i2 = (Field) obj;
                    } else {
                        fieldM13268i2 = m13268i(cls2, (String) obj);
                        objArrM140830b[i26] = fieldM13268i2;
                    }
                    int i85 = iCharAt10;
                    int i86 = i76;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM13268i2);
                    i27 = i26 + 1;
                    obj2 = objArrM140830b[i27];
                    if (obj2 instanceof Field) {
                        fieldM13268i3 = (Field) obj2;
                    } else {
                        fieldM13268i3 = m13268i(cls2, (String) obj2);
                        objArrM140830b[i27] = fieldM13268i3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM13268i3);
                    strM140829a = strM140829a;
                    i20 = i81;
                    i76 = i86;
                    i21 = 0;
                    i18 = i85;
                }
                i2 = i25;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrM140830b[i26];
                if (obj instanceof Field) {
                    fieldM13268i2 = (Field) obj;
                } else {
                    fieldM13268i2 = m13268i(cls2, (String) obj);
                    objArrM140830b[i26] = fieldM13268i2;
                }
                int i87 = iCharAt10;
                int i88 = i76;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM13268i2);
                i27 = i26 + 1;
                obj2 = objArrM140830b[i27];
                if (obj2 instanceof Field) {
                    fieldM13268i3 = (Field) obj2;
                } else {
                    fieldM13268i3 = m13268i(cls2, (String) obj2);
                    objArrM140830b[i27] = fieldM13268i3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM13268i3);
                strM140829a = strM140829a;
                i20 = i81;
                i76 = i88;
                i21 = 0;
                i18 = i87;
            } else {
                i18 = iCharAt10;
                int i89 = i2 + 1;
                Field fieldM13268i4 = m13268i(cls2, (String) objArrM140830b[i2]);
                if (i75 == 9 || i75 == 17) {
                    int i90 = i63 / 3;
                    objArr[i90 + i90 + 1] = fieldM13268i4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i23 = i2 + 2;
                            i22 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i18 = i18;
                            if (jbx0Var2.zzc() == 1 || i76 != 0) {
                                i23 = i2 + 2;
                                int i91 = i63 / 3;
                                objArr[i91 + i91 + 1] = objArrM140830b[i89];
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
                            objArr[i94] = objArrM140830b[i89];
                            if (i76 != 0) {
                                objArr[i94 + 1] = objArrM140830b[i19];
                                i19 = i2 + 3;
                                i65 = i92;
                                i18 = i18;
                            } else {
                                i65 = i92;
                                i76 = 0;
                                i18 = i18;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13268i4);
                        iCharAt11 = iCharAt11;
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            i20 = i17;
                            iObjectFieldOffset2 = 1048575;
                            i21 = 0;
                        } else {
                            int i95 = i17 + 1;
                            int iCharAt13 = strM140829a.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i20 = i95 + 1;
                                    cCharAt9 = strM140829a.charAt(i95);
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
                            Object obj3 = objArrM140830b[i98];
                            if (obj3 instanceof Field) {
                                fieldM13268i = (Field) obj3;
                            } else {
                                fieldM13268i = m13268i(cls2, (String) obj3);
                                objArrM140830b[i98] = fieldM13268i;
                            }
                            i21 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM13268i);
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
                    objArr[i99 + i99 + i22] = objArrM140830b[i89];
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13268i4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13268i4);
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
            iArr3[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i76 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | iObjectFieldOffset3;
            i63 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i33 = i20;
            jbx0Var = jbx0Var2;
            strM140829a = strM140829a;
            length = length;
            c = 55296;
        }
        jbx0 jbx0Var3 = jbx0Var;
        return new C2246s5(iArr3, objArr, i3, i5, jbx0Var3.zza(), jbx0Var3.zzc(), false, iArr, i6, i61, dbx0Var, jax0Var, icx0Var, e8x0Var, pax0Var);
    }

    /* JADX INFO: renamed from: D */
    public static double m13263D(Object obj, long j) {
        return ((Double) rcx0.m178838p(obj, j)).doubleValue();
    }

    /* JADX INFO: renamed from: E */
    public static float m13264E(Object obj, long j) {
        return ((Float) rcx0.m178838p(obj, j)).floatValue();
    }

    /* JADX INFO: renamed from: F */
    public static int m13265F(Object obj, long j) {
        return ((Integer) rcx0.m178838p(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: J */
    public static int m13266J(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: L */
    public static long m13267L(Object obj, long j) {
        return ((Long) rcx0.m178838p(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: i */
    public static Field m13268i(Class cls, String str) {
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

    /* JADX INFO: renamed from: j */
    public static void m13269j(Object obj) {
        if (m13272w(obj)) {
            return;
        }
        ig3.m135964a("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m13270s(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m13271v(Object obj, int i, obx0 obx0Var) {
        return obx0Var.mo13286c(rcx0.m178838p(obj, i & 1048575));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m13272w(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2222p5) {
            return ((AbstractC2222p5) obj).m13180F();
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m13273y(Object obj, long j) {
        return ((Boolean) rcx0.m178838p(obj, j)).booleanValue();
    }

    /* JADX INFO: renamed from: z */
    public static final void m13274z(int i, Object obj, z7x0 z7x0Var) throws IOException {
        if (obj instanceof String) {
            z7x0Var.m217523f(i, (String) obj);
        } else {
            z7x0Var.m217531o(i, (zzgyl) obj);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34461. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: A */
    public final int m13275A(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, p149l.x6x0 r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2246s5.m13275A(java.lang.Object, byte[], int, int, int, l.x6x0):int");
    }

    /* JADX INFO: renamed from: G */
    public final int m13276G(int i) {
        if (i < this.f10039c || i > this.f10040d) {
            return -1;
        }
        return m13278I(i, 0);
    }

    /* JADX INFO: renamed from: H */
    public final int m13277H(int i) {
        return this.f10037a[i + 2];
    }

    /* JADX INFO: renamed from: I */
    public final int m13278I(int i, int i2) {
        int length = (this.f10037a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f10037a[i4];
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

    /* JADX INFO: renamed from: K */
    public final int m13279K(int i) {
        return this.f10037a[i + 1];
    }

    /* JADX INFO: renamed from: M */
    public final t8x0 m13280M(int i) {
        int i2 = i / 3;
        return (t8x0) this.f10038b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: N */
    public final obx0 m13281N(int i) {
        Object[] objArr = this.f10038b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        obx0 obx0Var = (obx0) objArr[i3];
        if (obx0Var != null) {
            return obx0Var;
        }
        obx0 obx0VarM130352b = hbx0.m130351a().m130352b((Class) objArr[i3 + 1]);
        this.f10038b[i3] = obx0VarM130352b;
        return obx0VarM130352b;
    }

    /* JADX INFO: renamed from: O */
    public final Object m13282O(Object obj, int i, Object obj2, icx0 icx0Var, Object obj3) {
        int i2 = this.f10037a[i];
        Object objM178838p = rcx0.m178838p(obj, m13279K(i) & 1048575);
        if (objM178838p == null || m13280M(i) == null) {
            return obj2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: P */
    public final Object m13283P(int i) {
        int i2 = i / 3;
        return this.f10038b[i2 + i2];
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // p149l.obx0
    /* JADX INFO: renamed from: a */
    public final void mo13284a(Object obj) {
        if (m13272w(obj)) {
            if (obj instanceof AbstractC2222p5) {
                AbstractC2222p5 abstractC2222p5 = (AbstractC2222p5) obj;
                abstractC2222p5.m13178D(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                abstractC2222p5.zza = 0;
                abstractC2222p5.m13177B();
            }
            int[] iArr = this.f10037a;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM13279K = m13279K(i);
                int i2 = 1048575 & iM13279K;
                int iM13266J = m13266J(iM13279K);
                long j = i2;
                if (iM13266J != 9) {
                    if (iM13266J != 60 && iM13266J != 68) {
                        switch (iM13266J) {
                            case 17:
                                if (m13300t(obj, i)) {
                                    m13281N(i).mo13284a(f10036q.getObject(obj, j));
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
                                this.f10047k.mo120320b(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = f10036q;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzhay) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m13302x(obj, this.f10037a[i], i)) {
                        m13281N(i).mo13284a(f10036q.getObject(obj, j));
                    }
                } else if (m13300t(obj, i)) {
                    m13281N(i).mo13284a(f10036q.getObject(obj, j));
                }
            }
            this.f10048l.mo13473m(obj);
            if (this.f10042f) {
                this.f10049m.mo115311e(obj);
            }
        }
    }

    @Override // p149l.obx0
    /* JADX INFO: renamed from: b */
    public final boolean mo13285b(Object obj, Object obj2) {
        boolean zM192972z;
        for (int i = 0; i < this.f10037a.length; i += 3) {
            int iM13279K = m13279K(i);
            long j = iM13279K & 1048575;
            switch (m13266J(iM13279K)) {
                case 0:
                    if (!m13299r(obj, obj2, i) || Double.doubleToLongBits(rcx0.m178832j(obj, j)) != Double.doubleToLongBits(rcx0.m178832j(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!m13299r(obj, obj2, i) || Float.floatToIntBits(rcx0.m178833k(obj, j)) != Float.floatToIntBits(rcx0.m178833k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!m13299r(obj, obj2, i) || rcx0.m178836n(obj, j) != rcx0.m178836n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!m13299r(obj, obj2, i) || rcx0.m178836n(obj, j) != rcx0.m178836n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!m13299r(obj, obj2, i) || rcx0.m178834l(obj, j) != rcx0.m178834l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!m13299r(obj, obj2, i) || rcx0.m178836n(obj, j) != rcx0.m178836n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!m13299r(obj, obj2, i) || rcx0.m178834l(obj, j) != rcx0.m178834l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!m13299r(obj, obj2, i) || rcx0.m178822H(obj, j) != rcx0.m178822H(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!m13299r(obj, obj2, i) || !ubx0.m192972z(rcx0.m178838p(obj, j), rcx0.m178838p(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!m13299r(obj, obj2, i) || !ubx0.m192972z(rcx0.m178838p(obj, j), rcx0.m178838p(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!m13299r(obj, obj2, i) || !ubx0.m192972z(rcx0.m178838p(obj, j), rcx0.m178838p(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!m13299r(obj, obj2, i) || rcx0.m178834l(obj, j) != rcx0.m178834l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!m13299r(obj, obj2, i) || rcx0.m178834l(obj, j) != rcx0.m178834l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!m13299r(obj, obj2, i) || rcx0.m178834l(obj, j) != rcx0.m178834l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!m13299r(obj, obj2, i) || rcx0.m178836n(obj, j) != rcx0.m178836n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!m13299r(obj, obj2, i) || rcx0.m178834l(obj, j) != rcx0.m178834l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!m13299r(obj, obj2, i) || rcx0.m178836n(obj, j) != rcx0.m178836n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!m13299r(obj, obj2, i) || !ubx0.m192972z(rcx0.m178838p(obj, j), rcx0.m178838p(obj2, j))) {
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
                    zM192972z = ubx0.m192972z(rcx0.m178838p(obj, j), rcx0.m178838p(obj2, j));
                    break;
                case 50:
                    zM192972z = ubx0.m192972z(rcx0.m178838p(obj, j), rcx0.m178838p(obj2, j));
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
                    long jM13277H = m13277H(i) & 1048575;
                    if (rcx0.m178834l(obj, jM13277H) != rcx0.m178834l(obj2, jM13277H) || !ubx0.m192972z(rcx0.m178838p(obj, j), rcx0.m178838p(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zM192972z) {
                return false;
            }
        }
        if (!this.f10048l.mo13464d(obj).equals(this.f10048l.mo13464d(obj2))) {
            return false;
        }
        if (!this.f10042f) {
            return true;
        }
        this.f10049m.mo115307a(obj);
        this.f10049m.mo115307a(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6 A[LOOP:1: B:46:0x00a5->B:51:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[SYNTHETIC] */
    @Override // p149l.obx0
    /* JADX INFO: renamed from: c */
    public final boolean mo13286c(Object obj) {
        int i;
        int i2;
        int i3;
        List list;
        obx0 obx0VarM13281N;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i6 < this.f10045i) {
            int[] iArr = this.f10044h;
            int[] iArr2 = this.f10037a;
            int i8 = iArr[i6];
            int i9 = iArr2[i8];
            int iM13279K = m13279K(i8);
            int i10 = this.f10037a[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i7) {
                if (i11 != 1048575) {
                    i5 = f10036q.getInt(obj, i11);
                }
                i = i5;
                i7 = i11;
            } else {
                i = i5;
            }
            if ((268435456 & iM13279K) != 0) {
                i2 = i8;
                i3 = i7;
                if (!m13301u(obj, i2, i3, i, i12)) {
                    return false;
                }
            } else {
                i2 = i8;
                i3 = i7;
            }
            int iM13266J = m13266J(iM13279K);
            if (iM13266J == 9 || iM13266J == 17) {
                if (m13301u(obj, i2, i3, i, i12) && !m13271v(obj, iM13279K, m13281N(i2))) {
                    return false;
                }
            } else if (iM13266J == 27) {
                list = (List) rcx0.m178838p(obj, iM13279K & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    obx0VarM13281N = m13281N(i2);
                    for (i4 = 0; i4 < list.size(); i4++) {
                        if (!obx0VarM13281N.mo13286c(list.get(i4))) {
                            return false;
                        }
                    }
                }
            } else if (iM13266J == 60 || iM13266J == 68) {
                if (m13302x(obj, i9, i2) && !m13271v(obj, iM13279K, m13281N(i2))) {
                    return false;
                }
            } else if (iM13266J == 49) {
                list = (List) rcx0.m178838p(obj, iM13279K & 1048575);
                if (list.isEmpty()) {
                    obx0VarM13281N = m13281N(i2);
                    while (i4 < list.size()) {
                        if (!obx0VarM13281N.mo13286c(list.get(i4))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iM13266J == 50 && !((zzhay) rcx0.m178838p(obj, iM13279K & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i7 = i3;
            i5 = i;
        }
        if (!this.f10042f) {
            return true;
        }
        this.f10049m.mo115307a(obj);
        throw null;
    }

    @Override // p149l.obx0
    /* JADX INFO: renamed from: d */
    public final void mo13287d(Object obj, byte[] bArr, int i, int i2, x6x0 x6x0Var) throws IOException {
        m13275A(obj, bArr, i, i2, 0, x6x0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p149l.obx0
    /* JADX INFO: renamed from: e */
    public final void mo13288e(Object obj, z7x0 z7x0Var) throws IOException {
        int i;
        C2246s5<T> c2246s5 = this;
        if (c2246s5.f10042f) {
            c2246s5.f10049m.mo115307a(obj);
            throw null;
        }
        int[] iArr = c2246s5.f10037a;
        Unsafe unsafe = f10036q;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iM13279K = c2246s5.m13279K(i4);
            int[] iArr2 = c2246s5.f10037a;
            int iM13266J = m13266J(iM13279K);
            int i6 = iArr2[i4];
            if (iM13266J <= 17) {
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
            long j = iM13279K & i2;
            switch (iM13266J) {
                case 0:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217533q(i6, rcx0.m178832j(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217542z(i6, rcx0.m178833k(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217511E(i6, unsafe.getLong(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217527j(i6, unsafe.getLong(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217509C(i6, unsafe.getInt(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217540x(i6, unsafe.getLong(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217538v(i6, unsafe.getInt(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217529m(i6, rcx0.m178822H(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        m13274z(i6, unsafe.getObject(obj, j), z7x0Var);
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217513G(i6, unsafe.getObject(obj, j), c2246s5.m13281N(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217531o(i6, (zzgyl) unsafe.getObject(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217525h(i6, unsafe.getInt(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217536t(i6, unsafe.getInt(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217514H(i6, unsafe.getInt(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217516J(i6, unsafe.getLong(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217518a(i6, unsafe.getInt(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217520c(i6, unsafe.getLong(obj, j));
                    }
                    c2246s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (c2246s5.m13301u(obj, i4, i3, i5, i)) {
                        z7x0Var.m217508B(i6, unsafe.getObject(obj, j), c2246s5.m13281N(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    ubx0.m192941B(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    ubx0.m192945F(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    ubx0.m192947a(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    ubx0.m192953g(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    ubx0.m192946G(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    ubx0.m192944E(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    ubx0.m192943D(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    ubx0.m192940A(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i9 = c2246s5.f10037a[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = ubx0.f175768a;
                    if (list != null && !list.isEmpty()) {
                        z7x0Var.m217524g(i9, list);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 27:
                    int i10 = c2246s5.f10037a[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    obx0 obx0VarM13281N = c2246s5.m13281N(i4);
                    Class cls2 = ubx0.f175768a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i11 = 0; i11 < list2.size(); i11++) {
                            z7x0Var.m217513G(i10, list2.get(i11), obx0VarM13281N);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 28:
                    int i12 = c2246s5.f10037a[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = ubx0.f175768a;
                    if (list3 != null && !list3.isEmpty()) {
                        z7x0Var.m217532p(i12, list3);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 29:
                    ubx0.m192952f(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    ubx0.m192942C(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    ubx0.m192948b(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    ubx0.m192949c(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    ubx0.m192950d(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    ubx0.m192951e(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    ubx0.m192941B(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 36:
                    ubx0.m192945F(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 37:
                    ubx0.m192947a(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 38:
                    ubx0.m192953g(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 39:
                    ubx0.m192946G(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 40:
                    ubx0.m192944E(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 41:
                    ubx0.m192943D(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 42:
                    ubx0.m192940A(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 43:
                    ubx0.m192952f(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 44:
                    ubx0.m192942C(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 45:
                    ubx0.m192948b(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 46:
                    ubx0.m192949c(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 47:
                    ubx0.m192950d(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 48:
                    ubx0.m192951e(c2246s5.f10037a[i4], (List) unsafe.getObject(obj, j), z7x0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 49:
                    int i13 = c2246s5.f10037a[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    obx0 obx0VarM13281N2 = c2246s5.m13281N(i4);
                    Class cls4 = ubx0.f175768a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i14 = 0; i14 < list4.size(); i14++) {
                            z7x0Var.m217508B(i13, list4.get(i14), obx0VarM13281N2);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 51:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217533q(i6, m13263D(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 52:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217542z(i6, m13264E(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217511E(i6, m13267L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217527j(i6, m13267L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217509C(i6, m13265F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217540x(i6, m13267L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217538v(i6, m13265F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217529m(i6, m13273y(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        m13274z(i6, unsafe.getObject(obj, j), z7x0Var);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 60:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217513G(i6, unsafe.getObject(obj, j), c2246s5.m13281N(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 61:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217531o(i6, (zzgyl) unsafe.getObject(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 62:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217525h(i6, m13265F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 63:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217536t(i6, m13265F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 64:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217514H(i6, m13265F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 65:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217516J(i6, m13267L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217518a(i6, m13265F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217520c(i6, m13267L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (c2246s5.m13302x(obj, i6, i4)) {
                        z7x0Var.m217508B(i6, unsafe.getObject(obj, j), c2246s5.m13281N(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                default:
                    i4 += 3;
                    i2 = 1048575;
                    break;
            }
        }
        icx0 icx0Var = c2246s5.f10048l;
        icx0Var.mo13477r(icx0Var.mo13464d(obj), z7x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x05bd A[Catch: all -> 0x05c3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x05c3, blocks: (B:32:0x0070, B:179:0x05bd, B:115:0x02d0, B:116:0x02de, B:117:0x02ed, B:118:0x02fc, B:119:0x030b, B:120:0x031a, B:121:0x0329, B:122:0x0338, B:123:0x0347, B:124:0x0356, B:125:0x0365, B:126:0x0374, B:127:0x0383, B:135:0x03b3, B:136:0x03c1, B:137:0x03d0, B:138:0x03e3, B:142:0x03ef, B:143:0x03fc, B:144:0x040c, B:145:0x041b, B:146:0x042a, B:147:0x0439, B:148:0x0448, B:149:0x0457, B:150:0x0466, B:151:0x0475, B:152:0x0484, B:153:0x0497, B:154:0x04a7, B:155:0x04b7, B:156:0x04c7, B:157:0x04d7, B:159:0x04e4, B:162:0x04eb, B:163:0x04f1, B:164:0x04fc, B:165:0x050c, B:166:0x051c, B:167:0x052f, B:168:0x0538, B:169:0x0548, B:170:0x0558, B:171:0x0568, B:172:0x0578, B:173:0x0588, B:174:0x0598, B:175:0x05a8), top: B:211:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x05d3 A[LOOP:3: B:186:0x05cf->B:188:0x05d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:204:0x05fe A[LOOP:2: B:202:0x05fa->B:204:0x05fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x060c  */
    /* JADX WARN: Code duplicated, block: B:243:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[SYNTHETIC] */
    @Override // p149l.obx0
    /* JADX INFO: renamed from: f */
    public final void mo13289f(Object obj, kbx0 kbx0Var, d8x0 d8x0Var) throws Throwable {
        Object obj2;
        Throwable th;
        int i;
        Object objM13282O;
        Object objM13282O2;
        Object obj3;
        kbx0 kbx0Var2;
        d8x0 d8x0Var2;
        int i2;
        Object obj4;
        Object objM192968v;
        d8x0Var.getClass();
        m13269j(obj);
        icx0 icx0Var = this.f10048l;
        e8x0 e8x0Var = this.f10049m;
        Object objMo13463c = null;
        i8x0 i8x0VarMo115308b = null;
        while (true) {
            try {
                int iZzc = kbx0Var.zzc();
                int iM13276G = m13276G(iZzc);
                if (iM13276G >= 0) {
                    d8x0 d8x0Var3 = d8x0Var;
                    obj3 = obj;
                    kbx0Var2 = kbx0Var;
                    d8x0Var2 = d8x0Var3;
                    try {
                        int iM13279K = m13279K(iM13276G);
                        try {
                            try {
                                switch (m13266J(iM13279K)) {
                                    case 0:
                                        obj2 = obj3;
                                        rcx0.m178848z(obj2, iM13279K & 1048575, kbx0Var2.zza());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 1:
                                        obj2 = obj3;
                                        rcx0.m178815A(obj2, iM13279K & 1048575, kbx0Var2.zzb());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 2:
                                        obj2 = obj3;
                                        rcx0.m178817C(obj2, iM13279K & 1048575, kbx0Var2.zzl());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 3:
                                        obj2 = obj3;
                                        rcx0.m178817C(obj2, iM13279K & 1048575, kbx0Var2.zzo());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 4:
                                        obj2 = obj3;
                                        rcx0.m178816B(obj2, iM13279K & 1048575, kbx0Var2.zzg());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 5:
                                        obj2 = obj3;
                                        rcx0.m178817C(obj2, iM13279K & 1048575, kbx0Var2.zzk());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 6:
                                        obj2 = obj3;
                                        rcx0.m178816B(obj2, iM13279K & 1048575, kbx0Var2.zzf());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 7:
                                        obj2 = obj3;
                                        rcx0.m178846x(obj2, iM13279K & 1048575, kbx0Var2.zzN());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 8:
                                        obj2 = obj3;
                                        m13294m(obj2, iM13279K, kbx0Var2);
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 9:
                                        obj2 = obj3;
                                        zax0 zax0Var = (zax0) m13290g(obj2, iM13276G);
                                        kbx0Var2.mo145328a(zax0Var, m13281N(iM13276G), d8x0Var2);
                                        m13297p(obj2, iM13276G, zax0Var);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 10:
                                        obj2 = obj3;
                                        rcx0.m178818D(obj2, iM13279K & 1048575, kbx0Var2.zzp());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 11:
                                        obj2 = obj3;
                                        rcx0.m178816B(obj2, iM13279K & 1048575, kbx0Var2.zzj());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 12:
                                        obj2 = obj3;
                                        int iZze = kbx0Var2.zze();
                                        t8x0 t8x0VarM13280M = m13280M(iM13276G);
                                        if (t8x0VarM13280M == null || t8x0VarM13280M.zza(iZze)) {
                                            rcx0.m178816B(obj2, iM13279K & 1048575, iZze);
                                            m13295n(obj2, iM13276G);
                                        } else {
                                            objMo13463c = ubx0.m192969w(obj2, iZzc, iZze, objMo13463c, icx0Var);
                                        }
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 13:
                                        obj2 = obj3;
                                        rcx0.m178816B(obj2, iM13279K & 1048575, kbx0Var2.zzh());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 14:
                                        obj2 = obj3;
                                        rcx0.m178817C(obj2, iM13279K & 1048575, kbx0Var2.zzm());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 15:
                                        obj2 = obj3;
                                        rcx0.m178816B(obj2, iM13279K & 1048575, kbx0Var2.zzi());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 16:
                                        obj2 = obj3;
                                        rcx0.m178817C(obj2, iM13279K & 1048575, kbx0Var2.zzn());
                                        m13295n(obj2, iM13276G);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 17:
                                        obj2 = obj3;
                                        zax0 zax0Var2 = (zax0) m13290g(obj2, iM13276G);
                                        kbx0Var2.mo145329b(zax0Var2, m13281N(iM13276G), d8x0Var2);
                                        m13297p(obj2, iM13276G, zax0Var2);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 18:
                                        obj2 = obj3;
                                        kbx0Var2.zzx(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 19:
                                        obj2 = obj3;
                                        kbx0Var2.zzB(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 20:
                                        obj2 = obj3;
                                        kbx0Var2.zzE(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 21:
                                        obj2 = obj3;
                                        kbx0Var2.zzM(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 22:
                                        obj2 = obj3;
                                        kbx0Var2.zzD(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 23:
                                        obj2 = obj3;
                                        kbx0Var2.zzA(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 24:
                                        obj2 = obj3;
                                        kbx0Var2.zzz(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 25:
                                        obj2 = obj3;
                                        kbx0Var2.zzv(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 26:
                                        obj2 = obj3;
                                        boolean zM13270s = m13270s(iM13279K);
                                        jax0 jax0Var = this.f10047k;
                                        if (zM13270s) {
                                            ((r7x0) kbx0Var2).m178220e(jax0Var.mo120319a(obj2, iM13279K & 1048575), true);
                                        } else {
                                            ((r7x0) kbx0Var2).m178220e(jax0Var.mo120319a(obj2, iM13279K & 1048575), false);
                                        }
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 27:
                                        obj2 = obj3;
                                        kbx0Var2.mo145331d(this.f10047k.mo120319a(obj2, iM13279K & 1048575), m13281N(iM13276G), d8x0Var2);
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 28:
                                        obj2 = obj3;
                                        kbx0Var2.zzw(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 29:
                                        obj2 = obj3;
                                        kbx0Var2.zzL(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 30:
                                        List listMo120319a = this.f10047k.mo120319a(obj3, iM13279K & 1048575);
                                        kbx0Var2.zzy(listMo120319a);
                                        t8x0 t8x0VarM13280M2 = m13280M(iM13276G);
                                        Object obj5 = objMo13463c;
                                        icx0 icx0Var2 = icx0Var;
                                        obj4 = obj3;
                                        try {
                                            objM192968v = ubx0.m192968v(obj4, iZzc, listMo120319a, t8x0VarM13280M2, obj5, icx0Var2);
                                            obj2 = obj4;
                                            icx0Var = icx0Var2;
                                            objMo13463c = objM192968v;
                                        } catch (zzhaf unused) {
                                            objMo13463c = obj5;
                                            icx0Var = icx0Var2;
                                            obj2 = obj4;
                                            try {
                                                icx0Var.mo13476q(kbx0Var2);
                                                if (objMo13463c == null) {
                                                    objMo13463c = icx0Var.mo13463c(obj2);
                                                }
                                                try {
                                                    if (!icx0Var.m135371p(objMo13463c, kbx0Var2)) {
                                                        objM13282O2 = objMo13463c;
                                                        for (i2 = this.f10045i; i2 < this.f10046j; i2++) {
                                                            objM13282O2 = m13282O(obj2, this.f10044h[i2], objM13282O2, icx0Var, obj2);
                                                        }
                                                        if (objM13282O2 != null) {
                                                            icx0Var.mo13474n(obj2, objM13282O2);
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    objM13282O = objMo13463c;
                                                    for (i = this.f10045i; i < this.f10046j; i++) {
                                                        objM13282O = this.m13282O(obj2, this.f10044h[i], objM13282O, icx0Var, obj2);
                                                    }
                                                    if (objM13282O != null) {
                                                        throw th;
                                                    }
                                                    icx0Var.mo13474n(obj2, objM13282O);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                this = this;
                                                th = th3;
                                            }
                                        }
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 31:
                                        obj2 = obj3;
                                        kbx0Var2.zzG(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 32:
                                        obj2 = obj3;
                                        kbx0Var2.zzH(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 33:
                                        obj2 = obj3;
                                        kbx0Var2.zzI(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 34:
                                        obj2 = obj3;
                                        kbx0Var2.zzJ(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 35:
                                        obj2 = obj3;
                                        kbx0Var2.zzx(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 36:
                                        obj2 = obj3;
                                        kbx0Var2.zzB(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 37:
                                        obj2 = obj3;
                                        kbx0Var2.zzE(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 38:
                                        obj2 = obj3;
                                        kbx0Var2.zzM(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 39:
                                        obj2 = obj3;
                                        kbx0Var2.zzD(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 40:
                                        obj2 = obj3;
                                        kbx0Var2.zzA(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 41:
                                        obj2 = obj3;
                                        kbx0Var2.zzz(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 42:
                                        obj2 = obj3;
                                        kbx0Var2.zzv(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 43:
                                        obj2 = obj3;
                                        try {
                                            kbx0Var2.zzL(this.f10047k.mo120319a(obj2, iM13279K & 1048575));
                                        } catch (zzhaf unused2) {
                                            icx0Var.mo13476q(kbx0Var2);
                                            if (objMo13463c == null) {
                                                objMo13463c = icx0Var.mo13463c(obj2);
                                            }
                                            if (!icx0Var.m135371p(objMo13463c, kbx0Var2)) {
                                                objM13282O2 = objMo13463c;
                                                while (i2 < this.f10046j) {
                                                    objM13282O2 = m13282O(obj2, this.f10044h[i2], objM13282O2, icx0Var, obj2);
                                                }
                                                if (objM13282O2 != null) {
                                                    icx0Var.mo13474n(obj2, objM13282O2);
                                                }
                                            }
                                        }
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 44:
                                        List listMo120319a2 = this.f10047k.mo120319a(obj3, iM13279K & 1048575);
                                        kbx0Var2.zzy(listMo120319a2);
                                        t8x0 t8x0VarM13280M3 = m13280M(iM13276G);
                                        Object obj6 = objMo13463c;
                                        icx0 icx0Var3 = icx0Var;
                                        obj4 = obj3;
                                        try {
                                            try {
                                                objM192968v = ubx0.m192968v(obj4, iZzc, listMo120319a2, t8x0VarM13280M3, obj6, icx0Var3);
                                                obj2 = obj4;
                                                icx0Var = icx0Var3;
                                                objMo13463c = objM192968v;
                                            } catch (zzhaf unused3) {
                                                objMo13463c = obj6;
                                                icx0Var = icx0Var3;
                                                obj2 = obj4;
                                                icx0Var.mo13476q(kbx0Var2);
                                                if (objMo13463c == null) {
                                                    objMo13463c = icx0Var.mo13463c(obj2);
                                                }
                                                if (!icx0Var.m135371p(objMo13463c, kbx0Var2)) {
                                                    objM13282O2 = objMo13463c;
                                                    while (i2 < this.f10046j) {
                                                        objM13282O2 = m13282O(obj2, this.f10044h[i2], objM13282O2, icx0Var, obj2);
                                                    }
                                                    if (objM13282O2 != null) {
                                                        icx0Var.mo13474n(obj2, objM13282O2);
                                                    }
                                                }
                                            }
                                            d8x0Var = d8x0Var2;
                                            kbx0Var = kbx0Var2;
                                            obj = obj2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            objMo13463c = obj6;
                                            icx0Var = icx0Var3;
                                            obj2 = obj4;
                                            th = th;
                                            this = this;
                                            objM13282O = objMo13463c;
                                            while (i < this.f10046j) {
                                                objM13282O = this.m13282O(obj2, this.f10044h[i], objM13282O, icx0Var, obj2);
                                            }
                                            if (objM13282O != null) {
                                                throw th;
                                            }
                                            icx0Var.mo13474n(obj2, objM13282O);
                                            throw th;
                                        }
                                        break;
                                    case 45:
                                        kbx0Var2.zzG(this.f10047k.mo120319a(obj3, iM13279K & 1048575));
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 46:
                                        kbx0Var2.zzH(this.f10047k.mo120319a(obj3, iM13279K & 1048575));
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 47:
                                        kbx0Var2.zzI(this.f10047k.mo120319a(obj3, iM13279K & 1048575));
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 48:
                                        kbx0Var2.zzJ(this.f10047k.mo120319a(obj3, iM13279K & 1048575));
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 49:
                                        kbx0Var2.mo145330c(this.f10047k.mo120319a(obj3, iM13279K & 1048575), m13281N(iM13276G), d8x0Var2);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 50:
                                        Object objM13283P = m13283P(iM13276G);
                                        long jM13279K = m13279K(iM13276G) & 1048575;
                                        Object objM178838p = rcx0.m178838p(obj3, jM13279K);
                                        if (objM178838p == null) {
                                            objM178838p = zzhay.zza().zzb();
                                            rcx0.m178818D(obj3, jM13279K, objM178838p);
                                        } else if (pax0.m168103a(objM178838p)) {
                                            Object objZzb = zzhay.zza().zzb();
                                            pax0.m168104b(objZzb, objM178838p);
                                            rcx0.m178818D(obj3, jM13279K, objZzb);
                                            objM178838p = objZzb;
                                        }
                                        throw null;
                                    case 51:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Double.valueOf(kbx0Var2.zza()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 52:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Float.valueOf(kbx0Var2.zzb()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 53:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Long.valueOf(kbx0Var2.zzl()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 54:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Long.valueOf(kbx0Var2.zzo()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 55:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Integer.valueOf(kbx0Var2.zzg()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 56:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Long.valueOf(kbx0Var2.zzk()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 57:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Integer.valueOf(kbx0Var2.zzf()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 58:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Boolean.valueOf(kbx0Var2.zzN()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 59:
                                        m13294m(obj3, iM13279K, kbx0Var2);
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 60:
                                        zax0 zax0Var3 = (zax0) m13291h(obj3, iZzc, iM13276G);
                                        kbx0Var2.mo145328a(zax0Var3, m13281N(iM13276G), d8x0Var2);
                                        m13298q(obj3, iZzc, iM13276G, zax0Var3);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 61:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, kbx0Var2.zzp());
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 62:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Integer.valueOf(kbx0Var2.zzj()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 63:
                                        int iZze2 = kbx0Var2.zze();
                                        t8x0 t8x0VarM13280M4 = m13280M(iM13276G);
                                        if (t8x0VarM13280M4 != null && !t8x0VarM13280M4.zza(iZze2)) {
                                            objMo13463c = ubx0.m192969w(obj3, iZzc, iZze2, objMo13463c, icx0Var);
                                            kbx0Var = kbx0Var2;
                                            obj = obj3;
                                            d8x0Var = d8x0Var2;
                                        }
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Integer.valueOf(iZze2));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 64:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Integer.valueOf(kbx0Var2.zzh()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 65:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Long.valueOf(kbx0Var2.zzm()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 66:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Integer.valueOf(kbx0Var2.zzi()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 67:
                                        rcx0.m178818D(obj3, iM13279K & 1048575, Long.valueOf(kbx0Var2.zzn()));
                                        m13296o(obj3, iZzc, iM13276G);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    case 68:
                                        zax0 zax0Var4 = (zax0) m13291h(obj3, iZzc, iM13276G);
                                        kbx0Var2.mo145329b(zax0Var4, m13281N(iM13276G), d8x0Var2);
                                        m13298q(obj3, iZzc, iM13276G, zax0Var4);
                                        obj2 = obj3;
                                        d8x0Var = d8x0Var2;
                                        kbx0Var = kbx0Var2;
                                        obj = obj2;
                                        break;
                                    default:
                                        if (objMo13463c == null) {
                                            try {
                                                objMo13463c = icx0Var.mo13463c(obj3);
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                this = this;
                                                obj2 = obj3;
                                                objM13282O = objMo13463c;
                                                while (i < this.f10046j) {
                                                    objM13282O = this.m13282O(obj2, this.f10044h[i], objM13282O, icx0Var, obj2);
                                                }
                                                if (objM13282O != null) {
                                                    throw th;
                                                }
                                                icx0Var.mo13474n(obj2, objM13282O);
                                                throw th;
                                            }
                                        }
                                        if (!icx0Var.m135371p(objMo13463c, kbx0Var2)) {
                                            objM13282O2 = objMo13463c;
                                            for (int i3 = this.f10045i; i3 < this.f10046j; i3++) {
                                                objM13282O2 = m13282O(obj3, this.f10044h[i3], objM13282O2, icx0Var, obj3);
                                            }
                                            obj2 = obj3;
                                        }
                                        kbx0Var = kbx0Var2;
                                        obj = obj3;
                                        d8x0Var = d8x0Var2;
                                        break;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = obj3;
                            }
                        } catch (zzhaf unused4) {
                            obj2 = obj3;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        obj2 = obj3;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i4 = this.f10045i;
                    objM13282O2 = objMo13463c;
                    while (i4 < this.f10046j) {
                        Object obj7 = obj;
                        objM13282O2 = m13282O(obj7, this.f10044h[i4], objM13282O2, icx0Var, obj);
                        i4++;
                        obj = obj7;
                    }
                    obj2 = obj;
                } else {
                    Object obj8 = obj;
                    try {
                        Object objMo115309c = !this.f10042f ? null : e8x0Var.mo115309c(d8x0Var, this.f10041e, iZzc);
                        if (objMo115309c != null) {
                            if (i8x0VarMo115308b == null) {
                                try {
                                    i8x0VarMo115308b = e8x0Var.mo115308b(obj8);
                                } catch (Throwable th8) {
                                    th = th8;
                                    obj2 = obj8;
                                    this = this;
                                    objM13282O = objMo13463c;
                                    while (i < this.f10046j) {
                                        objM13282O = this.m13282O(obj2, this.f10044h[i], objM13282O, icx0Var, obj2);
                                    }
                                    if (objM13282O != null) {
                                        throw th;
                                    }
                                    icx0Var.mo13474n(obj2, objM13282O);
                                    throw th;
                                }
                            }
                            i8x0 i8x0Var = i8x0VarMo115308b;
                            icx0 icx0Var4 = icx0Var;
                            kbx0 kbx0Var3 = kbx0Var;
                            d8x0 d8x0Var4 = d8x0Var;
                            try {
                                objMo13463c = e8x0Var.mo115310d(obj8, kbx0Var3, objMo115309c, d8x0Var4, i8x0Var, objMo13463c, icx0Var4);
                                i8x0VarMo115308b = i8x0Var;
                                icx0Var = icx0Var4;
                                kbx0Var2 = kbx0Var3;
                                d8x0Var2 = d8x0Var4;
                                obj2 = obj8;
                                d8x0Var = d8x0Var2;
                                kbx0Var = kbx0Var2;
                                obj = obj2;
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj8;
                                icx0Var = icx0Var4;
                                th = th;
                                this = this;
                                objM13282O = objMo13463c;
                                while (i < this.f10046j) {
                                    objM13282O = this.m13282O(obj2, this.f10044h[i], objM13282O, icx0Var, obj2);
                                }
                                if (objM13282O != null) {
                                    throw th;
                                }
                                icx0Var.mo13474n(obj2, objM13282O);
                                throw th;
                            }
                        } else {
                            kbx0Var2 = kbx0Var;
                            d8x0Var2 = d8x0Var;
                            obj2 = obj8;
                            try {
                                icx0Var.mo13476q(kbx0Var2);
                                if (objMo13463c == null) {
                                    try {
                                        objMo13463c = icx0Var.mo13463c(obj2);
                                    } catch (Throwable th10) {
                                        th = th10;
                                        th = th;
                                        this = this;
                                        objM13282O = objMo13463c;
                                        while (i < this.f10046j) {
                                            objM13282O = this.m13282O(obj2, this.f10044h[i], objM13282O, icx0Var, obj2);
                                        }
                                        if (objM13282O != null) {
                                            throw th;
                                        }
                                        icx0Var.mo13474n(obj2, objM13282O);
                                        throw th;
                                    }
                                }
                                if (!icx0Var.m135371p(objMo13463c, kbx0Var2)) {
                                    objM13282O2 = objMo13463c;
                                    for (int i5 = this.f10045i; i5 < this.f10046j; i5++) {
                                        objM13282O2 = m13282O(obj2, this.f10044h[i5], objM13282O2, icx0Var, obj2);
                                    }
                                }
                                d8x0Var = d8x0Var2;
                                kbx0Var = kbx0Var2;
                                obj = obj2;
                            } catch (Throwable th11) {
                                th = th11;
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        obj3 = obj8;
                        th = th;
                        this = this;
                        obj2 = obj3;
                        objM13282O = objMo13463c;
                        while (i < this.f10046j) {
                            objM13282O = this.m13282O(obj2, this.f10044h[i], objM13282O, icx0Var, obj2);
                        }
                        if (objM13282O != null) {
                            throw th;
                        }
                        icx0Var.mo13474n(obj2, objM13282O);
                        throw th;
                    }
                }
            } catch (Throwable th13) {
                th = th13;
                obj2 = obj;
            }
            objM13282O = objMo13463c;
            while (i < this.f10046j) {
                objM13282O = this.m13282O(obj2, this.f10044h[i], objM13282O, icx0Var, obj2);
            }
            if (objM13282O != null) {
                throw th;
            }
            icx0Var.mo13474n(obj2, objM13282O);
            throw th;
        }
        if (objM13282O2 != null) {
            icx0Var.mo13474n(obj2, objM13282O2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m13290g(Object obj, int i) {
        obx0 obx0VarM13281N = m13281N(i);
        int iM13279K = m13279K(i) & 1048575;
        if (!m13300t(obj, i)) {
            return obx0VarM13281N.zze();
        }
        Object object = f10036q.getObject(obj, iM13279K);
        if (m13272w(object)) {
            return object;
        }
        Object objZze = obx0VarM13281N.zze();
        if (object != null) {
            obx0VarM13281N.zzg(objZze, object);
        }
        return objZze;
    }

    /* JADX INFO: renamed from: h */
    public final Object m13291h(Object obj, int i, int i2) {
        obx0 obx0VarM13281N = m13281N(i2);
        if (!m13302x(obj, i, i2)) {
            return obx0VarM13281N.zze();
        }
        Object object = f10036q.getObject(obj, m13279K(i2) & 1048575);
        if (m13272w(object)) {
            return object;
        }
        Object objZze = obx0VarM13281N.zze();
        if (object != null) {
            obx0VarM13281N.zzg(objZze, object);
        }
        return objZze;
    }

    /* JADX INFO: renamed from: k */
    public final void m13292k(Object obj, Object obj2, int i) {
        if (m13300t(obj2, i)) {
            int iM13279K = m13279K(i) & 1048575;
            Unsafe unsafe = f10036q;
            long j = iM13279K;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                bbx0.m101038a(obj2, this.f10037a[i]);
                return;
            }
            obx0 obx0VarM13281N = m13281N(i);
            if (!m13300t(obj, i)) {
                if (m13272w(object)) {
                    Object objZze = obx0VarM13281N.zze();
                    obx0VarM13281N.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m13295n(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m13272w(object2)) {
                Object objZze2 = obx0VarM13281N.zze();
                obx0VarM13281N.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            obx0VarM13281N.zzg(object2, object);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13293l(Object obj, Object obj2, int i) {
        int i2 = this.f10037a[i];
        if (m13302x(obj2, i2, i)) {
            int iM13279K = m13279K(i) & 1048575;
            Unsafe unsafe = f10036q;
            long j = iM13279K;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                bbx0.m101038a(obj2, this.f10037a[i]);
                return;
            }
            obx0 obx0VarM13281N = m13281N(i);
            if (!m13302x(obj, i2, i)) {
                if (m13272w(object)) {
                    Object objZze = obx0VarM13281N.zze();
                    obx0VarM13281N.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m13296o(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m13272w(object2)) {
                Object objZze2 = obx0VarM13281N.zze();
                obx0VarM13281N.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            obx0VarM13281N.zzg(object2, object);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13294m(Object obj, int i, kbx0 kbx0Var) throws IOException {
        long j = i & 1048575;
        if (m13270s(i)) {
            rcx0.m178818D(obj, j, kbx0Var.zzs());
        } else if (this.f10043g) {
            rcx0.m178818D(obj, j, kbx0Var.zzr());
        } else {
            rcx0.m178818D(obj, j, kbx0Var.zzp());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m13295n(Object obj, int i) {
        int iM13277H = m13277H(i);
        long j = 1048575 & iM13277H;
        if (j == 1048575) {
            return;
        }
        rcx0.m178816B(obj, j, (1 << (iM13277H >>> 20)) | rcx0.m178834l(obj, j));
    }

    /* JADX INFO: renamed from: o */
    public final void m13296o(Object obj, int i, int i2) {
        rcx0.m178816B(obj, m13277H(i2) & 1048575, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m13297p(Object obj, int i, Object obj2) {
        f10036q.putObject(obj, m13279K(i) & 1048575, obj2);
        m13295n(obj, i);
    }

    /* JADX INFO: renamed from: q */
    public final void m13298q(Object obj, int i, int i2, Object obj2) {
        f10036q.putObject(obj, m13279K(i2) & 1048575, obj2);
        m13296o(obj, i, i2);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13299r(Object obj, Object obj2, int i) {
        return m13300t(obj, i) == m13300t(obj2, i);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m13300t(Object obj, int i) {
        int iM13277H = m13277H(i);
        long j = iM13277H & 1048575;
        if (j != 1048575) {
            return ((1 << (iM13277H >>> 20)) & rcx0.m178834l(obj, j)) != 0;
        }
        int iM13279K = m13279K(i);
        long j2 = iM13279K & 1048575;
        switch (m13266J(iM13279K)) {
            case 0:
                return Double.doubleToRawLongBits(rcx0.m178832j(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(rcx0.m178833k(obj, j2)) != 0;
            case 2:
                return rcx0.m178836n(obj, j2) != 0;
            case 3:
                return rcx0.m178836n(obj, j2) != 0;
            case 4:
                return rcx0.m178834l(obj, j2) != 0;
            case 5:
                return rcx0.m178836n(obj, j2) != 0;
            case 6:
                return rcx0.m178834l(obj, j2) != 0;
            case 7:
                return rcx0.m178822H(obj, j2);
            case 8:
                Object objM178838p = rcx0.m178838p(obj, j2);
                if (objM178838p instanceof String) {
                    return !((String) objM178838p).isEmpty();
                }
                if (objM178838p instanceof zzgyl) {
                    return !zzgyl.zzb.equals(objM178838p);
                }
                x9g0.m207497a();
                return false;
            case 9:
                return rcx0.m178838p(obj, j2) != null;
            case 10:
                return !zzgyl.zzb.equals(rcx0.m178838p(obj, j2));
            case 11:
                return rcx0.m178834l(obj, j2) != 0;
            case 12:
                return rcx0.m178834l(obj, j2) != 0;
            case 13:
                return rcx0.m178834l(obj, j2) != 0;
            case 14:
                return rcx0.m178836n(obj, j2) != 0;
            case 15:
                return rcx0.m178834l(obj, j2) != 0;
            case 16:
                return rcx0.m178836n(obj, j2) != 0;
            case 17:
                return rcx0.m178838p(obj, j2) != null;
            default:
                x9g0.m207497a();
                return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13301u(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m13300t(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m13302x(Object obj, int i, int i2) {
        return rcx0.m178834l(obj, (long) (m13277H(i2) & 1048575)) == i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x038c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0483  */
    /* JADX WARN: Code duplicated, block: B:282:0x0722 A[PHI: r0 r1
      0x0722: PHI (r0v3 com.google.android.gms.internal.ads.s5<T>) = 
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v34 com.google.android.gms.internal.ads.s5<T>)
      (r0v43 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
      (r0v1 com.google.android.gms.internal.ads.s5<T>)
     binds: [B:18:0x0051, B:280:0x0718, B:250:0x0653, B:234:0x05ec, B:225:0x05b6, B:218:0x0583, B:138:0x0370, B:135:0x0358, B:132:0x0340, B:129:0x0328, B:126:0x0310, B:123:0x02f8, B:120:0x02e0, B:117:0x02c8, B:114:0x02af, B:111:0x0298, B:108:0x0281, B:105:0x026a, B:102:0x0253, B:97:0x0237, B:83:0x01e4, B:85:0x01f2, B:80:0x01ca, B:77:0x01bc, B:74:0x01a6, B:71:0x0190, B:68:0x0179, B:65:0x016b, B:62:0x015d, B:59:0x014d, B:53:0x0122, B:50:0x010e, B:46:0x00f0, B:43:0x00db, B:40:0x00c5, B:36:0x00b6, B:32:0x00a7, B:29:0x008d, B:25:0x0072, B:21:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0722: PHI (r1v2 java.lang.Object) = 
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v3 java.lang.Object)
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
     binds: [B:18:0x0051, B:280:0x0718, B:250:0x0653, B:234:0x05ec, B:225:0x05b6, B:218:0x0583, B:138:0x0370, B:135:0x0358, B:132:0x0340, B:129:0x0328, B:126:0x0310, B:123:0x02f8, B:120:0x02e0, B:117:0x02c8, B:114:0x02af, B:111:0x0298, B:108:0x0281, B:105:0x026a, B:102:0x0253, B:97:0x0237, B:83:0x01e4, B:85:0x01f2, B:80:0x01ca, B:77:0x01bc, B:74:0x01a6, B:71:0x0190, B:68:0x0179, B:65:0x016b, B:62:0x015d, B:59:0x014d, B:53:0x0122, B:50:0x010e, B:46:0x00f0, B:43:0x00db, B:40:0x00c5, B:36:0x00b6, B:32:0x00a7, B:29:0x008d, B:25:0x0072, B:21:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p149l.obx0
    public final int zza(Object obj) {
        int i;
        int iM13095B;
        int iM13095B2;
        int iM13095B3;
        int iM13096b;
        int iM13095B4;
        int iM13095B5;
        int iM13095B6;
        int iZzd;
        int iM13095B7;
        int iM192961o;
        int i2;
        int iM192960n;
        int size;
        int iM192965s;
        int iM13095B8;
        int iM13095B9;
        int iM13095B10;
        int iM13096b2;
        int iM192958l;
        int iM13095B11;
        int iM13095B12;
        int iM13099y;
        int iM13095B13;
        int iM13095B14;
        int iZzd2;
        int iM13095B15;
        C2246s5<T> c2246s5 = this;
        Object obj2 = obj;
        Unsafe unsafe = f10036q;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i4 < c2246s5.f10037a.length) {
            int iM13279K = c2246s5.m13279K(i4);
            int iM13266J = m13266J(iM13279K);
            int[] iArr = c2246s5.f10037a;
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & i3;
            if (iM13266J <= 17) {
                if (i10 != i7) {
                    i5 = i10 == i3 ? 0 : unsafe.getInt(obj2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iM13279K & i3;
            if (iM13266J >= zzgzl.zzJ.zza()) {
                zzgzl.zzW.zza();
            }
            int i12 = i6;
            long j = i11;
            switch (iM13266J) {
                case 0:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        iM13095B = AbstractC2214o5.m13095B(i8 << 3);
                        iM192961o = iM13095B + 8;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        iM13095B2 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B5 = iM13095B2 + 4;
                        i6 = i12 + iM13095B5;
                        c2246s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        iM13095B3 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b = AbstractC2214o5.m13096b(j2);
                        i2 = iM13095B3 + iM13096b;
                        i6 = i12 + i2;
                        c2246s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        iM13095B3 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b = AbstractC2214o5.m13096b(j3);
                        i2 = iM13095B3 + iM13096b;
                        i6 = i12 + i2;
                        c2246s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        iM13095B3 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b = AbstractC2214o5.m13096b(j4);
                        i2 = iM13095B3 + iM13096b;
                        i6 = i12 + i2;
                        c2246s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        iM13095B4 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B5 = iM13095B4 + 8;
                        i6 = i12 + iM13095B5;
                        c2246s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        iM13095B2 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B5 = iM13095B2 + 4;
                        i6 = i12 + iM13095B5;
                        c2246s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        iM13095B5 = AbstractC2214o5.m13095B(i8 << 3) + 1;
                        i6 = i12 + iM13095B5;
                        c2246s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        int i13 = i8 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzgyl) {
                            iM13095B6 = AbstractC2214o5.m13095B(i13);
                            iZzd = ((zzgyl) object).zzd();
                            iM13095B7 = AbstractC2214o5.m13095B(iZzd);
                            i2 = iM13095B6 + iM13095B7 + iZzd;
                            i6 = i12 + i2;
                            c2246s5 = this;
                            i4 += 3;
                            i3 = 1048575;
                        } else {
                            iM13095B3 = AbstractC2214o5.m13095B(i13);
                            iM13096b = AbstractC2214o5.m13094A((String) object);
                            i2 = iM13095B3 + iM13096b;
                            i6 = i12 + i2;
                            c2246s5 = this;
                            i4 += 3;
                            i3 = 1048575;
                        }
                    }
                    c2246s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        iM192961o = ubx0.m192961o(i8, unsafe.getObject(obj2, j), c2246s5.m13281N(i4));
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        zzgyl zzgylVar = (zzgyl) unsafe.getObject(obj2, j);
                        iM13095B6 = AbstractC2214o5.m13095B(i8 << 3);
                        iZzd = zzgylVar.zzd();
                        iM13095B7 = AbstractC2214o5.m13095B(iZzd);
                        i2 = iM13095B6 + iM13095B7 + iZzd;
                        i6 = i12 + i2;
                        c2246s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(obj2, j);
                        iM13095B3 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b = AbstractC2214o5.m13095B(i14);
                        i2 = iM13095B3 + iM13096b;
                        i6 = i12 + i2;
                        c2246s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        iM13095B3 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b = AbstractC2214o5.m13096b(j5);
                        i2 = iM13095B3 + iM13096b;
                        i6 = i12 + i2;
                        c2246s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        iM13095B2 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B5 = iM13095B2 + 4;
                        i6 = i12 + iM13095B5;
                        c2246s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        iM13095B4 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B5 = iM13095B4 + 8;
                        i6 = i12 + iM13095B5;
                        c2246s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        iM13095B3 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b = AbstractC2214o5.m13095B((i15 >> 31) ^ (i15 + i15));
                        i2 = iM13095B3 + iM13096b;
                        i6 = i12 + i2;
                        c2246s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        iM13095B3 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b = AbstractC2214o5.m13096b((j6 >> 63) ^ (j6 + j6));
                        i2 = iM13095B3 + iM13096b;
                        i6 = i12 + i2;
                        c2246s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2246s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (c2246s5.m13301u(obj2, i4, i7, i5, i)) {
                        iM192961o = AbstractC2214o5.m13099y(i8, (zax0) unsafe.getObject(obj2, j), c2246s5.m13281N(i4));
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    iM192961o = ubx0.m192957k(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    iM192961o = ubx0.m192955i(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    Class cls = ubx0.f175768a;
                    if (list.size() == 0) {
                        iM192960n = 0;
                    } else {
                        iM192960n = ubx0.m192960n(list) + (list.size() * AbstractC2214o5.m13095B(i8 << 3));
                    }
                    i6 = iM192960n + i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    Class cls2 = ubx0.f175768a;
                    size = list2.size();
                    if (size == 0) {
                        iM192961o = 0;
                    } else {
                        iM192965s = ubx0.m192965s(list2);
                        iM13095B8 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = size * iM13095B8;
                        iM192961o = iM192965s + iM13096b2;
                    }
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    Class cls3 = ubx0.f175768a;
                    size = list3.size();
                    if (size == 0) {
                        iM192961o = 0;
                    } else {
                        iM192965s = ubx0.m192959m(list3);
                        iM13095B8 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = size * iM13095B8;
                        iM192961o = iM192965s + iM13096b2;
                    }
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    iM192961o = ubx0.m192957k(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    iM192961o = ubx0.m192955i(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    Class cls4 = ubx0.f175768a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM192961o = 0;
                    } else {
                        iM192961o = size2 * (AbstractC2214o5.m13095B(i8 << 3) + 1);
                    }
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    Class cls5 = ubx0.f175768a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM192960n = 0;
                    } else {
                        iM192960n = AbstractC2214o5.m13095B(i8 << 3) * size3;
                        if (list5 instanceof dax0) {
                            dax0 dax0Var = (dax0) list5;
                            for (int i16 = 0; i16 < size3; i16++) {
                                Object objZzf = dax0Var.zzf(i16);
                                if (objZzf instanceof zzgyl) {
                                    int iZzd3 = ((zzgyl) objZzf).zzd();
                                    iM192960n += AbstractC2214o5.m13095B(iZzd3) + iZzd3;
                                } else {
                                    iM192960n += AbstractC2214o5.m13094A((String) objZzf);
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size3; i17++) {
                                Object obj3 = list5.get(i17);
                                if (obj3 instanceof zzgyl) {
                                    int iZzd4 = ((zzgyl) obj3).zzd();
                                    iM192960n += AbstractC2214o5.m13095B(iZzd4) + iZzd4;
                                } else {
                                    iM192960n += AbstractC2214o5.m13094A((String) obj3);
                                }
                            }
                        }
                    }
                    i6 = iM192960n + i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    obx0 obx0VarM13281N = c2246s5.m13281N(i4);
                    Class cls6 = ubx0.f175768a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM13095B9 = 0;
                    } else {
                        iM13095B9 = AbstractC2214o5.m13095B(i8 << 3) * size4;
                        for (int i18 = 0; i18 < size4; i18++) {
                            Object obj4 = list6.get(i18);
                            if (obj4 instanceof C2230q5) {
                                int iM13209a = ((C2230q5) obj4).m13209a();
                                iM13095B9 += AbstractC2214o5.m13095B(iM13209a) + iM13209a;
                            } else {
                                iM13095B9 += AbstractC2214o5.m13100z((zax0) obj4, obx0VarM13281N);
                            }
                        }
                    }
                    i6 = i12 + iM13095B9;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    Class cls7 = ubx0.f175768a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM13095B10 = 0;
                    } else {
                        iM13095B10 = size5 * AbstractC2214o5.m13095B(i8 << 3);
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int iZzd5 = ((zzgyl) list7.get(i19)).zzd();
                            iM13095B10 += AbstractC2214o5.m13095B(iZzd5) + iZzd5;
                        }
                    }
                    i6 = i12 + iM13095B10;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    Class cls8 = ubx0.f175768a;
                    size = list8.size();
                    if (size == 0) {
                        iM192961o = 0;
                    } else {
                        iM192965s = ubx0.m192964r(list8);
                        iM13095B8 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = size * iM13095B8;
                        iM192961o = iM192965s + iM13096b2;
                    }
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    Class cls9 = ubx0.f175768a;
                    size = list9.size();
                    if (size == 0) {
                        iM192961o = 0;
                    } else {
                        iM192965s = ubx0.m192954h(list9);
                        iM13095B8 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = size * iM13095B8;
                        iM192961o = iM192965s + iM13096b2;
                    }
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    iM192961o = ubx0.m192955i(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    iM192961o = ubx0.m192957k(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    Class cls10 = ubx0.f175768a;
                    size = list10.size();
                    if (size == 0) {
                        iM192961o = 0;
                    } else {
                        iM192965s = ubx0.m192962p(list10);
                        iM13095B8 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = size * iM13095B8;
                        iM192961o = iM192965s + iM13096b2;
                    }
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    Class cls11 = ubx0.f175768a;
                    size = list11.size();
                    if (size == 0) {
                        iM192961o = 0;
                    } else {
                        iM192965s = ubx0.m192963q(list11);
                        iM13095B8 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = size * iM13095B8;
                        iM192961o = iM192965s + iM13096b2;
                    }
                    i6 = i12 + iM192961o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    iM192958l = ubx0.m192958l((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 36:
                    iM192958l = ubx0.m192956j((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 37:
                    iM192958l = ubx0.m192960n((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    iM192958l = ubx0.m192965s((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 39:
                    iM192958l = ubx0.m192959m((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 40:
                    iM192958l = ubx0.m192958l((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 41:
                    iM192958l = ubx0.m192956j((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    Class cls12 = ubx0.f175768a;
                    iM192958l = list12.size();
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    iM192958l = ubx0.m192964r((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 44:
                    iM192958l = ubx0.m192954h((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 45:
                    iM192958l = ubx0.m192956j((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 46:
                    iM192958l = ubx0.m192958l((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 47:
                    iM192958l = ubx0.m192962p((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 48:
                    iM192958l = ubx0.m192963q((List) unsafe.getObject(obj2, j));
                    if (iM192958l > 0) {
                        iM13095B11 = AbstractC2214o5.m13095B(i8 << 3);
                        iM13095B12 = AbstractC2214o5.m13095B(iM192958l);
                        iM13095B10 = iM13095B11 + iM13095B12 + iM192958l;
                        i6 = i12 + iM13095B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    obx0 obx0VarM13281N2 = c2246s5.m13281N(i4);
                    Class cls13 = ubx0.f175768a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iM13099y = 0;
                    } else {
                        iM13099y = 0;
                        for (int i20 = 0; i20 < size6; i20++) {
                            iM13099y += AbstractC2214o5.m13099y(i8, (zax0) list13.get(i20), obx0VarM13281N2);
                        }
                    }
                    i6 = i12 + iM13099y;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 50:
                    zzhay zzhayVar = (zzhay) unsafe.getObject(obj2, j);
                    if (!zzhayVar.isEmpty()) {
                        Iterator it = zzhayVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 51:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        iM13095B = AbstractC2214o5.m13095B(i8 << 3);
                        iM192961o = iM13095B + 8;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 52:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        iM13095B13 = AbstractC2214o5.m13095B(i8 << 3);
                        iM192961o = iM13095B13 + 4;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        long jM13267L = m13267L(obj2, j);
                        iM192965s = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = AbstractC2214o5.m13096b(jM13267L);
                        iM192961o = iM192965s + iM13096b2;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        long jM13267L2 = m13267L(obj2, j);
                        iM192965s = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = AbstractC2214o5.m13096b(jM13267L2);
                        iM192961o = iM192965s + iM13096b2;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        long jM13265F = m13265F(obj2, j);
                        iM192965s = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = AbstractC2214o5.m13096b(jM13265F);
                        iM192961o = iM192965s + iM13096b2;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        iM13095B = AbstractC2214o5.m13095B(i8 << 3);
                        iM192961o = iM13095B + 8;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        iM13095B13 = AbstractC2214o5.m13095B(i8 << 3);
                        iM192961o = iM13095B13 + 4;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        iM192961o = AbstractC2214o5.m13095B(i8 << 3) + 1;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        int i21 = i8 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzgyl) {
                            iM13095B14 = AbstractC2214o5.m13095B(i21);
                            iZzd2 = ((zzgyl) object2).zzd();
                            iM13095B15 = AbstractC2214o5.m13095B(iZzd2);
                            iM192961o = iM13095B14 + iM13095B15 + iZzd2;
                            i6 = i12 + iM192961o;
                        } else {
                            iM192965s = AbstractC2214o5.m13095B(i21);
                            iM13096b2 = AbstractC2214o5.m13094A((String) object2);
                            iM192961o = iM192965s + iM13096b2;
                            i6 = i12 + iM192961o;
                        }
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        iM192961o = ubx0.m192961o(i8, unsafe.getObject(obj2, j), c2246s5.m13281N(i4));
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        zzgyl zzgylVar2 = (zzgyl) unsafe.getObject(obj2, j);
                        iM13095B14 = AbstractC2214o5.m13095B(i8 << 3);
                        iZzd2 = zzgylVar2.zzd();
                        iM13095B15 = AbstractC2214o5.m13095B(iZzd2);
                        iM192961o = iM13095B14 + iM13095B15 + iZzd2;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        int iM13265F = m13265F(obj2, j);
                        iM192965s = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = AbstractC2214o5.m13095B(iM13265F);
                        iM192961o = iM192965s + iM13096b2;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        long jM13265F2 = m13265F(obj2, j);
                        iM192965s = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = AbstractC2214o5.m13096b(jM13265F2);
                        iM192961o = iM192965s + iM13096b2;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        iM13095B13 = AbstractC2214o5.m13095B(i8 << 3);
                        iM192961o = iM13095B13 + 4;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        iM13095B = AbstractC2214o5.m13095B(i8 << 3);
                        iM192961o = iM13095B + 8;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        int iM13265F2 = m13265F(obj2, j);
                        iM192965s = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = AbstractC2214o5.m13095B((iM13265F2 >> 31) ^ (iM13265F2 + iM13265F2));
                        iM192961o = iM192965s + iM13096b2;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        long jM13267L3 = m13267L(obj2, j);
                        iM192965s = AbstractC2214o5.m13095B(i8 << 3);
                        iM13096b2 = AbstractC2214o5.m13096b((jM13267L3 >> 63) ^ (jM13267L3 + jM13267L3));
                        iM192961o = iM192965s + iM13096b2;
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (c2246s5.m13302x(obj2, i8, i4)) {
                        iM192961o = AbstractC2214o5.m13099y(i8, (zax0) unsafe.getObject(obj2, j), c2246s5.m13281N(i4));
                        i6 = i12 + iM192961o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                default:
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
            }
        }
        icx0 icx0Var = c2246s5.f10048l;
        int iMo13461a = i6 + icx0Var.mo13461a(icx0Var.mo13464d(obj2));
        if (!c2246s5.f10042f) {
            return iMo13461a;
        }
        c2246s5.f10049m.mo115307a(obj2);
        throw null;
    }

    @Override // p149l.obx0
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f10037a.length; i4 += 3) {
            int iM13279K = m13279K(i4);
            int[] iArr = this.f10037a;
            int i5 = 1048575 & iM13279K;
            int iM13266J = m13266J(iM13279K);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iM13266J) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(rcx0.m178832j(obj, j));
                    Charset charset = aax0.f68607a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(rcx0.m178833k(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = rcx0.m178836n(obj, j);
                    Charset charset2 = aax0.f68607a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = rcx0.m178836n(obj, j);
                    Charset charset3 = aax0.f68607a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = rcx0.m178834l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = rcx0.m178836n(obj, j);
                    Charset charset4 = aax0.f68607a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = rcx0.m178834l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = aax0.m95573a(rcx0.m178822H(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) rcx0.m178838p(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objM178838p = rcx0.m178838p(obj, j);
                    if (objM178838p != null) {
                        iHashCode = objM178838p.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = rcx0.m178838p(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = rcx0.m178834l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = rcx0.m178834l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = rcx0.m178834l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = rcx0.m178836n(obj, j);
                    Charset charset5 = aax0.f68607a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = rcx0.m178834l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = rcx0.m178836n(obj, j);
                    Charset charset6 = aax0.f68607a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objM178838p2 = rcx0.m178838p(obj, j);
                    if (objM178838p2 != null) {
                        iHashCode = objM178838p2.hashCode();
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
                    iFloatToIntBits = rcx0.m178838p(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = rcx0.m178838p(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(m13263D(obj, j));
                        Charset charset7 = aax0.f68607a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(m13264E(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13267L(obj, j);
                        Charset charset8 = aax0.f68607a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13267L(obj, j);
                        Charset charset9 = aax0.f68607a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13265F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13267L(obj, j);
                        Charset charset10 = aax0.f68607a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13265F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = aax0.m95573a(m13273y(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) rcx0.m178838p(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = rcx0.m178838p(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = rcx0.m178838p(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13265F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13265F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13265F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13267L(obj, j);
                        Charset charset11 = aax0.f68607a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13265F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13267L(obj, j);
                        Charset charset12 = aax0.f68607a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (m13302x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = rcx0.m178838p(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + this.f10048l.mo13464d(obj).hashCode();
        if (!this.f10042f) {
            return iHashCode2;
        }
        this.f10049m.mo115307a(obj);
        throw null;
    }

    @Override // p149l.obx0
    public final Object zze() {
        return ((AbstractC2222p5) this.f10041e).m13188m();
    }

    @Override // p149l.obx0
    public final void zzg(Object obj, Object obj2) {
        m13269j(obj);
        obj2.getClass();
        for (int i = 0; i < this.f10037a.length; i += 3) {
            int iM13279K = m13279K(i);
            int i2 = 1048575 & iM13279K;
            int[] iArr = this.f10037a;
            int iM13266J = m13266J(iM13279K);
            int i3 = iArr[i];
            long j = i2;
            switch (iM13266J) {
                case 0:
                    if (m13300t(obj2, i)) {
                        rcx0.m178848z(obj, j, rcx0.m178832j(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 1:
                    if (m13300t(obj2, i)) {
                        rcx0.m178815A(obj, j, rcx0.m178833k(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 2:
                    if (m13300t(obj2, i)) {
                        rcx0.m178817C(obj, j, rcx0.m178836n(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 3:
                    if (m13300t(obj2, i)) {
                        rcx0.m178817C(obj, j, rcx0.m178836n(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 4:
                    if (m13300t(obj2, i)) {
                        rcx0.m178816B(obj, j, rcx0.m178834l(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 5:
                    if (m13300t(obj2, i)) {
                        rcx0.m178817C(obj, j, rcx0.m178836n(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 6:
                    if (m13300t(obj2, i)) {
                        rcx0.m178816B(obj, j, rcx0.m178834l(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 7:
                    if (m13300t(obj2, i)) {
                        rcx0.m178846x(obj, j, rcx0.m178822H(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 8:
                    if (m13300t(obj2, i)) {
                        rcx0.m178818D(obj, j, rcx0.m178838p(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 9:
                    m13292k(obj, obj2, i);
                    break;
                case 10:
                    if (m13300t(obj2, i)) {
                        rcx0.m178818D(obj, j, rcx0.m178838p(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 11:
                    if (m13300t(obj2, i)) {
                        rcx0.m178816B(obj, j, rcx0.m178834l(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 12:
                    if (m13300t(obj2, i)) {
                        rcx0.m178816B(obj, j, rcx0.m178834l(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 13:
                    if (m13300t(obj2, i)) {
                        rcx0.m178816B(obj, j, rcx0.m178834l(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 14:
                    if (m13300t(obj2, i)) {
                        rcx0.m178817C(obj, j, rcx0.m178836n(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 15:
                    if (m13300t(obj2, i)) {
                        rcx0.m178816B(obj, j, rcx0.m178834l(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 16:
                    if (m13300t(obj2, i)) {
                        rcx0.m178817C(obj, j, rcx0.m178836n(obj2, j));
                        m13295n(obj, i);
                    }
                    break;
                case 17:
                    m13292k(obj, obj2, i);
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
                    this.f10047k.mo120321c(obj, obj2, j);
                    break;
                case 50:
                    Class cls = ubx0.f175768a;
                    rcx0.m178818D(obj, j, pax0.m168104b(rcx0.m178838p(obj, j), rcx0.m178838p(obj2, j)));
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
                    if (m13302x(obj2, i3, i)) {
                        rcx0.m178818D(obj, j, rcx0.m178838p(obj2, j));
                        m13296o(obj, i3, i);
                    }
                    break;
                case 60:
                    m13293l(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m13302x(obj2, i3, i)) {
                        rcx0.m178818D(obj, j, rcx0.m178838p(obj2, j));
                        m13296o(obj, i3, i);
                    }
                    break;
                case 68:
                    m13293l(obj, obj2, i);
                    break;
            }
        }
        ubx0.m192970x(this.f10048l, obj, obj2);
        if (this.f10042f) {
            this.f10049m.mo115307a(obj2);
            throw null;
        }
    }
}
