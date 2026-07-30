package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GOST3410PrivateKeyParameters extends GOST3410KeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f10346x;

    public GOST3410PrivateKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(true, gOST3410Parameters);
        this.f10346x = bigInteger;
    }

    public BigInteger getX() {
        return this.f10346x;
    }
}
