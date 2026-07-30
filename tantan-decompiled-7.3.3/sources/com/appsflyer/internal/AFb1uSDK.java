package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFb1uSDK {
    @WorkerThread
    boolean AFAdRevenueData(@Nullable String str);

    @WorkerThread
    @NotNull
    List<AFb1qSDK> getCurrencyIso4217Code();

    void getMediationNetwork();

    @WorkerThread
    @Nullable
    String getMonetizationNetwork(@NotNull AFb1qSDK aFb1qSDK);

    @WorkerThread
    void getMonetizationNetwork();
}
