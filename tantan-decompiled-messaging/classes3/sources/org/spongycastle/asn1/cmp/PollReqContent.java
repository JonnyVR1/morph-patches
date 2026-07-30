package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PollReqContent extends ASN1Object {
    private ASN1Sequence content;

    public PollReqContent(ASN1Integer aSN1Integer) {
        this(new DERSequence(new DERSequence(aSN1Integer)));
    }

    public static PollReqContent getInstance(Object obj) {
        if (obj instanceof PollReqContent) {
            return (PollReqContent) obj;
        }
        if (obj != null) {
            return new PollReqContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private static ASN1Integer[] sequenceToASN1IntegerArray(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        ASN1Integer[] aSN1IntegerArr = new ASN1Integer[size];
        for (int i = 0; i != size; i++) {
            aSN1IntegerArr[i] = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i));
        }
        return aSN1IntegerArr;
    }

    public ASN1Integer[][] getCertReqIds() {
        int size = this.content.size();
        ASN1Integer[][] aSN1IntegerArr = new ASN1Integer[size][];
        for (int i = 0; i != size; i++) {
            aSN1IntegerArr[i] = sequenceToASN1IntegerArray((ASN1Sequence) this.content.getObjectAt(i));
        }
        return aSN1IntegerArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    private PollReqContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }
}
