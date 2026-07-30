package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes3.dex */
public class ISO18033KDFParameters implements DerivationParameters {
    byte[] seed;

    public ISO18033KDFParameters(byte[] bArr) {
        this.seed = bArr;
    }

    public byte[] getSeed() {
        return this.seed;
    }
}
