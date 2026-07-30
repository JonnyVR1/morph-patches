package org.spongycastle.asn1.isismtt.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERPrintableString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.DirectoryString;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.IssuerSerial;
import p153l.pvb;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class ProcurationSyntax extends ASN1Object {
    private IssuerSerial certRef;
    private String country;
    private GeneralName thirdPerson;
    private DirectoryString typeOfSubstitution;

    private ProcurationSyntax(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 3) {
            pvb.m173939a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 1) {
                this.country = DERPrintableString.getInstance(aSN1TaggedObject, true).getString();
            } else if (tagNo == 2) {
                this.typeOfSubstitution = DirectoryString.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 3) {
                    pvb.m173939a("Bad tag number: ", aSN1TaggedObject.getTagNo());
                    throw null;
                }
                ASN1Primitive object = aSN1TaggedObject.getObject();
                if (object instanceof ASN1TaggedObject) {
                    this.thirdPerson = GeneralName.getInstance(object);
                } else {
                    this.certRef = IssuerSerial.getInstance(object);
                }
            }
        }
    }

    public static ProcurationSyntax getInstance(Object obj) {
        if (obj == null || (obj instanceof ProcurationSyntax)) {
            return (ProcurationSyntax) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ProcurationSyntax((ASN1Sequence) obj);
        }
        wg3.m206174a("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    public IssuerSerial getCertRef() {
        return this.certRef;
    }

    public String getCountry() {
        return this.country;
    }

    public GeneralName getThirdPerson() {
        return this.thirdPerson;
    }

    public DirectoryString getTypeOfSubstitution() {
        return this.typeOfSubstitution;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.country != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, new DERPrintableString(this.country, true)));
        }
        if (this.typeOfSubstitution != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, this.typeOfSubstitution));
        }
        if (this.thirdPerson != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 3, this.thirdPerson));
        } else {
            aSN1EncodableVector.add(new DERTaggedObject(true, 3, this.certRef));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ProcurationSyntax(String str, DirectoryString directoryString, IssuerSerial issuerSerial) {
        this.country = str;
        this.typeOfSubstitution = directoryString;
        this.thirdPerson = null;
        this.certRef = issuerSerial;
    }

    public ProcurationSyntax(String str, DirectoryString directoryString, GeneralName generalName) {
        this.country = str;
        this.typeOfSubstitution = directoryString;
        this.thirdPerson = generalName;
        this.certRef = null;
    }
}
