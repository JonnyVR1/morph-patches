package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.iap.C1584d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.appevents.iap.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u0000 =2\u00020\u0001:\u0005\u001d,./0B¥\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00182\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b(\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00105R\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010<¨\u0006>"}, m88121d2 = {"Lcom/facebook/appevents/iap/d;", "Lcom/facebook/appevents/iap/c;", "", "billingClient", "Ljava/lang/Class;", "billingClientClazz", "purchaseResultClazz", "purchaseClazz", "skuDetailsClazz", "purchaseHistoryRecordClazz", "skuDetailsResponseListenerClazz", "purchaseHistoryResponseListenerClazz", "Ljava/lang/reflect/Method;", "queryPurchasesMethod", "getPurchaseListMethod", "getOriginalJsonMethod", "getOriginalJsonSkuMethod", "getOriginalJsonPurchaseHistoryMethod", "querySkuDetailsAsyncMethod", "queryPurchaseHistoryAsyncMethod", "Lcom/facebook/appevents/iap/h;", "inAppPurchaseSkuDetailsWrapper", "<init>", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/facebook/appevents/iap/h;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "productType", "Ljava/lang/Runnable;", "completionHandler", "", "a", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/lang/Runnable;)V", "skuType", "", "", "skuIDs", "r", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/util/List;Ljava/lang/Runnable;)V", "runnable", "p", "(Ljava/lang/Runnable;)V", BLiveStormDanmakuGiftResourceType.f45294s, "Ljava/lang/Object;", "q", "()Ljava/lang/Object;", "b", "Ljava/lang/Class;", "c", Constants.INAPP_DATA_TAG, "e", "f", "g", "h", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/reflect/Method;", "j", "k", BLiveStormDanmakuGiftResourceType.f45292l, "m", "n", "o", "Lcom/facebook/appevents/iap/h;", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1584d implements InterfaceC1583c {

    /* JADX INFO: renamed from: r */
    @Nullable
    public static C1584d f6070r;

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
    public final C1588h inAppPurchaseSkuDetailsWrapper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    public static final String f6069q = C1584d.class.getCanonicalName();

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final AtomicBoolean f6071s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final Map<String, JSONObject> f6072t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Map<String, JSONObject> f6073u = new ConcurrentHashMap();

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Map<String, JSONObject> f6074v = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/facebook/appevents/iap/d$a;", "Ljava/lang/reflect/InvocationHandler;", "Ljava/lang/Runnable;", "runnable", "<init>", "(Ljava/lang/Runnable;)V", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Runnable;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
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
            Method methodM7872d;
            if (ztb.m221490d(this)) {
                return null;
            }
            try {
                proxy.getClass();
                m.getClass();
                if (Intrinsics.m88377d(m.getName(), "onBillingSetupFinished")) {
                    Object orNull = args != null ? ArraysKt.getOrNull(args, 0) : null;
                    Class<?> clsM7869a = InAppPurchaseUtils.m7869a("com.android.billingclient.api.BillingResult");
                    if (clsM7869a != null && (methodM7872d = InAppPurchaseUtils.m7872d(clsM7869a, "getResponseCode", new Class[0])) != null && Intrinsics.m88377d(InAppPurchaseUtils.m7873e(clsM7869a, methodM7872d, orNull, new Object[0]), 0)) {
                        C1584d.INSTANCE.m7914g().set(true);
                        Runnable runnable = this.runnable;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } else {
                    String name = m.getName();
                    name.getClass();
                    if (C15493d.m94380w(name, "onBillingServiceDisconnected", false, 2, null)) {
                        C1584d.INSTANCE.m7914g().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                ztb.m221488b(th, this);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ'\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Lcom/facebook/appevents/iap/d$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/appevents/iap/d;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)Lcom/facebook/appevents/iap/d;", "b", "Ljava/lang/Class;", "billingClientClazz", "a", "(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isServiceConnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "", "", "Lorg/json/JSONObject;", "iapPurchaseDetailsMap", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "subsPurchaseDetailsMap", "f", "skuDetailsMap", "e", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "instance", "Lcom/facebook/appevents/iap/d;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Object m7908a(Context context, Class<?> billingClientClazz) {
            Object objM7873e;
            Object objM7873e2;
            Object objM7873e3;
            Class<?> clsM7869a = InAppPurchaseUtils.m7869a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsM7869a2 = InAppPurchaseUtils.m7869a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsM7869a != null && clsM7869a2 != null) {
                Method methodM7872d = InAppPurchaseUtils.m7872d(billingClientClazz, "newBuilder", Context.class);
                Method methodM7872d2 = InAppPurchaseUtils.m7872d(clsM7869a, "enablePendingPurchases", new Class[0]);
                Method methodM7872d3 = InAppPurchaseUtils.m7872d(clsM7869a, "setListener", clsM7869a2);
                Method methodM7872d4 = InAppPurchaseUtils.m7872d(clsM7869a, "build", new Class[0]);
                if (methodM7872d == null || methodM7872d2 == null || methodM7872d3 == null || methodM7872d4 == null || (objM7873e = InAppPurchaseUtils.m7873e(billingClientClazz, methodM7872d, null, context)) == null || (objM7873e2 = InAppPurchaseUtils.m7873e(clsM7869a, methodM7872d3, objM7873e, Proxy.newProxyInstance(clsM7869a2.getClassLoader(), new Class[]{clsM7869a2}, new d()))) == null || (objM7873e3 = InAppPurchaseUtils.m7873e(clsM7869a, methodM7872d2, objM7873e2, new Object[0])) == null) {
                    return null;
                }
                return InAppPurchaseUtils.m7873e(clsM7869a, methodM7872d4, objM7873e3, new Object[0]);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final C1584d m7909b(Context context) {
            C1588h c1588hM7970b = C1588h.INSTANCE.m7970b();
            if (c1588hM7970b == null) {
                return null;
            }
            Class<?> clsM7869a = InAppPurchaseUtils.m7869a("com.android.billingclient.api.BillingClient");
            Class<?> clsM7869a2 = InAppPurchaseUtils.m7869a("com.android.billingclient.api.Purchase");
            Class<?> clsM7869a3 = InAppPurchaseUtils.m7869a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> clsM7869a4 = InAppPurchaseUtils.m7869a("com.android.billingclient.api.SkuDetails");
            Class<?> clsM7869a5 = InAppPurchaseUtils.m7869a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> clsM7869a6 = InAppPurchaseUtils.m7869a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> clsM7869a7 = InAppPurchaseUtils.m7869a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsM7869a == null || clsM7869a3 == null || clsM7869a2 == null || clsM7869a4 == null || clsM7869a6 == null || clsM7869a5 == null || clsM7869a7 == null) {
                C1584d.m7900l();
                return null;
            }
            Method methodM7872d = InAppPurchaseUtils.m7872d(clsM7869a, "queryPurchases", String.class);
            Method methodM7872d2 = InAppPurchaseUtils.m7872d(clsM7869a3, "getPurchasesList", new Class[0]);
            Method methodM7872d3 = InAppPurchaseUtils.m7872d(clsM7869a2, "getOriginalJson", new Class[0]);
            Method methodM7872d4 = InAppPurchaseUtils.m7872d(clsM7869a4, "getOriginalJson", new Class[0]);
            Method methodM7872d5 = InAppPurchaseUtils.m7872d(clsM7869a5, "getOriginalJson", new Class[0]);
            Method methodM7872d6 = InAppPurchaseUtils.m7872d(clsM7869a, "querySkuDetailsAsync", c1588hM7970b.m7968d(), clsM7869a6);
            Method methodM7872d7 = InAppPurchaseUtils.m7872d(clsM7869a, "queryPurchaseHistoryAsync", String.class, clsM7869a7);
            if (methodM7872d == null || methodM7872d2 == null || methodM7872d3 == null || methodM7872d4 == null || methodM7872d5 == null || methodM7872d6 == null || methodM7872d7 == null) {
                C1584d.m7900l();
                return null;
            }
            Object objM7908a = m7908a(context, clsM7869a);
            if (objM7908a == null) {
                C1584d.m7900l();
                return null;
            }
            C1584d.m7903o(new C1584d(objM7908a, clsM7869a, clsM7869a3, clsM7869a2, clsM7869a4, clsM7869a5, clsM7869a6, clsM7869a7, methodM7872d, methodM7872d2, methodM7872d3, methodM7872d4, methodM7872d5, methodM7872d6, methodM7872d7, c1588hM7970b, null));
            return C1584d.m7895g();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Map<String, JSONObject> m7910c() {
            return C1584d.m7894f();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: d */
        public final synchronized C1584d m7911d(@NotNull Context context) {
            C1584d c1584dM7895g;
            context.getClass();
            c1584dM7895g = C1584d.m7895g();
            if (c1584dM7895g == null) {
                c1584dM7895g = m7909b(context);
            }
            return c1584dM7895g;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Map<String, JSONObject> m7912e() {
            return C1584d.m7898j();
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Map<String, JSONObject> m7913f() {
            return C1584d.m7899k();
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final AtomicBoolean m7914g() {
            return C1584d.m7901m();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$c */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Lcom/facebook/appevents/iap/d$c;", "Ljava/lang/reflect/InvocationHandler;", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "skuType", "Ljava/lang/Runnable;", "completionHandler", "<init>", "(Lcom/facebook/appevents/iap/d;Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/lang/Runnable;)V", "", "proxy", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "", "args", "", "a", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "b", "Ljava/lang/Runnable;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public final class c implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public InAppPurchaseUtils.IAPProductType skuType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Runnable completionHandler;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1584d f6094c;

        public c(@NotNull C1584d c1584d, @NotNull InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
            iAPProductType.getClass();
            runnable.getClass();
            this.f6094c = c1584d;
            this.skuType = iAPProductType;
            this.completionHandler = runnable;
        }

        /* JADX INFO: renamed from: a */
        public void m7915a(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] args) {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                proxy.getClass();
                method.getClass();
                if (Intrinsics.m88377d(method.getName(), "onPurchaseHistoryResponse")) {
                    Object orNull = args != null ? ArraysKt.getOrNull(args, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) orNull).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objM7873e = InAppPurchaseUtils.m7873e(C1584d.m7896h(this.f6094c), C1584d.m7892d(this.f6094c), it.next(), new Object[0]);
                                String str = objM7873e instanceof String ? (String) objM7873e : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        string.getClass();
                                        arrayList.add(string);
                                        if (this.skuType == InAppPurchaseUtils.IAPProductType.INAPP) {
                                            C1584d.INSTANCE.m7910c().put(string, jSONObject);
                                        } else {
                                            C1584d.INSTANCE.m7913f().put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            this.completionHandler.run();
                        } else {
                            C1584d.m7902n(this.f6094c, this.skuType, arrayList, this.completionHandler);
                        }
                    }
                }
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (ztb.m221490d(this)) {
                return null;
            }
            try {
                m7915a(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                ztb.m221488b(th, this);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$d */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lcom/facebook/appevents/iap/d$d;", "Ljava/lang/reflect/InvocationHandler;", "<init>", "()V", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m, @Nullable Object[] args) {
            if (ztb.m221490d(this)) {
                return null;
            }
            try {
                proxy.getClass();
                m.getClass();
                return null;
            } catch (Throwable th) {
                ztb.m221488b(th, this);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.d$e */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0081\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/facebook/appevents/iap/d$e;", "Ljava/lang/reflect/InvocationHandler;", "Ljava/lang/Runnable;", "completionHandler", "<init>", "(Lcom/facebook/appevents/iap/d;Ljava/lang/Runnable;)V", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "", "a", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "Ljava/lang/Runnable;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public final class e implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Runnable completionHandler;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1584d f6096b;

        public e(@NotNull C1584d c1584d, Runnable runnable) {
            runnable.getClass();
            this.f6096b = c1584d;
            this.completionHandler = runnable;
        }

        /* JADX INFO: renamed from: a */
        public void m7916a(@NotNull Object proxy, @NotNull Method m, @Nullable Object[] args) {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                proxy.getClass();
                m.getClass();
                if (Intrinsics.m88377d(m.getName(), "onSkuDetailsResponse")) {
                    Object orNull = args != null ? ArraysKt.getOrNull(args, 1) : null;
                    if (orNull != null && (orNull instanceof List)) {
                        Iterator it = ((List) orNull).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objM7873e = InAppPurchaseUtils.m7873e(C1584d.m7897i(this.f6096b), C1584d.m7893e(this.f6096b), it.next(), new Object[0]);
                                String str = objM7873e instanceof String ? (String) objM7873e : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        Map<String, JSONObject> mapM7912e = C1584d.INSTANCE.m7912e();
                                        string.getClass();
                                        mapM7912e.put(string, jSONObject);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        this.completionHandler.run();
                    }
                }
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (ztb.m221490d(this)) {
                return null;
            }
            try {
                m7916a(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                ztb.m221488b(th, this);
                return null;
            }
        }
    }

    public C1584d(Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C1588h c1588h) {
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
        this.inAppPurchaseSkuDetailsWrapper = c1588h;
    }

    /* JADX INFO: renamed from: b */
    public static void m7890b(C1584d c1584d, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (ztb.m221490d(C1584d.class)) {
            return;
        }
        try {
            c1584d.getClass();
            iAPProductType.getClass();
            runnable.getClass();
            InAppPurchaseUtils.m7873e(c1584d.billingClientClazz, c1584d.queryPurchaseHistoryAsyncMethod, c1584d.m7905q(), iAPProductType.getType(), Proxy.newProxyInstance(c1584d.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{c1584d.purchaseHistoryResponseListenerClazz}, new c(c1584d, iAPProductType, runnable)));
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7891c(C1584d c1584d, Runnable runnable, InAppPurchaseUtils.IAPProductType iAPProductType, List list) {
        if (ztb.m221490d(C1584d.class)) {
            return;
        }
        try {
            c1584d.getClass();
            runnable.getClass();
            iAPProductType.getClass();
            list.getClass();
            Object objNewProxyInstance = Proxy.newProxyInstance(c1584d.skuDetailsResponseListenerClazz.getClassLoader(), new Class[]{c1584d.skuDetailsResponseListenerClazz}, new e(c1584d, runnable));
            InAppPurchaseUtils.m7873e(c1584d.billingClientClazz, c1584d.querySkuDetailsAsyncMethod, c1584d.m7905q(), c1584d.inAppPurchaseSkuDetailsWrapper.m7967c(iAPProductType, list), objNewProxyInstance);
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ Method m7892d(C1584d c1584d) {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return c1584d.getOriginalJsonPurchaseHistoryMethod;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ Method m7893e(C1584d c1584d) {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return c1584d.getOriginalJsonSkuMethod;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ Map m7894f() {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return f6072t;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ C1584d m7895g() {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return f6070r;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ Class m7896h(C1584d c1584d) {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return c1584d.purchaseHistoryRecordClazz;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ Class m7897i(C1584d c1584d) {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return c1584d.skuDetailsClazz;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ Map m7898j() {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return f6074v;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ Map m7899k() {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return f6073u;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ String m7900l() {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return f6069q;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicBoolean m7901m() {
        if (ztb.m221490d(C1584d.class)) {
            return null;
        }
        try {
            return f6071s;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ void m7902n(C1584d c1584d, InAppPurchaseUtils.IAPProductType iAPProductType, List list, Runnable runnable) {
        if (ztb.m221490d(C1584d.class)) {
            return;
        }
        try {
            c1584d.m7906r(iAPProductType, list, runnable);
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ void m7903o(C1584d c1584d) {
        if (ztb.m221490d(C1584d.class)) {
            return;
        }
        try {
            f6070r = c1584d;
        } catch (Throwable th) {
            ztb.m221488b(th, C1584d.class);
        }
    }

    @Override // com.facebook.appevents.iap.InterfaceC1583c
    /* JADX INFO: renamed from: a */
    public void mo7889a(@NotNull final InAppPurchaseUtils.IAPProductType productType, @NotNull final Runnable completionHandler) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            productType.getClass();
            completionHandler.getClass();
            m7904p(new Runnable() { // from class: l.wrm
                @Override // java.lang.Runnable
                public final void run() {
                    C1584d.m7890b(this.f190532a, productType, completionHandler);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m7904p(Runnable runnable) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (f6071s.get()) {
                runnable.run();
            } else {
                m7907s(runnable);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public Object m7905q() {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return this.billingClient;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7906r(final InAppPurchaseUtils.IAPProductType skuType, final List<String> skuIDs, final Runnable completionHandler) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            m7904p(new Runnable() { // from class: l.xrm
                @Override // java.lang.Runnable
                public final void run() {
                    C1584d.m7891c(this.f195934a, completionHandler, skuType, skuIDs);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7907s(Runnable runnable) {
        Method methodM7872d;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Class<?> clsM7869a = InAppPurchaseUtils.m7869a("com.android.billingclient.api.BillingClientStateListener");
            if (clsM7869a == null || (methodM7872d = InAppPurchaseUtils.m7872d(this.billingClientClazz, "startConnection", clsM7869a)) == null) {
                return;
            }
            InAppPurchaseUtils.m7873e(this.billingClientClazz, methodM7872d, m7905q(), Proxy.newProxyInstance(clsM7869a.getClassLoader(), new Class[]{clsM7869a}, new a(runnable)));
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public /* synthetic */ C1584d(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C1588h c1588h, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, c1588h);
    }
}
