package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK.RunnableC09555;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1qSDK extends AFf1wSDK<Boolean> {
    private static volatile boolean areAllFieldsValid = false;
    private final AFe1aSDK component1;
    private final AFb1uSDK component2;
    private final AFd1fSDK component3;
    private Boolean component4;

    public AFf1qSDK(@NonNull AFd1fSDK aFd1fSDK) {
        super(AFf1zSDK.LOAD_CACHE, new AFf1zSDK[0], "LoadCachedRequests");
        this.component2 = aFd1fSDK.AFInAppEventType();
        this.component1 = aFd1fSDK.copy();
        this.component3 = aFd1fSDK;
    }

    public static boolean areAllFieldsValid() {
        return areAllFieldsValid;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    @NonNull
    public final AFe1dSDK getMonetizationNetwork() throws Exception {
        for (AFb1qSDK aFb1qSDK : this.component2.getCurrencyIso4217Code()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            StringBuilder sb = new StringBuilder("resending request: ");
            sb.append(aFb1qSDK.getRevenue);
            aFLogger.m5245i(aFg1cSDK, sb.toString());
            try {
                AFh1lSDK aFh1lSDK = new AFh1lSDK(getMonetizationNetwork(aFb1qSDK), aFb1qSDK.getCurrencyIso4217Code(), aFb1qSDK.getCurrencyIso4217Code, aFb1qSDK.AFAdRevenueData);
                AFe1aSDK aFe1aSDK = this.component1;
                aFe1aSDK.AFAdRevenueData.execute(aFe1aSDK.new RunnableC09555(new AFf1fSDK(aFh1lSDK, this.component3)));
            } catch (Exception e) {
                AFLogger.INSTANCE.m5241e(AFg1cSDK.QUEUE, "Failed to resend cached request", e);
            }
        }
        this.component4 = Boolean.TRUE;
        areAllFieldsValid = true;
        return AFe1dSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final long getRevenue() {
        return HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    }

    private static String getMonetizationNetwork(AFb1qSDK aFb1qSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = Long.parseLong(aFb1qSDK.getCurrencyIso4217Code, 10);
        String str = aFb1qSDK.getRevenue;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((jCurrentTimeMillis - j) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }
}
