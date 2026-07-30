package org.spongycastle.asn1;

import java.io.IOException;
import p153l.zpg0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1Primitive extends ASN1Object {
    public static ASN1Primitive fromByteArray(byte[] bArr) throws IOException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        try {
            ASN1Primitive object = aSN1InputStream.readObject();
            if (aSN1InputStream.available() == 0) {
                return object;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            zpg0.m220844a("cannot recognise object in stream");
            return null;
        }
    }

    public abstract boolean asn1Equals(ASN1Primitive aSN1Primitive);

    public abstract void encode(ASN1OutputStream aSN1OutputStream) throws IOException;

    public abstract int encodedLength() throws IOException;

    @Override // org.spongycastle.asn1.ASN1Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ASN1Encodable) && asn1Equals(((ASN1Encodable) obj).toASN1Primitive());
    }

    @Override // org.spongycastle.asn1.ASN1Object
    public abstract int hashCode();

    public abstract boolean isConstructed();

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this;
    }

    public ASN1Primitive toDERObject() {
        return this;
    }

    public ASN1Primitive toDLObject() {
        return this;
    }
}
