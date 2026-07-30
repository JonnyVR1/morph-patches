package org.spongycastle.pqc.crypto.mceliece;

import java.math.BigInteger;
import org.spongycastle.pqc.math.linearalgebra.BigIntUtils;
import org.spongycastle.pqc.math.linearalgebra.GF2Vector;
import org.spongycastle.pqc.math.linearalgebra.IntegerFunctions;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
final class Conversions {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private Conversions() {
    }

    public static byte[] decode(int i, int i2, GF2Vector gF2Vector) {
        if (gF2Vector.getLength() != i || gF2Vector.getHammingWeight() != i2) {
            wg3.m206174a("vector has wrong length or hamming weight");
            return null;
        }
        int[] vecArray = gF2Vector.getVecArray();
        BigInteger bigIntegerBinomial = IntegerFunctions.binomial(i, i2);
        BigInteger bigIntegerAdd = ZERO;
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            bigIntegerBinomial = bigIntegerBinomial.multiply(BigInteger.valueOf(i3 - i2)).divide(BigInteger.valueOf(i3));
            i3--;
            if ((vecArray[i4 >> 5] & (1 << (i4 & 31))) != 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerBinomial);
                int i5 = i2 - 1;
                bigIntegerBinomial = i3 == i5 ? ONE : bigIntegerBinomial.multiply(BigInteger.valueOf(i2)).divide(BigInteger.valueOf(i3 - i5));
                i2 = i5;
            }
        }
        return BigIntUtils.toMinimalByteArray(bigIntegerAdd);
    }

    public static GF2Vector encode(int i, int i2, byte[] bArr) {
        if (i < i2) {
            wg3.m206174a("n < t");
            return null;
        }
        BigInteger bigIntegerBinomial = IntegerFunctions.binomial(i, i2);
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(bigIntegerBinomial) >= 0) {
            wg3.m206174a("Encoded number too large.");
            return null;
        }
        GF2Vector gF2Vector = new GF2Vector(i);
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            bigIntegerBinomial = bigIntegerBinomial.multiply(BigInteger.valueOf(i3 - i2)).divide(BigInteger.valueOf(i3));
            i3--;
            if (bigIntegerBinomial.compareTo(bigInteger) <= 0) {
                gF2Vector.setBit(i4);
                bigInteger = bigInteger.subtract(bigIntegerBinomial);
                int i5 = i2 - 1;
                bigIntegerBinomial = i3 == i5 ? ONE : bigIntegerBinomial.multiply(BigInteger.valueOf(i2)).divide(BigInteger.valueOf(i3 - i5));
                i2 = i5;
            }
        }
        return gF2Vector;
    }

    public static byte[] signConversion(int i, int i2, byte[] bArr) {
        if (i < i2) {
            wg3.m206174a("n < t");
            return null;
        }
        BigInteger bigIntegerBinomial = IntegerFunctions.binomial(i, i2);
        int iBitLength = bigIntegerBinomial.bitLength() - 1;
        int i3 = iBitLength >> 3;
        int i4 = iBitLength & 7;
        int i5 = 8;
        if (i4 == 0) {
            i3--;
            i4 = 8;
        }
        int i6 = i >> 3;
        int i7 = i & 7;
        if (i7 == 0) {
            i6--;
        } else {
            i5 = i7;
        }
        int i8 = i6 + 1;
        byte[] bArr2 = new byte[i8];
        if (bArr.length < i8) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            for (int length = bArr.length; length < i8; length++) {
                bArr2[length] = 0;
            }
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, i6);
            bArr2[i6] = (byte) (bArr[i6] & ((1 << i5) - 1));
        }
        BigInteger bigIntegerAdd = ZERO;
        int i9 = i;
        for (int i10 = 0; i10 < i; i10++) {
            bigIntegerBinomial = bigIntegerBinomial.multiply(new BigInteger(Integer.toString(i9 - i2))).divide(new BigInteger(Integer.toString(i9)));
            i9--;
            if (((byte) (bArr2[i10 >>> 3] & (1 << (i10 & 7)))) != 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerBinomial);
                int i11 = i2 - 1;
                bigIntegerBinomial = i9 == i11 ? ONE : bigIntegerBinomial.multiply(new BigInteger(Integer.toString(i2))).divide(new BigInteger(Integer.toString(i9 - i11)));
                i2 = i11;
            }
        }
        int i12 = i3 + 1;
        byte[] bArr3 = new byte[i12];
        byte[] byteArray = bigIntegerAdd.toByteArray();
        if (byteArray.length >= i12) {
            System.arraycopy(byteArray, 0, bArr3, 0, i3);
            bArr3[i3] = (byte) (((1 << i4) - 1) & byteArray[i3]);
            return bArr3;
        }
        System.arraycopy(byteArray, 0, bArr3, 0, byteArray.length);
        for (int length2 = byteArray.length; length2 < i12; length2++) {
            bArr3[length2] = 0;
        }
        return bArr3;
    }
}
