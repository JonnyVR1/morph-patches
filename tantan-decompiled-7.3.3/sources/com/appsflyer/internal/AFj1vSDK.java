package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1vSDK {
    public final AFd1fSDK AFAdRevenueData;
    public final List<AFj1zSDK> getMonetizationNetwork = new ArrayList();

    public AFj1vSDK(AFd1fSDK aFd1fSDK) {
        this.AFAdRevenueData = aFd1fSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3(final Runnable runnable) {
        AFi1aSDK aFi1aSDK = new AFi1aSDK(this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.AFAdRevenueData(), AFi1eSDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4283a.getMediationNetwork(runnable);
            }
        });
        getRevenue(aFi1aSDK);
        aFi1aSDK.getMonetizationNetwork(this.AFAdRevenueData.valueOf().getCurrencyIso4217Code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(Runnable runnable) {
        AFi1aSDK aFi1aSDK = new AFi1aSDK(this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.AFAdRevenueData(), AFi1eSDK.FACEBOOK_LITE, runnable, new Runnable() { // from class: com.appsflyer.internal.h0
            @Override // java.lang.Runnable
            public final void run() {
                AFj1vSDK.getMonetizationNetwork();
            }
        });
        getRevenue(aFi1aSDK);
        aFi1aSDK.getMonetizationNetwork(this.AFAdRevenueData.valueOf().getCurrencyIso4217Code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(AFi1gSDK aFi1gSDK, Runnable runnable) {
        AFd1rSDK revenue = this.AFAdRevenueData.getRevenue();
        int monetizationNetwork = this.AFAdRevenueData.getMediationNetwork().getRevenue.getMonetizationNetwork("appsFlyerCount", 0);
        boolean zAFAdRevenueData = revenue.AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z = aFi1gSDK.component3 == AFj1zSDK.AFa1zSDK.NOT_STARTED;
        if (monetizationNetwork == 1) {
            if (z || zAFAdRevenueData) {
                runnable.run();
            }
        }
    }

    @VisibleForTesting
    public final void AFAdRevenueData(final Runnable runnable) {
        getRevenue(new AFi1aSDK(this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.AFAdRevenueData(), AFi1eSDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4297a.component3(runnable);
            }
        }));
    }

    public final boolean getCurrencyIso4217Code(AFa1mSDK aFa1mSDK) {
        int monetizationNetwork = this.AFAdRevenueData.getMediationNetwork().getRevenue.getMonetizationNetwork("appsFlyerCount", 0);
        return (!this.AFAdRevenueData.getRevenue().AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT) && monetizationNetwork == 1) || (monetizationNetwork == 1 && !(aFa1mSDK instanceof AFh1oSDK));
    }

    public final AFi1gSDK getMonetizationNetwork(final Runnable runnable) {
        return new AFi1gSDK(new Runnable() { // from class: com.appsflyer.internal.k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4291a.getCurrencyIso4217Code(runnable);
            }
        }, this.AFAdRevenueData.AFAdRevenueData(), this.AFAdRevenueData.getMediationNetwork());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMonetizationNetwork() {
    }

    @NonNull
    public final synchronized AFj1zSDK[] AFAdRevenueData() {
        return (AFj1zSDK[]) this.getMonetizationNetwork.toArray(new AFj1zSDK[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        try {
            if (getCurrencyIso4217Code(new AFh1oSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(final Runnable runnable) {
        AFj1oSDK.getRevenue(this.AFAdRevenueData.getCurrencyIso4217Code(), new Runnable() { // from class: com.appsflyer.internal.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4288a.getRevenue(runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    public final Runnable getCurrencyIso4217Code(final AFi1gSDK aFi1gSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4294a.getRevenue(aFi1gSDK, runnable);
            }
        };
    }

    @VisibleForTesting
    public final boolean getCurrencyIso4217Code() {
        return this.AFAdRevenueData.getMediationNetwork().getCurrencyIso4217Code("AF_PREINSTALL_DISABLED");
    }

    public final synchronized void getRevenue(AFj1zSDK aFj1zSDK) {
        this.getMonetizationNetwork.add(aFj1zSDK);
    }
}
