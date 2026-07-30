package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalPrivateKeyParameters extends ElGamalKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f206716x;

    public ElGamalPrivateKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(true, elGamalParameters);
        this.f206716x = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        if ((obj instanceof ElGamalPrivateKeyParameters) && ((ElGamalPrivateKeyParameters) obj).getX().equals(this.f206716x)) {
            return super.equals(obj);
        }
        return false;
    }

    public BigInteger getX() {
        return this.f206716x;
    }

    @Override // org.spongycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return getX().hashCode();
    }
}
