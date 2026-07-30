package org.spongycastle.asn1.tsp;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.cmp.PKIStatusInfo;
import org.spongycastle.asn1.cms.ContentInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TimeStampResp extends ASN1Object {
    PKIStatusInfo pkiStatusInfo;
    ContentInfo timeStampToken;

    private TimeStampResp(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.pkiStatusInfo = PKIStatusInfo.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.timeStampToken = ContentInfo.getInstance(objects.nextElement());
        }
    }

    public static TimeStampResp getInstance(Object obj) {
        if (obj instanceof TimeStampResp) {
            return (TimeStampResp) obj;
        }
        if (obj != null) {
            return new TimeStampResp(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PKIStatusInfo getStatus() {
        return this.pkiStatusInfo;
    }

    public ContentInfo getTimeStampToken() {
        return this.timeStampToken;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.pkiStatusInfo);
        ContentInfo contentInfo = this.timeStampToken;
        if (contentInfo != null) {
            aSN1EncodableVector.add(contentInfo);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public TimeStampResp(PKIStatusInfo pKIStatusInfo, ContentInfo contentInfo) {
        this.pkiStatusInfo = pKIStatusInfo;
        this.timeStampToken = contentInfo;
    }
}
