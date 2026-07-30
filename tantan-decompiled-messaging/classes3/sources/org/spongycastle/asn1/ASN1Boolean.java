package org.spongycastle.asn1;

import java.io.IOException;
import l.ig3;
import l.kg3;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ASN1Boolean extends ASN1Primitive {
    private final byte[] value;
    private static final byte[] TRUE_VALUE = {-1};
    private static final byte[] FALSE_VALUE = {0};
    public static final ASN1Boolean FALSE = new ASN1Boolean(false);
    public static final ASN1Boolean TRUE = new ASN1Boolean(true);

    public ASN1Boolean(byte[] bArr) {
        if (bArr.length != 1) {
            ig3.a("byte value should have 1 byte in it");
            throw null;
        }
        byte b = bArr[0];
        if (b == 0) {
            this.value = FALSE_VALUE;
        } else if ((b & 255) == 255) {
            this.value = TRUE_VALUE;
        } else {
            this.value = Arrays.clone(bArr);
        }
    }

    public static ASN1Boolean fromOctetString(byte[] bArr) {
        if (bArr.length != 1) {
            ig3.a("BOOLEAN value should have 1 byte in it");
            return null;
        }
        byte b = bArr[0];
        if (b == 0) {
            return FALSE;
        }
        return (b & 255) == 255 ? TRUE : new ASN1Boolean(bArr);
    }

    public static ASN1Boolean getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Boolean)) {
            return (ASN1Boolean) obj;
        }
        if (!(obj instanceof byte[])) {
            ig3.a("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (ASN1Boolean) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (IOException e) {
            kg3.a("failed to construct boolean from byte[]: ", e.getMessage());
            return null;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return (aSN1Primitive instanceof ASN1Boolean) && this.value[0] == ((ASN1Boolean) aSN1Primitive).value[0];
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(1, this.value);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return 3;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return this.value[0];
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public boolean isTrue() {
        return this.value[0] != 0;
    }

    public String toString() {
        return this.value[0] != 0 ? "TRUE" : "FALSE";
    }

    public ASN1Boolean(boolean z) {
        this.value = z ? TRUE_VALUE : FALSE_VALUE;
    }

    public static ASN1Boolean getInstance(boolean z) {
        return z ? TRUE : FALSE;
    }

    public static ASN1Boolean getInstance(int i) {
        return i != 0 ? TRUE : FALSE;
    }

    public static ASN1Boolean getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof ASN1Boolean)) {
            return fromOctetString(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}
