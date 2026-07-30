package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalPrivateKeyParameters extends ElGamalKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f207638x;

    public ElGamalPrivateKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(true, elGamalParameters);
        this.f207638x = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        if ((obj instanceof ElGamalPrivateKeyParameters) && ((ElGamalPrivateKeyParameters) obj).getX().equals(this.f207638x)) {
            return super.equals(obj);
        }
        return false;
    }

    public BigInteger getX() {
        return this.f207638x;
    }

    @Override // org.spongycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return getX().hashCode();
    }
}
