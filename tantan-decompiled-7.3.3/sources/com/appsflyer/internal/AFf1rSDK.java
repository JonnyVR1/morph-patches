package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFf1rSDK extends AFf1tSDK {

    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback component3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1rSDK(@NotNull AFf1zSDK aFf1zSDK, @NotNull AFf1zSDK[] aFf1zSDKArr, @NotNull AFd1fSDK aFd1fSDK, @NotNull Map<String, ? extends Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1fSDK, null, map);
        aFf1zSDK.getClass();
        aFf1zSDKArr.getClass();
        aFd1fSDK.getClass();
        map.getClass();
        this.component3 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component1;
        if (responseNetwork != null) {
            responseNetwork.getClass();
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final boolean areAllFieldsValid() {
        return true;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final void getCurrencyIso4217Code() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getCurrencyIso4217Code();
        Throwable thComponent2 = component2();
        if (thComponent2 != null && (purchaseValidationCallback2 = this.component3) != null) {
            purchaseValidationCallback2.onFailure(thComponent2);
        }
        ResponseNetwork<String> responseNetwork = ((AFf1oSDK) this).component1;
        if (responseNetwork == null || (purchaseValidationCallback = this.component3) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @Nullable
    public final String getRevenue(@NotNull Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @Nullable
    public final String getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }
}
