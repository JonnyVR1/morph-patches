package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c */
    private BigInteger f206690c;

    /* JADX INFO: renamed from: d */
    private BigInteger f206691d;

    /* JADX INFO: renamed from: h */
    private BigInteger f206692h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f206690c = bigInteger;
        this.f206691d = bigInteger2;
        this.f206692h = bigInteger3;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f206690c) && cramerShoupPublicKeyParameters.getD().equals(this.f206691d) && cramerShoupPublicKeyParameters.getH().equals(this.f206692h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f206690c;
    }

    public BigInteger getD() {
        return this.f206691d;
    }

    public BigInteger getH() {
        return this.f206692h;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return super.hashCode() ^ ((this.f206690c.hashCode() ^ this.f206691d.hashCode()) ^ this.f206692h.hashCode());
    }
}
