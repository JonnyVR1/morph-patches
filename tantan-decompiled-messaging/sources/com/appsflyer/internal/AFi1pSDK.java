package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFi1pSDK {
    @Nullable
    String AFAdRevenueData(@Nullable Activity activity);

    void getCurrencyIso4217Code(@NotNull Activity activity);

    @NotNull
    String getMonetizationNetwork(@Nullable Activity activity);
}
