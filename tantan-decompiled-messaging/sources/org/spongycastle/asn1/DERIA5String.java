package org.spongycastle.asn1;

import java.io.IOException;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;
import p149l.C21016x1;
import p149l.ig3;
import p149l.jfd0;

/* JADX INFO: loaded from: classes3.dex */
public class DERIA5String extends ASN1Primitive implements ASN1String {
    private final byte[] string;

    public DERIA5String(String str, boolean z) {
        if (str == null) {
            jfd0.m141176a("string cannot be null");
            throw null;
        }
        if (!z || isIA5String(str)) {
            this.string = Strings.toByteArray(str);
        } else {
            ig3.m135964a("string contains illegal characters");
            throw null;
        }
    }

    public static DERIA5String getInstance(Object obj) {
        if (obj == null || (obj instanceof DERIA5String)) {
            return (DERIA5String) obj;
        }
        if (!(obj instanceof byte[])) {
            ig3.m135964a("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (DERIA5String) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            C21016x1.m206655a("encoding error in getInstance: ", e);
            return null;
        }
    }

    public static boolean isIA5String(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERIA5String) {
            return Arrays.areEqual(this.string, ((DERIA5String) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(22, this.string);
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

    public DERIA5String(String str) {
        this(str, false);
    }

    public DERIA5String(byte[] bArr) {
        this.string = bArr;
    }

    public static DERIA5String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERIA5String)) {
            return new DERIA5String(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}
