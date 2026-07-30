package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p149l.fg3;
import p149l.i860;
import p149l.ob5;

/* JADX INFO: renamed from: com.google.protobuf.e */
/* JADX INFO: loaded from: classes7.dex */
public final class C3407e {

    /* JADX INFO: renamed from: a */
    public final byte[] f11573a;

    /* JADX INFO: renamed from: b */
    public final boolean f11574b;

    /* JADX INFO: renamed from: c */
    public int f11575c;

    /* JADX INFO: renamed from: d */
    public int f11576d;

    /* JADX INFO: renamed from: e */
    public int f11577e;

    /* JADX INFO: renamed from: f */
    public final InputStream f11578f;

    /* JADX INFO: renamed from: g */
    public int f11579g;

    /* JADX INFO: renamed from: h */
    public boolean f11580h;

    /* JADX INFO: renamed from: i */
    public int f11581i;

    /* JADX INFO: renamed from: j */
    public int f11582j;

    /* JADX INFO: renamed from: k */
    public int f11583k;

    /* JADX INFO: renamed from: l */
    public int f11584l;

    /* JADX INFO: renamed from: m */
    public int f11585m;

    public C3407e(byte[] bArr, int i, int i2, boolean z) {
        this.f11580h = false;
        this.f11582j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f11584l = 100;
        this.f11585m = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f11573a = bArr;
        this.f11575c = i2 + i;
        this.f11577e = i;
        this.f11581i = -i;
        this.f11578f = null;
        this.f11574b = z;
    }

    /* JADX INFO: renamed from: D */
    public static int m17097D(int i, InputStream inputStream) throws IOException {
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
    public static int m17098b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m17099c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static C3407e m17100f(InputStream inputStream) {
        return new C3407e(inputStream, 4096);
    }

    /* JADX INFO: renamed from: g */
    public static C3407e m17101g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return m17103i(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byte[] bArr = new byte[byteBufferDuplicate.remaining()];
        byteBufferDuplicate.get(bArr);
        return m17102h(bArr);
    }

    /* JADX INFO: renamed from: h */
    public static C3407e m17102h(byte[] bArr) {
        return m17103i(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: i */
    public static C3407e m17103i(byte[] bArr, int i, int i2) {
        return m17104j(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: j */
    public static C3407e m17104j(byte[] bArr, int i, int i2, boolean z) {
        C3407e c3407e = new C3407e(bArr, i, i2, z);
        try {
            c3407e.m17132l(i2);
            return c3407e;
        } catch (InvalidProtocolBufferException e) {
            fg3.m121203a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public int m17105A() throws IOException {
        int i = this.f11577e;
        if (this.f11575c - i < 4) {
            m17120Q(4);
            i = this.f11577e;
        }
        byte[] bArr = this.f11573a;
        this.f11577e = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: B */
    public long m17106B() throws IOException {
        int i = this.f11577e;
        if (this.f11575c - i < 8) {
            m17120Q(8);
            i = this.f11577e;
        }
        byte[] bArr = this.f11573a;
        this.f11577e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: C */
    public int m17107C() throws IOException {
        int i;
        int i2 = this.f11577e;
        int i3 = this.f11575c;
        if (i3 != i2) {
            byte[] bArr = this.f11573a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f11577e = i4;
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
                this.f11577e = i5;
                return i;
            }
        }
        return (int) m17109F();
    }

    /* JADX INFO: renamed from: E */
    public long m17108E() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.f11577e;
        int i2 = this.f11575c;
        if (i2 != i) {
            byte[] bArr = this.f11573a;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f11577e = i3;
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
                this.f11577e = i4;
                return j;
            }
        }
        return m17109F();
    }

    /* JADX INFO: renamed from: F */
    public long m17109F() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM17145y = m17145y();
            j |= ((long) (bM17145y & 127)) << i;
            if ((bM17145y & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: G */
    public int m17110G() throws IOException {
        return m17105A();
    }

    /* JADX INFO: renamed from: H */
    public long m17111H() throws IOException {
        return m17106B();
    }

    /* JADX INFO: renamed from: I */
    public int m17112I() throws IOException {
        return m17098b(m17107C());
    }

    /* JADX INFO: renamed from: J */
    public long m17113J() throws IOException {
        return m17099c(m17108E());
    }

    /* JADX INFO: renamed from: K */
    public String m17114K() throws IOException {
        int iM17107C = m17107C();
        int i = this.f11575c;
        int i2 = this.f11577e;
        if (iM17107C <= i - i2 && iM17107C > 0) {
            String str = new String(this.f11573a, i2, iM17107C, C3414l.f11606a);
            this.f11577e += iM17107C;
            return str;
        }
        if (iM17107C == 0) {
            return "";
        }
        if (iM17107C > i) {
            return new String(m17146z(iM17107C), C3414l.f11606a);
        }
        m17120Q(iM17107C);
        String str2 = new String(this.f11573a, this.f11577e, iM17107C, C3414l.f11606a);
        this.f11577e += iM17107C;
        return str2;
    }

    /* JADX INFO: renamed from: L */
    public String m17115L() throws IOException {
        byte[] bArrM17146z;
        int iM17107C = m17107C();
        int i = this.f11577e;
        int i2 = this.f11575c;
        if (iM17107C <= i2 - i && iM17107C > 0) {
            bArrM17146z = this.f11573a;
            this.f11577e = i + iM17107C;
        } else {
            if (iM17107C == 0) {
                return "";
            }
            i = 0;
            if (iM17107C <= i2) {
                m17120Q(iM17107C);
                bArrM17146z = this.f11573a;
                this.f11577e = iM17107C;
            } else {
                bArrM17146z = m17146z(iM17107C);
            }
        }
        if (Utf8.m17052q(bArrM17146z, i, i + iM17107C)) {
            return new String(bArrM17146z, i, iM17107C, C3414l.f11606a);
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    /* JADX INFO: renamed from: M */
    public int m17116M() throws IOException {
        if (m17130e()) {
            this.f11579g = 0;
            return 0;
        }
        int iM17107C = m17107C();
        this.f11579g = iM17107C;
        if (WireFormat.m17072a(iM17107C) != 0) {
            return this.f11579g;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: renamed from: N */
    public int m17117N() throws IOException {
        return m17107C();
    }

    /* JADX INFO: renamed from: O */
    public long m17118O() throws IOException {
        return m17108E();
    }

    /* JADX INFO: renamed from: P */
    public final void m17119P() {
        int i = this.f11575c + this.f11576d;
        this.f11575c = i;
        int i2 = this.f11581i + i;
        int i3 = this.f11582j;
        if (i2 <= i3) {
            this.f11576d = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f11576d = i4;
        this.f11575c = i - i4;
    }

    /* JADX INFO: renamed from: Q */
    public final void m17120Q(int i) throws IOException {
        if (!m17127X(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m17121R(int i) throws IOException {
        int iM17073b = WireFormat.m17073b(i);
        if (iM17073b == 0) {
            m17125V();
            return true;
        }
        if (iM17073b == 1) {
            m17123T(8);
            return true;
        }
        if (iM17073b == 2) {
            m17123T(m17107C());
            return true;
        }
        if (iM17073b == 3) {
            m17122S();
            m17128a(WireFormat.m17074c(WireFormat.m17072a(i), 4));
            return true;
        }
        if (iM17073b == 4) {
            return false;
        }
        if (iM17073b != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        m17123T(4);
        return true;
    }

    /* JADX INFO: renamed from: S */
    public void m17122S() throws IOException {
        int iM17116M;
        do {
            iM17116M = m17116M();
            if (iM17116M == 0) {
                return;
            }
        } while (m17121R(iM17116M));
    }

    /* JADX INFO: renamed from: T */
    public void m17123T(int i) throws IOException {
        int i2 = this.f11575c;
        int i3 = this.f11577e;
        if (i > i2 - i3 || i < 0) {
            m17124U(i);
        } else {
            this.f11577e = i3 + i;
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m17124U(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f11581i;
        int i3 = this.f11577e;
        int i4 = i2 + i3 + i;
        int i5 = this.f11582j;
        if (i4 > i5) {
            m17123T((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f11575c;
        int i7 = i6 - i3;
        this.f11577e = i6;
        m17120Q(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.f11575c;
            if (i8 <= i9) {
                this.f11577e = i8;
                return;
            } else {
                i7 += i9;
                this.f11577e = i9;
                m17120Q(1);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m17125V() throws IOException {
        int i = this.f11575c;
        int i2 = this.f11577e;
        if (i - i2 >= 10) {
            byte[] bArr = this.f11573a;
            int i3 = 0;
            while (i3 < 10) {
                int i4 = i2 + 1;
                if (bArr[i2] >= 0) {
                    this.f11577e = i4;
                    return;
                } else {
                    i3++;
                    i2 = i4;
                }
            }
        }
        m17126W();
    }

    /* JADX INFO: renamed from: W */
    public final void m17126W() throws IOException {
        for (int i = 0; i < 10; i++) {
            if (m17145y() >= 0) {
                return;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: X */
    public final boolean m17127X(int i) throws IOException {
        int i2 = this.f11577e;
        int i3 = i2 + i;
        int i4 = this.f11575c;
        if (i3 <= i4) {
            ob5.m163410a("refillBuffer() called when ", i, " bytes were already available in buffer");
            return false;
        }
        if (this.f11581i + i2 + i <= this.f11582j && this.f11578f != null) {
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f11573a;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f11581i += i2;
                this.f11575c -= i2;
                this.f11577e = 0;
            }
            InputStream inputStream = this.f11578f;
            byte[] bArr2 = this.f11573a;
            int i5 = this.f11575c;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.f11573a.length) {
                ob5.m163410a("InputStream#read(byte[]) returned invalid result: ", i6, "\nThe InputStream implementation is buggy.");
                return false;
            }
            if (i6 > 0) {
                this.f11575c += i6;
                if ((this.f11581i + i) - this.f11585m > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                m17119P();
                if (this.f11575c >= i) {
                    return true;
                }
                return m17127X(i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m17128a(int i) throws InvalidProtocolBufferException {
        if (this.f11579g != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    /* JADX INFO: renamed from: d */
    public int m17129d() {
        int i = this.f11582j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f11581i + this.f11577e);
    }

    /* JADX INFO: renamed from: e */
    public boolean m17130e() throws IOException {
        return this.f11577e == this.f11575c && !m17127X(1);
    }

    /* JADX INFO: renamed from: k */
    public void m17131k(int i) {
        this.f11582j = i;
        m17119P();
    }

    /* JADX INFO: renamed from: l */
    public int m17132l(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = i + this.f11581i + this.f11577e;
        int i3 = this.f11582j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f11582j = i2;
        m17119P();
        return i3;
    }

    /* JADX INFO: renamed from: m */
    public boolean m17133m() throws IOException {
        return m17108E() != 0;
    }

    /* JADX INFO: renamed from: n */
    public ByteString m17134n() throws IOException {
        int iM17107C = m17107C();
        int i = this.f11575c;
        int i2 = this.f11577e;
        if (iM17107C > i - i2 || iM17107C <= 0) {
            return iM17107C == 0 ? ByteString.EMPTY : ByteString.wrap(m17146z(iM17107C));
        }
        ByteString byteStringWrap = (this.f11574b && this.f11580h) ? ByteString.wrap(this.f11573a, i2, iM17107C) : ByteString.copyFrom(this.f11573a, i2, iM17107C);
        this.f11577e += iM17107C;
        return byteStringWrap;
    }

    /* JADX INFO: renamed from: o */
    public double m17135o() throws IOException {
        return Double.longBitsToDouble(m17106B());
    }

    /* JADX INFO: renamed from: p */
    public int m17136p() throws IOException {
        return m17107C();
    }

    /* JADX INFO: renamed from: q */
    public int m17137q() throws IOException {
        return m17105A();
    }

    /* JADX INFO: renamed from: r */
    public long m17138r() throws IOException {
        return m17106B();
    }

    /* JADX INFO: renamed from: s */
    public float m17139s() throws IOException {
        return Float.intBitsToFloat(m17105A());
    }

    /* JADX INFO: renamed from: t */
    public void m17140t(int i, InterfaceC3419q.a aVar, C3410h c3410h) throws IOException {
        int i2 = this.f11583k;
        if (i2 >= this.f11584l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.f11583k = i2 + 1;
        aVar.mergeFrom(this, c3410h);
        m17128a(WireFormat.m17074c(i, 4));
        this.f11583k--;
    }

    /* JADX INFO: renamed from: u */
    public int m17141u() throws IOException {
        return m17107C();
    }

    /* JADX INFO: renamed from: v */
    public long m17142v() throws IOException {
        return m17108E();
    }

    /* JADX INFO: renamed from: w */
    public <T extends InterfaceC3419q> T m17143w(i860<T> i860Var, C3410h c3410h) throws IOException {
        int iM17107C = m17107C();
        if (this.f11583k >= this.f11584l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM17132l = m17132l(iM17107C);
        this.f11583k++;
        T tMo17010c = i860Var.mo17010c(this, c3410h);
        m17128a(0);
        this.f11583k--;
        m17131k(iM17132l);
        return tMo17010c;
    }

    /* JADX INFO: renamed from: x */
    public void m17144x(InterfaceC3419q.a aVar, C3410h c3410h) throws IOException {
        int iM17107C = m17107C();
        if (this.f11583k >= this.f11584l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM17132l = m17132l(iM17107C);
        this.f11583k++;
        aVar.mergeFrom(this, c3410h);
        m17128a(0);
        this.f11583k--;
        m17131k(iM17132l);
    }

    /* JADX INFO: renamed from: y */
    public byte m17145y() throws IOException {
        if (this.f11577e == this.f11575c) {
            m17120Q(1);
        }
        byte[] bArr = this.f11573a;
        int i = this.f11577e;
        this.f11577e = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: z */
    public final byte[] m17146z(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return C3414l.f11608c;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f11581i;
        int i3 = this.f11577e;
        int i4 = i2 + i3 + i;
        if (i4 > this.f11585m) {
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        int i5 = this.f11582j;
        if (i4 > i5) {
            m17123T((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        InputStream inputStream = this.f11578f;
        if (inputStream == null) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f11575c;
        int length = i6 - i3;
        this.f11581i = i2 + i6;
        this.f11577e = 0;
        this.f11575c = 0;
        int i7 = i - length;
        if (i7 < 4096 || i7 <= inputStream.available()) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f11573a, i3, bArr, 0, length);
            while (length < i) {
                int i8 = this.f11578f.read(bArr, length, i - length);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f11581i += i8;
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
                int i10 = this.f11578f.read(bArr2, i9, iMin - i9);
                if (i10 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f11581i += i10;
                i9 += i10;
            }
            i7 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.f11573a, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public C3407e(InputStream inputStream, int i) {
        this.f11580h = false;
        this.f11582j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f11584l = 100;
        this.f11585m = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f11573a = new byte[i];
        this.f11577e = 0;
        this.f11581i = 0;
        this.f11578f = inputStream;
        this.f11574b = false;
    }
}
