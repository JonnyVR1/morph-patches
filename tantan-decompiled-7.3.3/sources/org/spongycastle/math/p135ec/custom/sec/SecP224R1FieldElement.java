package org.spongycastle.math.p135ec.custom.sec;

import java.math.BigInteger;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat224;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class SecP224R1FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f207756Q = SecP224R1Curve.f207752q;

    /* JADX INFO: renamed from: x */
    protected int[] f207757x;

    public SecP224R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f207756Q) >= 0) {
            wg3.m206174a("x value invalid for SecP224R1FieldElement");
            throw null;
        }
        this.f207757x = SecP224R1Field.fromBigInteger(bigInteger);
    }

    /* JADX INFO: renamed from: RM */
    private static void m222469RM(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        SecP224R1Field.multiply(iArr5, iArr3, iArr7);
        SecP224R1Field.multiply(iArr7, iArr, iArr7);
        SecP224R1Field.multiply(iArr4, iArr2, iArr6);
        SecP224R1Field.add(iArr6, iArr7, iArr6);
        SecP224R1Field.multiply(iArr4, iArr3, iArr7);
        Nat224.copy(iArr6, iArr4);
        SecP224R1Field.multiply(iArr5, iArr2, iArr5);
        SecP224R1Field.add(iArr5, iArr7, iArr5);
        SecP224R1Field.square(iArr5, iArr6);
        SecP224R1Field.multiply(iArr6, iArr, iArr6);
    }

    /* JADX INFO: renamed from: RP */
    private static void m222470RP(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        Nat224.copy(iArr, iArr4);
        int[] iArrCreate = Nat224.create();
        int[] iArrCreate2 = Nat224.create();
        for (int i = 0; i < 7; i++) {
            Nat224.copy(iArr2, iArrCreate);
            Nat224.copy(iArr3, iArrCreate2);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    m222471RS(iArr2, iArr3, iArr4, iArr5);
                }
            }
            m222469RM(iArr, iArrCreate, iArrCreate2, iArr2, iArr3, iArr4, iArr5);
        }
    }

    /* JADX INFO: renamed from: RS */
    private static void m222471RS(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        SecP224R1Field.multiply(iArr2, iArr, iArr2);
        SecP224R1Field.twice(iArr2, iArr2);
        SecP224R1Field.square(iArr, iArr4);
        SecP224R1Field.add(iArr3, iArr4, iArr);
        SecP224R1Field.multiply(iArr3, iArr4, iArr3);
        SecP224R1Field.reduce32(Nat.shiftUpBits(7, iArr3, 2, 0), iArr3);
    }

    private static boolean isSquare(int[] iArr) {
        int[] iArrCreate = Nat224.create();
        int[] iArrCreate2 = Nat224.create();
        Nat224.copy(iArr, iArrCreate);
        for (int i = 0; i < 7; i++) {
            Nat224.copy(iArrCreate, iArrCreate2);
            SecP224R1Field.squareN(iArrCreate, 1 << i, iArrCreate);
            SecP224R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        }
        SecP224R1Field.squareN(iArrCreate, 95, iArrCreate);
        return Nat224.isOne(iArrCreate);
    }

    private static boolean trySqrt(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat224.create();
        Nat224.copy(iArr2, iArrCreate);
        int[] iArrCreate2 = Nat224.create();
        iArrCreate2[0] = 1;
        int[] iArrCreate3 = Nat224.create();
        m222470RP(iArr, iArrCreate, iArrCreate2, iArrCreate3, iArr3);
        int[] iArrCreate4 = Nat224.create();
        int[] iArrCreate5 = Nat224.create();
        for (int i = 1; i < 96; i++) {
            Nat224.copy(iArrCreate, iArrCreate4);
            Nat224.copy(iArrCreate2, iArrCreate5);
            m222471RS(iArrCreate, iArrCreate2, iArrCreate3, iArr3);
            if (Nat224.isZero(iArrCreate)) {
                Mod.invert(SecP224R1Field.f207754P, iArrCreate5, iArr3);
                SecP224R1Field.multiply(iArr3, iArrCreate4, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.add(this.f207757x, ((SecP224R1FieldElement) eCFieldElement).f207757x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.addOne(this.f207757x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224R1Field.f207754P, ((SecP224R1FieldElement) eCFieldElement).f207757x, iArrCreate);
        SecP224R1Field.multiply(iArrCreate, this.f207757x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP224R1FieldElement) {
            return Nat224.m222476eq(this.f207757x, ((SecP224R1FieldElement) obj).f207757x);
        }
        return false;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public String getFieldName() {
        return "SecP224R1Field";
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public int getFieldSize() {
        return f207756Q.bitLength();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f207757x, 0, 7) ^ f207756Q.hashCode();
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224R1Field.f207754P, this.f207757x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isOne() {
        return Nat224.isOne(this.f207757x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean isZero() {
        return Nat224.isZero(this.f207757x);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.multiply(this.f207757x, ((SecP224R1FieldElement) eCFieldElement).f207757x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.negate(this.f207757x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f207757x;
        if (Nat224.isZero(iArr) || Nat224.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.negate(iArr, iArrCreate);
        int[] iArrRandom = Mod.random(SecP224R1Field.f207754P);
        int[] iArrCreate2 = Nat224.create();
        if (!isSquare(iArr)) {
            return null;
        }
        while (!trySqrt(iArrCreate, iArrRandom, iArrCreate2)) {
            SecP224R1Field.addOne(iArrRandom, iArrRandom);
        }
        SecP224R1Field.square(iArrCreate2, iArrRandom);
        if (Nat224.m222476eq(iArr, iArrRandom)) {
            return new SecP224R1FieldElement(iArrCreate2);
        }
        return null;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.square(this.f207757x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.subtract(this.f207757x, ((SecP224R1FieldElement) eCFieldElement).f207757x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public boolean testBitZero() {
        return Nat224.getBit(this.f207757x, 0) == 1;
    }

    @Override // org.spongycastle.math.p135ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat224.toBigInteger(this.f207757x);
    }

    public SecP224R1FieldElement() {
        this.f207757x = Nat224.create();
    }

    public SecP224R1FieldElement(int[] iArr) {
        this.f207757x = iArr;
    }
}
