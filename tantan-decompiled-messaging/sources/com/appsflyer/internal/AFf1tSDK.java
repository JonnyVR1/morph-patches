package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import androidx.annotation.CallSuper;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.p046p1.mobile.putong.data.Device;
import com.tencent.connect.common.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFf1tSDK extends AFf1oSDK<String> {

    @NotNull
    private final AFf1zSDK component3;

    @NotNull
    private final AFg1fSDK copy;

    @NotNull
    private final AFd1pSDK copydefault;

    @NotNull
    private final AFd1rSDK equals;

    @NotNull
    private final Map<String, Object> hashCode;

    @NotNull
    private final AFg1nSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1tSDK(@NotNull AFf1zSDK aFf1zSDK, @NotNull AFf1zSDK[] aFf1zSDKArr, @NotNull AFd1fSDK aFd1fSDK, @Nullable String str, @NotNull Map<String, ? extends Object> map) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1fSDK, null);
        aFf1zSDK.getClass();
        aFf1zSDKArr.getClass();
        aFd1fSDK.getClass();
        map.getClass();
        this.component3 = aFf1zSDK;
        this.hashCode = map;
        AFd1pSDK mediationNetwork = aFd1fSDK.getMediationNetwork();
        mediationNetwork.getClass();
        this.copydefault = mediationNetwork;
        AFd1rSDK revenue = aFd1fSDK.getRevenue();
        revenue.getClass();
        this.equals = revenue;
        AFg1fSDK aFg1fSDKComponent3 = aFd1fSDK.component3();
        aFg1fSDKComponent3.getClass();
        this.copy = aFg1fSDKComponent3;
        AFg1nSDK aFg1nSDKForce = aFd1fSDK.force();
        aFg1nSDKForce.getClass();
        this.toString = aFg1nSDKForce;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @Nullable
    public final AFe1rSDK<String> AFAdRevenueData(@NotNull String str) {
        AFe1jSDK aFe1jSDK;
        str.getClass();
        Map<String, Object> mutableMap = MapsKt.toMutableMap(this.hashCode);
        String revenue = getRevenue(mutableMap);
        String currencyIso4217Code = getCurrencyIso4217Code(mutableMap);
        Map<String, Object> mutableMap2 = MapsKt.toMutableMap(mutableMap);
        getRevenue(mutableMap2, revenue);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String monetizationNetwork = this.copydefault.getMonetizationNetwork();
        if (monetizationNetwork != null && !StringsKt.m93438e0(monetizationNetwork)) {
            linkedHashMap.put("advertising_id", monetizationNetwork);
        }
        AFb1ySDK revenue2 = AFb1rSDK.getRevenue(this.copydefault.AFAdRevenueData.getCurrencyIso4217Code);
        String str2 = null;
        String str3 = revenue2 != null ? revenue2.AFAdRevenueData : null;
        if (str3 != null && !StringsKt.m93438e0(str3)) {
            linkedHashMap.put(Device.OAID, str3);
        }
        AFb1ySDK aFb1ySDKM5191b_ = AFb1rSDK.m5191b_(this.copydefault.AFAdRevenueData.getCurrencyIso4217Code.getContentResolver());
        String str4 = aFb1ySDKM5191b_ != null ? aFb1ySDKM5191b_.AFAdRevenueData : null;
        if (str4 != null && !StringsKt.m93438e0(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            mutableMap2.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String strAFAdRevenueData = ((AFf1oSDK) this).areAllFieldsValid.AFAdRevenueData(this.equals);
            if (strAFAdRevenueData != null && !StringsKt.m93438e0(strAFAdRevenueData)) {
                linkedHashMap.put(Device.IMEI, strAFAdRevenueData);
            }
        }
        AFd1pSDK aFd1pSDK = this.copydefault;
        String strAFAdRevenueData2 = AFb1lSDK.AFAdRevenueData(aFd1pSDK.AFAdRevenueData, aFd1pSDK.getRevenue);
        if (strAFAdRevenueData2 == null) {
            strAFAdRevenueData2 = "";
        }
        linkedHashMap.put("appsflyer_id", strAFAdRevenueData2);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, "6.15.0");
        if (currencyIso4217Code != null && !StringsKt.m93438e0(currencyIso4217Code)) {
            linkedHashMap.put("sdk_connector_version", currencyIso4217Code);
        }
        mutableMap2.put("device_data", linkedHashMap);
        this.toString.getMediationNetwork(mutableMap2, this.component3);
        AFe1rSDK<String> currencyIso4217Code2 = getCurrencyIso4217Code(mutableMap2, str, revenue);
        if (currencyIso4217Code2 != null && (aFe1jSDK = currencyIso4217Code2.AFAdRevenueData) != null) {
            str2 = aFe1jSDK.getRevenue;
        }
        if (str2 != null) {
            String string = new JSONObject(mutableMap2).toString();
            string.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(toString());
            sb.append(": preparing data: ");
            sb.append(string);
            AFb1kSDK.getMediationNetwork(sb.toString());
            ((AFf1oSDK) this).component2.getCurrencyIso4217Code(str2, string);
        }
        return currencyIso4217Code2;
    }

    public boolean areAllFieldsValid() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @Nullable
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean equals() {
        return true;
    }

    @Nullable
    public abstract AFe1rSDK<String> getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull String str, @Nullable String str2);

    @Nullable
    public String getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        map.getClass();
        return null;
    }

    @CallSuper
    public void getRevenue(@NotNull Map<String, Object> map, @Nullable String str) {
        map.getClass();
        map.put(Constants.JumpUrlConstants.URL_KEY_APPID, this.copydefault.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
        String mediationNetwork = AFd1pSDK.getMediationNetwork();
        if (mediationNetwork != null) {
            map.put("cuid", mediationNetwork);
        }
        Context context = this.copydefault.AFAdRevenueData.getCurrencyIso4217Code;
        map.put("app_version_name", AFb1vSDK.getMonetizationNetwork(context, context.getPackageName()));
        if (areAllFieldsValid()) {
            map.put("event_timestamp", Long.valueOf(this.copy.getRevenue()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    @Nullable
    public String getRevenue(@NotNull Map<String, Object> map) {
        map.getClass();
        return null;
    }
}
