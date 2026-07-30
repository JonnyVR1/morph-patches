package org.spongycastle.crypto;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface SignerWithRecovery extends Signer {
    byte[] getRecoveredMessage();

    boolean hasFullMessage();

    void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException;
}
