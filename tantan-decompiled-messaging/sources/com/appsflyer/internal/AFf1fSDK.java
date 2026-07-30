package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1fSDK extends AFf1oSDK<String> {
    private final AFh1lSDK component3;

    public AFf1fSDK(@NonNull AFh1lSDK aFh1lSDK, @NonNull AFd1fSDK aFd1fSDK) {
        AFf1zSDK aFf1zSDK = aFh1lSDK.copydefault;
        AFf1zSDK aFf1zSDK2 = aFf1zSDK == null ? AFf1zSDK.CACHED_EVENT : aFf1zSDK;
        AFf1zSDK[] aFf1zSDKArr = {AFf1zSDK.RC_CDN};
        StringBuilder sb = new StringBuilder();
        sb.append(aFh1lSDK.getMediationNetwork);
        sb.append("-");
        sb.append(getRevenue(aFh1lSDK));
        super(aFf1zSDK2, aFf1zSDKArr, aFd1fSDK, sb.toString(), aFh1lSDK.getMediationNetwork);
        this.component3 = aFh1lSDK;
    }

    private static String getRevenue(AFh1lSDK aFh1lSDK) {
        try {
            return new URL(aFh1lSDK.component3).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1rSDK<String> AFAdRevenueData(@NonNull String str) {
        String strEncodeToString = Base64.encodeToString(this.component3.getMediationNetwork(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        ((AFf1oSDK) this).component2.getCurrencyIso4217Code(this.component3.component3, strEncodeToString);
        AFe1sSDK aFe1sSDK = ((AFf1oSDK) this).component4;
        return (AFe1rSDK) AFe1sSDK.getMediationNetwork(new Object[]{aFe1sSDK, this.component3}, -527989819, 527989820, System.identityHashCode(aFe1sSDK));
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @Nullable
    public final AppsFlyerRequestListener component1() {
        return this.component3.getRevenue;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean equals() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork;
        AFf1zSDK aFf1zSDK = this.component3.copydefault;
        if (aFf1zSDK == null) {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        return (aFf1zSDK == AFf1zSDK.ARS_VALIDATE && (responseNetwork = ((AFf1oSDK) this).component1) != null && responseNetwork.getStatusCode() == 424) || super.AFAdRevenueData();
    }
}
