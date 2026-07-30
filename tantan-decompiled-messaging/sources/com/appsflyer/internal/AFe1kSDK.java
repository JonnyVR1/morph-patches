package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFe1kSDK<Body> implements ResponseNetwork<Body> {
    final boolean AFAdRevenueData;

    @NonNull
    public final AFe1oSDK getCurrencyIso4217Code;

    @NonNull
    final Map<String, List<String>> getMediationNetwork;
    final int getMonetizationNetwork;

    @NonNull
    private final Body getRevenue;

    public AFe1kSDK(@NonNull Body body, int i, boolean z, Map<String, List<String>> map, @NonNull AFe1oSDK aFe1oSDK) {
        this.getRevenue = body;
        this.getMonetizationNetwork = i;
        this.AFAdRevenueData = z;
        this.getMediationNetwork = new HashMap(map);
        this.getCurrencyIso4217Code = aFe1oSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1kSDK aFe1kSDK = (AFe1kSDK) obj;
        if (this.getMonetizationNetwork == aFe1kSDK.getMonetizationNetwork && this.AFAdRevenueData == aFe1kSDK.AFAdRevenueData && this.getRevenue.equals(aFe1kSDK.getRevenue) && this.getMediationNetwork.equals(aFe1kSDK.getMediationNetwork)) {
            return this.getCurrencyIso4217Code.equals(aFe1kSDK.getCurrencyIso4217Code);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.getRevenue;
    }

    @Nullable
    public final String getCurrencyIso4217Code(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(", ");
            sb.append(it.next());
        }
        return sb.toString();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @Nullable
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.getMediationNetwork.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.getMediationNetwork.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getMonetizationNetwork;
    }

    public int hashCode() {
        return (((((((this.getRevenue.hashCode() * 31) + this.getMonetizationNetwork) * 31) + (this.AFAdRevenueData ? 1 : 0)) * 31) + this.getMediationNetwork.hashCode()) * 31) + this.getCurrencyIso4217Code.hashCode();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.AFAdRevenueData;
    }
}
