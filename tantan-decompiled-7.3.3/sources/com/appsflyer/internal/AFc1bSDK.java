package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1bSDK {
    public final Map<String, Object> getMediationNetwork = new HashMap();
    public Map<String, Object> getCurrencyIso4217Code = new HashMap();

    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        if (!this.getMediationNetwork.isEmpty()) {
            map.put("partner_data", this.getMediationNetwork);
        }
        if (this.getCurrencyIso4217Code.isEmpty()) {
            return;
        }
        AFb1tSDK.getRevenue(map).put("partner_data", this.getCurrencyIso4217Code);
        this.getCurrencyIso4217Code = new HashMap();
    }
}
