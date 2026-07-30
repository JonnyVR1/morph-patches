package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: pk */
    private CramerShoupPublicKeyParameters f206684pk;

    /* JADX INFO: renamed from: x1 */
    private BigInteger f206685x1;

    /* JADX INFO: renamed from: x2 */
    private BigInteger f206686x2;

    /* JADX INFO: renamed from: y1 */
    private BigInteger f206687y1;

    /* JADX INFO: renamed from: y2 */
    private BigInteger f206688y2;

    /* JADX INFO: renamed from: z */
    private BigInteger f206689z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f206685x1 = bigInteger;
        this.f206686x2 = bigInteger2;
        this.f206687y1 = bigInteger3;
        this.f206688y2 = bigInteger4;
        this.f206689z = bigInteger5;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f206685x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f206686x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f206687y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f206688y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f206689z) && super.equals(obj);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f206684pk;
    }

    public BigInteger getX1() {
        return this.f206685x1;
    }

    public BigInteger getX2() {
        return this.f206686x2;
    }

    public BigInteger getY1() {
        return this.f206687y1;
    }

    public BigInteger getY2() {
        return this.f206688y2;
    }

    public BigInteger getZ() {
        return this.f206689z;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return super.hashCode() ^ ((((this.f206685x1.hashCode() ^ this.f206686x2.hashCode()) ^ this.f206687y1.hashCode()) ^ this.f206688y2.hashCode()) ^ this.f206689z.hashCode());
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f206684pk = cramerShoupPublicKeyParameters;
    }
}
