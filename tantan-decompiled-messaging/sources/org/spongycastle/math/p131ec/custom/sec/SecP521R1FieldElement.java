package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP521R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f206854Q = SecP521R1Curve.f206852q;

    /* JADX INFO: renamed from: x */
    protected int[] f206855x;

    public SecP521R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f206854Q) >= 0) {
            ig3.m135964a("x value invalid for SecP521R1FieldElement");
            throw null;
        }
        this.f206855x = SecP521R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.add(this.f206855x, ((SecP521R1FieldElement) eCFieldElement).f206855x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.addOne(this.f206855x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        Mod.invert(SecP521R1Field.f206853P, ((SecP521R1FieldElement) eCFieldElement).f206855x, iArrCreate);
        SecP521R1Field.multiply(iArrCreate, this.f206855x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP521R1FieldElement) {
            return Nat.m221226eq(17, this.f206855x, ((SecP521R1FieldElement) obj).f206855x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public String getFieldName() {
        return "SecP521R1Field";
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public int getFieldSize() {
        return f206854Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f206855x, 0, 17) ^ f206854Q.hashCode();
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat.create(17);
        Mod.invert(SecP521R1Field.f206853P, this.f206855x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isOne() {
        return Nat.isOne(17, this.f206855x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isZero() {
        return Nat.isZero(17, this.f206855x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.multiply(this.f206855x, ((SecP521R1FieldElement) eCFieldElement).f206855x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.negate(this.f206855x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f206855x;
        if (Nat.isZero(17, iArr) || Nat.isOne(17, iArr)) {
            return this;
        }
        int[] iArrCreate = Nat.create(17);
        int[] iArrCreate2 = Nat.create(17);
        SecP521R1Field.squareN(iArr, 519, iArrCreate);
        SecP521R1Field.square(iArrCreate, iArrCreate2);
        if (Nat.m221226eq(17, iArr, iArrCreate2)) {
            return new SecP521R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.square(this.f206855x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.subtract(this.f206855x, ((SecP521R1FieldElement) eCFieldElement).f206855x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean testBitZero() {
        return Nat.getBit(this.f206855x, 0) == 1;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat.toBigInteger(17, this.f206855x);
    }

    public SecP521R1FieldElement() {
        this.f206855x = Nat.create(17);
    }

    public SecP521R1FieldElement(int[] iArr) {
        this.f206855x = iArr;
    }
}
