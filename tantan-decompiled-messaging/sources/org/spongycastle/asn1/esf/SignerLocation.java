package org.spongycastle.asn1.esf;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.DERUTF8String;
import org.spongycastle.asn1.x500.DirectoryString;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SignerLocation extends ASN1Object {
    private DERUTF8String countryName;
    private DERUTF8String localityName;
    private ASN1Sequence postalAddress;

    private SignerLocation(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            DERTaggedObject dERTaggedObject = (DERTaggedObject) objects.nextElement();
            int tagNo = dERTaggedObject.getTagNo();
            if (tagNo == 0) {
                this.countryName = new DERUTF8String(DirectoryString.getInstance(dERTaggedObject, true).getString());
            } else if (tagNo == 1) {
                this.localityName = new DERUTF8String(DirectoryString.getInstance(dERTaggedObject, true).getString());
            } else {
                if (tagNo != 2) {
                    ig3.m135964a("illegal tag");
                    throw null;
                }
                if (dERTaggedObject.isExplicit()) {
                    this.postalAddress = ASN1Sequence.getInstance(dERTaggedObject, true);
                } else {
                    this.postalAddress = ASN1Sequence.getInstance(dERTaggedObject, false);
                }
                ASN1Sequence aSN1Sequence2 = this.postalAddress;
                if (aSN1Sequence2 != null && aSN1Sequence2.size() > 6) {
                    ig3.m135964a("postal address must contain less than 6 strings");
                    throw null;
                }
            }
        }
    }

    public static SignerLocation getInstance(Object obj) {
        return (obj == null || (obj instanceof SignerLocation)) ? (SignerLocation) obj : new SignerLocation(ASN1Sequence.getInstance(obj));
    }

    public DERUTF8String getCountryName() {
        return this.countryName;
    }

    public DERUTF8String getLocalityName() {
        return this.localityName;
    }

    public ASN1Sequence getPostalAddress() {
        return this.postalAddress;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.countryName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.countryName));
        }
        if (this.localityName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, this.localityName));
        }
        if (this.postalAddress != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, this.postalAddress));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SignerLocation(DERUTF8String dERUTF8String, DERUTF8String dERUTF8String2, ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence != null && aSN1Sequence.size() > 6) {
            ig3.m135964a("postal address must contain less than 6 strings");
            throw null;
        }
        if (dERUTF8String != null) {
            this.countryName = DERUTF8String.getInstance(dERUTF8String.toASN1Primitive());
        }
        if (dERUTF8String2 != null) {
            this.localityName = DERUTF8String.getInstance(dERUTF8String2.toASN1Primitive());
        }
        if (aSN1Sequence != null) {
            this.postalAddress = ASN1Sequence.getInstance(aSN1Sequence.toASN1Primitive());
        }
    }
}
