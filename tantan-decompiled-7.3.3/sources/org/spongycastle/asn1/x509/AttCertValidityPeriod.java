package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import p153l.pvb;

/* JADX INFO: loaded from: classes3.dex */
public class AttCertValidityPeriod extends ASN1Object {
    ASN1GeneralizedTime notAfterTime;
    ASN1GeneralizedTime notBeforeTime;

    private AttCertValidityPeriod(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            pvb.m173939a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        this.notBeforeTime = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(0));
        this.notAfterTime = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static AttCertValidityPeriod getInstance(Object obj) {
        if (obj instanceof AttCertValidityPeriod) {
            return (AttCertValidityPeriod) obj;
        }
        if (obj != null) {
            return new AttCertValidityPeriod(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1GeneralizedTime getNotAfterTime() {
        return this.notAfterTime;
    }

    public ASN1GeneralizedTime getNotBeforeTime() {
        return this.notBeforeTime;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.notBeforeTime);
        aSN1EncodableVector.add(this.notAfterTime);
        return new DERSequence(aSN1EncodableVector);
    }

    public AttCertValidityPeriod(ASN1GeneralizedTime aSN1GeneralizedTime, ASN1GeneralizedTime aSN1GeneralizedTime2) {
        this.notBeforeTime = aSN1GeneralizedTime;
        this.notAfterTime = aSN1GeneralizedTime2;
    }
}
