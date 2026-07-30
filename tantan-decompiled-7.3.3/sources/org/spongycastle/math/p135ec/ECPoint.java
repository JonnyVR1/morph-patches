package org.spongycastle.math.p135ec;

import java.math.BigInteger;
import java.util.Hashtable;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ECPoint {
    protected static ECFieldElement[] EMPTY_ZS = new ECFieldElement[0];
    protected ECCurve curve;
    protected Hashtable preCompTable;
    protected boolean withCompression;

    /* JADX INFO: renamed from: x */
    protected ECFieldElement f207707x;

    /* JADX INFO: renamed from: y */
    protected ECFieldElement f207708y;

    /* JADX INFO: renamed from: zs */
    protected ECFieldElement[] f207709zs;

    public ECPoint(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        this.preCompTable = null;
        this.curve = eCCurve;
        this.f207707x = eCFieldElement;
        this.f207708y = eCFieldElement2;
        this.f207709zs = eCFieldElementArr;
    }

    public static ECFieldElement[] getInitialZCoords(ECCurve eCCurve) {
        int coordinateSystem = eCCurve == null ? 0 : eCCurve.getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            return EMPTY_ZS;
        }
        ECFieldElement eCFieldElementFromBigInteger = eCCurve.fromBigInteger(ECConstants.ONE);
        if (coordinateSystem != 1 && coordinateSystem != 2) {
            if (coordinateSystem == 3) {
                return new ECFieldElement[]{eCFieldElementFromBigInteger, eCFieldElementFromBigInteger, eCFieldElementFromBigInteger};
            }
            if (coordinateSystem == 4) {
                return new ECFieldElement[]{eCFieldElementFromBigInteger, eCCurve.getA()};
            }
            if (coordinateSystem != 6) {
                wg3.m206174a("unknown coordinate system");
                return null;
            }
        }
        return new ECFieldElement[]{eCFieldElementFromBigInteger};
    }

    public abstract ECPoint add(ECPoint eCPoint);

    public void checkNormalized() {
        if (isNormalized()) {
            return;
        }
        wtq0.m207906a("point not in normal form");
    }

    public ECPoint createScaledPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return getCurve().createRawPoint(getRawXCoord().multiply(eCFieldElement), getRawYCoord().multiply(eCFieldElement2), this.withCompression);
    }

    public abstract ECPoint detach();

    public boolean equals(ECPoint eCPoint) {
        if (eCPoint == null) {
            return false;
        }
        ECCurve curve = getCurve();
        ECCurve curve2 = eCPoint.getCurve();
        boolean z = curve == null;
        boolean z2 = curve2 == null;
        boolean zIsInfinity = isInfinity();
        boolean zIsInfinity2 = eCPoint.isInfinity();
        if (zIsInfinity || zIsInfinity2) {
            return zIsInfinity && zIsInfinity2 && (z || z2 || curve.equals(curve2));
        }
        if (!z || !z2) {
            if (z) {
                eCPoint = eCPoint.normalize();
            } else if (z2) {
                this = normalize();
            } else {
                if (!curve.equals(curve2)) {
                    return false;
                }
                ECPoint[] eCPointArr = {this, curve.importPoint(eCPoint)};
                curve.normalizeAll(eCPointArr);
                ECPoint eCPoint2 = eCPointArr[0];
                eCPoint = eCPointArr[1];
                this = eCPoint2;
            }
        }
        return this.getXCoord().equals(eCPoint.getXCoord()) && this.getYCoord().equals(eCPoint.getYCoord());
    }

    public ECFieldElement getAffineXCoord() {
        checkNormalized();
        return getXCoord();
    }

    public ECFieldElement getAffineYCoord() {
        checkNormalized();
        return getYCoord();
    }

    public abstract boolean getCompressionYTilde();

    public ECCurve getCurve() {
        return this.curve;
    }

    public int getCurveCoordinateSystem() {
        ECCurve eCCurve = this.curve;
        if (eCCurve == null) {
            return 0;
        }
        return eCCurve.getCoordinateSystem();
    }

    public final ECPoint getDetachedPoint() {
        return normalize().detach();
    }

    public byte[] getEncoded(boolean z) {
        if (isInfinity()) {
            return new byte[1];
        }
        ECPoint eCPointNormalize = normalize();
        byte[] encoded = eCPointNormalize.getXCoord().getEncoded();
        if (z) {
            byte[] bArr = new byte[encoded.length + 1];
            bArr[0] = (byte) (eCPointNormalize.getCompressionYTilde() ? 3 : 2);
            System.arraycopy(encoded, 0, bArr, 1, encoded.length);
            return bArr;
        }
        byte[] encoded2 = eCPointNormalize.getYCoord().getEncoded();
        byte[] bArr2 = new byte[encoded.length + encoded2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(encoded, 0, bArr2, 1, encoded.length);
        System.arraycopy(encoded2, 0, bArr2, encoded.length + 1, encoded2.length);
        return bArr2;
    }

    public final ECFieldElement getRawXCoord() {
        return this.f207707x;
    }

    public final ECFieldElement getRawYCoord() {
        return this.f207708y;
    }

    public final ECFieldElement[] getRawZCoords() {
        return this.f207709zs;
    }

    public ECFieldElement getX() {
        return normalize().getXCoord();
    }

    public ECFieldElement getXCoord() {
        return this.f207707x;
    }

    public ECFieldElement getY() {
        return normalize().getYCoord();
    }

    public ECFieldElement getYCoord() {
        return this.f207708y;
    }

    public ECFieldElement getZCoord(int i) {
        if (i < 0) {
            return null;
        }
        ECFieldElement[] eCFieldElementArr = this.f207709zs;
        if (i >= eCFieldElementArr.length) {
            return null;
        }
        return eCFieldElementArr[i];
    }

    public ECFieldElement[] getZCoords() {
        ECFieldElement[] eCFieldElementArr = this.f207709zs;
        int length = eCFieldElementArr.length;
        if (length == 0) {
            return EMPTY_ZS;
        }
        ECFieldElement[] eCFieldElementArr2 = new ECFieldElement[length];
        System.arraycopy(eCFieldElementArr, 0, eCFieldElementArr2, 0, length);
        return eCFieldElementArr2;
    }

    public int hashCode() {
        ECCurve curve = getCurve();
        int i = curve == null ? 0 : ~curve.hashCode();
        if (isInfinity()) {
            return i;
        }
        ECPoint eCPointNormalize = normalize();
        return (eCPointNormalize.getYCoord().hashCode() * 257) ^ (i ^ (eCPointNormalize.getXCoord().hashCode() * 17));
    }

    public boolean isCompressed() {
        return this.withCompression;
    }

    public boolean isInfinity() {
        if (this.f207707x == null || this.f207708y == null) {
            return true;
        }
        ECFieldElement[] eCFieldElementArr = this.f207709zs;
        return eCFieldElementArr.length > 0 && eCFieldElementArr[0].isZero();
    }

    public boolean isNormalized() {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        return curveCoordinateSystem == 0 || curveCoordinateSystem == 5 || isInfinity() || this.f207709zs[0].isOne();
    }

    public boolean isValid() {
        return isInfinity() || getCurve() == null || (satisfiesCurveEquation() && satisfiesCofactor());
    }

    public ECPoint multiply(BigInteger bigInteger) {
        return getCurve().getMultiplier().multiply(this, bigInteger);
    }

    public abstract ECPoint negate();

    public ECPoint normalize(ECFieldElement eCFieldElement) {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        if (curveCoordinateSystem != 1) {
            if (curveCoordinateSystem == 2 || curveCoordinateSystem == 3 || curveCoordinateSystem == 4) {
                ECFieldElement eCFieldElementSquare = eCFieldElement.square();
                return createScaledPoint(eCFieldElementSquare, eCFieldElementSquare.multiply(eCFieldElement));
            }
            if (curveCoordinateSystem != 6) {
                wtq0.m207906a("not a projective coordinate system");
                return null;
            }
        }
        return createScaledPoint(eCFieldElement, eCFieldElement);
    }

    public boolean satisfiesCofactor() {
        BigInteger cofactor = this.curve.getCofactor();
        return cofactor == null || cofactor.equals(ECConstants.ONE) || !ECAlgorithms.referenceMultiply(this, cofactor).isInfinity();
    }

    public abstract boolean satisfiesCurveEquation();

    public ECPoint scaleX(ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord().multiply(eCFieldElement), getRawYCoord(), getRawZCoords(), this.withCompression);
    }

    public ECPoint scaleY(ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord(), getRawYCoord().multiply(eCFieldElement), getRawZCoords(), this.withCompression);
    }

    public abstract ECPoint subtract(ECPoint eCPoint);

    public ECPoint threeTimes() {
        return twicePlus(this);
    }

    public ECPoint timesPow2(int i) {
        if (i < 0) {
            wg3.m206174a("'e' cannot be negative");
            return null;
        }
        while (true) {
            i--;
            if (i < 0) {
                return this;
            }
            this = this.twice();
        }
    }

    public String toString() {
        if (isInfinity()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(getRawXCoord());
        stringBuffer.append(',');
        stringBuffer.append(getRawYCoord());
        for (int i = 0; i < this.f207709zs.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.f207709zs[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public abstract ECPoint twice();

    public ECPoint twicePlus(ECPoint eCPoint) {
        return twice().add(eCPoint);
    }

    public static abstract class AbstractF2m extends ECPoint {
        public AbstractF2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public boolean satisfiesCurveEquation() {
            ECFieldElement eCFieldElementMultiplyPlusProduct;
            ECFieldElement eCFieldElementSquarePlusProduct;
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.f207707x;
            ECFieldElement a = curve.getA();
            ECFieldElement b = curve.getB();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 6) {
                ECFieldElement eCFieldElement2 = this.f207708y;
                ECFieldElement eCFieldElementMultiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement2);
                if (coordinateSystem != 0) {
                    if (coordinateSystem != 1) {
                        wtq0.m207906a("unsupported coordinate system");
                        return false;
                    }
                    ECFieldElement eCFieldElement3 = this.f207709zs[0];
                    if (!eCFieldElement3.isOne()) {
                        ECFieldElement eCFieldElementMultiply2 = eCFieldElement3.multiply(eCFieldElement3.square());
                        eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElement3);
                        a = a.multiply(eCFieldElement3);
                        b = b.multiply(eCFieldElementMultiply2);
                    }
                }
                return eCFieldElementMultiply.equals(eCFieldElement.add(a).multiply(eCFieldElement.square()).add(b));
            }
            ECFieldElement eCFieldElement4 = this.f207709zs[0];
            boolean zIsOne = eCFieldElement4.isOne();
            boolean zIsZero = eCFieldElement.isZero();
            ECFieldElement eCFieldElement5 = this.f207708y;
            if (zIsZero) {
                ECFieldElement eCFieldElementSquare = eCFieldElement5.square();
                if (!zIsOne) {
                    b = b.multiply(eCFieldElement4.square());
                }
                return eCFieldElementSquare.equals(b);
            }
            ECFieldElement eCFieldElementSquare2 = eCFieldElement.square();
            if (zIsOne) {
                eCFieldElementMultiplyPlusProduct = eCFieldElement5.square().add(eCFieldElement5).add(a);
                eCFieldElementSquarePlusProduct = eCFieldElementSquare2.square().add(b);
            } else {
                ECFieldElement eCFieldElementSquare3 = eCFieldElement4.square();
                ECFieldElement eCFieldElementSquare4 = eCFieldElementSquare3.square();
                eCFieldElementMultiplyPlusProduct = eCFieldElement5.add(eCFieldElement4).multiplyPlusProduct(eCFieldElement5, a, eCFieldElementSquare3);
                eCFieldElementSquarePlusProduct = eCFieldElementSquare2.squarePlusProduct(b, eCFieldElementSquare4);
            }
            return eCFieldElementMultiplyPlusProduct.multiply(eCFieldElementSquare2).equals(eCFieldElementSquarePlusProduct);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint scaleX(ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem == 5) {
                ECFieldElement rawXCoord = getRawXCoord();
                ECFieldElement rawYCoord = getRawYCoord();
                return getCurve().createRawPoint(rawXCoord, rawYCoord.add(rawXCoord).divide(eCFieldElement).add(rawXCoord.multiply(eCFieldElement)), getRawZCoords(), this.withCompression);
            }
            if (curveCoordinateSystem != 6) {
                return super.scaleX(eCFieldElement);
            }
            ECFieldElement rawXCoord2 = getRawXCoord();
            ECFieldElement rawYCoord2 = getRawYCoord();
            ECFieldElement eCFieldElement2 = getRawZCoords()[0];
            ECFieldElement eCFieldElementMultiply = rawXCoord2.multiply(eCFieldElement.square());
            return getCurve().createRawPoint(eCFieldElementMultiply, rawYCoord2.add(rawXCoord2).add(eCFieldElementMultiply), new ECFieldElement[]{eCFieldElement2.multiply(eCFieldElement)}, this.withCompression);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint scaleY(ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 5 && curveCoordinateSystem != 6) {
                return super.scaleY(eCFieldElement);
            }
            ECFieldElement rawXCoord = getRawXCoord();
            return getCurve().createRawPoint(rawXCoord, getRawYCoord().add(rawXCoord).multiply(eCFieldElement).add(rawXCoord), getRawZCoords(), this.withCompression);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }

        public AbstractF2m tau() {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement = this.f207707x;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            wtq0.m207906a("unsupported coordinate system");
                            return null;
                        }
                    }
                }
                return (AbstractF2m) curve.createRawPoint(eCFieldElement.square(), this.f207708y.square(), new ECFieldElement[]{this.f207709zs[0].square()}, this.withCompression);
            }
            return (AbstractF2m) curve.createRawPoint(eCFieldElement.square(), this.f207708y.square(), this.withCompression);
        }

        public AbstractF2m tauPow(int i) {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement = this.f207707x;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            wtq0.m207906a("unsupported coordinate system");
                            return null;
                        }
                    }
                }
                return (AbstractF2m) curve.createRawPoint(eCFieldElement.squarePow(i), this.f207708y.squarePow(i), new ECFieldElement[]{this.f207709zs[0].squarePow(i)}, this.withCompression);
            }
            return (AbstractF2m) curve.createRawPoint(eCFieldElement.squarePow(i), this.f207708y.squarePow(i), this.withCompression);
        }

        public AbstractF2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }
    }

    public static abstract class AbstractFp extends ECPoint {
        public AbstractFp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public boolean getCompressionYTilde() {
            return getAffineYCoord().testBitZero();
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public boolean satisfiesCurveEquation() {
            ECFieldElement eCFieldElement = this.f207707x;
            ECFieldElement eCFieldElement2 = this.f207708y;
            ECFieldElement a = this.curve.getA();
            ECFieldElement b = this.curve.getB();
            ECFieldElement eCFieldElementSquare = eCFieldElement2.square();
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 0) {
                if (curveCoordinateSystem == 1) {
                    ECFieldElement eCFieldElement3 = this.f207709zs[0];
                    if (!eCFieldElement3.isOne()) {
                        ECFieldElement eCFieldElementSquare2 = eCFieldElement3.square();
                        ECFieldElement eCFieldElementMultiply = eCFieldElement3.multiply(eCFieldElementSquare2);
                        eCFieldElementSquare = eCFieldElementSquare.multiply(eCFieldElement3);
                        a = a.multiply(eCFieldElementSquare2);
                        b = b.multiply(eCFieldElementMultiply);
                    }
                } else {
                    if (curveCoordinateSystem != 2 && curveCoordinateSystem != 3 && curveCoordinateSystem != 4) {
                        wtq0.m207906a("unsupported coordinate system");
                        return false;
                    }
                    ECFieldElement eCFieldElement4 = this.f207709zs[0];
                    if (!eCFieldElement4.isOne()) {
                        ECFieldElement eCFieldElementSquare3 = eCFieldElement4.square();
                        ECFieldElement eCFieldElementSquare4 = eCFieldElementSquare3.square();
                        ECFieldElement eCFieldElementMultiply2 = eCFieldElementSquare3.multiply(eCFieldElementSquare4);
                        a = a.multiply(eCFieldElementSquare4);
                        b = b.multiply(eCFieldElementMultiply2);
                    }
                }
            }
            return eCFieldElementSquare.equals(eCFieldElement.square().add(a).multiply(eCFieldElement).add(b));
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }

        public AbstractFp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }
    }

    public ECPoint(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, getInitialZCoords(eCCurve));
    }

    /* JADX INFO: renamed from: org.spongycastle.math.ec.ECPoint$Fp */
    public static class C22397Fp extends AbstractFp {
        public C22397Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
            if ((eCFieldElement == null) == (eCFieldElement2 == null)) {
                this.withCompression = z;
            } else {
                wg3.m206174a("Exactly one of the field elements is null");
                throw null;
            }
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint add(ECPoint eCPoint) {
            int i;
            ECFieldElement eCFieldElementMultiplyMinusProduct;
            ECFieldElement eCFieldElementMultiply;
            ECFieldElement eCFieldElementSubtract;
            ECFieldElement[] eCFieldElementArr;
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return this;
            }
            if (this == eCPoint) {
                return twice();
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElementMultiply2 = this.f207707x;
            ECFieldElement eCFieldElementMultiply3 = this.f207708y;
            ECFieldElement eCFieldElementMultiply4 = eCPoint.f207707x;
            ECFieldElement eCFieldElementMultiply5 = eCPoint.f207708y;
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElementSubtract2 = eCFieldElementMultiply4.subtract(eCFieldElementMultiply2);
                ECFieldElement eCFieldElementSubtract3 = eCFieldElementMultiply5.subtract(eCFieldElementMultiply3);
                if (eCFieldElementSubtract2.isZero()) {
                    return eCFieldElementSubtract3.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementDivide = eCFieldElementSubtract3.divide(eCFieldElementSubtract2);
                ECFieldElement eCFieldElementSubtract4 = eCFieldElementDivide.square().subtract(eCFieldElementMultiply2).subtract(eCFieldElementMultiply4);
                return new C22397Fp(curve, eCFieldElementSubtract4, eCFieldElementDivide.multiply(eCFieldElementMultiply2.subtract(eCFieldElementSubtract4)).subtract(eCFieldElementMultiply3), this.withCompression);
            }
            char c = 0;
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElementMultiply6 = this.f207709zs[0];
                ECFieldElement eCFieldElement = eCPoint.f207709zs[0];
                boolean zIsOne = eCFieldElementMultiply6.isOne();
                boolean zIsOne2 = eCFieldElement.isOne();
                if (!zIsOne) {
                    eCFieldElementMultiply5 = eCFieldElementMultiply5.multiply(eCFieldElementMultiply6);
                }
                if (!zIsOne2) {
                    eCFieldElementMultiply3 = eCFieldElementMultiply3.multiply(eCFieldElement);
                }
                ECFieldElement eCFieldElementSubtract5 = eCFieldElementMultiply5.subtract(eCFieldElementMultiply3);
                if (!zIsOne) {
                    eCFieldElementMultiply4 = eCFieldElementMultiply4.multiply(eCFieldElementMultiply6);
                }
                if (!zIsOne2) {
                    eCFieldElementMultiply2 = eCFieldElementMultiply2.multiply(eCFieldElement);
                }
                ECFieldElement eCFieldElementSubtract6 = eCFieldElementMultiply4.subtract(eCFieldElementMultiply2);
                if (eCFieldElementSubtract6.isZero()) {
                    return eCFieldElementSubtract5.isZero() ? twice() : curve.getInfinity();
                }
                if (zIsOne) {
                    eCFieldElementMultiply6 = eCFieldElement;
                } else if (!zIsOne2) {
                    eCFieldElementMultiply6 = eCFieldElementMultiply6.multiply(eCFieldElement);
                }
                ECFieldElement eCFieldElementSquare = eCFieldElementSubtract6.square();
                ECFieldElement eCFieldElementMultiply7 = eCFieldElementSquare.multiply(eCFieldElementSubtract6);
                ECFieldElement eCFieldElementMultiply8 = eCFieldElementSquare.multiply(eCFieldElementMultiply2);
                ECFieldElement eCFieldElementSubtract7 = eCFieldElementSubtract5.square().multiply(eCFieldElementMultiply6).subtract(eCFieldElementMultiply7).subtract(two(eCFieldElementMultiply8));
                return new C22397Fp(curve, eCFieldElementSubtract6.multiply(eCFieldElementSubtract7), eCFieldElementMultiply8.subtract(eCFieldElementSubtract7).multiplyMinusProduct(eCFieldElementSubtract5, eCFieldElementMultiply3, eCFieldElementMultiply7), new ECFieldElement[]{eCFieldElementMultiply7.multiply(eCFieldElementMultiply6)}, this.withCompression);
            }
            ECFieldElement eCFieldElement2 = null;
            if (coordinateSystem != 2 && coordinateSystem != 4) {
                wtq0.m207906a("unsupported coordinate system");
                return null;
            }
            ECFieldElement eCFieldElement3 = this.f207709zs[0];
            ECFieldElement eCFieldElement4 = eCPoint.f207709zs[0];
            boolean zIsOne3 = eCFieldElement3.isOne();
            if (zIsOne3 || !eCFieldElement3.equals(eCFieldElement4)) {
                if (!zIsOne3) {
                    ECFieldElement eCFieldElementSquare2 = eCFieldElement3.square();
                    eCFieldElementMultiply4 = eCFieldElementSquare2.multiply(eCFieldElementMultiply4);
                    eCFieldElementMultiply5 = eCFieldElementSquare2.multiply(eCFieldElement3).multiply(eCFieldElementMultiply5);
                }
                boolean zIsOne4 = eCFieldElement4.isOne();
                if (!zIsOne4) {
                    ECFieldElement eCFieldElementSquare3 = eCFieldElement4.square();
                    eCFieldElementMultiply2 = eCFieldElementSquare3.multiply(eCFieldElementMultiply2);
                    eCFieldElementMultiply3 = eCFieldElementSquare3.multiply(eCFieldElement4).multiply(eCFieldElementMultiply3);
                }
                ECFieldElement eCFieldElementSubtract8 = eCFieldElementMultiply2.subtract(eCFieldElementMultiply4);
                ECFieldElement eCFieldElementSubtract9 = eCFieldElementMultiply3.subtract(eCFieldElementMultiply5);
                if (eCFieldElementSubtract8.isZero()) {
                    return eCFieldElementSubtract9.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementSquare4 = eCFieldElementSubtract8.square();
                ECFieldElement eCFieldElementMultiply9 = eCFieldElementSquare4.multiply(eCFieldElementSubtract8);
                ECFieldElement eCFieldElementMultiply10 = eCFieldElementSquare4.multiply(eCFieldElementMultiply2);
                i = 1;
                ECFieldElement eCFieldElementSubtract10 = eCFieldElementSubtract9.square().add(eCFieldElementMultiply9).subtract(two(eCFieldElementMultiply10));
                eCFieldElementMultiplyMinusProduct = eCFieldElementMultiply10.subtract(eCFieldElementSubtract10).multiplyMinusProduct(eCFieldElementSubtract9, eCFieldElementMultiply9, eCFieldElementMultiply3);
                ECFieldElement eCFieldElementMultiply11 = !zIsOne3 ? eCFieldElementSubtract8.multiply(eCFieldElement3) : eCFieldElementSubtract8;
                eCFieldElementMultiply = !zIsOne4 ? eCFieldElementMultiply11.multiply(eCFieldElement4) : eCFieldElementMultiply11;
                if (eCFieldElementMultiply == eCFieldElementSubtract8) {
                    eCFieldElementSubtract = eCFieldElementSubtract10;
                    eCFieldElement2 = eCFieldElementSquare4;
                } else {
                    eCFieldElementSubtract = eCFieldElementSubtract10;
                    eCFieldElement2 = null;
                }
            } else {
                ECFieldElement eCFieldElementSubtract11 = eCFieldElementMultiply2.subtract(eCFieldElementMultiply4);
                ECFieldElement eCFieldElementSubtract12 = eCFieldElementMultiply3.subtract(eCFieldElementMultiply5);
                if (eCFieldElementSubtract11.isZero()) {
                    return eCFieldElementSubtract12.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementSquare5 = eCFieldElementSubtract11.square();
                ECFieldElement eCFieldElementMultiply12 = eCFieldElementMultiply2.multiply(eCFieldElementSquare5);
                ECFieldElement eCFieldElementMultiply13 = eCFieldElementMultiply4.multiply(eCFieldElementSquare5);
                ECFieldElement eCFieldElementMultiply14 = eCFieldElementMultiply12.subtract(eCFieldElementMultiply13).multiply(eCFieldElementMultiply3);
                eCFieldElementSubtract = eCFieldElementSubtract12.square().subtract(eCFieldElementMultiply12).subtract(eCFieldElementMultiply13);
                eCFieldElementMultiplyMinusProduct = eCFieldElementMultiply12.subtract(eCFieldElementSubtract).multiply(eCFieldElementSubtract12).subtract(eCFieldElementMultiply14);
                eCFieldElementMultiply = eCFieldElementSubtract11.multiply(eCFieldElement3);
                i = 1;
                c = 0;
            }
            if (coordinateSystem == 4) {
                ECFieldElement eCFieldElementCalculateJacobianModifiedW = calculateJacobianModifiedW(eCFieldElementMultiply, eCFieldElement2);
                eCFieldElementArr = new ECFieldElement[2];
                eCFieldElementArr[c] = eCFieldElementMultiply;
                eCFieldElementArr[i] = eCFieldElementCalculateJacobianModifiedW;
            } else {
                eCFieldElementArr = new ECFieldElement[i];
                eCFieldElementArr[c] = eCFieldElementMultiply;
            }
            return new C22397Fp(curve, eCFieldElementSubtract, eCFieldElementMultiplyMinusProduct, eCFieldElementArr, this.withCompression);
        }

        public ECFieldElement calculateJacobianModifiedW(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            ECFieldElement a = getCurve().getA();
            if (a.isZero() || eCFieldElement.isOne()) {
                return a;
            }
            if (eCFieldElement2 == null) {
                eCFieldElement2 = eCFieldElement.square();
            }
            ECFieldElement eCFieldElementSquare = eCFieldElement2.square();
            ECFieldElement eCFieldElementNegate = a.negate();
            return eCFieldElementNegate.bitLength() < a.bitLength() ? eCFieldElementSquare.multiply(eCFieldElementNegate).negate() : eCFieldElementSquare.multiply(a);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint detach() {
            return new C22397Fp(null, getAffineXCoord(), getAffineYCoord());
        }

        public ECFieldElement doubleProductFromSquares(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3, ECFieldElement eCFieldElement4) {
            return eCFieldElement.add(eCFieldElement2).square().subtract(eCFieldElement3).subtract(eCFieldElement4);
        }

        public ECFieldElement eight(ECFieldElement eCFieldElement) {
            return four(two(eCFieldElement));
        }

        public ECFieldElement four(ECFieldElement eCFieldElement) {
            return two(two(eCFieldElement));
        }

        public ECFieldElement getJacobianModifiedW() {
            ECFieldElement[] eCFieldElementArr = this.f207709zs;
            ECFieldElement eCFieldElement = eCFieldElementArr[1];
            if (eCFieldElement != null) {
                return eCFieldElement;
            }
            ECFieldElement eCFieldElementCalculateJacobianModifiedW = calculateJacobianModifiedW(eCFieldElementArr[0], null);
            eCFieldElementArr[1] = eCFieldElementCalculateJacobianModifiedW;
            return eCFieldElementCalculateJacobianModifiedW;
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECFieldElement getZCoord(int i) {
            return (i == 1 && 4 == getCurveCoordinateSystem()) ? getJacobianModifiedW() : super.getZCoord(i);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint negate() {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement = this.f207707x;
            return coordinateSystem != 0 ? new C22397Fp(curve, eCFieldElement, this.f207708y.negate(), this.f207709zs, this.withCompression) : new C22397Fp(curve, eCFieldElement, this.f207708y.negate(), this.withCompression);
        }

        public ECFieldElement three(ECFieldElement eCFieldElement) {
            return two(eCFieldElement).add(eCFieldElement);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint threeTimes() {
            if (!isInfinity()) {
                ECFieldElement eCFieldElement = this.f207708y;
                if (!eCFieldElement.isZero()) {
                    ECCurve curve = getCurve();
                    int coordinateSystem = curve.getCoordinateSystem();
                    if (coordinateSystem != 0) {
                        return coordinateSystem != 4 ? twice().add(this) : twiceJacobianModified(false).add(this);
                    }
                    ECFieldElement eCFieldElement2 = this.f207707x;
                    ECFieldElement eCFieldElementTwo = two(eCFieldElement);
                    ECFieldElement eCFieldElementSquare = eCFieldElementTwo.square();
                    ECFieldElement eCFieldElementAdd = three(eCFieldElement2.square()).add(getCurve().getA());
                    ECFieldElement eCFieldElementSubtract = three(eCFieldElement2).multiply(eCFieldElementSquare).subtract(eCFieldElementAdd.square());
                    if (eCFieldElementSubtract.isZero()) {
                        return getCurve().getInfinity();
                    }
                    ECFieldElement eCFieldElementInvert = eCFieldElementSubtract.multiply(eCFieldElementTwo).invert();
                    ECFieldElement eCFieldElementMultiply = eCFieldElementSubtract.multiply(eCFieldElementInvert).multiply(eCFieldElementAdd);
                    ECFieldElement eCFieldElementSubtract2 = eCFieldElementSquare.square().multiply(eCFieldElementInvert).subtract(eCFieldElementMultiply);
                    ECFieldElement eCFieldElementAdd2 = eCFieldElementSubtract2.subtract(eCFieldElementMultiply).multiply(eCFieldElementMultiply.add(eCFieldElementSubtract2)).add(eCFieldElement2);
                    return new C22397Fp(curve, eCFieldElementAdd2, eCFieldElement2.subtract(eCFieldElementAdd2).multiply(eCFieldElementSubtract2).subtract(eCFieldElement), this.withCompression);
                }
            }
            return this;
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint timesPow2(int i) {
            ECPoint eCPoint = null;
            if (i < 0) {
                wg3.m206174a("'e' cannot be negative");
                return null;
            }
            if (i == 0 || isInfinity()) {
                return this;
            }
            if (i == 1) {
                return twice();
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElementSubtract = this.f207708y;
            if (eCFieldElementSubtract.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement a = curve.getA();
            ECFieldElement eCFieldElementMultiply = this.f207707x;
            ECFieldElement[] eCFieldElementArr = this.f207709zs;
            int i2 = 0;
            ECFieldElement eCFieldElementFromBigInteger = eCFieldElementArr.length < 1 ? curve.fromBigInteger(ECConstants.ONE) : eCFieldElementArr[0];
            if (!eCFieldElementFromBigInteger.isOne() && coordinateSystem != 0) {
                if (coordinateSystem == 1) {
                    ECFieldElement eCFieldElementSquare = eCFieldElementFromBigInteger.square();
                    eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElementFromBigInteger);
                    eCFieldElementSubtract = eCFieldElementSubtract.multiply(eCFieldElementSquare);
                    a = calculateJacobianModifiedW(eCFieldElementFromBigInteger, eCFieldElementSquare);
                } else if (coordinateSystem == 2) {
                    a = calculateJacobianModifiedW(eCFieldElementFromBigInteger, null);
                } else {
                    if (coordinateSystem != 4) {
                        wtq0.m207906a("unsupported coordinate system");
                        return null;
                    }
                    a = getJacobianModifiedW();
                }
            }
            while (i2 < i) {
                if (eCFieldElementSubtract.isZero()) {
                    return curve.getInfinity();
                }
                ECFieldElement eCFieldElementThree = three(eCFieldElementMultiply.square());
                ECFieldElement eCFieldElementTwo = two(eCFieldElementSubtract);
                ECFieldElement eCFieldElementMultiply2 = eCFieldElementTwo.multiply(eCFieldElementSubtract);
                ECFieldElement eCFieldElementTwo2 = two(eCFieldElementMultiply.multiply(eCFieldElementMultiply2));
                ECFieldElement eCFieldElementTwo3 = two(eCFieldElementMultiply2.square());
                if (!a.isZero()) {
                    eCFieldElementThree = eCFieldElementThree.add(a);
                    a = two(eCFieldElementTwo3.multiply(a));
                }
                ECPoint eCPoint2 = eCPoint;
                ECFieldElement eCFieldElementSubtract2 = eCFieldElementThree.square().subtract(two(eCFieldElementTwo2));
                eCFieldElementSubtract = eCFieldElementThree.multiply(eCFieldElementTwo2.subtract(eCFieldElementSubtract2)).subtract(eCFieldElementTwo3);
                eCFieldElementFromBigInteger = eCFieldElementFromBigInteger.isOne() ? eCFieldElementTwo : eCFieldElementTwo.multiply(eCFieldElementFromBigInteger);
                i2++;
                eCFieldElementMultiply = eCFieldElementSubtract2;
                eCPoint = eCPoint2;
            }
            ECPoint eCPoint3 = eCPoint;
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElement = eCFieldElementSubtract;
                ECFieldElement eCFieldElementInvert = eCFieldElementFromBigInteger.invert();
                ECFieldElement eCFieldElementSquare2 = eCFieldElementInvert.square();
                return new C22397Fp(curve, eCFieldElementMultiply.multiply(eCFieldElementSquare2), eCFieldElement.multiply(eCFieldElementSquare2.multiply(eCFieldElementInvert)), this.withCompression);
            }
            if (coordinateSystem == 1) {
                return new C22397Fp(curve, eCFieldElementMultiply.multiply(eCFieldElementFromBigInteger), eCFieldElementSubtract, new ECFieldElement[]{eCFieldElementFromBigInteger.multiply(eCFieldElementFromBigInteger.square())}, this.withCompression);
            }
            if (coordinateSystem == 2) {
                return new C22397Fp(curve, eCFieldElementMultiply, eCFieldElementSubtract, new ECFieldElement[]{eCFieldElementFromBigInteger}, this.withCompression);
            }
            if (coordinateSystem == 4) {
                return new C22397Fp(curve, eCFieldElementMultiply, eCFieldElementSubtract, new ECFieldElement[]{eCFieldElementFromBigInteger, a}, this.withCompression);
            }
            wtq0.m207906a("unsupported coordinate system");
            return eCPoint3;
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint twice() {
            ECFieldElement eCFieldElementSubtract;
            ECFieldElement eCFieldElementFour;
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.f207708y;
            if (eCFieldElement.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement2 = this.f207707x;
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElementDivide = three(eCFieldElement2.square()).add(getCurve().getA()).divide(two(eCFieldElement));
                ECFieldElement eCFieldElementSubtract2 = eCFieldElementDivide.square().subtract(two(eCFieldElement2));
                return new C22397Fp(curve, eCFieldElementSubtract2, eCFieldElementDivide.multiply(eCFieldElement2.subtract(eCFieldElementSubtract2)).subtract(eCFieldElement), this.withCompression);
            }
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElement3 = this.f207709zs[0];
                boolean zIsOne = eCFieldElement3.isOne();
                ECFieldElement a = curve.getA();
                if (!a.isZero() && !zIsOne) {
                    a = a.multiply(eCFieldElement3.square());
                }
                ECFieldElement eCFieldElementAdd = a.add(three(eCFieldElement2.square()));
                ECFieldElement eCFieldElementMultiply = zIsOne ? eCFieldElement : eCFieldElement.multiply(eCFieldElement3);
                ECFieldElement eCFieldElementSquare = zIsOne ? eCFieldElement.square() : eCFieldElementMultiply.multiply(eCFieldElement);
                ECFieldElement eCFieldElementFour2 = four(eCFieldElement2.multiply(eCFieldElementSquare));
                ECFieldElement eCFieldElementSubtract3 = eCFieldElementAdd.square().subtract(two(eCFieldElementFour2));
                ECFieldElement eCFieldElementTwo = two(eCFieldElementMultiply);
                ECFieldElement eCFieldElementMultiply2 = eCFieldElementSubtract3.multiply(eCFieldElementTwo);
                ECFieldElement eCFieldElementTwo2 = two(eCFieldElementSquare);
                return new C22397Fp(curve, eCFieldElementMultiply2, eCFieldElementFour2.subtract(eCFieldElementSubtract3).multiply(eCFieldElementAdd).subtract(two(eCFieldElementTwo2.square())), new ECFieldElement[]{two(zIsOne ? two(eCFieldElementTwo2) : eCFieldElementTwo.square()).multiply(eCFieldElementMultiply)}, this.withCompression);
            }
            if (coordinateSystem != 2) {
                if (coordinateSystem == 4) {
                    return twiceJacobianModified(true);
                }
                wtq0.m207906a("unsupported coordinate system");
                return null;
            }
            ECFieldElement eCFieldElement4 = this.f207709zs[0];
            boolean zIsOne2 = eCFieldElement4.isOne();
            ECFieldElement eCFieldElementSquare2 = eCFieldElement.square();
            ECFieldElement eCFieldElementSquare3 = eCFieldElementSquare2.square();
            ECFieldElement a2 = curve.getA();
            ECFieldElement eCFieldElementNegate = a2.negate();
            if (eCFieldElementNegate.toBigInteger().equals(BigInteger.valueOf(3L))) {
                ECFieldElement eCFieldElementSquare4 = zIsOne2 ? eCFieldElement4 : eCFieldElement4.square();
                eCFieldElementSubtract = three(eCFieldElement2.add(eCFieldElementSquare4).multiply(eCFieldElement2.subtract(eCFieldElementSquare4)));
                eCFieldElementFour = four(eCFieldElementSquare2.multiply(eCFieldElement2));
            } else {
                ECFieldElement eCFieldElementThree = three(eCFieldElement2.square());
                if (zIsOne2) {
                    eCFieldElementSubtract = eCFieldElementThree.add(a2);
                } else if (a2.isZero()) {
                    eCFieldElementSubtract = eCFieldElementThree;
                } else {
                    ECFieldElement eCFieldElementSquare5 = eCFieldElement4.square().square();
                    eCFieldElementSubtract = eCFieldElementNegate.bitLength() < a2.bitLength() ? eCFieldElementThree.subtract(eCFieldElementSquare5.multiply(eCFieldElementNegate)) : eCFieldElementThree.add(eCFieldElementSquare5.multiply(a2));
                }
                eCFieldElementFour = four(eCFieldElement2.multiply(eCFieldElementSquare2));
            }
            ECFieldElement eCFieldElementSubtract4 = eCFieldElementSubtract.square().subtract(two(eCFieldElementFour));
            ECFieldElement eCFieldElementSubtract5 = eCFieldElementFour.subtract(eCFieldElementSubtract4).multiply(eCFieldElementSubtract).subtract(eight(eCFieldElementSquare3));
            ECFieldElement eCFieldElementTwo3 = two(eCFieldElement);
            if (!zIsOne2) {
                eCFieldElementTwo3 = eCFieldElementTwo3.multiply(eCFieldElement4);
            }
            return new C22397Fp(curve, eCFieldElementSubtract4, eCFieldElementSubtract5, new ECFieldElement[]{eCFieldElementTwo3}, this.withCompression);
        }

        public C22397Fp twiceJacobianModified(boolean z) {
            ECFieldElement eCFieldElement = this.f207707x;
            ECFieldElement eCFieldElement2 = this.f207708y;
            ECFieldElement eCFieldElement3 = this.f207709zs[0];
            ECFieldElement jacobianModifiedW = getJacobianModifiedW();
            ECFieldElement eCFieldElementAdd = three(eCFieldElement.square()).add(jacobianModifiedW);
            ECFieldElement eCFieldElementTwo = two(eCFieldElement2);
            ECFieldElement eCFieldElementMultiply = eCFieldElementTwo.multiply(eCFieldElement2);
            ECFieldElement eCFieldElementTwo2 = two(eCFieldElement.multiply(eCFieldElementMultiply));
            ECFieldElement eCFieldElementSubtract = eCFieldElementAdd.square().subtract(two(eCFieldElementTwo2));
            ECFieldElement eCFieldElementTwo3 = two(eCFieldElementMultiply.square());
            ECFieldElement eCFieldElementSubtract2 = eCFieldElementAdd.multiply(eCFieldElementTwo2.subtract(eCFieldElementSubtract)).subtract(eCFieldElementTwo3);
            ECFieldElement eCFieldElementTwo4 = z ? two(eCFieldElementTwo3.multiply(jacobianModifiedW)) : null;
            if (!eCFieldElement3.isOne()) {
                eCFieldElementTwo = eCFieldElementTwo.multiply(eCFieldElement3);
            }
            return new C22397Fp(getCurve(), eCFieldElementSubtract, eCFieldElementSubtract2, new ECFieldElement[]{eCFieldElementTwo, eCFieldElementTwo4}, this.withCompression);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint twicePlus(ECPoint eCPoint) {
            if (this == eCPoint) {
                return threeTimes();
            }
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return twice();
            }
            ECFieldElement eCFieldElement = this.f207708y;
            if (eCFieldElement.isZero()) {
                return eCPoint;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 0) {
                return coordinateSystem != 4 ? twice().add(eCPoint) : twiceJacobianModified(false).add(eCPoint);
            }
            ECFieldElement eCFieldElement2 = this.f207707x;
            ECFieldElement eCFieldElement3 = eCPoint.f207707x;
            ECFieldElement eCFieldElement4 = eCPoint.f207708y;
            ECFieldElement eCFieldElementSubtract = eCFieldElement3.subtract(eCFieldElement2);
            ECFieldElement eCFieldElementSubtract2 = eCFieldElement4.subtract(eCFieldElement);
            if (eCFieldElementSubtract.isZero()) {
                return eCFieldElementSubtract2.isZero() ? threeTimes() : this;
            }
            ECFieldElement eCFieldElementSquare = eCFieldElementSubtract.square();
            ECFieldElement eCFieldElementSubtract3 = eCFieldElementSquare.multiply(two(eCFieldElement2).add(eCFieldElement3)).subtract(eCFieldElementSubtract2.square());
            if (eCFieldElementSubtract3.isZero()) {
                return curve.getInfinity();
            }
            ECFieldElement eCFieldElementInvert = eCFieldElementSubtract3.multiply(eCFieldElementSubtract).invert();
            ECFieldElement eCFieldElementMultiply = eCFieldElementSubtract3.multiply(eCFieldElementInvert).multiply(eCFieldElementSubtract2);
            ECFieldElement eCFieldElementSubtract4 = two(eCFieldElement).multiply(eCFieldElementSquare).multiply(eCFieldElementSubtract).multiply(eCFieldElementInvert).subtract(eCFieldElementMultiply);
            ECFieldElement eCFieldElementAdd = eCFieldElementSubtract4.subtract(eCFieldElementMultiply).multiply(eCFieldElementMultiply.add(eCFieldElementSubtract4)).add(eCFieldElement3);
            return new C22397Fp(curve, eCFieldElementAdd, eCFieldElement2.subtract(eCFieldElementAdd).multiply(eCFieldElementSubtract4).subtract(eCFieldElement), this.withCompression);
        }

        public ECFieldElement two(ECFieldElement eCFieldElement) {
            return eCFieldElement.add(eCFieldElement);
        }

        public C22397Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(eCCurve, eCFieldElement, eCFieldElement2, false);
        }

        public C22397Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
            this.withCompression = z;
        }
    }

    public ECPoint normalize() {
        int curveCoordinateSystem;
        if (isInfinity() || (curveCoordinateSystem = getCurveCoordinateSystem()) == 0 || curveCoordinateSystem == 5) {
            return this;
        }
        ECFieldElement zCoord = getZCoord(0);
        return zCoord.isOne() ? this : normalize(zCoord.invert());
    }

    public static class F2m extends AbstractF2m {
        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
            if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
                wg3.m206174a("Exactly one of the field elements is null");
                throw null;
            }
            if (eCFieldElement != null) {
                ECFieldElement.F2m.checkFieldElements(this.f207707x, this.f207708y);
                if (eCCurve != null) {
                    ECFieldElement.F2m.checkFieldElements(this.f207707x, this.curve.getA());
                }
            }
            this.withCompression = z;
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint add(ECPoint eCPoint) {
            ECFieldElement eCFieldElementMultiply;
            ECFieldElement eCFieldElementMultiply2;
            ECFieldElement eCFieldElementMultiply3;
            ECFieldElement eCFieldElement;
            ECFieldElement eCFieldElementAdd;
            ECFieldElement eCFieldElementFromBigInteger;
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElementMultiply4 = this.f207707x;
            ECFieldElement eCFieldElement2 = eCPoint.f207707x;
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElement3 = this.f207708y;
                ECFieldElement eCFieldElement4 = eCPoint.f207708y;
                ECFieldElement eCFieldElementAdd2 = eCFieldElementMultiply4.add(eCFieldElement2);
                ECFieldElement eCFieldElementAdd3 = eCFieldElement3.add(eCFieldElement4);
                if (eCFieldElementAdd2.isZero()) {
                    return eCFieldElementAdd3.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementDivide = eCFieldElementAdd3.divide(eCFieldElementAdd2);
                ECFieldElement eCFieldElementAdd4 = eCFieldElementDivide.square().add(eCFieldElementDivide).add(eCFieldElementAdd2).add(curve.getA());
                return new F2m(curve, eCFieldElementAdd4, eCFieldElementDivide.multiply(eCFieldElementMultiply4.add(eCFieldElementAdd4)).add(eCFieldElementAdd4).add(eCFieldElement3), this.withCompression);
            }
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElement5 = this.f207708y;
                ECFieldElement eCFieldElementMultiply5 = this.f207709zs[0];
                ECFieldElement eCFieldElement6 = eCPoint.f207708y;
                ECFieldElement eCFieldElement7 = eCPoint.f207709zs[0];
                boolean zIsOne = eCFieldElement7.isOne();
                ECFieldElement eCFieldElementAdd5 = eCFieldElementMultiply5.multiply(eCFieldElement6).add(zIsOne ? eCFieldElement5 : eCFieldElement5.multiply(eCFieldElement7));
                ECFieldElement eCFieldElementAdd6 = eCFieldElementMultiply5.multiply(eCFieldElement2).add(zIsOne ? eCFieldElementMultiply4 : eCFieldElementMultiply4.multiply(eCFieldElement7));
                if (eCFieldElementAdd6.isZero()) {
                    return eCFieldElementAdd5.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementSquare = eCFieldElementAdd6.square();
                ECFieldElement eCFieldElementMultiply6 = eCFieldElementSquare.multiply(eCFieldElementAdd6);
                if (!zIsOne) {
                    eCFieldElementMultiply5 = eCFieldElementMultiply5.multiply(eCFieldElement7);
                }
                ECFieldElement eCFieldElementAdd7 = eCFieldElementAdd5.add(eCFieldElementAdd6);
                ECFieldElement eCFieldElementAdd8 = eCFieldElementAdd7.multiplyPlusProduct(eCFieldElementAdd5, eCFieldElementSquare, curve.getA()).multiply(eCFieldElementMultiply5).add(eCFieldElementMultiply6);
                ECFieldElement eCFieldElementMultiply7 = eCFieldElementAdd6.multiply(eCFieldElementAdd8);
                if (!zIsOne) {
                    eCFieldElementSquare = eCFieldElementSquare.multiply(eCFieldElement7);
                }
                return new F2m(curve, eCFieldElementMultiply7, eCFieldElementAdd5.multiplyPlusProduct(eCFieldElementMultiply4, eCFieldElementAdd6, eCFieldElement5).multiplyPlusProduct(eCFieldElementSquare, eCFieldElementAdd7, eCFieldElementAdd8), new ECFieldElement[]{eCFieldElementMultiply6.multiply(eCFieldElementMultiply5)}, this.withCompression);
            }
            if (coordinateSystem != 6) {
                wtq0.m207906a("unsupported coordinate system");
                return null;
            }
            if (eCFieldElementMultiply4.isZero()) {
                return eCFieldElement2.isZero() ? curve.getInfinity() : eCPoint.add(this);
            }
            ECFieldElement eCFieldElement8 = this.f207708y;
            ECFieldElement eCFieldElement9 = this.f207709zs[0];
            ECFieldElement eCFieldElement10 = eCPoint.f207708y;
            ECFieldElement eCFieldElement11 = eCPoint.f207709zs[0];
            boolean zIsOne2 = eCFieldElement9.isOne();
            if (zIsOne2) {
                eCFieldElementMultiply = eCFieldElement2;
                eCFieldElementMultiply2 = eCFieldElement10;
            } else {
                eCFieldElementMultiply = eCFieldElement2.multiply(eCFieldElement9);
                eCFieldElementMultiply2 = eCFieldElement10.multiply(eCFieldElement9);
            }
            boolean zIsOne3 = eCFieldElement11.isOne();
            if (zIsOne3) {
                eCFieldElementMultiply3 = eCFieldElement8;
            } else {
                eCFieldElementMultiply4 = eCFieldElementMultiply4.multiply(eCFieldElement11);
                eCFieldElementMultiply3 = eCFieldElement8.multiply(eCFieldElement11);
            }
            ECFieldElement eCFieldElementAdd9 = eCFieldElementMultiply3.add(eCFieldElementMultiply2);
            ECFieldElement eCFieldElementAdd10 = eCFieldElementMultiply4.add(eCFieldElementMultiply);
            if (eCFieldElementAdd10.isZero()) {
                return eCFieldElementAdd9.isZero() ? twice() : curve.getInfinity();
            }
            if (eCFieldElement2.isZero()) {
                ECPoint eCPointNormalize = normalize();
                ECFieldElement xCoord = eCPointNormalize.getXCoord();
                ECFieldElement yCoord = eCPointNormalize.getYCoord();
                ECFieldElement eCFieldElementDivide2 = yCoord.add(eCFieldElement10).divide(xCoord);
                eCFieldElementAdd = eCFieldElementDivide2.square().add(eCFieldElementDivide2).add(xCoord).add(curve.getA());
                if (eCFieldElementAdd.isZero()) {
                    return new F2m(curve, eCFieldElementAdd, curve.getB().sqrt(), this.withCompression);
                }
                ECFieldElement eCFieldElementAdd11 = eCFieldElementDivide2.multiply(xCoord.add(eCFieldElementAdd)).add(eCFieldElementAdd).add(yCoord).divide(eCFieldElementAdd).add(eCFieldElementAdd);
                eCFieldElementFromBigInteger = curve.fromBigInteger(ECConstants.ONE);
                eCFieldElement = eCFieldElementAdd11;
            } else {
                ECFieldElement eCFieldElementSquare2 = eCFieldElementAdd10.square();
                ECFieldElement eCFieldElementMultiply8 = eCFieldElementAdd9.multiply(eCFieldElementMultiply4);
                ECFieldElement eCFieldElementMultiply9 = eCFieldElementAdd9.multiply(eCFieldElementMultiply);
                ECFieldElement eCFieldElementMultiply10 = eCFieldElementMultiply8.multiply(eCFieldElementMultiply9);
                if (eCFieldElementMultiply10.isZero()) {
                    return new F2m(curve, eCFieldElementMultiply10, curve.getB().sqrt(), this.withCompression);
                }
                ECFieldElement eCFieldElementMultiply11 = eCFieldElementAdd9.multiply(eCFieldElementSquare2);
                ECFieldElement eCFieldElementMultiply12 = !zIsOne3 ? eCFieldElementMultiply11.multiply(eCFieldElement11) : eCFieldElementMultiply11;
                ECFieldElement eCFieldElementSquarePlusProduct = eCFieldElementMultiply9.add(eCFieldElementSquare2).squarePlusProduct(eCFieldElementMultiply12, eCFieldElement8.add(eCFieldElement9));
                if (!zIsOne2) {
                    eCFieldElementMultiply12 = eCFieldElementMultiply12.multiply(eCFieldElement9);
                }
                eCFieldElement = eCFieldElementSquarePlusProduct;
                eCFieldElementAdd = eCFieldElementMultiply10;
                eCFieldElementFromBigInteger = eCFieldElementMultiply12;
            }
            return new F2m(curve, eCFieldElementAdd, eCFieldElement, new ECFieldElement[]{eCFieldElementFromBigInteger}, this.withCompression);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint detach() {
            return new F2m(null, getAffineXCoord(), getAffineYCoord());
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public boolean getCompressionYTilde() {
            ECFieldElement rawXCoord = getRawXCoord();
            if (rawXCoord.isZero()) {
                return false;
            }
            ECFieldElement rawYCoord = getRawYCoord();
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem == 5 || curveCoordinateSystem == 6) {
                return rawYCoord.testBitZero() != rawXCoord.testBitZero();
            }
            return rawYCoord.divide(rawXCoord).testBitZero();
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECFieldElement getYCoord() {
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 5 && curveCoordinateSystem != 6) {
                return this.f207708y;
            }
            ECFieldElement eCFieldElement = this.f207707x;
            ECFieldElement eCFieldElement2 = this.f207708y;
            if (isInfinity() || eCFieldElement.isZero()) {
                return eCFieldElement2;
            }
            ECFieldElement eCFieldElementMultiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
            if (6 == curveCoordinateSystem) {
                ECFieldElement eCFieldElement3 = this.f207709zs[0];
                if (!eCFieldElement3.isOne()) {
                    return eCFieldElementMultiply.divide(eCFieldElement3);
                }
            }
            return eCFieldElementMultiply;
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint negate() {
            if (!isInfinity()) {
                ECFieldElement eCFieldElement = this.f207707x;
                if (!eCFieldElement.isZero()) {
                    int curveCoordinateSystem = getCurveCoordinateSystem();
                    if (curveCoordinateSystem == 0) {
                        return new F2m(this.curve, eCFieldElement, this.f207708y.add(eCFieldElement), this.withCompression);
                    }
                    if (curveCoordinateSystem == 1) {
                        return new F2m(this.curve, eCFieldElement, this.f207708y.add(eCFieldElement), new ECFieldElement[]{this.f207709zs[0]}, this.withCompression);
                    }
                    if (curveCoordinateSystem == 5) {
                        return new F2m(this.curve, eCFieldElement, this.f207708y.addOne(), this.withCompression);
                    }
                    if (curveCoordinateSystem != 6) {
                        wtq0.m207906a("unsupported coordinate system");
                        return null;
                    }
                    ECFieldElement eCFieldElement2 = this.f207708y;
                    ECFieldElement eCFieldElement3 = this.f207709zs[0];
                    return new F2m(this.curve, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new ECFieldElement[]{eCFieldElement3}, this.withCompression);
                }
            }
            return this;
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint twice() {
            ECFieldElement eCFieldElementAdd;
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElementMultiply = this.f207707x;
            if (eCFieldElementMultiply.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElementAdd2 = this.f207708y.divide(eCFieldElementMultiply).add(eCFieldElementMultiply);
                ECFieldElement eCFieldElementAdd3 = eCFieldElementAdd2.square().add(eCFieldElementAdd2).add(curve.getA());
                return new F2m(curve, eCFieldElementAdd3, eCFieldElementMultiply.squarePlusProduct(eCFieldElementAdd3, eCFieldElementAdd2.addOne()), this.withCompression);
            }
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElementMultiply2 = this.f207708y;
                ECFieldElement eCFieldElement = this.f207709zs[0];
                boolean zIsOne = eCFieldElement.isOne();
                ECFieldElement eCFieldElementMultiply3 = zIsOne ? eCFieldElementMultiply : eCFieldElementMultiply.multiply(eCFieldElement);
                if (!zIsOne) {
                    eCFieldElementMultiply2 = eCFieldElementMultiply2.multiply(eCFieldElement);
                }
                ECFieldElement eCFieldElementSquare = eCFieldElementMultiply.square();
                ECFieldElement eCFieldElementAdd4 = eCFieldElementSquare.add(eCFieldElementMultiply2);
                ECFieldElement eCFieldElementSquare2 = eCFieldElementMultiply3.square();
                ECFieldElement eCFieldElementAdd5 = eCFieldElementAdd4.add(eCFieldElementMultiply3);
                ECFieldElement eCFieldElementMultiplyPlusProduct = eCFieldElementAdd5.multiplyPlusProduct(eCFieldElementAdd4, eCFieldElementSquare2, curve.getA());
                return new F2m(curve, eCFieldElementMultiply3.multiply(eCFieldElementMultiplyPlusProduct), eCFieldElementSquare.square().multiplyPlusProduct(eCFieldElementMultiply3, eCFieldElementMultiplyPlusProduct, eCFieldElementAdd5), new ECFieldElement[]{eCFieldElementMultiply3.multiply(eCFieldElementSquare2)}, this.withCompression);
            }
            if (coordinateSystem != 6) {
                wtq0.m207906a("unsupported coordinate system");
                return null;
            }
            ECFieldElement eCFieldElement2 = this.f207708y;
            ECFieldElement eCFieldElement3 = this.f207709zs[0];
            boolean zIsOne2 = eCFieldElement3.isOne();
            ECFieldElement eCFieldElementMultiply4 = zIsOne2 ? eCFieldElement2 : eCFieldElement2.multiply(eCFieldElement3);
            ECFieldElement eCFieldElementSquare3 = zIsOne2 ? eCFieldElement3 : eCFieldElement3.square();
            ECFieldElement a = curve.getA();
            ECFieldElement eCFieldElementMultiply5 = zIsOne2 ? a : a.multiply(eCFieldElementSquare3);
            ECFieldElement eCFieldElementAdd6 = eCFieldElement2.square().add(eCFieldElementMultiply4).add(eCFieldElementMultiply5);
            if (eCFieldElementAdd6.isZero()) {
                return new F2m(curve, eCFieldElementAdd6, curve.getB().sqrt(), this.withCompression);
            }
            ECFieldElement eCFieldElementSquare4 = eCFieldElementAdd6.square();
            ECFieldElement eCFieldElementMultiply6 = zIsOne2 ? eCFieldElementAdd6 : eCFieldElementAdd6.multiply(eCFieldElementSquare3);
            ECFieldElement b = curve.getB();
            if (b.bitLength() < (curve.getFieldSize() >> 1)) {
                ECFieldElement eCFieldElementSquare5 = eCFieldElement2.add(eCFieldElementMultiply).square();
                eCFieldElementAdd = eCFieldElementSquare5.add(eCFieldElementAdd6).add(eCFieldElementSquare3).multiply(eCFieldElementSquare5).add(b.isOne() ? eCFieldElementMultiply5.add(eCFieldElementSquare3).square() : eCFieldElementMultiply5.squarePlusProduct(b, eCFieldElementSquare3.square())).add(eCFieldElementSquare4);
                if (a.isZero()) {
                    eCFieldElementAdd = eCFieldElementAdd.add(eCFieldElementMultiply6);
                } else if (!a.isOne()) {
                    eCFieldElementAdd = eCFieldElementAdd.add(a.addOne().multiply(eCFieldElementMultiply6));
                }
            } else {
                if (!zIsOne2) {
                    eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElement3);
                }
                eCFieldElementAdd = eCFieldElementMultiply.squarePlusProduct(eCFieldElementAdd6, eCFieldElementMultiply4).add(eCFieldElementSquare4).add(eCFieldElementMultiply6);
            }
            return new F2m(curve, eCFieldElementSquare4, eCFieldElementAdd, new ECFieldElement[]{eCFieldElementMultiply6}, this.withCompression);
        }

        @Override // org.spongycastle.math.p135ec.ECPoint
        public ECPoint twicePlus(ECPoint eCPoint) {
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return twice();
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.f207707x;
            if (eCFieldElement.isZero()) {
                return eCPoint;
            }
            if (curve.getCoordinateSystem() != 6) {
                return twice().add(eCPoint);
            }
            ECFieldElement eCFieldElement2 = eCPoint.f207707x;
            ECFieldElement eCFieldElement3 = eCPoint.f207709zs[0];
            if (eCFieldElement2.isZero() || !eCFieldElement3.isOne()) {
                return twice().add(eCPoint);
            }
            ECFieldElement eCFieldElement4 = this.f207708y;
            ECFieldElement eCFieldElement5 = this.f207709zs[0];
            ECFieldElement eCFieldElement6 = eCPoint.f207708y;
            ECFieldElement eCFieldElementSquare = eCFieldElement.square();
            ECFieldElement eCFieldElementSquare2 = eCFieldElement4.square();
            ECFieldElement eCFieldElementSquare3 = eCFieldElement5.square();
            ECFieldElement eCFieldElementAdd = curve.getA().multiply(eCFieldElementSquare3).add(eCFieldElementSquare2).add(eCFieldElement4.multiply(eCFieldElement5));
            ECFieldElement eCFieldElementAddOne = eCFieldElement6.addOne();
            ECFieldElement eCFieldElementMultiplyPlusProduct = curve.getA().add(eCFieldElementAddOne).multiply(eCFieldElementSquare3).add(eCFieldElementSquare2).multiplyPlusProduct(eCFieldElementAdd, eCFieldElementSquare, eCFieldElementSquare3);
            ECFieldElement eCFieldElementMultiply = eCFieldElement2.multiply(eCFieldElementSquare3);
            ECFieldElement eCFieldElementSquare4 = eCFieldElementMultiply.add(eCFieldElementAdd).square();
            if (eCFieldElementSquare4.isZero()) {
                return eCFieldElementMultiplyPlusProduct.isZero() ? eCPoint.twice() : curve.getInfinity();
            }
            if (eCFieldElementMultiplyPlusProduct.isZero()) {
                return new F2m(curve, eCFieldElementMultiplyPlusProduct, curve.getB().sqrt(), this.withCompression);
            }
            ECFieldElement eCFieldElementMultiply2 = eCFieldElementMultiplyPlusProduct.square().multiply(eCFieldElementMultiply);
            ECFieldElement eCFieldElementMultiply3 = eCFieldElementMultiplyPlusProduct.multiply(eCFieldElementSquare4).multiply(eCFieldElementSquare3);
            return new F2m(curve, eCFieldElementMultiply2, eCFieldElementMultiplyPlusProduct.add(eCFieldElementSquare4).square().multiplyPlusProduct(eCFieldElementAdd, eCFieldElementAddOne, eCFieldElementMultiply3), new ECFieldElement[]{eCFieldElementMultiply3}, this.withCompression);
        }

        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(eCCurve, eCFieldElement, eCFieldElement2, false);
        }

        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
            this.withCompression = z;
        }
    }

    public byte[] getEncoded() {
        return getEncoded(this.withCompression);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ECPoint) {
            return equals((ECPoint) obj);
        }
        return false;
    }
}
