package org.spongycastle.asn1.p131ua;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* JADX INFO: renamed from: j */
    private int f207191j;

    /* JADX INFO: renamed from: k */
    private int f207192k;

    /* JADX INFO: renamed from: l */
    private int f207193l;

    /* JADX INFO: renamed from: m */
    private int f207194m;

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f207194m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getPositiveValue().intValue();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f207192k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getPositiveValue().intValue();
            return;
        }
        if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
            wg3.m206174a("object parse error");
            throw null;
        }
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.f207192k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).getPositiveValue().intValue();
        this.f207191j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).getPositiveValue().intValue();
        this.f207193l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).getPositiveValue().intValue();
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
        return this.f207192k;
    }

    public int getK2() {
        return this.f207191j;
    }

    public int getK3() {
        return this.f207193l;
    }

    public int getM() {
        return this.f207194m;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f207194m));
        if (this.f207191j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f207192k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(new ASN1Integer(this.f207192k));
            aSN1EncodableVector2.add(new ASN1Integer(this.f207191j));
            aSN1EncodableVector2.add(new ASN1Integer(this.f207193l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i, int i2, int i3, int i4) {
        this.f207194m = i;
        this.f207192k = i2;
        this.f207191j = i3;
        this.f207193l = i4;
    }

    public DSTU4145BinaryField(int i, int i2) {
        this(i, i2, 0, 0);
    }
}
