package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: iv */
    byte[] f10358iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f10358iv = bArr2;
    }

    public byte[] getIV() {
        return this.f10358iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
