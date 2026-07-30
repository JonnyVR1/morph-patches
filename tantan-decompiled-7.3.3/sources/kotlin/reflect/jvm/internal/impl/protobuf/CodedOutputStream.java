package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import p153l.pr3;
import p153l.vtq0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f66309a;

    /* JADX INFO: renamed from: b */
    public final int f66310b;

    /* JADX INFO: renamed from: c */
    public int f66311c;

    /* JADX INFO: renamed from: d */
    public int f66312d;

    /* JADX INFO: renamed from: e */
    public final OutputStream f66313e;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(byte[] bArr, int i, int i2) {
        this.f66312d = 0;
        this.f66313e = null;
        this.f66309a = bArr;
        this.f66311c = i;
        this.f66310b = i + i2;
    }

    /* JADX INFO: renamed from: A */
    public static int m92108A(int i) {
        return m92141w(m92115H(i));
    }

    /* JADX INFO: renamed from: B */
    public static int m92109B(int i, long j) {
        return m92112E(i) + m92110C(j);
    }

    /* JADX INFO: renamed from: C */
    public static int m92110C(long j) {
        return m92142x(m92116I(j));
    }

    /* JADX INFO: renamed from: D */
    public static int m92111D(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m92141w(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            vtq0.m202761a("UTF-8 not supported.", e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: E */
    public static int m92112E(int i) {
        return m92141w(WireFormat.m92263c(i, 0));
    }

    /* JADX INFO: renamed from: F */
    public static int m92113F(int i) {
        return m92141w(i);
    }

    /* JADX INFO: renamed from: G */
    public static int m92114G(long j) {
        return m92142x(j);
    }

    /* JADX INFO: renamed from: H */
    public static int m92115H(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: I */
    public static long m92116I(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX INFO: renamed from: K */
    public static CodedOutputStream m92117K(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: L */
    public static CodedOutputStream m92118L(byte[] bArr) {
        return m92119M(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: M */
    public static CodedOutputStream m92119M(byte[] bArr, int i, int i2) {
        return new CodedOutputStream(bArr, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static int m92120b(int i, boolean z) {
        return m92112E(i) + m92121c(z);
    }

    /* JADX INFO: renamed from: c */
    public static int m92121c(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public static int m92122d(byte[] bArr) {
        return m92141w(bArr.length) + bArr.length;
    }

    /* JADX INFO: renamed from: e */
    public static int m92123e(int i, ByteString byteString) {
        return m92112E(i) + m92124f(byteString);
    }

    /* JADX INFO: renamed from: f */
    public static int m92124f(ByteString byteString) {
        return m92141w(byteString.size()) + byteString.size();
    }

    /* JADX INFO: renamed from: g */
    public static int m92125g(int i, double d) {
        return m92112E(i) + m92126h(d);
    }

    /* JADX INFO: renamed from: h */
    public static int m92126h(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: i */
    public static int m92127i(int i, int i2) {
        return m92112E(i) + m92128j(i2);
    }

    /* JADX INFO: renamed from: j */
    public static int m92128j(int i) {
        return m92135q(i);
    }

    /* JADX INFO: renamed from: k */
    public static int m92129k(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: l */
    public static int m92130l(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m92131m(int i, float f) {
        return m92112E(i) + m92132n(f);
    }

    /* JADX INFO: renamed from: n */
    public static int m92132n(float f) {
        return 4;
    }

    /* JADX INFO: renamed from: o */
    public static int m92133o(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    /* JADX INFO: renamed from: p */
    public static int m92134p(int i, int i2) {
        return m92112E(i) + m92135q(i2);
    }

    /* JADX INFO: renamed from: q */
    public static int m92135q(int i) {
        if (i >= 0) {
            return m92141w(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: r */
    public static int m92136r(long j) {
        return m92142x(j);
    }

    /* JADX INFO: renamed from: s */
    public static int m92137s(LazyFieldLite lazyFieldLite) {
        int iM92243b = lazyFieldLite.m92243b();
        return m92141w(iM92243b) + iM92243b;
    }

    /* JADX INFO: renamed from: t */
    public static int m92138t(int i, MessageLite messageLite) {
        return m92112E(i) + m92139u(messageLite);
    }

    /* JADX INFO: renamed from: u */
    public static int m92139u(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return m92141w(serializedSize) + serializedSize;
    }

    /* JADX INFO: renamed from: v */
    public static int m92140v(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* JADX INFO: renamed from: w */
    public static int m92141w(int i) {
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
    public static int m92142x(long j) {
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
    public static int m92143y(int i) {
        return 4;
    }

    /* JADX INFO: renamed from: z */
    public static int m92144z(long j) {
        return 8;
    }

    /* JADX INFO: renamed from: A0 */
    public void m92145A0(int i, int i2) throws IOException {
        m92182s0(WireFormat.m92263c(i, i2));
    }

    /* JADX INFO: renamed from: B0 */
    public void m92146B0(int i, int i2) throws IOException {
        m92145A0(i, 0);
        m92147C0(i2);
    }

    /* JADX INFO: renamed from: C0 */
    public void m92147C0(int i) throws IOException {
        m92182s0(i);
    }

    /* JADX INFO: renamed from: D0 */
    public void m92148D0(long j) throws IOException {
        m92183t0(j);
    }

    /* JADX INFO: renamed from: J */
    public void m92149J() throws IOException {
        if (this.f66313e != null) {
            m92150N();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m92150N() throws IOException {
        OutputStream outputStream = this.f66313e;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f66309a, 0, this.f66311c);
        this.f66311c = 0;
    }

    /* JADX INFO: renamed from: O */
    public int m92151O() {
        if (this.f66313e == null) {
            return this.f66310b - this.f66311c;
        }
        pr3.m173429a("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        return 0;
    }

    /* JADX INFO: renamed from: P */
    public void m92152P(int i, boolean z) throws IOException {
        m92145A0(i, 0);
        m92153Q(z);
    }

    /* JADX INFO: renamed from: Q */
    public void m92153Q(boolean z) throws IOException {
        m92175l0(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: R */
    public void m92154R(byte[] bArr) throws IOException {
        m92182s0(bArr.length);
        m92178o0(bArr);
    }

    /* JADX INFO: renamed from: S */
    public void m92155S(int i, ByteString byteString) throws IOException {
        m92145A0(i, 2);
        m92156T(byteString);
    }

    /* JADX INFO: renamed from: T */
    public void m92156T(ByteString byteString) throws IOException {
        m92182s0(byteString.size());
        m92176m0(byteString);
    }

    /* JADX INFO: renamed from: U */
    public void m92157U(int i, double d) throws IOException {
        m92145A0(i, 1);
        m92158V(d);
    }

    /* JADX INFO: renamed from: V */
    public void m92158V(double d) throws IOException {
        m92181r0(Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: W */
    public void m92159W(int i, int i2) throws IOException {
        m92145A0(i, 0);
        m92160X(i2);
    }

    /* JADX INFO: renamed from: X */
    public void m92160X(int i) throws IOException {
        m92169f0(i);
    }

    /* JADX INFO: renamed from: Y */
    public void m92161Y(int i) throws IOException {
        m92180q0(i);
    }

    /* JADX INFO: renamed from: Z */
    public void m92162Z(long j) throws IOException {
        m92181r0(j);
    }

    /* JADX INFO: renamed from: a */
    public void m92163a() {
        if (m92151O() == 0) {
            return;
        }
        wtq0.m207906a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: a0 */
    public void m92164a0(int i, float f) throws IOException {
        m92145A0(i, 5);
        m92165b0(f);
    }

    /* JADX INFO: renamed from: b0 */
    public void m92165b0(float f) throws IOException {
        m92180q0(Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: c0 */
    public void m92166c0(int i, MessageLite messageLite) throws IOException {
        m92145A0(i, 3);
        m92167d0(messageLite);
        m92145A0(i, 4);
    }

    /* JADX INFO: renamed from: d0 */
    public void m92167d0(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    /* JADX INFO: renamed from: e0 */
    public void m92168e0(int i, int i2) throws IOException {
        m92145A0(i, 0);
        m92169f0(i2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m92169f0(int i) throws IOException {
        if (i >= 0) {
            m92182s0(i);
        } else {
            m92183t0(i);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m92170g0(long j) throws IOException {
        m92183t0(j);
    }

    /* JADX INFO: renamed from: h0 */
    public void m92171h0(int i, MessageLite messageLite) throws IOException {
        m92145A0(i, 2);
        m92172i0(messageLite);
    }

    /* JADX INFO: renamed from: i0 */
    public void m92172i0(MessageLite messageLite) throws IOException {
        m92182s0(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    /* JADX INFO: renamed from: j0 */
    public void m92173j0(int i, MessageLite messageLite) throws IOException {
        m92145A0(1, 3);
        m92146B0(2, i);
        m92171h0(3, messageLite);
        m92145A0(1, 4);
    }

    /* JADX INFO: renamed from: k0 */
    public void m92174k0(byte b) throws IOException {
        if (this.f66311c == this.f66310b) {
            m92150N();
        }
        byte[] bArr = this.f66309a;
        int i = this.f66311c;
        this.f66311c = i + 1;
        bArr[i] = b;
        this.f66312d++;
    }

    /* JADX INFO: renamed from: l0 */
    public void m92175l0(int i) throws IOException {
        m92174k0((byte) i);
    }

    /* JADX INFO: renamed from: m0 */
    public void m92176m0(ByteString byteString) throws IOException {
        m92177n0(byteString, 0, byteString.size());
    }

    /* JADX INFO: renamed from: n0 */
    public void m92177n0(ByteString byteString, int i, int i2) throws IOException {
        int i3 = this.f66310b;
        int i4 = this.f66311c;
        int i5 = i3 - i4;
        byte[] bArr = this.f66309a;
        if (i5 >= i2) {
            byteString.m92048j(bArr, i, i4, i2);
            this.f66311c += i2;
            this.f66312d += i2;
            return;
        }
        int i6 = i3 - i4;
        byteString.m92048j(bArr, i, i4, i6);
        int i7 = i + i6;
        int i8 = i2 - i6;
        this.f66311c = this.f66310b;
        this.f66312d += i6;
        m92150N();
        if (i8 <= this.f66310b) {
            byteString.m92048j(this.f66309a, i7, 0, i8);
            this.f66311c = i8;
        } else {
            byteString.m92045E(this.f66313e, i7, i8);
        }
        this.f66312d += i8;
    }

    /* JADX INFO: renamed from: o0 */
    public void m92178o0(byte[] bArr) throws IOException {
        m92179p0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: p0 */
    public void m92179p0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f66310b;
        int i4 = this.f66311c;
        int i5 = i3 - i4;
        byte[] bArr2 = this.f66309a;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f66311c += i2;
            this.f66312d += i2;
            return;
        }
        int i6 = i3 - i4;
        System.arraycopy(bArr, i, bArr2, i4, i6);
        int i7 = i + i6;
        int i8 = i2 - i6;
        this.f66311c = this.f66310b;
        this.f66312d += i6;
        m92150N();
        if (i8 <= this.f66310b) {
            System.arraycopy(bArr, i7, this.f66309a, 0, i8);
            this.f66311c = i8;
        } else {
            this.f66313e.write(bArr, i7, i8);
        }
        this.f66312d += i8;
    }

    /* JADX INFO: renamed from: q0 */
    public void m92180q0(int i) throws IOException {
        m92175l0(i & 255);
        m92175l0((i >> 8) & 255);
        m92175l0((i >> 16) & 255);
        m92175l0((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: r0 */
    public void m92181r0(long j) throws IOException {
        m92175l0(((int) j) & 255);
        m92175l0(((int) (j >> 8)) & 255);
        m92175l0(((int) (j >> 16)) & 255);
        m92175l0(((int) (j >> 24)) & 255);
        m92175l0(((int) (j >> 32)) & 255);
        m92175l0(((int) (j >> 40)) & 255);
        m92175l0(((int) (j >> 48)) & 255);
        m92175l0(((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: s0 */
    public void m92182s0(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m92175l0((i & 127) | 128);
            i >>>= 7;
        }
        m92175l0(i);
    }

    /* JADX INFO: renamed from: t0 */
    public void m92183t0(long j) throws IOException {
        while (((-128) & j) != 0) {
            m92175l0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m92175l0((int) j);
    }

    /* JADX INFO: renamed from: u0 */
    public void m92184u0(int i) throws IOException {
        m92180q0(i);
    }

    /* JADX INFO: renamed from: v0 */
    public void m92185v0(long j) throws IOException {
        m92181r0(j);
    }

    /* JADX INFO: renamed from: w0 */
    public void m92186w0(int i) throws IOException {
        m92182s0(m92115H(i));
    }

    /* JADX INFO: renamed from: x0 */
    public void m92187x0(int i, long j) throws IOException {
        m92145A0(i, 0);
        m92188y0(j);
    }

    /* JADX INFO: renamed from: y0 */
    public void m92188y0(long j) throws IOException {
        m92183t0(m92116I(j));
    }

    /* JADX INFO: renamed from: z0 */
    public void m92189z0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m92182s0(bytes.length);
        m92178o0(bytes);
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f66312d = 0;
        this.f66313e = outputStream;
        this.f66309a = bArr;
        this.f66311c = 0;
        this.f66310b = bArr.length;
    }
}
