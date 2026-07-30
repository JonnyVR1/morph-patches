package org.spongycastle.asn1.ess;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.asn1.x509.IssuerSerial;
import p153l.pvb;

/* JADX INFO: loaded from: classes3.dex */
public class OtherCertID extends ASN1Object {
    private IssuerSerial issuerSerial;
    private ASN1Encodable otherCertHash;

    private OtherCertID(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            pvb.m173939a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        if (aSN1Sequence.getObjectAt(0).toASN1Primitive() instanceof ASN1OctetString) {
            this.otherCertHash = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.otherCertHash = DigestInfo.getInstance(aSN1Sequence.getObjectAt(0));
        }
        if (aSN1Sequence.size() > 1) {
            this.issuerSerial = IssuerSerial.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public static OtherCertID getInstance(Object obj) {
        if (obj instanceof OtherCertID) {
            return (OtherCertID) obj;
        }
        if (obj != null) {
            return new OtherCertID(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getAlgorithmHash() {
        return this.otherCertHash.toASN1Primitive() instanceof ASN1OctetString ? new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1) : DigestInfo.getInstance(this.otherCertHash).getAlgorithmId();
    }

    public byte[] getCertHash() {
        boolean z = this.otherCertHash.toASN1Primitive() instanceof ASN1OctetString;
        ASN1Encodable aSN1Encodable = this.otherCertHash;
        return z ? ((ASN1OctetString) aSN1Encodable.toASN1Primitive()).getOctets() : DigestInfo.getInstance(aSN1Encodable).getDigest();
    }

    public IssuerSerial getIssuerSerial() {
        return this.issuerSerial;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.otherCertHash);
        IssuerSerial issuerSerial = this.issuerSerial;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(issuerSerial);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public OtherCertID(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.otherCertHash = new DigestInfo(algorithmIdentifier, bArr);
    }

    public OtherCertID(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, IssuerSerial issuerSerial) {
        this.otherCertHash = new DigestInfo(algorithmIdentifier, bArr);
        this.issuerSerial = issuerSerial;
    }
}
