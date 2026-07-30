package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1fSDK {
    void AFAdRevenueData(@NotNull AFa1mSDK aFa1mSDK);

    void AFAdRevenueData(@NotNull Map<String, Object> map);

    void getCurrencyIso4217Code(@NotNull AFa1mSDK aFa1mSDK);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map, boolean z, @NotNull Function0<String> function0);

    void getMediationNetwork(@NotNull AFa1mSDK aFa1mSDK);

    void getMediationNetwork(@NotNull Map<String, Object> map);

    @Nullable
    Long getMonetizationNetwork();

    long getRevenue();

    void getRevenue(@NotNull AFa1mSDK aFa1mSDK);

    void getRevenue(@NotNull Map<String, Object> map, int i, int i2);
}
