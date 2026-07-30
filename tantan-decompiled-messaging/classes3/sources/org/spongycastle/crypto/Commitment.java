package org.spongycastle.crypto;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Commitment {
    private final byte[] commitment;
    private final byte[] secret;

    public Commitment(byte[] bArr, byte[] bArr2) {
        this.secret = bArr;
        this.commitment = bArr2;
    }

    public byte[] getCommitment() {
        return this.commitment;
    }

    public byte[] getSecret() {
        return this.secret;
    }
}
