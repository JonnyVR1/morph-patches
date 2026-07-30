package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* JADX INFO: renamed from: dP */
    private BigInteger f206737dP;

    /* JADX INFO: renamed from: dQ */
    private BigInteger f206738dQ;

    /* JADX INFO: renamed from: e */
    private BigInteger f206739e;

    /* JADX INFO: renamed from: p */
    private BigInteger f206740p;

    /* JADX INFO: renamed from: q */
    private BigInteger f206741q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f206739e = bigInteger2;
        this.f206740p = bigInteger4;
        this.f206741q = bigInteger5;
        this.f206737dP = bigInteger6;
        this.f206738dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f206737dP;
    }

    public BigInteger getDQ() {
        return this.f206738dQ;
    }

    public BigInteger getP() {
        return this.f206740p;
    }

    public BigInteger getPublicExponent() {
        return this.f206739e;
    }

    public BigInteger getQ() {
        return this.f206741q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}
