package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1aSDK implements AFb1zSDK {

    @NotNull
    private Map<String, String> getMonetizationNetwork = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFb1zSDK
    @NotNull
    public final Map<String, String> getMonetizationNetwork(@NotNull Context context) {
        context.getClass();
        if (this.getMonetizationNetwork.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i = resources.getConfiguration().screenLayout & 15;
            this.getMonetizationNetwork.put(Constants.INAPP_X_DP, String.valueOf(displayMetrics.xdpi));
            this.getMonetizationNetwork.put(Constants.INAPP_Y_DP, String.valueOf(displayMetrics.ydpi));
            this.getMonetizationNetwork.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.getMonetizationNetwork.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.getMonetizationNetwork.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.getMonetizationNetwork.put("size", String.valueOf(i));
        }
        return this.getMonetizationNetwork;
    }
}
