package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c */
    private BigInteger f207612c;

    /* JADX INFO: renamed from: d */
    private BigInteger f207613d;

    /* JADX INFO: renamed from: h */
    private BigInteger f207614h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f207612c = bigInteger;
        this.f207613d = bigInteger2;
        this.f207614h = bigInteger3;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f207612c) && cramerShoupPublicKeyParameters.getD().equals(this.f207613d) && cramerShoupPublicKeyParameters.getH().equals(this.f207614h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f207612c;
    }

    public BigInteger getD() {
        return this.f207613d;
    }

    public BigInteger getH() {
        return this.f207614h;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return super.hashCode() ^ ((this.f207612c.hashCode() ^ this.f207613d.hashCode()) ^ this.f207614h.hashCode());
    }
}
