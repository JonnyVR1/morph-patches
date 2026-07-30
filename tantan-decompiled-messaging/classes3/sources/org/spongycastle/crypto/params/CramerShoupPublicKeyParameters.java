package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c */
    private BigInteger f10315c;

    /* JADX INFO: renamed from: d */
    private BigInteger f10316d;

    /* JADX INFO: renamed from: h */
    private BigInteger f10317h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f10315c = bigInteger;
        this.f10316d = bigInteger2;
        this.f10317h = bigInteger3;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f10315c) && cramerShoupPublicKeyParameters.getD().equals(this.f10316d) && cramerShoupPublicKeyParameters.getH().equals(this.f10317h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f10315c;
    }

    public BigInteger getD() {
        return this.f10316d;
    }

    public BigInteger getH() {
        return this.f10317h;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return super.hashCode() ^ ((this.f10315c.hashCode() ^ this.f10316d.hashCode()) ^ this.f10317h.hashCode());
    }
}
