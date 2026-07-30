package org.spongycastle.crypto.params;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* JADX INFO: renamed from: g */
    private BigInteger f10318g;

    /* JADX INFO: renamed from: j */
    private BigInteger f10319j;

    /* JADX INFO: renamed from: l */
    private int f10320l;

    /* JADX INFO: renamed from: m */
    private int f10321m;

    /* JADX INFO: renamed from: p */
    private BigInteger f10322p;

    /* JADX INFO: renamed from: q */
    private BigInteger f10323q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                ig3.a("when l value specified, it must satisfy 2^(l-1) <= p");
                throw null;
            }
            if (i2 < i) {
                ig3.a("when l value specified, it may not be less than m value");
                throw null;
            }
        }
        this.f10318g = bigInteger2;
        this.f10322p = bigInteger;
        this.f10323q = bigInteger3;
        this.f10321m = i;
        this.f10320l = i2;
        this.f10319j = bigInteger4;
        this.validation = dHValidationParameters;
    }

    private static int getDefaultMParam(int i) {
        if (i != 0 && i < 160) {
            return i;
        }
        return 160;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHParameters)) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.f10322p) && dHParameters.getG().equals(this.f10318g);
    }

    public BigInteger getG() {
        return this.f10318g;
    }

    public BigInteger getJ() {
        return this.f10319j;
    }

    public int getL() {
        return this.f10320l;
    }

    public int getM() {
        return this.f10321m;
    }

    public BigInteger getP() {
        return this.f10322p;
    }

    public BigInteger getQ() {
        return this.f10323q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getQ() != null ? getQ().hashCode() : 0) ^ (getP().hashCode() ^ getG().hashCode());
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i), i, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2) {
        this(bigInteger, bigInteger2, bigInteger3, i, i2, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, dHValidationParameters);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }
}
