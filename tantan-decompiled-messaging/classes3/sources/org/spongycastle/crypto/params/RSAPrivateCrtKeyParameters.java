package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    /* JADX INFO: renamed from: dP */
    private BigInteger f10362dP;

    /* JADX INFO: renamed from: dQ */
    private BigInteger f10363dQ;

    /* JADX INFO: renamed from: e */
    private BigInteger f10364e;

    /* JADX INFO: renamed from: p */
    private BigInteger f10365p;

    /* JADX INFO: renamed from: q */
    private BigInteger f10366q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f10364e = bigInteger2;
        this.f10365p = bigInteger4;
        this.f10366q = bigInteger5;
        this.f10362dP = bigInteger6;
        this.f10363dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.f10362dP;
    }

    public BigInteger getDQ() {
        return this.f10363dQ;
    }

    public BigInteger getP() {
        return this.f10365p;
    }

    public BigInteger getPublicExponent() {
        return this.f10364e;
    }

    public BigInteger getQ() {
        return this.f10366q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}
