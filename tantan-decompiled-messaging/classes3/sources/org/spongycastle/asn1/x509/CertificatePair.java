package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import l.ig3;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import p003l.bub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CertificatePair extends ASN1Object {
    private Certificate forward;
    private Certificate reverse;

    private CertificatePair(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1 && aSN1Sequence.size() != 2) {
            bub.m3170a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.forward = Certificate.getInstance(aSN1TaggedObject, true);
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    bub.m3170a("Bad tag number: ", aSN1TaggedObject.getTagNo());
                    throw null;
                }
                this.reverse = Certificate.getInstance(aSN1TaggedObject, true);
            }
        }
    }

    public static CertificatePair getInstance(Object obj) {
        if (obj == null || (obj instanceof CertificatePair)) {
            return (CertificatePair) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new CertificatePair((ASN1Sequence) obj);
        }
        ig3.a("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    public Certificate getForward() {
        return this.forward;
    }

    public Certificate getReverse() {
        return this.reverse;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.forward != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, this.forward));
        }
        if (this.reverse != null) {
            aSN1EncodableVector.add(new DERTaggedObject(1, this.reverse));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertificatePair(Certificate certificate, Certificate certificate2) {
        this.forward = certificate;
        this.reverse = certificate2;
    }
}
