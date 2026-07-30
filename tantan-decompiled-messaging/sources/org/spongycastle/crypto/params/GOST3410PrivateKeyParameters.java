package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410PrivateKeyParameters extends GOST3410KeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f206721x;

    public GOST3410PrivateKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(true, gOST3410Parameters);
        this.f206721x = bigInteger;
    }

    public BigInteger getX() {
        return this.f206721x;
    }
}
