package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP384R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10475Q = SecP384R1Curve.f10472q;

    /* JADX INFO: renamed from: x */
    protected int[] f10476x;

    public SecP384R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10475Q) >= 0) {
            ig3.a("x value invalid for SecP384R1FieldElement");
            throw null;
        }
        this.f10476x = SecP384R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.add(this.f10476x, ((SecP384R1FieldElement) eCFieldElement).f10476x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.addOne(this.f10476x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(12);
        Mod.invert(SecP384R1Field.f10474P, ((SecP384R1FieldElement) eCFieldElement).f10476x, iArrCreate);
        SecP384R1Field.multiply(iArrCreate, this.f10476x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP384R1FieldElement) {
            return Nat.m9683eq(12, this.f10476x, ((SecP384R1FieldElement) obj).f10476x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP384R1Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10475Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10476x, 0, 12) ^ f10475Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat.create(12);
        Mod.invert(SecP384R1Field.f10474P, this.f10476x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat.isOne(12, this.f10476x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat.isZero(12, this.f10476x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.multiply(this.f10476x, ((SecP384R1FieldElement) eCFieldElement).f10476x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.negate(this.f10476x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10476x;
        if (Nat.isZero(12, iArr) || Nat.isOne(12, iArr)) {
            return this;
        }
        int[] iArrCreate = Nat.create(12);
        int[] iArrCreate2 = Nat.create(12);
        int[] iArrCreate3 = Nat.create(12);
        int[] iArrCreate4 = Nat.create(12);
        SecP384R1Field.square(iArr, iArrCreate);
        SecP384R1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP384R1Field.squareN(iArrCreate, 2, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP384R1Field.square(iArrCreate2, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 5, iArrCreate3);
        SecP384R1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP384R1Field.squareN(iArrCreate3, 5, iArrCreate4);
        SecP384R1Field.multiply(iArrCreate4, iArrCreate2, iArrCreate4);
        SecP384R1Field.squareN(iArrCreate4, 15, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 2, iArrCreate3);
        SecP384R1Field.multiply(iArrCreate, iArrCreate3, iArrCreate);
        SecP384R1Field.squareN(iArrCreate3, 28, iArrCreate3);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 60, iArrCreate3);
        SecP384R1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP384R1Field.squareN(iArrCreate3, EACTags.COMPATIBLE_TAG_ALLOCATION_AUTHORITY, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 15, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 33, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 64, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 30, iArrCreate);
        SecP384R1Field.square(iArrCreate, iArrCreate2);
        if (Nat.m9683eq(12, iArr, iArrCreate2)) {
            return new SecP384R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.square(this.f10476x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.subtract(this.f10476x, ((SecP384R1FieldElement) eCFieldElement).f10476x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat.getBit(this.f10476x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat.toBigInteger(12, this.f10476x);
    }

    public SecP384R1FieldElement() {
        this.f10476x = Nat.create(12);
    }

    public SecP384R1FieldElement(int[] iArr) {
        this.f10476x = iArr;
    }
}
