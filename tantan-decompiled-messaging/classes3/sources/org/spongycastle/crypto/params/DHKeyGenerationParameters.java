package org.spongycastle.crypto.params;

import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DHKeyGenerationParameters extends KeyGenerationParameters {
    private DHParameters params;

    public DHKeyGenerationParameters(SecureRandom secureRandom, DHParameters dHParameters) {
        super(secureRandom, getStrength(dHParameters));
        this.params = dHParameters;
    }

    public static int getStrength(DHParameters dHParameters) {
        return dHParameters.getL() != 0 ? dHParameters.getL() : dHParameters.getP().bitLength();
    }

    public DHParameters getParameters() {
        return this.params;
    }
}
