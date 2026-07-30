package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1tSDK {

    @Nullable
    public AFh1aSDK AFAdRevenueData = null;
    public AFh1aSDK getCurrencyIso4217Code = getCurrencyIso4217Code();
    public final AFd1rSDK getMediationNetwork;
    public long getMonetizationNetwork;
    public long getRevenue;

    public AFg1tSDK(AFd1rSDK aFd1rSDK) {
        this.getMediationNetwork = aFd1rSDK;
        this.getMonetizationNetwork = aFd1rSDK.AFAdRevenueData("af_rc_timestamp", 0L);
        this.getRevenue = aFd1rSDK.AFAdRevenueData("af_rc_max_age", 0L);
    }

    @Nullable
    private AFh1aSDK getCurrencyIso4217Code() {
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code("af_remote_config", null);
        if (currencyIso4217Code == null) {
            AFLogger.INSTANCE.m5240d(AFg1cSDK.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFh1aSDK(new String(Base64.decode(currencyIso4217Code, 2), Charset.defaultCharset()));
        } catch (Exception e) {
            AFLogger.INSTANCE.m5242e(AFg1cSDK.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }
}
