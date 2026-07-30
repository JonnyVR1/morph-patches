package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupParameters implements CipherParameters {

    /* JADX INFO: renamed from: H */
    private Digest f207602H;

    /* JADX INFO: renamed from: g1 */
    private BigInteger f207603g1;

    /* JADX INFO: renamed from: g2 */
    private BigInteger f207604g2;

    /* JADX INFO: renamed from: p */
    private BigInteger f207605p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f207605p = bigInteger;
        this.f207603g1 = bigInteger2;
        this.f207604g2 = bigInteger3;
        this.f207602H = digest;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f207605p) && cramerShoupParameters.getG1().equals(this.f207603g1) && cramerShoupParameters.getG2().equals(this.f207604g2);
    }

    public BigInteger getG1() {
        return this.f207603g1;
    }

    public BigInteger getG2() {
        return this.f207604g2;
    }

    public Digest getH() {
        this.f207602H.reset();
        return this.f207602H;
    }

    public BigInteger getP() {
        return this.f207605p;
    }

    public int hashCode() {
        return getG2().hashCode() ^ (getP().hashCode() ^ getG1().hashCode());
    }
}
