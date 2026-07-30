package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: pk */
    private CramerShoupPublicKeyParameters f207606pk;

    /* JADX INFO: renamed from: x1 */
    private BigInteger f207607x1;

    /* JADX INFO: renamed from: x2 */
    private BigInteger f207608x2;

    /* JADX INFO: renamed from: y1 */
    private BigInteger f207609y1;

    /* JADX INFO: renamed from: y2 */
    private BigInteger f207610y2;

    /* JADX INFO: renamed from: z */
    private BigInteger f207611z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f207607x1 = bigInteger;
        this.f207608x2 = bigInteger2;
        this.f207609y1 = bigInteger3;
        this.f207610y2 = bigInteger4;
        this.f207611z = bigInteger5;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f207607x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f207608x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f207609y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f207610y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f207611z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f207606pk;
    }

    public BigInteger getX1() {
        return this.f207607x1;
    }

    public BigInteger getX2() {
        return this.f207608x2;
    }

    public BigInteger getY1() {
        return this.f207609y1;
    }

    public BigInteger getY2() {
        return this.f207610y2;
    }

    public BigInteger getZ() {
        return this.f207611z;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return super.hashCode() ^ ((((this.f207607x1.hashCode() ^ this.f207608x2.hashCode()) ^ this.f207609y1.hashCode()) ^ this.f207610y2.hashCode()) ^ this.f207611z.hashCode());
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f207606pk = cramerShoupPublicKeyParameters;
    }
}
