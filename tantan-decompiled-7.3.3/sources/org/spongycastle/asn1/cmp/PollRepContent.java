package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class PollRepContent extends ASN1Object {
    private ASN1Integer[] certReqId;
    private ASN1Integer[] checkAfter;
    private PKIFreeText[] reason;

    private PollRepContent(ASN1Sequence aSN1Sequence) {
        this.certReqId = new ASN1Integer[aSN1Sequence.size()];
        this.checkAfter = new ASN1Integer[aSN1Sequence.size()];
        this.reason = new PKIFreeText[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i));
            this.certReqId[i] = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0));
            this.checkAfter[i] = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1));
            if (aSN1Sequence2.size() > 2) {
                this.reason[i] = PKIFreeText.getInstance(aSN1Sequence2.getObjectAt(2));
            }
        }
    }

    public static PollRepContent getInstance(Object obj) {
        if (obj instanceof PollRepContent) {
            return (PollRepContent) obj;
        }
        if (obj != null) {
            return new PollRepContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Integer getCertReqId(int i) {
        return this.certReqId[i];
    }

    public ASN1Integer getCheckAfter(int i) {
        return this.checkAfter[i];
    }

    public PKIFreeText getReason(int i) {
        return this.reason[i];
    }

    public int size() {
        return this.certReqId.length;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i = 0; i != this.certReqId.length; i++) {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.certReqId[i]);
            aSN1EncodableVector2.add(this.checkAfter[i]);
            PKIFreeText pKIFreeText = this.reason[i];
            if (pKIFreeText != null) {
                aSN1EncodableVector2.add(pKIFreeText);
            }
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public PollRepContent(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2) {
        this(aSN1Integer, aSN1Integer2, null);
    }

    public PollRepContent(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, PKIFreeText pKIFreeText) {
        this.certReqId = new ASN1Integer[]{aSN1Integer};
        this.checkAfter = new ASN1Integer[]{aSN1Integer2};
        this.reason = new PKIFreeText[]{pKIFreeText};
    }
}
