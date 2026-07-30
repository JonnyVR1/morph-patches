package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes3.dex */
public class SRP6VerifierGenerator {

    /* JADX INFO: renamed from: N */
    protected BigInteger f207284N;
    protected Digest digest;

    /* JADX INFO: renamed from: g */
    protected BigInteger f207285g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f207285g.modPow(SRP6Util.calculateX(this.digest, this.f207284N, bArr, bArr2, bArr3), this.f207284N);
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f207284N = sRP6GroupParameters.getN();
        this.f207285g = sRP6GroupParameters.getG();
        this.digest = digest;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f207284N = bigInteger;
        this.f207285g = bigInteger2;
        this.digest = digest;
    }
}
