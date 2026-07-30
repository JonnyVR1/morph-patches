package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g */
    private BigInteger f10338g;

    /* JADX INFO: renamed from: l */
    private int f10339l;

    /* JADX INFO: renamed from: p */
    private BigInteger f10340p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f10338g = bigInteger2;
        this.f10340p = bigInteger;
        this.f10339l = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f10340p) && elGamalParameters.getG().equals(this.f10338g) && elGamalParameters.getL() == this.f10339l;
    }

    public BigInteger getG() {
        return this.f10338g;
    }

    public int getL() {
        return this.f10339l;
    }

    public BigInteger getP() {
        return this.f10340p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f10339l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }
}
