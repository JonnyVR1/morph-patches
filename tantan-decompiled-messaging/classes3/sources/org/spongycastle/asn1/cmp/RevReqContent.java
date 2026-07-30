package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RevReqContent extends ASN1Object {
    private ASN1Sequence content;

    public RevReqContent(RevDetails[] revDetailsArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i = 0; i != revDetailsArr.length; i++) {
            aSN1EncodableVector.add(revDetailsArr[i]);
        }
        this.content = new DERSequence(aSN1EncodableVector);
    }

    public static RevReqContent getInstance(Object obj) {
        if (obj instanceof RevReqContent) {
            return (RevReqContent) obj;
        }
        if (obj != null) {
            return new RevReqContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public RevDetails[] toRevDetailsArray() {
        int size = this.content.size();
        RevDetails[] revDetailsArr = new RevDetails[size];
        for (int i = 0; i != size; i++) {
            revDetailsArr[i] = RevDetails.getInstance(this.content.getObjectAt(i));
        }
        return revDetailsArr;
    }

    public RevReqContent(RevDetails revDetails) {
        this.content = new DERSequence(revDetails);
    }

    private RevReqContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }
}
