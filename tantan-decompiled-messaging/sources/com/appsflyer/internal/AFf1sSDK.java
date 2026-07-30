package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1sSDK extends AFf1oSDK<String> {
    private final String component3;

    @Nullable
    private final LinkGenerator.ResponseListener copy;
    private final Map<String, String> copydefault;

    @NonNull
    private final UUID equals;

    @NonNull
    private final LinkGenerator hashCode;

    @Nullable
    private final String toString;

    public AFf1sSDK(@NonNull AFd1fSDK aFd1fSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @Nullable LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1fSDK, uuid.toString());
        this.equals = uuid;
        this.component3 = str;
        this.copydefault = new HashMap(map);
        this.copy = responseListener;
        this.toString = str2;
        this.hashCode = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1rSDK<String> AFAdRevenueData(@NonNull String str) {
        AFe1sSDK aFe1sSDK = ((AFf1oSDK) this).component4;
        return (AFe1rSDK) AFe1sSDK.getMediationNetwork(new Object[]{aFe1sSDK, this.component3, this.copydefault, this.toString, this.equals, str}, -670735838, 670735838, System.identityHashCode(aFe1sSDK));
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    /* JADX INFO: renamed from: a_ */
    public final boolean mo5232a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @Nullable
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean equals() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final void getCurrencyIso4217Code() {
        ResponseNetwork responseNetwork;
        super.getCurrencyIso4217Code();
        LinkGenerator.ResponseListener responseListener = this.copy;
        if (responseListener != null) {
            if (this.getMediationNetwork == AFe1dSDK.SUCCESS && (responseNetwork = ((AFf1oSDK) this).component1) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thComponent2 = component2();
            if (!(thComponent2 instanceof ParsingException)) {
                responseListener.onResponse(this.hashCode.generateLink());
            } else if (((ParsingException) thComponent2).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.hashCode.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final long getRevenue() {
        return 3000L;
    }
}
