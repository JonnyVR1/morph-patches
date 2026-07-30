package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p149l.fg3;
import p149l.ig3;
import p149l.ipj0;
import p149l.ob5;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0330g {

    /* JADX INFO: renamed from: a */
    public int f1641a;

    /* JADX INFO: renamed from: b */
    public int f1642b;

    /* JADX INFO: renamed from: c */
    public int f1643c;

    /* JADX INFO: renamed from: d */
    public C0332h f1644d;

    /* JADX INFO: renamed from: e */
    public boolean f1645e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    public static final class b extends AbstractC0330g {

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

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: A */
        public String mo2035A() throws IOException {
            int iM2063K = m2063K();
            if (iM2063K > 0) {
                int i = this.f1648h;
                int i2 = this.f1650j;
                if (iM2063K <= i - i2) {
                    String str = new String(this.f1646f, i2, iM2063K, C0350s.f1737a);
                    this.f1650j += iM2063K;
                    return str;
                }
            }
            if (iM2063K == 0) {
                return "";
            }
            if (iM2063K < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: B */
        public String mo2036B() throws IOException {
            int iM2063K = m2063K();
            if (iM2063K > 0) {
                int i = this.f1648h;
                int i2 = this.f1650j;
                if (iM2063K <= i - i2) {
                    String strM1692h = Utf8.m1692h(this.f1646f, i2, iM2063K);
                    this.f1650j += iM2063K;
                    return strM1692h;
                }
            }
            if (iM2063K == 0) {
                return "";
            }
            if (iM2063K <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: C */
        public int mo2037C() throws IOException {
            if (mo2043e()) {
                this.f1652l = 0;
                return 0;
            }
            int iM2063K = m2063K();
            this.f1652l = iM2063K;
            if (WireFormat.m1746a(iM2063K) != 0) {
                return this.f1652l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: D */
        public int mo2038D() throws IOException {
            return m2063K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: E */
        public long mo2039E() throws IOException {
            return m2064L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: F */
        public boolean mo2040F(int i) throws IOException {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                m2069Q();
                return true;
            }
            if (iM1747b == 1) {
                m2068P(8);
                return true;
            }
            if (iM1747b == 2) {
                m2068P(m2063K());
                return true;
            }
            if (iM1747b == 3) {
                m2067O();
                mo2041a(WireFormat.m1748c(WireFormat.m1746a(i), 4));
                return true;
            }
            if (iM1747b == 4) {
                return false;
            }
            if (iM1747b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m2068P(4);
            return true;
        }

        /* JADX INFO: renamed from: G */
        public byte m2059G() throws IOException {
            int i = this.f1650j;
            if (i == this.f1648h) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1646f;
            this.f1650j = i + 1;
            return bArr[i];
        }

        /* JADX INFO: renamed from: H */
        public byte[] m2060H(int i) throws IOException {
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
                return C0350s.f1739c;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* JADX INFO: renamed from: I */
        public int m2061I() throws IOException {
            int i = this.f1650j;
            if (this.f1648h - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1646f;
            this.f1650j = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        /* JADX INFO: renamed from: J */
        public long m2062J() throws IOException {
            int i = this.f1650j;
            if (this.f1648h - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f1646f;
            this.f1650j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: K */
        public int m2063K() throws IOException {
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
            return (int) m2065M();
        }

        /* JADX INFO: renamed from: L */
        public long m2064L() throws IOException {
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
            return m2065M();
        }

        /* JADX INFO: renamed from: M */
        public long m2065M() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bM2059G = m2059G();
                j |= ((long) (bM2059G & 127)) << i;
                if ((bM2059G & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: N */
        public final void m2066N() {
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
        public void m2067O() throws IOException {
            int iMo2037C;
            do {
                iMo2037C = mo2037C();
                if (iMo2037C == 0) {
                    return;
                }
            } while (mo2040F(iMo2037C));
        }

        /* JADX INFO: renamed from: P */
        public void m2068P(int i) throws IOException {
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
        public final void m2069Q() throws IOException {
            if (this.f1648h - this.f1650j >= 10) {
                m2070R();
            } else {
                m2071S();
            }
        }

        /* JADX INFO: renamed from: R */
        public final void m2070R() throws IOException {
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
        public final void m2071S() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m2059G() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: a */
        public void mo2041a(int i) throws InvalidProtocolBufferException {
            if (this.f1652l != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: d */
        public int mo2042d() {
            return this.f1650j - this.f1651k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: e */
        public boolean mo2043e() throws IOException {
            return this.f1650j == this.f1648h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: l */
        public void mo2044l(int i) {
            this.f1654n = i;
            m2066N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: m */
        public int mo2045m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iMo2042d = i + mo2042d();
            int i2 = this.f1654n;
            if (iMo2042d > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1654n = iMo2042d;
            m2066N();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: n */
        public boolean mo2046n() throws IOException {
            return m2064L() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: o */
        public ByteString mo2047o() throws IOException {
            int iM2063K = m2063K();
            if (iM2063K > 0) {
                int i = this.f1648h;
                int i2 = this.f1650j;
                if (iM2063K <= i - i2) {
                    ByteString byteStringWrap = (this.f1647g && this.f1653m) ? ByteString.wrap(this.f1646f, i2, iM2063K) : ByteString.copyFrom(this.f1646f, i2, iM2063K);
                    this.f1650j += iM2063K;
                    return byteStringWrap;
                }
            }
            return iM2063K == 0 ? ByteString.EMPTY : ByteString.wrap(m2060H(iM2063K));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: p */
        public double mo2048p() throws IOException {
            return Double.longBitsToDouble(m2062J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: q */
        public int mo2049q() throws IOException {
            return m2063K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: r */
        public int mo2050r() throws IOException {
            return m2061I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: s */
        public long mo2051s() throws IOException {
            return m2062J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: t */
        public float mo2052t() throws IOException {
            return Float.intBitsToFloat(m2061I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: u */
        public int mo2053u() throws IOException {
            return m2063K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: v */
        public long mo2054v() throws IOException {
            return m2064L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: w */
        public int mo2055w() throws IOException {
            return m2061I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: x */
        public long mo2056x() throws IOException {
            return m2062J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: y */
        public int mo2057y() throws IOException {
            return AbstractC0330g.m2027b(m2063K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: z */
        public long mo2058z() throws IOException {
            return AbstractC0330g.m2028c(m2064L());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    public static final class c extends AbstractC0330g {

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
            C0350s.m2340b(inputStream, "input");
            this.f1655f = inputStream;
            this.f1656g = new byte[i];
            this.f1657h = 0;
            this.f1659j = 0;
            this.f1661l = 0;
        }

        /* JADX INFO: renamed from: Q */
        private void m2072Q() {
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
        private void m2073V() throws IOException {
            if (this.f1657h - this.f1659j >= 10) {
                m2074W();
            } else {
                m2075X();
            }
        }

        /* JADX INFO: renamed from: W */
        private void m2074W() throws IOException {
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
        private void m2075X() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m2077H() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: A */
        public String mo2035A() throws IOException {
            int iM2083N = m2083N();
            if (iM2083N > 0) {
                int i = this.f1657h;
                int i2 = this.f1659j;
                if (iM2083N <= i - i2) {
                    String str = new String(this.f1656g, i2, iM2083N, C0350s.f1737a);
                    this.f1659j += iM2083N;
                    return str;
                }
            }
            if (iM2083N == 0) {
                return "";
            }
            if (iM2083N > this.f1657h) {
                return new String(m2078I(iM2083N, false), C0350s.f1737a);
            }
            m2086R(iM2083N);
            String str2 = new String(this.f1656g, this.f1659j, iM2083N, C0350s.f1737a);
            this.f1659j += iM2083N;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: B */
        public String mo2036B() throws IOException {
            byte[] bArrM2078I;
            int iM2083N = m2083N();
            int i = this.f1659j;
            int i2 = this.f1657h;
            if (iM2083N <= i2 - i && iM2083N > 0) {
                bArrM2078I = this.f1656g;
                this.f1659j = i + iM2083N;
            } else {
                if (iM2083N == 0) {
                    return "";
                }
                i = 0;
                if (iM2083N <= i2) {
                    m2086R(iM2083N);
                    bArrM2078I = this.f1656g;
                    this.f1659j = iM2083N;
                } else {
                    bArrM2078I = m2078I(iM2083N, false);
                }
            }
            return Utf8.m1692h(bArrM2078I, i, iM2083N);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: C */
        public int mo2037C() throws IOException {
            if (mo2043e()) {
                this.f1660k = 0;
                return 0;
            }
            int iM2083N = m2083N();
            this.f1660k = iM2083N;
            if (WireFormat.m1746a(iM2083N) != 0) {
                return this.f1660k;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: D */
        public int mo2038D() throws IOException {
            return m2083N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: E */
        public long mo2039E() throws IOException {
            return m2084O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: F */
        public boolean mo2040F(int i) throws IOException {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                m2073V();
                return true;
            }
            if (iM1747b == 1) {
                m2088T(8);
                return true;
            }
            if (iM1747b == 2) {
                m2088T(m2083N());
                return true;
            }
            if (iM1747b == 3) {
                m2087S();
                mo2041a(WireFormat.m1748c(WireFormat.m1746a(i), 4));
                return true;
            }
            if (iM1747b == 4) {
                return false;
            }
            if (iM1747b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m2088T(4);
            return true;
        }

        /* JADX INFO: renamed from: G */
        public final ByteString m2076G(int i) throws IOException {
            byte[] bArrM2079J = m2079J(i);
            if (bArrM2079J != null) {
                return ByteString.copyFrom(bArrM2079J);
            }
            int i2 = this.f1659j;
            int i3 = this.f1657h;
            int length = i3 - i2;
            this.f1661l += i3;
            this.f1659j = 0;
            this.f1657h = 0;
            List<byte[]> listM2080K = m2080K(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f1656g, i2, bArr, 0, length);
            for (byte[] bArr2 : listM2080K) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        /* JADX INFO: renamed from: H */
        public byte m2077H() throws IOException {
            if (this.f1659j == this.f1657h) {
                m2086R(1);
            }
            byte[] bArr = this.f1656g;
            int i = this.f1659j;
            this.f1659j = i + 1;
            return bArr[i];
        }

        /* JADX INFO: renamed from: I */
        public final byte[] m2078I(int i, boolean z) throws IOException {
            byte[] bArrM2079J = m2079J(i);
            if (bArrM2079J != null) {
                return z ? (byte[]) bArrM2079J.clone() : bArrM2079J;
            }
            int i2 = this.f1659j;
            int i3 = this.f1657h;
            int length = i3 - i2;
            this.f1661l += i3;
            this.f1659j = 0;
            this.f1657h = 0;
            List<byte[]> listM2080K = m2080K(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f1656g, i2, bArr, 0, length);
            for (byte[] bArr2 : listM2080K) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: J */
        public final byte[] m2079J(int i) throws IOException {
            if (i == 0) {
                return C0350s.f1739c;
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
                m2088T((i5 - i2) - i3);
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
        public final List<byte[]> m2080K(int i) throws IOException {
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
        public int m2081L() throws IOException {
            int i = this.f1659j;
            if (this.f1657h - i < 4) {
                m2086R(4);
                i = this.f1659j;
            }
            byte[] bArr = this.f1656g;
            this.f1659j = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        /* JADX INFO: renamed from: M */
        public long m2082M() throws IOException {
            int i = this.f1659j;
            if (this.f1657h - i < 8) {
                m2086R(8);
                i = this.f1659j;
            }
            byte[] bArr = this.f1656g;
            this.f1659j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: N */
        public int m2083N() throws IOException {
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
            return (int) m2085P();
        }

        /* JADX INFO: renamed from: O */
        public long m2084O() throws IOException {
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
            return m2085P();
        }

        /* JADX INFO: renamed from: P */
        public long m2085P() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bM2077H = m2077H();
                j |= ((long) (bM2077H & 127)) << i;
                if ((bM2077H & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: R */
        public final void m2086R(int i) throws IOException {
            if (m2090Y(i)) {
                return;
            }
            if (i <= (this.f1643c - this.f1661l) - this.f1659j) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        /* JADX INFO: renamed from: S */
        public void m2087S() throws IOException {
            int iMo2037C;
            do {
                iMo2037C = mo2037C();
                if (iMo2037C == 0) {
                    return;
                }
            } while (mo2040F(iMo2037C));
        }

        /* JADX INFO: renamed from: T */
        public void m2088T(int i) throws IOException {
            int i2 = this.f1657h;
            int i3 = this.f1659j;
            if (i > i2 - i3 || i < 0) {
                m2089U(i);
            } else {
                this.f1659j = i3 + i;
            }
        }

        /* JADX INFO: renamed from: U */
        public final void m2089U(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.f1661l;
            int i3 = this.f1659j;
            int i4 = i2 + i3 + i;
            int i5 = this.f1662m;
            if (i4 > i5) {
                m2088T((i5 - i2) - i3);
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
                    m2072Q();
                    throw th;
                }
            }
            this.f1661l += i6;
            m2072Q();
            if (i6 >= i) {
                return;
            }
            int i7 = this.f1657h;
            int i8 = i7 - this.f1659j;
            this.f1659j = i7;
            m2086R(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.f1657h;
                if (i9 <= i10) {
                    this.f1659j = i9;
                    return;
                } else {
                    i8 += i10;
                    this.f1659j = i10;
                    m2086R(1);
                }
            }
        }

        /* JADX INFO: renamed from: Y */
        public final boolean m2090Y(int i) throws IOException {
            int i2 = this.f1659j;
            int i3 = i2 + i;
            int i4 = this.f1657h;
            if (i3 <= i4) {
                ob5.m163410a("refillBuffer() called when ", i, " bytes were already available in buffer");
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
            m2072Q();
            if (this.f1657h >= i) {
                return true;
            }
            return m2090Y(i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: a */
        public void mo2041a(int i) throws InvalidProtocolBufferException {
            if (this.f1660k != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: d */
        public int mo2042d() {
            return this.f1661l + this.f1659j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: e */
        public boolean mo2043e() throws IOException {
            return this.f1659j == this.f1657h && !m2090Y(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: l */
        public void mo2044l(int i) {
            this.f1662m = i;
            m2072Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: m */
        public int mo2045m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.f1661l + this.f1659j;
            int i3 = this.f1662m;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1662m = i2;
            m2072Q();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: n */
        public boolean mo2046n() throws IOException {
            return m2084O() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: o */
        public ByteString mo2047o() throws IOException {
            int iM2083N = m2083N();
            int i = this.f1657h;
            int i2 = this.f1659j;
            if (iM2083N > i - i2 || iM2083N <= 0) {
                return iM2083N == 0 ? ByteString.EMPTY : m2076G(iM2083N);
            }
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.f1656g, i2, iM2083N);
            this.f1659j += iM2083N;
            return byteStringCopyFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: p */
        public double mo2048p() throws IOException {
            return Double.longBitsToDouble(m2082M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: q */
        public int mo2049q() throws IOException {
            return m2083N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: r */
        public int mo2050r() throws IOException {
            return m2081L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: s */
        public long mo2051s() throws IOException {
            return m2082M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: t */
        public float mo2052t() throws IOException {
            return Float.intBitsToFloat(m2081L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: u */
        public int mo2053u() throws IOException {
            return m2083N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: v */
        public long mo2054v() throws IOException {
            return m2084O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: w */
        public int mo2055w() throws IOException {
            return m2081L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: x */
        public long mo2056x() throws IOException {
            return m2082M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: y */
        public int mo2057y() throws IOException {
            return AbstractC0330g.m2027b(m2083N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: z */
        public long mo2058z() throws IOException {
            return AbstractC0330g.m2028c(m2084O());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$d */
    public static final class d extends AbstractC0330g {

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
            long jM137520i = ipj0.m137520i(byteBuffer);
            this.f1665h = jM137520i;
            this.f1666i = ((long) byteBuffer.limit()) + jM137520i;
            long jPosition = jM137520i + ((long) byteBuffer.position());
            this.f1667j = jPosition;
            this.f1668k = jPosition;
            this.f1664g = z;
        }

        /* JADX INFO: renamed from: H */
        public static boolean m2091H() {
            return ipj0.m137497H();
        }

        /* JADX INFO: renamed from: O */
        private void m2092O() {
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
        private void m2093S() throws IOException {
            if (m2103P() >= 10) {
                m2094T();
            } else {
                m2095U();
            }
        }

        /* JADX INFO: renamed from: T */
        private void m2094T() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.f1667j;
                this.f1667j = 1 + j;
                if (ipj0.m137532u(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: U */
        private void m2095U() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m2097I() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: A */
        public String mo2035A() throws IOException {
            int iM2100L = m2100L();
            if (iM2100L <= 0 || iM2100L > m2103P()) {
                if (iM2100L == 0) {
                    return "";
                }
                if (iM2100L < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[iM2100L];
            long j = iM2100L;
            ipj0.m137525n(this.f1667j, bArr, 0L, j);
            String str = new String(bArr, C0350s.f1737a);
            this.f1667j += j;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: B */
        public String mo2036B() throws IOException {
            int iM2100L = m2100L();
            if (iM2100L > 0 && iM2100L <= m2103P()) {
                String strM1691g = Utf8.m1691g(this.f1663f, m2096G(this.f1667j), iM2100L);
                this.f1667j += (long) iM2100L;
                return strM1691g;
            }
            if (iM2100L == 0) {
                return "";
            }
            if (iM2100L <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: C */
        public int mo2037C() throws IOException {
            if (mo2043e()) {
                this.f1670m = 0;
                return 0;
            }
            int iM2100L = m2100L();
            this.f1670m = iM2100L;
            if (WireFormat.m1746a(iM2100L) != 0) {
                return this.f1670m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: D */
        public int mo2038D() throws IOException {
            return m2100L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: E */
        public long mo2039E() throws IOException {
            return m2101M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: F */
        public boolean mo2040F(int i) throws IOException {
            int iM1747b = WireFormat.m1747b(i);
            if (iM1747b == 0) {
                m2093S();
                return true;
            }
            if (iM1747b == 1) {
                m2105R(8);
                return true;
            }
            if (iM1747b == 2) {
                m2105R(m2100L());
                return true;
            }
            if (iM1747b == 3) {
                m2104Q();
                mo2041a(WireFormat.m1748c(WireFormat.m1746a(i), 4));
                return true;
            }
            if (iM1747b == 4) {
                return false;
            }
            if (iM1747b != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            m2105R(4);
            return true;
        }

        /* JADX INFO: renamed from: G */
        public final int m2096G(long j) {
            return (int) (j - this.f1665h);
        }

        /* JADX INFO: renamed from: I */
        public byte m2097I() throws IOException {
            long j = this.f1667j;
            if (j == this.f1666i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1667j = 1 + j;
            return ipj0.m137532u(j);
        }

        /* JADX INFO: renamed from: J */
        public int m2098J() throws IOException {
            long j = this.f1667j;
            if (this.f1666i - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1667j = 4 + j;
            return (ipj0.m137532u(j) & 255) | ((ipj0.m137532u(1 + j) & 255) << 8) | ((ipj0.m137532u(2 + j) & 255) << 16) | ((ipj0.m137532u(j + 3) & 255) << 24);
        }

        /* JADX INFO: renamed from: K */
        public long m2099K() throws IOException {
            long j = this.f1667j;
            if (this.f1666i - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1667j = 8 + j;
            return ((((long) ipj0.m137532u(j + 7)) & 255) << 56) | (((long) ipj0.m137532u(j)) & 255) | ((((long) ipj0.m137532u(1 + j)) & 255) << 8) | ((((long) ipj0.m137532u(2 + j)) & 255) << 16) | ((((long) ipj0.m137532u(3 + j)) & 255) << 24) | ((((long) ipj0.m137532u(4 + j)) & 255) << 32) | ((((long) ipj0.m137532u(5 + j)) & 255) << 40) | ((((long) ipj0.m137532u(6 + j)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (p149l.ipj0.m137532u(r3) < 0) goto L34;
         */
        /* JADX INFO: renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int m2100L() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.f1667j
                long r2 = r9.f1666i
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = p149l.ipj0.m137532u(r0)
                if (r4 < 0) goto L16
                r9.f1667j = r2
                return r4
            L16:
                long r5 = r9.f1666i
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = p149l.ipj0.m137532u(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = p149l.ipj0.m137532u(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = p149l.ipj0.m137532u(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = p149l.ipj0.m137532u(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = p149l.ipj0.m137532u(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = p149l.ipj0.m137532u(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = p149l.ipj0.m137532u(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = p149l.ipj0.m137532u(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = p149l.ipj0.m137532u(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.m2102N()
                int r9 = (int) r0
                return r9
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f1667j = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC0330g.d.m2100L():int");
        }

        /* JADX INFO: renamed from: M */
        public long m2101M() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f1667j;
            if (this.f1666i != j4) {
                long j5 = 1 + j4;
                byte bM137532u = ipj0.m137532u(j4);
                if (bM137532u >= 0) {
                    this.f1667j = j5;
                    return bM137532u;
                }
                if (this.f1666i - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iM137532u = (ipj0.m137532u(j5) << 7) ^ bM137532u;
                    if (iM137532u >= 0) {
                        long j7 = 3 + j4;
                        int iM137532u2 = iM137532u ^ (ipj0.m137532u(j6) << 14);
                        if (iM137532u2 >= 0) {
                            j = iM137532u2 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int iM137532u3 = iM137532u2 ^ (ipj0.m137532u(j7) << 21);
                            if (iM137532u3 < 0) {
                                i = (-2080896) ^ iM137532u3;
                            } else {
                                long j8 = 5 + j4;
                                long jM137532u = ((long) iM137532u3) ^ (((long) ipj0.m137532u(j6)) << 28);
                                if (jM137532u >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long jM137532u2 = jM137532u ^ (((long) ipj0.m137532u(j8)) << 35);
                                    if (jM137532u2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        jM137532u = jM137532u2 ^ (((long) ipj0.m137532u(j9)) << 42);
                                        if (jM137532u >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            jM137532u2 = jM137532u ^ (((long) ipj0.m137532u(j8)) << 49);
                                            if (jM137532u2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long jM137532u3 = (jM137532u2 ^ (((long) ipj0.m137532u(j9)) << 56)) ^ 71499008037633920L;
                                                if (jM137532u3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (ipj0.m137532u(j10) >= 0) {
                                                        j6 = j11;
                                                        j = jM137532u3;
                                                    }
                                                } else {
                                                    j = jM137532u3;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jM137532u2;
                                    j6 = j9;
                                }
                                j = j3 ^ jM137532u;
                                j6 = j8;
                            }
                        }
                        this.f1667j = j6;
                        return j;
                    }
                    i = iM137532u ^ (-128);
                    j = i;
                    this.f1667j = j6;
                    return j;
                }
            }
            return m2102N();
        }

        /* JADX INFO: renamed from: N */
        public long m2102N() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bM2097I = m2097I();
                j |= ((long) (bM2097I & 127)) << i;
                if ((bM2097I & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX INFO: renamed from: P */
        public final int m2103P() {
            return (int) (this.f1666i - this.f1667j);
        }

        /* JADX INFO: renamed from: Q */
        public void m2104Q() throws IOException {
            int iMo2037C;
            do {
                iMo2037C = mo2037C();
                if (iMo2037C == 0) {
                    return;
                }
            } while (mo2040F(iMo2037C));
        }

        /* JADX INFO: renamed from: R */
        public void m2105R(int i) throws IOException {
            if (i >= 0 && i <= m2103P()) {
                this.f1667j += (long) i;
            } else {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* JADX INFO: renamed from: V */
        public final ByteBuffer m2106V(long j, long j2) throws IOException {
            int iPosition = this.f1663f.position();
            int iLimit = this.f1663f.limit();
            try {
                try {
                    this.f1663f.position(m2096G(j));
                    this.f1663f.limit(m2096G(j2));
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

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: a */
        public void mo2041a(int i) throws InvalidProtocolBufferException {
            if (this.f1670m != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: d */
        public int mo2042d() {
            return (int) (this.f1667j - this.f1668k);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: e */
        public boolean mo2043e() throws IOException {
            return this.f1667j == this.f1666i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: l */
        public void mo2044l(int i) {
            this.f1672o = i;
            m2092O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: m */
        public int mo2045m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iMo2042d = i + mo2042d();
            int i2 = this.f1672o;
            if (iMo2042d > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f1672o = iMo2042d;
            m2092O();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: n */
        public boolean mo2046n() throws IOException {
            return m2101M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: o */
        public ByteString mo2047o() throws IOException {
            int iM2100L = m2100L();
            if (iM2100L <= 0 || iM2100L > m2103P()) {
                if (iM2100L == 0) {
                    return ByteString.EMPTY;
                }
                if (iM2100L < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.f1664g && this.f1671n) {
                long j = this.f1667j;
                long j2 = iM2100L;
                ByteBuffer byteBufferM2106V = m2106V(j, j + j2);
                this.f1667j += j2;
                return ByteString.wrap(byteBufferM2106V);
            }
            byte[] bArr = new byte[iM2100L];
            long j3 = iM2100L;
            ipj0.m137525n(this.f1667j, bArr, 0L, j3);
            this.f1667j += j3;
            return ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: p */
        public double mo2048p() throws IOException {
            return Double.longBitsToDouble(m2099K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: q */
        public int mo2049q() throws IOException {
            return m2100L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: r */
        public int mo2050r() throws IOException {
            return m2098J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: s */
        public long mo2051s() throws IOException {
            return m2099K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: t */
        public float mo2052t() throws IOException {
            return Float.intBitsToFloat(m2098J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: u */
        public int mo2053u() throws IOException {
            return m2100L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: v */
        public long mo2054v() throws IOException {
            return m2101M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: w */
        public int mo2055w() throws IOException {
            return m2098J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: x */
        public long mo2056x() throws IOException {
            return m2099K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: y */
        public int mo2057y() throws IOException {
            return AbstractC0330g.m2027b(m2100L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0330g
        /* JADX INFO: renamed from: z */
        public long mo2058z() throws IOException {
            return AbstractC0330g.m2028c(m2101M());
        }
    }

    public AbstractC0330g() {
        this.f1642b = 100;
        this.f1643c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1645e = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m2027b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m2028c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC0330g m2029f(InputStream inputStream) {
        return m2030g(inputStream, 4096);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC0330g m2030g(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? m2032i(C0350s.f1739c) : new c(inputStream, i);
        }
        ig3.m135964a("bufferSize must be > 0");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC0330g m2031h(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m2034k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && d.m2091H()) {
            return new d(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return m2034k(bArr, 0, iRemaining, true);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC0330g m2032i(byte[] bArr) {
        return m2033j(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC0330g m2033j(byte[] bArr, int i, int i2) {
        return m2034k(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC0330g m2034k(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.mo2045m(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            fg3.m121203a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo2035A() throws IOException;

    /* JADX INFO: renamed from: B */
    public abstract String mo2036B() throws IOException;

    /* JADX INFO: renamed from: C */
    public abstract int mo2037C() throws IOException;

    /* JADX INFO: renamed from: D */
    public abstract int mo2038D() throws IOException;

    /* JADX INFO: renamed from: E */
    public abstract long mo2039E() throws IOException;

    /* JADX INFO: renamed from: F */
    public abstract boolean mo2040F(int i) throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract void mo2041a(int i) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: d */
    public abstract int mo2042d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2043e() throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract void mo2044l(int i);

    /* JADX INFO: renamed from: m */
    public abstract int mo2045m(int i) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: n */
    public abstract boolean mo2046n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract ByteString mo2047o() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract double mo2048p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract int mo2049q() throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract int mo2050r() throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract long mo2051s() throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract float mo2052t() throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract int mo2053u() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract long mo2054v() throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract int mo2055w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract long mo2056x() throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract int mo2057y() throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract long mo2058z() throws IOException;
}
