package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AFd1ySDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final AFc1sSDK AFAdRevenueData;
    private boolean component2;
    private boolean component4;

    @NotNull
    private final AFi1pSDK getCurrencyIso4217Code;

    @NotNull
    private final ScheduledExecutorService getMediationNetwork;

    @NotNull
    final AFd1wSDK.AFa1zSDK getMonetizationNetwork;

    @NotNull
    private final Executor getRevenue;

    public AFd1ySDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1sSDK aFc1sSDK, @NotNull AFi1pSDK aFi1pSDK, @NotNull AFd1wSDK.AFa1zSDK aFa1zSDK) {
        executor.getClass();
        scheduledExecutorService.getClass();
        aFc1sSDK.getClass();
        aFi1pSDK.getClass();
        aFa1zSDK.getClass();
        this.getRevenue = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.AFAdRevenueData = aFc1sSDK;
        this.getCurrencyIso4217Code = aFi1pSDK;
        this.getMonetizationNetwork = aFa1zSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1ySDK aFd1ySDK) {
        aFd1ySDK.getClass();
        if (aFd1ySDK.component2 && aFd1ySDK.component4) {
            aFd1ySDK.component2 = false;
            try {
                aFd1ySDK.getMonetizationNetwork.getMonetizationNetwork();
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(final AFd1ySDK aFd1ySDK) {
        aFd1ySDK.getClass();
        aFd1ySDK.component4 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1ySDK.getMediationNetwork;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.o
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getCurrencyIso4217Code(this.f4302a);
                }
            };
            AFd1wSDK.Companion companion = AFd1wSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFd1wSDK.Companion.getCurrencyIso4217Code(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        activity.getClass();
        AFc1sSDK aFc1sSDK = this.AFAdRevenueData;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFc1sSDK.getCurrencyIso4217Code) {
            aFc1sSDK.getCurrencyIso4217Code = intent;
        }
        this.getCurrencyIso4217Code.getCurrencyIso4217Code(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
        this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.q
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.getMediationNetwork(this.f4305a);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        activity.getClass();
        final AFh1sSDK aFh1sSDK = new AFh1sSDK(activity, this.getCurrencyIso4217Code);
        this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.p
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.getMediationNetwork(this.f4303a, aFh1sSDK);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1ySDK aFd1ySDK, AFh1sSDK aFh1sSDK) {
        aFd1ySDK.getClass();
        aFh1sSDK.getClass();
        if (!aFd1ySDK.component2) {
            try {
                aFd1ySDK.getMonetizationNetwork.getMediationNetwork(aFh1sSDK);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFd1ySDK.component4 = false;
        aFd1ySDK.component2 = true;
    }
}
