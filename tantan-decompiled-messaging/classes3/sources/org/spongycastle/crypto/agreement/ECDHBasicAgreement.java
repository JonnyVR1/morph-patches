package org.spongycastle.crypto.agreement;

import java.math.BigInteger;
import l.qkq0;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.p012ec.ECPoint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECDHBasicAgreement implements BasicAgreement {
    private ECPrivateKeyParameters key;

    @Override // org.spongycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        ECPoint eCPointNormalize = ((ECPublicKeyParameters) cipherParameters).getQ().multiply(this.key.getD()).normalize();
        if (!eCPointNormalize.isInfinity()) {
            return eCPointNormalize.getAffineXCoord().toBigInteger();
        }
        qkq0.a("Infinity is not a valid agreement value for ECDH");
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
