package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1qSDK {
    public long AFAdRevenueData;
    public final long[] areAllFieldsValid;
    public long component1;
    public long component2;
    public final long[] component3;
    public final long[] component4;
    public long equals;
    public final Map<String, Object> getCurrencyIso4217Code;
    public final AFd1rSDK getMediationNetwork;
    public final Map<String, Object> getMonetizationNetwork;
    public final Map<String, Object> getRevenue;
    public long hashCode;

    public AFh1qSDK(AFd1rSDK aFd1rSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.getRevenue = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.getMonetizationNetwork = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.getCurrencyIso4217Code = concurrentHashMap3;
        this.AFAdRevenueData = 0L;
        this.component1 = 0L;
        this.component4 = new long[2];
        this.areAllFieldsValid = new long[2];
        this.component3 = new long[2];
        this.component2 = 0L;
        this.equals = 0L;
        this.getMediationNetwork = aFd1rSDK;
        concurrentHashMap.putAll(getCurrencyIso4217Code("first_launch"));
        concurrentHashMap2.putAll(getCurrencyIso4217Code("ddl"));
        concurrentHashMap3.putAll(getCurrencyIso4217Code("gcd"));
        this.hashCode = aFd1rSDK.AFAdRevenueData("prev_session_dur", 0L);
    }

    private Map<String, Object> getCurrencyIso4217Code(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code(str, null);
        if (currencyIso4217Code != null) {
            try {
                return AFa1pSDK.AFAdRevenueData(new JSONObject(currencyIso4217Code));
            } catch (Exception e) {
                AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            }
        }
        return map;
    }

    public final void getMediationNetwork(DeepLinkResult deepLinkResult, long j) {
        this.getMonetizationNetwork.put(NotificationCompat.CATEGORY_STATUS, deepLinkResult.getStatus().toString());
        this.getMonetizationNetwork.put("timeout_value", Long.valueOf(j));
        this.getMediationNetwork.getRevenue("ddl", new JSONObject(this.getMonetizationNetwork).toString());
    }

    public final void getMonetizationNetwork(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.equals;
        if (j != 0) {
            this.getCurrencyIso4217Code.put("net", Long.valueOf(jCurrentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.getCurrencyIso4217Code.put("retries", Integer.valueOf(i));
        this.getMediationNetwork.getRevenue("gcd", new JSONObject(this.getCurrencyIso4217Code).toString());
    }

    public final void getRevenue() {
        this.component1 = System.currentTimeMillis();
        if (getCurrencyIso4217Code()) {
            long j = this.AFAdRevenueData;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.getRevenue.put("init_to_fg", Long.valueOf(this.component1 - j));
            this.getMediationNetwork.getRevenue("first_launch", new JSONObject(this.getRevenue).toString());
        }
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getMediationNetwork.getMonetizationNetwork("appsFlyerCount", 0) == 0;
    }

    public final void getMediationNetwork(AFh1uSDK aFh1uSDK) {
        if (getCurrencyIso4217Code()) {
            this.getRevenue.put("start_with", aFh1uSDK.toString());
            this.getMediationNetwork.getRevenue("first_launch", new JSONObject(this.getRevenue).toString());
        }
    }

    public final void getRevenue(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.component2 = jCurrentTimeMillis;
        if (i == 1) {
            long j = this.component1;
            if (j != 0) {
                this.getRevenue.put("from_fg", Long.valueOf(jCurrentTimeMillis - j));
                this.getMediationNetwork.getRevenue("first_launch", new JSONObject(this.getRevenue).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }
}
