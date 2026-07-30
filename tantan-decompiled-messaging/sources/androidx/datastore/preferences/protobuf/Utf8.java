package androidx.datastore.preferences.protobuf;

import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import p149l.gck0;
import p149l.ipj0;
import p149l.kck0;
import p149l.lg3;
import p149l.shg0;
import p149l.wn0;

/* JADX INFO: loaded from: classes.dex */
public final class Utf8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0307b f1594a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$a */
    public static class C0306a {
        /* JADX INFO: renamed from: h */
        public static void m1714h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m1719m(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m1719m(b3) || m1719m(b4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iM1724r = ((b & 7) << 18) | (m1724r(b2) << 12) | (m1724r(b3) << 6) | m1724r(b4);
            cArr[i] = m1718l(iM1724r);
            cArr[i + 1] = m1723q(iM1724r);
        }

        /* JADX INFO: renamed from: i */
        public static void m1715i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: renamed from: j */
        public static void m1716j(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m1719m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m1719m(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | (m1724r(b2) << 6) | m1724r(b3));
        }

        /* JADX INFO: renamed from: k */
        public static void m1717k(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || m1719m(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | m1724r(b2));
        }

        /* JADX INFO: renamed from: l */
        public static char m1718l(int i) {
            return (char) ((i >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        /* JADX INFO: renamed from: m */
        public static boolean m1719m(byte b) {
            return b > -65;
        }

        /* JADX INFO: renamed from: n */
        public static boolean m1720n(byte b) {
            return b >= 0;
        }

        /* JADX INFO: renamed from: o */
        public static boolean m1721o(byte b) {
            return b < -16;
        }

        /* JADX INFO: renamed from: p */
        public static boolean m1722p(byte b) {
            return b < -32;
        }

        /* JADX INFO: renamed from: q */
        public static char m1723q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        /* JADX INFO: renamed from: r */
        public static int m1724r(byte b) {
            return b & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$b */
    public static abstract class AbstractC0307b {
        /* JADX INFO: renamed from: j */
        public static int m1725j(ByteBuffer byteBuffer, int i, int i2) {
            int iM1696l = i + Utf8.m1696l(byteBuffer, i, i2);
            while (iM1696l < i2) {
                int i3 = iM1696l + 1;
                byte b = byteBuffer.get(iM1696l);
                if (b >= 0) {
                    iM1696l = i3;
                } else if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b < -62 || byteBuffer.get(i3) > -65) {
                        return -1;
                    }
                    iM1696l += 2;
                } else {
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.m1700p(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = iM1696l + 2;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = iM1696l + 3;
                            if (byteBuffer.get(i4) <= -65) {
                                iM1696l += 4;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.m1700p(byteBuffer, b, i3, i2 - i3);
                    }
                    int i6 = iM1696l + 2;
                    byte b3 = byteBuffer.get(i3);
                    if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                        return -1;
                    }
                    iM1696l += 3;
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public final String m1726a(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return mo1727b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            return byteBuffer.isDirect() ? mo1729d(byteBuffer, i, i2) : m1728c(byteBuffer, i, i2);
        }

        /* JADX INFO: renamed from: b */
        public abstract String mo1727b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        /* JADX INFO: renamed from: c */
        public final String m1728c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                lg3.m149750a("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!C0306a.m1720n(b)) {
                    break;
                }
                i++;
                C0306a.m1715i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (C0306a.m1720n(b2)) {
                    int i7 = i5 + 1;
                    C0306a.m1715i(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = byteBuffer.get(i8);
                        if (!C0306a.m1720n(b3)) {
                            break;
                        }
                        i8++;
                        C0306a.m1715i(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (C0306a.m1722p(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    C0306a.m1717k(b2, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (C0306a.m1721o(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    C0306a.m1716j(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    C0306a.m1714h(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        /* JADX INFO: renamed from: d */
        public abstract String mo1729d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        /* JADX INFO: renamed from: e */
        public abstract int mo1730e(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* JADX INFO: renamed from: f */
        public final boolean m1731f(ByteBuffer byteBuffer, int i, int i2) {
            return m1733h(0, byteBuffer, i, i2) == 0;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m1732g(byte[] bArr, int i, int i2) {
            return mo1734i(0, bArr, i, i2) == 0;
        }

        /* JADX INFO: renamed from: h */
        public final int m1733h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo1736l(i, byteBuffer, i2, i3) : m1735k(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return mo1734i(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        /* JADX INFO: renamed from: i */
        public abstract int mo1734i(int i, byte[] bArr, int i2, int i3);

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
            To view partially-correct add '--show-bad-code' argument
        */
        public final int m1735k(int r6, java.nio.ByteBuffer r7, int r8, int r9) {
            /*
                r5 = this;
                if (r6 == 0) goto L92
                if (r8 < r9) goto L5
                return r6
            L5:
                byte r5 = (byte) r6
                r0 = -32
                r1 = -1
                r2 = -65
                if (r5 >= r0) goto L1e
                r6 = -62
                if (r5 < r6) goto L1d
                int r5 = r8 + 1
                byte r6 = r7.get(r8)
                if (r6 <= r2) goto L1a
                goto L1d
            L1a:
                r8 = r5
                goto L92
            L1d:
                return r1
            L1e:
                r3 = -16
                if (r5 >= r3) goto L4f
                int r6 = r6 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L38
                int r6 = r8 + 1
                byte r8 = r7.get(r8)
                if (r6 < r9) goto L35
                int r5 = androidx.datastore.preferences.protobuf.Utf8.m1685a(r5, r8)
                return r5
            L35:
                r4 = r8
                r8 = r6
                r6 = r4
            L38:
                if (r6 > r2) goto L4e
                r3 = -96
                if (r5 != r0) goto L40
                if (r6 < r3) goto L4e
            L40:
                r0 = -19
                if (r5 != r0) goto L46
                if (r6 >= r3) goto L4e
            L46:
                int r5 = r8 + 1
                byte r6 = r7.get(r8)
                if (r6 <= r2) goto L1a
            L4e:
                return r1
            L4f:
                int r0 = r6 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L64
                int r6 = r8 + 1
                byte r0 = r7.get(r8)
                if (r6 < r9) goto L62
                int r5 = androidx.datastore.preferences.protobuf.Utf8.m1685a(r5, r0)
                return r5
            L62:
                r8 = 0
                goto L6a
            L64:
                int r6 = r6 >> 16
                byte r6 = (byte) r6
                r4 = r8
                r8 = r6
                r6 = r4
            L6a:
                if (r8 != 0) goto L7c
                int r8 = r6 + 1
                byte r6 = r7.get(r6)
                if (r8 < r9) goto L79
                int r5 = androidx.datastore.preferences.protobuf.Utf8.m1686b(r5, r0, r6)
                return r5
            L79:
                r4 = r8
                r8 = r6
                r6 = r4
            L7c:
                if (r0 > r2) goto L91
                int r5 = r5 << 28
                int r0 = r0 + 112
                int r5 = r5 + r0
                int r5 = r5 >> 30
                if (r5 != 0) goto L91
                if (r8 > r2) goto L91
                int r8 = r6 + 1
                byte r5 = r7.get(r6)
                if (r5 <= r2) goto L92
            L91:
                return r1
            L92:
                int r5 = m1725j(r7, r8, r9)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b.m1735k(int, java.nio.ByteBuffer, int, int):int");
        }

        /* JADX INFO: renamed from: l */
        public abstract int mo1736l(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$c */
    public static final class C0308c extends AbstractC0307b {
        /* JADX INFO: renamed from: m */
        public static int m1737m(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m1738n(bArr, i, i2);
        }

        /* JADX INFO: renamed from: n */
        public static int m1738n(byte[] bArr, int i, int i2) {
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
                            return Utf8.m1701q(bArr, i3, i2);
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
                        return Utf8.m1701q(bArr, i3, i2);
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

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: b */
        public String mo1727b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                lg3.m149750a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!C0306a.m1720n(b)) {
                    break;
                }
                i++;
                C0306a.m1715i(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (C0306a.m1720n(b2)) {
                    int i7 = i5 + 1;
                    C0306a.m1715i(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (!C0306a.m1720n(b3)) {
                            break;
                        }
                        i8++;
                        C0306a.m1715i(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (C0306a.m1722p(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    C0306a.m1717k(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (C0306a.m1721o(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    C0306a.m1716j(b2, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b4 = bArr[i6];
                    int i10 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    C0306a.m1714h(b2, b4, b5, bArr[i10], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: d */
        public String mo1729d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return m1728c(byteBuffer, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: e */
        public int mo1730e(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                            kck0.m145443a(cCharAt2, i7);
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
        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo1734i(int r6, byte[] r7, int r8, int r9) {
            /*
                r5 = this;
                if (r6 == 0) goto L86
                if (r8 < r9) goto L5
                return r6
            L5:
                byte r5 = (byte) r6
                r0 = -32
                r1 = -1
                r2 = -65
                if (r5 >= r0) goto L1c
                r6 = -62
                if (r5 < r6) goto L1b
                int r5 = r8 + 1
                r6 = r7[r8]
                if (r6 <= r2) goto L18
                goto L1b
            L18:
                r8 = r5
                goto L86
            L1b:
                return r1
            L1c:
                r3 = -16
                if (r5 >= r3) goto L49
                int r6 = r6 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L34
                int r6 = r8 + 1
                r8 = r7[r8]
                if (r6 < r9) goto L31
                int r5 = androidx.datastore.preferences.protobuf.Utf8.m1685a(r5, r8)
                return r5
            L31:
                r4 = r8
                r8 = r6
                r6 = r4
            L34:
                if (r6 > r2) goto L48
                r3 = -96
                if (r5 != r0) goto L3c
                if (r6 < r3) goto L48
            L3c:
                r0 = -19
                if (r5 != r0) goto L42
                if (r6 >= r3) goto L48
            L42:
                int r5 = r8 + 1
                r6 = r7[r8]
                if (r6 <= r2) goto L18
            L48:
                return r1
            L49:
                int r0 = r6 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L5c
                int r6 = r8 + 1
                r0 = r7[r8]
                if (r6 < r9) goto L5a
                int r5 = androidx.datastore.preferences.protobuf.Utf8.m1685a(r5, r0)
                return r5
            L5a:
                r8 = 0
                goto L62
            L5c:
                int r6 = r6 >> 16
                byte r6 = (byte) r6
                r4 = r8
                r8 = r6
                r6 = r4
            L62:
                if (r8 != 0) goto L72
                int r8 = r6 + 1
                r6 = r7[r6]
                if (r8 < r9) goto L6f
                int r5 = androidx.datastore.preferences.protobuf.Utf8.m1686b(r5, r0, r6)
                return r5
            L6f:
                r4 = r8
                r8 = r6
                r6 = r4
            L72:
                if (r0 > r2) goto L85
                int r5 = r5 << 28
                int r0 = r0 + 112
                int r5 = r5 + r0
                int r5 = r5 >> 30
                if (r5 != 0) goto L85
                if (r8 > r2) goto L85
                int r8 = r6 + 1
                r5 = r7[r6]
                if (r5 <= r2) goto L86
            L85:
                return r1
            L86:
                int r5 = m1737m(r7, r8, r9)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C0308c.mo1734i(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: l */
        public int mo1736l(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return m1735k(i, byteBuffer, i2, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$d */
    public static final class C0309d extends AbstractC0307b {
        /* JADX INFO: renamed from: m */
        public static boolean m1739m() {
            return ipj0.m137496G() && ipj0.m137497H();
        }

        /* JADX INFO: renamed from: n */
        public static int m1740n(long j, int i) {
            int iM1742p = m1742p(j, i);
            long j2 = j + ((long) iM1742p);
            int i2 = i - iM1742p;
            while (true) {
                byte bM137532u = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bM137532u = ipj0.m137532u(j2);
                    if (bM137532u < 0) {
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
                if (bM137532u < -32) {
                    if (i3 == 0) {
                        return bM137532u;
                    }
                    i2 -= 2;
                    if (bM137532u >= -62) {
                        long j4 = 1 + j2;
                        if (ipj0.m137532u(j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bM137532u >= -16) {
                    if (i3 < 3) {
                        return m1744r(j2, bM137532u, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bM137532u2 = ipj0.m137532u(j2);
                    if (bM137532u2 <= -65 && (((bM137532u << 28) + (bM137532u2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (ipj0.m137532u(j5) <= -65) {
                            j2 += 3;
                            if (ipj0.m137532u(j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return m1744r(j2, bM137532u, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bM137532u3 = ipj0.m137532u(j2);
                if (bM137532u3 <= -65 && ((bM137532u != -32 || bM137532u3 >= -96) && (bM137532u != -19 || bM137532u3 < -96))) {
                    j2 += 2;
                    if (ipj0.m137532u(j7) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: o */
        public static int m1741o(byte[] bArr, long j, int i) {
            int iM1743q = m1743q(bArr, j, i);
            int i2 = i - iM1743q;
            long j2 = j + ((long) iM1743q);
            while (true) {
                byte bM137533v = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bM137533v = ipj0.m137533v(bArr, j2);
                    if (bM137533v < 0) {
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
                if (bM137533v < -32) {
                    if (i3 == 0) {
                        return bM137533v;
                    }
                    i2 -= 2;
                    if (bM137533v >= -62) {
                        long j4 = 1 + j2;
                        if (ipj0.m137533v(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bM137533v >= -16) {
                    if (i3 < 3) {
                        return m1745s(bArr, bM137533v, j2, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bM137533v2 = ipj0.m137533v(bArr, j2);
                    if (bM137533v2 <= -65 && (((bM137533v << 28) + (bM137533v2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (ipj0.m137533v(bArr, j5) <= -65) {
                            j2 += 3;
                            if (ipj0.m137533v(bArr, j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return m1745s(bArr, bM137533v, j2, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bM137533v3 = ipj0.m137533v(bArr, j2);
                if (bM137533v3 <= -65 && ((bM137533v != -32 || bM137533v3 >= -96) && (bM137533v != -19 || bM137533v3 < -96))) {
                    j2 += 2;
                    if (ipj0.m137533v(bArr, j7) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: p */
        public static int m1742p(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (ipj0.m137532u(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (ipj0.m137491B(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX INFO: renamed from: q */
        public static int m1743q(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (ipj0.m137533v(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        /* JADX INFO: renamed from: r */
        public static int m1744r(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.m1697m(i);
            }
            if (i2 == 1) {
                return Utf8.m1698n(i, ipj0.m137532u(j));
            }
            if (i2 == 2) {
                return Utf8.m1699o(i, ipj0.m137532u(j), ipj0.m137532u(j + 1));
            }
            shg0.m184191a();
            return 0;
        }

        /* JADX INFO: renamed from: s */
        public static int m1745s(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.m1697m(i);
            }
            if (i2 == 1) {
                return Utf8.m1698n(i, ipj0.m137533v(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.m1699o(i, ipj0.m137533v(bArr, j), ipj0.m137533v(bArr, j + 1));
            }
            shg0.m184191a();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: b */
        public String mo1727b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                lg3.m149750a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte bM137533v = ipj0.m137533v(bArr, i);
                if (!C0306a.m1720n(bM137533v)) {
                    break;
                }
                i++;
                C0306a.m1715i(bM137533v, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte bM137533v2 = ipj0.m137533v(bArr, i);
                if (C0306a.m1720n(bM137533v2)) {
                    int i7 = i5 + 1;
                    C0306a.m1715i(bM137533v2, cArr, i5);
                    while (i6 < i3) {
                        byte bM137533v3 = ipj0.m137533v(bArr, i6);
                        if (!C0306a.m1720n(bM137533v3)) {
                            break;
                        }
                        i6++;
                        C0306a.m1715i(bM137533v3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (C0306a.m1722p(bM137533v2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    C0306a.m1717k(bM137533v2, ipj0.m137533v(bArr, i6), cArr, i5);
                    i5++;
                } else if (C0306a.m1721o(bM137533v2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i + 2;
                    i += 3;
                    C0306a.m1716j(bM137533v2, ipj0.m137533v(bArr, i6), ipj0.m137533v(bArr, i8), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte bM137533v4 = ipj0.m137533v(bArr, i6);
                    int i9 = i + 3;
                    byte bM137533v5 = ipj0.m137533v(bArr, i + 2);
                    i += 4;
                    C0306a.m1714h(bM137533v2, bM137533v4, bM137533v5, ipj0.m137533v(bArr, i9), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: d */
        public String mo1729d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                lg3.m149750a("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            long jM137520i = ipj0.m137520i(byteBuffer) + ((long) i);
            long j = ((long) i2) + jM137520i;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (jM137520i < j) {
                byte bM137532u = ipj0.m137532u(jM137520i);
                if (!C0306a.m1720n(bM137532u)) {
                    break;
                }
                jM137520i++;
                C0306a.m1715i(bM137532u, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (jM137520i < j) {
                long j2 = jM137520i + 1;
                byte bM137532u2 = ipj0.m137532u(jM137520i);
                if (C0306a.m1720n(bM137532u2)) {
                    int i5 = i4 + 1;
                    C0306a.m1715i(bM137532u2, cArr, i4);
                    long j3 = j2;
                    while (j3 < j) {
                        byte bM137532u3 = ipj0.m137532u(j3);
                        if (!C0306a.m1720n(bM137532u3)) {
                            break;
                        }
                        j3++;
                        C0306a.m1715i(bM137532u3, cArr, i5);
                        i5++;
                    }
                    i4 = i5;
                    jM137520i = j3;
                } else if (C0306a.m1722p(bM137532u2)) {
                    if (j2 >= j) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jM137520i += 2;
                    C0306a.m1717k(bM137532u2, ipj0.m137532u(j2), cArr, i4);
                    i4++;
                } else if (C0306a.m1721o(bM137532u2)) {
                    if (j2 >= j - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j4 = 2 + jM137520i;
                    jM137520i += 3;
                    C0306a.m1716j(bM137532u2, ipj0.m137532u(j2), ipj0.m137532u(j4), cArr, i4);
                    i4++;
                } else {
                    if (j2 >= j - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte bM137532u4 = ipj0.m137532u(j2);
                    long j5 = jM137520i + 3;
                    byte bM137532u5 = ipj0.m137532u(2 + jM137520i);
                    jM137520i += 4;
                    C0306a.m1714h(bM137532u2, bM137532u4, bM137532u5, ipj0.m137532u(j5), cArr, i4);
                    i4 += 2;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: e */
        public int mo1730e(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                ipj0.m137502M(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 < 128 && j4 < j5) {
                    ipj0.m137502M(bArr, j4, (byte) cCharAt2);
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
                                ipj0.m137502M(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                ipj0.m137502M(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                ipj0.m137502M(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                ipj0.m137502M(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new UnpairedSurrogateException(i4 - 1, length);
                    }
                    ipj0.m137502M(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    ipj0.m137502M(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j4 += 3;
                    ipj0.m137502M(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    ipj0.m137502M(bArr, j4, (byte) ((cCharAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                    j4 += 2;
                    ipj0.m137502M(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (p149l.ipj0.m137533v(r12, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (p149l.ipj0.m137533v(r12, r1) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo1734i(int r11, byte[] r12, int r13, int r14) {
            /*
                r10 = this;
                r10 = r13 | r14
                int r0 = r12.length
                int r0 = r0 - r14
                r10 = r10 | r0
                r0 = 0
                if (r10 < 0) goto La8
                long r1 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto La1
                int r10 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
                if (r10 < 0) goto L11
                return r11
            L11:
                byte r10 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r10 >= r3) goto L2b
                r11 = -62
                if (r10 < r11) goto L2a
                long r6 = r6 + r1
                byte r10 = p149l.ipj0.m137533v(r12, r1)
                if (r10 <= r5) goto L27
                goto L2a
            L27:
                r1 = r6
                goto La1
            L2a:
                return r4
            L2b:
                r8 = -16
                if (r10 >= r8) goto L5f
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L45
                long r8 = r1 + r6
                byte r11 = p149l.ipj0.m137533v(r12, r1)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L44
                int r10 = androidx.datastore.preferences.protobuf.Utf8.m1685a(r10, r11)
                return r10
            L44:
                r1 = r8
            L45:
                if (r11 > r5) goto L5e
                r0 = -96
                if (r10 != r3) goto L4d
                if (r11 < r0) goto L5e
            L4d:
                r3 = -19
                if (r10 != r3) goto L53
                if (r11 >= r0) goto L5e
            L53:
                long r10 = r1 + r6
                byte r0 = p149l.ipj0.m137533v(r12, r1)
                if (r0 <= r5) goto L5c
                goto L5e
            L5c:
                r1 = r10
                goto La1
            L5e:
                return r4
            L5f:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L76
                long r8 = r1 + r6
                byte r3 = p149l.ipj0.m137533v(r12, r1)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L74
                int r10 = androidx.datastore.preferences.protobuf.Utf8.m1685a(r10, r3)
                return r10
            L74:
                r1 = r8
                goto L79
            L76:
                int r11 = r11 >> 16
                byte r0 = (byte) r11
            L79:
                if (r0 != 0) goto L8b
                long r8 = r1 + r6
                byte r0 = p149l.ipj0.m137533v(r12, r1)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L8a
                int r10 = androidx.datastore.preferences.protobuf.Utf8.m1686b(r10, r3, r0)
                return r10
            L8a:
                r1 = r8
            L8b:
                if (r3 > r5) goto La0
                int r10 = r10 << 28
                int r3 = r3 + 112
                int r10 = r10 + r3
                int r10 = r10 >> 30
                if (r10 != 0) goto La0
                if (r0 > r5) goto La0
                long r10 = r1 + r6
                byte r0 = p149l.ipj0.m137533v(r12, r1)
                if (r0 <= r5) goto L5c
            La0:
                return r4
            La1:
                long r13 = r13 - r1
                int r10 = (int) r13
                int r10 = m1741o(r12, r1, r10)
                return r10
            La8:
                int r10 = r12.length
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r10 = new java.lang.Object[]{r10, r11, r12}
                java.lang.String r11 = "Array length=%d, index=%d, limit=%d"
                p149l.lg3.m149750a(r11, r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C0309d.mo1734i(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (p149l.ipj0.m137532u(r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (p149l.ipj0.m137532u(r1) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0307b
        /* JADX INFO: renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo1736l(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C0309d.mo1736l(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f1594a = (!C0309d.m1739m() || wn0.m204554c()) ? new C0308c() : new C0309d();
    }

    /* JADX INFO: renamed from: g */
    public static String m1691g(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return f1594a.m1726a(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static String m1692h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return f1594a.mo1727b(bArr, i, i2);
    }

    /* JADX INFO: renamed from: i */
    public static int m1693i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f1594a.mo1730e(charSequence, bArr, i, i2);
    }

    /* JADX INFO: renamed from: j */
    public static int m1694j(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iM1695k = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iM1695k += m1695k(charSequence, i);
                break;
            }
            iM1695k += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iM1695k >= length) {
            return iM1695k;
        }
        gck0.m125517a("UTF-8 length does not fit in int: ", ((long) iM1695k) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static int m1695k(CharSequence charSequence, int i) {
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
    public static int m1696l(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: m */
    public static int m1697m(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: n */
    public static int m1698n(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: o */
    public static int m1699o(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: renamed from: p */
    public static int m1700p(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return m1697m(i);
        }
        if (i3 == 1) {
            return m1698n(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return m1699o(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        shg0.m184191a();
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public static int m1701q(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m1697m(b);
        }
        if (i3 == 1) {
            return m1698n(b, bArr[i]);
        }
        if (i3 == 2) {
            return m1699o(b, bArr[i], bArr[i + 1]);
        }
        shg0.m184191a();
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1702r(ByteBuffer byteBuffer) {
        return f1594a.m1731f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1703s(byte[] bArr) {
        return f1594a.m1732g(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1704t(byte[] bArr, int i, int i2) {
        return f1594a.m1732g(bArr, i, i2);
    }

    /* JADX INFO: renamed from: u */
    public static int m1705u(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return f1594a.m1733h(i, byteBuffer, i2, i3);
    }

    /* JADX INFO: renamed from: v */
    public static int m1706v(int i, byte[] bArr, int i2, int i3) {
        return f1594a.mo1734i(i, bArr, i2, i3);
    }
}
