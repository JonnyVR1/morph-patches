package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.generators.ECKeyPairGenerator;
import org.spongycastle.crypto.params.ECKeyGenerationParameters;
import org.spongycastle.crypto.params.ECKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.p131ec.ECAlgorithms;
import org.spongycastle.math.p131ec.ECConstants;
import org.spongycastle.math.p131ec.ECPoint;
import p149l.npk0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class ECNRSigner implements DSA {
    private boolean forSigning;
    private ECKeyParameters key;
    private SecureRandom random;

    @Override // org.spongycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair;
        BigInteger bigIntegerMod;
        if (!this.forSigning) {
            qkq0.m175383a("not initialised for signing");
            return null;
        }
        BigInteger n = ((ECPrivateKeyParameters) this.key).getParameters().getN();
        int iBitLength = n.bitLength();
        BigInteger bigInteger = new BigInteger(1, bArr);
        int iBitLength2 = bigInteger.bitLength();
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) this.key;
        if (iBitLength2 > iBitLength) {
            npk0.m160508a("input too large for ECNR key.");
            return null;
        }
        do {
            ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
            eCKeyPairGenerator.init(new ECKeyGenerationParameters(eCPrivateKeyParameters.getParameters(), this.random));
            asymmetricCipherKeyPairGenerateKeyPair = eCKeyPairGenerator.generateKeyPair();
            bigIntegerMod = ((ECPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()).getQ().getAffineXCoord().toBigInteger().add(bigInteger).mod(n);
        } while (bigIntegerMod.equals(ECConstants.ZERO));
        return new BigInteger[]{bigIntegerMod, ((ECPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()).getD().subtract(bigIntegerMod.multiply(eCPrivateKeyParameters.getD())).mod(n)};
    }

    @Override // org.spongycastle.crypto.DSA
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forSigning = z;
        if (!z) {
            this.key = (ECPublicKeyParameters) cipherParameters;
            return;
        }
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            this.random = new SecureRandom();
            this.key = (ECPrivateKeyParameters) cipherParameters;
        } else {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            this.key = (ECPrivateKeyParameters) parametersWithRandom.getParameters();
        }
    }

    @Override // org.spongycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (this.forSigning) {
            qkq0.m175383a("not initialised for verifying");
            return false;
        }
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) this.key;
        BigInteger n = eCPublicKeyParameters.getParameters().getN();
        int iBitLength = n.bitLength();
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bigInteger3.bitLength() > iBitLength) {
            npk0.m160508a("input too large for ECNR key.");
            return false;
        }
        if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(n) >= 0 || bigInteger2.compareTo(ECConstants.ZERO) < 0 || bigInteger2.compareTo(n) >= 0) {
            return false;
        }
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(eCPublicKeyParameters.getParameters().getG(), bigInteger2, eCPublicKeyParameters.getQ(), bigInteger).normalize();
        if (eCPointNormalize.isInfinity()) {
            return false;
        }
        return bigInteger.subtract(eCPointNormalize.getAffineXCoord().toBigInteger()).mod(n).equals(bigInteger3);
    }
}
