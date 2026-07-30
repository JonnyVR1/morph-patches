package org.spongycastle.asn1;

import java.io.IOException;
import l.ig3;
import l.kg3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ASN1Null extends ASN1Primitive {
    public static ASN1Null getInstance(Object obj) {
        if (obj instanceof ASN1Null) {
            return (ASN1Null) obj;
        }
        if (obj != null) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e) {
                kg3.a("failed to construct NULL from byte[]: ", e.getMessage());
            } catch (ClassCastException unused) {
                ig3.a("unknown object in getInstance(): ".concat(obj.getClass().getName()));
                return null;
            }
        }
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof ASN1Null;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public abstract void encode(ASN1OutputStream aSN1OutputStream) throws IOException;

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }
}
