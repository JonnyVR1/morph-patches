package org.spongycastle.math.p131ec.custom.djb;

import java.math.BigInteger;
import org.spongycastle.math.p131ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat256;
import org.spongycastle.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class Curve25519FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: x */
    protected int[] f206795x;

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f206794Q = Curve25519.f206790q;
    private static final int[] PRECOMP_POW2 = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    public Curve25519FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f206794Q) >= 0) {
            ig3.m135964a("x value invalid for Curve25519FieldElement");
            throw null;
        }
        this.f206795x = Curve25519Field.fromBigInteger(bigInteger);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.add(this.f206795x, ((Curve25519FieldElement) eCFieldElement).f206795x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.addOne(this.f206795x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Mod.invert(Curve25519Field.f206792P, ((Curve25519FieldElement) eCFieldElement).f206795x, iArrCreate);
        Curve25519Field.multiply(iArrCreate, this.f206795x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Curve25519FieldElement) {
            return Nat256.m221231eq(this.f206795x, ((Curve25519FieldElement) obj).f206795x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public String getFieldName() {
        return "Curve25519Field";
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public int getFieldSize() {
        return f206794Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f206795x, 0, 8) ^ f206794Q.hashCode();
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        Mod.invert(Curve25519Field.f206792P, this.f206795x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f206795x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f206795x);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.multiply(this.f206795x, ((Curve25519FieldElement) eCFieldElement).f206795x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.negate(this.f206795x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f206795x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat256.create();
        Curve25519Field.square(iArr, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArr, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat256.create();
        Curve25519Field.square(iArrCreate, iArrCreate2);
        Curve25519Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat256.create();
        Curve25519Field.squareN(iArrCreate2, 3, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 4, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        Curve25519Field.squareN(iArrCreate, 4, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 15, iArrCreate2);
        Curve25519Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        Curve25519Field.squareN(iArrCreate2, 30, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 60, iArrCreate2);
        Curve25519Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        Curve25519Field.squareN(iArrCreate2, 11, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 120, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate2);
        if (Nat256.m221231eq(iArr, iArrCreate2)) {
            return new Curve25519FieldElement(iArrCreate);
        }
        Curve25519Field.multiply(iArrCreate, PRECOMP_POW2, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate2);
        if (Nat256.m221231eq(iArr, iArrCreate2)) {
            return new Curve25519FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.square(this.f206795x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.subtract(this.f206795x, ((Curve25519FieldElement) eCFieldElement).f206795x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f206795x, 0) == 1;
    }

    @Override // org.spongycastle.math.p131ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f206795x);
    }

    public Curve25519FieldElement() {
        this.f206795x = Nat256.create();
    }

    public Curve25519FieldElement(int[] iArr) {
        this.f206795x = iArr;
    }
}
