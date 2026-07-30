package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1aSDK.RunnableC09595;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialOperation;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1cSDK implements Runnable {
    final String AFAdRevenueData;
    private final String areAllFieldsValid;
    private final Map<String, String> component1;
    private final AFd1pSDK component2;
    private final String component3;
    final String getCurrencyIso4217Code;
    final String getMediationNetwork;
    private final String getMonetizationNetwork;
    private final WeakReference<Context> getRevenue;

    public AFa1cSDK(Context context, String str, AFd1pSDK aFd1pSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.getRevenue = new WeakReference<>(context);
        this.getMonetizationNetwork = str;
        this.component3 = str2;
        this.getCurrencyIso4217Code = str4;
        this.getMediationNetwork = str5;
        this.AFAdRevenueData = str6;
        this.component1 = map;
        this.areAllFieldsValid = str3;
        this.component2 = aFd1pSDK;
    }

    private static AFf1gSDK getCurrencyIso4217Code(Context context, @NonNull AFh1hSDK aFh1hSDK) {
        AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code(context);
        AFd1fSDK currencyIso4217Code = AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code();
        aFh1hSDK.getMonetizationNetwork(currencyIso4217Code.getMediationNetwork().getRevenue.getMonetizationNetwork("appsFlyerCount", 0));
        AFf1gSDK aFf1gSDK = new AFf1gSDK(aFh1hSDK, currencyIso4217Code);
        AFe1aSDK aFe1aSDKCopy = currencyIso4217Code.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(aFf1gSDK));
        return aFf1gSDK;
    }

    public static void getMediationNetwork(boolean z, String str, String str2, String str3, String str4) {
        if (AFb1tSDK.getCurrencyIso4217Code != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(str2);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1tSDK.getCurrencyIso4217Code.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1tSDK.getCurrencyIso4217Code;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.getMonetizationNetwork;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.getRevenue.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.component3);
            map.put("sig-data", this.getCurrencyIso4217Code);
            map.put(SocialOperation.GAME_SIGNATURE, this.areAllFieldsValid);
            Object map2 = new HashMap(map);
            Object obj = this.component1;
            String currencyIso4217Code = AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code().getRevenue().getCurrencyIso4217Code("referrer", "");
            AFh1iSDK aFh1iSDK = new AFh1iSDK();
            aFh1iSDK.component2 = currencyIso4217Code;
            AFb1tSDK monetizationNetwork = AFb1tSDK.getMonetizationNetwork();
            Map<String, Object> mapAFAdRevenueData = monetizationNetwork.AFAdRevenueData(aFh1iSDK);
            mapAFAdRevenueData.put(FirebaseAnalytics.Param.PRICE, this.getMediationNetwork);
            mapAFAdRevenueData.put(FirebaseAnalytics.Param.CURRENCY, this.AFAdRevenueData);
            mapAFAdRevenueData.put("receipt_data", map2);
            if (obj != null) {
                mapAFAdRevenueData.put("extra_prms", obj);
            }
            mapAFAdRevenueData.putAll(monetizationNetwork.getCurrencyIso4217Code().AFKeystoreWrapper().AFAdRevenueData());
            aFh1iSDK.getMediationNetwork(mapAFAdRevenueData);
            aFh1iSDK.getMonetizationNetwork(new AFj1mSDK(this.component2).getMonetizationNetwork(aFh1iSDK));
            getCurrencyIso4217Code(context, aFh1iSDK);
            map.put("dev_key", this.getMonetizationNetwork);
            map.put(Constants.JumpUrlConstants.URL_KEY_APPID, context.getPackageName());
            map.put(Oauth2AccessToken.KEY_UID, AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1pSDK aFh1pSDK = AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code().getMediationNetwork().getMonetizationNetwork.component4;
            AFb1ySDK aFb1ySDK = aFh1pSDK != null ? new AFb1ySDK(aFh1pSDK.AFAdRevenueData, aFh1pSDK.component2) : null;
            String str2 = aFb1ySDK != null ? aFb1ySDK.AFAdRevenueData : null;
            if (str2 != null) {
                map.put("advertiserId", str2);
            }
            AFh1gSDK aFh1gSDK = (AFh1gSDK) new AFh1gSDK().getMediationNetwork(map);
            aFh1gSDK.getMonetizationNetwork(new AFj1mSDK(this.component2).getMonetizationNetwork(aFh1gSDK));
            final AFf1gSDK currencyIso4217Code2 = getCurrencyIso4217Code(context, aFh1gSDK);
            aFh1gSDK.getRevenue = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1cSDK.3
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, @NonNull String str3) {
                    ResponseNetwork responseNetwork;
                    if (i == 50 && (responseNetwork = ((AFf1oSDK) currencyIso4217Code2).component1) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1cSDK aFa1cSDK = AFa1cSDK.this;
                    AFa1cSDK.getMediationNetwork(false, aFa1cSDK.getCurrencyIso4217Code, aFa1cSDK.getMediationNetwork, aFa1cSDK.AFAdRevenueData, str3);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFf1oSDK) currencyIso4217Code2).component1.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean zOptBoolean = jSONObject.optBoolean(LovePlanetStage.result);
                        AFa1cSDK aFa1cSDK = AFa1cSDK.this;
                        AFa1cSDK.getMediationNetwork(zOptBoolean, aFa1cSDK.getCurrencyIso4217Code, aFa1cSDK.getMediationNetwork, aFa1cSDK.AFAdRevenueData, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1cSDK aFa1cSDK2 = AFa1cSDK.this;
                        AFa1cSDK.getMediationNetwork(false, aFa1cSDK2.getCurrencyIso4217Code, aFa1cSDK2.getMediationNetwork, aFa1cSDK2.AFAdRevenueData, e.getMessage());
                    }
                }
            };
        } catch (Throwable th) {
            if (AFb1tSDK.getCurrencyIso4217Code != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                getMediationNetwork(false, this.getCurrencyIso4217Code, this.getMediationNetwork, this.AFAdRevenueData, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }
}
