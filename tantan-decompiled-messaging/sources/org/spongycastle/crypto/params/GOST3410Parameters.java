package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a */
    private BigInteger f206718a;

    /* JADX INFO: renamed from: p */
    private BigInteger f206719p;

    /* JADX INFO: renamed from: q */
    private BigInteger f206720q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f206718a = bigInteger3;
        this.f206719p = bigInteger;
        this.f206720q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f206719p) && gOST3410Parameters.getQ().equals(this.f206720q) && gOST3410Parameters.getA().equals(this.f206718a);
    }

    public BigInteger getA() {
        return this.f206718a;
    }

    public BigInteger getP() {
        return this.f206719p;
    }

    public BigInteger getQ() {
        return this.f206720q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return this.f206718a.hashCode() ^ (this.f206719p.hashCode() ^ this.f206720q.hashCode());
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f206719p = bigInteger;
        this.f206720q = bigInteger2;
        this.f206718a = bigInteger3;
    }
}
