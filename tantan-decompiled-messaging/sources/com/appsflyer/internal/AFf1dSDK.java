package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1dSDK extends AFf1gSDK {

    @NonNull
    private final AFc1oSDK AFInAppEventParameterName;

    @NonNull
    private final AFh1qSDK AFInAppEventType;

    @Nullable
    private final AFi1mSDK AFKeystoreWrapper;

    @NonNull
    private final AFd1rSDK copydefault;

    @NonNull
    private final AFj1vSDK equals;
    public Map<String, Object> hashCode;

    @NonNull
    private final AFg1wSDK valueOf;

    @NonNull
    private final AppsFlyerProperties values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1dSDK$2 */
    public static /* synthetic */ class C09592 {
        static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFj1zSDK.AFa1zSDK.values().length];
            getMediationNetwork = iArr;
            try {
                iArr[AFj1zSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMediationNetwork[AFj1zSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1dSDK(@NonNull AFa1mSDK aFa1mSDK, @NonNull AFd1fSDK aFd1fSDK) {
        super(aFa1mSDK, aFd1fSDK);
        this.equals = aFd1fSDK.equals();
        this.copydefault = aFd1fSDK.getRevenue();
        this.AFInAppEventType = aFd1fSDK.component4();
        this.valueOf = aFd1fSDK.component2();
        this.values = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFd1fSDK.mo5222w();
        this.AFKeystoreWrapper = aFd1fSDK.afInfoLog();
        this.getMonetizationNetwork.add(AFf1zSDK.RESOLVE_ESP);
        this.getMonetizationNetwork.add(AFf1zSDK.DLSDK);
        if (this.AFAdRevenueData == AFf1zSDK.CONVERSION) {
            this.getMonetizationNetwork.add(AFf1zSDK.PLAY_INTEGRITY_API);
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFh1qSDK aFh1qSDK = this.AFInAppEventType;
        int i = ((AFf1gSDK) this).component3.areAllFieldsValid;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            long j = aFh1qSDK.component2;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1qSDK.getRevenue.put("net", Long.valueOf(jCurrentTimeMillis - j));
            aFh1qSDK.getMediationNetwork.getRevenue("first_launch", new JSONObject(aFh1qSDK.getRevenue).toString());
        }
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void getRevenue(AFa1mSDK aFa1mSDK) {
        Map<String, ?> map;
        AFi1kSDK aFi1kSDKAFAdRevenueData;
        super.getRevenue(aFa1mSDK);
        int i = aFa1mSDK.areAllFieldsValid;
        this.AFInAppEventType.getRevenue(i);
        Map map2 = (Map) aFa1mSDK.getRevenue().get("meta");
        if (map2 == null) {
            map2 = new HashMap();
            aFa1mSDK.getRevenue().put("meta", map2);
        }
        if (!aFa1mSDK.getRevenue().containsKey("af_deeplink")) {
            aFa1mSDK.getMediationNetwork(this.AFInAppEventParameterName.getMonetizationNetwork());
        }
        AFh1dSDK currencyIso4217Code = this.valueOf.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            HashMap map3 = new HashMap();
            map3.put("cdn_token", currencyIso4217Code.getMonetizationNetwork);
            String str = currencyIso4217Code.getMediationNetwork;
            if (str != null) {
                map3.put("c_ver", str);
            }
            long j = currencyIso4217Code.getCurrencyIso4217Code;
            if (j > 0) {
                map3.put("latency", Long.valueOf(j));
            }
            long j2 = currencyIso4217Code.AFAdRevenueData;
            if (j2 > 0) {
                map3.put("delay", Long.valueOf(j2));
            }
            int i2 = currencyIso4217Code.getRevenue;
            if (i2 > 0) {
                map3.put("res_code", Integer.valueOf(i2));
            }
            if (currencyIso4217Code.areAllFieldsValid != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(currencyIso4217Code.areAllFieldsValid.getClass().getSimpleName());
                sb.append(": ");
                sb.append(currencyIso4217Code.areAllFieldsValid.getMessage());
                map3.put("error", sb.toString());
            }
            AFi1uSDK aFi1uSDK = currencyIso4217Code.component2;
            if (aFi1uSDK != null) {
                map3.put("sig", aFi1uSDK.toString());
            }
            String str2 = currencyIso4217Code.component1;
            if (str2 != null) {
                map3.put("cdn_cache_status", str2);
            }
            map2.put("rc", map3);
        }
        this.copy.getMediationNetwork(aFa1mSDK.getRevenue());
        if (i == 1) {
            if (this.values.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1mSDK.getRevenue().put("wait_cid", Boolean.toString(true));
            }
            HashMap map4 = new HashMap(this.AFInAppEventType.getMonetizationNetwork);
            this.AFInAppEventType.getMediationNetwork.getRevenue("ddl");
            if (!map4.isEmpty()) {
                map2.put("ddl", map4);
            }
            HashMap map5 = new HashMap(this.AFInAppEventType.getRevenue);
            if (!map5.isEmpty()) {
                map2.put("first_launch", map5);
            }
        } else if (i == 2) {
            HashMap map6 = new HashMap(this.AFInAppEventType.getRevenue);
            if (!map6.isEmpty()) {
                map2.put("first_launch", map6);
            }
            this.AFInAppEventType.getMediationNetwork.getRevenue("first_launch");
        }
        if (map2.isEmpty()) {
            aFa1mSDK.getRevenue().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1zSDK aFj1zSDK : this.equals.AFAdRevenueData()) {
                boolean z = aFj1zSDK instanceof AFi1gSDK;
                int i3 = C09592.getMediationNetwork[aFj1zSDK.component3.ordinal()];
                if (i3 == 1) {
                    if (z) {
                        aFa1mSDK.getMonetizationNetwork("rfr", ((AFi1gSDK) aFj1zSDK).getCurrencyIso4217Code);
                        this.copydefault.AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1zSDK.getMediationNetwork);
                } else if (i3 == 2 && i == 2 && !z) {
                    HashMap map7 = new HashMap();
                    map7.put("source", aFj1zSDK.getMonetizationNetwork);
                    map7.put("response", "TIMEOUT");
                    map7.put("type", aFj1zSDK.component1);
                    arrayList.add(map7);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1mSDK.getMonetizationNetwork("referrers", arrayList);
            }
            Object obj = this.hashCode;
            if (obj != null) {
                aFa1mSDK.getMonetizationNetwork("fb_ddl", obj);
            }
            if (this.AFAdRevenueData == AFf1zSDK.CONVERSION) {
                AFi1mSDK aFi1mSDK = this.AFKeystoreWrapper;
                if (aFi1mSDK == null || (aFi1kSDKAFAdRevenueData = aFi1mSDK.AFAdRevenueData()) == null) {
                    map = null;
                } else {
                    map = new HashMap<>();
                    HashMap map8 = new HashMap();
                    map8.put("pia_timestamp", Long.valueOf(aFi1kSDKAFAdRevenueData.AFAdRevenueData));
                    map8.put("ttr_millis", Long.valueOf(aFi1kSDKAFAdRevenueData.getRevenue));
                    String str3 = aFi1kSDKAFAdRevenueData.getMediationNetwork;
                    if (str3 != null) {
                        map8.put("pia_token", str3);
                    }
                    String str4 = aFi1kSDKAFAdRevenueData.getMonetizationNetwork;
                    if (str4 != null) {
                        map8.put(StateEvent.Name.ERROR_CODE, str4);
                    }
                    map.put("pia", map8);
                }
                if (map != null) {
                    aFa1mSDK.getMediationNetwork(map);
                }
            }
        }
        this.copy.getCurrencyIso4217Code(aFa1mSDK);
    }
}
