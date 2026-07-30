package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DSAPrivateKeyParameters extends DSAKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f10331x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.f10331x = bigInteger;
    }

    public BigInteger getX() {
        return this.f10331x;
    }
}
