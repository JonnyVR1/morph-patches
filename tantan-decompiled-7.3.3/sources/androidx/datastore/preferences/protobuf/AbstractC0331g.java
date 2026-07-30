package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p153l.lyj0;
import p153l.oc5;
import p153l.tg3;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0331g {

    /* JADX INFO: renamed from: a */
    public int f1641a;

    /* JADX INFO: renamed from: b */
    public int f1642b;

    /* JADX INFO: renamed from: c */
    public int f1643c;

    /* JADX INFO: renamed from: d */
    public C0333h f1644d;

    /* JADX INFO: renamed from: e */
    public boolean f1645e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    public static final class b extends AbstractC0331g {

        /* JADX INFO: renamed from: f */
        public final byte[] f1646f;

        /* JADX INFO: renamed from: g */
        public final boolean f1647g;

        /* JADX INFO: renamed from: h */
        public int f1648h;

        /* JADX INFO: renamed from: i */
        public int f1649i;

        /* JADX INFO: renamed from: j */
        public int f1650j;

        /* JADX INFO: renamed from: k */
        public int f1651k;

        /* JADX INFO: renamed from: l */
        public int f1652l;

        /* JADX INFO: renamed from: m */
        public boolean f1653m;

        /* JADX INFO: renamed from: n */
        public int f1654n;

        public b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f1654n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f1646f = bArr;
            this.f1648h = i2 + i;
            this.f1650j = i;
            this.f1651k = i;
            this.f1647g = z;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: A */
        public String mo2036A() throws IOException {
            int iM2064K = m2064K();
            if (iM2064K > 0) {
                int i = this.f1648h;
                int i2 = this.f1650j;
                if (iM2064K <= i - i2) {
                    String str = new String(this.f1646f, i2, iM2064K, C0351s.f1737a);
                    this.f1650j += iM2064K;
                    return str;
                }
            }
            if (iM2064K == 0) {
                return "";
            }
            if (iM2064K < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: B */
        public String mo2037B() throws IOException {
            int iM2064K = m2064K();
            if (iM2064K > 0) {
                int i = this.f1648h;
                int i2 = this.f1650j;
                if (iM2064K <= i - i2) {
                    String strM1693h = Utf8.m1693h(this.f1646f, i2, iM2064K);
                    this.f1650j += iM2064K;
                    return strM1693h;
                }
            }
            if (iM2064K == 0) {
                return "";
            }
            if (iM2064K <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: C */
        public int mo2038C() throws IOException {
            if (mo2044e()) {
                this.f1652l = 0;
                return 0;
            }
            int iM2064K = m2064K();
            this.f1652l = iM2064K;
            if (WireFormat.m1747a(iM2064K) != 0) {
                return this.f1652l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: D */
        public int mo2039D() throws IOException {
            return m2064K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: E */
        public long mo2040E() throws IOException {
            return m2065L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: F */
        public boolean mo2041F(int i) throws IOException {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                m2070Q();
                return true;
            }
            if (iM1748b == 1) {
                m2069P(8);
                return true;
            }
            if (iM1748b == 2) {
                m2069P(m2064K());
                return true;
            }
            if (iM1748b == 3) {
                m2068O();
                mo2042a(WireFormat.m1749c(WireFormat.m1747a(i), 4));
                return true;
            }
            if (iM1748b == 4) {
                return false;
            }
            if (iM1748b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m2069P(4);
            return true;
        }

        /* JADX INFO: renamed from: G */
        public byte m2060G() throws IOException {
            int i = this.f1650j;
            if (i == this.f1648h) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1646f;
            this.f1650j = i + 1;
            return bArr[i];
        }

        /* JADX INFO: renamed from: H */
        public byte[] m2061H(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f1648h;
                int i3 = this.f1650j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f1650j = i4;
                    return Arrays.copyOfRange(this.f1646f, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return C0351s.f1739c;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* JADX INFO: renamed from: I */
        public int m2062I() throws IOException {
            int i = this.f1650j;
            if (this.f1648h - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1646f;
            this.f1650j = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        /* JADX INFO: renamed from: J */
        public long m2063J() throws IOException {
            int i = this.f1650j;
            if (this.f1648h - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1646f;
            this.f1650j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: K */
        public int m2064K() throws IOException {
            int i;
            int i2 = this.f1650j;
            int i3 = this.f1648h;
            if (i3 != i2) {
                byte[] bArr = this.f1646f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f1650j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
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
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
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
                    this.f1650j = i5;
                    return i;
                }
            }
            return (int) m2066M();
        }

        /* JADX INFO: renamed from: L */
        public long m2065L() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f1650j;
            int i2 = this.f1648h;
            if (i2 != i) {
                byte[] bArr = this.f1646f;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f1650j = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
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
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
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
                    this.f1650j = i4;
                    return j;
                }
            }
            return m2066M();
        }

        /* JADX INFO: renamed from: M */
        public long m2066M() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bM2060G = m2060G();
                j |= ((long) (bM2060G & 127)) << i;
                if ((bM2060G & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: N */
        public final void m2067N() {
            int i = this.f1648h + this.f1649i;
            this.f1648h = i;
            int i2 = i - this.f1651k;
            int i3 = this.f1654n;
            if (i2 <= i3) {
                this.f1649i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f1649i = i4;
            this.f1648h = i - i4;
        }

        /* JADX INFO: renamed from: O */
        public void m2068O() throws IOException {
            int iMo2038C;
            do {
                iMo2038C = mo2038C();
                if (iMo2038C == 0) {
                    return;
                }
            } while (mo2041F(iMo2038C));
        }

        /* JADX INFO: renamed from: P */
        public void m2069P(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f1648h;
                int i3 = this.f1650j;
                if (i <= i2 - i3) {
                    this.f1650j = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* JADX INFO: renamed from: Q */
        public final void m2070Q() throws IOException {
            if (this.f1648h - this.f1650j >= 10) {
                m2071R();
            } else {
                m2072S();
            }
        }

        /* JADX INFO: renamed from: R */
        public final void m2071R() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f1646f;
                int i2 = this.f1650j;
                this.f1650j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: S */
        public final void m2072S() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m2060G() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: a */
        public void mo2042a(int i) throws InvalidProtocolBufferException {
            if (this.f1652l != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: d */
        public int mo2043d() {
            return this.f1650j - this.f1651k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: e */
        public boolean mo2044e() throws IOException {
            return this.f1650j == this.f1648h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: l */
        public void mo2045l(int i) {
            this.f1654n = i;
            m2067N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: m */
        public int mo2046m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iMo2043d = i + mo2043d();
            int i2 = this.f1654n;
            if (iMo2043d > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1654n = iMo2043d;
            m2067N();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: n */
        public boolean mo2047n() throws IOException {
            return m2065L() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: o */
        public ByteString mo2048o() throws IOException {
            int iM2064K = m2064K();
            if (iM2064K > 0) {
                int i = this.f1648h;
                int i2 = this.f1650j;
                if (iM2064K <= i - i2) {
                    ByteString byteStringWrap = (this.f1647g && this.f1653m) ? ByteString.wrap(this.f1646f, i2, iM2064K) : ByteString.copyFrom(this.f1646f, i2, iM2064K);
                    this.f1650j += iM2064K;
                    return byteStringWrap;
                }
            }
            return iM2064K == 0 ? ByteString.EMPTY : ByteString.wrap(m2061H(iM2064K));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: p */
        public double mo2049p() throws IOException {
            return Double.longBitsToDouble(m2063J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: q */
        public int mo2050q() throws IOException {
            return m2064K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: r */
        public int mo2051r() throws IOException {
            return m2062I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: s */
        public long mo2052s() throws IOException {
            return m2063J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: t */
        public float mo2053t() throws IOException {
            return Float.intBitsToFloat(m2062I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: u */
        public int mo2054u() throws IOException {
            return m2064K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: v */
        public long mo2055v() throws IOException {
            return m2065L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: w */
        public int mo2056w() throws IOException {
            return m2062I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: x */
        public long mo2057x() throws IOException {
            return m2063J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: y */
        public int mo2058y() throws IOException {
            return AbstractC0331g.m2028b(m2064K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: z */
        public long mo2059z() throws IOException {
            return AbstractC0331g.m2029c(m2065L());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    public static final class c extends AbstractC0331g {

        /* JADX INFO: renamed from: f */
        public final InputStream f1655f;

        /* JADX INFO: renamed from: g */
        public final byte[] f1656g;

        /* JADX INFO: renamed from: h */
        public int f1657h;

        /* JADX INFO: renamed from: i */
        public int f1658i;

        /* JADX INFO: renamed from: j */
        public int f1659j;

        /* JADX INFO: renamed from: k */
        public int f1660k;

        /* JADX INFO: renamed from: l */
        public int f1661l;

        /* JADX INFO: renamed from: m */
        public int f1662m;

        public c(InputStream inputStream, int i) {
            super();
            this.f1662m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            C0351s.m2341b(inputStream, "input");
            this.f1655f = inputStream;
            this.f1656g = new byte[i];
            this.f1657h = 0;
            this.f1659j = 0;
            this.f1661l = 0;
        }

        /* JADX INFO: renamed from: Q */
        private void m2073Q() {
            int i = this.f1657h + this.f1658i;
            this.f1657h = i;
            int i2 = this.f1661l + i;
            int i3 = this.f1662m;
            if (i2 <= i3) {
                this.f1658i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f1658i = i4;
            this.f1657h = i - i4;
        }

        /* JADX INFO: renamed from: V */
        private void m2074V() throws IOException {
            if (this.f1657h - this.f1659j >= 10) {
                m2075W();
            } else {
                m2076X();
            }
        }

        /* JADX INFO: renamed from: W */
        private void m2075W() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f1656g;
                int i2 = this.f1659j;
                this.f1659j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: X */
        private void m2076X() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m2078H() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: A */
        public String mo2036A() throws IOException {
            int iM2084N = m2084N();
            if (iM2084N > 0) {
                int i = this.f1657h;
                int i2 = this.f1659j;
                if (iM2084N <= i - i2) {
                    String str = new String(this.f1656g, i2, iM2084N, C0351s.f1737a);
                    this.f1659j += iM2084N;
                    return str;
                }
            }
            if (iM2084N == 0) {
                return "";
            }
            if (iM2084N > this.f1657h) {
                return new String(m2079I(iM2084N, false), C0351s.f1737a);
            }
            m2087R(iM2084N);
            String str2 = new String(this.f1656g, this.f1659j, iM2084N, C0351s.f1737a);
            this.f1659j += iM2084N;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: B */
        public String mo2037B() throws IOException {
            byte[] bArrM2079I;
            int iM2084N = m2084N();
            int i = this.f1659j;
            int i2 = this.f1657h;
            if (iM2084N <= i2 - i && iM2084N > 0) {
                bArrM2079I = this.f1656g;
                this.f1659j = i + iM2084N;
            } else {
                if (iM2084N == 0) {
                    return "";
                }
                i = 0;
                if (iM2084N <= i2) {
                    m2087R(iM2084N);
                    bArrM2079I = this.f1656g;
                    this.f1659j = iM2084N;
                } else {
                    bArrM2079I = m2079I(iM2084N, false);
                }
            }
            return Utf8.m1693h(bArrM2079I, i, iM2084N);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: C */
        public int mo2038C() throws IOException {
            if (mo2044e()) {
                this.f1660k = 0;
                return 0;
            }
            int iM2084N = m2084N();
            this.f1660k = iM2084N;
            if (WireFormat.m1747a(iM2084N) != 0) {
                return this.f1660k;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: D */
        public int mo2039D() throws IOException {
            return m2084N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: E */
        public long mo2040E() throws IOException {
            return m2085O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: F */
        public boolean mo2041F(int i) throws IOException {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                m2074V();
                return true;
            }
            if (iM1748b == 1) {
                m2089T(8);
                return true;
            }
            if (iM1748b == 2) {
                m2089T(m2084N());
                return true;
            }
            if (iM1748b == 3) {
                m2088S();
                mo2042a(WireFormat.m1749c(WireFormat.m1747a(i), 4));
                return true;
            }
            if (iM1748b == 4) {
                return false;
            }
            if (iM1748b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m2089T(4);
            return true;
        }

        /* JADX INFO: renamed from: G */
        public final ByteString m2077G(int i) throws IOException {
            byte[] bArrM2080J = m2080J(i);
            if (bArrM2080J != null) {
                return ByteString.copyFrom(bArrM2080J);
            }
            int i2 = this.f1659j;
            int i3 = this.f1657h;
            int length = i3 - i2;
            this.f1661l += i3;
            this.f1659j = 0;
            this.f1657h = 0;
            List<byte[]> listM2081K = m2081K(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f1656g, i2, bArr, 0, length);
            for (byte[] bArr2 : listM2081K) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        /* JADX INFO: renamed from: H */
        public byte m2078H() throws IOException {
            if (this.f1659j == this.f1657h) {
                m2087R(1);
            }
            byte[] bArr = this.f1656g;
            int i = this.f1659j;
            this.f1659j = i + 1;
            return bArr[i];
        }

        /* JADX INFO: renamed from: I */
        public final byte[] m2079I(int i, boolean z) throws IOException {
            byte[] bArrM2080J = m2080J(i);
            if (bArrM2080J != null) {
                return z ? (byte[]) bArrM2080J.clone() : bArrM2080J;
            }
            int i2 = this.f1659j;
            int i3 = this.f1657h;
            int length = i3 - i2;
            this.f1661l += i3;
            this.f1659j = 0;
            this.f1657h = 0;
            List<byte[]> listM2081K = m2081K(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f1656g, i2, bArr, 0, length);
            for (byte[] bArr2 : listM2081K) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: J */
        public final byte[] m2080J(int i) throws IOException {
            if (i == 0) {
                return C0351s.f1739c;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.f1661l;
            int i3 = this.f1659j;
            int i4 = i2 + i3 + i;
            if (i4 - this.f1643c > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i5 = this.f1662m;
            if (i4 > i5) {
                m2089T((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = this.f1657h - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > this.f1655f.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f1656g, this.f1659j, bArr, 0, i6);
            this.f1661l += this.f1657h;
            this.f1659j = 0;
            this.f1657h = 0;
            while (i6 < i) {
                int i8 = this.f1655f.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f1661l += i8;
                i6 += i8;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: K */
        public final List<byte[]> m2081K(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.f1655f.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.f1661l += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: L */
        public int m2082L() throws IOException {
            int i = this.f1659j;
            if (this.f1657h - i < 4) {
                m2087R(4);
                i = this.f1659j;
            }
            byte[] bArr = this.f1656g;
            this.f1659j = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        /* JADX INFO: renamed from: M */
        public long m2083M() throws IOException {
            int i = this.f1659j;
            if (this.f1657h - i < 8) {
                m2087R(8);
                i = this.f1659j;
            }
            byte[] bArr = this.f1656g;
            this.f1659j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: N */
        public int m2084N() throws IOException {
            int i;
            int i2 = this.f1659j;
            int i3 = this.f1657h;
            if (i3 != i2) {
                byte[] bArr = this.f1656g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f1659j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
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
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
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
                    this.f1659j = i5;
                    return i;
                }
            }
            return (int) m2086P();
        }

        /* JADX INFO: renamed from: O */
        public long m2085O() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f1659j;
            int i2 = this.f1657h;
            if (i2 != i) {
                byte[] bArr = this.f1656g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f1659j = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
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
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
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
                    this.f1659j = i4;
                    return j;
                }
            }
            return m2086P();
        }

        /* JADX INFO: renamed from: P */
        public long m2086P() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bM2078H = m2078H();
                j |= ((long) (bM2078H & 127)) << i;
                if ((bM2078H & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: R */
        public final void m2087R(int i) throws IOException {
            if (m2091Y(i)) {
                return;
            }
            if (i <= (this.f1643c - this.f1661l) - this.f1659j) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        /* JADX INFO: renamed from: S */
        public void m2088S() throws IOException {
            int iMo2038C;
            do {
                iMo2038C = mo2038C();
                if (iMo2038C == 0) {
                    return;
                }
            } while (mo2041F(iMo2038C));
        }

        /* JADX INFO: renamed from: T */
        public void m2089T(int i) throws IOException {
            int i2 = this.f1657h;
            int i3 = this.f1659j;
            if (i > i2 - i3 || i < 0) {
                m2090U(i);
            } else {
                this.f1659j = i3 + i;
            }
        }

        /* JADX INFO: renamed from: U */
        public final void m2090U(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.f1661l;
            int i3 = this.f1659j;
            int i4 = i2 + i3 + i;
            int i5 = this.f1662m;
            if (i4 > i5) {
                m2089T((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1661l = i2 + i3;
            int i6 = this.f1657h - i3;
            this.f1657h = 0;
            this.f1659j = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long jSkip = this.f1655f.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(this.f1655f.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i6 += (int) jSkip;
                    }
                } catch (Throwable th) {
                    this.f1661l += i6;
                    m2073Q();
                    throw th;
                }
            }
            this.f1661l += i6;
            m2073Q();
            if (i6 >= i) {
                return;
            }
            int i7 = this.f1657h;
            int i8 = i7 - this.f1659j;
            this.f1659j = i7;
            m2087R(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.f1657h;
                if (i9 <= i10) {
                    this.f1659j = i9;
                    return;
                } else {
                    i8 += i10;
                    this.f1659j = i10;
                    m2087R(1);
                }
            }
        }

        /* JADX INFO: renamed from: Y */
        public final boolean m2091Y(int i) throws IOException {
            int i2 = this.f1659j;
            int i3 = i2 + i;
            int i4 = this.f1657h;
            if (i3 <= i4) {
                oc5.m167139a("refillBuffer() called when ", i, " bytes were already available in buffer");
                return false;
            }
            int i5 = this.f1643c;
            int i6 = this.f1661l;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f1662m) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f1656g;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f1661l += i2;
                this.f1657h -= i2;
                this.f1659j = 0;
            }
            InputStream inputStream = this.f1655f;
            byte[] bArr2 = this.f1656g;
            int i7 = this.f1657h;
            int i8 = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f1643c - this.f1661l) - i7));
            if (i8 == 0 || i8 < -1 || i8 > this.f1656g.length) {
                throw new IllegalStateException(this.f1655f.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
            }
            if (i8 <= 0) {
                return false;
            }
            this.f1657h += i8;
            m2073Q();
            if (this.f1657h >= i) {
                return true;
            }
            return m2091Y(i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: a */
        public void mo2042a(int i) throws InvalidProtocolBufferException {
            if (this.f1660k != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: d */
        public int mo2043d() {
            return this.f1661l + this.f1659j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: e */
        public boolean mo2044e() throws IOException {
            return this.f1659j == this.f1657h && !m2091Y(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: l */
        public void mo2045l(int i) {
            this.f1662m = i;
            m2073Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: m */
        public int mo2046m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.f1661l + this.f1659j;
            int i3 = this.f1662m;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1662m = i2;
            m2073Q();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: n */
        public boolean mo2047n() throws IOException {
            return m2085O() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: o */
        public ByteString mo2048o() throws IOException {
            int iM2084N = m2084N();
            int i = this.f1657h;
            int i2 = this.f1659j;
            if (iM2084N > i - i2 || iM2084N <= 0) {
                return iM2084N == 0 ? ByteString.EMPTY : m2077G(iM2084N);
            }
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.f1656g, i2, iM2084N);
            this.f1659j += iM2084N;
            return byteStringCopyFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: p */
        public double mo2049p() throws IOException {
            return Double.longBitsToDouble(m2083M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: q */
        public int mo2050q() throws IOException {
            return m2084N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: r */
        public int mo2051r() throws IOException {
            return m2082L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: s */
        public long mo2052s() throws IOException {
            return m2083M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: t */
        public float mo2053t() throws IOException {
            return Float.intBitsToFloat(m2082L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: u */
        public int mo2054u() throws IOException {
            return m2084N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: v */
        public long mo2055v() throws IOException {
            return m2085O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: w */
        public int mo2056w() throws IOException {
            return m2082L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: x */
        public long mo2057x() throws IOException {
            return m2083M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: y */
        public int mo2058y() throws IOException {
            return AbstractC0331g.m2028b(m2084N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: z */
        public long mo2059z() throws IOException {
            return AbstractC0331g.m2029c(m2085O());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$d */
    public static final class d extends AbstractC0331g {

        /* JADX INFO: renamed from: f */
        public final ByteBuffer f1663f;

        /* JADX INFO: renamed from: g */
        public final boolean f1664g;

        /* JADX INFO: renamed from: h */
        public final long f1665h;

        /* JADX INFO: renamed from: i */
        public long f1666i;

        /* JADX INFO: renamed from: j */
        public long f1667j;

        /* JADX INFO: renamed from: k */
        public long f1668k;

        /* JADX INFO: renamed from: l */
        public int f1669l;

        /* JADX INFO: renamed from: m */
        public int f1670m;

        /* JADX INFO: renamed from: n */
        public boolean f1671n;

        /* JADX INFO: renamed from: o */
        public int f1672o;

        public d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f1672o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f1663f = byteBuffer;
            long jM156325i = lyj0.m156325i(byteBuffer);
            this.f1665h = jM156325i;
            this.f1666i = ((long) byteBuffer.limit()) + jM156325i;
            long jPosition = jM156325i + ((long) byteBuffer.position());
            this.f1667j = jPosition;
            this.f1668k = jPosition;
            this.f1664g = z;
        }

        /* JADX INFO: renamed from: H */
        public static boolean m2092H() {
            return lyj0.m156302H();
        }

        /* JADX INFO: renamed from: O */
        private void m2093O() {
            long j = this.f1666i + ((long) this.f1669l);
            this.f1666i = j;
            int i = (int) (j - this.f1668k);
            int i2 = this.f1672o;
            if (i <= i2) {
                this.f1669l = 0;
                return;
            }
            int i3 = i - i2;
            this.f1669l = i3;
            this.f1666i = j - ((long) i3);
        }

        /* JADX INFO: renamed from: S */
        private void m2094S() throws IOException {
            if (m2104P() >= 10) {
                m2095T();
            } else {
                m2096U();
            }
        }

        /* JADX INFO: renamed from: T */
        private void m2095T() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.f1667j;
                this.f1667j = 1 + j;
                if (lyj0.m156337u(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: U */
        private void m2096U() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m2098I() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: A */
        public String mo2036A() throws IOException {
            int iM2101L = m2101L();
            if (iM2101L <= 0 || iM2101L > m2104P()) {
                if (iM2101L == 0) {
                    return "";
                }
                if (iM2101L < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[iM2101L];
            long j = iM2101L;
            lyj0.m156330n(this.f1667j, bArr, 0L, j);
            String str = new String(bArr, C0351s.f1737a);
            this.f1667j += j;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: B */
        public String mo2037B() throws IOException {
            int iM2101L = m2101L();
            if (iM2101L > 0 && iM2101L <= m2104P()) {
                String strM1692g = Utf8.m1692g(this.f1663f, m2097G(this.f1667j), iM2101L);
                this.f1667j += (long) iM2101L;
                return strM1692g;
            }
            if (iM2101L == 0) {
                return "";
            }
            if (iM2101L <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: C */
        public int mo2038C() throws IOException {
            if (mo2044e()) {
                this.f1670m = 0;
                return 0;
            }
            int iM2101L = m2101L();
            this.f1670m = iM2101L;
            if (WireFormat.m1747a(iM2101L) != 0) {
                return this.f1670m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: D */
        public int mo2039D() throws IOException {
            return m2101L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: E */
        public long mo2040E() throws IOException {
            return m2102M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: F */
        public boolean mo2041F(int i) throws IOException {
            int iM1748b = WireFormat.m1748b(i);
            if (iM1748b == 0) {
                m2094S();
                return true;
            }
            if (iM1748b == 1) {
                m2106R(8);
                return true;
            }
            if (iM1748b == 2) {
                m2106R(m2101L());
                return true;
            }
            if (iM1748b == 3) {
                m2105Q();
                mo2042a(WireFormat.m1749c(WireFormat.m1747a(i), 4));
                return true;
            }
            if (iM1748b == 4) {
                return false;
            }
            if (iM1748b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m2106R(4);
            return true;
        }

        /* JADX INFO: renamed from: G */
        public final int m2097G(long j) {
            return (int) (j - this.f1665h);
        }

        /* JADX INFO: renamed from: I */
        public byte m2098I() throws IOException {
            long j = this.f1667j;
            if (j == this.f1666i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1667j = 1 + j;
            return lyj0.m156337u(j);
        }

        /* JADX INFO: renamed from: J */
        public int m2099J() throws IOException {
            long j = this.f1667j;
            if (this.f1666i - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1667j = 4 + j;
            return (lyj0.m156337u(j) & 255) | ((lyj0.m156337u(1 + j) & 255) << 8) | ((lyj0.m156337u(2 + j) & 255) << 16) | ((lyj0.m156337u(j + 3) & 255) << 24);
        }

        /* JADX INFO: renamed from: K */
        public long m2100K() throws IOException {
            long j = this.f1667j;
            if (this.f1666i - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1667j = 8 + j;
            return ((((long) lyj0.m156337u(j + 7)) & 255) << 56) | (((long) lyj0.m156337u(j)) & 255) | ((((long) lyj0.m156337u(1 + j)) & 255) << 8) | ((((long) lyj0.m156337u(2 + j)) & 255) << 16) | ((((long) lyj0.m156337u(3 + j)) & 255) << 24) | ((((long) lyj0.m156337u(4 + j)) & 255) << 32) | ((((long) lyj0.m156337u(5 + j)) & 255) << 40) | ((((long) lyj0.m156337u(6 + j)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (p153l.lyj0.m156337u(r3) < 0) goto L34;
         */
        /* JADX INFO: renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m2101L() throws IOException {
            int i;
            long j = this.f1667j;
            if (this.f1666i != j) {
                long j2 = 1 + j;
                byte bM156337u = lyj0.m156337u(j);
                if (bM156337u >= 0) {
                    this.f1667j = j2;
                    return bM156337u;
                }
                if (this.f1666i - j2 >= 9) {
                    long j3 = 2 + j;
                    int iM156337u = (lyj0.m156337u(j2) << 7) ^ bM156337u;
                    if (iM156337u < 0) {
                        i = iM156337u ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iM156337u2 = iM156337u ^ (lyj0.m156337u(j3) << 14);
                        if (iM156337u2 >= 0) {
                            i = iM156337u2 ^ 16256;
                        } else {
                            j3 = 4 + j;
                            int iM156337u3 = iM156337u2 ^ (lyj0.m156337u(j4) << 21);
                            if (iM156337u3 < 0) {
                                i = (-2080896) ^ iM156337u3;
                            } else {
                                j4 = 5 + j;
                                byte bM156337u2 = lyj0.m156337u(j3);
                                int i2 = (iM156337u3 ^ (bM156337u2 << 28)) ^ 266354560;
                                if (bM156337u2 < 0) {
                                    j3 = 6 + j;
                                    if (lyj0.m156337u(j4) < 0) {
                                        j4 = 7 + j;
                                        if (lyj0.m156337u(j3) < 0) {
                                            j3 = 8 + j;
                                            if (lyj0.m156337u(j4) < 0) {
                                                j4 = j + 9;
                                                if (lyj0.m156337u(j3) < 0) {
                                                    j3 = 10 + j;
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                        }
                        j3 = j4;
                    }
                    this.f1667j = j3;
                    return i;
                }
            }
            return (int) m2103N();
        }

        /* JADX INFO: renamed from: M */
        public long m2102M() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f1667j;
            if (this.f1666i != j4) {
                long j5 = 1 + j4;
                byte bM156337u = lyj0.m156337u(j4);
                if (bM156337u >= 0) {
                    this.f1667j = j5;
                    return bM156337u;
                }
                if (this.f1666i - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iM156337u = (lyj0.m156337u(j5) << 7) ^ bM156337u;
                    if (iM156337u >= 0) {
                        long j7 = 3 + j4;
                        int iM156337u2 = iM156337u ^ (lyj0.m156337u(j6) << 14);
                        if (iM156337u2 >= 0) {
                            j = iM156337u2 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int iM156337u3 = iM156337u2 ^ (lyj0.m156337u(j7) << 21);
                            if (iM156337u3 < 0) {
                                i = (-2080896) ^ iM156337u3;
                            } else {
                                long j8 = 5 + j4;
                                long jM156337u = ((long) iM156337u3) ^ (((long) lyj0.m156337u(j6)) << 28);
                                if (jM156337u >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long jM156337u2 = jM156337u ^ (((long) lyj0.m156337u(j8)) << 35);
                                    if (jM156337u2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        jM156337u = jM156337u2 ^ (((long) lyj0.m156337u(j9)) << 42);
                                        if (jM156337u >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            jM156337u2 = jM156337u ^ (((long) lyj0.m156337u(j8)) << 49);
                                            if (jM156337u2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long jM156337u3 = (jM156337u2 ^ (((long) lyj0.m156337u(j9)) << 56)) ^ 71499008037633920L;
                                                if (jM156337u3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (lyj0.m156337u(j10) >= 0) {
                                                        j6 = j11;
                                                        j = jM156337u3;
                                                    }
                                                } else {
                                                    j = jM156337u3;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jM156337u2;
                                    j6 = j9;
                                }
                                j = j3 ^ jM156337u;
                                j6 = j8;
                            }
                        }
                        this.f1667j = j6;
                        return j;
                    }
                    i = iM156337u ^ (-128);
                    j = i;
                    this.f1667j = j6;
                    return j;
                }
            }
            return m2103N();
        }

        /* JADX INFO: renamed from: N */
        public long m2103N() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bM2098I = m2098I();
                j |= ((long) (bM2098I & 127)) << i;
                if ((bM2098I & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: P */
        public final int m2104P() {
            return (int) (this.f1666i - this.f1667j);
        }

        /* JADX INFO: renamed from: Q */
        public void m2105Q() throws IOException {
            int iMo2038C;
            do {
                iMo2038C = mo2038C();
                if (iMo2038C == 0) {
                    return;
                }
            } while (mo2041F(iMo2038C));
        }

        /* JADX INFO: renamed from: R */
        public void m2106R(int i) throws IOException {
            if (i >= 0 && i <= m2104P()) {
                this.f1667j += (long) i;
            } else {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* JADX INFO: renamed from: V */
        public final ByteBuffer m2107V(long j, long j2) throws IOException {
            int iPosition = this.f1663f.position();
            int iLimit = this.f1663f.limit();
            try {
                try {
                    this.f1663f.position(m2097G(j));
                    this.f1663f.limit(m2097G(j2));
                    ByteBuffer byteBufferSlice = this.f1663f.slice();
                    this.f1663f.position(iPosition);
                    this.f1663f.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th) {
                this.f1663f.position(iPosition);
                this.f1663f.limit(iLimit);
                throw th;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: a */
        public void mo2042a(int i) throws InvalidProtocolBufferException {
            if (this.f1670m != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: d */
        public int mo2043d() {
            return (int) (this.f1667j - this.f1668k);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: e */
        public boolean mo2044e() throws IOException {
            return this.f1667j == this.f1666i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: l */
        public void mo2045l(int i) {
            this.f1672o = i;
            m2093O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: m */
        public int mo2046m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iMo2043d = i + mo2043d();
            int i2 = this.f1672o;
            if (iMo2043d > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1672o = iMo2043d;
            m2093O();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: n */
        public boolean mo2047n() throws IOException {
            return m2102M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: o */
        public ByteString mo2048o() throws IOException {
            int iM2101L = m2101L();
            if (iM2101L <= 0 || iM2101L > m2104P()) {
                if (iM2101L == 0) {
                    return ByteString.EMPTY;
                }
                if (iM2101L < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.f1664g && this.f1671n) {
                long j = this.f1667j;
                long j2 = iM2101L;
                ByteBuffer byteBufferM2107V = m2107V(j, j + j2);
                this.f1667j += j2;
                return ByteString.wrap(byteBufferM2107V);
            }
            byte[] bArr = new byte[iM2101L];
            long j3 = iM2101L;
            lyj0.m156330n(this.f1667j, bArr, 0L, j3);
            this.f1667j += j3;
            return ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: p */
        public double mo2049p() throws IOException {
            return Double.longBitsToDouble(m2100K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: q */
        public int mo2050q() throws IOException {
            return m2101L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: r */
        public int mo2051r() throws IOException {
            return m2099J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: s */
        public long mo2052s() throws IOException {
            return m2100K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: t */
        public float mo2053t() throws IOException {
            return Float.intBitsToFloat(m2099J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: u */
        public int mo2054u() throws IOException {
            return m2101L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: v */
        public long mo2055v() throws IOException {
            return m2102M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: w */
        public int mo2056w() throws IOException {
            return m2099J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: x */
        public long mo2057x() throws IOException {
            return m2100K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: y */
        public int mo2058y() throws IOException {
            return AbstractC0331g.m2028b(m2101L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0331g
        /* JADX INFO: renamed from: z */
        public long mo2059z() throws IOException {
            return AbstractC0331g.m2029c(m2102M());
        }
    }

    public AbstractC0331g() {
        this.f1642b = 100;
        this.f1643c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1645e = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m2028b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m2029c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC0331g m2030f(InputStream inputStream) {
        return m2031g(inputStream, 4096);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC0331g m2031g(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? m2033i(C0351s.f1739c) : new c(inputStream, i);
        }
        wg3.m206174a("bufferSize must be > 0");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC0331g m2032h(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m2035k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && d.m2092H()) {
            return new d(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return m2035k(bArr, 0, iRemaining, true);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC0331g m2033i(byte[] bArr) {
        return m2034j(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC0331g m2034j(byte[] bArr, int i, int i2) {
        return m2035k(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC0331g m2035k(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.mo2046m(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo2036A() throws IOException;

    /* JADX INFO: renamed from: B */
    public abstract String mo2037B() throws IOException;

    /* JADX INFO: renamed from: C */
    public abstract int mo2038C() throws IOException;

    /* JADX INFO: renamed from: D */
    public abstract int mo2039D() throws IOException;

    /* JADX INFO: renamed from: E */
    public abstract long mo2040E() throws IOException;

    /* JADX INFO: renamed from: F */
    public abstract boolean mo2041F(int i) throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract void mo2042a(int i) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: d */
    public abstract int mo2043d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2044e() throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract void mo2045l(int i);

    /* JADX INFO: renamed from: m */
    public abstract int mo2046m(int i) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: n */
    public abstract boolean mo2047n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract ByteString mo2048o() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract double mo2049p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract int mo2050q() throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract int mo2051r() throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract long mo2052s() throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract float mo2053t() throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract int mo2054u() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract long mo2055v() throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract int mo2056w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract long mo2057x() throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract int mo2058y() throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract long mo2059z() throws IOException;
}
