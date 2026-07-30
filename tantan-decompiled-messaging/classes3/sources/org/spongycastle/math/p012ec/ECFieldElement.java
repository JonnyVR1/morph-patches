package org.spongycastle.math.p012ec;

import java.math.BigInteger;
import java.util.Random;
import l.ig3;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import p003l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ECFieldElement implements ECConstants {
    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public byte[] getEncoded() {
        return BigIntegers.asUnsignedByteArray((getFieldSize() + 7) / 8, toBigInteger());
    }

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public boolean isOne() {
        return bitLength() == 1;
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract ECFieldElement multiply(ECFieldElement eCFieldElement);

    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).subtract(eCFieldElement2.multiply(eCFieldElement3));
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).add(eCFieldElement2.multiply(eCFieldElement3));
    }

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().subtract(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().add(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePow(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this = this.square();
        }
        return this;
    }

    public abstract ECFieldElement subtract(ECFieldElement eCFieldElement);

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }

    /* JADX INFO: renamed from: org.spongycastle.math.ec.ECFieldElement$Fp */
    public static class C1074Fp extends ECFieldElement {

        /* JADX INFO: renamed from: q */
        BigInteger f10407q;

        /* JADX INFO: renamed from: r */
        BigInteger f10408r;

        /* JADX INFO: renamed from: x */
        BigInteger f10409x;

        public C1074Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                ig3.a("x value invalid in Fp field element");
                throw null;
            }
            this.f10407q = bigInteger;
            this.f10408r = bigInteger2;
            this.f10409x = bigInteger3;
        }

        public static BigInteger calculateResidue(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return ECConstants.ONE.shiftLeft(iBitLength).subtract(bigInteger);
        }

        private ECFieldElement checkSqrt(ECFieldElement eCFieldElement) {
            if (eCFieldElement.square().equals(this)) {
                return eCFieldElement;
            }
            return null;
        }

        private BigInteger[] lucasSequence(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int iBitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigIntegerModMult = ECConstants.ONE;
            BigInteger bigIntegerModReduce = bigInteger;
            BigInteger bigIntegerModMult2 = bigIntegerModMult;
            BigInteger bigIntegerModReduce2 = ECConstants.TWO;
            BigInteger bigIntegerModMult3 = bigIntegerModMult2;
            for (int i = iBitLength - 1; i >= lowestSetBit + 1; i--) {
                bigIntegerModMult = modMult(bigIntegerModMult, bigIntegerModMult3);
                if (bigInteger3.testBit(i)) {
                    bigIntegerModMult3 = modMult(bigIntegerModMult, bigInteger2);
                    bigIntegerModMult2 = modMult(bigIntegerModMult2, bigIntegerModReduce);
                    bigIntegerModReduce2 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult)));
                    bigIntegerModReduce = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce).subtract(bigIntegerModMult3.shiftLeft(1)));
                } else {
                    BigInteger bigIntegerModReduce3 = modReduce(bigIntegerModMult2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult));
                    BigInteger bigIntegerModReduce4 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult)));
                    bigIntegerModReduce2 = modReduce(bigIntegerModReduce2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult.shiftLeft(1)));
                    bigIntegerModReduce = bigIntegerModReduce4;
                    bigIntegerModMult2 = bigIntegerModReduce3;
                    bigIntegerModMult3 = bigIntegerModMult;
                }
            }
            BigInteger bigIntegerModMult4 = modMult(bigIntegerModMult, bigIntegerModMult3);
            BigInteger bigIntegerModMult5 = modMult(bigIntegerModMult4, bigInteger2);
            BigInteger bigIntegerModReduce5 = modReduce(bigIntegerModMult2.multiply(bigIntegerModReduce2).subtract(bigIntegerModMult4));
            BigInteger bigIntegerModReduce6 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce2).subtract(bigInteger.multiply(bigIntegerModMult4)));
            BigInteger bigIntegerModMult6 = modMult(bigIntegerModMult4, bigIntegerModMult5);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                bigIntegerModReduce5 = modMult(bigIntegerModReduce5, bigIntegerModReduce6);
                bigIntegerModReduce6 = modReduce(bigIntegerModReduce6.multiply(bigIntegerModReduce6).subtract(bigIntegerModMult6.shiftLeft(1)));
                bigIntegerModMult6 = modMult(bigIntegerModMult6, bigIntegerModMult6);
            }
            return new BigInteger[]{bigIntegerModReduce5, bigIntegerModReduce6};
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new C1074Fp(this.f10407q, this.f10408r, modAdd(this.f10409x, eCFieldElement.toBigInteger()));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger bigIntegerAdd = this.f10409x.add(ECConstants.ONE);
            if (bigIntegerAdd.compareTo(this.f10407q) == 0) {
                bigIntegerAdd = ECConstants.ZERO;
            }
            return new C1074Fp(this.f10407q, this.f10408r, bigIntegerAdd);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new C1074Fp(this.f10407q, this.f10408r, modMult(this.f10409x, modInverse(eCFieldElement.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1074Fp)) {
                return false;
            }
            C1074Fp c1074Fp = (C1074Fp) obj;
            return this.f10407q.equals(c1074Fp.f10407q) && this.f10409x.equals(c1074Fp.f10409x);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public String getFieldName() {
            return "Fp";
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public int getFieldSize() {
            return this.f10407q.bitLength();
        }

        public BigInteger getQ() {
            return this.f10407q;
        }

        public int hashCode() {
            return this.f10409x.hashCode() ^ this.f10407q.hashCode();
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement invert() {
            return new C1074Fp(this.f10407q, this.f10408r, modInverse(this.f10409x));
        }

        public BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            return bigIntegerAdd.compareTo(this.f10407q) >= 0 ? bigIntegerAdd.subtract(this.f10407q) : bigIntegerAdd;
        }

        public BigInteger modDouble(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.f10407q) >= 0 ? bigIntegerShiftLeft.subtract(this.f10407q) : bigIntegerShiftLeft;
        }

        public BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f10407q.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f10407q.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modInverse(BigInteger bigInteger) {
            int fieldSize = getFieldSize();
            int i = (fieldSize + 31) >> 5;
            int[] iArrFromBigInteger = Nat.fromBigInteger(fieldSize, this.f10407q);
            int[] iArrFromBigInteger2 = Nat.fromBigInteger(fieldSize, bigInteger);
            int[] iArrCreate = Nat.create(i);
            Mod.invert(iArrFromBigInteger, iArrFromBigInteger2, iArrCreate);
            return Nat.toBigInteger(i, iArrCreate);
        }

        public BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        public BigInteger modReduce(BigInteger bigInteger) {
            if (this.f10408r == null) {
                return bigInteger.mod(this.f10407q);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.f10407q.bitLength();
            boolean zEquals = this.f10408r.equals(ECConstants.ONE);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.f10408r);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.f10407q) >= 0) {
                bigInteger = bigInteger.subtract(this.f10407q);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.f10407q.subtract(bigInteger);
        }

        public BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.f10407q) : bigIntegerSubtract;
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new C1074Fp(this.f10407q, this.f10408r, modMult(this.f10409x, eCFieldElement.toBigInteger()));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f10409x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new C1074Fp(this.f10407q, this.f10408r, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f10409x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new C1074Fp(this.f10407q, this.f10408r, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement negate() {
            if (this.f10409x.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f10407q;
            return new C1074Fp(bigInteger, this.f10408r, bigInteger.subtract(this.f10409x));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement sqrt() {
            if (isZero() || isOne()) {
                return this;
            }
            if (!this.f10407q.testBit(0)) {
                upk0.m8197a("not done yet");
                return null;
            }
            boolean zTestBit = this.f10407q.testBit(1);
            BigInteger bigInteger = this.f10407q;
            if (zTestBit) {
                BigInteger bigIntegerAdd = bigInteger.shiftRight(2).add(ECConstants.ONE);
                BigInteger bigInteger2 = this.f10407q;
                return checkSqrt(new C1074Fp(bigInteger2, this.f10408r, this.f10409x.modPow(bigIntegerAdd, bigInteger2)));
            }
            if (bigInteger.testBit(2)) {
                BigInteger bigIntegerModPow = this.f10409x.modPow(this.f10407q.shiftRight(3), this.f10407q);
                BigInteger bigIntegerModMult = modMult(bigIntegerModPow, this.f10409x);
                boolean zEquals = modMult(bigIntegerModMult, bigIntegerModPow).equals(ECConstants.ONE);
                BigInteger bigInteger3 = this.f10407q;
                if (zEquals) {
                    return checkSqrt(new C1074Fp(bigInteger3, this.f10408r, bigIntegerModMult));
                }
                return checkSqrt(new C1074Fp(this.f10407q, this.f10408r, modMult(bigIntegerModMult, ECConstants.TWO.modPow(bigInteger3.shiftRight(2), this.f10407q))));
            }
            BigInteger bigIntegerShiftRight = this.f10407q.shiftRight(1);
            BigInteger bigIntegerModPow2 = this.f10409x.modPow(bigIntegerShiftRight, this.f10407q);
            BigInteger bigInteger4 = ECConstants.ONE;
            if (!bigIntegerModPow2.equals(bigInteger4)) {
                return null;
            }
            BigInteger bigInteger5 = this.f10409x;
            BigInteger bigIntegerModDouble = modDouble(modDouble(bigInteger5));
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(bigInteger4);
            BigInteger bigIntegerSubtract = this.f10407q.subtract(bigInteger4);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger6 = new BigInteger(this.f10407q.bitLength(), random);
                if (bigInteger6.compareTo(this.f10407q) < 0 && modReduce(bigInteger6.multiply(bigInteger6).subtract(bigIntegerModDouble)).modPow(bigIntegerShiftRight, this.f10407q).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrLucasSequence = lucasSequence(bigInteger6, bigInteger5, bigIntegerAdd2);
                    BigInteger bigInteger7 = bigIntegerArrLucasSequence[0];
                    BigInteger bigInteger8 = bigIntegerArrLucasSequence[1];
                    if (modMult(bigInteger8, bigInteger8).equals(bigIntegerModDouble)) {
                        return new C1074Fp(this.f10407q, this.f10408r, modHalfAbs(bigInteger8));
                    }
                    if (!bigInteger7.equals(ECConstants.ONE) && !bigInteger7.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f10407q;
            BigInteger bigInteger2 = this.f10408r;
            BigInteger bigInteger3 = this.f10409x;
            return new C1074Fp(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f10409x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new C1074Fp(this.f10407q, this.f10408r, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f10409x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new C1074Fp(this.f10407q, this.f10408r, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new C1074Fp(this.f10407q, this.f10408r, modSubtract(this.f10409x, eCFieldElement.toBigInteger()));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f10409x;
        }

        public C1074Fp(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, calculateResidue(bigInteger), bigInteger2);
        }
    }

    public static class F2m extends ECFieldElement {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;

        /* JADX INFO: renamed from: ks */
        private int[] f10404ks;

        /* JADX INFO: renamed from: m */
        private int f10405m;
        private int representation;

        /* JADX INFO: renamed from: x */
        private LongArray f10406x;

        public F2m(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                ig3.a("x value invalid in F2m field element");
                throw null;
            }
            if (i3 == 0 && i4 == 0) {
                this.representation = 2;
                this.f10404ks = new int[]{i2};
            } else {
                if (i3 >= i4) {
                    ig3.a("k2 must be smaller than k3");
                    throw null;
                }
                if (i3 <= 0) {
                    ig3.a("k2 must be larger than 0");
                    throw null;
                }
                this.representation = 3;
                this.f10404ks = new int[]{i2, i3, i4};
            }
            this.f10405m = i;
            this.f10406x = new LongArray(bigInteger);
        }

        public static void checkFieldElements(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            if (!(eCFieldElement instanceof F2m) || !(eCFieldElement2 instanceof F2m)) {
                ig3.a("Field elements are not both instances of ECFieldElement.F2m");
                return;
            }
            F2m f2m = (F2m) eCFieldElement;
            F2m f2m2 = (F2m) eCFieldElement2;
            if (f2m.representation != f2m2.representation) {
                ig3.a("One of the F2m field elements has incorrect representation");
            } else {
                if (f2m.f10405m == f2m2.f10405m && Arrays.areEqual(f2m.f10404ks, f2m2.f10404ks)) {
                    return;
                }
                ig3.a("Field elements are not elements of the same field F2m");
            }
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            LongArray longArray = (LongArray) this.f10406x.clone();
            longArray.addShiftedByWords(((F2m) eCFieldElement).f10406x, 0);
            return new F2m(this.f10405m, this.f10404ks, longArray);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement addOne() {
            return new F2m(this.f10405m, this.f10404ks, this.f10406x.addOne());
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public int bitLength() {
            return this.f10406x.degree();
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return multiply(eCFieldElement.invert());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof F2m)) {
                return false;
            }
            F2m f2m = (F2m) obj;
            return this.f10405m == f2m.f10405m && this.representation == f2m.representation && Arrays.areEqual(this.f10404ks, f2m.f10404ks) && this.f10406x.equals(f2m.f10406x);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public String getFieldName() {
            return "F2m";
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public int getFieldSize() {
            return this.f10405m;
        }

        public int getK1() {
            return this.f10404ks[0];
        }

        public int getK2() {
            int[] iArr = this.f10404ks;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.f10404ks;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f10405m;
        }

        public int getRepresentation() {
            return this.representation;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f10404ks) ^ (this.f10406x.hashCode() ^ this.f10405m);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement invert() {
            int i = this.f10405m;
            int[] iArr = this.f10404ks;
            return new F2m(i, iArr, this.f10406x.modInverse(i, iArr));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public boolean isOne() {
            return this.f10406x.isOne();
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public boolean isZero() {
            return this.f10406x.isZero();
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i = this.f10405m;
            int[] iArr = this.f10404ks;
            return new F2m(i, iArr, this.f10406x.modMultiply(((F2m) eCFieldElement).f10406x, i, iArr));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            LongArray longArray = this.f10406x;
            LongArray longArray2 = ((F2m) eCFieldElement).f10406x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f10406x;
            LongArray longArray4 = ((F2m) eCFieldElement3).f10406x;
            LongArray longArrayMultiply = longArray.multiply(longArray2, this.f10405m, this.f10404ks);
            LongArray longArrayMultiply2 = longArray3.multiply(longArray4, this.f10405m, this.f10404ks);
            if (longArrayMultiply == longArray || longArrayMultiply == longArray2) {
                longArrayMultiply = (LongArray) longArrayMultiply.clone();
            }
            longArrayMultiply.addShiftedByWords(longArrayMultiply2, 0);
            longArrayMultiply.reduce(this.f10405m, this.f10404ks);
            return new F2m(this.f10405m, this.f10404ks, longArrayMultiply);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement sqrt() {
            return (this.f10406x.isZero() || this.f10406x.isOne()) ? this : squarePow(this.f10405m - 1);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement square() {
            int i = this.f10405m;
            int[] iArr = this.f10404ks;
            return new F2m(i, iArr, this.f10406x.modSquare(i, iArr));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            LongArray longArray = this.f10406x;
            LongArray longArray2 = ((F2m) eCFieldElement).f10406x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f10406x;
            LongArray longArraySquare = longArray.square(this.f10405m, this.f10404ks);
            LongArray longArrayMultiply = longArray2.multiply(longArray3, this.f10405m, this.f10404ks);
            if (longArraySquare == longArray) {
                longArraySquare = (LongArray) longArraySquare.clone();
            }
            longArraySquare.addShiftedByWords(longArrayMultiply, 0);
            longArraySquare.reduce(this.f10405m, this.f10404ks);
            return new F2m(this.f10405m, this.f10404ks, longArraySquare);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement squarePow(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.f10405m;
            int[] iArr = this.f10404ks;
            return new F2m(i2, iArr, this.f10406x.modSquareN(i, i2, iArr));
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public boolean testBitZero() {
            return this.f10406x.testBitZero();
        }

        @Override // org.spongycastle.math.p012ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f10406x.toBigInteger();
        }

        public F2m(int i, int i2, BigInteger bigInteger) {
            this(i, i2, 0, 0, bigInteger);
        }

        private F2m(int i, int[] iArr, LongArray longArray) {
            this.f10405m = i;
            this.representation = iArr.length == 1 ? 2 : 3;
            this.f10404ks = iArr;
            this.f10406x = longArray;
        }
    }
}
