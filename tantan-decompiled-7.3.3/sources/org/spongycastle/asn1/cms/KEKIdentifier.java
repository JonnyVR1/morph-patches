package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class KEKIdentifier extends ASN1Object {
    private ASN1GeneralizedTime date;
    private ASN1OctetString keyIdentifier;
    private OtherKeyAttribute other;

    private KEKIdentifier(ASN1Sequence aSN1Sequence) {
        this.keyIdentifier = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size == 2) {
                if (aSN1Sequence.getObjectAt(1) instanceof ASN1GeneralizedTime) {
                    this.date = (ASN1GeneralizedTime) aSN1Sequence.getObjectAt(1);
                    return;
                } else {
                    this.other = OtherKeyAttribute.getInstance(aSN1Sequence.getObjectAt(1));
                    return;
                }
            }
            if (size != 3) {
                wg3.m206174a("Invalid KEKIdentifier");
                throw null;
            }
            this.date = (ASN1GeneralizedTime) aSN1Sequence.getObjectAt(1);
            this.other = OtherKeyAttribute.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }

    public static KEKIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof KEKIdentifier)) {
            return (KEKIdentifier) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new KEKIdentifier((ASN1Sequence) obj);
        }
        wg3.m206174a("Invalid KEKIdentifier: ".concat(obj.getClass().getName()));
        return null;
    }

    public ASN1GeneralizedTime getDate() {
        return this.date;
    }

    public ASN1OctetString getKeyIdentifier() {
        return this.keyIdentifier;
    }

    public OtherKeyAttribute getOther() {
        return this.other;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.keyIdentifier);
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

    public static KEKIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public KEKIdentifier(byte[] bArr, ASN1GeneralizedTime aSN1GeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
        this.keyIdentifier = new DEROctetString(bArr);
        this.date = aSN1GeneralizedTime;
        this.other = otherKeyAttribute;
    }
}
