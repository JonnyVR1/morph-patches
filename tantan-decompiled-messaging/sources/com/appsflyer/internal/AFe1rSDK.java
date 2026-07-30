package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1rSDK<ResponseBody> {
    public final AFe1jSDK AFAdRevenueData;
    private final AtomicBoolean getCurrencyIso4217Code = new AtomicBoolean(false);
    private final AFe1gSDK<ResponseBody> getMediationNetwork;
    private final ExecutorService getMonetizationNetwork;
    private final AFe1nSDK getRevenue;

    public AFe1rSDK(AFe1jSDK aFe1jSDK, ExecutorService executorService, AFe1nSDK aFe1nSDK, AFe1gSDK<ResponseBody> aFe1gSDK) {
        this.AFAdRevenueData = aFe1jSDK;
        this.getMonetizationNetwork = executorService;
        this.getRevenue = aFe1nSDK;
        this.getMediationNetwork = aFe1gSDK;
    }

    public final AFe1kSDK<ResponseBody> getRevenue() throws IOException {
        if (this.getCurrencyIso4217Code.getAndSet(true)) {
            qkq0.m175383a("Http call is already executed");
            return null;
        }
        AFe1kSDK<String> revenue = this.getRevenue.getRevenue(this.AFAdRevenueData);
        try {
            return new AFe1kSDK<>(this.getMediationNetwork.getMonetizationNetwork(revenue.getBody()), revenue.getMonetizationNetwork, revenue.AFAdRevenueData, revenue.getMediationNetwork, revenue.getCurrencyIso4217Code);
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
            throw new ParsingException(e.getMessage(), e, revenue);
        }
    }
}
