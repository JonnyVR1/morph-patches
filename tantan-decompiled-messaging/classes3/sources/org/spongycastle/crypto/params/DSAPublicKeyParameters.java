package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DSAPublicKeyParameters extends DSAKeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f10332y;

    public DSAPublicKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(false, dSAParameters);
        this.f10332y = bigInteger;
    }

    public BigInteger getY() {
        return this.f10332y;
    }
}
