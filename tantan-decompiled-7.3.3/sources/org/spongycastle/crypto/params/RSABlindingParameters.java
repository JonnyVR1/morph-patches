package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class RSABlindingParameters implements CipherParameters {
    private BigInteger blindingFactor;
    private RSAKeyParameters publicKey;

    public RSABlindingParameters(RSAKeyParameters rSAKeyParameters, BigInteger bigInteger) {
        if (rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) {
            wg3.m206174a("RSA parameters should be for a public key");
            throw null;
        }
        this.publicKey = rSAKeyParameters;
        this.blindingFactor = bigInteger;
    }

    public BigInteger getBlindingFactor() {
        return this.blindingFactor;
    }

    public RSAKeyParameters getPublicKey() {
        return this.publicKey;
    }
}
