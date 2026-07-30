package org.spongycastle.pqc.math.ntru.util;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import l.qkq0;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ArrayEncoder {
    private static final int[] COEFF1_TABLE = {0, 0, 0, 1, 1, 1, -1, -1};
    private static final int[] COEFF2_TABLE = {0, 1, -1, 0, 1, -1, 0, 1};
    private static final int[] BIT1_TABLE = {1, 1, 1, 0, 0, 0, 1, 0, 1};
    private static final int[] BIT2_TABLE = {1, 1, 1, 1, 0, 0, 0, 1, 0};
    private static final int[] BIT3_TABLE = {1, 0, 1, 0, 0, 1, 1, 1, 0};

    public static int[] decodeMod3Sves(byte[] bArr, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length * 8) {
            int bit = getBit(bArr, i2);
            int i4 = i2 + 2;
            int bit2 = getBit(bArr, i2 + 1);
            i2 += 3;
            int bit3 = (bit * 4) + (bit2 * 2) + getBit(bArr, i4);
            int i5 = i3 + 1;
            iArr[i3] = COEFF1_TABLE[bit3];
            i3 += 2;
            iArr[i5] = COEFF2_TABLE[bit3];
            if (i3 > i - 2) {
                break;
            }
        }
        return iArr;
    }

    public static int[] decodeMod3Tight(byte[] bArr, int i) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iIntValue = bigInteger.mod(BigInteger.valueOf(3L)).intValue();
            int i3 = iIntValue - 1;
            iArr[i2] = i3;
            if (i3 > 1) {
                iArr[i2] = iIntValue - 4;
            }
            bigInteger = bigInteger.divide(BigInteger.valueOf(3L));
        }
        return iArr;
    }

    public static int[] decodeModQ(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i];
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i2);
        int i3 = i * iNumberOfLeadingZeros;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 > 0 && i5 % iNumberOfLeadingZeros == 0) {
                i4++;
            }
            iArr[i4] = iArr[i4] + (getBit(bArr, i5) << (i5 % iNumberOfLeadingZeros));
        }
        return iArr;
    }

    public static byte[] encodeMod3Sves(int[] iArr) {
        byte[] bArr = new byte[((((iArr.length * 3) + 1) / 2) + 7) / 8];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < (iArr.length / 2) * 2) {
            int i4 = i + 1;
            int i5 = iArr[i] + 1;
            i += 2;
            int i6 = iArr[i4] + 1;
            if (i5 == 0 && i6 == 0) {
                qkq0.a("Illegal encoding!");
                return null;
            }
            int i7 = (i5 * 3) + i6;
            int[] iArr2 = {BIT1_TABLE[i7], BIT2_TABLE[i7], BIT3_TABLE[i7]};
            for (int i8 = 0; i8 < 3; i8++) {
                bArr[i3] = (byte) (bArr[i3] | (iArr2[i8] << i2));
                if (i2 == 7) {
                    i3++;
                    i2 = 0;
                } else {
                    i2++;
                }
            }
        }
        return bArr;
    }

    public static byte[] encodeMod3Tight(int[] iArr) {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int length = iArr.length - 1; length >= 0; length--) {
            bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.valueOf(3L)).add(BigInteger.valueOf(iArr[length] + 1));
        }
        int iBitLength = (BigInteger.valueOf(3L).pow(iArr.length).bitLength() + 7) / 8;
        byte[] byteArray = bigIntegerAdd.toByteArray();
        if (byteArray.length >= iBitLength) {
            return byteArray.length > iBitLength ? Arrays.copyOfRange(byteArray, 1, byteArray.length) : byteArray;
        }
        byte[] bArr = new byte[iBitLength];
        System.arraycopy(byteArray, 0, bArr, iBitLength - byteArray.length, byteArray.length);
        return bArr;
    }

    public static byte[] encodeModQ(int[] iArr, int i) {
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        byte[] bArr = new byte[((iArr.length * iNumberOfLeadingZeros) + 7) / 8];
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            for (int i5 = 0; i5 < iNumberOfLeadingZeros; i5++) {
                bArr[i3] = (byte) ((((i4 >> i5) & 1) << i2) | bArr[i3]);
                if (i2 == 7) {
                    i3++;
                    i2 = 0;
                } else {
                    i2++;
                }
            }
        }
        return bArr;
    }

    private static int getBit(byte[] bArr, int i) {
        return ((bArr[i / 8] & 255) >> (i % 8)) & 1;
    }

    public static int[] decodeModQ(InputStream inputStream, int i, int i2) throws IOException {
        return decodeModQ(Util.readFullLength(inputStream, (((31 - Integer.numberOfLeadingZeros(i2)) * i) + 7) / 8), i, i2);
    }

    public static int[] decodeMod3Tight(InputStream inputStream, int i) throws IOException {
        return decodeMod3Tight(Util.readFullLength(inputStream, (int) Math.ceil(((((double) i) * Math.log(3.0d)) / Math.log(2.0d)) / 8.0d)), i);
    }
}
