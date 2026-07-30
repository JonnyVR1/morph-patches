package org.spongycastle.crypto.generators;

import l.ig3;
import l.qkq0;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DESParameters;
import org.spongycastle.crypto.params.DESedeParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DESedeKeyGenerator extends DESKeyGenerator {
    private static final int MAX_IT = 20;

    @Override // org.spongycastle.crypto.generators.DESKeyGenerator, org.spongycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        int i = this.strength;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            this.random.nextBytes(bArr);
            DESParameters.setOddParity(bArr);
            i2++;
            if (i2 >= 20 || (!DESedeParameters.isWeakKey(bArr, 0, i) && DESedeParameters.isRealEDEKey(bArr, 0))) {
                break;
            }
        }
        if (!DESedeParameters.isWeakKey(bArr, 0, i) && DESedeParameters.isRealEDEKey(bArr, 0)) {
            return bArr;
        }
        qkq0.a("Unable to generate DES-EDE key");
        return null;
    }

    @Override // org.spongycastle.crypto.generators.DESKeyGenerator, org.spongycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        int strength = (keyGenerationParameters.getStrength() + 7) / 8;
        this.strength = strength;
        if (strength == 0 || strength == 21) {
            this.strength = 24;
            return;
        }
        if (strength == 14) {
            this.strength = 16;
        } else {
            if (strength == 24 || strength == 16) {
                return;
            }
            ig3.a("DESede key must be 192 or 128 bits long.");
        }
    }
}
