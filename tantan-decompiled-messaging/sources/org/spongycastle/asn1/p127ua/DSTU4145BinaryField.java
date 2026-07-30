package org.spongycastle.asn1.p127ua;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* JADX INFO: renamed from: j */
    private int f206269j;

    /* JADX INFO: renamed from: k */
    private int f206270k;

    /* JADX INFO: renamed from: l */
    private int f206271l;

    /* JADX INFO: renamed from: m */
    private int f206272m;

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f206272m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getPositiveValue().intValue();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f206270k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getPositiveValue().intValue();
            return;
        }
        if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
            ig3.m135964a("object parse error");
            throw null;
        }
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.f206270k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).getPositiveValue().intValue();
        this.f206269j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).getPositiveValue().intValue();
        this.f206271l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).getPositiveValue().intValue();
    }

    public static DSTU4145BinaryField getInstance(Object obj) {
        if (obj instanceof DSTU4145BinaryField) {
            return (DSTU4145BinaryField) obj;
        }
        if (obj != null) {
            return new DSTU4145BinaryField(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int getK1() {
        return this.f206270k;
    }

    public int getK2() {
        return this.f206269j;
    }

    public int getK3() {
        return this.f206271l;
    }

    public int getM() {
        return this.f206272m;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f206272m));
        if (this.f206269j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f206270k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(new ASN1Integer(this.f206270k));
            aSN1EncodableVector2.add(new ASN1Integer(this.f206269j));
            aSN1EncodableVector2.add(new ASN1Integer(this.f206271l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i, int i2, int i3, int i4) {
        this.f206272m = i;
        this.f206270k = i2;
        this.f206269j = i3;
        this.f206271l = i4;
    }

    public DSTU4145BinaryField(int i, int i2) {
        this(i, i2, 0, 0);
    }
}
