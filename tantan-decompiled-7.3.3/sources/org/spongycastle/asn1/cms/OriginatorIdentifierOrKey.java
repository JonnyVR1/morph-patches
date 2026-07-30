package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.SubjectKeyIdentifier;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class OriginatorIdentifierOrKey extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: id */
    private ASN1Encodable f207157id;

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
        wg3.m206174a("Invalid OriginatorIdentifierOrKey: ".concat(obj.getClass().getName()));
        return null;
    }

    public ASN1Encodable getId() {
        return this.f207157id;
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        ASN1Encodable aSN1Encodable = this.f207157id;
        if (aSN1Encodable instanceof IssuerAndSerialNumber) {
            return (IssuerAndSerialNumber) aSN1Encodable;
        }
        return null;
    }

    public OriginatorPublicKey getOriginatorKey() {
        ASN1Encodable aSN1Encodable = this.f207157id;
        if ((aSN1Encodable instanceof ASN1TaggedObject) && ((ASN1TaggedObject) aSN1Encodable).getTagNo() == 1) {
            return OriginatorPublicKey.getInstance((ASN1TaggedObject) this.f207157id, false);
        }
        return null;
    }

    public SubjectKeyIdentifier getSubjectKeyIdentifier() {
        ASN1Encodable aSN1Encodable = this.f207157id;
        if ((aSN1Encodable instanceof ASN1TaggedObject) && ((ASN1TaggedObject) aSN1Encodable).getTagNo() == 0) {
            return SubjectKeyIdentifier.getInstance((ASN1TaggedObject) this.f207157id, false);
        }
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f207157id.toASN1Primitive();
    }

    public OriginatorIdentifierOrKey(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f207157id = issuerAndSerialNumber;
    }

    public OriginatorIdentifierOrKey(SubjectKeyIdentifier subjectKeyIdentifier) {
        this.f207157id = new DERTaggedObject(false, 0, subjectKeyIdentifier);
    }

    public OriginatorIdentifierOrKey(OriginatorPublicKey originatorPublicKey) {
        this.f207157id = new DERTaggedObject(false, 1, originatorPublicKey);
    }

    public OriginatorIdentifierOrKey(ASN1Primitive aSN1Primitive) {
        this.f207157id = aSN1Primitive;
    }

    public static OriginatorIdentifierOrKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        wg3.m206174a("Can't implicitly tag OriginatorIdentifierOrKey");
        return null;
    }
}
