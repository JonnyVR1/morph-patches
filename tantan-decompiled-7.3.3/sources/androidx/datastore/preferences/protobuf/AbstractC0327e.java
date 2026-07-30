package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p153l.azk0;
import p153l.g7b0;
import p153l.wbr;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0327e implements InterfaceC0334h0 {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1626a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f1626a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1626a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1626a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1626a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1626a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1626a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1626a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1626a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1626a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1626a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1626a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1626a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1626a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1626a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1626a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1626a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1626a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e$b */
    public static final class b extends AbstractC0327e {

        /* JADX INFO: renamed from: a */
        public final boolean f1627a;

        /* JADX INFO: renamed from: b */
        public final byte[] f1628b;

        /* JADX INFO: renamed from: c */
        public int f1629c;

        /* JADX INFO: renamed from: d */
        public final int f1630d;

        /* JADX INFO: renamed from: e */
        public int f1631e;

        /* JADX INFO: renamed from: f */
        public int f1632f;

        /* JADX INFO: renamed from: g */
        public int f1633g;

        public b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f1627a = z;
            this.f1628b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f1629c = iArrayOffset;
            this.f1630d = iArrayOffset;
            this.f1631e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: A */
        public void mo1945A(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0356x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b == 0) {
                    do {
                        list.add(Long.valueOf(mo2003u()));
                        if (m1960Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1973b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1748b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b0 = this.f1629c + m1973b0();
                while (this.f1629c < iM1973b0) {
                    list.add(Long.valueOf(m1975c0()));
                }
                m1981f0(iM1973b0);
                return;
            }
            C0356x c0356x = (C0356x) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 == 0) {
                do {
                    c0356x.m2384u(mo2003u());
                    if (m1960Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1748b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1973b1 = this.f1629c + m1973b0();
            while (this.f1629c < iM1973b1) {
                c0356x.m2384u(m1975c0());
            }
            m1981f0(iM1973b1);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: B */
        public void mo1946B(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0350r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b != 0) {
                    if (iM1748b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1973b0 = this.f1629c + m1973b0();
                    while (this.f1629c < iM1973b0) {
                        list.add(Integer.valueOf(m1973b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo1976d()));
                    if (m1960Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0350r c0350r = (C0350r) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 != 0) {
                if (iM1748b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b1 = this.f1629c + m1973b0();
                while (this.f1629c < iM1973b1) {
                    c0350r.m2332U(m1973b0());
                }
                return;
            }
            do {
                c0350r.m2332U(mo1976d());
                if (m1960Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: C */
        public void mo1947C(List<String> list) throws IOException {
            m1971a0(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: D */
        public int mo1948D() throws IOException {
            m1983g0(0);
            return m1973b0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: E */
        public <T> void mo1949E(List<T> list, InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
            int i;
            if (WireFormat.m1748b(this.f1632f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f1632f;
            do {
                list.add(m1968Y(interfaceC0336i0, c0341l));
                if (m1960Q()) {
                    return;
                } else {
                    i = this.f1629c;
                }
            } while (m1973b0() == i2);
            this.f1629c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: F */
        public void mo1950F(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0356x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b == 1) {
                    do {
                        list.add(Long.valueOf(mo2005w()));
                        if (m1960Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1973b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1748b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b0 = m1973b0();
                m1995m0(iM1973b0);
                int i4 = this.f1629c + iM1973b0;
                while (this.f1629c < i4) {
                    list.add(Long.valueOf(m1967X()));
                }
                return;
            }
            C0356x c0356x = (C0356x) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 == 1) {
                do {
                    c0356x.m2384u(mo2005w());
                    if (m1960Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1748b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1973b1 = m1973b0();
            m1995m0(iM1973b1);
            int i5 = this.f1629c + iM1973b1;
            while (this.f1629c < i5) {
                c0356x.m2384u(m1967X());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: G */
        public void mo1951G(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0350r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b != 0) {
                    if (iM1748b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1973b0 = this.f1629c + m1973b0();
                    while (this.f1629c < iM1973b0) {
                        list.add(Integer.valueOf(m1973b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo1974c()));
                    if (m1960Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0350r c0350r = (C0350r) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 != 0) {
                if (iM1748b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b1 = this.f1629c + m1973b0();
                while (this.f1629c < iM1973b1) {
                    c0350r.m2332U(m1973b0());
                }
                return;
            }
            do {
                c0350r.m2332U(mo1974c());
                if (m1960Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: H */
        public int mo1952H() throws IOException {
            m1983g0(5);
            return m1964U();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: I */
        public <T> T mo1953I(Class<T> cls, C0341l c0341l) throws IOException {
            m1983g0(3);
            return (T) m1963T(g7b0.m129308a().m129311d(cls), c0341l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: J */
        public <K, V> void mo1954J(Map<K, V> map, C0357y.a<K, V> aVar, C0341l c0341l) throws IOException {
            m1983g0(2);
            int iM1973b0 = m1973b0();
            m1979e0(iM1973b0);
            int i = this.f1631e;
            this.f1631e = this.f1629c + iM1973b0;
            try {
                Object objM1962S = aVar.f1763b;
                Object objM1962S2 = aVar.f1765d;
                while (true) {
                    int iMo1997o = mo1997o();
                    if (iMo1997o == Integer.MAX_VALUE) {
                        map.put(objM1962S, objM1962S2);
                        this.f1631e = i;
                        return;
                    } else if (iMo1997o == 1) {
                        objM1962S = m1962S(aVar.f1762a, null, null);
                    } else if (iMo1997o != 2) {
                        try {
                            if (!mo2000r()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!mo2000r()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        objM1962S2 = m1962S(aVar.f1764c, aVar.f1765d.getClass(), c0341l);
                    }
                }
            } catch (Throwable th) {
                this.f1631e = i;
                throw th;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: K */
        public long mo1955K() throws IOException {
            m1983g0(0);
            return AbstractC0331g.m2029c(m1975c0());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: L */
        public String mo1956L() throws IOException {
            return m1969Z(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: M */
        public <T> void mo1957M(List<T> list, InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
            int i;
            if (WireFormat.m1748b(this.f1632f) != 3) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f1632f;
            do {
                list.add(m1963T(interfaceC0336i0, c0341l));
                if (m1960Q()) {
                    return;
                } else {
                    i = this.f1629c;
                }
            } while (m1973b0() == i2);
            this.f1629c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: N */
        public int mo1958N() throws IOException {
            m1983g0(5);
            return m1964U();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: O */
        public String mo1959O() throws IOException {
            return m1969Z(true);
        }

        /* JADX INFO: renamed from: Q */
        public final boolean m1960Q() {
            return this.f1629c == this.f1631e;
        }

        /* JADX INFO: renamed from: R */
        public final byte m1961R() throws IOException {
            int i = this.f1629c;
            if (i == this.f1631e) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1628b;
            this.f1629c = i + 1;
            return bArr[i];
        }

        /* JADX INFO: renamed from: S */
        public final Object m1962S(WireFormat.FieldType fieldType, Class<?> cls, C0341l c0341l) throws IOException {
            switch (a.f1626a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo2007y());
                case 2:
                    return mo1982g();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo1976d());
                case 5:
                    return Integer.valueOf(mo1952H());
                case 6:
                    return Long.valueOf(mo2005w());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo1948D());
                case 9:
                    return Long.valueOf(mo2003u());
                case 10:
                    return mo1990k(cls, c0341l);
                case 11:
                    return Integer.valueOf(mo1958N());
                case 12:
                    return Long.valueOf(mo1972b());
                case 13:
                    return Integer.valueOf(mo1978e());
                case 14:
                    return Long.valueOf(mo1955K());
                case 15:
                    return mo1959O();
                case 16:
                    return Integer.valueOf(mo1974c());
                case 17:
                    return Long.valueOf(mo1988j());
                default:
                    azk0.m101074a("unsupported field type.");
                    return null;
            }
        }

        /* JADX INFO: renamed from: T */
        public final <T> T m1963T(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
            int i = this.f1633g;
            this.f1633g = WireFormat.m1749c(WireFormat.m1747a(this.f1632f), 4);
            try {
                T tMo1913h = interfaceC0336i0.mo1913h();
                interfaceC0336i0.mo1907e(tMo1913h, this, c0341l);
                interfaceC0336i0.mo1909f(tMo1913h);
                if (this.f1632f != this.f1633g) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.f1633g = i;
                return tMo1913h;
            } catch (Throwable th) {
                this.f1633g = i;
                throw th;
            }
        }

        /* JADX INFO: renamed from: U */
        public final int m1964U() throws IOException {
            m1979e0(4);
            return m1965V();
        }

        /* JADX INFO: renamed from: V */
        public final int m1965V() {
            int i = this.f1629c;
            byte[] bArr = this.f1628b;
            this.f1629c = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        /* JADX INFO: renamed from: W */
        public final long m1966W() throws IOException {
            m1979e0(8);
            return m1967X();
        }

        /* JADX INFO: renamed from: X */
        public final long m1967X() {
            int i = this.f1629c;
            byte[] bArr = this.f1628b;
            this.f1629c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: Y */
        public final <T> T m1968Y(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
            int iM1973b0 = m1973b0();
            m1979e0(iM1973b0);
            int i = this.f1631e;
            int i2 = this.f1629c + iM1973b0;
            this.f1631e = i2;
            try {
                T tMo1913h = interfaceC0336i0.mo1913h();
                interfaceC0336i0.mo1907e(tMo1913h, this, c0341l);
                interfaceC0336i0.mo1909f(tMo1913h);
                if (this.f1629c != i2) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.f1631e = i;
                return tMo1913h;
            } catch (Throwable th) {
                this.f1631e = i;
                throw th;
            }
        }

        /* JADX INFO: renamed from: Z */
        public String m1969Z(boolean z) throws IOException {
            m1983g0(2);
            int iM1973b0 = m1973b0();
            if (iM1973b0 == 0) {
                return "";
            }
            m1979e0(iM1973b0);
            if (z) {
                byte[] bArr = this.f1628b;
                int i = this.f1629c;
                if (!Utf8.m1705t(bArr, i, i + iM1973b0)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f1628b, this.f1629c, iM1973b0, C0351s.f1737a);
            this.f1629c += iM1973b0;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: a */
        public void mo1970a(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0356x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b != 0) {
                    if (iM1748b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1973b0 = this.f1629c + m1973b0();
                    while (this.f1629c < iM1973b0) {
                        list.add(Long.valueOf(AbstractC0331g.m2029c(m1975c0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo1955K()));
                    if (m1960Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0356x c0356x = (C0356x) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 != 0) {
                if (iM1748b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b1 = this.f1629c + m1973b0();
                while (this.f1629c < iM1973b1) {
                    c0356x.m2384u(AbstractC0331g.m2029c(m1975c0()));
                }
                return;
            }
            do {
                c0356x.m2384u(mo1955K());
                if (m1960Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i2;
        }

        /* JADX INFO: renamed from: a0 */
        public void m1971a0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.m1748b(this.f1632f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            if (!(list instanceof wbr) || z) {
                do {
                    list.add(m1969Z(z));
                    if (m1960Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            wbr wbrVar = (wbr) list;
            do {
                wbrVar.mo2366t(mo1982g());
                if (m1960Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: b */
        public long mo1972b() throws IOException {
            m1983g0(1);
            return m1966W();
        }

        /* JADX INFO: renamed from: b0 */
        public final int m1973b0() throws IOException {
            int i;
            int i2 = this.f1629c;
            int i3 = this.f1631e;
            if (i3 == i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1628b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f1629c = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return (int) m1977d0();
            }
            int i5 = i2 + 2;
            int i6 = (bArr[i4] << 7) ^ b;
            if (i6 < 0) {
                i = i6 ^ (-128);
            } else {
                int i7 = i2 + 3;
                int i8 = (bArr[i5] << 14) ^ i6;
                if (i8 >= 0) {
                    i = i8 ^ 16256;
                } else {
                    int i9 = i2 + 4;
                    int i10 = i8 ^ (bArr[i7] << 21);
                    if (i10 < 0) {
                        i = (-2080896) ^ i10;
                    } else {
                        i7 = i2 + 5;
                        byte b2 = bArr[i9];
                        int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                        if (b2 < 0) {
                            i9 = i2 + 6;
                            if (bArr[i7] < 0) {
                                i7 = i2 + 7;
                                if (bArr[i9] < 0) {
                                    i9 = i2 + 8;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 9;
                                        if (bArr[i9] < 0) {
                                            int i12 = i2 + 10;
                                            if (bArr[i7] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i5 = i12;
                                            i = i11;
                                        }
                                    }
                                }
                            }
                            i = i11;
                        }
                        i = i11;
                    }
                    i5 = i9;
                }
                i5 = i7;
            }
            this.f1629c = i5;
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: c */
        public int mo1974c() throws IOException {
            m1983g0(0);
            return m1973b0();
        }

        /* JADX INFO: renamed from: c0 */
        public long m1975c0() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f1629c;
            int i2 = this.f1631e;
            if (i2 == i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1628b;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f1629c = i3;
                return b;
            }
            if (i2 - i3 < 9) {
                return m1977d0();
            }
            int i4 = i + 2;
            int i5 = (bArr[i3] << 7) ^ b;
            if (i5 < 0) {
                j = i5 ^ (-128);
            } else {
                int i6 = i + 3;
                int i7 = (bArr[i4] << 14) ^ i5;
                if (i7 >= 0) {
                    j = i7 ^ 16256;
                    i4 = i6;
                } else {
                    int i8 = i + 4;
                    int i9 = i7 ^ (bArr[i6] << 21);
                    if (i9 < 0) {
                        long j4 = (-2080896) ^ i9;
                        i4 = i8;
                        j = j4;
                    } else {
                        long j5 = i9;
                        i4 = i + 5;
                        long j6 = j5 ^ (((long) bArr[i8]) << 28);
                        if (j6 >= 0) {
                            j3 = 266354560;
                        } else {
                            int i10 = i + 6;
                            long j7 = j6 ^ (((long) bArr[i4]) << 35);
                            if (j7 < 0) {
                                j2 = -34093383808L;
                            } else {
                                i4 = i + 7;
                                j6 = j7 ^ (((long) bArr[i10]) << 42);
                                if (j6 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i10 = i + 8;
                                    j7 = j6 ^ (((long) bArr[i4]) << 49);
                                    if (j7 < 0) {
                                        j2 = -558586000294016L;
                                    } else {
                                        i4 = i + 9;
                                        long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            int i11 = i + 10;
                                            if (bArr[i4] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i4 = i11;
                                        }
                                        j = j8;
                                    }
                                }
                            }
                            j = j7 ^ j2;
                            i4 = i10;
                        }
                        j = j6 ^ j3;
                    }
                }
            }
            this.f1629c = i4;
            return j;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: d */
        public int mo1976d() throws IOException {
            m1983g0(0);
            return m1973b0();
        }

        /* JADX INFO: renamed from: d0 */
        public final long m1977d0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bM1961R = m1961R();
                j |= ((long) (bM1961R & 127)) << i;
                if ((bM1961R & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: e */
        public int mo1978e() throws IOException {
            m1983g0(0);
            return AbstractC0331g.m2028b(m1973b0());
        }

        /* JADX INFO: renamed from: e0 */
        public final void m1979e0(int i) throws IOException {
            if (i < 0 || i > this.f1631e - this.f1629c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: f */
        public void mo1980f(List<Boolean> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0329f;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b != 0) {
                    if (iM1748b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1973b0 = this.f1629c + m1973b0();
                    while (this.f1629c < iM1973b0) {
                        list.add(Boolean.valueOf(m1973b0() != 0));
                    }
                    m1981f0(iM1973b0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(mo2007y()));
                    if (m1960Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0329f c0329f = (C0329f) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 != 0) {
                if (iM1748b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b1 = this.f1629c + m1973b0();
                while (this.f1629c < iM1973b1) {
                    c0329f.m2018h(m1973b0() != 0);
                }
                m1981f0(iM1973b1);
                return;
            }
            do {
                c0329f.m2018h(mo2007y());
                if (m1960Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i2;
        }

        /* JADX INFO: renamed from: f0 */
        public final void m1981f0(int i) throws IOException {
            if (this.f1629c != i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: g */
        public ByteString mo1982g() throws IOException {
            m1983g0(2);
            int iM1973b0 = m1973b0();
            if (iM1973b0 == 0) {
                return ByteString.EMPTY;
            }
            m1979e0(iM1973b0);
            boolean z = this.f1627a;
            byte[] bArr = this.f1628b;
            ByteString byteStringWrap = z ? ByteString.wrap(bArr, this.f1629c, iM1973b0) : ByteString.copyFrom(bArr, this.f1629c, iM1973b0);
            this.f1629c += iM1973b0;
            return byteStringWrap;
        }

        /* JADX INFO: renamed from: g0 */
        public final void m1983g0(int i) throws IOException {
            if (WireFormat.m1748b(this.f1632f) != i) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        public int getTag() {
            return this.f1632f;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: h */
        public <T> T mo1984h(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
            m1983g0(3);
            return (T) m1963T(interfaceC0336i0, c0341l);
        }

        /* JADX INFO: renamed from: h0 */
        public final void m1985h0(int i) throws IOException {
            m1979e0(i);
            this.f1629c += i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: i */
        public void mo1986i(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0350r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b != 0) {
                    if (iM1748b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1973b0 = this.f1629c + m1973b0();
                    while (this.f1629c < iM1973b0) {
                        list.add(Integer.valueOf(AbstractC0331g.m2028b(m1973b0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo1978e()));
                    if (m1960Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0350r c0350r = (C0350r) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 != 0) {
                if (iM1748b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b1 = this.f1629c + m1973b0();
                while (this.f1629c < iM1973b1) {
                    c0350r.m2332U(AbstractC0331g.m2028b(m1973b0()));
                }
                return;
            }
            do {
                c0350r.m2332U(mo1978e());
                if (m1960Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i2;
        }

        /* JADX INFO: renamed from: i0 */
        public final void m1987i0() throws IOException {
            int i = this.f1633g;
            this.f1633g = WireFormat.m1749c(WireFormat.m1747a(this.f1632f), 4);
            while (mo1997o() != Integer.MAX_VALUE && mo2000r()) {
            }
            if (this.f1632f != this.f1633g) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f1633g = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: j */
        public long mo1988j() throws IOException {
            m1983g0(0);
            return m1975c0();
        }

        /* JADX INFO: renamed from: j0 */
        public final void m1989j0() throws IOException {
            int i = this.f1631e;
            int i2 = this.f1629c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f1628b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f1629c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            m1991k0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: k */
        public <T> T mo1990k(Class<T> cls, C0341l c0341l) throws IOException {
            m1983g0(2);
            return (T) m1968Y(g7b0.m129308a().m129311d(cls), c0341l);
        }

        /* JADX INFO: renamed from: k0 */
        public final void m1991k0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m1961R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: l */
        public void mo1992l(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0356x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b == 1) {
                    do {
                        list.add(Long.valueOf(mo1972b()));
                        if (m1960Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1973b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1748b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b0 = m1973b0();
                m1995m0(iM1973b0);
                int i4 = this.f1629c + iM1973b0;
                while (this.f1629c < i4) {
                    list.add(Long.valueOf(m1967X()));
                }
                return;
            }
            C0356x c0356x = (C0356x) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 == 1) {
                do {
                    c0356x.m2384u(mo1972b());
                    if (m1960Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1748b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1973b1 = m1973b0();
            m1995m0(iM1973b1);
            int i5 = this.f1629c + iM1973b1;
            while (this.f1629c < i5) {
                c0356x.m2384u(m1967X());
            }
        }

        /* JADX INFO: renamed from: l0 */
        public final void m1993l0(int i) throws IOException {
            m1979e0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: m */
        public void mo1994m(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0350r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b == 0) {
                    do {
                        list.add(Integer.valueOf(mo1948D()));
                        if (m1960Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1973b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1748b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b0 = this.f1629c + m1973b0();
                while (this.f1629c < iM1973b0) {
                    list.add(Integer.valueOf(m1973b0()));
                }
                m1981f0(iM1973b0);
                return;
            }
            C0350r c0350r = (C0350r) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 == 0) {
                do {
                    c0350r.m2332U(mo1948D());
                    if (m1960Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1748b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1973b1 = this.f1629c + m1973b0();
            while (this.f1629c < iM1973b1) {
                c0350r.m2332U(m1973b0());
            }
            m1981f0(iM1973b1);
        }

        /* JADX INFO: renamed from: m0 */
        public final void m1995m0(int i) throws IOException {
            m1979e0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: n */
        public void mo1996n(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0350r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b == 2) {
                    int iM1973b0 = m1973b0();
                    m1993l0(iM1973b0);
                    int i4 = this.f1629c + iM1973b0;
                    while (this.f1629c < i4) {
                        list.add(Integer.valueOf(m1965V()));
                    }
                    return;
                }
                if (iM1748b != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(mo1952H()));
                    if (m1960Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0350r c0350r = (C0350r) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 == 2) {
                int iM1973b1 = m1973b0();
                m1993l0(iM1973b1);
                int i5 = this.f1629c + iM1973b1;
                while (this.f1629c < i5) {
                    c0350r.m2332U(m1965V());
                }
                return;
            }
            if (iM1748b2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c0350r.m2332U(mo1952H());
                if (m1960Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: o */
        public int mo1997o() throws IOException {
            if (m1960Q()) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            int iM1973b0 = m1973b0();
            this.f1632f = iM1973b0;
            return iM1973b0 == this.f1633g ? Api.BaseClientBuilder.API_PRIORITY_OTHER : WireFormat.m1747a(iM1973b0);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: p */
        public void mo1998p(List<String> list) throws IOException {
            m1971a0(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: q */
        public void mo1999q(List<Float> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0349q;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b == 2) {
                    int iM1973b0 = m1973b0();
                    m1993l0(iM1973b0);
                    int i4 = this.f1629c + iM1973b0;
                    while (this.f1629c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m1965V())));
                    }
                    return;
                }
                if (iM1748b != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (m1960Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0349q c0349q = (C0349q) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 == 2) {
                int iM1973b1 = m1973b0();
                m1993l0(iM1973b1);
                int i5 = this.f1629c + iM1973b1;
                while (this.f1629c < i5) {
                    c0349q.m2322M(Float.intBitsToFloat(m1965V()));
                }
                return;
            }
            if (iM1748b2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c0349q.m2322M(readFloat());
                if (m1960Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: r */
        public boolean mo2000r() throws IOException {
            int i;
            if (m1960Q() || (i = this.f1632f) == this.f1633g) {
                return false;
            }
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                m1989j0();
                return true;
            }
            if (iM1748b == 1) {
                m1985h0(8);
                return true;
            }
            if (iM1748b == 2) {
                m1985h0(m1973b0());
                return true;
            }
            if (iM1748b == 3) {
                m1987i0();
                return true;
            }
            if (iM1748b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m1985h0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        public double readDouble() throws IOException {
            m1983g0(1);
            return Double.longBitsToDouble(m1966W());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        public float readFloat() throws IOException {
            m1983g0(5);
            return Float.intBitsToFloat(m1964U());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: s */
        public void mo2001s(List<ByteString> list) throws IOException {
            int i;
            if (WireFormat.m1748b(this.f1632f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(mo1982g());
                if (m1960Q()) {
                    return;
                } else {
                    i = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: t */
        public void mo2002t(List<Double> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0337j;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (m1960Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1973b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1748b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b0 = m1973b0();
                m1995m0(iM1973b0);
                int i4 = this.f1629c + iM1973b0;
                while (this.f1629c < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m1967X())));
                }
                return;
            }
            C0337j c0337j = (C0337j) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 == 1) {
                do {
                    c0337j.m2133g(readDouble());
                    if (m1960Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1748b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1973b1 = m1973b0();
            m1995m0(iM1973b1);
            int i5 = this.f1629c + iM1973b1;
            while (this.f1629c < i5) {
                c0337j.m2133g(Double.longBitsToDouble(m1967X()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: u */
        public long mo2003u() throws IOException {
            m1983g0(0);
            return m1975c0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: v */
        public <T> T mo2004v(InterfaceC0336i0<T> interfaceC0336i0, C0341l c0341l) throws IOException {
            m1983g0(2);
            return (T) m1968Y(interfaceC0336i0, c0341l);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: w */
        public long mo2005w() throws IOException {
            m1983g0(1);
            return m1966W();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: x */
        public void mo2006x(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0350r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b == 2) {
                    int iM1973b0 = m1973b0();
                    m1993l0(iM1973b0);
                    int i4 = this.f1629c + iM1973b0;
                    while (this.f1629c < i4) {
                        list.add(Integer.valueOf(m1965V()));
                    }
                    return;
                }
                if (iM1748b != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(mo1958N()));
                    if (m1960Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0350r c0350r = (C0350r) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 == 2) {
                int iM1973b1 = m1973b0();
                m1993l0(iM1973b1);
                int i5 = this.f1629c + iM1973b1;
                while (this.f1629c < i5) {
                    c0350r.m2332U(m1965V());
                }
                return;
            }
            if (iM1748b2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c0350r.m2332U(mo1958N());
                if (m1960Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1973b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: y */
        public boolean mo2007y() throws IOException {
            m1983g0(0);
            return m1973b0() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0334h0
        /* JADX INFO: renamed from: z */
        public void mo2008z(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0356x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1748b = WireFormat.m1748b(i3);
                if (iM1748b == 0) {
                    do {
                        list.add(Long.valueOf(mo1988j()));
                        if (m1960Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1973b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1748b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1973b0 = this.f1629c + m1973b0();
                while (this.f1629c < iM1973b0) {
                    list.add(Long.valueOf(m1975c0()));
                }
                m1981f0(iM1973b0);
                return;
            }
            C0356x c0356x = (C0356x) list;
            int iM1748b2 = WireFormat.m1748b(i3);
            if (iM1748b2 == 0) {
                do {
                    c0356x.m2384u(mo1988j());
                    if (m1960Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1973b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1748b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1973b1 = this.f1629c + m1973b0();
            while (this.f1629c < iM1973b1) {
                c0356x.m2384u(m1975c0());
            }
            m1981f0(iM1973b1);
        }
    }

    public /* synthetic */ AbstractC0327e(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: P */
    public static AbstractC0327e m1944P(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        wg3.m206174a("Direct buffers not yet supported");
        return null;
    }

    public AbstractC0327e() {
    }
}
