package org.spongycastle.math.p131ec;

import java.math.BigInteger;
import java.util.Random;
import org.spongycastle.math.raw.Mod;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import p149l.ig3;
import p149l.upk0;

/* JADX INFO: loaded from: classes3.dex */
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
    public static class C22281Fp extends ECFieldElement {

        /* JADX INFO: renamed from: q */
        BigInteger f206782q;

        /* JADX INFO: renamed from: r */
        BigInteger f206783r;

        /* JADX INFO: renamed from: x */
        BigInteger f206784x;

        public C22281Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                ig3.m135964a("x value invalid in Fp field element");
                throw null;
            }
            this.f206782q = bigInteger;
            this.f206783r = bigInteger2;
            this.f206784x = bigInteger3;
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

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new C22281Fp(this.f206782q, this.f206783r, modAdd(this.f206784x, eCFieldElement.toBigInteger()));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger bigIntegerAdd = this.f206784x.add(ECConstants.ONE);
            if (bigIntegerAdd.compareTo(this.f206782q) == 0) {
                bigIntegerAdd = ECConstants.ZERO;
            }
            return new C22281Fp(this.f206782q, this.f206783r, bigIntegerAdd);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new C22281Fp(this.f206782q, this.f206783r, modMult(this.f206784x, modInverse(eCFieldElement.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C22281Fp)) {
                return false;
            }
            C22281Fp c22281Fp = (C22281Fp) obj;
            return this.f206782q.equals(c22281Fp.f206782q) && this.f206784x.equals(c22281Fp.f206784x);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public String getFieldName() {
            return "Fp";
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public int getFieldSize() {
            return this.f206782q.bitLength();
        }

        public BigInteger getQ() {
            return this.f206782q;
        }

        public int hashCode() {
            return this.f206784x.hashCode() ^ this.f206782q.hashCode();
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement invert() {
            return new C22281Fp(this.f206782q, this.f206783r, modInverse(this.f206784x));
        }

        public BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            return bigIntegerAdd.compareTo(this.f206782q) >= 0 ? bigIntegerAdd.subtract(this.f206782q) : bigIntegerAdd;
        }

        public BigInteger modDouble(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.f206782q) >= 0 ? bigIntegerShiftLeft.subtract(this.f206782q) : bigIntegerShiftLeft;
        }

        public BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f206782q.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f206782q.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modInverse(BigInteger bigInteger) {
            int fieldSize = getFieldSize();
            int i = (fieldSize + 31) >> 5;
            int[] iArrFromBigInteger = Nat.fromBigInteger(fieldSize, this.f206782q);
            int[] iArrFromBigInteger2 = Nat.fromBigInteger(fieldSize, bigInteger);
            int[] iArrCreate = Nat.create(i);
            Mod.invert(iArrFromBigInteger, iArrFromBigInteger2, iArrCreate);
            return Nat.toBigInteger(i, iArrCreate);
        }

        public BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        public BigInteger modReduce(BigInteger bigInteger) {
            if (this.f206783r == null) {
                return bigInteger.mod(this.f206782q);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.f206782q.bitLength();
            boolean zEquals = this.f206783r.equals(ECConstants.ONE);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.f206783r);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.f206782q) >= 0) {
                bigInteger = bigInteger.subtract(this.f206782q);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.f206782q.subtract(bigInteger);
        }

        public BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.f206782q) : bigIntegerSubtract;
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new C22281Fp(this.f206782q, this.f206783r, modMult(this.f206784x, eCFieldElement.toBigInteger()));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f206784x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new C22281Fp(this.f206782q, this.f206783r, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f206784x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new C22281Fp(this.f206782q, this.f206783r, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement negate() {
            if (this.f206784x.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f206782q;
            return new C22281Fp(bigInteger, this.f206783r, bigInteger.subtract(this.f206784x));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement sqrt() {
            if (isZero() || isOne()) {
                return this;
            }
            if (!this.f206782q.testBit(0)) {
                upk0.m194883a("not done yet");
                return null;
            }
            boolean zTestBit = this.f206782q.testBit(1);
            BigInteger bigInteger = this.f206782q;
            if (zTestBit) {
                BigInteger bigIntegerAdd = bigInteger.shiftRight(2).add(ECConstants.ONE);
                BigInteger bigInteger2 = this.f206782q;
                return checkSqrt(new C22281Fp(bigInteger2, this.f206783r, this.f206784x.modPow(bigIntegerAdd, bigInteger2)));
            }
            if (bigInteger.testBit(2)) {
                BigInteger bigIntegerModPow = this.f206784x.modPow(this.f206782q.shiftRight(3), this.f206782q);
                BigInteger bigIntegerModMult = modMult(bigIntegerModPow, this.f206784x);
                boolean zEquals = modMult(bigIntegerModMult, bigIntegerModPow).equals(ECConstants.ONE);
                BigInteger bigInteger3 = this.f206782q;
                if (zEquals) {
                    return checkSqrt(new C22281Fp(bigInteger3, this.f206783r, bigIntegerModMult));
                }
                return checkSqrt(new C22281Fp(this.f206782q, this.f206783r, modMult(bigIntegerModMult, ECConstants.TWO.modPow(bigInteger3.shiftRight(2), this.f206782q))));
            }
            BigInteger bigIntegerShiftRight = this.f206782q.shiftRight(1);
            BigInteger bigIntegerModPow2 = this.f206784x.modPow(bigIntegerShiftRight, this.f206782q);
            BigInteger bigInteger4 = ECConstants.ONE;
            if (!bigIntegerModPow2.equals(bigInteger4)) {
                return null;
            }
            BigInteger bigInteger5 = this.f206784x;
            BigInteger bigIntegerModDouble = modDouble(modDouble(bigInteger5));
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(bigInteger4);
            BigInteger bigIntegerSubtract = this.f206782q.subtract(bigInteger4);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger6 = new BigInteger(this.f206782q.bitLength(), random);
                if (bigInteger6.compareTo(this.f206782q) < 0 && modReduce(bigInteger6.multiply(bigInteger6).subtract(bigIntegerModDouble)).modPow(bigIntegerShiftRight, this.f206782q).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrLucasSequence = lucasSequence(bigInteger6, bigInteger5, bigIntegerAdd2);
                    BigInteger bigInteger7 = bigIntegerArrLucasSequence[0];
                    BigInteger bigInteger8 = bigIntegerArrLucasSequence[1];
                    if (modMult(bigInteger8, bigInteger8).equals(bigIntegerModDouble)) {
                        return new C22281Fp(this.f206782q, this.f206783r, modHalfAbs(bigInteger8));
                    }
                    if (!bigInteger7.equals(ECConstants.ONE) && !bigInteger7.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f206782q;
            BigInteger bigInteger2 = this.f206783r;
            BigInteger bigInteger3 = this.f206784x;
            return new C22281Fp(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f206784x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new C22281Fp(this.f206782q, this.f206783r, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f206784x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new C22281Fp(this.f206782q, this.f206783r, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new C22281Fp(this.f206782q, this.f206783r, modSubtract(this.f206784x, eCFieldElement.toBigInteger()));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f206784x;
        }

        public C22281Fp(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, calculateResidue(bigInteger), bigInteger2);
        }
    }

    public static class F2m extends ECFieldElement {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;

        /* JADX INFO: renamed from: ks */
        private int[] f206779ks;

        /* JADX INFO: renamed from: m */
        private int f206780m;
        private int representation;

        /* JADX INFO: renamed from: x */
        private LongArray f206781x;

        public F2m(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                ig3.m135964a("x value invalid in F2m field element");
                throw null;
            }
            if (i3 == 0 && i4 == 0) {
                this.representation = 2;
                this.f206779ks = new int[]{i2};
            } else {
                if (i3 >= i4) {
                    ig3.m135964a("k2 must be smaller than k3");
                    throw null;
                }
                if (i3 <= 0) {
                    ig3.m135964a("k2 must be larger than 0");
                    throw null;
                }
                this.representation = 3;
                this.f206779ks = new int[]{i2, i3, i4};
            }
            this.f206780m = i;
            this.f206781x = new LongArray(bigInteger);
        }

        public static void checkFieldElements(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            if (!(eCFieldElement instanceof F2m) || !(eCFieldElement2 instanceof F2m)) {
                ig3.m135964a("Field elements are not both instances of ECFieldElement.F2m");
                return;
            }
            F2m f2m = (F2m) eCFieldElement;
            F2m f2m2 = (F2m) eCFieldElement2;
            if (f2m.representation != f2m2.representation) {
                ig3.m135964a("One of the F2m field elements has incorrect representation");
            } else {
                if (f2m.f206780m == f2m2.f206780m && Arrays.areEqual(f2m.f206779ks, f2m2.f206779ks)) {
                    return;
                }
                ig3.m135964a("Field elements are not elements of the same field F2m");
            }
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            LongArray longArray = (LongArray) this.f206781x.clone();
            longArray.addShiftedByWords(((F2m) eCFieldElement).f206781x, 0);
            return new F2m(this.f206780m, this.f206779ks, longArray);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement addOne() {
            return new F2m(this.f206780m, this.f206779ks, this.f206781x.addOne());
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public int bitLength() {
            return this.f206781x.degree();
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
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
            return this.f206780m == f2m.f206780m && this.representation == f2m.representation && Arrays.areEqual(this.f206779ks, f2m.f206779ks) && this.f206781x.equals(f2m.f206781x);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public String getFieldName() {
            return "F2m";
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public int getFieldSize() {
            return this.f206780m;
        }

        public int getK1() {
            return this.f206779ks[0];
        }

        public int getK2() {
            int[] iArr = this.f206779ks;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.f206779ks;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f206780m;
        }

        public int getRepresentation() {
            return this.representation;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f206779ks) ^ (this.f206781x.hashCode() ^ this.f206780m);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement invert() {
            int i = this.f206780m;
            int[] iArr = this.f206779ks;
            return new F2m(i, iArr, this.f206781x.modInverse(i, iArr));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public boolean isOne() {
            return this.f206781x.isOne();
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public boolean isZero() {
            return this.f206781x.isZero();
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i = this.f206780m;
            int[] iArr = this.f206779ks;
            return new F2m(i, iArr, this.f206781x.modMultiply(((F2m) eCFieldElement).f206781x, i, iArr));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            LongArray longArray = this.f206781x;
            LongArray longArray2 = ((F2m) eCFieldElement).f206781x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f206781x;
            LongArray longArray4 = ((F2m) eCFieldElement3).f206781x;
            LongArray longArrayMultiply = longArray.multiply(longArray2, this.f206780m, this.f206779ks);
            LongArray longArrayMultiply2 = longArray3.multiply(longArray4, this.f206780m, this.f206779ks);
            if (longArrayMultiply == longArray || longArrayMultiply == longArray2) {
                longArrayMultiply = (LongArray) longArrayMultiply.clone();
            }
            longArrayMultiply.addShiftedByWords(longArrayMultiply2, 0);
            longArrayMultiply.reduce(this.f206780m, this.f206779ks);
            return new F2m(this.f206780m, this.f206779ks, longArrayMultiply);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement sqrt() {
            return (this.f206781x.isZero() || this.f206781x.isOne()) ? this : squarePow(this.f206780m - 1);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement square() {
            int i = this.f206780m;
            int[] iArr = this.f206779ks;
            return new F2m(i, iArr, this.f206781x.modSquare(i, iArr));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            LongArray longArray = this.f206781x;
            LongArray longArray2 = ((F2m) eCFieldElement).f206781x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f206781x;
            LongArray longArraySquare = longArray.square(this.f206780m, this.f206779ks);
            LongArray longArrayMultiply = longArray2.multiply(longArray3, this.f206780m, this.f206779ks);
            if (longArraySquare == longArray) {
                longArraySquare = (LongArray) longArraySquare.clone();
            }
            longArraySquare.addShiftedByWords(longArrayMultiply, 0);
            longArraySquare.reduce(this.f206780m, this.f206779ks);
            return new F2m(this.f206780m, this.f206779ks, longArraySquare);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement squarePow(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.f206780m;
            int[] iArr = this.f206779ks;
            return new F2m(i2, iArr, this.f206781x.modSquareN(i, i2, iArr));
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public boolean testBitZero() {
            return this.f206781x.testBitZero();
        }

        @Override // org.spongycastle.math.p131ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f206781x.toBigInteger();
        }

        public F2m(int i, int i2, BigInteger bigInteger) {
            this(i, i2, 0, 0, bigInteger);
        }

        private F2m(int i, int[] iArr, LongArray longArray) {
            this.f206780m = i;
            this.representation = iArr.length == 1 ? 2 : 3;
            this.f206779ks = iArr;
            this.f206781x = longArray;
        }
    }
}
