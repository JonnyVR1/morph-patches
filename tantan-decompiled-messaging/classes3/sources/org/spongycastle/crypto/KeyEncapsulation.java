package org.spongycastle.crypto;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface KeyEncapsulation {
    CipherParameters decrypt(byte[] bArr, int i, int i2, int i3);

    CipherParameters encrypt(byte[] bArr, int i, int i2);

    void init(CipherParameters cipherParameters);
}
