package org.spongycastle.crypto.agreement;

import java.math.BigInteger;
import l.qkq0;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.p012ec.ECPoint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECDHCBasicAgreement implements BasicAgreement {
    ECPrivateKeyParameters key;

    @Override // org.spongycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) cipherParameters;
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        ECPoint eCPointNormalize = eCPublicKeyParameters.getQ().multiply(parameters.getH().multiply(this.key.getD()).mod(parameters.getN())).normalize();
        if (!eCPointNormalize.isInfinity()) {
            return eCPointNormalize.getAffineXCoord().toBigInteger();
        }
        qkq0.a("Infinity is not a valid agreement value for ECDHC");
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
