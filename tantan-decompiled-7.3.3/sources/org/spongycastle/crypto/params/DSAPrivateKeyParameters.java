package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class DSAPrivateKeyParameters extends DSAKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f207628x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.f207628x = bigInteger;
    }

    public BigInteger getX() {
        return this.f207628x;
    }
}
