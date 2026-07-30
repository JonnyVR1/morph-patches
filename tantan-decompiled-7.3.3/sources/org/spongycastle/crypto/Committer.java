package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes3.dex */
public interface Committer {
    Commitment commit(byte[] bArr);

    boolean isRevealed(Commitment commitment, byte[] bArr);
}
