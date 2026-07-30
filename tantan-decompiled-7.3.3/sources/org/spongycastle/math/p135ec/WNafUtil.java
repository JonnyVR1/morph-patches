package org.spongycastle.math.p135ec;

import java.math.BigInteger;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WNafUtil {
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, 2305};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final ECPoint[] EMPTY_POINTS = new ECPoint[0];
    public static final String PRECOMP_NAME = "bc_wnaf";

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            wg3.m206174a("'k' must have bitlength < 2^16");
            return null;
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i = iBitLength >> 1;
        int[] iArr = new int[i];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i2 = iBitLength - 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < i2) {
            if (bigIntegerXor.testBit(i4)) {
                iArr[i3] = i5 | ((bigInteger.testBit(i4) ? -1 : 1) << 16);
                i4++;
                i5 = 1;
                i3++;
            } else {
                i5++;
            }
            i4++;
        }
        int i6 = i3 + 1;
        iArr[i3] = 65536 | i5;
        return i > i6 ? trim(iArr, i6) : iArr;
    }

    public static int[] generateCompactWindowNaf(int i, BigInteger bigInteger) {
        if (i == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i < 2 || i > 16) {
            wg3.m206174a("'width' must be in the range [2, 16]");
            return null;
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            wg3.m206174a("'k' must have bitlength < 2^16");
            return null;
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        int iBitLength = (bigInteger.bitLength() / i) + 1;
        int[] iArr = new int[iBitLength];
        int i2 = 1 << i;
        int i3 = i2 - 1;
        int i4 = i2 >>> 1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i5) == z) {
                i5++;
            } else {
                bigInteger = bigInteger.shiftRight(i5);
                int iIntValue = bigInteger.intValue() & i3;
                if (z) {
                    iIntValue++;
                }
                z = (iIntValue & i4) != 0;
                if (z) {
                    iIntValue -= i2;
                }
                if (i6 > 0) {
                    i5--;
                }
                iArr[i6] = i5 | (iIntValue << 16);
                i5 = i;
                i6++;
            }
        }
        return iBitLength > i6 ? trim(iArr, i6) : iArr;
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int iMax = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[iMax];
        BigInteger bigIntegerShiftRight = bigInteger;
        BigInteger bigIntegerShiftRight2 = bigInteger2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if ((i | i2) == 0 && bigIntegerShiftRight.bitLength() <= i3 && bigIntegerShiftRight2.bitLength() <= i3) {
                break;
            }
            int iIntValue = (bigIntegerShiftRight.intValue() >>> i3) + i;
            int i5 = iIntValue & 7;
            int iIntValue2 = (bigIntegerShiftRight2.intValue() >>> i3) + i2;
            int i6 = iIntValue2 & 7;
            int i7 = iIntValue & 1;
            if (i7 != 0) {
                i7 -= iIntValue & 2;
                if (i5 + i7 == 4 && (iIntValue2 & 3) == 2) {
                    i7 = -i7;
                }
            }
            int i8 = iIntValue2 & 1;
            if (i8 != 0) {
                i8 -= iIntValue2 & 2;
                if (i6 + i8 == 4 && (iIntValue & 3) == 2) {
                    i8 = -i8;
                }
            }
            if ((i << 1) == i7 + 1) {
                i ^= 1;
            }
            if ((i2 << 1) == i8 + 1) {
                i2 ^= 1;
            }
            i3++;
            if (i3 == 30) {
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(30);
                bigIntegerShiftRight2 = bigIntegerShiftRight2.shiftRight(30);
                i3 = 0;
            }
            bArr[i4] = (byte) ((i8 & 15) | (i7 << 4));
            i4++;
        }
        return iMax > i4 ? trim(bArr, i4) : bArr;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i = iBitLength - 1;
        byte[] bArr = new byte[i];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i2 = 1;
        while (i2 < i) {
            if (bigIntegerXor.testBit(i2)) {
                bArr[i2 - 1] = (byte) (bigInteger.testBit(i2) ? -1 : 1);
                i2++;
            }
            i2++;
        }
        bArr[iBitLength - 2] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i, BigInteger bigInteger) {
        if (i == 2) {
            return generateNaf(bigInteger);
        }
        if (i < 2 || i > 8) {
            wg3.m206174a("'width' must be in the range [2, 8]");
            return null;
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        int iBitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[iBitLength];
        int i2 = 1 << i;
        int i3 = i2 - 1;
        int i4 = i2 >>> 1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i5) == z) {
                i5++;
            } else {
                bigInteger = bigInteger.shiftRight(i5);
                int iIntValue = bigInteger.intValue() & i3;
                if (z) {
                    iIntValue++;
                }
                z = (iIntValue & i4) != 0;
                if (z) {
                    iIntValue -= i2;
                }
                if (i6 > 0) {
                    i5--;
                }
                int i7 = i6 + i5;
                bArr[i7] = (byte) iIntValue;
                i6 = i7 + 1;
                i5 = i;
            }
        }
        return iBitLength > i6 ? trim(bArr, i6) : bArr;
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, PRECOMP_NAME));
    }

    public static int getWindowSize(int i, int[] iArr) {
        int i2 = 0;
        while (i2 < iArr.length && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    public static ECPoint mapPointWithPrecomp(ECPoint eCPoint, int i, boolean z, ECPointMap eCPointMap) {
        ECCurve curve = eCPoint.getCurve();
        WNafPreCompInfo wNafPreCompInfoPrecompute = precompute(eCPoint, i, z);
        ECPoint map = eCPointMap.map(eCPoint);
        WNafPreCompInfo wNafPreCompInfo = getWNafPreCompInfo(curve.getPreCompInfo(map, PRECOMP_NAME));
        ECPoint twice = wNafPreCompInfoPrecompute.getTwice();
        if (twice != null) {
            wNafPreCompInfo.setTwice(eCPointMap.map(twice));
        }
        ECPoint[] preComp = wNafPreCompInfoPrecompute.getPreComp();
        int length = preComp.length;
        ECPoint[] eCPointArr = new ECPoint[length];
        for (int i2 = 0; i2 < preComp.length; i2++) {
            eCPointArr[i2] = eCPointMap.map(preComp[i2]);
        }
        wNafPreCompInfo.setPreComp(eCPointArr);
        if (z) {
            ECPoint[] eCPointArr2 = new ECPoint[length];
            for (int i3 = 0; i3 < length; i3++) {
                eCPointArr2[i3] = eCPointArr[i3].negate();
            }
            wNafPreCompInfo.setPreCompNeg(eCPointArr2);
        }
        curve.setPreCompInfo(map, PRECOMP_NAME, wNafPreCompInfo);
        return map;
    }

    public static WNafPreCompInfo precompute(ECPoint eCPoint, int i, boolean z) {
        int length;
        int i2;
        int coordinateSystem;
        ECCurve curve = eCPoint.getCurve();
        WNafPreCompInfo wNafPreCompInfo = getWNafPreCompInfo(curve.getPreCompInfo(eCPoint, PRECOMP_NAME));
        int length2 = 0;
        int iMax = 1 << Math.max(0, i - 2);
        ECPoint[] preComp = wNafPreCompInfo.getPreComp();
        if (preComp == null) {
            preComp = EMPTY_POINTS;
            length = 0;
        } else {
            length = preComp.length;
        }
        if (length < iMax) {
            preComp = resizeTable(preComp, iMax);
            if (iMax == 1) {
                preComp[0] = eCPoint.normalize();
            } else {
                if (length == 0) {
                    preComp[0] = eCPoint;
                    i2 = 1;
                } else {
                    i2 = length;
                }
                ECFieldElement zCoord = null;
                if (iMax == 2) {
                    preComp[1] = eCPoint.threeTimes();
                } else {
                    ECPoint twice = wNafPreCompInfo.getTwice();
                    ECPoint eCPointAdd = preComp[i2 - 1];
                    if (twice == null) {
                        twice = preComp[0].twice();
                        wNafPreCompInfo.setTwice(twice);
                        if (ECAlgorithms.isFpCurve(curve) && curve.getFieldSize() >= 64 && ((coordinateSystem = curve.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                            zCoord = twice.getZCoord(0);
                            twice = curve.createPoint(twice.getXCoord().toBigInteger(), twice.getYCoord().toBigInteger());
                            ECFieldElement eCFieldElementSquare = zCoord.square();
                            eCPointAdd = eCPointAdd.scaleX(eCFieldElementSquare).scaleY(eCFieldElementSquare.multiply(zCoord));
                            if (length == 0) {
                                preComp[0] = eCPointAdd;
                            }
                        }
                    }
                    while (i2 < iMax) {
                        eCPointAdd = eCPointAdd.add(twice);
                        preComp[i2] = eCPointAdd;
                        i2++;
                    }
                }
                curve.normalizeAll(preComp, length, iMax - length, zCoord);
            }
        }
        wNafPreCompInfo.setPreComp(preComp);
        if (z) {
            ECPoint[] preCompNeg = wNafPreCompInfo.getPreCompNeg();
            if (preCompNeg == null) {
                preCompNeg = new ECPoint[iMax];
            } else {
                length2 = preCompNeg.length;
                if (length2 < iMax) {
                    preCompNeg = resizeTable(preCompNeg, iMax);
                }
            }
            while (length2 < iMax) {
                preCompNeg[length2] = preComp[length2].negate();
                length2++;
            }
            wNafPreCompInfo.setPreCompNeg(preCompNeg);
        }
        curve.setPreCompInfo(eCPoint, PRECOMP_NAME, wNafPreCompInfo);
        return wNafPreCompInfo;
    }

    private static ECPoint[] resizeTable(ECPoint[] eCPointArr, int i) {
        ECPoint[] eCPointArr2 = new ECPoint[i];
        System.arraycopy(eCPointArr, 0, eCPointArr2, 0, eCPointArr.length);
        return eCPointArr2;
    }

    private static byte[] trim(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    private static int[] trim(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo != null && (preCompInfo instanceof WNafPreCompInfo)) {
            return (WNafPreCompInfo) preCompInfo;
        }
        return new WNafPreCompInfo();
    }

    public static int getWindowSize(int i) {
        return getWindowSize(i, DEFAULT_WINDOW_SIZE_CUTOFFS);
    }
}
