package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class RC5Parameters implements CipherParameters {
    private byte[] key;
    private int rounds;

    public RC5Parameters(byte[] bArr, int i) {
        if (bArr.length > 255) {
            wg3.m206174a("RC5 key length can be no greater than 255");
            throw null;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.key = bArr2;
        this.rounds = i;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public byte[] getKey() {
        return this.key;
    }

    public int getRounds() {
        return this.rounds;
    }
}
