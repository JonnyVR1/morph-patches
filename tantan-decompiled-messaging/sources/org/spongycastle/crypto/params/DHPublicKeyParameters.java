package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class DHPublicKeyParameters extends DHKeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f206700y;

    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(false, dHParameters);
        this.f206700y = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPublicKeyParameters) && ((DHPublicKeyParameters) obj).getY().equals(this.f206700y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f206700y;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return super.hashCode() ^ this.f206700y.hashCode();
    }
}
