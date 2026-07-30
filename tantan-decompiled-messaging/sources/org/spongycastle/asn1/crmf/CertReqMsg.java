package org.spongycastle.asn1.crmf;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class CertReqMsg extends ASN1Object {
    private CertRequest certReq;
    private ProofOfPossession pop;
    private ASN1Sequence regInfo;

    private CertReqMsg(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.certReq = CertRequest.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            Object objNextElement = objects.nextElement();
            if ((objNextElement instanceof ASN1TaggedObject) || (objNextElement instanceof ProofOfPossession)) {
                this.pop = ProofOfPossession.getInstance(objNextElement);
            } else {
                this.regInfo = ASN1Sequence.getInstance(objNextElement);
            }
        }
    }

    private void addOptional(ASN1EncodableVector aSN1EncodableVector, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
    }

    public static CertReqMsg getInstance(Object obj) {
        if (obj instanceof CertReqMsg) {
            return (CertReqMsg) obj;
        }
        if (obj != null) {
            return new CertReqMsg(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertRequest getCertReq() {
        return this.certReq;
    }

    public ProofOfPossession getPop() {
        return this.pop;
    }

    public ProofOfPossession getPopo() {
        return this.pop;
    }

    public AttributeTypeAndValue[] getRegInfo() {
        ASN1Sequence aSN1Sequence = this.regInfo;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        AttributeTypeAndValue[] attributeTypeAndValueArr = new AttributeTypeAndValue[size];
        for (int i = 0; i != size; i++) {
            attributeTypeAndValueArr[i] = AttributeTypeAndValue.getInstance(this.regInfo.getObjectAt(i));
        }
        return attributeTypeAndValueArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.certReq);
        addOptional(aSN1EncodableVector, this.pop);
        addOptional(aSN1EncodableVector, this.regInfo);
        return new DERSequence(aSN1EncodableVector);
    }

    public CertReqMsg(CertRequest certRequest, ProofOfPossession proofOfPossession, AttributeTypeAndValue[] attributeTypeAndValueArr) {
        if (certRequest != null) {
            this.certReq = certRequest;
            this.pop = proofOfPossession;
            if (attributeTypeAndValueArr != null) {
                this.regInfo = new DERSequence(attributeTypeAndValueArr);
                return;
            }
            return;
        }
        ig3.m135964a("'certReq' cannot be null");
        throw null;
    }
}
