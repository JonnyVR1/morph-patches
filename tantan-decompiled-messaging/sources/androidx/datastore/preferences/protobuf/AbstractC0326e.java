package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p149l.cza0;
import p149l.ig3;
import p149l.u9r;
import p149l.upk0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0326e implements InterfaceC0333h0 {

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
    public static final class b extends AbstractC0326e {

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

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: A */
        public void mo1944A(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0355x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b == 0) {
                    do {
                        list.add(Long.valueOf(mo2002u()));
                        if (m1959Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1972b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1747b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b0 = this.f1629c + m1972b0();
                while (this.f1629c < iM1972b0) {
                    list.add(Long.valueOf(m1974c0()));
                }
                m1980f0(iM1972b0);
                return;
            }
            C0355x c0355x = (C0355x) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 == 0) {
                do {
                    c0355x.m2383u(mo2002u());
                    if (m1959Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1747b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1972b1 = this.f1629c + m1972b0();
            while (this.f1629c < iM1972b1) {
                c0355x.m2383u(m1974c0());
            }
            m1980f0(iM1972b1);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: B */
        public void mo1945B(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0349r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b != 0) {
                    if (iM1747b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1972b0 = this.f1629c + m1972b0();
                    while (this.f1629c < iM1972b0) {
                        list.add(Integer.valueOf(m1972b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo1975d()));
                    if (m1959Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0349r c0349r = (C0349r) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 != 0) {
                if (iM1747b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b1 = this.f1629c + m1972b0();
                while (this.f1629c < iM1972b1) {
                    c0349r.m2331T(m1972b0());
                }
                return;
            }
            do {
                c0349r.m2331T(mo1975d());
                if (m1959Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: C */
        public void mo1946C(List<String> list) throws IOException {
            m1970a0(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: D */
        public int mo1947D() throws IOException {
            m1982g0(0);
            return m1972b0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: E */
        public <T> void mo1948E(List<T> list, InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
            int i;
            if (WireFormat.m1747b(this.f1632f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f1632f;
            do {
                list.add(m1967Y(interfaceC0335i0, c0340l));
                if (m1959Q()) {
                    return;
                } else {
                    i = this.f1629c;
                }
            } while (m1972b0() == i2);
            this.f1629c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: F */
        public void mo1949F(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0355x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b == 1) {
                    do {
                        list.add(Long.valueOf(mo2004w()));
                        if (m1959Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1972b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1747b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b0 = m1972b0();
                m1994m0(iM1972b0);
                int i4 = this.f1629c + iM1972b0;
                while (this.f1629c < i4) {
                    list.add(Long.valueOf(m1966X()));
                }
                return;
            }
            C0355x c0355x = (C0355x) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 == 1) {
                do {
                    c0355x.m2383u(mo2004w());
                    if (m1959Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1747b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1972b1 = m1972b0();
            m1994m0(iM1972b1);
            int i5 = this.f1629c + iM1972b1;
            while (this.f1629c < i5) {
                c0355x.m2383u(m1966X());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: G */
        public void mo1950G(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0349r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b != 0) {
                    if (iM1747b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1972b0 = this.f1629c + m1972b0();
                    while (this.f1629c < iM1972b0) {
                        list.add(Integer.valueOf(m1972b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo1973c()));
                    if (m1959Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0349r c0349r = (C0349r) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 != 0) {
                if (iM1747b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b1 = this.f1629c + m1972b0();
                while (this.f1629c < iM1972b1) {
                    c0349r.m2331T(m1972b0());
                }
                return;
            }
            do {
                c0349r.m2331T(mo1973c());
                if (m1959Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: H */
        public int mo1951H() throws IOException {
            m1982g0(5);
            return m1963U();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: I */
        public <T> T mo1952I(Class<T> cls, C0340l c0340l) throws IOException {
            m1982g0(3);
            return (T) m1962T(cza0.m109400a().m109403d(cls), c0340l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: J */
        public <K, V> void mo1953J(Map<K, V> map, C0356y.a<K, V> aVar, C0340l c0340l) throws IOException {
            m1982g0(2);
            int iM1972b0 = m1972b0();
            m1978e0(iM1972b0);
            int i = this.f1631e;
            this.f1631e = this.f1629c + iM1972b0;
            try {
                Object objM1961S = aVar.f1763b;
                Object objM1961S2 = aVar.f1765d;
                while (true) {
                    int iMo1996o = mo1996o();
                    if (iMo1996o == Integer.MAX_VALUE) {
                        map.put(objM1961S, objM1961S2);
                        this.f1631e = i;
                        return;
                    } else if (iMo1996o == 1) {
                        objM1961S = m1961S(aVar.f1762a, null, null);
                    } else if (iMo1996o != 2) {
                        try {
                            if (!mo1999r()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!mo1999r()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        objM1961S2 = m1961S(aVar.f1764c, aVar.f1765d.getClass(), c0340l);
                    }
                }
            } catch (Throwable th) {
                this.f1631e = i;
                throw th;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: K */
        public long mo1954K() throws IOException {
            m1982g0(0);
            return AbstractC0330g.m2028c(m1974c0());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: L */
        public String mo1955L() throws IOException {
            return m1968Z(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: M */
        public <T> void mo1956M(List<T> list, InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
            int i;
            if (WireFormat.m1747b(this.f1632f) != 3) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f1632f;
            do {
                list.add(m1962T(interfaceC0335i0, c0340l));
                if (m1959Q()) {
                    return;
                } else {
                    i = this.f1629c;
                }
            } while (m1972b0() == i2);
            this.f1629c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: N */
        public int mo1957N() throws IOException {
            m1982g0(5);
            return m1963U();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: O */
        public String mo1958O() throws IOException {
            return m1968Z(true);
        }

        /* JADX INFO: renamed from: Q */
        public final boolean m1959Q() {
            return this.f1629c == this.f1631e;
        }

        /* JADX INFO: renamed from: R */
        public final byte m1960R() throws IOException {
            int i = this.f1629c;
            if (i == this.f1631e) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1628b;
            this.f1629c = i + 1;
            return bArr[i];
        }

        /* JADX INFO: renamed from: S */
        public final Object m1961S(WireFormat.FieldType fieldType, Class<?> cls, C0340l c0340l) throws IOException {
            switch (a.f1626a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo2006y());
                case 2:
                    return mo1981g();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo1975d());
                case 5:
                    return Integer.valueOf(mo1951H());
                case 6:
                    return Long.valueOf(mo2004w());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo1947D());
                case 9:
                    return Long.valueOf(mo2002u());
                case 10:
                    return mo1989k(cls, c0340l);
                case 11:
                    return Integer.valueOf(mo1957N());
                case 12:
                    return Long.valueOf(mo1971b());
                case 13:
                    return Integer.valueOf(mo1977e());
                case 14:
                    return Long.valueOf(mo1954K());
                case 15:
                    return mo1958O();
                case 16:
                    return Integer.valueOf(mo1973c());
                case 17:
                    return Long.valueOf(mo1987j());
                default:
                    upk0.m194883a("unsupported field type.");
                    return null;
            }
        }

        /* JADX INFO: renamed from: T */
        public final <T> T m1962T(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
            int i = this.f1633g;
            this.f1633g = WireFormat.m1748c(WireFormat.m1746a(this.f1632f), 4);
            try {
                T tMo1912h = interfaceC0335i0.mo1912h();
                interfaceC0335i0.mo1906e(tMo1912h, this, c0340l);
                interfaceC0335i0.mo1908f(tMo1912h);
                if (this.f1632f != this.f1633g) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.f1633g = i;
                return tMo1912h;
            } catch (Throwable th) {
                this.f1633g = i;
                throw th;
            }
        }

        /* JADX INFO: renamed from: U */
        public final int m1963U() throws IOException {
            m1978e0(4);
            return m1964V();
        }

        /* JADX INFO: renamed from: V */
        public final int m1964V() {
            int i = this.f1629c;
            byte[] bArr = this.f1628b;
            this.f1629c = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        /* JADX INFO: renamed from: W */
        public final long m1965W() throws IOException {
            m1978e0(8);
            return m1966X();
        }

        /* JADX INFO: renamed from: X */
        public final long m1966X() {
            int i = this.f1629c;
            byte[] bArr = this.f1628b;
            this.f1629c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: Y */
        public final <T> T m1967Y(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
            int iM1972b0 = m1972b0();
            m1978e0(iM1972b0);
            int i = this.f1631e;
            int i2 = this.f1629c + iM1972b0;
            this.f1631e = i2;
            try {
                T tMo1912h = interfaceC0335i0.mo1912h();
                interfaceC0335i0.mo1906e(tMo1912h, this, c0340l);
                interfaceC0335i0.mo1908f(tMo1912h);
                if (this.f1629c != i2) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.f1631e = i;
                return tMo1912h;
            } catch (Throwable th) {
                this.f1631e = i;
                throw th;
            }
        }

        /* JADX INFO: renamed from: Z */
        public String m1968Z(boolean z) throws IOException {
            m1982g0(2);
            int iM1972b0 = m1972b0();
            if (iM1972b0 == 0) {
                return "";
            }
            m1978e0(iM1972b0);
            if (z) {
                byte[] bArr = this.f1628b;
                int i = this.f1629c;
                if (!Utf8.m1704t(bArr, i, i + iM1972b0)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f1628b, this.f1629c, iM1972b0, C0350s.f1737a);
            this.f1629c += iM1972b0;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: a */
        public void mo1969a(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0355x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b != 0) {
                    if (iM1747b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1972b0 = this.f1629c + m1972b0();
                    while (this.f1629c < iM1972b0) {
                        list.add(Long.valueOf(AbstractC0330g.m2028c(m1974c0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo1954K()));
                    if (m1959Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0355x c0355x = (C0355x) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 != 0) {
                if (iM1747b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b1 = this.f1629c + m1972b0();
                while (this.f1629c < iM1972b1) {
                    c0355x.m2383u(AbstractC0330g.m2028c(m1974c0()));
                }
                return;
            }
            do {
                c0355x.m2383u(mo1954K());
                if (m1959Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i2;
        }

        /* JADX INFO: renamed from: a0 */
        public void m1970a0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.m1747b(this.f1632f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            if (!(list instanceof u9r) || z) {
                do {
                    list.add(m1968Z(z));
                    if (m1959Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            u9r u9rVar = (u9r) list;
            do {
                u9rVar.mo2365t(mo1981g());
                if (m1959Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: b */
        public long mo1971b() throws IOException {
            m1982g0(1);
            return m1965W();
        }

        /* JADX INFO: renamed from: b0 */
        public final int m1972b0() throws IOException {
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
                return (int) m1976d0();
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

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: c */
        public int mo1973c() throws IOException {
            m1982g0(0);
            return m1972b0();
        }

        /* JADX INFO: renamed from: c0 */
        public long m1974c0() throws IOException {
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
                return m1976d0();
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

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: d */
        public int mo1975d() throws IOException {
            m1982g0(0);
            return m1972b0();
        }

        /* JADX INFO: renamed from: d0 */
        public final long m1976d0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bM1960R = m1960R();
                j |= ((long) (bM1960R & 127)) << i;
                if ((bM1960R & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: e */
        public int mo1977e() throws IOException {
            m1982g0(0);
            return AbstractC0330g.m2027b(m1972b0());
        }

        /* JADX INFO: renamed from: e0 */
        public final void m1978e0(int i) throws IOException {
            if (i < 0 || i > this.f1631e - this.f1629c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: f */
        public void mo1979f(List<Boolean> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0328f;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b != 0) {
                    if (iM1747b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1972b0 = this.f1629c + m1972b0();
                    while (this.f1629c < iM1972b0) {
                        list.add(Boolean.valueOf(m1972b0() != 0));
                    }
                    m1980f0(iM1972b0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(mo2006y()));
                    if (m1959Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0328f c0328f = (C0328f) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 != 0) {
                if (iM1747b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b1 = this.f1629c + m1972b0();
                while (this.f1629c < iM1972b1) {
                    c0328f.m2017h(m1972b0() != 0);
                }
                m1980f0(iM1972b1);
                return;
            }
            do {
                c0328f.m2017h(mo2006y());
                if (m1959Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i2;
        }

        /* JADX INFO: renamed from: f0 */
        public final void m1980f0(int i) throws IOException {
            if (this.f1629c != i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: g */
        public ByteString mo1981g() throws IOException {
            m1982g0(2);
            int iM1972b0 = m1972b0();
            if (iM1972b0 == 0) {
                return ByteString.EMPTY;
            }
            m1978e0(iM1972b0);
            boolean z = this.f1627a;
            byte[] bArr = this.f1628b;
            ByteString byteStringWrap = z ? ByteString.wrap(bArr, this.f1629c, iM1972b0) : ByteString.copyFrom(bArr, this.f1629c, iM1972b0);
            this.f1629c += iM1972b0;
            return byteStringWrap;
        }

        /* JADX INFO: renamed from: g0 */
        public final void m1982g0(int i) throws IOException {
            if (WireFormat.m1747b(this.f1632f) != i) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        public int getTag() {
            return this.f1632f;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: h */
        public <T> T mo1983h(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
            m1982g0(3);
            return (T) m1962T(interfaceC0335i0, c0340l);
        }

        /* JADX INFO: renamed from: h0 */
        public final void m1984h0(int i) throws IOException {
            m1978e0(i);
            this.f1629c += i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: i */
        public void mo1985i(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0349r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b != 0) {
                    if (iM1747b != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iM1972b0 = this.f1629c + m1972b0();
                    while (this.f1629c < iM1972b0) {
                        list.add(Integer.valueOf(AbstractC0330g.m2027b(m1972b0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo1977e()));
                    if (m1959Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0349r c0349r = (C0349r) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 != 0) {
                if (iM1747b2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b1 = this.f1629c + m1972b0();
                while (this.f1629c < iM1972b1) {
                    c0349r.m2331T(AbstractC0330g.m2027b(m1972b0()));
                }
                return;
            }
            do {
                c0349r.m2331T(mo1977e());
                if (m1959Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i2;
        }

        /* JADX INFO: renamed from: i0 */
        public final void m1986i0() throws IOException {
            int i = this.f1633g;
            this.f1633g = WireFormat.m1748c(WireFormat.m1746a(this.f1632f), 4);
            while (mo1996o() != Integer.MAX_VALUE && mo1999r()) {
            }
            if (this.f1632f != this.f1633g) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f1633g = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: j */
        public long mo1987j() throws IOException {
            m1982g0(0);
            return m1974c0();
        }

        /* JADX INFO: renamed from: j0 */
        public final void m1988j0() throws IOException {
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
            m1990k0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: k */
        public <T> T mo1989k(Class<T> cls, C0340l c0340l) throws IOException {
            m1982g0(2);
            return (T) m1967Y(cza0.m109400a().m109403d(cls), c0340l);
        }

        /* JADX INFO: renamed from: k0 */
        public final void m1990k0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m1960R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: l */
        public void mo1991l(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0355x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b == 1) {
                    do {
                        list.add(Long.valueOf(mo1971b()));
                        if (m1959Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1972b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1747b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b0 = m1972b0();
                m1994m0(iM1972b0);
                int i4 = this.f1629c + iM1972b0;
                while (this.f1629c < i4) {
                    list.add(Long.valueOf(m1966X()));
                }
                return;
            }
            C0355x c0355x = (C0355x) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 == 1) {
                do {
                    c0355x.m2383u(mo1971b());
                    if (m1959Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1747b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1972b1 = m1972b0();
            m1994m0(iM1972b1);
            int i5 = this.f1629c + iM1972b1;
            while (this.f1629c < i5) {
                c0355x.m2383u(m1966X());
            }
        }

        /* JADX INFO: renamed from: l0 */
        public final void m1992l0(int i) throws IOException {
            m1978e0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: m */
        public void mo1993m(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0349r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b == 0) {
                    do {
                        list.add(Integer.valueOf(mo1947D()));
                        if (m1959Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1972b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1747b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b0 = this.f1629c + m1972b0();
                while (this.f1629c < iM1972b0) {
                    list.add(Integer.valueOf(m1972b0()));
                }
                m1980f0(iM1972b0);
                return;
            }
            C0349r c0349r = (C0349r) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 == 0) {
                do {
                    c0349r.m2331T(mo1947D());
                    if (m1959Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1747b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1972b1 = this.f1629c + m1972b0();
            while (this.f1629c < iM1972b1) {
                c0349r.m2331T(m1972b0());
            }
            m1980f0(iM1972b1);
        }

        /* JADX INFO: renamed from: m0 */
        public final void m1994m0(int i) throws IOException {
            m1978e0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: n */
        public void mo1995n(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0349r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b == 2) {
                    int iM1972b0 = m1972b0();
                    m1992l0(iM1972b0);
                    int i4 = this.f1629c + iM1972b0;
                    while (this.f1629c < i4) {
                        list.add(Integer.valueOf(m1964V()));
                    }
                    return;
                }
                if (iM1747b != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(mo1951H()));
                    if (m1959Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0349r c0349r = (C0349r) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 == 2) {
                int iM1972b1 = m1972b0();
                m1992l0(iM1972b1);
                int i5 = this.f1629c + iM1972b1;
                while (this.f1629c < i5) {
                    c0349r.m2331T(m1964V());
                }
                return;
            }
            if (iM1747b2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c0349r.m2331T(mo1951H());
                if (m1959Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: o */
        public int mo1996o() throws IOException {
            if (m1959Q()) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            int iM1972b0 = m1972b0();
            this.f1632f = iM1972b0;
            return iM1972b0 == this.f1633g ? Api.BaseClientBuilder.API_PRIORITY_OTHER : WireFormat.m1746a(iM1972b0);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: p */
        public void mo1997p(List<String> list) throws IOException {
            m1970a0(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: q */
        public void mo1998q(List<Float> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0348q;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b == 2) {
                    int iM1972b0 = m1972b0();
                    m1992l0(iM1972b0);
                    int i4 = this.f1629c + iM1972b0;
                    while (this.f1629c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m1964V())));
                    }
                    return;
                }
                if (iM1747b != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (m1959Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0348q c0348q = (C0348q) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 == 2) {
                int iM1972b1 = m1972b0();
                m1992l0(iM1972b1);
                int i5 = this.f1629c + iM1972b1;
                while (this.f1629c < i5) {
                    c0348q.m2321M(Float.intBitsToFloat(m1964V()));
                }
                return;
            }
            if (iM1747b2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c0348q.m2321M(readFloat());
                if (m1959Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: r */
        public boolean mo1999r() throws IOException {
            int i;
            if (m1959Q() || (i = this.f1632f) == this.f1633g) {
                return false;
            }
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                m1988j0();
                return true;
            }
            if (iM1747b == 1) {
                m1984h0(8);
                return true;
            }
            if (iM1747b == 2) {
                m1984h0(m1972b0());
                return true;
            }
            if (iM1747b == 3) {
                m1986i0();
                return true;
            }
            if (iM1747b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m1984h0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        public double readDouble() throws IOException {
            m1982g0(1);
            return Double.longBitsToDouble(m1965W());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        public float readFloat() throws IOException {
            m1982g0(5);
            return Float.intBitsToFloat(m1963U());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: s */
        public void mo2000s(List<ByteString> list) throws IOException {
            int i;
            if (WireFormat.m1747b(this.f1632f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(mo1981g());
                if (m1959Q()) {
                    return;
                } else {
                    i = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: t */
        public void mo2001t(List<Double> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0336j;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (m1959Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1972b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1747b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b0 = m1972b0();
                m1994m0(iM1972b0);
                int i4 = this.f1629c + iM1972b0;
                while (this.f1629c < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m1966X())));
                }
                return;
            }
            C0336j c0336j = (C0336j) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 == 1) {
                do {
                    c0336j.m2132g(readDouble());
                    if (m1959Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1747b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1972b1 = m1972b0();
            m1994m0(iM1972b1);
            int i5 = this.f1629c + iM1972b1;
            while (this.f1629c < i5) {
                c0336j.m2132g(Double.longBitsToDouble(m1966X()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: u */
        public long mo2002u() throws IOException {
            m1982g0(0);
            return m1974c0();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: v */
        public <T> T mo2003v(InterfaceC0335i0<T> interfaceC0335i0, C0340l c0340l) throws IOException {
            m1982g0(2);
            return (T) m1967Y(interfaceC0335i0, c0340l);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: w */
        public long mo2004w() throws IOException {
            m1982g0(1);
            return m1965W();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: x */
        public void mo2005x(List<Integer> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0349r;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b == 2) {
                    int iM1972b0 = m1972b0();
                    m1992l0(iM1972b0);
                    int i4 = this.f1629c + iM1972b0;
                    while (this.f1629c < i4) {
                        list.add(Integer.valueOf(m1964V()));
                    }
                    return;
                }
                if (iM1747b != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(mo1957N()));
                    if (m1959Q()) {
                        return;
                    } else {
                        i = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i;
                return;
            }
            C0349r c0349r = (C0349r) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 == 2) {
                int iM1972b1 = m1972b0();
                m1992l0(iM1972b1);
                int i5 = this.f1629c + iM1972b1;
                while (this.f1629c < i5) {
                    c0349r.m2331T(m1964V());
                }
                return;
            }
            if (iM1747b2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c0349r.m2331T(mo1957N());
                if (m1959Q()) {
                    return;
                } else {
                    i2 = this.f1629c;
                }
            } while (m1972b0() == this.f1632f);
            this.f1629c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: y */
        public boolean mo2006y() throws IOException {
            m1982g0(0);
            return m1972b0() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0333h0
        /* JADX INFO: renamed from: z */
        public void mo2007z(List<Long> list) throws IOException {
            int i;
            int i2;
            boolean z = list instanceof C0355x;
            int i3 = this.f1632f;
            if (!z) {
                int iM1747b = WireFormat.m1747b(i3);
                if (iM1747b == 0) {
                    do {
                        list.add(Long.valueOf(mo1987j()));
                        if (m1959Q()) {
                            return;
                        } else {
                            i = this.f1629c;
                        }
                    } while (m1972b0() == this.f1632f);
                    this.f1629c = i;
                    return;
                }
                if (iM1747b != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iM1972b0 = this.f1629c + m1972b0();
                while (this.f1629c < iM1972b0) {
                    list.add(Long.valueOf(m1974c0()));
                }
                m1980f0(iM1972b0);
                return;
            }
            C0355x c0355x = (C0355x) list;
            int iM1747b2 = WireFormat.m1747b(i3);
            if (iM1747b2 == 0) {
                do {
                    c0355x.m2383u(mo1987j());
                    if (m1959Q()) {
                        return;
                    } else {
                        i2 = this.f1629c;
                    }
                } while (m1972b0() == this.f1632f);
                this.f1629c = i2;
                return;
            }
            if (iM1747b2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iM1972b1 = this.f1629c + m1972b0();
            while (this.f1629c < iM1972b1) {
                c0355x.m2383u(m1974c0());
            }
            m1980f0(iM1972b1);
        }
    }

    public /* synthetic */ AbstractC0326e(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: P */
    public static AbstractC0326e m1943P(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        ig3.m135964a("Direct buffers not yet supported");
        return null;
    }

    public AbstractC0326e() {
    }
}
