package org.spongycastle.pqc.asn1;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.util.Arrays;
import p149l.bub;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class ParSet extends ASN1Object {
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: h */
    private int[] f206884h;

    /* JADX INFO: renamed from: k */
    private int[] f206885k;

    /* JADX INFO: renamed from: t */
    private int f206886t;

    /* JADX INFO: renamed from: w */
    private int[] f206887w;

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            bub.m103905a("sie of seqOfParams = ", aSN1Sequence.size());
            throw null;
        }
        this.f206886t = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue());
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f206886t || aSN1Sequence3.size() != this.f206886t || aSN1Sequence4.size() != this.f206886t) {
            ig3.m135964a("invalid size of sequences");
            throw null;
        }
        this.f206884h = new int[aSN1Sequence2.size()];
        this.f206887w = new int[aSN1Sequence3.size()];
        this.f206885k = new int[aSN1Sequence4.size()];
        for (int i = 0; i < this.f206886t; i++) {
            this.f206884h[i] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence2.getObjectAt(i)).getValue());
            this.f206887w[i] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence3.getObjectAt(i)).getValue());
            this.f206885k[i] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence4.getObjectAt(i)).getValue());
        }
    }

    private static int checkBigIntegerInIntRangeAndPositive(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) <= 0 && bigInteger.compareTo(ZERO) > 0) {
            return bigInteger.intValue();
        }
        throw new IllegalArgumentException("BigInteger not in Range: " + bigInteger.toString());
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f206884h);
    }

    public int[] getK() {
        return Arrays.clone(this.f206885k);
    }

    public int getT() {
        return this.f206886t;
    }

    public int[] getW() {
        return Arrays.clone(this.f206887w);
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        int i = 0;
        while (true) {
            int[] iArr = this.f206884h;
            if (i >= iArr.length) {
                ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                aSN1EncodableVector4.add(new ASN1Integer(this.f206886t));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
                return new DERSequence(aSN1EncodableVector4);
            }
            aSN1EncodableVector.add(new ASN1Integer(iArr[i]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f206887w[i]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f206885k[i]));
            i++;
        }
    }

    public ParSet(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f206886t = i;
        this.f206884h = iArr;
        this.f206887w = iArr2;
        this.f206885k = iArr3;
    }
}
