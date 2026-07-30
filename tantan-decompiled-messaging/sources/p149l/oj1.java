package p149l;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C1554f;
import com.facebook.appevents.C1555g;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.C1564g;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.C1655c;
import com.facebook.internal.C1656d;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u0004\u0018\u00010\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b \u0010!J7\u0010)\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J7\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010,JE\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060-2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b/\u00100R\u001c\u00103\u001a\n 1*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00105¨\u00067"}, m87232d2 = {"Ll/oj1;", "", "<init>", "()V", "", "h", "", "activityName", "", "timeSpentInSeconds", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;J)V", FirebaseAnalytics.Event.PURCHASE, "skuDetails", "", "isSubscription", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "isFirstAppLaunch", "j", "(Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Z)V", "", "Ll/oj1$a;", "purchaseLoggingParametersList", "Landroid/os/Bundle;", "a", "(Ljava/util/List;)Landroid/os/Bundle;", "eventName", "f", "(Ljava/util/List;Ljava/lang/String;)Landroid/os/Bundle;", "g", "()Z", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)Ljava/util/List;", "type", CommandMessage.PARAMS, "Lcom/facebook/appevents/g;", "operationalData", "Lorg/json/JSONObject;", "purchaseJSON", "skuDetailsJSON", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/g;Lorg/json/JSONObject;Lorg/json/JSONObject;)Ll/oj1$a;", "e", "(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/g;Lorg/json/JSONObject;)Ljava/util/List;", "", "extraParameter", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)Ljava/util/List;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Lcom/facebook/appevents/f;", "Lcom/facebook/appevents/f;", "internalAppEventsLogger", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class oj1 {

    @NotNull
    public static final oj1 INSTANCE = new oj1();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = oj1.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C1554f internalAppEventsLogger = new C1554f(C1577c.m8047l());

    /* JADX INFO: renamed from: l.oj1$a */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u0012\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/oj1$a;", "", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "Landroid/os/Bundle;", "param", "Lcom/facebook/appevents/g;", "operationalData", "<init>", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/g;)V", "a", "Ljava/math/BigDecimal;", Constants.INAPP_DATA_TAG, "()Ljava/math/BigDecimal;", "setPurchaseAmount", "(Ljava/math/BigDecimal;)V", "b", "Ljava/util/Currency;", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "c", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "setParam", "(Landroid/os/Bundle;)V", "Lcom/facebook/appevents/g;", "()Lcom/facebook/appevents/g;", "setOperationalData", "(Lcom/facebook/appevents/g;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C18956a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public BigDecimal purchaseAmount;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Currency currency;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public Bundle param;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public C1555g operationalData;

        public C18956a(@NotNull BigDecimal bigDecimal, @NotNull Currency currency, @NotNull Bundle bundle, @NotNull C1555g c1555g) {
            bigDecimal.getClass();
            currency.getClass();
            bundle.getClass();
            c1555g.getClass();
            this.purchaseAmount = bigDecimal;
            this.currency = currency;
            this.param = bundle;
            this.operationalData = c1555g;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final C1555g getOperationalData() {
            return this.operationalData;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Bundle getParam() {
            return this.param;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final synchronized Bundle m164589a(@NotNull List<C18956a> purchaseLoggingParametersList) {
        C18956a c18956a;
        purchaseLoggingParametersList.getClass();
        c18956a = purchaseLoggingParametersList.get(0);
        return C1564g.m7906f(CollectionsKt.listOf(new opm("fb_mobile_purchase", c18956a.getPurchaseAmount().doubleValue(), c18956a.getCurrency())), System.currentTimeMillis(), true, CollectionsKt.listOf(new Pair(c18956a.getParam(), c18956a.getOperationalData())));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final synchronized Bundle m164590f(@NotNull List<C18956a> purchaseLoggingParametersList, @NotNull String eventName) {
        ArrayList arrayList;
        long jCurrentTimeMillis;
        ArrayList arrayList2;
        try {
            purchaseLoggingParametersList.getClass();
            eventName.getClass();
            arrayList = new ArrayList();
            for (C18956a c18956a : purchaseLoggingParametersList) {
                arrayList.add(new opm(eventName, c18956a.getPurchaseAmount().doubleValue(), c18956a.getCurrency()));
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            List<C18956a> list = purchaseLoggingParametersList;
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (C18956a c18956a2 : list) {
                arrayList2.add(new Pair(c18956a2.getParam(), c18956a2.getOperationalData()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return C1564g.m7906f(arrayList, jCurrentTimeMillis, true, arrayList2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m164591g() {
        C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
        return c1656dM8689f != null && C1577c.m8051p() && c1656dM8689f.getIAPAutomaticLoggingEnabled();
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m164592h() {
        Context contextM8047l = C1577c.m8047l();
        String strM8048m = C1577c.m8048m();
        if (C1577c.m8051p() && (contextM8047l instanceof Application)) {
            AppEventsLogger.INSTANCE.m7647b((Application) contextM8047l, strM8048m);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m164593i(@Nullable String activityName, long timeSpentInSeconds) {
        Context contextM8047l = C1577c.m8047l();
        C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
        if (c1656dM8693r == null || !c1656dM8693r.getAutomaticLoggingEnabled() || timeSpentInSeconds <= 0) {
            return;
        }
        C1554f c1554f = new C1554f(contextM8047l);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", activityName);
        c1554f.m7773c("fb_aa_time_spent_on_view", timeSpentInSeconds, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m164594j(@NotNull String purchase, @NotNull String skuDetails, boolean isSubscription, @Nullable InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean isFirstAppLaunch) {
        List<C18956a> listM164596b;
        String str;
        String str2;
        Bundle bundleM164589a;
        purchase.getClass();
        skuDetails.getClass();
        if (!m164591g() || (listM164596b = INSTANCE.m164596b(purchase, skuDetails, billingClientVersion)) == null || listM164596b.isEmpty()) {
            return;
        }
        if (!isSubscription || !C1655c.m8766d("app_events_if_auto_log_subs", C1577c.m8048m(), false)) {
            if (isFirstAppLaunch) {
                str2 = "fb_mobile_purchase_restored";
            } else {
                str = "fb_mobile_purchase";
            }
            if (!isSubscription && FeatureManager.m8679g(FeatureManager.Feature.AndroidManualImplicitSubsDedupe)) {
                bundleM164589a = m164590f(listM164596b, str);
            } else if (isSubscription && FeatureManager.m8679g(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe)) {
                bundleM164589a = m164589a(listM164596b);
            } else {
                bundleM164589a = null;
            }
            ypm.INSTANCE.m215641a(bundleM164589a, listM164596b.get(0).getParam(), listM164596b.get(0).getOperationalData());
            if (Intrinsics.m87488d(str, "fb_mobile_purchase")) {
                internalAppEventsLogger.m7780j(listM164596b.get(0).getPurchaseAmount(), listM164596b.get(0).getCurrency(), listM164596b.get(0).getParam(), listM164596b.get(0).getOperationalData());
            } else {
                internalAppEventsLogger.m7779i(str, listM164596b.get(0).getPurchaseAmount(), listM164596b.get(0).getCurrency(), listM164596b.get(0).getParam(), listM164596b.get(0).getOperationalData());
            }
        }
        if (isFirstAppLaunch) {
            str2 = "SubscriptionRestore";
        } else {
            str2 = zpm.INSTANCE.m219690m(skuDetails) ? "StartTrial" : "Subscribe";
        }
        str = str2;
        if (!isSubscription) {
            if (isSubscription) {
                bundleM164589a = null;
            } else {
                bundleM164589a = null;
            }
        } else if (isSubscription) {
            bundleM164589a = null;
        } else {
            bundleM164589a = null;
        }
        ypm.INSTANCE.m215641a(bundleM164589a, listM164596b.get(0).getParam(), listM164596b.get(0).getOperationalData());
        if (Intrinsics.m87488d(str, "fb_mobile_purchase")) {
            internalAppEventsLogger.m7779i(str, listM164596b.get(0).getPurchaseAmount(), listM164596b.get(0).getCurrency(), listM164596b.get(0).getParam(), listM164596b.get(0).getOperationalData());
        } else {
            internalAppEventsLogger.m7780j(listM164596b.get(0).getPurchaseAmount(), listM164596b.get(0).getCurrency(), listM164596b.get(0).getParam(), listM164596b.get(0).getOperationalData());
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m164595k(String str, String str2, boolean z, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z2, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        m164594j(str, str2, z, billingClientVersion, z2);
    }

    /* JADX INFO: renamed from: b */
    public final List<C18956a> m164596b(String purchase, String skuDetails, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        return m164597c(purchase, skuDetails, new HashMap(), billingClientVersion);
    }

    /* JADX INFO: renamed from: c */
    public final List<C18956a> m164597c(String purchase, String skuDetails, Map<String, String> extraParameter, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        try {
            JSONObject jSONObject = new JSONObject(purchase);
            JSONObject jSONObject2 = new JSONObject(skuDetails);
            Bundle bundle = new Bundle(1);
            C1555g c1555g = new C1555g();
            if (billingClientVersion != null) {
                C1555g.INSTANCE.m7792a(OperationalDataEnum.IAPParameters, "fb_iap_sdk_supported_library_versions", billingClientVersion.getType(), bundle, c1555g);
            }
            C1555g.Companion companion = C1555g.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = jSONObject.getString("productId");
            string.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_product_id", string, bundle, c1555g);
            String string2 = jSONObject.getString("productId");
            string2.getClass();
            companion.m7792a(operationalDataEnum, "fb_content_id", string2, bundle, c1555g);
            companion.m7792a(operationalDataEnum, "android_dynamic_ads_content_id", "client_implicit", bundle, c1555g);
            String string3 = jSONObject.getString("purchaseTime");
            string3.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_purchase_time", string3, bundle, c1555g);
            String string4 = jSONObject.getString("purchaseToken");
            string4.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_purchase_token", string4, bundle, c1555g);
            String strOptString = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            strOptString.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_package_name", strOptString, bundle, c1555g);
            String strOptString2 = jSONObject2.optString("title");
            strOptString2.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_product_title", strOptString2, bundle, c1555g);
            String strOptString3 = jSONObject2.optString("description");
            strOptString3.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_product_description", strOptString3, bundle, c1555g);
            String strOptString4 = jSONObject2.optString("type");
            strOptString4.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_product_type", strOptString4, bundle, c1555g);
            String strM7905e = C1564g.m7905e();
            if (strM7905e != null) {
                companion.m7792a(operationalDataEnum, "fb_iap_client_library_version", strM7905e, bundle, c1555g);
            }
            for (Map.Entry<String, String> entry : extraParameter.entrySet()) {
                C1555g.INSTANCE.m7792a(OperationalDataEnum.IAPParameters, entry.getKey(), entry.getValue(), bundle, c1555g);
            }
            if (jSONObject2.has("price_amount_micros")) {
                return CollectionsKt.mutableListOf(m164598d(strOptString4, bundle, c1555g, jSONObject, jSONObject2));
            }
            if (!jSONObject2.has("subscriptionOfferDetails") && !jSONObject2.has("oneTimePurchaseOfferDetails")) {
                return null;
            }
            return m164599e(strOptString4, bundle, c1555g, jSONObject2);
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing in-app purchase/subscription data.", e);
            return null;
        } catch (Exception e2) {
            Log.e(TAG, "Failed to get purchase logging parameters,", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C18956a m164598d(String type, Bundle params, C1555g operationalData, JSONObject purchaseJSON, JSONObject skuDetailsJSON) {
        Bundle bundle;
        C1555g c1555g;
        if (Intrinsics.m87488d(type, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            C1555g.Companion companion = C1555g.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = Boolean.toString(purchaseJSON.optBoolean("autoRenewing", false));
            string.getClass();
            bundle = params;
            c1555g = operationalData;
            companion.m7792a(operationalDataEnum, "fb_iap_subs_auto_renewing", string, bundle, c1555g);
            String strOptString = skuDetailsJSON.optString("subscriptionPeriod");
            strOptString.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_subs_period", strOptString, bundle, c1555g);
            String strOptString2 = skuDetailsJSON.optString("freeTrialPeriod");
            strOptString2.getClass();
            companion.m7792a(operationalDataEnum, "fb_free_trial_period", strOptString2, bundle, c1555g);
            String strOptString3 = skuDetailsJSON.optString("introductoryPriceCycles");
            strOptString3.getClass();
            if (strOptString3.length() > 0) {
                companion.m7792a(operationalDataEnum, "fb_intro_price_cycles", strOptString3, bundle, c1555g);
            }
            String strOptString4 = skuDetailsJSON.optString("introductoryPricePeriod");
            strOptString4.getClass();
            if (strOptString4.length() > 0) {
                companion.m7792a(operationalDataEnum, "fb_intro_period", strOptString4, bundle, c1555g);
            }
            String strOptString5 = skuDetailsJSON.optString("introductoryPriceAmountMicros");
            strOptString5.getClass();
            if (strOptString5.length() > 0) {
                companion.m7792a(operationalDataEnum, "fb_intro_price_amount_micros", strOptString5, bundle, c1555g);
            }
        } else {
            bundle = params;
            c1555g = operationalData;
        }
        BigDecimal bigDecimal = new BigDecimal(skuDetailsJSON.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(skuDetailsJSON.getString("price_currency_code"));
        currency.getClass();
        return new C18956a(bigDecimal, currency, bundle, c1555g);
    }

    /* JADX INFO: renamed from: e */
    public final List<C18956a> m164599e(String type, Bundle params, C1555g operationalData, JSONObject skuDetailsJSON) throws JSONException {
        if (!Intrinsics.m87488d(type, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            JSONObject jSONObject = skuDetailsJSON.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject.getString("priceCurrencyCode"));
            currency.getClass();
            return CollectionsKt.mutableListOf(new C18956a(bigDecimal, currency, params, operationalData));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = skuDetailsJSON.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = skuDetailsJSON.getJSONArray("subscriptionOfferDetails").getJSONObject(i);
            if (jSONObject2 == null) {
                return null;
            }
            Bundle bundle = new Bundle(params);
            C1555g c1555gM7789c = operationalData.m7789c();
            String string = jSONObject2.getString("basePlanId");
            C1555g.Companion companion = C1555g.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            string.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_base_plan", string, bundle, c1555gM7789c);
            JSONArray jSONArray2 = jSONObject2.getJSONArray("pricingPhases");
            JSONObject jSONObject3 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject3 == null) {
                return null;
            }
            String strOptString = jSONObject3.optString("billingPeriod");
            strOptString.getClass();
            companion.m7792a(operationalDataEnum, "fb_iap_subs_period", strOptString, bundle, c1555gM7789c);
            if (!jSONObject3.has("recurrenceMode") || jSONObject3.getInt("recurrenceMode") == 3) {
                companion.m7792a(operationalDataEnum, "fb_iap_subs_auto_renewing", "false", bundle, c1555gM7789c);
            } else {
                companion.m7792a(operationalDataEnum, "fb_iap_subs_auto_renewing", "true", bundle, c1555gM7789c);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject3.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject3.getString("priceCurrencyCode"));
            currency2.getClass();
            arrayList.add(new C18956a(bigDecimal2, currency2, bundle, c1555gM7789c));
        }
        return arrayList;
    }
}
