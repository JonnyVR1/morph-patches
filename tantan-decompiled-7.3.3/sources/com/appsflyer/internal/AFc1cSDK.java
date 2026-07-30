package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFc1cSDK<T> {
    public final String AFAdRevenueData;
    private final String[] getCurrencyIso4217Code;
    public final Context getMediationNetwork;
    public final AFd1fSDK getMonetizationNetwork;
    public final FutureTask<T> getRevenue = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFc1cSDK.4
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFc1cSDK.this.getRevenue()) {
                return (T) AFc1cSDK.this.getMonetizationNetwork();
            }
            return null;
        }
    });

    public AFc1cSDK(Context context, AFd1fSDK aFd1fSDK, String str, String... strArr) {
        this.getMediationNetwork = context;
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = strArr;
        this.getMonetizationNetwork = aFd1fSDK;
    }

    @Nullable
    public T AFAdRevenueData() {
        try {
            return this.getRevenue.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e3) {
            AFLogger.afErrorLog(e3.getMessage(), e3, false, false);
            return null;
        }
    }

    public abstract T getMonetizationNetwork();

    public final boolean getRevenue() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.getMediationNetwork.getPackageManager().resolveContentProvider(this.AFAdRevenueData, 128);
            return providerInfoResolveContentProvider != null && Arrays.asList(this.getCurrencyIso4217Code).contains(AFb1vSDK.m5216e_(this.getMediationNetwork.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return false;
        }
    }
}
