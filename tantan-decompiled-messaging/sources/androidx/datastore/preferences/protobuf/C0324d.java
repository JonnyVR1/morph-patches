package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import p149l.cza0;
import p149l.j850;
import p149l.qkq0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0324d {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1601a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f1601a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1601a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1601a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1601a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1601a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1601a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1601a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1601a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1601a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1601a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1601a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1601a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1601a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1601a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1601a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1601a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1601a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1601a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f1602a;

        /* JADX INFO: renamed from: b */
        public long f1603b;

        /* JADX INFO: renamed from: c */
        public Object f1604c;

        /* JADX INFO: renamed from: d */
        public final C0340l f1605d;

        public b(C0340l c0340l) {
            c0340l.getClass();
            this.f1605d = c0340l;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m1826A(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) {
        C0349r c0349r = (C0349r) iVar;
        int iM1834I = m1834I(bArr, i2, bVar);
        c0349r.m2331T(AbstractC0330g.m2027b(bVar.f1602a));
        while (iM1834I < i3) {
            int iM1834I2 = m1834I(bArr, iM1834I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1834I = m1834I(bArr, iM1834I2, bVar);
            c0349r.m2331T(AbstractC0330g.m2027b(bVar.f1602a));
        }
        return iM1834I;
    }

    /* JADX INFO: renamed from: B */
    public static int m1827B(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) {
        C0355x c0355x = (C0355x) iVar;
        int iM1837L = m1837L(bArr, i2, bVar);
        c0355x.m2383u(AbstractC0330g.m2028c(bVar.f1603b));
        while (iM1837L < i3) {
            int iM1834I = m1834I(bArr, iM1837L, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1837L = m1837L(bArr, iM1834I, bVar);
            c0355x.m2383u(AbstractC0330g.m2028c(bVar.f1603b));
        }
        return iM1837L;
    }

    /* JADX INFO: renamed from: C */
    public static int m1828C(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.f1604c = "";
            return iM1834I;
        }
        bVar.f1604c = new String(bArr, iM1834I, i2, C0350s.f1737a);
        return iM1834I + i2;
    }

    /* JADX INFO: renamed from: D */
    public static int m1829D(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iM1834I = m1834I(bArr, i2, bVar);
        int i4 = bVar.f1602a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, iM1834I, i4, C0350s.f1737a));
            iM1834I += i4;
        }
        while (iM1834I < i3) {
            int iM1834I2 = m1834I(bArr, iM1834I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1834I = m1834I(bArr, iM1834I2, bVar);
            int i5 = bVar.f1602a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, iM1834I, i5, C0350s.f1737a));
                iM1834I += i5;
            }
        }
        return iM1834I;
    }

    /* JADX INFO: renamed from: E */
    public static int m1830E(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iM1834I = m1834I(bArr, i2, bVar);
        int i4 = bVar.f1602a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            int i5 = iM1834I + i4;
            if (!Utf8.m1704t(bArr, iM1834I, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            iVar.add(new String(bArr, iM1834I, i4, C0350s.f1737a));
            iM1834I = i5;
        }
        while (iM1834I < i3) {
            int iM1834I2 = m1834I(bArr, iM1834I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1834I = m1834I(bArr, iM1834I2, bVar);
            int i6 = bVar.f1602a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                iVar.add("");
            } else {
                int i7 = iM1834I + i6;
                if (!Utf8.m1704t(bArr, iM1834I, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                iVar.add(new String(bArr, iM1834I, i6, C0350s.f1737a));
                iM1834I = i7;
            }
        }
        return iM1834I;
    }

    /* JADX INFO: renamed from: F */
    public static int m1831F(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.f1604c = "";
            return iM1834I;
        }
        bVar.f1604c = Utf8.m1692h(bArr, iM1834I, i2);
        return iM1834I + i2;
    }

    /* JADX INFO: renamed from: G */
    public static int m1832G(int i, byte[] bArr, int i2, int i3, C0343m0 c0343m0, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.m1746a(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iM1747b = WireFormat.m1747b(i);
        if (iM1747b == 0) {
            int iM1837L = m1837L(bArr, i2, bVar);
            c0343m0.m2273n(i, Long.valueOf(bVar.f1603b));
            return iM1837L;
        }
        if (iM1747b == 1) {
            c0343m0.m2273n(i, Long.valueOf(m1849j(bArr, i2)));
            return i2 + 8;
        }
        if (iM1747b == 2) {
            int iM1834I = m1834I(bArr, i2, bVar);
            int i4 = bVar.f1602a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - iM1834I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                c0343m0.m2273n(i, ByteString.EMPTY);
            } else {
                c0343m0.m2273n(i, ByteString.copyFrom(bArr, iM1834I, i4));
            }
            return iM1834I + i4;
        }
        if (iM1747b != 3) {
            if (iM1747b != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            c0343m0.m2273n(i, Integer.valueOf(m1847h(bArr, i2)));
            return i2 + 4;
        }
        C0343m0 c0343m0M2265l = C0343m0.m2265l();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            int iM1834I2 = m1834I(bArr, i2, bVar);
            i6 = bVar.f1602a;
            if (i6 == i5) {
                i2 = iM1834I2;
                break;
            }
            i2 = m1832G(i6, bArr, iM1834I2, i3, c0343m0M2265l, bVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        c0343m0.m2273n(i, c0343m0M2265l);
        return i2;
    }

    /* JADX INFO: renamed from: H */
    public static int m1833H(int i, byte[] bArr, int i2, b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            bVar.f1602a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            bVar.f1602a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            bVar.f1602a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            bVar.f1602a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                bVar.f1602a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: I */
    public static int m1834I(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return m1833H(b2, bArr, i2, bVar);
        }
        bVar.f1602a = b2;
        return i2;
    }

    /* JADX INFO: renamed from: J */
    public static int m1835J(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) {
        C0349r c0349r = (C0349r) iVar;
        int iM1834I = m1834I(bArr, i2, bVar);
        c0349r.m2331T(bVar.f1602a);
        while (iM1834I < i3) {
            int iM1834I2 = m1834I(bArr, iM1834I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1834I = m1834I(bArr, iM1834I2, bVar);
            c0349r.m2331T(bVar.f1602a);
        }
        return iM1834I;
    }

    /* JADX INFO: renamed from: K */
    public static int m1836K(long j, byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i3 = 7;
        while (b2 < 0) {
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b3 & 127)) << i3;
            i2 = i4;
            b2 = b3;
        }
        bVar.f1603b = j2;
        return i2;
    }

    /* JADX INFO: renamed from: L */
    public static int m1837L(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return m1836K(j, bArr, i2, bVar);
        }
        bVar.f1603b = j;
        return i2;
    }

    /* JADX INFO: renamed from: M */
    public static int m1838M(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) {
        C0355x c0355x = (C0355x) iVar;
        int iM1837L = m1837L(bArr, i2, bVar);
        c0355x.m2383u(bVar.f1603b);
        while (iM1837L < i3) {
            int iM1834I = m1834I(bArr, iM1837L, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1837L = m1837L(bArr, iM1834I, bVar);
            c0355x.m2383u(bVar.f1603b);
        }
        return iM1837L;
    }

    /* JADX INFO: renamed from: N */
    public static int m1839N(int i, byte[] bArr, int i2, int i3, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.m1746a(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iM1747b = WireFormat.m1747b(i);
        if (iM1747b == 0) {
            return m1837L(bArr, i2, bVar);
        }
        if (iM1747b == 1) {
            return i2 + 8;
        }
        if (iM1747b == 2) {
            return m1834I(bArr, i2, bVar) + bVar.f1602a;
        }
        if (iM1747b != 3) {
            if (iM1747b == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = m1834I(bArr, i2, bVar);
            i5 = bVar.f1602a;
            if (i5 == i4) {
                break;
            }
            i2 = m1839N(i5, bArr, i2, i3, bVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m1840a(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) {
        C0328f c0328f = (C0328f) iVar;
        int iM1837L = m1837L(bArr, i2, bVar);
        c0328f.m2017h(bVar.f1603b != 0);
        while (iM1837L < i3) {
            int iM1834I = m1834I(bArr, iM1837L, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1837L = m1837L(bArr, iM1834I, bVar);
            c0328f.m2017h(bVar.f1603b != 0);
        }
        return iM1837L;
    }

    /* JADX INFO: renamed from: b */
    public static int m1841b(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iM1834I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            bVar.f1604c = ByteString.EMPTY;
            return iM1834I;
        }
        bVar.f1604c = ByteString.copyFrom(bArr, iM1834I, i2);
        return iM1834I + i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m1842c(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iM1834I = m1834I(bArr, i2, bVar);
        int i4 = bVar.f1602a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - iM1834I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            iVar.add(ByteString.EMPTY);
        } else {
            iVar.add(ByteString.copyFrom(bArr, iM1834I, i4));
            iM1834I += i4;
        }
        while (iM1834I < i3) {
            int iM1834I2 = m1834I(bArr, iM1834I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1834I = m1834I(bArr, iM1834I2, bVar);
            int i5 = bVar.f1602a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - iM1834I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                iVar.add(ByteString.EMPTY);
            } else {
                iVar.add(ByteString.copyFrom(bArr, iM1834I, i5));
                iM1834I += i5;
            }
        }
        return iM1834I;
    }

    /* JADX INFO: renamed from: d */
    public static double m1843d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m1849j(bArr, i));
    }

    /* JADX INFO: renamed from: e */
    public static int m1844e(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) {
        C0336j c0336j = (C0336j) iVar;
        c0336j.m2132g(m1843d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iM1834I = m1834I(bArr, i4, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            c0336j.m2132g(m1843d(bArr, iM1834I));
            i4 = iM1834I + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: f */
    public static int m1845f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.AbstractC0294c<?, ?> abstractC0294c, GeneratedMessageLite.C0296e<?, ?> c0296e, AbstractC0341l0<C0343m0, C0343m0> abstractC0341l0, b bVar) throws IOException {
        int i4;
        Object objValueOf;
        int i5;
        Object objM2306i;
        C0347p<GeneratedMessageLite.C0295d> c0347p = abstractC0294c.extensions;
        int i6 = i >>> 3;
        Object objValueOf2 = null;
        if (c0296e.f1578b.isRepeated() && c0296e.f1578b.isPacked()) {
            switch (a.f1601a[c0296e.m1667a().ordinal()]) {
                case 1:
                    C0336j c0336j = new C0336j();
                    int iM1858s = m1858s(bArr, i2, c0336j, bVar);
                    c0347p.m2317x(c0296e.f1578b, c0336j);
                    return iM1858s;
                case 2:
                    C0348q c0348q = new C0348q();
                    int iM1861v = m1861v(bArr, i2, c0348q, bVar);
                    c0347p.m2317x(c0296e.f1578b, c0348q);
                    return iM1861v;
                case 3:
                case 4:
                    C0355x c0355x = new C0355x();
                    int iM1865z = m1865z(bArr, i2, c0355x, bVar);
                    c0347p.m2317x(c0296e.f1578b, c0355x);
                    return iM1865z;
                case 5:
                case 6:
                    C0349r c0349r = new C0349r();
                    int iM1864y = m1864y(bArr, i2, c0349r, bVar);
                    c0347p.m2317x(c0296e.f1578b, c0349r);
                    return iM1864y;
                case 7:
                case 8:
                    C0355x c0355x2 = new C0355x();
                    int iM1860u = m1860u(bArr, i2, c0355x2, bVar);
                    c0347p.m2317x(c0296e.f1578b, c0355x2);
                    return iM1860u;
                case 9:
                case 10:
                    C0349r c0349r2 = new C0349r();
                    int iM1859t = m1859t(bArr, i2, c0349r2, bVar);
                    c0347p.m2317x(c0296e.f1578b, c0349r2);
                    return iM1859t;
                case 11:
                    C0328f c0328f = new C0328f();
                    int iM1857r = m1857r(bArr, i2, c0328f, bVar);
                    c0347p.m2317x(c0296e.f1578b, c0328f);
                    return iM1857r;
                case 12:
                    C0349r c0349r3 = new C0349r();
                    int iM1862w = m1862w(bArr, i2, c0349r3, bVar);
                    c0347p.m2317x(c0296e.f1578b, c0349r3);
                    return iM1862w;
                case 13:
                    C0355x c0355x3 = new C0355x();
                    int iM1863x = m1863x(bArr, i2, c0355x3, bVar);
                    c0347p.m2317x(c0296e.f1578b, c0355x3);
                    return iM1863x;
                case 14:
                    C0349r c0349r4 = new C0349r();
                    int iM1864y2 = m1864y(bArr, i2, c0349r4, bVar);
                    C0343m0 c0343m0 = abstractC0294c.unknownFields;
                    C0343m0 c0343m1 = (C0343m0) C0337j0.m2196z(i6, c0349r4, c0296e.f1578b.m1666b(), c0343m0 != C0343m0.m2261e() ? c0343m0 : null, abstractC0341l0);
                    if (c0343m1 != null) {
                        abstractC0294c.unknownFields = c0343m1;
                    }
                    c0347p.m2317x(c0296e.f1578b, c0349r4);
                    return iM1864y2;
                default:
                    j850.m140190a("Type cannot be packed: ", c0296e.f1578b.mo1662D());
                    return 0;
            }
        }
        if (c0296e.m1667a() != WireFormat.FieldType.ENUM) {
            switch (a.f1601a[c0296e.m1667a().ordinal()]) {
                case 1:
                    i4 = i2;
                    objValueOf = Double.valueOf(m1843d(bArr, i4));
                    i2 = i4 + 8;
                    objValueOf2 = objValueOf;
                    break;
                case 2:
                    i5 = i2;
                    objValueOf = Float.valueOf(m1851l(bArr, i5));
                    i2 = i5 + 4;
                    objValueOf2 = objValueOf;
                    break;
                case 3:
                case 4:
                    i2 = m1837L(bArr, i2, bVar);
                    objValueOf2 = Long.valueOf(bVar.f1603b);
                    break;
                case 5:
                case 6:
                    i2 = m1834I(bArr, i2, bVar);
                    objValueOf2 = Integer.valueOf(bVar.f1602a);
                    break;
                case 7:
                case 8:
                    i4 = i2;
                    objValueOf = Long.valueOf(m1849j(bArr, i4));
                    i2 = i4 + 8;
                    objValueOf2 = objValueOf;
                    break;
                case 9:
                case 10:
                    i5 = i2;
                    objValueOf = Integer.valueOf(m1847h(bArr, i5));
                    i2 = i5 + 4;
                    objValueOf2 = objValueOf;
                    break;
                case 11:
                    i2 = m1837L(bArr, i2, bVar);
                    objValueOf2 = Boolean.valueOf(bVar.f1603b != 0);
                    break;
                case 12:
                    i2 = m1834I(bArr, i2, bVar);
                    objValueOf2 = Integer.valueOf(AbstractC0330g.m2027b(bVar.f1602a));
                    break;
                case 13:
                    i2 = m1837L(bArr, i2, bVar);
                    objValueOf2 = Long.valueOf(AbstractC0330g.m2028c(bVar.f1603b));
                    break;
                case 14:
                    qkq0.m175383a("Shouldn't reach here.");
                    return 0;
                case 15:
                    i2 = m1841b(bArr, i2, bVar);
                    objValueOf2 = bVar.f1604c;
                    break;
                case 16:
                    i2 = m1828C(bArr, i2, bVar);
                    objValueOf2 = bVar.f1604c;
                    break;
                case 17:
                    i2 = m1853n(cza0.m109400a().m109403d(c0296e.m1668b().getClass()), bArr, i2, i3, (i6 << 3) | 4, bVar);
                    objValueOf2 = bVar.f1604c;
                    break;
                case 18:
                    i2 = m1855p(cza0.m109400a().m109403d(c0296e.m1668b().getClass()), bArr, i2, i3, bVar);
                    objValueOf2 = bVar.f1604c;
                    break;
            }
        } else {
            i2 = m1834I(bArr, i2, bVar);
            if (c0296e.f1578b.m1666b().findValueByNumber(bVar.f1602a) == null) {
                C0343m0 c0343m0M2265l = abstractC0294c.unknownFields;
                if (c0343m0M2265l == C0343m0.m2261e()) {
                    c0343m0M2265l = C0343m0.m2265l();
                    abstractC0294c.unknownFields = c0343m0M2265l;
                }
                C0337j0.m2151L(i6, bVar.f1602a, c0343m0M2265l, abstractC0341l0);
                return i2;
            }
            objValueOf2 = Integer.valueOf(bVar.f1602a);
        }
        if (c0296e.m1670d()) {
            c0347p.m2303a(c0296e.f1578b, objValueOf2);
            return i2;
        }
        int i7 = a.f1601a[c0296e.m1667a().ordinal()];
        if ((i7 == 17 || i7 == 18) && (objM2306i = c0347p.m2306i(c0296e.f1578b)) != null) {
            objValueOf2 = C0350s.m2346h(objM2306i, objValueOf2);
        }
        c0347p.m2317x(c0296e.f1578b, objValueOf2);
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static int m1846g(int i, byte[] bArr, int i2, int i3, Object obj, InterfaceC0321b0 interfaceC0321b0, AbstractC0341l0<C0343m0, C0343m0> abstractC0341l0, b bVar) throws IOException {
        GeneratedMessageLite.C0296e c0296eM2228a = bVar.f1605d.m2228a(interfaceC0321b0, i >>> 3);
        if (c0296eM2228a == null) {
            return m1832G(i, bArr, i2, i3, C0325d0.m1886w(obj), bVar);
        }
        GeneratedMessageLite.AbstractC0294c abstractC0294c = (GeneratedMessageLite.AbstractC0294c) obj;
        abstractC0294c.m1661C();
        return m1845f(i, bArr, i2, i3, abstractC0294c, c0296eM2228a, abstractC0341l0, bVar);
    }

    /* JADX INFO: renamed from: h */
    public static int m1847h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: i */
    public static int m1848i(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) {
        C0349r c0349r = (C0349r) iVar;
        c0349r.m2331T(m1847h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iM1834I = m1834I(bArr, i4, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            c0349r.m2331T(m1847h(bArr, iM1834I));
            i4 = iM1834I + 4;
        }
        return i4;
    }

    /* JADX INFO: renamed from: j */
    public static long m1849j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: k */
    public static int m1850k(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) {
        C0355x c0355x = (C0355x) iVar;
        c0355x.m2383u(m1849j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iM1834I = m1834I(bArr, i4, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            c0355x.m2383u(m1849j(bArr, iM1834I));
            i4 = iM1834I + 8;
        }
        return i4;
    }

    /* JADX INFO: renamed from: l */
    public static float m1851l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m1847h(bArr, i));
    }

    /* JADX INFO: renamed from: m */
    public static int m1852m(int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) {
        C0348q c0348q = (C0348q) iVar;
        c0348q.m2321M(m1851l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iM1834I = m1834I(bArr, i4, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            c0348q.m2321M(m1851l(bArr, iM1834I));
            i4 = iM1834I + 4;
        }
        return i4;
    }

    /* JADX INFO: renamed from: n */
    public static int m1853n(InterfaceC0335i0 interfaceC0335i0, byte[] bArr, int i, int i2, int i3, b bVar) throws IOException {
        C0325d0 c0325d0 = (C0325d0) interfaceC0335i0;
        Object objMo1912h = c0325d0.mo1912h();
        int iM1905d0 = c0325d0.m1905d0(objMo1912h, bArr, i, i2, i3, bVar);
        c0325d0.mo1908f(objMo1912h);
        bVar.f1604c = objMo1912h;
        return iM1905d0;
    }

    /* JADX INFO: renamed from: o */
    public static int m1854o(InterfaceC0335i0 interfaceC0335i0, int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iM1853n = m1853n(interfaceC0335i0, bArr, i2, i3, i4, bVar);
        iVar.add(bVar.f1604c);
        while (iM1853n < i3) {
            int iM1834I = m1834I(bArr, iM1853n, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1853n = m1853n(interfaceC0335i0, bArr, iM1834I, i3, i4, bVar);
            iVar.add(bVar.f1604c);
        }
        return iM1853n;
    }

    /* JADX INFO: renamed from: p */
    public static int m1855p(InterfaceC0335i0 interfaceC0335i0, byte[] bArr, int i, int i2, b bVar) throws IOException {
        int iM1833H = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM1833H = m1833H(i3, bArr, iM1833H, bVar);
            i3 = bVar.f1602a;
        }
        int i4 = iM1833H;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        Object objMo1912h = interfaceC0335i0.mo1912h();
        int i5 = i4 + i3;
        interfaceC0335i0.mo1916j(objMo1912h, bArr, i4, i5, bVar);
        interfaceC0335i0.mo1908f(objMo1912h);
        bVar.f1604c = objMo1912h;
        return i5;
    }

    /* JADX INFO: renamed from: q */
    public static int m1856q(InterfaceC0335i0<?> interfaceC0335i0, int i, byte[] bArr, int i2, int i3, C0350s.i<?> iVar, b bVar) throws IOException {
        int iM1855p = m1855p(interfaceC0335i0, bArr, i2, i3, bVar);
        iVar.add(bVar.f1604c);
        while (iM1855p < i3) {
            int iM1834I = m1834I(bArr, iM1855p, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1855p = m1855p(interfaceC0335i0, bArr, iM1834I, i3, bVar);
            iVar.add(bVar.f1604c);
        }
        return iM1855p;
    }

    /* JADX INFO: renamed from: r */
    public static int m1857r(byte[] bArr, int i, C0350s.i<?> iVar, b bVar) throws IOException {
        C0328f c0328f = (C0328f) iVar;
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1834I;
        while (iM1834I < i2) {
            iM1834I = m1837L(bArr, iM1834I, bVar);
            c0328f.m2017h(bVar.f1603b != 0);
        }
        if (iM1834I == i2) {
            return iM1834I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: s */
    public static int m1858s(byte[] bArr, int i, C0350s.i<?> iVar, b bVar) throws IOException {
        C0336j c0336j = (C0336j) iVar;
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1834I;
        while (iM1834I < i2) {
            c0336j.m2132g(m1843d(bArr, iM1834I));
            iM1834I += 8;
        }
        if (iM1834I == i2) {
            return iM1834I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: t */
    public static int m1859t(byte[] bArr, int i, C0350s.i<?> iVar, b bVar) throws IOException {
        C0349r c0349r = (C0349r) iVar;
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1834I;
        while (iM1834I < i2) {
            c0349r.m2331T(m1847h(bArr, iM1834I));
            iM1834I += 4;
        }
        if (iM1834I == i2) {
            return iM1834I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: u */
    public static int m1860u(byte[] bArr, int i, C0350s.i<?> iVar, b bVar) throws IOException {
        C0355x c0355x = (C0355x) iVar;
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1834I;
        while (iM1834I < i2) {
            c0355x.m2383u(m1849j(bArr, iM1834I));
            iM1834I += 8;
        }
        if (iM1834I == i2) {
            return iM1834I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: v */
    public static int m1861v(byte[] bArr, int i, C0350s.i<?> iVar, b bVar) throws IOException {
        C0348q c0348q = (C0348q) iVar;
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1834I;
        while (iM1834I < i2) {
            c0348q.m2321M(m1851l(bArr, iM1834I));
            iM1834I += 4;
        }
        if (iM1834I == i2) {
            return iM1834I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: w */
    public static int m1862w(byte[] bArr, int i, C0350s.i<?> iVar, b bVar) throws IOException {
        C0349r c0349r = (C0349r) iVar;
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1834I;
        while (iM1834I < i2) {
            iM1834I = m1834I(bArr, iM1834I, bVar);
            c0349r.m2331T(AbstractC0330g.m2027b(bVar.f1602a));
        }
        if (iM1834I == i2) {
            return iM1834I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: x */
    public static int m1863x(byte[] bArr, int i, C0350s.i<?> iVar, b bVar) throws IOException {
        C0355x c0355x = (C0355x) iVar;
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1834I;
        while (iM1834I < i2) {
            iM1834I = m1837L(bArr, iM1834I, bVar);
            c0355x.m2383u(AbstractC0330g.m2028c(bVar.f1603b));
        }
        if (iM1834I == i2) {
            return iM1834I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: y */
    public static int m1864y(byte[] bArr, int i, C0350s.i<?> iVar, b bVar) throws IOException {
        C0349r c0349r = (C0349r) iVar;
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1834I;
        while (iM1834I < i2) {
            iM1834I = m1834I(bArr, iM1834I, bVar);
            c0349r.m2331T(bVar.f1602a);
        }
        if (iM1834I == i2) {
            return iM1834I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: z */
    public static int m1865z(byte[] bArr, int i, C0350s.i<?> iVar, b bVar) throws IOException {
        C0355x c0355x = (C0355x) iVar;
        int iM1834I = m1834I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1834I;
        while (iM1834I < i2) {
            iM1834I = m1837L(bArr, iM1834I, bVar);
            c0355x.m2383u(bVar.f1603b);
        }
        if (iM1834I == i2) {
            return iM1834I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
