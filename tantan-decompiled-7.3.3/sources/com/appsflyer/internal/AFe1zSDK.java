package com.appsflyer.internal;

import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1zSDK {
    public static boolean getCurrencyIso4217Code(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        int currencyIso4217Code = AFc1vSDK.getCurrencyIso4217Code(str);
        int currencyIso4217Code2 = AFc1vSDK.getCurrencyIso4217Code(str2);
        Pair<Integer, Integer> pairAFAdRevenueData = AFe1ySDK.AFAdRevenueData(str2);
        Pair<Integer, Integer> revenue = AFe1ySDK.getRevenue(str2);
        if (currencyIso4217Code2 != -1 && pairAFAdRevenueData == null) {
            return currencyIso4217Code2 == currencyIso4217Code;
        }
        if (revenue != null) {
            return revenue.getFirst().intValue() <= currencyIso4217Code && currencyIso4217Code <= revenue.getSecond().intValue();
        }
        return pairAFAdRevenueData != null && pairAFAdRevenueData.getFirst().intValue() <= currencyIso4217Code && currencyIso4217Code <= pairAFAdRevenueData.getSecond().intValue();
    }
}
