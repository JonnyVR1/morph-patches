package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat320;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecT283FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected long[] f207784x;

    public SecT283FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            wg3.m206174a("x value invalid for SecT283FieldElement");
            throw null;
        }
        this.f207784x = SecT283Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.add(this.f207784x, ((SecT283FieldElement) eCFieldElement).f207784x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.addOne(this.f207784x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT283FieldElement) {
            return Nat320.eq64(this.f207784x, ((SecT283FieldElement) obj).f207784x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecT283Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return 283;
    }

    public int getK1() {
        return 5;
    }

    public int getK2() {
        return 7;
    }

    public int getK3() {
        return 12;
    }

    public int getM() {
        return 283;
    }

    public int getRepresentation() {
        return 3;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207784x, 0, 5) ^ 2831275;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.invert(this.f207784x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat320.isOne64(this.f207784x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat320.isZero64(this.f207784x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.multiply(this.f207784x, ((SecT283FieldElement) eCFieldElement).f207784x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f207784x;
        long[] jArr2 = ((SecT283FieldElement) eCFieldElement).f207784x;
        long[] jArr3 = ((SecT283FieldElement) eCFieldElement2).f207784x;
        long[] jArr4 = ((SecT283FieldElement) eCFieldElement3).f207784x;
        long[] jArrCreate64 = Nat.create64(9);
        SecT283Field.multiplyAddToExt(jArr, jArr2, jArrCreate64);
        SecT283Field.multiplyAddToExt(jArr3, jArr4, jArrCreate64);
        long[] jArrCreate65 = Nat320.create64();
        SecT283Field.reduce(jArrCreate64, jArrCreate65);
        return new SecT283FieldElement(jArrCreate65);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.sqrt(this.f207784x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.square(this.f207784x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f207784x;
        long[] jArr2 = ((SecT283FieldElement) eCFieldElement).f207784x;
        long[] jArr3 = ((SecT283FieldElement) eCFieldElement2).f207784x;
        long[] jArrCreate64 = Nat.create64(9);
        SecT283Field.squareAddToExt(jArr, jArrCreate64);
        SecT283Field.multiplyAddToExt(jArr2, jArr3, jArrCreate64);
        long[] jArrCreate65 = Nat320.create64();
        SecT283Field.reduce(jArrCreate64, jArrCreate65);
        return new SecT283FieldElement(jArrCreate65);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement squarePow(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.squareN(this.f207784x, i, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f207784x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat320.toBigInteger64(this.f207784x);
    }

    public SecT283FieldElement() {
        this.f207784x = Nat320.create64();
    }

    public SecT283FieldElement(long[] jArr) {
        this.f207784x = jArr;
    }
}
