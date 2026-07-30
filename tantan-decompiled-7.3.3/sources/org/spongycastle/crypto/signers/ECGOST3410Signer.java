package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.p135ec.ECAlgorithms;
import org.spongycastle.math.p135ec.ECConstants;
import org.spongycastle.math.p135ec.ECMultiplier;
import org.spongycastle.math.p135ec.ECPoint;
import org.spongycastle.math.p135ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: classes3.dex */
public class ECGOST3410Signer implements DSA {
    ECKeyParameters key;
    SecureRandom random;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        BigInteger bigInteger = new BigInteger(1, bArr2);
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n = parameters.getN();
        BigInteger d = ((ECPrivateKeyParameters) this.key).getD();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigInteger2 = new BigInteger(n.bitLength(), this.random);
            BigInteger bigInteger3 = ECConstants.ZERO;
            if (!bigInteger2.equals(bigInteger3)) {
                BigInteger bigIntegerMod = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigInteger2).normalize().getAffineXCoord().toBigInteger().mod(n);
                if (bigIntegerMod.equals(bigInteger3)) {
                    continue;
                } else {
                    BigInteger bigIntegerMod2 = bigInteger2.multiply(bigInteger).add(d.multiply(bigIntegerMod)).mod(n);
                    if (!bigIntegerMod2.equals(bigInteger3)) {
                        return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                    }
                }
            }
        }
    }

    @Override // org.spongycastle.crypto.DSA
    public void init(boolean z, CipherParameters cipherParameters) {
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
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(length - 1) - i];
        }
        BigInteger bigInteger3 = new BigInteger(1, bArr2);
        BigInteger n = this.key.getParameters().getN();
        BigInteger bigInteger4 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger4) < 0 || bigInteger.compareTo(n) >= 0 || bigInteger2.compareTo(bigInteger4) < 0 || bigInteger2.compareTo(n) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger3.modInverse(n);
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(this.key.getParameters().getG(), bigInteger2.multiply(bigIntegerModInverse).mod(n), ((ECPublicKeyParameters) this.key).getQ(), n.subtract(bigInteger).multiply(bigIntegerModInverse).mod(n)).normalize();
        if (eCPointNormalize.isInfinity()) {
            return false;
        }
        return eCPointNormalize.getAffineXCoord().toBigInteger().mod(n).equals(bigInteger);
    }
}
