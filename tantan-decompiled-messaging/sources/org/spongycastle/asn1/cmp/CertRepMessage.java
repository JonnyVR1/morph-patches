package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class CertRepMessage extends ASN1Object {
    private ASN1Sequence caPubs;
    private ASN1Sequence response;

    public CertRepMessage(CMPCertificate[] cMPCertificateArr, CertResponse[] certResponseArr) {
        if (certResponseArr == null) {
            ig3.m135964a("'response' cannot be null");
            throw null;
        }
        if (cMPCertificateArr != null) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            for (CMPCertificate cMPCertificate : cMPCertificateArr) {
                aSN1EncodableVector.add(cMPCertificate);
            }
            this.caPubs = new DERSequence(aSN1EncodableVector);
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        for (CertResponse certResponse : certResponseArr) {
            aSN1EncodableVector2.add(certResponse);
        }
        this.response = new DERSequence(aSN1EncodableVector2);
    }

    public static CertRepMessage getInstance(Object obj) {
        if (obj instanceof CertRepMessage) {
            return (CertRepMessage) obj;
        }
        if (obj != null) {
            return new CertRepMessage(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CMPCertificate[] getCaPubs() {
        ASN1Sequence aSN1Sequence = this.caPubs;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CMPCertificate[] cMPCertificateArr = new CMPCertificate[size];
        for (int i = 0; i != size; i++) {
            cMPCertificateArr[i] = CMPCertificate.getInstance(this.caPubs.getObjectAt(i));
        }
        return cMPCertificateArr;
    }

    public CertResponse[] getResponse() {
        int size = this.response.size();
        CertResponse[] certResponseArr = new CertResponse[size];
        for (int i = 0; i != size; i++) {
            certResponseArr[i] = CertResponse.getInstance(this.response.getObjectAt(i));
        }
        return certResponseArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.caPubs != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, this.caPubs));
        }
        aSN1EncodableVector.add(this.response);
        return new DERSequence(aSN1EncodableVector);
    }

    private CertRepMessage(ASN1Sequence aSN1Sequence) {
        int i = 0;
        if (aSN1Sequence.size() > 1) {
            this.caPubs = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i = 1;
        }
        this.response = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i));
    }
}
