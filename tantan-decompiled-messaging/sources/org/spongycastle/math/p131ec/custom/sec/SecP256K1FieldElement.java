package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat256;
import org.spongycastle.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP256K1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f206839Q = SecP256K1Curve.f206836q;

    /* JADX INFO: renamed from: x */
    protected int[] f206840x;

    public SecP256K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f206839Q) >= 0) {
            ig3.m135964a("x value invalid for SecP256K1FieldElement");
            throw null;
        }
        this.f206840x = SecP256K1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.add(this.f206840x, ((SecP256K1FieldElement) eCFieldElement).f206840x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.addOne(this.f206840x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256K1Field.f206837P, ((SecP256K1FieldElement) eCFieldElement).f206840x, iArrCreate);
        SecP256K1Field.multiply(iArrCreate, this.f206840x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256K1FieldElement) {
            return Nat256.m221231eq(this.f206840x, ((SecP256K1FieldElement) obj).f206840x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public String getFieldName() {
        return "SecP256K1Field";
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public int getFieldSize() {
        return f206839Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f206840x, 0, 8) ^ f206839Q.hashCode();
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256K1Field.f206837P, this.f206840x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f206840x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f206840x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.multiply(this.f206840x, ((SecP256K1FieldElement) eCFieldElement).f206840x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.negate(this.f206840x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f206840x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.square(iArr, iArrCreate);
        SecP256K1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat256.create();
        SecP256K1Field.square(iArrCreate, iArrCreate2);
        SecP256K1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat256.create();
        SecP256K1Field.squareN(iArrCreate2, 3, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 3, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        int[] iArrCreate4 = Nat256.create();
        SecP256K1Field.squareN(iArrCreate3, 11, iArrCreate4);
        SecP256K1Field.multiply(iArrCreate4, iArrCreate3, iArrCreate4);
        SecP256K1Field.squareN(iArrCreate4, 22, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate4, iArrCreate3);
        int[] iArrCreate5 = Nat256.create();
        SecP256K1Field.squareN(iArrCreate3, 44, iArrCreate5);
        SecP256K1Field.multiply(iArrCreate5, iArrCreate3, iArrCreate5);
        int[] iArrCreate6 = Nat256.create();
        SecP256K1Field.squareN(iArrCreate5, 88, iArrCreate6);
        SecP256K1Field.multiply(iArrCreate6, iArrCreate5, iArrCreate6);
        SecP256K1Field.squareN(iArrCreate6, 44, iArrCreate5);
        SecP256K1Field.multiply(iArrCreate5, iArrCreate3, iArrCreate5);
        SecP256K1Field.squareN(iArrCreate5, 3, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 23, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate4, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 6, iArrCreate3);
        SecP256K1Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        SecP256K1Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP256K1Field.square(iArrCreate3, iArrCreate);
        if (Nat256.m221231eq(iArr, iArrCreate)) {
            return new SecP256K1FieldElement(iArrCreate3);
        }
        return null;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.square(this.f206840x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.subtract(this.f206840x, ((SecP256K1FieldElement) eCFieldElement).f206840x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f206840x, 0) == 1;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f206840x);
    }

    public SecP256K1FieldElement() {
        this.f206840x = Nat256.create();
    }

    public SecP256K1FieldElement(int[] iArr) {
        this.f206840x = iArr;
    }
}
