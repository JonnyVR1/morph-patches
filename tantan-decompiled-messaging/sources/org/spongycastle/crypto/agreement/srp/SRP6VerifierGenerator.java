package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes3.dex */
public class SRP6VerifierGenerator {

    /* JADX INFO: renamed from: N */
    protected BigInteger f206362N;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f206363g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f206363g.modPow(SRP6Util.calculateX(this.digest, this.f206362N, bArr, bArr2, bArr3), this.f206362N);
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f206362N = sRP6GroupParameters.getN();
        this.f206363g = sRP6GroupParameters.getG();
        this.digest = digest;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f206362N = bigInteger;
        this.f206363g = bigInteger2;
        this.digest = digest;
    }
}
