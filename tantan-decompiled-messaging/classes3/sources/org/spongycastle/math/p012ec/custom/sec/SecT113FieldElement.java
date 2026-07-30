package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Nat128;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecT113FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected long[] f10481x;

    public SecT113FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            ig3.a("x value invalid for SecT113FieldElement");
            throw null;
        }
        this.f10481x = SecT113Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.add(this.f10481x, ((SecT113FieldElement) eCFieldElement).f10481x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.addOne(this.f10481x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT113FieldElement) {
            return Nat128.eq64(this.f10481x, ((SecT113FieldElement) obj).f10481x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecT113Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return 113;
    }

    public int getK1() {
        return 9;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 113;
    }

    public int getRepresentation() {
        return 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10481x, 0, 2) ^ 113009;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.invert(this.f10481x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat128.isOne64(this.f10481x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat128.isZero64(this.f10481x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.multiply(this.f10481x, ((SecT113FieldElement) eCFieldElement).f10481x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f10481x;
        long[] jArr2 = ((SecT113FieldElement) eCFieldElement).f10481x;
        long[] jArr3 = ((SecT113FieldElement) eCFieldElement2).f10481x;
        long[] jArr4 = ((SecT113FieldElement) eCFieldElement3).f10481x;
        long[] jArrCreateExt64 = Nat128.createExt64();
        SecT113Field.multiplyAddToExt(jArr, jArr2, jArrCreateExt64);
        SecT113Field.multiplyAddToExt(jArr3, jArr4, jArrCreateExt64);
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.sqrt(this.f10481x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.square(this.f10481x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f10481x;
        long[] jArr2 = ((SecT113FieldElement) eCFieldElement).f10481x;
        long[] jArr3 = ((SecT113FieldElement) eCFieldElement2).f10481x;
        long[] jArrCreateExt64 = Nat128.createExt64();
        SecT113Field.squareAddToExt(jArr, jArrCreateExt64);
        SecT113Field.multiplyAddToExt(jArr2, jArr3, jArrCreateExt64);
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement squarePow(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.squareN(this.f10481x, i, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f10481x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat128.toBigInteger64(this.f10481x);
    }

    public SecT113FieldElement() {
        this.f10481x = Nat128.create64();
    }

    public SecT113FieldElement(long[] jArr) {
        this.f10481x = jArr;
    }
}
