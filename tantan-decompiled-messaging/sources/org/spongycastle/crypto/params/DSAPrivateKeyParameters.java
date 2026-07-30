package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class DSAPrivateKeyParameters extends DSAKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f206706x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.f206706x = bigInteger;
    }

    public BigInteger getX() {
        return this.f206706x;
    }
}
