package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1pSDK implements AFg1oSDK {

    @NotNull
    private final Context getCurrencyIso4217Code;

    @NotNull
    private final AppsFlyerProperties getMonetizationNetwork;

    public AFg1pSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        context.getClass();
        appsFlyerProperties.getClass();
        this.getCurrencyIso4217Code = context;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1oSDK
    @Nullable
    public final AFg1mSDK getMonetizationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getCurrencyIso4217Code);
            int i = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i2 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i3 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i4 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                str = string;
            }
            return new AFg1mSDK(i3, i, i2, i4, str);
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e, false, false, false, false, 120, null);
            return null;
        }
    }
}
