package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AFf1gSDK extends AFf1oSDK<String> {
    private static final AFf1zSDK[] AFKeystoreWrapper = {AFf1zSDK.DLSDK, AFf1zSDK.ONELINK, AFf1zSDK.REGISTER};
    private final AFg1nSDK AFInAppEventType;
    public final AFa1mSDK component3;
    protected final AFg1fSDK copy;
    private final AFe1fSDK copydefault;

    @NonNull
    private final AFd1pSDK equals;
    private final AFg1wSDK hashCode;
    protected final AFd1rSDK toString;
    private final AFd1kSDK values;

    public AFf1gSDK(@NonNull AFa1mSDK aFa1mSDK, @NonNull AFd1fSDK aFd1fSDK, String str) {
        super(aFa1mSDK.getCurrencyIso4217Code(), new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1fSDK, str);
        this.component3 = aFa1mSDK;
        this.copydefault = aFd1fSDK.values();
        this.toString = aFd1fSDK.getRevenue();
        this.hashCode = aFd1fSDK.component2();
        this.values = aFd1fSDK.valueOf();
        this.equals = aFd1fSDK.getMediationNetwork();
        this.copy = aFd1fSDK.component3();
        this.AFInAppEventType = aFd1fSDK.force();
        for (AFf1zSDK aFf1zSDK : AFKeystoreWrapper) {
            if (this.AFAdRevenueData == aFf1zSDK) {
                return;
            }
        }
        int i = this.component3.areAllFieldsValid;
        AFf1zSDK aFf1zSDK2 = this.AFAdRevenueData;
        if (i > 0) {
            this.getMonetizationNetwork.add(AFf1zSDK.CONVERSION);
        } else {
            AFf1zSDK aFf1zSDK3 = AFf1zSDK.CONVERSION;
            if (aFf1zSDK2 != aFf1zSDK3) {
                this.getCurrencyIso4217Code.add(aFf1zSDK3);
            }
        }
    }

    @NonNull
    private static Map<String, Object> component2(AFa1mSDK aFa1mSDK) {
        Map<String, Object> map = (Map) aFa1mSDK.getRevenue().get("meta");
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        aFa1mSDK.getRevenue().put("meta", map2);
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1rSDK<String> AFAdRevenueData(@NonNull String str) {
        double d;
        String string;
        String strReplaceAll;
        String str2;
        getRevenue(this.component3);
        if (this.component3.getRevenue().containsKey("meta")) {
            try {
                d = this.hashCode.getRevenue.getCurrencyIso4217Code.getMonetizationNetwork.getMonetizationNetwork.getMonetizationNetwork;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFa1mSDK.getMonetizationNetwork(d)) {
                this.component3.getRevenue().remove("meta");
            }
        }
        AFa1mSDK aFa1mSDK = this.component3;
        String str3 = aFa1mSDK.component3;
        Map<String, Object> revenue = aFa1mSDK.getRevenue();
        String str4 = null;
        try {
            string = new JSONObject(revenue).toString();
            try {
                if (string == null) {
                    throw new NullPointerException("JSON toString of eventParams map returns null");
                }
                strReplaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
                str2 = string != null ? string : "";
                if (strReplaceAll.equals(str2)) {
                    strReplaceAll = str2;
                } else {
                    AFLogger.afWarnLog("Payload contains non-printing characters");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(": preparing data: ");
                sb.append(strReplaceAll);
                AFb1kSDK.getMediationNetwork(sb.toString());
                ((AFf1oSDK) this).component2.getCurrencyIso4217Code(str3, strReplaceAll);
                return ((AFf1oSDK) this).component4.getCurrencyIso4217Code(this.component3, str, this.values);
            } catch (NullPointerException e) {
                e = e;
                AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", e, true);
                try {
                    Object[] objArr = {revenue};
                    Map map = AFa1tSDK.AFLogger;
                    Object method = map.get(1056289450);
                    if (method == null) {
                        method = ((Class) AFa1tSDK.getCurrencyIso4217Code(73 - Color.argb(0, 0, 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32, (char) View.MeasureSpec.getMode(0))).getMethod("AFAdRevenueData", Map.class);
                        map.put(1056289450, method);
                    }
                    String str5 = (String) ((Method) method).invoke(null, objArr);
                    try {
                        if (str5 == null) {
                            throw new NullPointerException("JSON toString of eventParams map returns null");
                        }
                        strReplaceAll = str5.replaceAll("\\p{C}", "*Non-printing character*");
                        string = str5;
                    } catch (NullPointerException e2) {
                        e = e2;
                        string = str5;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        strReplaceAll = "";
                    } catch (Exception e3) {
                        e = e3;
                        string = str5;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        strReplaceAll = "";
                    } catch (Throwable th) {
                        th = th;
                        string = str5;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        strReplaceAll = "";
                    }
                } catch (Throwable th2) {
                    try {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    } catch (NullPointerException e4) {
                        e = e4;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        strReplaceAll = "";
                        if (string != null) {
                        }
                        if (strReplaceAll.equals(str2)) {
                            AFLogger.afWarnLog("Payload contains non-printing characters");
                        } else {
                            strReplaceAll = str2;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this);
                        sb2.append(": preparing data: ");
                        sb2.append(strReplaceAll);
                        AFb1kSDK.getMediationNetwork(sb2.toString());
                        ((AFf1oSDK) this).component2.getCurrencyIso4217Code(str3, strReplaceAll);
                        return ((AFf1oSDK) this).component4.getCurrencyIso4217Code(this.component3, str, this.values);
                    } catch (Exception e5) {
                        e = e5;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        strReplaceAll = "";
                        if (string != null) {
                        }
                        if (strReplaceAll.equals(str2)) {
                            AFLogger.afWarnLog("Payload contains non-printing characters");
                        } else {
                            strReplaceAll = str2;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this);
                        sb3.append(": preparing data: ");
                        sb3.append(strReplaceAll);
                        AFb1kSDK.getMediationNetwork(sb3.toString());
                        ((AFf1oSDK) this).component2.getCurrencyIso4217Code(str3, strReplaceAll);
                        return ((AFf1oSDK) this).component4.getCurrencyIso4217Code(this.component3, str, this.values);
                    } catch (Throwable th3) {
                        th = th3;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        strReplaceAll = "";
                        if (string != null) {
                        }
                        if (strReplaceAll.equals(str2)) {
                            AFLogger.afWarnLog("Payload contains non-printing characters");
                        } else {
                            strReplaceAll = str2;
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(this);
                        sb4.append(": preparing data: ");
                        sb4.append(strReplaceAll);
                        AFb1kSDK.getMediationNetwork(sb4.toString());
                        ((AFf1oSDK) this).component2.getCurrencyIso4217Code(str3, strReplaceAll);
                        return ((AFf1oSDK) this).component4.getCurrencyIso4217Code(this.component3, str, this.values);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                str4 = string;
                AFLogger.afErrorLog("Unexpected error", th, true);
                strReplaceAll = "";
                string = str4;
            }
        } catch (NullPointerException e6) {
            e = e6;
            string = null;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @Nullable
    public final AppsFlyerRequestListener component1() {
        return this.component3.getRevenue;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public boolean equals() {
        return true;
    }

    public void getCurrencyIso4217Code(AFa1mSDK aFa1mSDK) {
        this.copy.getRevenue(aFa1mSDK);
    }

    public void getMediationNetwork(AFa1mSDK aFa1mSDK) {
        this.copy.getCurrencyIso4217Code(aFa1mSDK.getRevenue());
    }

    public void getMonetizationNetwork(AFa1mSDK aFa1mSDK) {
        this.copy.AFAdRevenueData(aFa1mSDK);
    }

    @CallSuper
    public void getRevenue(AFa1mSDK aFa1mSDK) {
        try {
            try {
                getMediationNetwork(aFa1mSDK);
                AFAdRevenueData(aFa1mSDK);
                getMonetizationNetwork(aFa1mSDK);
                getCurrencyIso4217Code(aFa1mSDK);
            } catch (Throwable th) {
                AFLogger.afErrorLog("Error while collecting payload params", th, true, false);
            }
            if (aFa1mSDK.component2()) {
                aFa1mSDK.getMediationNetwork(new AFd1oSDK(aFa1mSDK.getRevenue(), ((AFf1oSDK) this).areAllFieldsValid.getRevenue.getCurrencyIso4217Code));
                aFa1mSDK.getMediationNetwork(((AFf1oSDK) this).areAllFieldsValid.getMonetizationNetwork(aFa1mSDK.getRevenue()));
                if (this.equals.getCurrencyIso4217Code("com.appsflyer.security.enable")) {
                    try {
                        new AFb1sSDK(aFa1mSDK).afInfoLog();
                    } catch (Exception e) {
                        AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
                    }
                }
            }
            if (aFa1mSDK.areAllFieldsValid()) {
                aFa1mSDK.getMediationNetwork(((AFf1oSDK) this).areAllFieldsValid.AFAdRevenueData());
            }
            Set<AFf1zSDK> set = this.getCurrencyIso4217Code;
            boolean z = set.contains(AFf1zSDK.LAUNCH) || set.contains(AFf1zSDK.CONVERSION);
            if (component3() && z) {
                aFa1mSDK.getMonetizationNetwork(this.toString.getMonetizationNetwork("appsFlyerCount", 0));
            }
            if (aFa1mSDK.component3()) {
                Map<String, Object> mapComponent2 = component2(aFa1mSDK);
                AFe1fSDK aFe1fSDK = this.copydefault;
                AFe1cSDK aFe1cSDK = new AFe1cSDK(aFe1fSDK.getMediationNetwork(), aFe1fSDK.getMonetizationNetwork(), AFe1fSDK.AFAdRevenueData() ? AFe1bSDK.DEFAULT : AFe1bSDK.API);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, aFe1cSDK.getCurrencyIso4217Code);
                AFe1bSDK aFe1bSDK = aFe1cSDK.getMediationNetwork;
                if (aFe1bSDK != AFe1bSDK.DEFAULT) {
                    jSONObject.put(FirebaseAnalytics.Param.METHOD, aFe1bSDK.getCurrencyIso4217Code);
                }
                String str = aFe1cSDK.AFAdRevenueData;
                if (str != null && !StringsKt.m93438e0(str)) {
                    jSONObject.put(RequestParameters.PREFIX, aFe1cSDK.AFAdRevenueData);
                }
                mapComponent2.put("host", jSONObject);
            }
            if (this.equals.getCurrencyIso4217Code("AF_PREINSTALL_DISABLED")) {
                component2(aFa1mSDK).put("preinstall_disabled", Boolean.TRUE);
            }
            this.AFInAppEventType.getMediationNetwork(aFa1mSDK.getRevenue(), aFa1mSDK.getCurrencyIso4217Code());
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Error while preparing to send event", th2, true, false);
        }
    }

    public AFf1gSDK(@NonNull AFa1mSDK aFa1mSDK, @NonNull AFd1fSDK aFd1fSDK) {
        this(aFa1mSDK, aFd1fSDK, null);
    }

    public void AFAdRevenueData(AFa1mSDK aFa1mSDK) {
        this.copy.getMediationNetwork(aFa1mSDK);
    }
}
