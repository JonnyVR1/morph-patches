package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
public final class AFd1eSDK implements AFd1aSDK {

    @NotNull
    private final AFd1iSDK getMediationNetwork;

    public AFd1eSDK(@NotNull AFd1iSDK aFd1iSDK) {
        aFd1iSDK.getClass();
        this.getMediationNetwork = aFd1iSDK;
    }

    @Override // com.appsflyer.internal.AFd1aSDK
    public final void AFAdRevenueData(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        bArr.getClass();
        bArr.getClass();
        if (new AFd1cSDK(bArr, map, 2000).getMonetizationNetwork()) {
            this.getMediationNetwork.getMonetizationNetwork();
        }
    }
}
