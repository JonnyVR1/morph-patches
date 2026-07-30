package p153l;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes2.dex */
public class iiw {

    /* JADX INFO: renamed from: c */
    static byte[] f115144c = {-128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: d */
    private static final char[] f115145d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    jiw f115146a;

    /* JADX INFO: renamed from: b */
    jiw f115147b;

    public iiw() {
        m140160i();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m140147a(byte[] bArr) {
        int[] iArrM140153h = {1732584193, -271733879, -1732584194, 271733878, -1009589776};
        byte[] bArrM140154j = m140154j(bArr);
        byte[] bArr2 = new byte[64];
        byte[] bArrM140149c = new byte[0];
        if (bArrM140154j.length % 64 != 0) {
            System.exit(0);
        }
        int length = bArrM140154j.length / 64;
        for (int i = 0; i < length; i++) {
            System.arraycopy(bArrM140154j, i * 64, bArr2, 0, 64);
            iArrM140153h = m140153h(iArrM140153h, bArr2);
        }
        for (int i2 : iArrM140153h) {
            bArrM140149c = m140149c(bArrM140149c, m140157p(i2));
        }
        return bArrM140149c;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m140148b(byte[] bArr) {
        int[] iArrM140153h = {1732584193, -271733879, -1732584194, 271733878, -1009589776};
        byte[] bArrM140155k = m140155k(bArr);
        byte[] bArr2 = new byte[64];
        byte[] bArrM140149c = new byte[0];
        if (bArrM140155k.length % 64 != 0) {
            System.exit(0);
        }
        int length = bArrM140155k.length / 64;
        for (int i = 0; i < length; i++) {
            System.arraycopy(bArrM140155k, i * 64, bArr2, 0, 64);
            iArrM140153h = m140153h(iArrM140153h, bArr2);
        }
        for (int i2 : iArrM140153h) {
            bArrM140149c = m140149c(bArrM140149c, m140157p(i2));
        }
        return bArrM140149c;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m140149c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* JADX INFO: renamed from: d */
    private void m140150d(byte[] bArr, int i, int[] iArr) {
        iArr[0] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24);
        iArr[1] = (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8) | ((bArr[i + 6] & 255) << 16) | (bArr[i + 7] << 24);
        iArr[2] = (bArr[i + 8] & 255) | ((bArr[i + 9] & 255) << 8) | ((bArr[i + 10] & 255) << 16) | (bArr[i + 11] << 24);
        iArr[3] = (bArr[i + 12] & 255) | ((bArr[i + 13] & 255) << 8) | ((bArr[i + 14] & 255) << 16) | (bArr[i + 15] << 24);
        iArr[4] = (bArr[i + 16] & 255) | ((bArr[i + 17] & 255) << 8) | ((bArr[i + 18] & 255) << 16) | (bArr[i + 19] << 24);
        iArr[5] = (bArr[i + 20] & 255) | ((bArr[i + 21] & 255) << 8) | ((bArr[i + 22] & 255) << 16) | (bArr[i + 23] << 24);
        iArr[6] = (bArr[i + 24] & 255) | ((bArr[i + 25] & 255) << 8) | ((bArr[i + 26] & 255) << 16) | (bArr[i + 27] << 24);
        iArr[7] = (bArr[i + 28] & 255) | ((bArr[i + 29] & 255) << 8) | ((bArr[i + 30] & 255) << 16) | (bArr[i + 31] << 24);
        iArr[8] = (bArr[i + 32] & 255) | ((bArr[i + 33] & 255) << 8) | ((bArr[i + 34] & 255) << 16) | (bArr[i + 35] << 24);
        iArr[9] = (bArr[i + 36] & 255) | ((bArr[i + 37] & 255) << 8) | ((bArr[i + 38] & 255) << 16) | (bArr[i + 39] << 24);
        iArr[10] = (bArr[i + 40] & 255) | ((bArr[i + 41] & 255) << 8) | ((bArr[i + 42] & 255) << 16) | (bArr[i + 43] << 24);
        iArr[11] = (bArr[i + 44] & 255) | ((bArr[i + 45] & 255) << 8) | ((bArr[i + 46] & 255) << 16) | (bArr[i + 47] << 24);
        iArr[12] = (bArr[i + 48] & 255) | ((bArr[i + 49] & 255) << 8) | ((bArr[i + 50] & 255) << 16) | (bArr[i + 51] << 24);
        iArr[13] = (bArr[i + 52] & 255) | ((bArr[i + 53] & 255) << 8) | ((bArr[i + 54] & 255) << 16) | (bArr[i + 55] << 24);
        iArr[14] = (bArr[i + 56] & 255) | ((bArr[i + 57] & 255) << 8) | ((bArr[i + 58] & 255) << 16) | (bArr[i + 59] << 24);
        iArr[15] = (bArr[i + 60] & 255) | ((bArr[i + 61] & 255) << 8) | ((bArr[i + 62] & 255) << 16) | (bArr[i + 63] << 24);
    }

    /* JADX INFO: renamed from: e */
    private byte[] m140151e(int[] iArr, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 : iArr) {
            bArr[i2] = (byte) (i3 & 255);
            bArr[i2 + 1] = (byte) ((i3 >>> 8) & 255);
            bArr[i2 + 2] = (byte) ((i3 >>> 16) & 255);
            bArr[i2 + 3] = (byte) ((i3 >>> 24) & 255);
            i2 += 4;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: f */
    private byte[] m140152f(int[] iArr, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 : iArr) {
            bArr[i2] = (byte) (i3 & 255);
            bArr[i2 + 1] = (byte) ((i3 >>> 8) & 255);
            bArr[i2 + 2] = (byte) ((i3 >>> 16) & 255);
            bArr[i2 + 3] = (byte) ((i3 >>> 24) & 255);
            i2 += 4;
        }
        return m140147a(bArr);
    }

    /* JADX INFO: renamed from: h */
    private static int[] m140153h(int[] iArr, byte[] bArr) {
        int i;
        int iM140158q;
        int i2;
        int[] iArr2 = {1518500249, 1859775393, -1894007588, -899497514};
        int[] iArr3 = new int[80];
        int i3 = 0;
        while (true) {
            if (i3 >= 16) {
                break;
            }
            for (int i4 = 0; i4 < 4; i4++) {
                iArr3[i3] = ((bArr[(i3 * 4) + i4] & 255) << (24 - (i4 * 8))) | iArr3[i3];
            }
            i3++;
        }
        for (i = 16; i < 80; i++) {
            iArr3[i] = m140158q(((iArr3[i - 3] ^ iArr3[i - 8]) ^ iArr3[i - 14]) ^ iArr3[i - 16], 1);
        }
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = 0;
        for (int i11 = 80; i10 < i11; i11 = 80) {
            if (i10 < 20) {
                iM140158q = m140158q(i5, 5) + (((~i6) & i8) | (i6 & i7)) + i9 + iArr2[0];
                i2 = iArr3[i10];
            } else if (i10 < 40) {
                iM140158q = m140158q(i5, 5) + ((i6 ^ i7) ^ i8) + i9 + iArr2[1];
                i2 = iArr3[i10];
            } else if (i10 < 60) {
                iM140158q = m140158q(i5, 5) + (((i7 | i8) & i6) | (i7 & i8)) + i9 + iArr2[2];
                i2 = iArr3[i10];
            } else {
                iM140158q = m140158q(i5, 5) + ((i6 ^ i7) ^ i8) + i9 + iArr2[3];
                i2 = iArr3[i10];
            }
            int i12 = iM140158q + i2;
            int iM140158q2 = m140158q(i6, 30);
            i10++;
            i6 = i5;
            i9 = i8;
            i5 = i12;
            i8 = i7;
            i7 = iM140158q2;
        }
        iArr[0] = iArr[0] + i5;
        iArr[1] = iArr[1] + i6;
        iArr[2] = iArr[2] + i7;
        iArr[3] = iArr[3] + i8;
        iArr[4] = iArr[4] + i9;
        return iArr;
    }

    /* JADX INFO: renamed from: j */
    private static byte[] m140154j(byte[] bArr) {
        int length = bArr.length + 50;
        int i = length % 64;
        int i2 = 64 - i;
        if (i2 < 9) {
            i2 = 128 - i;
        }
        byte[] bArr2 = new byte[i2];
        bArr2[0] = -128;
        long j = length * 8;
        for (int i3 = 0; i3 < 8; i3++) {
            bArr2[(i2 - 1) - i3] = (byte) ((j >> (i3 * 8)) & 255);
        }
        byte[] bArr3 = new byte[length + i2];
        try {
            System.arraycopy(m140149c("hjYCH7mA4HYSHNe0rgnhWM30uFkylEdFnwFy6W4Zg5N1X9Om9P".getBytes("UTF-8"), bArr), 0, bArr3, 0, length);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        System.arraycopy(bArr2, 0, bArr3, length, i2);
        return bArr3;
    }

    /* JADX INFO: renamed from: k */
    private static byte[] m140155k(byte[] bArr) {
        int length = bArr.length;
        int i = length % 64;
        int i2 = 64 - i;
        if (i2 < 9) {
            i2 = 128 - i;
        }
        byte[] bArr2 = new byte[i2];
        bArr2[0] = -128;
        long j = length * 8;
        for (int i3 = 0; i3 < 8; i3++) {
            bArr2[(i2 - 1) - i3] = (byte) ((j >> (i3 * 8)) & 255);
        }
        byte[] bArr3 = new byte[length + i2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, i2);
        return bArr3;
    }

    /* JADX INFO: renamed from: l */
    private void m140156l(jiw jiwVar, byte[] bArr, int i, int[] iArr) {
        int[] iArr2 = jiwVar.f121124a;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        int i4 = iArr2[2];
        int i5 = iArr2[3];
        m140150d(bArr, i, iArr);
        int i6 = (i3 & i4) | ((~i3) & i5);
        int i7 = iArr[0];
        int i8 = i2 + ((i6 + i7) - 680876936);
        int i9 = ((i8 >>> 25) | (i8 << 7)) + i3;
        int i10 = (i9 & i3) | ((~i9) & i4);
        int i11 = iArr[1];
        int i12 = i5 + ((i10 + i11) - 389564586);
        int i13 = ((i12 >>> 20) | (i12 << 12)) + i9;
        int i14 = (i13 & i9) | ((~i13) & i3);
        int i15 = iArr[2];
        int i16 = i4 + i14 + i15 + 606105819;
        int i17 = ((i16 >>> 15) | (i16 << 17)) + i13;
        int i18 = (i17 & i13) | ((~i17) & i9);
        int i19 = iArr[3];
        int i20 = i3 + ((i18 + i19) - 1044525330);
        int i21 = ((i20 >>> 10) | (i20 << 22)) + i17;
        int i22 = ((~i21) & i13) | (i21 & i17);
        int i23 = iArr[4];
        int i24 = i9 + ((i22 + i23) - 176418897);
        int i25 = ((i24 << 7) | (i24 >>> 25)) + i21;
        int i26 = (i25 & i21) | ((~i25) & i17);
        int i27 = iArr[5];
        int i28 = i13 + i26 + i27 + 1200080426;
        int i29 = ((i28 >>> 20) | (i28 << 12)) + i25;
        int i30 = (i29 & i25) | ((~i29) & i21);
        int i31 = iArr[6];
        int i32 = i17 + ((i30 + i31) - 1473231341);
        int i33 = ((i32 << 17) | (i32 >>> 15)) + i29;
        int i34 = (i33 & i29) | ((~i33) & i25);
        int i35 = iArr[7];
        int i36 = i21 + ((i34 + i35) - 45705983);
        int i37 = ((i36 >>> 10) | (i36 << 22)) + i33;
        int i38 = (i37 & i33) | ((~i37) & i29);
        int i39 = iArr[8];
        int i40 = i25 + i38 + i39 + 1770035416;
        int i41 = ((i40 >>> 25) | (i40 << 7)) + i37;
        int i42 = (~i41) & i33;
        int i43 = iArr[9];
        int i44 = i29 + (((i42 | (i41 & i37)) + i43) - 1958414417);
        int i45 = ((i44 << 12) | (i44 >>> 20)) + i41;
        int i46 = (i45 & i41) | ((~i45) & i37);
        int i47 = iArr[10];
        int i48 = i33 + ((i46 + i47) - 42063);
        int i49 = ((i48 << 17) | (i48 >>> 15)) + i45;
        int i50 = ((~i49) & i41) | (i49 & i45);
        int i51 = iArr[11];
        int i52 = i37 + ((i50 + i51) - 1990404162);
        int i53 = ((i52 << 22) | (i52 >>> 10)) + i49;
        int i54 = (~i53) & i45;
        int i55 = iArr[12];
        int i56 = i41 + (i54 | (i53 & i49)) + i55 + 1804603682;
        int i57 = ((i56 >>> 25) | (i56 << 7)) + i53;
        int i58 = (i57 & i53) | ((~i57) & i49);
        int i59 = iArr[13];
        int i60 = i45 + ((i58 + i59) - 40341101);
        int i61 = ((i60 << 12) | (i60 >>> 20)) + i57;
        int i62 = ~i61;
        int i63 = iArr[14];
        int i64 = i49 + ((((i61 & i57) | (i62 & i53)) + i63) - 1502002290);
        int i65 = ((i64 << 17) | (i64 >>> 15)) + i61;
        int i66 = ~i65;
        int i67 = iArr[15];
        int i68 = i53 + ((i65 & i61) | (i66 & i57)) + i67 + 1236535329;
        int i69 = ((i68 << 22) | (i68 >>> 10)) + i65;
        int i70 = i57 + ((((i69 & i61) | (i65 & i62)) + i11) - 165796510);
        int i71 = ((i70 << 5) | (i70 >>> 27)) + i69;
        int i72 = i61 + ((((i71 & i65) | (i69 & i66)) + i31) - 1069501632);
        int i73 = ((i72 << 9) | (i72 >>> 23)) + i71;
        int i74 = i65 + ((i73 & i69) | ((~i69) & i71)) + i51 + 643717713;
        int i75 = ((i74 << 14) | (i74 >>> 18)) + i73;
        int i76 = i69 + ((((i75 & i71) | ((~i71) & i73)) + i7) - 373897302);
        int i77 = ((i76 << 20) | (i76 >>> 12)) + i75;
        int i78 = i71 + ((((i77 & i73) | ((~i73) & i75)) + i27) - 701558691);
        int i79 = ((i78 << 5) | (i78 >>> 27)) + i77;
        int i80 = i73 + ((i79 & i75) | ((~i75) & i77)) + i47 + 38016083;
        int i81 = ((i80 << 9) | (i80 >>> 23)) + i79;
        int i82 = i75 + ((((i81 & i77) | ((~i77) & i79)) + i67) - 660478335);
        int i83 = ((i82 << 14) | (i82 >>> 18)) + i81;
        int i84 = i77 + ((((i83 & i79) | ((~i79) & i81)) + i23) - 405537848);
        int i85 = ((i84 << 20) | (i84 >>> 12)) + i83;
        int i86 = i79 + ((i85 & i81) | ((~i81) & i83)) + i43 + 568446438;
        int i87 = ((i86 << 5) | (i86 >>> 27)) + i85;
        int i88 = i81 + ((((i87 & i83) | ((~i83) & i85)) + i63) - 1019803690);
        int i89 = ((i88 << 9) | (i88 >>> 23)) + i87;
        int i90 = i83 + ((((i89 & i85) | ((~i85) & i87)) + i19) - 187363961);
        int i91 = ((i90 << 14) | (i90 >>> 18)) + i89;
        int i92 = i85 + ((i91 & i87) | ((~i87) & i89)) + i39 + 1163531501;
        int i93 = ((i92 << 20) | (i92 >>> 12)) + i91;
        int i94 = i87 + ((((i93 & i89) | ((~i89) & i91)) + i59) - 1444681467);
        int i95 = ((i94 << 5) | (i94 >>> 27)) + i93;
        int i96 = i89 + ((((i95 & i91) | ((~i91) & i93)) + i15) - 51403784);
        int i97 = ((i96 << 9) | (i96 >>> 23)) + i95;
        int i98 = i91 + ((i97 & i93) | ((~i93) & i95)) + i35 + 1735328473;
        int i99 = ((i98 << 14) | (i98 >>> 18)) + i97;
        int i100 = i93 + ((((i99 & i95) | ((~i95) & i97)) + i55) - 1926607734);
        int i101 = ((i100 << 20) | (i100 >>> 12)) + i99;
        int i102 = i95 + ((((i101 ^ i99) ^ i97) + i27) - 378558);
        int i103 = ((i102 << 4) | (i102 >>> 28)) + i101;
        int i104 = i97 + ((((i103 ^ i101) ^ i99) + i39) - 2022574463);
        int i105 = ((i104 << 11) | (i104 >>> 21)) + i103;
        int i106 = i99 + ((i105 ^ i103) ^ i101) + i51 + 1839030562;
        int i107 = ((i106 << 16) | (i106 >>> 16)) + i105;
        int i108 = i101 + ((((i107 ^ i105) ^ i103) + i63) - 35309556);
        int i109 = ((i108 << 23) | (i108 >>> 9)) + i107;
        int i110 = i103 + ((((i109 ^ i107) ^ i105) + i11) - 1530992060);
        int i111 = ((i110 << 4) | (i110 >>> 28)) + i109;
        int i112 = i105 + ((i111 ^ i109) ^ i107) + i23 + 1272893353;
        int i113 = ((i112 << 11) | (i112 >>> 21)) + i111;
        int i114 = i107 + ((((i113 ^ i111) ^ i109) + i35) - 155497632);
        int i115 = ((i114 << 16) | (i114 >>> 16)) + i113;
        int i116 = i109 + ((((i115 ^ i113) ^ i111) + i47) - 1094730640);
        int i117 = ((i116 << 23) | (i116 >>> 9)) + i115;
        int i118 = i111 + ((i117 ^ i115) ^ i113) + i59 + 681279174;
        int i119 = ((i118 << 4) | (i118 >>> 28)) + i117;
        int i120 = i113 + ((((i119 ^ i117) ^ i115) + i7) - 358537222);
        int i121 = ((i120 << 11) | (i120 >>> 21)) + i119;
        int i122 = i115 + ((((i121 ^ i119) ^ i117) + i19) - 722521979);
        int i123 = ((i122 << 16) | (i122 >>> 16)) + i121;
        int i124 = i117 + ((i123 ^ i121) ^ i119) + i31 + 76029189;
        int i125 = ((i124 << 23) | (i124 >>> 9)) + i123;
        int i126 = i119 + ((((i125 ^ i123) ^ i121) + i43) - 640364487);
        int i127 = ((i126 << 4) | (i126 >>> 28)) + i125;
        int i128 = i121 + ((((i127 ^ i125) ^ i123) + i55) - 421815835);
        int i129 = ((i128 << 11) | (i128 >>> 21)) + i127;
        int i130 = i123 + ((i129 ^ i127) ^ i125) + i67 + 530742520;
        int i131 = ((i130 << 16) | (i130 >>> 16)) + i129;
        int i132 = i125 + ((((i131 ^ i129) ^ i127) + i15) - 995338651);
        int i133 = ((i132 << 23) | (i132 >>> 9)) + i131;
        int i134 = i127 + (((((~i129) | i133) ^ i131) + i7) - 198630844);
        int i135 = ((i134 >>> 26) | (i134 << 6)) + i133;
        int i136 = i129 + (((~i131) | i135) ^ i133) + i35 + 1126891415;
        int i137 = ((i136 >>> 22) | (i136 << 10)) + i135;
        int i138 = i131 + (((((~i133) | i137) ^ i135) + i63) - 1416354905);
        int i139 = ((i138 >>> 17) | (i138 << 15)) + i137;
        int i140 = i133 + (((((~i135) | i139) ^ i137) + i27) - 57434055);
        int i141 = ((i140 >>> 11) | (i140 << 21)) + i139;
        int i142 = i135 + (((~i137) | i141) ^ i139) + i55 + 1700485571;
        int i143 = ((i142 >>> 26) | (i142 << 6)) + i141;
        int i144 = i137 + (((((~i139) | i143) ^ i141) + i19) - 1894986606);
        int i145 = ((i144 >>> 22) | (i144 << 10)) + i143;
        int i146 = i139 + (((((~i141) | i145) ^ i143) + i47) - 1051523);
        int i147 = ((i146 >>> 17) | (i146 << 15)) + i145;
        int i148 = i141 + (((((~i143) | i147) ^ i145) + i11) - 2054922799);
        int i149 = ((i148 >>> 11) | (i148 << 21)) + i147;
        int i150 = i143 + (((~i145) | i149) ^ i147) + i39 + 1873313359;
        int i151 = ((i150 >>> 26) | (i150 << 6)) + i149;
        int i152 = i145 + (((((~i147) | i151) ^ i149) + i67) - 30611744);
        int i153 = ((i152 >>> 22) | (i152 << 10)) + i151;
        int i154 = i147 + (((((~i149) | i153) ^ i151) + i31) - 1560198380);
        int i155 = ((i154 >>> 17) | (i154 << 15)) + i153;
        int i156 = i149 + (((~i151) | i155) ^ i153) + i59 + 1309151649;
        int i157 = ((i156 >>> 11) | (i156 << 21)) + i155;
        int i158 = i151 + (((((~i153) | i157) ^ i155) + i23) - 145523070);
        int i159 = ((i158 >>> 26) | (i158 << 6)) + i157;
        int i160 = i153 + (((((~i155) | i159) ^ i157) + i51) - 1120210379);
        int i161 = ((i160 >>> 22) | (i160 << 10)) + i159;
        int i162 = i155 + (((~i157) | i161) ^ i159) + i15 + 718787259;
        int i163 = ((i162 >>> 17) | (i162 << 15)) + i161;
        int i164 = i157 + (((((~i159) | i163) ^ i161) + i43) - 343485551);
        int[] iArr3 = jiwVar.f121124a;
        iArr3[0] = iArr3[0] + i159;
        iArr3[1] = iArr3[1] + ((i164 >>> 11) | (i164 << 21)) + i163;
        iArr3[2] = iArr3[2] + i163;
        iArr3[3] = iArr3[3] + i161;
    }

    /* JADX INFO: renamed from: p */
    public static final byte[] m140157p(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    /* JADX INFO: renamed from: q */
    public static final int m140158q(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* JADX INFO: renamed from: g */
    public synchronized byte[] m140159g() {
        try {
            if (this.f115147b == null) {
                jiw jiwVar = new jiw(this.f115146a);
                long j = jiwVar.f121125b;
                byte[] bArrM140151e = m140151e(new int[]{(int) (j << 3), (int) (j >> 29)}, 8);
                int i = (int) (jiwVar.f121125b & 63);
                m140161m(jiwVar, f115144c, 0, i < 56 ? 56 - i : 120 - i);
                m140161m(jiwVar, bArrM140151e, 0, 8);
                this.f115147b = jiwVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return m140152f(this.f115147b.f121124a, 16);
    }

    /* JADX INFO: renamed from: i */
    public synchronized iiw m140160i() {
        this.f115146a = new jiw();
        this.f115147b = null;
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m140161m(jiw jiwVar, byte[] bArr, int i, int i2) {
        byte[] bArr2;
        this.f115147b = null;
        if (i2 - i > bArr.length) {
            i2 = bArr.length - i;
        }
        long j = jiwVar.f121125b;
        int i3 = (int) (63 & j);
        jiwVar.f121125b = j + ((long) i2);
        int i4 = 64 - i3;
        int i5 = 0;
        if (i2 >= i4) {
            int[] iArr = new int[16];
            if (i4 == 64) {
                i4 = 0;
            } else {
                int i6 = 0;
                while (true) {
                    bArr2 = jiwVar.f121126c;
                    if (i6 >= i4) {
                        break;
                    }
                    bArr2[i6 + i3] = bArr[i6 + i];
                    i6++;
                }
                m140156l(jiwVar, bArr2, 0, iArr);
            }
            while (i4 + 63 < i2) {
                m140156l(jiwVar, bArr, i4 + i, iArr);
                i4 += 64;
            }
            i3 = 0;
            i5 = i4;
        }
        if (i5 < i2) {
            for (int i7 = i5; i7 < i2; i7++) {
                jiwVar.f121126c[(i3 + i7) - i5] = bArr[i7 + i];
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m140162n(byte[] bArr) {
        m140163o(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: o */
    public void m140163o(byte[] bArr, int i, int i2) {
        m140161m(this.f115146a, bArr, i, i2);
    }
}
