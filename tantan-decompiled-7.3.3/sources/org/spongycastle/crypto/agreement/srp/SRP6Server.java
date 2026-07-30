package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes3.dex */
public class SRP6Server {

    /* JADX INFO: renamed from: A */
    protected BigInteger f207274A;

    /* JADX INFO: renamed from: B */
    protected BigInteger f207275B;
    protected BigInteger Key;

    /* JADX INFO: renamed from: M1 */
    protected BigInteger f207276M1;

    /* JADX INFO: renamed from: M2 */
    protected BigInteger f207277M2;

    /* JADX INFO: renamed from: N */
    protected BigInteger f207278N;

    /* JADX INFO: renamed from: S */
    protected BigInteger f207279S;

    /* JADX INFO: renamed from: b */
    protected BigInteger f207280b;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f207281g;
    protected SecureRandom random;

    /* JADX INFO: renamed from: u */
    protected BigInteger f207282u;

    /* JADX INFO: renamed from: v */
    protected BigInteger f207283v;

    private BigInteger calculateS() {
        return this.f207283v.modPow(this.f207282u, this.f207278N).multiply(this.f207274A).mod(this.f207278N).modPow(this.f207280b, this.f207278N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f207278N, bigInteger);
        this.f207274A = bigIntegerValidatePublicValue;
        this.f207282u = SRP6Util.calculateU(this.digest, this.f207278N, bigIntegerValidatePublicValue, this.f207275B);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f207279S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f207274A;
        if (bigInteger3 == null || (bigInteger = this.f207276M1) == null || (bigInteger2 = this.f207279S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger bigIntegerCalculateM2 = SRP6Util.calculateM2(this.digest, this.f207278N, bigInteger3, bigInteger, bigInteger2);
        this.f207277M2 = bigIntegerCalculateM2;
        return bigIntegerCalculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f207279S;
        if (bigInteger == null || this.f207276M1 == null || this.f207277M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f207278N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f207278N, this.f207281g);
        this.f207280b = selectPrivateValue();
        BigInteger bigIntegerMod = bigIntegerCalculateK.multiply(this.f207283v).mod(this.f207278N).add(this.f207281g.modPow(this.f207280b, this.f207278N)).mod(this.f207278N);
        this.f207275B = bigIntegerMod;
        return bigIntegerMod;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f207278N, this.f207281g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f207274A;
        if (bigInteger4 == null || (bigInteger2 = this.f207275B) == null || (bigInteger3 = this.f207279S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f207278N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f207276M1 = bigInteger;
        return true;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f207278N = bigInteger;
        this.f207281g = bigInteger2;
        this.f207283v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }
}
