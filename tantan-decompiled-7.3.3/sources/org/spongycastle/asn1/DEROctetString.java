package org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DEROctetString extends ASN1OctetString {
    public DEROctetString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    @Override // org.spongycastle.asn1.ASN1OctetString, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(4, this.string);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateBodyLength(this.string.length) + 1 + this.string.length;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public static void encode(DEROutputStream dEROutputStream, byte[] bArr) throws IOException {
        dEROutputStream.writeEncoded(4, bArr);
    }

    public DEROctetString(byte[] bArr) {
        super(bArr);
    }
}
