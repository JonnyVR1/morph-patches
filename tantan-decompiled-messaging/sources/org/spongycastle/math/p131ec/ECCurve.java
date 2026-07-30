package org.spongycastle.math.p131ec;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import org.spongycastle.math.field.FiniteField;
import org.spongycastle.math.field.FiniteFields;
import org.spongycastle.math.p131ec.endo.ECEndomorphism;
import org.spongycastle.math.p131ec.endo.GLVEndomorphism;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.Integers;
import p149l.ig3;
import p149l.kg3;
import p149l.qkq0;
import p149l.x9g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ECCurve {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;

    /* JADX INFO: renamed from: a */
    protected ECFieldElement f206770a;

    /* JADX INFO: renamed from: b */
    protected ECFieldElement f206771b;
    protected BigInteger cofactor;
    protected FiniteField field;
    protected BigInteger order;
    protected int coord = 0;
    protected ECEndomorphism endomorphism = null;
    protected ECMultiplier multiplier = null;

    public static abstract class AbstractF2m extends ECCurve {

        /* JADX INFO: renamed from: si */
        private BigInteger[] f206772si;

        public AbstractF2m(int i, int i2, int i3, int i4) {
            super(buildField(i, i2, i3, i4));
            this.f206772si = null;
        }

        private static FiniteField buildField(int i, int i2, int i3, int i4) {
            if (i2 == 0) {
                ig3.m135964a("k1 must be > 0");
                return null;
            }
            if (i3 == 0) {
                if (i4 == 0) {
                    return FiniteFields.getBinaryExtensionField(new int[]{0, i2, i});
                }
                ig3.m135964a("k3 must be 0 if k2 == 0");
                return null;
            }
            if (i3 <= i2) {
                ig3.m135964a("k2 must be > k1");
                return null;
            }
            if (i4 > i3) {
                return FiniteFields.getBinaryExtensionField(new int[]{0, i2, i3, i4, i});
            }
            ig3.m135964a("k3 must be > k2");
            return null;
        }

        public static BigInteger inverse(int i, int[] iArr, BigInteger bigInteger) {
            return new LongArray(bigInteger).modInverse(i, iArr).toBigInteger();
        }

        private ECFieldElement solveQuadraticEquation(ECFieldElement eCFieldElement) {
            ECFieldElement eCFieldElementAdd;
            if (eCFieldElement.isZero()) {
                return eCFieldElement;
            }
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(ECConstants.ZERO);
            int fieldSize = getFieldSize();
            Random random = new Random();
            do {
                ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(new BigInteger(fieldSize, random));
                ECFieldElement eCFieldElementAdd2 = eCFieldElement;
                eCFieldElementAdd = eCFieldElementFromBigInteger;
                for (int i = 1; i < fieldSize; i++) {
                    ECFieldElement eCFieldElementSquare = eCFieldElementAdd2.square();
                    eCFieldElementAdd = eCFieldElementAdd.square().add(eCFieldElementSquare.multiply(eCFieldElementFromBigInteger2));
                    eCFieldElementAdd2 = eCFieldElementSquare.add(eCFieldElement);
                }
                if (!eCFieldElementAdd2.isZero()) {
                    return null;
                }
            } while (eCFieldElementAdd.square().add(eCFieldElementAdd).isZero());
            return eCFieldElementAdd;
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (!eCFieldElementFromBigInteger.isZero()) {
                    eCFieldElementFromBigInteger2 = eCFieldElementFromBigInteger2.divide(eCFieldElementFromBigInteger).add(eCFieldElementFromBigInteger);
                } else if (!eCFieldElementFromBigInteger2.square().equals(getB())) {
                    x9g0.m207497a();
                    return null;
                }
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementFromBigInteger2, z);
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint decompressPoint(int i, BigInteger bigInteger) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            if (eCFieldElementFromBigInteger.isZero()) {
                eCFieldElementAdd = getB().sqrt();
            } else {
                ECFieldElement eCFieldElementSolveQuadraticEquation = solveQuadraticEquation(eCFieldElementFromBigInteger.square().invert().multiply(getB()).add(getA()).add(eCFieldElementFromBigInteger));
                if (eCFieldElementSolveQuadraticEquation != null) {
                    if (eCFieldElementSolveQuadraticEquation.testBitZero() != (i == 1)) {
                        eCFieldElementSolveQuadraticEquation = eCFieldElementSolveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    eCFieldElementAdd = (coordinateSystem == 5 || coordinateSystem == 6) ? eCFieldElementSolveQuadraticEquation.add(eCFieldElementFromBigInteger) : eCFieldElementSolveQuadraticEquation.multiply(eCFieldElementFromBigInteger);
                } else {
                    eCFieldElementAdd = null;
                }
            }
            if (eCFieldElementAdd != null) {
                return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementAdd, true);
            }
            ig3.m135964a("Invalid point compression");
            return null;
        }

        public synchronized BigInteger[] getSi() {
            try {
                if (this.f206772si == null) {
                    this.f206772si = Tnaf.getSi(this);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f206772si;
        }

        public boolean isKoblitz() {
            if (this.order == null || this.cofactor == null || !this.f206771b.isOne()) {
                return false;
            }
            return this.f206770a.isZero() || this.f206770a.isOne();
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }
    }

    public static abstract class AbstractFp extends ECCurve {
        public AbstractFp(BigInteger bigInteger) {
            super(FiniteFields.getPrimeField(bigInteger));
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint decompressPoint(int i, BigInteger bigInteger) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementSqrt = eCFieldElementFromBigInteger.square().add(this.f206770a).multiply(eCFieldElementFromBigInteger).add(this.f206771b).sqrt();
            if (eCFieldElementSqrt == null) {
                ig3.m135964a("Invalid point compression");
                return null;
            }
            if (eCFieldElementSqrt.testBitZero() != (i == 1)) {
                eCFieldElementSqrt = eCFieldElementSqrt.negate();
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementSqrt, true);
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getField().getCharacteristic()) < 0;
        }
    }

    public class Config {
        protected int coord;
        protected ECEndomorphism endomorphism;
        protected ECMultiplier multiplier;

        public Config(int i, ECEndomorphism eCEndomorphism, ECMultiplier eCMultiplier) {
            this.coord = i;
            this.endomorphism = eCEndomorphism;
            this.multiplier = eCMultiplier;
        }

        public ECCurve create() {
            if (!ECCurve.this.supportsCoordinateSystem(this.coord)) {
                qkq0.m175383a("unsupported coordinate system");
                return null;
            }
            ECCurve eCCurveCloneCurve = ECCurve.this.cloneCurve();
            if (eCCurveCloneCurve == ECCurve.this) {
                qkq0.m175383a("implementation returned current curve");
                return null;
            }
            synchronized (eCCurveCloneCurve) {
                eCCurveCloneCurve.coord = this.coord;
                eCCurveCloneCurve.endomorphism = this.endomorphism;
                eCCurveCloneCurve.multiplier = this.multiplier;
            }
            return eCCurveCloneCurve;
        }

        public Config setCoordinateSystem(int i) {
            this.coord = i;
            return this;
        }

        public Config setEndomorphism(ECEndomorphism eCEndomorphism) {
            this.endomorphism = eCEndomorphism;
            return this;
        }

        public Config setMultiplier(ECMultiplier eCMultiplier) {
            this.multiplier = eCMultiplier;
            return this;
        }
    }

    public ECCurve(FiniteField finiteField) {
        this.field = finiteField;
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    public void checkPoint(ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            ig3.m135964a("'point' must be non-null and on this curve");
        }
    }

    public void checkPoints(ECPoint[] eCPointArr, int i, int i2) {
        if (eCPointArr == null) {
            ig3.m135964a("'points' cannot be null");
            return;
        }
        if (i < 0 || i2 < 0 || i > eCPointArr.length - i2) {
            ig3.m135964a("invalid range specified for 'points'");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ECPoint eCPoint = eCPointArr[i + i3];
            if (eCPoint != null && this != eCPoint.getCurve()) {
                ig3.m135964a("'points' entries must be null or on this curve");
                return;
            }
        }
    }

    public abstract ECCurve cloneCurve();

    public synchronized Config configure() {
        return new Config(this.coord, this.endomorphism, this.multiplier);
    }

    public ECMultiplier createDefaultMultiplier() {
        ECEndomorphism eCEndomorphism = this.endomorphism;
        return eCEndomorphism instanceof GLVEndomorphism ? new GLVMultiplier(this, (GLVEndomorphism) eCEndomorphism) : new WNafL2RMultiplier();
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2), z);
    }

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z);

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z);

    public ECPoint decodePoint(byte[] bArr) {
        ECPoint infinity;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length != fieldSize + 1) {
                    ig3.m135964a("Incorrect length for compressed encoding");
                    return null;
                }
                infinity = decompressPoint(b & 1, BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize));
                if (!infinity.satisfiesCofactor()) {
                    ig3.m135964a("Invalid point");
                    return null;
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    kg3.m145878a("Invalid point encoding 0x", Integer.toString(b, 16));
                    return null;
                }
                if (bArr.length != (fieldSize * 2) + 1) {
                    ig3.m135964a("Incorrect length for hybrid encoding");
                    return null;
                }
                BigInteger bigIntegerFromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize);
                BigInteger bigIntegerFromUnsignedByteArray2 = BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize);
                if (bigIntegerFromUnsignedByteArray2.testBit(0) != (b == 7)) {
                    ig3.m135964a("Inconsistent Y coordinate in hybrid encoding");
                    return null;
                }
                infinity = validatePoint(bigIntegerFromUnsignedByteArray, bigIntegerFromUnsignedByteArray2);
            } else {
                if (bArr.length != (fieldSize * 2) + 1) {
                    ig3.m135964a("Incorrect length for uncompressed encoding");
                    return null;
                }
                infinity = validatePoint(BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize), BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize));
            }
        } else {
            if (bArr.length != 1) {
                ig3.m135964a("Incorrect length for infinity encoding");
                return null;
            }
            infinity = getInfinity();
        }
        if (b == 0 || !infinity.isInfinity()) {
            return infinity;
        }
        ig3.m135964a("Invalid infinity encoding");
        return null;
    }

    public abstract ECPoint decompressPoint(int i, BigInteger bigInteger);

    public boolean equals(ECCurve eCCurve) {
        if (this != eCCurve) {
            return eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger());
        }
        return true;
    }

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    public ECFieldElement getA() {
        return this.f206770a;
    }

    public ECFieldElement getB() {
        return this.f206771b;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }

    public FiniteField getField() {
        return this.field;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();

    public synchronized ECMultiplier getMultiplier() {
        try {
            if (this.multiplier == null) {
                this.multiplier = createDefaultMultiplier();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.multiplier;
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public PreCompInfo getPreCompInfo(ECPoint eCPoint, String str) {
        PreCompInfo preCompInfo;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            Hashtable hashtable = eCPoint.preCompTable;
            preCompInfo = hashtable == null ? null : (PreCompInfo) hashtable.get(str);
        }
        return preCompInfo;
    }

    public int hashCode() {
        return Integers.rotateLeft(getB().toBigInteger().hashCode(), 16) ^ (getField().hashCode() ^ Integers.rotateLeft(getA().toBigInteger().hashCode(), 8));
    }

    public ECPoint importPoint(ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        ECPoint eCPointNormalize = eCPoint.normalize();
        return validatePoint(eCPointNormalize.getXCoord().toBigInteger(), eCPointNormalize.getYCoord().toBigInteger(), eCPointNormalize.withCompression);
    }

    public abstract boolean isValidFieldElement(BigInteger bigInteger);

    public void normalizeAll(ECPoint[] eCPointArr, int i, int i2, ECFieldElement eCFieldElement) {
        checkPoints(eCPointArr, i, i2);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (eCFieldElement == null) {
                return;
            }
            ig3.m135964a("'iso' not valid for affine coordinates");
            return;
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            ECPoint eCPoint = eCPointArr[i5];
            if (eCPoint != null && (eCFieldElement != null || !eCPoint.isNormalized())) {
                eCFieldElementArr[i3] = eCPoint.getZCoord(0);
                iArr[i3] = i5;
                i3++;
            }
        }
        if (i3 == 0) {
            return;
        }
        ECAlgorithms.montgomeryTrick(eCFieldElementArr, 0, i3, eCFieldElement);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = iArr[i6];
            eCPointArr[i7] = eCPointArr[i7].normalize(eCFieldElementArr[i6]);
        }
    }

    public void setPreCompInfo(ECPoint eCPoint, String str, PreCompInfo preCompInfo) {
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            try {
                Hashtable hashtable = eCPoint.preCompTable;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    eCPoint.preCompTable = hashtable;
                }
                hashtable.put(str, preCompInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean supportsCoordinateSystem(int i) {
        return i == 0;
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2) {
        ECPoint eCPointCreatePoint = createPoint(bigInteger, bigInteger2);
        if (eCPointCreatePoint.isValid()) {
            return eCPointCreatePoint;
        }
        ig3.m135964a("Invalid point coordinates");
        return null;
    }

    public static class F2m extends AbstractF2m {
        private static final int F2M_DEFAULT_COORDS = 6;
        private ECPoint.F2m infinity;

        /* JADX INFO: renamed from: k1 */
        private int f206773k1;

        /* JADX INFO: renamed from: k2 */
        private int f206774k2;

        /* JADX INFO: renamed from: k3 */
        private int f206775k3;

        /* JADX INFO: renamed from: m */
        private int f206776m;

        public F2m(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.f206776m = i;
            this.f206773k1 = i2;
            this.f206774k2 = i3;
            this.f206775k3 = i4;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f206770a = fromBigInteger(bigInteger);
            this.f206771b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECCurve cloneCurve() {
            return new F2m(this.f206776m, this.f206773k1, this.f206774k2, this.f206775k3, this.f206770a, this.f206771b, this.order, this.cofactor);
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECMultiplier createDefaultMultiplier() {
            return isKoblitz() ? new WTauNafMultiplier() : super.createDefaultMultiplier();
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return new ECFieldElement.F2m(this.f206776m, this.f206773k1, this.f206774k2, this.f206775k3, bigInteger);
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public int getFieldSize() {
            return this.f206776m;
        }

        public BigInteger getH() {
            return this.cofactor;
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public int getK1() {
            return this.f206773k1;
        }

        public int getK2() {
            return this.f206774k2;
        }

        public int getK3() {
            return this.f206775k3;
        }

        public int getM() {
            return this.f206776m;
        }

        public BigInteger getN() {
            return this.order;
        }

        public boolean isTrinomial() {
            return this.f206774k2 == 0 && this.f206775k3 == 0;
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public boolean supportsCoordinateSystem(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, z);
        }

        public F2m(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        public F2m(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int i, int i2, int i3, int i4, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.f206776m = i;
            this.f206773k1 = i2;
            this.f206774k2 = i3;
            this.f206775k3 = i4;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f206770a = eCFieldElement;
            this.f206771b = eCFieldElement2;
            this.coord = 6;
        }
    }

    /* JADX INFO: renamed from: org.spongycastle.math.ec.ECCurve$Fp */
    public static class C22280Fp extends AbstractFp {
        private static final int FP_DEFAULT_COORDS = 4;
        ECPoint.C22282Fp infinity;

        /* JADX INFO: renamed from: q */
        BigInteger f206777q;

        /* JADX INFO: renamed from: r */
        BigInteger f206778r;

        public C22280Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f206777q = bigInteger;
            this.f206778r = ECFieldElement.C22281Fp.calculateResidue(bigInteger);
            this.infinity = new ECPoint.C22282Fp(this, null, null);
            this.f206770a = fromBigInteger(bigInteger2);
            this.f206771b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECCurve cloneCurve() {
            return new C22280Fp(this.f206777q, this.f206778r, this.f206770a, this.f206771b, this.order, this.cofactor);
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
            return new ECPoint.C22282Fp(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z);
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return new ECFieldElement.C22281Fp(this.f206777q, this.f206778r, bigInteger);
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public int getFieldSize() {
            return this.f206777q.bitLength();
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public BigInteger getQ() {
            return this.f206777q;
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint importPoint(ECPoint eCPoint) {
            int coordinateSystem;
            return (this == eCPoint.getCurve() || getCoordinateSystem() != 2 || eCPoint.isInfinity() || !((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(eCPoint) : new ECPoint.C22282Fp(this, fromBigInteger(eCPoint.f206785x.toBigInteger()), fromBigInteger(eCPoint.f206786y.toBigInteger()), new ECFieldElement[]{fromBigInteger(eCPoint.f206787zs[0].toBigInteger())}, eCPoint.withCompression);
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public boolean supportsCoordinateSystem(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        @Override // org.spongycastle.math.p131ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
            return new ECPoint.C22282Fp(this, eCFieldElement, eCFieldElement2, z);
        }

        public C22280Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public C22280Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(bigInteger, bigInteger2, eCFieldElement, eCFieldElement2, null, null);
        }

        public C22280Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f206777q = bigInteger;
            this.f206778r = bigInteger2;
            this.infinity = new ECPoint.C22282Fp(this, null, null);
            this.f206770a = eCFieldElement;
            this.f206771b = eCFieldElement2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createPoint(bigInteger, bigInteger2, false);
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        ECPoint eCPointCreatePoint = createPoint(bigInteger, bigInteger2, z);
        if (eCPointCreatePoint.isValid()) {
            return eCPointCreatePoint;
        }
        ig3.m135964a("Invalid point coordinates");
        return null;
    }

    public void checkPoints(ECPoint[] eCPointArr) {
        checkPoints(eCPointArr, 0, eCPointArr.length);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ECCurve) && equals((ECCurve) obj);
        }
        return true;
    }

    public void normalizeAll(ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }
}
