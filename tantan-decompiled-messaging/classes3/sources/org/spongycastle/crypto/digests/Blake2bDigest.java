package org.spongycastle.crypto.digests;

import android.R;
import l.ig3;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Blake2bDigest implements ExtendedDigest {
    private static final int BLOCK_LENGTH_BYTES = 128;
    private static final long[] blake2b_IV = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    private static final byte[][] blake2b_sigma = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, HttpTokens.CARRIAGE_RETURN, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, HttpTokens.CARRIAGE_RETURN, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, HttpTokens.CARRIAGE_RETURN, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, HttpTokens.CARRIAGE_RETURN}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, HttpTokens.CARRIAGE_RETURN, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, HttpTokens.CARRIAGE_RETURN, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{HttpTokens.CARRIAGE_RETURN, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, HttpTokens.CARRIAGE_RETURN, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, HttpTokens.CARRIAGE_RETURN, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, HttpTokens.CARRIAGE_RETURN, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, HttpTokens.CARRIAGE_RETURN, 6, 1, 12, 0, 2, 11, 7, 5, 3}};
    private static int rOUNDS = 12;
    private byte[] buffer;
    private int bufferPos;
    private long[] chainValue;
    private int digestLength;

    /* JADX INFO: renamed from: f0 */
    private long f9989f0;
    private long[] internalState;
    private byte[] key;
    private int keyLength;
    private byte[] personalization;
    private byte[] salt;

    /* JADX INFO: renamed from: t0 */
    private long f9990t0;

    /* JADX INFO: renamed from: t1 */
    private long f9991t1;

    public Blake2bDigest(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        this.digestLength = 64;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = null;
        this.f9990t0 = 0L;
        this.f9991t1 = 0L;
        this.f9989f0 = 0L;
        this.buffer = new byte[128];
        if (i < 1 || i > 64) {
            ig3.a("Invalid digest length (required: 1 - 64)");
            throw null;
        }
        this.digestLength = i;
        if (bArr2 != null) {
            if (bArr2.length != 16) {
                ig3.a("salt length must be exactly 16 bytes");
                throw null;
            }
            byte[] bArr4 = new byte[16];
            this.salt = bArr4;
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        }
        if (bArr3 != null) {
            if (bArr3.length != 16) {
                ig3.a("personalization length must be exactly 16 bytes");
                throw null;
            }
            byte[] bArr5 = new byte[16];
            this.personalization = bArr5;
            System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
        }
        if (bArr != null) {
            byte[] bArr6 = new byte[bArr.length];
            this.key = bArr6;
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
            if (bArr.length > 64) {
                ig3.a("Keys > 64 are not supported");
                throw null;
            }
            this.keyLength = bArr.length;
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 128;
        }
        init();
    }

    /* JADX INFO: renamed from: G */
    private void m9601G(long j, long j2, int i, int i2, int i3, int i4) {
        long[] jArr = this.internalState;
        long j3 = jArr[i] + jArr[i2] + j;
        jArr[i] = j3;
        jArr[i4] = rotr64(jArr[i4] ^ j3, 32);
        long[] jArr2 = this.internalState;
        long j4 = jArr2[i3] + jArr2[i4];
        jArr2[i3] = j4;
        jArr2[i2] = rotr64(j4 ^ jArr2[i2], 24);
        long[] jArr3 = this.internalState;
        long j5 = jArr3[i] + jArr3[i2] + j2;
        jArr3[i] = j5;
        jArr3[i4] = rotr64(jArr3[i4] ^ j5, 16);
        long[] jArr4 = this.internalState;
        long j6 = jArr4[i3] + jArr4[i4];
        jArr4[i3] = j6;
        jArr4[i2] = rotr64(j6 ^ jArr4[i2], 63);
    }

    private final long bytes2long(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private void compress(byte[] bArr, int i) {
        initializeInternalState();
        long[] jArr = new long[16];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            jArr[i3] = bytes2long(bArr, (i3 * 8) + i);
        }
        for (int i4 = 0; i4 < rOUNDS; i4++) {
            byte[][] bArr2 = blake2b_sigma;
            byte[] bArr3 = bArr2[i4];
            m9601G(jArr[bArr3[0]], jArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i4];
            m9601G(jArr[bArr4[2]], jArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i4];
            m9601G(jArr[bArr5[4]], jArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i4];
            m9601G(jArr[bArr6[6]], jArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i4];
            m9601G(jArr[bArr7[8]], jArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i4];
            m9601G(jArr[bArr8[10]], jArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i4];
            m9601G(jArr[bArr9[12]], jArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i4];
            m9601G(jArr[bArr10[14]], jArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            long[] jArr2 = this.chainValue;
            if (i2 >= jArr2.length) {
                return;
            }
            long j = jArr2[i2];
            long[] jArr3 = this.internalState;
            jArr2[i2] = (j ^ jArr3[i2]) ^ jArr3[i2 + 8];
            i2++;
        }
    }

    private void init() {
        if (this.chainValue == null) {
            long[] jArr = {jArr[0] ^ ((long) ((this.digestLength | (this.keyLength << 8)) | R.attr.theme)), jArr[1], jArr[2], jArr[3], j, jArr[5], 0, 0};
            this.chainValue = jArr;
            long[] jArr2 = blake2b_IV;
            long j = jArr2[4];
            byte[] bArr = this.salt;
            if (bArr != null) {
                jArr[4] = j ^ bytes2long(bArr, 0);
                long[] jArr3 = this.chainValue;
                jArr3[5] = jArr3[5] ^ bytes2long(this.salt, 8);
            }
            long[] jArr4 = this.chainValue;
            long j2 = jArr2[6];
            jArr4[6] = j2;
            jArr4[7] = jArr2[7];
            byte[] bArr2 = this.personalization;
            if (bArr2 != null) {
                jArr4[6] = bytes2long(bArr2, 0) ^ j2;
                long[] jArr5 = this.chainValue;
                jArr5[7] = jArr5[7] ^ bytes2long(this.personalization, 8);
            }
        }
    }

    private void initializeInternalState() {
        long[] jArr = this.chainValue;
        System.arraycopy(jArr, 0, this.internalState, 0, jArr.length);
        long[] jArr2 = blake2b_IV;
        System.arraycopy(jArr2, 0, this.internalState, this.chainValue.length, 4);
        long[] jArr3 = this.internalState;
        jArr3[12] = this.f9990t0 ^ jArr2[4];
        jArr3[13] = this.f9991t1 ^ jArr2[5];
        jArr3[14] = this.f9989f0 ^ jArr2[6];
        jArr3[15] = jArr2[7];
    }

    private final byte[] long2bytes(long j) {
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    private long rotr64(long j, int i) {
        return (j << (64 - i)) | (j >>> i);
    }

    public void clearKey() {
        byte[] bArr = this.key;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(this.buffer, (byte) 0);
        }
    }

    public void clearSalt() {
        byte[] bArr = this.salt;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        long[] jArr;
        int i2;
        this.f9989f0 = -1L;
        long j = this.f9990t0;
        int i3 = this.bufferPos;
        long j2 = j + ((long) i3);
        this.f9990t0 = j2;
        if (j2 < 0 && i3 > (-j2)) {
            this.f9991t1++;
        }
        compress(this.buffer, 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.internalState, 0L);
        int i4 = 0;
        while (true) {
            jArr = this.chainValue;
            if (i4 >= jArr.length || (i2 = i4 * 8) >= this.digestLength) {
                break;
            }
            byte[] bArrLong2bytes = long2bytes(jArr[i4]);
            int i5 = this.digestLength;
            if (i2 < i5 - 8) {
                System.arraycopy(bArrLong2bytes, 0, bArr, i2 + i, 8);
            } else {
                System.arraycopy(bArrLong2bytes, 0, bArr, i + i2, i5 - i2);
            }
            i4++;
        }
        Arrays.fill(jArr, 0L);
        reset();
        return this.digestLength;
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Blake2b";
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.f9989f0 = 0L;
        this.f9990t0 = 0L;
        this.f9991t1 = 0L;
        this.chainValue = null;
        byte[] bArr = this.key;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 128;
        }
        init();
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        int i4 = this.bufferPos;
        if (i4 != 0) {
            i3 = 128 - i4;
            byte[] bArr2 = this.buffer;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.bufferPos += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i4, i3);
            long j = this.f9990t0 + 128;
            this.f9990t0 = j;
            if (j == 0) {
                this.f9991t1++;
            }
            compress(this.buffer, 0);
            this.bufferPos = 0;
            Arrays.fill(this.buffer, (byte) 0);
        } else {
            i3 = 0;
        }
        int i5 = i2 + i;
        int i6 = i5 - 128;
        int i7 = i + i3;
        while (i7 < i6) {
            long j2 = this.f9990t0 + 128;
            this.f9990t0 = j2;
            if (j2 == 0) {
                this.f9991t1++;
            }
            compress(bArr, i7);
            i7 += 128;
        }
        int i8 = i5 - i7;
        System.arraycopy(bArr, i7, this.buffer, 0, i8);
        this.bufferPos += i8;
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b) {
        int i = this.bufferPos;
        if (128 - i == 0) {
            long j = this.f9990t0 + 128;
            this.f9990t0 = j;
            if (j == 0) {
                this.f9991t1++;
            }
            compress(this.buffer, 0);
            Arrays.fill(this.buffer, (byte) 0);
            this.buffer[0] = b;
            this.bufferPos = 1;
            return;
        }
        this.buffer[i] = b;
        this.bufferPos = i + 1;
    }

    public Blake2bDigest(Blake2bDigest blake2bDigest) {
        this.digestLength = 64;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = null;
        this.f9990t0 = 0L;
        this.f9991t1 = 0L;
        this.f9989f0 = 0L;
        this.bufferPos = blake2bDigest.bufferPos;
        this.buffer = Arrays.clone(blake2bDigest.buffer);
        this.keyLength = blake2bDigest.keyLength;
        this.key = Arrays.clone(blake2bDigest.key);
        this.digestLength = blake2bDigest.digestLength;
        this.chainValue = Arrays.clone(blake2bDigest.chainValue);
        this.personalization = Arrays.clone(this.personalization);
    }

    public Blake2bDigest(int i) {
        this.digestLength = 64;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = null;
        this.f9990t0 = 0L;
        this.f9991t1 = 0L;
        this.f9989f0 = 0L;
        if (i != 160 && i != 256 && i != 384 && i != 512) {
            ig3.a("Blake2b digest restricted to one of [160, 256, 384, 512]");
            throw null;
        }
        this.buffer = new byte[128];
        this.keyLength = 0;
        this.digestLength = i / 8;
        init();
    }

    public Blake2bDigest(byte[] bArr) {
        this.digestLength = 64;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.bufferPos = 0;
        this.internalState = new long[16];
        this.chainValue = null;
        this.f9990t0 = 0L;
        this.f9991t1 = 0L;
        this.f9989f0 = 0L;
        this.buffer = new byte[128];
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.key = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            if (bArr.length <= 64) {
                this.keyLength = bArr.length;
                System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
                this.bufferPos = 128;
            } else {
                ig3.a("Keys > 64 are not supported");
                throw null;
            }
        }
        this.digestLength = 64;
        init();
    }

    public Blake2bDigest() {
        this(512);
    }
}
