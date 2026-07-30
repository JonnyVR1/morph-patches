package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes3.dex */
public class SRP6Client {

    /* JADX INFO: renamed from: A */
    protected BigInteger f207264A;

    /* JADX INFO: renamed from: B */
    protected BigInteger f207265B;
    protected BigInteger Key;

    /* JADX INFO: renamed from: M1 */
    protected BigInteger f207266M1;

    /* JADX INFO: renamed from: M2 */
    protected BigInteger f207267M2;

    /* JADX INFO: renamed from: N */
    protected BigInteger f207268N;

    /* JADX INFO: renamed from: S */
    protected BigInteger f207269S;

    /* JADX INFO: renamed from: a */
    protected BigInteger f207270a;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f207271g;
    protected SecureRandom random;

    /* JADX INFO: renamed from: u */
    protected BigInteger f207272u;

    /* JADX INFO: renamed from: x */
    protected BigInteger f207273x;

    private BigInteger calculateS() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f207268N, this.f207271g);
        return this.f207265B.subtract(this.f207271g.modPow(this.f207273x, this.f207268N).multiply(bigIntegerCalculateK).mod(this.f207268N)).mod(this.f207268N).modPow(this.f207272u.multiply(this.f207273x).add(this.f207270a), this.f207268N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f207264A;
        if (bigInteger3 == null || (bigInteger = this.f207265B) == null || (bigInteger2 = this.f207269S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger bigIntegerCalculateM1 = SRP6Util.calculateM1(this.digest, this.f207268N, bigInteger3, bigInteger, bigInteger2);
        this.f207266M1 = bigIntegerCalculateM1;
        return bigIntegerCalculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f207268N, bigInteger);
        this.f207265B = bigIntegerValidatePublicValue;
        this.f207272u = SRP6Util.calculateU(this.digest, this.f207268N, this.f207264A, bigIntegerValidatePublicValue);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f207269S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f207269S;
        if (bigInteger == null || this.f207266M1 == null || this.f207267M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f207268N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f207273x = SRP6Util.calculateX(this.digest, this.f207268N, bArr, bArr2, bArr3);
        BigInteger bigIntegerSelectPrivateValue = selectPrivateValue();
        this.f207270a = bigIntegerSelectPrivateValue;
        BigInteger bigIntegerModPow = this.f207271g.modPow(bigIntegerSelectPrivateValue, this.f207268N);
        this.f207264A = bigIntegerModPow;
        return bigIntegerModPow;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f207268N, this.f207271g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f207264A;
        if (bigInteger4 == null || (bigInteger2 = this.f207266M1) == null || (bigInteger3 = this.f207269S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f207268N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f207267M2 = bigInteger;
        return true;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f207268N = bigInteger;
        this.f207271g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }
}
