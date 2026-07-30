package org.spongycastle.asn1.cmp;

import l.ig3;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.crmf.EncryptedValue;
import org.spongycastle.asn1.crmf.PKIPublicationInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CertifiedKeyPair extends ASN1Object {
    private CertOrEncCert certOrEncCert;
    private EncryptedValue privateKey;
    private PKIPublicationInfo publicationInfo;

    private CertifiedKeyPair(ASN1Sequence aSN1Sequence) {
        this.certOrEncCert = CertOrEncCert.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() >= 2) {
            if (aSN1Sequence.size() != 2) {
                this.privateKey = EncryptedValue.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)));
                this.publicationInfo = PKIPublicationInfo.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2)));
                return;
            }
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.privateKey = EncryptedValue.getInstance(aSN1TaggedObject.getObject());
            } else {
                this.publicationInfo = PKIPublicationInfo.getInstance(aSN1TaggedObject.getObject());
            }
        }
    }

    public static CertifiedKeyPair getInstance(Object obj) {
        if (obj instanceof CertifiedKeyPair) {
            return (CertifiedKeyPair) obj;
        }
        if (obj != null) {
            return new CertifiedKeyPair(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertOrEncCert getCertOrEncCert() {
        return this.certOrEncCert;
    }

    public EncryptedValue getPrivateKey() {
        return this.privateKey;
    }

    public PKIPublicationInfo getPublicationInfo() {
        return this.publicationInfo;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.certOrEncCert);
        if (this.privateKey != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.privateKey));
        }
        if (this.publicationInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, this.publicationInfo));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertifiedKeyPair(CertOrEncCert certOrEncCert) {
        this(certOrEncCert, null, null);
    }

    public CertifiedKeyPair(CertOrEncCert certOrEncCert, EncryptedValue encryptedValue, PKIPublicationInfo pKIPublicationInfo) {
        if (certOrEncCert != null) {
            this.certOrEncCert = certOrEncCert;
            this.privateKey = encryptedValue;
            this.publicationInfo = pKIPublicationInfo;
            return;
        }
        ig3.a("'certOrEncCert' cannot be null");
        throw null;
    }
}
