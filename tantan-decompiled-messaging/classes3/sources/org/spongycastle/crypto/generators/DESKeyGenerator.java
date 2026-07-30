package org.spongycastle.crypto.generators;

import l.ig3;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DESParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DESKeyGenerator extends CipherKeyGenerator {
    @Override // org.spongycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        byte[] bArr = new byte[8];
        do {
            this.random.nextBytes(bArr);
            DESParameters.setOddParity(bArr);
        } while (DESParameters.isWeakKey(bArr, 0));
        return bArr;
    }

    @Override // org.spongycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(keyGenerationParameters);
        int i = this.strength;
        if (i == 0 || i == 7) {
            this.strength = 8;
        } else {
            if (i == 8) {
                return;
            }
            ig3.a("DES key must be 64 bits long.");
        }
    }
}
