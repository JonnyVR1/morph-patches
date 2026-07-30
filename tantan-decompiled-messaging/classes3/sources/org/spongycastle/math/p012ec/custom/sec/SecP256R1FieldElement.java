package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat256;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP256R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10470Q = SecP256R1Curve.f10466q;

    /* JADX INFO: renamed from: x */
    protected int[] f10471x;

    public SecP256R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10470Q) >= 0) {
            ig3.a("x value invalid for SecP256R1FieldElement");
            throw null;
        }
        this.f10471x = SecP256R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.add(this.f10471x, ((SecP256R1FieldElement) eCFieldElement).f10471x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.addOne(this.f10471x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256R1Field.f10468P, ((SecP256R1FieldElement) eCFieldElement).f10471x, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, this.f10471x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256R1FieldElement) {
            return Nat256.m9688eq(this.f10471x, ((SecP256R1FieldElement) obj).f10471x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP256R1Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10470Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10471x, 0, 8) ^ f10470Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        Mod.invert(SecP256R1Field.f10468P, this.f10471x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f10471x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f10471x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.multiply(this.f10471x, ((SecP256R1FieldElement) eCFieldElement).f10471x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.negate(this.f10471x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10471x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        SecP256R1Field.square(iArr, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 2, iArrCreate2);
        SecP256R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP256R1Field.squareN(iArrCreate2, 4, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 8, iArrCreate2);
        SecP256R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP256R1Field.squareN(iArrCreate2, 16, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 32, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 96, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP256R1Field.squareN(iArrCreate, 94, iArrCreate);
        SecP256R1Field.square(iArrCreate, iArrCreate2);
        if (Nat256.m9688eq(iArr, iArrCreate2)) {
            return new SecP256R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.square(this.f10471x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.subtract(this.f10471x, ((SecP256R1FieldElement) eCFieldElement).f10471x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f10471x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f10471x);
    }

    public SecP256R1FieldElement() {
        this.f10471x = Nat256.create();
    }

    public SecP256R1FieldElement(int[] iArr) {
        this.f10471x = iArr;
    }
}
