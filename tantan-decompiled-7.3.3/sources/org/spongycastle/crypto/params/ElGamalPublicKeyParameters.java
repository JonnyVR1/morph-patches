package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f207639y;

    public ElGamalPublicKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(false, elGamalParameters);
        this.f207639y = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof ElGamalPublicKeyParameters) && ((ElGamalPublicKeyParameters) obj).getY().equals(this.f207639y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f207639y;
    }

    @Override // org.spongycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return super.hashCode() ^ this.f207639y.hashCode();
    }
}
