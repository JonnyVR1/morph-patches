package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat256;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP256R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f207767Q = SecP256R1Curve.f207763q;

    /* JADX INFO: renamed from: x */
    protected int[] f207768x;

    public SecP256R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f207767Q) >= 0) {
            wg3.m206174a("x value invalid for SecP256R1FieldElement");
            throw null;
        }
        this.f207768x = SecP256R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.add(this.f207768x, ((SecP256R1FieldElement) eCFieldElement).f207768x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.addOne(this.f207768x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256R1Field.f207765P, ((SecP256R1FieldElement) eCFieldElement).f207768x, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, this.f207768x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256R1FieldElement) {
            return Nat256.m222477eq(this.f207768x, ((SecP256R1FieldElement) obj).f207768x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecP256R1Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return f207767Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207768x, 0, 8) ^ f207767Q.hashCode();
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256R1Field.f207765P, this.f207768x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f207768x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f207768x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.multiply(this.f207768x, ((SecP256R1FieldElement) eCFieldElement).f207768x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.negate(this.f207768x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f207768x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        SecP256R1Field.square(iArr, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 2, iArrCreate2);
        SecP256R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP256R1Field.squareN(iArrCreate2, 4, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 8, iArrCreate2);
        SecP256R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP256R1Field.squareN(iArrCreate2, 16, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 32, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 96, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 94, iArrCreate);
        SecP256R1Field.square(iArrCreate, iArrCreate2);
        if (Nat256.m222477eq(iArr, iArrCreate2)) {
            return new SecP256R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.square(this.f207768x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.subtract(this.f207768x, ((SecP256R1FieldElement) eCFieldElement).f207768x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f207768x, 0) == 1;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f207768x);
    }

    public SecP256R1FieldElement() {
        this.f207768x = Nat256.create();
    }

    public SecP256R1FieldElement(int[] iArr) {
        this.f207768x = iArr;
    }
}
