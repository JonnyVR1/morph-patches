package org.spongycastle.asn1.cms;

import l.ig3;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.SubjectKeyIdentifier;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class OriginatorIdentifierOrKey extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: id */
    private ASN1Encodable f9860id;

    public OriginatorIdentifierOrKey(ASN1OctetString aSN1OctetString) {
        this(new SubjectKeyIdentifier(aSN1OctetString.getOctets()));
    }

    public static OriginatorIdentifierOrKey getInstance(Object obj) {
        if (obj == null || (obj instanceof OriginatorIdentifierOrKey)) {
            return (OriginatorIdentifierOrKey) obj;
        }
        if ((obj instanceof IssuerAndSerialNumber) || (obj instanceof ASN1Sequence)) {
            return new OriginatorIdentifierOrKey(IssuerAndSerialNumber.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
            if (aSN1TaggedObject.getTagNo() == 0) {
                return new OriginatorIdentifierOrKey(SubjectKeyIdentifier.getInstance(aSN1TaggedObject, false));
            }
            if (aSN1TaggedObject.getTagNo() == 1) {
                return new OriginatorIdentifierOrKey(OriginatorPublicKey.getInstance(aSN1TaggedObject, false));
            }
        }
        ig3.a("Invalid OriginatorIdentifierOrKey: ".concat(obj.getClass().getName()));
        return null;
    }

    public ASN1Encodable getId() {
        return this.f9860id;
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        ASN1Encodable aSN1Encodable = this.f9860id;
        if (aSN1Encodable instanceof IssuerAndSerialNumber) {
            return (IssuerAndSerialNumber) aSN1Encodable;
        }
        return null;
    }

    public OriginatorPublicKey getOriginatorKey() {
        ASN1Encodable aSN1Encodable = this.f9860id;
        if ((aSN1Encodable instanceof ASN1TaggedObject) && ((ASN1TaggedObject) aSN1Encodable).getTagNo() == 1) {
            return OriginatorPublicKey.getInstance((ASN1TaggedObject) this.f9860id, false);
        }
        return null;
    }

    public SubjectKeyIdentifier getSubjectKeyIdentifier() {
        ASN1Encodable aSN1Encodable = this.f9860id;
        if ((aSN1Encodable instanceof ASN1TaggedObject) && ((ASN1TaggedObject) aSN1Encodable).getTagNo() == 0) {
            return SubjectKeyIdentifier.getInstance((ASN1TaggedObject) this.f9860id, false);
        }
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f9860id.toASN1Primitive();
    }

    public OriginatorIdentifierOrKey(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f9860id = issuerAndSerialNumber;
    }

    public OriginatorIdentifierOrKey(SubjectKeyIdentifier subjectKeyIdentifier) {
        this.f9860id = new DERTaggedObject(false, 0, subjectKeyIdentifier);
    }

    public OriginatorIdentifierOrKey(OriginatorPublicKey originatorPublicKey) {
        this.f9860id = new DERTaggedObject(false, 1, originatorPublicKey);
    }

    public OriginatorIdentifierOrKey(ASN1Primitive aSN1Primitive) {
        this.f9860id = aSN1Primitive;
    }

    public static OriginatorIdentifierOrKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        ig3.a("Can't implicitly tag OriginatorIdentifierOrKey");
        return null;
    }
}
