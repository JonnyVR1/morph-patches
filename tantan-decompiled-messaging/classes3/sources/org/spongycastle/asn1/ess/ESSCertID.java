package org.spongycastle.asn1.ess;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.IssuerSerial;
import p003l.bub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ESSCertID extends ASN1Object {
    private ASN1OctetString certHash;
    private IssuerSerial issuerSerial;

    private ESSCertID(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            bub.m3170a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        this.certHash = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.issuerSerial = IssuerSerial.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public static ESSCertID getInstance(Object obj) {
        if (obj instanceof ESSCertID) {
            return (ESSCertID) obj;
        }
        if (obj != null) {
            return new ESSCertID(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getCertHash() {
        return this.certHash.getOctets();
    }

    public IssuerSerial getIssuerSerial() {
        return this.issuerSerial;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.certHash);
        IssuerSerial issuerSerial = this.issuerSerial;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(issuerSerial);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ESSCertID(byte[] bArr) {
        this.certHash = new DEROctetString(bArr);
    }

    public ESSCertID(byte[] bArr, IssuerSerial issuerSerial) {
        this.certHash = new DEROctetString(bArr);
        this.issuerSerial = issuerSerial;
    }
}
