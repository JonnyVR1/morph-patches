package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1hSDK {
    private static void AFAdRevenueData(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    private static int getCurrencyIso4217Code(int i, int[][] iArr) {
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    public static void getRevenue(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            AFAdRevenueData(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            int currencyIso4217Code = i2 ^ getCurrencyIso4217Code(i5, iArr2);
            i4++;
            i2 = i5;
            i = currencyIso4217Code;
        }
        int i6 = i ^ iArr[iArr.length - 2];
        int i7 = i2 ^ iArr[iArr.length - 1];
        if (!z) {
            AFAdRevenueData(iArr);
        }
        iArr3[0] = i7;
        iArr3[1] = i6;
    }
}
