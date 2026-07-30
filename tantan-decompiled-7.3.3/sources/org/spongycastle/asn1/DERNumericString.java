package org.spongycastle.asn1;

import java.io.IOException;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;
import p153l.C21225x1;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DERNumericString extends ASN1Primitive implements ASN1String {
    private final byte[] string;

    public DERNumericString(String str, boolean z) {
        if (!z || isNumericString(str)) {
            this.string = Strings.toByteArray(str);
        } else {
            wg3.m206174a("string contains illegal characters");
            throw null;
        }
    }

    public static DERNumericString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERNumericString)) {
            return (DERNumericString) obj;
        }
        if (!(obj instanceof byte[])) {
            wg3.m206174a("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (DERNumericString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            C21225x1.m208893a("encoding error in getInstance: ", e);
            return null;
        }
    }

    public static boolean isNumericString(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char cCharAt = str.charAt(length);
            if (cCharAt > 127) {
                return false;
            }
            if (('0' > cCharAt || cCharAt > '9') && cCharAt != ' ') {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERNumericString) {
            return Arrays.areEqual(this.string, ((DERNumericString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(18, this.string);
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

    public DERNumericString(String str) {
        this(str, false);
    }

    public DERNumericString(byte[] bArr) {
        this.string = bArr;
    }

    public static DERNumericString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERNumericString)) {
            return new DERNumericString(ASN1OctetString.getInstance(object).getOctets());
        }
        return getInstance(object);
    }
}
