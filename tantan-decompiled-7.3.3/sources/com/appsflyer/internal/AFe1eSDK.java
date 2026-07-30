package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes.dex */
public interface AFe1eSDK {
    @WorkerThread
    void getCurrencyIso4217Code(@NonNull AFf1wSDK<?> aFf1wSDK);

    @WorkerThread
    void getMonetizationNetwork(@NonNull AFf1wSDK<?> aFf1wSDK);

    @WorkerThread
    void getMonetizationNetwork(@NonNull AFf1wSDK<?> aFf1wSDK, @NonNull AFe1dSDK aFe1dSDK);
}
