package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RSAKeyParameters extends AsymmetricKeyParameter {
    private BigInteger exponent;
    private BigInteger modulus;

    public RSAKeyParameters(boolean z, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z);
        this.modulus = bigInteger;
        this.exponent = bigInteger2;
    }

    public BigInteger getExponent() {
        return this.exponent;
    }

    public BigInteger getModulus() {
        return this.modulus;
    }
}
