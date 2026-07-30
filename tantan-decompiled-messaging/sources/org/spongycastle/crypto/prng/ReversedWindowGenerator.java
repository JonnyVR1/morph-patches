package org.spongycastle.crypto.prng;

import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class ReversedWindowGenerator implements RandomGenerator {
    private final RandomGenerator generator;
    private byte[] window;
    private int windowCount;

    public ReversedWindowGenerator(RandomGenerator randomGenerator, int i) {
        if (randomGenerator == null) {
            ig3.m135964a("generator cannot be null");
            throw null;
        }
        if (i < 2) {
            ig3.m135964a("windowSize must be at least 2");
            throw null;
        }
        this.generator = randomGenerator;
        this.window = new byte[i];
    }

    private void doNextBytes(byte[] bArr, int i, int i2) {
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    if (this.windowCount < 1) {
                        RandomGenerator randomGenerator = this.generator;
                        byte[] bArr2 = this.window;
                        randomGenerator.nextBytes(bArr2, 0, bArr2.length);
                        this.windowCount = this.window.length;
                    }
                    byte[] bArr3 = this.window;
                    int i4 = this.windowCount - 1;
                    this.windowCount = i4;
                    bArr[i3 + i] = bArr3[i4];
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            this.windowCount = 0;
            this.generator.addSeedMaterial(bArr);
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        doNextBytes(bArr, 0, bArr.length);
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        doNextBytes(bArr, i, i2);
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        synchronized (this) {
            this.windowCount = 0;
            this.generator.addSeedMaterial(j);
        }
    }
}
