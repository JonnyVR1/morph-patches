package org.spongycastle.pqc.math.linearalgebra;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import io.agora.rtc2.internal.AudioRoutingController;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.math.BigInteger;
import java.util.Random;
import org.apache.commons.codec.language.p126bm.Rule;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.mym;
import p153l.olk0;
import p153l.p7f;
import p153l.v1d0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class GF2Polynomial {
    private int blocks;
    private int len;
    private int[] value;
    private static Random rand = new Random();
    private static final boolean[] parity = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private static final short[] squaringTable = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    private static final int[] bitMask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, AudioRoutingController.DEVICE_OUT_USB_HEADSET, 134217728, SQLiteDatabase.CREATE_IF_NECESSARY, 536870912, 1073741824, Integer.MIN_VALUE, 0};
    private static final int[] reverseRightMask = {0, 1, 3, 7, 15, 31, 63, 127, 255, UnixStat.DEFAULT_LINK_PERM, 1023, 2047, UnixStat.PERM_MASK, 8191, 16383, 32767, p7f.COLOR_SPACE_UNCALIBRATED, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Api.BaseClientBuilder.API_PRIORITY_OTHER, -1};

    public GF2Polynomial(int i, BigInteger bigInteger) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.blocks = i2;
        this.value = new int[i2];
        this.len = i;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        int length2 = byteArray.length & 3;
        int length3 = (byteArray.length - 1) >> 2;
        for (int i3 = 0; i3 < length2; i3++) {
            int[] iArr = this.value;
            iArr[length3] = iArr[length3] | ((byteArray[i3] & 255) << (((length2 - 1) - i3) << 3));
        }
        for (int i4 = 0; i4 <= ((byteArray.length - 4) >> 2); i4++) {
            int length4 = (byteArray.length - 1) - (i4 << 2);
            int[] iArr2 = this.value;
            int i5 = byteArray[length4] & 255;
            iArr2[i4] = i5;
            int i6 = i5 | ((byteArray[length4 - 1] << 8) & 65280);
            iArr2[i4] = i6;
            int i7 = i6 | ((byteArray[length4 - 2] << Tnaf.POW_2_WIDTH) & 16711680);
            iArr2[i4] = i7;
            iArr2[i4] = ((byteArray[length4 - 3] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) | i7;
        }
        int i8 = this.len;
        if ((i8 & 31) != 0) {
            int[] iArr3 = this.value;
            int i9 = this.blocks - 1;
            iArr3[i9] = reverseRightMask[i8 & 31] & iArr3[i9];
        }
        reduceN();
    }

    private void doShiftBlocksLeft(int i) {
        int i2 = this.blocks;
        int[] iArr = this.value;
        if (i2 > iArr.length) {
            int[] iArr2 = new int[i2];
            System.arraycopy(iArr, 0, iArr2, i, i2 - i);
            this.value = iArr2;
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            int[] iArr3 = this.value;
            iArr3[i3] = iArr3[i3 - i];
        }
        for (int i4 = 0; i4 < i; i4++) {
            this.value[i4] = 0;
        }
    }

    private GF2Polynomial karaMult(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len << 1);
        int i = this.len;
        if (i <= 32) {
            gF2Polynomial2.value = mult32(this.value[0], gF2Polynomial.value[0]);
            return gF2Polynomial2;
        }
        if (i <= 64) {
            gF2Polynomial2.value = mult64(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i <= 128) {
            gF2Polynomial2.value = mult128(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i <= 256) {
            gF2Polynomial2.value = mult256(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i <= 512) {
            gF2Polynomial2.value = mult512(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        int i2 = bitMask[IntegerFunctions.floorLog(i - 1)];
        int i3 = ((i2 - 1) >> 5) + 1;
        GF2Polynomial gF2PolynomialLower = lower(i3);
        GF2Polynomial gF2PolynomialUpper = upper(i3);
        GF2Polynomial gF2PolynomialLower2 = gF2Polynomial.lower(i3);
        GF2Polynomial gF2PolynomialUpper2 = gF2Polynomial.upper(i3);
        GF2Polynomial gF2PolynomialKaraMult = gF2PolynomialUpper.karaMult(gF2PolynomialUpper2);
        GF2Polynomial gF2PolynomialKaraMult2 = gF2PolynomialLower.karaMult(gF2PolynomialLower2);
        gF2PolynomialLower.addToThis(gF2PolynomialUpper);
        gF2PolynomialLower2.addToThis(gF2PolynomialUpper2);
        GF2Polynomial gF2PolynomialKaraMult3 = gF2PolynomialLower.karaMult(gF2PolynomialLower2);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult, i2 << 1);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult, i2);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult3, i2);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult2, i2);
        gF2Polynomial2.addToThis(gF2PolynomialKaraMult2);
        return gF2Polynomial2;
    }

    private GF2Polynomial lower(int i) {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(i << 5);
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, Math.min(i, this.blocks));
        return gF2Polynomial;
    }

    private static int[] mult128(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[2];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(2, iArr.length));
        int[] iArr5 = new int[2];
        if (iArr.length > 2) {
            System.arraycopy(iArr, 2, iArr5, 0, Math.min(2, iArr.length - 2));
        }
        int[] iArr6 = new int[2];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(2, iArr2.length));
        int[] iArr7 = new int[2];
        if (iArr2.length > 2) {
            System.arraycopy(iArr2, 2, iArr7, 0, Math.min(2, iArr2.length - 2));
        }
        if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i = iArr5[0];
            if (i != 0 || iArr7[0] != 0) {
                int[] iArrMult32 = mult32(i, iArr7[0]);
                int i2 = iArr3[5];
                int i3 = iArrMult32[1];
                iArr3[5] = i2 ^ i3;
                int i4 = iArr3[4];
                int i5 = iArrMult32[0];
                iArr3[4] = i4 ^ i5;
                iArr3[3] = iArr3[3] ^ i3;
                iArr3[2] = i5 ^ iArr3[2];
            }
        } else {
            int[] iArrMult64 = mult64(iArr5, iArr7);
            int i6 = iArr3[7];
            int i7 = iArrMult64[3];
            iArr3[7] = i6 ^ i7;
            int i8 = iArr3[6];
            int i9 = iArrMult64[2];
            iArr3[6] = i8 ^ i9;
            int i10 = iArr3[5];
            int i11 = iArrMult64[1];
            iArr3[5] = i10 ^ (i7 ^ i11);
            int i12 = iArr3[4];
            int i13 = iArrMult64[0];
            iArr3[4] = i12 ^ (i13 ^ i9);
            iArr3[3] = iArr3[3] ^ i11;
            iArr3[2] = i13 ^ iArr3[2];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        int i14 = iArr7[0] ^ iArr6[0];
        iArr7[0] = i14;
        int i15 = iArr7[1] ^ iArr6[1];
        iArr7[1] = i15;
        if (iArr5[1] == 0 && i15 == 0) {
            int[] iArrMult33 = mult32(iArr5[0], i14);
            iArr3[3] = iArr3[3] ^ iArrMult33[1];
            iArr3[2] = iArrMult33[0] ^ iArr3[2];
        } else {
            int[] iArrMult65 = mult64(iArr5, iArr7);
            iArr3[5] = iArr3[5] ^ iArrMult65[3];
            iArr3[4] = iArr3[4] ^ iArrMult65[2];
            iArr3[3] = iArr3[3] ^ iArrMult65[1];
            iArr3[2] = iArrMult65[0] ^ iArr3[2];
        }
        if (iArr4[1] == 0 && iArr6[1] == 0) {
            int[] iArrMult34 = mult32(iArr4[0], iArr6[0]);
            int i16 = iArr3[3];
            int i17 = iArrMult34[1];
            iArr3[3] = i16 ^ i17;
            int i18 = iArr3[2];
            int i19 = iArrMult34[0];
            iArr3[2] = i18 ^ i19;
            iArr3[1] = iArr3[1] ^ i17;
            iArr3[0] = i19 ^ iArr3[0];
            return iArr3;
        }
        int[] iArrMult66 = mult64(iArr4, iArr6);
        int i20 = iArr3[5];
        int i21 = iArrMult66[3];
        iArr3[5] = i20 ^ i21;
        int i22 = iArr3[4];
        int i23 = iArrMult66[2];
        iArr3[4] = i22 ^ i23;
        int i24 = iArr3[3];
        int i25 = iArrMult66[1];
        iArr3[3] = i24 ^ (i21 ^ i25);
        int i26 = iArr3[2];
        int i27 = iArrMult66[0];
        iArr3[2] = i26 ^ (i27 ^ i23);
        iArr3[1] = iArr3[1] ^ i25;
        iArr3[0] = i27 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult256(int[] iArr, int[] iArr2) {
        char c;
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[4];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(4, iArr.length));
        int[] iArr5 = new int[4];
        if (iArr.length > 4) {
            System.arraycopy(iArr, 4, iArr5, 0, Math.min(4, iArr.length - 4));
        }
        int[] iArr6 = new int[4];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(4, iArr2.length));
        int[] iArr7 = new int[4];
        if (iArr2.length > 4) {
            System.arraycopy(iArr2, 4, iArr7, 0, Math.min(4, iArr2.length - 4));
        }
        if (iArr5[3] != 0 || iArr5[2] != 0 || iArr7[3] != 0 || iArr7[2] != 0) {
            c = 3;
            int[] iArrMult128 = mult128(iArr5, iArr7);
            int i = iArr3[15];
            int i2 = iArrMult128[7];
            iArr3[15] = i ^ i2;
            int i3 = iArr3[14];
            int i4 = iArrMult128[6];
            iArr3[14] = i3 ^ i4;
            int i5 = iArr3[13];
            int i6 = iArrMult128[5];
            iArr3[13] = i5 ^ i6;
            int i7 = iArr3[12];
            int i8 = iArrMult128[4];
            iArr3[12] = i7 ^ i8;
            int i9 = iArr3[11];
            int i10 = iArrMult128[3];
            iArr3[11] = i9 ^ (i10 ^ i2);
            int i11 = iArr3[10];
            int i12 = iArrMult128[2];
            iArr3[10] = i11 ^ (i12 ^ i4);
            int i13 = iArr3[9];
            int i14 = iArrMult128[1];
            iArr3[9] = i13 ^ (i14 ^ i6);
            int i15 = iArr3[8];
            int i16 = iArrMult128[0];
            iArr3[8] = i15 ^ (i16 ^ i8);
            iArr3[7] = iArr3[7] ^ i10;
            iArr3[6] = iArr3[6] ^ i12;
            iArr3[5] = iArr3[5] ^ i14;
            iArr3[4] = i16 ^ iArr3[4];
        } else if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i17 = iArr5[0];
            if (i17 == 0 && iArr7[0] == 0) {
                c = 3;
            } else {
                c = 3;
                int[] iArrMult32 = mult32(i17, iArr7[0]);
                int i18 = iArr3[9];
                int i19 = iArrMult32[1];
                iArr3[9] = i18 ^ i19;
                int i20 = iArr3[8];
                int i21 = iArrMult32[0];
                iArr3[8] = i20 ^ i21;
                iArr3[5] = iArr3[5] ^ i19;
                iArr3[4] = i21 ^ iArr3[4];
            }
        } else {
            c = 3;
            int[] iArrMult64 = mult64(iArr5, iArr7);
            int i22 = iArr3[11];
            int i23 = iArrMult64[3];
            iArr3[11] = i22 ^ i23;
            int i24 = iArr3[10];
            int i25 = iArrMult64[2];
            iArr3[10] = i24 ^ i25;
            int i26 = iArr3[9];
            int i27 = iArrMult64[1];
            iArr3[9] = i26 ^ i27;
            int i28 = iArr3[8];
            int i29 = iArrMult64[0];
            iArr3[8] = i28 ^ i29;
            iArr3[7] = iArr3[7] ^ i23;
            iArr3[6] = iArr3[6] ^ i25;
            iArr3[5] = iArr3[5] ^ i27;
            iArr3[4] = i29 ^ iArr3[4];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[c] = iArr5[c] ^ iArr4[c];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[c] = iArr7[c] ^ iArr6[c];
        int[] iArrMult129 = mult128(iArr5, iArr7);
        iArr3[11] = iArr3[11] ^ iArrMult129[7];
        iArr3[10] = iArr3[10] ^ iArrMult129[6];
        iArr3[9] = iArr3[9] ^ iArrMult129[5];
        iArr3[8] = iArr3[8] ^ iArrMult129[4];
        iArr3[7] = iArr3[7] ^ iArrMult129[c];
        iArr3[6] = iArr3[6] ^ iArrMult129[2];
        iArr3[5] = iArr3[5] ^ iArrMult129[1];
        iArr3[4] = iArrMult129[0] ^ iArr3[4];
        int[] iArrMult1210 = mult128(iArr4, iArr6);
        int i30 = iArr3[11];
        int i31 = iArrMult1210[7];
        iArr3[11] = i30 ^ i31;
        int i32 = iArr3[10];
        int i33 = iArrMult1210[6];
        iArr3[10] = i32 ^ i33;
        int i34 = iArr3[9];
        int i35 = iArrMult1210[5];
        iArr3[9] = i34 ^ i35;
        int i36 = iArr3[8];
        int i37 = iArrMult1210[4];
        iArr3[8] = i36 ^ i37;
        int i38 = iArr3[7];
        int i39 = iArrMult1210[c];
        iArr3[7] = i38 ^ (i31 ^ i39);
        int i40 = iArr3[6];
        int i41 = iArrMult1210[2];
        iArr3[6] = i40 ^ (i33 ^ i41);
        int i42 = iArr3[5];
        int i43 = iArrMult1210[1];
        iArr3[5] = i42 ^ (i35 ^ i43);
        int i44 = iArr3[4];
        int i45 = iArrMult1210[0];
        iArr3[4] = i44 ^ (i45 ^ i37);
        iArr3[c] = iArr3[c] ^ i39;
        iArr3[2] = iArr3[2] ^ i41;
        iArr3[1] = iArr3[1] ^ i43;
        iArr3[0] = i45 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult32(int i, int i2) {
        int[] iArr = new int[2];
        if (i != 0 && i2 != 0) {
            long j = ((long) i2) & 4294967295L;
            long j2 = 0;
            for (int i3 = 1; i3 <= 32; i3++) {
                if ((bitMask[i3 - 1] & i) != 0) {
                    j2 ^= j;
                }
                j <<= 1;
            }
            iArr[1] = (int) (j2 >>> 32);
            iArr[0] = (int) (j2 & 4294967295L);
        }
        return iArr;
    }

    private static int[] mult512(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[32];
        int[] iArr4 = new int[8];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(8, iArr.length));
        int[] iArr5 = new int[8];
        if (iArr.length > 8) {
            System.arraycopy(iArr, 8, iArr5, 0, Math.min(8, iArr.length - 8));
        }
        int[] iArr6 = new int[8];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(8, iArr2.length));
        int[] iArr7 = new int[8];
        if (iArr2.length > 8) {
            System.arraycopy(iArr2, 8, iArr7, 0, Math.min(8, iArr2.length - 8));
        }
        int[] iArrMult256 = mult256(iArr5, iArr7);
        int i = iArr3[31];
        int i2 = iArrMult256[15];
        iArr3[31] = i ^ i2;
        int i3 = iArr3[30];
        int i4 = iArrMult256[14];
        iArr3[30] = i3 ^ i4;
        int i5 = iArr3[29];
        int i6 = iArrMult256[13];
        iArr3[29] = i5 ^ i6;
        int i7 = iArr3[28];
        int i8 = iArrMult256[12];
        iArr3[28] = i7 ^ i8;
        int i9 = iArr3[27];
        int i10 = iArrMult256[11];
        iArr3[27] = i9 ^ i10;
        int i11 = iArr3[26];
        int i12 = iArrMult256[10];
        iArr3[26] = i11 ^ i12;
        int i13 = iArr3[25];
        int i14 = iArrMult256[9];
        iArr3[25] = i13 ^ i14;
        int i15 = iArr3[24];
        int i16 = iArrMult256[8];
        iArr3[24] = i15 ^ i16;
        int i17 = iArr3[23];
        int i18 = iArrMult256[7];
        iArr3[23] = i17 ^ (i18 ^ i2);
        int i19 = iArr3[22];
        int i20 = iArrMult256[6];
        iArr3[22] = i19 ^ (i20 ^ i4);
        int i21 = iArr3[21];
        int i22 = iArrMult256[5];
        iArr3[21] = i21 ^ (i22 ^ i6);
        int i23 = iArr3[20];
        int i24 = iArrMult256[4];
        iArr3[20] = i23 ^ (i24 ^ i8);
        int i25 = iArr3[19];
        int i26 = iArrMult256[3];
        iArr3[19] = i25 ^ (i26 ^ i10);
        int i27 = iArr3[18];
        int i28 = iArrMult256[2];
        iArr3[18] = i27 ^ (i28 ^ i12);
        int i29 = iArr3[17];
        int i30 = iArrMult256[1];
        iArr3[17] = i29 ^ (i30 ^ i14);
        int i31 = iArr3[16];
        int i32 = iArrMult256[0];
        iArr3[16] = i31 ^ (i32 ^ i16);
        iArr3[15] = iArr3[15] ^ i18;
        iArr3[14] = iArr3[14] ^ i20;
        iArr3[13] = iArr3[13] ^ i22;
        iArr3[12] = iArr3[12] ^ i24;
        iArr3[11] = iArr3[11] ^ i26;
        iArr3[10] = iArr3[10] ^ i28;
        iArr3[9] = iArr3[9] ^ i30;
        iArr3[8] = iArr3[8] ^ i32;
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr5[4] = iArr5[4] ^ iArr4[4];
        iArr5[5] = iArr5[5] ^ iArr4[5];
        iArr5[6] = iArr5[6] ^ iArr4[6];
        iArr5[7] = iArr5[7] ^ iArr4[7];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        iArr7[4] = iArr7[4] ^ iArr6[4];
        iArr7[5] = iArr7[5] ^ iArr6[5];
        iArr7[6] = iArr7[6] ^ iArr6[6];
        iArr7[7] = iArr7[7] ^ iArr6[7];
        int[] iArrMult257 = mult256(iArr5, iArr7);
        iArr3[23] = iArr3[23] ^ iArrMult257[15];
        iArr3[22] = iArr3[22] ^ iArrMult257[14];
        iArr3[21] = iArr3[21] ^ iArrMult257[13];
        iArr3[20] = iArr3[20] ^ iArrMult257[12];
        iArr3[19] = iArr3[19] ^ iArrMult257[11];
        iArr3[18] = iArr3[18] ^ iArrMult257[10];
        iArr3[17] = iArr3[17] ^ iArrMult257[9];
        iArr3[16] = iArr3[16] ^ iArrMult257[8];
        iArr3[15] = iArr3[15] ^ iArrMult257[7];
        iArr3[14] = iArr3[14] ^ iArrMult257[6];
        iArr3[13] = iArr3[13] ^ iArrMult257[5];
        iArr3[12] = iArr3[12] ^ iArrMult257[4];
        iArr3[11] = iArr3[11] ^ iArrMult257[3];
        iArr3[10] = iArr3[10] ^ iArrMult257[2];
        iArr3[9] = iArr3[9] ^ iArrMult257[1];
        iArr3[8] = iArrMult257[0] ^ iArr3[8];
        int[] iArrMult258 = mult256(iArr4, iArr6);
        int i33 = iArr3[23];
        int i34 = iArrMult258[15];
        iArr3[23] = i33 ^ i34;
        int i35 = iArr3[22];
        int i36 = iArrMult258[14];
        iArr3[22] = i35 ^ i36;
        int i37 = iArr3[21];
        int i38 = iArrMult258[13];
        iArr3[21] = i37 ^ i38;
        int i39 = iArr3[20];
        int i40 = iArrMult258[12];
        iArr3[20] = i39 ^ i40;
        int i41 = iArr3[19];
        int i42 = iArrMult258[11];
        iArr3[19] = i41 ^ i42;
        int i43 = iArr3[18];
        int i44 = iArrMult258[10];
        iArr3[18] = i43 ^ i44;
        int i45 = iArr3[17];
        int i46 = iArrMult258[9];
        iArr3[17] = i45 ^ i46;
        int i47 = iArr3[16];
        int i48 = iArrMult258[8];
        iArr3[16] = i47 ^ i48;
        int i49 = iArr3[15];
        int i50 = iArrMult258[7];
        iArr3[15] = i49 ^ (i50 ^ i34);
        int i51 = iArr3[14];
        int i52 = iArrMult258[6];
        iArr3[14] = i51 ^ (i36 ^ i52);
        int i53 = iArr3[13];
        int i54 = iArrMult258[5];
        iArr3[13] = i53 ^ (i38 ^ i54);
        int i55 = iArr3[12];
        int i56 = iArrMult258[4];
        iArr3[12] = i55 ^ (i40 ^ i56);
        int i57 = iArr3[11];
        int i58 = iArrMult258[3];
        iArr3[11] = i57 ^ (i42 ^ i58);
        int i59 = iArr3[10];
        int i60 = iArrMult258[2];
        iArr3[10] = i59 ^ (i60 ^ i44);
        int i61 = iArr3[9];
        int i62 = iArrMult258[1];
        iArr3[9] = i61 ^ (i62 ^ i46);
        int i63 = iArr3[8];
        int i64 = iArrMult258[0];
        iArr3[8] = i63 ^ (i64 ^ i48);
        iArr3[7] = iArr3[7] ^ i50;
        iArr3[6] = iArr3[6] ^ i52;
        iArr3[5] = iArr3[5] ^ i54;
        iArr3[4] = iArr3[4] ^ i56;
        iArr3[3] = iArr3[3] ^ i58;
        iArr3[2] = iArr3[2] ^ i60;
        iArr3[1] = iArr3[1] ^ i62;
        iArr3[0] = i64 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult64(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[4];
        int i = iArr[0];
        int i2 = iArr.length > 1 ? iArr[1] : 0;
        int i3 = iArr2[0];
        int i4 = iArr2.length > 1 ? iArr2[1] : 0;
        if (i2 != 0 || i4 != 0) {
            int[] iArrMult32 = mult32(i2, i4);
            int i5 = iArr3[3];
            int i6 = iArrMult32[1];
            iArr3[3] = i5 ^ i6;
            int i7 = iArr3[2];
            int i8 = iArrMult32[0];
            iArr3[2] = i7 ^ (i8 ^ i6);
            iArr3[1] = i8 ^ iArr3[1];
        }
        int[] iArrMult33 = mult32(i2 ^ i, i4 ^ i3);
        iArr3[2] = iArr3[2] ^ iArrMult33[1];
        iArr3[1] = iArrMult33[0] ^ iArr3[1];
        int[] iArrMult34 = mult32(i, i3);
        int i9 = iArr3[2];
        int i10 = iArrMult34[1];
        iArr3[2] = i9 ^ i10;
        int i11 = iArr3[1];
        int i12 = iArrMult34[0];
        iArr3[1] = i11 ^ (i10 ^ i12);
        iArr3[0] = i12 ^ iArr3[0];
        return iArr3;
    }

    private GF2Polynomial upper(int i) {
        int iMin = Math.min(i, this.blocks - i);
        GF2Polynomial gF2Polynomial = new GF2Polynomial(iMin << 5);
        if (this.blocks >= i) {
            System.arraycopy(this.value, i, gF2Polynomial.value, 0, iMin);
        }
        return gF2Polynomial;
    }

    private void zeroUnusedBits() {
        int i = this.len;
        if ((i & 31) != 0) {
            int[] iArr = this.value;
            int i2 = this.blocks - 1;
            iArr[i2] = reverseRightMask[i & 31] & iArr[i2];
        }
    }

    public GF2Polynomial add(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void addToThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public void assignAll() {
        for (int i = 0; i < this.blocks; i++) {
            this.value[i] = -1;
        }
        zeroUnusedBits();
    }

    public void assignOne() {
        int i = 1;
        while (true) {
            int i2 = this.blocks;
            int[] iArr = this.value;
            if (i >= i2) {
                iArr[0] = 1;
                return;
            } else {
                iArr[i] = 0;
                i++;
            }
        }
    }

    public void assignX() {
        int i = 1;
        while (true) {
            int i2 = this.blocks;
            int[] iArr = this.value;
            if (i >= i2) {
                iArr[0] = 2;
                return;
            } else {
                iArr[i] = 0;
                i++;
            }
        }
    }

    public void assignZero() {
        for (int i = 0; i < this.blocks; i++) {
            this.value[i] = 0;
        }
    }

    public Object clone() {
        return new GF2Polynomial(this);
    }

    public GF2Polynomial[] divide(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[2];
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            olk0.m168132a();
            return null;
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i = gF2Polynomial3.len;
        int i2 = gF2Polynomial4.len;
        if (i < i2) {
            gF2PolynomialArr[0] = new GF2Polynomial(0);
            gF2PolynomialArr[1] = gF2Polynomial3;
            return gF2PolynomialArr;
        }
        int i3 = i - i2;
        gF2Polynomial2.expandN(i3 + 1);
        while (i3 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i3));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i3);
            i3 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        gF2PolynomialArr[0] = gF2Polynomial2;
        gF2PolynomialArr[1] = gF2Polynomial3;
        return gF2PolynomialArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2Polynomial)) {
            return false;
        }
        GF2Polynomial gF2Polynomial = (GF2Polynomial) obj;
        if (this.len != gF2Polynomial.len) {
            return false;
        }
        for (int i = 0; i < this.blocks; i++) {
            if (this.value[i] != gF2Polynomial.value[i]) {
                return false;
            }
        }
        return true;
    }

    public void expandN(int i) {
        if (this.len >= i) {
            return;
        }
        this.len = i;
        int i2 = ((i - 1) >>> 5) + 1;
        int i3 = this.blocks;
        if (i3 >= i2) {
            return;
        }
        int[] iArr = this.value;
        if (iArr.length >= i2) {
            while (i3 < i2) {
                this.value[i3] = 0;
                i3++;
            }
            this.blocks = i2;
            return;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        this.blocks = i2;
        this.value = iArr2;
    }

    public GF2Polynomial gcd(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (isZero() && gF2Polynomial.isZero()) {
            mym.m160801a("Both operands of gcd equal zero.");
            return null;
        }
        if (isZero()) {
            return new GF2Polynomial(gF2Polynomial);
        }
        if (gF2Polynomial.isZero()) {
            return new GF2Polynomial(this);
        }
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        while (true) {
            GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            gF2Polynomial2 = gF2Polynomial3;
            if (gF2Polynomial2.isZero()) {
                return gF2Polynomial4;
            }
            gF2Polynomial3 = gF2Polynomial4.remainder(gF2Polynomial2);
        }
    }

    public int getBit(int i) {
        if (i >= 0) {
            return (i <= this.len - 1 && (this.value[i >>> 5] & bitMask[i & 31]) != 0) ? 1 : 0;
        }
        olk0.m168132a();
        return 0;
    }

    public int getLength() {
        return this.len;
    }

    public int hashCode() {
        return this.len + this.value.hashCode();
    }

    public GF2Polynomial increase() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.increaseThis();
        return gF2Polynomial;
    }

    public void increaseThis() {
        xorBit(0);
    }

    public boolean isIrreducible() {
        if (isZero()) {
            return false;
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.reduceN();
        int i = gF2Polynomial.len;
        int i2 = i - 1;
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(i, "X");
        for (int i3 = 1; i3 <= (i2 >> 1); i3++) {
            gF2Polynomial2.squareThisPreCalc();
            gF2Polynomial2 = gF2Polynomial2.remainder(gF2Polynomial);
            GF2Polynomial gF2PolynomialAdd = gF2Polynomial2.add(new GF2Polynomial(32, "X"));
            if (gF2PolynomialAdd.isZero() || !gF2Polynomial.gcd(gF2PolynomialAdd).isOne()) {
                return false;
            }
        }
        return true;
    }

    public boolean isOne() {
        int i = 1;
        while (true) {
            int i2 = this.blocks;
            int[] iArr = this.value;
            if (i >= i2) {
                return iArr[0] == 1;
            }
            if (iArr[i] != 0) {
                return false;
            }
            i++;
        }
    }

    public boolean isZero() {
        if (this.len == 0) {
            return true;
        }
        for (int i = 0; i < this.blocks; i++) {
            if (this.value[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public GF2Polynomial multiply(GF2Polynomial gF2Polynomial) {
        int iMax = Math.max(this.len, gF2Polynomial.len);
        expandN(iMax);
        gF2Polynomial.expandN(iMax);
        return karaMult(gF2Polynomial);
    }

    public GF2Polynomial multiplyClassic(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(Math.max(this.len, gF2Polynomial.len) << 1);
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[32];
        gF2PolynomialArr[0] = new GF2Polynomial(this);
        for (int i = 1; i <= 31; i++) {
            gF2PolynomialArr[i] = gF2PolynomialArr[i - 1].shiftLeft();
        }
        for (int i2 = 0; i2 < gF2Polynomial.blocks; i2++) {
            for (int i3 = 0; i3 <= 31; i3++) {
                if ((gF2Polynomial.value[i2] & bitMask[i3]) != 0) {
                    gF2Polynomial2.xorThisBy(gF2PolynomialArr[i3]);
                }
            }
            for (int i4 = 0; i4 <= 31; i4++) {
                gF2PolynomialArr[i4].shiftBlocksLeft();
            }
        }
        return gF2Polynomial2;
    }

    public GF2Polynomial quotient(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            olk0.m168132a();
            return null;
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i = gF2Polynomial3.len;
        int i2 = gF2Polynomial4.len;
        if (i < i2) {
            return new GF2Polynomial(0);
        }
        int i3 = i - i2;
        gF2Polynomial2.expandN(i3 + 1);
        while (i3 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i3));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i3);
            i3 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        return gF2Polynomial2;
    }

    public void randomize() {
        for (int i = 0; i < this.blocks; i++) {
            this.value[i] = rand.nextInt();
        }
        zeroUnusedBits();
    }

    public void reduceN() {
        int i;
        int i2 = this.blocks;
        do {
            i2--;
            i = this.value[i2];
            if (i != 0) {
                break;
            }
        } while (i2 > 0);
        int i3 = 0;
        while (i != 0) {
            i >>>= 1;
            i3++;
        }
        this.len = (i2 << 5) + i3;
        this.blocks = i2 + 1;
    }

    public void reducePentanomial(int i, int[] iArr) {
        int[] iArr2;
        int i2 = i >>> 5;
        int i3 = i & 31;
        int i4 = 32 - i3;
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = (i - i6) >>> 5;
        int i8 = 32 - ((i - i6) & 31);
        boolean z = true;
        int i9 = iArr[1];
        int i10 = (i - i9) >>> 5;
        int i11 = 32 - ((i - i9) & 31);
        int i12 = iArr[2];
        int i13 = (i - i12) >>> 5;
        int i14 = 32 - ((i - i12) & 31);
        int i15 = ((i << 1) - 2) >>> 5;
        while (true) {
            iArr2 = this.value;
            if (i15 <= i2) {
                break;
            }
            int i16 = i5;
            boolean z2 = z;
            int i17 = i11;
            long j = ((long) iArr2[i15]) & 4294967295L;
            int i18 = i15 - i2;
            int i19 = i18 - 1;
            int i20 = i2;
            int i21 = i3;
            iArr2[i19] = iArr2[i19] ^ ((int) (j << i4));
            iArr2[i18] = (int) (((long) iArr2[i18]) ^ (j >>> (32 - i4)));
            int i22 = i15 - i7;
            int i23 = i22 - 1;
            iArr2[i23] = ((int) (j << i8)) ^ iArr2[i23];
            iArr2[i22] = (int) (((long) iArr2[i22]) ^ (j >>> (32 - i8)));
            int i24 = i15 - i10;
            int i25 = i24 - 1;
            iArr2[i25] = ((int) (j << i17)) ^ iArr2[i25];
            iArr2[i24] = (int) (((long) iArr2[i24]) ^ (j >>> (32 - i17)));
            int i26 = i15 - i13;
            int i27 = i26 - 1;
            iArr2[i27] = ((int) (j << i14)) ^ iArr2[i27];
            iArr2[i26] = (int) (((long) iArr2[i26]) ^ (j >>> (32 - i14)));
            iArr2[i15] = i16;
            i15--;
            i5 = i16;
            z = z2;
            i11 = i17;
            i2 = i20;
            i3 = i21;
        }
        int i28 = i2;
        int i29 = i3;
        int i30 = i5;
        int i31 = i11;
        long j2 = ((long) iArr2[i28]) & 4294967295L & (4294967295 << i29);
        iArr2[i30] = (int) ((j2 >>> (32 - i4)) ^ ((long) iArr2[i30]));
        int i32 = i28 - i7;
        int i33 = i32 - 1;
        if (i33 >= 0) {
            iArr2[i33] = iArr2[i33] ^ ((int) (j2 << i8));
        }
        iArr2[i32] = (int) ((j2 >>> (32 - i8)) ^ ((long) iArr2[i32]));
        int i34 = i28 - i10;
        int i35 = i34 - 1;
        if (i35 >= 0) {
            iArr2[i35] = iArr2[i35] ^ ((int) (j2 << i31));
        }
        iArr2[i34] = (int) (((long) iArr2[i34]) ^ (j2 >>> (32 - i31)));
        int i36 = i28 - i13;
        int i37 = i36 - 1;
        if (i37 >= 0) {
            iArr2[i37] = iArr2[i37] ^ ((int) (j2 << i14));
        }
        iArr2[i36] = (int) ((j2 >>> (32 - i14)) ^ ((long) iArr2[i36]));
        iArr2[i28] = iArr2[i28] & reverseRightMask[i29];
        this.blocks = ((i - 1) >>> 5) + 1;
        this.len = i;
    }

    public void reduceTrinomial(int i, int i2) {
        int[] iArr;
        int i3 = i >>> 5;
        int i4 = i & 31;
        int i5 = 32 - i4;
        int i6 = i - i2;
        int i7 = i6 >>> 5;
        int i8 = 32 - (i6 & 31);
        int i9 = ((i << 1) - 2) >>> 5;
        while (true) {
            iArr = this.value;
            if (i9 <= i3) {
                break;
            }
            long j = 4294967295L & ((long) iArr[i9]);
            int i10 = i9 - i3;
            int i11 = i10 - 1;
            iArr[i11] = ((int) (j << i5)) ^ iArr[i11];
            iArr[i10] = (int) (((long) iArr[i10]) ^ (j >>> (32 - i5)));
            int i12 = i9 - i7;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] ^ ((int) (j << i8));
            iArr[i12] = (int) (((long) iArr[i12]) ^ (j >>> (32 - i8)));
            iArr[i9] = 0;
            i9--;
        }
        long j2 = (4294967295 << i4) & ((long) iArr[i3]) & 4294967295L;
        iArr[0] = (int) (((long) iArr[0]) ^ (j2 >>> (32 - i5)));
        int i14 = i3 - i7;
        int i15 = i14 - 1;
        if (i15 >= 0) {
            iArr[i15] = iArr[i15] ^ ((int) (j2 << i8));
        }
        iArr[i14] = (int) (((long) iArr[i14]) ^ (j2 >>> (32 - i8)));
        iArr[i3] = reverseRightMask[i4] & iArr[i3];
        this.blocks = ((i - 1) >>> 5) + 1;
        this.len = i;
    }

    public GF2Polynomial remainder(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial3.isZero()) {
            olk0.m168132a();
            return null;
        }
        gF2Polynomial2.reduceN();
        gF2Polynomial3.reduceN();
        int i = gF2Polynomial2.len;
        int i2 = gF2Polynomial3.len;
        if (i >= i2) {
            while (true) {
                int i3 = i - i2;
                if (i3 < 0) {
                    break;
                }
                gF2Polynomial2.subtractFromThis(gF2Polynomial3.shiftLeft(i3));
                gF2Polynomial2.reduceN();
                i = gF2Polynomial2.len;
                i2 = gF2Polynomial3.len;
            }
        }
        return gF2Polynomial2;
    }

    public void resetBit(int i) throws RuntimeException {
        if (i < 0) {
            olk0.m168132a();
        } else {
            if (i > this.len - 1) {
                return;
            }
            int[] iArr = this.value;
            int i2 = i >>> 5;
            iArr[i2] = (~bitMask[i & 31]) & iArr[i2];
        }
    }

    public void setBit(int i) throws RuntimeException {
        if (i < 0 || i > this.len - 1) {
            olk0.m168132a();
            return;
        }
        int[] iArr = this.value;
        int i2 = i >>> 5;
        iArr[i2] = bitMask[i & 31] | iArr[i2];
    }

    public void shiftBlocksLeft() {
        int i = this.blocks;
        int i2 = i + 1;
        this.blocks = i2;
        this.len += 32;
        int[] iArr = this.value;
        if (i2 > iArr.length) {
            int[] iArr2 = new int[i2];
            System.arraycopy(iArr, 0, iArr2, 1, i);
            this.value = iArr2;
        } else {
            while (true) {
                int[] iArr3 = this.value;
                if (i < 1) {
                    iArr3[0] = 0;
                    return;
                } else {
                    iArr3[i] = iArr3[i - 1];
                    i--;
                }
            }
        }
    }

    public GF2Polynomial shiftLeft(int i) {
        int[] iArr;
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + i, this.value);
        if (i >= 32) {
            gF2Polynomial.doShiftBlocksLeft(i >>> 5);
        }
        int i2 = i & 31;
        if (i2 != 0) {
            int i3 = gF2Polynomial.blocks - 1;
            while (true) {
                iArr = gF2Polynomial.value;
                if (i3 < 1) {
                    break;
                }
                int i4 = iArr[i3] << i2;
                iArr[i3] = i4;
                iArr[i3] = i4 | (iArr[i3 - 1] >>> (32 - i2));
                i3--;
            }
            iArr[0] = iArr[0] << i2;
        }
        return gF2Polynomial;
    }

    public void shiftLeftAddThis(GF2Polynomial gF2Polynomial, int i) {
        int i2;
        if (i == 0) {
            addToThis(gF2Polynomial);
            return;
        }
        expandN(gF2Polynomial.len + i);
        int i3 = i >>> 5;
        for (int i4 = gF2Polynomial.blocks - 1; i4 >= 0; i4--) {
            int i5 = i4 + i3;
            int i6 = i5 + 1;
            if (i6 < this.blocks && (i2 = i & 31) != 0) {
                int[] iArr = this.value;
                iArr[i6] = (gF2Polynomial.value[i4] >>> (32 - i2)) ^ iArr[i6];
            }
            int[] iArr2 = this.value;
            iArr2[i5] = iArr2[i5] ^ (gF2Polynomial.value[i4] << (i & 31));
        }
    }

    public void shiftLeftThis() {
        int i = this.len;
        if ((i & 31) == 0) {
            this.len = i + 1;
            int i2 = this.blocks + 1;
            this.blocks = i2;
            int[] iArr = this.value;
            if (i2 > iArr.length) {
                int[] iArr2 = new int[i2];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                this.value = iArr2;
            }
            for (int i3 = this.blocks - 1; i3 >= 1; i3--) {
                int[] iArr3 = this.value;
                int i4 = i3 - 1;
                iArr3[i3] = iArr3[i3] | (iArr3[i4] >>> 31);
                iArr3[i4] = iArr3[i4] << 1;
            }
            return;
        }
        this.len = i + 1;
        int i5 = this.blocks - 1;
        while (true) {
            int[] iArr4 = this.value;
            if (i5 < 1) {
                iArr4[0] = iArr4[0] << 1;
                return;
            }
            int i6 = iArr4[i5] << 1;
            iArr4[i5] = i6;
            iArr4[i5] = i6 | (iArr4[i5 - 1] >>> 31);
            i5--;
        }
    }

    public GF2Polynomial shiftRight() {
        int i;
        int[] iArr;
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len - 1);
        int i2 = 0;
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, gF2Polynomial.blocks);
        while (true) {
            i = gF2Polynomial.blocks;
            int i3 = i - 2;
            iArr = gF2Polynomial.value;
            if (i2 > i3) {
                break;
            }
            int i4 = iArr[i2] >>> 1;
            iArr[i2] = i4;
            int i5 = i2 + 1;
            iArr[i2] = i4 | (iArr[i5] << 31);
            i2 = i5;
        }
        int i6 = i - 1;
        iArr[i6] = iArr[i6] >>> 1;
        if (i < this.blocks) {
            int i7 = i - 1;
            iArr[i7] = (this.value[i] << 31) | iArr[i7];
        }
        return gF2Polynomial;
    }

    public void shiftRightThis() {
        int i;
        int[] iArr;
        int i2 = this.len;
        this.len = i2 - 1;
        this.blocks = ((i2 - 2) >>> 5) + 1;
        int i3 = 0;
        while (true) {
            i = this.blocks;
            int i4 = i - 2;
            iArr = this.value;
            if (i3 > i4) {
                break;
            }
            int i5 = iArr[i3] >>> 1;
            iArr[i3] = i5;
            int i6 = i3 + 1;
            iArr[i3] = i5 | (iArr[i6] << 31);
            i3 = i6;
        }
        int i7 = i - 1;
        iArr[i7] = iArr[i7] >>> 1;
        if ((this.len & 31) == 0) {
            int i8 = i - 1;
            iArr[i8] = iArr[i8] | (iArr[i] << 31);
        }
    }

    public void squareThisBitwise() {
        if (isZero()) {
            return;
        }
        int i = this.blocks;
        int i2 = i << 1;
        int[] iArr = new int[i2];
        for (int i3 = i - 1; i3 >= 0; i3--) {
            int i4 = this.value[i3];
            int i5 = 1;
            for (int i6 = 0; i6 < 16; i6++) {
                if ((i4 & 1) != 0) {
                    int i7 = i3 << 1;
                    iArr[i7] = iArr[i7] | i5;
                }
                if ((65536 & i4) != 0) {
                    int i8 = (i3 << 1) + 1;
                    iArr[i8] = iArr[i8] | i5;
                }
                i5 <<= 2;
                i4 >>>= 1;
            }
        }
        this.value = iArr;
        this.blocks = i2;
        this.len = (this.len << 1) - 1;
    }

    public void squareThisPreCalc() {
        if (isZero()) {
            return;
        }
        int length = this.value.length;
        int i = this.blocks;
        if (length >= (i << 1)) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                int[] iArr = this.value;
                int i3 = i2 << 1;
                short[] sArr = squaringTable;
                int i4 = iArr[i2];
                iArr[i3 + 1] = (sArr[(i4 & RoundedDrawable.DEFAULT_BORDER_COLOR) >>> 24] << 16) | sArr[(i4 & 16711680) >>> 16];
                int i5 = iArr[i2];
                iArr[i3] = (sArr[(i5 & 65280) >>> 8] << 16) | sArr[i5 & 255];
            }
            this.blocks <<= 1;
            this.len = (this.len << 1) - 1;
            return;
        }
        int[] iArr2 = new int[i << 1];
        int i6 = 0;
        while (true) {
            int i7 = this.blocks;
            if (i6 >= i7) {
                this.value = iArr2;
                this.blocks = i7 << 1;
                this.len = (this.len << 1) - 1;
                return;
            }
            int i8 = i6 << 1;
            short[] sArr2 = squaringTable;
            int[] iArr3 = this.value;
            int i9 = iArr3[i6];
            iArr2[i8] = (sArr2[(i9 & 65280) >>> 8] << 16) | sArr2[i9 & 255];
            int i10 = iArr3[i6];
            iArr2[i8 + 1] = (sArr2[(i10 & RoundedDrawable.DEFAULT_BORDER_COLOR) >>> 24] << 16) | sArr2[(i10 & 16711680) >>> 16];
            i6++;
        }
    }

    public GF2Polynomial subtract(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void subtractFromThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public boolean testBit(int i) {
        if (i >= 0) {
            return i <= this.len - 1 && (this.value[i >>> 5] & bitMask[i & 31]) != 0;
        }
        olk0.m168132a();
        return false;
    }

    public byte[] toByteArray() {
        int i = ((this.len - 1) >> 3) + 1;
        int i2 = i & 3;
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < (i >> 2); i3++) {
            int i4 = i - (i3 << 2);
            int i5 = this.value[i3];
            bArr[i4 - 1] = (byte) (i5 & 255);
            bArr[i4 - 2] = (byte) ((65280 & i5) >>> 8);
            bArr[i4 - 3] = (byte) ((16711680 & i5) >>> 16);
            bArr[i4 - 4] = (byte) (((-16777216) & i5) >>> 24);
        }
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = ((i2 - i6) - 1) << 3;
            bArr[i6] = (byte) ((this.value[this.blocks - 1] & (255 << i7)) >>> i7);
        }
        return bArr;
    }

    public BigInteger toFlexiBigInt() {
        return (this.len == 0 || isZero()) ? new BigInteger(0, new byte[0]) : new BigInteger(1, toByteArray());
    }

    public int[] toIntegerArray() {
        int i = this.blocks;
        int[] iArr = new int[i];
        System.arraycopy(this.value, 0, iArr, 0, i);
        return iArr;
    }

    public String toString(int i) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
        String[] strArr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", com.tencent.connect.common.Constants.DEFAULT_UIN, "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String str = new String();
        int i2 = this.blocks;
        if (i == 16) {
            for (int i3 = i2 - 1; i3 >= 0; i3 += -1) {
                str = ((((((((str + cArr[(this.value[i3] >>> 28) & 15]) + cArr[(this.value[i3] >>> 24) & 15]) + cArr[(this.value[i3] >>> 20) & 15]) + cArr[(this.value[i3] >>> 16) & 15]) + cArr[(this.value[i3] >>> 12) & 15]) + cArr[(this.value[i3] >>> 8) & 15]) + cArr[(this.value[i3] >>> 4) & 15]) + cArr[this.value[i3] & 15]).concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            return str;
        }
        for (int i4 = i2 - 1; i4 >= 0; i4 += -1) {
            str = ((((((((str + strArr[(this.value[i4] >>> 28) & 15]) + strArr[(this.value[i4] >>> 24) & 15]) + strArr[(this.value[i4] >>> 20) & 15]) + strArr[(this.value[i4] >>> 16) & 15]) + strArr[(this.value[i4] >>> 12) & 15]) + strArr[(this.value[i4] >>> 8) & 15]) + strArr[(this.value[i4] >>> 4) & 15]) + strArr[this.value[i4] & 15]).concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        return str;
    }

    public boolean vectorMult(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (this.len != gF2Polynomial.len) {
            olk0.m168132a();
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.blocks; i++) {
            int i2 = this.value[i] & gF2Polynomial.value[i];
            boolean[] zArr = parity;
            z = (((z ^ zArr[i2 & 255]) ^ zArr[(i2 >>> 8) & 255]) ^ zArr[(i2 >>> 16) & 255]) ^ zArr[(i2 >>> 24) & 255];
        }
        return z;
    }

    public GF2Polynomial xor(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2;
        int iMin = Math.min(this.blocks, gF2Polynomial.blocks);
        int i = 0;
        if (this.len >= gF2Polynomial.len) {
            gF2Polynomial2 = new GF2Polynomial(this);
            while (i < iMin) {
                int[] iArr = gF2Polynomial2.value;
                iArr[i] = iArr[i] ^ gF2Polynomial.value[i];
                i++;
            }
        } else {
            gF2Polynomial2 = new GF2Polynomial(gF2Polynomial);
            while (i < iMin) {
                int[] iArr2 = gF2Polynomial2.value;
                iArr2[i] = iArr2[i] ^ this.value[i];
                i++;
            }
        }
        gF2Polynomial2.zeroUnusedBits();
        return gF2Polynomial2;
    }

    public void xorBit(int i) throws RuntimeException {
        if (i < 0 || i > this.len - 1) {
            olk0.m168132a();
            return;
        }
        int[] iArr = this.value;
        int i2 = i >>> 5;
        iArr[i2] = bitMask[i & 31] ^ iArr[i2];
    }

    public void xorThisBy(GF2Polynomial gF2Polynomial) {
        for (int i = 0; i < Math.min(this.blocks, gF2Polynomial.blocks); i++) {
            int[] iArr = this.value;
            iArr[i] = iArr[i] ^ gF2Polynomial.value[i];
        }
        zeroUnusedBits();
    }

    public void randomize(Random random) {
        for (int i = 0; i < this.blocks; i++) {
            this.value[i] = random.nextInt();
        }
        zeroUnusedBits();
    }

    public GF2Polynomial shiftLeft() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + 1, this.value);
        int i = gF2Polynomial.blocks - 1;
        while (true) {
            int[] iArr = gF2Polynomial.value;
            if (i >= 1) {
                int i2 = iArr[i] << 1;
                iArr[i] = i2;
                iArr[i] = i2 | (iArr[i - 1] >>> 31);
                i--;
            } else {
                iArr[0] = iArr[0] << 1;
                return gF2Polynomial;
            }
        }
    }

    public GF2Polynomial(int i, Random random) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.blocks = i2;
        this.value = new int[i2];
        this.len = i;
        randomize(random);
    }

    public GF2Polynomial(int i, String str) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.blocks = i2;
        this.value = new int[i2];
        this.len = i;
        if (str.equalsIgnoreCase("ZERO")) {
            assignZero();
            return;
        }
        if (str.equalsIgnoreCase("ONE")) {
            assignOne();
            return;
        }
        if (str.equalsIgnoreCase("RANDOM")) {
            randomize();
            return;
        }
        if (str.equalsIgnoreCase("X")) {
            assignX();
        } else if (str.equalsIgnoreCase(Rule.ALL)) {
            assignAll();
        } else {
            v1d0.m199002a("Error: GF2Polynomial was called using ", str, " as value!");
            throw null;
        }
    }

    public GF2Polynomial(int i, int[] iArr) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.blocks = i2;
        this.value = new int[i2];
        this.len = i;
        System.arraycopy(iArr, 0, this.value, 0, Math.min(i2, iArr.length));
        zeroUnusedBits();
    }

    public GF2Polynomial(int i, byte[] bArr) {
        int i2;
        int[] iArr;
        i = i < 1 ? 1 : i;
        int i3 = ((i - 1) >> 5) + 1;
        this.blocks = i3;
        this.value = new int[i3];
        this.len = i;
        int iMin = Math.min(((bArr.length - 1) >> 2) + 1, i3);
        int i4 = 0;
        while (true) {
            i2 = iMin - 1;
            iArr = this.value;
            if (i4 >= i2) {
                break;
            }
            int length = bArr.length - (i4 << 2);
            int i5 = bArr[length - 1] & 255;
            iArr[i4] = i5;
            int i6 = (65280 & (bArr[length - 2] << 8)) | i5;
            iArr[i4] = i6;
            int i7 = (16711680 & (bArr[length - 3] << Tnaf.POW_2_WIDTH)) | i6;
            iArr[i4] = i7;
            iArr[i4] = ((bArr[length - 4] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) | i7;
            i4++;
        }
        int length2 = bArr.length - (i2 << 2);
        int i8 = length2 - 1;
        int i9 = bArr[i8] & 255;
        iArr[i2] = i9;
        if (i8 > 0) {
            iArr[i2] = (65280 & (bArr[length2 - 2] << 8)) | i9;
        }
        if (i8 > 1) {
            iArr[i2] = iArr[i2] | (16711680 & (bArr[length2 - 3] << Tnaf.POW_2_WIDTH));
        }
        if (i8 > 2) {
            iArr[i2] = ((bArr[length2 - 4] << 24) & RoundedDrawable.DEFAULT_BORDER_COLOR) | iArr[i2];
        }
        zeroUnusedBits();
        reduceN();
    }

    public GF2Polynomial(int i) {
        i = i < 1 ? 1 : i;
        int i2 = ((i - 1) >> 5) + 1;
        this.blocks = i2;
        this.value = new int[i2];
        this.len = i;
    }

    public GF2Polynomial(GF2Polynomial gF2Polynomial) {
        this.len = gF2Polynomial.len;
        this.blocks = gF2Polynomial.blocks;
        this.value = IntUtils.clone(gF2Polynomial.value);
    }
}
