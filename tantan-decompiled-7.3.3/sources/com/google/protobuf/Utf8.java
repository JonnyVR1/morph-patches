package com.google.protobuf;

import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import p153l.aqg0;
import p153l.kyj0;
import p153l.mlk0;
import p153l.qlk0;
import p153l.zg3;

/* JADX INFO: loaded from: classes7.dex */
public final class Utf8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3415a f11598a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Utf8$a */
    public static abstract class AbstractC3415a {
        /* JADX INFO: renamed from: f */
        public static int m17110f(ByteBuffer byteBuffer, int i, int i2) {
            int iM17100j = i + Utf8.m17100j(byteBuffer, i, i2);
            while (iM17100j < i2) {
                int i3 = iM17100j + 1;
                byte b = byteBuffer.get(iM17100j);
                if (b >= 0) {
                    iM17100j = i3;
                } else if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b < -62 || byteBuffer.get(i3) > -65) {
                        return -1;
                    }
                    iM17100j += 2;
                } else {
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.m17104n(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = iM17100j + 2;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = iM17100j + 3;
                            if (byteBuffer.get(i4) <= -65) {
                                iM17100j += 4;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.m17104n(byteBuffer, b, i3, i2 - i3);
                    }
                    int i6 = iM17100j + 2;
                    byte b3 = byteBuffer.get(i3);
                    if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                        return -1;
                    }
                    iM17100j += 3;
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo17111a(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* JADX INFO: renamed from: b */
        public final boolean m17112b(ByteBuffer byteBuffer, int i, int i2) {
            return m17114d(0, byteBuffer, i, i2) == 0;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m17113c(byte[] bArr, int i, int i2) {
            return mo17115e(0, bArr, i, i2) == 0;
        }

        /* JADX INFO: renamed from: d */
        public final int m17114d(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo17117h(i, byteBuffer, i2, i3) : m17116g(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return mo17115e(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        /* JADX INFO: renamed from: e */
        public abstract int mo17115e(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r7.get(r8) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r7.get(r8) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r7.get(r6) > (-65)) goto L53;
         */
        /* JADX INFO: renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m17116g(int i, ByteBuffer byteBuffer, int i2, int i3) {
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
                            return Utf8.m17102l(b2, b4);
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
                        return Utf8.m17102l(b2, b5);
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
                        return Utf8.m17103m(b2, b5, b6);
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
            return m17110f(byteBuffer, i2, i3);
        }

        /* JADX INFO: renamed from: h */
        public abstract int mo17117h(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Utf8$b */
    public static final class C3416b extends AbstractC3415a {
        /* JADX INFO: renamed from: i */
        public static int m17118i(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m17119j(bArr, i, i2);
        }

        /* JADX INFO: renamed from: j */
        public static int m17119j(byte[] bArr, int i, int i2) {
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
                            return Utf8.m17105o(bArr, i3, i2);
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
                        return Utf8.m17105o(bArr, i3, i2);
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

        @Override // com.google.protobuf.Utf8.AbstractC3415a
        /* JADX INFO: renamed from: a */
        public int mo17111a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
        @Override // com.google.protobuf.Utf8.AbstractC3415a
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo17115e(int i, byte[] bArr, int i2, int i3) {
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
                            return Utf8.m17102l(b2, b4);
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
                        return Utf8.m17102l(b2, b5);
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
                        return Utf8.m17103m(b2, b5, b6);
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
            return m17118i(bArr, i2, i3);
        }

        @Override // com.google.protobuf.Utf8.AbstractC3415a
        /* JADX INFO: renamed from: h */
        public int mo17117h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return m17116g(i, byteBuffer, i2, i3);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Utf8$c */
    public static final class C3417c extends AbstractC3415a {
        /* JADX INFO: renamed from: i */
        public static boolean m17120i() {
            return kyj0.m151990k() && kyj0.m151991l();
        }

        /* JADX INFO: renamed from: j */
        public static int m17121j(long j, int i) {
            int iM17123l = m17123l(j, i);
            long j2 = j + ((long) iM17123l);
            int i2 = i - iM17123l;
            while (true) {
                byte bM151985f = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bM151985f = kyj0.m151985f(j2);
                    if (bM151985f < 0) {
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
                if (bM151985f < -32) {
                    if (i3 == 0) {
                        return bM151985f;
                    }
                    i2 -= 2;
                    if (bM151985f >= -62) {
                        long j4 = 1 + j2;
                        if (kyj0.m151985f(j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bM151985f >= -16) {
                    if (i3 < 3) {
                        return m17125n(j2, bM151985f, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bM151985f2 = kyj0.m151985f(j2);
                    if (bM151985f2 <= -65 && (((bM151985f << 28) + (bM151985f2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (kyj0.m151985f(j5) <= -65) {
                            j2 += 3;
                            if (kyj0.m151985f(j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return m17125n(j2, bM151985f, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bM151985f3 = kyj0.m151985f(j2);
                if (bM151985f3 <= -65 && ((bM151985f != -32 || bM151985f3 >= -96) && (bM151985f != -19 || bM151985f3 < -96))) {
                    j2 += 2;
                    if (kyj0.m151985f(j7) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: k */
        public static int m17122k(byte[] bArr, long j, int i) {
            int iM17124m = m17124m(bArr, j, i);
            int i2 = i - iM17124m;
            long j2 = j + ((long) iM17124m);
            while (true) {
                byte bM151986g = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bM151986g = kyj0.m151986g(bArr, j2);
                    if (bM151986g < 0) {
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
                if (bM151986g < -32) {
                    if (i3 == 0) {
                        return bM151986g;
                    }
                    i2 -= 2;
                    if (bM151986g >= -62) {
                        long j4 = 1 + j2;
                        if (kyj0.m151986g(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bM151986g >= -16) {
                    if (i3 < 3) {
                        return m17126o(bArr, bM151986g, j2, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bM151986g2 = kyj0.m151986g(bArr, j2);
                    if (bM151986g2 <= -65 && (((bM151986g << 28) + (bM151986g2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (kyj0.m151986g(bArr, j5) <= -65) {
                            j2 += 3;
                            if (kyj0.m151986g(bArr, j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return m17126o(bArr, bM151986g, j2, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bM151986g3 = kyj0.m151986g(bArr, j2);
                if (bM151986g3 <= -65 && ((bM151986g != -32 || bM151986g3 >= -96) && (bM151986g != -19 || bM151986g3 < -96))) {
                    j2 += 2;
                    if (kyj0.m151986g(bArr, j7) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: l */
        public static int m17123l(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = ((int) j) & 7;
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (kyj0.m151985f(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (kyj0.m151987h(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX INFO: renamed from: m */
        public static int m17124m(byte[] bArr, long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = ((int) j) & 7;
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (kyj0.m151986g(bArr, j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (kyj0.m151988i(bArr, j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX INFO: renamed from: n */
        public static int m17125n(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.m17101k(i);
            }
            if (i2 == 1) {
                return Utf8.m17102l(i, kyj0.m151985f(j));
            }
            if (i2 == 2) {
                return Utf8.m17103m(i, kyj0.m151985f(j), kyj0.m151985f(j + 1));
            }
            aqg0.m99478a();
            return 0;
        }

        /* JADX INFO: renamed from: o */
        public static int m17126o(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.m17101k(i);
            }
            if (i2 == 1) {
                return Utf8.m17102l(i, kyj0.m151986g(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.m17103m(i, kyj0.m151986g(bArr, j), kyj0.m151986g(bArr, j + 1));
            }
            aqg0.m99478a();
            return 0;
        }

        @Override // com.google.protobuf.Utf8.AbstractC3415a
        /* JADX INFO: renamed from: a */
        public int mo17111a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            long jM151984e;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long jM151984e2 = kyj0.m151984e() + ((long) i);
            long j4 = ((long) i2) + jM151984e2;
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
                kyj0.m151992m(bArr, jM151984e2, (byte) cCharAt);
                i4++;
                jM151984e2 = 1 + jM151984e2;
            }
            if (i4 == length) {
                jM151984e = kyj0.m151984e();
            } else {
                while (i4 < length) {
                    char cCharAt2 = charSequence.charAt(i4);
                    if (cCharAt2 < 128 && jM151984e2 < j4) {
                        kyj0.m151992m(bArr, jM151984e2, (byte) cCharAt2);
                        j3 = j4;
                        j2 = j;
                        jM151984e2 += j;
                    } else if (cCharAt2 >= 2048 || jM151984e2 > j4 - 2) {
                        j2 = j;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jM151984e2 > j4 - 3) {
                            j3 = j4;
                            if (jM151984e2 > j3 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                    throw new UnpairedSurrogateException(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jM151984e2);
                            }
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    kyj0.m151992m(bArr, jM151984e2, (byte) ((codePoint >>> 18) | 240));
                                    kyj0.m151992m(bArr, jM151984e2 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j5 = jM151984e2 + 3;
                                    kyj0.m151992m(bArr, jM151984e2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jM151984e2 += 4;
                                    kyj0.m151992m(bArr, j5, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new UnpairedSurrogateException(i4 - 1, length);
                        }
                        kyj0.m151992m(bArr, jM151984e2, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j6 = jM151984e2 + 2;
                        j3 = j4;
                        kyj0.m151992m(bArr, jM151984e2 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jM151984e2 += 3;
                        kyj0.m151992m(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        j2 = j;
                        long j7 = jM151984e2 + j2;
                        kyj0.m151992m(bArr, jM151984e2, (byte) ((cCharAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                        jM151984e2 += 2;
                        kyj0.m151992m(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                        j3 = j4;
                    }
                    i4++;
                    j = j2;
                    j4 = j3;
                }
                jM151984e = kyj0.m151984e();
            }
            return (int) (jM151984e2 - jM151984e);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (p153l.kyj0.m151986g(r12, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (p153l.kyj0.m151986g(r12, r1) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.AbstractC3415a
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo17115e(int i, byte[] bArr, int i2, int i3) {
            long j;
            byte bM151986g = 0;
            if ((i2 | i3 | (bArr.length - i3)) < 0) {
                zg3.m219589a("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)});
                return 0;
            }
            long jM151984e = kyj0.m151984e() + ((long) i2);
            long jM151984e2 = kyj0.m151984e() + ((long) i3);
            if (i != 0) {
                if (jM151984e >= jM151984e2) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        long j2 = 1 + jM151984e;
                        if (kyj0.m151986g(bArr, jM151984e) <= -65) {
                            jM151984e = j2;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bM151986g2 = (byte) (~(i >> 8));
                    if (bM151986g2 == 0) {
                        long j3 = jM151984e + 1;
                        bM151986g2 = kyj0.m151986g(bArr, jM151984e);
                        if (j3 >= jM151984e2) {
                            return Utf8.m17102l(b, bM151986g2);
                        }
                        jM151984e = j3;
                    }
                    if (bM151986g2 <= -65 && ((b != -32 || bM151986g2 >= -96) && (b != -19 || bM151986g2 < -96))) {
                        j = jM151984e + 1;
                    }
                    return -1;
                }
                byte bM151986g3 = (byte) (~(i >> 8));
                if (bM151986g3 == 0) {
                    long j4 = jM151984e + 1;
                    bM151986g3 = kyj0.m151986g(bArr, jM151984e);
                    if (j4 >= jM151984e2) {
                        return Utf8.m17102l(b, bM151986g3);
                    }
                    jM151984e = j4;
                } else {
                    bM151986g = (byte) (i >> 16);
                }
                if (bM151986g == 0) {
                    long j5 = jM151984e + 1;
                    bM151986g = kyj0.m151986g(bArr, jM151984e);
                    if (j5 >= jM151984e2) {
                        return Utf8.m17103m(b, bM151986g3, bM151986g);
                    }
                    jM151984e = j5;
                }
                if (bM151986g3 <= -65 && (((b << 28) + (bM151986g3 + 112)) >> 30) == 0 && bM151986g <= -65) {
                    j = jM151984e + 1;
                }
                return -1;
                jM151984e = j;
            }
            return m17122k(bArr, jM151984e, (int) (jM151984e2 - jM151984e));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (p153l.kyj0.m151985f(r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (p153l.kyj0.m151985f(r1) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.AbstractC3415a
        /* JADX INFO: renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo17117h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            long j;
            byte bM151985f = 0;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) < 0) {
                zg3.m219589a("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)});
                return 0;
            }
            long jM151980a = kyj0.m151980a(byteBuffer) + ((long) i2);
            long j2 = ((long) (i3 - i2)) + jM151980a;
            if (i != 0) {
                if (jM151980a >= j2) {
                    return i;
                }
                byte b = (byte) i;
                if (b < -32) {
                    if (b >= -62) {
                        long j3 = 1 + jM151980a;
                        if (kyj0.m151985f(jM151980a) <= -65) {
                            jM151980a = j3;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bM151985f2 = (byte) (~(i >> 8));
                    if (bM151985f2 == 0) {
                        long j4 = jM151980a + 1;
                        bM151985f2 = kyj0.m151985f(jM151980a);
                        if (j4 >= j2) {
                            return Utf8.m17102l(b, bM151985f2);
                        }
                        jM151980a = j4;
                    }
                    if (bM151985f2 <= -65 && ((b != -32 || bM151985f2 >= -96) && (b != -19 || bM151985f2 < -96))) {
                        j = jM151980a + 1;
                    }
                    return -1;
                }
                byte bM151985f3 = (byte) (~(i >> 8));
                if (bM151985f3 == 0) {
                    long j5 = jM151980a + 1;
                    bM151985f3 = kyj0.m151985f(jM151980a);
                    if (j5 >= j2) {
                        return Utf8.m17102l(b, bM151985f3);
                    }
                    jM151980a = j5;
                } else {
                    bM151985f = (byte) (i >> 16);
                }
                if (bM151985f == 0) {
                    long j6 = jM151980a + 1;
                    bM151985f = kyj0.m151985f(jM151980a);
                    if (j6 >= j2) {
                        return Utf8.m17103m(b, bM151985f3, bM151985f);
                    }
                    jM151980a = j6;
                }
                if (bM151985f3 <= -65 && (((b << 28) + (bM151985f3 + 112)) >> 30) == 0 && bM151985f <= -65) {
                    j = jM151980a + 1;
                }
                return -1;
                jM151980a = j;
            }
            return m17121j(jM151980a, (int) (j2 - jM151980a));
        }
    }

    static {
        f11598a = C3417c.m17120i() ? new C3417c() : new C3416b();
    }

    /* JADX INFO: renamed from: g */
    public static int m17097g(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f11598a.mo17111a(charSequence, bArr, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static int m17098h(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iM17099i = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iM17099i += m17099i(charSequence, i);
                break;
            }
            iM17099i += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iM17099i >= length) {
            return iM17099i;
        }
        mlk0.m158922a("UTF-8 length does not fit in int: ", ((long) iM17099i) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m17099i(CharSequence charSequence, int i) {
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

    /* JADX INFO: renamed from: j */
    public static int m17100j(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: k */
    public static int m17101k(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static int m17102l(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: m */
    public static int m17103m(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: renamed from: n */
    public static int m17104n(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return m17101k(i);
        }
        if (i3 == 1) {
            return m17102l(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return m17103m(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        aqg0.m99478a();
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public static int m17105o(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m17101k(b);
        }
        if (i3 == 1) {
            return m17102l(b, bArr[i]);
        }
        if (i3 == 2) {
            return m17103m(b, bArr[i], bArr[i + 1]);
        }
        aqg0.m99478a();
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m17106p(ByteBuffer byteBuffer) {
        return f11598a.m17112b(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: q */
    public static boolean m17107q(byte[] bArr, int i, int i2) {
        return f11598a.m17113c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: r */
    public static int m17108r(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return f11598a.m17114d(i, byteBuffer, i2, i3);
    }

    /* JADX INFO: renamed from: s */
    public static int m17109s(int i, byte[] bArr, int i2, int i3) {
        return f11598a.mo17115e(i, bArr, i2, i3);
    }
}
