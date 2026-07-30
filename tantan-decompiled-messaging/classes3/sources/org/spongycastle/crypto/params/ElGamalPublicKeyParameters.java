package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f10342y;

    public ElGamalPublicKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(false, elGamalParameters);
        this.f10342y = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof ElGamalPublicKeyParameters) && ((ElGamalPublicKeyParameters) obj).getY().equals(this.f10342y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f10342y;
    }

    @Override // org.spongycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return super.hashCode() ^ this.f10342y.hashCode();
    }
}
