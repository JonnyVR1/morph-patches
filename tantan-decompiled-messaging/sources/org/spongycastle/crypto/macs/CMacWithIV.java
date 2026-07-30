package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class CMacWithIV extends CMac {
    public CMacWithIV(BlockCipher blockCipher) {
        super(blockCipher);
    }

    @Override // org.spongycastle.crypto.macs.CMac
    public void validate(CipherParameters cipherParameters) {
    }

    public CMacWithIV(BlockCipher blockCipher, int i) {
        super(blockCipher, i);
    }
}
