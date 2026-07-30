package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SRP6Server {

    /* JADX INFO: renamed from: A */
    protected BigInteger f9977A;

    /* JADX INFO: renamed from: B */
    protected BigInteger f9978B;
    protected BigInteger Key;

    /* JADX INFO: renamed from: M1 */
    protected BigInteger f9979M1;

    /* JADX INFO: renamed from: M2 */
    protected BigInteger f9980M2;

    /* JADX INFO: renamed from: N */
    protected BigInteger f9981N;

    /* JADX INFO: renamed from: S */
    protected BigInteger f9982S;

    /* JADX INFO: renamed from: b */
    protected BigInteger f9983b;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f9984g;
    protected SecureRandom random;

    /* JADX INFO: renamed from: u */
    protected BigInteger f9985u;

    /* JADX INFO: renamed from: v */
    protected BigInteger f9986v;

    private BigInteger calculateS() {
        return this.f9986v.modPow(this.f9985u, this.f9981N).multiply(this.f9977A).mod(this.f9981N).modPow(this.f9983b, this.f9981N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f9981N, bigInteger);
        this.f9977A = bigIntegerValidatePublicValue;
        this.f9985u = SRP6Util.calculateU(this.digest, this.f9981N, bigIntegerValidatePublicValue, this.f9978B);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f9982S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f9977A;
        if (bigInteger3 == null || (bigInteger = this.f9979M1) == null || (bigInteger2 = this.f9982S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger bigIntegerCalculateM2 = SRP6Util.calculateM2(this.digest, this.f9981N, bigInteger3, bigInteger, bigInteger2);
        this.f9980M2 = bigIntegerCalculateM2;
        return bigIntegerCalculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f9982S;
        if (bigInteger == null || this.f9979M1 == null || this.f9980M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f9981N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f9981N, this.f9984g);
        this.f9983b = selectPrivateValue();
        BigInteger bigIntegerMod = bigIntegerCalculateK.multiply(this.f9986v).mod(this.f9981N).add(this.f9984g.modPow(this.f9983b, this.f9981N)).mod(this.f9981N);
        this.f9978B = bigIntegerMod;
        return bigIntegerMod;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f9981N, this.f9984g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f9977A;
        if (bigInteger4 == null || (bigInteger2 = this.f9978B) == null || (bigInteger3 = this.f9982S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f9981N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f9979M1 = bigInteger;
        return true;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f9981N = bigInteger;
        this.f9984g = bigInteger2;
        this.f9986v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }
}
