package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0017\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0014\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0014\u0010\u0019J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0014\u0010\u001bJ\u000f\u0010\u0017\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0017\u0010\u001cR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, m87232d2 = {"Lcom/appsflyer/internal/AFf1lSDK;", "Lcom/appsflyer/internal/AFf1tSDK;", "Lcom/appsflyer/internal/AFd1fSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", "p2", "", "", "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "p4", "Lcom/appsflyer/internal/AFj1qSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1qSDK;)V", "", "", "", "getRevenue", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFe1rSDK;", "getCurrencyIso4217Code", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFe1rSDK;", "(Ljava/util/Map;)Ljava/lang/String;", "", "(Ljava/lang/String;I)V", "()V", "hashCode", "Ljava/util/Map;", "getMonetizationNetwork", "toString", "Lcom/appsflyer/internal/AFj1qSDK;", "getMediationNetwork", "equals", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "AFAdRevenueData", "component3", "Lcom/appsflyer/AppsFlyerProperties;", "copydefault", "Lcom/appsflyer/AFPurchaseDetails;", "AFa1ySDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final class AFf1lSDK extends AFf1tSDK {

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AppsFlyerProperties getRevenue;

    /* JADX INFO: renamed from: copydefault, reason: from kotlin metadata */
    @NotNull
    private final AFPurchaseDetails getCurrencyIso4217Code;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    @Nullable
    private final AppsFlyerInAppPurchaseValidationCallback AFAdRevenueData;

    /* JADX INFO: renamed from: hashCode, reason: from kotlin metadata */
    @Nullable
    private final Map<String, String> getMonetizationNetwork;

    /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
    @NotNull
    private final AFj1qSDK getMediationNetwork;

    public static final class AFa1ySDK extends RuntimeException {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private AFf1lSDK(@NotNull AFd1fSDK aFd1fSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1qSDK aFj1qSDK) {
        super(AFf1zSDK.MANUAL_PURCHASE_VALIDATION, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1fSDK, null, MapsKt.emptyMap());
        aFd1fSDK.getClass();
        appsFlyerProperties.getClass();
        aFPurchaseDetails.getClass();
        aFj1qSDK.getClass();
        this.getRevenue = appsFlyerProperties;
        this.getCurrencyIso4217Code = aFPurchaseDetails;
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = appsFlyerInAppPurchaseValidationCallback;
        this.getMediationNetwork = aFj1qSDK;
        this.getMonetizationNetwork.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final void getCurrencyIso4217Code() {
        Object objM223820constructorimpl;
        Unit unit;
        super.getCurrencyIso4217Code();
        Throwable thComponent2 = component2();
        if (thComponent2 != null && !(thComponent2 instanceof AFf1uSDK)) {
            if (thComponent2 instanceof AFf1ySDK) {
                getRevenue("No dev key", -1);
            } else if (thComponent2 instanceof AFa1ySDK) {
                getRevenue("One or more of provided arguments is empty", -1);
            } else {
                getRevenue("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component1;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFAdRevenueData;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(MapsKt.mapOf(TuplesKt.m87240a(StateEvent.Name.ERROR_CODE, Integer.valueOf(responseNetwork.getStatusCode())), TuplesKt.m87240a("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.AFAdRevenueData;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1pSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                objM223820constructorimpl = Result.m223820constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
            }
            if (Result.m223823exceptionOrNullimpl(objM223820constructorimpl) != null) {
                getRevenue("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
            Result.m223819boximpl(objM223820constructorimpl);
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void getRevenue(@NotNull Map<String, Object> p0, @Nullable String p1) {
        p0.getClass();
        super.getRevenue(p0, p1);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{this.getCurrencyIso4217Code.getPurchaseToken(), this.getCurrencyIso4217Code.getProductId(), this.getCurrencyIso4217Code.getPrice(), this.getCurrencyIso4217Code.getCurrency()});
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1ySDK();
                }
            }
        }
        p0.put("purchase_token", this.getCurrencyIso4217Code.getPurchaseToken());
        p0.put("product_id", this.getCurrencyIso4217Code.getProductId());
        p0.put("revenue", this.getCurrencyIso4217Code.getPrice());
        p0.put(FirebaseAnalytics.Param.CURRENCY, this.getCurrencyIso4217Code.getCurrency());
        p0.put("purchase_type", this.getCurrencyIso4217Code.getPurchaseType().getValue());
        Map<String, String> map = this.getMonetizationNetwork;
        if (map != null && !map.isEmpty()) {
            p0.put("extra_event_values", this.getMonetizationNetwork);
        }
        String string = this.getRevenue.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        p0.put("custom_data", (string == null || string.length() == 0) ? MapsKt.emptyMap() : AFj1pSDK.getMonetizationNetwork(new JSONObject(string)));
    }

    public /* synthetic */ AFf1lSDK(AFd1fSDK aFd1fSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1qSDK aFj1qSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1fSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 32) != 0 ? new AFj1rSDK() : aFj1qSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFf1lSDK(@NotNull AFd1fSDK aFd1fSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1fSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        aFd1fSDK.getClass();
        appsFlyerProperties.getClass();
        aFPurchaseDetails.getClass();
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @Nullable
    public final AFe1rSDK<String> getCurrencyIso4217Code(@NotNull Map<String, Object> p0, @NotNull String p1, @Nullable String p2) {
        p0.getClass();
        p1.getClass();
        return ((AFf1oSDK) this).component4.getMonetizationNetwork(p0, p1);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    @NotNull
    public final String getRevenue(@NotNull Map<String, Object> p0) {
        p0.getClass();
        return this.getMediationNetwork.getRevenue();
    }

    private final void getRevenue(String p0, int p1) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFAdRevenueData;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(MapsKt.mapOf(TuplesKt.m87240a(StateEvent.Name.ERROR_CODE, Integer.valueOf(p1)), TuplesKt.m87240a("error_message", p0)));
        }
    }
}
