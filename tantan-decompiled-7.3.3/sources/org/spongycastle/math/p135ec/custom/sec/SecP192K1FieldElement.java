package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat192;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP192K1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f207739Q = SecP192K1Curve.f207736q;

    /* JADX INFO: renamed from: x */
    protected int[] f207740x;

    public SecP192K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f207739Q) >= 0) {
            wg3.m206174a("x value invalid for SecP192K1FieldElement");
            throw null;
        }
        this.f207740x = SecP192K1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.add(this.f207740x, ((SecP192K1FieldElement) eCFieldElement).f207740x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.addOne(this.f207740x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192K1Field.f207737P, ((SecP192K1FieldElement) eCFieldElement).f207740x, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, this.f207740x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192K1FieldElement) {
            return Nat192.m222475eq(this.f207740x, ((SecP192K1FieldElement) obj).f207740x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecP192K1Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return f207739Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207740x, 0, 6) ^ f207739Q.hashCode();
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192K1Field.f207737P, this.f207740x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f207740x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f207740x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.multiply(this.f207740x, ((SecP192K1FieldElement) eCFieldElement).f207740x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.negate(this.f207740x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f207740x;
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
        if (Nat192.m222475eq(iArr, iArrCreate2)) {
            return new SecP192K1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.square(this.f207740x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.subtract(this.f207740x, ((SecP192K1FieldElement) eCFieldElement).f207740x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f207740x, 0) == 1;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f207740x);
    }

    public SecP192K1FieldElement() {
        this.f207740x = Nat192.create();
    }

    public SecP192K1FieldElement(int[] iArr) {
        this.f207740x = iArr;
    }
}
