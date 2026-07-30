package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat192;
import org.spongycastle.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP192K1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f206817Q = SecP192K1Curve.f206814q;

    /* JADX INFO: renamed from: x */
    protected int[] f206818x;

    public SecP192K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f206817Q) >= 0) {
            ig3.m135964a("x value invalid for SecP192K1FieldElement");
            throw null;
        }
        this.f206818x = SecP192K1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.add(this.f206818x, ((SecP192K1FieldElement) eCFieldElement).f206818x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.addOne(this.f206818x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192K1Field.f206815P, ((SecP192K1FieldElement) eCFieldElement).f206818x, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, this.f206818x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192K1FieldElement) {
            return Nat192.m221229eq(this.f206818x, ((SecP192K1FieldElement) obj).f206818x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public String getFieldName() {
        return "SecP192K1Field";
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public int getFieldSize() {
        return f206817Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f206818x, 0, 6) ^ f206817Q.hashCode();
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192K1Field.f206815P, this.f206818x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f206818x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f206818x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.multiply(this.f206818x, ((SecP192K1FieldElement) eCFieldElement).f206818x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.negate(this.f206818x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f206818x;
        if (Nat192.isZero(iArr) || Nat192.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.square(iArr, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat192.create();
        SecP192K1Field.square(iArrCreate, iArrCreate2);
        SecP192K1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat192.create();
        SecP192K1Field.squareN(iArrCreate2, 3, iArrCreate3);
        SecP192K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP192K1Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP192K1Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        SecP192K1Field.squareN(iArrCreate3, 8, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate3, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 3, iArrCreate3);
        SecP192K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        int[] iArrCreate4 = Nat192.create();
        SecP192K1Field.squareN(iArrCreate3, 16, iArrCreate4);
        SecP192K1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SecP192K1Field.squareN(iArrCreate4, 35, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate4, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 70, iArrCreate4);
        SecP192K1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SecP192K1Field.squareN(iArrCreate4, 19, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate3, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 20, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate3, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 4, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 6, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192K1Field.square(iArrCreate, iArrCreate);
        SecP192K1Field.square(iArrCreate, iArrCreate2);
        if (Nat192.m221229eq(iArr, iArrCreate2)) {
            return new SecP192K1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.square(this.f206818x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.subtract(this.f206818x, ((SecP192K1FieldElement) eCFieldElement).f206818x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f206818x, 0) == 1;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f206818x);
    }

    public SecP192K1FieldElement() {
        this.f206818x = Nat192.create();
    }

    public SecP192K1FieldElement(int[] iArr) {
        this.f206818x = iArr;
    }
}
