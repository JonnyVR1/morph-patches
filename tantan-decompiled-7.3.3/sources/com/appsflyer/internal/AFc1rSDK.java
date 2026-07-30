package com.appsflyer.internal;

import com.appsflyer.internal.AFe1aSDK.RunnableC09595;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1rSDK implements Runnable {

    @Nullable
    private final Map<String, Object> AFAdRevenueData;

    @NotNull
    private final AFd1fSDK getCurrencyIso4217Code;

    @NotNull
    private final AFa1mSDK getMediationNetwork;

    public AFc1rSDK(@NotNull AFd1fSDK aFd1fSDK, @NotNull AFa1mSDK aFa1mSDK, @Nullable Map<String, ? extends Object> map) {
        aFd1fSDK.getClass();
        aFa1mSDK.getClass();
        this.getCurrencyIso4217Code = aFd1fSDK;
        this.getMediationNetwork = aFa1mSDK;
        this.AFAdRevenueData = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1wSDK aFf1eSDK;
        if (this.getMediationNetwork.AFAdRevenueData()) {
            AFf1dSDK aFf1dSDK = new AFf1dSDK(this.getMediationNetwork, this.getCurrencyIso4217Code);
            aFf1dSDK.hashCode = this.AFAdRevenueData;
            aFf1eSDK = aFf1dSDK;
        } else {
            aFf1eSDK = this.getMediationNetwork instanceof AFh1rSDK ? new AFf1eSDK((AFh1rSDK) this.getMediationNetwork, this.getCurrencyIso4217Code) : new AFf1gSDK(this.getMediationNetwork, this.getCurrencyIso4217Code);
        }
        AFe1aSDK aFe1aSDKCopy = this.getCurrencyIso4217Code.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(aFf1eSDK));
        if (aFf1eSDK.AFAdRevenueData == AFf1zSDK.CONVERSION) {
            this.getCurrencyIso4217Code.values();
            if (AFe1fSDK.AFAdRevenueData() && AFb1vSDK.AFAdRevenueData(this.getCurrencyIso4217Code.valueOf().getCurrencyIso4217Code)) {
                AFe1aSDK aFe1aSDKCopy2 = this.getCurrencyIso4217Code.copy();
                aFe1aSDKCopy2.AFAdRevenueData.execute(aFe1aSDKCopy2.new RunnableC09595(new AFf1jSDK(this.getCurrencyIso4217Code, "install")));
            }
        }
    }
}
