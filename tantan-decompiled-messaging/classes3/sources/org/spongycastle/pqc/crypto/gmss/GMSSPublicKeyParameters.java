package org.spongycastle.pqc.crypto.gmss;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GMSSPublicKeyParameters extends GMSSKeyParameters {
    private byte[] gmssPublicKey;

    public GMSSPublicKeyParameters(byte[] bArr, GMSSParameters gMSSParameters) {
        super(false, gMSSParameters);
        this.gmssPublicKey = bArr;
    }

    public byte[] getPublicKey() {
        return this.gmssPublicKey;
    }
}
