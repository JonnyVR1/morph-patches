package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.DLSet;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Attributes extends ASN1Object {
    private ASN1Set attributes;

    public Attributes(ASN1EncodableVector aSN1EncodableVector) {
        this.attributes = new DLSet(aSN1EncodableVector);
    }

    public static Attributes getInstance(Object obj) {
        if (obj instanceof Attributes) {
            return (Attributes) obj;
        }
        if (obj != null) {
            return new Attributes(ASN1Set.getInstance(obj));
        }
        return null;
    }

    public Attribute[] getAttributes() {
        int size = this.attributes.size();
        Attribute[] attributeArr = new Attribute[size];
        for (int i = 0; i != size; i++) {
            attributeArr[i] = Attribute.getInstance(this.attributes.getObjectAt(i));
        }
        return attributeArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.attributes;
    }

    private Attributes(ASN1Set aSN1Set) {
        this.attributes = aSN1Set;
    }
}
