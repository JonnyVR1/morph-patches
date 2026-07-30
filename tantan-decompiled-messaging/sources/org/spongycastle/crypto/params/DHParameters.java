package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* JADX INFO: renamed from: g */
    private BigInteger f206693g;

    /* JADX INFO: renamed from: j */
    private BigInteger f206694j;

    /* JADX INFO: renamed from: l */
    private int f206695l;

    /* JADX INFO: renamed from: m */
    private int f206696m;

    /* JADX INFO: renamed from: p */
    private BigInteger f206697p;

    /* JADX INFO: renamed from: q */
    private BigInteger f206698q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                ig3.m135964a("when l value specified, it must satisfy 2^(l-1) <= p");
                throw null;
            }
            if (i2 < i) {
                ig3.m135964a("when l value specified, it may not be less than m value");
                throw null;
            }
        }
        this.f206693g = bigInteger2;
        this.f206697p = bigInteger;
        this.f206698q = bigInteger3;
        this.f206696m = i;
        this.f206695l = i2;
        this.f206694j = bigInteger4;
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
        return dHParameters.getP().equals(this.f206697p) && dHParameters.getG().equals(this.f206693g);
    }

    public BigInteger getG() {
        return this.f206693g;
    }

    public BigInteger getJ() {
        return this.f206694j;
    }

    public int getL() {
        return this.f206695l;
    }

    public int getM() {
        return this.f206696m;
    }

    public BigInteger getP() {
        return this.f206697p;
    }

    public BigInteger getQ() {
        return this.f206698q;
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
