package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.common.api.Api;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p149l.fg3;
import p149l.lck0;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedInputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f65622a;

    /* JADX INFO: renamed from: b */
    public final boolean f65623b;

    /* JADX INFO: renamed from: c */
    public int f65624c;

    /* JADX INFO: renamed from: d */
    public int f65625d;

    /* JADX INFO: renamed from: e */
    public int f65626e;

    /* JADX INFO: renamed from: f */
    public final InputStream f65627f;

    /* JADX INFO: renamed from: g */
    public int f65628g;

    /* JADX INFO: renamed from: h */
    public boolean f65629h;

    /* JADX INFO: renamed from: i */
    public int f65630i;

    /* JADX INFO: renamed from: j */
    public int f65631j;

    /* JADX INFO: renamed from: k */
    public int f65632k;

    /* JADX INFO: renamed from: l */
    public int f65633l;

    /* JADX INFO: renamed from: m */
    public int f65634m;

    public CodedInputStream(C15300b c15300b) {
        this.f65629h = false;
        this.f65631j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f65633l = 64;
        this.f65634m = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f65622a = c15300b.f65695b;
        int iMo91374I = c15300b.mo91374I();
        this.f65626e = iMo91374I;
        this.f65624c = iMo91374I + c15300b.size();
        this.f65630i = -this.f65626e;
        this.f65627f = null;
        this.f65623b = true;
    }

    /* JADX INFO: renamed from: B */
    public static int m91171B(int i, InputStream inputStream) throws IOException {
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
    public static int m91172b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m91173c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: g */
    public static CodedInputStream m91174g(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    /* JADX INFO: renamed from: h */
    public static CodedInputStream m91175h(C15300b c15300b) {
        CodedInputStream codedInputStream = new CodedInputStream(c15300b);
        try {
            codedInputStream.m91200j(c15300b.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e) {
            fg3.m121203a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public int m91176A() throws IOException {
        int i;
        int i2 = this.f65626e;
        int i3 = this.f65624c;
        if (i3 != i2) {
            byte[] bArr = this.f65622a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f65626e = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << 28))) ^ 266354560);
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
                this.f65626e = i5;
                return i;
            }
        }
        return (int) m91178D();
    }

    /* JADX INFO: renamed from: C */
    public long m91177C() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.f65626e;
        int i2 = this.f65624c;
        if (i2 != i) {
            byte[] bArr = this.f65622a;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f65626e = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j4 = (bArr[i3] << 7) ^ b;
                if (j4 >= 0) {
                    int i5 = i + 3;
                    long j5 = j4 ^ ((long) (bArr[i4] << 14));
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i4 = i + 4;
                        j4 = j5 ^ ((long) (bArr[i5] << 21));
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i5 = i + 5;
                            j5 = j4 ^ (((long) bArr[i4]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i4 = i + 6;
                                j4 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j4 >= 0) {
                                    i5 = i + 7;
                                    j5 = j4 ^ (((long) bArr[i4]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j4 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i5 = i + 9;
                                            long j6 = (j4 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i5] >= 0) {
                                                    j = j6;
                                                }
                                            } else {
                                                j = j6;
                                                i4 = i5;
                                            }
                                        }
                                    }
                                    this.f65626e = i4;
                                    return j;
                                }
                                j2 = -34093383808L;
                            }
                        }
                    }
                    j = j5 ^ j3;
                    i4 = i5;
                    this.f65626e = i4;
                    return j;
                }
                j2 = -128;
                j = j4 ^ j2;
                this.f65626e = i4;
                return j;
            }
        }
        return m91178D();
    }

    /* JADX INFO: renamed from: D */
    public long m91178D() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM91213w = m91213w();
            j |= ((long) (bM91213w & 127)) << i;
            if ((bM91213w & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: E */
    public int m91179E() throws IOException {
        return m91215y();
    }

    /* JADX INFO: renamed from: F */
    public long m91180F() throws IOException {
        return m91216z();
    }

    /* JADX INFO: renamed from: G */
    public int m91181G() throws IOException {
        return m91172b(m91176A());
    }

    /* JADX INFO: renamed from: H */
    public long m91182H() throws IOException {
        return m91173c(m91177C());
    }

    /* JADX INFO: renamed from: I */
    public String m91183I() throws IOException {
        int iM91176A = m91176A();
        int i = this.f65624c;
        int i2 = this.f65626e;
        if (iM91176A > i - i2 || iM91176A <= 0) {
            return iM91176A == 0 ? "" : new String(m91214x(iM91176A), "UTF-8");
        }
        String str = new String(this.f65622a, i2, iM91176A, "UTF-8");
        this.f65626e += iM91176A;
        return str;
    }

    /* JADX INFO: renamed from: J */
    public String m91184J() throws IOException {
        byte[] bArrM91214x;
        int iM91176A = m91176A();
        int i = this.f65626e;
        if (iM91176A <= this.f65624c - i && iM91176A > 0) {
            bArrM91214x = this.f65622a;
            this.f65626e = i + iM91176A;
        } else {
            if (iM91176A == 0) {
                return "";
            }
            bArrM91214x = m91214x(iM91176A);
            i = 0;
        }
        if (lck0.m149326f(bArrM91214x, i, i + iM91176A)) {
            return new String(bArrM91214x, i, iM91176A, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    /* JADX INFO: renamed from: K */
    public int m91185K() throws IOException {
        if (m91198f()) {
            this.f65628g = 0;
            return 0;
        }
        int iM91176A = m91176A();
        this.f65628g = iM91176A;
        if (WireFormat.m91370a(iM91176A) != 0) {
            return this.f65628g;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: renamed from: L */
    public int m91186L() throws IOException {
        return m91176A();
    }

    /* JADX INFO: renamed from: M */
    public long m91187M() throws IOException {
        return m91177C();
    }

    /* JADX INFO: renamed from: N */
    public final void m91188N() {
        int i = this.f65624c + this.f65625d;
        this.f65624c = i;
        int i2 = this.f65630i + i;
        int i3 = this.f65631j;
        if (i2 <= i3) {
            this.f65625d = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f65625d = i4;
        this.f65624c = i - i4;
    }

    /* JADX INFO: renamed from: O */
    public final void m91189O(int i) throws IOException {
        if (!m91194T(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: P */
    public boolean m91190P(int i, CodedOutputStream codedOutputStream) throws IOException {
        int iM91371b = WireFormat.m91371b(i);
        if (iM91371b == 0) {
            long jM91210t = m91210t();
            codedOutputStream.m91291s0(i);
            codedOutputStream.m91257D0(jM91210t);
            return true;
        }
        if (iM91371b == 1) {
            long jM91216z = m91216z();
            codedOutputStream.m91291s0(i);
            codedOutputStream.m91271Z(jM91216z);
            return true;
        }
        if (iM91371b == 2) {
            ByteString byteStringM91202l = m91202l();
            codedOutputStream.m91291s0(i);
            codedOutputStream.m91265T(byteStringM91202l);
            return true;
        }
        if (iM91371b == 3) {
            codedOutputStream.m91291s0(i);
            m91191Q(codedOutputStream);
            int iM91372c = WireFormat.m91372c(WireFormat.m91370a(i), 4);
            m91195a(iM91372c);
            codedOutputStream.m91291s0(iM91372c);
            return true;
        }
        if (iM91371b == 4) {
            return false;
        }
        if (iM91371b != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iM91215y = m91215y();
        codedOutputStream.m91291s0(i);
        codedOutputStream.m91270Y(iM91215y);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public void m91191Q(CodedOutputStream codedOutputStream) throws IOException {
        int iM91185K;
        do {
            iM91185K = m91185K();
            if (iM91185K == 0) {
                return;
            }
        } while (m91190P(iM91185K, codedOutputStream));
    }

    /* JADX INFO: renamed from: R */
    public void m91192R(int i) throws IOException {
        int i2 = this.f65624c;
        int i3 = this.f65626e;
        if (i > i2 - i3 || i < 0) {
            m91193S(i);
        } else {
            this.f65626e = i3 + i;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m91193S(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f65630i;
        int i3 = this.f65626e;
        int i4 = i2 + i3 + i;
        int i5 = this.f65631j;
        if (i4 > i5) {
            m91192R((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f65624c;
        int i7 = i6 - i3;
        this.f65626e = i6;
        m91189O(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.f65624c;
            if (i8 <= i9) {
                this.f65626e = i8;
                return;
            } else {
                i7 += i9;
                this.f65626e = i9;
                m91189O(1);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m91194T(int i) throws IOException {
        int i2 = this.f65626e;
        int i3 = i2 + i;
        int i4 = this.f65624c;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f65630i + i2 + i <= this.f65631j && this.f65627f != null) {
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f65622a;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f65630i += i2;
                this.f65624c -= i2;
                this.f65626e = 0;
            }
            InputStream inputStream = this.f65627f;
            byte[] bArr2 = this.f65622a;
            int i5 = this.f65624c;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.f65622a.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.f65624c += i6;
                if ((this.f65630i + i) - this.f65634m > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                m91188N();
                if (this.f65624c >= i) {
                    return true;
                }
                return m91194T(i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m91195a(int i) throws InvalidProtocolBufferException {
        if (this.f65628g != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m91196d(int i) throws IOException {
        if (this.f65624c - this.f65626e < i) {
            m91189O(i);
        }
    }

    /* JADX INFO: renamed from: e */
    public int m91197e() {
        int i = this.f65631j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f65630i + this.f65626e);
    }

    /* JADX INFO: renamed from: f */
    public boolean m91198f() throws IOException {
        return this.f65626e == this.f65624c && !m91194T(1);
    }

    /* JADX INFO: renamed from: i */
    public void m91199i(int i) {
        this.f65631j = i;
        m91188N();
    }

    /* JADX INFO: renamed from: j */
    public int m91200j(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = i + this.f65630i + this.f65626e;
        int i3 = this.f65631j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f65631j = i2;
        m91188N();
        return i3;
    }

    /* JADX INFO: renamed from: k */
    public boolean m91201k() throws IOException {
        return m91177C() != 0;
    }

    /* JADX INFO: renamed from: l */
    public ByteString m91202l() throws IOException {
        int iM91176A = m91176A();
        int i = this.f65624c;
        int i2 = this.f65626e;
        if (iM91176A > i - i2 || iM91176A <= 0) {
            return iM91176A == 0 ? ByteString.f65615a : new C15300b(m91214x(iM91176A));
        }
        ByteString c15299a = (this.f65623b && this.f65629h) ? new C15299a(this.f65622a, this.f65626e, iM91176A) : ByteString.m91148h(this.f65622a, i2, iM91176A);
        this.f65626e += iM91176A;
        return c15299a;
    }

    /* JADX INFO: renamed from: m */
    public double m91203m() throws IOException {
        return Double.longBitsToDouble(m91216z());
    }

    /* JADX INFO: renamed from: n */
    public int m91204n() throws IOException {
        return m91176A();
    }

    /* JADX INFO: renamed from: o */
    public int m91205o() throws IOException {
        return m91215y();
    }

    /* JADX INFO: renamed from: p */
    public long m91206p() throws IOException {
        return m91216z();
    }

    /* JADX INFO: renamed from: q */
    public float m91207q() throws IOException {
        return Float.intBitsToFloat(m91215y());
    }

    /* JADX INFO: renamed from: r */
    public void m91208r(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i2 = this.f65632k;
        if (i2 >= this.f65633l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.f65632k = i2 + 1;
        builder.mo90459i(this, extensionRegistryLite);
        m91195a(WireFormat.m91372c(i, 4));
        this.f65632k--;
    }

    /* JADX INFO: renamed from: s */
    public int m91209s() throws IOException {
        return m91176A();
    }

    /* JADX INFO: renamed from: t */
    public long m91210t() throws IOException {
        return m91177C();
    }

    /* JADX INFO: renamed from: u */
    public <T extends MessageLite> T m91211u(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iM91176A = m91176A();
        if (this.f65632k >= this.f65633l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM91200j = m91200j(iM91176A);
        this.f65632k++;
        T tMo90487d = parser.mo90487d(this, extensionRegistryLite);
        m91195a(0);
        this.f65632k--;
        m91199i(iM91200j);
        return tMo90487d;
    }

    /* JADX INFO: renamed from: v */
    public void m91212v(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iM91176A = m91176A();
        if (this.f65632k >= this.f65633l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM91200j = m91200j(iM91176A);
        this.f65632k++;
        builder.mo90459i(this, extensionRegistryLite);
        m91195a(0);
        this.f65632k--;
        m91199i(iM91200j);
    }

    /* JADX INFO: renamed from: w */
    public byte m91213w() throws IOException {
        if (this.f65626e == this.f65624c) {
            m91189O(1);
        }
        byte[] bArr = this.f65622a;
        int i = this.f65626e;
        this.f65626e = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: x */
    public final byte[] m91214x(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return Internal.f65669a;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f65630i;
        int i3 = this.f65626e;
        int i4 = i2 + i3 + i;
        int i5 = this.f65631j;
        if (i4 > i5) {
            m91192R((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i6 = this.f65624c - i3;
            System.arraycopy(this.f65622a, i3, bArr, 0, i6);
            this.f65626e = this.f65624c;
            int i7 = i - i6;
            m91196d(i7);
            System.arraycopy(this.f65622a, 0, bArr, i6, i7);
            this.f65626e = i7;
            return bArr;
        }
        int i8 = this.f65624c;
        this.f65630i = i2 + i8;
        this.f65626e = 0;
        this.f65624c = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr2 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.f65627f;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr2, i10, iMin - i10);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f65630i += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.f65622a, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: y */
    public int m91215y() throws IOException {
        int i = this.f65626e;
        if (this.f65624c - i < 4) {
            m91189O(4);
            i = this.f65626e;
        }
        byte[] bArr = this.f65622a;
        this.f65626e = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: z */
    public long m91216z() throws IOException {
        int i = this.f65626e;
        if (this.f65624c - i < 8) {
            m91189O(8);
            i = this.f65626e;
        }
        byte[] bArr = this.f65622a;
        this.f65626e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public CodedInputStream(InputStream inputStream) {
        this.f65629h = false;
        this.f65631j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f65633l = 64;
        this.f65634m = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f65622a = new byte[4096];
        this.f65624c = 0;
        this.f65626e = 0;
        this.f65630i = 0;
        this.f65627f = inputStream;
        this.f65623b = false;
    }
}
