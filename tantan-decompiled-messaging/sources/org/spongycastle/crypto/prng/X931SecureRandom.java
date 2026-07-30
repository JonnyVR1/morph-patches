package org.spongycastle.crypto.prng;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class X931SecureRandom extends SecureRandom {
    private final X931RNG drbg;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    public X931SecureRandom(SecureRandom secureRandom, X931RNG x931rng, boolean z) {
        this.randomSource = secureRandom;
        this.drbg = x931rng;
        this.predictionResistant = z;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        return EntropyUtil.generateSeed(this.drbg.getEntropySource(), i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.drbg.generate(bArr, this.predictionResistant) < 0) {
                    this.drbg.reseed();
                    this.drbg.generate(bArr, this.predictionResistant);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.randomSource;
                if (secureRandom != null) {
                    secureRandom.setSeed(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.randomSource;
                if (secureRandom != null) {
                    secureRandom.setSeed(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
