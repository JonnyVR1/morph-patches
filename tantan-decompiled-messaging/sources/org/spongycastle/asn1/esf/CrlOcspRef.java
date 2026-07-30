package org.spongycastle.asn1.esf;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class CrlOcspRef extends ASN1Object {
    private CrlListID crlids;
    private OcspListID ocspids;
    private OtherRevRefs otherRev;

    private CrlOcspRef(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            DERTaggedObject dERTaggedObject = (DERTaggedObject) objects.nextElement();
            int tagNo = dERTaggedObject.getTagNo();
            if (tagNo == 0) {
                this.crlids = CrlListID.getInstance(dERTaggedObject.getObject());
            } else if (tagNo == 1) {
                this.ocspids = OcspListID.getInstance(dERTaggedObject.getObject());
            } else {
                if (tagNo != 2) {
                    ig3.m135964a("illegal tag");
                    throw null;
                }
                this.otherRev = OtherRevRefs.getInstance(dERTaggedObject.getObject());
            }
        }
    }

    public static CrlOcspRef getInstance(Object obj) {
        if (obj instanceof CrlOcspRef) {
            return (CrlOcspRef) obj;
        }
        if (obj != null) {
            return new CrlOcspRef(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CrlListID getCrlids() {
        return this.crlids;
    }

    public OcspListID getOcspids() {
        return this.ocspids;
    }

    public OtherRevRefs getOtherRev() {
        return this.otherRev;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.crlids != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.crlids.toASN1Primitive()));
        }
        if (this.ocspids != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, this.ocspids.toASN1Primitive()));
        }
        if (this.otherRev != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, this.otherRev.toASN1Primitive()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CrlOcspRef(CrlListID crlListID, OcspListID ocspListID, OtherRevRefs otherRevRefs) {
        this.crlids = crlListID;
        this.ocspids = ocspListID;
        this.otherRev = otherRevRefs;
    }
}
