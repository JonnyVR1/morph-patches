package org.spongycastle.crypto.agreement;

import java.math.BigInteger;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.p135ec.ECPoint;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class ECDHBasicAgreement implements BasicAgreement {
    private ECPrivateKeyParameters key;

    @Override // org.spongycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        ECPoint eCPointNormalize = ((ECPublicKeyParameters) cipherParameters).getQ().multiply(this.key.getD()).normalize();
        if (!eCPointNormalize.isInfinity()) {
            return eCPointNormalize.getAffineXCoord().toBigInteger();
        }
        wtq0.m207906a("Infinity is not a valid agreement value for ECDH");
        return null;
    }

    @Override // org.spongycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.key.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.spongycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        this.key = (ECPrivateKeyParameters) cipherParameters;
    }
}
