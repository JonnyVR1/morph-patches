package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat192;
import org.spongycastle.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP192R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f206823Q = SecP192R1Curve.f206819q;

    /* JADX INFO: renamed from: x */
    protected int[] f206824x;

    public SecP192R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f206823Q) >= 0) {
            ig3.m135964a("x value invalid for SecP192R1FieldElement");
            throw null;
        }
        this.f206824x = SecP192R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.add(this.f206824x, ((SecP192R1FieldElement) eCFieldElement).f206824x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.addOne(this.f206824x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192R1Field.f206821P, ((SecP192R1FieldElement) eCFieldElement).f206824x, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, this.f206824x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192R1FieldElement) {
            return Nat192.m221229eq(this.f206824x, ((SecP192R1FieldElement) obj).f206824x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public String getFieldName() {
        return "SecP192R1Field";
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public int getFieldSize() {
        return f206823Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f206824x, 0, 6) ^ f206823Q.hashCode();
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192R1Field.f206821P, this.f206824x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f206824x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f206824x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.multiply(this.f206824x, ((SecP192R1FieldElement) eCFieldElement).f206824x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.negate(this.f206824x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f206824x;
        if (Nat192.isZero(iArr) || Nat192.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat192.create();
        int[] iArrCreate2 = Nat192.create();
        SecP192R1Field.square(iArr, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP192R1Field.squareN(iArrCreate, 2, iArrCreate2);
        SecP192R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP192R1Field.squareN(iArrCreate2, 4, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192R1Field.squareN(iArrCreate, 8, iArrCreate2);
        SecP192R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP192R1Field.squareN(iArrCreate2, 16, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192R1Field.squareN(iArrCreate, 32, iArrCreate2);
        SecP192R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP192R1Field.squareN(iArrCreate2, 64, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192R1Field.squareN(iArrCreate, 62, iArrCreate);
        SecP192R1Field.square(iArrCreate, iArrCreate2);
        if (Nat192.m221229eq(iArr, iArrCreate2)) {
            return new SecP192R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.square(this.f206824x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.subtract(this.f206824x, ((SecP192R1FieldElement) eCFieldElement).f206824x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f206824x, 0) == 1;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f206824x);
    }

    public SecP192R1FieldElement() {
        this.f206824x = Nat192.create();
    }

    public SecP192R1FieldElement(int[] iArr) {
        this.f206824x = iArr;
    }
}
