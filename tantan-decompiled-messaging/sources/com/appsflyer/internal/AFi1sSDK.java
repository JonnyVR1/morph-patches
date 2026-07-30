package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1sSDK implements AFi1pSDK {

    @Nullable
    private String getMonetizationNetwork;

    private static String getMediationNetwork(Activity activity) {
        Uri uriM5208t_ = AFc1dSDK.m5208t_(activity != null ? activity.getIntent() : null);
        String string = uriM5208t_ != null ? uriM5208t_.toString() : null;
        if (string == null) {
            string = "";
        }
        if (getMonetizationNetwork(string)) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @Nullable
    public final String AFAdRevenueData(@Nullable Activity activity) {
        String str = this.getMonetizationNetwork;
        this.getMonetizationNetwork = null;
        return (str == null || str.length() == 0) ? getMediationNetwork(activity) : str;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final void getCurrencyIso4217Code(@NotNull Activity activity) {
        activity.getClass();
        String str = this.getMonetizationNetwork;
        if (str == null || str.length() == 0) {
            this.getMonetizationNetwork = getMediationNetwork(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    public final String getMonetizationNetwork(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }

    private static boolean getMonetizationNetwork(String str) {
        return C15386d.m93483J(str, "android-app://", false, 2, null);
    }
}
