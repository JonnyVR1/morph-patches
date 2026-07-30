package com.appsflyer.internal;

import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.p051p1.mobile.putong.data.Device;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p153l.mnd0;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1hSDK extends AFf1oSDK<AFc1jSDK> {

    @NotNull
    private final CountDownLatch AFInAppEventParameterName;
    private int AFInAppEventType;
    private int AFKeystoreWrapper;

    @NotNull
    private final AFc1qSDK component3;

    @NotNull
    private final AFc1sSDK copy;

    @NotNull
    private final AFd1mSDK copydefault;

    @NotNull
    private final AFj1vSDK equals;

    @NotNull
    private final AFh1qSDK hashCode;

    @NotNull
    private final AFd1pSDK toString;
    private int valueOf;

    @NotNull
    private final List<AFj1zSDK> values;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFe1dSDK.values().length];
            iArr[AFe1dSDK.SUCCESS.ordinal()] = 1;
            iArr[AFe1dSDK.FAILURE.ordinal()] = 2;
            getMonetizationNetwork = iArr;
            int[] iArr2 = new int[AFj1zSDK.AFa1zSDK.values().length];
            iArr2[AFj1zSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            iArr2[AFj1zSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            getCurrencyIso4217Code = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1hSDK(@NotNull AFc1qSDK aFc1qSDK, @NotNull AFd1fSDK aFd1fSDK) {
        super(AFf1zSDK.DLSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1fSDK, "DdlSdk");
        aFc1qSDK.getClass();
        aFd1fSDK.getClass();
        this.component3 = aFc1qSDK;
        this.AFInAppEventParameterName = new CountDownLatch(1);
        this.values = new ArrayList();
        AFd1pSDK mediationNetwork = aFd1fSDK.getMediationNetwork();
        mediationNetwork.getClass();
        this.toString = mediationNetwork;
        AFd1mSDK aFd1mSDKMo5229e = aFd1fSDK.mo5229e();
        aFd1mSDKMo5229e.getClass();
        this.copydefault = aFd1mSDKMo5229e;
        AFc1sSDK aFc1sSDKUnregisterClient = aFd1fSDK.unregisterClient();
        aFc1sSDKUnregisterClient.getClass();
        this.copy = aFc1sSDKUnregisterClient;
        AFh1qSDK aFh1qSDKComponent4 = aFd1fSDK.component4();
        aFh1qSDKComponent4.getClass();
        this.hashCode = aFh1qSDKComponent4;
        AFj1vSDK aFj1vSDKEquals = aFd1fSDK.equals();
        aFj1vSDKEquals.getClass();
        this.equals = aFj1vSDKEquals;
        AFj1zSDK[] aFj1zSDKArrAFAdRevenueData = aFj1vSDKEquals.AFAdRevenueData();
        aFj1zSDKArrAFAdRevenueData.getClass();
        ArrayList<AFj1zSDK> arrayList = new ArrayList();
        for (AFj1zSDK aFj1zSDK : aFj1zSDKArrAFAdRevenueData) {
            if (aFj1zSDK != null && aFj1zSDK.component3 != AFj1zSDK.AFa1zSDK.NOT_STARTED) {
                arrayList.add(aFj1zSDK);
            }
        }
        this.AFInAppEventType = arrayList.size();
        for (final AFj1zSDK aFj1zSDK2 : arrayList) {
            AFj1zSDK.AFa1zSDK aFa1zSDK = aFj1zSDK2.component3;
            int i = aFa1zSDK == null ? -1 : AFa1ySDK.getCurrencyIso4217Code[aFa1zSDK.ordinal()];
            if (i == 1) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                StringBuilder sb = new StringBuilder();
                sb.append(aFj1zSDK2.getMediationNetwork.get("source"));
                sb.append(" referrer collected earlier");
                AFh1ySDK.d$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                getMediationNetwork(aFj1zSDK2);
            } else if (i == 2) {
                aFj1zSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.r
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1hSDK.AFAdRevenueData(aFj1zSDK2, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean copy() {
        Object obj = this.component3.getRevenue().get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.AFInAppEventType && !this.component3.getRevenue().containsKey("referrers");
    }

    private static boolean getCurrencyIso4217Code(AFj1zSDK aFj1zSDK) {
        Object obj = aFj1zSDK.getMediationNetwork.get("click_ts");
        Long l2 = obj instanceof Long ? (Long) obj : null;
        if (l2 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l2.longValue()) < 86400000) {
                return true;
            }
        }
        return false;
    }

    private final void getMediationNetwork(AFj1zSDK aFj1zSDK) {
        if (getCurrencyIso4217Code(aFj1zSDK)) {
            this.values.add(aFj1zSDK);
            this.AFInAppEventParameterName.countDown();
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Added non-organic ".concat(aFj1zSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i = this.AFKeystoreWrapper + 1;
            this.AFKeystoreWrapper = i;
            if (i == this.AFInAppEventType) {
                this.AFInAppEventParameterName.countDown();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsflyer.internal.AFf1oSDK
    @NotNull
    public final AFe1rSDK<AFc1jSDK> AFAdRevenueData(@NotNull String str) {
        Map mapMapOf;
        Object obj;
        str.getClass();
        this.valueOf++;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
        StringBuilder sb = new StringBuilder("Preparing request ");
        sb.append(this.valueOf);
        AFh1ySDK.d$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
        Map<String, Object> revenue = this.component3.getRevenue();
        AFj1lSDK aFj1lSDK = null;
        Object[] objArr = 0;
        if (this.valueOf == 1) {
            revenue.put("is_first", Boolean.valueOf(this.toString.getRevenue.getMonetizationNetwork("appsFlyerCount", 0) == 0));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append('-');
            sb2.append(Locale.getDefault().getCountry());
            revenue.put("lang", sb2.toString());
            revenue.put("os", Build.VERSION.RELEASE);
            revenue.put("type", Build.MODEL);
            AFd1pSDK aFd1pSDK = this.toString;
            revenue.put("request_id", AFb1lSDK.AFAdRevenueData(aFd1pSDK.AFAdRevenueData, aFd1pSDK.getRevenue));
            AFd1uSDK aFd1uSDK = this.copydefault.getMonetizationNetwork;
            if (aFd1uSDK != null && (obj = aFd1uSDK.getCurrencyIso4217Code) != null) {
                revenue.put("sharing_filter", obj);
            }
            AFh1pSDK aFh1pSDK = this.toString.getMonetizationNetwork.component4;
            Object mediationNetwork = getMediationNetwork(aFh1pSDK != null ? new AFb1ySDK(aFh1pSDK.AFAdRevenueData, aFh1pSDK.component2) : null);
            if (mediationNetwork != null) {
                revenue.put("gaid", mediationNetwork);
            }
            Object mediationNetwork2 = getMediationNetwork(AFb1rSDK.getRevenue(this.toString.AFAdRevenueData.getCurrencyIso4217Code));
            if (mediationNetwork2 != null) {
                revenue.put(Device.OAID, mediationNetwork2);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        revenue.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        revenue.put("request_count", Integer.valueOf(this.valueOf));
        List<AFj1zSDK> list = this.values;
        ArrayList arrayList = new ArrayList();
        for (AFj1zSDK aFj1zSDK : list) {
            if (aFj1zSDK.component3 == AFj1zSDK.AFa1zSDK.FINISHED) {
                Object obj2 = aFj1zSDK.getMediationNetwork.get("referrer");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 != null) {
                    Object obj3 = aFj1zSDK.getMediationNetwork.get("source");
                    if (obj3 == null) {
                        mnd0.m159157a("null cannot be cast to non-null type kotlin.String");
                        return null;
                    }
                    mapMapOf = MapsKt.mapOf(TuplesKt.m88129a("source", (String) obj3), TuplesKt.m88129a("value", str2));
                } else {
                    mapMapOf = null;
                }
            } else {
                mapMapOf = null;
            }
            if (mapMapOf != null) {
                arrayList.add(mapMapOf);
            }
        }
        if (!arrayList.isEmpty()) {
            revenue.put("referrers", arrayList);
        }
        AFc1qSDK aFc1qSDK = this.component3;
        AFj1mSDK aFj1mSDK = new AFj1mSDK(this.toString, aFj1lSDK, 2, objArr == true ? 1 : 0);
        String str3 = ((AFf1oSDK) this).areAllFieldsValid.component1;
        Object obj4 = this.component3.getRevenue().get("timestamp");
        if (obj4 == null) {
            mnd0.m159157a("null cannot be cast to non-null type kotlin.String");
            return null;
        }
        String str4 = (String) obj4;
        String packageName = aFj1mSDK.getRevenue.AFAdRevenueData.getCurrencyIso4217Code.getPackageName();
        packageName.getClass();
        String strComponent4 = aFj1mSDK.getRevenue.component4();
        if (strComponent4 != null && !StringsKt.m94329e0(strComponent4)) {
            strComponent4 = "-".concat(String.valueOf(StringsKt.m94324Z0(strComponent4).toString()));
        }
        if (strComponent4 == null) {
            strComponent4 = "";
        }
        String string = StringsKt.m94324Z0(strComponent4).toString();
        Uri.Builder builderBuildUpon = Uri.parse(aFj1mSDK.getMonetizationNetwork.AFAdRevenueData("https://%sdlsdk.%s/v1.0/android/")).buildUpon();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(packageName);
        sb3.append(string);
        Uri.Builder builderAppendPath = builderBuildUpon.appendPath(sb3.toString());
        builderAppendPath.getClass();
        String string2 = AFj1mSDK.m5268L_(builderAppendPath, str3, str4).appendQueryParameter(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, AFb1tSDK.getRevenue).build().toString();
        string2.getClass();
        aFc1qSDK.getMonetizationNetwork(string2);
        AFh1qSDK aFh1qSDK = this.hashCode;
        int i = this.valueOf;
        if (i <= 0 || i > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
        } else {
            int i2 = i - 1;
            aFh1qSDK.component4[i2] = System.currentTimeMillis();
            if (i2 == 0) {
                long j = aFh1qSDK.component1;
                if (j != 0) {
                    aFh1qSDK.getMonetizationNetwork.put("from_fg", Long.valueOf(aFh1qSDK.component4[i2] - j));
                    aFh1qSDK.getMediationNetwork.getRevenue("ddl", new JSONObject(aFh1qSDK.getMonetizationNetwork).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFe1rSDK<AFc1jSDK> monetizationNetwork = ((AFf1oSDK) this).component4.getMonetizationNetwork(this.component3);
        monetizationNetwork.getClass();
        return monetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    /* JADX INFO: renamed from: a_ */
    public final boolean mo5242a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean equals() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    @NotNull
    public final AFe1dSDK getMonetizationNetwork() {
        AFe1dSDK aFe1dSDK = AFe1dSDK.FAILURE;
        try {
            AFe1dSDK monetizationNetwork = super.getMonetizationNetwork();
            monetizationNetwork.getClass();
            try {
                AFh1qSDK aFh1qSDK = this.hashCode;
                int i = this.valueOf;
                if (i <= 0 || i > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
                } else {
                    int i2 = i - 1;
                    aFh1qSDK.areAllFieldsValid[i2] = System.currentTimeMillis();
                    long j = aFh1qSDK.component4[i2];
                    if (j != 0) {
                        long[] jArr = aFh1qSDK.component3;
                        jArr[i2] = aFh1qSDK.areAllFieldsValid[i2] - j;
                        aFh1qSDK.getMonetizationNetwork.put("net", jArr);
                        aFh1qSDK.getMediationNetwork.getRevenue("ddl", new JSONObject(aFh1qSDK.getMonetizationNetwork).toString());
                    } else {
                        StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                        sb.append(i2);
                        sb.append("] ts is missing");
                        AFLogger.afInfoLog(sb.toString());
                    }
                }
                int i3 = AFa1ySDK.getMonetizationNetwork[monetizationNetwork.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        return monetizationNetwork;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
                    StringBuilder sb2 = new StringBuilder("Error occurred. Server response code = ");
                    ResponseNetwork responseNetwork = ((AFf1oSDK) this).component1;
                    sb2.append(responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null);
                    AFh1ySDK.d$default(aFLogger, aFg1cSDK, sb2.toString(), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.hashCode.getMediationNetwork(deepLinkResult, this.copy.component3);
                    this.copy.getRevenue(deepLinkResult);
                    return monetizationNetwork;
                }
                ResponseNetwork responseNetwork2 = ((AFf1oSDK) this).component1;
                responseNetwork2.getClass();
                Object body = responseNetwork2.getBody();
                body.getClass();
                AFc1jSDK aFc1jSDK = (AFc1jSDK) body;
                DeepLink deepLink = aFc1jSDK.getRevenue;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.hashCode.getMediationNetwork(deepLinkResult2, this.copy.component3);
                    this.copy.getRevenue(deepLinkResult2);
                    return monetizationNetwork;
                }
                if (this.valueOf > 1 || !aFc1jSDK.getGetMediationNetwork() || !copy()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.hashCode.getMediationNetwork(deepLinkResult3, this.copy.component3);
                    this.copy.getRevenue(deepLinkResult3);
                    return monetizationNetwork;
                }
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.AFInAppEventParameterName.await();
                AFh1qSDK aFh1qSDK2 = this.hashCode;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = aFh1qSDK2.areAllFieldsValid[0];
                if (j2 != 0) {
                    aFh1qSDK2.getMonetizationNetwork.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j2));
                    aFh1qSDK2.getMediationNetwork.getRevenue("ddl", new JSONObject(aFh1qSDK2.getMonetizationNetwork).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.AFKeystoreWrapper != this.AFInAppEventType) {
                    return getMonetizationNetwork();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.hashCode.getMediationNetwork(deepLinkResult4, this.copy.component3);
                this.copy.getRevenue(deepLinkResult4);
                return AFe1dSDK.SUCCESS;
            } catch (Exception e) {
                e = e;
                aFe1dSDK = monetizationNetwork;
                Throwable cause = e.getCause();
                if (!(cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException)) {
                    if (cause instanceof IOException) {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                        DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                        this.hashCode.getMediationNetwork(deepLinkResult5, this.copy.component3);
                        this.copy.getRevenue(deepLinkResult5);
                        return aFe1dSDK;
                    }
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.DDL, "Unexpected Exception: ".concat(String.valueOf(e)), false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                    this.hashCode.getMediationNetwork(deepLinkResult6, this.copy.component3);
                    this.copy.getRevenue(deepLinkResult6);
                    return aFe1dSDK;
                }
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK2 = AFg1cSDK.DDL;
                StringBuilder sb3 = new StringBuilder("Timeout, didn't manage to find deferred deeplink after ");
                sb3.append(this.valueOf);
                sb3.append(" attempt(s) within ");
                sb3.append(this.copy.component3);
                sb3.append(" milliseconds");
                AFh1ySDK.d$default(aFLogger2, aFg1cSDK2, sb3.toString(), false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.hashCode.getMediationNetwork(deepLinkResult7, this.copy.component3);
                this.copy.getRevenue(deepLinkResult7);
                return AFe1dSDK.TIMEOUT;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final long getRevenue() {
        return this.copy.component3;
    }

    private static Map<String, String> getMediationNetwork(AFb1ySDK aFb1ySDK) {
        String str;
        if (aFb1ySDK == null || (str = aFb1ySDK.AFAdRevenueData) == null) {
            return null;
        }
        Boolean bool = aFb1ySDK.getMediationNetwork;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(TuplesKt.m88129a("type", "unhashed"), TuplesKt.m88129a("value", str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFj1zSDK aFj1zSDK, AFf1hSDK aFf1hSDK, Observable observable, Object obj) {
        aFf1hSDK.getClass();
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
        StringBuilder sb = new StringBuilder();
        sb.append(aFj1zSDK.getMediationNetwork.get("source"));
        sb.append(" referrer collected via observer");
        AFh1ySDK.d$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
        if (observable != null) {
            aFf1hSDK.getMediationNetwork((AFj1zSDK) observable);
        } else {
            mnd0.m159157a("null cannot be cast to non-null type com.appsflyer.internal.referrer.Referrer");
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }
}
