package org.spongycastle.asn1.isismtt.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.GeneralName;
import p153l.pvb;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class AdmissionSyntax extends ASN1Object {
    private GeneralName admissionAuthority;
    private ASN1Sequence contentsOfAdmissions;

    private AdmissionSyntax(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        if (size == 1) {
            this.contentsOfAdmissions = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            if (size != 2) {
                pvb.m173939a("Bad sequence size: ", aSN1Sequence.size());
                throw null;
            }
            this.admissionAuthority = GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
            this.contentsOfAdmissions = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public static AdmissionSyntax getInstance(Object obj) {
        if (obj == null || (obj instanceof AdmissionSyntax)) {
            return (AdmissionSyntax) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new AdmissionSyntax((ASN1Sequence) obj);
        }
        wg3.m206174a("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    public GeneralName getAdmissionAuthority() {
        return this.admissionAuthority;
    }

    public Admissions[] getContentsOfAdmissions() {
        Admissions[] admissionsArr = new Admissions[this.contentsOfAdmissions.size()];
        Enumeration objects = this.contentsOfAdmissions.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            admissionsArr[i] = Admissions.getInstance(objects.nextElement());
            i++;
        }
        return admissionsArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        GeneralName generalName = this.admissionAuthority;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        aSN1EncodableVector.add(this.contentsOfAdmissions);
        return new DERSequence(aSN1EncodableVector);
    }

    public AdmissionSyntax(GeneralName generalName, ASN1Sequence aSN1Sequence) {
        this.admissionAuthority = generalName;
        this.contentsOfAdmissions = aSN1Sequence;
    }
}
