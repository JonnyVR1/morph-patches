package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class RSAKeyGenerationParameters extends KeyGenerationParameters {
    private int certainty;
    private BigInteger publicExponent;

    public RSAKeyGenerationParameters(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i < 12) {
            wg3.m206174a("key strength too small");
            throw null;
        }
        if (!bigInteger.testBit(0)) {
            wg3.m206174a("public exponent cannot be even");
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
