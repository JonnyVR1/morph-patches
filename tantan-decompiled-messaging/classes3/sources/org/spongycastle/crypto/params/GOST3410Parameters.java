package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a */
    private BigInteger f10343a;

    /* JADX INFO: renamed from: p */
    private BigInteger f10344p;

    /* JADX INFO: renamed from: q */
    private BigInteger f10345q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f10343a = bigInteger3;
        this.f10344p = bigInteger;
        this.f10345q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f10344p) && gOST3410Parameters.getQ().equals(this.f10345q) && gOST3410Parameters.getA().equals(this.f10343a);
    }

    public BigInteger getA() {
        return this.f10343a;
    }

    public BigInteger getP() {
        return this.f10344p;
    }

    public BigInteger getQ() {
        return this.f10345q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return this.f10343a.hashCode() ^ (this.f10344p.hashCode() ^ this.f10345q.hashCode());
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f10344p = bigInteger;
        this.f10345q = bigInteger2;
        this.f10343a = bigInteger3;
    }
}
