package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat256;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP256K1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10464Q = SecP256K1Curve.f10461q;

    /* JADX INFO: renamed from: x */
    protected int[] f10465x;

    public SecP256K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10464Q) >= 0) {
            ig3.a("x value invalid for SecP256K1FieldElement");
            throw null;
        }
        this.f10465x = SecP256K1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.add(this.f10465x, ((SecP256K1FieldElement) eCFieldElement).f10465x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.addOne(this.f10465x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256K1Field.f10462P, ((SecP256K1FieldElement) eCFieldElement).f10465x, iArrCreate);
        SecP256K1Field.multiply(iArrCreate, this.f10465x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256K1FieldElement) {
            return Nat256.m9688eq(this.f10465x, ((SecP256K1FieldElement) obj).f10465x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP256K1Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10464Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10465x, 0, 8) ^ f10464Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256K1Field.f10462P, this.f10465x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f10465x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f10465x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.multiply(this.f10465x, ((SecP256K1FieldElement) eCFieldElement).f10465x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.negate(this.f10465x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10465x;
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
        if (Nat256.m9688eq(iArr, iArrCreate)) {
            return new SecP256K1FieldElement(iArrCreate3);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.square(this.f10465x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256K1Field.subtract(this.f10465x, ((SecP256K1FieldElement) eCFieldElement).f10465x, iArrCreate);
        return new SecP256K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f10465x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f10465x);
    }

    public SecP256K1FieldElement() {
        this.f10465x = Nat256.create();
    }

    public SecP256K1FieldElement(int[] iArr) {
        this.f10465x = iArr;
    }
}
