package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes3.dex */
public class KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: iv */
    byte[] f206733iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f206733iv = bArr2;
    }

    public byte[] getIV() {
        return this.f206733iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
