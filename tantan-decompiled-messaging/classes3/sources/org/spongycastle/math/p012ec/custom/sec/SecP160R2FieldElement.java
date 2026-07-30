package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat160;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP160R2FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10437Q = SecP160R2Curve.f10434q;

    /* JADX INFO: renamed from: x */
    protected int[] f10438x;

    public SecP160R2FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10437Q) >= 0) {
            ig3.a("x value invalid for SecP160R2FieldElement");
            throw null;
        }
        this.f10438x = SecP160R2Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.add(this.f10438x, ((SecP160R2FieldElement) eCFieldElement).f10438x, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.addOne(this.f10438x, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        Mod.invert(SecP160R2Field.f10435P, ((SecP160R2FieldElement) eCFieldElement).f10438x, iArrCreate);
        SecP160R2Field.multiply(iArrCreate, this.f10438x, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R2FieldElement) {
            return Nat160.m9685eq(this.f10438x, ((SecP160R2FieldElement) obj).f10438x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP160R2Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10437Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10438x, 0, 5) ^ f10437Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat160.create();
        Mod.invert(SecP160R2Field.f10435P, this.f10438x, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat160.isOne(this.f10438x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat160.isZero(this.f10438x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.multiply(this.f10438x, ((SecP160R2FieldElement) eCFieldElement).f10438x, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.negate(this.f10438x, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10438x;
        if (Nat160.isZero(iArr) || Nat160.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.square(iArr, iArrCreate);
        SecP160R2Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat160.create();
        SecP160R2Field.square(iArrCreate, iArrCreate2);
        SecP160R2Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat160.create();
        SecP160R2Field.square(iArrCreate2, iArrCreate3);
        SecP160R2Field.multiply(iArrCreate3, iArr, iArrCreate3);
        int[] iArrCreate4 = Nat160.create();
        SecP160R2Field.squareN(iArrCreate3, 3, iArrCreate4);
        SecP160R2Field.multiply(iArrCreate4, iArrCreate2, iArrCreate4);
        SecP160R2Field.squareN(iArrCreate4, 7, iArrCreate3);
        SecP160R2Field.multiply(iArrCreate3, iArrCreate4, iArrCreate3);
        SecP160R2Field.squareN(iArrCreate3, 3, iArrCreate4);
        SecP160R2Field.multiply(iArrCreate4, iArrCreate2, iArrCreate4);
        int[] iArrCreate5 = Nat160.create();
        SecP160R2Field.squareN(iArrCreate4, 14, iArrCreate5);
        SecP160R2Field.multiply(iArrCreate5, iArrCreate3, iArrCreate5);
        SecP160R2Field.squareN(iArrCreate5, 31, iArrCreate3);
        SecP160R2Field.multiply(iArrCreate3, iArrCreate5, iArrCreate3);
        SecP160R2Field.squareN(iArrCreate3, 62, iArrCreate5);
        SecP160R2Field.multiply(iArrCreate5, iArrCreate3, iArrCreate5);
        SecP160R2Field.squareN(iArrCreate5, 3, iArrCreate3);
        SecP160R2Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP160R2Field.squareN(iArrCreate3, 18, iArrCreate3);
        SecP160R2Field.multiply(iArrCreate3, iArrCreate4, iArrCreate3);
        SecP160R2Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP160R2Field.multiply(iArrCreate3, iArr, iArrCreate3);
        SecP160R2Field.squareN(iArrCreate3, 3, iArrCreate3);
        SecP160R2Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        SecP160R2Field.squareN(iArrCreate3, 6, iArrCreate3);
        SecP160R2Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP160R2Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP160R2Field.multiply(iArrCreate3, iArr, iArrCreate3);
        SecP160R2Field.square(iArrCreate3, iArrCreate);
        if (Nat160.m9685eq(iArr, iArrCreate)) {
            return new SecP160R2FieldElement(iArrCreate3);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.square(this.f10438x, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.subtract(this.f10438x, ((SecP160R2FieldElement) eCFieldElement).f10438x, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat160.getBit(this.f10438x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.f10438x);
    }

    public SecP160R2FieldElement() {
        this.f10438x = Nat160.create();
    }

    public SecP160R2FieldElement(int[] iArr) {
        this.f10438x = iArr;
    }
}
