package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupParameters implements CipherParameters {

    /* JADX INFO: renamed from: H */
    private Digest f206680H;

    /* JADX INFO: renamed from: g1 */
    private BigInteger f206681g1;

    /* JADX INFO: renamed from: g2 */
    private BigInteger f206682g2;

    /* JADX INFO: renamed from: p */
    private BigInteger f206683p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f206683p = bigInteger;
        this.f206681g1 = bigInteger2;
        this.f206682g2 = bigInteger3;
        this.f206680H = digest;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f206683p) && cramerShoupParameters.getG1().equals(this.f206681g1) && cramerShoupParameters.getG2().equals(this.f206682g2);
    }

    public BigInteger getG1() {
        return this.f206681g1;
    }

    public BigInteger getG2() {
        return this.f206682g2;
    }

    public Digest getH() {
        this.f206680H.reset();
        return this.f206680H;
    }

    public BigInteger getP() {
        return this.f206683p;
    }

    public int hashCode() {
        return getG2().hashCode() ^ (getP().hashCode() ^ getG1().hashCode());
    }
}
