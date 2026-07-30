package org.spongycastle.pqc.crypto;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface MessageEncryptor {
    void init(boolean z, CipherParameters cipherParameters);

    byte[] messageDecrypt(byte[] bArr) throws Exception;

    byte[] messageEncrypt(byte[] bArr) throws Exception;
}
