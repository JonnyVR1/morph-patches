package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SRP6Client {

    /* JADX INFO: renamed from: A */
    protected BigInteger f9967A;

    /* JADX INFO: renamed from: B */
    protected BigInteger f9968B;
    protected BigInteger Key;

    /* JADX INFO: renamed from: M1 */
    protected BigInteger f9969M1;

    /* JADX INFO: renamed from: M2 */
    protected BigInteger f9970M2;

    /* JADX INFO: renamed from: N */
    protected BigInteger f9971N;

    /* JADX INFO: renamed from: S */
    protected BigInteger f9972S;

    /* JADX INFO: renamed from: a */
    protected BigInteger f9973a;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f9974g;
    protected SecureRandom random;

    /* JADX INFO: renamed from: u */
    protected BigInteger f9975u;

    /* JADX INFO: renamed from: x */
    protected BigInteger f9976x;

    private BigInteger calculateS() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f9971N, this.f9974g);
        return this.f9968B.subtract(this.f9974g.modPow(this.f9976x, this.f9971N).multiply(bigIntegerCalculateK).mod(this.f9971N)).mod(this.f9971N).modPow(this.f9975u.multiply(this.f9976x).add(this.f9973a), this.f9971N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f9967A;
        if (bigInteger3 == null || (bigInteger = this.f9968B) == null || (bigInteger2 = this.f9972S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger bigIntegerCalculateM1 = SRP6Util.calculateM1(this.digest, this.f9971N, bigInteger3, bigInteger, bigInteger2);
        this.f9969M1 = bigIntegerCalculateM1;
        return bigIntegerCalculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f9971N, bigInteger);
        this.f9968B = bigIntegerValidatePublicValue;
        this.f9975u = SRP6Util.calculateU(this.digest, this.f9971N, this.f9967A, bigIntegerValidatePublicValue);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f9972S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f9972S;
        if (bigInteger == null || this.f9969M1 == null || this.f9970M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f9971N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f9976x = SRP6Util.calculateX(this.digest, this.f9971N, bArr, bArr2, bArr3);
        BigInteger bigIntegerSelectPrivateValue = selectPrivateValue();
        this.f9973a = bigIntegerSelectPrivateValue;
        BigInteger bigIntegerModPow = this.f9974g.modPow(bigIntegerSelectPrivateValue, this.f9971N);
        this.f9967A = bigIntegerModPow;
        return bigIntegerModPow;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f9971N, this.f9974g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f9967A;
        if (bigInteger4 == null || (bigInteger2 = this.f9969M1) == null || (bigInteger3 = this.f9972S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f9971N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f9970M2 = bigInteger;
        return true;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f9971N = bigInteger;
        this.f9974g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }
}
