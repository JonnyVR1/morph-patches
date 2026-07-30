package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat160;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP160R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f207729Q = SecP160R1Curve.f207725q;

    /* JADX INFO: renamed from: x */
    protected int[] f207730x;

    public SecP160R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f207729Q) >= 0) {
            wg3.m206174a("x value invalid for SecP160R1FieldElement");
            throw null;
        }
        this.f207730x = SecP160R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.add(this.f207730x, ((SecP160R1FieldElement) eCFieldElement).f207730x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.addOne(this.f207730x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        Mod.invert(SecP160R1Field.f207727P, ((SecP160R1FieldElement) eCFieldElement).f207730x, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, this.f207730x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R1FieldElement) {
            return Nat160.m222474eq(this.f207730x, ((SecP160R1FieldElement) obj).f207730x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecP160R1Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return f207729Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207730x, 0, 5) ^ f207729Q.hashCode();
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat160.create();
        Mod.invert(SecP160R1Field.f207727P, this.f207730x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat160.isOne(this.f207730x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat160.isZero(this.f207730x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.multiply(this.f207730x, ((SecP160R1FieldElement) eCFieldElement).f207730x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.negate(this.f207730x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f207730x;
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
        if (Nat160.m222474eq(iArr, iArrCreate)) {
            return new SecP160R1FieldElement(iArrCreate2);
        }
        return null;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.square(this.f207730x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.subtract(this.f207730x, ((SecP160R1FieldElement) eCFieldElement).f207730x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return Nat160.getBit(this.f207730x, 0) == 1;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.f207730x);
    }

    public SecP160R1FieldElement() {
        this.f207730x = Nat160.create();
    }

    public SecP160R1FieldElement(int[] iArr) {
        this.f207730x = iArr;
    }
}
