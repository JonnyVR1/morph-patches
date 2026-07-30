package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g */
    private BigInteger f207635g;

    /* JADX INFO: renamed from: l */
    private int f207636l;

    /* JADX INFO: renamed from: p */
    private BigInteger f207637p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f207635g = bigInteger2;
        this.f207637p = bigInteger;
        this.f207636l = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f207637p) && elGamalParameters.getG().equals(this.f207635g) && elGamalParameters.getL() == this.f207636l;
    }

    public BigInteger getG() {
        return this.f207635g;
    }

    public int getL() {
        return this.f207636l;
    }

    public BigInteger getP() {
        return this.f207637p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f207636l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }
}
