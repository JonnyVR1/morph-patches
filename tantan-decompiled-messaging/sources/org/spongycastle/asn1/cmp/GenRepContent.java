package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class GenRepContent extends ASN1Object {
    private ASN1Sequence content;

    public GenRepContent(InfoTypeAndValue[] infoTypeAndValueArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (InfoTypeAndValue infoTypeAndValue : infoTypeAndValueArr) {
            aSN1EncodableVector.add(infoTypeAndValue);
        }
        this.content = new DERSequence(aSN1EncodableVector);
    }

    public static GenRepContent getInstance(Object obj) {
        if (obj instanceof GenRepContent) {
            return (GenRepContent) obj;
        }
        if (obj != null) {
            return new GenRepContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public InfoTypeAndValue[] toInfoTypeAndValueArray() {
        int size = this.content.size();
        InfoTypeAndValue[] infoTypeAndValueArr = new InfoTypeAndValue[size];
        for (int i = 0; i != size; i++) {
            infoTypeAndValueArr[i] = InfoTypeAndValue.getInstance(this.content.getObjectAt(i));
        }
        return infoTypeAndValueArr;
    }

    public GenRepContent(InfoTypeAndValue infoTypeAndValue) {
        this.content = new DERSequence(infoTypeAndValue);
    }

    private GenRepContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }
}
