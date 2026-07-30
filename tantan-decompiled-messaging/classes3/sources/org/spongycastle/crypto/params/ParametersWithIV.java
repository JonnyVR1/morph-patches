package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ParametersWithIV implements CipherParameters {

    /* JADX INFO: renamed from: iv */
    private byte[] f10361iv;
    private CipherParameters parameters;

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f10361iv = bArr2;
        this.parameters = cipherParameters;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public byte[] getIV() {
        return this.f10361iv;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }
}
