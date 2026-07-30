package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* JADX INFO: renamed from: g */
    private BigInteger f207615g;

    /* JADX INFO: renamed from: j */
    private BigInteger f207616j;

    /* JADX INFO: renamed from: l */
    private int f207617l;

    /* JADX INFO: renamed from: m */
    private int f207618m;

    /* JADX INFO: renamed from: p */
    private BigInteger f207619p;

    /* JADX INFO: renamed from: q */
    private BigInteger f207620q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                wg3.m206174a("when l value specified, it must satisfy 2^(l-1) <= p");
                throw null;
            }
            if (i2 < i) {
                wg3.m206174a("when l value specified, it may not be less than m value");
                throw null;
            }
        }
        this.f207615g = bigInteger2;
        this.f207619p = bigInteger;
        this.f207620q = bigInteger3;
        this.f207618m = i;
        this.f207617l = i2;
        this.f207616j = bigInteger4;
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
        return dHParameters.getP().equals(this.f207619p) && dHParameters.getG().equals(this.f207615g);
    }

    public BigInteger getG() {
        return this.f207615g;
    }

    public BigInteger getJ() {
        return this.f207616j;
    }

    public int getL() {
        return this.f207617l;
    }

    public int getM() {
        return this.f207618m;
    }

    public BigInteger getP() {
        return this.f207619p;
    }

    public BigInteger getQ() {
        return this.f207620q;
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
