package org.spongycastle.asn1;

import java.io.IOException;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;
import p153l.C21225x1;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DERVisibleString extends ASN1Primitive implements ASN1String {
    private final byte[] string;

    public DERVisibleString(String str) {
        this.string = Strings.toByteArray(str);
    }

    public static DERVisibleString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERVisibleString)) {
            return (DERVisibleString) obj;
        }
        if (!(obj instanceof byte[])) {
            wg3.m206174a("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (DERVisibleString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            C21225x1.m208893a("encoding error in getInstance: ", e);
            return null;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERVisibleString) {
            return Arrays.areEqual(this.string, ((DERVisibleString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(26, this.string);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateBodyLength(this.string.length) + 1 + this.string.length;
    }

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    @Override // org.spongycastle.asn1.ASN1String
    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    public DERVisibleString(byte[] bArr) {
        this.string = bArr;
    }

    public static DERVisibleString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERVisibleString)) {
            return new DERVisibleString(ASN1OctetString.getInstance(object).getOctets());
        }
        return getInstance(object);
    }
}
