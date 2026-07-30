package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes3.dex */
public class KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: iv */
    byte[] f207655iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f207655iv = bArr2;
    }

    public byte[] getIV() {
        return this.f207655iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
