package org.spongycastle.asn1.cmp;

import l.qkq0;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.crmf.CertId;
import org.spongycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RevRepContentBuilder {
    private ASN1EncodableVector status = new ASN1EncodableVector();
    private ASN1EncodableVector revCerts = new ASN1EncodableVector();
    private ASN1EncodableVector crls = new ASN1EncodableVector();

    public RevRepContentBuilder add(PKIStatusInfo pKIStatusInfo, CertId certId) {
        if (this.status.size() != this.revCerts.size()) {
            qkq0.a("status and revCerts sequence must be in common order");
            return null;
        }
        this.status.add(pKIStatusInfo);
        this.revCerts.add(certId);
        return this;
    }

    public RevRepContentBuilder addCrl(CertificateList certificateList) {
        this.crls.add(certificateList);
        return this;
    }

    public RevRepContent build() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DERSequence(this.status));
        if (this.revCerts.size() != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, new DERSequence(this.revCerts)));
        }
        if (this.crls.size() != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, new DERSequence(this.crls)));
        }
        return RevRepContent.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public RevRepContentBuilder add(PKIStatusInfo pKIStatusInfo) {
        this.status.add(pKIStatusInfo);
        return this;
    }
}
