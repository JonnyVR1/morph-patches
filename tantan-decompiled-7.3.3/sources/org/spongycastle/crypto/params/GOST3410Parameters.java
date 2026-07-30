package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a */
    private BigInteger f207640a;

    /* JADX INFO: renamed from: p */
    private BigInteger f207641p;

    /* JADX INFO: renamed from: q */
    private BigInteger f207642q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f207640a = bigInteger3;
        this.f207641p = bigInteger;
        this.f207642q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f207641p) && gOST3410Parameters.getQ().equals(this.f207642q) && gOST3410Parameters.getA().equals(this.f207640a);
    }

    public BigInteger getA() {
        return this.f207640a;
    }

    public BigInteger getP() {
        return this.f207641p;
    }

    public BigInteger getQ() {
        return this.f207642q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return this.f207640a.hashCode() ^ (this.f207641p.hashCode() ^ this.f207642q.hashCode());
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f207641p = bigInteger;
        this.f207642q = bigInteger2;
        this.f207640a = bigInteger3;
    }
}
