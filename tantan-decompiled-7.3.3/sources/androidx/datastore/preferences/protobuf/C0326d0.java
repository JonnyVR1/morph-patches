package androidx.datastore.preferences.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.azk0;
import p153l.b9g0;
import p153l.cez;
import p153l.fig0;
import p153l.g7b0;
import p153l.iig0;
import p153l.ikx0;
import p153l.lyj0;
import p153l.nlc0;
import p153l.v130;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0326d0<T> implements InterfaceC0336i0<T> {

    /* JADX INFO: renamed from: r */
    public static final int[] f1606r = new int[0];

    /* JADX INFO: renamed from: s */
    public static final Unsafe f1607s = lyj0.m156300F();

    /* JADX INFO: renamed from: a */
    public final int[] f1608a;

    /* JADX INFO: renamed from: b */
    public final Object[] f1609b;

    /* JADX INFO: renamed from: c */
    public final int f1610c;

    /* JADX INFO: renamed from: d */
    public final int f1611d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0322b0 f1612e;

    /* JADX INFO: renamed from: f */
    public final boolean f1613f;

    /* JADX INFO: renamed from: g */
    public final boolean f1614g;

    /* JADX INFO: renamed from: h */
    public final boolean f1615h;

    /* JADX INFO: renamed from: i */
    public final boolean f1616i;

    /* JADX INFO: renamed from: j */
    public final int[] f1617j;

    /* JADX INFO: renamed from: k */
    public final int f1618k;

    /* JADX INFO: renamed from: l */
    public final int f1619l;

    /* JADX INFO: renamed from: m */
    public final v130 f1620m;

    /* JADX INFO: renamed from: n */
    public final AbstractC0355w f1621n;

    /* JADX INFO: renamed from: o */
    public final AbstractC0342l0<?, ?> f1622o;

    /* JADX INFO: renamed from: p */
    public final AbstractC0343m<?> f1623p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC0358z f1624q;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1625a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f1625a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1625a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1625a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1625a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1625a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1625a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1625a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1625a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1625a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1625a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1625a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1625a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1625a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1625a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1625a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1625a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1625a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C0326d0(int[] iArr, Object[] objArr, int i, int i2, InterfaceC0322b0 interfaceC0322b0, boolean z, boolean z2, int[] iArr2, int i3, int i4, v130 v130Var, AbstractC0355w abstractC0355w, AbstractC0342l0<?, ?> abstractC0342l0, AbstractC0343m<?> abstractC0343m, InterfaceC0358z interfaceC0358z) {
        this.f1608a = iArr;
        this.f1609b = objArr;
        this.f1610c = i;
        this.f1611d = i2;
        this.f1614g = interfaceC0322b0 instanceof GeneratedMessageLite;
        this.f1615h = z;
        this.f1613f = abstractC0343m != null && abstractC0343m.mo2254e(interfaceC0322b0);
        this.f1616i = z2;
        this.f1617j = iArr2;
        this.f1618k = i3;
        this.f1619l = i4;
        this.f1620m = v130Var;
        this.f1621n = abstractC0355w;
        this.f1622o = abstractC0342l0;
        this.f1623p = abstractC0343m;
        this.f1612e = interfaceC0322b0;
        this.f1624q = interfaceC0358z;
    }

    /* JADX INFO: renamed from: A */
    public static <T> int m1867A(T t, long j) {
        return lyj0.m156295A(t, j);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m1868B(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static boolean m1869E(Object obj, int i, InterfaceC0336i0 interfaceC0336i0) {
        return interfaceC0336i0.mo1901b(lyj0.m156299E(obj, m1876V(i)));
    }

    /* JADX INFO: renamed from: J */
    public static boolean m1870J(int i) {
        return (i & SQLiteDatabase.CREATE_IF_NECESSARY) != 0;
    }

    /* JADX INFO: renamed from: K */
    public static List<?> m1871K(Object obj, long j) {
        return (List) lyj0.m156299E(obj, j);
    }

    /* JADX INFO: renamed from: L */
    public static <T> long m1872L(T t, long j) {
        return lyj0.m156297C(t, j);
    }

    /* JADX INFO: renamed from: R */
    public static <T> C0326d0<T> m1873R(Class<T> cls, cez cezVar, v130 v130Var, AbstractC0355w abstractC0355w, AbstractC0342l0<?, ?> abstractC0342l0, AbstractC0343m<?> abstractC0343m, InterfaceC0358z interfaceC0358z) {
        return cezVar instanceof nlc0 ? m1875T((nlc0) cezVar, v130Var, abstractC0355w, abstractC0342l0, abstractC0343m, interfaceC0358z) : m1874S((b9g0) cezVar, v130Var, abstractC0355w, abstractC0342l0, abstractC0343m, interfaceC0358z);
    }

    /* JADX INFO: renamed from: S */
    public static <T> C0326d0<T> m1874S(b9g0 b9g0Var, v130 v130Var, AbstractC0355w abstractC0355w, AbstractC0342l0<?, ?> abstractC0342l0, AbstractC0343m<?> abstractC0343m, InterfaceC0358z interfaceC0358z) {
        boolean z = b9g0Var.mo103101c() == ProtoSyntax.PROTO3;
        C0347o[] c0347oArrM103103e = b9g0Var.m103103e();
        if (c0347oArrM103103e.length != 0) {
            C0347o c0347o = c0347oArrM103103e[0];
            throw null;
        }
        int length = c0347oArrM103103e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (c0347oArrM103103e.length > 0) {
            C0347o c0347o2 = c0347oArrM103103e[0];
            throw null;
        }
        int[] iArrM103102d = b9g0Var.m103102d();
        if (iArrM103102d == null) {
            iArrM103102d = f1606r;
        }
        if (c0347oArrM103103e.length > 0) {
            C0347o c0347o3 = c0347oArrM103103e[0];
            throw null;
        }
        int[] iArr2 = f1606r;
        int[] iArr3 = f1606r;
        int[] iArr4 = new int[iArrM103102d.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrM103102d, 0, iArr4, 0, iArrM103102d.length);
        System.arraycopy(iArr2, 0, iArr4, iArrM103102d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrM103102d.length + iArr2.length, iArr3.length);
        return new C0326d0<>(iArr, objArr, 0, 0, b9g0Var.mo103100b(), z, true, iArr4, iArrM103102d.length, iArrM103102d.length + iArr2.length, v130Var, abstractC0355w, abstractC0342l0, abstractC0343m, interfaceC0358z);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x027a  */
    /* JADX WARN: Code duplicated, block: B:126:0x027e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0298  */
    /* JADX WARN: Code duplicated, block: B:130:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0353  */
    /* JADX WARN: Code duplicated, block: B:180:0x039f  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a9  */
    /* JADX INFO: renamed from: T */
    public static <T> C0326d0<T> m1875T(nlc0 nlc0Var, v130 v130Var, AbstractC0355w abstractC0355w, AbstractC0342l0<?, ?> abstractC0342l0, AbstractC0343m<?> abstractC0343m, InterfaceC0358z interfaceC0358z) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        char cCharAt5;
        int i10;
        char cCharAt6;
        int i11;
        char cCharAt7;
        int i12;
        char cCharAt8;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iObjectFieldOffset;
        int i18;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        Field fieldM1883n0;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldM1883n1;
        int i25;
        Object obj2;
        Field fieldM1883n2;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        char cCharAt14;
        int i31 = 0;
        boolean z = nlc0Var.mo103101c() == ProtoSyntax.PROTO3;
        String strM163675e = nlc0Var.m163675e();
        int length = strM163675e.length();
        int iCharAt4 = strM163675e.charAt(0);
        if (iCharAt4 >= 55296) {
            int i32 = iCharAt4 & 8191;
            int i33 = 1;
            int i34 = 13;
            while (true) {
                i = i33 + 1;
                cCharAt14 = strM163675e.charAt(i33);
                if (cCharAt14 < 55296) {
                    break;
                }
                i32 |= (cCharAt14 & 8191) << i34;
                i34 += 13;
                i33 = i;
            }
            iCharAt4 = i32 | (cCharAt14 << i34);
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt5 = strM163675e.charAt(i);
        if (iCharAt5 >= 55296) {
            int i36 = iCharAt5 & 8191;
            int i37 = 13;
            while (true) {
                i30 = i35 + 1;
                cCharAt13 = strM163675e.charAt(i35);
                if (cCharAt13 < 55296) {
                    break;
                }
                i36 |= (cCharAt13 & 8191) << i37;
                i37 += 13;
                i35 = i30;
            }
            iCharAt5 = i36 | (cCharAt13 << i37);
            i35 = i30;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            i4 = 0;
            iCharAt2 = 0;
            i2 = 0;
            iCharAt3 = 0;
            iArr = f1606r;
            i3 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt6 = strM163675e.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    cCharAt8 = strM163675e.charAt(i38);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                iCharAt6 = i39 | (cCharAt8 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            int iCharAt7 = strM163675e.charAt(i38);
            if (iCharAt7 >= 55296) {
                int i42 = iCharAt7 & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    cCharAt7 = strM163675e.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                iCharAt7 = i42 | (cCharAt7 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            iCharAt = strM163675e.charAt(i41);
            if (iCharAt >= 55296) {
                int i45 = iCharAt & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    cCharAt6 = strM163675e.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                iCharAt = i45 | (cCharAt6 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            int iCharAt8 = strM163675e.charAt(i44);
            if (iCharAt8 >= 55296) {
                int i48 = iCharAt8 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    cCharAt5 = strM163675e.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                iCharAt8 = i48 | (cCharAt5 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int iCharAt9 = strM163675e.charAt(i47);
            if (iCharAt9 >= 55296) {
                int i51 = iCharAt9 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    cCharAt4 = strM163675e.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                iCharAt9 = i51 | (cCharAt4 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            iCharAt2 = strM163675e.charAt(i50);
            if (iCharAt2 >= 55296) {
                int i54 = iCharAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    cCharAt3 = strM163675e.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                iCharAt2 = i54 | (cCharAt3 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            int iCharAt10 = strM163675e.charAt(i53);
            if (iCharAt10 >= 55296) {
                int i57 = iCharAt10 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    cCharAt2 = strM163675e.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                iCharAt10 = i57 | (cCharAt2 << i58);
                i56 = i6;
            }
            int i59 = i56 + 1;
            iCharAt3 = strM163675e.charAt(i56);
            if (iCharAt3 >= 55296) {
                int i60 = iCharAt3 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i5 = i61 + 1;
                    cCharAt = strM163675e.charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i61 = i5;
                }
                iCharAt3 = i60 | (cCharAt << i62);
                i59 = i5;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt10];
            i2 = (iCharAt6 * 2) + iCharAt7;
            i3 = iCharAt8;
            i4 = iCharAt9;
            iArr = iArr2;
            i31 = iCharAt6;
            i35 = i59;
        }
        Unsafe unsafe = f1607s;
        Object[] objArrM163674d = nlc0Var.m163674d();
        Class<?> cls = nlc0Var.mo103100b().getClass();
        int[] iArr3 = new int[i4 * 3];
        Object[] objArr = new Object[i4 * 2];
        int i63 = iCharAt2 + iCharAt3;
        int i64 = i63;
        int i65 = iCharAt3;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt11 = strM163675e.charAt(i35);
            int i69 = length;
            if (iCharAt11 >= 55296) {
                int i70 = iCharAt11 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i29 = i71 + 1;
                    cCharAt12 = strM163675e.charAt(i71);
                    i13 = i31;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i29;
                    i31 = i13;
                }
                iCharAt11 = i70 | (cCharAt12 << i72);
                i14 = i29;
            } else {
                i13 = i31;
                i14 = i68;
            }
            int i73 = i14 + 1;
            int iCharAt12 = strM163675e.charAt(i14);
            if (iCharAt12 >= 55296) {
                int i74 = iCharAt12 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i27 = i75 + 1;
                    cCharAt11 = strM163675e.charAt(i75);
                    i28 = i74;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i74 = i28 | ((cCharAt11 & 8191) << i76);
                    i76 += 13;
                    i75 = i27;
                }
                iCharAt12 = i28 | (cCharAt11 << i76);
                i15 = i27;
            } else {
                i15 = i73;
            }
            int i77 = iCharAt4;
            int i78 = iCharAt12 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i79 = iCharAt11;
            if (i78 >= 51) {
                int i80 = i15 + 1;
                int iCharAt13 = strM163675e.charAt(i15);
                char c = 55296;
                if (iCharAt13 >= 55296) {
                    int i81 = iCharAt13 & 8191;
                    int i82 = 13;
                    while (true) {
                        i26 = i80 + 1;
                        cCharAt10 = strM163675e.charAt(i80);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i81 |= (cCharAt10 & 8191) << i82;
                        i82 += 13;
                        i80 = i26;
                        c = 55296;
                    }
                    iCharAt13 = i81 | (cCharAt10 << i82);
                    i80 = i26;
                }
                int i83 = i78 - 51;
                int i84 = iCharAt13;
                if (i83 == 9 || i83 == 17) {
                    i23 = i2 + 1;
                    objArr[((i67 / 3) * 2) + 1] = objArrM163674d[i2];
                } else {
                    if (i83 == 12 && (i77 & 1) == 1) {
                        i23 = i2 + 1;
                        objArr[((i67 / 3) * 2) + 1] = objArrM163674d[i2];
                    }
                    i24 = i84 * 2;
                    obj = objArrM163674d[i24];
                    if (obj instanceof Field) {
                        fieldM1883n1 = (Field) obj;
                    } else {
                        fieldM1883n1 = m1883n0(cls, (String) obj);
                        objArrM163674d[i24] = fieldM1883n1;
                    }
                    int i85 = i80;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM1883n1);
                    i25 = i24 + 1;
                    obj2 = objArrM163674d[i25];
                    if (obj2 instanceof Field) {
                        fieldM1883n2 = (Field) obj2;
                    } else {
                        fieldM1883n2 = m1883n0(cls, (String) obj2);
                        objArrM163674d[i25] = fieldM1883n2;
                    }
                    strM163675e = strM163675e;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM1883n2);
                    i35 = i85;
                    i21 = iObjectFieldOffset3;
                    i19 = 0;
                    i16 = i3;
                    i20 = i2;
                    iCharAt = iCharAt;
                }
                i2 = i23;
                i24 = i84 * 2;
                obj = objArrM163674d[i24];
                if (obj instanceof Field) {
                    fieldM1883n1 = (Field) obj;
                } else {
                    fieldM1883n1 = m1883n0(cls, (String) obj);
                    objArrM163674d[i24] = fieldM1883n1;
                }
                int i86 = i80;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM1883n1);
                i25 = i24 + 1;
                obj2 = objArrM163674d[i25];
                if (obj2 instanceof Field) {
                    fieldM1883n2 = (Field) obj2;
                } else {
                    fieldM1883n2 = m1883n0(cls, (String) obj2);
                    objArrM163674d[i25] = fieldM1883n2;
                }
                strM163675e = strM163675e;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM1883n2);
                i35 = i86;
                i21 = iObjectFieldOffset4;
                i19 = 0;
                i16 = i3;
                i20 = i2;
                iCharAt = iCharAt;
            } else {
                int i87 = i2 + 1;
                Field fieldM1883n3 = m1883n0(cls, (String) objArrM163674d[i2]);
                if (i78 == 9 || i78 == 17) {
                    i16 = i3;
                    objArr[((i67 / 3) * 2) + 1] = fieldM1883n3.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i16 = i3;
                        i22 = i2 + 2;
                        objArr[((i67 / 3) * 2) + 1] = objArrM163674d[i87];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i16 = i3;
                        if ((i77 & 1) == 1) {
                            i22 = i2 + 2;
                            objArr[((i67 / 3) * 2) + 1] = objArrM163674d[i87];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1883n3);
                        if ((i77 & 1) == 1 || i78 > 17) {
                            i18 = i15;
                            iObjectFieldOffset2 = 0;
                            i19 = 0;
                        } else {
                            int i88 = i15 + 1;
                            int iCharAt14 = strM163675e.charAt(i15);
                            if (iCharAt14 >= 55296) {
                                int i89 = iCharAt14 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i18 = i88 + 1;
                                    cCharAt9 = strM163675e.charAt(i88);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i89 |= (cCharAt9 & 8191) << i90;
                                    i90 += 13;
                                    i88 = i18;
                                }
                                iCharAt14 = i89 | (cCharAt9 << i90);
                            } else {
                                i18 = i88;
                            }
                            int i91 = (i13 * 2) + (iCharAt14 / 32);
                            Object obj3 = objArrM163674d[i91];
                            if (obj3 instanceof Field) {
                                fieldM1883n0 = (Field) obj3;
                            } else {
                                fieldM1883n0 = m1883n0(cls, (String) obj3);
                                objArrM163674d[i91] = fieldM1883n0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM1883n0);
                            i19 = iCharAt14 % 32;
                        }
                        if (i78 >= 18 && i78 <= 49) {
                            iArr[i64] = iObjectFieldOffset;
                            i64++;
                        }
                        i20 = i17;
                        i21 = iObjectFieldOffset;
                        i35 = i18;
                    } else {
                        if (i78 == 50) {
                            int i92 = i65 + 1;
                            iArr[i65] = i67;
                            int i93 = (i67 / 3) * 2;
                            int i94 = i2 + 2;
                            objArr[i93] = objArrM163674d[i87];
                            if ((iCharAt12 & 2048) != 0) {
                                i17 = i2 + 3;
                                objArr[i93 + 1] = objArrM163674d[i94];
                                i16 = i3;
                                i65 = i92;
                            } else {
                                i17 = i94;
                                i65 = i92;
                                i16 = i3;
                            }
                        } else {
                            i16 = i3;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1883n3);
                        if ((i77 & 1) == 1) {
                            i18 = i15;
                            iObjectFieldOffset2 = 0;
                            i19 = 0;
                        } else {
                            i18 = i15;
                            iObjectFieldOffset2 = 0;
                            i19 = 0;
                        }
                        if (i78 >= 18) {
                            iArr[i64] = iObjectFieldOffset;
                            i64++;
                        }
                        i20 = i17;
                        i21 = iObjectFieldOffset;
                        i35 = i18;
                    }
                    i17 = i22;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1883n3);
                    if ((i77 & 1) == 1) {
                        i18 = i15;
                        iObjectFieldOffset2 = 0;
                        i19 = 0;
                    } else {
                        i18 = i15;
                        iObjectFieldOffset2 = 0;
                        i19 = 0;
                    }
                    if (i78 >= 18) {
                        iArr[i64] = iObjectFieldOffset;
                        i64++;
                    }
                    i20 = i17;
                    i21 = iObjectFieldOffset;
                    i35 = i18;
                }
                i17 = i87;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1883n3);
                if ((i77 & 1) == 1) {
                    i18 = i15;
                    iObjectFieldOffset2 = 0;
                    i19 = 0;
                } else {
                    i18 = i15;
                    iObjectFieldOffset2 = 0;
                    i19 = 0;
                }
                if (i78 >= 18) {
                    iArr[i64] = iObjectFieldOffset;
                    i64++;
                }
                i20 = i17;
                i21 = iObjectFieldOffset;
                i35 = i18;
            }
            int i95 = i67 + 1;
            iArr4[i67] = i79;
            int i96 = i67 + 2;
            int i97 = iObjectFieldOffset2;
            iArr4[i95] = ((iCharAt12 & 512) != 0 ? 536870912 : 0) | ((iCharAt12 & 256) != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | (i78 << 20) | i21;
            i67 += 3;
            iArr4[i96] = (i19 << 20) | i97;
            iCharAt = iCharAt;
            iCharAt4 = i77;
            length = i69;
            iArr3 = iArr4;
            i31 = i13;
            strM163675e = strM163675e;
            i2 = i20;
            i3 = i16;
        }
        return new C0326d0<>(iArr3, objArr, iCharAt, i3, nlc0Var.mo103100b(), z, false, iArr, iCharAt3, i63, v130Var, abstractC0355w, abstractC0342l0, abstractC0343m, interfaceC0358z);
    }

    /* JADX INFO: renamed from: V */
    public static long m1876V(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: W */
    public static <T> boolean m1877W(T t, long j) {
        return ((Boolean) lyj0.m156299E(t, j)).booleanValue();
    }

    /* JADX INFO: renamed from: X */
    public static <T> double m1878X(T t, long j) {
        return ((Double) lyj0.m156299E(t, j)).doubleValue();
    }

    /* JADX INFO: renamed from: Y */
    public static <T> float m1879Y(T t, long j) {
        return ((Float) lyj0.m156299E(t, j)).floatValue();
    }

    /* JADX INFO: renamed from: Z */
    public static <T> int m1880Z(T t, long j) {
        return ((Integer) lyj0.m156299E(t, j)).intValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static <T> long m1881a0(T t, long j) {
        return ((Long) lyj0.m156299E(t, j)).longValue();
    }

    /* JADX INFO: renamed from: l */
    public static <T> boolean m1882l(T t, long j) {
        return lyj0.m156334r(t, j);
    }

    /* JADX INFO: renamed from: n0 */
    public static Field m1883n0(Class<?> cls, String str) {
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

    /* JADX INFO: renamed from: o */
    public static <T> double m1884o(T t, long j) {
        return lyj0.m156341y(t, j);
    }

    /* JADX INFO: renamed from: r0 */
    public static int m1885r0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: s */
    public static <T> float m1886s(T t, long j) {
        return lyj0.m156342z(t, j);
    }

    /* JADX INFO: renamed from: w */
    public static C0344m0 m1887w(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C0344m0 c0344m0 = generatedMessageLite.unknownFields;
        if (c0344m0 != C0344m0.m2262e()) {
            return c0344m0;
        }
        C0344m0 c0344m0M2266l = C0344m0.m2266l();
        generatedMessageLite.unknownFields = c0344m0M2266l;
        return c0344m0M2266l;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m1888C(T t, int i) {
        boolean zEquals;
        if (!this.f1615h) {
            int iM1916i0 = m1916i0(i);
            return (lyj0.m156295A(t, (long) (iM1916i0 & 1048575)) & (1 << (iM1916i0 >>> 20))) != 0;
        }
        int iM1931s0 = m1931s0(i);
        long jM1876V = m1876V(iM1931s0);
        switch (m1885r0(iM1931s0)) {
            case 0:
                return lyj0.m156341y(t, jM1876V) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            case 1:
                return lyj0.m156342z(t, jM1876V) != 0.0f;
            case 2:
                return lyj0.m156297C(t, jM1876V) != 0;
            case 3:
                return lyj0.m156297C(t, jM1876V) != 0;
            case 4:
                return lyj0.m156295A(t, jM1876V) != 0;
            case 5:
                return lyj0.m156297C(t, jM1876V) != 0;
            case 6:
                return lyj0.m156295A(t, jM1876V) != 0;
            case 7:
                return lyj0.m156334r(t, jM1876V);
            case 8:
                Object objM156299E = lyj0.m156299E(t, jM1876V);
                if (objM156299E instanceof String) {
                    zEquals = ((String) objM156299E).isEmpty();
                } else {
                    if (!(objM156299E instanceof ByteString)) {
                        fig0.m125680a();
                        return false;
                    }
                    zEquals = ByteString.EMPTY.equals(objM156299E);
                }
                break;
            case 9:
                return lyj0.m156299E(t, jM1876V) != null;
            case 10:
                zEquals = ByteString.EMPTY.equals(lyj0.m156299E(t, jM1876V));
                break;
            case 11:
                return lyj0.m156295A(t, jM1876V) != 0;
            case 12:
                return lyj0.m156295A(t, jM1876V) != 0;
            case 13:
                return lyj0.m156295A(t, jM1876V) != 0;
            case 14:
                return lyj0.m156297C(t, jM1876V) != 0;
            case 15:
                return lyj0.m156295A(t, jM1876V) != 0;
            case 16:
                return lyj0.m156297C(t, jM1876V) != 0;
            case 17:
                return lyj0.m156299E(t, jM1876V) != null;
            default:
                fig0.m125680a();
                return false;
        }
        return !zEquals;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m1889D(T t, int i, int i2, int i3) {
        if (this.f1615h) {
            return m1888C(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public final <N> boolean m1890F(Object obj, int i, int i2) {
        List list = (List) lyj0.m156299E(obj, m1876V(i));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC0336i0 interfaceC0336i0M1936v = m1936v(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!interfaceC0336i0M1936v.mo1901b(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.i0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: G */
    public final boolean m1891G(T t, int i, int i2) {
        Map<?, ?> mapMo1812g = this.f1624q.mo1812g(lyj0.m156299E(t, m1876V(i)));
        if (mapMo1812g.isEmpty()) {
            return true;
        }
        if (this.f1624q.mo1807b(m1934u(i2)).f1764c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? M129311d = 0;
        for (Object obj : mapMo1812g.values()) {
            if (M129311d == 0) {
                M129311d = M129311d;
                M129311d = g7b0.m129308a().m129311d(obj.getClass());
            }
            M129311d = M129311d;
            if (!M129311d.mo1901b(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m1892H(T t, T t2, int i) {
        long jM1916i0 = m1916i0(i) & 1048575;
        return lyj0.m156295A(t, jM1916i0) == lyj0.m156295A(t2, jM1916i0);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m1893I(T t, int i, int i2) {
        return lyj0.m156295A(t, (long) (m1916i0(i2) & 1048575)) == i;
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0601 A[LOOP:2: B:180:0x05fd->B:182:0x0601, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x0612 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #8 {all -> 0x004e, blocks: (B:19:0x0042, B:40:0x007c, B:58:0x00b1, B:175:0x05ef, B:177:0x05f5, B:186:0x0612, B:187:0x0617), top: B:218:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0623 A[LOOP:1: B:190:0x061f->B:192:0x0623, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x0639 A[LOOP:3: B:197:0x0635->B:199:0x0639, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x0646  */
    /* JADX WARN: Code duplicated, block: B:308:0x0610 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x05f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x061d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.l0<UT, UB>] */
    /* JADX INFO: renamed from: M */
    public final <UT, UB, ET extends C0348p.b<ET>> void m1894M(AbstractC0342l0<UT, UB> abstractC0342l0, AbstractC0343m<ET> abstractC0343m, T t, InterfaceC0334h0 interfaceC0334h0, C0341l c0341l) throws Throwable {
        int i;
        AbstractC0343m<ET> abstractC0343m2;
        Object objMo2251b;
        Object obj;
        int i2;
        int i3;
        T t2 = t;
        C0341l c0341l2 = c0341l;
        Object objM1928q = null;
        C0348p c0348pMo2253d = null;
        while (true) {
            try {
                int iMo1997o = interfaceC0334h0.mo1997o();
                int iM1912g0 = m1912g0(iMo1997o);
                if (iM1912g0 < 0) {
                    if (iMo1997o == Integer.MAX_VALUE) {
                        for (int i4 = this.f1618k; i4 < this.f1619l; i4++) {
                            objM1928q = m1928q(t2, this.f1617j[i4], objM1928q, abstractC0342l0);
                        }
                        if (objM1928q == null) {
                            return;
                        }
                    } else {
                        if (this.f1613f) {
                            abstractC0343m2 = abstractC0343m;
                            objMo2251b = abstractC0343m2.mo2251b(c0341l2, this.f1612e, iMo1997o);
                        } else {
                            abstractC0343m2 = abstractC0343m;
                            objMo2251b = null;
                        }
                        if (objMo2251b != null) {
                            if (c0348pMo2253d == null) {
                                try {
                                    c0348pMo2253d = abstractC0343m.mo2253d(t);
                                } catch (Throwable th) {
                                    th = th;
                                    for (i = this.f1618k; i < this.f1619l; i++) {
                                        objM1928q = m1928q(t2, this.f1617j[i], objM1928q, abstractC0342l0);
                                    }
                                    if (objM1928q != null) {
                                        abstractC0342l0.mo2244o(t2, objM1928q);
                                    }
                                    throw th;
                                }
                            }
                            C0348p c0348p = c0348pMo2253d;
                            objM1928q = abstractC0343m2.mo2256g(interfaceC0334h0, objMo2251b, c0341l2, c0348p, objM1928q, abstractC0342l0);
                            c0348pMo2253d = c0348p;
                        } else {
                            obj = objM1928q;
                            try {
                                if (abstractC0342l0.mo2246q(interfaceC0334h0)) {
                                    if (!interfaceC0334h0.mo2000r()) {
                                        objM1928q = obj;
                                    }
                                    objM1928q = obj;
                                } else {
                                    objM1928q = obj == null ? abstractC0342l0.mo2235f(t2) : obj;
                                    if (abstractC0342l0.m2242m(objM1928q, interfaceC0334h0)) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objM1928q = obj;
                                while (i < this.f1619l) {
                                    objM1928q = m1928q(t2, this.f1617j[i], objM1928q, abstractC0342l0);
                                }
                                if (objM1928q != null) {
                                    abstractC0342l0.mo2244o(t2, objM1928q);
                                }
                                throw th;
                            }
                        }
                    }
                    abstractC0342l0.mo2244o(t2, objM1928q);
                }
                InterfaceC0334h0 interfaceC0334h1 = interfaceC0334h0;
                obj = objM1928q;
                int iM1931s0 = m1931s0(iM1912g0);
                try {
                    switch (m1885r0(iM1931s0)) {
                        case 0:
                            lyj0.m156310P(t2, m1876V(iM1931s0), interfaceC0334h1.readDouble());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 1:
                            lyj0.m156311Q(t2, m1876V(iM1931s0), interfaceC0334h1.readFloat());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 2:
                            lyj0.m156313S(t2, m1876V(iM1931s0), interfaceC0334h1.mo2003u());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 3:
                            lyj0.m156313S(t2, m1876V(iM1931s0), interfaceC0334h1.mo1988j());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 4:
                            lyj0.m156312R(t2, m1876V(iM1931s0), interfaceC0334h1.mo1948D());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 5:
                            lyj0.m156313S(t2, m1876V(iM1931s0), interfaceC0334h1.mo2005w());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 6:
                            lyj0.m156312R(t2, m1876V(iM1931s0), interfaceC0334h1.mo1952H());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 7:
                            lyj0.m156304J(t2, m1876V(iM1931s0), interfaceC0334h1.mo2007y());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 8:
                            m1921l0(t2, iM1931s0, interfaceC0334h1);
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 9:
                            if (m1888C(t2, iM1912g0)) {
                                lyj0.m156314T(t2, m1876V(iM1931s0), C0351s.m2347h(lyj0.m156299E(t2, m1876V(iM1931s0)), interfaceC0334h1.mo2004v(m1936v(iM1912g0), c0341l2)));
                            } else {
                                lyj0.m156314T(t2, m1876V(iM1931s0), interfaceC0334h1.mo2004v(m1936v(iM1912g0), c0341l2));
                                m1925o0(t2, iM1912g0);
                            }
                            objM1928q = obj;
                            break;
                        case 10:
                            lyj0.m156314T(t2, m1876V(iM1931s0), interfaceC0334h1.mo1982g());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 11:
                            lyj0.m156312R(t2, m1876V(iM1931s0), interfaceC0334h1.mo1974c());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 12:
                            int iMo1976d = interfaceC0334h1.mo1976d();
                            C0351s.e eVarM1932t = m1932t(iM1912g0);
                            if (eVarM1932t == null || eVarM1932t.mo1620a(iMo1976d)) {
                                lyj0.m156312R(t2, m1876V(iM1931s0), iMo1976d);
                                m1925o0(t2, iM1912g0);
                                objM1928q = obj;
                            } else {
                                objM1928q = C0338j0.m2152L(iMo1997o, iMo1976d, obj, abstractC0342l0);
                            }
                            break;
                        case 13:
                            lyj0.m156312R(t2, m1876V(iM1931s0), interfaceC0334h1.mo1958N());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 14:
                            lyj0.m156313S(t2, m1876V(iM1931s0), interfaceC0334h1.mo1972b());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 15:
                            lyj0.m156312R(t2, m1876V(iM1931s0), interfaceC0334h1.mo1978e());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 16:
                            lyj0.m156313S(t2, m1876V(iM1931s0), interfaceC0334h1.mo1955K());
                            m1925o0(t2, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 17:
                            if (m1888C(t2, iM1912g0)) {
                                lyj0.m156314T(t2, m1876V(iM1931s0), C0351s.m2347h(lyj0.m156299E(t2, m1876V(iM1931s0)), interfaceC0334h1.mo1984h(m1936v(iM1912g0), c0341l2)));
                            } else {
                                lyj0.m156314T(t2, m1876V(iM1931s0), interfaceC0334h1.mo1984h(m1936v(iM1912g0), c0341l2));
                                m1925o0(t2, iM1912g0);
                            }
                            objM1928q = obj;
                            break;
                        case 18:
                            interfaceC0334h1.mo2002t(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            objM1928q = obj;
                            break;
                        case 19:
                            interfaceC0334h1.mo1999q(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            objM1928q = obj;
                            break;
                        case 20:
                            interfaceC0334h1.mo1945A(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            objM1928q = obj;
                            break;
                        case 21:
                            interfaceC0334h1.mo2008z(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            objM1928q = obj;
                            break;
                        case 22:
                            interfaceC0334h1.mo1994m(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            objM1928q = obj;
                            break;
                        case 23:
                            interfaceC0334h1.mo1950F(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            objM1928q = obj;
                            break;
                        case 24:
                            interfaceC0334h1.mo1996n(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            objM1928q = obj;
                            break;
                        case 25:
                            interfaceC0334h1.mo1980f(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            objM1928q = obj;
                            break;
                        case 26:
                            m1923m0(t2, iM1931s0, interfaceC0334h1);
                            objM1928q = obj;
                            break;
                        case 27:
                            T t3 = t2;
                            try {
                                m1920k0(t3, iM1931s0, interfaceC0334h1, m1936v(iM1912g0), c0341l);
                                t2 = t3;
                                c0341l2 = c0341l;
                                objM1928q = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                t2 = t3;
                                c0341l2 = c0341l;
                                objM1928q = obj;
                                if (!abstractC0342l0.mo2246q(interfaceC0334h1)) {
                                    if (objM1928q == null) {
                                        objM1928q = abstractC0342l0.mo2235f(t2);
                                    }
                                    if (!abstractC0342l0.m2242m(objM1928q, interfaceC0334h1)) {
                                        for (i3 = this.f1618k; i3 < this.f1619l; i3++) {
                                            objM1928q = m1928q(t2, this.f1617j[i3], objM1928q, abstractC0342l0);
                                        }
                                        if (objM1928q == null) {
                                            return;
                                        }
                                        abstractC0342l0.mo2244o(t2, objM1928q);
                                    }
                                } else if (!interfaceC0334h1.mo2000r()) {
                                    for (i2 = this.f1618k; i2 < this.f1619l; i2++) {
                                        objM1928q = m1928q(t2, this.f1617j[i2], objM1928q, abstractC0342l0);
                                    }
                                    if (objM1928q == null) {
                                        return;
                                    }
                                    abstractC0342l0.mo2244o(t2, objM1928q);
                                }
                            }
                            break;
                        case 28:
                            interfaceC0334h1.mo2001s(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 29:
                            interfaceC0334h1.mo1951G(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 30:
                            List<Integer> listMo2371e = this.f1621n.mo2371e(t2, m1876V(iM1931s0));
                            interfaceC0334h1.mo1946B(listMo2371e);
                            objM1928q = C0338j0.m2141A(iMo1997o, listMo2371e, m1932t(iM1912g0), obj, abstractC0342l0);
                            c0341l2 = c0341l;
                            break;
                        case 31:
                            interfaceC0334h1.mo2006x(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 32:
                            interfaceC0334h1.mo1992l(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 33:
                            interfaceC0334h1.mo1986i(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 34:
                            interfaceC0334h1.mo1970a(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 35:
                            interfaceC0334h1.mo2002t(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 36:
                            interfaceC0334h1.mo1999q(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 37:
                            interfaceC0334h1.mo1945A(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 38:
                            interfaceC0334h1.mo2008z(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 39:
                            interfaceC0334h1.mo1994m(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 40:
                            interfaceC0334h1.mo1950F(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 41:
                            interfaceC0334h1.mo1996n(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 42:
                            interfaceC0334h1.mo1980f(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 43:
                            interfaceC0334h1.mo1951G(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 44:
                            List<Integer> listMo2371e2 = this.f1621n.mo2371e(t2, m1876V(iM1931s0));
                            interfaceC0334h1.mo1946B(listMo2371e2);
                            objM1928q = C0338j0.m2141A(iMo1997o, listMo2371e2, m1932t(iM1912g0), obj, abstractC0342l0);
                            c0341l2 = c0341l;
                            break;
                        case 45:
                            interfaceC0334h1.mo2006x(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 46:
                            interfaceC0334h1.mo1992l(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 47:
                            interfaceC0334h1.mo1986i(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                            c0341l2 = c0341l;
                            objM1928q = obj;
                            break;
                        case 48:
                            try {
                                interfaceC0334h1.mo1970a(this.f1621n.mo2371e(t2, m1876V(iM1931s0)));
                                c0341l2 = c0341l;
                                objM1928q = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                c0341l2 = c0341l;
                                objM1928q = obj;
                                if (!abstractC0342l0.mo2246q(interfaceC0334h1)) {
                                    if (objM1928q == null) {
                                        objM1928q = abstractC0342l0.mo2235f(t2);
                                    }
                                    if (!abstractC0342l0.m2242m(objM1928q, interfaceC0334h1)) {
                                        while (i3 < this.f1619l) {
                                            objM1928q = m1928q(t2, this.f1617j[i3], objM1928q, abstractC0342l0);
                                        }
                                        if (objM1928q == null) {
                                            return;
                                        }
                                        abstractC0342l0.mo2244o(t2, objM1928q);
                                    }
                                } else if (!interfaceC0334h1.mo2000r()) {
                                    while (i2 < this.f1619l) {
                                        objM1928q = m1928q(t2, this.f1617j[i2], objM1928q, abstractC0342l0);
                                    }
                                    if (objM1928q == null) {
                                        return;
                                    }
                                    abstractC0342l0.mo2244o(t2, objM1928q);
                                }
                            }
                            break;
                        case 49:
                            try {
                                try {
                                    m1918j0(t, m1876V(iM1931s0), interfaceC0334h0, m1936v(iM1912g0), c0341l);
                                    t2 = t;
                                    c0341l2 = c0341l;
                                    objM1928q = obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    t2 = t;
                                    objM1928q = obj;
                                    while (i < this.f1619l) {
                                        objM1928q = m1928q(t2, this.f1617j[i], objM1928q, abstractC0342l0);
                                    }
                                    if (objM1928q != null) {
                                        abstractC0342l0.mo2244o(t2, objM1928q);
                                    }
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                t2 = t;
                                interfaceC0334h1 = interfaceC0334h0;
                                objM1928q = obj;
                                c0341l2 = c0341l;
                                if (!abstractC0342l0.mo2246q(interfaceC0334h1)) {
                                    if (objM1928q == null) {
                                        objM1928q = abstractC0342l0.mo2235f(t2);
                                    }
                                    if (!abstractC0342l0.m2242m(objM1928q, interfaceC0334h1)) {
                                        while (i3 < this.f1619l) {
                                            objM1928q = m1928q(t2, this.f1617j[i3], objM1928q, abstractC0342l0);
                                        }
                                        if (objM1928q == null) {
                                            return;
                                        }
                                        abstractC0342l0.mo2244o(t2, objM1928q);
                                    }
                                } else if (!interfaceC0334h1.mo2000r()) {
                                    while (i2 < this.f1619l) {
                                        objM1928q = m1928q(t2, this.f1617j[i2], objM1928q, abstractC0342l0);
                                    }
                                    if (objM1928q == null) {
                                        return;
                                    }
                                    abstractC0342l0.mo2244o(t2, objM1928q);
                                }
                            }
                            break;
                        case 50:
                            try {
                                m1895N(t2, iM1912g0, m1934u(iM1912g0), c0341l2, interfaceC0334h0);
                                t2 = t;
                                c0341l2 = c0341l;
                                objM1928q = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                t2 = t;
                                interfaceC0334h1 = interfaceC0334h0;
                                c0341l2 = c0341l;
                                objM1928q = obj;
                                if (!abstractC0342l0.mo2246q(interfaceC0334h1)) {
                                    if (objM1928q == null) {
                                        objM1928q = abstractC0342l0.mo2235f(t2);
                                    }
                                    if (!abstractC0342l0.m2242m(objM1928q, interfaceC0334h1)) {
                                        while (i3 < this.f1619l) {
                                            objM1928q = m1928q(t2, this.f1617j[i3], objM1928q, abstractC0342l0);
                                        }
                                        if (objM1928q == null) {
                                            return;
                                        }
                                        abstractC0342l0.mo2244o(t2, objM1928q);
                                    }
                                } else if (!interfaceC0334h1.mo2000r()) {
                                    while (i2 < this.f1619l) {
                                        objM1928q = m1928q(t2, this.f1617j[i2], objM1928q, abstractC0342l0);
                                    }
                                    if (objM1928q == null) {
                                        return;
                                    }
                                    abstractC0342l0.mo2244o(t2, objM1928q);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                t2 = t;
                                objM1928q = obj;
                                while (i < this.f1619l) {
                                    objM1928q = m1928q(t2, this.f1617j[i], objM1928q, abstractC0342l0);
                                }
                                if (objM1928q != null) {
                                    abstractC0342l0.mo2244o(t2, objM1928q);
                                }
                                throw th;
                            }
                            break;
                        case 51:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Double.valueOf(interfaceC0334h1.readDouble()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 52:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Float.valueOf(interfaceC0334h1.readFloat()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 53:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Long.valueOf(interfaceC0334h1.mo2003u()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 54:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Long.valueOf(interfaceC0334h1.mo1988j()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 55:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Integer.valueOf(interfaceC0334h1.mo1948D()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 56:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Long.valueOf(interfaceC0334h1.mo2005w()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 57:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Integer.valueOf(interfaceC0334h1.mo1952H()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 58:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Boolean.valueOf(interfaceC0334h1.mo2007y()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 59:
                            m1921l0(t2, iM1931s0, interfaceC0334h1);
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 60:
                            if (m1893I(t2, iMo1997o, iM1912g0)) {
                                lyj0.m156314T(t2, m1876V(iM1931s0), C0351s.m2347h(lyj0.m156299E(t2, m1876V(iM1931s0)), interfaceC0334h1.mo2004v(m1936v(iM1912g0), c0341l2)));
                            } else {
                                lyj0.m156314T(t2, m1876V(iM1931s0), interfaceC0334h1.mo2004v(m1936v(iM1912g0), c0341l2));
                                m1925o0(t2, iM1912g0);
                            }
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 61:
                            lyj0.m156314T(t2, m1876V(iM1931s0), interfaceC0334h1.mo1982g());
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 62:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Integer.valueOf(interfaceC0334h1.mo1974c()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 63:
                            int iMo1976d2 = interfaceC0334h1.mo1976d();
                            C0351s.e eVarM1932t2 = m1932t(iM1912g0);
                            if (eVarM1932t2 == null || eVarM1932t2.mo1620a(iMo1976d2)) {
                                lyj0.m156314T(t2, m1876V(iM1931s0), Integer.valueOf(iMo1976d2));
                                m1927p0(t2, iMo1997o, iM1912g0);
                                objM1928q = obj;
                            } else {
                                objM1928q = C0338j0.m2152L(iMo1997o, iMo1976d2, obj, abstractC0342l0);
                            }
                            break;
                        case 64:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Integer.valueOf(interfaceC0334h1.mo1958N()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 65:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Long.valueOf(interfaceC0334h1.mo1972b()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 66:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Integer.valueOf(interfaceC0334h1.mo1978e()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 67:
                            lyj0.m156314T(t2, m1876V(iM1931s0), Long.valueOf(interfaceC0334h1.mo1955K()));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        case 68:
                            lyj0.m156314T(t2, m1876V(iM1931s0), interfaceC0334h1.mo1984h(m1936v(iM1912g0), c0341l2));
                            m1927p0(t2, iMo1997o, iM1912g0);
                            objM1928q = obj;
                            break;
                        default:
                            objM1928q = obj == null ? abstractC0342l0.mo2243n() : obj;
                            try {
                                if (!abstractC0342l0.m2242m(objM1928q, interfaceC0334h1)) {
                                    for (int i5 = this.f1618k; i5 < this.f1619l; i5++) {
                                        objM1928q = m1928q(t2, this.f1617j[i5], objM1928q, abstractC0342l0);
                                    }
                                    if (objM1928q == null) {
                                        return;
                                    }
                                    abstractC0342l0.mo2244o(t2, objM1928q);
                                }
                                break;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                if (!abstractC0342l0.mo2246q(interfaceC0334h1)) {
                                    if (objM1928q == null) {
                                        objM1928q = abstractC0342l0.mo2235f(t2);
                                    }
                                    if (!abstractC0342l0.m2242m(objM1928q, interfaceC0334h1)) {
                                        while (i3 < this.f1619l) {
                                            objM1928q = m1928q(t2, this.f1617j[i3], objM1928q, abstractC0342l0);
                                        }
                                        if (objM1928q == null) {
                                            return;
                                        }
                                        abstractC0342l0.mo2244o(t2, objM1928q);
                                    }
                                } else if (!interfaceC0334h1.mo2000r()) {
                                    while (i2 < this.f1619l) {
                                        objM1928q = m1928q(t2, this.f1617j[i2], objM1928q, abstractC0342l0);
                                    }
                                    if (objM1928q == null) {
                                        return;
                                    }
                                    abstractC0342l0.mo2244o(t2, objM1928q);
                                }
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        for (int i6 = this.f1618k; i6 < this.f1619l; i6++) {
            objM1928q = m1928q(t2, this.f1617j[i6], objM1928q, abstractC0342l0);
        }
        if (objM1928q == null) {
            return;
        }
        abstractC0342l0.mo2244o(t2, objM1928q);
    }

    /* JADX INFO: renamed from: N */
    public final <K, V> void m1895N(Object obj, int i, Object obj2, C0341l c0341l, InterfaceC0334h0 interfaceC0334h0) throws IOException {
        long jM1876V = m1876V(m1931s0(i));
        Object objM156299E = lyj0.m156299E(obj, jM1876V);
        InterfaceC0358z interfaceC0358z = this.f1624q;
        if (objM156299E == null) {
            objM156299E = interfaceC0358z.mo1811f(obj2);
            lyj0.m156314T(obj, jM1876V, objM156299E);
        } else if (interfaceC0358z.mo1813h(objM156299E)) {
            Object objMo1811f = this.f1624q.mo1811f(obj2);
            this.f1624q.mo1806a(objMo1811f, objM156299E);
            lyj0.m156314T(obj, jM1876V, objMo1811f);
            objM156299E = objMo1811f;
        }
        interfaceC0334h0.mo1954J(this.f1624q.mo1810e(objM156299E), this.f1624q.mo1807b(obj2), c0341l);
    }

    /* JADX INFO: renamed from: O */
    public final void m1896O(T t, T t2, int i) {
        long jM1876V = m1876V(m1931s0(i));
        if (m1888C(t2, i)) {
            Object objM156299E = lyj0.m156299E(t, jM1876V);
            Object objM156299E2 = lyj0.m156299E(t2, jM1876V);
            if (objM156299E != null && objM156299E2 != null) {
                lyj0.m156314T(t, jM1876V, C0351s.m2347h(objM156299E, objM156299E2));
                m1925o0(t, i);
            } else if (objM156299E2 != null) {
                lyj0.m156314T(t, jM1876V, objM156299E2);
                m1925o0(t, i);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m1897P(T t, T t2, int i) {
        int iM1931s0 = m1931s0(i);
        int iM1899U = m1899U(i);
        long jM1876V = m1876V(iM1931s0);
        if (m1893I(t2, iM1899U, i)) {
            Object objM156299E = lyj0.m156299E(t, jM1876V);
            Object objM156299E2 = lyj0.m156299E(t2, jM1876V);
            if (objM156299E != null && objM156299E2 != null) {
                lyj0.m156314T(t, jM1876V, C0351s.m2347h(objM156299E, objM156299E2));
                m1927p0(t, iM1899U, i);
            } else if (objM156299E2 != null) {
                lyj0.m156314T(t, jM1876V, objM156299E2);
                m1927p0(t, iM1899U, i);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m1898Q(T t, T t2, int i) {
        int iM1931s0 = m1931s0(i);
        long jM1876V = m1876V(iM1931s0);
        int iM1899U = m1899U(i);
        switch (m1885r0(iM1931s0)) {
            case 0:
                if (m1888C(t2, i)) {
                    lyj0.m156310P(t, jM1876V, lyj0.m156341y(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 1:
                if (m1888C(t2, i)) {
                    lyj0.m156311Q(t, jM1876V, lyj0.m156342z(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 2:
                if (m1888C(t2, i)) {
                    lyj0.m156313S(t, jM1876V, lyj0.m156297C(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 3:
                if (m1888C(t2, i)) {
                    lyj0.m156313S(t, jM1876V, lyj0.m156297C(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 4:
                if (m1888C(t2, i)) {
                    lyj0.m156312R(t, jM1876V, lyj0.m156295A(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 5:
                if (m1888C(t2, i)) {
                    lyj0.m156313S(t, jM1876V, lyj0.m156297C(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 6:
                if (m1888C(t2, i)) {
                    lyj0.m156312R(t, jM1876V, lyj0.m156295A(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 7:
                if (m1888C(t2, i)) {
                    lyj0.m156304J(t, jM1876V, lyj0.m156334r(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 8:
                if (m1888C(t2, i)) {
                    lyj0.m156314T(t, jM1876V, lyj0.m156299E(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 9:
                m1896O(t, t2, i);
                break;
            case 10:
                if (m1888C(t2, i)) {
                    lyj0.m156314T(t, jM1876V, lyj0.m156299E(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 11:
                if (m1888C(t2, i)) {
                    lyj0.m156312R(t, jM1876V, lyj0.m156295A(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 12:
                if (m1888C(t2, i)) {
                    lyj0.m156312R(t, jM1876V, lyj0.m156295A(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 13:
                if (m1888C(t2, i)) {
                    lyj0.m156312R(t, jM1876V, lyj0.m156295A(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 14:
                if (m1888C(t2, i)) {
                    lyj0.m156313S(t, jM1876V, lyj0.m156297C(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 15:
                if (m1888C(t2, i)) {
                    lyj0.m156312R(t, jM1876V, lyj0.m156295A(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 16:
                if (m1888C(t2, i)) {
                    lyj0.m156313S(t, jM1876V, lyj0.m156297C(t2, jM1876V));
                    m1925o0(t, i);
                }
                break;
            case 17:
                m1896O(t, t2, i);
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
                this.f1621n.mo2370d(t, t2, jM1876V);
                break;
            case 50:
                C0338j0.m2146F(this.f1624q, t, t2, jM1876V);
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
                if (m1893I(t2, iM1899U, i)) {
                    lyj0.m156314T(t, jM1876V, lyj0.m156299E(t2, jM1876V));
                    m1927p0(t, iM1899U, i);
                }
                break;
            case 60:
                m1897P(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m1893I(t2, iM1899U, i)) {
                    lyj0.m156314T(t, jM1876V, lyj0.m156299E(t2, jM1876V));
                    m1927p0(t, iM1899U, i);
                }
                break;
            case 68:
                m1897P(t, t2, i);
                break;
        }
    }

    /* JADX INFO: renamed from: U */
    public final int m1899U(int i) {
        return this.f1608a[i];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: a */
    public void mo1900a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f1608a.length; i += 3) {
            m1898Q(t, t2, i);
        }
        if (this.f1615h) {
            return;
        }
        C0338j0.m2147G(this.f1622o, t, t2);
        if (this.f1613f) {
            C0338j0.m2145E(this.f1623p, t, t2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:58:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0090 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: b */
    public final boolean mo1901b(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f1618k; i4++) {
            int i5 = this.f1617j[i4];
            int iM1899U = m1899U(i5);
            int iM1931s0 = m1931s0(i5);
            if (this.f1615h) {
                i = 0;
            } else {
                int i6 = this.f1608a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = f1607s.getInt(t, i7);
                    i2 = i7;
                }
            }
            if (m1870J(iM1931s0) && !m1889D(t, i5, i3, i)) {
                return false;
            }
            int iM1885r0 = m1885r0(iM1931s0);
            if (iM1885r0 == 9 || iM1885r0 == 17) {
                if (m1889D(t, i5, i3, i) && !m1869E(t, iM1931s0, m1936v(i5))) {
                    return false;
                }
            } else if (iM1885r0 == 27) {
                if (!m1890F(t, iM1931s0, i5)) {
                    return false;
                }
            } else if (iM1885r0 == 60 || iM1885r0 == 68) {
                if (m1893I(t, iM1899U, i5) && !m1869E(t, iM1931s0, m1936v(i5))) {
                    return false;
                }
            } else if (iM1885r0 != 49) {
                if (iM1885r0 == 50 && !m1891G(t, iM1931s0, i5)) {
                    return false;
                }
            } else if (!m1890F(t, iM1931s0, i5)) {
                return false;
            }
        }
        return !this.f1613f || this.f1623p.mo2252c(t).m2313p();
    }

    /* JADX INFO: renamed from: b0 */
    public final <K, V> int m1902b0(T t, byte[] bArr, int i, int i2, int i3, long j, C0325d.b bVar) throws IOException {
        Unsafe unsafe = f1607s;
        Object objM1934u = m1934u(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f1624q.mo1813h(object)) {
            Object objMo1811f = this.f1624q.mo1811f(objM1934u);
            this.f1624q.mo1806a(objMo1811f, object);
            unsafe.putObject(t, j, objMo1811f);
            object = objMo1811f;
        }
        return m1922m(bArr, i, i2, this.f1624q.mo1807b(objM1934u), this.f1624q.mo1810e(object), bVar);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: c */
    public void mo1903c(T t, Writer writer) throws IOException {
        if (writer.mo1756G() == Writer.FieldOrder.DESCENDING) {
            m1937v0(t, writer);
        } else if (this.f1615h) {
            m1935u0(t, writer);
        } else {
            m1933t0(t, writer);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final int m1904c0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C0325d.b bVar) throws IOException {
        Object object;
        Unsafe unsafe = f1607s;
        long j2 = this.f1608a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(C0325d.m1844d(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(C0325d.m1852l(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM1838L = C0325d.m1838L(bArr, i, bVar);
                unsafe.putObject(t, j, Long.valueOf(bVar.f1603b));
                unsafe.putInt(t, j2, i4);
                return iM1838L;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iM1835I = C0325d.m1835I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(bVar.f1602a));
                unsafe.putInt(t, j2, i4);
                return iM1835I;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(C0325d.m1850j(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(C0325d.m1848h(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM1838L2 = C0325d.m1838L(bArr, i, bVar);
                unsafe.putObject(t, j, Boolean.valueOf(bVar.f1603b != 0));
                unsafe.putInt(t, j2, i4);
                return iM1838L2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM1835I2 = C0325d.m1835I(bArr, i, bVar);
                int i13 = bVar.f1602a;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !Utf8.m1705t(bArr, iM1835I2, iM1835I2 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, iM1835I2, i13, C0351s.f1737a));
                    iM1835I2 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return iM1835I2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iM1856p = C0325d.m1856p(m1936v(i8), bArr, i, i2, bVar);
                object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, bVar.f1604c);
                } else {
                    unsafe.putObject(t, j, C0351s.m2347h(object, bVar.f1604c));
                }
                unsafe.putInt(t, j2, i4);
                return iM1856p;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iM1842b = C0325d.m1842b(bArr, i, bVar);
                unsafe.putObject(t, j, bVar.f1604c);
                unsafe.putInt(t, j2, i4);
                return iM1842b;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iM1835I3 = C0325d.m1835I(bArr, i, bVar);
                int i14 = bVar.f1602a;
                C0351s.e eVarM1932t = m1932t(i8);
                if (eVarM1932t != null && !eVarM1932t.mo1620a(i14)) {
                    m1887w(t).m2274n(i3, Long.valueOf(i14));
                    return iM1835I3;
                }
                unsafe.putObject(t, j, Integer.valueOf(i14));
                unsafe.putInt(t, j2, i4);
                return iM1835I3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iM1835I4 = C0325d.m1835I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(AbstractC0331g.m2028b(bVar.f1602a)));
                unsafe.putInt(t, j2, i4);
                return iM1835I4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM1838L3 = C0325d.m1838L(bArr, i, bVar);
                unsafe.putObject(t, j, Long.valueOf(AbstractC0331g.m2029c(bVar.f1603b)));
                unsafe.putInt(t, j2, i4);
                return iM1838L3;
            case 68:
                if (i5 == 3) {
                    int iM1854n = C0325d.m1854n(m1936v(i8), bArr, i, i2, (i3 & (-8)) | 4, bVar);
                    object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, bVar.f1604c);
                    } else {
                        unsafe.putObject(t, j, C0351s.m2347h(object, bVar.f1604c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iM1854n;
                }
                break;
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: d */
    public boolean mo1905d(T t, T t2) {
        int length = this.f1608a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m1926p(t, t2, i)) {
                return false;
            }
        }
        if (!this.f1622o.mo2236g(t).equals(this.f1622o.mo2236g(t2))) {
            return false;
        }
        if (this.f1613f) {
            return this.f1623p.mo2252c(t).equals(this.f1623p.mo2252c(t2));
        }
        return true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: d0 */
    public int m1906d0(T r29, byte[] r30, int r31, int r32, int r33, androidx.datastore.preferences.protobuf.C0325d.b r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0326d0.m1906d0(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.d$b):int");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: e */
    public void mo1907e(T t, InterfaceC0334h0 interfaceC0334h0, C0341l c0341l) throws Throwable {
        c0341l.getClass();
        m1894M(this.f1622o, this.f1623p, t, interfaceC0334h0, c0341l);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0053. Please report as an issue. */
    /* JADX INFO: renamed from: e0 */
    public final int m1908e0(T t, byte[] bArr, int i, int i2, C0325d.b bVar) throws IOException {
        Unsafe unsafe;
        int i3;
        int i4;
        Unsafe unsafe2;
        int iM1838L;
        int i5;
        int i6;
        int i7;
        this = this;
        bArr = bArr;
        i2 = i2;
        bVar = bVar;
        Unsafe unsafe3 = f1607s;
        int i8 = -1;
        int iM1833G = i;
        int i9 = -1;
        int i10 = 0;
        while (iM1833G < i2) {
            int iM1834H = iM1833G + 1;
            int i11 = bArr[iM1833G];
            if (i11 < 0) {
                iM1834H = C0325d.m1834H(i11, bArr, iM1834H, bVar);
                i11 = bVar.f1602a;
            }
            int i12 = iM1834H;
            int i13 = i11;
            int i14 = (i13 == true ? 1 : 0) >>> 3;
            int i15 = (i13 == true ? 1 : 0) & 7;
            int iM1914h0 = i14 > i9 ? this.m1914h0(i14, i10 / 3) : this.m1912g0(i14);
            if (iM1914h0 == i8) {
                unsafe = unsafe3;
                i3 = i12;
                i4 = i14;
                iM1914h0 = 0;
            } else {
                int i16 = this.f1608a[iM1914h0 + 1];
                int iM1885r0 = m1885r0(i16);
                long jM1876V = m1876V(i16);
                if (iM1885r0 <= 17) {
                    switch (iM1885r0) {
                        case 0:
                            i13 = i13 == true ? 1 : 0;
                            if (i15 == 1) {
                                lyj0.m156310P(t, jM1876V, C0325d.m1844d(bArr, i12));
                                iM1833G = i12 + 8;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe3;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 1:
                            i13 = i13 == true ? 1 : 0;
                            if (i15 == 5) {
                                lyj0.m156311Q(t, jM1876V, C0325d.m1852l(bArr, i12));
                                iM1833G = i12 + 4;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe3;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 2:
                        case 3:
                            unsafe2 = unsafe3;
                            if (i15 != 0) {
                                unsafe = unsafe2;
                                i5 = i12;
                                i6 = i14;
                                i7 = i13;
                                i3 = i5;
                                i4 = i6;
                                i13 = i7;
                            } else {
                                iM1838L = C0325d.m1838L(bArr, i12, bVar);
                                unsafe3 = unsafe2;
                                unsafe3.putLong(t, jM1876V, bVar.f1603b);
                                iM1833G = iM1838L;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            break;
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i15 == 0) {
                                iM1833G = C0325d.m1835I(bArr, i12, bVar);
                                unsafe2.putInt(t, jM1876V, bVar.f1602a);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe2;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i15 == 1) {
                                unsafe2.putLong(t, jM1876V, C0325d.m1850j(bArr, i12));
                                unsafe2 = unsafe2;
                                iM1833G = i12 + 8;
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe2;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i15 == 5) {
                                unsafe2.putInt(t, jM1876V, C0325d.m1848h(bArr, i12));
                                iM1833G = i12 + 4;
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe2;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 7:
                            unsafe2 = unsafe3;
                            if (i15 == 0) {
                                iM1833G = C0325d.m1838L(bArr, i12, bVar);
                                lyj0.m156304J(t, jM1876V, bVar.f1603b != 0);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe2;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 8:
                            unsafe2 = unsafe3;
                            if (i15 == 2) {
                                iM1833G = (536870912 & i16) == 0 ? C0325d.m1829C(bArr, i12, bVar) : C0325d.m1832F(bArr, i12, bVar);
                                unsafe2.putObject(t, jM1876V, bVar.f1604c);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe2;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 9:
                            unsafe2 = unsafe3;
                            if (i15 == 2) {
                                iM1833G = C0325d.m1856p(this.m1936v(iM1914h0), bArr, i12, i2, bVar);
                                Object object = unsafe2.getObject(t, jM1876V);
                                if (object == null) {
                                    unsafe2.putObject(t, jM1876V, bVar.f1604c);
                                } else {
                                    unsafe2.putObject(t, jM1876V, C0351s.m2347h(object, bVar.f1604c));
                                }
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe2;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 10:
                            unsafe2 = unsafe3;
                            if (i15 == 2) {
                                iM1833G = C0325d.m1842b(bArr, i12, bVar);
                                unsafe2.putObject(t, jM1876V, bVar.f1604c);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe2;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 12:
                            unsafe2 = unsafe3;
                            if (i15 == 0) {
                                iM1833G = C0325d.m1835I(bArr, i12, bVar);
                                unsafe2.putInt(t, jM1876V, bVar.f1602a);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe2;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13 == true ? 1 : 0;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 15:
                            unsafe2 = unsafe3;
                            if (i15 == 0) {
                                iM1833G = C0325d.m1835I(bArr, i12, bVar);
                                unsafe2.putInt(t, jM1876V, AbstractC0331g.m2028b(bVar.f1602a));
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            unsafe = unsafe2;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13 == true ? 1 : 0;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                        case 16:
                            if (i15 != 0) {
                                unsafe2 = unsafe3;
                                unsafe = unsafe2;
                                i5 = i12;
                                i6 = i14;
                                i7 = i13 == true ? 1 : 0;
                                i3 = i5;
                                i4 = i6;
                                i13 = i7;
                            } else {
                                iM1838L = C0325d.m1838L(bArr, i12, bVar);
                                unsafe3.putLong(t, jM1876V, AbstractC0331g.m2029c(bVar.f1603b));
                                unsafe3 = unsafe3;
                                iM1833G = iM1838L;
                                i9 = i14;
                                i10 = iM1914h0;
                            }
                            break;
                        default:
                            unsafe = unsafe3;
                            i5 = i12;
                            i6 = i14;
                            i7 = i13 == true ? 1 : 0;
                            i3 = i5;
                            i4 = i6;
                            i13 = i7;
                            break;
                    }
                    i8 = -1;
                } else {
                    i13 = i13 == true ? 1 : 0;
                    if (iM1885r0 != 27) {
                        unsafe = unsafe3;
                        if (iM1885r0 <= 49) {
                            int iM1910f0 = this.m1910f0(t, bArr, i12, i2, i13 == true ? 1 : 0, i14, i15, iM1914h0, i16, iM1885r0, jM1876V, bVar);
                            i7 = i13 == true ? 1 : 0;
                            i6 = i14;
                            if (iM1910f0 != i12) {
                                iM1914h0 = iM1914h0;
                                iM1833G = iM1910f0;
                                i9 = i6;
                                i10 = iM1914h0;
                                unsafe3 = unsafe;
                                i8 = -1;
                                bArr = bArr;
                            } else {
                                iM1914h0 = iM1914h0;
                                i3 = iM1910f0;
                                i4 = i6;
                                i13 = i7;
                            }
                        } else {
                            i6 = i14;
                            i7 = i13 == true ? 1 : 0;
                            i5 = i12;
                            if (iM1885r0 == 50) {
                                if (i15 == 2) {
                                    int iM1902b0 = m1902b0(t, bArr, i5, i2, iM1914h0, jM1876V, bVar);
                                    if (iM1902b0 != i5) {
                                        this = this;
                                        i2 = i2;
                                        iM1833G = iM1902b0;
                                        i9 = i6;
                                    } else {
                                        i3 = iM1902b0;
                                    }
                                } else {
                                    i3 = i5;
                                }
                                i4 = i6;
                                i13 = i7;
                            } else {
                                i4 = i6;
                                i13 = i7 == true ? 1 : 0;
                                int iM1904c0 = m1904c0(t, bArr, i5, i2, i13 == true ? 1 : 0, i4, i15, i16, iM1885r0, jM1876V, iM1914h0, bVar);
                                if (iM1904c0 != i5) {
                                    i9 = i4;
                                    iM1833G = iM1904c0;
                                    i10 = iM1914h0;
                                    unsafe3 = unsafe;
                                    i8 = -1;
                                    bArr = bArr;
                                } else {
                                    i3 = iM1904c0;
                                }
                            }
                        }
                    } else if (i15 == 2) {
                        C0351s.i iVarMo2015d = (C0351s.i) unsafe3.getObject(t, jM1876V);
                        if (!iVarMo2015d.mo1821q()) {
                            int size = iVarMo2015d.size();
                            iVarMo2015d = iVarMo2015d.mo2015d(size == 0 ? 10 : size * 2);
                            unsafe3.putObject(t, jM1876V, iVarMo2015d);
                        }
                        unsafe = unsafe3;
                        iM1833G = C0325d.m1857q(this.m1936v(iM1914h0), i13 == true ? 1 : 0, bArr, i12, i2, iVarMo2015d, bVar);
                        i2 = i2;
                        i9 = i14;
                    } else {
                        unsafe = unsafe3;
                        i5 = i12;
                        i6 = i14;
                        i7 = i13;
                        i3 = i5;
                        i4 = i6;
                        i13 = i7;
                    }
                    i10 = iM1914h0;
                    unsafe3 = unsafe;
                    i8 = -1;
                }
            }
            iM1833G = C0325d.m1833G(i13 == true ? 1 : 0, bArr, i3, i2, m1887w(t), bVar);
            this = this;
            i2 = i2;
            i9 = i4;
            i10 = iM1914h0;
            unsafe3 = unsafe;
            i8 = -1;
        }
        if (iM1833G == i2) {
            return iM1833G;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: f */
    public void mo1909f(T t) {
        int i;
        int[] iArr;
        int i2 = this.f1618k;
        while (true) {
            i = this.f1619l;
            iArr = this.f1617j;
            if (i2 >= i) {
                break;
            }
            long jM1876V = m1876V(m1931s0(iArr[i2]));
            Object objM156299E = lyj0.m156299E(t, jM1876V);
            if (objM156299E != null) {
                lyj0.m156314T(t, jM1876V, this.f1624q.mo1808c(objM156299E));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f1621n.mo2369c(t, this.f1617j[i]);
            i++;
        }
        this.f1622o.mo2239j(t);
        if (this.f1613f) {
            this.f1623p.mo2255f(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public final int m1910f0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C0325d.b bVar) throws IOException {
        int iM1836J;
        Unsafe unsafe = f1607s;
        C0351s.i iVarMo2015d = (C0351s.i) unsafe.getObject(t, j2);
        if (!iVarMo2015d.mo1821q()) {
            int size = iVarMo2015d.size();
            iVarMo2015d = iVarMo2015d.mo2015d(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, iVarMo2015d);
        }
        C0351s.i iVar = iVarMo2015d;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return C0325d.m1859s(bArr, i, iVar, bVar);
                }
                if (i5 == 1) {
                    return C0325d.m1845e(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return C0325d.m1862v(bArr, i, iVar, bVar);
                }
                if (i5 == 5) {
                    return C0325d.m1853m(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return C0325d.m1866z(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0325d.m1839M(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C0325d.m1865y(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0325d.m1836J(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return C0325d.m1861u(bArr, i, iVar, bVar);
                }
                if (i5 == 1) {
                    return C0325d.m1851k(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return C0325d.m1860t(bArr, i, iVar, bVar);
                }
                if (i5 == 5) {
                    return C0325d.m1849i(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return C0325d.m1858r(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0325d.m1841a(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? C0325d.m1830D(i3, bArr, i, i2, iVar, bVar) : C0325d.m1831E(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return C0325d.m1857q(m1936v(i6), i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return C0325d.m1843c(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iM1836J = C0325d.m1836J(i3, bArr, i, i2, iVar, bVar);
                    }
                    return i;
                }
                iM1836J = C0325d.m1865y(bArr, i, iVar, bVar);
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                C0344m0 c0344m0 = generatedMessageLite.unknownFields;
                if (c0344m0 == C0344m0.m2262e()) {
                    c0344m0 = null;
                }
                C0344m0 c0344m1 = (C0344m0) C0338j0.m2141A(i4, iVar, m1932t(i6), c0344m0, this.f1622o);
                if (c0344m1 != null) {
                    generatedMessageLite.unknownFields = c0344m1;
                }
                return iM1836J;
            case 33:
            case 47:
                if (i5 == 2) {
                    return C0325d.m1863w(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0325d.m1827A(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return C0325d.m1864x(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0325d.m1828B(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return C0325d.m1855o(m1936v(i6), i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            default:
                return i;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: g */
    public int mo1911g(T t) {
        return this.f1615h ? m1941y(t) : m1939x(t);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m1912g0(int i) {
        if (i < this.f1610c || i > this.f1611d) {
            return -1;
        }
        return m1929q0(i, 0);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: h */
    public T mo1913h() {
        return (T) this.f1620m.mo2027a(this.f1612e);
    }

    /* JADX INFO: renamed from: h0 */
    public final int m1914h0(int i, int i2) {
        if (i < this.f1610c || i > this.f1611d) {
            return -1;
        }
        return m1929q0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: i */
    public int mo1915i(T t) {
        int i;
        int iM2345f;
        int length = this.f1608a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iM1931s0 = m1931s0(i3);
            int iM1899U = m1899U(i3);
            long jM1876V = m1876V(iM1931s0);
            int iHashCode = 37;
            switch (m1885r0(iM1931s0)) {
                case 0:
                    i = i2 * 53;
                    iM2345f = C0351s.m2345f(Double.doubleToLongBits(lyj0.m156341y(t, jM1876V)));
                    i2 = i + iM2345f;
                    break;
                case 1:
                    i = i2 * 53;
                    iM2345f = Float.floatToIntBits(lyj0.m156342z(t, jM1876V));
                    i2 = i + iM2345f;
                    break;
                case 2:
                    i = i2 * 53;
                    iM2345f = C0351s.m2345f(lyj0.m156297C(t, jM1876V));
                    i2 = i + iM2345f;
                    break;
                case 3:
                    i = i2 * 53;
                    iM2345f = C0351s.m2345f(lyj0.m156297C(t, jM1876V));
                    i2 = i + iM2345f;
                    break;
                case 4:
                    i = i2 * 53;
                    iM2345f = lyj0.m156295A(t, jM1876V);
                    i2 = i + iM2345f;
                    break;
                case 5:
                    i = i2 * 53;
                    iM2345f = C0351s.m2345f(lyj0.m156297C(t, jM1876V));
                    i2 = i + iM2345f;
                    break;
                case 6:
                    i = i2 * 53;
                    iM2345f = lyj0.m156295A(t, jM1876V);
                    i2 = i + iM2345f;
                    break;
                case 7:
                    i = i2 * 53;
                    iM2345f = C0351s.m2342c(lyj0.m156334r(t, jM1876V));
                    i2 = i + iM2345f;
                    break;
                case 8:
                    i = i2 * 53;
                    iM2345f = ((String) lyj0.m156299E(t, jM1876V)).hashCode();
                    i2 = i + iM2345f;
                    break;
                case 9:
                    Object objM156299E = lyj0.m156299E(t, jM1876V);
                    if (objM156299E != null) {
                        iHashCode = objM156299E.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iM2345f = lyj0.m156299E(t, jM1876V).hashCode();
                    i2 = i + iM2345f;
                    break;
                case 11:
                    i = i2 * 53;
                    iM2345f = lyj0.m156295A(t, jM1876V);
                    i2 = i + iM2345f;
                    break;
                case 12:
                    i = i2 * 53;
                    iM2345f = lyj0.m156295A(t, jM1876V);
                    i2 = i + iM2345f;
                    break;
                case 13:
                    i = i2 * 53;
                    iM2345f = lyj0.m156295A(t, jM1876V);
                    i2 = i + iM2345f;
                    break;
                case 14:
                    i = i2 * 53;
                    iM2345f = C0351s.m2345f(lyj0.m156297C(t, jM1876V));
                    i2 = i + iM2345f;
                    break;
                case 15:
                    i = i2 * 53;
                    iM2345f = lyj0.m156295A(t, jM1876V);
                    i2 = i + iM2345f;
                    break;
                case 16:
                    i = i2 * 53;
                    iM2345f = C0351s.m2345f(lyj0.m156297C(t, jM1876V));
                    i2 = i + iM2345f;
                    break;
                case 17:
                    Object objM156299E2 = lyj0.m156299E(t, jM1876V);
                    if (objM156299E2 != null) {
                        iHashCode = objM156299E2.hashCode();
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
                    iM2345f = lyj0.m156299E(t, jM1876V).hashCode();
                    i2 = i + iM2345f;
                    break;
                case 50:
                    i = i2 * 53;
                    iM2345f = lyj0.m156299E(t, jM1876V).hashCode();
                    i2 = i + iM2345f;
                    break;
                case 51:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = C0351s.m2345f(Double.doubleToLongBits(m1878X(t, jM1876V)));
                        i2 = i + iM2345f;
                    }
                    break;
                case 52:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = Float.floatToIntBits(m1879Y(t, jM1876V));
                        i2 = i + iM2345f;
                    }
                    break;
                case 53:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = C0351s.m2345f(m1881a0(t, jM1876V));
                        i2 = i + iM2345f;
                    }
                    break;
                case 54:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = C0351s.m2345f(m1881a0(t, jM1876V));
                        i2 = i + iM2345f;
                    }
                    break;
                case 55:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = m1880Z(t, jM1876V);
                        i2 = i + iM2345f;
                    }
                    break;
                case 56:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = C0351s.m2345f(m1881a0(t, jM1876V));
                        i2 = i + iM2345f;
                    }
                    break;
                case 57:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = m1880Z(t, jM1876V);
                        i2 = i + iM2345f;
                    }
                    break;
                case 58:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = C0351s.m2342c(m1877W(t, jM1876V));
                        i2 = i + iM2345f;
                    }
                    break;
                case 59:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = ((String) lyj0.m156299E(t, jM1876V)).hashCode();
                        i2 = i + iM2345f;
                    }
                    break;
                case 60:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = lyj0.m156299E(t, jM1876V).hashCode();
                        i2 = i + iM2345f;
                    }
                    break;
                case 61:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = lyj0.m156299E(t, jM1876V).hashCode();
                        i2 = i + iM2345f;
                    }
                    break;
                case 62:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = m1880Z(t, jM1876V);
                        i2 = i + iM2345f;
                    }
                    break;
                case 63:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = m1880Z(t, jM1876V);
                        i2 = i + iM2345f;
                    }
                    break;
                case 64:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = m1880Z(t, jM1876V);
                        i2 = i + iM2345f;
                    }
                    break;
                case 65:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = C0351s.m2345f(m1881a0(t, jM1876V));
                        i2 = i + iM2345f;
                    }
                    break;
                case 66:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = m1880Z(t, jM1876V);
                        i2 = i + iM2345f;
                    }
                    break;
                case 67:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = C0351s.m2345f(m1881a0(t, jM1876V));
                        i2 = i + iM2345f;
                    }
                    break;
                case 68:
                    if (m1893I(t, iM1899U, i3)) {
                        i = i2 * 53;
                        iM2345f = lyj0.m156299E(t, jM1876V).hashCode();
                        i2 = i + iM2345f;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.f1622o.mo2236g(t).hashCode();
        return this.f1613f ? (iHashCode2 * 53) + this.f1623p.mo2252c(t).hashCode() : iHashCode2;
    }

    /* JADX INFO: renamed from: i0 */
    public final int m1916i0(int i) {
        return this.f1608a[i + 2];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0336i0
    /* JADX INFO: renamed from: j */
    public void mo1917j(T t, byte[] bArr, int i, int i2, C0325d.b bVar) throws IOException {
        if (this.f1615h) {
            m1908e0(t, bArr, i, i2, bVar);
        } else {
            m1906d0(t, bArr, i, i2, 0, bVar);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final <E> void m1918j0(Object obj, long j, InterfaceC0334h0 interfaceC0334h0, InterfaceC0336i0<E> interfaceC0336i0, C0341l c0341l) throws IOException {
        interfaceC0334h0.mo1957M(this.f1621n.mo2371e(obj, j), interfaceC0336i0, c0341l);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1919k(T t, T t2, int i) {
        return m1888C(t, i) == m1888C(t2, i);
    }

    /* JADX INFO: renamed from: k0 */
    public final <E> void m1920k0(Object obj, int i, InterfaceC0334h0 interfaceC0334h0, InterfaceC0336i0<E> interfaceC0336i0, C0341l c0341l) throws IOException {
        interfaceC0334h0.mo1949E(this.f1621n.mo2371e(obj, m1876V(i)), interfaceC0336i0, c0341l);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m1921l0(Object obj, int i, InterfaceC0334h0 interfaceC0334h0) throws IOException {
        if (m1868B(i)) {
            lyj0.m156314T(obj, m1876V(i), interfaceC0334h0.mo1959O());
        } else if (this.f1614g) {
            lyj0.m156314T(obj, m1876V(i), interfaceC0334h0.mo1956L());
        } else {
            lyj0.m156314T(obj, m1876V(i), interfaceC0334h0.mo1982g());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final <K, V> int m1922m(byte[] bArr, int i, int i2, C0357y.a<K, V> aVar, Map<K, V> map, C0325d.b bVar) throws IOException {
        int iM1835I = C0325d.m1835I(bArr, i, bVar);
        int i3 = bVar.f1602a;
        if (i3 < 0 || i3 > i2 - iM1835I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = iM1835I + i3;
        Object obj = aVar.f1763b;
        Object obj2 = aVar.f1765d;
        while (iM1835I < i4) {
            int iM1834H = iM1835I + 1;
            int i5 = bArr[iM1835I];
            if (i5 < 0) {
                iM1834H = C0325d.m1834H(i5, bArr, iM1834H, bVar);
                i5 = bVar.f1602a;
            }
            int i6 = iM1834H;
            int i7 = i5 >>> 3;
            int i8 = i5 & 7;
            if (i7 != 1) {
                if (i7 == 2 && i8 == aVar.f1764c.getWireType()) {
                    iM1835I = m1924n(bArr, i6, i2, aVar.f1764c, aVar.f1765d.getClass(), bVar);
                    obj2 = bVar.f1604c;
                } else {
                    iM1835I = C0325d.m1840N(i5, bArr, i6, i2, bVar);
                }
            } else if (i8 == aVar.f1762a.getWireType()) {
                iM1835I = m1924n(bArr, i6, i2, aVar.f1762a, null, bVar);
                obj = bVar.f1604c;
            } else {
                iM1835I = C0325d.m1840N(i5, bArr, i6, i2, bVar);
            }
        }
        if (iM1835I != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m1923m0(Object obj, int i, InterfaceC0334h0 interfaceC0334h0) throws IOException {
        boolean zM1868B = m1868B(i);
        AbstractC0355w abstractC0355w = this.f1621n;
        if (zM1868B) {
            interfaceC0334h0.mo1947C(abstractC0355w.mo2371e(obj, m1876V(i)));
        } else {
            interfaceC0334h0.mo1998p(abstractC0355w.mo2371e(obj, m1876V(i)));
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m1924n(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, C0325d.b bVar) throws IOException {
        switch (a.f1625a[fieldType.ordinal()]) {
            case 1:
                int iM1838L = C0325d.m1838L(bArr, i, bVar);
                bVar.f1604c = Boolean.valueOf(bVar.f1603b != 0);
                return iM1838L;
            case 2:
                return C0325d.m1842b(bArr, i, bVar);
            case 3:
                bVar.f1604c = Double.valueOf(C0325d.m1844d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                bVar.f1604c = Integer.valueOf(C0325d.m1848h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                bVar.f1604c = Long.valueOf(C0325d.m1850j(bArr, i));
                return i + 8;
            case 8:
                bVar.f1604c = Float.valueOf(C0325d.m1852l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iM1835I = C0325d.m1835I(bArr, i, bVar);
                bVar.f1604c = Integer.valueOf(bVar.f1602a);
                return iM1835I;
            case 12:
            case 13:
                int iM1838L2 = C0325d.m1838L(bArr, i, bVar);
                bVar.f1604c = Long.valueOf(bVar.f1603b);
                return iM1838L2;
            case 14:
                return C0325d.m1856p(g7b0.m129308a().m129311d(cls), bArr, i, i2, bVar);
            case 15:
                int iM1835I2 = C0325d.m1835I(bArr, i, bVar);
                bVar.f1604c = Integer.valueOf(AbstractC0331g.m2028b(bVar.f1602a));
                return iM1835I2;
            case 16:
                int iM1838L3 = C0325d.m1838L(bArr, i, bVar);
                bVar.f1604c = Long.valueOf(AbstractC0331g.m2029c(bVar.f1603b));
                return iM1838L3;
            case 17:
                return C0325d.m1832F(bArr, i, bVar);
            default:
                azk0.m101074a("unsupported field type.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m1925o0(T t, int i) {
        if (this.f1615h) {
            return;
        }
        int iM1916i0 = m1916i0(i);
        long j = iM1916i0 & 1048575;
        lyj0.m156312R(t, j, lyj0.m156295A(t, j) | (1 << (iM1916i0 >>> 20)));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1926p(T t, T t2, int i) {
        int iM1931s0 = m1931s0(i);
        long jM1876V = m1876V(iM1931s0);
        switch (m1885r0(iM1931s0)) {
            case 0:
                return m1919k(t, t2, i) && Double.doubleToLongBits(lyj0.m156341y(t, jM1876V)) == Double.doubleToLongBits(lyj0.m156341y(t2, jM1876V));
            case 1:
                return m1919k(t, t2, i) && Float.floatToIntBits(lyj0.m156342z(t, jM1876V)) == Float.floatToIntBits(lyj0.m156342z(t2, jM1876V));
            case 2:
                return m1919k(t, t2, i) && lyj0.m156297C(t, jM1876V) == lyj0.m156297C(t2, jM1876V);
            case 3:
                return m1919k(t, t2, i) && lyj0.m156297C(t, jM1876V) == lyj0.m156297C(t2, jM1876V);
            case 4:
                return m1919k(t, t2, i) && lyj0.m156295A(t, jM1876V) == lyj0.m156295A(t2, jM1876V);
            case 5:
                return m1919k(t, t2, i) && lyj0.m156297C(t, jM1876V) == lyj0.m156297C(t2, jM1876V);
            case 6:
                return m1919k(t, t2, i) && lyj0.m156295A(t, jM1876V) == lyj0.m156295A(t2, jM1876V);
            case 7:
                return m1919k(t, t2, i) && lyj0.m156334r(t, jM1876V) == lyj0.m156334r(t2, jM1876V);
            case 8:
                return m1919k(t, t2, i) && C0338j0.m2151K(lyj0.m156299E(t, jM1876V), lyj0.m156299E(t2, jM1876V));
            case 9:
                return m1919k(t, t2, i) && C0338j0.m2151K(lyj0.m156299E(t, jM1876V), lyj0.m156299E(t2, jM1876V));
            case 10:
                return m1919k(t, t2, i) && C0338j0.m2151K(lyj0.m156299E(t, jM1876V), lyj0.m156299E(t2, jM1876V));
            case 11:
                return m1919k(t, t2, i) && lyj0.m156295A(t, jM1876V) == lyj0.m156295A(t2, jM1876V);
            case 12:
                return m1919k(t, t2, i) && lyj0.m156295A(t, jM1876V) == lyj0.m156295A(t2, jM1876V);
            case 13:
                return m1919k(t, t2, i) && lyj0.m156295A(t, jM1876V) == lyj0.m156295A(t2, jM1876V);
            case 14:
                return m1919k(t, t2, i) && lyj0.m156297C(t, jM1876V) == lyj0.m156297C(t2, jM1876V);
            case 15:
                return m1919k(t, t2, i) && lyj0.m156295A(t, jM1876V) == lyj0.m156295A(t2, jM1876V);
            case 16:
                return m1919k(t, t2, i) && lyj0.m156297C(t, jM1876V) == lyj0.m156297C(t2, jM1876V);
            case 17:
                return m1919k(t, t2, i) && C0338j0.m2151K(lyj0.m156299E(t, jM1876V), lyj0.m156299E(t2, jM1876V));
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
                return C0338j0.m2151K(lyj0.m156299E(t, jM1876V), lyj0.m156299E(t2, jM1876V));
            case 50:
                return C0338j0.m2151K(lyj0.m156299E(t, jM1876V), lyj0.m156299E(t2, jM1876V));
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
                return m1892H(t, t2, i) && C0338j0.m2151K(lyj0.m156299E(t, jM1876V), lyj0.m156299E(t2, jM1876V));
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1927p0(T t, int i, int i2) {
        lyj0.m156312R(t, m1916i0(i2) & 1048575, i);
    }

    /* JADX INFO: renamed from: q */
    public final <UT, UB> UB m1928q(Object obj, int i, UB ub, AbstractC0342l0<UT, UB> abstractC0342l0) {
        C0351s.e eVarM1932t;
        int iM1899U = m1899U(i);
        Object objM156299E = lyj0.m156299E(obj, m1876V(m1931s0(i)));
        return (objM156299E == null || (eVarM1932t = m1932t(i)) == null) ? ub : (UB) m1930r(i, iM1899U, this.f1624q.mo1810e(objM156299E), eVarM1932t, ub, abstractC0342l0);
    }

    /* JADX INFO: renamed from: q0 */
    public final int m1929q0(int i, int i2) {
        int length = (this.f1608a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iM1899U = m1899U(i4);
            if (i == iM1899U) {
                return i4;
            }
            if (i < iM1899U) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final <K, V, UT, UB> UB m1930r(int i, int i2, Map<K, V> map, C0351s.e eVar, UB ub, AbstractC0342l0<UT, UB> abstractC0342l0) {
        C0357y.a<?, ?> aVarMo1807b = this.f1624q.mo1807b(m1934u(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.mo1620a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC0342l0.mo2243n();
                }
                ByteString.C0281g c0281gNewCodedBuilder = ByteString.newCodedBuilder(C0357y.m2385b(aVarMo1807b, next.getKey(), next.getValue()));
                try {
                    C0357y.m2387e(c0281gNewCodedBuilder.m1495b(), aVarMo1807b, next.getKey(), next.getValue());
                    abstractC0342l0.mo2233d(ub, i2, c0281gNewCodedBuilder.m1494a());
                    it.remove();
                } catch (IOException e) {
                    iig0.m140070a(e);
                    return null;
                }
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: s0 */
    public final int m1931s0(int i) {
        return this.f1608a[i + 1];
    }

    /* JADX INFO: renamed from: t */
    public final C0351s.e m1932t(int i) {
        return (C0351s.e) this.f1609b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: t0 */
    public final void m1933t0(T t, Writer writer) throws IOException {
        Iterator itM2314s;
        Map.Entry<?, ?> entry;
        boolean z;
        int i;
        boolean z2;
        if (this.f1613f) {
            C0348p<T> c0348pMo2252c = this.f1623p.mo2252c(t);
            if (c0348pMo2252c.m2311n()) {
                itM2314s = null;
                entry = null;
            } else {
                itM2314s = c0348pMo2252c.m2314s();
                entry = (Map.Entry) itM2314s.next();
            }
        } else {
            itM2314s = null;
            entry = null;
        }
        int length = this.f1608a.length;
        Unsafe unsafe = f1607s;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iM1931s0 = m1931s0(i3);
            int iM1899U = m1899U(i3);
            int iM1885r0 = m1885r0(iM1931s0);
            if (this.f1615h || iM1885r0 > 17) {
                z = true;
                entry = entry;
                i = 0;
            } else {
                int i5 = this.f1608a[i3 + 2];
                int i6 = i5 & 1048575;
                Map.Entry<?, ?> entry2 = entry;
                z = true;
                if (i6 != i2) {
                    i4 = unsafe.getInt(t, i6);
                    i2 = i6;
                }
                i = 1 << (i5 >>> 20);
                entry = entry2;
            }
            while (entry != null && this.f1623p.mo2250a(entry) <= iM1899U) {
                this.f1623p.mo2259j(writer, entry);
                entry = itM2314s.hasNext() ? (Map.Entry) itM2314s.next() : null;
            }
            Iterator it = itM2314s;
            int i7 = i;
            long jM1876V = m1876V(iM1931s0);
            switch (iM1885r0) {
                case 0:
                    if ((i4 & i7) != 0) {
                        writer.mo1754E(iM1899U, m1884o(t, jM1876V));
                    }
                    break;
                case 1:
                    if ((i4 & i7) != 0) {
                        writer.mo1761L(iM1899U, m1886s(t, jM1876V));
                    }
                    break;
                case 2:
                    if ((i4 & i7) != 0) {
                        writer.mo1758I(iM1899U, unsafe.getLong(t, jM1876V));
                    }
                    break;
                case 3:
                    if ((i4 & i7) != 0) {
                        writer.mo1769e(iM1899U, unsafe.getLong(t, jM1876V));
                    }
                    break;
                case 4:
                    if ((i4 & i7) != 0) {
                        writer.mo1771g(iM1899U, unsafe.getInt(t, jM1876V));
                    }
                    break;
                case 5:
                    if ((i4 & i7) != 0) {
                        writer.mo1780p(iM1899U, unsafe.getLong(t, jM1876V));
                    }
                    break;
                case 6:
                    if ((i4 & i7) != 0) {
                        writer.mo1767c(iM1899U, unsafe.getInt(t, jM1876V));
                    }
                    break;
                case 7:
                    if ((i4 & i7) != 0) {
                        writer.mo1781q(iM1899U, m1882l(t, jM1876V));
                    }
                    break;
                case 8:
                    if ((i4 & i7) != 0) {
                        m1940x0(iM1899U, unsafe.getObject(t, jM1876V), writer);
                    }
                    break;
                case 9:
                    if ((i4 & i7) != 0) {
                        writer.mo1774j(iM1899U, unsafe.getObject(t, jM1876V), m1936v(i3));
                    }
                    break;
                case 10:
                    if ((i4 & i7) != 0) {
                        writer.mo1772h(iM1899U, (ByteString) unsafe.getObject(t, jM1876V));
                    }
                    break;
                case 11:
                    if ((i4 & i7) != 0) {
                        writer.mo1778n(iM1899U, unsafe.getInt(t, jM1876V));
                    }
                    break;
                case 12:
                    if ((i4 & i7) != 0) {
                        writer.mo1762M(iM1899U, unsafe.getInt(t, jM1876V));
                    }
                    break;
                case 13:
                    if ((i4 & i7) != 0) {
                        writer.mo1782r(iM1899U, unsafe.getInt(t, jM1876V));
                    }
                    break;
                case 14:
                    if ((i4 & i7) != 0) {
                        writer.mo1750A(iM1899U, unsafe.getLong(t, jM1876V));
                    }
                    break;
                case 15:
                    if ((i4 & i7) != 0) {
                        writer.mo1764O(iM1899U, unsafe.getInt(t, jM1876V));
                    }
                    break;
                case 16:
                    if ((i4 & i7) != 0) {
                        writer.mo1776l(iM1899U, unsafe.getLong(t, jM1876V));
                    }
                    break;
                case 17:
                    if ((i4 & i7) != 0) {
                        writer.mo1753D(iM1899U, unsafe.getObject(t, jM1876V), m1936v(i3));
                    }
                    break;
                case 18:
                    C0338j0.m2156P(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 19:
                    C0338j0.m2160T(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 20:
                    C0338j0.m2163W(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 21:
                    C0338j0.m2176e0(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 22:
                    C0338j0.m2162V(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 23:
                    C0338j0.m2159S(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 24:
                    C0338j0.m2158R(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 25:
                    C0338j0.m2154N(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 26:
                    C0338j0.m2172c0(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer);
                    break;
                case 27:
                    C0338j0.m2164X(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, m1936v(i3));
                    break;
                case 28:
                    C0338j0.m2155O(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer);
                    break;
                case 29:
                    z2 = false;
                    C0338j0.m2174d0(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 30:
                    z2 = false;
                    C0338j0.m2157Q(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 31:
                    z2 = false;
                    C0338j0.m2165Y(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 32:
                    z2 = false;
                    C0338j0.m2166Z(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 33:
                    z2 = false;
                    C0338j0.m2168a0(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 34:
                    z2 = false;
                    C0338j0.m2170b0(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, false);
                    break;
                case 35:
                    C0338j0.m2156P(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 36:
                    C0338j0.m2160T(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 37:
                    C0338j0.m2163W(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 38:
                    C0338j0.m2176e0(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 39:
                    C0338j0.m2162V(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 40:
                    C0338j0.m2159S(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 41:
                    C0338j0.m2158R(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 42:
                    C0338j0.m2154N(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 43:
                    C0338j0.m2174d0(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 44:
                    C0338j0.m2157Q(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 45:
                    C0338j0.m2165Y(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 46:
                    C0338j0.m2166Z(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 47:
                    C0338j0.m2168a0(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 48:
                    C0338j0.m2170b0(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, z);
                    break;
                case 49:
                    C0338j0.m2161U(m1899U(i3), (List) unsafe.getObject(t, jM1876V), writer, m1936v(i3));
                    break;
                case 50:
                    m1938w0(writer, iM1899U, unsafe.getObject(t, jM1876V), i3);
                    break;
                case 51:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1754E(iM1899U, m1878X(t, jM1876V));
                    }
                    break;
                case 52:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1761L(iM1899U, m1879Y(t, jM1876V));
                    }
                    break;
                case 53:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1758I(iM1899U, m1881a0(t, jM1876V));
                    }
                    break;
                case 54:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1769e(iM1899U, m1881a0(t, jM1876V));
                    }
                    break;
                case 55:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1771g(iM1899U, m1880Z(t, jM1876V));
                    }
                    break;
                case 56:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1780p(iM1899U, m1881a0(t, jM1876V));
                    }
                    break;
                case 57:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1767c(iM1899U, m1880Z(t, jM1876V));
                    }
                    break;
                case 58:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1781q(iM1899U, m1877W(t, jM1876V));
                    }
                    break;
                case 59:
                    if (m1893I(t, iM1899U, i3)) {
                        m1940x0(iM1899U, unsafe.getObject(t, jM1876V), writer);
                    }
                    break;
                case 60:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1774j(iM1899U, unsafe.getObject(t, jM1876V), m1936v(i3));
                    }
                    break;
                case 61:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1772h(iM1899U, (ByteString) unsafe.getObject(t, jM1876V));
                    }
                    break;
                case 62:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1778n(iM1899U, m1880Z(t, jM1876V));
                    }
                    break;
                case 63:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1762M(iM1899U, m1880Z(t, jM1876V));
                    }
                    break;
                case 64:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1782r(iM1899U, m1880Z(t, jM1876V));
                    }
                    break;
                case 65:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1750A(iM1899U, m1881a0(t, jM1876V));
                    }
                    break;
                case 66:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1764O(iM1899U, m1880Z(t, jM1876V));
                    }
                    break;
                case 67:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1776l(iM1899U, m1881a0(t, jM1876V));
                    }
                    break;
                case 68:
                    if (m1893I(t, iM1899U, i3)) {
                        writer.mo1753D(iM1899U, unsafe.getObject(t, jM1876V), m1936v(i3));
                    }
                    break;
                default:
                    break;
            }
            i3 += 3;
            itM2314s = it;
        }
        Iterator it2 = itM2314s;
        while (entry != null) {
            this.f1623p.mo2259j(writer, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        m1942y0(this.f1622o, t, writer);
    }

    /* JADX INFO: renamed from: u */
    public final Object m1934u(int i) {
        return this.f1609b[(i / 3) * 2];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: u0 */
    public final void m1935u0(T t, Writer writer) throws IOException {
        Iterator itM2314s;
        Map.Entry<?, ?> entry;
        if (this.f1613f) {
            C0348p<T> c0348pMo2252c = this.f1623p.mo2252c(t);
            if (c0348pMo2252c.m2311n()) {
                itM2314s = null;
                entry = null;
            } else {
                itM2314s = c0348pMo2252c.m2314s();
                entry = (Map.Entry) itM2314s.next();
            }
        } else {
            itM2314s = null;
            entry = null;
        }
        int length = this.f1608a.length;
        for (int i = 0; i < length; i += 3) {
            int iM1931s0 = m1931s0(i);
            int iM1899U = m1899U(i);
            while (entry != null && this.f1623p.mo2250a(entry) <= iM1899U) {
                this.f1623p.mo2259j(writer, entry);
                entry = itM2314s.hasNext() ? (Map.Entry) itM2314s.next() : null;
            }
            switch (m1885r0(iM1931s0)) {
                case 0:
                    if (m1888C(t, i)) {
                        writer.mo1754E(iM1899U, m1884o(t, m1876V(iM1931s0)));
                    }
                    break;
                case 1:
                    if (m1888C(t, i)) {
                        writer.mo1761L(iM1899U, m1886s(t, m1876V(iM1931s0)));
                    }
                    break;
                case 2:
                    if (m1888C(t, i)) {
                        writer.mo1758I(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 3:
                    if (m1888C(t, i)) {
                        writer.mo1769e(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 4:
                    if (m1888C(t, i)) {
                        writer.mo1771g(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 5:
                    if (m1888C(t, i)) {
                        writer.mo1780p(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 6:
                    if (m1888C(t, i)) {
                        writer.mo1767c(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 7:
                    if (m1888C(t, i)) {
                        writer.mo1781q(iM1899U, m1882l(t, m1876V(iM1931s0)));
                    }
                    break;
                case 8:
                    if (m1888C(t, i)) {
                        m1940x0(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), writer);
                    }
                    break;
                case 9:
                    if (m1888C(t, i)) {
                        writer.mo1774j(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), m1936v(i));
                    }
                    break;
                case 10:
                    if (m1888C(t, i)) {
                        writer.mo1772h(iM1899U, (ByteString) lyj0.m156299E(t, m1876V(iM1931s0)));
                    }
                    break;
                case 11:
                    if (m1888C(t, i)) {
                        writer.mo1778n(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 12:
                    if (m1888C(t, i)) {
                        writer.mo1762M(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 13:
                    if (m1888C(t, i)) {
                        writer.mo1782r(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 14:
                    if (m1888C(t, i)) {
                        writer.mo1750A(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 15:
                    if (m1888C(t, i)) {
                        writer.mo1764O(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 16:
                    if (m1888C(t, i)) {
                        writer.mo1776l(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 17:
                    if (m1888C(t, i)) {
                        writer.mo1753D(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), m1936v(i));
                    }
                    break;
                case 18:
                    C0338j0.m2156P(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 19:
                    C0338j0.m2160T(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 20:
                    C0338j0.m2163W(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 21:
                    C0338j0.m2176e0(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 22:
                    C0338j0.m2162V(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 23:
                    C0338j0.m2159S(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 24:
                    C0338j0.m2158R(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 25:
                    C0338j0.m2154N(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 26:
                    C0338j0.m2172c0(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer);
                    break;
                case 27:
                    C0338j0.m2164X(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, m1936v(i));
                    break;
                case 28:
                    C0338j0.m2155O(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer);
                    break;
                case 29:
                    C0338j0.m2174d0(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 30:
                    C0338j0.m2157Q(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 31:
                    C0338j0.m2165Y(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 32:
                    C0338j0.m2166Z(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 33:
                    C0338j0.m2168a0(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 34:
                    C0338j0.m2170b0(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 35:
                    C0338j0.m2156P(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 36:
                    C0338j0.m2160T(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 37:
                    C0338j0.m2163W(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 38:
                    C0338j0.m2176e0(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 39:
                    C0338j0.m2162V(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 40:
                    C0338j0.m2159S(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 41:
                    C0338j0.m2158R(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 42:
                    C0338j0.m2154N(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 43:
                    C0338j0.m2174d0(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 44:
                    C0338j0.m2157Q(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 45:
                    C0338j0.m2165Y(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 46:
                    C0338j0.m2166Z(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 47:
                    C0338j0.m2168a0(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 48:
                    C0338j0.m2170b0(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 49:
                    C0338j0.m2161U(m1899U(i), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, m1936v(i));
                    break;
                case 50:
                    m1938w0(writer, iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), i);
                    break;
                case 51:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1754E(iM1899U, m1878X(t, m1876V(iM1931s0)));
                    }
                    break;
                case 52:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1761L(iM1899U, m1879Y(t, m1876V(iM1931s0)));
                    }
                    break;
                case 53:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1758I(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 54:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1769e(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 55:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1771g(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 56:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1780p(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 57:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1767c(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 58:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1781q(iM1899U, m1877W(t, m1876V(iM1931s0)));
                    }
                    break;
                case 59:
                    if (m1893I(t, iM1899U, i)) {
                        m1940x0(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), writer);
                    }
                    break;
                case 60:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1774j(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), m1936v(i));
                    }
                    break;
                case 61:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1772h(iM1899U, (ByteString) lyj0.m156299E(t, m1876V(iM1931s0)));
                    }
                    break;
                case 62:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1778n(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 63:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1762M(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 64:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1782r(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 65:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1750A(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 66:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1764O(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 67:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1776l(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 68:
                    if (m1893I(t, iM1899U, i)) {
                        writer.mo1753D(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), m1936v(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f1623p.mo2259j(writer, entry);
            entry = itM2314s.hasNext() ? (Map.Entry) itM2314s.next() : null;
        }
        m1942y0(this.f1622o, t, writer);
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC0336i0 m1936v(int i) {
        int i2 = (i / 3) * 2;
        InterfaceC0336i0 interfaceC0336i0 = (InterfaceC0336i0) this.f1609b[i2];
        if (interfaceC0336i0 != null) {
            return interfaceC0336i0;
        }
        InterfaceC0336i0<T> interfaceC0336i0M129311d = g7b0.m129308a().m129311d((Class) this.f1609b[i2 + 1]);
        this.f1609b[i2] = interfaceC0336i0M129311d;
        return interfaceC0336i0M129311d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: v0 */
    public final void m1937v0(T t, Writer writer) throws IOException {
        Iterator itM2306g;
        Map.Entry<?, ?> entry;
        m1942y0(this.f1622o, t, writer);
        if (this.f1613f) {
            C0348p<T> c0348pMo2252c = this.f1623p.mo2252c(t);
            if (c0348pMo2252c.m2311n()) {
                itM2306g = null;
                entry = null;
            } else {
                itM2306g = c0348pMo2252c.m2306g();
                entry = (Map.Entry) itM2306g.next();
            }
        } else {
            itM2306g = null;
            entry = null;
        }
        for (int length = this.f1608a.length - 3; length >= 0; length -= 3) {
            int iM1931s0 = m1931s0(length);
            int iM1899U = m1899U(length);
            while (entry != null && this.f1623p.mo2250a(entry) > iM1899U) {
                this.f1623p.mo2259j(writer, entry);
                entry = itM2306g.hasNext() ? (Map.Entry) itM2306g.next() : null;
            }
            switch (m1885r0(iM1931s0)) {
                case 0:
                    if (m1888C(t, length)) {
                        writer.mo1754E(iM1899U, m1884o(t, m1876V(iM1931s0)));
                    }
                    break;
                case 1:
                    if (m1888C(t, length)) {
                        writer.mo1761L(iM1899U, m1886s(t, m1876V(iM1931s0)));
                    }
                    break;
                case 2:
                    if (m1888C(t, length)) {
                        writer.mo1758I(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 3:
                    if (m1888C(t, length)) {
                        writer.mo1769e(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 4:
                    if (m1888C(t, length)) {
                        writer.mo1771g(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 5:
                    if (m1888C(t, length)) {
                        writer.mo1780p(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 6:
                    if (m1888C(t, length)) {
                        writer.mo1767c(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 7:
                    if (m1888C(t, length)) {
                        writer.mo1781q(iM1899U, m1882l(t, m1876V(iM1931s0)));
                    }
                    break;
                case 8:
                    if (m1888C(t, length)) {
                        m1940x0(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), writer);
                    }
                    break;
                case 9:
                    if (m1888C(t, length)) {
                        writer.mo1774j(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), m1936v(length));
                    }
                    break;
                case 10:
                    if (m1888C(t, length)) {
                        writer.mo1772h(iM1899U, (ByteString) lyj0.m156299E(t, m1876V(iM1931s0)));
                    }
                    break;
                case 11:
                    if (m1888C(t, length)) {
                        writer.mo1778n(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 12:
                    if (m1888C(t, length)) {
                        writer.mo1762M(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 13:
                    if (m1888C(t, length)) {
                        writer.mo1782r(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 14:
                    if (m1888C(t, length)) {
                        writer.mo1750A(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 15:
                    if (m1888C(t, length)) {
                        writer.mo1764O(iM1899U, m1867A(t, m1876V(iM1931s0)));
                    }
                    break;
                case 16:
                    if (m1888C(t, length)) {
                        writer.mo1776l(iM1899U, m1872L(t, m1876V(iM1931s0)));
                    }
                    break;
                case 17:
                    if (m1888C(t, length)) {
                        writer.mo1753D(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), m1936v(length));
                    }
                    break;
                case 18:
                    C0338j0.m2156P(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 19:
                    C0338j0.m2160T(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 20:
                    C0338j0.m2163W(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 21:
                    C0338j0.m2176e0(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 22:
                    C0338j0.m2162V(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 23:
                    C0338j0.m2159S(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 24:
                    C0338j0.m2158R(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 25:
                    C0338j0.m2154N(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 26:
                    C0338j0.m2172c0(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer);
                    break;
                case 27:
                    C0338j0.m2164X(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, m1936v(length));
                    break;
                case 28:
                    C0338j0.m2155O(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer);
                    break;
                case 29:
                    C0338j0.m2174d0(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 30:
                    C0338j0.m2157Q(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 31:
                    C0338j0.m2165Y(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 32:
                    C0338j0.m2166Z(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 33:
                    C0338j0.m2168a0(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 34:
                    C0338j0.m2170b0(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, false);
                    break;
                case 35:
                    C0338j0.m2156P(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 36:
                    C0338j0.m2160T(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 37:
                    C0338j0.m2163W(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 38:
                    C0338j0.m2176e0(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 39:
                    C0338j0.m2162V(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 40:
                    C0338j0.m2159S(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 41:
                    C0338j0.m2158R(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 42:
                    C0338j0.m2154N(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 43:
                    C0338j0.m2174d0(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 44:
                    C0338j0.m2157Q(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 45:
                    C0338j0.m2165Y(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 46:
                    C0338j0.m2166Z(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 47:
                    C0338j0.m2168a0(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 48:
                    C0338j0.m2170b0(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, true);
                    break;
                case 49:
                    C0338j0.m2161U(m1899U(length), (List) lyj0.m156299E(t, m1876V(iM1931s0)), writer, m1936v(length));
                    break;
                case 50:
                    m1938w0(writer, iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), length);
                    break;
                case 51:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1754E(iM1899U, m1878X(t, m1876V(iM1931s0)));
                    }
                    break;
                case 52:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1761L(iM1899U, m1879Y(t, m1876V(iM1931s0)));
                    }
                    break;
                case 53:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1758I(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 54:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1769e(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 55:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1771g(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 56:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1780p(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 57:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1767c(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 58:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1781q(iM1899U, m1877W(t, m1876V(iM1931s0)));
                    }
                    break;
                case 59:
                    if (m1893I(t, iM1899U, length)) {
                        m1940x0(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), writer);
                    }
                    break;
                case 60:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1774j(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), m1936v(length));
                    }
                    break;
                case 61:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1772h(iM1899U, (ByteString) lyj0.m156299E(t, m1876V(iM1931s0)));
                    }
                    break;
                case 62:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1778n(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 63:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1762M(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 64:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1782r(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 65:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1750A(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 66:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1764O(iM1899U, m1880Z(t, m1876V(iM1931s0)));
                    }
                    break;
                case 67:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1776l(iM1899U, m1881a0(t, m1876V(iM1931s0)));
                    }
                    break;
                case 68:
                    if (m1893I(t, iM1899U, length)) {
                        writer.mo1753D(iM1899U, lyj0.m156299E(t, m1876V(iM1931s0)), m1936v(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f1623p.mo2259j(writer, entry);
            entry = itM2306g.hasNext() ? (Map.Entry) itM2306g.next() : null;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final <K, V> void m1938w0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.mo1777m(i, this.f1624q.mo1807b(m1934u(i2)), this.f1624q.mo1812g(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[PHI: r6
      0x007c: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v8 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v9 int)
      (r6v1 int)
     binds: [B:21:0x0063, B:224:0x04ce, B:221:0x04c3, B:215:0x04a7, B:212:0x0495, B:209:0x0485, B:206:0x0477, B:203:0x0469, B:200:0x045e, B:197:0x0454, B:194:0x0446, B:191:0x0438, B:188:0x0424, B:164:0x0333, B:158:0x0315, B:152:0x02f7, B:146:0x02d9, B:140:0x02bb, B:134:0x029d, B:128:0x027f, B:122:0x0261, B:116:0x0243, B:110:0x0226, B:104:0x0209, B:98:0x01ec, B:92:0x01cf, B:90:0x01c0, B:85:0x01ae, B:80:0x017a, B:77:0x016e, B:74:0x015e, B:71:0x014e, B:68:0x013e, B:65:0x0132, B:62:0x0125, B:59:0x0118, B:53:0x00fa, B:50:0x00e7, B:47:0x00d6, B:44:0x00c7, B:41:0x00b8, B:38:0x00ac, B:35:0x00a1, B:32:0x0092, B:29:0x0083, B:26:0x007b, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x */
    public final int m1939x(T t) {
        int i;
        int i2;
        int iM1535j;
        int iM1527e;
        boolean z;
        int iM2177f;
        int iM2180i;
        int iM1519W;
        int iM1521Y;
        Unsafe unsafe = f1607s;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < this.f1608a.length) {
            int iM1931s0 = m1931s0(i4);
            int iM1899U = m1899U(i4);
            int iM1885r0 = m1885r0(iM1931s0);
            if (iM1885r0 <= 17) {
                i = this.f1608a[i4 + 2];
                int i7 = 1048575 & i;
                int i8 = 1 << (i >>> 20);
                if (i7 != i3) {
                    i6 = unsafe.getInt(t, i7);
                    i3 = i7;
                }
                i2 = i8;
            } else {
                i = (!this.f1616i || iM1885r0 < FieldType.DOUBLE_LIST_PACKED.m1622id() || iM1885r0 > FieldType.SINT64_LIST_PACKED.m1622id()) ? 0 : this.f1608a[i4 + 2] & 1048575;
                i2 = 0;
            }
            long jM1876V = m1876V(iM1931s0);
            int i9 = i3;
            switch (iM1885r0) {
                case 0:
                    if ((i6 & i2) != 0) {
                        iM1535j = CodedOutputStream.m1535j(iM1899U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i5 += iM1535j;
                    }
                    break;
                case 1:
                    if ((i6 & i2) != 0) {
                        iM1535j = CodedOutputStream.m1543r(iM1899U, 0.0f);
                        i5 += iM1535j;
                    }
                    break;
                case 2:
                    if ((i6 & i2) != 0) {
                        iM1535j = CodedOutputStream.m1550y(iM1899U, unsafe.getLong(t, jM1876V));
                        i5 += iM1535j;
                    }
                    break;
                case 3:
                    if ((i6 & i2) != 0) {
                        iM1535j = CodedOutputStream.m1522Z(iM1899U, unsafe.getLong(t, jM1876V));
                        i5 += iM1535j;
                    }
                    break;
                case 4:
                    if ((i6 & i2) != 0) {
                        iM1535j = CodedOutputStream.m1548w(iM1899U, unsafe.getInt(t, jM1876V));
                        i5 += iM1535j;
                    }
                    break;
                case 5:
                    if ((i6 & i2) != 0) {
                        iM1535j = CodedOutputStream.m1541p(iM1899U, 0L);
                        i5 += iM1535j;
                    }
                    break;
                case 6:
                    if ((i6 & i2) != 0) {
                        iM1535j = CodedOutputStream.m1539n(iM1899U, 0);
                        i5 += iM1535j;
                    }
                    break;
                case 7:
                    if ((i6 & i2) != 0) {
                        iM1527e = CodedOutputStream.m1527e(iM1899U, true);
                        i5 += iM1527e;
                    }
                    break;
                case 8:
                    if ((i6 & i2) != 0) {
                        Object object = unsafe.getObject(t, jM1876V);
                        iM1527e = object instanceof ByteString ? CodedOutputStream.m1531h(iM1899U, (ByteString) object) : CodedOutputStream.m1517U(iM1899U, (String) object);
                        i5 += iM1527e;
                    }
                    break;
                case 9:
                    if ((i6 & i2) != 0) {
                        iM1527e = C0338j0.m2186o(iM1899U, unsafe.getObject(t, jM1876V), m1936v(i4));
                        i5 += iM1527e;
                    }
                    break;
                case 10:
                    if ((i6 & i2) != 0) {
                        iM1527e = CodedOutputStream.m1531h(iM1899U, (ByteString) unsafe.getObject(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 11:
                    if ((i6 & i2) != 0) {
                        iM1527e = CodedOutputStream.m1520X(iM1899U, unsafe.getInt(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 12:
                    if ((i6 & i2) != 0) {
                        iM1527e = CodedOutputStream.m1537l(iM1899U, unsafe.getInt(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 13:
                    if ((i6 & i2) != 0) {
                        iM1527e = CodedOutputStream.m1509M(iM1899U, 0);
                        i5 += iM1527e;
                    }
                    break;
                case 14:
                    if ((i6 & i2) != 0) {
                        iM1527e = CodedOutputStream.m1511O(iM1899U, 0L);
                        i5 += iM1527e;
                    }
                    break;
                case 15:
                    if ((i6 & i2) != 0) {
                        iM1527e = CodedOutputStream.m1513Q(iM1899U, unsafe.getInt(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 16:
                    if ((i6 & i2) != 0) {
                        iM1527e = CodedOutputStream.m1515S(iM1899U, unsafe.getLong(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 17:
                    if ((i6 & i2) != 0) {
                        iM1527e = CodedOutputStream.m1545t(iM1899U, (InterfaceC0322b0) unsafe.getObject(t, jM1876V), m1936v(i4));
                        i5 += iM1527e;
                    }
                    break;
                case 18:
                    iM1527e = C0338j0.m2179h(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM1527e;
                    break;
                case 19:
                    z = false;
                    iM2177f = C0338j0.m2177f(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 20:
                    z = false;
                    iM2177f = C0338j0.m2184m(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 21:
                    z = false;
                    iM2177f = C0338j0.m2195x(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 22:
                    z = false;
                    iM2177f = C0338j0.m2182k(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 23:
                    z = false;
                    iM2177f = C0338j0.m2179h(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 24:
                    z = false;
                    iM2177f = C0338j0.m2177f(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 25:
                    z = false;
                    iM2177f = C0338j0.m2167a(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 26:
                    iM1527e = C0338j0.m2192u(iM1899U, (List) unsafe.getObject(t, jM1876V));
                    i5 += iM1527e;
                    break;
                case 27:
                    iM1527e = C0338j0.m2187p(iM1899U, (List) unsafe.getObject(t, jM1876V), m1936v(i4));
                    i5 += iM1527e;
                    break;
                case 28:
                    iM1527e = C0338j0.m2171c(iM1899U, (List) unsafe.getObject(t, jM1876V));
                    i5 += iM1527e;
                    break;
                case 29:
                    iM1527e = C0338j0.m2193v(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM1527e;
                    break;
                case 30:
                    z = false;
                    iM2177f = C0338j0.m2173d(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 31:
                    z = false;
                    iM2177f = C0338j0.m2177f(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 32:
                    z = false;
                    iM2177f = C0338j0.m2179h(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 33:
                    z = false;
                    iM2177f = C0338j0.m2188q(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 34:
                    z = false;
                    iM2177f = C0338j0.m2190s(iM1899U, (List) unsafe.getObject(t, jM1876V), false);
                    i5 += iM2177f;
                    break;
                case 35:
                    iM2180i = C0338j0.m2180i((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 36:
                    iM2180i = C0338j0.m2178g((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 37:
                    iM2180i = C0338j0.m2185n((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 38:
                    iM2180i = C0338j0.m2196y((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 39:
                    iM2180i = C0338j0.m2183l((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 40:
                    iM2180i = C0338j0.m2180i((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 41:
                    iM2180i = C0338j0.m2178g((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 42:
                    iM2180i = C0338j0.m2169b((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 43:
                    iM2180i = C0338j0.m2194w((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 44:
                    iM2180i = C0338j0.m2175e((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 45:
                    iM2180i = C0338j0.m2178g((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 46:
                    iM2180i = C0338j0.m2180i((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 47:
                    iM2180i = C0338j0.m2189r((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 48:
                    iM2180i = C0338j0.m2191t((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        i5 += iM1519W + iM1521Y + iM2180i;
                    }
                    break;
                case 49:
                    iM1527e = C0338j0.m2181j(iM1899U, (List) unsafe.getObject(t, jM1876V), m1936v(i4));
                    i5 += iM1527e;
                    break;
                case 50:
                    iM1527e = this.f1624q.mo1809d(iM1899U, unsafe.getObject(t, jM1876V), m1934u(i4));
                    i5 += iM1527e;
                    break;
                case 51:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1535j(iM1899U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i5 += iM1527e;
                    }
                    break;
                case 52:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1543r(iM1899U, 0.0f);
                        i5 += iM1527e;
                    }
                    break;
                case 53:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1550y(iM1899U, m1881a0(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 54:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1522Z(iM1899U, m1881a0(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 55:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1548w(iM1899U, m1880Z(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 56:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1541p(iM1899U, 0L);
                        i5 += iM1527e;
                    }
                    break;
                case 57:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1539n(iM1899U, 0);
                        i5 += iM1527e;
                    }
                    break;
                case 58:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1527e(iM1899U, true);
                        i5 += iM1527e;
                    }
                    break;
                case 59:
                    if (m1893I(t, iM1899U, i4)) {
                        Object object2 = unsafe.getObject(t, jM1876V);
                        iM1527e = object2 instanceof ByteString ? CodedOutputStream.m1531h(iM1899U, (ByteString) object2) : CodedOutputStream.m1517U(iM1899U, (String) object2);
                        i5 += iM1527e;
                    }
                    break;
                case 60:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = C0338j0.m2186o(iM1899U, unsafe.getObject(t, jM1876V), m1936v(i4));
                        i5 += iM1527e;
                    }
                    break;
                case 61:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1531h(iM1899U, (ByteString) unsafe.getObject(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 62:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1520X(iM1899U, m1880Z(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 63:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1537l(iM1899U, m1880Z(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 64:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1509M(iM1899U, 0);
                        i5 += iM1527e;
                    }
                    break;
                case 65:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1511O(iM1899U, 0L);
                        i5 += iM1527e;
                    }
                    break;
                case 66:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1513Q(iM1899U, m1880Z(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 67:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1515S(iM1899U, m1881a0(t, jM1876V));
                        i5 += iM1527e;
                    }
                    break;
                case 68:
                    if (m1893I(t, iM1899U, i4)) {
                        iM1527e = CodedOutputStream.m1545t(iM1899U, (InterfaceC0322b0) unsafe.getObject(t, jM1876V), m1936v(i4));
                        i5 += iM1527e;
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i3 = i9;
        }
        int iM1943z = i5 + m1943z(this.f1622o, t);
        return this.f1613f ? iM1943z + this.f1623p.mo2252c(t).m2310l() : iM1943z;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m1940x0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.mo1768d(i, (String) obj);
        } else {
            writer.mo1772h(i, (ByteString) obj);
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m1941y(T t) {
        int iM1535j;
        int iM2180i;
        int iM1519W;
        int iM1521Y;
        Unsafe unsafe = f1607s;
        int i = 0;
        for (int i2 = 0; i2 < this.f1608a.length; i2 += 3) {
            int iM1931s0 = m1931s0(i2);
            int iM1885r0 = m1885r0(iM1931s0);
            int iM1899U = m1899U(i2);
            long jM1876V = m1876V(iM1931s0);
            int i3 = (iM1885r0 < FieldType.DOUBLE_LIST_PACKED.m1622id() || iM1885r0 > FieldType.SINT64_LIST_PACKED.m1622id()) ? 0 : this.f1608a[i2 + 2] & 1048575;
            switch (iM1885r0) {
                case 0:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1535j(iM1899U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i += iM1535j;
                    }
                    break;
                case 1:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1543r(iM1899U, 0.0f);
                        i += iM1535j;
                    }
                    break;
                case 2:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1550y(iM1899U, lyj0.m156297C(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 3:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1522Z(iM1899U, lyj0.m156297C(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 4:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1548w(iM1899U, lyj0.m156295A(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 5:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1541p(iM1899U, 0L);
                        i += iM1535j;
                    }
                    break;
                case 6:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1539n(iM1899U, 0);
                        i += iM1535j;
                    }
                    break;
                case 7:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1527e(iM1899U, true);
                        i += iM1535j;
                    }
                    break;
                case 8:
                    if (m1888C(t, i2)) {
                        Object objM156299E = lyj0.m156299E(t, jM1876V);
                        iM1535j = objM156299E instanceof ByteString ? CodedOutputStream.m1531h(iM1899U, (ByteString) objM156299E) : CodedOutputStream.m1517U(iM1899U, (String) objM156299E);
                        i += iM1535j;
                    }
                    break;
                case 9:
                    if (m1888C(t, i2)) {
                        iM1535j = C0338j0.m2186o(iM1899U, lyj0.m156299E(t, jM1876V), m1936v(i2));
                        i += iM1535j;
                    }
                    break;
                case 10:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1531h(iM1899U, (ByteString) lyj0.m156299E(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 11:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1520X(iM1899U, lyj0.m156295A(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 12:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1537l(iM1899U, lyj0.m156295A(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 13:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1509M(iM1899U, 0);
                        i += iM1535j;
                    }
                    break;
                case 14:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1511O(iM1899U, 0L);
                        i += iM1535j;
                    }
                    break;
                case 15:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1513Q(iM1899U, lyj0.m156295A(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 16:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1515S(iM1899U, lyj0.m156297C(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 17:
                    if (m1888C(t, i2)) {
                        iM1535j = CodedOutputStream.m1545t(iM1899U, (InterfaceC0322b0) lyj0.m156299E(t, jM1876V), m1936v(i2));
                        i += iM1535j;
                    }
                    break;
                case 18:
                    iM1535j = C0338j0.m2179h(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 19:
                    iM1535j = C0338j0.m2177f(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 20:
                    iM1535j = C0338j0.m2184m(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 21:
                    iM1535j = C0338j0.m2195x(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 22:
                    iM1535j = C0338j0.m2182k(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 23:
                    iM1535j = C0338j0.m2179h(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 24:
                    iM1535j = C0338j0.m2177f(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 25:
                    iM1535j = C0338j0.m2167a(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 26:
                    iM1535j = C0338j0.m2192u(iM1899U, m1871K(t, jM1876V));
                    i += iM1535j;
                    break;
                case 27:
                    iM1535j = C0338j0.m2187p(iM1899U, m1871K(t, jM1876V), m1936v(i2));
                    i += iM1535j;
                    break;
                case 28:
                    iM1535j = C0338j0.m2171c(iM1899U, m1871K(t, jM1876V));
                    i += iM1535j;
                    break;
                case 29:
                    iM1535j = C0338j0.m2193v(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 30:
                    iM1535j = C0338j0.m2173d(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 31:
                    iM1535j = C0338j0.m2177f(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 32:
                    iM1535j = C0338j0.m2179h(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 33:
                    iM1535j = C0338j0.m2188q(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 34:
                    iM1535j = C0338j0.m2190s(iM1899U, m1871K(t, jM1876V), false);
                    i += iM1535j;
                    break;
                case 35:
                    iM2180i = C0338j0.m2180i((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 36:
                    iM2180i = C0338j0.m2178g((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 37:
                    iM2180i = C0338j0.m2185n((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 38:
                    iM2180i = C0338j0.m2196y((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 39:
                    iM2180i = C0338j0.m2183l((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 40:
                    iM2180i = C0338j0.m2180i((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 41:
                    iM2180i = C0338j0.m2178g((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 42:
                    iM2180i = C0338j0.m2169b((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 43:
                    iM2180i = C0338j0.m2194w((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 44:
                    iM2180i = C0338j0.m2175e((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 45:
                    iM2180i = C0338j0.m2178g((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 46:
                    iM2180i = C0338j0.m2180i((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 47:
                    iM2180i = C0338j0.m2189r((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 48:
                    iM2180i = C0338j0.m2191t((List) unsafe.getObject(t, jM1876V));
                    if (iM2180i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2180i);
                        }
                        iM1519W = CodedOutputStream.m1519W(iM1899U);
                        iM1521Y = CodedOutputStream.m1521Y(iM2180i);
                        iM1535j = iM1519W + iM1521Y + iM2180i;
                        i += iM1535j;
                    }
                    break;
                case 49:
                    iM1535j = C0338j0.m2181j(iM1899U, m1871K(t, jM1876V), m1936v(i2));
                    i += iM1535j;
                    break;
                case 50:
                    iM1535j = this.f1624q.mo1809d(iM1899U, lyj0.m156299E(t, jM1876V), m1934u(i2));
                    i += iM1535j;
                    break;
                case 51:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1535j(iM1899U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i += iM1535j;
                    }
                    break;
                case 52:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1543r(iM1899U, 0.0f);
                        i += iM1535j;
                    }
                    break;
                case 53:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1550y(iM1899U, m1881a0(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 54:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1522Z(iM1899U, m1881a0(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 55:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1548w(iM1899U, m1880Z(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 56:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1541p(iM1899U, 0L);
                        i += iM1535j;
                    }
                    break;
                case 57:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1539n(iM1899U, 0);
                        i += iM1535j;
                    }
                    break;
                case 58:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1527e(iM1899U, true);
                        i += iM1535j;
                    }
                    break;
                case 59:
                    if (m1893I(t, iM1899U, i2)) {
                        Object objM156299E2 = lyj0.m156299E(t, jM1876V);
                        iM1535j = objM156299E2 instanceof ByteString ? CodedOutputStream.m1531h(iM1899U, (ByteString) objM156299E2) : CodedOutputStream.m1517U(iM1899U, (String) objM156299E2);
                        i += iM1535j;
                    }
                    break;
                case 60:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = C0338j0.m2186o(iM1899U, lyj0.m156299E(t, jM1876V), m1936v(i2));
                        i += iM1535j;
                    }
                    break;
                case 61:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1531h(iM1899U, (ByteString) lyj0.m156299E(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 62:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1520X(iM1899U, m1880Z(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 63:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1537l(iM1899U, m1880Z(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 64:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1509M(iM1899U, 0);
                        i += iM1535j;
                    }
                    break;
                case 65:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1511O(iM1899U, 0L);
                        i += iM1535j;
                    }
                    break;
                case 66:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1513Q(iM1899U, m1880Z(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 67:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1515S(iM1899U, m1881a0(t, jM1876V));
                        i += iM1535j;
                    }
                    break;
                case 68:
                    if (m1893I(t, iM1899U, i2)) {
                        iM1535j = CodedOutputStream.m1545t(iM1899U, (InterfaceC0322b0) lyj0.m156299E(t, jM1876V), m1936v(i2));
                        i += iM1535j;
                    }
                    break;
            }
        }
        return i + m1943z(this.f1622o, t);
    }

    /* JADX INFO: renamed from: y0 */
    public final <UT, UB> void m1942y0(AbstractC0342l0<UT, UB> abstractC0342l0, T t, Writer writer) throws IOException {
        abstractC0342l0.mo2249t(abstractC0342l0.mo2236g(t), writer);
    }

    /* JADX INFO: renamed from: z */
    public final <UT, UB> int m1943z(AbstractC0342l0<UT, UB> abstractC0342l0, T t) {
        return abstractC0342l0.mo2237h(abstractC0342l0.mo2236g(t));
    }
}
