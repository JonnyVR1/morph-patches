package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat160;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP160R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10432Q = SecP160R1Curve.f10428q;

    /* JADX INFO: renamed from: x */
    protected int[] f10433x;

    public SecP160R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10432Q) >= 0) {
            ig3.a("x value invalid for SecP160R1FieldElement");
            throw null;
        }
        this.f10433x = SecP160R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.add(this.f10433x, ((SecP160R1FieldElement) eCFieldElement).f10433x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.addOne(this.f10433x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        Mod.invert(SecP160R1Field.f10430P, ((SecP160R1FieldElement) eCFieldElement).f10433x, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, this.f10433x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R1FieldElement) {
            return Nat160.m9685eq(this.f10433x, ((SecP160R1FieldElement) obj).f10433x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP160R1Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10432Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10433x, 0, 5) ^ f10432Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat160.create();
        Mod.invert(SecP160R1Field.f10430P, this.f10433x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat160.isOne(this.f10433x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat160.isZero(this.f10433x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.multiply(this.f10433x, ((SecP160R1FieldElement) eCFieldElement).f10433x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.negate(this.f10433x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10433x;
        if (Nat160.isZero(iArr) || Nat160.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.square(iArr, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat160.create();
        SecP160R1Field.squareN(iArrCreate, 2, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 4, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP160R1Field.squareN(iArrCreate, 8, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 16, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP160R1Field.squareN(iArrCreate, 32, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 64, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP160R1Field.square(iArrCreate, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 29, iArrCreate2);
        SecP160R1Field.square(iArrCreate2, iArrCreate);
        if (Nat160.m9685eq(iArr, iArrCreate)) {
            return new SecP160R1FieldElement(iArrCreate2);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.square(this.f10433x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.subtract(this.f10433x, ((SecP160R1FieldElement) eCFieldElement).f10433x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat160.getBit(this.f10433x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.f10433x);
    }

    public SecP160R1FieldElement() {
        this.f10433x = Nat160.create();
    }

    public SecP160R1FieldElement(int[] iArr) {
        this.f10433x = iArr;
    }
}
