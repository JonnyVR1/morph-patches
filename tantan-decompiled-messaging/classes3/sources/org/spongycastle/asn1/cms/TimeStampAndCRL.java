package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TimeStampAndCRL extends ASN1Object {
    private CertificateList crl;
    private ContentInfo timeStamp;

    private TimeStampAndCRL(ASN1Sequence aSN1Sequence) {
        this.timeStamp = ContentInfo.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.crl = CertificateList.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public static TimeStampAndCRL getInstance(Object obj) {
        if (obj instanceof TimeStampAndCRL) {
            return (TimeStampAndCRL) obj;
        }
        if (obj != null) {
            return new TimeStampAndCRL(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertificateList getCRL() {
        return this.crl;
    }

    public CertificateList getCertificateList() {
        return this.crl;
    }

    public ContentInfo getTimeStampToken() {
        return this.timeStamp;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.timeStamp);
        CertificateList certificateList = this.crl;
        if (certificateList != null) {
            aSN1EncodableVector.add(certificateList);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public TimeStampAndCRL(ContentInfo contentInfo) {
        this.timeStamp = contentInfo;
    }
}
