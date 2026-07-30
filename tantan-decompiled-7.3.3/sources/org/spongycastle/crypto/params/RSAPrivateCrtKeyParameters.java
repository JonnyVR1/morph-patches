package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* JADX INFO: renamed from: dP */
    private BigInteger f207659dP;

    /* JADX INFO: renamed from: dQ */
    private BigInteger f207660dQ;

    /* JADX INFO: renamed from: e */
    private BigInteger f207661e;

    /* JADX INFO: renamed from: p */
    private BigInteger f207662p;

    /* JADX INFO: renamed from: q */
    private BigInteger f207663q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f207661e = bigInteger2;
        this.f207662p = bigInteger4;
        this.f207663q = bigInteger5;
        this.f207659dP = bigInteger6;
        this.f207660dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f207659dP;
    }

    public BigInteger getDQ() {
        return this.f207660dQ;
    }

    public BigInteger getP() {
        return this.f207662p;
    }

    public BigInteger getPublicExponent() {
        return this.f207661e;
    }

    public BigInteger getQ() {
        return this.f207663q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}
