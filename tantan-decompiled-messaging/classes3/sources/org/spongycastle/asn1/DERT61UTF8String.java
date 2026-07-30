package org.spongycastle.asn1;

import java.io.IOException;
import l.ig3;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;
import p003l.C0637x1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DERT61UTF8String extends ASN1Primitive implements ASN1String {
    private byte[] string;

    public DERT61UTF8String(String str) {
        this(Strings.toUTF8ByteArray(str));
    }

    public static DERT61UTF8String getInstance(Object obj) {
        if (obj instanceof DERT61String) {
            return new DERT61UTF8String(((DERT61String) obj).getOctets());
        }
        if (obj == null || (obj instanceof DERT61UTF8String)) {
            return (DERT61UTF8String) obj;
        }
        if (!(obj instanceof byte[])) {
            ig3.a("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return new DERT61UTF8String(((DERT61String) ASN1Primitive.fromByteArray((byte[]) obj)).getOctets());
        } catch (Exception e) {
            C0637x1.m8688a("encoding error in getInstance: ", e);
            return null;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERT61UTF8String) {
            return Arrays.areEqual(this.string, ((DERT61UTF8String) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(20, this.string);
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
        return Strings.fromUTF8ByteArray(this.string);
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

    public DERT61UTF8String(byte[] bArr) {
        this.string = bArr;
    }

    public static DERT61UTF8String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERT61String) && !(object instanceof DERT61UTF8String)) {
            return new DERT61UTF8String(ASN1OctetString.getInstance(object).getOctets());
        }
        return getInstance(object);
    }
}
