package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g */
    private BigInteger f206713g;

    /* JADX INFO: renamed from: l */
    private int f206714l;

    /* JADX INFO: renamed from: p */
    private BigInteger f206715p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f206713g = bigInteger2;
        this.f206715p = bigInteger;
        this.f206714l = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f206715p) && elGamalParameters.getG().equals(this.f206713g) && elGamalParameters.getL() == this.f206714l;
    }

    public BigInteger getG() {
        return this.f206713g;
    }

    public int getL() {
        return this.f206714l;
    }

    public BigInteger getP() {
        return this.f206715p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f206714l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }
}
