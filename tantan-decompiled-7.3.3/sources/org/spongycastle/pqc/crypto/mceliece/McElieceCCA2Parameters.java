package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceCCA2Parameters extends McElieceParameters {
    public Digest digest;

    public McElieceCCA2Parameters() {
        this.digest = new SHA256Digest();
    }

    public Digest getDigest() {
        return this.digest;
    }

    public McElieceCCA2Parameters(int i, int i2) {
        super(i, i2);
        this.digest = new SHA256Digest();
    }

    public McElieceCCA2Parameters(Digest digest) {
        this.digest = digest;
    }
}
