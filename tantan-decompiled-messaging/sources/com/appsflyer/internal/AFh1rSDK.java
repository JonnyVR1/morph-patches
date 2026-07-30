package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFAdRevenueData;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1rSDK extends AFa1mSDK {

    @NonNull
    public final AFAdRevenueData copydefault;

    @Nullable
    public final Map<String, Object> hashCode;

    public AFh1rSDK(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.copydefault = aFAdRevenueData;
        this.hashCode = map;
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.ADREVENUE;
    }
}
