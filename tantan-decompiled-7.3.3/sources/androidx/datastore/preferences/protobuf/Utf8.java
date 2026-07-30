package androidx.datastore.preferences.protobuf;

import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import p153l.aqg0;
import p153l.lyj0;
import p153l.mlk0;
import p153l.qlk0;
import p153l.sn0;
import p153l.zg3;

/* JADX INFO: loaded from: classes.dex */
public final class Utf8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0308b f1594a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$a */
    public static class C0307a {
        /* JADX INFO: renamed from: h */
        public static void m1715h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m1720m(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m1720m(b3) || m1720m(b4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iM1725r = ((b & 7) << 18) | (m1725r(b2) << 12) | (m1725r(b3) << 6) | m1725r(b4);
            cArr[i] = m1719l(iM1725r);
            cArr[i + 1] = m1724q(iM1725r);
        }

        /* JADX INFO: renamed from: i */
        public static void m1716i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: renamed from: j */
        public static void m1717j(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m1720m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m1720m(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | (m1725r(b2) << 6) | m1725r(b3));
        }

        /* JADX INFO: renamed from: k */
        public static void m1718k(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || m1720m(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | m1725r(b2));
        }

        /* JADX INFO: renamed from: l */
        public static char m1719l(int i) {
            return (char) ((i >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        /* JADX INFO: renamed from: m */
        public static boolean m1720m(byte b) {
            return b > -65;
        }

        /* JADX INFO: renamed from: n */
        public static boolean m1721n(byte b) {
            return b >= 0;
        }

        /* JADX INFO: renamed from: o */
        public static boolean m1722o(byte b) {
            return b < -16;
        }

        /* JADX INFO: renamed from: p */
        public static boolean m1723p(byte b) {
            return b < -32;
        }

        /* JADX INFO: renamed from: q */
        public static char m1724q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        /* JADX INFO: renamed from: r */
        public static int m1725r(byte b) {
            return b & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$b */
    public static abstract class AbstractC0308b {
        /* JADX INFO: renamed from: j */
        public static int m1726j(ByteBuffer byteBuffer, int i, int i2) {
            int iM1697l = i + Utf8.m1697l(byteBuffer, i, i2);
            while (iM1697l < i2) {
                int i3 = iM1697l + 1;
                byte b = byteBuffer.get(iM1697l);
                if (b >= 0) {
                    iM1697l = i3;
                } else if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b < -62 || byteBuffer.get(i3) > -65) {
                        return -1;
                    }
                    iM1697l += 2;
                } else {
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.m1701p(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = iM1697l + 2;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = iM1697l + 3;
                            if (byteBuffer.get(i4) <= -65) {
                                iM1697l += 4;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.m1701p(byteBuffer, b, i3, i2 - i3);
                    }
                    int i6 = iM1697l + 2;
                    byte b3 = byteBuffer.get(i3);
                    if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                        return -1;
                    }
                    iM1697l += 3;
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public final String m1727a(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return mo1728b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            return byteBuffer.isDirect() ? mo1730d(byteBuffer, i, i2) : m1729c(byteBuffer, i, i2);
        }

        /* JADX INFO: renamed from: b */
        public abstract String mo1728b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        /* JADX INFO: renamed from: c */
        public final String m1729c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                zg3.m219589a("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!C0307a.m1721n(b)) {
                    break;
                }
                i++;
                C0307a.m1716i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (C0307a.m1721n(b2)) {
                    int i7 = i5 + 1;
                    C0307a.m1716i(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = byteBuffer.get(i8);
                        if (!C0307a.m1721n(b3)) {
                            break;
                        }
                        i8++;
                        C0307a.m1716i(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (C0307a.m1723p(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    C0307a.m1718k(b2, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (C0307a.m1722o(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    C0307a.m1717j(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    C0307a.m1715h(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        /* JADX INFO: renamed from: d */
        public abstract String mo1730d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        /* JADX INFO: renamed from: e */
        public abstract int mo1731e(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* JADX INFO: renamed from: f */
        public final boolean m1732f(ByteBuffer byteBuffer, int i, int i2) {
            return m1734h(0, byteBuffer, i, i2) == 0;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m1733g(byte[] bArr, int i, int i2) {
            return mo1735i(0, bArr, i, i2) == 0;
        }

        /* JADX INFO: renamed from: h */
        public final int m1734h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo1737l(i, byteBuffer, i2, i3) : m1736k(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return mo1735i(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        /* JADX INFO: renamed from: i */
        public abstract int mo1735i(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r7.get(r8) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r7.get(r8) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r7.get(r6) > (-65)) goto L53;
         */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m1736k(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte b;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i6 = i2 + 1;
                        byte b4 = byteBuffer.get(i2);
                        if (i6 >= i3) {
                            return Utf8.m1699n(b2, b4);
                        }
                        i2 = i6;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = byteBuffer.get(i2);
                    if (i4 >= i3) {
                        return Utf8.m1699n(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i7 = i4 + 1;
                    byte b6 = byteBuffer.get(i4);
                    if (i7 >= i3) {
                        return Utf8.m1700o(b2, b5, b6);
                    }
                    b = b6;
                    i4 = i7;
                }
                if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                    i2 = i4 + 1;
                }
                return -1;
                i2 = i5;
            }
            return m1726j(byteBuffer, i2, i3);
        }

        /* JADX INFO: renamed from: l */
        public abstract int mo1737l(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$c */
    public static final class C0309c extends AbstractC0308b {
        /* JADX INFO: renamed from: m */
        public static int m1738m(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m1739n(bArr, i, i2);
        }

        /* JADX INFO: renamed from: n */
        public static int m1739n(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.m1702q(bArr, i3, i2);
                        }
                        int i4 = i + 2;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = i + 3;
                            if (bArr[i4] <= -65) {
                                i += 4;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.m1702q(bArr, i3, i2);
                    }
                    int i6 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i += 3;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: b */
        public String mo1728b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                zg3.m219589a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!C0307a.m1721n(b)) {
                    break;
                }
                i++;
                C0307a.m1716i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (C0307a.m1721n(b2)) {
                    int i7 = i5 + 1;
                    C0307a.m1716i(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (!C0307a.m1721n(b3)) {
                            break;
                        }
                        i8++;
                        C0307a.m1716i(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (C0307a.m1723p(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    C0307a.m1718k(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (C0307a.m1722o(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    C0307a.m1717j(b2, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b4 = bArr[i6];
                    int i10 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    C0307a.m1715h(b2, b4, b5, bArr[i10], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: d */
        public String mo1730d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return m1729c(byteBuffer, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: e */
        public int mo1731e(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = charSequence.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = charSequence.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = charSequence.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i6, length);
                            }
                            qlk0.m177004a(cCharAt2, i7);
                            return 0;
                        }
                        int i9 = i6 + 1;
                        if (i9 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new UnpairedSurrogateException(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                }
                i6++;
            }
            return i7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r7[r8] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r7[r8] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r7[r6] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo1735i(int i, byte[] bArr, int i2, int i3) {
            byte b;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i6 = i2 + 1;
                        byte b4 = bArr[i2];
                        if (i6 >= i3) {
                            return Utf8.m1699n(b2, b4);
                        }
                        i2 = i6;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                }
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = bArr[i2];
                    if (i4 >= i3) {
                        return Utf8.m1699n(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i7 = i4 + 1;
                    byte b6 = bArr[i4];
                    if (i7 >= i3) {
                        return Utf8.m1700o(b2, b5, b6);
                    }
                    b = b6;
                    i4 = i7;
                }
                if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                    i2 = i4 + 1;
                }
                return -1;
                i2 = i5;
            }
            return m1738m(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: l */
        public int mo1737l(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return m1736k(i, byteBuffer, i2, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$d */
    public static final class C0310d extends AbstractC0308b {
        /* JADX INFO: renamed from: m */
        public static boolean m1740m() {
            return lyj0.m156301G() && lyj0.m156302H();
        }

        /* JADX INFO: renamed from: n */
        public static int m1741n(long j, int i) {
            int iM1743p = m1743p(j, i);
            long j2 = j + ((long) iM1743p);
            int i2 = i - iM1743p;
            while (true) {
                byte bM156337u = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bM156337u = lyj0.m156337u(j2);
                    if (bM156337u < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bM156337u < -32) {
                    if (i3 == 0) {
                        return bM156337u;
                    }
                    i2 -= 2;
                    if (bM156337u >= -62) {
                        long j4 = 1 + j2;
                        if (lyj0.m156337u(j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bM156337u >= -16) {
                    if (i3 < 3) {
                        return m1745r(j2, bM156337u, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bM156337u2 = lyj0.m156337u(j2);
                    if (bM156337u2 <= -65 && (((bM156337u << 28) + (bM156337u2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (lyj0.m156337u(j5) <= -65) {
                            j2 += 3;
                            if (lyj0.m156337u(j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return m1745r(j2, bM156337u, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bM156337u3 = lyj0.m156337u(j2);
                if (bM156337u3 <= -65 && ((bM156337u != -32 || bM156337u3 >= -96) && (bM156337u != -19 || bM156337u3 < -96))) {
                    j2 += 2;
                    if (lyj0.m156337u(j7) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: o */
        public static int m1742o(byte[] bArr, long j, int i) {
            int iM1744q = m1744q(bArr, j, i);
            int i2 = i - iM1744q;
            long j2 = j + ((long) iM1744q);
            while (true) {
                byte bM156338v = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bM156338v = lyj0.m156338v(bArr, j2);
                    if (bM156338v < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bM156338v < -32) {
                    if (i3 == 0) {
                        return bM156338v;
                    }
                    i2 -= 2;
                    if (bM156338v >= -62) {
                        long j4 = 1 + j2;
                        if (lyj0.m156338v(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bM156338v >= -16) {
                    if (i3 < 3) {
                        return m1746s(bArr, bM156338v, j2, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bM156338v2 = lyj0.m156338v(bArr, j2);
                    if (bM156338v2 <= -65 && (((bM156338v << 28) + (bM156338v2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (lyj0.m156338v(bArr, j5) <= -65) {
                            j2 += 3;
                            if (lyj0.m156338v(bArr, j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return m1746s(bArr, bM156338v, j2, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bM156338v3 = lyj0.m156338v(bArr, j2);
                if (bM156338v3 <= -65 && ((bM156338v != -32 || bM156338v3 >= -96) && (bM156338v != -19 || bM156338v3 < -96))) {
                    j2 += 2;
                    if (lyj0.m156338v(bArr, j7) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: p */
        public static int m1743p(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (lyj0.m156337u(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (lyj0.m156296B(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX INFO: renamed from: q */
        public static int m1744q(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (lyj0.m156338v(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        /* JADX INFO: renamed from: r */
        public static int m1745r(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.m1698m(i);
            }
            if (i2 == 1) {
                return Utf8.m1699n(i, lyj0.m156337u(j));
            }
            if (i2 == 2) {
                return Utf8.m1700o(i, lyj0.m156337u(j), lyj0.m156337u(j + 1));
            }
            aqg0.m99478a();
            return 0;
        }

        /* JADX INFO: renamed from: s */
        public static int m1746s(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.m1698m(i);
            }
            if (i2 == 1) {
                return Utf8.m1699n(i, lyj0.m156338v(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.m1700o(i, lyj0.m156338v(bArr, j), lyj0.m156338v(bArr, j + 1));
            }
            aqg0.m99478a();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: b */
        public String mo1728b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                zg3.m219589a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte bM156338v = lyj0.m156338v(bArr, i);
                if (!C0307a.m1721n(bM156338v)) {
                    break;
                }
                i++;
                C0307a.m1716i(bM156338v, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte bM156338v2 = lyj0.m156338v(bArr, i);
                if (C0307a.m1721n(bM156338v2)) {
                    int i7 = i5 + 1;
                    C0307a.m1716i(bM156338v2, cArr, i5);
                    while (i6 < i3) {
                        byte bM156338v3 = lyj0.m156338v(bArr, i6);
                        if (!C0307a.m1721n(bM156338v3)) {
                            break;
                        }
                        i6++;
                        C0307a.m1716i(bM156338v3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (C0307a.m1723p(bM156338v2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    C0307a.m1718k(bM156338v2, lyj0.m156338v(bArr, i6), cArr, i5);
                    i5++;
                } else if (C0307a.m1722o(bM156338v2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i + 2;
                    i += 3;
                    C0307a.m1717j(bM156338v2, lyj0.m156338v(bArr, i6), lyj0.m156338v(bArr, i8), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte bM156338v4 = lyj0.m156338v(bArr, i6);
                    int i9 = i + 3;
                    byte bM156338v5 = lyj0.m156338v(bArr, i + 2);
                    i += 4;
                    C0307a.m1715h(bM156338v2, bM156338v4, bM156338v5, lyj0.m156338v(bArr, i9), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: d */
        public String mo1730d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                zg3.m219589a("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            long jM156325i = lyj0.m156325i(byteBuffer) + ((long) i);
            long j = ((long) i2) + jM156325i;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (jM156325i < j) {
                byte bM156337u = lyj0.m156337u(jM156325i);
                if (!C0307a.m1721n(bM156337u)) {
                    break;
                }
                jM156325i++;
                C0307a.m1716i(bM156337u, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (jM156325i < j) {
                long j2 = jM156325i + 1;
                byte bM156337u2 = lyj0.m156337u(jM156325i);
                if (C0307a.m1721n(bM156337u2)) {
                    int i5 = i4 + 1;
                    C0307a.m1716i(bM156337u2, cArr, i4);
                    long j3 = j2;
                    while (j3 < j) {
                        byte bM156337u3 = lyj0.m156337u(j3);
                        if (!C0307a.m1721n(bM156337u3)) {
                            break;
                        }
                        j3++;
                        C0307a.m1716i(bM156337u3, cArr, i5);
                        i5++;
                    }
                    i4 = i5;
                    jM156325i = j3;
                } else if (C0307a.m1723p(bM156337u2)) {
                    if (j2 >= j) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jM156325i += 2;
                    C0307a.m1718k(bM156337u2, lyj0.m156337u(j2), cArr, i4);
                    i4++;
                } else if (C0307a.m1722o(bM156337u2)) {
                    if (j2 >= j - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j4 = 2 + jM156325i;
                    jM156325i += 3;
                    C0307a.m1717j(bM156337u2, lyj0.m156337u(j2), lyj0.m156337u(j4), cArr, i4);
                    i4++;
                } else {
                    if (j2 >= j - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte bM156337u4 = lyj0.m156337u(j2);
                    long j5 = jM156325i + 3;
                    byte bM156337u5 = lyj0.m156337u(2 + jM156325i);
                    jM156325i += 4;
                    C0307a.m1715h(bM156337u2, bM156337u4, bM156337u5, lyj0.m156337u(j5), cArr, i4);
                    i4 += 2;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: e */
        public int mo1731e(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = ((long) i2) + j4;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                lyj0.m156307M(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 < 128 && j4 < j5) {
                    lyj0.m156307M(bArr, j4, (byte) cCharAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                lyj0.m156307M(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                lyj0.m156307M(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                lyj0.m156307M(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                lyj0.m156307M(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new UnpairedSurrogateException(i4 - 1, length);
                    }
                    lyj0.m156307M(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    lyj0.m156307M(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j4 += 3;
                    lyj0.m156307M(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    lyj0.m156307M(bArr, j4, (byte) ((cCharAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                    j4 += 2;
                    lyj0.m156307M(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (p153l.lyj0.m156338v(r12, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (p153l.lyj0.m156338v(r12, r1) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo1735i(int i, byte[] bArr, int i2, int i3) {
            long j;
            byte bM156338v = 0;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                zg3.m219589a("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)});
                return 0;
            }
            long j2 = i2;
            long j3 = i3;
            if (i != 0) {
                if (j2 >= j3) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        long j4 = 1 + j2;
                        if (lyj0.m156338v(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bM156338v2 = (byte) (~(i >> 8));
                    if (bM156338v2 == 0) {
                        long j5 = j2 + 1;
                        bM156338v2 = lyj0.m156338v(bArr, j2);
                        if (j5 >= j3) {
                            return Utf8.m1699n(b, bM156338v2);
                        }
                        j2 = j5;
                    }
                    if (bM156338v2 <= -65 && ((b != -32 || bM156338v2 >= -96) && (b != -19 || bM156338v2 < -96))) {
                        j = j2 + 1;
                    }
                    return -1;
                }
                byte bM156338v3 = (byte) (~(i >> 8));
                if (bM156338v3 == 0) {
                    long j6 = j2 + 1;
                    bM156338v3 = lyj0.m156338v(bArr, j2);
                    if (j6 >= j3) {
                        return Utf8.m1699n(b, bM156338v3);
                    }
                    j2 = j6;
                } else {
                    bM156338v = (byte) (i >> 16);
                }
                if (bM156338v == 0) {
                    long j7 = j2 + 1;
                    bM156338v = lyj0.m156338v(bArr, j2);
                    if (j7 >= j3) {
                        return Utf8.m1700o(b, bM156338v3, bM156338v);
                    }
                    j2 = j7;
                }
                if (bM156338v3 <= -65 && (((b << 28) + (bM156338v3 + 112)) >> 30) == 0 && bM156338v <= -65) {
                    j = j2 + 1;
                }
                return -1;
                j2 = j;
            }
            return m1742o(bArr, j2, (int) (j3 - j2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (p153l.lyj0.m156337u(r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (p153l.lyj0.m156337u(r1) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0308b
        /* JADX INFO: renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo1737l(int i, ByteBuffer byteBuffer, int i2, int i3) {
            long j;
            byte bM156337u = 0;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                zg3.m219589a("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)});
                return 0;
            }
            long jM156325i = lyj0.m156325i(byteBuffer) + ((long) i2);
            long j2 = ((long) (i3 - i2)) + jM156325i;
            if (i != 0) {
                if (jM156325i >= j2) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        long j3 = 1 + jM156325i;
                        if (lyj0.m156337u(jM156325i) <= -65) {
                            jM156325i = j3;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bM156337u2 = (byte) (~(i >> 8));
                    if (bM156337u2 == 0) {
                        long j4 = jM156325i + 1;
                        bM156337u2 = lyj0.m156337u(jM156325i);
                        if (j4 >= j2) {
                            return Utf8.m1699n(b, bM156337u2);
                        }
                        jM156325i = j4;
                    }
                    if (bM156337u2 <= -65 && ((b != -32 || bM156337u2 >= -96) && (b != -19 || bM156337u2 < -96))) {
                        j = jM156325i + 1;
                    }
                    return -1;
                }
                byte bM156337u3 = (byte) (~(i >> 8));
                if (bM156337u3 == 0) {
                    long j5 = jM156325i + 1;
                    bM156337u3 = lyj0.m156337u(jM156325i);
                    if (j5 >= j2) {
                        return Utf8.m1699n(b, bM156337u3);
                    }
                    jM156325i = j5;
                } else {
                    bM156337u = (byte) (i >> 16);
                }
                if (bM156337u == 0) {
                    long j6 = jM156325i + 1;
                    bM156337u = lyj0.m156337u(jM156325i);
                    if (j6 >= j2) {
                        return Utf8.m1700o(b, bM156337u3, bM156337u);
                    }
                    jM156325i = j6;
                }
                if (bM156337u3 <= -65 && (((b << 28) + (bM156337u3 + 112)) >> 30) == 0 && bM156337u <= -65) {
                    j = jM156325i + 1;
                }
                return -1;
                jM156325i = j;
            }
            return m1741n(jM156325i, (int) (j2 - jM156325i));
        }
    }

    static {
        f1594a = (!C0310d.m1740m() || sn0.m186857c()) ? new C0309c() : new C0310d();
    }

    /* JADX INFO: renamed from: g */
    public static String m1692g(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return f1594a.m1727a(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static String m1693h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return f1594a.mo1728b(bArr, i, i2);
    }

    /* JADX INFO: renamed from: i */
    public static int m1694i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f1594a.mo1731e(charSequence, bArr, i, i2);
    }

    /* JADX INFO: renamed from: j */
    public static int m1695j(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iM1696k = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iM1696k += m1696k(charSequence, i);
                break;
            }
            iM1696k += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iM1696k >= length) {
            return iM1696k;
        }
        mlk0.m158922a("UTF-8 length does not fit in int: ", ((long) iM1696k) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static int m1696k(CharSequence charSequence, int i) {
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
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public static int m1697l(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: m */
    public static int m1698m(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: n */
    public static int m1699n(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: o */
    public static int m1700o(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: renamed from: p */
    public static int m1701p(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return m1698m(i);
        }
        if (i3 == 1) {
            return m1699n(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return m1700o(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        aqg0.m99478a();
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public static int m1702q(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m1698m(b);
        }
        if (i3 == 1) {
            return m1699n(b, bArr[i]);
        }
        if (i3 == 2) {
            return m1700o(b, bArr[i], bArr[i + 1]);
        }
        aqg0.m99478a();
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1703r(ByteBuffer byteBuffer) {
        return f1594a.m1732f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1704s(byte[] bArr) {
        return f1594a.m1733g(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1705t(byte[] bArr, int i, int i2) {
        return f1594a.m1733g(bArr, i, i2);
    }

    /* JADX INFO: renamed from: u */
    public static int m1706u(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return f1594a.m1734h(i, byteBuffer, i2, i3);
    }

    /* JADX INFO: renamed from: v */
    public static int m1707v(int i, byte[] bArr, int i2, int i3) {
        return f1594a.mo1735i(i, bArr, i2, i3);
    }
}
