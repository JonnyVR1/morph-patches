package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes3.dex */
public class SRP6Server {

    /* JADX INFO: renamed from: A */
    protected BigInteger f206352A;

    /* JADX INFO: renamed from: B */
    protected BigInteger f206353B;
    protected BigInteger Key;

    /* JADX INFO: renamed from: M1 */
    protected BigInteger f206354M1;

    /* JADX INFO: renamed from: M2 */
    protected BigInteger f206355M2;

    /* JADX INFO: renamed from: N */
    protected BigInteger f206356N;

    /* JADX INFO: renamed from: S */
    protected BigInteger f206357S;

    /* JADX INFO: renamed from: b */
    protected BigInteger f206358b;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f206359g;
    protected SecureRandom random;

    /* JADX INFO: renamed from: u */
    protected BigInteger f206360u;

    /* JADX INFO: renamed from: v */
    protected BigInteger f206361v;

    private BigInteger calculateS() {
        return this.f206361v.modPow(this.f206360u, this.f206356N).multiply(this.f206352A).mod(this.f206356N).modPow(this.f206358b, this.f206356N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f206356N, bigInteger);
        this.f206352A = bigIntegerValidatePublicValue;
        this.f206360u = SRP6Util.calculateU(this.digest, this.f206356N, bigIntegerValidatePublicValue, this.f206353B);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f206357S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f206352A;
        if (bigInteger3 == null || (bigInteger = this.f206354M1) == null || (bigInteger2 = this.f206357S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger bigIntegerCalculateM2 = SRP6Util.calculateM2(this.digest, this.f206356N, bigInteger3, bigInteger, bigInteger2);
        this.f206355M2 = bigIntegerCalculateM2;
        return bigIntegerCalculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f206357S;
        if (bigInteger == null || this.f206354M1 == null || this.f206355M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f206356N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f206356N, this.f206359g);
        this.f206358b = selectPrivateValue();
        BigInteger bigIntegerMod = bigIntegerCalculateK.multiply(this.f206361v).mod(this.f206356N).add(this.f206359g.modPow(this.f206358b, this.f206356N)).mod(this.f206356N);
        this.f206353B = bigIntegerMod;
        return bigIntegerMod;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f206356N, this.f206359g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f206352A;
        if (bigInteger4 == null || (bigInteger2 = this.f206353B) == null || (bigInteger3 = this.f206357S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f206356N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f206354M1 = bigInteger;
        return true;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f206356N = bigInteger;
        this.f206359g = bigInteger2;
        this.f206361v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }
}
