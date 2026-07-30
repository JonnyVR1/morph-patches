package org.spongycastle.asn1.p008ua;

import l.ig3;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* JADX INFO: renamed from: j */
    private int f9894j;

    /* JADX INFO: renamed from: k */
    private int f9895k;

    /* JADX INFO: renamed from: l */
    private int f9896l;

    /* JADX INFO: renamed from: m */
    private int f9897m;

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f9897m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getPositiveValue().intValue();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f9895k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getPositiveValue().intValue();
            return;
        }
        if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
            ig3.a("object parse error");
            throw null;
        }
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.f9895k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).getPositiveValue().intValue();
        this.f9894j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).getPositiveValue().intValue();
        this.f9896l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).getPositiveValue().intValue();
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
        return this.f9895k;
    }

    public int getK2() {
        return this.f9894j;
    }

    public int getK3() {
        return this.f9896l;
    }

    public int getM() {
        return this.f9897m;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f9897m));
        if (this.f9894j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f9895k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(new ASN1Integer(this.f9895k));
            aSN1EncodableVector2.add(new ASN1Integer(this.f9894j));
            aSN1EncodableVector2.add(new ASN1Integer(this.f9896l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i, int i2, int i3, int i4) {
        this.f9897m = i;
        this.f9895k = i2;
        this.f9894j = i3;
        this.f9896l = i4;
    }

    public DSTU4145BinaryField(int i, int i2) {
        this(i, i2, 0, 0);
    }
}
