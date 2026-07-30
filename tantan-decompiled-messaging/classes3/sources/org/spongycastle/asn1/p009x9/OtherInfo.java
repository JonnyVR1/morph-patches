package org.spongycastle.asn1.p009x9;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class OtherInfo extends ASN1Object {
    private KeySpecificInfo keyInfo;
    private ASN1OctetString partyAInfo;
    private ASN1OctetString suppPubInfo;

    private OtherInfo(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.keyInfo = KeySpecificInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            DERTaggedObject dERTaggedObject = (DERTaggedObject) objects.nextElement();
            if (dERTaggedObject.getTagNo() == 0) {
                this.partyAInfo = (ASN1OctetString) dERTaggedObject.getObject();
            } else if (dERTaggedObject.getTagNo() == 2) {
                this.suppPubInfo = (ASN1OctetString) dERTaggedObject.getObject();
            }
        }
    }

    public static OtherInfo getInstance(Object obj) {
        if (obj instanceof OtherInfo) {
            return (OtherInfo) obj;
        }
        if (obj != null) {
            return new OtherInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public KeySpecificInfo getKeyInfo() {
        return this.keyInfo;
    }

    public ASN1OctetString getPartyAInfo() {
        return this.partyAInfo;
    }

    public ASN1OctetString getSuppPubInfo() {
        return this.suppPubInfo;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.keyInfo);
        if (this.partyAInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, this.partyAInfo));
        }
        aSN1EncodableVector.add(new DERTaggedObject(2, this.suppPubInfo));
        return new DERSequence(aSN1EncodableVector);
    }

    public OtherInfo(KeySpecificInfo keySpecificInfo, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        this.keyInfo = keySpecificInfo;
        this.partyAInfo = aSN1OctetString;
        this.suppPubInfo = aSN1OctetString2;
    }
}
