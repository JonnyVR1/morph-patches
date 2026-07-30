package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410PublicKeyParameters extends GOST3410KeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f207644y;

    public GOST3410PublicKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(false, gOST3410Parameters);
        this.f207644y = bigInteger;
    }

    public BigInteger getY() {
        return this.f207644y;
    }
}
