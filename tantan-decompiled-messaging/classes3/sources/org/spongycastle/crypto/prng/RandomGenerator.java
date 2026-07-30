package org.spongycastle.crypto.prng;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i, int i2);
}
