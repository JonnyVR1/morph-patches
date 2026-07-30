package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import p153l.g7b0;
import p153l.qg50;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0325d {

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
        public final C0341l f1605d;

        public b(C0341l c0341l) {
            c0341l.getClass();
            this.f1605d = c0341l;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m1827A(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) {
        C0350r c0350r = (C0350r) iVar;
        int iM1835I = m1835I(bArr, i2, bVar);
        c0350r.m2332U(AbstractC0331g.m2028b(bVar.f1602a));
        while (iM1835I < i3) {
            int iM1835I2 = m1835I(bArr, iM1835I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1835I = m1835I(bArr, iM1835I2, bVar);
            c0350r.m2332U(AbstractC0331g.m2028b(bVar.f1602a));
        }
        return iM1835I;
    }

    /* JADX INFO: renamed from: B */
    public static int m1828B(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) {
        C0356x c0356x = (C0356x) iVar;
        int iM1838L = m1838L(bArr, i2, bVar);
        c0356x.m2384u(AbstractC0331g.m2029c(bVar.f1603b));
        while (iM1838L < i3) {
            int iM1835I = m1835I(bArr, iM1838L, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1838L = m1838L(bArr, iM1835I, bVar);
            c0356x.m2384u(AbstractC0331g.m2029c(bVar.f1603b));
        }
        return iM1838L;
    }

    /* JADX INFO: renamed from: C */
    public static int m1829C(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.f1604c = "";
            return iM1835I;
        }
        bVar.f1604c = new String(bArr, iM1835I, i2, C0351s.f1737a);
        return iM1835I + i2;
    }

    /* JADX INFO: renamed from: D */
    public static int m1830D(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iM1835I = m1835I(bArr, i2, bVar);
        int i4 = bVar.f1602a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, iM1835I, i4, C0351s.f1737a));
            iM1835I += i4;
        }
        while (iM1835I < i3) {
            int iM1835I2 = m1835I(bArr, iM1835I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1835I = m1835I(bArr, iM1835I2, bVar);
            int i5 = bVar.f1602a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, iM1835I, i5, C0351s.f1737a));
                iM1835I += i5;
            }
        }
        return iM1835I;
    }

    /* JADX INFO: renamed from: E */
    public static int m1831E(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iM1835I = m1835I(bArr, i2, bVar);
        int i4 = bVar.f1602a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            int i5 = iM1835I + i4;
            if (!Utf8.m1705t(bArr, iM1835I, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            iVar.add(new String(bArr, iM1835I, i4, C0351s.f1737a));
            iM1835I = i5;
        }
        while (iM1835I < i3) {
            int iM1835I2 = m1835I(bArr, iM1835I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1835I = m1835I(bArr, iM1835I2, bVar);
            int i6 = bVar.f1602a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                iVar.add("");
            } else {
                int i7 = iM1835I + i6;
                if (!Utf8.m1705t(bArr, iM1835I, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                iVar.add(new String(bArr, iM1835I, i6, C0351s.f1737a));
                iM1835I = i7;
            }
        }
        return iM1835I;
    }

    /* JADX INFO: renamed from: F */
    public static int m1832F(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.f1604c = "";
            return iM1835I;
        }
        bVar.f1604c = Utf8.m1693h(bArr, iM1835I, i2);
        return iM1835I + i2;
    }

    /* JADX INFO: renamed from: G */
    public static int m1833G(int i, byte[] bArr, int i2, int i3, C0344m0 c0344m0, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.m1747a(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iM1748b = WireFormat.m1748b(i);
        if (iM1748b == 0) {
            int iM1838L = m1838L(bArr, i2, bVar);
            c0344m0.m2274n(i, Long.valueOf(bVar.f1603b));
            return iM1838L;
        }
        if (iM1748b == 1) {
            c0344m0.m2274n(i, Long.valueOf(m1850j(bArr, i2)));
            return i2 + 8;
        }
        if (iM1748b == 2) {
            int iM1835I = m1835I(bArr, i2, bVar);
            int i4 = bVar.f1602a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - iM1835I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                c0344m0.m2274n(i, ByteString.EMPTY);
            } else {
                c0344m0.m2274n(i, ByteString.copyFrom(bArr, iM1835I, i4));
            }
            return iM1835I + i4;
        }
        if (iM1748b != 3) {
            if (iM1748b != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            c0344m0.m2274n(i, Integer.valueOf(m1848h(bArr, i2)));
            return i2 + 4;
        }
        C0344m0 c0344m0M2266l = C0344m0.m2266l();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            int iM1835I2 = m1835I(bArr, i2, bVar);
            i6 = bVar.f1602a;
            if (i6 == i5) {
                i2 = iM1835I2;
                break;
            }
            i2 = m1833G(i6, bArr, iM1835I2, i3, c0344m0M2266l, bVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        c0344m0.m2274n(i, c0344m0M2266l);
        return i2;
    }

    /* JADX INFO: renamed from: H */
    public static int m1834H(int i, byte[] bArr, int i2, b bVar) {
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
    public static int m1835I(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return m1834H(b2, bArr, i2, bVar);
        }
        bVar.f1602a = b2;
        return i2;
    }

    /* JADX INFO: renamed from: J */
    public static int m1836J(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) {
        C0350r c0350r = (C0350r) iVar;
        int iM1835I = m1835I(bArr, i2, bVar);
        c0350r.m2332U(bVar.f1602a);
        while (iM1835I < i3) {
            int iM1835I2 = m1835I(bArr, iM1835I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1835I = m1835I(bArr, iM1835I2, bVar);
            c0350r.m2332U(bVar.f1602a);
        }
        return iM1835I;
    }

    /* JADX INFO: renamed from: K */
    public static int m1837K(long j, byte[] bArr, int i, b bVar) {
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
    public static int m1838L(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return m1837K(j, bArr, i2, bVar);
        }
        bVar.f1603b = j;
        return i2;
    }

    /* JADX INFO: renamed from: M */
    public static int m1839M(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) {
        C0356x c0356x = (C0356x) iVar;
        int iM1838L = m1838L(bArr, i2, bVar);
        c0356x.m2384u(bVar.f1603b);
        while (iM1838L < i3) {
            int iM1835I = m1835I(bArr, iM1838L, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1838L = m1838L(bArr, iM1835I, bVar);
            c0356x.m2384u(bVar.f1603b);
        }
        return iM1838L;
    }

    /* JADX INFO: renamed from: N */
    public static int m1840N(int i, byte[] bArr, int i2, int i3, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.m1747a(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iM1748b = WireFormat.m1748b(i);
        if (iM1748b == 0) {
            return m1838L(bArr, i2, bVar);
        }
        if (iM1748b == 1) {
            return i2 + 8;
        }
        if (iM1748b == 2) {
            return m1835I(bArr, i2, bVar) + bVar.f1602a;
        }
        if (iM1748b != 3) {
            if (iM1748b == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = m1835I(bArr, i2, bVar);
            i5 = bVar.f1602a;
            if (i5 == i4) {
                break;
            }
            i2 = m1840N(i5, bArr, i2, i3, bVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m1841a(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) {
        C0329f c0329f = (C0329f) iVar;
        int iM1838L = m1838L(bArr, i2, bVar);
        c0329f.m2018h(bVar.f1603b != 0);
        while (iM1838L < i3) {
            int iM1835I = m1835I(bArr, iM1838L, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1838L = m1838L(bArr, iM1835I, bVar);
            c0329f.m2018h(bVar.f1603b != 0);
        }
        return iM1838L;
    }

    /* JADX INFO: renamed from: b */
    public static int m1842b(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iM1835I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            bVar.f1604c = ByteString.EMPTY;
            return iM1835I;
        }
        bVar.f1604c = ByteString.copyFrom(bArr, iM1835I, i2);
        return iM1835I + i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m1843c(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iM1835I = m1835I(bArr, i2, bVar);
        int i4 = bVar.f1602a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - iM1835I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            iVar.add(ByteString.EMPTY);
        } else {
            iVar.add(ByteString.copyFrom(bArr, iM1835I, i4));
            iM1835I += i4;
        }
        while (iM1835I < i3) {
            int iM1835I2 = m1835I(bArr, iM1835I, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1835I = m1835I(bArr, iM1835I2, bVar);
            int i5 = bVar.f1602a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - iM1835I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                iVar.add(ByteString.EMPTY);
            } else {
                iVar.add(ByteString.copyFrom(bArr, iM1835I, i5));
                iM1835I += i5;
            }
        }
        return iM1835I;
    }

    /* JADX INFO: renamed from: d */
    public static double m1844d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m1850j(bArr, i));
    }

    /* JADX INFO: renamed from: e */
    public static int m1845e(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) {
        C0337j c0337j = (C0337j) iVar;
        c0337j.m2133g(m1844d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iM1835I = m1835I(bArr, i4, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            c0337j.m2133g(m1844d(bArr, iM1835I));
            i4 = iM1835I + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: f */
    public static int m1846f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.AbstractC0295c<?, ?> abstractC0295c, GeneratedMessageLite.C0297e<?, ?> c0297e, AbstractC0342l0<C0344m0, C0344m0> abstractC0342l0, b bVar) throws IOException {
        int i4;
        Object objValueOf;
        int i5;
        Object objM2307i;
        C0348p<GeneratedMessageLite.C0296d> c0348p = abstractC0295c.extensions;
        int i6 = i >>> 3;
        Object objValueOf2 = null;
        if (c0297e.f1578b.isRepeated() && c0297e.f1578b.isPacked()) {
            switch (a.f1601a[c0297e.m1668a().ordinal()]) {
                case 1:
                    C0337j c0337j = new C0337j();
                    int iM1859s = m1859s(bArr, i2, c0337j, bVar);
                    c0348p.m2318x(c0297e.f1578b, c0337j);
                    return iM1859s;
                case 2:
                    C0349q c0349q = new C0349q();
                    int iM1862v = m1862v(bArr, i2, c0349q, bVar);
                    c0348p.m2318x(c0297e.f1578b, c0349q);
                    return iM1862v;
                case 3:
                case 4:
                    C0356x c0356x = new C0356x();
                    int iM1866z = m1866z(bArr, i2, c0356x, bVar);
                    c0348p.m2318x(c0297e.f1578b, c0356x);
                    return iM1866z;
                case 5:
                case 6:
                    C0350r c0350r = new C0350r();
                    int iM1865y = m1865y(bArr, i2, c0350r, bVar);
                    c0348p.m2318x(c0297e.f1578b, c0350r);
                    return iM1865y;
                case 7:
                case 8:
                    C0356x c0356x2 = new C0356x();
                    int iM1861u = m1861u(bArr, i2, c0356x2, bVar);
                    c0348p.m2318x(c0297e.f1578b, c0356x2);
                    return iM1861u;
                case 9:
                case 10:
                    C0350r c0350r2 = new C0350r();
                    int iM1860t = m1860t(bArr, i2, c0350r2, bVar);
                    c0348p.m2318x(c0297e.f1578b, c0350r2);
                    return iM1860t;
                case 11:
                    C0329f c0329f = new C0329f();
                    int iM1858r = m1858r(bArr, i2, c0329f, bVar);
                    c0348p.m2318x(c0297e.f1578b, c0329f);
                    return iM1858r;
                case 12:
                    C0350r c0350r3 = new C0350r();
                    int iM1863w = m1863w(bArr, i2, c0350r3, bVar);
                    c0348p.m2318x(c0297e.f1578b, c0350r3);
                    return iM1863w;
                case 13:
                    C0356x c0356x3 = new C0356x();
                    int iM1864x = m1864x(bArr, i2, c0356x3, bVar);
                    c0348p.m2318x(c0297e.f1578b, c0356x3);
                    return iM1864x;
                case 14:
                    C0350r c0350r4 = new C0350r();
                    int iM1865y2 = m1865y(bArr, i2, c0350r4, bVar);
                    C0344m0 c0344m0 = abstractC0295c.unknownFields;
                    C0344m0 c0344m1 = (C0344m0) C0338j0.m2197z(i6, c0350r4, c0297e.f1578b.m1667b(), c0344m0 != C0344m0.m2262e() ? c0344m0 : null, abstractC0342l0);
                    if (c0344m1 != null) {
                        abstractC0295c.unknownFields = c0344m1;
                    }
                    c0348p.m2318x(c0297e.f1578b, c0350r4);
                    return iM1865y2;
                default:
                    qg50.m176437a("Type cannot be packed: ", c0297e.f1578b.mo1663D());
                    return 0;
            }
        }
        if (c0297e.m1668a() != WireFormat.FieldType.ENUM) {
            switch (a.f1601a[c0297e.m1668a().ordinal()]) {
                case 1:
                    i4 = i2;
                    objValueOf = Double.valueOf(m1844d(bArr, i4));
                    i2 = i4 + 8;
                    objValueOf2 = objValueOf;
                    break;
                case 2:
                    i5 = i2;
                    objValueOf = Float.valueOf(m1852l(bArr, i5));
                    i2 = i5 + 4;
                    objValueOf2 = objValueOf;
                    break;
                case 3:
                case 4:
                    i2 = m1838L(bArr, i2, bVar);
                    objValueOf2 = Long.valueOf(bVar.f1603b);
                    break;
                case 5:
                case 6:
                    i2 = m1835I(bArr, i2, bVar);
                    objValueOf2 = Integer.valueOf(bVar.f1602a);
                    break;
                case 7:
                case 8:
                    i4 = i2;
                    objValueOf = Long.valueOf(m1850j(bArr, i4));
                    i2 = i4 + 8;
                    objValueOf2 = objValueOf;
                    break;
                case 9:
                case 10:
                    i5 = i2;
                    objValueOf = Integer.valueOf(m1848h(bArr, i5));
                    i2 = i5 + 4;
                    objValueOf2 = objValueOf;
                    break;
                case 11:
                    i2 = m1838L(bArr, i2, bVar);
                    objValueOf2 = Boolean.valueOf(bVar.f1603b != 0);
                    break;
                case 12:
                    i2 = m1835I(bArr, i2, bVar);
                    objValueOf2 = Integer.valueOf(AbstractC0331g.m2028b(bVar.f1602a));
                    break;
                case 13:
                    i2 = m1838L(bArr, i2, bVar);
                    objValueOf2 = Long.valueOf(AbstractC0331g.m2029c(bVar.f1603b));
                    break;
                case 14:
                    wtq0.m207906a("Shouldn't reach here.");
                    return 0;
                case 15:
                    i2 = m1842b(bArr, i2, bVar);
                    objValueOf2 = bVar.f1604c;
                    break;
                case 16:
                    i2 = m1829C(bArr, i2, bVar);
                    objValueOf2 = bVar.f1604c;
                    break;
                case 17:
                    i2 = m1854n(g7b0.m129308a().m129311d(c0297e.m1669b().getClass()), bArr, i2, i3, (i6 << 3) | 4, bVar);
                    objValueOf2 = bVar.f1604c;
                    break;
                case 18:
                    i2 = m1856p(g7b0.m129308a().m129311d(c0297e.m1669b().getClass()), bArr, i2, i3, bVar);
                    objValueOf2 = bVar.f1604c;
                    break;
            }
        } else {
            i2 = m1835I(bArr, i2, bVar);
            if (c0297e.f1578b.m1667b().findValueByNumber(bVar.f1602a) == null) {
                C0344m0 c0344m0M2266l = abstractC0295c.unknownFields;
                if (c0344m0M2266l == C0344m0.m2262e()) {
                    c0344m0M2266l = C0344m0.m2266l();
                    abstractC0295c.unknownFields = c0344m0M2266l;
                }
                C0338j0.m2152L(i6, bVar.f1602a, c0344m0M2266l, abstractC0342l0);
                return i2;
            }
            objValueOf2 = Integer.valueOf(bVar.f1602a);
        }
        if (c0297e.m1671d()) {
            c0348p.m2304a(c0297e.f1578b, objValueOf2);
            return i2;
        }
        int i7 = a.f1601a[c0297e.m1668a().ordinal()];
        if ((i7 == 17 || i7 == 18) && (objM2307i = c0348p.m2307i(c0297e.f1578b)) != null) {
            objValueOf2 = C0351s.m2347h(objM2307i, objValueOf2);
        }
        c0348p.m2318x(c0297e.f1578b, objValueOf2);
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static int m1847g(int i, byte[] bArr, int i2, int i3, Object obj, InterfaceC0322b0 interfaceC0322b0, AbstractC0342l0<C0344m0, C0344m0> abstractC0342l0, b bVar) throws IOException {
        GeneratedMessageLite.C0297e c0297eM2229a = bVar.f1605d.m2229a(interfaceC0322b0, i >>> 3);
        if (c0297eM2229a == null) {
            return m1833G(i, bArr, i2, i3, C0326d0.m1887w(obj), bVar);
        }
        GeneratedMessageLite.AbstractC0295c abstractC0295c = (GeneratedMessageLite.AbstractC0295c) obj;
        abstractC0295c.m1662C();
        return m1846f(i, bArr, i2, i3, abstractC0295c, c0297eM2229a, abstractC0342l0, bVar);
    }

    /* JADX INFO: renamed from: h */
    public static int m1848h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: i */
    public static int m1849i(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) {
        C0350r c0350r = (C0350r) iVar;
        c0350r.m2332U(m1848h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iM1835I = m1835I(bArr, i4, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            c0350r.m2332U(m1848h(bArr, iM1835I));
            i4 = iM1835I + 4;
        }
        return i4;
    }

    /* JADX INFO: renamed from: j */
    public static long m1850j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: k */
    public static int m1851k(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) {
        C0356x c0356x = (C0356x) iVar;
        c0356x.m2384u(m1850j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iM1835I = m1835I(bArr, i4, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            c0356x.m2384u(m1850j(bArr, iM1835I));
            i4 = iM1835I + 8;
        }
        return i4;
    }

    /* JADX INFO: renamed from: l */
    public static float m1852l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m1848h(bArr, i));
    }

    /* JADX INFO: renamed from: m */
    public static int m1853m(int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) {
        C0349q c0349q = (C0349q) iVar;
        c0349q.m2322M(m1852l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iM1835I = m1835I(bArr, i4, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            c0349q.m2322M(m1852l(bArr, iM1835I));
            i4 = iM1835I + 4;
        }
        return i4;
    }

    /* JADX INFO: renamed from: n */
    public static int m1854n(InterfaceC0336i0 interfaceC0336i0, byte[] bArr, int i, int i2, int i3, b bVar) throws IOException {
        C0326d0 c0326d0 = (C0326d0) interfaceC0336i0;
        Object objMo1913h = c0326d0.mo1913h();
        int iM1906d0 = c0326d0.m1906d0(objMo1913h, bArr, i, i2, i3, bVar);
        c0326d0.mo1909f(objMo1913h);
        bVar.f1604c = objMo1913h;
        return iM1906d0;
    }

    /* JADX INFO: renamed from: o */
    public static int m1855o(InterfaceC0336i0 interfaceC0336i0, int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iM1854n = m1854n(interfaceC0336i0, bArr, i2, i3, i4, bVar);
        iVar.add(bVar.f1604c);
        while (iM1854n < i3) {
            int iM1835I = m1835I(bArr, iM1854n, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1854n = m1854n(interfaceC0336i0, bArr, iM1835I, i3, i4, bVar);
            iVar.add(bVar.f1604c);
        }
        return iM1854n;
    }

    /* JADX INFO: renamed from: p */
    public static int m1856p(InterfaceC0336i0 interfaceC0336i0, byte[] bArr, int i, int i2, b bVar) throws IOException {
        int iM1834H = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM1834H = m1834H(i3, bArr, iM1834H, bVar);
            i3 = bVar.f1602a;
        }
        int i4 = iM1834H;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        Object objMo1913h = interfaceC0336i0.mo1913h();
        int i5 = i4 + i3;
        interfaceC0336i0.mo1917j(objMo1913h, bArr, i4, i5, bVar);
        interfaceC0336i0.mo1909f(objMo1913h);
        bVar.f1604c = objMo1913h;
        return i5;
    }

    /* JADX INFO: renamed from: q */
    public static int m1857q(InterfaceC0336i0<?> interfaceC0336i0, int i, byte[] bArr, int i2, int i3, C0351s.i<?> iVar, b bVar) throws IOException {
        int iM1856p = m1856p(interfaceC0336i0, bArr, i2, i3, bVar);
        iVar.add(bVar.f1604c);
        while (iM1856p < i3) {
            int iM1835I = m1835I(bArr, iM1856p, bVar);
            if (i != bVar.f1602a) {
                break;
            }
            iM1856p = m1856p(interfaceC0336i0, bArr, iM1835I, i3, bVar);
            iVar.add(bVar.f1604c);
        }
        return iM1856p;
    }

    /* JADX INFO: renamed from: r */
    public static int m1858r(byte[] bArr, int i, C0351s.i<?> iVar, b bVar) throws IOException {
        C0329f c0329f = (C0329f) iVar;
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1835I;
        while (iM1835I < i2) {
            iM1835I = m1838L(bArr, iM1835I, bVar);
            c0329f.m2018h(bVar.f1603b != 0);
        }
        if (iM1835I == i2) {
            return iM1835I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: s */
    public static int m1859s(byte[] bArr, int i, C0351s.i<?> iVar, b bVar) throws IOException {
        C0337j c0337j = (C0337j) iVar;
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1835I;
        while (iM1835I < i2) {
            c0337j.m2133g(m1844d(bArr, iM1835I));
            iM1835I += 8;
        }
        if (iM1835I == i2) {
            return iM1835I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: t */
    public static int m1860t(byte[] bArr, int i, C0351s.i<?> iVar, b bVar) throws IOException {
        C0350r c0350r = (C0350r) iVar;
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1835I;
        while (iM1835I < i2) {
            c0350r.m2332U(m1848h(bArr, iM1835I));
            iM1835I += 4;
        }
        if (iM1835I == i2) {
            return iM1835I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: u */
    public static int m1861u(byte[] bArr, int i, C0351s.i<?> iVar, b bVar) throws IOException {
        C0356x c0356x = (C0356x) iVar;
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1835I;
        while (iM1835I < i2) {
            c0356x.m2384u(m1850j(bArr, iM1835I));
            iM1835I += 8;
        }
        if (iM1835I == i2) {
            return iM1835I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: v */
    public static int m1862v(byte[] bArr, int i, C0351s.i<?> iVar, b bVar) throws IOException {
        C0349q c0349q = (C0349q) iVar;
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1835I;
        while (iM1835I < i2) {
            c0349q.m2322M(m1852l(bArr, iM1835I));
            iM1835I += 4;
        }
        if (iM1835I == i2) {
            return iM1835I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: w */
    public static int m1863w(byte[] bArr, int i, C0351s.i<?> iVar, b bVar) throws IOException {
        C0350r c0350r = (C0350r) iVar;
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1835I;
        while (iM1835I < i2) {
            iM1835I = m1835I(bArr, iM1835I, bVar);
            c0350r.m2332U(AbstractC0331g.m2028b(bVar.f1602a));
        }
        if (iM1835I == i2) {
            return iM1835I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: x */
    public static int m1864x(byte[] bArr, int i, C0351s.i<?> iVar, b bVar) throws IOException {
        C0356x c0356x = (C0356x) iVar;
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1835I;
        while (iM1835I < i2) {
            iM1835I = m1838L(bArr, iM1835I, bVar);
            c0356x.m2384u(AbstractC0331g.m2029c(bVar.f1603b));
        }
        if (iM1835I == i2) {
            return iM1835I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: y */
    public static int m1865y(byte[] bArr, int i, C0351s.i<?> iVar, b bVar) throws IOException {
        C0350r c0350r = (C0350r) iVar;
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1835I;
        while (iM1835I < i2) {
            iM1835I = m1835I(bArr, iM1835I, bVar);
            c0350r.m2332U(bVar.f1602a);
        }
        if (iM1835I == i2) {
            return iM1835I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: z */
    public static int m1866z(byte[] bArr, int i, C0351s.i<?> iVar, b bVar) throws IOException {
        C0356x c0356x = (C0356x) iVar;
        int iM1835I = m1835I(bArr, i, bVar);
        int i2 = bVar.f1602a + iM1835I;
        while (iM1835I < i2) {
            iM1835I = m1838L(bArr, iM1835I, bVar);
            c0356x.m2384u(bVar.f1603b);
        }
        if (iM1835I == i2) {
            return iM1835I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
