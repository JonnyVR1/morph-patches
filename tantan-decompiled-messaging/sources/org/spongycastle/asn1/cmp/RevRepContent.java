package org.spongycastle.asn1.cmp;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.crmf.CertId;
import org.spongycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes3.dex */
public class RevRepContent extends ASN1Object {
    private ASN1Sequence crls;
    private ASN1Sequence revCerts;
    private ASN1Sequence status;

    private RevRepContent(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.status = ASN1Sequence.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.revCerts = ASN1Sequence.getInstance(aSN1TaggedObject, true);
            } else {
                this.crls = ASN1Sequence.getInstance(aSN1TaggedObject, true);
            }
        }
    }

    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, i, aSN1Encodable));
        }
    }

    public static RevRepContent getInstance(Object obj) {
        if (obj instanceof RevRepContent) {
            return (RevRepContent) obj;
        }
        if (obj != null) {
            return new RevRepContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertificateList[] getCrls() {
        ASN1Sequence aSN1Sequence = this.crls;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CertificateList[] certificateListArr = new CertificateList[size];
        for (int i = 0; i != size; i++) {
            certificateListArr[i] = CertificateList.getInstance(this.crls.getObjectAt(i));
        }
        return certificateListArr;
    }

    public CertId[] getRevCerts() {
        ASN1Sequence aSN1Sequence = this.revCerts;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CertId[] certIdArr = new CertId[size];
        for (int i = 0; i != size; i++) {
            certIdArr[i] = CertId.getInstance(this.revCerts.getObjectAt(i));
        }
        return certIdArr;
    }

    public PKIStatusInfo[] getStatus() {
        int size = this.status.size();
        PKIStatusInfo[] pKIStatusInfoArr = new PKIStatusInfo[size];
        for (int i = 0; i != size; i++) {
            pKIStatusInfoArr[i] = PKIStatusInfo.getInstance(this.status.getObjectAt(i));
        }
        return pKIStatusInfoArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.status);
        addOptional(aSN1EncodableVector, 0, this.revCerts);
        addOptional(aSN1EncodableVector, 1, this.crls);
        return new DERSequence(aSN1EncodableVector);
    }
}
