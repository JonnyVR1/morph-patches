package androidx.datastore.preferences.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.aag0;
import p149l.cbx0;
import p149l.cza0;
import p149l.f5z;
import p149l.gdc0;
import p149l.ipj0;
import p149l.lt20;
import p149l.u0g0;
import p149l.upk0;
import p149l.x9g0;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0325d0<T> implements InterfaceC0335i0<T> {

    /* JADX INFO: renamed from: r */
    public static final int[] f1606r = new int[0];

    /* JADX INFO: renamed from: s */
    public static final Unsafe f1607s = ipj0.m137495F();

    /* JADX INFO: renamed from: a */
    public final int[] f1608a;

    /* JADX INFO: renamed from: b */
    public final Object[] f1609b;

    /* JADX INFO: renamed from: c */
    public final int f1610c;

    /* JADX INFO: renamed from: d */
    public final int f1611d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0321b0 f1612e;

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
    public final lt20 f1620m;

    /* JADX INFO: renamed from: n */
    public final AbstractC0354w f1621n;

    /* JADX INFO: renamed from: o */
    public final AbstractC0341l0<?, ?> f1622o;

    /* JADX INFO: renamed from: p */
    public final AbstractC0342m<?> f1623p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC0357z f1624q;

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

    public C0325d0(int[] iArr, Object[] objArr, int i, int i2, InterfaceC0321b0 interfaceC0321b0, boolean z, boolean z2, int[] iArr2, int i3, int i4, lt20 lt20Var, AbstractC0354w abstractC0354w, AbstractC0341l0<?, ?> abstractC0341l0, AbstractC0342m<?> abstractC0342m, InterfaceC0357z interfaceC0357z) {
        this.f1608a = iArr;
        this.f1609b = objArr;
        this.f1610c = i;
        this.f1611d = i2;
        this.f1614g = interfaceC0321b0 instanceof GeneratedMessageLite;
        this.f1615h = z;
        this.f1613f = abstractC0342m != null && abstractC0342m.mo2253e(interfaceC0321b0);
        this.f1616i = z2;
        this.f1617j = iArr2;
        this.f1618k = i3;
        this.f1619l = i4;
        this.f1620m = lt20Var;
        this.f1621n = abstractC0354w;
        this.f1622o = abstractC0341l0;
        this.f1623p = abstractC0342m;
        this.f1612e = interfaceC0321b0;
        this.f1624q = interfaceC0357z;
    }

    /* JADX INFO: renamed from: A */
    public static <T> int m1866A(T t, long j) {
        return ipj0.m137490A(t, j);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m1867B(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static boolean m1868E(Object obj, int i, InterfaceC0335i0 interfaceC0335i0) {
        return interfaceC0335i0.mo1900b(ipj0.m137494E(obj, m1875V(i)));
    }

    /* JADX INFO: renamed from: J */
    public static boolean m1869J(int i) {
        return (i & 268435456) != 0;
    }

    /* JADX INFO: renamed from: K */
    public static List<?> m1870K(Object obj, long j) {
        return (List) ipj0.m137494E(obj, j);
    }

    /* JADX INFO: renamed from: L */
    public static <T> long m1871L(T t, long j) {
        return ipj0.m137492C(t, j);
    }

    /* JADX INFO: renamed from: R */
    public static <T> C0325d0<T> m1872R(Class<T> cls, f5z f5zVar, lt20 lt20Var, AbstractC0354w abstractC0354w, AbstractC0341l0<?, ?> abstractC0341l0, AbstractC0342m<?> abstractC0342m, InterfaceC0357z interfaceC0357z) {
        return f5zVar instanceof gdc0 ? m1874T((gdc0) f5zVar, lt20Var, abstractC0354w, abstractC0341l0, abstractC0342m, interfaceC0357z) : m1873S((u0g0) f5zVar, lt20Var, abstractC0354w, abstractC0341l0, abstractC0342m, interfaceC0357z);
    }

    /* JADX INFO: renamed from: S */
    public static <T> C0325d0<T> m1873S(u0g0 u0g0Var, lt20 lt20Var, AbstractC0354w abstractC0354w, AbstractC0341l0<?, ?> abstractC0341l0, AbstractC0342m<?> abstractC0342m, InterfaceC0357z interfaceC0357z) {
        boolean z = u0g0Var.mo119574c() == ProtoSyntax.PROTO3;
        C0346o[] c0346oArrM191341e = u0g0Var.m191341e();
        if (c0346oArrM191341e.length != 0) {
            C0346o c0346o = c0346oArrM191341e[0];
            throw null;
        }
        int length = c0346oArrM191341e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (c0346oArrM191341e.length > 0) {
            C0346o c0346o2 = c0346oArrM191341e[0];
            throw null;
        }
        int[] iArrM191340d = u0g0Var.m191340d();
        if (iArrM191340d == null) {
            iArrM191340d = f1606r;
        }
        if (c0346oArrM191341e.length > 0) {
            C0346o c0346o3 = c0346oArrM191341e[0];
            throw null;
        }
        int[] iArr2 = f1606r;
        int[] iArr3 = f1606r;
        int[] iArr4 = new int[iArrM191340d.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrM191340d, 0, iArr4, 0, iArrM191340d.length);
        System.arraycopy(iArr2, 0, iArr4, iArrM191340d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrM191340d.length + iArr2.length, iArr3.length);
        return new C0325d0<>(iArr, objArr, 0, 0, u0g0Var.mo119573b(), z, true, iArr4, iArrM191340d.length, iArrM191340d.length + iArr2.length, lt20Var, abstractC0354w, abstractC0341l0, abstractC0342m, interfaceC0357z);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x027a  */
    /* JADX WARN: Code duplicated, block: B:126:0x027e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0298  */
    /* JADX WARN: Code duplicated, block: B:130:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0353  */
    /* JADX WARN: Code duplicated, block: B:180:0x039f  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a9  */
    /* JADX INFO: renamed from: T */
    public static <T> C0325d0<T> m1874T(gdc0 gdc0Var, lt20 lt20Var, AbstractC0354w abstractC0354w, AbstractC0341l0<?, ?> abstractC0341l0, AbstractC0342m<?> abstractC0342m, InterfaceC0357z interfaceC0357z) {
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
        Field fieldM1882n0;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldM1882n1;
        int i25;
        Object obj2;
        Field fieldM1882n2;
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
        boolean z = gdc0Var.mo119574c() == ProtoSyntax.PROTO3;
        String strM125546e = gdc0Var.m125546e();
        int length = strM125546e.length();
        int iCharAt4 = strM125546e.charAt(0);
        if (iCharAt4 >= 55296) {
            int i32 = iCharAt4 & 8191;
            int i33 = 1;
            int i34 = 13;
            while (true) {
                i = i33 + 1;
                cCharAt14 = strM125546e.charAt(i33);
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
        int iCharAt5 = strM125546e.charAt(i);
        if (iCharAt5 >= 55296) {
            int i36 = iCharAt5 & 8191;
            int i37 = 13;
            while (true) {
                i30 = i35 + 1;
                cCharAt13 = strM125546e.charAt(i35);
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
            int iCharAt6 = strM125546e.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    cCharAt8 = strM125546e.charAt(i38);
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
            int iCharAt7 = strM125546e.charAt(i38);
            if (iCharAt7 >= 55296) {
                int i42 = iCharAt7 & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    cCharAt7 = strM125546e.charAt(i41);
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
            iCharAt = strM125546e.charAt(i41);
            if (iCharAt >= 55296) {
                int i45 = iCharAt & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    cCharAt6 = strM125546e.charAt(i44);
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
            int iCharAt8 = strM125546e.charAt(i44);
            if (iCharAt8 >= 55296) {
                int i48 = iCharAt8 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    cCharAt5 = strM125546e.charAt(i47);
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
            int iCharAt9 = strM125546e.charAt(i47);
            if (iCharAt9 >= 55296) {
                int i51 = iCharAt9 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    cCharAt4 = strM125546e.charAt(i50);
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
            iCharAt2 = strM125546e.charAt(i50);
            if (iCharAt2 >= 55296) {
                int i54 = iCharAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    cCharAt3 = strM125546e.charAt(i53);
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
            int iCharAt10 = strM125546e.charAt(i53);
            if (iCharAt10 >= 55296) {
                int i57 = iCharAt10 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    cCharAt2 = strM125546e.charAt(i56);
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
            iCharAt3 = strM125546e.charAt(i56);
            if (iCharAt3 >= 55296) {
                int i60 = iCharAt3 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i5 = i61 + 1;
                    cCharAt = strM125546e.charAt(i61);
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
        Object[] objArrM125545d = gdc0Var.m125545d();
        Class<?> cls = gdc0Var.mo119573b().getClass();
        int[] iArr3 = new int[i4 * 3];
        Object[] objArr = new Object[i4 * 2];
        int i63 = iCharAt2 + iCharAt3;
        int i64 = i63;
        int i65 = iCharAt3;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt11 = strM125546e.charAt(i35);
            int i69 = length;
            if (iCharAt11 >= 55296) {
                int i70 = iCharAt11 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i29 = i71 + 1;
                    cCharAt12 = strM125546e.charAt(i71);
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
            int iCharAt12 = strM125546e.charAt(i14);
            if (iCharAt12 >= 55296) {
                int i74 = iCharAt12 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i27 = i75 + 1;
                    cCharAt11 = strM125546e.charAt(i75);
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
                int iCharAt13 = strM125546e.charAt(i15);
                char c = 55296;
                if (iCharAt13 >= 55296) {
                    int i81 = iCharAt13 & 8191;
                    int i82 = 13;
                    while (true) {
                        i26 = i80 + 1;
                        cCharAt10 = strM125546e.charAt(i80);
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
                    objArr[((i67 / 3) * 2) + 1] = objArrM125545d[i2];
                } else {
                    if (i83 == 12 && (i77 & 1) == 1) {
                        i23 = i2 + 1;
                        objArr[((i67 / 3) * 2) + 1] = objArrM125545d[i2];
                    }
                    i24 = i84 * 2;
                    obj = objArrM125545d[i24];
                    if (obj instanceof Field) {
                        fieldM1882n1 = (Field) obj;
                    } else {
                        fieldM1882n1 = m1882n0(cls, (String) obj);
                        objArrM125545d[i24] = fieldM1882n1;
                    }
                    int i85 = i80;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM1882n1);
                    i25 = i24 + 1;
                    obj2 = objArrM125545d[i25];
                    if (obj2 instanceof Field) {
                        fieldM1882n2 = (Field) obj2;
                    } else {
                        fieldM1882n2 = m1882n0(cls, (String) obj2);
                        objArrM125545d[i25] = fieldM1882n2;
                    }
                    strM125546e = strM125546e;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM1882n2);
                    i35 = i85;
                    i21 = iObjectFieldOffset3;
                    i19 = 0;
                    i16 = i3;
                    i20 = i2;
                    iCharAt = iCharAt;
                }
                i2 = i23;
                i24 = i84 * 2;
                obj = objArrM125545d[i24];
                if (obj instanceof Field) {
                    fieldM1882n1 = (Field) obj;
                } else {
                    fieldM1882n1 = m1882n0(cls, (String) obj);
                    objArrM125545d[i24] = fieldM1882n1;
                }
                int i86 = i80;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM1882n1);
                i25 = i24 + 1;
                obj2 = objArrM125545d[i25];
                if (obj2 instanceof Field) {
                    fieldM1882n2 = (Field) obj2;
                } else {
                    fieldM1882n2 = m1882n0(cls, (String) obj2);
                    objArrM125545d[i25] = fieldM1882n2;
                }
                strM125546e = strM125546e;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM1882n2);
                i35 = i86;
                i21 = iObjectFieldOffset4;
                i19 = 0;
                i16 = i3;
                i20 = i2;
                iCharAt = iCharAt;
            } else {
                int i87 = i2 + 1;
                Field fieldM1882n3 = m1882n0(cls, (String) objArrM125545d[i2]);
                if (i78 == 9 || i78 == 17) {
                    i16 = i3;
                    objArr[((i67 / 3) * 2) + 1] = fieldM1882n3.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i16 = i3;
                        i22 = i2 + 2;
                        objArr[((i67 / 3) * 2) + 1] = objArrM125545d[i87];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i16 = i3;
                        if ((i77 & 1) == 1) {
                            i22 = i2 + 2;
                            objArr[((i67 / 3) * 2) + 1] = objArrM125545d[i87];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1882n3);
                        if ((i77 & 1) == 1 || i78 > 17) {
                            i18 = i15;
                            iObjectFieldOffset2 = 0;
                            i19 = 0;
                        } else {
                            int i88 = i15 + 1;
                            int iCharAt14 = strM125546e.charAt(i15);
                            if (iCharAt14 >= 55296) {
                                int i89 = iCharAt14 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i18 = i88 + 1;
                                    cCharAt9 = strM125546e.charAt(i88);
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
                            Object obj3 = objArrM125545d[i91];
                            if (obj3 instanceof Field) {
                                fieldM1882n0 = (Field) obj3;
                            } else {
                                fieldM1882n0 = m1882n0(cls, (String) obj3);
                                objArrM125545d[i91] = fieldM1882n0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM1882n0);
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
                            objArr[i93] = objArrM125545d[i87];
                            if ((iCharAt12 & 2048) != 0) {
                                i17 = i2 + 3;
                                objArr[i93 + 1] = objArrM125545d[i94];
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1882n3);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1882n3);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM1882n3);
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
            iArr4[i95] = ((iCharAt12 & 512) != 0 ? 536870912 : 0) | ((iCharAt12 & 256) != 0 ? 268435456 : 0) | (i78 << 20) | i21;
            i67 += 3;
            iArr4[i96] = (i19 << 20) | i97;
            iCharAt = iCharAt;
            iCharAt4 = i77;
            length = i69;
            iArr3 = iArr4;
            i31 = i13;
            strM125546e = strM125546e;
            i2 = i20;
            i3 = i16;
        }
        return new C0325d0<>(iArr3, objArr, iCharAt, i3, gdc0Var.mo119573b(), z, false, iArr, iCharAt3, i63, lt20Var, abstractC0354w, abstractC0341l0, abstractC0342m, interfaceC0357z);
    }

    /* JADX INFO: renamed from: V */
    public static long m1875V(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: W */
    public static <T> boolean m1876W(T t, long j) {
        return ((Boolean) ipj0.m137494E(t, j)).booleanValue();
    }

    /* JADX INFO: renamed from: X */
    public static <T> double m1877X(T t, long j) {
        return ((Double) ipj0.m137494E(t, j)).doubleValue();
    }

    /* JADX INFO: renamed from: Y */
    public static <T> float m1878Y(T t, long j) {
        return ((Float) ipj0.m137494E(t, j)).floatValue();
    }

    /* JADX INFO: renamed from: Z */
    public static <T> int m1879Z(T t, long j) {
        return ((Integer) ipj0.m137494E(t, j)).intValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static <T> long m1880a0(T t, long j) {
        return ((Long) ipj0.m137494E(t, j)).longValue();
    }

    /* JADX INFO: renamed from: l */
    public static <T> boolean m1881l(T t, long j) {
        return ipj0.m137529r(t, j);
    }

    /* JADX INFO: renamed from: n0 */
    public static Field m1882n0(Class<?> cls, String str) {
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

    /* JADX INFO: renamed from: o */
    public static <T> double m1883o(T t, long j) {
        return ipj0.m137536y(t, j);
    }

    /* JADX INFO: renamed from: r0 */
    public static int m1884r0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: s */
    public static <T> float m1885s(T t, long j) {
        return ipj0.m137537z(t, j);
    }

    /* JADX INFO: renamed from: w */
    public static C0343m0 m1886w(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C0343m0 c0343m0 = generatedMessageLite.unknownFields;
        if (c0343m0 != C0343m0.m2261e()) {
            return c0343m0;
        }
        C0343m0 c0343m0M2265l = C0343m0.m2265l();
        generatedMessageLite.unknownFields = c0343m0M2265l;
        return c0343m0M2265l;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m1887C(T t, int i) {
        boolean zEquals;
        if (!this.f1615h) {
            int iM1915i0 = m1915i0(i);
            return (ipj0.m137490A(t, (long) (iM1915i0 & 1048575)) & (1 << (iM1915i0 >>> 20))) != 0;
        }
        int iM1930s0 = m1930s0(i);
        long jM1875V = m1875V(iM1930s0);
        switch (m1884r0(iM1930s0)) {
            case 0:
                return ipj0.m137536y(t, jM1875V) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            case 1:
                return ipj0.m137537z(t, jM1875V) != 0.0f;
            case 2:
                return ipj0.m137492C(t, jM1875V) != 0;
            case 3:
                return ipj0.m137492C(t, jM1875V) != 0;
            case 4:
                return ipj0.m137490A(t, jM1875V) != 0;
            case 5:
                return ipj0.m137492C(t, jM1875V) != 0;
            case 6:
                return ipj0.m137490A(t, jM1875V) != 0;
            case 7:
                return ipj0.m137529r(t, jM1875V);
            case 8:
                Object objM137494E = ipj0.m137494E(t, jM1875V);
                if (objM137494E instanceof String) {
                    zEquals = ((String) objM137494E).isEmpty();
                } else {
                    if (!(objM137494E instanceof ByteString)) {
                        x9g0.m207497a();
                        return false;
                    }
                    zEquals = ByteString.EMPTY.equals(objM137494E);
                }
                break;
            case 9:
                return ipj0.m137494E(t, jM1875V) != null;
            case 10:
                zEquals = ByteString.EMPTY.equals(ipj0.m137494E(t, jM1875V));
                break;
            case 11:
                return ipj0.m137490A(t, jM1875V) != 0;
            case 12:
                return ipj0.m137490A(t, jM1875V) != 0;
            case 13:
                return ipj0.m137490A(t, jM1875V) != 0;
            case 14:
                return ipj0.m137492C(t, jM1875V) != 0;
            case 15:
                return ipj0.m137490A(t, jM1875V) != 0;
            case 16:
                return ipj0.m137492C(t, jM1875V) != 0;
            case 17:
                return ipj0.m137494E(t, jM1875V) != null;
            default:
                x9g0.m207497a();
                return false;
        }
        return !zEquals;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m1888D(T t, int i, int i2, int i3) {
        if (this.f1615h) {
            return m1887C(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public final <N> boolean m1889F(Object obj, int i, int i2) {
        List list = (List) ipj0.m137494E(obj, m1875V(i));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC0335i0 interfaceC0335i0M1935v = m1935v(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!interfaceC0335i0M1935v.mo1900b(list.get(i3))) {
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
    public final boolean m1890G(T t, int i, int i2) {
        Map<?, ?> mapMo1811g = this.f1624q.mo1811g(ipj0.m137494E(t, m1875V(i)));
        if (mapMo1811g.isEmpty()) {
            return true;
        }
        if (this.f1624q.mo1806b(m1933u(i2)).f1764c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? M109403d = 0;
        for (Object obj : mapMo1811g.values()) {
            if (M109403d == 0) {
                M109403d = M109403d;
                M109403d = cza0.m109400a().m109403d(obj.getClass());
            }
            M109403d = M109403d;
            if (!M109403d.mo1900b(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m1891H(T t, T t2, int i) {
        long jM1915i0 = m1915i0(i) & 1048575;
        return ipj0.m137490A(t, jM1915i0) == ipj0.m137490A(t2, jM1915i0);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m1892I(T t, int i, int i2) {
        return ipj0.m137490A(t, (long) (m1915i0(i2) & 1048575)) == i;
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
    public final <UT, UB, ET extends C0347p.b<ET>> void m1893M(AbstractC0341l0<UT, UB> abstractC0341l0, AbstractC0342m<ET> abstractC0342m, T t, InterfaceC0333h0 interfaceC0333h0, C0340l c0340l) throws Throwable {
        int i;
        AbstractC0342m<ET> abstractC0342m2;
        Object objMo2250b;
        Object obj;
        int i2;
        int i3;
        T t2 = t;
        C0340l c0340l2 = c0340l;
        Object objM1927q = null;
        C0347p c0347pMo2252d = null;
        while (true) {
            try {
                int iMo1996o = interfaceC0333h0.mo1996o();
                int iM1911g0 = m1911g0(iMo1996o);
                if (iM1911g0 < 0) {
                    if (iMo1996o == Integer.MAX_VALUE) {
                        for (int i4 = this.f1618k; i4 < this.f1619l; i4++) {
                            objM1927q = m1927q(t2, this.f1617j[i4], objM1927q, abstractC0341l0);
                        }
                        if (objM1927q == null) {
                            return;
                        }
                    } else {
                        if (this.f1613f) {
                            abstractC0342m2 = abstractC0342m;
                            objMo2250b = abstractC0342m2.mo2250b(c0340l2, this.f1612e, iMo1996o);
                        } else {
                            abstractC0342m2 = abstractC0342m;
                            objMo2250b = null;
                        }
                        if (objMo2250b != null) {
                            if (c0347pMo2252d == null) {
                                try {
                                    c0347pMo2252d = abstractC0342m.mo2252d(t);
                                } catch (Throwable th) {
                                    th = th;
                                    for (i = this.f1618k; i < this.f1619l; i++) {
                                        objM1927q = m1927q(t2, this.f1617j[i], objM1927q, abstractC0341l0);
                                    }
                                    if (objM1927q != null) {
                                        abstractC0341l0.mo2243o(t2, objM1927q);
                                    }
                                    throw th;
                                }
                            }
                            C0347p c0347p = c0347pMo2252d;
                            objM1927q = abstractC0342m2.mo2255g(interfaceC0333h0, objMo2250b, c0340l2, c0347p, objM1927q, abstractC0341l0);
                            c0347pMo2252d = c0347p;
                        } else {
                            obj = objM1927q;
                            try {
                                if (abstractC0341l0.mo2245q(interfaceC0333h0)) {
                                    if (!interfaceC0333h0.mo1999r()) {
                                        objM1927q = obj;
                                    }
                                    objM1927q = obj;
                                } else {
                                    objM1927q = obj == null ? abstractC0341l0.mo2234f(t2) : obj;
                                    if (abstractC0341l0.m2241m(objM1927q, interfaceC0333h0)) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objM1927q = obj;
                                while (i < this.f1619l) {
                                    objM1927q = m1927q(t2, this.f1617j[i], objM1927q, abstractC0341l0);
                                }
                                if (objM1927q != null) {
                                    abstractC0341l0.mo2243o(t2, objM1927q);
                                }
                                throw th;
                            }
                        }
                    }
                    abstractC0341l0.mo2243o(t2, objM1927q);
                }
                InterfaceC0333h0 interfaceC0333h1 = interfaceC0333h0;
                obj = objM1927q;
                int iM1930s0 = m1930s0(iM1911g0);
                try {
                    switch (m1884r0(iM1930s0)) {
                        case 0:
                            ipj0.m137505P(t2, m1875V(iM1930s0), interfaceC0333h1.readDouble());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 1:
                            ipj0.m137506Q(t2, m1875V(iM1930s0), interfaceC0333h1.readFloat());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 2:
                            ipj0.m137508S(t2, m1875V(iM1930s0), interfaceC0333h1.mo2002u());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 3:
                            ipj0.m137508S(t2, m1875V(iM1930s0), interfaceC0333h1.mo1987j());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 4:
                            ipj0.m137507R(t2, m1875V(iM1930s0), interfaceC0333h1.mo1947D());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 5:
                            ipj0.m137508S(t2, m1875V(iM1930s0), interfaceC0333h1.mo2004w());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 6:
                            ipj0.m137507R(t2, m1875V(iM1930s0), interfaceC0333h1.mo1951H());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 7:
                            ipj0.m137499J(t2, m1875V(iM1930s0), interfaceC0333h1.mo2006y());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 8:
                            m1920l0(t2, iM1930s0, interfaceC0333h1);
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 9:
                            if (m1887C(t2, iM1911g0)) {
                                ipj0.m137509T(t2, m1875V(iM1930s0), C0350s.m2346h(ipj0.m137494E(t2, m1875V(iM1930s0)), interfaceC0333h1.mo2003v(m1935v(iM1911g0), c0340l2)));
                            } else {
                                ipj0.m137509T(t2, m1875V(iM1930s0), interfaceC0333h1.mo2003v(m1935v(iM1911g0), c0340l2));
                                m1924o0(t2, iM1911g0);
                            }
                            objM1927q = obj;
                            break;
                        case 10:
                            ipj0.m137509T(t2, m1875V(iM1930s0), interfaceC0333h1.mo1981g());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 11:
                            ipj0.m137507R(t2, m1875V(iM1930s0), interfaceC0333h1.mo1973c());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 12:
                            int iMo1975d = interfaceC0333h1.mo1975d();
                            C0350s.e eVarM1931t = m1931t(iM1911g0);
                            if (eVarM1931t == null || eVarM1931t.mo1619a(iMo1975d)) {
                                ipj0.m137507R(t2, m1875V(iM1930s0), iMo1975d);
                                m1924o0(t2, iM1911g0);
                                objM1927q = obj;
                            } else {
                                objM1927q = C0337j0.m2151L(iMo1996o, iMo1975d, obj, abstractC0341l0);
                            }
                            break;
                        case 13:
                            ipj0.m137507R(t2, m1875V(iM1930s0), interfaceC0333h1.mo1957N());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 14:
                            ipj0.m137508S(t2, m1875V(iM1930s0), interfaceC0333h1.mo1971b());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 15:
                            ipj0.m137507R(t2, m1875V(iM1930s0), interfaceC0333h1.mo1977e());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 16:
                            ipj0.m137508S(t2, m1875V(iM1930s0), interfaceC0333h1.mo1954K());
                            m1924o0(t2, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 17:
                            if (m1887C(t2, iM1911g0)) {
                                ipj0.m137509T(t2, m1875V(iM1930s0), C0350s.m2346h(ipj0.m137494E(t2, m1875V(iM1930s0)), interfaceC0333h1.mo1983h(m1935v(iM1911g0), c0340l2)));
                            } else {
                                ipj0.m137509T(t2, m1875V(iM1930s0), interfaceC0333h1.mo1983h(m1935v(iM1911g0), c0340l2));
                                m1924o0(t2, iM1911g0);
                            }
                            objM1927q = obj;
                            break;
                        case 18:
                            interfaceC0333h1.mo2001t(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            objM1927q = obj;
                            break;
                        case 19:
                            interfaceC0333h1.mo1998q(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            objM1927q = obj;
                            break;
                        case 20:
                            interfaceC0333h1.mo1944A(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            objM1927q = obj;
                            break;
                        case 21:
                            interfaceC0333h1.mo2007z(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            objM1927q = obj;
                            break;
                        case 22:
                            interfaceC0333h1.mo1993m(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            objM1927q = obj;
                            break;
                        case 23:
                            interfaceC0333h1.mo1949F(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            objM1927q = obj;
                            break;
                        case 24:
                            interfaceC0333h1.mo1995n(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            objM1927q = obj;
                            break;
                        case 25:
                            interfaceC0333h1.mo1979f(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            objM1927q = obj;
                            break;
                        case 26:
                            m1922m0(t2, iM1930s0, interfaceC0333h1);
                            objM1927q = obj;
                            break;
                        case 27:
                            T t3 = t2;
                            try {
                                m1919k0(t3, iM1930s0, interfaceC0333h1, m1935v(iM1911g0), c0340l);
                                t2 = t3;
                                c0340l2 = c0340l;
                                objM1927q = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                t2 = t3;
                                c0340l2 = c0340l;
                                objM1927q = obj;
                                if (!abstractC0341l0.mo2245q(interfaceC0333h1)) {
                                    if (objM1927q == null) {
                                        objM1927q = abstractC0341l0.mo2234f(t2);
                                    }
                                    if (!abstractC0341l0.m2241m(objM1927q, interfaceC0333h1)) {
                                        for (i3 = this.f1618k; i3 < this.f1619l; i3++) {
                                            objM1927q = m1927q(t2, this.f1617j[i3], objM1927q, abstractC0341l0);
                                        }
                                        if (objM1927q == null) {
                                            return;
                                        }
                                        abstractC0341l0.mo2243o(t2, objM1927q);
                                    }
                                } else if (!interfaceC0333h1.mo1999r()) {
                                    for (i2 = this.f1618k; i2 < this.f1619l; i2++) {
                                        objM1927q = m1927q(t2, this.f1617j[i2], objM1927q, abstractC0341l0);
                                    }
                                    if (objM1927q == null) {
                                        return;
                                    }
                                    abstractC0341l0.mo2243o(t2, objM1927q);
                                }
                            }
                            break;
                        case 28:
                            interfaceC0333h1.mo2000s(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 29:
                            interfaceC0333h1.mo1950G(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 30:
                            List<Integer> listMo2370e = this.f1621n.mo2370e(t2, m1875V(iM1930s0));
                            interfaceC0333h1.mo1945B(listMo2370e);
                            objM1927q = C0337j0.m2140A(iMo1996o, listMo2370e, m1931t(iM1911g0), obj, abstractC0341l0);
                            c0340l2 = c0340l;
                            break;
                        case 31:
                            interfaceC0333h1.mo2005x(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 32:
                            interfaceC0333h1.mo1991l(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 33:
                            interfaceC0333h1.mo1985i(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 34:
                            interfaceC0333h1.mo1969a(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 35:
                            interfaceC0333h1.mo2001t(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 36:
                            interfaceC0333h1.mo1998q(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 37:
                            interfaceC0333h1.mo1944A(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 38:
                            interfaceC0333h1.mo2007z(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 39:
                            interfaceC0333h1.mo1993m(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 40:
                            interfaceC0333h1.mo1949F(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 41:
                            interfaceC0333h1.mo1995n(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 42:
                            interfaceC0333h1.mo1979f(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 43:
                            interfaceC0333h1.mo1950G(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 44:
                            List<Integer> listMo2370e2 = this.f1621n.mo2370e(t2, m1875V(iM1930s0));
                            interfaceC0333h1.mo1945B(listMo2370e2);
                            objM1927q = C0337j0.m2140A(iMo1996o, listMo2370e2, m1931t(iM1911g0), obj, abstractC0341l0);
                            c0340l2 = c0340l;
                            break;
                        case 45:
                            interfaceC0333h1.mo2005x(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 46:
                            interfaceC0333h1.mo1991l(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 47:
                            interfaceC0333h1.mo1985i(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                            c0340l2 = c0340l;
                            objM1927q = obj;
                            break;
                        case 48:
                            try {
                                interfaceC0333h1.mo1969a(this.f1621n.mo2370e(t2, m1875V(iM1930s0)));
                                c0340l2 = c0340l;
                                objM1927q = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                c0340l2 = c0340l;
                                objM1927q = obj;
                                if (!abstractC0341l0.mo2245q(interfaceC0333h1)) {
                                    if (objM1927q == null) {
                                        objM1927q = abstractC0341l0.mo2234f(t2);
                                    }
                                    if (!abstractC0341l0.m2241m(objM1927q, interfaceC0333h1)) {
                                        while (i3 < this.f1619l) {
                                            objM1927q = m1927q(t2, this.f1617j[i3], objM1927q, abstractC0341l0);
                                        }
                                        if (objM1927q == null) {
                                            return;
                                        }
                                        abstractC0341l0.mo2243o(t2, objM1927q);
                                    }
                                } else if (!interfaceC0333h1.mo1999r()) {
                                    while (i2 < this.f1619l) {
                                        objM1927q = m1927q(t2, this.f1617j[i2], objM1927q, abstractC0341l0);
                                    }
                                    if (objM1927q == null) {
                                        return;
                                    }
                                    abstractC0341l0.mo2243o(t2, objM1927q);
                                }
                            }
                            break;
                        case 49:
                            try {
                                try {
                                    m1917j0(t, m1875V(iM1930s0), interfaceC0333h0, m1935v(iM1911g0), c0340l);
                                    t2 = t;
                                    c0340l2 = c0340l;
                                    objM1927q = obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    t2 = t;
                                    objM1927q = obj;
                                    while (i < this.f1619l) {
                                        objM1927q = m1927q(t2, this.f1617j[i], objM1927q, abstractC0341l0);
                                    }
                                    if (objM1927q != null) {
                                        abstractC0341l0.mo2243o(t2, objM1927q);
                                    }
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                t2 = t;
                                interfaceC0333h1 = interfaceC0333h0;
                                objM1927q = obj;
                                c0340l2 = c0340l;
                                if (!abstractC0341l0.mo2245q(interfaceC0333h1)) {
                                    if (objM1927q == null) {
                                        objM1927q = abstractC0341l0.mo2234f(t2);
                                    }
                                    if (!abstractC0341l0.m2241m(objM1927q, interfaceC0333h1)) {
                                        while (i3 < this.f1619l) {
                                            objM1927q = m1927q(t2, this.f1617j[i3], objM1927q, abstractC0341l0);
                                        }
                                        if (objM1927q == null) {
                                            return;
                                        }
                                        abstractC0341l0.mo2243o(t2, objM1927q);
                                    }
                                } else if (!interfaceC0333h1.mo1999r()) {
                                    while (i2 < this.f1619l) {
                                        objM1927q = m1927q(t2, this.f1617j[i2], objM1927q, abstractC0341l0);
                                    }
                                    if (objM1927q == null) {
                                        return;
                                    }
                                    abstractC0341l0.mo2243o(t2, objM1927q);
                                }
                            }
                            break;
                        case 50:
                            try {
                                m1894N(t2, iM1911g0, m1933u(iM1911g0), c0340l2, interfaceC0333h0);
                                t2 = t;
                                c0340l2 = c0340l;
                                objM1927q = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                t2 = t;
                                interfaceC0333h1 = interfaceC0333h0;
                                c0340l2 = c0340l;
                                objM1927q = obj;
                                if (!abstractC0341l0.mo2245q(interfaceC0333h1)) {
                                    if (objM1927q == null) {
                                        objM1927q = abstractC0341l0.mo2234f(t2);
                                    }
                                    if (!abstractC0341l0.m2241m(objM1927q, interfaceC0333h1)) {
                                        while (i3 < this.f1619l) {
                                            objM1927q = m1927q(t2, this.f1617j[i3], objM1927q, abstractC0341l0);
                                        }
                                        if (objM1927q == null) {
                                            return;
                                        }
                                        abstractC0341l0.mo2243o(t2, objM1927q);
                                    }
                                } else if (!interfaceC0333h1.mo1999r()) {
                                    while (i2 < this.f1619l) {
                                        objM1927q = m1927q(t2, this.f1617j[i2], objM1927q, abstractC0341l0);
                                    }
                                    if (objM1927q == null) {
                                        return;
                                    }
                                    abstractC0341l0.mo2243o(t2, objM1927q);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                t2 = t;
                                objM1927q = obj;
                                while (i < this.f1619l) {
                                    objM1927q = m1927q(t2, this.f1617j[i], objM1927q, abstractC0341l0);
                                }
                                if (objM1927q != null) {
                                    abstractC0341l0.mo2243o(t2, objM1927q);
                                }
                                throw th;
                            }
                            break;
                        case 51:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Double.valueOf(interfaceC0333h1.readDouble()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 52:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Float.valueOf(interfaceC0333h1.readFloat()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 53:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Long.valueOf(interfaceC0333h1.mo2002u()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 54:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Long.valueOf(interfaceC0333h1.mo1987j()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 55:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Integer.valueOf(interfaceC0333h1.mo1947D()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 56:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Long.valueOf(interfaceC0333h1.mo2004w()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 57:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Integer.valueOf(interfaceC0333h1.mo1951H()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 58:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Boolean.valueOf(interfaceC0333h1.mo2006y()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 59:
                            m1920l0(t2, iM1930s0, interfaceC0333h1);
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 60:
                            if (m1892I(t2, iMo1996o, iM1911g0)) {
                                ipj0.m137509T(t2, m1875V(iM1930s0), C0350s.m2346h(ipj0.m137494E(t2, m1875V(iM1930s0)), interfaceC0333h1.mo2003v(m1935v(iM1911g0), c0340l2)));
                            } else {
                                ipj0.m137509T(t2, m1875V(iM1930s0), interfaceC0333h1.mo2003v(m1935v(iM1911g0), c0340l2));
                                m1924o0(t2, iM1911g0);
                            }
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 61:
                            ipj0.m137509T(t2, m1875V(iM1930s0), interfaceC0333h1.mo1981g());
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 62:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Integer.valueOf(interfaceC0333h1.mo1973c()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 63:
                            int iMo1975d2 = interfaceC0333h1.mo1975d();
                            C0350s.e eVarM1931t2 = m1931t(iM1911g0);
                            if (eVarM1931t2 == null || eVarM1931t2.mo1619a(iMo1975d2)) {
                                ipj0.m137509T(t2, m1875V(iM1930s0), Integer.valueOf(iMo1975d2));
                                m1926p0(t2, iMo1996o, iM1911g0);
                                objM1927q = obj;
                            } else {
                                objM1927q = C0337j0.m2151L(iMo1996o, iMo1975d2, obj, abstractC0341l0);
                            }
                            break;
                        case 64:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Integer.valueOf(interfaceC0333h1.mo1957N()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 65:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Long.valueOf(interfaceC0333h1.mo1971b()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 66:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Integer.valueOf(interfaceC0333h1.mo1977e()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 67:
                            ipj0.m137509T(t2, m1875V(iM1930s0), Long.valueOf(interfaceC0333h1.mo1954K()));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        case 68:
                            ipj0.m137509T(t2, m1875V(iM1930s0), interfaceC0333h1.mo1983h(m1935v(iM1911g0), c0340l2));
                            m1926p0(t2, iMo1996o, iM1911g0);
                            objM1927q = obj;
                            break;
                        default:
                            objM1927q = obj == null ? abstractC0341l0.mo2242n() : obj;
                            try {
                                if (!abstractC0341l0.m2241m(objM1927q, interfaceC0333h1)) {
                                    for (int i5 = this.f1618k; i5 < this.f1619l; i5++) {
                                        objM1927q = m1927q(t2, this.f1617j[i5], objM1927q, abstractC0341l0);
                                    }
                                    if (objM1927q == null) {
                                        return;
                                    }
                                    abstractC0341l0.mo2243o(t2, objM1927q);
                                }
                                break;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                if (!abstractC0341l0.mo2245q(interfaceC0333h1)) {
                                    if (objM1927q == null) {
                                        objM1927q = abstractC0341l0.mo2234f(t2);
                                    }
                                    if (!abstractC0341l0.m2241m(objM1927q, interfaceC0333h1)) {
                                        while (i3 < this.f1619l) {
                                            objM1927q = m1927q(t2, this.f1617j[i3], objM1927q, abstractC0341l0);
                                        }
                                        if (objM1927q == null) {
                                            return;
                                        }
                                        abstractC0341l0.mo2243o(t2, objM1927q);
                                    }
                                } else if (!interfaceC0333h1.mo1999r()) {
                                    while (i2 < this.f1619l) {
                                        objM1927q = m1927q(t2, this.f1617j[i2], objM1927q, abstractC0341l0);
                                    }
                                    if (objM1927q == null) {
                                        return;
                                    }
                                    abstractC0341l0.mo2243o(t2, objM1927q);
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
            objM1927q = m1927q(t2, this.f1617j[i6], objM1927q, abstractC0341l0);
        }
        if (objM1927q == null) {
            return;
        }
        abstractC0341l0.mo2243o(t2, objM1927q);
    }

    /* JADX INFO: renamed from: N */
    public final <K, V> void m1894N(Object obj, int i, Object obj2, C0340l c0340l, InterfaceC0333h0 interfaceC0333h0) throws IOException {
        long jM1875V = m1875V(m1930s0(i));
        Object objM137494E = ipj0.m137494E(obj, jM1875V);
        InterfaceC0357z interfaceC0357z = this.f1624q;
        if (objM137494E == null) {
            objM137494E = interfaceC0357z.mo1810f(obj2);
            ipj0.m137509T(obj, jM1875V, objM137494E);
        } else if (interfaceC0357z.mo1812h(objM137494E)) {
            Object objMo1810f = this.f1624q.mo1810f(obj2);
            this.f1624q.mo1805a(objMo1810f, objM137494E);
            ipj0.m137509T(obj, jM1875V, objMo1810f);
            objM137494E = objMo1810f;
        }
        interfaceC0333h0.mo1953J(this.f1624q.mo1809e(objM137494E), this.f1624q.mo1806b(obj2), c0340l);
    }

    /* JADX INFO: renamed from: O */
    public final void m1895O(T t, T t2, int i) {
        long jM1875V = m1875V(m1930s0(i));
        if (m1887C(t2, i)) {
            Object objM137494E = ipj0.m137494E(t, jM1875V);
            Object objM137494E2 = ipj0.m137494E(t2, jM1875V);
            if (objM137494E != null && objM137494E2 != null) {
                ipj0.m137509T(t, jM1875V, C0350s.m2346h(objM137494E, objM137494E2));
                m1924o0(t, i);
            } else if (objM137494E2 != null) {
                ipj0.m137509T(t, jM1875V, objM137494E2);
                m1924o0(t, i);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m1896P(T t, T t2, int i) {
        int iM1930s0 = m1930s0(i);
        int iM1898U = m1898U(i);
        long jM1875V = m1875V(iM1930s0);
        if (m1892I(t2, iM1898U, i)) {
            Object objM137494E = ipj0.m137494E(t, jM1875V);
            Object objM137494E2 = ipj0.m137494E(t2, jM1875V);
            if (objM137494E != null && objM137494E2 != null) {
                ipj0.m137509T(t, jM1875V, C0350s.m2346h(objM137494E, objM137494E2));
                m1926p0(t, iM1898U, i);
            } else if (objM137494E2 != null) {
                ipj0.m137509T(t, jM1875V, objM137494E2);
                m1926p0(t, iM1898U, i);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m1897Q(T t, T t2, int i) {
        int iM1930s0 = m1930s0(i);
        long jM1875V = m1875V(iM1930s0);
        int iM1898U = m1898U(i);
        switch (m1884r0(iM1930s0)) {
            case 0:
                if (m1887C(t2, i)) {
                    ipj0.m137505P(t, jM1875V, ipj0.m137536y(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 1:
                if (m1887C(t2, i)) {
                    ipj0.m137506Q(t, jM1875V, ipj0.m137537z(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 2:
                if (m1887C(t2, i)) {
                    ipj0.m137508S(t, jM1875V, ipj0.m137492C(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 3:
                if (m1887C(t2, i)) {
                    ipj0.m137508S(t, jM1875V, ipj0.m137492C(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 4:
                if (m1887C(t2, i)) {
                    ipj0.m137507R(t, jM1875V, ipj0.m137490A(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 5:
                if (m1887C(t2, i)) {
                    ipj0.m137508S(t, jM1875V, ipj0.m137492C(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 6:
                if (m1887C(t2, i)) {
                    ipj0.m137507R(t, jM1875V, ipj0.m137490A(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 7:
                if (m1887C(t2, i)) {
                    ipj0.m137499J(t, jM1875V, ipj0.m137529r(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 8:
                if (m1887C(t2, i)) {
                    ipj0.m137509T(t, jM1875V, ipj0.m137494E(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 9:
                m1895O(t, t2, i);
                break;
            case 10:
                if (m1887C(t2, i)) {
                    ipj0.m137509T(t, jM1875V, ipj0.m137494E(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 11:
                if (m1887C(t2, i)) {
                    ipj0.m137507R(t, jM1875V, ipj0.m137490A(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 12:
                if (m1887C(t2, i)) {
                    ipj0.m137507R(t, jM1875V, ipj0.m137490A(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 13:
                if (m1887C(t2, i)) {
                    ipj0.m137507R(t, jM1875V, ipj0.m137490A(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 14:
                if (m1887C(t2, i)) {
                    ipj0.m137508S(t, jM1875V, ipj0.m137492C(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 15:
                if (m1887C(t2, i)) {
                    ipj0.m137507R(t, jM1875V, ipj0.m137490A(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 16:
                if (m1887C(t2, i)) {
                    ipj0.m137508S(t, jM1875V, ipj0.m137492C(t2, jM1875V));
                    m1924o0(t, i);
                }
                break;
            case 17:
                m1895O(t, t2, i);
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
                this.f1621n.mo2369d(t, t2, jM1875V);
                break;
            case 50:
                C0337j0.m2145F(this.f1624q, t, t2, jM1875V);
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
                if (m1892I(t2, iM1898U, i)) {
                    ipj0.m137509T(t, jM1875V, ipj0.m137494E(t2, jM1875V));
                    m1926p0(t, iM1898U, i);
                }
                break;
            case 60:
                m1896P(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m1892I(t2, iM1898U, i)) {
                    ipj0.m137509T(t, jM1875V, ipj0.m137494E(t2, jM1875V));
                    m1926p0(t, iM1898U, i);
                }
                break;
            case 68:
                m1896P(t, t2, i);
                break;
        }
    }

    /* JADX INFO: renamed from: U */
    public final int m1898U(int i) {
        return this.f1608a[i];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: a */
    public void mo1899a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f1608a.length; i += 3) {
            m1897Q(t, t2, i);
        }
        if (this.f1615h) {
            return;
        }
        C0337j0.m2146G(this.f1622o, t, t2);
        if (this.f1613f) {
            C0337j0.m2144E(this.f1623p, t, t2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:58:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0090 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: b */
    public final boolean mo1900b(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f1618k; i4++) {
            int i5 = this.f1617j[i4];
            int iM1898U = m1898U(i5);
            int iM1930s0 = m1930s0(i5);
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
            if (m1869J(iM1930s0) && !m1888D(t, i5, i3, i)) {
                return false;
            }
            int iM1884r0 = m1884r0(iM1930s0);
            if (iM1884r0 == 9 || iM1884r0 == 17) {
                if (m1888D(t, i5, i3, i) && !m1868E(t, iM1930s0, m1935v(i5))) {
                    return false;
                }
            } else if (iM1884r0 == 27) {
                if (!m1889F(t, iM1930s0, i5)) {
                    return false;
                }
            } else if (iM1884r0 == 60 || iM1884r0 == 68) {
                if (m1892I(t, iM1898U, i5) && !m1868E(t, iM1930s0, m1935v(i5))) {
                    return false;
                }
            } else if (iM1884r0 != 49) {
                if (iM1884r0 == 50 && !m1890G(t, iM1930s0, i5)) {
                    return false;
                }
            } else if (!m1889F(t, iM1930s0, i5)) {
                return false;
            }
        }
        return !this.f1613f || this.f1623p.mo2251c(t).m2312p();
    }

    /* JADX INFO: renamed from: b0 */
    public final <K, V> int m1901b0(T t, byte[] bArr, int i, int i2, int i3, long j, C0324d.b bVar) throws IOException {
        Unsafe unsafe = f1607s;
        Object objM1933u = m1933u(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f1624q.mo1812h(object)) {
            Object objMo1810f = this.f1624q.mo1810f(objM1933u);
            this.f1624q.mo1805a(objMo1810f, object);
            unsafe.putObject(t, j, objMo1810f);
            object = objMo1810f;
        }
        return m1921m(bArr, i, i2, this.f1624q.mo1806b(objM1933u), this.f1624q.mo1809e(object), bVar);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: c */
    public void mo1902c(T t, Writer writer) throws IOException {
        if (writer.mo1755G() == Writer.FieldOrder.DESCENDING) {
            m1936v0(t, writer);
        } else if (this.f1615h) {
            m1934u0(t, writer);
        } else {
            m1932t0(t, writer);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final int m1903c0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C0324d.b bVar) throws IOException {
        Object object;
        Unsafe unsafe = f1607s;
        long j2 = this.f1608a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(C0324d.m1843d(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(C0324d.m1851l(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM1837L = C0324d.m1837L(bArr, i, bVar);
                unsafe.putObject(t, j, Long.valueOf(bVar.f1603b));
                unsafe.putInt(t, j2, i4);
                return iM1837L;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iM1834I = C0324d.m1834I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(bVar.f1602a));
                unsafe.putInt(t, j2, i4);
                return iM1834I;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(C0324d.m1849j(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(C0324d.m1847h(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM1837L2 = C0324d.m1837L(bArr, i, bVar);
                unsafe.putObject(t, j, Boolean.valueOf(bVar.f1603b != 0));
                unsafe.putInt(t, j2, i4);
                return iM1837L2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM1834I2 = C0324d.m1834I(bArr, i, bVar);
                int i13 = bVar.f1602a;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !Utf8.m1704t(bArr, iM1834I2, iM1834I2 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, iM1834I2, i13, C0350s.f1737a));
                    iM1834I2 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return iM1834I2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iM1855p = C0324d.m1855p(m1935v(i8), bArr, i, i2, bVar);
                object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, bVar.f1604c);
                } else {
                    unsafe.putObject(t, j, C0350s.m2346h(object, bVar.f1604c));
                }
                unsafe.putInt(t, j2, i4);
                return iM1855p;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iM1841b = C0324d.m1841b(bArr, i, bVar);
                unsafe.putObject(t, j, bVar.f1604c);
                unsafe.putInt(t, j2, i4);
                return iM1841b;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iM1834I3 = C0324d.m1834I(bArr, i, bVar);
                int i14 = bVar.f1602a;
                C0350s.e eVarM1931t = m1931t(i8);
                if (eVarM1931t != null && !eVarM1931t.mo1619a(i14)) {
                    m1886w(t).m2273n(i3, Long.valueOf(i14));
                    return iM1834I3;
                }
                unsafe.putObject(t, j, Integer.valueOf(i14));
                unsafe.putInt(t, j2, i4);
                return iM1834I3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iM1834I4 = C0324d.m1834I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(AbstractC0330g.m2027b(bVar.f1602a)));
                unsafe.putInt(t, j2, i4);
                return iM1834I4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM1837L3 = C0324d.m1837L(bArr, i, bVar);
                unsafe.putObject(t, j, Long.valueOf(AbstractC0330g.m2028c(bVar.f1603b)));
                unsafe.putInt(t, j2, i4);
                return iM1837L3;
            case 68:
                if (i5 == 3) {
                    int iM1853n = C0324d.m1853n(m1935v(i8), bArr, i, i2, (i3 & (-8)) | 4, bVar);
                    object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, bVar.f1604c);
                    } else {
                        unsafe.putObject(t, j, C0350s.m2346h(object, bVar.f1604c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iM1853n;
                }
                break;
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: d */
    public boolean mo1904d(T t, T t2) {
        int length = this.f1608a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m1925p(t, t2, i)) {
                return false;
            }
        }
        if (!this.f1622o.mo2235g(t).equals(this.f1622o.mo2235g(t2))) {
            return false;
        }
        if (this.f1613f) {
            return this.f1623p.mo2251c(t).equals(this.f1623p.mo2251c(t2));
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
    public int m1905d0(T r29, byte[] r30, int r31, int r32, int r33, androidx.datastore.preferences.protobuf.C0324d.b r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0325d0.m1905d0(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.d$b):int");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: e */
    public void mo1906e(T t, InterfaceC0333h0 interfaceC0333h0, C0340l c0340l) throws Throwable {
        c0340l.getClass();
        m1893M(this.f1622o, this.f1623p, t, interfaceC0333h0, c0340l);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0053. Please report as an issue. */
    /* JADX INFO: renamed from: e0 */
    public final int m1907e0(T t, byte[] bArr, int i, int i2, C0324d.b bVar) throws IOException {
        Unsafe unsafe;
        int i3;
        int i4;
        Unsafe unsafe2;
        int iM1837L;
        int i5;
        int i6;
        int i7;
        this = this;
        bArr = bArr;
        i2 = i2;
        bVar = bVar;
        Unsafe unsafe3 = f1607s;
        int i8 = -1;
        int iM1832G = i;
        int i9 = -1;
        int i10 = 0;
        while (iM1832G < i2) {
            int iM1833H = iM1832G + 1;
            int i11 = bArr[iM1832G];
            if (i11 < 0) {
                iM1833H = C0324d.m1833H(i11, bArr, iM1833H, bVar);
                i11 = bVar.f1602a;
            }
            int i12 = iM1833H;
            int i13 = i11;
            int i14 = (i13 == true ? 1 : 0) >>> 3;
            int i15 = (i13 == true ? 1 : 0) & 7;
            int iM1913h0 = i14 > i9 ? this.m1913h0(i14, i10 / 3) : this.m1911g0(i14);
            if (iM1913h0 == i8) {
                unsafe = unsafe3;
                i3 = i12;
                i4 = i14;
                iM1913h0 = 0;
            } else {
                int i16 = this.f1608a[iM1913h0 + 1];
                int iM1884r0 = m1884r0(i16);
                long jM1875V = m1875V(i16);
                if (iM1884r0 <= 17) {
                    switch (iM1884r0) {
                        case 0:
                            i13 = i13 == true ? 1 : 0;
                            if (i15 == 1) {
                                ipj0.m137505P(t, jM1875V, C0324d.m1843d(bArr, i12));
                                iM1832G = i12 + 8;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                ipj0.m137506Q(t, jM1875V, C0324d.m1851l(bArr, i12));
                                iM1832G = i12 + 4;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                iM1837L = C0324d.m1837L(bArr, i12, bVar);
                                unsafe3 = unsafe2;
                                unsafe3.putLong(t, jM1875V, bVar.f1603b);
                                iM1832G = iM1837L;
                                i9 = i14;
                                i10 = iM1913h0;
                            }
                            break;
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i15 == 0) {
                                iM1832G = C0324d.m1834I(bArr, i12, bVar);
                                unsafe2.putInt(t, jM1875V, bVar.f1602a);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                unsafe2.putLong(t, jM1875V, C0324d.m1849j(bArr, i12));
                                unsafe2 = unsafe2;
                                iM1832G = i12 + 8;
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                unsafe2.putInt(t, jM1875V, C0324d.m1847h(bArr, i12));
                                iM1832G = i12 + 4;
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                iM1832G = C0324d.m1837L(bArr, i12, bVar);
                                ipj0.m137499J(t, jM1875V, bVar.f1603b != 0);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                iM1832G = (536870912 & i16) == 0 ? C0324d.m1828C(bArr, i12, bVar) : C0324d.m1831F(bArr, i12, bVar);
                                unsafe2.putObject(t, jM1875V, bVar.f1604c);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                iM1832G = C0324d.m1855p(this.m1935v(iM1913h0), bArr, i12, i2, bVar);
                                Object object = unsafe2.getObject(t, jM1875V);
                                if (object == null) {
                                    unsafe2.putObject(t, jM1875V, bVar.f1604c);
                                } else {
                                    unsafe2.putObject(t, jM1875V, C0350s.m2346h(object, bVar.f1604c));
                                }
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                iM1832G = C0324d.m1841b(bArr, i12, bVar);
                                unsafe2.putObject(t, jM1875V, bVar.f1604c);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                iM1832G = C0324d.m1834I(bArr, i12, bVar);
                                unsafe2.putInt(t, jM1875V, bVar.f1602a);
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                iM1832G = C0324d.m1834I(bArr, i12, bVar);
                                unsafe2.putInt(t, jM1875V, AbstractC0330g.m2027b(bVar.f1602a));
                                unsafe3 = unsafe2;
                                i9 = i14;
                                i10 = iM1913h0;
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
                                iM1837L = C0324d.m1837L(bArr, i12, bVar);
                                unsafe3.putLong(t, jM1875V, AbstractC0330g.m2028c(bVar.f1603b));
                                unsafe3 = unsafe3;
                                iM1832G = iM1837L;
                                i9 = i14;
                                i10 = iM1913h0;
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
                    if (iM1884r0 != 27) {
                        unsafe = unsafe3;
                        if (iM1884r0 <= 49) {
                            int iM1909f0 = this.m1909f0(t, bArr, i12, i2, i13 == true ? 1 : 0, i14, i15, iM1913h0, i16, iM1884r0, jM1875V, bVar);
                            i7 = i13 == true ? 1 : 0;
                            i6 = i14;
                            if (iM1909f0 != i12) {
                                iM1913h0 = iM1913h0;
                                iM1832G = iM1909f0;
                                i9 = i6;
                                i10 = iM1913h0;
                                unsafe3 = unsafe;
                                i8 = -1;
                                bArr = bArr;
                            } else {
                                iM1913h0 = iM1913h0;
                                i3 = iM1909f0;
                                i4 = i6;
                                i13 = i7;
                            }
                        } else {
                            i6 = i14;
                            i7 = i13 == true ? 1 : 0;
                            i5 = i12;
                            if (iM1884r0 == 50) {
                                if (i15 == 2) {
                                    int iM1901b0 = m1901b0(t, bArr, i5, i2, iM1913h0, jM1875V, bVar);
                                    if (iM1901b0 != i5) {
                                        this = this;
                                        i2 = i2;
                                        iM1832G = iM1901b0;
                                        i9 = i6;
                                    } else {
                                        i3 = iM1901b0;
                                    }
                                } else {
                                    i3 = i5;
                                }
                                i4 = i6;
                                i13 = i7;
                            } else {
                                i4 = i6;
                                i13 = i7 == true ? 1 : 0;
                                int iM1903c0 = m1903c0(t, bArr, i5, i2, i13 == true ? 1 : 0, i4, i15, i16, iM1884r0, jM1875V, iM1913h0, bVar);
                                if (iM1903c0 != i5) {
                                    i9 = i4;
                                    iM1832G = iM1903c0;
                                    i10 = iM1913h0;
                                    unsafe3 = unsafe;
                                    i8 = -1;
                                    bArr = bArr;
                                } else {
                                    i3 = iM1903c0;
                                }
                            }
                        }
                    } else if (i15 == 2) {
                        C0350s.i iVarMo2014d = (C0350s.i) unsafe3.getObject(t, jM1875V);
                        if (!iVarMo2014d.mo1820q()) {
                            int size = iVarMo2014d.size();
                            iVarMo2014d = iVarMo2014d.mo2014d(size == 0 ? 10 : size * 2);
                            unsafe3.putObject(t, jM1875V, iVarMo2014d);
                        }
                        unsafe = unsafe3;
                        iM1832G = C0324d.m1856q(this.m1935v(iM1913h0), i13 == true ? 1 : 0, bArr, i12, i2, iVarMo2014d, bVar);
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
                    i10 = iM1913h0;
                    unsafe3 = unsafe;
                    i8 = -1;
                }
            }
            iM1832G = C0324d.m1832G(i13 == true ? 1 : 0, bArr, i3, i2, m1886w(t), bVar);
            this = this;
            i2 = i2;
            i9 = i4;
            i10 = iM1913h0;
            unsafe3 = unsafe;
            i8 = -1;
        }
        if (iM1832G == i2) {
            return iM1832G;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: f */
    public void mo1908f(T t) {
        int i;
        int[] iArr;
        int i2 = this.f1618k;
        while (true) {
            i = this.f1619l;
            iArr = this.f1617j;
            if (i2 >= i) {
                break;
            }
            long jM1875V = m1875V(m1930s0(iArr[i2]));
            Object objM137494E = ipj0.m137494E(t, jM1875V);
            if (objM137494E != null) {
                ipj0.m137509T(t, jM1875V, this.f1624q.mo1807c(objM137494E));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f1621n.mo2368c(t, this.f1617j[i]);
            i++;
        }
        this.f1622o.mo2238j(t);
        if (this.f1613f) {
            this.f1623p.mo2254f(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public final int m1909f0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C0324d.b bVar) throws IOException {
        int iM1835J;
        Unsafe unsafe = f1607s;
        C0350s.i iVarMo2014d = (C0350s.i) unsafe.getObject(t, j2);
        if (!iVarMo2014d.mo1820q()) {
            int size = iVarMo2014d.size();
            iVarMo2014d = iVarMo2014d.mo2014d(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, iVarMo2014d);
        }
        C0350s.i iVar = iVarMo2014d;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return C0324d.m1858s(bArr, i, iVar, bVar);
                }
                if (i5 == 1) {
                    return C0324d.m1844e(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return C0324d.m1861v(bArr, i, iVar, bVar);
                }
                if (i5 == 5) {
                    return C0324d.m1852m(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return C0324d.m1865z(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0324d.m1838M(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C0324d.m1864y(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0324d.m1835J(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return C0324d.m1860u(bArr, i, iVar, bVar);
                }
                if (i5 == 1) {
                    return C0324d.m1850k(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return C0324d.m1859t(bArr, i, iVar, bVar);
                }
                if (i5 == 5) {
                    return C0324d.m1848i(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return C0324d.m1857r(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0324d.m1840a(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? C0324d.m1829D(i3, bArr, i, i2, iVar, bVar) : C0324d.m1830E(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return C0324d.m1856q(m1935v(i6), i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return C0324d.m1842c(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iM1835J = C0324d.m1835J(i3, bArr, i, i2, iVar, bVar);
                    }
                    return i;
                }
                iM1835J = C0324d.m1864y(bArr, i, iVar, bVar);
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                C0343m0 c0343m0 = generatedMessageLite.unknownFields;
                if (c0343m0 == C0343m0.m2261e()) {
                    c0343m0 = null;
                }
                C0343m0 c0343m1 = (C0343m0) C0337j0.m2140A(i4, iVar, m1931t(i6), c0343m0, this.f1622o);
                if (c0343m1 != null) {
                    generatedMessageLite.unknownFields = c0343m1;
                }
                return iM1835J;
            case 33:
            case 47:
                if (i5 == 2) {
                    return C0324d.m1862w(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0324d.m1826A(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return C0324d.m1863x(bArr, i, iVar, bVar);
                }
                if (i5 == 0) {
                    return C0324d.m1827B(i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return C0324d.m1854o(m1935v(i6), i3, bArr, i, i2, iVar, bVar);
                }
                return i;
            default:
                return i;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: g */
    public int mo1910g(T t) {
        return this.f1615h ? m1940y(t) : m1938x(t);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m1911g0(int i) {
        if (i < this.f1610c || i > this.f1611d) {
            return -1;
        }
        return m1928q0(i, 0);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: h */
    public T mo1912h() {
        return (T) this.f1620m.mo2026a(this.f1612e);
    }

    /* JADX INFO: renamed from: h0 */
    public final int m1913h0(int i, int i2) {
        if (i < this.f1610c || i > this.f1611d) {
            return -1;
        }
        return m1928q0(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: i */
    public int mo1914i(T t) {
        int i;
        int iM2344f;
        int length = this.f1608a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iM1930s0 = m1930s0(i3);
            int iM1898U = m1898U(i3);
            long jM1875V = m1875V(iM1930s0);
            int iHashCode = 37;
            switch (m1884r0(iM1930s0)) {
                case 0:
                    i = i2 * 53;
                    iM2344f = C0350s.m2344f(Double.doubleToLongBits(ipj0.m137536y(t, jM1875V)));
                    i2 = i + iM2344f;
                    break;
                case 1:
                    i = i2 * 53;
                    iM2344f = Float.floatToIntBits(ipj0.m137537z(t, jM1875V));
                    i2 = i + iM2344f;
                    break;
                case 2:
                    i = i2 * 53;
                    iM2344f = C0350s.m2344f(ipj0.m137492C(t, jM1875V));
                    i2 = i + iM2344f;
                    break;
                case 3:
                    i = i2 * 53;
                    iM2344f = C0350s.m2344f(ipj0.m137492C(t, jM1875V));
                    i2 = i + iM2344f;
                    break;
                case 4:
                    i = i2 * 53;
                    iM2344f = ipj0.m137490A(t, jM1875V);
                    i2 = i + iM2344f;
                    break;
                case 5:
                    i = i2 * 53;
                    iM2344f = C0350s.m2344f(ipj0.m137492C(t, jM1875V));
                    i2 = i + iM2344f;
                    break;
                case 6:
                    i = i2 * 53;
                    iM2344f = ipj0.m137490A(t, jM1875V);
                    i2 = i + iM2344f;
                    break;
                case 7:
                    i = i2 * 53;
                    iM2344f = C0350s.m2341c(ipj0.m137529r(t, jM1875V));
                    i2 = i + iM2344f;
                    break;
                case 8:
                    i = i2 * 53;
                    iM2344f = ((String) ipj0.m137494E(t, jM1875V)).hashCode();
                    i2 = i + iM2344f;
                    break;
                case 9:
                    Object objM137494E = ipj0.m137494E(t, jM1875V);
                    if (objM137494E != null) {
                        iHashCode = objM137494E.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iM2344f = ipj0.m137494E(t, jM1875V).hashCode();
                    i2 = i + iM2344f;
                    break;
                case 11:
                    i = i2 * 53;
                    iM2344f = ipj0.m137490A(t, jM1875V);
                    i2 = i + iM2344f;
                    break;
                case 12:
                    i = i2 * 53;
                    iM2344f = ipj0.m137490A(t, jM1875V);
                    i2 = i + iM2344f;
                    break;
                case 13:
                    i = i2 * 53;
                    iM2344f = ipj0.m137490A(t, jM1875V);
                    i2 = i + iM2344f;
                    break;
                case 14:
                    i = i2 * 53;
                    iM2344f = C0350s.m2344f(ipj0.m137492C(t, jM1875V));
                    i2 = i + iM2344f;
                    break;
                case 15:
                    i = i2 * 53;
                    iM2344f = ipj0.m137490A(t, jM1875V);
                    i2 = i + iM2344f;
                    break;
                case 16:
                    i = i2 * 53;
                    iM2344f = C0350s.m2344f(ipj0.m137492C(t, jM1875V));
                    i2 = i + iM2344f;
                    break;
                case 17:
                    Object objM137494E2 = ipj0.m137494E(t, jM1875V);
                    if (objM137494E2 != null) {
                        iHashCode = objM137494E2.hashCode();
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
                    iM2344f = ipj0.m137494E(t, jM1875V).hashCode();
                    i2 = i + iM2344f;
                    break;
                case 50:
                    i = i2 * 53;
                    iM2344f = ipj0.m137494E(t, jM1875V).hashCode();
                    i2 = i + iM2344f;
                    break;
                case 51:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = C0350s.m2344f(Double.doubleToLongBits(m1877X(t, jM1875V)));
                        i2 = i + iM2344f;
                    }
                    break;
                case 52:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = Float.floatToIntBits(m1878Y(t, jM1875V));
                        i2 = i + iM2344f;
                    }
                    break;
                case 53:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = C0350s.m2344f(m1880a0(t, jM1875V));
                        i2 = i + iM2344f;
                    }
                    break;
                case 54:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = C0350s.m2344f(m1880a0(t, jM1875V));
                        i2 = i + iM2344f;
                    }
                    break;
                case 55:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = m1879Z(t, jM1875V);
                        i2 = i + iM2344f;
                    }
                    break;
                case 56:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = C0350s.m2344f(m1880a0(t, jM1875V));
                        i2 = i + iM2344f;
                    }
                    break;
                case 57:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = m1879Z(t, jM1875V);
                        i2 = i + iM2344f;
                    }
                    break;
                case 58:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = C0350s.m2341c(m1876W(t, jM1875V));
                        i2 = i + iM2344f;
                    }
                    break;
                case 59:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = ((String) ipj0.m137494E(t, jM1875V)).hashCode();
                        i2 = i + iM2344f;
                    }
                    break;
                case 60:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = ipj0.m137494E(t, jM1875V).hashCode();
                        i2 = i + iM2344f;
                    }
                    break;
                case 61:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = ipj0.m137494E(t, jM1875V).hashCode();
                        i2 = i + iM2344f;
                    }
                    break;
                case 62:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = m1879Z(t, jM1875V);
                        i2 = i + iM2344f;
                    }
                    break;
                case 63:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = m1879Z(t, jM1875V);
                        i2 = i + iM2344f;
                    }
                    break;
                case 64:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = m1879Z(t, jM1875V);
                        i2 = i + iM2344f;
                    }
                    break;
                case 65:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = C0350s.m2344f(m1880a0(t, jM1875V));
                        i2 = i + iM2344f;
                    }
                    break;
                case 66:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = m1879Z(t, jM1875V);
                        i2 = i + iM2344f;
                    }
                    break;
                case 67:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = C0350s.m2344f(m1880a0(t, jM1875V));
                        i2 = i + iM2344f;
                    }
                    break;
                case 68:
                    if (m1892I(t, iM1898U, i3)) {
                        i = i2 * 53;
                        iM2344f = ipj0.m137494E(t, jM1875V).hashCode();
                        i2 = i + iM2344f;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.f1622o.mo2235g(t).hashCode();
        return this.f1613f ? (iHashCode2 * 53) + this.f1623p.mo2251c(t).hashCode() : iHashCode2;
    }

    /* JADX INFO: renamed from: i0 */
    public final int m1915i0(int i) {
        return this.f1608a[i + 2];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0335i0
    /* JADX INFO: renamed from: j */
    public void mo1916j(T t, byte[] bArr, int i, int i2, C0324d.b bVar) throws IOException {
        if (this.f1615h) {
            m1907e0(t, bArr, i, i2, bVar);
        } else {
            m1905d0(t, bArr, i, i2, 0, bVar);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final <E> void m1917j0(Object obj, long j, InterfaceC0333h0 interfaceC0333h0, InterfaceC0335i0<E> interfaceC0335i0, C0340l c0340l) throws IOException {
        interfaceC0333h0.mo1956M(this.f1621n.mo2370e(obj, j), interfaceC0335i0, c0340l);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1918k(T t, T t2, int i) {
        return m1887C(t, i) == m1887C(t2, i);
    }

    /* JADX INFO: renamed from: k0 */
    public final <E> void m1919k0(Object obj, int i, InterfaceC0333h0 interfaceC0333h0, InterfaceC0335i0<E> interfaceC0335i0, C0340l c0340l) throws IOException {
        interfaceC0333h0.mo1948E(this.f1621n.mo2370e(obj, m1875V(i)), interfaceC0335i0, c0340l);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m1920l0(Object obj, int i, InterfaceC0333h0 interfaceC0333h0) throws IOException {
        if (m1867B(i)) {
            ipj0.m137509T(obj, m1875V(i), interfaceC0333h0.mo1958O());
        } else if (this.f1614g) {
            ipj0.m137509T(obj, m1875V(i), interfaceC0333h0.mo1955L());
        } else {
            ipj0.m137509T(obj, m1875V(i), interfaceC0333h0.mo1981g());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final <K, V> int m1921m(byte[] bArr, int i, int i2, C0356y.a<K, V> aVar, Map<K, V> map, C0324d.b bVar) throws IOException {
        int iM1834I = C0324d.m1834I(bArr, i, bVar);
        int i3 = bVar.f1602a;
        if (i3 < 0 || i3 > i2 - iM1834I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = iM1834I + i3;
        Object obj = aVar.f1763b;
        Object obj2 = aVar.f1765d;
        while (iM1834I < i4) {
            int iM1833H = iM1834I + 1;
            int i5 = bArr[iM1834I];
            if (i5 < 0) {
                iM1833H = C0324d.m1833H(i5, bArr, iM1833H, bVar);
                i5 = bVar.f1602a;
            }
            int i6 = iM1833H;
            int i7 = i5 >>> 3;
            int i8 = i5 & 7;
            if (i7 != 1) {
                if (i7 == 2 && i8 == aVar.f1764c.getWireType()) {
                    iM1834I = m1923n(bArr, i6, i2, aVar.f1764c, aVar.f1765d.getClass(), bVar);
                    obj2 = bVar.f1604c;
                } else {
                    iM1834I = C0324d.m1839N(i5, bArr, i6, i2, bVar);
                }
            } else if (i8 == aVar.f1762a.getWireType()) {
                iM1834I = m1923n(bArr, i6, i2, aVar.f1762a, null, bVar);
                obj = bVar.f1604c;
            } else {
                iM1834I = C0324d.m1839N(i5, bArr, i6, i2, bVar);
            }
        }
        if (iM1834I != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m1922m0(Object obj, int i, InterfaceC0333h0 interfaceC0333h0) throws IOException {
        boolean zM1867B = m1867B(i);
        AbstractC0354w abstractC0354w = this.f1621n;
        if (zM1867B) {
            interfaceC0333h0.mo1946C(abstractC0354w.mo2370e(obj, m1875V(i)));
        } else {
            interfaceC0333h0.mo1997p(abstractC0354w.mo2370e(obj, m1875V(i)));
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m1923n(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, C0324d.b bVar) throws IOException {
        switch (a.f1625a[fieldType.ordinal()]) {
            case 1:
                int iM1837L = C0324d.m1837L(bArr, i, bVar);
                bVar.f1604c = Boolean.valueOf(bVar.f1603b != 0);
                return iM1837L;
            case 2:
                return C0324d.m1841b(bArr, i, bVar);
            case 3:
                bVar.f1604c = Double.valueOf(C0324d.m1843d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                bVar.f1604c = Integer.valueOf(C0324d.m1847h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                bVar.f1604c = Long.valueOf(C0324d.m1849j(bArr, i));
                return i + 8;
            case 8:
                bVar.f1604c = Float.valueOf(C0324d.m1851l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iM1834I = C0324d.m1834I(bArr, i, bVar);
                bVar.f1604c = Integer.valueOf(bVar.f1602a);
                return iM1834I;
            case 12:
            case 13:
                int iM1837L2 = C0324d.m1837L(bArr, i, bVar);
                bVar.f1604c = Long.valueOf(bVar.f1603b);
                return iM1837L2;
            case 14:
                return C0324d.m1855p(cza0.m109400a().m109403d(cls), bArr, i, i2, bVar);
            case 15:
                int iM1834I2 = C0324d.m1834I(bArr, i, bVar);
                bVar.f1604c = Integer.valueOf(AbstractC0330g.m2027b(bVar.f1602a));
                return iM1834I2;
            case 16:
                int iM1837L3 = C0324d.m1837L(bArr, i, bVar);
                bVar.f1604c = Long.valueOf(AbstractC0330g.m2028c(bVar.f1603b));
                return iM1837L3;
            case 17:
                return C0324d.m1831F(bArr, i, bVar);
            default:
                upk0.m194883a("unsupported field type.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m1924o0(T t, int i) {
        if (this.f1615h) {
            return;
        }
        int iM1915i0 = m1915i0(i);
        long j = iM1915i0 & 1048575;
        ipj0.m137507R(t, j, ipj0.m137490A(t, j) | (1 << (iM1915i0 >>> 20)));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1925p(T t, T t2, int i) {
        int iM1930s0 = m1930s0(i);
        long jM1875V = m1875V(iM1930s0);
        switch (m1884r0(iM1930s0)) {
            case 0:
                return m1918k(t, t2, i) && Double.doubleToLongBits(ipj0.m137536y(t, jM1875V)) == Double.doubleToLongBits(ipj0.m137536y(t2, jM1875V));
            case 1:
                return m1918k(t, t2, i) && Float.floatToIntBits(ipj0.m137537z(t, jM1875V)) == Float.floatToIntBits(ipj0.m137537z(t2, jM1875V));
            case 2:
                return m1918k(t, t2, i) && ipj0.m137492C(t, jM1875V) == ipj0.m137492C(t2, jM1875V);
            case 3:
                return m1918k(t, t2, i) && ipj0.m137492C(t, jM1875V) == ipj0.m137492C(t2, jM1875V);
            case 4:
                return m1918k(t, t2, i) && ipj0.m137490A(t, jM1875V) == ipj0.m137490A(t2, jM1875V);
            case 5:
                return m1918k(t, t2, i) && ipj0.m137492C(t, jM1875V) == ipj0.m137492C(t2, jM1875V);
            case 6:
                return m1918k(t, t2, i) && ipj0.m137490A(t, jM1875V) == ipj0.m137490A(t2, jM1875V);
            case 7:
                return m1918k(t, t2, i) && ipj0.m137529r(t, jM1875V) == ipj0.m137529r(t2, jM1875V);
            case 8:
                return m1918k(t, t2, i) && C0337j0.m2150K(ipj0.m137494E(t, jM1875V), ipj0.m137494E(t2, jM1875V));
            case 9:
                return m1918k(t, t2, i) && C0337j0.m2150K(ipj0.m137494E(t, jM1875V), ipj0.m137494E(t2, jM1875V));
            case 10:
                return m1918k(t, t2, i) && C0337j0.m2150K(ipj0.m137494E(t, jM1875V), ipj0.m137494E(t2, jM1875V));
            case 11:
                return m1918k(t, t2, i) && ipj0.m137490A(t, jM1875V) == ipj0.m137490A(t2, jM1875V);
            case 12:
                return m1918k(t, t2, i) && ipj0.m137490A(t, jM1875V) == ipj0.m137490A(t2, jM1875V);
            case 13:
                return m1918k(t, t2, i) && ipj0.m137490A(t, jM1875V) == ipj0.m137490A(t2, jM1875V);
            case 14:
                return m1918k(t, t2, i) && ipj0.m137492C(t, jM1875V) == ipj0.m137492C(t2, jM1875V);
            case 15:
                return m1918k(t, t2, i) && ipj0.m137490A(t, jM1875V) == ipj0.m137490A(t2, jM1875V);
            case 16:
                return m1918k(t, t2, i) && ipj0.m137492C(t, jM1875V) == ipj0.m137492C(t2, jM1875V);
            case 17:
                return m1918k(t, t2, i) && C0337j0.m2150K(ipj0.m137494E(t, jM1875V), ipj0.m137494E(t2, jM1875V));
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
                return C0337j0.m2150K(ipj0.m137494E(t, jM1875V), ipj0.m137494E(t2, jM1875V));
            case 50:
                return C0337j0.m2150K(ipj0.m137494E(t, jM1875V), ipj0.m137494E(t2, jM1875V));
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
                return m1891H(t, t2, i) && C0337j0.m2150K(ipj0.m137494E(t, jM1875V), ipj0.m137494E(t2, jM1875V));
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1926p0(T t, int i, int i2) {
        ipj0.m137507R(t, m1915i0(i2) & 1048575, i);
    }

    /* JADX INFO: renamed from: q */
    public final <UT, UB> UB m1927q(Object obj, int i, UB ub, AbstractC0341l0<UT, UB> abstractC0341l0) {
        C0350s.e eVarM1931t;
        int iM1898U = m1898U(i);
        Object objM137494E = ipj0.m137494E(obj, m1875V(m1930s0(i)));
        return (objM137494E == null || (eVarM1931t = m1931t(i)) == null) ? ub : (UB) m1929r(i, iM1898U, this.f1624q.mo1809e(objM137494E), eVarM1931t, ub, abstractC0341l0);
    }

    /* JADX INFO: renamed from: q0 */
    public final int m1928q0(int i, int i2) {
        int length = (this.f1608a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iM1898U = m1898U(i4);
            if (i == iM1898U) {
                return i4;
            }
            if (i < iM1898U) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final <K, V, UT, UB> UB m1929r(int i, int i2, Map<K, V> map, C0350s.e eVar, UB ub, AbstractC0341l0<UT, UB> abstractC0341l0) {
        C0356y.a<?, ?> aVarMo1806b = this.f1624q.mo1806b(m1933u(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.mo1619a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC0341l0.mo2242n();
                }
                ByteString.C0280g c0280gNewCodedBuilder = ByteString.newCodedBuilder(C0356y.m2384b(aVarMo1806b, next.getKey(), next.getValue()));
                try {
                    C0356y.m2386e(c0280gNewCodedBuilder.m1494b(), aVarMo1806b, next.getKey(), next.getValue());
                    abstractC0341l0.mo2232d(ub, i2, c0280gNewCodedBuilder.m1493a());
                    it.remove();
                } catch (IOException e) {
                    aag0.m95543a(e);
                    return null;
                }
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: s0 */
    public final int m1930s0(int i) {
        return this.f1608a[i + 1];
    }

    /* JADX INFO: renamed from: t */
    public final C0350s.e m1931t(int i) {
        return (C0350s.e) this.f1609b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: t0 */
    public final void m1932t0(T t, Writer writer) throws IOException {
        Iterator itM2313s;
        Map.Entry<?, ?> entry;
        boolean z;
        int i;
        boolean z2;
        if (this.f1613f) {
            C0347p<T> c0347pMo2251c = this.f1623p.mo2251c(t);
            if (c0347pMo2251c.m2310n()) {
                itM2313s = null;
                entry = null;
            } else {
                itM2313s = c0347pMo2251c.m2313s();
                entry = (Map.Entry) itM2313s.next();
            }
        } else {
            itM2313s = null;
            entry = null;
        }
        int length = this.f1608a.length;
        Unsafe unsafe = f1607s;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iM1930s0 = m1930s0(i3);
            int iM1898U = m1898U(i3);
            int iM1884r0 = m1884r0(iM1930s0);
            if (this.f1615h || iM1884r0 > 17) {
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
            while (entry != null && this.f1623p.mo2249a(entry) <= iM1898U) {
                this.f1623p.mo2258j(writer, entry);
                entry = itM2313s.hasNext() ? (Map.Entry) itM2313s.next() : null;
            }
            Iterator it = itM2313s;
            int i7 = i;
            long jM1875V = m1875V(iM1930s0);
            switch (iM1884r0) {
                case 0:
                    if ((i4 & i7) != 0) {
                        writer.mo1753E(iM1898U, m1883o(t, jM1875V));
                    }
                    break;
                case 1:
                    if ((i4 & i7) != 0) {
                        writer.mo1760L(iM1898U, m1885s(t, jM1875V));
                    }
                    break;
                case 2:
                    if ((i4 & i7) != 0) {
                        writer.mo1757I(iM1898U, unsafe.getLong(t, jM1875V));
                    }
                    break;
                case 3:
                    if ((i4 & i7) != 0) {
                        writer.mo1768e(iM1898U, unsafe.getLong(t, jM1875V));
                    }
                    break;
                case 4:
                    if ((i4 & i7) != 0) {
                        writer.mo1770g(iM1898U, unsafe.getInt(t, jM1875V));
                    }
                    break;
                case 5:
                    if ((i4 & i7) != 0) {
                        writer.mo1779p(iM1898U, unsafe.getLong(t, jM1875V));
                    }
                    break;
                case 6:
                    if ((i4 & i7) != 0) {
                        writer.mo1766c(iM1898U, unsafe.getInt(t, jM1875V));
                    }
                    break;
                case 7:
                    if ((i4 & i7) != 0) {
                        writer.mo1780q(iM1898U, m1881l(t, jM1875V));
                    }
                    break;
                case 8:
                    if ((i4 & i7) != 0) {
                        m1939x0(iM1898U, unsafe.getObject(t, jM1875V), writer);
                    }
                    break;
                case 9:
                    if ((i4 & i7) != 0) {
                        writer.mo1773j(iM1898U, unsafe.getObject(t, jM1875V), m1935v(i3));
                    }
                    break;
                case 10:
                    if ((i4 & i7) != 0) {
                        writer.mo1771h(iM1898U, (ByteString) unsafe.getObject(t, jM1875V));
                    }
                    break;
                case 11:
                    if ((i4 & i7) != 0) {
                        writer.mo1777n(iM1898U, unsafe.getInt(t, jM1875V));
                    }
                    break;
                case 12:
                    if ((i4 & i7) != 0) {
                        writer.mo1761M(iM1898U, unsafe.getInt(t, jM1875V));
                    }
                    break;
                case 13:
                    if ((i4 & i7) != 0) {
                        writer.mo1781r(iM1898U, unsafe.getInt(t, jM1875V));
                    }
                    break;
                case 14:
                    if ((i4 & i7) != 0) {
                        writer.mo1749A(iM1898U, unsafe.getLong(t, jM1875V));
                    }
                    break;
                case 15:
                    if ((i4 & i7) != 0) {
                        writer.mo1763O(iM1898U, unsafe.getInt(t, jM1875V));
                    }
                    break;
                case 16:
                    if ((i4 & i7) != 0) {
                        writer.mo1775l(iM1898U, unsafe.getLong(t, jM1875V));
                    }
                    break;
                case 17:
                    if ((i4 & i7) != 0) {
                        writer.mo1752D(iM1898U, unsafe.getObject(t, jM1875V), m1935v(i3));
                    }
                    break;
                case 18:
                    C0337j0.m2155P(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 19:
                    C0337j0.m2159T(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 20:
                    C0337j0.m2162W(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 21:
                    C0337j0.m2175e0(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 22:
                    C0337j0.m2161V(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 23:
                    C0337j0.m2158S(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 24:
                    C0337j0.m2157R(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 25:
                    C0337j0.m2153N(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 26:
                    C0337j0.m2171c0(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer);
                    break;
                case 27:
                    C0337j0.m2163X(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, m1935v(i3));
                    break;
                case 28:
                    C0337j0.m2154O(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer);
                    break;
                case 29:
                    z2 = false;
                    C0337j0.m2173d0(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 30:
                    z2 = false;
                    C0337j0.m2156Q(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 31:
                    z2 = false;
                    C0337j0.m2164Y(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 32:
                    z2 = false;
                    C0337j0.m2165Z(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 33:
                    z2 = false;
                    C0337j0.m2167a0(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 34:
                    z2 = false;
                    C0337j0.m2169b0(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, false);
                    break;
                case 35:
                    C0337j0.m2155P(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 36:
                    C0337j0.m2159T(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 37:
                    C0337j0.m2162W(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 38:
                    C0337j0.m2175e0(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 39:
                    C0337j0.m2161V(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 40:
                    C0337j0.m2158S(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 41:
                    C0337j0.m2157R(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 42:
                    C0337j0.m2153N(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 43:
                    C0337j0.m2173d0(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 44:
                    C0337j0.m2156Q(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 45:
                    C0337j0.m2164Y(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 46:
                    C0337j0.m2165Z(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 47:
                    C0337j0.m2167a0(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 48:
                    C0337j0.m2169b0(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, z);
                    break;
                case 49:
                    C0337j0.m2160U(m1898U(i3), (List) unsafe.getObject(t, jM1875V), writer, m1935v(i3));
                    break;
                case 50:
                    m1937w0(writer, iM1898U, unsafe.getObject(t, jM1875V), i3);
                    break;
                case 51:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1753E(iM1898U, m1877X(t, jM1875V));
                    }
                    break;
                case 52:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1760L(iM1898U, m1878Y(t, jM1875V));
                    }
                    break;
                case 53:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1757I(iM1898U, m1880a0(t, jM1875V));
                    }
                    break;
                case 54:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1768e(iM1898U, m1880a0(t, jM1875V));
                    }
                    break;
                case 55:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1770g(iM1898U, m1879Z(t, jM1875V));
                    }
                    break;
                case 56:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1779p(iM1898U, m1880a0(t, jM1875V));
                    }
                    break;
                case 57:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1766c(iM1898U, m1879Z(t, jM1875V));
                    }
                    break;
                case 58:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1780q(iM1898U, m1876W(t, jM1875V));
                    }
                    break;
                case 59:
                    if (m1892I(t, iM1898U, i3)) {
                        m1939x0(iM1898U, unsafe.getObject(t, jM1875V), writer);
                    }
                    break;
                case 60:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1773j(iM1898U, unsafe.getObject(t, jM1875V), m1935v(i3));
                    }
                    break;
                case 61:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1771h(iM1898U, (ByteString) unsafe.getObject(t, jM1875V));
                    }
                    break;
                case 62:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1777n(iM1898U, m1879Z(t, jM1875V));
                    }
                    break;
                case 63:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1761M(iM1898U, m1879Z(t, jM1875V));
                    }
                    break;
                case 64:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1781r(iM1898U, m1879Z(t, jM1875V));
                    }
                    break;
                case 65:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1749A(iM1898U, m1880a0(t, jM1875V));
                    }
                    break;
                case 66:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1763O(iM1898U, m1879Z(t, jM1875V));
                    }
                    break;
                case 67:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1775l(iM1898U, m1880a0(t, jM1875V));
                    }
                    break;
                case 68:
                    if (m1892I(t, iM1898U, i3)) {
                        writer.mo1752D(iM1898U, unsafe.getObject(t, jM1875V), m1935v(i3));
                    }
                    break;
                default:
                    break;
            }
            i3 += 3;
            itM2313s = it;
        }
        Iterator it2 = itM2313s;
        while (entry != null) {
            this.f1623p.mo2258j(writer, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        m1941y0(this.f1622o, t, writer);
    }

    /* JADX INFO: renamed from: u */
    public final Object m1933u(int i) {
        return this.f1609b[(i / 3) * 2];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: u0 */
    public final void m1934u0(T t, Writer writer) throws IOException {
        Iterator itM2313s;
        Map.Entry<?, ?> entry;
        if (this.f1613f) {
            C0347p<T> c0347pMo2251c = this.f1623p.mo2251c(t);
            if (c0347pMo2251c.m2310n()) {
                itM2313s = null;
                entry = null;
            } else {
                itM2313s = c0347pMo2251c.m2313s();
                entry = (Map.Entry) itM2313s.next();
            }
        } else {
            itM2313s = null;
            entry = null;
        }
        int length = this.f1608a.length;
        for (int i = 0; i < length; i += 3) {
            int iM1930s0 = m1930s0(i);
            int iM1898U = m1898U(i);
            while (entry != null && this.f1623p.mo2249a(entry) <= iM1898U) {
                this.f1623p.mo2258j(writer, entry);
                entry = itM2313s.hasNext() ? (Map.Entry) itM2313s.next() : null;
            }
            switch (m1884r0(iM1930s0)) {
                case 0:
                    if (m1887C(t, i)) {
                        writer.mo1753E(iM1898U, m1883o(t, m1875V(iM1930s0)));
                    }
                    break;
                case 1:
                    if (m1887C(t, i)) {
                        writer.mo1760L(iM1898U, m1885s(t, m1875V(iM1930s0)));
                    }
                    break;
                case 2:
                    if (m1887C(t, i)) {
                        writer.mo1757I(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 3:
                    if (m1887C(t, i)) {
                        writer.mo1768e(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 4:
                    if (m1887C(t, i)) {
                        writer.mo1770g(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 5:
                    if (m1887C(t, i)) {
                        writer.mo1779p(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 6:
                    if (m1887C(t, i)) {
                        writer.mo1766c(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 7:
                    if (m1887C(t, i)) {
                        writer.mo1780q(iM1898U, m1881l(t, m1875V(iM1930s0)));
                    }
                    break;
                case 8:
                    if (m1887C(t, i)) {
                        m1939x0(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), writer);
                    }
                    break;
                case 9:
                    if (m1887C(t, i)) {
                        writer.mo1773j(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), m1935v(i));
                    }
                    break;
                case 10:
                    if (m1887C(t, i)) {
                        writer.mo1771h(iM1898U, (ByteString) ipj0.m137494E(t, m1875V(iM1930s0)));
                    }
                    break;
                case 11:
                    if (m1887C(t, i)) {
                        writer.mo1777n(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 12:
                    if (m1887C(t, i)) {
                        writer.mo1761M(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 13:
                    if (m1887C(t, i)) {
                        writer.mo1781r(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 14:
                    if (m1887C(t, i)) {
                        writer.mo1749A(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 15:
                    if (m1887C(t, i)) {
                        writer.mo1763O(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 16:
                    if (m1887C(t, i)) {
                        writer.mo1775l(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 17:
                    if (m1887C(t, i)) {
                        writer.mo1752D(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), m1935v(i));
                    }
                    break;
                case 18:
                    C0337j0.m2155P(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 19:
                    C0337j0.m2159T(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 20:
                    C0337j0.m2162W(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 21:
                    C0337j0.m2175e0(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 22:
                    C0337j0.m2161V(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 23:
                    C0337j0.m2158S(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 24:
                    C0337j0.m2157R(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 25:
                    C0337j0.m2153N(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 26:
                    C0337j0.m2171c0(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer);
                    break;
                case 27:
                    C0337j0.m2163X(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, m1935v(i));
                    break;
                case 28:
                    C0337j0.m2154O(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer);
                    break;
                case 29:
                    C0337j0.m2173d0(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 30:
                    C0337j0.m2156Q(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 31:
                    C0337j0.m2164Y(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 32:
                    C0337j0.m2165Z(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 33:
                    C0337j0.m2167a0(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 34:
                    C0337j0.m2169b0(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 35:
                    C0337j0.m2155P(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 36:
                    C0337j0.m2159T(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 37:
                    C0337j0.m2162W(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 38:
                    C0337j0.m2175e0(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 39:
                    C0337j0.m2161V(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 40:
                    C0337j0.m2158S(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 41:
                    C0337j0.m2157R(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 42:
                    C0337j0.m2153N(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 43:
                    C0337j0.m2173d0(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 44:
                    C0337j0.m2156Q(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 45:
                    C0337j0.m2164Y(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 46:
                    C0337j0.m2165Z(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 47:
                    C0337j0.m2167a0(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 48:
                    C0337j0.m2169b0(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 49:
                    C0337j0.m2160U(m1898U(i), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, m1935v(i));
                    break;
                case 50:
                    m1937w0(writer, iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), i);
                    break;
                case 51:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1753E(iM1898U, m1877X(t, m1875V(iM1930s0)));
                    }
                    break;
                case 52:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1760L(iM1898U, m1878Y(t, m1875V(iM1930s0)));
                    }
                    break;
                case 53:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1757I(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 54:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1768e(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 55:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1770g(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 56:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1779p(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 57:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1766c(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 58:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1780q(iM1898U, m1876W(t, m1875V(iM1930s0)));
                    }
                    break;
                case 59:
                    if (m1892I(t, iM1898U, i)) {
                        m1939x0(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), writer);
                    }
                    break;
                case 60:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1773j(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), m1935v(i));
                    }
                    break;
                case 61:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1771h(iM1898U, (ByteString) ipj0.m137494E(t, m1875V(iM1930s0)));
                    }
                    break;
                case 62:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1777n(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 63:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1761M(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 64:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1781r(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 65:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1749A(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 66:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1763O(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 67:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1775l(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 68:
                    if (m1892I(t, iM1898U, i)) {
                        writer.mo1752D(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), m1935v(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f1623p.mo2258j(writer, entry);
            entry = itM2313s.hasNext() ? (Map.Entry) itM2313s.next() : null;
        }
        m1941y0(this.f1622o, t, writer);
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC0335i0 m1935v(int i) {
        int i2 = (i / 3) * 2;
        InterfaceC0335i0 interfaceC0335i0 = (InterfaceC0335i0) this.f1609b[i2];
        if (interfaceC0335i0 != null) {
            return interfaceC0335i0;
        }
        InterfaceC0335i0<T> interfaceC0335i0M109403d = cza0.m109400a().m109403d((Class) this.f1609b[i2 + 1]);
        this.f1609b[i2] = interfaceC0335i0M109403d;
        return interfaceC0335i0M109403d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: v0 */
    public final void m1936v0(T t, Writer writer) throws IOException {
        Iterator itM2305g;
        Map.Entry<?, ?> entry;
        m1941y0(this.f1622o, t, writer);
        if (this.f1613f) {
            C0347p<T> c0347pMo2251c = this.f1623p.mo2251c(t);
            if (c0347pMo2251c.m2310n()) {
                itM2305g = null;
                entry = null;
            } else {
                itM2305g = c0347pMo2251c.m2305g();
                entry = (Map.Entry) itM2305g.next();
            }
        } else {
            itM2305g = null;
            entry = null;
        }
        for (int length = this.f1608a.length - 3; length >= 0; length -= 3) {
            int iM1930s0 = m1930s0(length);
            int iM1898U = m1898U(length);
            while (entry != null && this.f1623p.mo2249a(entry) > iM1898U) {
                this.f1623p.mo2258j(writer, entry);
                entry = itM2305g.hasNext() ? (Map.Entry) itM2305g.next() : null;
            }
            switch (m1884r0(iM1930s0)) {
                case 0:
                    if (m1887C(t, length)) {
                        writer.mo1753E(iM1898U, m1883o(t, m1875V(iM1930s0)));
                    }
                    break;
                case 1:
                    if (m1887C(t, length)) {
                        writer.mo1760L(iM1898U, m1885s(t, m1875V(iM1930s0)));
                    }
                    break;
                case 2:
                    if (m1887C(t, length)) {
                        writer.mo1757I(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 3:
                    if (m1887C(t, length)) {
                        writer.mo1768e(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 4:
                    if (m1887C(t, length)) {
                        writer.mo1770g(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 5:
                    if (m1887C(t, length)) {
                        writer.mo1779p(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 6:
                    if (m1887C(t, length)) {
                        writer.mo1766c(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 7:
                    if (m1887C(t, length)) {
                        writer.mo1780q(iM1898U, m1881l(t, m1875V(iM1930s0)));
                    }
                    break;
                case 8:
                    if (m1887C(t, length)) {
                        m1939x0(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), writer);
                    }
                    break;
                case 9:
                    if (m1887C(t, length)) {
                        writer.mo1773j(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), m1935v(length));
                    }
                    break;
                case 10:
                    if (m1887C(t, length)) {
                        writer.mo1771h(iM1898U, (ByteString) ipj0.m137494E(t, m1875V(iM1930s0)));
                    }
                    break;
                case 11:
                    if (m1887C(t, length)) {
                        writer.mo1777n(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 12:
                    if (m1887C(t, length)) {
                        writer.mo1761M(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 13:
                    if (m1887C(t, length)) {
                        writer.mo1781r(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 14:
                    if (m1887C(t, length)) {
                        writer.mo1749A(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 15:
                    if (m1887C(t, length)) {
                        writer.mo1763O(iM1898U, m1866A(t, m1875V(iM1930s0)));
                    }
                    break;
                case 16:
                    if (m1887C(t, length)) {
                        writer.mo1775l(iM1898U, m1871L(t, m1875V(iM1930s0)));
                    }
                    break;
                case 17:
                    if (m1887C(t, length)) {
                        writer.mo1752D(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), m1935v(length));
                    }
                    break;
                case 18:
                    C0337j0.m2155P(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 19:
                    C0337j0.m2159T(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 20:
                    C0337j0.m2162W(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 21:
                    C0337j0.m2175e0(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 22:
                    C0337j0.m2161V(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 23:
                    C0337j0.m2158S(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 24:
                    C0337j0.m2157R(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 25:
                    C0337j0.m2153N(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 26:
                    C0337j0.m2171c0(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer);
                    break;
                case 27:
                    C0337j0.m2163X(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, m1935v(length));
                    break;
                case 28:
                    C0337j0.m2154O(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer);
                    break;
                case 29:
                    C0337j0.m2173d0(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 30:
                    C0337j0.m2156Q(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 31:
                    C0337j0.m2164Y(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 32:
                    C0337j0.m2165Z(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 33:
                    C0337j0.m2167a0(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 34:
                    C0337j0.m2169b0(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, false);
                    break;
                case 35:
                    C0337j0.m2155P(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 36:
                    C0337j0.m2159T(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 37:
                    C0337j0.m2162W(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 38:
                    C0337j0.m2175e0(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 39:
                    C0337j0.m2161V(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 40:
                    C0337j0.m2158S(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 41:
                    C0337j0.m2157R(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 42:
                    C0337j0.m2153N(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 43:
                    C0337j0.m2173d0(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 44:
                    C0337j0.m2156Q(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 45:
                    C0337j0.m2164Y(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 46:
                    C0337j0.m2165Z(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 47:
                    C0337j0.m2167a0(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 48:
                    C0337j0.m2169b0(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, true);
                    break;
                case 49:
                    C0337j0.m2160U(m1898U(length), (List) ipj0.m137494E(t, m1875V(iM1930s0)), writer, m1935v(length));
                    break;
                case 50:
                    m1937w0(writer, iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), length);
                    break;
                case 51:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1753E(iM1898U, m1877X(t, m1875V(iM1930s0)));
                    }
                    break;
                case 52:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1760L(iM1898U, m1878Y(t, m1875V(iM1930s0)));
                    }
                    break;
                case 53:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1757I(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 54:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1768e(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 55:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1770g(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 56:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1779p(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 57:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1766c(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 58:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1780q(iM1898U, m1876W(t, m1875V(iM1930s0)));
                    }
                    break;
                case 59:
                    if (m1892I(t, iM1898U, length)) {
                        m1939x0(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), writer);
                    }
                    break;
                case 60:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1773j(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), m1935v(length));
                    }
                    break;
                case 61:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1771h(iM1898U, (ByteString) ipj0.m137494E(t, m1875V(iM1930s0)));
                    }
                    break;
                case 62:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1777n(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 63:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1761M(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 64:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1781r(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 65:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1749A(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 66:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1763O(iM1898U, m1879Z(t, m1875V(iM1930s0)));
                    }
                    break;
                case 67:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1775l(iM1898U, m1880a0(t, m1875V(iM1930s0)));
                    }
                    break;
                case 68:
                    if (m1892I(t, iM1898U, length)) {
                        writer.mo1752D(iM1898U, ipj0.m137494E(t, m1875V(iM1930s0)), m1935v(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f1623p.mo2258j(writer, entry);
            entry = itM2305g.hasNext() ? (Map.Entry) itM2305g.next() : null;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final <K, V> void m1937w0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.mo1776m(i, this.f1624q.mo1806b(m1933u(i2)), this.f1624q.mo1811g(obj));
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
    public final int m1938x(T t) {
        int i;
        int i2;
        int iM1534j;
        int iM1526e;
        boolean z;
        int iM2176f;
        int iM2179i;
        int iM1518W;
        int iM1520Y;
        Unsafe unsafe = f1607s;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < this.f1608a.length) {
            int iM1930s0 = m1930s0(i4);
            int iM1898U = m1898U(i4);
            int iM1884r0 = m1884r0(iM1930s0);
            if (iM1884r0 <= 17) {
                i = this.f1608a[i4 + 2];
                int i7 = 1048575 & i;
                int i8 = 1 << (i >>> 20);
                if (i7 != i3) {
                    i6 = unsafe.getInt(t, i7);
                    i3 = i7;
                }
                i2 = i8;
            } else {
                i = (!this.f1616i || iM1884r0 < FieldType.DOUBLE_LIST_PACKED.m1621id() || iM1884r0 > FieldType.SINT64_LIST_PACKED.m1621id()) ? 0 : this.f1608a[i4 + 2] & 1048575;
                i2 = 0;
            }
            long jM1875V = m1875V(iM1930s0);
            int i9 = i3;
            switch (iM1884r0) {
                case 0:
                    if ((i6 & i2) != 0) {
                        iM1534j = CodedOutputStream.m1534j(iM1898U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i5 += iM1534j;
                    }
                    break;
                case 1:
                    if ((i6 & i2) != 0) {
                        iM1534j = CodedOutputStream.m1542r(iM1898U, 0.0f);
                        i5 += iM1534j;
                    }
                    break;
                case 2:
                    if ((i6 & i2) != 0) {
                        iM1534j = CodedOutputStream.m1549y(iM1898U, unsafe.getLong(t, jM1875V));
                        i5 += iM1534j;
                    }
                    break;
                case 3:
                    if ((i6 & i2) != 0) {
                        iM1534j = CodedOutputStream.m1521Z(iM1898U, unsafe.getLong(t, jM1875V));
                        i5 += iM1534j;
                    }
                    break;
                case 4:
                    if ((i6 & i2) != 0) {
                        iM1534j = CodedOutputStream.m1547w(iM1898U, unsafe.getInt(t, jM1875V));
                        i5 += iM1534j;
                    }
                    break;
                case 5:
                    if ((i6 & i2) != 0) {
                        iM1534j = CodedOutputStream.m1540p(iM1898U, 0L);
                        i5 += iM1534j;
                    }
                    break;
                case 6:
                    if ((i6 & i2) != 0) {
                        iM1534j = CodedOutputStream.m1538n(iM1898U, 0);
                        i5 += iM1534j;
                    }
                    break;
                case 7:
                    if ((i6 & i2) != 0) {
                        iM1526e = CodedOutputStream.m1526e(iM1898U, true);
                        i5 += iM1526e;
                    }
                    break;
                case 8:
                    if ((i6 & i2) != 0) {
                        Object object = unsafe.getObject(t, jM1875V);
                        iM1526e = object instanceof ByteString ? CodedOutputStream.m1530h(iM1898U, (ByteString) object) : CodedOutputStream.m1516U(iM1898U, (String) object);
                        i5 += iM1526e;
                    }
                    break;
                case 9:
                    if ((i6 & i2) != 0) {
                        iM1526e = C0337j0.m2185o(iM1898U, unsafe.getObject(t, jM1875V), m1935v(i4));
                        i5 += iM1526e;
                    }
                    break;
                case 10:
                    if ((i6 & i2) != 0) {
                        iM1526e = CodedOutputStream.m1530h(iM1898U, (ByteString) unsafe.getObject(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 11:
                    if ((i6 & i2) != 0) {
                        iM1526e = CodedOutputStream.m1519X(iM1898U, unsafe.getInt(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 12:
                    if ((i6 & i2) != 0) {
                        iM1526e = CodedOutputStream.m1536l(iM1898U, unsafe.getInt(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 13:
                    if ((i6 & i2) != 0) {
                        iM1526e = CodedOutputStream.m1508M(iM1898U, 0);
                        i5 += iM1526e;
                    }
                    break;
                case 14:
                    if ((i6 & i2) != 0) {
                        iM1526e = CodedOutputStream.m1510O(iM1898U, 0L);
                        i5 += iM1526e;
                    }
                    break;
                case 15:
                    if ((i6 & i2) != 0) {
                        iM1526e = CodedOutputStream.m1512Q(iM1898U, unsafe.getInt(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 16:
                    if ((i6 & i2) != 0) {
                        iM1526e = CodedOutputStream.m1514S(iM1898U, unsafe.getLong(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 17:
                    if ((i6 & i2) != 0) {
                        iM1526e = CodedOutputStream.m1544t(iM1898U, (InterfaceC0321b0) unsafe.getObject(t, jM1875V), m1935v(i4));
                        i5 += iM1526e;
                    }
                    break;
                case 18:
                    iM1526e = C0337j0.m2178h(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM1526e;
                    break;
                case 19:
                    z = false;
                    iM2176f = C0337j0.m2176f(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 20:
                    z = false;
                    iM2176f = C0337j0.m2183m(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 21:
                    z = false;
                    iM2176f = C0337j0.m2194x(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 22:
                    z = false;
                    iM2176f = C0337j0.m2181k(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 23:
                    z = false;
                    iM2176f = C0337j0.m2178h(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 24:
                    z = false;
                    iM2176f = C0337j0.m2176f(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 25:
                    z = false;
                    iM2176f = C0337j0.m2166a(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 26:
                    iM1526e = C0337j0.m2191u(iM1898U, (List) unsafe.getObject(t, jM1875V));
                    i5 += iM1526e;
                    break;
                case 27:
                    iM1526e = C0337j0.m2186p(iM1898U, (List) unsafe.getObject(t, jM1875V), m1935v(i4));
                    i5 += iM1526e;
                    break;
                case 28:
                    iM1526e = C0337j0.m2170c(iM1898U, (List) unsafe.getObject(t, jM1875V));
                    i5 += iM1526e;
                    break;
                case 29:
                    iM1526e = C0337j0.m2192v(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM1526e;
                    break;
                case 30:
                    z = false;
                    iM2176f = C0337j0.m2172d(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 31:
                    z = false;
                    iM2176f = C0337j0.m2176f(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 32:
                    z = false;
                    iM2176f = C0337j0.m2178h(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 33:
                    z = false;
                    iM2176f = C0337j0.m2187q(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 34:
                    z = false;
                    iM2176f = C0337j0.m2189s(iM1898U, (List) unsafe.getObject(t, jM1875V), false);
                    i5 += iM2176f;
                    break;
                case 35:
                    iM2179i = C0337j0.m2179i((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 36:
                    iM2179i = C0337j0.m2177g((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 37:
                    iM2179i = C0337j0.m2184n((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 38:
                    iM2179i = C0337j0.m2195y((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 39:
                    iM2179i = C0337j0.m2182l((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 40:
                    iM2179i = C0337j0.m2179i((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 41:
                    iM2179i = C0337j0.m2177g((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 42:
                    iM2179i = C0337j0.m2168b((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 43:
                    iM2179i = C0337j0.m2193w((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 44:
                    iM2179i = C0337j0.m2174e((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 45:
                    iM2179i = C0337j0.m2177g((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 46:
                    iM2179i = C0337j0.m2179i((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 47:
                    iM2179i = C0337j0.m2188r((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 48:
                    iM2179i = C0337j0.m2190t((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        i5 += iM1518W + iM1520Y + iM2179i;
                    }
                    break;
                case 49:
                    iM1526e = C0337j0.m2180j(iM1898U, (List) unsafe.getObject(t, jM1875V), m1935v(i4));
                    i5 += iM1526e;
                    break;
                case 50:
                    iM1526e = this.f1624q.mo1808d(iM1898U, unsafe.getObject(t, jM1875V), m1933u(i4));
                    i5 += iM1526e;
                    break;
                case 51:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1534j(iM1898U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i5 += iM1526e;
                    }
                    break;
                case 52:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1542r(iM1898U, 0.0f);
                        i5 += iM1526e;
                    }
                    break;
                case 53:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1549y(iM1898U, m1880a0(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 54:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1521Z(iM1898U, m1880a0(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 55:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1547w(iM1898U, m1879Z(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 56:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1540p(iM1898U, 0L);
                        i5 += iM1526e;
                    }
                    break;
                case 57:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1538n(iM1898U, 0);
                        i5 += iM1526e;
                    }
                    break;
                case 58:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1526e(iM1898U, true);
                        i5 += iM1526e;
                    }
                    break;
                case 59:
                    if (m1892I(t, iM1898U, i4)) {
                        Object object2 = unsafe.getObject(t, jM1875V);
                        iM1526e = object2 instanceof ByteString ? CodedOutputStream.m1530h(iM1898U, (ByteString) object2) : CodedOutputStream.m1516U(iM1898U, (String) object2);
                        i5 += iM1526e;
                    }
                    break;
                case 60:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = C0337j0.m2185o(iM1898U, unsafe.getObject(t, jM1875V), m1935v(i4));
                        i5 += iM1526e;
                    }
                    break;
                case 61:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1530h(iM1898U, (ByteString) unsafe.getObject(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 62:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1519X(iM1898U, m1879Z(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 63:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1536l(iM1898U, m1879Z(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 64:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1508M(iM1898U, 0);
                        i5 += iM1526e;
                    }
                    break;
                case 65:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1510O(iM1898U, 0L);
                        i5 += iM1526e;
                    }
                    break;
                case 66:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1512Q(iM1898U, m1879Z(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 67:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1514S(iM1898U, m1880a0(t, jM1875V));
                        i5 += iM1526e;
                    }
                    break;
                case 68:
                    if (m1892I(t, iM1898U, i4)) {
                        iM1526e = CodedOutputStream.m1544t(iM1898U, (InterfaceC0321b0) unsafe.getObject(t, jM1875V), m1935v(i4));
                        i5 += iM1526e;
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i3 = i9;
        }
        int iM1942z = i5 + m1942z(this.f1622o, t);
        return this.f1613f ? iM1942z + this.f1623p.mo2251c(t).m2309l() : iM1942z;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m1939x0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.mo1767d(i, (String) obj);
        } else {
            writer.mo1771h(i, (ByteString) obj);
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m1940y(T t) {
        int iM1534j;
        int iM2179i;
        int iM1518W;
        int iM1520Y;
        Unsafe unsafe = f1607s;
        int i = 0;
        for (int i2 = 0; i2 < this.f1608a.length; i2 += 3) {
            int iM1930s0 = m1930s0(i2);
            int iM1884r0 = m1884r0(iM1930s0);
            int iM1898U = m1898U(i2);
            long jM1875V = m1875V(iM1930s0);
            int i3 = (iM1884r0 < FieldType.DOUBLE_LIST_PACKED.m1621id() || iM1884r0 > FieldType.SINT64_LIST_PACKED.m1621id()) ? 0 : this.f1608a[i2 + 2] & 1048575;
            switch (iM1884r0) {
                case 0:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1534j(iM1898U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i += iM1534j;
                    }
                    break;
                case 1:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1542r(iM1898U, 0.0f);
                        i += iM1534j;
                    }
                    break;
                case 2:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1549y(iM1898U, ipj0.m137492C(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 3:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1521Z(iM1898U, ipj0.m137492C(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 4:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1547w(iM1898U, ipj0.m137490A(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 5:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1540p(iM1898U, 0L);
                        i += iM1534j;
                    }
                    break;
                case 6:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1538n(iM1898U, 0);
                        i += iM1534j;
                    }
                    break;
                case 7:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1526e(iM1898U, true);
                        i += iM1534j;
                    }
                    break;
                case 8:
                    if (m1887C(t, i2)) {
                        Object objM137494E = ipj0.m137494E(t, jM1875V);
                        iM1534j = objM137494E instanceof ByteString ? CodedOutputStream.m1530h(iM1898U, (ByteString) objM137494E) : CodedOutputStream.m1516U(iM1898U, (String) objM137494E);
                        i += iM1534j;
                    }
                    break;
                case 9:
                    if (m1887C(t, i2)) {
                        iM1534j = C0337j0.m2185o(iM1898U, ipj0.m137494E(t, jM1875V), m1935v(i2));
                        i += iM1534j;
                    }
                    break;
                case 10:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1530h(iM1898U, (ByteString) ipj0.m137494E(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 11:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1519X(iM1898U, ipj0.m137490A(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 12:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1536l(iM1898U, ipj0.m137490A(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 13:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1508M(iM1898U, 0);
                        i += iM1534j;
                    }
                    break;
                case 14:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1510O(iM1898U, 0L);
                        i += iM1534j;
                    }
                    break;
                case 15:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1512Q(iM1898U, ipj0.m137490A(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 16:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1514S(iM1898U, ipj0.m137492C(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 17:
                    if (m1887C(t, i2)) {
                        iM1534j = CodedOutputStream.m1544t(iM1898U, (InterfaceC0321b0) ipj0.m137494E(t, jM1875V), m1935v(i2));
                        i += iM1534j;
                    }
                    break;
                case 18:
                    iM1534j = C0337j0.m2178h(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 19:
                    iM1534j = C0337j0.m2176f(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 20:
                    iM1534j = C0337j0.m2183m(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 21:
                    iM1534j = C0337j0.m2194x(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 22:
                    iM1534j = C0337j0.m2181k(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 23:
                    iM1534j = C0337j0.m2178h(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 24:
                    iM1534j = C0337j0.m2176f(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 25:
                    iM1534j = C0337j0.m2166a(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 26:
                    iM1534j = C0337j0.m2191u(iM1898U, m1870K(t, jM1875V));
                    i += iM1534j;
                    break;
                case 27:
                    iM1534j = C0337j0.m2186p(iM1898U, m1870K(t, jM1875V), m1935v(i2));
                    i += iM1534j;
                    break;
                case 28:
                    iM1534j = C0337j0.m2170c(iM1898U, m1870K(t, jM1875V));
                    i += iM1534j;
                    break;
                case 29:
                    iM1534j = C0337j0.m2192v(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 30:
                    iM1534j = C0337j0.m2172d(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 31:
                    iM1534j = C0337j0.m2176f(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 32:
                    iM1534j = C0337j0.m2178h(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 33:
                    iM1534j = C0337j0.m2187q(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 34:
                    iM1534j = C0337j0.m2189s(iM1898U, m1870K(t, jM1875V), false);
                    i += iM1534j;
                    break;
                case 35:
                    iM2179i = C0337j0.m2179i((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 36:
                    iM2179i = C0337j0.m2177g((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 37:
                    iM2179i = C0337j0.m2184n((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 38:
                    iM2179i = C0337j0.m2195y((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 39:
                    iM2179i = C0337j0.m2182l((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 40:
                    iM2179i = C0337j0.m2179i((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 41:
                    iM2179i = C0337j0.m2177g((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 42:
                    iM2179i = C0337j0.m2168b((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 43:
                    iM2179i = C0337j0.m2193w((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 44:
                    iM2179i = C0337j0.m2174e((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 45:
                    iM2179i = C0337j0.m2177g((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 46:
                    iM2179i = C0337j0.m2179i((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 47:
                    iM2179i = C0337j0.m2188r((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 48:
                    iM2179i = C0337j0.m2190t((List) unsafe.getObject(t, jM1875V));
                    if (iM2179i > 0) {
                        if (this.f1616i) {
                            unsafe.putInt(t, i3, iM2179i);
                        }
                        iM1518W = CodedOutputStream.m1518W(iM1898U);
                        iM1520Y = CodedOutputStream.m1520Y(iM2179i);
                        iM1534j = iM1518W + iM1520Y + iM2179i;
                        i += iM1534j;
                    }
                    break;
                case 49:
                    iM1534j = C0337j0.m2180j(iM1898U, m1870K(t, jM1875V), m1935v(i2));
                    i += iM1534j;
                    break;
                case 50:
                    iM1534j = this.f1624q.mo1808d(iM1898U, ipj0.m137494E(t, jM1875V), m1933u(i2));
                    i += iM1534j;
                    break;
                case 51:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1534j(iM1898U, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i += iM1534j;
                    }
                    break;
                case 52:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1542r(iM1898U, 0.0f);
                        i += iM1534j;
                    }
                    break;
                case 53:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1549y(iM1898U, m1880a0(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 54:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1521Z(iM1898U, m1880a0(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 55:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1547w(iM1898U, m1879Z(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 56:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1540p(iM1898U, 0L);
                        i += iM1534j;
                    }
                    break;
                case 57:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1538n(iM1898U, 0);
                        i += iM1534j;
                    }
                    break;
                case 58:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1526e(iM1898U, true);
                        i += iM1534j;
                    }
                    break;
                case 59:
                    if (m1892I(t, iM1898U, i2)) {
                        Object objM137494E2 = ipj0.m137494E(t, jM1875V);
                        iM1534j = objM137494E2 instanceof ByteString ? CodedOutputStream.m1530h(iM1898U, (ByteString) objM137494E2) : CodedOutputStream.m1516U(iM1898U, (String) objM137494E2);
                        i += iM1534j;
                    }
                    break;
                case 60:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = C0337j0.m2185o(iM1898U, ipj0.m137494E(t, jM1875V), m1935v(i2));
                        i += iM1534j;
                    }
                    break;
                case 61:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1530h(iM1898U, (ByteString) ipj0.m137494E(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 62:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1519X(iM1898U, m1879Z(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 63:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1536l(iM1898U, m1879Z(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 64:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1508M(iM1898U, 0);
                        i += iM1534j;
                    }
                    break;
                case 65:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1510O(iM1898U, 0L);
                        i += iM1534j;
                    }
                    break;
                case 66:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1512Q(iM1898U, m1879Z(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 67:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1514S(iM1898U, m1880a0(t, jM1875V));
                        i += iM1534j;
                    }
                    break;
                case 68:
                    if (m1892I(t, iM1898U, i2)) {
                        iM1534j = CodedOutputStream.m1544t(iM1898U, (InterfaceC0321b0) ipj0.m137494E(t, jM1875V), m1935v(i2));
                        i += iM1534j;
                    }
                    break;
            }
        }
        return i + m1942z(this.f1622o, t);
    }

    /* JADX INFO: renamed from: y0 */
    public final <UT, UB> void m1941y0(AbstractC0341l0<UT, UB> abstractC0341l0, T t, Writer writer) throws IOException {
        abstractC0341l0.mo2248t(abstractC0341l0.mo2235g(t), writer);
    }

    /* JADX INFO: renamed from: z */
    public final <UT, UB> int m1942z(AbstractC0341l0<UT, UB> abstractC0341l0, T t) {
        return abstractC0341l0.mo2236h(abstractC0341l0.mo2235g(t));
    }
}
