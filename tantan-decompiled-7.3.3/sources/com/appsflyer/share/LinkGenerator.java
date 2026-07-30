package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1hSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK.RunnableC09595;
import com.appsflyer.internal.AFf1sSDK;
import com.appsflyer.internal.AFj1gSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class LinkGenerator {
    private final String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private String copy;
    private final Map<String, String> copydefault = new HashMap();
    private String getCurrencyIso4217Code;
    String getMediationNetwork;
    String getMonetizationNetwork;
    private String getRevenue;
    private String hashCode;

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFAdRevenueData = str;
    }

    private Map<String, String> AFAdRevenueData() {
        HashMap map = new HashMap();
        map.put("pid", this.AFAdRevenueData);
        String str = this.component1;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.getRevenue;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component4;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.getCurrencyIso4217Code;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.areAllFieldsValid;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.component2;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.copy != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.copy);
            String str7 = this.component3;
            if (str7 != null) {
                this.component3 = str7.replaceFirst("^[/]", "");
                sb.append(this.copy.endsWith("/") ? "" : "/");
                sb.append(this.component3);
            }
            map.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.copydefault.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFb1hSDK.getMediationNetwork(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.copydefault.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.copydefault.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.getMediationNetwork;
        if (str == null || !str.startsWith("http")) {
            sb.append(String.format(AFj1gSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName()));
        } else {
            sb.append(this.getMediationNetwork);
        }
        if (this.getMonetizationNetwork != null) {
            sb.append('/');
            sb.append(this.getMonetizationNetwork);
        }
        Map<String, String> mapAFAdRevenueData = AFAdRevenueData();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : mapAFAdRevenueData.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append('&');
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.hashCode;
    }

    public String getCampaign() {
        return this.getCurrencyIso4217Code;
    }

    public String getChannel() {
        return this.getRevenue;
    }

    public String getMediaSource() {
        return this.AFAdRevenueData;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.copydefault);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.copy = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.getMediationNetwork = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName()), str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.getMediationNetwork = String.format("https://%s/%s", str2, str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.hashCode = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.getCurrencyIso4217Code = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.getRevenue = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.component3 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.component4 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.component2 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.component1 = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.hashCode;
        Map<String, String> mapAFAdRevenueData = AFAdRevenueData();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code(context);
        AFd1fSDK currencyIso4217Code = AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code();
        AFf1sSDK aFf1sSDK = new AFf1sSDK(currencyIso4217Code, UUID.randomUUID(), string, mapAFAdRevenueData, str, responseListener, this);
        AFe1aSDK aFe1aSDKCopy = currencyIso4217Code.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(aFf1sSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.5
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
