package org.spongycastle.crypto.params;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ParametersWithRandom implements CipherParameters {
    private CipherParameters parameters;
    private SecureRandom random;

    public ParametersWithRandom(CipherParameters cipherParameters) {
        this(cipherParameters, new SecureRandom());
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public ParametersWithRandom(CipherParameters cipherParameters, SecureRandom secureRandom) {
        this.random = secureRandom;
        this.parameters = cipherParameters;
    }
}
