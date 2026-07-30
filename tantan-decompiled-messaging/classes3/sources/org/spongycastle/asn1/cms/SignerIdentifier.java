package org.spongycastle.asn1.cms;

import l.ig3;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SignerIdentifier extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: id */
    private ASN1Encodable f9862id;

    public SignerIdentifier(ASN1OctetString aSN1OctetString) {
        this.f9862id = new DERTaggedObject(false, 0, aSN1OctetString);
    }

    public static SignerIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof SignerIdentifier)) {
            return (SignerIdentifier) obj;
        }
        if (obj instanceof IssuerAndSerialNumber) {
            return new SignerIdentifier((IssuerAndSerialNumber) obj);
        }
        if (obj instanceof ASN1OctetString) {
            return new SignerIdentifier((ASN1OctetString) obj);
        }
        if (obj instanceof ASN1Primitive) {
            return new SignerIdentifier((ASN1Primitive) obj);
        }
        ig3.a("Illegal object in SignerIdentifier: ".concat(obj.getClass().getName()));
        return null;
    }

    public ASN1Encodable getId() {
        ASN1Encodable aSN1Encodable = this.f9862id;
        return aSN1Encodable instanceof ASN1TaggedObject ? ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Encodable, false) : aSN1Encodable;
    }

    public boolean isTagged() {
        return this.f9862id instanceof ASN1TaggedObject;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f9862id.toASN1Primitive();
    }

    public SignerIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f9862id = issuerAndSerialNumber;
    }

    public SignerIdentifier(ASN1Primitive aSN1Primitive) {
        this.f9862id = aSN1Primitive;
    }
}
