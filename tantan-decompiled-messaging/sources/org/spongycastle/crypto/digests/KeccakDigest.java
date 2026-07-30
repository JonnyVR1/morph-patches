package org.spongycastle.crypto.digests;

import com.tencent.wcdb.FileUtils;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Arrays;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class KeccakDigest implements ExtendedDigest {

    /* JADX INFO: renamed from: C */
    long[] f206379C;
    protected int bitsAvailableForSqueezing;
    protected int bitsInQueue;
    long[] chiC;
    protected byte[] chunk;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected byte[] oneByte;
    protected int rate;
    protected boolean squeezing;
    protected byte[] state;
    long[] tempA;
    private static long[] KeccakRoundConstants = keccakInitializeRoundConstants();
    private static int[] KeccakRhoOffsets = keccakInitializeRhoOffsets();

    public KeccakDigest(KeccakDigest keccakDigest) {
        byte[] bArr = new byte[200];
        this.state = bArr;
        this.dataQueue = new byte[192];
        this.f206379C = new long[5];
        this.tempA = new long[25];
        this.chiC = new long[5];
        byte[] bArr2 = keccakDigest.state;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = keccakDigest.dataQueue;
        System.arraycopy(bArr3, 0, this.dataQueue, 0, bArr3.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        this.bitsAvailableForSqueezing = keccakDigest.bitsAvailableForSqueezing;
        this.chunk = Arrays.clone(keccakDigest.chunk);
        this.oneByte = Arrays.clone(keccakDigest.oneByte);
    }

    private void KeccakAbsorb(byte[] bArr, byte[] bArr2, int i) {
        keccakPermutationAfterXor(bArr, bArr2, i);
    }

    private void KeccakExtract(byte[] bArr, byte[] bArr2, int i) {
        System.arraycopy(bArr, 0, bArr2, 0, i * 8);
    }

    private void KeccakExtract1024bits(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 128);
    }

    private static boolean LFSR86540(byte[] bArr) {
        byte b = bArr[0];
        boolean z = (b & 1) != 0;
        if ((b & 128) != 0) {
            bArr[0] = (byte) ((b << 1) ^ 113);
            return z;
        }
        bArr[0] = (byte) (b << 1);
        return z;
    }

    private void absorbQueue() {
        KeccakAbsorb(this.state, this.dataQueue, this.rate / 8);
        this.bitsInQueue = 0;
    }

    private void chi(long[] jArr) {
        for (int i = 0; i < 5; i++) {
            int i2 = 0;
            while (i2 < 5) {
                int i3 = i * 5;
                int i4 = i2 + 1;
                this.chiC[i2] = jArr[i2 + i3] ^ ((~jArr[(i4 % 5) + i3]) & jArr[((i2 + 2) % 5) + i3]);
                i2 = i4;
            }
            for (int i5 = 0; i5 < 5; i5++) {
                jArr[(i * 5) + i5] = this.chiC[i5];
            }
        }
    }

    private void clearDataQueueSection(int i, int i2) {
        for (int i3 = i; i3 != i + i2; i3++) {
            this.dataQueue[i3] = 0;
        }
    }

    private void fromBytesToWords(long[] jArr, byte[] bArr) {
        for (int i = 0; i < 25; i++) {
            jArr[i] = 0;
            int i2 = i * 8;
            for (int i3 = 0; i3 < 8; i3++) {
                jArr[i] = jArr[i] | ((((long) bArr[i2 + i3]) & 255) << (i3 * 8));
            }
        }
    }

    private void fromWordsToBytes(byte[] bArr, long[] jArr) {
        for (int i = 0; i < 25; i++) {
            int i2 = i * 8;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((jArr[i] >>> (i3 * 8)) & 255);
            }
        }
    }

    private void init(int i) {
        if (i == 128) {
            initSponge(1344, 256);
            return;
        }
        if (i == 224) {
            initSponge(1152, FileUtils.S_IRWXU);
            return;
        }
        if (i == 256) {
            initSponge(1088, 512);
            return;
        }
        if (i == 288) {
            initSponge(1024, 576);
            return;
        }
        if (i == 384) {
            initSponge(832, 768);
        } else if (i == 512) {
            initSponge(576, 1024);
        } else {
            ig3.m135964a("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
    }

    private void initSponge(int i, int i2) {
        if (i + i2 != 1600) {
            qkq0.m175383a("rate + capacity != 1600");
            return;
        }
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            qkq0.m175383a("invalid rate value");
            return;
        }
        this.rate = i;
        Arrays.fill(this.state, (byte) 0);
        Arrays.fill(this.dataQueue, (byte) 0);
        this.bitsInQueue = 0;
        this.squeezing = false;
        this.bitsAvailableForSqueezing = 0;
        this.fixedOutputLength = i2 / 2;
        this.chunk = new byte[i / 8];
        this.oneByte = new byte[1];
    }

    private void iota(long[] jArr, int i) {
        jArr[0] = jArr[0] ^ KeccakRoundConstants[i];
    }

    private static int[] keccakInitializeRhoOffsets() {
        int[] iArr = new int[25];
        int i = 0;
        iArr[0] = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < 24) {
            int i4 = i + 1;
            iArr[(i2 % 5) + ((i3 % 5) * 5)] = (((i + 2) * i4) / 2) % 64;
            int i5 = i3 % 5;
            i3 = ((i2 * 2) + (i3 * 3)) % 5;
            i2 = i5;
            i = i4;
        }
        return iArr;
    }

    private static long[] keccakInitializeRoundConstants() {
        long[] jArr = new long[24];
        byte[] bArr = {1};
        for (int i = 0; i < 24; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 7; i2++) {
                int i3 = (1 << i2) - 1;
                if (LFSR86540(bArr)) {
                    jArr[i] = jArr[i] ^ (1 << i3);
                }
            }
        }
        return jArr;
    }

    private void keccakPermutation(byte[] bArr) {
        long[] jArr = new long[bArr.length / 8];
        fromBytesToWords(jArr, bArr);
        keccakPermutationOnWords(jArr);
        fromWordsToBytes(bArr, jArr);
    }

    private void keccakPermutationAfterXor(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        keccakPermutation(bArr);
    }

    private void keccakPermutationOnWords(long[] jArr) {
        for (int i = 0; i < 24; i++) {
            theta(jArr);
            rho(jArr);
            m221149pi(jArr);
            chi(jArr);
            iota(jArr, i);
        }
    }

    private void padAndSwitchToSqueezingPhase() {
        int i = this.bitsInQueue;
        int i2 = i + 1;
        int i3 = this.rate;
        if (i2 == i3) {
            byte[] bArr = this.dataQueue;
            int i4 = i / 8;
            bArr[i4] = (byte) ((1 << (i % 8)) | bArr[i4]);
            absorbQueue();
            clearDataQueueSection(0, this.rate / 8);
        } else {
            clearDataQueueSection((i + 7) / 8, (i3 / 8) - ((i + 7) / 8));
            byte[] bArr2 = this.dataQueue;
            int i5 = this.bitsInQueue;
            int i6 = i5 / 8;
            bArr2[i6] = (byte) ((1 << (i5 % 8)) | bArr2[i6]);
        }
        byte[] bArr3 = this.dataQueue;
        int i7 = this.rate;
        int i8 = (i7 - 1) / 8;
        bArr3[i8] = (byte) ((1 << ((i7 - 1) % 8)) | bArr3[i8]);
        absorbQueue();
        int i9 = this.rate;
        byte[] bArr4 = this.state;
        if (i9 == 1024) {
            KeccakExtract1024bits(bArr4, this.dataQueue);
            this.bitsAvailableForSqueezing = 1024;
        } else {
            KeccakExtract(bArr4, this.dataQueue, i9 / 64);
            this.bitsAvailableForSqueezing = this.rate;
        }
        this.squeezing = true;
    }

    /* JADX INFO: renamed from: pi */
    private void m221149pi(long[] jArr) {
        long[] jArr2 = this.tempA;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                jArr[((((i * 2) + (i2 * 3)) % 5) * 5) + i2] = this.tempA[(i2 * 5) + i];
            }
        }
    }

    private void rho(long[] jArr) {
        long j;
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = (i2 * 5) + i;
                int i4 = KeccakRhoOffsets[i3];
                if (i4 != 0) {
                    long j2 = jArr[i3];
                    j = (j2 >>> (64 - i4)) ^ (j2 << i4);
                } else {
                    j = jArr[i3];
                }
                jArr[i3] = j;
            }
        }
    }

    private void theta(long[] jArr) {
        for (int i = 0; i < 5; i++) {
            this.f206379C[i] = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                long[] jArr2 = this.f206379C;
                jArr2[i] = jArr2[i] ^ jArr[(i2 * 5) + i];
            }
        }
        int i3 = 0;
        while (i3 < 5) {
            long[] jArr3 = this.f206379C;
            int i4 = i3 + 1;
            long j = jArr3[i4 % 5];
            long j2 = ((j >>> 63) ^ (j << 1)) ^ jArr3[(i3 + 4) % 5];
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = (i5 * 5) + i3;
                jArr[i6] = jArr[i6] ^ j2;
            }
            i3 = i4;
        }
    }

    public void absorb(byte[] bArr, int i, long j) {
        if (this.bitsInQueue % 8 != 0) {
            qkq0.m175383a("attempt to absorb with odd length queue.");
            return;
        }
        if (this.squeezing) {
            qkq0.m175383a("attempt to absorb while squeezing.");
            return;
        }
        long j2 = 0;
        while (j2 < j) {
            int i2 = this.bitsInQueue;
            long j3 = 8;
            if (i2 == 0) {
                int i3 = this.rate;
                if (j >= i3 && j2 <= j - ((long) i3)) {
                    long j4 = (j - j2) / ((long) i3);
                    long j5 = 0;
                    while (j5 < j4) {
                        byte[] bArr2 = this.chunk;
                        System.arraycopy(bArr, (int) (((long) i) + (j2 / j3) + (((long) bArr2.length) * j5)), bArr2, 0, bArr2.length);
                        byte[] bArr3 = this.state;
                        byte[] bArr4 = this.chunk;
                        KeccakAbsorb(bArr3, bArr4, bArr4.length);
                        j5++;
                        j3 = j3;
                    }
                    j2 += j4 * ((long) this.rate);
                }
            }
            int i4 = (int) (j - j2);
            int i5 = i4 + i2;
            int i6 = this.rate;
            if (i5 > i6) {
                i4 = i6 - i2;
            }
            int i7 = i4 % 8;
            int i8 = i4 - i7;
            System.arraycopy(bArr, ((int) (j2 / 8)) + i, this.dataQueue, i2 / 8, i8 / 8);
            int i9 = this.bitsInQueue + i8;
            this.bitsInQueue = i9;
            j2 += (long) i8;
            if (i9 == this.rate) {
                absorbQueue();
            }
            if (i7 > 0) {
                byte[] bArr5 = this.dataQueue;
                int i10 = this.bitsInQueue;
                bArr5[i10 / 8] = (byte) (((1 << i7) - 1) & bArr[((int) (j2 / 8)) + i]);
                this.bitsInQueue = i10 + i7;
                j2 += (long) i7;
            }
        }
    }

    public int doFinal(byte[] bArr, int i, byte b, int i2) {
        if (i2 > 0) {
            byte[] bArr2 = this.oneByte;
            bArr2[0] = b;
            absorb(bArr2, 0, i2);
        }
        squeeze(bArr, i, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Keccak-" + this.fixedOutputLength;
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.rate / 8;
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        init(this.fixedOutputLength);
    }

    public void squeeze(byte[] bArr, int i, long j) {
        if (!this.squeezing) {
            padAndSwitchToSqueezingPhase();
        }
        long j2 = 0;
        if (j % 8 != 0) {
            qkq0.m175383a("outputLength not a multiple of 8");
            return;
        }
        while (j2 < j) {
            if (this.bitsAvailableForSqueezing == 0) {
                keccakPermutation(this.state);
                int i2 = this.rate;
                byte[] bArr2 = this.state;
                if (i2 == 1024) {
                    KeccakExtract1024bits(bArr2, this.dataQueue);
                    this.bitsAvailableForSqueezing = 1024;
                } else {
                    KeccakExtract(bArr2, this.dataQueue, i2 / 64);
                    this.bitsAvailableForSqueezing = this.rate;
                }
            }
            int i3 = this.bitsAvailableForSqueezing;
            long j3 = j - j2;
            int i4 = ((long) i3) > j3 ? (int) j3 : i3;
            System.arraycopy(this.dataQueue, (this.rate - i3) / 8, bArr, ((int) (j2 / 8)) + i, i4 / 8);
            this.bitsAvailableForSqueezing -= i4;
            j2 += (long) i4;
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.oneByte;
        bArr[0] = b;
        absorb(bArr, 0, 8L);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        absorb(bArr, i, ((long) i2) * 8);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        squeeze(bArr, i, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    public KeccakDigest(int i) {
        this.state = new byte[200];
        this.dataQueue = new byte[192];
        this.f206379C = new long[5];
        this.tempA = new long[25];
        this.chiC = new long[5];
        init(i);
    }

    public KeccakDigest() {
        this(288);
    }
}
