package org.spongycastle.crypto.prng;

import org.spongycastle.crypto.BlockCipher;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class X931RNG {
    private static final int BLOCK128_MAX_BITS_REQUEST = 262144;
    private static final long BLOCK128_RESEED_MAX = 8388608;
    private static final int BLOCK64_MAX_BITS_REQUEST = 4096;
    private static final long BLOCK64_RESEED_MAX = 32768;

    /* JADX INFO: renamed from: DT */
    private final byte[] f206747DT;

    /* JADX INFO: renamed from: I */
    private final byte[] f206748I;

    /* JADX INFO: renamed from: R */
    private final byte[] f206749R;

    /* JADX INFO: renamed from: V */
    private byte[] f206750V;
    private final BlockCipher engine;
    private final EntropySource entropySource;
    private long reseedCounter = 1;

    public X931RNG(BlockCipher blockCipher, byte[] bArr, EntropySource entropySource) {
        this.engine = blockCipher;
        this.entropySource = entropySource;
        byte[] bArr2 = new byte[blockCipher.getBlockSize()];
        this.f206747DT = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f206748I = new byte[blockCipher.getBlockSize()];
        this.f206749R = new byte[blockCipher.getBlockSize()];
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
        int length = this.f206749R.length;
        long j = this.reseedCounter;
        if (length == 8) {
            if (j > 32768) {
                return -1;
            }
            if (isTooLarge(bArr, 512)) {
                ig3.m135964a("Number of bits per request limited to 4096");
                return 0;
            }
        } else {
            if (j > BLOCK128_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 32768)) {
                ig3.m135964a("Number of bits per request limited to 262144");
                return 0;
            }
        }
        if (z || this.f206750V == null) {
            byte[] entropy = this.entropySource.getEntropy();
            this.f206750V = entropy;
            if (entropy.length != this.engine.getBlockSize()) {
                qkq0.m175383a("Insufficient entropy returned");
                return 0;
            }
        }
        int length2 = bArr.length / this.f206749R.length;
        for (int i = 0; i < length2; i++) {
            this.engine.processBlock(this.f206747DT, 0, this.f206748I, 0);
            process(this.f206749R, this.f206748I, this.f206750V);
            process(this.f206750V, this.f206749R, this.f206748I);
            byte[] bArr2 = this.f206749R;
            System.arraycopy(bArr2, 0, bArr, bArr2.length * i, bArr2.length);
            increment(this.f206747DT);
        }
        int length3 = bArr.length - (this.f206749R.length * length2);
        if (length3 > 0) {
            this.engine.processBlock(this.f206747DT, 0, this.f206748I, 0);
            process(this.f206749R, this.f206748I, this.f206750V);
            process(this.f206750V, this.f206749R, this.f206748I);
            byte[] bArr3 = this.f206749R;
            System.arraycopy(bArr3, 0, bArr, length2 * bArr3.length, length3);
            increment(this.f206747DT);
        }
        this.reseedCounter++;
        return bArr.length;
    }

    public EntropySource getEntropySource() {
        return this.entropySource;
    }

    public void reseed() {
        byte[] entropy = this.entropySource.getEntropy();
        this.f206750V = entropy;
        if (entropy.length == this.engine.getBlockSize()) {
            this.reseedCounter = 1L;
        } else {
            qkq0.m175383a("Insufficient entropy returned");
        }
    }
}
