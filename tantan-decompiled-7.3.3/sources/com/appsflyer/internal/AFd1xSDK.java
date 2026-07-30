package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.mnd0;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1xSDK implements AFd1wSDK {

    @NotNull
    private final ScheduledExecutorService AFAdRevenueData;

    @NotNull
    private final AFc1sSDK getCurrencyIso4217Code;

    @NotNull
    private final Executor getMediationNetwork;

    @NotNull
    private final AFi1pSDK getMonetizationNetwork;

    @Nullable
    private AFd1ySDK getRevenue;

    public AFd1xSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1sSDK aFc1sSDK, @NotNull AFi1pSDK aFi1pSDK) {
        executor.getClass();
        scheduledExecutorService.getClass();
        aFc1sSDK.getClass();
        aFi1pSDK.getClass();
        this.getMediationNetwork = executor;
        this.AFAdRevenueData = scheduledExecutorService;
        this.getCurrencyIso4217Code = aFc1sSDK;
        this.getMonetizationNetwork = aFi1pSDK;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void AFAdRevenueData() {
        AFd1wSDK.AFa1zSDK aFa1zSDK;
        AFd1ySDK aFd1ySDK = this.getRevenue;
        if (aFd1ySDK == null || (aFa1zSDK = aFd1ySDK.getMonetizationNetwork) == null) {
            return;
        }
        aFa1zSDK.getMonetizationNetwork();
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void getCurrencyIso4217Code(@NotNull Context context, @NotNull AFd1wSDK.AFa1zSDK aFa1zSDK) {
        context.getClass();
        aFa1zSDK.getClass();
        context.getClass();
        if (this.getRevenue != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                mnd0.m159157a("null cannot be cast to non-null type android.app.Application");
                return;
            }
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.getRevenue);
        }
        this.getRevenue = null;
        AFd1ySDK aFd1ySDK = new AFd1ySDK(this.getMediationNetwork, this.AFAdRevenueData, this.getCurrencyIso4217Code, this.getMonetizationNetwork, aFa1zSDK);
        this.getRevenue = aFd1ySDK;
        if (context instanceof Activity) {
            aFd1ySDK.onActivityResumed((Activity) context);
        }
        Application applicationM5217f_ = AFb1vSDK.m5217f_(context);
        if (applicationM5217f_ != null) {
            applicationM5217f_.registerActivityLifecycleCallbacks(this.getRevenue);
        }
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final boolean getCurrencyIso4217Code() {
        return this.getRevenue != null;
    }
}
