package org.spongycastle.math.p131ec;

import java.math.BigInteger;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
class Tnaf {
    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte POW_2_WIDTH = 16;
    public static final byte WIDTH = 4;
    public static final ZTauElement[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final ZTauElement[] alpha1;
    public static final byte[][] alpha1Tnaf;

    static {
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger bigIntegerNegate = bigInteger.negate();
        MINUS_ONE = bigIntegerNegate;
        MINUS_TWO = ECConstants.TWO.negate();
        BigInteger bigIntegerNegate2 = ECConstants.THREE.negate();
        MINUS_THREE = bigIntegerNegate2;
        BigInteger bigInteger2 = ECConstants.ZERO;
        alpha0 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger2), null, new ZTauElement(bigIntegerNegate2, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigIntegerNegate), null, new ZTauElement(bigInteger, bigIntegerNegate), null};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger2), null, new ZTauElement(bigIntegerNegate2, bigInteger), null, new ZTauElement(bigIntegerNegate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i4);
        if (bigIntegerAdd.testBit(i4 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(bigIntegerShiftRight, i2);
    }

    public static BigInteger[] getLucas(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigIntegerSubtract;
        if (b != 1 && b != -1) {
            ig3.m135964a("mu must be 1 or -1");
            return null;
        }
        if (z) {
            bigInteger = ECConstants.TWO;
            bigIntegerSubtract = BigInteger.valueOf(b);
        } else {
            bigInteger = ECConstants.ZERO;
            bigIntegerSubtract = ECConstants.ONE;
        }
        int i2 = 1;
        while (i2 < i) {
            i2++;
            BigInteger bigInteger2 = bigIntegerSubtract;
            bigIntegerSubtract = (b == 1 ? bigIntegerSubtract : bigIntegerSubtract.negate()).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger2;
        }
        return new BigInteger[]{bigInteger, bigIntegerSubtract};
    }

    public static byte getMu(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return abstractF2m.getA().isZero() ? (byte) -1 : (byte) 1;
        }
        ig3.m135964a("No Koblitz curve (ABC), TNAF multiplication not possible");
        return (byte) 0;
    }

    public static ECPoint.AbstractF2m[] getPreComp(ECPoint.AbstractF2m abstractF2m, byte b) {
        byte[][] bArr = b == 0 ? alpha0Tnaf : alpha1Tnaf;
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[(bArr.length + 1) >>> 1];
        abstractF2mArr[0] = abstractF2m;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            abstractF2mArr[i >>> 1] = multiplyFromTnaf(abstractF2m, bArr[i]);
        }
        abstractF2m.getCurve().normalizeAll(abstractF2mArr);
        return abstractF2mArr;
    }

    public static int getShiftsForCofactor(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(ECConstants.TWO)) {
                return 1;
            }
            if (bigInteger.equals(ECConstants.FOUR)) {
                return 2;
            }
        }
        ig3.m135964a("h (Cofactor) must be 2 or 4");
        return 0;
    }

    public static BigInteger[] getSi(ECCurve.AbstractF2m abstractF2m) {
        if (!abstractF2m.isKoblitz()) {
            ig3.m135964a("si is defined for Koblitz curves only");
            return null;
        }
        int fieldSize = abstractF2m.getFieldSize();
        int iIntValue = abstractF2m.getA().toBigInteger().intValue();
        byte mu = getMu(iIntValue);
        int shiftsForCofactor = getShiftsForCofactor(abstractF2m.getCofactor());
        BigInteger[] lucas = getLucas(mu, (fieldSize + 3) - iIntValue, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        BigInteger bigInteger = ECConstants.ONE;
        return new BigInteger[]{bigInteger.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    public static BigInteger getTw(byte b, int i) {
        if (i == 4) {
            return b == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] lucas = getLucas(b, i, false);
        BigInteger bit = ECConstants.ZERO.setBit(i);
        return ECConstants.TWO.multiply(lucas[0]).multiply(lucas[1].modInverse(bit)).mod(bit);
    }

    public static ECPoint.AbstractF2m multiplyFromTnaf(ECPoint.AbstractF2m abstractF2m, byte[] bArr) {
        ECPoint.AbstractF2m abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.negate();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b = bArr[length];
            if (b != 0) {
                abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m2.tauPow(i).add(b > 0 ? abstractF2m : abstractF2m3);
                i = 0;
            }
        }
        return i > 0 ? abstractF2m2.tauPow(i) : abstractF2m2;
    }

    public static ECPoint.AbstractF2m multiplyRTnaf(ECPoint.AbstractF2m abstractF2m, BigInteger bigInteger) {
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int fieldSize = abstractF2m2.getFieldSize();
        int iIntValue = abstractF2m2.getA().toBigInteger().intValue();
        return multiplyTnaf(abstractF2m, partModReduction(bigInteger, fieldSize, (byte) iIntValue, abstractF2m2.getSi(), getMu(iIntValue), (byte) 10));
    }

    public static ECPoint.AbstractF2m multiplyTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement) {
        return multiplyFromTnaf(abstractF2m, tauAdicNaf(getMu(((ECCurve.AbstractF2m) abstractF2m.getCurve()).getA()), zTauElement));
    }

    public static BigInteger norm(byte b, ZTauElement zTauElement) {
        BigInteger bigInteger = zTauElement.f206788u;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger);
        BigInteger bigIntegerMultiply2 = zTauElement.f206788u.multiply(zTauElement.f206789v);
        BigInteger bigInteger2 = zTauElement.f206789v;
        BigInteger bigIntegerShiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b == 1) {
            return bigIntegerMultiply.add(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        if (b == -1) {
            return bigIntegerMultiply.subtract(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        ig3.m135964a("mu must be 1 or -1");
        return null;
    }

    public static ZTauElement partModReduction(BigInteger bigInteger, int i, byte b, BigInteger[] bigIntegerArr, byte b2, byte b3) {
        BigInteger bigIntegerAdd = b2 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = getLucas(b2, i, true)[1];
        ZTauElement zTauElementRound = round(approximateDivisionByN(bigInteger, bigIntegerArr[0], bigInteger2, b, i, b3), approximateDivisionByN(bigInteger, bigIntegerArr[1], bigInteger2, b, i, b3), b2);
        return new ZTauElement(bigInteger.subtract(bigIntegerAdd.multiply(zTauElementRound.f206788u)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(zTauElementRound.f206789v)), bigIntegerArr[1].multiply(zTauElementRound.f206788u).subtract(bigIntegerArr[0].multiply(zTauElementRound.f206789v)));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r5.compareTo(r9) >= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.spongycastle.math.p131ec.ZTauElement round(org.spongycastle.math.p131ec.SimpleBigDecimal r8, org.spongycastle.math.p131ec.SimpleBigDecimal r9, byte r10) {
        /*
            int r0 = r8.getScale()
            int r1 = r9.getScale()
            r2 = 0
            if (r1 != r0) goto La7
            r0 = -1
            r1 = 1
            if (r10 == r1) goto L18
            if (r10 != r0) goto L12
            goto L18
        L12:
            java.lang.String r8 = "mu must be 1 or -1"
            p149l.ig3.m135964a(r8)
            return r2
        L18:
            java.math.BigInteger r2 = r8.round()
            java.math.BigInteger r3 = r9.round()
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r8.subtract(r2)
            org.spongycastle.math.ec.SimpleBigDecimal r9 = r9.subtract(r3)
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r8.add(r8)
            if (r10 != r1) goto L33
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r4.add(r9)
            goto L37
        L33:
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r4.subtract(r9)
        L37:
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r9.add(r9)
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r5.add(r9)
            org.spongycastle.math.ec.SimpleBigDecimal r9 = r5.add(r9)
            if (r10 != r1) goto L4e
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r8.subtract(r5)
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r8.add(r9)
            goto L56
        L4e:
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r8.add(r5)
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r8.subtract(r9)
        L56:
            java.math.BigInteger r9 = org.spongycastle.math.p131ec.ECConstants.ONE
            int r6 = r4.compareTo(r9)
            r7 = 0
            if (r6 < 0) goto L68
            java.math.BigInteger r6 = org.spongycastle.math.p131ec.Tnaf.MINUS_ONE
            int r6 = r5.compareTo(r6)
            if (r6 >= 0) goto L74
            goto L70
        L68:
            java.math.BigInteger r1 = org.spongycastle.math.p131ec.ECConstants.TWO
            int r1 = r8.compareTo(r1)
            if (r1 < 0) goto L73
        L70:
            r1 = r7
            r7 = r10
            goto L74
        L73:
            r1 = r7
        L74:
            java.math.BigInteger r6 = org.spongycastle.math.p131ec.Tnaf.MINUS_ONE
            int r4 = r4.compareTo(r6)
            if (r4 >= 0) goto L86
            int r8 = r5.compareTo(r9)
            if (r8 < 0) goto L8f
        L82:
            int r8 = -r10
            byte r7 = (byte) r8
        L84:
            r0 = r1
            goto L8f
        L86:
            java.math.BigInteger r9 = org.spongycastle.math.p131ec.Tnaf.MINUS_TWO
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L84
            goto L82
        L8f:
            long r8 = (long) r0
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r2.add(r8)
            long r9 = (long) r7
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r9 = r3.add(r9)
            org.spongycastle.math.ec.ZTauElement r10 = new org.spongycastle.math.ec.ZTauElement
            r10.<init>(r8, r9)
            return r10
        La7:
            java.lang.String r8 = "lambda0 and lambda1 do not have same scale"
            p149l.ig3.m135964a(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.math.p131ec.Tnaf.round(org.spongycastle.math.ec.SimpleBigDecimal, org.spongycastle.math.ec.SimpleBigDecimal, byte):org.spongycastle.math.ec.ZTauElement");
    }

    public static ECPoint.AbstractF2m tau(ECPoint.AbstractF2m abstractF2m) {
        return abstractF2m.tau();
    }

    public static byte[] tauAdicNaf(byte b, ZTauElement zTauElement) {
        if (b != 1 && b != -1) {
            ig3.m135964a("mu must be 1 or -1");
            return null;
        }
        int iBitLength = norm(b, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 : 34];
        BigInteger bigIntegerClearBit = zTauElement.f206788u;
        BigInteger bigInteger = zTauElement.f206789v;
        int i = 0;
        int i2 = 0;
        while (true) {
            BigInteger bigInteger2 = ECConstants.ZERO;
            if (bigIntegerClearBit.equals(bigInteger2) && bigInteger.equals(bigInteger2)) {
                int i3 = i + 1;
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, 0, bArr2, 0, i3);
                return bArr2;
            }
            if (bigIntegerClearBit.testBit(0)) {
                byte bIntValue = (byte) ECConstants.TWO.subtract(bigIntegerClearBit.subtract(bigInteger.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                bArr[i2] = bIntValue;
                bigIntegerClearBit = bIntValue == 1 ? bigIntegerClearBit.clearBit(0) : bigIntegerClearBit.add(ECConstants.ONE);
                i = i2;
            } else {
                bArr[i2] = 0;
            }
            BigInteger bigIntegerShiftRight = bigIntegerClearBit.shiftRight(1);
            BigInteger bigIntegerAdd = b == 1 ? bigInteger.add(bigIntegerShiftRight) : bigInteger.subtract(bigIntegerShiftRight);
            BigInteger bigIntegerNegate = bigIntegerClearBit.shiftRight(1).negate();
            i2++;
            bigIntegerClearBit = bigIntegerAdd;
            bigInteger = bigIntegerNegate;
        }
    }

    public static byte[] tauAdicWNaf(byte b, ZTauElement zTauElement, byte b2, BigInteger bigInteger, BigInteger bigInteger2, ZTauElement[] zTauElementArr) {
        boolean z;
        if (b != 1 && b != -1) {
            ig3.m135964a("mu must be 1 or -1");
            return null;
        }
        int iBitLength = norm(b, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 + b2 : b2 + 34];
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(1);
        BigInteger bigIntegerAdd = zTauElement.f206788u;
        BigInteger bigIntegerAdd2 = zTauElement.f206789v;
        int i = 0;
        while (true) {
            BigInteger bigInteger3 = ECConstants.ZERO;
            if (bigIntegerAdd.equals(bigInteger3) && bigIntegerAdd2.equals(bigInteger3)) {
                return bArr;
            }
            if (bigIntegerAdd.testBit(0)) {
                BigInteger bigIntegerMod = bigIntegerAdd.add(bigIntegerAdd2.multiply(bigInteger2)).mod(bigInteger);
                byte bIntValue = (byte) (bigIntegerMod.compareTo(bigIntegerShiftRight) >= 0 ? bigIntegerMod.subtract(bigInteger).intValue() : bigIntegerMod.intValue());
                bArr[i] = bIntValue;
                if (bIntValue < 0) {
                    bIntValue = (byte) (-bIntValue);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bigIntegerAdd = bigIntegerAdd.subtract(zTauElementArr[bIntValue].f206788u);
                    bigIntegerAdd2 = bigIntegerAdd2.subtract(zTauElementArr[bIntValue].f206789v);
                } else {
                    bigIntegerAdd = bigIntegerAdd.add(zTauElementArr[bIntValue].f206788u);
                    bigIntegerAdd2 = bigIntegerAdd2.add(zTauElementArr[bIntValue].f206789v);
                }
            } else {
                bArr[i] = 0;
            }
            BigInteger bigIntegerAdd3 = b == 1 ? bigIntegerAdd2.add(bigIntegerAdd.shiftRight(1)) : bigIntegerAdd2.subtract(bigIntegerAdd.shiftRight(1));
            BigInteger bigIntegerNegate = bigIntegerAdd.shiftRight(1).negate();
            i++;
            bigIntegerAdd = bigIntegerAdd3;
            bigIntegerAdd2 = bigIntegerNegate;
        }
    }

    public static byte getMu(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    public static byte getMu(ECFieldElement eCFieldElement) {
        return (byte) (eCFieldElement.isZero() ? -1 : 1);
    }

    public static SimpleBigDecimal norm(byte b, SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2) {
        SimpleBigDecimal simpleBigDecimalMultiply = simpleBigDecimal.multiply(simpleBigDecimal);
        SimpleBigDecimal simpleBigDecimalMultiply2 = simpleBigDecimal.multiply(simpleBigDecimal2);
        SimpleBigDecimal simpleBigDecimalShiftLeft = simpleBigDecimal2.multiply(simpleBigDecimal2).shiftLeft(1);
        if (b == 1) {
            return simpleBigDecimalMultiply.add(simpleBigDecimalMultiply2).add(simpleBigDecimalShiftLeft);
        }
        if (b == -1) {
            return simpleBigDecimalMultiply.subtract(simpleBigDecimalMultiply2).add(simpleBigDecimalShiftLeft);
        }
        ig3.m135964a("mu must be 1 or -1");
        return null;
    }

    public static BigInteger[] getSi(int i, int i2, BigInteger bigInteger) {
        byte mu = getMu(i2);
        int shiftsForCofactor = getShiftsForCofactor(bigInteger);
        BigInteger[] lucas = getLucas(mu, (i + 3) - i2, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        BigInteger bigInteger2 = ECConstants.ONE;
        return new BigInteger[]{bigInteger2.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger2.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }
}
