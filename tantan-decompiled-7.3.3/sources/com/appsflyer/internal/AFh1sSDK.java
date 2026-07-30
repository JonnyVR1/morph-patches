package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1sSDK {

    @NotNull
    public final String AFAdRevenueData;

    @Nullable
    public final String getMediationNetwork;

    @Nullable
    public final Intent getRevenue;

    public AFh1sSDK(@NotNull Activity activity, @NotNull AFi1pSDK aFi1pSDK) {
        activity.getClass();
        aFi1pSDK.getClass();
        this.getRevenue = activity.getIntent();
        this.AFAdRevenueData = aFi1pSDK.getMonetizationNetwork(activity);
        this.getMediationNetwork = aFi1pSDK.AFAdRevenueData(activity);
    }
}
