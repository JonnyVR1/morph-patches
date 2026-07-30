package org.spongycastle.asn1;

import java.io.IOException;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;
import p149l.C21016x1;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DERVideotexString extends ASN1Primitive implements ASN1String {
    private final byte[] string;

    public DERVideotexString(byte[] bArr) {
        this.string = Arrays.clone(bArr);
    }

    public static DERVideotexString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERVideotexString)) {
            return (DERVideotexString) obj;
        }
        if (!(obj instanceof byte[])) {
            ig3.m135964a("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (DERVideotexString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            C21016x1.m206655a("encoding error in getInstance: ", e);
            return null;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERVideotexString) {
            return Arrays.areEqual(this.string, ((DERVideotexString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(21, this.string);
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

    public static DERVideotexString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERVideotexString)) {
            return new DERVideotexString(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}
