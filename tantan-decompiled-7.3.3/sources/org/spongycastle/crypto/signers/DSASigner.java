package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.DSAKeyParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes3.dex */
public class DSASigner implements DSA {
    private final DSAKCalculator kCalculator;
    private DSAKeyParameters key;
    private SecureRandom random;

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    private BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int iBitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
        return new BigInteger(1, bArr2);
    }

    @Override // org.spongycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q, bArr);
        BigInteger x = ((DSAPrivateKeyParameters) this.key).getX();
        boolean zIsDeterministic = this.kCalculator.isDeterministic();
        DSAKCalculator dSAKCalculator = this.kCalculator;
        if (zIsDeterministic) {
            dSAKCalculator.init(q, x, bArr);
        } else {
            dSAKCalculator.init(q, this.random);
        }
        BigInteger bigIntegerNextK = this.kCalculator.nextK();
        BigInteger bigIntegerMod = parameters.getG().modPow(bigIntegerNextK, parameters.getP()).mod(q);
        return new BigInteger[]{bigIntegerMod, bigIntegerNextK.modInverse(q).multiply(bigIntegerCalculateE.add(x.multiply(bigIntegerMod))).mod(q)};
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // org.spongycastle.crypto.DSA
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom random;
        boolean z2;
        if (z) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
            } else {
                this.key = (DSAPrivateKeyParameters) cipherParameters;
            }
            if (z || this.kCalculator.isDeterministic()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.random = initSecureRandom(z2, random);
        }
        this.key = (DSAPublicKeyParameters) cipherParameters;
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
        DSAParameters parameters = this.key.getParameters();
        BigInteger q = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || q.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || q.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModInverse = bigInteger2.modInverse(q);
        BigInteger bigIntegerMod = bigIntegerCalculateE.multiply(bigIntegerModInverse).mod(q);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModInverse).mod(q);
        BigInteger p = parameters.getP();
        return parameters.getG().modPow(bigIntegerMod, p).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(bigIntegerMod2, p)).mod(p).mod(q).equals(bigInteger);
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
