package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.alx0;
import p153l.ckx0;
import p153l.dgx0;
import p153l.fhx0;
import p153l.fig0;
import p153l.fkx0;
import p153l.gjx0;
import p153l.hkx0;
import p153l.ikx0;
import p153l.jhx0;
import p153l.jjx0;
import p153l.jkx0;
import p153l.khx0;
import p153l.nkx0;
import p153l.ohx0;
import p153l.olx0;
import p153l.pjx0;
import p153l.pkx0;
import p153l.plx0;
import p153l.qkx0;
import p153l.ukx0;
import p153l.vjx0;
import p153l.wg3;
import p153l.xgx0;
import p153l.xlx0;
import p153l.zhx0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2269s5<T> implements ukx0<T> {

    /* JADX INFO: renamed from: p */
    public static final int[] f10072p = new int[0];

    /* JADX INFO: renamed from: q */
    public static final Unsafe f10073q = xlx0.m211704q();

    /* JADX INFO: renamed from: a */
    public final int[] f10074a;

    /* JADX INFO: renamed from: b */
    public final Object[] f10075b;

    /* JADX INFO: renamed from: c */
    public final int f10076c;

    /* JADX INFO: renamed from: d */
    public final int f10077d;

    /* JADX INFO: renamed from: e */
    public final fkx0 f10078e;

    /* JADX INFO: renamed from: f */
    public final boolean f10079f;

    /* JADX INFO: renamed from: g */
    public final boolean f10080g;

    /* JADX INFO: renamed from: h */
    public final int[] f10081h;

    /* JADX INFO: renamed from: i */
    public final int f10082i;

    /* JADX INFO: renamed from: j */
    public final int f10083j;

    /* JADX INFO: renamed from: k */
    public final pjx0 f10084k;

    /* JADX INFO: renamed from: l */
    public final olx0 f10085l;

    /* JADX INFO: renamed from: m */
    public final khx0 f10086m;

    /* JADX INFO: renamed from: n */
    public final jkx0 f10087n;

    /* JADX INFO: renamed from: o */
    public final vjx0 f10088o;

    public C2269s5(int[] iArr, Object[] objArr, int i, int i2, fkx0 fkx0Var, int i3, boolean z, int[] iArr2, int i4, int i5, jkx0 jkx0Var, pjx0 pjx0Var, olx0 olx0Var, khx0 khx0Var, vjx0 vjx0Var) {
        this.f10074a = iArr;
        this.f10075b = objArr;
        this.f10076c = i;
        this.f10077d = i2;
        this.f10080g = fkx0Var instanceof AbstractC2245p5;
        boolean z2 = false;
        if (khx0Var != null && khx0Var.mo149840h(fkx0Var)) {
            z2 = true;
        }
        this.f10079f = z2;
        this.f10081h = iArr2;
        this.f10082i = i4;
        this.f10083j = i5;
        this.f10087n = jkx0Var;
        this.f10084k = pjx0Var;
        this.f10085l = olx0Var;
        this.f10086m = khx0Var;
        this.f10078e = fkx0Var;
        this.f10088o = vjx0Var;
    }

    /* JADX INFO: renamed from: B */
    public static plx0 m13315B(Object obj) {
        AbstractC2245p5 abstractC2245p5 = (AbstractC2245p5) obj;
        plx0 plx0Var = abstractC2245p5.zzc;
        if (plx0Var != plx0.m172889c()) {
            return plx0Var;
        }
        plx0 plx0VarM172891f = plx0.m172891f();
        abstractC2245p5.zzc = plx0VarM172891f;
        return plx0VarM172891f;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0268  */
    /* JADX WARN: Code duplicated, block: B:127:0x026e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0284  */
    /* JADX WARN: Code duplicated, block: B:131:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x0351  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ad  */
    /* JADX INFO: renamed from: C */
    public static C2269s5 m13316C(Class cls, ckx0 ckx0Var, jkx0 jkx0Var, pjx0 pjx0Var, olx0 olx0Var, khx0 khx0Var, vjx0 vjx0Var) {
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
        Field fieldM13322i;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldM13322i2;
        int i27;
        Object obj2;
        Field fieldM13322i3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(ckx0Var instanceof pkx0)) {
            throw null;
        }
        pkx0 pkx0Var = (pkx0) ckx0Var;
        String strM172775a = pkx0Var.m172775a();
        int length = strM172775a.length();
        char c = 55296;
        if (strM172775a.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strM172775a.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strM172775a.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strM172775a.charAt(i33);
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
            iArr = f10072p;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strM172775a.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strM172775a.charAt(i36);
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
            int iCharAt4 = strM172775a.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strM172775a.charAt(i39);
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
            int iCharAt5 = strM172775a.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strM172775a.charAt(i42);
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
            int iCharAt6 = strM172775a.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strM172775a.charAt(i45);
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
            iCharAt = strM172775a.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strM172775a.charAt(i48);
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
            int iCharAt7 = strM172775a.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strM172775a.charAt(i51);
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
            int iCharAt8 = strM172775a.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strM172775a.charAt(i54);
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
            int iCharAt9 = strM172775a.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strM172775a.charAt(i57);
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
        Unsafe unsafe = f10073q;
        Object[] objArrM172776b = pkx0Var.m172776b();
        Class<?> cls2 = pkx0Var.zza().getClass();
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
            int iCharAt10 = strM172775a.charAt(i33);
            if (iCharAt10 >= c) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = strM172775a.charAt(i69);
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
            int iCharAt11 = strM172775a.charAt(i16);
            if (iCharAt11 >= c) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = strM172775a.charAt(i73);
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
            pkx0 pkx0Var2 = pkx0Var;
            if (i75 >= 51) {
                int i77 = i17 + 1;
                int iCharAt12 = strM172775a.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        cCharAt10 = strM172775a.charAt(i79);
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
                    objArr[i83 + i83 + 1] = objArrM172776b[i2];
                } else {
                    if (i82 == 12) {
                        if (pkx0Var2.zzc() == 1 || i76 != 0) {
                            i25 = i2 + 1;
                            int i84 = i63 / 3;
                            objArr[i84 + i84 + 1] = objArrM172776b[i2];
                        } else {
                            i76 = 0;
                        }
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrM172776b[i26];
                    if (obj instanceof Field) {
                        fieldM13322i2 = (Field) obj;
                    } else {
                        fieldM13322i2 = m13322i(cls2, (String) obj);
                        objArrM172776b[i26] = fieldM13322i2;
                    }
                    int i85 = iCharAt10;
                    int i86 = i76;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM13322i2);
                    i27 = i26 + 1;
                    obj2 = objArrM172776b[i27];
                    if (obj2 instanceof Field) {
                        fieldM13322i3 = (Field) obj2;
                    } else {
                        fieldM13322i3 = m13322i(cls2, (String) obj2);
                        objArrM172776b[i27] = fieldM13322i3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM13322i3);
                    strM172775a = strM172775a;
                    i20 = i81;
                    i76 = i86;
                    i21 = 0;
                    i18 = i85;
                }
                i2 = i25;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrM172776b[i26];
                if (obj instanceof Field) {
                    fieldM13322i2 = (Field) obj;
                } else {
                    fieldM13322i2 = m13322i(cls2, (String) obj);
                    objArrM172776b[i26] = fieldM13322i2;
                }
                int i87 = iCharAt10;
                int i88 = i76;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM13322i2);
                i27 = i26 + 1;
                obj2 = objArrM172776b[i27];
                if (obj2 instanceof Field) {
                    fieldM13322i3 = (Field) obj2;
                } else {
                    fieldM13322i3 = m13322i(cls2, (String) obj2);
                    objArrM172776b[i27] = fieldM13322i3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM13322i3);
                strM172775a = strM172775a;
                i20 = i81;
                i76 = i88;
                i21 = 0;
                i18 = i87;
            } else {
                i18 = iCharAt10;
                int i89 = i2 + 1;
                Field fieldM13322i4 = m13322i(cls2, (String) objArrM172776b[i2]);
                if (i75 == 9 || i75 == 17) {
                    int i90 = i63 / 3;
                    objArr[i90 + i90 + 1] = fieldM13322i4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i23 = i2 + 2;
                            i22 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i18 = i18;
                            if (pkx0Var2.zzc() == 1 || i76 != 0) {
                                i23 = i2 + 2;
                                int i91 = i63 / 3;
                                objArr[i91 + i91 + 1] = objArrM172776b[i89];
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
                            objArr[i94] = objArrM172776b[i89];
                            if (i76 != 0) {
                                objArr[i94 + 1] = objArrM172776b[i19];
                                i19 = i2 + 3;
                                i65 = i92;
                                i18 = i18;
                            } else {
                                i65 = i92;
                                i76 = 0;
                                i18 = i18;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13322i4);
                        iCharAt11 = iCharAt11;
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            i20 = i17;
                            iObjectFieldOffset2 = 1048575;
                            i21 = 0;
                        } else {
                            int i95 = i17 + 1;
                            int iCharAt13 = strM172775a.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i20 = i95 + 1;
                                    cCharAt9 = strM172775a.charAt(i95);
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
                            Object obj3 = objArrM172776b[i98];
                            if (obj3 instanceof Field) {
                                fieldM13322i = (Field) obj3;
                            } else {
                                fieldM13322i = m13322i(cls2, (String) obj3);
                                objArrM172776b[i98] = fieldM13322i;
                            }
                            i21 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM13322i);
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
                    objArr[i99 + i99 + i22] = objArrM172776b[i89];
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13322i4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM13322i4);
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
            pkx0Var = pkx0Var2;
            strM172775a = strM172775a;
            length = length;
            c = 55296;
        }
        pkx0 pkx0Var3 = pkx0Var;
        return new C2269s5(iArr3, objArr, i3, i5, pkx0Var3.zza(), pkx0Var3.zzc(), false, iArr, i6, i61, jkx0Var, pjx0Var, olx0Var, khx0Var, vjx0Var);
    }

    /* JADX INFO: renamed from: D */
    public static double m13317D(Object obj, long j) {
        return ((Double) xlx0.m211703p(obj, j)).doubleValue();
    }

    /* JADX INFO: renamed from: E */
    public static float m13318E(Object obj, long j) {
        return ((Float) xlx0.m211703p(obj, j)).floatValue();
    }

    /* JADX INFO: renamed from: F */
    public static int m13319F(Object obj, long j) {
        return ((Integer) xlx0.m211703p(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: J */
    public static int m13320J(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: L */
    public static long m13321L(Object obj, long j) {
        return ((Long) xlx0.m211703p(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: i */
    public static Field m13322i(Class cls, String str) {
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

    /* JADX INFO: renamed from: j */
    public static void m13323j(Object obj) {
        if (m13326w(obj)) {
            return;
        }
        wg3.m206174a("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m13324s(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m13325v(Object obj, int i, ukx0 ukx0Var) {
        return ukx0Var.mo13340c(xlx0.m211703p(obj, i & 1048575));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m13326w(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2245p5) {
            return ((AbstractC2245p5) obj).m13234F();
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m13327y(Object obj, long j) {
        return ((Boolean) xlx0.m211703p(obj, j)).booleanValue();
    }

    /* JADX INFO: renamed from: z */
    public static final void m13328z(int i, Object obj, fhx0 fhx0Var) throws IOException {
        if (obj instanceof String) {
            fhx0Var.m125627f(i, (String) obj);
        } else {
            fhx0Var.m125635o(i, (zzgyl) obj);
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
    public final int m13329A(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, p153l.dgx0 r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2269s5.m13329A(java.lang.Object, byte[], int, int, int, l.dgx0):int");
    }

    /* JADX INFO: renamed from: G */
    public final int m13330G(int i) {
        if (i < this.f10076c || i > this.f10077d) {
            return -1;
        }
        return m13332I(i, 0);
    }

    /* JADX INFO: renamed from: H */
    public final int m13331H(int i) {
        return this.f10074a[i + 2];
    }

    /* JADX INFO: renamed from: I */
    public final int m13332I(int i, int i2) {
        int length = (this.f10074a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f10074a[i4];
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
    public final int m13333K(int i) {
        return this.f10074a[i + 1];
    }

    /* JADX INFO: renamed from: M */
    public final zhx0 m13334M(int i) {
        int i2 = i / 3;
        return (zhx0) this.f10075b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: N */
    public final ukx0 m13335N(int i) {
        Object[] objArr = this.f10075b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        ukx0 ukx0Var = (ukx0) objArr[i3];
        if (ukx0Var != null) {
            return ukx0Var;
        }
        ukx0 ukx0VarM163671b = nkx0.m163670a().m163671b((Class) objArr[i3 + 1]);
        this.f10075b[i3] = ukx0VarM163671b;
        return ukx0VarM163671b;
    }

    /* JADX INFO: renamed from: O */
    public final Object m13336O(Object obj, int i, Object obj2, olx0 olx0Var, Object obj3) {
        int i2 = this.f10074a[i];
        Object objM211703p = xlx0.m211703p(obj, m13333K(i) & 1048575);
        if (objM211703p == null || m13334M(i) == null) {
            return obj2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: P */
    public final Object m13337P(int i) {
        int i2 = i / 3;
        return this.f10075b[i2 + i2];
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // p153l.ukx0
    /* JADX INFO: renamed from: a */
    public final void mo13338a(Object obj) {
        if (m13326w(obj)) {
            if (obj instanceof AbstractC2245p5) {
                AbstractC2245p5 abstractC2245p5 = (AbstractC2245p5) obj;
                abstractC2245p5.m13232D(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                abstractC2245p5.zza = 0;
                abstractC2245p5.m13231B();
            }
            int[] iArr = this.f10074a;
            for (int i = 0; i < iArr.length; i += 3) {
                int iM13333K = m13333K(i);
                int i2 = 1048575 & iM13333K;
                int iM13320J = m13320J(iM13333K);
                long j = i2;
                if (iM13320J != 9) {
                    if (iM13320J != 60 && iM13320J != 68) {
                        switch (iM13320J) {
                            case 17:
                                if (m13354t(obj, i)) {
                                    m13335N(i).mo13338a(f10073q.getObject(obj, j));
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
                                this.f10084k.mo154594b(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = f10073q;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzhay) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m13356x(obj, this.f10074a[i], i)) {
                        m13335N(i).mo13338a(f10073q.getObject(obj, j));
                    }
                } else if (m13354t(obj, i)) {
                    m13335N(i).mo13338a(f10073q.getObject(obj, j));
                }
            }
            this.f10085l.mo13527m(obj);
            if (this.f10079f) {
                this.f10086m.mo149837e(obj);
            }
        }
    }

    @Override // p153l.ukx0
    /* JADX INFO: renamed from: b */
    public final boolean mo13339b(Object obj, Object obj2) {
        boolean zM98767z;
        for (int i = 0; i < this.f10074a.length; i += 3) {
            int iM13333K = m13333K(i);
            long j = iM13333K & 1048575;
            switch (m13320J(iM13333K)) {
                case 0:
                    if (!m13353r(obj, obj2, i) || Double.doubleToLongBits(xlx0.m211697j(obj, j)) != Double.doubleToLongBits(xlx0.m211697j(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!m13353r(obj, obj2, i) || Float.floatToIntBits(xlx0.m211698k(obj, j)) != Float.floatToIntBits(xlx0.m211698k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!m13353r(obj, obj2, i) || xlx0.m211701n(obj, j) != xlx0.m211701n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!m13353r(obj, obj2, i) || xlx0.m211701n(obj, j) != xlx0.m211701n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!m13353r(obj, obj2, i) || xlx0.m211699l(obj, j) != xlx0.m211699l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!m13353r(obj, obj2, i) || xlx0.m211701n(obj, j) != xlx0.m211701n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!m13353r(obj, obj2, i) || xlx0.m211699l(obj, j) != xlx0.m211699l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!m13353r(obj, obj2, i) || xlx0.m211687H(obj, j) != xlx0.m211687H(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!m13353r(obj, obj2, i) || !alx0.m98767z(xlx0.m211703p(obj, j), xlx0.m211703p(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!m13353r(obj, obj2, i) || !alx0.m98767z(xlx0.m211703p(obj, j), xlx0.m211703p(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!m13353r(obj, obj2, i) || !alx0.m98767z(xlx0.m211703p(obj, j), xlx0.m211703p(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!m13353r(obj, obj2, i) || xlx0.m211699l(obj, j) != xlx0.m211699l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!m13353r(obj, obj2, i) || xlx0.m211699l(obj, j) != xlx0.m211699l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!m13353r(obj, obj2, i) || xlx0.m211699l(obj, j) != xlx0.m211699l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!m13353r(obj, obj2, i) || xlx0.m211701n(obj, j) != xlx0.m211701n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!m13353r(obj, obj2, i) || xlx0.m211699l(obj, j) != xlx0.m211699l(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!m13353r(obj, obj2, i) || xlx0.m211701n(obj, j) != xlx0.m211701n(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!m13353r(obj, obj2, i) || !alx0.m98767z(xlx0.m211703p(obj, j), xlx0.m211703p(obj2, j))) {
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
                    zM98767z = alx0.m98767z(xlx0.m211703p(obj, j), xlx0.m211703p(obj2, j));
                    break;
                case 50:
                    zM98767z = alx0.m98767z(xlx0.m211703p(obj, j), xlx0.m211703p(obj2, j));
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
                    long jM13331H = m13331H(i) & 1048575;
                    if (xlx0.m211699l(obj, jM13331H) != xlx0.m211699l(obj2, jM13331H) || !alx0.m98767z(xlx0.m211703p(obj, j), xlx0.m211703p(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zM98767z) {
                return false;
            }
        }
        if (!this.f10085l.mo13518d(obj).equals(this.f10085l.mo13518d(obj2))) {
            return false;
        }
        if (!this.f10079f) {
            return true;
        }
        this.f10086m.mo149833a(obj);
        this.f10086m.mo149833a(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6 A[LOOP:1: B:46:0x00a5->B:51:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[SYNTHETIC] */
    @Override // p153l.ukx0
    /* JADX INFO: renamed from: c */
    public final boolean mo13340c(Object obj) {
        int i;
        int i2;
        int i3;
        List list;
        ukx0 ukx0VarM13335N;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i6 < this.f10082i) {
            int[] iArr = this.f10081h;
            int[] iArr2 = this.f10074a;
            int i8 = iArr[i6];
            int i9 = iArr2[i8];
            int iM13333K = m13333K(i8);
            int i10 = this.f10074a[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i7) {
                if (i11 != 1048575) {
                    i5 = f10073q.getInt(obj, i11);
                }
                i = i5;
                i7 = i11;
            } else {
                i = i5;
            }
            if ((268435456 & iM13333K) != 0) {
                i2 = i8;
                i3 = i7;
                if (!m13355u(obj, i2, i3, i, i12)) {
                    return false;
                }
            } else {
                i2 = i8;
                i3 = i7;
            }
            int iM13320J = m13320J(iM13333K);
            if (iM13320J == 9 || iM13320J == 17) {
                if (m13355u(obj, i2, i3, i, i12) && !m13325v(obj, iM13333K, m13335N(i2))) {
                    return false;
                }
            } else if (iM13320J == 27) {
                list = (List) xlx0.m211703p(obj, iM13333K & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ukx0VarM13335N = m13335N(i2);
                    for (i4 = 0; i4 < list.size(); i4++) {
                        if (!ukx0VarM13335N.mo13340c(list.get(i4))) {
                            return false;
                        }
                    }
                }
            } else if (iM13320J == 60 || iM13320J == 68) {
                if (m13356x(obj, i9, i2) && !m13325v(obj, iM13333K, m13335N(i2))) {
                    return false;
                }
            } else if (iM13320J == 49) {
                list = (List) xlx0.m211703p(obj, iM13333K & 1048575);
                if (list.isEmpty()) {
                    ukx0VarM13335N = m13335N(i2);
                    while (i4 < list.size()) {
                        if (!ukx0VarM13335N.mo13340c(list.get(i4))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iM13320J == 50 && !((zzhay) xlx0.m211703p(obj, iM13333K & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i7 = i3;
            i5 = i;
        }
        if (!this.f10079f) {
            return true;
        }
        this.f10086m.mo149833a(obj);
        throw null;
    }

    @Override // p153l.ukx0
    /* JADX INFO: renamed from: d */
    public final void mo13341d(Object obj, byte[] bArr, int i, int i2, dgx0 dgx0Var) throws IOException {
        m13329A(obj, bArr, i, i2, 0, dgx0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p153l.ukx0
    /* JADX INFO: renamed from: e */
    public final void mo13342e(Object obj, fhx0 fhx0Var) throws IOException {
        int i;
        C2269s5<T> c2269s5 = this;
        if (c2269s5.f10079f) {
            c2269s5.f10086m.mo149833a(obj);
            throw null;
        }
        int[] iArr = c2269s5.f10074a;
        Unsafe unsafe = f10073q;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iM13333K = c2269s5.m13333K(i4);
            int[] iArr2 = c2269s5.f10074a;
            int iM13320J = m13320J(iM13333K);
            int i6 = iArr2[i4];
            if (iM13320J <= 17) {
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
            long j = iM13333K & i2;
            switch (iM13320J) {
                case 0:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125637q(i6, xlx0.m211697j(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125646z(i6, xlx0.m211698k(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125615E(i6, unsafe.getLong(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125631j(i6, unsafe.getLong(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125613C(i6, unsafe.getInt(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125644x(i6, unsafe.getLong(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125642v(i6, unsafe.getInt(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125633m(i6, xlx0.m211687H(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        m13328z(i6, unsafe.getObject(obj, j), fhx0Var);
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125617G(i6, unsafe.getObject(obj, j), c2269s5.m13335N(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125635o(i6, (zzgyl) unsafe.getObject(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125629h(i6, unsafe.getInt(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125640t(i6, unsafe.getInt(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125618H(i6, unsafe.getInt(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125620J(i6, unsafe.getLong(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125622a(i6, unsafe.getInt(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125624c(i6, unsafe.getLong(obj, j));
                    }
                    c2269s5 = this;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (c2269s5.m13355u(obj, i4, i3, i5, i)) {
                        fhx0Var.m125612B(i6, unsafe.getObject(obj, j), c2269s5.m13335N(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    alx0.m98736B(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    alx0.m98740F(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    alx0.m98742a(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    alx0.m98748g(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    alx0.m98741G(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    alx0.m98739E(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    alx0.m98738D(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    alx0.m98735A(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i9 = c2269s5.f10074a[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = alx0.f72165a;
                    if (list != null && !list.isEmpty()) {
                        fhx0Var.m125628g(i9, list);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 27:
                    int i10 = c2269s5.f10074a[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    ukx0 ukx0VarM13335N = c2269s5.m13335N(i4);
                    Class cls2 = alx0.f72165a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i11 = 0; i11 < list2.size(); i11++) {
                            fhx0Var.m125617G(i10, list2.get(i11), ukx0VarM13335N);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 28:
                    int i12 = c2269s5.f10074a[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = alx0.f72165a;
                    if (list3 != null && !list3.isEmpty()) {
                        fhx0Var.m125636p(i12, list3);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 29:
                    alx0.m98747f(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    alx0.m98737C(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    alx0.m98743b(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    alx0.m98744c(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    alx0.m98745d(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    alx0.m98746e(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, false);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    alx0.m98736B(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 36:
                    alx0.m98740F(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 37:
                    alx0.m98742a(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 38:
                    alx0.m98748g(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 39:
                    alx0.m98741G(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 40:
                    alx0.m98739E(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 41:
                    alx0.m98738D(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 42:
                    alx0.m98735A(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 43:
                    alx0.m98747f(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 44:
                    alx0.m98737C(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 45:
                    alx0.m98743b(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 46:
                    alx0.m98744c(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 47:
                    alx0.m98745d(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 48:
                    alx0.m98746e(c2269s5.f10074a[i4], (List) unsafe.getObject(obj, j), fhx0Var, true);
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 49:
                    int i13 = c2269s5.f10074a[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    ukx0 ukx0VarM13335N2 = c2269s5.m13335N(i4);
                    Class cls4 = alx0.f72165a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i14 = 0; i14 < list4.size(); i14++) {
                            fhx0Var.m125612B(i13, list4.get(i14), ukx0VarM13335N2);
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
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125637q(i6, m13317D(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 52:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125646z(i6, m13318E(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125615E(i6, m13321L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125631j(i6, m13321L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125613C(i6, m13319F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125644x(i6, m13321L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125642v(i6, m13319F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125633m(i6, m13327y(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        m13328z(i6, unsafe.getObject(obj, j), fhx0Var);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 60:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125617G(i6, unsafe.getObject(obj, j), c2269s5.m13335N(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 61:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125635o(i6, (zzgyl) unsafe.getObject(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 62:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125629h(i6, m13319F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 63:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125640t(i6, m13319F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 64:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125618H(i6, m13319F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 65:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125620J(i6, m13321L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125622a(i6, m13319F(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125624c(i6, m13321L(obj, j));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (c2269s5.m13356x(obj, i6, i4)) {
                        fhx0Var.m125612B(i6, unsafe.getObject(obj, j), c2269s5.m13335N(i4));
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
        olx0 olx0Var = c2269s5.f10085l;
        olx0Var.mo13531r(olx0Var.mo13518d(obj), fhx0Var);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x05bd A[Catch: all -> 0x05c3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x05c3, blocks: (B:32:0x0070, B:179:0x05bd, B:115:0x02d0, B:116:0x02de, B:117:0x02ed, B:118:0x02fc, B:119:0x030b, B:120:0x031a, B:121:0x0329, B:122:0x0338, B:123:0x0347, B:124:0x0356, B:125:0x0365, B:126:0x0374, B:127:0x0383, B:135:0x03b3, B:136:0x03c1, B:137:0x03d0, B:138:0x03e3, B:142:0x03ef, B:143:0x03fc, B:144:0x040c, B:145:0x041b, B:146:0x042a, B:147:0x0439, B:148:0x0448, B:149:0x0457, B:150:0x0466, B:151:0x0475, B:152:0x0484, B:153:0x0497, B:154:0x04a7, B:155:0x04b7, B:156:0x04c7, B:157:0x04d7, B:159:0x04e4, B:162:0x04eb, B:163:0x04f1, B:164:0x04fc, B:165:0x050c, B:166:0x051c, B:167:0x052f, B:168:0x0538, B:169:0x0548, B:170:0x0558, B:171:0x0568, B:172:0x0578, B:173:0x0588, B:174:0x0598, B:175:0x05a8), top: B:211:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x05d3 A[LOOP:3: B:186:0x05cf->B:188:0x05d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:204:0x05fe A[LOOP:2: B:202:0x05fa->B:204:0x05fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x060c  */
    /* JADX WARN: Code duplicated, block: B:243:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[SYNTHETIC] */
    @Override // p153l.ukx0
    /* JADX INFO: renamed from: f */
    public final void mo13343f(Object obj, qkx0 qkx0Var, jhx0 jhx0Var) throws Throwable {
        Object obj2;
        Throwable th;
        int i;
        Object objM13336O;
        Object objM13336O2;
        Object obj3;
        qkx0 qkx0Var2;
        jhx0 jhx0Var2;
        int i2;
        Object obj4;
        Object objM98763v;
        jhx0Var.getClass();
        m13323j(obj);
        olx0 olx0Var = this.f10085l;
        khx0 khx0Var = this.f10086m;
        Object objMo13517c = null;
        ohx0 ohx0VarMo149834b = null;
        while (true) {
            try {
                int iZzc = qkx0Var.zzc();
                int iM13330G = m13330G(iZzc);
                if (iM13330G >= 0) {
                    jhx0 jhx0Var3 = jhx0Var;
                    obj3 = obj;
                    qkx0Var2 = qkx0Var;
                    jhx0Var2 = jhx0Var3;
                    try {
                        int iM13333K = m13333K(iM13330G);
                        try {
                            try {
                                switch (m13320J(iM13333K)) {
                                    case 0:
                                        obj2 = obj3;
                                        xlx0.m211713z(obj2, iM13333K & 1048575, qkx0Var2.zza());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 1:
                                        obj2 = obj3;
                                        xlx0.m211680A(obj2, iM13333K & 1048575, qkx0Var2.zzb());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 2:
                                        obj2 = obj3;
                                        xlx0.m211682C(obj2, iM13333K & 1048575, qkx0Var2.zzl());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 3:
                                        obj2 = obj3;
                                        xlx0.m211682C(obj2, iM13333K & 1048575, qkx0Var2.zzo());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 4:
                                        obj2 = obj3;
                                        xlx0.m211681B(obj2, iM13333K & 1048575, qkx0Var2.zzg());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 5:
                                        obj2 = obj3;
                                        xlx0.m211682C(obj2, iM13333K & 1048575, qkx0Var2.zzk());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 6:
                                        obj2 = obj3;
                                        xlx0.m211681B(obj2, iM13333K & 1048575, qkx0Var2.zzf());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 7:
                                        obj2 = obj3;
                                        xlx0.m211711x(obj2, iM13333K & 1048575, qkx0Var2.zzN());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 8:
                                        obj2 = obj3;
                                        m13348m(obj2, iM13333K, qkx0Var2);
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 9:
                                        obj2 = obj3;
                                        fkx0 fkx0Var = (fkx0) m13344g(obj2, iM13330G);
                                        qkx0Var2.mo176974a(fkx0Var, m13335N(iM13330G), jhx0Var2);
                                        m13351p(obj2, iM13330G, fkx0Var);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 10:
                                        obj2 = obj3;
                                        xlx0.m211683D(obj2, iM13333K & 1048575, qkx0Var2.zzp());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 11:
                                        obj2 = obj3;
                                        xlx0.m211681B(obj2, iM13333K & 1048575, qkx0Var2.zzj());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 12:
                                        obj2 = obj3;
                                        int iZze = qkx0Var2.zze();
                                        zhx0 zhx0VarM13334M = m13334M(iM13330G);
                                        if (zhx0VarM13334M == null || zhx0VarM13334M.zza(iZze)) {
                                            xlx0.m211681B(obj2, iM13333K & 1048575, iZze);
                                            m13349n(obj2, iM13330G);
                                        } else {
                                            objMo13517c = alx0.m98764w(obj2, iZzc, iZze, objMo13517c, olx0Var);
                                        }
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 13:
                                        obj2 = obj3;
                                        xlx0.m211681B(obj2, iM13333K & 1048575, qkx0Var2.zzh());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 14:
                                        obj2 = obj3;
                                        xlx0.m211682C(obj2, iM13333K & 1048575, qkx0Var2.zzm());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 15:
                                        obj2 = obj3;
                                        xlx0.m211681B(obj2, iM13333K & 1048575, qkx0Var2.zzi());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 16:
                                        obj2 = obj3;
                                        xlx0.m211682C(obj2, iM13333K & 1048575, qkx0Var2.zzn());
                                        m13349n(obj2, iM13330G);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 17:
                                        obj2 = obj3;
                                        fkx0 fkx0Var2 = (fkx0) m13344g(obj2, iM13330G);
                                        qkx0Var2.mo176975b(fkx0Var2, m13335N(iM13330G), jhx0Var2);
                                        m13351p(obj2, iM13330G, fkx0Var2);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 18:
                                        obj2 = obj3;
                                        qkx0Var2.zzx(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 19:
                                        obj2 = obj3;
                                        qkx0Var2.zzB(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 20:
                                        obj2 = obj3;
                                        qkx0Var2.zzE(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 21:
                                        obj2 = obj3;
                                        qkx0Var2.zzM(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 22:
                                        obj2 = obj3;
                                        qkx0Var2.zzD(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 23:
                                        obj2 = obj3;
                                        qkx0Var2.zzA(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 24:
                                        obj2 = obj3;
                                        qkx0Var2.zzz(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 25:
                                        obj2 = obj3;
                                        qkx0Var2.zzv(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 26:
                                        obj2 = obj3;
                                        boolean zM13324s = m13324s(iM13333K);
                                        pjx0 pjx0Var = this.f10084k;
                                        if (zM13324s) {
                                            ((xgx0) qkx0Var2).m210970e(pjx0Var.mo154593a(obj2, iM13333K & 1048575), true);
                                        } else {
                                            ((xgx0) qkx0Var2).m210970e(pjx0Var.mo154593a(obj2, iM13333K & 1048575), false);
                                        }
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 27:
                                        obj2 = obj3;
                                        qkx0Var2.mo176977d(this.f10084k.mo154593a(obj2, iM13333K & 1048575), m13335N(iM13330G), jhx0Var2);
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 28:
                                        obj2 = obj3;
                                        qkx0Var2.zzw(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 29:
                                        obj2 = obj3;
                                        qkx0Var2.zzL(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 30:
                                        List listMo154593a = this.f10084k.mo154593a(obj3, iM13333K & 1048575);
                                        qkx0Var2.zzy(listMo154593a);
                                        zhx0 zhx0VarM13334M2 = m13334M(iM13330G);
                                        Object obj5 = objMo13517c;
                                        olx0 olx0Var2 = olx0Var;
                                        obj4 = obj3;
                                        try {
                                            objM98763v = alx0.m98763v(obj4, iZzc, listMo154593a, zhx0VarM13334M2, obj5, olx0Var2);
                                            obj2 = obj4;
                                            olx0Var = olx0Var2;
                                            objMo13517c = objM98763v;
                                        } catch (zzhaf unused) {
                                            objMo13517c = obj5;
                                            olx0Var = olx0Var2;
                                            obj2 = obj4;
                                            try {
                                                olx0Var.mo13530q(qkx0Var2);
                                                if (objMo13517c == null) {
                                                    objMo13517c = olx0Var.mo13517c(obj2);
                                                }
                                                try {
                                                    if (!olx0Var.m168175p(objMo13517c, qkx0Var2)) {
                                                        objM13336O2 = objMo13517c;
                                                        for (i2 = this.f10082i; i2 < this.f10083j; i2++) {
                                                            objM13336O2 = m13336O(obj2, this.f10081h[i2], objM13336O2, olx0Var, obj2);
                                                        }
                                                        if (objM13336O2 != null) {
                                                            olx0Var.mo13528n(obj2, objM13336O2);
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    objM13336O = objMo13517c;
                                                    for (i = this.f10082i; i < this.f10083j; i++) {
                                                        objM13336O = this.m13336O(obj2, this.f10081h[i], objM13336O, olx0Var, obj2);
                                                    }
                                                    if (objM13336O != null) {
                                                        throw th;
                                                    }
                                                    olx0Var.mo13528n(obj2, objM13336O);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                this = this;
                                                th = th3;
                                            }
                                        }
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 31:
                                        obj2 = obj3;
                                        qkx0Var2.zzG(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 32:
                                        obj2 = obj3;
                                        qkx0Var2.zzH(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 33:
                                        obj2 = obj3;
                                        qkx0Var2.zzI(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 34:
                                        obj2 = obj3;
                                        qkx0Var2.zzJ(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 35:
                                        obj2 = obj3;
                                        qkx0Var2.zzx(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 36:
                                        obj2 = obj3;
                                        qkx0Var2.zzB(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 37:
                                        obj2 = obj3;
                                        qkx0Var2.zzE(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 38:
                                        obj2 = obj3;
                                        qkx0Var2.zzM(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 39:
                                        obj2 = obj3;
                                        qkx0Var2.zzD(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 40:
                                        obj2 = obj3;
                                        qkx0Var2.zzA(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 41:
                                        obj2 = obj3;
                                        qkx0Var2.zzz(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 42:
                                        obj2 = obj3;
                                        qkx0Var2.zzv(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 43:
                                        obj2 = obj3;
                                        try {
                                            qkx0Var2.zzL(this.f10084k.mo154593a(obj2, iM13333K & 1048575));
                                        } catch (zzhaf unused2) {
                                            olx0Var.mo13530q(qkx0Var2);
                                            if (objMo13517c == null) {
                                                objMo13517c = olx0Var.mo13517c(obj2);
                                            }
                                            if (!olx0Var.m168175p(objMo13517c, qkx0Var2)) {
                                                objM13336O2 = objMo13517c;
                                                while (i2 < this.f10083j) {
                                                    objM13336O2 = m13336O(obj2, this.f10081h[i2], objM13336O2, olx0Var, obj2);
                                                }
                                                if (objM13336O2 != null) {
                                                    olx0Var.mo13528n(obj2, objM13336O2);
                                                }
                                            }
                                        }
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 44:
                                        List listMo154593a2 = this.f10084k.mo154593a(obj3, iM13333K & 1048575);
                                        qkx0Var2.zzy(listMo154593a2);
                                        zhx0 zhx0VarM13334M3 = m13334M(iM13330G);
                                        Object obj6 = objMo13517c;
                                        olx0 olx0Var3 = olx0Var;
                                        obj4 = obj3;
                                        try {
                                            try {
                                                objM98763v = alx0.m98763v(obj4, iZzc, listMo154593a2, zhx0VarM13334M3, obj6, olx0Var3);
                                                obj2 = obj4;
                                                olx0Var = olx0Var3;
                                                objMo13517c = objM98763v;
                                            } catch (zzhaf unused3) {
                                                objMo13517c = obj6;
                                                olx0Var = olx0Var3;
                                                obj2 = obj4;
                                                olx0Var.mo13530q(qkx0Var2);
                                                if (objMo13517c == null) {
                                                    objMo13517c = olx0Var.mo13517c(obj2);
                                                }
                                                if (!olx0Var.m168175p(objMo13517c, qkx0Var2)) {
                                                    objM13336O2 = objMo13517c;
                                                    while (i2 < this.f10083j) {
                                                        objM13336O2 = m13336O(obj2, this.f10081h[i2], objM13336O2, olx0Var, obj2);
                                                    }
                                                    if (objM13336O2 != null) {
                                                        olx0Var.mo13528n(obj2, objM13336O2);
                                                    }
                                                }
                                            }
                                            jhx0Var = jhx0Var2;
                                            qkx0Var = qkx0Var2;
                                            obj = obj2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            objMo13517c = obj6;
                                            olx0Var = olx0Var3;
                                            obj2 = obj4;
                                            th = th;
                                            this = this;
                                            objM13336O = objMo13517c;
                                            while (i < this.f10083j) {
                                                objM13336O = this.m13336O(obj2, this.f10081h[i], objM13336O, olx0Var, obj2);
                                            }
                                            if (objM13336O != null) {
                                                throw th;
                                            }
                                            olx0Var.mo13528n(obj2, objM13336O);
                                            throw th;
                                        }
                                        break;
                                    case 45:
                                        qkx0Var2.zzG(this.f10084k.mo154593a(obj3, iM13333K & 1048575));
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 46:
                                        qkx0Var2.zzH(this.f10084k.mo154593a(obj3, iM13333K & 1048575));
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 47:
                                        qkx0Var2.zzI(this.f10084k.mo154593a(obj3, iM13333K & 1048575));
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 48:
                                        qkx0Var2.zzJ(this.f10084k.mo154593a(obj3, iM13333K & 1048575));
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 49:
                                        qkx0Var2.mo176976c(this.f10084k.mo154593a(obj3, iM13333K & 1048575), m13335N(iM13330G), jhx0Var2);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 50:
                                        Object objM13337P = m13337P(iM13330G);
                                        long jM13333K = m13333K(iM13330G) & 1048575;
                                        Object objM211703p = xlx0.m211703p(obj3, jM13333K);
                                        if (objM211703p == null) {
                                            objM211703p = zzhay.zza().zzb();
                                            xlx0.m211683D(obj3, jM13333K, objM211703p);
                                        } else if (vjx0.m201556a(objM211703p)) {
                                            Object objZzb = zzhay.zza().zzb();
                                            vjx0.m201557b(objZzb, objM211703p);
                                            xlx0.m211683D(obj3, jM13333K, objZzb);
                                            objM211703p = objZzb;
                                        }
                                        throw null;
                                    case 51:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Double.valueOf(qkx0Var2.zza()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 52:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Float.valueOf(qkx0Var2.zzb()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 53:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Long.valueOf(qkx0Var2.zzl()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 54:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Long.valueOf(qkx0Var2.zzo()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 55:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Integer.valueOf(qkx0Var2.zzg()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 56:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Long.valueOf(qkx0Var2.zzk()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 57:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Integer.valueOf(qkx0Var2.zzf()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 58:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Boolean.valueOf(qkx0Var2.zzN()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 59:
                                        m13348m(obj3, iM13333K, qkx0Var2);
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 60:
                                        fkx0 fkx0Var3 = (fkx0) m13345h(obj3, iZzc, iM13330G);
                                        qkx0Var2.mo176974a(fkx0Var3, m13335N(iM13330G), jhx0Var2);
                                        m13352q(obj3, iZzc, iM13330G, fkx0Var3);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 61:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, qkx0Var2.zzp());
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 62:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Integer.valueOf(qkx0Var2.zzj()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 63:
                                        int iZze2 = qkx0Var2.zze();
                                        zhx0 zhx0VarM13334M4 = m13334M(iM13330G);
                                        if (zhx0VarM13334M4 != null && !zhx0VarM13334M4.zza(iZze2)) {
                                            objMo13517c = alx0.m98764w(obj3, iZzc, iZze2, objMo13517c, olx0Var);
                                            qkx0Var = qkx0Var2;
                                            obj = obj3;
                                            jhx0Var = jhx0Var2;
                                        }
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Integer.valueOf(iZze2));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 64:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Integer.valueOf(qkx0Var2.zzh()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 65:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Long.valueOf(qkx0Var2.zzm()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 66:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Integer.valueOf(qkx0Var2.zzi()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 67:
                                        xlx0.m211683D(obj3, iM13333K & 1048575, Long.valueOf(qkx0Var2.zzn()));
                                        m13350o(obj3, iZzc, iM13330G);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    case 68:
                                        fkx0 fkx0Var4 = (fkx0) m13345h(obj3, iZzc, iM13330G);
                                        qkx0Var2.mo176975b(fkx0Var4, m13335N(iM13330G), jhx0Var2);
                                        m13352q(obj3, iZzc, iM13330G, fkx0Var4);
                                        obj2 = obj3;
                                        jhx0Var = jhx0Var2;
                                        qkx0Var = qkx0Var2;
                                        obj = obj2;
                                        break;
                                    default:
                                        if (objMo13517c == null) {
                                            try {
                                                objMo13517c = olx0Var.mo13517c(obj3);
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                this = this;
                                                obj2 = obj3;
                                                objM13336O = objMo13517c;
                                                while (i < this.f10083j) {
                                                    objM13336O = this.m13336O(obj2, this.f10081h[i], objM13336O, olx0Var, obj2);
                                                }
                                                if (objM13336O != null) {
                                                    throw th;
                                                }
                                                olx0Var.mo13528n(obj2, objM13336O);
                                                throw th;
                                            }
                                        }
                                        if (!olx0Var.m168175p(objMo13517c, qkx0Var2)) {
                                            objM13336O2 = objMo13517c;
                                            for (int i3 = this.f10082i; i3 < this.f10083j; i3++) {
                                                objM13336O2 = m13336O(obj3, this.f10081h[i3], objM13336O2, olx0Var, obj3);
                                            }
                                            obj2 = obj3;
                                        }
                                        qkx0Var = qkx0Var2;
                                        obj = obj3;
                                        jhx0Var = jhx0Var2;
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
                    int i4 = this.f10082i;
                    objM13336O2 = objMo13517c;
                    while (i4 < this.f10083j) {
                        Object obj7 = obj;
                        objM13336O2 = m13336O(obj7, this.f10081h[i4], objM13336O2, olx0Var, obj);
                        i4++;
                        obj = obj7;
                    }
                    obj2 = obj;
                } else {
                    Object obj8 = obj;
                    try {
                        Object objMo149835c = !this.f10079f ? null : khx0Var.mo149835c(jhx0Var, this.f10078e, iZzc);
                        if (objMo149835c != null) {
                            if (ohx0VarMo149834b == null) {
                                try {
                                    ohx0VarMo149834b = khx0Var.mo149834b(obj8);
                                } catch (Throwable th8) {
                                    th = th8;
                                    obj2 = obj8;
                                    this = this;
                                    objM13336O = objMo13517c;
                                    while (i < this.f10083j) {
                                        objM13336O = this.m13336O(obj2, this.f10081h[i], objM13336O, olx0Var, obj2);
                                    }
                                    if (objM13336O != null) {
                                        throw th;
                                    }
                                    olx0Var.mo13528n(obj2, objM13336O);
                                    throw th;
                                }
                            }
                            ohx0 ohx0Var = ohx0VarMo149834b;
                            olx0 olx0Var4 = olx0Var;
                            qkx0 qkx0Var3 = qkx0Var;
                            jhx0 jhx0Var4 = jhx0Var;
                            try {
                                objMo13517c = khx0Var.mo149836d(obj8, qkx0Var3, objMo149835c, jhx0Var4, ohx0Var, objMo13517c, olx0Var4);
                                ohx0VarMo149834b = ohx0Var;
                                olx0Var = olx0Var4;
                                qkx0Var2 = qkx0Var3;
                                jhx0Var2 = jhx0Var4;
                                obj2 = obj8;
                                jhx0Var = jhx0Var2;
                                qkx0Var = qkx0Var2;
                                obj = obj2;
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj8;
                                olx0Var = olx0Var4;
                                th = th;
                                this = this;
                                objM13336O = objMo13517c;
                                while (i < this.f10083j) {
                                    objM13336O = this.m13336O(obj2, this.f10081h[i], objM13336O, olx0Var, obj2);
                                }
                                if (objM13336O != null) {
                                    throw th;
                                }
                                olx0Var.mo13528n(obj2, objM13336O);
                                throw th;
                            }
                        } else {
                            qkx0Var2 = qkx0Var;
                            jhx0Var2 = jhx0Var;
                            obj2 = obj8;
                            try {
                                olx0Var.mo13530q(qkx0Var2);
                                if (objMo13517c == null) {
                                    try {
                                        objMo13517c = olx0Var.mo13517c(obj2);
                                    } catch (Throwable th10) {
                                        th = th10;
                                        th = th;
                                        this = this;
                                        objM13336O = objMo13517c;
                                        while (i < this.f10083j) {
                                            objM13336O = this.m13336O(obj2, this.f10081h[i], objM13336O, olx0Var, obj2);
                                        }
                                        if (objM13336O != null) {
                                            throw th;
                                        }
                                        olx0Var.mo13528n(obj2, objM13336O);
                                        throw th;
                                    }
                                }
                                if (!olx0Var.m168175p(objMo13517c, qkx0Var2)) {
                                    objM13336O2 = objMo13517c;
                                    for (int i5 = this.f10082i; i5 < this.f10083j; i5++) {
                                        objM13336O2 = m13336O(obj2, this.f10081h[i5], objM13336O2, olx0Var, obj2);
                                    }
                                }
                                jhx0Var = jhx0Var2;
                                qkx0Var = qkx0Var2;
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
                        objM13336O = objMo13517c;
                        while (i < this.f10083j) {
                            objM13336O = this.m13336O(obj2, this.f10081h[i], objM13336O, olx0Var, obj2);
                        }
                        if (objM13336O != null) {
                            throw th;
                        }
                        olx0Var.mo13528n(obj2, objM13336O);
                        throw th;
                    }
                }
            } catch (Throwable th13) {
                th = th13;
                obj2 = obj;
            }
            objM13336O = objMo13517c;
            while (i < this.f10083j) {
                objM13336O = this.m13336O(obj2, this.f10081h[i], objM13336O, olx0Var, obj2);
            }
            if (objM13336O != null) {
                throw th;
            }
            olx0Var.mo13528n(obj2, objM13336O);
            throw th;
        }
        if (objM13336O2 != null) {
            olx0Var.mo13528n(obj2, objM13336O2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m13344g(Object obj, int i) {
        ukx0 ukx0VarM13335N = m13335N(i);
        int iM13333K = m13333K(i) & 1048575;
        if (!m13354t(obj, i)) {
            return ukx0VarM13335N.zze();
        }
        Object object = f10073q.getObject(obj, iM13333K);
        if (m13326w(object)) {
            return object;
        }
        Object objZze = ukx0VarM13335N.zze();
        if (object != null) {
            ukx0VarM13335N.zzg(objZze, object);
        }
        return objZze;
    }

    /* JADX INFO: renamed from: h */
    public final Object m13345h(Object obj, int i, int i2) {
        ukx0 ukx0VarM13335N = m13335N(i2);
        if (!m13356x(obj, i, i2)) {
            return ukx0VarM13335N.zze();
        }
        Object object = f10073q.getObject(obj, m13333K(i2) & 1048575);
        if (m13326w(object)) {
            return object;
        }
        Object objZze = ukx0VarM13335N.zze();
        if (object != null) {
            ukx0VarM13335N.zzg(objZze, object);
        }
        return objZze;
    }

    /* JADX INFO: renamed from: k */
    public final void m13346k(Object obj, Object obj2, int i) {
        if (m13354t(obj2, i)) {
            int iM13333K = m13333K(i) & 1048575;
            Unsafe unsafe = f10073q;
            long j = iM13333K;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                hkx0.m135653a(obj2, this.f10074a[i]);
                return;
            }
            ukx0 ukx0VarM13335N = m13335N(i);
            if (!m13354t(obj, i)) {
                if (m13326w(object)) {
                    Object objZze = ukx0VarM13335N.zze();
                    ukx0VarM13335N.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m13349n(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m13326w(object2)) {
                Object objZze2 = ukx0VarM13335N.zze();
                ukx0VarM13335N.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            ukx0VarM13335N.zzg(object2, object);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13347l(Object obj, Object obj2, int i) {
        int i2 = this.f10074a[i];
        if (m13356x(obj2, i2, i)) {
            int iM13333K = m13333K(i) & 1048575;
            Unsafe unsafe = f10073q;
            long j = iM13333K;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                hkx0.m135653a(obj2, this.f10074a[i]);
                return;
            }
            ukx0 ukx0VarM13335N = m13335N(i);
            if (!m13356x(obj, i2, i)) {
                if (m13326w(object)) {
                    Object objZze = ukx0VarM13335N.zze();
                    ukx0VarM13335N.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m13350o(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m13326w(object2)) {
                Object objZze2 = ukx0VarM13335N.zze();
                ukx0VarM13335N.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            ukx0VarM13335N.zzg(object2, object);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13348m(Object obj, int i, qkx0 qkx0Var) throws IOException {
        long j = i & 1048575;
        if (m13324s(i)) {
            xlx0.m211683D(obj, j, qkx0Var.zzs());
        } else if (this.f10080g) {
            xlx0.m211683D(obj, j, qkx0Var.zzr());
        } else {
            xlx0.m211683D(obj, j, qkx0Var.zzp());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m13349n(Object obj, int i) {
        int iM13331H = m13331H(i);
        long j = 1048575 & iM13331H;
        if (j == 1048575) {
            return;
        }
        xlx0.m211681B(obj, j, (1 << (iM13331H >>> 20)) | xlx0.m211699l(obj, j));
    }

    /* JADX INFO: renamed from: o */
    public final void m13350o(Object obj, int i, int i2) {
        xlx0.m211681B(obj, m13331H(i2) & 1048575, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m13351p(Object obj, int i, Object obj2) {
        f10073q.putObject(obj, m13333K(i) & 1048575, obj2);
        m13349n(obj, i);
    }

    /* JADX INFO: renamed from: q */
    public final void m13352q(Object obj, int i, int i2, Object obj2) {
        f10073q.putObject(obj, m13333K(i2) & 1048575, obj2);
        m13350o(obj, i, i2);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13353r(Object obj, Object obj2, int i) {
        return m13354t(obj, i) == m13354t(obj2, i);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m13354t(Object obj, int i) {
        int iM13331H = m13331H(i);
        long j = iM13331H & 1048575;
        if (j != 1048575) {
            return ((1 << (iM13331H >>> 20)) & xlx0.m211699l(obj, j)) != 0;
        }
        int iM13333K = m13333K(i);
        long j2 = iM13333K & 1048575;
        switch (m13320J(iM13333K)) {
            case 0:
                return Double.doubleToRawLongBits(xlx0.m211697j(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(xlx0.m211698k(obj, j2)) != 0;
            case 2:
                return xlx0.m211701n(obj, j2) != 0;
            case 3:
                return xlx0.m211701n(obj, j2) != 0;
            case 4:
                return xlx0.m211699l(obj, j2) != 0;
            case 5:
                return xlx0.m211701n(obj, j2) != 0;
            case 6:
                return xlx0.m211699l(obj, j2) != 0;
            case 7:
                return xlx0.m211687H(obj, j2);
            case 8:
                Object objM211703p = xlx0.m211703p(obj, j2);
                if (objM211703p instanceof String) {
                    return !((String) objM211703p).isEmpty();
                }
                if (objM211703p instanceof zzgyl) {
                    return !zzgyl.zzb.equals(objM211703p);
                }
                fig0.m125680a();
                return false;
            case 9:
                return xlx0.m211703p(obj, j2) != null;
            case 10:
                return !zzgyl.zzb.equals(xlx0.m211703p(obj, j2));
            case 11:
                return xlx0.m211699l(obj, j2) != 0;
            case 12:
                return xlx0.m211699l(obj, j2) != 0;
            case 13:
                return xlx0.m211699l(obj, j2) != 0;
            case 14:
                return xlx0.m211701n(obj, j2) != 0;
            case 15:
                return xlx0.m211699l(obj, j2) != 0;
            case 16:
                return xlx0.m211701n(obj, j2) != 0;
            case 17:
                return xlx0.m211703p(obj, j2) != null;
            default:
                fig0.m125680a();
                return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13355u(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m13354t(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m13356x(Object obj, int i, int i2) {
        return xlx0.m211699l(obj, (long) (m13331H(i2) & 1048575)) == i;
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
    @Override // p153l.ukx0
    public final int zza(Object obj) {
        int i;
        int iM13149B;
        int iM13149B2;
        int iM13149B3;
        int iM13150b;
        int iM13149B4;
        int iM13149B5;
        int iM13149B6;
        int iZzd;
        int iM13149B7;
        int iM98756o;
        int i2;
        int iM98755n;
        int size;
        int iM98760s;
        int iM13149B8;
        int iM13149B9;
        int iM13149B10;
        int iM13150b2;
        int iM98753l;
        int iM13149B11;
        int iM13149B12;
        int iM13153y;
        int iM13149B13;
        int iM13149B14;
        int iZzd2;
        int iM13149B15;
        C2269s5<T> c2269s5 = this;
        Object obj2 = obj;
        Unsafe unsafe = f10073q;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i4 < c2269s5.f10074a.length) {
            int iM13333K = c2269s5.m13333K(i4);
            int iM13320J = m13320J(iM13333K);
            int[] iArr = c2269s5.f10074a;
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & i3;
            if (iM13320J <= 17) {
                if (i10 != i7) {
                    i5 = i10 == i3 ? 0 : unsafe.getInt(obj2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iM13333K & i3;
            if (iM13320J >= zzgzl.zzJ.zza()) {
                zzgzl.zzW.zza();
            }
            int i12 = i6;
            long j = i11;
            switch (iM13320J) {
                case 0:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        iM13149B = AbstractC2237o5.m13149B(i8 << 3);
                        iM98756o = iM13149B + 8;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        iM13149B2 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B5 = iM13149B2 + 4;
                        i6 = i12 + iM13149B5;
                        c2269s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        iM13149B3 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b = AbstractC2237o5.m13150b(j2);
                        i2 = iM13149B3 + iM13150b;
                        i6 = i12 + i2;
                        c2269s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        iM13149B3 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b = AbstractC2237o5.m13150b(j3);
                        i2 = iM13149B3 + iM13150b;
                        i6 = i12 + i2;
                        c2269s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        iM13149B3 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b = AbstractC2237o5.m13150b(j4);
                        i2 = iM13149B3 + iM13150b;
                        i6 = i12 + i2;
                        c2269s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        iM13149B4 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B5 = iM13149B4 + 8;
                        i6 = i12 + iM13149B5;
                        c2269s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        iM13149B2 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B5 = iM13149B2 + 4;
                        i6 = i12 + iM13149B5;
                        c2269s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        iM13149B5 = AbstractC2237o5.m13149B(i8 << 3) + 1;
                        i6 = i12 + iM13149B5;
                        c2269s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        int i13 = i8 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzgyl) {
                            iM13149B6 = AbstractC2237o5.m13149B(i13);
                            iZzd = ((zzgyl) object).zzd();
                            iM13149B7 = AbstractC2237o5.m13149B(iZzd);
                            i2 = iM13149B6 + iM13149B7 + iZzd;
                            i6 = i12 + i2;
                            c2269s5 = this;
                            i4 += 3;
                            i3 = 1048575;
                        } else {
                            iM13149B3 = AbstractC2237o5.m13149B(i13);
                            iM13150b = AbstractC2237o5.m13148A((String) object);
                            i2 = iM13149B3 + iM13150b;
                            i6 = i12 + i2;
                            c2269s5 = this;
                            i4 += 3;
                            i3 = 1048575;
                        }
                    }
                    c2269s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        iM98756o = alx0.m98756o(i8, unsafe.getObject(obj2, j), c2269s5.m13335N(i4));
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        zzgyl zzgylVar = (zzgyl) unsafe.getObject(obj2, j);
                        iM13149B6 = AbstractC2237o5.m13149B(i8 << 3);
                        iZzd = zzgylVar.zzd();
                        iM13149B7 = AbstractC2237o5.m13149B(iZzd);
                        i2 = iM13149B6 + iM13149B7 + iZzd;
                        i6 = i12 + i2;
                        c2269s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(obj2, j);
                        iM13149B3 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b = AbstractC2237o5.m13149B(i14);
                        i2 = iM13149B3 + iM13150b;
                        i6 = i12 + i2;
                        c2269s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        iM13149B3 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b = AbstractC2237o5.m13150b(j5);
                        i2 = iM13149B3 + iM13150b;
                        i6 = i12 + i2;
                        c2269s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        iM13149B2 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B5 = iM13149B2 + 4;
                        i6 = i12 + iM13149B5;
                        c2269s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        iM13149B4 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B5 = iM13149B4 + 8;
                        i6 = i12 + iM13149B5;
                        c2269s5 = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        iM13149B3 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b = AbstractC2237o5.m13149B((i15 >> 31) ^ (i15 + i15));
                        i2 = iM13149B3 + iM13150b;
                        i6 = i12 + i2;
                        c2269s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        iM13149B3 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b = AbstractC2237o5.m13150b((j6 >> 63) ^ (j6 + j6));
                        i2 = iM13149B3 + iM13150b;
                        i6 = i12 + i2;
                        c2269s5 = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    c2269s5 = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (c2269s5.m13355u(obj2, i4, i7, i5, i)) {
                        iM98756o = AbstractC2237o5.m13153y(i8, (fkx0) unsafe.getObject(obj2, j), c2269s5.m13335N(i4));
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    iM98756o = alx0.m98752k(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    iM98756o = alx0.m98750i(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    Class cls = alx0.f72165a;
                    if (list.size() == 0) {
                        iM98755n = 0;
                    } else {
                        iM98755n = alx0.m98755n(list) + (list.size() * AbstractC2237o5.m13149B(i8 << 3));
                    }
                    i6 = iM98755n + i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    Class cls2 = alx0.f72165a;
                    size = list2.size();
                    if (size == 0) {
                        iM98756o = 0;
                    } else {
                        iM98760s = alx0.m98760s(list2);
                        iM13149B8 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = size * iM13149B8;
                        iM98756o = iM98760s + iM13150b2;
                    }
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    Class cls3 = alx0.f72165a;
                    size = list3.size();
                    if (size == 0) {
                        iM98756o = 0;
                    } else {
                        iM98760s = alx0.m98754m(list3);
                        iM13149B8 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = size * iM13149B8;
                        iM98756o = iM98760s + iM13150b2;
                    }
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    iM98756o = alx0.m98752k(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    iM98756o = alx0.m98750i(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    Class cls4 = alx0.f72165a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM98756o = 0;
                    } else {
                        iM98756o = size2 * (AbstractC2237o5.m13149B(i8 << 3) + 1);
                    }
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    Class cls5 = alx0.f72165a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM98755n = 0;
                    } else {
                        iM98755n = AbstractC2237o5.m13149B(i8 << 3) * size3;
                        if (list5 instanceof jjx0) {
                            jjx0 jjx0Var = (jjx0) list5;
                            for (int i16 = 0; i16 < size3; i16++) {
                                Object objZzf = jjx0Var.zzf(i16);
                                if (objZzf instanceof zzgyl) {
                                    int iZzd3 = ((zzgyl) objZzf).zzd();
                                    iM98755n += AbstractC2237o5.m13149B(iZzd3) + iZzd3;
                                } else {
                                    iM98755n += AbstractC2237o5.m13148A((String) objZzf);
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size3; i17++) {
                                Object obj3 = list5.get(i17);
                                if (obj3 instanceof zzgyl) {
                                    int iZzd4 = ((zzgyl) obj3).zzd();
                                    iM98755n += AbstractC2237o5.m13149B(iZzd4) + iZzd4;
                                } else {
                                    iM98755n += AbstractC2237o5.m13148A((String) obj3);
                                }
                            }
                        }
                    }
                    i6 = iM98755n + i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    ukx0 ukx0VarM13335N = c2269s5.m13335N(i4);
                    Class cls6 = alx0.f72165a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM13149B9 = 0;
                    } else {
                        iM13149B9 = AbstractC2237o5.m13149B(i8 << 3) * size4;
                        for (int i18 = 0; i18 < size4; i18++) {
                            Object obj4 = list6.get(i18);
                            if (obj4 instanceof C2253q5) {
                                int iM13263a = ((C2253q5) obj4).m13263a();
                                iM13149B9 += AbstractC2237o5.m13149B(iM13263a) + iM13263a;
                            } else {
                                iM13149B9 += AbstractC2237o5.m13154z((fkx0) obj4, ukx0VarM13335N);
                            }
                        }
                    }
                    i6 = i12 + iM13149B9;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    Class cls7 = alx0.f72165a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM13149B10 = 0;
                    } else {
                        iM13149B10 = size5 * AbstractC2237o5.m13149B(i8 << 3);
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int iZzd5 = ((zzgyl) list7.get(i19)).zzd();
                            iM13149B10 += AbstractC2237o5.m13149B(iZzd5) + iZzd5;
                        }
                    }
                    i6 = i12 + iM13149B10;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    Class cls8 = alx0.f72165a;
                    size = list8.size();
                    if (size == 0) {
                        iM98756o = 0;
                    } else {
                        iM98760s = alx0.m98759r(list8);
                        iM13149B8 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = size * iM13149B8;
                        iM98756o = iM98760s + iM13150b2;
                    }
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    Class cls9 = alx0.f72165a;
                    size = list9.size();
                    if (size == 0) {
                        iM98756o = 0;
                    } else {
                        iM98760s = alx0.m98749h(list9);
                        iM13149B8 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = size * iM13149B8;
                        iM98756o = iM98760s + iM13150b2;
                    }
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    iM98756o = alx0.m98750i(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    iM98756o = alx0.m98752k(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    Class cls10 = alx0.f72165a;
                    size = list10.size();
                    if (size == 0) {
                        iM98756o = 0;
                    } else {
                        iM98760s = alx0.m98757p(list10);
                        iM13149B8 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = size * iM13149B8;
                        iM98756o = iM98760s + iM13150b2;
                    }
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    Class cls11 = alx0.f72165a;
                    size = list11.size();
                    if (size == 0) {
                        iM98756o = 0;
                    } else {
                        iM98760s = alx0.m98758q(list11);
                        iM13149B8 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = size * iM13149B8;
                        iM98756o = iM98760s + iM13150b2;
                    }
                    i6 = i12 + iM98756o;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    iM98753l = alx0.m98753l((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 36:
                    iM98753l = alx0.m98751j((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 37:
                    iM98753l = alx0.m98755n((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    iM98753l = alx0.m98760s((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 39:
                    iM98753l = alx0.m98754m((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 40:
                    iM98753l = alx0.m98753l((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 41:
                    iM98753l = alx0.m98751j((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    Class cls12 = alx0.f72165a;
                    iM98753l = list12.size();
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    iM98753l = alx0.m98759r((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 44:
                    iM98753l = alx0.m98749h((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 45:
                    iM98753l = alx0.m98751j((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 46:
                    iM98753l = alx0.m98753l((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 47:
                    iM98753l = alx0.m98757p((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 48:
                    iM98753l = alx0.m98758q((List) unsafe.getObject(obj2, j));
                    if (iM98753l > 0) {
                        iM13149B11 = AbstractC2237o5.m13149B(i8 << 3);
                        iM13149B12 = AbstractC2237o5.m13149B(iM98753l);
                        iM13149B10 = iM13149B11 + iM13149B12 + iM98753l;
                        i6 = i12 + iM13149B10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    ukx0 ukx0VarM13335N2 = c2269s5.m13335N(i4);
                    Class cls13 = alx0.f72165a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iM13153y = 0;
                    } else {
                        iM13153y = 0;
                        for (int i20 = 0; i20 < size6; i20++) {
                            iM13153y += AbstractC2237o5.m13153y(i8, (fkx0) list13.get(i20), ukx0VarM13335N2);
                        }
                    }
                    i6 = i12 + iM13153y;
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
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        iM13149B = AbstractC2237o5.m13149B(i8 << 3);
                        iM98756o = iM13149B + 8;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 52:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        iM13149B13 = AbstractC2237o5.m13149B(i8 << 3);
                        iM98756o = iM13149B13 + 4;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        long jM13321L = m13321L(obj2, j);
                        iM98760s = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = AbstractC2237o5.m13150b(jM13321L);
                        iM98756o = iM98760s + iM13150b2;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        long jM13321L2 = m13321L(obj2, j);
                        iM98760s = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = AbstractC2237o5.m13150b(jM13321L2);
                        iM98756o = iM98760s + iM13150b2;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        long jM13319F = m13319F(obj2, j);
                        iM98760s = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = AbstractC2237o5.m13150b(jM13319F);
                        iM98756o = iM98760s + iM13150b2;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        iM13149B = AbstractC2237o5.m13149B(i8 << 3);
                        iM98756o = iM13149B + 8;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        iM13149B13 = AbstractC2237o5.m13149B(i8 << 3);
                        iM98756o = iM13149B13 + 4;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        iM98756o = AbstractC2237o5.m13149B(i8 << 3) + 1;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        int i21 = i8 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzgyl) {
                            iM13149B14 = AbstractC2237o5.m13149B(i21);
                            iZzd2 = ((zzgyl) object2).zzd();
                            iM13149B15 = AbstractC2237o5.m13149B(iZzd2);
                            iM98756o = iM13149B14 + iM13149B15 + iZzd2;
                            i6 = i12 + iM98756o;
                        } else {
                            iM98760s = AbstractC2237o5.m13149B(i21);
                            iM13150b2 = AbstractC2237o5.m13148A((String) object2);
                            iM98756o = iM98760s + iM13150b2;
                            i6 = i12 + iM98756o;
                        }
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        iM98756o = alx0.m98756o(i8, unsafe.getObject(obj2, j), c2269s5.m13335N(i4));
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        zzgyl zzgylVar2 = (zzgyl) unsafe.getObject(obj2, j);
                        iM13149B14 = AbstractC2237o5.m13149B(i8 << 3);
                        iZzd2 = zzgylVar2.zzd();
                        iM13149B15 = AbstractC2237o5.m13149B(iZzd2);
                        iM98756o = iM13149B14 + iM13149B15 + iZzd2;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        int iM13319F = m13319F(obj2, j);
                        iM98760s = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = AbstractC2237o5.m13149B(iM13319F);
                        iM98756o = iM98760s + iM13150b2;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        long jM13319F2 = m13319F(obj2, j);
                        iM98760s = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = AbstractC2237o5.m13150b(jM13319F2);
                        iM98756o = iM98760s + iM13150b2;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        iM13149B13 = AbstractC2237o5.m13149B(i8 << 3);
                        iM98756o = iM13149B13 + 4;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        iM13149B = AbstractC2237o5.m13149B(i8 << 3);
                        iM98756o = iM13149B + 8;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        int iM13319F2 = m13319F(obj2, j);
                        iM98760s = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = AbstractC2237o5.m13149B((iM13319F2 >> 31) ^ (iM13319F2 + iM13319F2));
                        iM98756o = iM98760s + iM13150b2;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        long jM13321L3 = m13321L(obj2, j);
                        iM98760s = AbstractC2237o5.m13149B(i8 << 3);
                        iM13150b2 = AbstractC2237o5.m13150b((jM13321L3 >> 63) ^ (jM13321L3 + jM13321L3));
                        iM98756o = iM98760s + iM13150b2;
                        i6 = i12 + iM98756o;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (c2269s5.m13356x(obj2, i8, i4)) {
                        iM98756o = AbstractC2237o5.m13153y(i8, (fkx0) unsafe.getObject(obj2, j), c2269s5.m13335N(i4));
                        i6 = i12 + iM98756o;
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
        olx0 olx0Var = c2269s5.f10085l;
        int iMo13515a = i6 + olx0Var.mo13515a(olx0Var.mo13518d(obj2));
        if (!c2269s5.f10079f) {
            return iMo13515a;
        }
        c2269s5.f10086m.mo149833a(obj2);
        throw null;
    }

    @Override // p153l.ukx0
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f10074a.length; i4 += 3) {
            int iM13333K = m13333K(i4);
            int[] iArr = this.f10074a;
            int i5 = 1048575 & iM13333K;
            int iM13320J = m13320J(iM13333K);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iM13320J) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(xlx0.m211697j(obj, j));
                    Charset charset = gjx0.f104688a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(xlx0.m211698k(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = xlx0.m211701n(obj, j);
                    Charset charset2 = gjx0.f104688a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = xlx0.m211701n(obj, j);
                    Charset charset3 = gjx0.f104688a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = xlx0.m211699l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = xlx0.m211701n(obj, j);
                    Charset charset4 = gjx0.f104688a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = xlx0.m211699l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = gjx0.m130562a(xlx0.m211687H(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) xlx0.m211703p(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objM211703p = xlx0.m211703p(obj, j);
                    if (objM211703p != null) {
                        iHashCode = objM211703p.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = xlx0.m211703p(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = xlx0.m211699l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = xlx0.m211699l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = xlx0.m211699l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = xlx0.m211701n(obj, j);
                    Charset charset5 = gjx0.f104688a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = xlx0.m211699l(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = xlx0.m211701n(obj, j);
                    Charset charset6 = gjx0.f104688a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objM211703p2 = xlx0.m211703p(obj, j);
                    if (objM211703p2 != null) {
                        iHashCode = objM211703p2.hashCode();
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
                    iFloatToIntBits = xlx0.m211703p(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = xlx0.m211703p(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(m13317D(obj, j));
                        Charset charset7 = gjx0.f104688a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(m13318E(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13321L(obj, j);
                        Charset charset8 = gjx0.f104688a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13321L(obj, j);
                        Charset charset9 = gjx0.f104688a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13319F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13321L(obj, j);
                        Charset charset10 = gjx0.f104688a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13319F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = gjx0.m130562a(m13327y(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) xlx0.m211703p(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = xlx0.m211703p(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = xlx0.m211703p(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13319F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13319F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13319F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13321L(obj, j);
                        Charset charset11 = gjx0.f104688a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = m13319F(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = m13321L(obj, j);
                        Charset charset12 = gjx0.f104688a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (m13356x(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = xlx0.m211703p(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + this.f10085l.mo13518d(obj).hashCode();
        if (!this.f10079f) {
            return iHashCode2;
        }
        this.f10086m.mo149833a(obj);
        throw null;
    }

    @Override // p153l.ukx0
    public final Object zze() {
        return ((AbstractC2245p5) this.f10078e).m13242m();
    }

    @Override // p153l.ukx0
    public final void zzg(Object obj, Object obj2) {
        m13323j(obj);
        obj2.getClass();
        for (int i = 0; i < this.f10074a.length; i += 3) {
            int iM13333K = m13333K(i);
            int i2 = 1048575 & iM13333K;
            int[] iArr = this.f10074a;
            int iM13320J = m13320J(iM13333K);
            int i3 = iArr[i];
            long j = i2;
            switch (iM13320J) {
                case 0:
                    if (m13354t(obj2, i)) {
                        xlx0.m211713z(obj, j, xlx0.m211697j(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 1:
                    if (m13354t(obj2, i)) {
                        xlx0.m211680A(obj, j, xlx0.m211698k(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 2:
                    if (m13354t(obj2, i)) {
                        xlx0.m211682C(obj, j, xlx0.m211701n(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 3:
                    if (m13354t(obj2, i)) {
                        xlx0.m211682C(obj, j, xlx0.m211701n(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 4:
                    if (m13354t(obj2, i)) {
                        xlx0.m211681B(obj, j, xlx0.m211699l(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 5:
                    if (m13354t(obj2, i)) {
                        xlx0.m211682C(obj, j, xlx0.m211701n(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 6:
                    if (m13354t(obj2, i)) {
                        xlx0.m211681B(obj, j, xlx0.m211699l(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 7:
                    if (m13354t(obj2, i)) {
                        xlx0.m211711x(obj, j, xlx0.m211687H(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 8:
                    if (m13354t(obj2, i)) {
                        xlx0.m211683D(obj, j, xlx0.m211703p(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 9:
                    m13346k(obj, obj2, i);
                    break;
                case 10:
                    if (m13354t(obj2, i)) {
                        xlx0.m211683D(obj, j, xlx0.m211703p(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 11:
                    if (m13354t(obj2, i)) {
                        xlx0.m211681B(obj, j, xlx0.m211699l(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 12:
                    if (m13354t(obj2, i)) {
                        xlx0.m211681B(obj, j, xlx0.m211699l(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 13:
                    if (m13354t(obj2, i)) {
                        xlx0.m211681B(obj, j, xlx0.m211699l(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 14:
                    if (m13354t(obj2, i)) {
                        xlx0.m211682C(obj, j, xlx0.m211701n(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 15:
                    if (m13354t(obj2, i)) {
                        xlx0.m211681B(obj, j, xlx0.m211699l(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 16:
                    if (m13354t(obj2, i)) {
                        xlx0.m211682C(obj, j, xlx0.m211701n(obj2, j));
                        m13349n(obj, i);
                    }
                    break;
                case 17:
                    m13346k(obj, obj2, i);
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
                    this.f10084k.mo154595c(obj, obj2, j);
                    break;
                case 50:
                    Class cls = alx0.f72165a;
                    xlx0.m211683D(obj, j, vjx0.m201557b(xlx0.m211703p(obj, j), xlx0.m211703p(obj2, j)));
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
                    if (m13356x(obj2, i3, i)) {
                        xlx0.m211683D(obj, j, xlx0.m211703p(obj2, j));
                        m13350o(obj, i3, i);
                    }
                    break;
                case 60:
                    m13347l(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m13356x(obj2, i3, i)) {
                        xlx0.m211683D(obj, j, xlx0.m211703p(obj2, j));
                        m13350o(obj, i3, i);
                    }
                    break;
                case 68:
                    m13347l(obj, obj2, i);
                    break;
            }
        }
        alx0.m98765x(this.f10085l, obj, obj2);
        if (this.f10079f) {
            this.f10086m.mo149833a(obj2);
            throw null;
        }
    }
}
