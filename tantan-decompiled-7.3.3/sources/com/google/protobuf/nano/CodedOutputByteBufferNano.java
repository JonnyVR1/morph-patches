package com.google.protobuf.nano;

import com.tantanapp.common.data.ProtobufAdapter;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import p153l.ghq0;
import p153l.mlk0;
import p153l.pvb;
import p153l.qlk0;
import p153l.wtq0;
import p153l.za50;

/* JADX INFO: loaded from: classes7.dex */
public final class CodedOutputByteBufferNano {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f11656a;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    public CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.f11656a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: b */
    public static int m17275b(int i, boolean z) {
        return m17290q(i) + m17276c(z);
    }

    /* JADX INFO: renamed from: c */
    public static int m17276c(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public static int m17277d(int i, double d) {
        return m17290q(i) + m17278e(d);
    }

    /* JADX INFO: renamed from: e */
    public static int m17278e(double d) {
        return 8;
    }

    /* JADX INFO: renamed from: f */
    public static int m17279f(int i, float f) {
        return m17290q(i) + m17280g(f);
    }

    /* JADX INFO: renamed from: g */
    public static int m17280g(float f) {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m17281h(int i, int i2) {
        return m17290q(i) + m17282i(i2);
    }

    /* JADX INFO: renamed from: i */
    public static int m17282i(int i) {
        if (i >= 0) {
            return m17286m(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: j */
    public static int m17283j(int i, long j) {
        return m17290q(i) + m17284k(j);
    }

    /* JADX INFO: renamed from: k */
    public static int m17284k(long j) {
        return m17287n(j);
    }

    /* JADX INFO: renamed from: l */
    public static <T> int m17285l(int i, T t, ProtobufAdapter<T> protobufAdapter) {
        int iComputeAndCacheSize = protobufAdapter.computeAndCacheSize(t);
        return m17286m(iComputeAndCacheSize) + iComputeAndCacheSize + m17290q(i);
    }

    /* JADX INFO: renamed from: m */
    public static int m17286m(int i) {
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
    public static int m17287n(long j) {
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
    public static int m17288o(int i, String str) {
        return m17290q(i) + m17289p(str);
    }

    /* JADX INFO: renamed from: p */
    public static int m17289p(String str) {
        int iM17294u = m17294u(str);
        return m17286m(iM17294u) + iM17294u;
    }

    /* JADX INFO: renamed from: q */
    public static int m17290q(int i) {
        return m17286m(ghq0.m130259d(i, 0));
    }

    /* JADX INFO: renamed from: r */
    public static int m17291r(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                        qlk0.m177004a(cCharAt2, i6);
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
                    pvb.m173939a("Unpaired surrogate at index ", i5 - 1);
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
    public static void m17292s(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            m17293t(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(m17291r(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m17293t(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                    pvb.m173939a("Unpaired surrogate at index ", i - 1);
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
    public static int m17294u(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iM17295v = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iM17295v += m17295v(charSequence, i);
                break;
            }
            iM17295v += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iM17295v >= length) {
            return iM17295v;
        }
        mlk0.m158922a("UTF-8 length does not fit in int: ", ((long) iM17295v) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public static int m17295v(CharSequence charSequence, int i) {
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
                        za50.m219101a("Unpaired surrogate at index ", i);
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
    public static <T> int m17296w(int i, T t, ProtobufAdapter<T> protobufAdapter) {
        int size = protobufAdapter.getSize(t);
        return m17286m(size) + size + m17290q(i);
    }

    /* JADX INFO: renamed from: x */
    public static CodedOutputByteBufferNano m17297x(byte[] bArr) {
        return m17298y(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: y */
    public static CodedOutputByteBufferNano m17298y(byte[] bArr, int i, int i2) {
        return new CodedOutputByteBufferNano(bArr, i, i2);
    }

    /* JADX INFO: renamed from: A */
    public void m17299A(int i, boolean z) throws IOException {
        m17319U(i, 0);
        m17300B(z);
    }

    /* JADX INFO: renamed from: B */
    public void m17300B(boolean z) throws IOException {
        m17311M(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: C */
    public void m17301C(int i, double d) throws IOException {
        m17319U(i, 1);
        m17302D(d);
    }

    /* JADX INFO: renamed from: D */
    public void m17302D(double d) throws IOException {
        m17313O(Double.doubleToLongBits(d));
    }

    /* JADX INFO: renamed from: E */
    public void m17303E(int i, float f) throws IOException {
        m17319U(i, 5);
        m17304F(f);
    }

    /* JADX INFO: renamed from: F */
    public void m17304F(float f) throws IOException {
        m17312N(Float.floatToIntBits(f));
    }

    /* JADX INFO: renamed from: G */
    public void m17305G(int i, int i2) throws IOException {
        m17319U(i, 0);
        m17306H(i2);
    }

    /* JADX INFO: renamed from: H */
    public void m17306H(int i) throws IOException {
        if (i >= 0) {
            m17314P(i);
        } else {
            m17315Q(i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m17307I(int i, long j) throws IOException {
        m17319U(i, 0);
        m17308J(j);
    }

    /* JADX INFO: renamed from: J */
    public void m17308J(long j) throws IOException {
        m17315Q(j);
    }

    /* JADX INFO: renamed from: K */
    public <T> void m17309K(int i, T t, ProtobufAdapter<T> protobufAdapter) throws IOException {
        m17319U(i, 2);
        m17314P(protobufAdapter.getSize(t));
        protobufAdapter.serialize(t, this);
    }

    /* JADX INFO: renamed from: L */
    public void m17310L(byte b) throws IOException {
        boolean zHasRemaining = this.f11656a.hasRemaining();
        ByteBuffer byteBuffer = this.f11656a;
        if (!zHasRemaining) {
            throw new OutOfSpaceException(byteBuffer.position(), this.f11656a.limit());
        }
        byteBuffer.put(b);
    }

    /* JADX INFO: renamed from: M */
    public void m17311M(int i) throws IOException {
        m17310L((byte) i);
    }

    /* JADX INFO: renamed from: N */
    public void m17312N(int i) throws IOException {
        int iRemaining = this.f11656a.remaining();
        ByteBuffer byteBuffer = this.f11656a;
        if (iRemaining < 4) {
            throw new OutOfSpaceException(byteBuffer.position(), this.f11656a.limit());
        }
        byteBuffer.putInt(i);
    }

    /* JADX INFO: renamed from: O */
    public void m17313O(long j) throws IOException {
        int iRemaining = this.f11656a.remaining();
        ByteBuffer byteBuffer = this.f11656a;
        if (iRemaining < 8) {
            throw new OutOfSpaceException(byteBuffer.position(), this.f11656a.limit());
        }
        byteBuffer.putLong(j);
    }

    /* JADX INFO: renamed from: P */
    public void m17314P(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m17311M((i & 127) | 128);
            i >>>= 7;
        }
        m17311M(i);
    }

    /* JADX INFO: renamed from: Q */
    public void m17315Q(long j) throws IOException {
        while (((-128) & j) != 0) {
            m17311M((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m17311M((int) j);
    }

    /* JADX INFO: renamed from: R */
    public void m17316R(int i, String str) throws IOException {
        m17319U(i, 2);
        m17318T(str);
    }

    /* JADX INFO: renamed from: S */
    public void m17317S(String str) throws IOException {
        m17292s(str, this.f11656a);
    }

    /* JADX INFO: renamed from: T */
    public void m17318T(String str) throws IOException {
        try {
            int iM17286m = m17286m(str.length());
            if (iM17286m != m17286m(str.length() * 3)) {
                m17314P(m17294u(str));
                m17292s(str, this.f11656a);
                return;
            }
            int iPosition = this.f11656a.position();
            if (this.f11656a.remaining() < iM17286m) {
                throw new OutOfSpaceException(iPosition + iM17286m, this.f11656a.limit());
            }
            this.f11656a.position(iPosition + iM17286m);
            m17292s(str, this.f11656a);
            int iPosition2 = this.f11656a.position();
            this.f11656a.position(iPosition);
            m17314P((iPosition2 - iPosition) - iM17286m);
            this.f11656a.position(iPosition2);
        } catch (BufferOverflowException e) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.f11656a.position(), this.f11656a.limit());
            outOfSpaceException.initCause(e);
            throw outOfSpaceException;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m17319U(int i, int i2) throws IOException {
        m17314P(ghq0.m130259d(i, i2));
    }

    /* JADX INFO: renamed from: a */
    public void m17320a() {
        if (m17321z() == 0) {
            return;
        }
        wtq0.m207906a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: z */
    public int m17321z() {
        return this.f11656a.remaining();
    }

    public CodedOutputByteBufferNano(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }
}
