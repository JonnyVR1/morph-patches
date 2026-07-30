package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP521R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f207776Q = SecP521R1Curve.f207774q;

    /* JADX INFO: renamed from: x */
    protected int[] f207777x;

    public SecP521R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f207776Q) >= 0) {
            wg3.m206174a("x value invalid for SecP521R1FieldElement");
            throw null;
        }
        this.f207777x = SecP521R1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.add(this.f207777x, ((SecP521R1FieldElement) eCFieldElement).f207777x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.addOne(this.f207777x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        Mod.invert(SecP521R1Field.f207775P, ((SecP521R1FieldElement) eCFieldElement).f207777x, iArrCreate);
        SecP521R1Field.multiply(iArrCreate, this.f207777x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP521R1FieldElement) {
            return Nat.m222472eq(17, this.f207777x, ((SecP521R1FieldElement) obj).f207777x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecP521R1Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return f207776Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207777x, 0, 17) ^ f207776Q.hashCode();
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat.create(17);
        Mod.invert(SecP521R1Field.f207775P, this.f207777x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat.isOne(17, this.f207777x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat.isZero(17, this.f207777x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.multiply(this.f207777x, ((SecP521R1FieldElement) eCFieldElement).f207777x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.negate(this.f207777x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f207777x;
        if (Nat.isZero(17, iArr) || Nat.isOne(17, iArr)) {
            return this;
        }
        int[] iArrCreate = Nat.create(17);
        int[] iArrCreate2 = Nat.create(17);
        SecP521R1Field.squareN(iArr, 519, iArrCreate);
        SecP521R1Field.square(iArrCreate, iArrCreate2);
        if (Nat.m222472eq(17, iArr, iArrCreate2)) {
            return new SecP521R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.square(this.f207777x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat.create(17);
        SecP521R1Field.subtract(this.f207777x, ((SecP521R1FieldElement) eCFieldElement).f207777x, iArrCreate);
        return new SecP521R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return Nat.getBit(this.f207777x, 0) == 1;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat.toBigInteger(17, this.f207777x);
    }

    public SecP521R1FieldElement() {
        this.f207777x = Nat.create(17);
    }

    public SecP521R1FieldElement(int[] iArr) {
        this.f207777x = iArr;
    }
}
