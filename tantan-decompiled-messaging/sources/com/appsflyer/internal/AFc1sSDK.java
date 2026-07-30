package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1aSDK.RunnableC09555;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1sSDK {
    public String AFAdRevenueData;
    public final AFd1fSDK areAllFieldsValid;
    public long component3;

    @Nullable
    public String[] component4;
    public Intent getCurrencyIso4217Code;
    public Map<String, String> getMonetizationNetwork;

    @Nullable
    public DeepLinkListener getRevenue;

    @NonNull
    public List<List<String>> getMediationNetwork = new ArrayList();

    @NonNull
    public final List<String> component1 = new ArrayList();

    public AFc1sSDK(@NonNull AFd1fSDK aFd1fSDK) {
        this.areAllFieldsValid = aFd1fSDK;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX INFO: renamed from: r_ */
    private boolean m5209r_(Intent intent, Context context, AFc1kSDK aFc1kSDK) {
        String string;
        Uri uriM5210s_;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.getCurrencyIso4217Code;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (!this.getMediationNetwork.isEmpty() && extras != null) {
                for (List<String> list : this.getMediationNetwork) {
                    if (list == null) {
                        uriM5210s_ = null;
                    } else {
                        Iterator<String> it = list.iterator();
                        if (it.hasNext() && (string = extras.getString(it.next())) != null) {
                            uriM5210s_ = m5210s_(string, it);
                        } else {
                            uriM5210s_ = null;
                        }
                    }
                    if (uriM5210s_ != null) {
                        StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                        sb.append(list.toString());
                        AFLogger.afDebugLog(sb.toString());
                        List<List<String>> list2 = this.getMediationNetwork;
                        Map<String, Object> revenue = AFb1tSDK.getRevenue(aFc1kSDK.getCurrencyIso4217Code);
                        revenue.getClass();
                        revenue.put("payloadKey", list2);
                        AFc1oSDK aFc1oSDK = aFc1kSDK.getMediationNetwork;
                        if (aFc1oSDK != null) {
                            aFc1oSDK.getMediationNetwork(aFc1kSDK.getCurrencyIso4217Code);
                        }
                        uri = uriM5210s_;
                        break;
                    }
                }
            }
        } else {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        }
        if (data != null) {
            AFj1sSDK aFj1sSDK = new AFj1sSDK(intent);
            if (!aFj1sSDK.getCurrencyIso4217Code("af_consumed")) {
                aFj1sSDK.m5259I_("af_consumed", System.currentTimeMillis());
                m5212q_(context, aFc1kSDK, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.afInfoLog(sb2.toString());
            return false;
        }
        if (data2 != null) {
            AFj1sSDK aFj1sSDK2 = new AFj1sSDK(this.getCurrencyIso4217Code);
            if (!aFj1sSDK2.getCurrencyIso4217Code("af_consumed")) {
                aFj1sSDK2.m5259I_("af_consumed", System.currentTimeMillis());
                m5212q_(context, aFc1kSDK, data2);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb3.append(data2.toString());
            sb3.append(" w/af_consumed");
            AFLogger.afInfoLog(sb3.toString());
            return false;
        }
        if (uri == null) {
            AFLogger.afDebugLog("No deep link detected");
            return false;
        }
        AFj1sSDK aFj1sSDK3 = new AFj1sSDK(intent);
        if (!aFj1sSDK3.getCurrencyIso4217Code("af_consumed")) {
            aFj1sSDK3.m5259I_("af_consumed", System.currentTimeMillis());
            m5212q_(context, aFc1kSDK, uri);
            return true;
        }
        StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb4.append(uri.toString());
        sb4.append(" w/af_consumed");
        AFLogger.afInfoLog(sb4.toString());
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: s_ */
    private Uri m5210s_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    public final void AFAdRevenueData(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getRevenue == null) {
            getRevenue(map);
            return;
        }
        try {
            try {
                DeepLink deepLinkAFAdRevenueData = DeepLink.AFAdRevenueData(map);
                deepLinkAFAdRevenueData.getMediationNetwork.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(deepLinkAFAdRevenueData, null);
            } catch (JSONException e) {
                AFLogger.INSTANCE.m5242e(AFg1cSDK.DDL, "Error occurred", e, true);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            getRevenue(deepLinkResult);
        } catch (Throwable th) {
            getRevenue(new DeepLinkResult(null, null));
            throw th;
        }
    }

    public final void getCurrencyIso4217Code(String str, DeepLinkResult.Error error) {
        if (this.getRevenue == null) {
            getCurrencyIso4217Code(str);
        } else {
            AFLogger.INSTANCE.m5240d(AFg1cSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getRevenue(new DeepLinkResult(null, error));
        }
    }

    public final void getRevenue(DeepLinkResult deepLinkResult) {
        if (this.getRevenue == null) {
            AFLogger.INSTANCE.m5240d(AFg1cSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
        StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        aFLogger.m5240d(aFg1cSDK, sb.toString());
        try {
            this.getRevenue.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th);
        }
    }

    /* JADX INFO: renamed from: p_ */
    public final void m5211p_(AFc1kSDK aFc1kSDK, Intent intent, Context context) {
        AFd1nSDK aFd1nSDK = (AFd1nSDK) this.areAllFieldsValid;
        if (context != null) {
            aFd1nSDK.getMediationNetwork.getCurrencyIso4217Code = context.getApplicationContext();
        }
        if (!m5209r_(intent, context, aFc1kSDK) && this.getRevenue != null && this.areAllFieldsValid.getMediationNetwork().getRevenue.getMonetizationNetwork("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.getRevenue().AFAdRevenueData("ddl_sent")) {
            AFc1qSDK aFc1qSDK = new AFc1qSDK();
            AFe1aSDK aFe1aSDKCopy = this.areAllFieldsValid.copy();
            aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09555(new AFf1hSDK(aFc1qSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.getRevenue().AFAdRevenueData("ddl_sent", true);
    }

    /* JADX INFO: renamed from: q_ */
    public final void m5212q_(Context context, AFc1kSDK aFc1kSDK, Uri uri) {
        AFf1iSDK aFf1iSDK = new AFf1iSDK(context, aFc1kSDK, uri, this.component1);
        AFe1aSDK aFe1aSDKCopy = this.areAllFieldsValid.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09555(aFf1iSDK));
        this.getCurrencyIso4217Code = null;
    }

    private static void getCurrencyIso4217Code(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void getRevenue(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }
}
