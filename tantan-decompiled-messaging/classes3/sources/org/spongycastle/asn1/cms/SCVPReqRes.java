package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SCVPReqRes extends ASN1Object {
    private final ContentInfo request;
    private final ContentInfo response;

    private SCVPReqRes(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            this.request = ContentInfo.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(0)), true);
            this.response = ContentInfo.getInstance(aSN1Sequence.getObjectAt(1));
        } else {
            this.request = null;
            this.response = ContentInfo.getInstance(aSN1Sequence.getObjectAt(0));
        }
    }

    public static SCVPReqRes getInstance(Object obj) {
        if (obj instanceof SCVPReqRes) {
            return (SCVPReqRes) obj;
        }
        if (obj != null) {
            return new SCVPReqRes(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ContentInfo getRequest() {
        return this.request;
    }

    public ContentInfo getResponse() {
        return this.response;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.request != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.request));
        }
        aSN1EncodableVector.add(this.response);
        return new DERSequence(aSN1EncodableVector);
    }

    public SCVPReqRes(ContentInfo contentInfo) {
        this.request = null;
        this.response = contentInfo;
    }

    public SCVPReqRes(ContentInfo contentInfo, ContentInfo contentInfo2) {
        this.request = contentInfo;
        this.response = contentInfo2;
    }
}
