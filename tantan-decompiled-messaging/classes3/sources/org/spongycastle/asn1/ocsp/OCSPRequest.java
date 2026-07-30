package org.spongycastle.asn1.ocsp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class OCSPRequest extends ASN1Object {
    Signature optionalSignature;
    TBSRequest tbsRequest;

    private OCSPRequest(ASN1Sequence aSN1Sequence) {
        this.tbsRequest = TBSRequest.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.optionalSignature = Signature.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
    }

    public static OCSPRequest getInstance(Object obj) {
        if (obj instanceof OCSPRequest) {
            return (OCSPRequest) obj;
        }
        if (obj != null) {
            return new OCSPRequest(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Signature getOptionalSignature() {
        return this.optionalSignature;
    }

    public TBSRequest getTbsRequest() {
        return this.tbsRequest;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.tbsRequest);
        if (this.optionalSignature != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.optionalSignature));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static OCSPRequest getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public OCSPRequest(TBSRequest tBSRequest, Signature signature) {
        this.tbsRequest = tBSRequest;
        this.optionalSignature = signature;
    }
}
