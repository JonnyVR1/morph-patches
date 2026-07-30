package org.spongycastle.crypto.agreement.kdf;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DHKDFParameters implements DerivationParameters {
    private ASN1ObjectIdentifier algorithm;
    private byte[] extraInfo;
    private int keySize;

    /* JADX INFO: renamed from: z */
    private byte[] f9964z;

    public DHKDFParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, byte[] bArr, byte[] bArr2) {
        this.algorithm = aSN1ObjectIdentifier;
        this.keySize = i;
        this.f9964z = bArr;
        this.extraInfo = bArr2;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getExtraInfo() {
        return this.extraInfo;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public byte[] getZ() {
        return this.f9964z;
    }

    public DHKDFParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, byte[] bArr) {
        this(aSN1ObjectIdentifier, i, bArr, null);
    }
}
