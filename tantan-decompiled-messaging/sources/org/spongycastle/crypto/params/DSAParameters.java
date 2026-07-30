package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g */
    private BigInteger f206703g;

    /* JADX INFO: renamed from: p */
    private BigInteger f206704p;

    /* JADX INFO: renamed from: q */
    private BigInteger f206705q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f206703g = bigInteger3;
        this.f206704p = bigInteger;
        this.f206705q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f206704p) && dSAParameters.getQ().equals(this.f206705q) && dSAParameters.getG().equals(this.f206703g);
    }

    public BigInteger getG() {
        return this.f206703g;
    }

    public BigInteger getP() {
        return this.f206704p;
    }

    public BigInteger getQ() {
        return this.f206705q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return getG().hashCode() ^ (getP().hashCode() ^ getQ().hashCode());
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f206703g = bigInteger3;
        this.f206704p = bigInteger;
        this.f206705q = bigInteger2;
    }
}
