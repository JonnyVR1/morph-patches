package org.spongycastle.asn1.x509;

import l.qkq0;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1UTCTime;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class V1TBSCertificateGenerator {
    Time endDate;
    X500Name issuer;
    ASN1Integer serialNumber;
    AlgorithmIdentifier signature;
    Time startDate;
    X500Name subject;
    SubjectPublicKeyInfo subjectPublicKeyInfo;
    DERTaggedObject version = new DERTaggedObject(true, 0, new ASN1Integer(0));

    public TBSCertificate generateTBSCertificate() {
        if (this.serialNumber == null || this.signature == null || this.issuer == null || this.startDate == null || this.endDate == null || this.subject == null || this.subjectPublicKeyInfo == null) {
            qkq0.a("not all mandatory fields set in V1 TBScertificate generator");
            return null;
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.serialNumber);
        aSN1EncodableVector.add(this.signature);
        aSN1EncodableVector.add(this.issuer);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        aSN1EncodableVector2.add(this.startDate);
        aSN1EncodableVector2.add(this.endDate);
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.add(this.subject);
        aSN1EncodableVector.add(this.subjectPublicKeyInfo);
        return TBSCertificate.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public void setEndDate(ASN1UTCTime aSN1UTCTime) {
        this.endDate = new Time(aSN1UTCTime);
    }

    public void setIssuer(X509Name x509Name) {
        this.issuer = X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setSerialNumber(ASN1Integer aSN1Integer) {
        this.serialNumber = aSN1Integer;
    }

    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
        this.signature = algorithmIdentifier;
    }

    public void setStartDate(ASN1UTCTime aSN1UTCTime) {
        this.startDate = new Time(aSN1UTCTime);
    }

    public void setSubject(X509Name x509Name) {
        this.subject = X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setSubjectPublicKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
    }

    public void setEndDate(Time time) {
        this.endDate = time;
    }

    public void setStartDate(Time time) {
        this.startDate = time;
    }

    public void setIssuer(X500Name x500Name) {
        this.issuer = x500Name;
    }

    public void setSubject(X500Name x500Name) {
        this.subject = x500Name;
    }
}
