package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat192;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP192R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10448Q = SecP192R1Curve.f10444q;

    /* JADX INFO: renamed from: x */
    protected int[] f10449x;

    public SecP192R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10448Q) >= 0) {
            ig3.a("x value invalid for SecP192R1FieldElement");
            throw null;
        }
        this.f10449x = SecP192R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.add(this.f10449x, ((SecP192R1FieldElement) eCFieldElement).f10449x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.addOne(this.f10449x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192R1Field.f10446P, ((SecP192R1FieldElement) eCFieldElement).f10449x, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, this.f10449x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192R1FieldElement) {
            return Nat192.m9686eq(this.f10449x, ((SecP192R1FieldElement) obj).f10449x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP192R1Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10448Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10449x, 0, 6) ^ f10448Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat192.create();
        Mod.invert(SecP192R1Field.f10446P, this.f10449x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f10449x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f10449x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.multiply(this.f10449x, ((SecP192R1FieldElement) eCFieldElement).f10449x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.negate(this.f10449x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10449x;
        if (Nat192.isZero(iArr) || Nat192.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat192.create();
        int[] iArrCreate2 = Nat192.create();
        SecP192R1Field.square(iArr, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP192R1Field.squareN(iArrCreate, 2, iArrCreate2);
        SecP192R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP192R1Field.squareN(iArrCreate2, 4, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192R1Field.squareN(iArrCreate, 8, iArrCreate2);
        SecP192R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP192R1Field.squareN(iArrCreate2, 16, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192R1Field.squareN(iArrCreate, 32, iArrCreate2);
        SecP192R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP192R1Field.squareN(iArrCreate2, 64, iArrCreate);
        SecP192R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192R1Field.squareN(iArrCreate, 62, iArrCreate);
        SecP192R1Field.square(iArrCreate, iArrCreate2);
        if (Nat192.m9686eq(iArr, iArrCreate2)) {
            return new SecP192R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.square(this.f10449x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192R1Field.subtract(this.f10449x, ((SecP192R1FieldElement) eCFieldElement).f10449x, iArrCreate);
        return new SecP192R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f10449x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f10449x);
    }

    public SecP192R1FieldElement() {
        this.f10449x = Nat192.create();
    }

    public SecP192R1FieldElement(int[] iArr) {
        this.f10449x = iArr;
    }
}
