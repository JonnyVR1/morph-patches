package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Nat256;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecT193FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected long[] f207781x;

    public SecT193FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            wg3.m206174a("x value invalid for SecT193FieldElement");
            throw null;
        }
        this.f207781x = SecT193Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat256.create64();
        SecT193Field.add(this.f207781x, ((SecT193FieldElement) eCFieldElement).f207781x, jArrCreate64);
        return new SecT193FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat256.create64();
        SecT193Field.addOne(this.f207781x, jArrCreate64);
        return new SecT193FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT193FieldElement) {
            return Nat256.eq64(this.f207781x, ((SecT193FieldElement) obj).f207781x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecT193Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return 193;
    }

    public int getK1() {
        return 15;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 193;
    }

    public int getRepresentation() {
        return 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207781x, 0, 4) ^ 1930015;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat256.create64();
        SecT193Field.invert(this.f207781x, jArrCreate64);
        return new SecT193FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne64(this.f207781x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero64(this.f207781x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat256.create64();
        SecT193Field.multiply(this.f207781x, ((SecT193FieldElement) eCFieldElement).f207781x, jArrCreate64);
        return new SecT193FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f207781x;
        long[] jArr2 = ((SecT193FieldElement) eCFieldElement).f207781x;
        long[] jArr3 = ((SecT193FieldElement) eCFieldElement2).f207781x;
        long[] jArr4 = ((SecT193FieldElement) eCFieldElement3).f207781x;
        long[] jArrCreateExt64 = Nat256.createExt64();
        SecT193Field.multiplyAddToExt(jArr, jArr2, jArrCreateExt64);
        SecT193Field.multiplyAddToExt(jArr3, jArr4, jArrCreateExt64);
        long[] jArrCreate64 = Nat256.create64();
        SecT193Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT193FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat256.create64();
        SecT193Field.sqrt(this.f207781x, jArrCreate64);
        return new SecT193FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat256.create64();
        SecT193Field.square(this.f207781x, jArrCreate64);
        return new SecT193FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f207781x;
        long[] jArr2 = ((SecT193FieldElement) eCFieldElement).f207781x;
        long[] jArr3 = ((SecT193FieldElement) eCFieldElement2).f207781x;
        long[] jArrCreateExt64 = Nat256.createExt64();
        SecT193Field.squareAddToExt(jArr, jArrCreateExt64);
        SecT193Field.multiplyAddToExt(jArr2, jArr3, jArrCreateExt64);
        long[] jArrCreate64 = Nat256.create64();
        SecT193Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT193FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement squarePow(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat256.create64();
        SecT193Field.squareN(this.f207781x, i, jArrCreate64);
        return new SecT193FieldElement(jArrCreate64);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f207781x[0] & 1) != 0;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger64(this.f207781x);
    }

    public SecT193FieldElement() {
        this.f207781x = Nat256.create64();
    }

    public SecT193FieldElement(long[] jArr) {
        this.f207781x = jArr;
    }
}
