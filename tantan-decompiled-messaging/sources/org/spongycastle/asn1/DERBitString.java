package org.spongycastle.asn1;

import java.io.IOException;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DERBitString extends ASN1BitString {
    public DERBitString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public static DERBitString fromOctetString(byte[] bArr) {
        if (bArr.length < 1) {
            ig3.m135964a("truncated BIT STRING detected");
            return null;
        }
        byte b = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        if (length != 0) {
            System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        }
        return new DERBitString(bArr2, b);
    }

    public static DERBitString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERBitString)) {
            return (DERBitString) obj;
        }
        if (obj instanceof DLBitString) {
            DLBitString dLBitString = (DLBitString) obj;
            return new DERBitString(dLBitString.data, dLBitString.padBits);
        }
        ig3.m135964a("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    private static byte[] toByteArray(byte b) {
        return new byte[]{b};
    }

    @Override // org.spongycastle.asn1.ASN1BitString, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        byte[] bArrDerForm = ASN1BitString.derForm(this.data, this.padBits);
        int length = bArrDerForm.length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = (byte) getPadBits();
        System.arraycopy(bArrDerForm, 0, bArr, 1, length);
        aSN1OutputStream.writeEncoded(3, bArr);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateBodyLength(this.data.length + 1) + 1 + this.data.length + 1;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public DERBitString(byte[] bArr, int i) {
        super(bArr, i);
    }

    public DERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DERBitString(int i) {
        super(ASN1BitString.getBytes(i), ASN1BitString.getPadBits(i));
    }

    public DERBitString(byte b, int i) {
        this(toByteArray(b), i);
    }

    public static DERBitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERBitString)) {
            return fromOctetString(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}
