package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1nSDK extends AFf1oSDK<String> {

    @NonNull
    private final String component3;

    @Nullable
    private final AFj1jSDK copy;
    private final AFd1pSDK hashCode;

    public AFf1nSDK(@NonNull AFd1fSDK aFd1fSDK, @NonNull String str, @Nullable AFj1jSDK aFj1jSDK) {
        super(AFf1zSDK.IMPRESSIONS, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1fSDK, str);
        this.component3 = str;
        this.copy = aFj1jSDK;
        this.hashCode = aFd1fSDK.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1rSDK<String> AFAdRevenueData(@NonNull String str) {
        AFe1sSDK aFe1sSDK = ((AFf1oSDK) this).component4;
        String monetizationNetwork = this.hashCode.getMonetizationNetwork();
        boolean currencyIso4217Code = AFc1tSDK.getCurrencyIso4217Code(monetizationNetwork);
        String string = this.component3;
        if (!currencyIso4217Code) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("advertising_id", monetizationNetwork).build().toString();
        }
        return aFe1sSDK.AFAdRevenueData(string);
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
        super.getCurrencyIso4217Code();
        AFe1kSDK<Result> aFe1kSDK = ((AFf1oSDK) this).component1;
        if (aFe1kSDK != 0) {
            int statusCode = aFe1kSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.component3);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.component3);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                AFLogger.afInfoLog(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.component3);
            AFLogger.afInfoLog(sb3.toString(), false);
            String currencyIso4217Code = aFe1kSDK.getCurrencyIso4217Code("Location");
            AFj1jSDK aFj1jSDK = this.copy;
            if (aFj1jSDK == null || currencyIso4217Code == null) {
                return;
            }
            aFj1jSDK.getMonetizationNetwork = currencyIso4217Code;
            Context context = aFj1jSDK.getRevenue.get();
            if (context != null) {
                try {
                    if (aFj1jSDK.getMonetizationNetwork != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1jSDK.getMonetizationNetwork)).setFlags(268435456));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }
}
