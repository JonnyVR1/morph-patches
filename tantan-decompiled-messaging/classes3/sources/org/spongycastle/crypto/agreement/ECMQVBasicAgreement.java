package org.spongycastle.crypto.agreement;

import java.math.BigInteger;
import l.qkq0;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.MQVPrivateParameters;
import org.spongycastle.crypto.params.MQVPublicParameters;
import org.spongycastle.math.p012ec.ECAlgorithms;
import org.spongycastle.math.p012ec.ECConstants;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.math.p012ec.ECPoint;
import org.spongycastle.util.Properties;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECMQVBasicAgreement implements BasicAgreement {
    MQVPrivateParameters privParams;

    private ECPoint calculateMqvAgreement(ECDomainParameters eCDomainParameters, ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2, ECPublicKeyParameters eCPublicKeyParameters, ECPublicKeyParameters eCPublicKeyParameters2, ECPublicKeyParameters eCPublicKeyParameters3) {
        BigInteger n = eCDomainParameters.getN();
        int iBitLength = (n.bitLength() + 1) / 2;
        BigInteger bigIntegerShiftLeft = ECConstants.ONE.shiftLeft(iBitLength);
        ECCurve curve = eCDomainParameters.getCurve();
        ECPoint[] eCPointArr = {ECAlgorithms.importPoint(curve, eCPublicKeyParameters == null ? eCDomainParameters.getG().multiply(eCPrivateKeyParameters2.getD()) : eCPublicKeyParameters.getQ()), ECAlgorithms.importPoint(curve, eCPublicKeyParameters2.getQ()), ECAlgorithms.importPoint(curve, eCPublicKeyParameters3.getQ())};
        curve.normalizeAll(eCPointArr);
        ECPoint eCPoint = eCPointArr[0];
        ECPoint eCPoint2 = eCPointArr[1];
        ECPoint eCPoint3 = eCPointArr[2];
        BigInteger bigIntegerMod = eCPrivateKeyParameters.getD().multiply(eCPoint.getAffineXCoord().toBigInteger().mod(bigIntegerShiftLeft).setBit(iBitLength)).add(eCPrivateKeyParameters2.getD()).mod(n);
        BigInteger bit = eCPoint3.getAffineXCoord().toBigInteger().mod(bigIntegerShiftLeft).setBit(iBitLength);
        BigInteger bigIntegerMod2 = eCDomainParameters.getH().multiply(bigIntegerMod).mod(n);
        return ECAlgorithms.sumOfTwoMultiplies(eCPoint2, bit.multiply(bigIntegerMod2).mod(n), eCPoint3, bigIntegerMod2);
    }

    @Override // org.spongycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        if (Properties.isOverrideSet("org.spongycastle.ec.disable_mqv")) {
            qkq0.a("ECMQV explicitly disabled");
            return null;
        }
        MQVPublicParameters mQVPublicParameters = (MQVPublicParameters) cipherParameters;
        ECPrivateKeyParameters staticPrivateKey = this.privParams.getStaticPrivateKey();
        ECPoint eCPointNormalize = calculateMqvAgreement(staticPrivateKey.getParameters(), staticPrivateKey, this.privParams.getEphemeralPrivateKey(), this.privParams.getEphemeralPublicKey(), mQVPublicParameters.getStaticPublicKey(), mQVPublicParameters.getEphemeralPublicKey()).normalize();
        if (!eCPointNormalize.isInfinity()) {
            return eCPointNormalize.getAffineXCoord().toBigInteger();
        }
        qkq0.a("Infinity is not a valid agreement value for MQV");
        return null;
    }

    @Override // org.spongycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.privParams.getStaticPrivateKey().getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.spongycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        this.privParams = (MQVPrivateParameters) cipherParameters;
    }
}
