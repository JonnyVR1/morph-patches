package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.iap.C1561d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.lsb;

/* JADX INFO: renamed from: com.facebook.appevents.iap.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u0000 =2\u00020\u0001:\u0005\u001d,./0B¥\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00182\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b(\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00105R\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010<¨\u0006>"}, m87232d2 = {"Lcom/facebook/appevents/iap/d;", "Lcom/facebook/appevents/iap/c;", "", "billingClient", "Ljava/lang/Class;", "billingClientClazz", "purchaseResultClazz", "purchaseClazz", "skuDetailsClazz", "purchaseHistoryRecordClazz", "skuDetailsResponseListenerClazz", "purchaseHistoryResponseListenerClazz", "Ljava/lang/reflect/Method;", "queryPurchasesMethod", "getPurchaseListMethod", "getOriginalJsonMethod", "getOriginalJsonSkuMethod", "getOriginalJsonPurchaseHistoryMethod", "querySkuDetailsAsyncMethod", "queryPurchaseHistoryAsyncMethod", "Lcom/facebook/appevents/iap/h;", "inAppPurchaseSkuDetailsWrapper", "<init>", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/facebook/appevents/iap/h;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "productType", "Ljava/lang/Runnable;", "completionHandler", "", "a", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/lang/Runnable;)V", "skuType", "", "", "skuIDs", "r", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/util/List;Ljava/lang/Runnable;)V", "runnable", "p", "(Ljava/lang/Runnable;)V", BLiveStormDanmakuGiftResourceType.f44446s, "Ljava/lang/Object;", "q", "()Ljava/lang/Object;", "b", "Ljava/lang/Class;", "c", Constants.INAPP_DATA_TAG, "e", "f", "g", "h", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/reflect/Method;", "j", "k", BLiveStormDanmakuGiftResourceType.f44444l, "m", "n", "o", "Lcom/facebook/appevents/iap/h;", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1561d implements InterfaceC1560c {

    /* JADX INFO: renamed from: r */
    @Nullable
    public static C1561d f6033r;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object billingClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Class<?> billingClientClazz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseResultClazz;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseClazz;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Class<?> skuDetailsClazz;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseHistoryRecordClazz;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Class<?> skuDetailsResponseListenerClazz;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseHistoryResponseListenerClazz;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesMethod;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Method getPurchaseListMethod;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Method getOriginalJsonMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Method getOriginalJsonSkuMethod;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Method getOriginalJsonPurchaseHistoryMethod;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Method querySkuDetailsAsyncMethod;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryAsyncMethod;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final C1565h inAppPurchaseSkuDetailsWrapper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    public static final String f6032q = C1561d.class.getCanonicalName();

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final AtomicBoolean f6034s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Map<String, JSONObject> f6035t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Map<String, JSONObject> f6036u = new ConcurrentHashMap();

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Map<String, JSONObject> f6037v = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$a */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/facebook/appevents/iap/d$a;", "Ljava/lang/reflect/InvocationHandler;", "Ljava/lang/Runnable;", "runnable", "<init>", "(Ljava/lang/Runnable;)V", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Runnable;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final Runnable runnable;

        public a(@Nullable Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m, @Nullable Object[] args) {
            Method methodM7818d;
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                proxy.getClass();
                m.getClass();
                if (Intrinsics.m87488d(m.getName(), "onBillingSetupFinished")) {
                    Object orNull = args != null ? ArraysKt.getOrNull(args, 0) : null;
                    Class<?> clsM7815a = InAppPurchaseUtils.m7815a("com.android.billingclient.api.BillingResult");
                    if (clsM7815a != null && (methodM7818d = InAppPurchaseUtils.m7818d(clsM7815a, "getResponseCode", new Class[0])) != null && Intrinsics.m87488d(InAppPurchaseUtils.m7819e(clsM7815a, methodM7818d, orNull, new Object[0]), 0)) {
                        C1561d.INSTANCE.m7860g().set(true);
                        Runnable runnable = this.runnable;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } else {
                    String name = m.getName();
                    name.getClass();
                    if (C15386d.m93489w(name, "onBillingServiceDisconnected", false, 2, null)) {
                        C1561d.INSTANCE.m7860g().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ'\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Lcom/facebook/appevents/iap/d$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/appevents/iap/d;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)Lcom/facebook/appevents/iap/d;", "b", "Ljava/lang/Class;", "billingClientClazz", "a", "(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isServiceConnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "", "", "Lorg/json/JSONObject;", "iapPurchaseDetailsMap", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "subsPurchaseDetailsMap", "f", "skuDetailsMap", "e", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "instance", "Lcom/facebook/appevents/iap/d;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Object m7854a(Context context, Class<?> billingClientClazz) {
            Object objM7819e;
            Object objM7819e2;
            Object objM7819e3;
            Class<?> clsM7815a = InAppPurchaseUtils.m7815a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsM7815a2 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsM7815a != null && clsM7815a2 != null) {
                Method methodM7818d = InAppPurchaseUtils.m7818d(billingClientClazz, "newBuilder", Context.class);
                Method methodM7818d2 = InAppPurchaseUtils.m7818d(clsM7815a, "enablePendingPurchases", new Class[0]);
                Method methodM7818d3 = InAppPurchaseUtils.m7818d(clsM7815a, "setListener", clsM7815a2);
                Method methodM7818d4 = InAppPurchaseUtils.m7818d(clsM7815a, "build", new Class[0]);
                if (methodM7818d == null || methodM7818d2 == null || methodM7818d3 == null || methodM7818d4 == null || (objM7819e = InAppPurchaseUtils.m7819e(billingClientClazz, methodM7818d, null, context)) == null || (objM7819e2 = InAppPurchaseUtils.m7819e(clsM7815a, methodM7818d3, objM7819e, Proxy.newProxyInstance(clsM7815a2.getClassLoader(), new Class[]{clsM7815a2}, new d()))) == null || (objM7819e3 = InAppPurchaseUtils.m7819e(clsM7815a, methodM7818d2, objM7819e2, new Object[0])) == null) {
                    return null;
                }
                return InAppPurchaseUtils.m7819e(clsM7815a, methodM7818d4, objM7819e3, new Object[0]);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final C1561d m7855b(Context context) {
            C1565h c1565hM7916b = C1565h.INSTANCE.m7916b();
            if (c1565hM7916b == null) {
                return null;
            }
            Class<?> clsM7815a = InAppPurchaseUtils.m7815a("com.android.billingclient.api.BillingClient");
            Class<?> clsM7815a2 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.Purchase");
            Class<?> clsM7815a3 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> clsM7815a4 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.SkuDetails");
            Class<?> clsM7815a5 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> clsM7815a6 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> clsM7815a7 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsM7815a == null || clsM7815a3 == null || clsM7815a2 == null || clsM7815a4 == null || clsM7815a6 == null || clsM7815a5 == null || clsM7815a7 == null) {
                C1561d.m7846l();
                return null;
            }
            Method methodM7818d = InAppPurchaseUtils.m7818d(clsM7815a, "queryPurchases", String.class);
            Method methodM7818d2 = InAppPurchaseUtils.m7818d(clsM7815a3, "getPurchasesList", new Class[0]);
            Method methodM7818d3 = InAppPurchaseUtils.m7818d(clsM7815a2, "getOriginalJson", new Class[0]);
            Method methodM7818d4 = InAppPurchaseUtils.m7818d(clsM7815a4, "getOriginalJson", new Class[0]);
            Method methodM7818d5 = InAppPurchaseUtils.m7818d(clsM7815a5, "getOriginalJson", new Class[0]);
            Method methodM7818d6 = InAppPurchaseUtils.m7818d(clsM7815a, "querySkuDetailsAsync", c1565hM7916b.m7914d(), clsM7815a6);
            Method methodM7818d7 = InAppPurchaseUtils.m7818d(clsM7815a, "queryPurchaseHistoryAsync", String.class, clsM7815a7);
            if (methodM7818d == null || methodM7818d2 == null || methodM7818d3 == null || methodM7818d4 == null || methodM7818d5 == null || methodM7818d6 == null || methodM7818d7 == null) {
                C1561d.m7846l();
                return null;
            }
            Object objM7854a = m7854a(context, clsM7815a);
            if (objM7854a == null) {
                C1561d.m7846l();
                return null;
            }
            C1561d.m7849o(new C1561d(objM7854a, clsM7815a, clsM7815a3, clsM7815a2, clsM7815a4, clsM7815a5, clsM7815a6, clsM7815a7, methodM7818d, methodM7818d2, methodM7818d3, methodM7818d4, methodM7818d5, methodM7818d6, methodM7818d7, c1565hM7916b, null));
            return C1561d.m7841g();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Map<String, JSONObject> m7856c() {
            return C1561d.m7840f();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: d */
        public final synchronized C1561d m7857d(@NotNull Context context) {
            C1561d c1561dM7841g;
            context.getClass();
            c1561dM7841g = C1561d.m7841g();
            if (c1561dM7841g == null) {
                c1561dM7841g = m7855b(context);
            }
            return c1561dM7841g;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Map<String, JSONObject> m7858e() {
            return C1561d.m7844j();
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Map<String, JSONObject> m7859f() {
            return C1561d.m7845k();
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final AtomicBoolean m7860g() {
            return C1561d.m7847m();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$c */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Lcom/facebook/appevents/iap/d$c;", "Ljava/lang/reflect/InvocationHandler;", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "skuType", "Ljava/lang/Runnable;", "completionHandler", "<init>", "(Lcom/facebook/appevents/iap/d;Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/lang/Runnable;)V", "", "proxy", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "", "args", "", "a", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "b", "Ljava/lang/Runnable;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public final class c implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public InAppPurchaseUtils.IAPProductType skuType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Runnable completionHandler;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1561d f6057c;

        public c(@NotNull C1561d c1561d, @NotNull InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
            iAPProductType.getClass();
            runnable.getClass();
            this.f6057c = c1561d;
            this.skuType = iAPProductType;
            this.completionHandler = runnable;
        }

        /* JADX INFO: renamed from: a */
        public void m7861a(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] args) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                proxy.getClass();
                method.getClass();
                if (Intrinsics.m87488d(method.getName(), "onPurchaseHistoryResponse")) {
                    Object orNull = args != null ? ArraysKt.getOrNull(args, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) orNull).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objM7819e = InAppPurchaseUtils.m7819e(C1561d.m7842h(this.f6057c), C1561d.m7838d(this.f6057c), it.next(), new Object[0]);
                                String str = objM7819e instanceof String ? (String) objM7819e : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        string.getClass();
                                        arrayList.add(string);
                                        if (this.skuType == InAppPurchaseUtils.IAPProductType.INAPP) {
                                            C1561d.INSTANCE.m7856c().put(string, jSONObject);
                                        } else {
                                            C1561d.INSTANCE.m7859f().put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            this.completionHandler.run();
                        } else {
                            C1561d.m7848n(this.f6057c, this.skuType, arrayList, this.completionHandler);
                        }
                    }
                }
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                m7861a(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$d */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Lcom/facebook/appevents/iap/d$d;", "Ljava/lang/reflect/InvocationHandler;", "<init>", "()V", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m, @Nullable Object[] args) {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                proxy.getClass();
                m.getClass();
                return null;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$e */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0081\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/facebook/appevents/iap/d$e;", "Ljava/lang/reflect/InvocationHandler;", "Ljava/lang/Runnable;", "completionHandler", "<init>", "(Lcom/facebook/appevents/iap/d;Ljava/lang/Runnable;)V", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "", "a", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "Ljava/lang/Runnable;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public final class e implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Runnable completionHandler;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1561d f6059b;

        public e(@NotNull C1561d c1561d, Runnable runnable) {
            runnable.getClass();
            this.f6059b = c1561d;
            this.completionHandler = runnable;
        }

        /* JADX INFO: renamed from: a */
        public void m7862a(@NotNull Object proxy, @NotNull Method m, @Nullable Object[] args) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                proxy.getClass();
                m.getClass();
                if (Intrinsics.m87488d(m.getName(), "onSkuDetailsResponse")) {
                    Object orNull = args != null ? ArraysKt.getOrNull(args, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        Iterator it = ((List) orNull).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objM7819e = InAppPurchaseUtils.m7819e(C1561d.m7843i(this.f6059b), C1561d.m7839e(this.f6059b), it.next(), new Object[0]);
                                String str = objM7819e instanceof String ? (String) objM7819e : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        Map<String, JSONObject> mapM7858e = C1561d.INSTANCE.m7858e();
                                        string.getClass();
                                        mapM7858e.put(string, jSONObject);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        this.completionHandler.run();
                    }
                }
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                m7862a(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return null;
            }
        }
    }

    public C1561d(Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C1565h c1565h) {
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseResultClazz = cls2;
        this.purchaseClazz = cls3;
        this.skuDetailsClazz = cls4;
        this.purchaseHistoryRecordClazz = cls5;
        this.skuDetailsResponseListenerClazz = cls6;
        this.purchaseHistoryResponseListenerClazz = cls7;
        this.queryPurchasesMethod = method;
        this.getPurchaseListMethod = method2;
        this.getOriginalJsonMethod = method3;
        this.getOriginalJsonSkuMethod = method4;
        this.getOriginalJsonPurchaseHistoryMethod = method5;
        this.querySkuDetailsAsyncMethod = method6;
        this.queryPurchaseHistoryAsyncMethod = method7;
        this.inAppPurchaseSkuDetailsWrapper = c1565h;
    }

    /* JADX INFO: renamed from: b */
    public static void m7836b(C1561d c1561d, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (lsb.m151554d(C1561d.class)) {
            return;
        }
        try {
            c1561d.getClass();
            iAPProductType.getClass();
            runnable.getClass();
            InAppPurchaseUtils.m7819e(c1561d.billingClientClazz, c1561d.queryPurchaseHistoryAsyncMethod, c1561d.m7851q(), iAPProductType.getType(), Proxy.newProxyInstance(c1561d.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{c1561d.purchaseHistoryResponseListenerClazz}, new c(c1561d, iAPProductType, runnable)));
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7837c(C1561d c1561d, Runnable runnable, InAppPurchaseUtils.IAPProductType iAPProductType, List list) {
        if (lsb.m151554d(C1561d.class)) {
            return;
        }
        try {
            c1561d.getClass();
            runnable.getClass();
            iAPProductType.getClass();
            list.getClass();
            Object objNewProxyInstance = Proxy.newProxyInstance(c1561d.skuDetailsResponseListenerClazz.getClassLoader(), new Class[]{c1561d.skuDetailsResponseListenerClazz}, new e(c1561d, runnable));
            InAppPurchaseUtils.m7819e(c1561d.billingClientClazz, c1561d.querySkuDetailsAsyncMethod, c1561d.m7851q(), c1561d.inAppPurchaseSkuDetailsWrapper.m7913c(iAPProductType, list), objNewProxyInstance);
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ Method m7838d(C1561d c1561d) {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return c1561d.getOriginalJsonPurchaseHistoryMethod;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ Method m7839e(C1561d c1561d) {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return c1561d.getOriginalJsonSkuMethod;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ Map m7840f() {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return f6035t;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ C1561d m7841g() {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return f6033r;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ Class m7842h(C1561d c1561d) {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return c1561d.purchaseHistoryRecordClazz;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ Class m7843i(C1561d c1561d) {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return c1561d.skuDetailsClazz;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ Map m7844j() {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return f6037v;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ Map m7845k() {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return f6036u;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ String m7846l() {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return f6032q;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicBoolean m7847m() {
        if (lsb.m151554d(C1561d.class)) {
            return null;
        }
        try {
            return f6034s;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ void m7848n(C1561d c1561d, InAppPurchaseUtils.IAPProductType iAPProductType, List list, Runnable runnable) {
        if (lsb.m151554d(C1561d.class)) {
            return;
        }
        try {
            c1561d.m7852r(iAPProductType, list, runnable);
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ void m7849o(C1561d c1561d) {
        if (lsb.m151554d(C1561d.class)) {
            return;
        }
        try {
            f6033r = c1561d;
        } catch (Throwable th) {
            lsb.m151552b(th, C1561d.class);
        }
    }

    @Override // com.facebook.appevents.iap.InterfaceC1560c
    /* JADX INFO: renamed from: a */
    public void mo7835a(@NotNull final InAppPurchaseUtils.IAPProductType productType, @NotNull final Runnable completionHandler) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            productType.getClass();
            completionHandler.getClass();
            m7850p(new Runnable() { // from class: l.upm
                @Override // java.lang.Runnable
                public final void run() {
                    C1561d.m7836b(this.f177643a, productType, completionHandler);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m7850p(Runnable runnable) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (f6034s.get()) {
                runnable.run();
            } else {
                m7853s(runnable);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public Object m7851q() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            return this.billingClient;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7852r(final InAppPurchaseUtils.IAPProductType skuType, final List<String> skuIDs, final Runnable completionHandler) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m7850p(new Runnable() { // from class: l.vpm
                @Override // java.lang.Runnable
                public final void run() {
                    C1561d.m7837c(this.f182508a, completionHandler, skuType, skuIDs);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7853s(Runnable runnable) {
        Method methodM7818d;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            Class<?> clsM7815a = InAppPurchaseUtils.m7815a("com.android.billingclient.api.BillingClientStateListener");
            if (clsM7815a == null || (methodM7818d = InAppPurchaseUtils.m7818d(this.billingClientClazz, "startConnection", clsM7815a)) == null) {
                return;
            }
            InAppPurchaseUtils.m7819e(this.billingClientClazz, methodM7818d, m7851q(), Proxy.newProxyInstance(clsM7815a.getClassLoader(), new Class[]{clsM7815a}, new a(runnable)));
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    public /* synthetic */ C1561d(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C1565h c1565h, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, c1565h);
    }
}
