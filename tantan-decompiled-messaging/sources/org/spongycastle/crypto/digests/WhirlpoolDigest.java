package org.spongycastle.crypto.digests;

import com.alibaba.fastjson.asm.Opcodes;
import com.momo.momortc.MMConstants;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;

    /* JADX INFO: renamed from: _K */
    private long[] f206485_K;

    /* JADX INFO: renamed from: _L */
    private long[] f206486_L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private static final int[] SBOX = {24, 35, Opcodes.IFNULL, 232, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, 184, 1, 79, 54, 166, 210, 245, 121, 111, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 82, 96, 188, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 163, 12, 123, 53, 29, 224, 215, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 46, 75, 254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 93, 16, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 203, 62, 5, 103, 228, 39, 65, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 7, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 90, 131, 51, 99, 2, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 113, 200, 25, 73, 217, 242, 227, 91, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 154, 38, 50, 176, 233, 15, 213, 128, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 180, 84, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 34, 100, 241, 115, 18, 64, 8, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 236, 219, 161, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 47, 192, 222, 28, 253, 77, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 117, 6, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 178, 230, 14, 31, 98, 212, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 150, 249, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 37, 89, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 114, 57, 76, 94, 120, 56, 140, 209, 165, 226, 97, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 33, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 30, 67, Opcodes.IFNONNULL, 252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 206, 17, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 78, 183, 235, 60, MMConstants.ERR_WATERMARK_READ, 148, 247, 185, 19, 44, Primes.SMALL_FACTOR_LIMIT, 231, 110, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 40, 92, 248, 134};

    /* JADX INFO: renamed from: C0 */
    private static final long[] f206477C0 = new long[256];

    /* JADX INFO: renamed from: C1 */
    private static final long[] f206478C1 = new long[256];

    /* JADX INFO: renamed from: C2 */
    private static final long[] f206479C2 = new long[256];

    /* JADX INFO: renamed from: C3 */
    private static final long[] f206480C3 = new long[256];

    /* JADX INFO: renamed from: C4 */
    private static final long[] f206481C4 = new long[256];

    /* JADX INFO: renamed from: C5 */
    private static final long[] f206482C5 = new long[256];

    /* JADX INFO: renamed from: C6 */
    private static final long[] f206483C6 = new long[256];

    /* JADX INFO: renamed from: C7 */
    private static final long[] f206484C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.spongycastle.crypto.digests.WhirlpoolDigest] */
    public WhirlpoolDigest() {
        ?? obj = new Object();
        obj._rc = new long[11];
        obj._buffer = new byte[64];
        obj._bufferPos = 0;
        obj._bitCount = new short[32];
        obj._hash = new long[8];
        obj.f206485_K = new long[8];
        obj.f206486_L = new long[8];
        obj._block = new long[8];
        obj._state = new long[8];
        int i = 0;
        WhirlpoolDigest whirlpoolDigest = obj;
        while (i < 256) {
            int i2 = SBOX[i];
            int iMaskWithReductionPolynomial = whirlpoolDigest.maskWithReductionPolynomial(i2 << 1);
            int iMaskWithReductionPolynomial2 = whirlpoolDigest.maskWithReductionPolynomial(iMaskWithReductionPolynomial << 1);
            int i3 = iMaskWithReductionPolynomial2 ^ i2;
            int iMaskWithReductionPolynomial3 = whirlpoolDigest.maskWithReductionPolynomial(iMaskWithReductionPolynomial2 << 1);
            int i4 = iMaskWithReductionPolynomial3 ^ i2;
            f206477C0[i] = whirlpoolDigest.packIntoLong(i2, i2, iMaskWithReductionPolynomial2, i2, iMaskWithReductionPolynomial3, i3, iMaskWithReductionPolynomial, i4);
            f206478C1[i] = packIntoLong(i4, i2, i2, iMaskWithReductionPolynomial2, i2, iMaskWithReductionPolynomial3, i3, iMaskWithReductionPolynomial);
            f206479C2[i] = packIntoLong(iMaskWithReductionPolynomial, i4, i2, i2, iMaskWithReductionPolynomial2, i2, iMaskWithReductionPolynomial3, i3);
            f206480C3[i] = packIntoLong(i3, iMaskWithReductionPolynomial, i4, i2, i2, iMaskWithReductionPolynomial2, i2, iMaskWithReductionPolynomial3);
            f206481C4[i] = packIntoLong(iMaskWithReductionPolynomial3, i3, iMaskWithReductionPolynomial, i4, i2, i2, iMaskWithReductionPolynomial2, i2);
            f206482C5[i] = packIntoLong(i2, iMaskWithReductionPolynomial3, i3, iMaskWithReductionPolynomial, i4, i2, i2, iMaskWithReductionPolynomial2);
            f206483C6[i] = packIntoLong(iMaskWithReductionPolynomial2, i2, iMaskWithReductionPolynomial3, i3, iMaskWithReductionPolynomial, i4, i2, i2);
            WhirlpoolDigest whirlpoolDigest2 = this;
            f206484C7[i] = whirlpoolDigest2.packIntoLong(i2, iMaskWithReductionPolynomial2, i2, iMaskWithReductionPolynomial3, i3, iMaskWithReductionPolynomial, i4, i2);
            i++;
            whirlpoolDigest = whirlpoolDigest2;
        }
        whirlpoolDigest._rc[0] = 0;
        for (int i5 = 1; i5 <= 10; i5++) {
            int i6 = (i5 - 1) * 8;
            whirlpoolDigest._rc[i5] = (((((((f206477C0[i6] & (-72057594037927936L)) ^ (f206478C1[i6 + 1] & 71776119061217280L)) ^ (f206479C2[i6 + 2] & 280375465082880L)) ^ (f206480C3[i6 + 3] & 1095216660480L)) ^ (f206481C4[i6 + 4] & 4278190080L)) ^ (f206482C5[i6 + 5] & 16711680)) ^ (f206483C6[i6 + 6] & 65280)) ^ (f206484C7[i6 + 7] & 255);
        }
    }

    private long bytesToLongFromBuffer(byte[] bArr, int i) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    private void convertLongToByteArray(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) ((j >> (56 - (i2 * 8))) & 255);
        }
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) (this._bitCount[i] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] bArrCopyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        int i2 = i + 1;
        this._bufferPos = i2;
        bArr[i] = (byte) (bArr[i] | 128);
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(bArrCopyBitLength, 0, this._buffer, 32, bArrCopyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i2 = (sArr[length] & 255) + EIGHT[length] + i;
            i = i2 >>> 8;
            sArr[length] = (short) (i2 & 255);
        }
    }

    private int maskWithReductionPolynomial(int i) {
        return ((long) i) >= 256 ? i ^ REDUCTION_POLYNOMIAL : i;
    }

    private long packIntoLong(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((((long) i) << 56) ^ (((long) i2) << 48)) ^ (((long) i3) << 40)) ^ (((long) i4) << 32)) ^ (((long) i5) << 24)) ^ (((long) i6) << 16)) ^ (((long) i7) << 8)) ^ ((long) i8);
    }

    private void processFilledBuffer(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this._state.length; i2++) {
            this._block[i2] = bytesToLongFromBuffer(this._buffer, i2 * 8);
        }
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        for (int i2 = 0; i2 < 8; i2++) {
            convertLongToByteArray(this._hash[i2], bArr, (i2 * 8) + i);
        }
        reset();
        return getDigestSize();
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    public void processBlock() {
        long[] jArr;
        long[] jArr2;
        for (int i = 0; i < 8; i++) {
            long[] jArr3 = this._state;
            long j = this._block[i];
            long[] jArr4 = this.f206485_K;
            long j2 = this._hash[i];
            jArr4[i] = j2;
            jArr3[i] = j ^ j2;
        }
        for (int i2 = 1; i2 <= 10; i2++) {
            int i3 = 0;
            while (true) {
                jArr = this.f206486_L;
                if (i3 >= 8) {
                    break;
                }
                jArr[i3] = 0;
                long[] jArr5 = f206477C0;
                long[] jArr6 = this.f206485_K;
                long j3 = jArr5[((int) (jArr6[i3 & 7] >>> 56)) & 255];
                jArr[i3] = j3;
                long j4 = f206478C1[((int) (jArr6[(i3 - 1) & 7] >>> 48)) & 255] ^ j3;
                jArr[i3] = j4;
                long j5 = j4 ^ f206479C2[((int) (jArr6[(i3 - 2) & 7] >>> 40)) & 255];
                jArr[i3] = j5;
                long j6 = j5 ^ f206480C3[((int) (jArr6[(i3 - 3) & 7] >>> 32)) & 255];
                jArr[i3] = j6;
                long j7 = j6 ^ f206481C4[((int) (jArr6[(i3 - 4) & 7] >>> 24)) & 255];
                jArr[i3] = j7;
                long j8 = j7 ^ f206482C5[((int) (jArr6[(i3 - 5) & 7] >>> 16)) & 255];
                jArr[i3] = j8;
                long j9 = j8 ^ f206483C6[((int) (jArr6[(i3 - 6) & 7] >>> 8)) & 255];
                jArr[i3] = j9;
                jArr[i3] = j9 ^ f206484C7[((int) jArr6[(i3 - 7) & 7]) & 255];
                i3++;
            }
            long[] jArr7 = this.f206485_K;
            System.arraycopy(jArr, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this.f206485_K;
            jArr8[0] = jArr8[0] ^ this._rc[i2];
            int i4 = 0;
            while (true) {
                jArr2 = this.f206486_L;
                if (i4 < 8) {
                    long j10 = this.f206485_K[i4];
                    jArr2[i4] = j10;
                    long[] jArr9 = f206477C0;
                    long[] jArr10 = this._state;
                    long j11 = j10 ^ jArr9[((int) (jArr10[i4 & 7] >>> 56)) & 255];
                    jArr2[i4] = j11;
                    long j12 = j11 ^ f206478C1[((int) (jArr10[(i4 - 1) & 7] >>> 48)) & 255];
                    jArr2[i4] = j12;
                    long j13 = j12 ^ f206479C2[((int) (jArr10[(i4 - 2) & 7] >>> 40)) & 255];
                    jArr2[i4] = j13;
                    long j14 = j13 ^ f206480C3[((int) (jArr10[(i4 - 3) & 7] >>> 32)) & 255];
                    jArr2[i4] = j14;
                    long j15 = j14 ^ f206481C4[((int) (jArr10[(i4 - 4) & 7] >>> 24)) & 255];
                    jArr2[i4] = j15;
                    long j16 = j15 ^ f206482C5[((int) (jArr10[(i4 - 5) & 7] >>> 16)) & 255];
                    jArr2[i4] = j16;
                    long j17 = j16 ^ f206483C6[((int) (jArr10[(i4 - 6) & 7] >>> 8)) & 255];
                    jArr2[i4] = j17;
                    jArr2[i4] = j17 ^ f206484C7[((int) jArr10[(i4 - 7) & 7]) & 255];
                    i4++;
                }
            }
            long[] jArr11 = this._state;
            System.arraycopy(jArr2, 0, jArr11, 0, jArr11.length);
        }
        for (int i5 = 0; i5 < 8; i5++) {
            long[] jArr12 = this._hash;
            jArr12[i5] = jArr12[i5] ^ (this._state[i5] ^ this._block[i5]);
        }
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest.f206485_K;
        long[] jArr6 = this.f206485_K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest.f206486_L;
        long[] jArr8 = this.f206486_L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        bArr[i] = b;
        int i2 = i + 1;
        this._bufferPos = i2;
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this.f206485_K, 0L);
        Arrays.fill(this.f206486_L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this.f206485_K = new long[8];
        this.f206486_L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        reset(whirlpoolDigest);
    }
}
