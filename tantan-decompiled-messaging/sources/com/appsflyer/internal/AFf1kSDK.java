package com.appsflyer.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1kSDK extends AFf1wSDK<Unit> {

    @NotNull
    private final AFi1mSDK component1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1kSDK(@NotNull AFi1mSDK aFi1mSDK) {
        super(AFf1zSDK.PLAY_INTEGRITY_API, new AFf1zSDK[0], "PlayIntegrityApiTask");
        aFi1mSDK.getClass();
        this.component1 = aFi1mSDK;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    @NotNull
    public final AFe1dSDK getMonetizationNetwork() {
        this.component1.getRevenue();
        return AFe1dSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final long getRevenue() {
        return Constants.ONE_MIN_IN_MILLIS;
    }
}
