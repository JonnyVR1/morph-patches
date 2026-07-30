package org.spongycastle.math.p131ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat224;
import org.spongycastle.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP224K1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected int[] f206829x;

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f206828Q = SecP224K1Curve.f206825q;
    private static final int[] PRECOMP_POW2 = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    public SecP224K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f206828Q) >= 0) {
            ig3.m135964a("x value invalid for SecP224K1FieldElement");
            throw null;
        }
        this.f206829x = SecP224K1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.add(this.f206829x, ((SecP224K1FieldElement) eCFieldElement).f206829x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.addOne(this.f206829x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224K1Field.f206826P, ((SecP224K1FieldElement) eCFieldElement).f206829x, iArrCreate);
        SecP224K1Field.multiply(iArrCreate, this.f206829x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP224K1FieldElement) {
            return Nat224.m221230eq(this.f206829x, ((SecP224K1FieldElement) obj).f206829x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public String getFieldName() {
        return "SecP224K1Field";
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public int getFieldSize() {
        return f206828Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f206829x, 0, 7) ^ f206828Q.hashCode();
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224K1Field.f206826P, this.f206829x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isOne() {
        return Nat224.isOne(this.f206829x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isZero() {
        return Nat224.isZero(this.f206829x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.multiply(this.f206829x, ((SecP224K1FieldElement) eCFieldElement).f206829x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.negate(this.f206829x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f206829x;
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
        if (Nat224.m221230eq(iArr, iArrCreate5)) {
            return new SecP224K1FieldElement(iArrCreate3);
        }
        SecP224K1Field.multiply(iArrCreate3, PRECOMP_POW2, iArrCreate3);
        SecP224K1Field.square(iArrCreate3, iArrCreate5);
        if (Nat224.m221230eq(iArr, iArrCreate5)) {
            return new SecP224K1FieldElement(iArrCreate3);
        }
        return null;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.square(this.f206829x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.subtract(this.f206829x, ((SecP224K1FieldElement) eCFieldElement).f206829x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean testBitZero() {
        return Nat224.getBit(this.f206829x, 0) == 1;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat224.toBigInteger(this.f206829x);
    }

    public SecP224K1FieldElement() {
        this.f206829x = Nat224.create();
    }

    public SecP224K1FieldElement(int[] iArr) {
        this.f206829x = iArr;
    }
}
