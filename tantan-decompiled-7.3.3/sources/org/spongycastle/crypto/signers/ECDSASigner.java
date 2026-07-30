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
import org.spongycastle.math.p135ec.ECCurve;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.p135ec.ECMultiplier;
import org.spongycastle.math.p135ec.ECPoint;
import org.spongycastle.math.p135ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: classes3.dex */
public class ECDSASigner implements ECConstants, DSA {
    private final DSAKCalculator kCalculator;
    private ECKeyParameters key;
    private SecureRandom random;

    public ECDSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    public BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        int iBitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return iBitLength < length ? bigInteger2.shiftRight(length - iBitLength) : bigInteger2;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n, bArr);
        BigInteger d = ((ECPrivateKeyParameters) this.key).getD();
        boolean zIsDeterministic = this.kCalculator.isDeterministic();
        DSAKCalculator dSAKCalculator = this.kCalculator;
        if (zIsDeterministic) {
            dSAKCalculator.init(n, d, bArr);
        } else {
            dSAKCalculator.init(n, this.random);
        }
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerNextK = this.kCalculator.nextK();
            BigInteger bigIntegerMod = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerNextK).normalize().getAffineXCoord().toBigInteger().mod(n);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!bigIntegerMod.equals(bigInteger)) {
                BigInteger bigIntegerMod2 = bigIntegerNextK.modInverse(n).multiply(bigIntegerCalculateE.add(d.multiply(bigIntegerMod))).mod(n);
                if (!bigIntegerMod2.equals(bigInteger)) {
                    return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                }
            }
        }
    }

    public ECFieldElement getDenominator(int i, ECPoint eCPoint) {
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                return eCPoint.getZCoord(0).square();
            }
            if (i != 6 && i != 7) {
                return null;
            }
        }
        return eCPoint.getZCoord(0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // org.spongycastle.crypto.DSA
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom random;
        boolean z2;
        if (z) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (ECPrivateKeyParameters) parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
            } else {
                this.key = (ECPrivateKeyParameters) cipherParameters;
            }
            if (z || this.kCalculator.isDeterministic()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.random = initSecureRandom(z2, random);
        }
        this.key = (ECPublicKeyParameters) cipherParameters;
        random = null;
        if (z) {
            z2 = false;
        } else {
            z2 = false;
        }
        this.random = initSecureRandom(z2, random);
    }

    public SecureRandom initSecureRandom(boolean z, SecureRandom secureRandom) {
        if (z) {
            return secureRandom != null ? secureRandom : new SecureRandom();
        }
        return null;
    }

    @Override // org.spongycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger cofactor;
        ECFieldElement denominator;
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n, bArr);
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n) >= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(n);
        ECPoint eCPointSumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigIntegerCalculateE.multiply(bigIntegerModInverse).mod(n), ((ECPublicKeyParameters) this.key).getQ(), bigInteger.multiply(bigIntegerModInverse).mod(n));
        if (eCPointSumOfTwoMultiplies.isInfinity()) {
            return false;
        }
        ECCurve curve = eCPointSumOfTwoMultiplies.getCurve();
        if (curve == null || (cofactor = curve.getCofactor()) == null || cofactor.compareTo(ECConstants.EIGHT) > 0 || (denominator = getDenominator(curve.getCoordinateSystem(), eCPointSumOfTwoMultiplies)) == null || denominator.isZero()) {
            return eCPointSumOfTwoMultiplies.normalize().getAffineXCoord().toBigInteger().mod(n).equals(bigInteger);
        }
        ECFieldElement xCoord = eCPointSumOfTwoMultiplies.getXCoord();
        while (curve.isValidFieldElement(bigInteger)) {
            if (curve.fromBigInteger(bigInteger).multiply(denominator).equals(xCoord)) {
                return true;
            }
            bigInteger = bigInteger.add(n);
        }
        return false;
    }

    public ECDSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
