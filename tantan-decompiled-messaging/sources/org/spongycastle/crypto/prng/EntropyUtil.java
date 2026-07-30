package org.spongycastle.crypto.prng;

/* JADX INFO: loaded from: classes3.dex */
public class EntropyUtil {
    public static byte[] generateSeed(EntropySource entropySource, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= entropySource.entropySize()) {
            System.arraycopy(entropySource.getEntropy(), 0, bArr, 0, i);
            return bArr;
        }
        int iEntropySize = entropySource.entropySize() / 8;
        for (int i2 = 0; i2 < i; i2 += iEntropySize) {
            byte[] entropy = entropySource.getEntropy();
            int i3 = i - i2;
            if (entropy.length <= i3) {
                System.arraycopy(entropy, 0, bArr, i2, entropy.length);
            } else {
                System.arraycopy(entropy, 0, bArr, i2, i3);
            }
        }
        return bArr;
    }
}
