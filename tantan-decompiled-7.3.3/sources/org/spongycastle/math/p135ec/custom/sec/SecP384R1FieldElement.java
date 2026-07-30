package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP384R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f207772Q = SecP384R1Curve.f207769q;

    /* JADX INFO: renamed from: x */
    protected int[] f207773x;

    public SecP384R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f207772Q) >= 0) {
            wg3.m206174a("x value invalid for SecP384R1FieldElement");
            throw null;
        }
        this.f207773x = SecP384R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.add(this.f207773x, ((SecP384R1FieldElement) eCFieldElement).f207773x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.addOne(this.f207773x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(12);
        Mod.invert(SecP384R1Field.f207771P, ((SecP384R1FieldElement) eCFieldElement).f207773x, iArrCreate);
        SecP384R1Field.multiply(iArrCreate, this.f207773x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP384R1FieldElement) {
            return Nat.m222472eq(12, this.f207773x, ((SecP384R1FieldElement) obj).f207773x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecP384R1Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return f207772Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207773x, 0, 12) ^ f207772Q.hashCode();
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat.create(12);
        Mod.invert(SecP384R1Field.f207771P, this.f207773x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat.isOne(12, this.f207773x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat.isZero(12, this.f207773x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.multiply(this.f207773x, ((SecP384R1FieldElement) eCFieldElement).f207773x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.negate(this.f207773x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f207773x;
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
        SecP384R1Field.squareN(iArrCreate3, 120, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 15, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 33, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 64, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        SecP384R1Field.squareN(iArrCreate2, 30, iArrCreate);
        SecP384R1Field.square(iArrCreate, iArrCreate2);
        if (Nat.m222472eq(12, iArr, iArrCreate2)) {
            return new SecP384R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.square(this.f207773x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.subtract(this.f207773x, ((SecP384R1FieldElement) eCFieldElement).f207773x, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return Nat.getBit(this.f207773x, 0) == 1;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat.toBigInteger(12, this.f207773x);
    }

    public SecP384R1FieldElement() {
        this.f207773x = Nat.create(12);
    }

    public SecP384R1FieldElement(int[] iArr) {
        this.f207773x = iArr;
    }
}
