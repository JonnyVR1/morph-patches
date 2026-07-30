package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat192;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP192R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f207745Q = SecP192R1Curve.f207741q;

    /* JADX INFO: renamed from: x */
    protected int[] f207746x;

    public SecP192R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f207745Q) >= 0) {
            wg3.m206174a("x value invalid for SecP192R1FieldElement");
            throw null;
        }
        this.f207746x = SecP192R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.add(this.f207746x, ((SecP192R1FieldElement) eCFieldElement).f207746x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.addOne(this.f207746x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192R1Field.f207743P, ((SecP192R1FieldElement) eCFieldElement).f207746x, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, this.f207746x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192R1FieldElement) {
            return Nat192.m222475eq(this.f207746x, ((SecP192R1FieldElement) obj).f207746x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecP192R1Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return f207745Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207746x, 0, 6) ^ f207745Q.hashCode();
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192R1Field.f207743P, this.f207746x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f207746x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f207746x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.multiply(this.f207746x, ((SecP192R1FieldElement) eCFieldElement).f207746x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.negate(this.f207746x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f207746x;
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
        if (Nat192.m222475eq(iArr, iArrCreate2)) {
            return new SecP192R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.square(this.f207746x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.subtract(this.f207746x, ((SecP192R1FieldElement) eCFieldElement).f207746x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f207746x, 0) == 1;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f207746x);
    }

    public SecP192R1FieldElement() {
        this.f207746x = Nat192.create();
    }

    public SecP192R1FieldElement(int[] iArr) {
        this.f207746x = iArr;
    }
}
