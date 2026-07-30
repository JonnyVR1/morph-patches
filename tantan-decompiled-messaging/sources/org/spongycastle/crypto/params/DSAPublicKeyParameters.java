package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class DSAPublicKeyParameters extends DSAKeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f206707y;

    public DSAPublicKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(false, dSAParameters);
        this.f206707y = bigInteger;
    }

    public BigInteger getY() {
        return this.f206707y;
    }
}
