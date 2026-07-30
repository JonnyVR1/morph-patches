package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1fSDK {
    @NonNull
    ExecutorService AFAdRevenueData();

    @NonNull
    AFi1lSDK AFInAppEventParameterName();

    @NonNull
    AFb1uSDK AFInAppEventType();

    @NonNull
    AFg1rSDK AFKeystoreWrapper();

    @NonNull
    AFi1xSDK AFLogger();

    @NonNull
    AFd1bSDK afDebugLog();

    @Nullable
    AFi1mSDK afInfoLog();

    @NonNull
    PurchaseHandler areAllFieldsValid();

    @NonNull
    AFj1uSDK component1();

    @NonNull
    AFg1wSDK component2();

    @NonNull
    AFg1fSDK component3();

    @NonNull
    AFh1qSDK component4();

    @NonNull
    AFe1aSDK copy();

    @NonNull
    AFb1bSDK copydefault();

    @NonNull
    /* JADX INFO: renamed from: d */
    AFc1eSDK mo5228d();

    @NonNull
    /* JADX INFO: renamed from: e */
    AFd1mSDK mo5229e();

    @NonNull
    AFj1vSDK equals();

    @NonNull
    AFg1nSDK force();

    @NonNull
    ScheduledExecutorService getCurrencyIso4217Code();

    @NonNull
    AFd1pSDK getMediationNetwork();

    @NonNull
    AFe1sSDK getMonetizationNetwork();

    @NonNull
    AFd1rSDK getRevenue();

    @NonNull
    /* JADX INFO: renamed from: i */
    AFd1wSDK mo5230i();

    @NonNull
    AFi1pSDK registerClient();

    @NonNull
    AFc1sSDK unregisterClient();

    @NonNull
    /* JADX INFO: renamed from: v */
    AFh1vSDK mo5231v();

    @NonNull
    AFd1kSDK valueOf();

    @NonNull
    AFe1fSDK values();

    @NonNull
    /* JADX INFO: renamed from: w */
    AFc1oSDK mo5232w();
}
