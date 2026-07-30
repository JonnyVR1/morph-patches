package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat224;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP224K1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected int[] f207751x;

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f207750Q = SecP224K1Curve.f207747q;
    private static final int[] PRECOMP_POW2 = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    public SecP224K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f207750Q) >= 0) {
            wg3.m206174a("x value invalid for SecP224K1FieldElement");
            throw null;
        }
        this.f207751x = SecP224K1Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.add(this.f207751x, ((SecP224K1FieldElement) eCFieldElement).f207751x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.addOne(this.f207751x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224K1Field.f207748P, ((SecP224K1FieldElement) eCFieldElement).f207751x, iArrCreate);
        SecP224K1Field.multiply(iArrCreate, this.f207751x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP224K1FieldElement) {
            return Nat224.m222476eq(this.f207751x, ((SecP224K1FieldElement) obj).f207751x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecP224K1Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return f207750Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207751x, 0, 7) ^ f207750Q.hashCode();
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224K1Field.f207748P, this.f207751x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat224.isOne(this.f207751x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat224.isZero(this.f207751x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.multiply(this.f207751x, ((SecP224K1FieldElement) eCFieldElement).f207751x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.negate(this.f207751x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f207751x;
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
        if (Nat224.m222476eq(iArr, iArrCreate5)) {
            return new SecP224K1FieldElement(iArrCreate3);
        }
        SecP224K1Field.multiply(iArrCreate3, PRECOMP_POW2, iArrCreate3);
        SecP224K1Field.square(iArrCreate3, iArrCreate5);
        if (Nat224.m222476eq(iArr, iArrCreate5)) {
            return new SecP224K1FieldElement(iArrCreate3);
        }
        return null;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.square(this.f207751x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.subtract(this.f207751x, ((SecP224K1FieldElement) eCFieldElement).f207751x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return Nat224.getBit(this.f207751x, 0) == 1;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat224.toBigInteger(this.f207751x);
    }

    public SecP224K1FieldElement() {
        this.f207751x = Nat224.create();
    }

    public SecP224K1FieldElement(int[] iArr) {
        this.f207751x = iArr;
    }
}
