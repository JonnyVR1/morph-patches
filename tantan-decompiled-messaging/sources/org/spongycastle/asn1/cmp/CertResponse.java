package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class CertResponse extends ASN1Object {
    private ASN1Integer certReqId;
    private CertifiedKeyPair certifiedKeyPair;
    private ASN1OctetString rspInfo;
    private PKIStatusInfo status;

    private CertResponse(ASN1Sequence aSN1Sequence) {
        this.certReqId = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.status = PKIStatusInfo.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() >= 3) {
            if (aSN1Sequence.size() != 3) {
                this.certifiedKeyPair = CertifiedKeyPair.getInstance(aSN1Sequence.getObjectAt(2));
                this.rspInfo = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3));
                return;
            }
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(2);
            if (objectAt instanceof ASN1OctetString) {
                this.rspInfo = ASN1OctetString.getInstance(objectAt);
            } else {
                this.certifiedKeyPair = CertifiedKeyPair.getInstance(objectAt);
            }
        }
    }

    public static CertResponse getInstance(Object obj) {
        if (obj instanceof CertResponse) {
            return (CertResponse) obj;
        }
        if (obj != null) {
            return new CertResponse(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Integer getCertReqId() {
        return this.certReqId;
    }

    public CertifiedKeyPair getCertifiedKeyPair() {
        return this.certifiedKeyPair;
    }

    public PKIStatusInfo getStatus() {
        return this.status;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.certReqId);
        aSN1EncodableVector.add(this.status);
        CertifiedKeyPair certifiedKeyPair = this.certifiedKeyPair;
        if (certifiedKeyPair != null) {
            aSN1EncodableVector.add(certifiedKeyPair);
        }
        ASN1OctetString aSN1OctetString = this.rspInfo;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertResponse(ASN1Integer aSN1Integer, PKIStatusInfo pKIStatusInfo) {
        this(aSN1Integer, pKIStatusInfo, null, null);
    }

    public CertResponse(ASN1Integer aSN1Integer, PKIStatusInfo pKIStatusInfo, CertifiedKeyPair certifiedKeyPair, ASN1OctetString aSN1OctetString) {
        if (aSN1Integer == null) {
            ig3.m135964a("'certReqId' cannot be null");
            throw null;
        }
        if (pKIStatusInfo != null) {
            this.certReqId = aSN1Integer;
            this.status = pKIStatusInfo;
            this.certifiedKeyPair = certifiedKeyPair;
            this.rspInfo = aSN1OctetString;
            return;
        }
        ig3.m135964a("'status' cannot be null");
        throw null;
    }
}
