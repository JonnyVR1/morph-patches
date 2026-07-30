package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat192;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP192K1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10442Q = SecP192K1Curve.f10439q;

    /* JADX INFO: renamed from: x */
    protected int[] f10443x;

    public SecP192K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10442Q) >= 0) {
            ig3.a("x value invalid for SecP192K1FieldElement");
            throw null;
        }
        this.f10443x = SecP192K1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.add(this.f10443x, ((SecP192K1FieldElement) eCFieldElement).f10443x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.addOne(this.f10443x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192K1Field.f10440P, ((SecP192K1FieldElement) eCFieldElement).f10443x, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, this.f10443x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192K1FieldElement) {
            return Nat192.m9686eq(this.f10443x, ((SecP192K1FieldElement) obj).f10443x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP192K1Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10442Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10443x, 0, 6) ^ f10442Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192K1Field.f10440P, this.f10443x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f10443x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f10443x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.multiply(this.f10443x, ((SecP192K1FieldElement) eCFieldElement).f10443x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.negate(this.f10443x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10443x;
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
        if (Nat192.m9686eq(iArr, iArrCreate2)) {
            return new SecP192K1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.square(this.f10443x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.subtract(this.f10443x, ((SecP192K1FieldElement) eCFieldElement).f10443x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f10443x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f10443x);
    }

    public SecP192K1FieldElement() {
        this.f10443x = Nat192.create();
    }

    public SecP192K1FieldElement(int[] iArr) {
        this.f10443x = iArr;
    }
}
