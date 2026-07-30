package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1bSDK {

    public interface AFa1ySDK {
        void onConfigurationChanged(boolean z);
    }

    void AFAdRevenueData(@NonNull Throwable th, @NonNull String str);

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@Nullable AFa1ySDK aFa1ySDK);

    void getMonetizationNetwork();
}
