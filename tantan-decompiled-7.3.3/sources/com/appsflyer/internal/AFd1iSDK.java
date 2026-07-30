package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1iSDK {
    @WorkerThread
    int AFAdRevenueData();

    @WorkerThread
    void getCurrencyIso4217Code(int i, int i2);

    @WorkerThread
    boolean getMediationNetwork(@NotNull String... strArr);

    @WorkerThread
    @Nullable
    String getMonetizationNetwork(@NotNull Throwable th, @NotNull String str);

    @WorkerThread
    boolean getMonetizationNetwork();

    @WorkerThread
    @NotNull
    List<AFd1gSDK> getRevenue();
}
