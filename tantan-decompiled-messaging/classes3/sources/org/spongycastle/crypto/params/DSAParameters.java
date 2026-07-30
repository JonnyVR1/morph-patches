package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g */
    private BigInteger f10328g;

    /* JADX INFO: renamed from: p */
    private BigInteger f10329p;

    /* JADX INFO: renamed from: q */
    private BigInteger f10330q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f10328g = bigInteger3;
        this.f10329p = bigInteger;
        this.f10330q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f10329p) && dSAParameters.getQ().equals(this.f10330q) && dSAParameters.getG().equals(this.f10328g);
    }

    public BigInteger getG() {
        return this.f10328g;
    }

    public BigInteger getP() {
        return this.f10329p;
    }

    public BigInteger getQ() {
        return this.f10330q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return getG().hashCode() ^ (getP().hashCode() ^ getQ().hashCode());
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f10328g = bigInteger3;
        this.f10329p = bigInteger;
        this.f10330q = bigInteger2;
    }
}
