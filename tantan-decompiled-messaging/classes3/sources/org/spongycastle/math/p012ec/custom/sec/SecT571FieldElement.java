package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Nat576;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecT571FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected long[] f10490x;

    public SecT571FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            ig3.a("x value invalid for SecT571FieldElement");
            throw null;
        }
        this.f10490x = SecT571Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat576.create64();
        SecT571Field.add(this.f10490x, ((SecT571FieldElement) eCFieldElement).f10490x, jArrCreate64);
        return new SecT571FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat576.create64();
        SecT571Field.addOne(this.f10490x, jArrCreate64);
        return new SecT571FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT571FieldElement) {
            return Nat576.eq64(this.f10490x, ((SecT571FieldElement) obj).f10490x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecT571Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return 571;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 5;
    }

    public int getK3() {
        return 10;
    }

    public int getM() {
        return 571;
    }

    public int getRepresentation() {
        return 3;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10490x, 0, 9) ^ 5711052;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat576.create64();
        SecT571Field.invert(this.f10490x, jArrCreate64);
        return new SecT571FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat576.isOne64(this.f10490x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat576.isZero64(this.f10490x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat576.create64();
        SecT571Field.multiply(this.f10490x, ((SecT571FieldElement) eCFieldElement).f10490x, jArrCreate64);
        return new SecT571FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f10490x;
        long[] jArr2 = ((SecT571FieldElement) eCFieldElement).f10490x;
        long[] jArr3 = ((SecT571FieldElement) eCFieldElement2).f10490x;
        long[] jArr4 = ((SecT571FieldElement) eCFieldElement3).f10490x;
        long[] jArrCreateExt64 = Nat576.createExt64();
        SecT571Field.multiplyAddToExt(jArr, jArr2, jArrCreateExt64);
        SecT571Field.multiplyAddToExt(jArr3, jArr4, jArrCreateExt64);
        long[] jArrCreate64 = Nat576.create64();
        SecT571Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT571FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat576.create64();
        SecT571Field.sqrt(this.f10490x, jArrCreate64);
        return new SecT571FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat576.create64();
        SecT571Field.square(this.f10490x, jArrCreate64);
        return new SecT571FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f10490x;
        long[] jArr2 = ((SecT571FieldElement) eCFieldElement).f10490x;
        long[] jArr3 = ((SecT571FieldElement) eCFieldElement2).f10490x;
        long[] jArrCreateExt64 = Nat576.createExt64();
        SecT571Field.squareAddToExt(jArr, jArrCreateExt64);
        SecT571Field.multiplyAddToExt(jArr2, jArr3, jArrCreateExt64);
        long[] jArrCreate64 = Nat576.create64();
        SecT571Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT571FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squarePow(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat576.create64();
        SecT571Field.squareN(this.f10490x, i, jArrCreate64);
        return new SecT571FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f10490x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat576.toBigInteger64(this.f10490x);
    }

    public SecT571FieldElement() {
        this.f10490x = Nat576.create64();
    }

    public SecT571FieldElement(long[] jArr) {
        this.f10490x = jArr;
    }
}
