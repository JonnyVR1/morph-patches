package com.google.protobuf.nano;

import com.tantanapp.common.data.ProtobufAdapter;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import p149l.b8q0;
import p149l.bub;
import p149l.gck0;
import p149l.k250;
import p149l.kck0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
public final class CodedOutputByteBufferNano {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f11619a;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    public CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.f11619a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: b */
    public static int m17220b(int i, boolean z) {
        return m17235q(i) + m17221c(z);
    }

    /* JADX INFO: renamed from: c */
    public static int m17221c(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public static int m17222d(int i, double d) {
        return m17235q(i) + m17223e(d);
    }

    /* JADX INFO: renamed from: e */
    public static int m17223e(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: f */
    public static int m17224f(int i, float f) {
        return m17235q(i) + m17225g(f);
    }

    /* JADX INFO: renamed from: g */
    public static int m17225g(float f) {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m17226h(int i, int i2) {
        return m17235q(i) + m17227i(i2);
    }

    /* JADX INFO: renamed from: i */
    public static int m17227i(int i) {
        if (i >= 0) {
            return m17231m(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: j */
    public static int m17228j(int i, long j) {
        return m17235q(i) + m17229k(j);
    }

    /* JADX INFO: renamed from: k */
    public static int m17229k(long j) {
        return m17232n(j);
    }

    /* JADX INFO: renamed from: l */
    public static <T> int m17230l(int i, T t, ProtobufAdapter<T> protobufAdapter) {
        int iComputeAndCacheSize = protobufAdapter.computeAndCacheSize(t);
        return m17231m(iComputeAndCacheSize) + iComputeAndCacheSize + m17235q(i);
    }

    /* JADX INFO: renamed from: m */
    public static int m17231m(int i) {
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

    /* JADX INFO: renamed from: n */
    public static int m17232n(long j) {
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

    /* JADX INFO: renamed from: o */
    public static int m17233o(int i, String str) {
        return m17235q(i) + m17234p(str);
    }

    /* JADX INFO: renamed from: p */
    public static int m17234p(String str) {
        int iM17239u = m17239u(str);
        return m17231m(iM17239u) + iM17239u;
    }

    /* JADX INFO: renamed from: q */
    public static int m17235q(int i) {
        return m17231m(b8q0.m100787d(i, 0));
    }

    /* JADX INFO: renamed from: r */
    public static int m17236r(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int length = charSequence.length();
        int i4 = i2 + i;
        int i5 = 0;
        while (i5 < length && (i3 = i5 + i) < i4 && (cCharAt = charSequence.charAt(i5)) < 128) {
            bArr[i3] = (byte) cCharAt;
            i5++;
        }
        if (i5 == length) {
            return i + length;
        }
        int i6 = i + i5;
        while (i5 < length) {
            char cCharAt2 = charSequence.charAt(i5);
            if (cCharAt2 < 128 && i6 < i4) {
                bArr[i6] = (byte) cCharAt2;
                i6++;
            } else if (cCharAt2 < 2048 && i6 <= i4 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
                i6 += 2;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i6 > i4 - 3) {
                    if (i6 > i4 - 4) {
                        kck0.m145443a(cCharAt2, i6);
                        return 0;
                    }
                    int i8 = i5 + 1;
                    if (i8 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i8);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i6 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i9 = i6 + 3;
                            bArr[i6 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i6 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                            i5 = i8;
                        } else {
                            i5 = i8;
                        }
                    }
                    bub.m103905a("Unpaired surrogate at index ", i5 - 1);
                    return 0;
                }
                bArr[i6] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i10 = i6 + 2;
                bArr[i6 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i6 += 3;
                bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i5++;
        }
        return i6;
    }

    /* JADX INFO: renamed from: s */
    public static void m17237s(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            m17238t(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(m17236r(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m17238t(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                byteBuffer.put((byte) cCharAt);
            } else if (cCharAt < 2048) {
                byteBuffer.put((byte) ((cCharAt >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            } else {
                if (cCharAt >= 55296 && 57343 >= cCharAt) {
                    int i2 = i + 1;
                    if (i2 != charSequence.length()) {
                        char cCharAt2 = charSequence.charAt(i2);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i = i2;
                        } else {
                            i = i2;
                        }
                    }
                    bub.m103905a("Unpaired surrogate at index ", i - 1);
                    return;
                }
                byteBuffer.put((byte) ((cCharAt >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m17239u(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iM17240v = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iM17240v += m17240v(charSequence, i);
                break;
            }
            iM17240v += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iM17240v >= length) {
            return iM17240v;
        }
        gck0.m125517a("UTF-8 length does not fit in int: ", ((long) iM17240v) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public static int m17240v(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        k250.m144273a("Unpaired surrogate at index ", i);
                        return 0;
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: w */
    public static <T> int m17241w(int i, T t, ProtobufAdapter<T> protobufAdapter) {
        int size = protobufAdapter.getSize(t);
        return m17231m(size) + size + m17235q(i);
    }

    /* JADX INFO: renamed from: x */
    public static CodedOutputByteBufferNano m17242x(byte[] bArr) {
        return m17243y(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: y */
    public static CodedOutputByteBufferNano m17243y(byte[] bArr, int i, int i2) {
        return new CodedOutputByteBufferNano(bArr, i, i2);
    }

    /* JADX INFO: renamed from: A */
    public void m17244A(int i, boolean z) throws IOException {
        m17264U(i, 0);
        m17245B(z);
    }

    /* JADX INFO: renamed from: B */
    public void m17245B(boolean z) throws IOException {
        m17256M(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: C */
    public void m17246C(int i, double d) throws IOException {
        m17264U(i, 1);
        m17247D(d);
    }

    /* JADX INFO: renamed from: D */
    public void m17247D(double d) throws IOException {
        m17258O(Double.doubleToLongBits(d));
    }

    /* JADX INFO: renamed from: E */
    public void m17248E(int i, float f) throws IOException {
        m17264U(i, 5);
        m17249F(f);
    }

    /* JADX INFO: renamed from: F */
    public void m17249F(float f) throws IOException {
        m17257N(Float.floatToIntBits(f));
    }

    /* JADX INFO: renamed from: G */
    public void m17250G(int i, int i2) throws IOException {
        m17264U(i, 0);
        m17251H(i2);
    }

    /* JADX INFO: renamed from: H */
    public void m17251H(int i) throws IOException {
        if (i >= 0) {
            m17259P(i);
        } else {
            m17260Q(i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m17252I(int i, long j) throws IOException {
        m17264U(i, 0);
        m17253J(j);
    }

    /* JADX INFO: renamed from: J */
    public void m17253J(long j) throws IOException {
        m17260Q(j);
    }

    /* JADX INFO: renamed from: K */
    public <T> void m17254K(int i, T t, ProtobufAdapter<T> protobufAdapter) throws IOException {
        m17264U(i, 2);
        m17259P(protobufAdapter.getSize(t));
        protobufAdapter.serialize(t, this);
    }

    /* JADX INFO: renamed from: L */
    public void m17255L(byte b) throws IOException {
        boolean zHasRemaining = this.f11619a.hasRemaining();
        ByteBuffer byteBuffer = this.f11619a;
        if (!zHasRemaining) {
            throw new OutOfSpaceException(byteBuffer.position(), this.f11619a.limit());
        }
        byteBuffer.put(b);
    }

    /* JADX INFO: renamed from: M */
    public void m17256M(int i) throws IOException {
        m17255L((byte) i);
    }

    /* JADX INFO: renamed from: N */
    public void m17257N(int i) throws IOException {
        int iRemaining = this.f11619a.remaining();
        ByteBuffer byteBuffer = this.f11619a;
        if (iRemaining < 4) {
            throw new OutOfSpaceException(byteBuffer.position(), this.f11619a.limit());
        }
        byteBuffer.putInt(i);
    }

    /* JADX INFO: renamed from: O */
    public void m17258O(long j) throws IOException {
        int iRemaining = this.f11619a.remaining();
        ByteBuffer byteBuffer = this.f11619a;
        if (iRemaining < 8) {
            throw new OutOfSpaceException(byteBuffer.position(), this.f11619a.limit());
        }
        byteBuffer.putLong(j);
    }

    /* JADX INFO: renamed from: P */
    public void m17259P(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m17256M((i & 127) | 128);
            i >>>= 7;
        }
        m17256M(i);
    }

    /* JADX INFO: renamed from: Q */
    public void m17260Q(long j) throws IOException {
        while (((-128) & j) != 0) {
            m17256M((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m17256M((int) j);
    }

    /* JADX INFO: renamed from: R */
    public void m17261R(int i, String str) throws IOException {
        m17264U(i, 2);
        m17263T(str);
    }

    /* JADX INFO: renamed from: S */
    public void m17262S(String str) throws IOException {
        m17237s(str, this.f11619a);
    }

    /* JADX INFO: renamed from: T */
    public void m17263T(String str) throws IOException {
        try {
            int iM17231m = m17231m(str.length());
            if (iM17231m != m17231m(str.length() * 3)) {
                m17259P(m17239u(str));
                m17237s(str, this.f11619a);
                return;
            }
            int iPosition = this.f11619a.position();
            if (this.f11619a.remaining() < iM17231m) {
                throw new OutOfSpaceException(iPosition + iM17231m, this.f11619a.limit());
            }
            this.f11619a.position(iPosition + iM17231m);
            m17237s(str, this.f11619a);
            int iPosition2 = this.f11619a.position();
            this.f11619a.position(iPosition);
            m17259P((iPosition2 - iPosition) - iM17231m);
            this.f11619a.position(iPosition2);
        } catch (BufferOverflowException e) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.f11619a.position(), this.f11619a.limit());
            outOfSpaceException.initCause(e);
            throw outOfSpaceException;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m17264U(int i, int i2) throws IOException {
        m17259P(b8q0.m100787d(i, i2));
    }

    /* JADX INFO: renamed from: a */
    public void m17265a() {
        if (m17266z() == 0) {
            return;
        }
        qkq0.m175383a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: z */
    public int m17266z() {
        return this.f11619a.remaining();
    }

    public CodedOutputByteBufferNano(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }
}
