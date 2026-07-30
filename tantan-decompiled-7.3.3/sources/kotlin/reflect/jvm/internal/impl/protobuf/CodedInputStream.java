package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.common.api.Api;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p153l.rlk0;
import p153l.tg3;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedInputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f66296a;

    /* JADX INFO: renamed from: b */
    public final boolean f66297b;

    /* JADX INFO: renamed from: c */
    public int f66298c;

    /* JADX INFO: renamed from: d */
    public int f66299d;

    /* JADX INFO: renamed from: e */
    public int f66300e;

    /* JADX INFO: renamed from: f */
    public final InputStream f66301f;

    /* JADX INFO: renamed from: g */
    public int f66302g;

    /* JADX INFO: renamed from: h */
    public boolean f66303h;

    /* JADX INFO: renamed from: i */
    public int f66304i;

    /* JADX INFO: renamed from: j */
    public int f66305j;

    /* JADX INFO: renamed from: k */
    public int f66306k;

    /* JADX INFO: renamed from: l */
    public int f66307l;

    /* JADX INFO: renamed from: m */
    public int f66308m;

    public CodedInputStream(C15407b c15407b) {
        this.f66303h = false;
        this.f66305j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f66307l = 64;
        this.f66308m = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f66296a = c15407b.f66369b;
        int iMo92265I = c15407b.mo92265I();
        this.f66300e = iMo92265I;
        this.f66298c = iMo92265I + c15407b.size();
        this.f66304i = -this.f66300e;
        this.f66301f = null;
        this.f66297b = true;
    }

    /* JADX INFO: renamed from: B */
    public static int m92062B(int i, InputStream inputStream) throws IOException {
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
    public static int m92063b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m92064c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: g */
    public static CodedInputStream m92065g(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    /* JADX INFO: renamed from: h */
    public static CodedInputStream m92066h(C15407b c15407b) {
        CodedInputStream codedInputStream = new CodedInputStream(c15407b);
        try {
            codedInputStream.m92091j(c15407b.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public int m92067A() throws IOException {
        int i;
        int i2 = this.f66300e;
        int i3 = this.f66298c;
        if (i3 != i2) {
            byte[] bArr = this.f66296a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f66300e = i4;
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
                this.f66300e = i5;
                return i;
            }
        }
        return (int) m92069D();
    }

    /* JADX INFO: renamed from: C */
    public long m92068C() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.f66300e;
        int i2 = this.f66298c;
        if (i2 != i) {
            byte[] bArr = this.f66296a;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f66300e = i3;
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
                                    this.f66300e = i4;
                                    return j;
                                }
                                j2 = -34093383808L;
                            }
                        }
                    }
                    j = j5 ^ j3;
                    i4 = i5;
                    this.f66300e = i4;
                    return j;
                }
                j2 = -128;
                j = j4 ^ j2;
                this.f66300e = i4;
                return j;
            }
        }
        return m92069D();
    }

    /* JADX INFO: renamed from: D */
    public long m92069D() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bM92104w = m92104w();
            j |= ((long) (bM92104w & 127)) << i;
            if ((bM92104w & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* JADX INFO: renamed from: E */
    public int m92070E() throws IOException {
        return m92106y();
    }

    /* JADX INFO: renamed from: F */
    public long m92071F() throws IOException {
        return m92107z();
    }

    /* JADX INFO: renamed from: G */
    public int m92072G() throws IOException {
        return m92063b(m92067A());
    }

    /* JADX INFO: renamed from: H */
    public long m92073H() throws IOException {
        return m92064c(m92068C());
    }

    /* JADX INFO: renamed from: I */
    public String m92074I() throws IOException {
        int iM92067A = m92067A();
        int i = this.f66298c;
        int i2 = this.f66300e;
        if (iM92067A > i - i2 || iM92067A <= 0) {
            return iM92067A == 0 ? "" : new String(m92105x(iM92067A), "UTF-8");
        }
        String str = new String(this.f66296a, i2, iM92067A, "UTF-8");
        this.f66300e += iM92067A;
        return str;
    }

    /* JADX INFO: renamed from: J */
    public String m92075J() throws IOException {
        byte[] bArrM92105x;
        int iM92067A = m92067A();
        int i = this.f66300e;
        if (iM92067A <= this.f66298c - i && iM92067A > 0) {
            bArrM92105x = this.f66296a;
            this.f66300e = i + iM92067A;
        } else {
            if (iM92067A == 0) {
                return "";
            }
            bArrM92105x = m92105x(iM92067A);
            i = 0;
        }
        if (rlk0.m182001f(bArrM92105x, i, i + iM92067A)) {
            return new String(bArrM92105x, i, iM92067A, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    /* JADX INFO: renamed from: K */
    public int m92076K() throws IOException {
        if (m92089f()) {
            this.f66302g = 0;
            return 0;
        }
        int iM92067A = m92067A();
        this.f66302g = iM92067A;
        if (WireFormat.m92261a(iM92067A) != 0) {
            return this.f66302g;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: renamed from: L */
    public int m92077L() throws IOException {
        return m92067A();
    }

    /* JADX INFO: renamed from: M */
    public long m92078M() throws IOException {
        return m92068C();
    }

    /* JADX INFO: renamed from: N */
    public final void m92079N() {
        int i = this.f66298c + this.f66299d;
        this.f66298c = i;
        int i2 = this.f66304i + i;
        int i3 = this.f66305j;
        if (i2 <= i3) {
            this.f66299d = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f66299d = i4;
        this.f66298c = i - i4;
    }

    /* JADX INFO: renamed from: O */
    public final void m92080O(int i) throws IOException {
        if (!m92085T(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: P */
    public boolean m92081P(int i, CodedOutputStream codedOutputStream) throws IOException {
        int iM92262b = WireFormat.m92262b(i);
        if (iM92262b == 0) {
            long jM92101t = m92101t();
            codedOutputStream.m92182s0(i);
            codedOutputStream.m92148D0(jM92101t);
            return true;
        }
        if (iM92262b == 1) {
            long jM92107z = m92107z();
            codedOutputStream.m92182s0(i);
            codedOutputStream.m92162Z(jM92107z);
            return true;
        }
        if (iM92262b == 2) {
            ByteString byteStringM92093l = m92093l();
            codedOutputStream.m92182s0(i);
            codedOutputStream.m92156T(byteStringM92093l);
            return true;
        }
        if (iM92262b == 3) {
            codedOutputStream.m92182s0(i);
            m92082Q(codedOutputStream);
            int iM92263c = WireFormat.m92263c(WireFormat.m92261a(i), 4);
            m92086a(iM92263c);
            codedOutputStream.m92182s0(iM92263c);
            return true;
        }
        if (iM92262b == 4) {
            return false;
        }
        if (iM92262b != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iM92106y = m92106y();
        codedOutputStream.m92182s0(i);
        codedOutputStream.m92161Y(iM92106y);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public void m92082Q(CodedOutputStream codedOutputStream) throws IOException {
        int iM92076K;
        do {
            iM92076K = m92076K();
            if (iM92076K == 0) {
                return;
            }
        } while (m92081P(iM92076K, codedOutputStream));
    }

    /* JADX INFO: renamed from: R */
    public void m92083R(int i) throws IOException {
        int i2 = this.f66298c;
        int i3 = this.f66300e;
        if (i > i2 - i3 || i < 0) {
            m92084S(i);
        } else {
            this.f66300e = i3 + i;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m92084S(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f66304i;
        int i3 = this.f66300e;
        int i4 = i2 + i3 + i;
        int i5 = this.f66305j;
        if (i4 > i5) {
            m92083R((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f66298c;
        int i7 = i6 - i3;
        this.f66300e = i6;
        m92080O(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.f66298c;
            if (i8 <= i9) {
                this.f66300e = i8;
                return;
            } else {
                i7 += i9;
                this.f66300e = i9;
                m92080O(1);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m92085T(int i) throws IOException {
        int i2 = this.f66300e;
        int i3 = i2 + i;
        int i4 = this.f66298c;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f66304i + i2 + i <= this.f66305j && this.f66301f != null) {
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f66296a;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f66304i += i2;
                this.f66298c -= i2;
                this.f66300e = 0;
            }
            InputStream inputStream = this.f66301f;
            byte[] bArr2 = this.f66296a;
            int i5 = this.f66298c;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.f66296a.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.f66298c += i6;
                if ((this.f66304i + i) - this.f66308m > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                m92079N();
                if (this.f66298c >= i) {
                    return true;
                }
                return m92085T(i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m92086a(int i) throws InvalidProtocolBufferException {
        if (this.f66302g != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m92087d(int i) throws IOException {
        if (this.f66298c - this.f66300e < i) {
            m92080O(i);
        }
    }

    /* JADX INFO: renamed from: e */
    public int m92088e() {
        int i = this.f66305j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f66304i + this.f66300e);
    }

    /* JADX INFO: renamed from: f */
    public boolean m92089f() throws IOException {
        return this.f66300e == this.f66298c && !m92085T(1);
    }

    /* JADX INFO: renamed from: i */
    public void m92090i(int i) {
        this.f66305j = i;
        m92079N();
    }

    /* JADX INFO: renamed from: j */
    public int m92091j(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = i + this.f66304i + this.f66300e;
        int i3 = this.f66305j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f66305j = i2;
        m92079N();
        return i3;
    }

    /* JADX INFO: renamed from: k */
    public boolean m92092k() throws IOException {
        return m92068C() != 0;
    }

    /* JADX INFO: renamed from: l */
    public ByteString m92093l() throws IOException {
        int iM92067A = m92067A();
        int i = this.f66298c;
        int i2 = this.f66300e;
        if (iM92067A > i - i2 || iM92067A <= 0) {
            return iM92067A == 0 ? ByteString.f66289a : new C15407b(m92105x(iM92067A));
        }
        ByteString c15406a = (this.f66297b && this.f66303h) ? new C15406a(this.f66296a, this.f66300e, iM92067A) : ByteString.m92039h(this.f66296a, i2, iM92067A);
        this.f66300e += iM92067A;
        return c15406a;
    }

    /* JADX INFO: renamed from: m */
    public double m92094m() throws IOException {
        return Double.longBitsToDouble(m92107z());
    }

    /* JADX INFO: renamed from: n */
    public int m92095n() throws IOException {
        return m92067A();
    }

    /* JADX INFO: renamed from: o */
    public int m92096o() throws IOException {
        return m92106y();
    }

    /* JADX INFO: renamed from: p */
    public long m92097p() throws IOException {
        return m92107z();
    }

    /* JADX INFO: renamed from: q */
    public float m92098q() throws IOException {
        return Float.intBitsToFloat(m92106y());
    }

    /* JADX INFO: renamed from: r */
    public void m92099r(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i2 = this.f66306k;
        if (i2 >= this.f66307l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.f66306k = i2 + 1;
        builder.mo91350i(this, extensionRegistryLite);
        m92086a(WireFormat.m92263c(i, 4));
        this.f66306k--;
    }

    /* JADX INFO: renamed from: s */
    public int m92100s() throws IOException {
        return m92067A();
    }

    /* JADX INFO: renamed from: t */
    public long m92101t() throws IOException {
        return m92068C();
    }

    /* JADX INFO: renamed from: u */
    public <T extends MessageLite> T m92102u(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iM92067A = m92067A();
        if (this.f66306k >= this.f66307l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM92091j = m92091j(iM92067A);
        this.f66306k++;
        T tMo91378d = parser.mo91378d(this, extensionRegistryLite);
        m92086a(0);
        this.f66306k--;
        m92090i(iM92091j);
        return tMo91378d;
    }

    /* JADX INFO: renamed from: v */
    public void m92103v(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iM92067A = m92067A();
        if (this.f66306k >= this.f66307l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM92091j = m92091j(iM92067A);
        this.f66306k++;
        builder.mo91350i(this, extensionRegistryLite);
        m92086a(0);
        this.f66306k--;
        m92090i(iM92091j);
    }

    /* JADX INFO: renamed from: w */
    public byte m92104w() throws IOException {
        if (this.f66300e == this.f66298c) {
            m92080O(1);
        }
        byte[] bArr = this.f66296a;
        int i = this.f66300e;
        this.f66300e = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: x */
    public final byte[] m92105x(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return Internal.f66343a;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f66304i;
        int i3 = this.f66300e;
        int i4 = i2 + i3 + i;
        int i5 = this.f66305j;
        if (i4 > i5) {
            m92083R((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i6 = this.f66298c - i3;
            System.arraycopy(this.f66296a, i3, bArr, 0, i6);
            this.f66300e = this.f66298c;
            int i7 = i - i6;
            m92087d(i7);
            System.arraycopy(this.f66296a, 0, bArr, i6, i7);
            this.f66300e = i7;
            return bArr;
        }
        int i8 = this.f66298c;
        this.f66304i = i2 + i8;
        this.f66300e = 0;
        this.f66298c = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr2 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.f66301f;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr2, i10, iMin - i10);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f66304i += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.f66296a, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: y */
    public int m92106y() throws IOException {
        int i = this.f66300e;
        if (this.f66298c - i < 4) {
            m92080O(4);
            i = this.f66300e;
        }
        byte[] bArr = this.f66296a;
        this.f66300e = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: z */
    public long m92107z() throws IOException {
        int i = this.f66300e;
        if (this.f66298c - i < 8) {
            m92080O(8);
            i = this.f66300e;
        }
        byte[] bArr = this.f66296a;
        this.f66300e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public CodedInputStream(InputStream inputStream) {
        this.f66303h = false;
        this.f66305j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f66307l = 64;
        this.f66308m = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        this.f66296a = new byte[4096];
        this.f66298c = 0;
        this.f66300e = 0;
        this.f66304i = 0;
        this.f66301f = inputStream;
        this.f66297b = false;
    }
}
