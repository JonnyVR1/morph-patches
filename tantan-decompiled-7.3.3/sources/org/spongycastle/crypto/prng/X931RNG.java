package org.spongycastle.crypto.prng;

import org.spongycastle.crypto.BlockCipher;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class X931RNG {
    private static final int BLOCK128_MAX_BITS_REQUEST = 262144;
    private static final long BLOCK128_RESEED_MAX = 8388608;
    private static final int BLOCK64_MAX_BITS_REQUEST = 4096;
    private static final long BLOCK64_RESEED_MAX = 32768;

    /* JADX INFO: renamed from: DT */
    private final byte[] f207669DT;

    /* JADX INFO: renamed from: I */
    private final byte[] f207670I;

    /* JADX INFO: renamed from: R */
    private final byte[] f207671R;

    /* JADX INFO: renamed from: V */
    private byte[] f207672V;
    private final BlockCipher engine;
    private final EntropySource entropySource;
    private long reseedCounter = 1;

    public X931RNG(BlockCipher blockCipher, byte[] bArr, EntropySource entropySource) {
        this.engine = blockCipher;
        this.entropySource = entropySource;
        byte[] bArr2 = new byte[blockCipher.getBlockSize()];
        this.f207669DT = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f207670I = new byte[blockCipher.getBlockSize()];
        this.f207671R = new byte[blockCipher.getBlockSize()];
    }

    private void increment(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) (bArr[length] + 1);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    private static boolean isTooLarge(byte[] bArr, int i) {
        return bArr != null && bArr.length > i;
    }

    private void process(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) (bArr2[i] ^ bArr3[i]);
        }
        this.engine.processBlock(bArr, 0, bArr, 0);
    }

    public int generate(byte[] bArr, boolean z) {
        int length = this.f207671R.length;
        long j = this.reseedCounter;
        if (length == 8) {
            if (j > 32768) {
                return -1;
            }
            if (isTooLarge(bArr, 512)) {
                wg3.m206174a("Number of bits per request limited to 4096");
                return 0;
            }
        } else {
            if (j > BLOCK128_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 32768)) {
                wg3.m206174a("Number of bits per request limited to 262144");
                return 0;
            }
        }
        if (z || this.f207672V == null) {
            byte[] entropy = this.entropySource.getEntropy();
            this.f207672V = entropy;
            if (entropy.length != this.engine.getBlockSize()) {
                wtq0.m207906a("Insufficient entropy returned");
                return 0;
            }
        }
        int length2 = bArr.length / this.f207671R.length;
        for (int i = 0; i < length2; i++) {
            this.engine.processBlock(this.f207669DT, 0, this.f207670I, 0);
            process(this.f207671R, this.f207670I, this.f207672V);
            process(this.f207672V, this.f207671R, this.f207670I);
            byte[] bArr2 = this.f207671R;
            System.arraycopy(bArr2, 0, bArr, bArr2.length * i, bArr2.length);
            increment(this.f207669DT);
        }
        int length3 = bArr.length - (this.f207671R.length * length2);
        if (length3 > 0) {
            this.engine.processBlock(this.f207669DT, 0, this.f207670I, 0);
            process(this.f207671R, this.f207670I, this.f207672V);
            process(this.f207672V, this.f207671R, this.f207670I);
            byte[] bArr3 = this.f207671R;
            System.arraycopy(bArr3, 0, bArr, length2 * bArr3.length, length3);
            increment(this.f207669DT);
        }
        this.reseedCounter++;
        return bArr.length;
    }

    public EntropySource getEntropySource() {
        return this.entropySource;
    }

    public void reseed() {
        byte[] entropy = this.entropySource.getEntropy();
        this.f207672V = entropy;
        if (entropy.length == this.engine.getBlockSize()) {
            this.reseedCounter = 1L;
        } else {
            wtq0.m207906a("Insufficient entropy returned");
        }
    }
}
