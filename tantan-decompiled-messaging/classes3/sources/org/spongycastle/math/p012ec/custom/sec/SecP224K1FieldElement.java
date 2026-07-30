package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat224;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP224K1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected int[] f10454x;

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10453Q = SecP224K1Curve.f10450q;
    private static final int[] PRECOMP_POW2 = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    public SecP224K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10453Q) >= 0) {
            ig3.a("x value invalid for SecP224K1FieldElement");
            throw null;
        }
        this.f10454x = SecP224K1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.add(this.f10454x, ((SecP224K1FieldElement) eCFieldElement).f10454x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.addOne(this.f10454x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224K1Field.f10451P, ((SecP224K1FieldElement) eCFieldElement).f10454x, iArrCreate);
        SecP224K1Field.multiply(iArrCreate, this.f10454x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP224K1FieldElement) {
            return Nat224.m9687eq(this.f10454x, ((SecP224K1FieldElement) obj).f10454x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP224K1Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10453Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10454x, 0, 7) ^ f10453Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224K1Field.f10451P, this.f10454x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat224.isOne(this.f10454x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat224.isZero(this.f10454x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.multiply(this.f10454x, ((SecP224K1FieldElement) eCFieldElement).f10454x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.negate(this.f10454x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10454x;
        if (Nat224.isZero(iArr) || Nat224.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.square(iArr, iArrCreate);
        SecP224K1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP224K1Field.square(iArrCreate, iArrCreate);
        SecP224K1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat224.create();
        SecP224K1Field.square(iArrCreate, iArrCreate2);
        SecP224K1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat224.create();
        SecP224K1Field.squareN(iArrCreate2, 4, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        int[] iArrCreate4 = Nat224.create();
        SecP224K1Field.squareN(iArrCreate3, 3, iArrCreate4);
        SecP224K1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SecP224K1Field.squareN(iArrCreate4, 8, iArrCreate4);
        SecP224K1Field.multiply(iArrCreate4, iArrCreate3, iArrCreate4);
        SecP224K1Field.squareN(iArrCreate4, 4, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 19, iArrCreate2);
        SecP224K1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate2);
        int[] iArrCreate5 = Nat224.create();
        SecP224K1Field.squareN(iArrCreate2, 42, iArrCreate5);
        SecP224K1Field.multiply(iArrCreate5, iArrCreate2, iArrCreate5);
        SecP224K1Field.squareN(iArrCreate5, 23, iArrCreate2);
        SecP224K1Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        SecP224K1Field.squareN(iArrCreate2, 84, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate5, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 20, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate4, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 3, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArr, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArr, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 4, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        SecP224K1Field.square(iArrCreate3, iArrCreate3);
        SecP224K1Field.square(iArrCreate3, iArrCreate5);
        if (Nat224.m9687eq(iArr, iArrCreate5)) {
            return new SecP224K1FieldElement(iArrCreate3);
        }
        SecP224K1Field.multiply(iArrCreate3, PRECOMP_POW2, iArrCreate3);
        SecP224K1Field.square(iArrCreate3, iArrCreate5);
        if (Nat224.m9687eq(iArr, iArrCreate5)) {
            return new SecP224K1FieldElement(iArrCreate3);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.square(this.f10454x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.subtract(this.f10454x, ((SecP224K1FieldElement) eCFieldElement).f10454x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat224.getBit(this.f10454x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat224.toBigInteger(this.f10454x);
    }

    public SecP224K1FieldElement() {
        this.f10454x = Nat224.create();
    }

    public SecP224K1FieldElement(int[] iArr) {
        this.f10454x = iArr;
    }
}
