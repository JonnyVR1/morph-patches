package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import l.ig3;
import org.spongycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RSAKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private BigInteger publicExponent;

    public RSAKeyGenerationParameters(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i < 12) {
            ig3.a("key strength too small");
            throw null;
        }
        if (!bigInteger.testBit(0)) {
            ig3.a("public exponent cannot be even");
            throw null;
        }
        this.publicExponent = bigInteger;
        this.certainty = i2;
    }

    public int getCertainty() {
        return this.certainty;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }
}
