package com.google.common.hash;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p153l.AbstractC17172g7;
import p153l.AbstractC17410h7;
import p153l.azk;
import p153l.et4;
import p153l.myj0;
import p153l.syk;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
final class Murmur3_32HashFunction extends AbstractC17172g7 implements Serializable {

    /* JADX INFO: renamed from: C1 */
    private static final int f11270C1 = -862048943;

    /* JADX INFO: renamed from: C2 */
    private static final int f11271C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;
    static final syk MURMUR3_32 = new Murmur3_32HashFunction(0, false);
    static final syk MURMUR3_32_FIXED = new Murmur3_32HashFunction(0, true);
    static final syk GOOD_FAST_HASH_32 = new Murmur3_32HashFunction(Hashing.f11262a, true);

    /* JADX INFO: renamed from: com.google.common.hash.Murmur3_32HashFunction$a */
    public static final class C3023a extends AbstractC17410h7 {

        /* JADX INFO: renamed from: a */
        public int f11272a;

        /* JADX INFO: renamed from: b */
        public long f11273b;

        /* JADX INFO: renamed from: c */
        public int f11274c;

        /* JADX INFO: renamed from: d */
        public int f11275d = 0;

        /* JADX INFO: renamed from: e */
        public boolean f11276e = false;

        public C3023a(int i) {
            this.f11272a = i;
        }

        @Override // p153l.su80
        /* JADX INFO: renamed from: a */
        public azk mo16403a(int i) {
            m16410m(4, i);
            return this;
        }

        @Override // p153l.su80
        /* JADX INFO: renamed from: b */
        public azk mo16404b(long j) {
            m16410m(4, (int) j);
            m16410m(4, j >>> 32);
            return this;
        }

        @Override // p153l.AbstractC17410h7, p153l.su80
        /* JADX INFO: renamed from: d */
        public azk mo16405d(CharSequence charSequence, Charset charset) {
            if (!et4.f95689c.equals(charset)) {
                return super.mo16405d(charSequence, charset);
            }
            int length = charSequence.length();
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i);
                char cCharAt2 = charSequence.charAt(i + 1);
                char cCharAt3 = charSequence.charAt(i + 2);
                char cCharAt4 = charSequence.charAt(i + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                m16410m(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
                i = i2;
            }
            while (i < length) {
                char cCharAt5 = charSequence.charAt(i);
                if (cCharAt5 < 128) {
                    m16410m(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    m16410m(2, Murmur3_32HashFunction.charToTwoUtf8Bytes(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    m16410m(3, Murmur3_32HashFunction.charToThreeUtf8Bytes(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(charSequence, i);
                    if (iCodePointAt == cCharAt5) {
                        mo133755f(charSequence.subSequence(i, length).toString().getBytes(charset));
                        return this;
                    }
                    i++;
                    m16410m(4, Murmur3_32HashFunction.codePointToFourUtf8Bytes(iCodePointAt));
                }
                i++;
            }
            return this;
        }

        @Override // p153l.azk
        /* JADX INFO: renamed from: e */
        public HashCode mo16384e() {
            xn80.m212117v(!this.f11276e);
            this.f11276e = true;
            int iMixK1 = this.f11272a ^ Murmur3_32HashFunction.mixK1((int) this.f11273b);
            this.f11272a = iMixK1;
            return Murmur3_32HashFunction.fmix(iMixK1, this.f11275d);
        }

        @Override // p153l.AbstractC17410h7, p153l.azk
        /* JADX INFO: renamed from: h */
        public azk mo16406h(byte[] bArr, int i, int i2) {
            xn80.m212116u(i, i + i2, bArr.length);
            int i3 = 0;
            while (true) {
                int i4 = i3 + 4;
                if (i4 > i2) {
                    break;
                }
                m16410m(4, Murmur3_32HashFunction.getIntLittleEndian(bArr, i3 + i));
                i3 = i4;
            }
            while (i3 < i2) {
                m16409l(bArr[i + i3]);
                i3++;
            }
            return this;
        }

        @Override // p153l.azk
        /* JADX INFO: renamed from: i */
        public azk mo16407i(ByteBuffer byteBuffer) {
            ByteOrder byteOrderOrder = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                mo16403a(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                m16409l(byteBuffer.get());
            }
            byteBuffer.order(byteOrderOrder);
            return this;
        }

        @Override // p153l.AbstractC17410h7
        /* JADX INFO: renamed from: k */
        public azk mo16408k(char c) {
            m16410m(2, c);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public azk m16409l(byte b) {
            m16410m(1, b & 255);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final void m16410m(int i, long j) {
            long j2 = this.f11273b;
            int i2 = this.f11274c;
            long j3 = ((j & 4294967295L) << i2) | j2;
            this.f11273b = j3;
            int i3 = i2 + (i * 8);
            this.f11274c = i3;
            this.f11275d += i;
            if (i3 >= 32) {
                this.f11272a = Murmur3_32HashFunction.mixH1(this.f11272a, Murmur3_32HashFunction.mixK1((int) j3));
                this.f11273b >>>= 32;
                this.f11274c -= 32;
            }
        }
    }

    public Murmur3_32HashFunction(int i, boolean z) {
        this.seed = i;
        this.supplementaryPlaneFix = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToThreeUtf8Bytes(char c) {
        return ((long) (c >>> '\f')) | 224 | ((long) ((((c >>> 6) & 63) | 128) << 8)) | ((long) (((c & '?') | 128) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToTwoUtf8Bytes(char c) {
        return ((long) (c >>> 6)) | 192 | ((long) (((c & '?') | 128) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long codePointToFourUtf8Bytes(int i) {
        return ((long) (i >>> 18)) | 240 | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashCode fmix(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return HashCode.fromInt(i5 ^ (i5 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getIntLittleEndian(byte[] bArr, int i) {
        return Ints.m16517g(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixH1(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixK1(int i) {
        return Integer.rotateLeft(i * f11270C1, 15) * f11271C2;
    }

    public int bits() {
        return 32;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Murmur3_32HashFunction) {
            Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
            if (this.seed == murmur3_32HashFunction.seed && this.supplementaryPlaneFix == murmur3_32HashFunction.supplementaryPlaneFix) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.AbstractC17172g7
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        xn80.m212116u(i, i + i2, bArr.length);
        int iMixH1 = this.seed;
        int iM160799c = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > i2) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1(getIntLittleEndian(bArr, i3 + i)));
            i3 = i4;
        }
        int i5 = i3;
        int i6 = 0;
        while (i5 < i2) {
            iM160799c ^= myj0.m160799c(bArr[i + i5]) << i6;
            i5++;
            i6 += 8;
        }
        return fmix(iMixH1 ^ mixK1(iM160799c), i2);
    }

    public int hashCode() {
        return this.seed ^ Murmur3_32HashFunction.class.hashCode();
    }

    @Override // p153l.AbstractC17172g7
    public HashCode hashInt(int i) {
        return fmix(mixH1(this.seed, mixK1(i)), 4);
    }

    @Override // p153l.AbstractC17172g7
    public HashCode hashLong(long j) {
        return fmix(mixH1(mixH1(this.seed, mixK1((int) j)), mixK1((int) (j >>> 32))), 8);
    }

    @Override // p153l.AbstractC17172g7
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        if (!et4.f95689c.equals(charset)) {
            return hashBytes(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int iMixH1 = this.seed;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 4;
            if (i4 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i2);
            char cCharAt2 = charSequence.charAt(i2 + 1);
            char cCharAt3 = charSequence.charAt(i2 + 2);
            char cCharAt4 = charSequence.charAt(i2 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i3 += 4;
            i2 = i4;
        }
        long jCharToThreeUtf8Bytes = 0;
        while (i2 < length) {
            char cCharAt5 = charSequence.charAt(i2);
            if (cCharAt5 < 128) {
                jCharToThreeUtf8Bytes |= ((long) cCharAt5) << i;
                i += 8;
                i3++;
            } else if (cCharAt5 < 2048) {
                jCharToThreeUtf8Bytes |= charToTwoUtf8Bytes(cCharAt5) << i;
                i += 16;
                i3 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jCharToThreeUtf8Bytes |= charToThreeUtf8Bytes(cCharAt5) << i;
                i += 24;
                i3 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i2);
                if (iCodePointAt == cCharAt5) {
                    return hashBytes(charSequence.toString().getBytes(charset));
                }
                i2++;
                jCharToThreeUtf8Bytes |= codePointToFourUtf8Bytes(iCodePointAt) << i;
                if (this.supplementaryPlaneFix) {
                    i += 32;
                }
                i3 += 4;
            }
            if (i >= 32) {
                iMixH1 = mixH1(iMixH1, mixK1((int) jCharToThreeUtf8Bytes));
                jCharToThreeUtf8Bytes >>>= 32;
                i -= 32;
            }
            i2++;
        }
        return fmix(mixK1((int) jCharToThreeUtf8Bytes) ^ iMixH1, i3);
    }

    @Override // p153l.AbstractC17172g7
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int iMixK1 = this.seed;
        for (int i = 1; i < charSequence.length(); i += 2) {
            iMixK1 = mixH1(iMixK1, mixK1(charSequence.charAt(i - 1) | (charSequence.charAt(i) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            iMixK1 ^= mixK1(charSequence.charAt(charSequence.length() - 1));
        }
        return fmix(iMixK1, charSequence.length() * 2);
    }

    @Override // p153l.syk
    public azk newHasher() {
        return new C3023a(this.seed);
    }

    public String toString() {
        int i = this.seed;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
