package org.spongycastle.crypto.prng;

import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: classes3.dex */
public class DigestRandomGenerator implements RandomGenerator {
    private static long CYCLE_COUNT = 10;
    private Digest digest;
    private byte[] seed;
    private byte[] state;
    private long seedCounter = 1;
    private long stateCounter = 1;

    public DigestRandomGenerator(Digest digest) {
        this.digest = digest;
        this.seed = new byte[digest.getDigestSize()];
        this.state = new byte[digest.getDigestSize()];
    }

    private void cycleSeed() {
        digestUpdate(this.seed);
        long j = this.seedCounter;
        this.seedCounter = 1 + j;
        digestAddCounter(j);
        digestDoFinal(this.seed);
    }

    private void digestAddCounter(long j) {
        for (int i = 0; i != 8; i++) {
            this.digest.update((byte) j);
            j >>>= 8;
        }
    }

    private void digestDoFinal(byte[] bArr) {
        this.digest.doFinal(bArr, 0);
    }

    private void digestUpdate(byte[] bArr) {
        this.digest.update(bArr, 0, bArr.length);
    }

    private void generateState() {
        long j = this.stateCounter;
        this.stateCounter = 1 + j;
        digestAddCounter(j);
        digestUpdate(this.state);
        digestUpdate(this.seed);
        digestDoFinal(this.state);
        if (this.stateCounter % CYCLE_COUNT == 0) {
            cycleSeed();
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            digestUpdate(bArr);
            digestUpdate(this.seed);
            digestDoFinal(this.seed);
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this) {
            try {
                generateState();
                int i3 = i2 + i;
                int i4 = 0;
                while (i != i3) {
                    if (i4 == this.state.length) {
                        generateState();
                        i4 = 0;
                    }
                    bArr[i] = this.state[i4];
                    i++;
                    i4++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        synchronized (this) {
            digestAddCounter(j);
            digestUpdate(this.seed);
            digestDoFinal(this.seed);
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }
}
