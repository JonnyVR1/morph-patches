package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1pSDK extends AFf1rSDK {
    public AFf1pSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1fSDK aFd1fSDK) {
        super(AFf1zSDK.PURCHASE_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1fSDK, map, purchaseValidationCallback);
        this.getMonetizationNetwork.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @Nullable
    public final AFe1rSDK<String> getCurrencyIso4217Code(@NonNull Map<String, Object> map, @NonNull String str, @Nullable String str2) {
        return ((AFf1oSDK) this).component4.getCurrencyIso4217Code(map, str, str2);
    }
}
