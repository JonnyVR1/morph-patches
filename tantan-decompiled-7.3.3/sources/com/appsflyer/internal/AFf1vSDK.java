package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1vSDK extends AFf1rSDK {
    public AFf1vSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1fSDK aFd1fSDK) {
        super(AFf1zSDK.ARS_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1fSDK, map, purchaseValidationCallback);
        this.getMonetizationNetwork.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component1;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.AFAdRevenueData();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @Nullable
    public final AFe1rSDK<String> getCurrencyIso4217Code(@NonNull Map<String, Object> map, @NonNull String str, @Nullable String str2) {
        return ((AFf1oSDK) this).component4.getMediationNetwork(map, str, str2);
    }
}
