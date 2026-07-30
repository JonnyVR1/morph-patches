package org.spongycastle.asn1.cms;

import l.ig3;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RecipientKeyIdentifier extends ASN1Object {
    private ASN1GeneralizedTime date;
    private OtherKeyAttribute other;
    private ASN1OctetString subjectKeyIdentifier;

    public RecipientKeyIdentifier(ASN1Sequence aSN1Sequence) {
        this.subjectKeyIdentifier = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size == 2) {
                if (aSN1Sequence.getObjectAt(1) instanceof ASN1GeneralizedTime) {
                    this.date = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
                    return;
                } else {
                    this.other = OtherKeyAttribute.getInstance(aSN1Sequence.getObjectAt(2));
                    return;
                }
            }
            if (size != 3) {
                ig3.a("Invalid RecipientKeyIdentifier");
                throw null;
            }
            this.date = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
            this.other = OtherKeyAttribute.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }

    public static RecipientKeyIdentifier getInstance(Object obj) {
        if (obj instanceof RecipientKeyIdentifier) {
            return (RecipientKeyIdentifier) obj;
        }
        if (obj != null) {
            return new RecipientKeyIdentifier(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1GeneralizedTime getDate() {
        return this.date;
    }

    public OtherKeyAttribute getOtherKeyAttribute() {
        return this.other;
    }

    public ASN1OctetString getSubjectKeyIdentifier() {
        return this.subjectKeyIdentifier;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.subjectKeyIdentifier);
        ASN1GeneralizedTime aSN1GeneralizedTime = this.date;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        OtherKeyAttribute otherKeyAttribute = this.other;
        if (otherKeyAttribute != null) {
            aSN1EncodableVector.add(otherKeyAttribute);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static RecipientKeyIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public RecipientKeyIdentifier(byte[] bArr, ASN1GeneralizedTime aSN1GeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
        this.subjectKeyIdentifier = new DEROctetString(bArr);
        this.date = aSN1GeneralizedTime;
        this.other = otherKeyAttribute;
    }

    public RecipientKeyIdentifier(byte[] bArr) {
        this(bArr, (ASN1GeneralizedTime) null, (OtherKeyAttribute) null);
    }

    public RecipientKeyIdentifier(ASN1OctetString aSN1OctetString, ASN1GeneralizedTime aSN1GeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
        this.subjectKeyIdentifier = aSN1OctetString;
        this.date = aSN1GeneralizedTime;
        this.other = otherKeyAttribute;
    }
}
