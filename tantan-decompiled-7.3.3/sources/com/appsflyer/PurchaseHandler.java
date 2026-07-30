package com.appsflyer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFd1pSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHandler {

    @NonNull
    public final AFe1aSDK AFAdRevenueData;

    @NonNull
    public final AFd1fSDK getMonetizationNetwork;

    @NonNull
    private final AFd1pSDK getRevenue;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFd1fSDK aFd1fSDK) {
        this.getMonetizationNetwork = aFd1fSDK;
        this.getRevenue = aFd1fSDK.getMediationNetwork();
        this.AFAdRevenueData = aFd1fSDK.copy();
    }

    public final boolean getMonetizationNetwork(Map<String, Object> map, @Nullable PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean mediationNetwork = AFb1iSDK.getMediationNetwork(map, strArr, this.getRevenue);
        if (!mediationNetwork && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return mediationNetwork;
    }
}
