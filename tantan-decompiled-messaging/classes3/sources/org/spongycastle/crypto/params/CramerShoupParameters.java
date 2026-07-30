package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CramerShoupParameters implements CipherParameters {

    /* JADX INFO: renamed from: H */
    private Digest f10305H;

    /* JADX INFO: renamed from: g1 */
    private BigInteger f10306g1;

    /* JADX INFO: renamed from: g2 */
    private BigInteger f10307g2;

    /* JADX INFO: renamed from: p */
    private BigInteger f10308p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f10308p = bigInteger;
        this.f10306g1 = bigInteger2;
        this.f10307g2 = bigInteger3;
        this.f10305H = digest;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f10308p) && cramerShoupParameters.getG1().equals(this.f10306g1) && cramerShoupParameters.getG2().equals(this.f10307g2);
    }

    public BigInteger getG1() {
        return this.f10306g1;
    }

    public BigInteger getG2() {
        return this.f10307g2;
    }

    public Digest getH() {
        this.f10305H.reset();
        return this.f10305H;
    }

    public BigInteger getP() {
        return this.f10308p;
    }

    public int hashCode() {
        return getG2().hashCode() ^ (getP().hashCode() ^ getG1().hashCode());
    }
}
