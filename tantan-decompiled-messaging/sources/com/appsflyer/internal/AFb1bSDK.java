package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFb1bSDK {
    void AFAdRevenueData();

    boolean component2();

    void getCurrencyIso4217Code(@NotNull String str, @NotNull String str2);

    boolean getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMediationNetwork(@NotNull String str, @NotNull String str2);

    void getMediationNetwork(@NotNull String str, @NotNull String... strArr);

    void getMonetizationNetwork();

    void getMonetizationNetwork(@NotNull String str, int i, @NotNull String str2);

    void getMonetizationNetwork(@NotNull Throwable th);

    void getRevenue();

    /* JADX INFO: renamed from: m_ */
    void mo5187m_(@Nullable String str, @Nullable PackageManager packageManager);
}
