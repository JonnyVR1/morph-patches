package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.DERIA5String;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TimeStampedData extends ASN1Object {
    private ASN1OctetString content;
    private DERIA5String dataUri;
    private MetaData metaData;
    private Evidence temporalEvidence;
    private ASN1Integer version;

    private TimeStampedData(ASN1Sequence aSN1Sequence) {
        this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        int i = 1;
        if (aSN1Sequence.getObjectAt(1) instanceof DERIA5String) {
            this.dataUri = DERIA5String.getInstance(aSN1Sequence.getObjectAt(1));
            i = 2;
        }
        if ((aSN1Sequence.getObjectAt(i) instanceof MetaData) || (aSN1Sequence.getObjectAt(i) instanceof ASN1Sequence)) {
            this.metaData = MetaData.getInstance(aSN1Sequence.getObjectAt(i));
            i++;
        }
        if (aSN1Sequence.getObjectAt(i) instanceof ASN1OctetString) {
            this.content = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i));
            i++;
        }
        this.temporalEvidence = Evidence.getInstance(aSN1Sequence.getObjectAt(i));
    }

    public static TimeStampedData getInstance(Object obj) {
        return (obj == null || (obj instanceof TimeStampedData)) ? (TimeStampedData) obj : new TimeStampedData(ASN1Sequence.getInstance(obj));
    }

    public ASN1OctetString getContent() {
        return this.content;
    }

    public DERIA5String getDataUri() {
        return this.dataUri;
    }

    public MetaData getMetaData() {
        return this.metaData;
    }

    public Evidence getTemporalEvidence() {
        return this.temporalEvidence;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.version);
        DERIA5String dERIA5String = this.dataUri;
        if (dERIA5String != null) {
            aSN1EncodableVector.add(dERIA5String);
        }
        MetaData metaData = this.metaData;
        if (metaData != null) {
            aSN1EncodableVector.add(metaData);
        }
        ASN1OctetString aSN1OctetString = this.content;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        aSN1EncodableVector.add(this.temporalEvidence);
        return new BERSequence(aSN1EncodableVector);
    }

    public TimeStampedData(DERIA5String dERIA5String, MetaData metaData, ASN1OctetString aSN1OctetString, Evidence evidence) {
        this.version = new ASN1Integer(1L);
        this.dataUri = dERIA5String;
        this.metaData = metaData;
        this.content = aSN1OctetString;
        this.temporalEvidence = evidence;
    }
}
