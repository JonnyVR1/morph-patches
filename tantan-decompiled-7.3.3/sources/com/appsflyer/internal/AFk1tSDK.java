package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1tSDK {
    public int AFAdRevenueData;
    public int getCurrencyIso4217Code;

    public static char[] getCurrencyIso4217Code(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 4;
        while (i2 < cArr.length) {
            if ((((j >>> i2) & 1) != i || i3 >= 4) && i4 < length) {
                cArr2[i4] = cArr[i2];
                i4++;
            } else {
                cArr2[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        return cArr2;
    }
}
