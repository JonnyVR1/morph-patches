package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g */
    private BigInteger f207625g;

    /* JADX INFO: renamed from: p */
    private BigInteger f207626p;

    /* JADX INFO: renamed from: q */
    private BigInteger f207627q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f207625g = bigInteger3;
        this.f207626p = bigInteger;
        this.f207627q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f207626p) && dSAParameters.getQ().equals(this.f207627q) && dSAParameters.getG().equals(this.f207625g);
    }

    public BigInteger getG() {
        return this.f207625g;
    }

    public BigInteger getP() {
        return this.f207626p;
    }

    public BigInteger getQ() {
        return this.f207627q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return getG().hashCode() ^ (getP().hashCode() ^ getQ().hashCode());
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f207625g = bigInteger3;
        this.f207626p = bigInteger;
        this.f207627q = bigInteger2;
    }
}
