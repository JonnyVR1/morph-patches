package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1rSDK {
    Map<String, Object> AFAdRevenueData;

    @Nullable
    public volatile String areAllFieldsValid;
    public volatile String component1;
    public long getCurrencyIso4217Code;

    @NonNull
    public final AFg1sSDK getMediationNetwork;

    @NonNull
    public final AFd1kSDK getRevenue;
    public boolean getMonetizationNetwork = false;
    public volatile boolean component4 = false;

    public AFg1rSDK(@NonNull AFd1kSDK aFd1kSDK, @NonNull AFg1sSDK aFg1sSDK) {
        this.getRevenue = aFd1kSDK;
        this.getMediationNetwork = aFg1sSDK;
    }

    private static boolean getMediationNetwork(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1tSDK.getMonetizationNetwork();
        return !AFb1tSDK.getMediationNetwork(context);
    }

    private boolean getRevenue() {
        Map<String, Object> map = this.AFAdRevenueData;
        return (map == null || map.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    @Nullable
    public final String AFAdRevenueData(AFd1rSDK aFd1rSDK) {
        String str;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String currencyIso4217Code = aFd1rSDK.getCurrencyIso4217Code("imeiCached", null);
        if (z && AFc1tSDK.getCurrencyIso4217Code(this.areAllFieldsValid)) {
            Context context = this.getRevenue.getCurrencyIso4217Code;
            if (context == null || !getMediationNetwork(context)) {
                str = null;
            } else {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", null).invoke(telephonyManager, null);
                    if (str == null) {
                        if (currencyIso4217Code != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(currencyIso4217Code));
                        } else {
                            currencyIso4217Code = null;
                        }
                        str = currencyIso4217Code;
                    }
                } catch (InvocationTargetException e) {
                    if (currencyIso4217Code != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(currencyIso4217Code));
                    } else {
                        currencyIso4217Code = null;
                    }
                    StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb.append(e.getMessage());
                    AFLogger.afErrorLog(sb.toString(), e);
                } catch (Exception e2) {
                    if (currencyIso4217Code != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(currencyIso4217Code));
                    } else {
                        currencyIso4217Code = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2);
                }
            }
        } else if (this.areAllFieldsValid != null) {
            str = this.areAllFieldsValid;
        } else {
            str = null;
        }
        if (AFc1tSDK.getCurrencyIso4217Code(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        aFd1rSDK.getRevenue("imeiCached", str);
        return str;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getMonetizationNetwork && !getRevenue();
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getRevenue.getCurrencyIso4217Code};
                Map map2 = AFc1gSDK.registerClient;
                Object declaredConstructor = map2.get(1868116792);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFc1gSDK.getCurrencyIso4217Code((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 122, 36 - Color.red(0), (char) ((-1) - TextUtils.lastIndexOf("", '0')))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(1868116792, declaredConstructor);
                }
                return (Map) ((Constructor) declaredConstructor).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    public final void getMediationNetwork() {
        this.AFAdRevenueData.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getCurrencyIso4217Code));
        this.AFAdRevenueData.put("lvl_timestamp", Long.valueOf(this.getCurrencyIso4217Code));
    }

    public final boolean getMonetizationNetwork() {
        return this.component4;
    }

    @NonNull
    public final Map<String, Object> AFAdRevenueData() {
        HashMap map = new HashMap();
        if (getRevenue()) {
            map.put("lvl", this.AFAdRevenueData);
            return map;
        }
        if (this.getMonetizationNetwork) {
            this.AFAdRevenueData = new HashMap();
            getMediationNetwork();
            this.AFAdRevenueData.put("error", "pending LVL response");
            map.put("lvl", this.AFAdRevenueData);
        }
        return map;
    }
}
