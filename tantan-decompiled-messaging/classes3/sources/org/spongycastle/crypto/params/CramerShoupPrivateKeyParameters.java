package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: pk */
    private CramerShoupPublicKeyParameters f10309pk;

    /* JADX INFO: renamed from: x1 */
    private BigInteger f10310x1;

    /* JADX INFO: renamed from: x2 */
    private BigInteger f10311x2;

    /* JADX INFO: renamed from: y1 */
    private BigInteger f10312y1;

    /* JADX INFO: renamed from: y2 */
    private BigInteger f10313y2;

    /* JADX INFO: renamed from: z */
    private BigInteger f10314z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f10310x1 = bigInteger;
        this.f10311x2 = bigInteger2;
        this.f10312y1 = bigInteger3;
        this.f10313y2 = bigInteger4;
        this.f10314z = bigInteger5;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f10310x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f10311x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f10312y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f10313y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f10314z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f10309pk;
    }

    public BigInteger getX1() {
        return this.f10310x1;
    }

    public BigInteger getX2() {
        return this.f10311x2;
    }

    public BigInteger getY1() {
        return this.f10312y1;
    }

    public BigInteger getY2() {
        return this.f10313y2;
    }

    public BigInteger getZ() {
        return this.f10314z;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return super.hashCode() ^ ((((this.f10310x1.hashCode() ^ this.f10311x2.hashCode()) ^ this.f10312y1.hashCode()) ^ this.f10313y2.hashCode()) ^ this.f10314z.hashCode());
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f10309pk = cramerShoupPublicKeyParameters;
    }
}
