package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat128;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP128R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10425Q = SecP128R1Curve.f10421q;

    /* JADX INFO: renamed from: x */
    protected int[] f10426x;

    public SecP128R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10425Q) >= 0) {
            ig3.a("x value invalid for SecP128R1FieldElement");
            throw null;
        }
        this.f10426x = SecP128R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat128.create();
        SecP128R1Field.add(this.f10426x, ((SecP128R1FieldElement) eCFieldElement).f10426x, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat128.create();
        SecP128R1Field.addOne(this.f10426x, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat128.create();
        Mod.invert(SecP128R1Field.f10423P, ((SecP128R1FieldElement) eCFieldElement).f10426x, iArrCreate);
        SecP128R1Field.multiply(iArrCreate, this.f10426x, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP128R1FieldElement) {
            return Nat128.m9684eq(this.f10426x, ((SecP128R1FieldElement) obj).f10426x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP128R1Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10425Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10426x, 0, 4) ^ f10425Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat128.create();
        Mod.invert(SecP128R1Field.f10423P, this.f10426x, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat128.isOne(this.f10426x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat128.isZero(this.f10426x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat128.create();
        SecP128R1Field.multiply(this.f10426x, ((SecP128R1FieldElement) eCFieldElement).f10426x, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat128.create();
        SecP128R1Field.negate(this.f10426x, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10426x;
        if (Nat128.isZero(iArr) || Nat128.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat128.create();
        SecP128R1Field.square(iArr, iArrCreate);
        SecP128R1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat128.create();
        SecP128R1Field.squareN(iArrCreate, 2, iArrCreate2);
        SecP128R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        int[] iArrCreate3 = Nat128.create();
        SecP128R1Field.squareN(iArrCreate2, 4, iArrCreate3);
        SecP128R1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP128R1Field.squareN(iArrCreate3, 2, iArrCreate2);
        SecP128R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP128R1Field.squareN(iArrCreate2, 10, iArrCreate);
        SecP128R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP128R1Field.squareN(iArrCreate, 10, iArrCreate3);
        SecP128R1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP128R1Field.square(iArrCreate3, iArrCreate2);
        SecP128R1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        SecP128R1Field.squareN(iArrCreate2, 95, iArrCreate2);
        SecP128R1Field.square(iArrCreate2, iArrCreate3);
        if (Nat128.m9684eq(iArr, iArrCreate3)) {
            return new SecP128R1FieldElement(iArrCreate2);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat128.create();
        SecP128R1Field.square(this.f10426x, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat128.create();
        SecP128R1Field.subtract(this.f10426x, ((SecP128R1FieldElement) eCFieldElement).f10426x, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat128.getBit(this.f10426x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat128.toBigInteger(this.f10426x);
    }

    public SecP128R1FieldElement() {
        this.f10426x = Nat128.create();
    }

    public SecP128R1FieldElement(int[] iArr) {
        this.f10426x = iArr;
    }
}
