package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GOST3410PublicKeyParameters extends GOST3410KeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f10347y;

    public GOST3410PublicKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(false, gOST3410Parameters);
        this.f10347y = bigInteger;
    }

    public BigInteger getY() {
        return this.f10347y;
    }
}
