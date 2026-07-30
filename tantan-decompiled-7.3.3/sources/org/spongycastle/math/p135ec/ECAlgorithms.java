package org.spongycastle.math.p135ec;

import java.math.BigInteger;
import org.spongycastle.math.field.FiniteField;
import org.spongycastle.math.field.PolynomialExtensionField;
import org.spongycastle.math.p135ec.endo.ECEndomorphism;
import org.spongycastle.math.p135ec.endo.GLVEndomorphism;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class ECAlgorithms {
    public static ECPoint implShamirsTrickJsf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        ECPoint infinity = curve.getInfinity();
        ECPoint[] eCPointArr = {eCPoint2, eCPoint.subtract(eCPoint2), eCPoint, eCPoint.add(eCPoint2)};
        curve.normalizeAll(eCPointArr);
        ECPoint[] eCPointArr2 = {eCPointArr[3].negate(), eCPointArr[2].negate(), eCPointArr[1].negate(), eCPointArr[0].negate(), infinity, eCPointArr[0], eCPointArr[1], eCPointArr[2], eCPointArr[3]};
        byte[] bArrGenerateJSF = WNafUtil.generateJSF(bigInteger, bigInteger2);
        int length = bArrGenerateJSF.length;
        while (true) {
            length--;
            if (length < 0) {
                return infinity;
            }
            byte b = bArrGenerateJSF[length];
            infinity = infinity.twicePlus(eCPointArr2[(((b << 24) >> 28) * 3) + 4 + ((b << 28) >> 28)]);
        }
    }

    public static ECPoint implShamirsTrickWNaf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(bigIntegerAbs.bitLength())));
        int iMax2 = Math.max(2, Math.min(16, WNafUtil.getWindowSize(bigIntegerAbs2.bitLength())));
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, iMax, true);
        WNafPreCompInfo wNafPreCompInfoPrecompute2 = WNafUtil.precompute(eCPoint2, iMax2, true);
        return implShamirsTrickWNaf(z ? wNafPreCompInfoPrecompute.getPreCompNeg() : wNafPreCompInfoPrecompute.getPreComp(), z ? wNafPreCompInfoPrecompute.getPreComp() : wNafPreCompInfoPrecompute.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax, bigIntegerAbs), z2 ? wNafPreCompInfoPrecompute2.getPreCompNeg() : wNafPreCompInfoPrecompute2.getPreComp(), z2 ? wNafPreCompInfoPrecompute2.getPreComp() : wNafPreCompInfoPrecompute2.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax2, bigIntegerAbs2));
    }

    public static ECPoint implSumOfMultiplies(ECPoint[] eCPointArr, ECPointMap eCPointMap, BigInteger[] bigIntegerArr) {
        int length = eCPointArr.length;
        int i = length << 1;
        boolean[] zArr = new boolean[i];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[i];
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            BigInteger bigInteger = bigIntegerArr[i3];
            zArr[i3] = bigInteger.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i4];
            zArr[i4] = bigInteger2.signum() < 0;
            BigInteger bigIntegerAbs2 = bigInteger2.abs();
            int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
            ECPoint eCPoint = eCPointArr[i2];
            ECPoint eCPointMapPointWithPrecomp = WNafUtil.mapPointWithPrecomp(eCPoint, iMax, true, eCPointMap);
            wNafPreCompInfoArr[i3] = WNafUtil.getWNafPreCompInfo(eCPoint);
            wNafPreCompInfoArr[i4] = WNafUtil.getWNafPreCompInfo(eCPointMapPointWithPrecomp);
            bArr[i3] = WNafUtil.generateWindowNaf(iMax, bigIntegerAbs);
            bArr[i4] = WNafUtil.generateWindowNaf(iMax, bigIntegerAbs2);
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    public static ECPoint implSumOfMultipliesGLV(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr, GLVEndomorphism gLVEndomorphism) {
        BigInteger order = eCPointArr[0].getCurve().getOrder();
        int length = eCPointArr.length;
        int i = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            BigInteger[] bigIntegerArrDecomposeScalar = gLVEndomorphism.decomposeScalar(bigIntegerArr[i3].mod(order));
            int i4 = i2 + 1;
            bigIntegerArr2[i2] = bigIntegerArrDecomposeScalar[0];
            i2 += 2;
            bigIntegerArr2[i4] = bigIntegerArrDecomposeScalar[1];
        }
        ECPointMap pointMap = gLVEndomorphism.getPointMap();
        if (gLVEndomorphism.hasEfficientPointMap()) {
            return implSumOfMultiplies(eCPointArr, pointMap, bigIntegerArr2);
        }
        ECPoint[] eCPointArr2 = new ECPoint[i];
        int i5 = 0;
        for (ECPoint eCPoint : eCPointArr) {
            ECPoint map = pointMap.map(eCPoint);
            int i6 = i5 + 1;
            eCPointArr2[i5] = eCPoint;
            i5 += 2;
            eCPointArr2[i6] = map;
        }
        return implSumOfMultiplies(eCPointArr2, bigIntegerArr2);
    }

    public static ECPoint importPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.importPoint(eCPoint);
        }
        wg3.m206174a("Point must be on the same curve");
        return null;
    }

    public static boolean isF2mCurve(ECCurve eCCurve) {
        return isF2mField(eCCurve.getField());
    }

    public static boolean isF2mField(FiniteField finiteField) {
        return finiteField.getDimension() > 1 && finiteField.getCharacteristic().equals(ECConstants.TWO) && (finiteField instanceof PolynomialExtensionField);
    }

    public static boolean isFpCurve(ECCurve eCCurve) {
        return isFpField(eCCurve.getField());
    }

    public static boolean isFpField(FiniteField finiteField) {
        return finiteField.getDimension() == 1;
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i, int i2, ECFieldElement eCFieldElement) {
        ECFieldElement[] eCFieldElementArr2 = new ECFieldElement[i2];
        int i3 = 0;
        eCFieldElementArr2[0] = eCFieldElementArr[i];
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2) {
                break;
            }
            eCFieldElementArr2[i4] = eCFieldElementArr2[i3].multiply(eCFieldElementArr[i + i4]);
            i3 = i4;
        }
        if (eCFieldElement != null) {
            eCFieldElementArr2[i3] = eCFieldElementArr2[i3].multiply(eCFieldElement);
        }
        ECFieldElement eCFieldElementInvert = eCFieldElementArr2[i3].invert();
        while (i3 > 0) {
            int i5 = i3 - 1;
            int i6 = i3 + i;
            ECFieldElement eCFieldElement2 = eCFieldElementArr[i6];
            eCFieldElementArr[i6] = eCFieldElementArr2[i5].multiply(eCFieldElementInvert);
            eCFieldElementInvert = eCFieldElementInvert.multiply(eCFieldElement2);
            i3 = i5;
        }
        eCFieldElementArr[i] = eCFieldElementInvert;
    }

    public static ECPoint referenceMultiply(ECPoint eCPoint, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                infinity = eCPoint;
            }
            for (int i = 1; i < iBitLength; i++) {
                eCPoint = eCPoint.twice();
                if (bigIntegerAbs.testBit(i)) {
                    infinity = infinity.add(eCPoint);
                }
            }
        }
        return bigInteger.signum() < 0 ? infinity.negate() : infinity;
    }

    public static ECPoint shamirsTrick(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        return validatePoint(implShamirsTrickJsf(eCPoint, bigInteger, importPoint(eCPoint.getCurve(), eCPoint2), bigInteger2));
    }

    public static ECPoint sumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        if (eCPointArr != null && bigIntegerArr != null && eCPointArr.length == bigIntegerArr.length) {
            if (eCPointArr.length >= 1) {
                int length = eCPointArr.length;
                if (length == 1) {
                    return eCPointArr[0].multiply(bigIntegerArr[0]);
                }
                if (length == 2) {
                    return sumOfTwoMultiplies(eCPointArr[0], bigIntegerArr[0], eCPointArr[1], bigIntegerArr[1]);
                }
                ECPoint eCPoint = eCPointArr[0];
                ECCurve curve = eCPoint.getCurve();
                ECPoint[] eCPointArr2 = new ECPoint[length];
                eCPointArr2[0] = eCPoint;
                for (int i = 1; i < length; i++) {
                    eCPointArr2[i] = importPoint(curve, eCPointArr[i]);
                }
                ECEndomorphism endomorphism = curve.getEndomorphism();
                return endomorphism instanceof GLVEndomorphism ? validatePoint(implSumOfMultipliesGLV(eCPointArr2, bigIntegerArr, (GLVEndomorphism) endomorphism)) : validatePoint(implSumOfMultiplies(eCPointArr2, bigIntegerArr));
            }
        }
        wg3.m206174a("point and scalar arrays should be non-null, and of equal, non-zero, length");
        return null;
    }

    public static ECPoint sumOfTwoMultiplies(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        ECPoint eCPointImportPoint = importPoint(curve, eCPoint2);
        if ((curve instanceof ECCurve.AbstractF2m) && ((ECCurve.AbstractF2m) curve).isKoblitz()) {
            return validatePoint(eCPoint.multiply(bigInteger).add(eCPointImportPoint.multiply(bigInteger2)));
        }
        ECEndomorphism endomorphism = curve.getEndomorphism();
        return endomorphism instanceof GLVEndomorphism ? validatePoint(implSumOfMultipliesGLV(new ECPoint[]{eCPoint, eCPointImportPoint}, new BigInteger[]{bigInteger, bigInteger2}, (GLVEndomorphism) endomorphism)) : validatePoint(implShamirsTrickWNaf(eCPoint, bigInteger, eCPointImportPoint, bigInteger2));
    }

    public static ECPoint validatePoint(ECPoint eCPoint) {
        if (eCPoint.isValid()) {
            return eCPoint;
        }
        wg3.m206174a("Invalid point");
        return null;
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i, int i2) {
        montgomeryTrick(eCFieldElementArr, i, i2, null);
    }

    public static ECPoint implSumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        int length = eCPointArr.length;
        boolean[] zArr = new boolean[length];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[length];
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < length; i++) {
            BigInteger bigInteger = bigIntegerArr[i];
            zArr[i] = bigInteger.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(bigIntegerAbs.bitLength())));
            wNafPreCompInfoArr[i] = WNafUtil.precompute(eCPointArr[i], iMax, true);
            bArr[i] = WNafUtil.generateWindowNaf(iMax, bigIntegerAbs);
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    private static ECPoint implSumOfMultiplies(boolean[] zArr, WNafPreCompInfo[] wNafPreCompInfoArr, byte[][] bArr) {
        int length = bArr.length;
        int iMax = 0;
        for (byte[] bArr2 : bArr) {
            iMax = Math.max(iMax, bArr2.length);
        }
        ECPoint infinity = wNafPreCompInfoArr[0].getPreComp()[0].getCurve().getInfinity();
        int i = iMax - 1;
        int i2 = 0;
        ECPoint eCPointTwicePlus = infinity;
        while (i >= 0) {
            ECPoint eCPointAdd = infinity;
            for (int i3 = 0; i3 < length; i3++) {
                byte[] bArr3 = bArr[i3];
                byte b = i < bArr3.length ? bArr3[i] : (byte) 0;
                if (b != 0) {
                    int iAbs = Math.abs((int) b);
                    WNafPreCompInfo wNafPreCompInfo = wNafPreCompInfoArr[i3];
                    eCPointAdd = eCPointAdd.add(((b < 0) == zArr[i3] ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg())[iAbs >>> 1]);
                }
            }
            if (eCPointAdd == infinity) {
                i2++;
            } else {
                if (i2 > 0) {
                    eCPointTwicePlus = eCPointTwicePlus.timesPow2(i2);
                    i2 = 0;
                }
                eCPointTwicePlus = eCPointTwicePlus.twicePlus(eCPointAdd);
            }
            i--;
        }
        return i2 > 0 ? eCPointTwicePlus.timesPow2(i2) : eCPointTwicePlus;
    }

    public static ECPoint implShamirsTrickWNaf(ECPoint eCPoint, BigInteger bigInteger, ECPointMap eCPointMap, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
        ECPoint eCPointMapPointWithPrecomp = WNafUtil.mapPointWithPrecomp(eCPoint, iMax, true, eCPointMap);
        WNafPreCompInfo wNafPreCompInfo = WNafUtil.getWNafPreCompInfo(eCPoint);
        WNafPreCompInfo wNafPreCompInfo2 = WNafUtil.getWNafPreCompInfo(eCPointMapPointWithPrecomp);
        return implShamirsTrickWNaf(z ? wNafPreCompInfo.getPreCompNeg() : wNafPreCompInfo.getPreComp(), z ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax, bigIntegerAbs), z2 ? wNafPreCompInfo2.getPreCompNeg() : wNafPreCompInfo2.getPreComp(), z2 ? wNafPreCompInfo2.getPreComp() : wNafPreCompInfo2.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax, bigIntegerAbs2));
    }

    private static ECPoint implShamirsTrickWNaf(ECPoint[] eCPointArr, ECPoint[] eCPointArr2, byte[] bArr, ECPoint[] eCPointArr3, ECPoint[] eCPointArr4, byte[] bArr2) {
        ECPoint eCPointAdd;
        int iMax = Math.max(bArr.length, bArr2.length);
        ECPoint infinity = eCPointArr[0].getCurve().getInfinity();
        int i = iMax - 1;
        int i2 = 0;
        ECPoint eCPointTwicePlus = infinity;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : (byte) 0;
            byte b2 = i < bArr2.length ? bArr2[i] : (byte) 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    eCPointAdd = infinity.add((b < 0 ? eCPointArr2 : eCPointArr)[Math.abs((int) b) >>> 1]);
                } else {
                    eCPointAdd = infinity;
                }
                if (b2 != 0) {
                    eCPointAdd = eCPointAdd.add((b2 < 0 ? eCPointArr4 : eCPointArr3)[Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    eCPointTwicePlus = eCPointTwicePlus.timesPow2(i2);
                    i2 = 0;
                }
                eCPointTwicePlus = eCPointTwicePlus.twicePlus(eCPointAdd);
            }
            i--;
        }
        return i2 > 0 ? eCPointTwicePlus.timesPow2(i2) : eCPointTwicePlus;
    }
}
