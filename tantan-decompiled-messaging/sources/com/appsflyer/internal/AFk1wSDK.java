package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1wSDK {
    public int getCurrencyIso4217Code;
    public int getMediationNetwork;
    public int getMonetizationNetwork;

    public static int getMediationNetwork(int i) {
        int[][] iArr = AFj1kSDK.getRevenue.AFAdRevenueData;
        return ((iArr[0][(i >>> 24) & 255] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    public static void getMonetizationNetwork(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
