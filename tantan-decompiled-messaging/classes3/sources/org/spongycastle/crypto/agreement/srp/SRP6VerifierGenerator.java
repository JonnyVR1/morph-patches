package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SRP6VerifierGenerator {

    /* JADX INFO: renamed from: N */
    protected BigInteger f9987N;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f9988g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f9988g.modPow(SRP6Util.calculateX(this.digest, this.f9987N, bArr, bArr2, bArr3), this.f9987N);
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f9987N = sRP6GroupParameters.getN();
        this.f9988g = sRP6GroupParameters.getG();
        this.digest = digest;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f9987N = bigInteger;
        this.f9988g = bigInteger2;
        this.digest = digest;
    }
}
