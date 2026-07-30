package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class DSAPublicKeyParameters extends DSAKeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f207629y;

    public DSAPublicKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(false, dSAParameters);
        this.f207629y = bigInteger;
    }

    public BigInteger getY() {
        return this.f207629y;
    }
}
