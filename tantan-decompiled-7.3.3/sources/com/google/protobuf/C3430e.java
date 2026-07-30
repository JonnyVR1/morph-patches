package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p153l.ng60;
import p153l.oc5;
import p153l.tg3;

/* JADX INFO: renamed from: com.google.protobuf.e */
/* JADX INFO: loaded from: classes7.dex */
public final class C3430e {

    /* JADX INFO: renamed from: a */
    public final byte[] f11610a;

    /* JADX INFO: renamed from: b */
    public final boolean f11611b;

    /* JADX INFO: renamed from: c */
    public int f11612c;

    /* JADX INFO: renamed from: d */
    public int f11613d;

    /* JADX INFO: renamed from: e */
    public int f11614e;

    /* JADX INFO: renamed from: f */
    public final InputStream f11615f;

    /* JADX INFO: renamed from: g */
    public int f11616g;

    /* JADX INFO: renamed from: h */
    public boolean f11617h;

    /* JADX INFO: renamed from: i */
    public int f11618i;

    /* JADX INFO: renamed from: j */
    public int f11619j;

    /* JADX INFO: renamed from: k */
    public int f11620k;

    /* JADX INFO: renamed from: l */
    public int f11621l;

    /* JADX INFO: renamed from: m */
    public int f11622m;

    public C3430e(byte[] bArr, int i, int i2, boolean z) {
        this.f11617h = false;
        this.f11619j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f11621l = 100;
        this.f11622m = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f11610a = bArr;
        this.f11612c = i2 + i;
        this.f11614e = i;
        this.f11618i = -i;
        this.f11615f = null;
        this.f11611b = z;
    }

    /* JADX INFO: renamed from: D */
    public static int m17152D(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: b */
    public static int m17153b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m17154c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static C3430e m17155f(InputStream inputStream) {
        return new C3430e(inputStream, 4096);
    }

    /* JADX INFO: renamed from: g */
    public static C3430e m17156g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return m17158i(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byte[] bArr = new byte[byteBufferDuplicate.remaining()];
        byteBufferDuplicate.get(bArr);
        return m17157h(bArr);
    }

    /* JADX INFO: renamed from: h */
    public static C3430e m17157h(byte[] bArr) {
        return m17158i(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: i */
    public static C3430e m17158i(byte[] bArr, int i, int i2) {
        return m17159j(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: j */
    public static C3430e m17159j(byte[] bArr, int i, int i2, boolean z) {
        C3430e c3430e = new C3430e(bArr, i, i2, z);
        try {
            c3430e.m17187l(i2);
            return c3430e;
        } catch (InvalidProtocolBufferException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public int m17160A() throws IOException {
        int i = this.f11614e;
        if (this.f11612c - i < 4) {
            m17175Q(4);
            i = this.f11614e;
        }
        byte[] bArr = this.f11610a;
        this.f11614e = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: B */
    public long m17161B() throws IOException {
        int i = this.f11614e;
        if (this.f11612c - i < 8) {
            m17175Q(8);
            i = this.f11614e;
        }
        byte[] bArr = this.f11610a;
        this.f11614e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: C */
    public int m17162C() throws IOException {
        int i;
        int i2 = this.f11614e;
        int i3 = this.f11612c;
        if (i3 != i2) {
            byte[] bArr = this.f11610a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f11614e = i4;
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
                this.f11614e = i5;
                return i;
            }
        }
        return (int) m17164F();
    }

    /* JADX INFO: renamed from: E */
    public long m17163E() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.f11614e;
        int i2 = this.f11612c;
        if (i2 != i) {
            byte[] bArr = this.f11610a;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f11614e = i3;
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
                this.f11614e = i4;
                return j;
            }
        }
        return m17164F();
    }

    /* JADX INFO: renamed from: F */
    public long m17164F() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM17200y = m17200y();
            j |= ((long) (bM17200y & 127)) << i;
            if ((bM17200y & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: G */
    public int m17165G() throws IOException {
        return m17160A();
    }

    /* JADX INFO: renamed from: H */
    public long m17166H() throws IOException {
        return m17161B();
    }

    /* JADX INFO: renamed from: I */
    public int m17167I() throws IOException {
        return m17153b(m17162C());
    }

    /* JADX INFO: renamed from: J */
    public long m17168J() throws IOException {
        return m17154c(m17163E());
    }

    /* JADX INFO: renamed from: K */
    public String m17169K() throws IOException {
        int iM17162C = m17162C();
        int i = this.f11612c;
        int i2 = this.f11614e;
        if (iM17162C <= i - i2 && iM17162C > 0) {
            String str = new String(this.f11610a, i2, iM17162C, C3437l.f11643a);
            this.f11614e += iM17162C;
            return str;
        }
        if (iM17162C == 0) {
            return "";
        }
        if (iM17162C > i) {
            return new String(m17201z(iM17162C), C3437l.f11643a);
        }
        m17175Q(iM17162C);
        String str2 = new String(this.f11610a, this.f11614e, iM17162C, C3437l.f11643a);
        this.f11614e += iM17162C;
        return str2;
    }

    /* JADX INFO: renamed from: L */
    public String m17170L() throws IOException {
        byte[] bArrM17201z;
        int iM17162C = m17162C();
        int i = this.f11614e;
        int i2 = this.f11612c;
        if (iM17162C <= i2 - i && iM17162C > 0) {
            bArrM17201z = this.f11610a;
            this.f11614e = i + iM17162C;
        } else {
            if (iM17162C == 0) {
                return "";
            }
            i = 0;
            if (iM17162C <= i2) {
                m17175Q(iM17162C);
                bArrM17201z = this.f11610a;
                this.f11614e = iM17162C;
            } else {
                bArrM17201z = m17201z(iM17162C);
            }
        }
        if (Utf8.m17107q(bArrM17201z, i, i + iM17162C)) {
            return new String(bArrM17201z, i, iM17162C, C3437l.f11643a);
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    /* JADX INFO: renamed from: M */
    public int m17171M() throws IOException {
        if (m17185e()) {
            this.f11616g = 0;
            return 0;
        }
        int iM17162C = m17162C();
        this.f11616g = iM17162C;
        if (WireFormat.m17127a(iM17162C) != 0) {
            return this.f11616g;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: renamed from: N */
    public int m17172N() throws IOException {
        return m17162C();
    }

    /* JADX INFO: renamed from: O */
    public long m17173O() throws IOException {
        return m17163E();
    }

    /* JADX INFO: renamed from: P */
    public final void m17174P() {
        int i = this.f11612c + this.f11613d;
        this.f11612c = i;
        int i2 = this.f11618i + i;
        int i3 = this.f11619j;
        if (i2 <= i3) {
            this.f11613d = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f11613d = i4;
        this.f11612c = i - i4;
    }

    /* JADX INFO: renamed from: Q */
    public final void m17175Q(int i) throws IOException {
        if (!m17182X(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m17176R(int i) throws IOException {
        int iM17128b = WireFormat.m17128b(i);
        if (iM17128b == 0) {
            m17180V();
            return true;
        }
        if (iM17128b == 1) {
            m17178T(8);
            return true;
        }
        if (iM17128b == 2) {
            m17178T(m17162C());
            return true;
        }
        if (iM17128b == 3) {
            m17177S();
            m17183a(WireFormat.m17129c(WireFormat.m17127a(i), 4));
            return true;
        }
        if (iM17128b == 4) {
            return false;
        }
        if (iM17128b != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        m17178T(4);
        return true;
    }

    /* JADX INFO: renamed from: S */
    public void m17177S() throws IOException {
        int iM17171M;
        do {
            iM17171M = m17171M();
            if (iM17171M == 0) {
                return;
            }
        } while (m17176R(iM17171M));
    }

    /* JADX INFO: renamed from: T */
    public void m17178T(int i) throws IOException {
        int i2 = this.f11612c;
        int i3 = this.f11614e;
        if (i > i2 - i3 || i < 0) {
            m17179U(i);
        } else {
            this.f11614e = i3 + i;
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m17179U(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f11618i;
        int i3 = this.f11614e;
        int i4 = i2 + i3 + i;
        int i5 = this.f11619j;
        if (i4 > i5) {
            m17178T((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f11612c;
        int i7 = i6 - i3;
        this.f11614e = i6;
        m17175Q(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.f11612c;
            if (i8 <= i9) {
                this.f11614e = i8;
                return;
            } else {
                i7 += i9;
                this.f11614e = i9;
                m17175Q(1);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m17180V() throws IOException {
        int i = this.f11612c;
        int i2 = this.f11614e;
        if (i - i2 >= 10) {
            byte[] bArr = this.f11610a;
            int i3 = 0;
            while (i3 < 10) {
                int i4 = i2 + 1;
                if (bArr[i2] >= 0) {
                    this.f11614e = i4;
                    return;
                } else {
                    i3++;
                    i2 = i4;
                }
            }
        }
        m17181W();
    }

    /* JADX INFO: renamed from: W */
    public final void m17181W() throws IOException {
        for (int i = 0; i < 10; i++) {
            if (m17200y() >= 0) {
                return;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: X */
    public final boolean m17182X(int i) throws IOException {
        int i2 = this.f11614e;
        int i3 = i2 + i;
        int i4 = this.f11612c;
        if (i3 <= i4) {
            oc5.m167139a("refillBuffer() called when ", i, " bytes were already available in buffer");
            return false;
        }
        if (this.f11618i + i2 + i <= this.f11619j && this.f11615f != null) {
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f11610a;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f11618i += i2;
                this.f11612c -= i2;
                this.f11614e = 0;
            }
            InputStream inputStream = this.f11615f;
            byte[] bArr2 = this.f11610a;
            int i5 = this.f11612c;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.f11610a.length) {
                oc5.m167139a("InputStream#read(byte[]) returned invalid result: ", i6, "\nThe InputStream implementation is buggy.");
                return false;
            }
            if (i6 > 0) {
                this.f11612c += i6;
                if ((this.f11618i + i) - this.f11622m > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                m17174P();
                if (this.f11612c >= i) {
                    return true;
                }
                return m17182X(i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m17183a(int i) throws InvalidProtocolBufferException {
        if (this.f11616g != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    /* JADX INFO: renamed from: d */
    public int m17184d() {
        int i = this.f11619j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f11618i + this.f11614e);
    }

    /* JADX INFO: renamed from: e */
    public boolean m17185e() throws IOException {
        return this.f11614e == this.f11612c && !m17182X(1);
    }

    /* JADX INFO: renamed from: k */
    public void m17186k(int i) {
        this.f11619j = i;
        m17174P();
    }

    /* JADX INFO: renamed from: l */
    public int m17187l(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = i + this.f11618i + this.f11614e;
        int i3 = this.f11619j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11619j = i2;
        m17174P();
        return i3;
    }

    /* JADX INFO: renamed from: m */
    public boolean m17188m() throws IOException {
        return m17163E() != 0;
    }

    /* JADX INFO: renamed from: n */
    public ByteString m17189n() throws IOException {
        int iM17162C = m17162C();
        int i = this.f11612c;
        int i2 = this.f11614e;
        if (iM17162C > i - i2 || iM17162C <= 0) {
            return iM17162C == 0 ? ByteString.EMPTY : ByteString.wrap(m17201z(iM17162C));
        }
        ByteString byteStringWrap = (this.f11611b && this.f11617h) ? ByteString.wrap(this.f11610a, i2, iM17162C) : ByteString.copyFrom(this.f11610a, i2, iM17162C);
        this.f11614e += iM17162C;
        return byteStringWrap;
    }

    /* JADX INFO: renamed from: o */
    public double m17190o() throws IOException {
        return Double.longBitsToDouble(m17161B());
    }

    /* JADX INFO: renamed from: p */
    public int m17191p() throws IOException {
        return m17162C();
    }

    /* JADX INFO: renamed from: q */
    public int m17192q() throws IOException {
        return m17160A();
    }

    /* JADX INFO: renamed from: r */
    public long m17193r() throws IOException {
        return m17161B();
    }

    /* JADX INFO: renamed from: s */
    public float m17194s() throws IOException {
        return Float.intBitsToFloat(m17160A());
    }

    /* JADX INFO: renamed from: t */
    public void m17195t(int i, InterfaceC3442q.a aVar, C3433h c3433h) throws IOException {
        int i2 = this.f11620k;
        if (i2 >= this.f11621l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.f11620k = i2 + 1;
        aVar.mergeFrom(this, c3433h);
        m17183a(WireFormat.m17129c(i, 4));
        this.f11620k--;
    }

    /* JADX INFO: renamed from: u */
    public int m17196u() throws IOException {
        return m17162C();
    }

    /* JADX INFO: renamed from: v */
    public long m17197v() throws IOException {
        return m17163E();
    }

    /* JADX INFO: renamed from: w */
    public <T extends InterfaceC3442q> T m17198w(ng60<T> ng60Var, C3433h c3433h) throws IOException {
        int iM17162C = m17162C();
        if (this.f11620k >= this.f11621l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM17187l = m17187l(iM17162C);
        this.f11620k++;
        T tMo17065c = ng60Var.mo17065c(this, c3433h);
        m17183a(0);
        this.f11620k--;
        m17186k(iM17187l);
        return tMo17065c;
    }

    /* JADX INFO: renamed from: x */
    public void m17199x(InterfaceC3442q.a aVar, C3433h c3433h) throws IOException {
        int iM17162C = m17162C();
        if (this.f11620k >= this.f11621l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM17187l = m17187l(iM17162C);
        this.f11620k++;
        aVar.mergeFrom(this, c3433h);
        m17183a(0);
        this.f11620k--;
        m17186k(iM17187l);
    }

    /* JADX INFO: renamed from: y */
    public byte m17200y() throws IOException {
        if (this.f11614e == this.f11612c) {
            m17175Q(1);
        }
        byte[] bArr = this.f11610a;
        int i = this.f11614e;
        this.f11614e = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: z */
    public final byte[] m17201z(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return C3437l.f11645c;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f11618i;
        int i3 = this.f11614e;
        int i4 = i2 + i3 + i;
        if (i4 > this.f11622m) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i5 = this.f11619j;
        if (i4 > i5) {
            m17178T((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        InputStream inputStream = this.f11615f;
        if (inputStream == null) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f11612c;
        int length = i6 - i3;
        this.f11618i = i2 + i6;
        this.f11614e = 0;
        this.f11612c = 0;
        int i7 = i - length;
        if (i7 < 4096 || i7 <= inputStream.available()) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f11610a, i3, bArr, 0, length);
            while (length < i) {
                int i8 = this.f11615f.read(bArr, length, i - length);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f11618i += i8;
                length += i8;
            }
            return bArr;
        }
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr2 = new byte[iMin];
            int i9 = 0;
            while (i9 < iMin) {
                int i10 = this.f11615f.read(bArr2, i9, iMin - i9);
                if (i10 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f11618i += i10;
                i9 += i10;
            }
            i7 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.f11610a, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public C3430e(InputStream inputStream, int i) {
        this.f11617h = false;
        this.f11619j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f11621l = 100;
        this.f11622m = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f11610a = new byte[i];
        this.f11614e = 0;
        this.f11618i = 0;
        this.f11615f = inputStream;
        this.f11611b = false;
    }
}
