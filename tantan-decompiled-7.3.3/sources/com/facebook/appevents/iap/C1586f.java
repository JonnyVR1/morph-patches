package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p153l.vj1;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.appevents.iap.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0003JY\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Lcom/facebook/appevents/iap/f;", "", "<init>", "()V", "", "g", "c", "", "e", "()Z", "h", RXScreenCaptureService.KEY_INDEX, "", "", "Lorg/json/JSONObject;", "purchaseDetailsMap", "", "skuDetailsMap", "isSubscription", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "isFirstAppLaunch", Constants.INAPP_DATA_TAG, "(Ljava/util/Map;Ljava/util/Map;ZLjava/lang/String;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Z)V", "a", "(Ljava/util/Map;Z)Ljava/util/Map;", "b", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "f", "(Ljava/util/Map;ZLcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Z)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1586f {

    @NotNull
    public static final C1586f INSTANCE = new C1586f();

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m7948c() {
        if (ztb.m221490d(C1586f.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = C1600c.m8101l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            C1600c.m8101l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th) {
            ztb.m221488b(th, C1586f.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m7949d(@NotNull Map<String, JSONObject> purchaseDetailsMap, @NotNull Map<String, ? extends JSONObject> skuDetailsMap, boolean isSubscription, @NotNull String packageName, @NotNull InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean isFirstAppLaunch) {
        if (ztb.m221490d(C1586f.class)) {
            return;
        }
        try {
            purchaseDetailsMap.getClass();
            skuDetailsMap.getClass();
            packageName.getClass();
            billingClientVersion.getClass();
            C1586f c1586f = INSTANCE;
            c1586f.m7956f(c1586f.m7955b(c1586f.m7954a(purchaseDetailsMap, isSubscription), skuDetailsMap, packageName), isSubscription, billingClientVersion, isFirstAppLaunch);
        } catch (Throwable th) {
            ztb.m221488b(th, C1586f.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m7950e() {
        if (ztb.m221490d(C1586f.class)) {
            return false;
        }
        try {
            return !C1600c.m8101l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
        } catch (Throwable th) {
            ztb.m221488b(th, C1586f.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7951g() {
        if (ztb.m221490d(C1586f.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = C1600c.m8101l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j = Long.parseLong((String) StringsKt.split$default((String) it.next(), new String[]{com.meituan.robust.Constants.PACKNAME_END}, false, 2, 2, null).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            m7948c();
        } catch (Throwable th) {
            ztb.m221488b(th, C1586f.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m7952h() {
        if (ztb.m221490d(C1586f.class)) {
            return;
        }
        try {
            try {
                C1600c.m8101l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1586f.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m7953i() {
        if (ztb.m221490d(C1586f.class)) {
            return;
        }
        try {
            m7952h();
            try {
                SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1586f.class);
        }
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, JSONObject> m7954a(@NotNull Map<String, JSONObject> purchaseDetailsMap, boolean isSubscription) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            purchaseDetailsMap.getClass();
            SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j = isSubscription ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : MapsKt.toMap(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j2 = jSONObject.getLong("purchaseTime");
                        if (j2 <= j) {
                            purchaseDetailsMap.remove(str);
                        }
                        jMax = Math.max(jMax, j2);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j) {
                if (isSubscription) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(purchaseDetailsMap);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, String> m7955b(@NotNull Map<String, ? extends JSONObject> purchaseDetailsMap, @NotNull Map<String, ? extends JSONObject> skuDetailsMap, @NotNull String packageName) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            purchaseDetailsMap.getClass();
            skuDetailsMap.getClass();
            packageName.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : purchaseDetailsMap.entrySet()) {
                String key = entry.getKey();
                JSONObject value = entry.getValue();
                JSONObject jSONObject = skuDetailsMap.get(key);
                try {
                    value.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, packageName);
                    if (jSONObject != null) {
                        String string = value.toString();
                        string.getClass();
                        String string2 = jSONObject.toString();
                        string2.getClass();
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7956f(Map<String, String> purchaseDetailsMap, boolean isSubscription, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean isFirstAppLaunch) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : purchaseDetailsMap.entrySet()) {
                vj1.m201434j(entry.getKey(), entry.getValue(), isSubscription, billingClientVersion, isFirstAppLaunch);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
