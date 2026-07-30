package org.spongycastle.math.p012ec.custom.sec;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.math.p012ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SecP521R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f10479Q = SecP521R1Curve.f10477q;

    /* JADX INFO: renamed from: x */
    protected int[] f10480x;

    public SecP521R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f10479Q) >= 0) {
            ig3.a("x value invalid for SecP521R1FieldElement");
            throw null;
        }
        this.f10480x = SecP521R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.add(this.f10480x, ((SecP521R1FieldElement) eCFieldElement).f10480x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.addOne(this.f10480x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        Mod.invert(SecP521R1Field.f10478P, ((SecP521R1FieldElement) eCFieldElement).f10480x, iArrCreate);
        SecP521R1Field.multiply(iArrCreate, this.f10480x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP521R1FieldElement) {
            return Nat.m9683eq(17, this.f10480x, ((SecP521R1FieldElement) obj).f10480x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public String getFieldName() {
        return "SecP521R1Field";
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public int getFieldSize() {
        return f10479Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10480x, 0, 17) ^ f10479Q.hashCode();
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat.create(17);
        Mod.invert(SecP521R1Field.f10478P, this.f10480x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isOne() {
        return Nat.isOne(17, this.f10480x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean isZero() {
        return Nat.isZero(17, this.f10480x);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.multiply(this.f10480x, ((SecP521R1FieldElement) eCFieldElement).f10480x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.negate(this.f10480x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f10480x;
        if (Nat.isZero(17, iArr) || Nat.isOne(17, iArr)) {
            return this;
        }
        int[] iArrCreate = Nat.create(17);
        int[] iArrCreate2 = Nat.create(17);
        SecP521R1Field.squareN(iArr, 519, iArrCreate);
        SecP521R1Field.square(iArrCreate, iArrCreate2);
        if (Nat.m9683eq(17, iArr, iArrCreate2)) {
            return new SecP521R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.square(this.f10480x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.subtract(this.f10480x, ((SecP521R1FieldElement) eCFieldElement).f10480x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public boolean testBitZero() {
        return Nat.getBit(this.f10480x, 0) == 1;
    }

    @Override // org.spongycastle.math.p012ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat.toBigInteger(17, this.f10480x);
    }

    public SecP521R1FieldElement() {
        this.f10480x = Nat.create(17);
    }

    public SecP521R1FieldElement(int[] iArr) {
        this.f10480x = iArr;
    }
}
