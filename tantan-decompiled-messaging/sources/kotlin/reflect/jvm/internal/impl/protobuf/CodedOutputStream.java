package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import p149l.pkq0;
import p149l.qkq0;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f65635a;

    /* JADX INFO: renamed from: b */
    public final int f65636b;

    /* JADX INFO: renamed from: c */
    public int f65637c;

    /* JADX INFO: renamed from: d */
    public int f65638d;

    /* JADX INFO: renamed from: e */
    public final OutputStream f65639e;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(byte[] bArr, int i, int i2) {
        this.f65638d = 0;
        this.f65639e = null;
        this.f65635a = bArr;
        this.f65637c = i;
        this.f65636b = i + i2;
    }

    /* JADX INFO: renamed from: A */
    public static int m91217A(int i) {
        return m91250w(m91224H(i));
    }

    /* JADX INFO: renamed from: B */
    public static int m91218B(int i, long j) {
        return m91221E(i) + m91219C(j);
    }

    /* JADX INFO: renamed from: C */
    public static int m91219C(long j) {
        return m91251x(m91225I(j));
    }

    /* JADX INFO: renamed from: D */
    public static int m91220D(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m91250w(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            pkq0.m170054a("UTF-8 not supported.", e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: E */
    public static int m91221E(int i) {
        return m91250w(WireFormat.m91372c(i, 0));
    }

    /* JADX INFO: renamed from: F */
    public static int m91222F(int i) {
        return m91250w(i);
    }

    /* JADX INFO: renamed from: G */
    public static int m91223G(long j) {
        return m91251x(j);
    }

    /* JADX INFO: renamed from: H */
    public static int m91224H(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: I */
    public static long m91225I(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: K */
    public static CodedOutputStream m91226K(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: L */
    public static CodedOutputStream m91227L(byte[] bArr) {
        return m91228M(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: M */
    public static CodedOutputStream m91228M(byte[] bArr, int i, int i2) {
        return new CodedOutputStream(bArr, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static int m91229b(int i, boolean z) {
        return m91221E(i) + m91230c(z);
    }

    /* JADX INFO: renamed from: c */
    public static int m91230c(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public static int m91231d(byte[] bArr) {
        return m91250w(bArr.length) + bArr.length;
    }

    /* JADX INFO: renamed from: e */
    public static int m91232e(int i, ByteString byteString) {
        return m91221E(i) + m91233f(byteString);
    }

    /* JADX INFO: renamed from: f */
    public static int m91233f(ByteString byteString) {
        return m91250w(byteString.size()) + byteString.size();
    }

    /* JADX INFO: renamed from: g */
    public static int m91234g(int i, double d) {
        return m91221E(i) + m91235h(d);
    }

    /* JADX INFO: renamed from: h */
    public static int m91235h(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: i */
    public static int m91236i(int i, int i2) {
        return m91221E(i) + m91237j(i2);
    }

    /* JADX INFO: renamed from: j */
    public static int m91237j(int i) {
        return m91244q(i);
    }

    /* JADX INFO: renamed from: k */
    public static int m91238k(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: l */
    public static int m91239l(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m91240m(int i, float f) {
        return m91221E(i) + m91241n(f);
    }

    /* JADX INFO: renamed from: n */
    public static int m91241n(float f) {
        return 4;
    }

    /* JADX INFO: renamed from: o */
    public static int m91242o(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    /* JADX INFO: renamed from: p */
    public static int m91243p(int i, int i2) {
        return m91221E(i) + m91244q(i2);
    }

    /* JADX INFO: renamed from: q */
    public static int m91244q(int i) {
        if (i >= 0) {
            return m91250w(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: r */
    public static int m91245r(long j) {
        return m91251x(j);
    }

    /* JADX INFO: renamed from: s */
    public static int m91246s(LazyFieldLite lazyFieldLite) {
        int iM91352b = lazyFieldLite.m91352b();
        return m91250w(iM91352b) + iM91352b;
    }

    /* JADX INFO: renamed from: t */
    public static int m91247t(int i, MessageLite messageLite) {
        return m91221E(i) + m91248u(messageLite);
    }

    /* JADX INFO: renamed from: u */
    public static int m91248u(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return m91250w(serializedSize) + serializedSize;
    }

    /* JADX INFO: renamed from: v */
    public static int m91249v(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* JADX INFO: renamed from: w */
    public static int m91250w(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: x */
    public static int m91251x(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: y */
    public static int m91252y(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: z */
    public static int m91253z(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: A0 */
    public void m91254A0(int i, int i2) throws IOException {
        m91291s0(WireFormat.m91372c(i, i2));
    }

    /* JADX INFO: renamed from: B0 */
    public void m91255B0(int i, int i2) throws IOException {
        m91254A0(i, 0);
        m91256C0(i2);
    }

    /* JADX INFO: renamed from: C0 */
    public void m91256C0(int i) throws IOException {
        m91291s0(i);
    }

    /* JADX INFO: renamed from: D0 */
    public void m91257D0(long j) throws IOException {
        m91292t0(j);
    }

    /* JADX INFO: renamed from: J */
    public void m91258J() throws IOException {
        if (this.f65639e != null) {
            m91259N();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m91259N() throws IOException {
        OutputStream outputStream = this.f65639e;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f65635a, 0, this.f65637c);
        this.f65637c = 0;
    }

    /* JADX INFO: renamed from: O */
    public int m91260O() {
        if (this.f65639e == null) {
            return this.f65636b - this.f65637c;
        }
        qq3.m175877a("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        return 0;
    }

    /* JADX INFO: renamed from: P */
    public void m91261P(int i, boolean z) throws IOException {
        m91254A0(i, 0);
        m91262Q(z);
    }

    /* JADX INFO: renamed from: Q */
    public void m91262Q(boolean z) throws IOException {
        m91284l0(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: R */
    public void m91263R(byte[] bArr) throws IOException {
        m91291s0(bArr.length);
        m91287o0(bArr);
    }

    /* JADX INFO: renamed from: S */
    public void m91264S(int i, ByteString byteString) throws IOException {
        m91254A0(i, 2);
        m91265T(byteString);
    }

    /* JADX INFO: renamed from: T */
    public void m91265T(ByteString byteString) throws IOException {
        m91291s0(byteString.size());
        m91285m0(byteString);
    }

    /* JADX INFO: renamed from: U */
    public void m91266U(int i, double d) throws IOException {
        m91254A0(i, 1);
        m91267V(d);
    }

    /* JADX INFO: renamed from: V */
    public void m91267V(double d) throws IOException {
        m91290r0(Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: W */
    public void m91268W(int i, int i2) throws IOException {
        m91254A0(i, 0);
        m91269X(i2);
    }

    /* JADX INFO: renamed from: X */
    public void m91269X(int i) throws IOException {
        m91278f0(i);
    }

    /* JADX INFO: renamed from: Y */
    public void m91270Y(int i) throws IOException {
        m91289q0(i);
    }

    /* JADX INFO: renamed from: Z */
    public void m91271Z(long j) throws IOException {
        m91290r0(j);
    }

    /* JADX INFO: renamed from: a */
    public void m91272a() {
        if (m91260O() == 0) {
            return;
        }
        qkq0.m175383a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: a0 */
    public void m91273a0(int i, float f) throws IOException {
        m91254A0(i, 5);
        m91274b0(f);
    }

    /* JADX INFO: renamed from: b0 */
    public void m91274b0(float f) throws IOException {
        m91289q0(Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: c0 */
    public void m91275c0(int i, MessageLite messageLite) throws IOException {
        m91254A0(i, 3);
        m91276d0(messageLite);
        m91254A0(i, 4);
    }

    /* JADX INFO: renamed from: d0 */
    public void m91276d0(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    /* JADX INFO: renamed from: e0 */
    public void m91277e0(int i, int i2) throws IOException {
        m91254A0(i, 0);
        m91278f0(i2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m91278f0(int i) throws IOException {
        if (i >= 0) {
            m91291s0(i);
        } else {
            m91292t0(i);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m91279g0(long j) throws IOException {
        m91292t0(j);
    }

    /* JADX INFO: renamed from: h0 */
    public void m91280h0(int i, MessageLite messageLite) throws IOException {
        m91254A0(i, 2);
        m91281i0(messageLite);
    }

    /* JADX INFO: renamed from: i0 */
    public void m91281i0(MessageLite messageLite) throws IOException {
        m91291s0(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    /* JADX INFO: renamed from: j0 */
    public void m91282j0(int i, MessageLite messageLite) throws IOException {
        m91254A0(1, 3);
        m91255B0(2, i);
        m91280h0(3, messageLite);
        m91254A0(1, 4);
    }

    /* JADX INFO: renamed from: k0 */
    public void m91283k0(byte b) throws IOException {
        if (this.f65637c == this.f65636b) {
            m91259N();
        }
        byte[] bArr = this.f65635a;
        int i = this.f65637c;
        this.f65637c = i + 1;
        bArr[i] = b;
        this.f65638d++;
    }

    /* JADX INFO: renamed from: l0 */
    public void m91284l0(int i) throws IOException {
        m91283k0((byte) i);
    }

    /* JADX INFO: renamed from: m0 */
    public void m91285m0(ByteString byteString) throws IOException {
        m91286n0(byteString, 0, byteString.size());
    }

    /* JADX INFO: renamed from: n0 */
    public void m91286n0(ByteString byteString, int i, int i2) throws IOException {
        int i3 = this.f65636b;
        int i4 = this.f65637c;
        int i5 = i3 - i4;
        byte[] bArr = this.f65635a;
        if (i5 >= i2) {
            byteString.m91157j(bArr, i, i4, i2);
            this.f65637c += i2;
            this.f65638d += i2;
            return;
        }
        int i6 = i3 - i4;
        byteString.m91157j(bArr, i, i4, i6);
        int i7 = i + i6;
        int i8 = i2 - i6;
        this.f65637c = this.f65636b;
        this.f65638d += i6;
        m91259N();
        if (i8 <= this.f65636b) {
            byteString.m91157j(this.f65635a, i7, 0, i8);
            this.f65637c = i8;
        } else {
            byteString.m91154E(this.f65639e, i7, i8);
        }
        this.f65638d += i8;
    }

    /* JADX INFO: renamed from: o0 */
    public void m91287o0(byte[] bArr) throws IOException {
        m91288p0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: p0 */
    public void m91288p0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f65636b;
        int i4 = this.f65637c;
        int i5 = i3 - i4;
        byte[] bArr2 = this.f65635a;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f65637c += i2;
            this.f65638d += i2;
            return;
        }
        int i6 = i3 - i4;
        System.arraycopy(bArr, i, bArr2, i4, i6);
        int i7 = i + i6;
        int i8 = i2 - i6;
        this.f65637c = this.f65636b;
        this.f65638d += i6;
        m91259N();
        if (i8 <= this.f65636b) {
            System.arraycopy(bArr, i7, this.f65635a, 0, i8);
            this.f65637c = i8;
        } else {
            this.f65639e.write(bArr, i7, i8);
        }
        this.f65638d += i8;
    }

    /* JADX INFO: renamed from: q0 */
    public void m91289q0(int i) throws IOException {
        m91284l0(i & 255);
        m91284l0((i >> 8) & 255);
        m91284l0((i >> 16) & 255);
        m91284l0((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: r0 */
    public void m91290r0(long j) throws IOException {
        m91284l0(((int) j) & 255);
        m91284l0(((int) (j >> 8)) & 255);
        m91284l0(((int) (j >> 16)) & 255);
        m91284l0(((int) (j >> 24)) & 255);
        m91284l0(((int) (j >> 32)) & 255);
        m91284l0(((int) (j >> 40)) & 255);
        m91284l0(((int) (j >> 48)) & 255);
        m91284l0(((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: s0 */
    public void m91291s0(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m91284l0((i & 127) | 128);
            i >>>= 7;
        }
        m91284l0(i);
    }

    /* JADX INFO: renamed from: t0 */
    public void m91292t0(long j) throws IOException {
        while (((-128) & j) != 0) {
            m91284l0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m91284l0((int) j);
    }

    /* JADX INFO: renamed from: u0 */
    public void m91293u0(int i) throws IOException {
        m91289q0(i);
    }

    /* JADX INFO: renamed from: v0 */
    public void m91294v0(long j) throws IOException {
        m91290r0(j);
    }

    /* JADX INFO: renamed from: w0 */
    public void m91295w0(int i) throws IOException {
        m91291s0(m91224H(i));
    }

    /* JADX INFO: renamed from: x0 */
    public void m91296x0(int i, long j) throws IOException {
        m91254A0(i, 0);
        m91297y0(j);
    }

    /* JADX INFO: renamed from: y0 */
    public void m91297y0(long j) throws IOException {
        m91292t0(m91225I(j));
    }

    /* JADX INFO: renamed from: z0 */
    public void m91298z0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m91291s0(bytes.length);
        m91287o0(bytes);
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f65638d = 0;
        this.f65639e = outputStream;
        this.f65635a = bArr;
        this.f65637c = 0;
        this.f65636b = bArr.length;
    }
}
