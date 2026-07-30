package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes3.dex */
public class SRP6Client {

    /* JADX INFO: renamed from: A */
    protected BigInteger f206342A;

    /* JADX INFO: renamed from: B */
    protected BigInteger f206343B;
    protected BigInteger Key;

    /* JADX INFO: renamed from: M1 */
    protected BigInteger f206344M1;

    /* JADX INFO: renamed from: M2 */
    protected BigInteger f206345M2;

    /* JADX INFO: renamed from: N */
    protected BigInteger f206346N;

    /* JADX INFO: renamed from: S */
    protected BigInteger f206347S;

    /* JADX INFO: renamed from: a */
    protected BigInteger f206348a;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f206349g;
    protected SecureRandom random;

    /* JADX INFO: renamed from: u */
    protected BigInteger f206350u;

    /* JADX INFO: renamed from: x */
    protected BigInteger f206351x;

    private BigInteger calculateS() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f206346N, this.f206349g);
        return this.f206343B.subtract(this.f206349g.modPow(this.f206351x, this.f206346N).multiply(bigIntegerCalculateK).mod(this.f206346N)).mod(this.f206346N).modPow(this.f206350u.multiply(this.f206351x).add(this.f206348a), this.f206346N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f206342A;
        if (bigInteger3 == null || (bigInteger = this.f206343B) == null || (bigInteger2 = this.f206347S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger bigIntegerCalculateM1 = SRP6Util.calculateM1(this.digest, this.f206346N, bigInteger3, bigInteger, bigInteger2);
        this.f206344M1 = bigIntegerCalculateM1;
        return bigIntegerCalculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f206346N, bigInteger);
        this.f206343B = bigIntegerValidatePublicValue;
        this.f206350u = SRP6Util.calculateU(this.digest, this.f206346N, this.f206342A, bigIntegerValidatePublicValue);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f206347S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f206347S;
        if (bigInteger == null || this.f206344M1 == null || this.f206345M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f206346N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f206351x = SRP6Util.calculateX(this.digest, this.f206346N, bArr, bArr2, bArr3);
        BigInteger bigIntegerSelectPrivateValue = selectPrivateValue();
        this.f206348a = bigIntegerSelectPrivateValue;
        BigInteger bigIntegerModPow = this.f206349g.modPow(bigIntegerSelectPrivateValue, this.f206346N);
        this.f206342A = bigIntegerModPow;
        return bigIntegerModPow;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f206346N, this.f206349g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f206342A;
        if (bigInteger4 == null || (bigInteger2 = this.f206344M1) == null || (bigInteger3 = this.f206347S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f206346N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f206345M2 = bigInteger;
        return true;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f206346N = bigInteger;
        this.f206349g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }
}
