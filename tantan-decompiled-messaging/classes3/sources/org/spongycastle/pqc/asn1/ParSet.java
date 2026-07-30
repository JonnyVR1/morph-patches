package org.spongycastle.pqc.asn1;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.util.Arrays;
import p003l.bub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ParSet extends ASN1Object {
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: h */
    private int[] f10509h;

    /* JADX INFO: renamed from: k */
    private int[] f10510k;

    /* JADX INFO: renamed from: t */
    private int f10511t;

    /* JADX INFO: renamed from: w */
    private int[] f10512w;

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            bub.m3170a("sie of seqOfParams = ", aSN1Sequence.size());
            throw null;
        }
        this.f10511t = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue());
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f10511t || aSN1Sequence3.size() != this.f10511t || aSN1Sequence4.size() != this.f10511t) {
            ig3.a("invalid size of sequences");
            throw null;
        }
        this.f10509h = new int[aSN1Sequence2.size()];
        this.f10512w = new int[aSN1Sequence3.size()];
        this.f10510k = new int[aSN1Sequence4.size()];
        for (int i = 0; i < this.f10511t; i++) {
            this.f10509h[i] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence2.getObjectAt(i)).getValue());
            this.f10512w[i] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence3.getObjectAt(i)).getValue());
            this.f10510k[i] = checkBigIntegerInIntRangeAndPositive(((ASN1Integer) aSN1Sequence4.getObjectAt(i)).getValue());
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
        return Arrays.clone(this.f10509h);
    }

    public int[] getK() {
        return Arrays.clone(this.f10510k);
    }

    public int getT() {
        return this.f10511t;
    }

    public int[] getW() {
        return Arrays.clone(this.f10512w);
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        int i = 0;
        while (true) {
            int[] iArr = this.f10509h;
            if (i >= iArr.length) {
                ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                aSN1EncodableVector4.add(new ASN1Integer(this.f10511t));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
                return new DERSequence(aSN1EncodableVector4);
            }
            aSN1EncodableVector.add(new ASN1Integer(iArr[i]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f10512w[i]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f10510k[i]));
            i++;
        }
    }

    public ParSet(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f10511t = i;
        this.f10509h = iArr;
        this.f10512w = iArr2;
        this.f10510k = iArr3;
    }
}
