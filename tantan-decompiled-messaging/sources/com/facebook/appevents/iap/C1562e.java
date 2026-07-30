package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.iap.C1562e;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
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
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.b2s;
import p149l.lsb;

/* JADX INFO: renamed from: com.facebook.appevents.iap.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b.\b\u0007\u0018\u0000 m2\u00020\u0001:\u0002IQB\u0085\u0003\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\u0006\u0010 \u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u0016\u0012\u0006\u0010\"\u001a\u00020\u0016\u0012\u0006\u0010#\u001a\u00020\u0016\u0012\u0006\u0010$\u001a\u00020\u0016\u0012\u0006\u0010%\u001a\u00020\u0016\u0012\u0006\u0010&\u001a\u00020\u0016\u0012\u0006\u0010'\u001a\u00020\u0016\u0012\u0006\u0010(\u001a\u00020\u0016\u0012\u0006\u0010)\u001a\u00020\u0016\u0012\u0006\u0010*\u001a\u00020\u0016\u0012\u0006\u0010+\u001a\u00020\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u0004\u0018\u00010\u00022\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J)\u00105\u001a\u0004\u0018\u00010\u00022\u0006\u0010/\u001a\u00020.2\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010302H\u0002¢\u0006\u0004\b5\u00106J-\u0010:\u001a\u0002092\u0006\u0010/\u001a\u00020.2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u0002092\u0006\u0010<\u001a\u000207H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u0002092\u0006\u0010<\u001a\u000207H\u0002¢\u0006\u0004\b?\u0010>J/\u0010C\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bC\u0010DJ/\u0010E\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bE\u0010DJ/\u0010F\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bF\u0010DJ/\u0010G\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bG\u0010DJ/\u0010H\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bH\u0010DJ\u001f\u0010I\u001a\u0002092\u0006\u0010/\u001a\u00020.2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u0004\u0018\u0001032\u0006\u0010K\u001a\u000203¢\u0006\u0004\bL\u0010MR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010N\u001a\u0004\bO\u0010PR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010RR\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010RR\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010RR\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010RR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010RR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010RR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010RR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010RR\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010RR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010RR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010RR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010RR\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010RR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010RR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010_R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010_R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010_R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010_R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010_R\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010_R\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010_R\u0014\u0010\u001e\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010_R\u0014\u0010\u001f\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R\u0014\u0010 \u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_R\u0014\u0010!\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010_R\u0014\u0010\"\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010_R\u0014\u0010#\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010_R\u0014\u0010$\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010_R\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010_R\u0014\u0010&\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010_R\u0014\u0010'\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010_R\u0014\u0010(\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010_R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010_R\u0014\u0010*\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010_R\u0014\u0010+\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010_¨\u0006n"}, m87232d2 = {"Lcom/facebook/appevents/iap/e;", "Lcom/facebook/appevents/iap/c;", "", "billingClient", "Ljava/lang/Class;", "billingClientClazz", "purchaseClazz", "productDetailsClazz", "purchaseHistoryRecordClazz", "queryProductDetailsParamsProductClazz", "billingResultClazz", "queryProductDetailsParamsClazz", "queryPurchaseHistoryParamsClazz", "queryPurchasesParamsClazz", "queryProductDetailsParamsBuilderClazz", "queryPurchaseHistoryParamsBuilderClazz", "queryPurchasesParamsBuilderClazz", "queryProductDetailsParamsProductBuilderClazz", "billingClientStateListenerClazz", "productDetailsResponseListenerClazz", "purchasesResponseListenerClazz", "purchaseHistoryResponseListenerClazz", "Ljava/lang/reflect/Method;", "queryPurchasesAsyncMethod", "queryPurchasesParamsNewBuilderMethod", "queryPurchasesParamsBuilderBuildMethod", "queryPurchasesParamsBuilderSetProductTypeMethod", "purchaseGetOriginalJsonMethod", "queryPurchaseHistoryAsyncMethod", "queryPurchaseHistoryParamsNewBuilderMethod", "queryPurchaseHistoryParamsBuilderBuildMethod", "queryPurchaseHistoryParamsBuilderSetProductTypeMethod", "purchaseHistoryRecordGetOriginalJsonMethod", "queryProductDetailsAsyncMethod", "queryProductDetailsParamsNewBuilderMethod", "queryProductDetailsParamsBuilderBuildMethod", "queryProductDetailsParamsBuilderSetProductListMethod", "queryProductDetailsParamsProductNewBuilderMethod", "queryProductDetailsParamsProductBuilderBuildMethod", "queryProductDetailsParamsProductBuilderSetProductIdMethod", "queryProductDetailsParamsProductBuilderSetProductTypeMethod", "productDetailsToStringMethod", "billingClientStartConnectionMethod", "billingResultGetResponseCodeMethod", "<init>", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "productType", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;)Ljava/lang/Object;", "", "", "productIds", "r", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/util/List;)Ljava/lang/Object;", "Ljava/lang/Runnable;", "completionHandler", "", BaseSei.f13931Y, "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/util/List;Ljava/lang/Runnable;)V", "runnable", "o", "(Ljava/lang/Runnable;)V", BaseSei.f13932Z, "", "wrapperArgs", "listenerArgs", BaseSei.f13930X, "([Ljava/lang/Object;[Ljava/lang/Object;)V", "w", ResourceDirection.f38808v, "u", Constants.KEY_T, "a", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/lang/Runnable;)V", "productDetailsString", "q", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/Object;", "p", "()Ljava/lang/Object;", "b", "Ljava/lang/Class;", "c", Constants.INAPP_DATA_TAG, "e", "f", "g", "h", RXScreenCaptureService.KEY_INDEX, "j", "k", BLiveStormDanmakuGiftResourceType.f44444l, "m", "n", "Ljava/lang/reflect/Method;", "A", "B", b2s.C_ZONE, "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1562e implements InterfaceC1560c {

    /* JADX INFO: renamed from: P */
    @Nullable
    public static C1562e f6062P;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryParamsBuilderSetProductTypeMethod;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Method purchaseHistoryRecordGetOriginalJsonMethod;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsAsyncMethod;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsNewBuilderMethod;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsBuilderBuildMethod;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsBuilderSetProductListMethod;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsProductNewBuilderMethod;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsProductBuilderBuildMethod;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsProductBuilderSetProductIdMethod;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsProductBuilderSetProductTypeMethod;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final Method productDetailsToStringMethod;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final Method billingClientStartConnectionMethod;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final Method billingResultGetResponseCodeMethod;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object billingClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Class<?> billingClientClazz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseClazz;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Class<?> productDetailsClazz;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseHistoryRecordClazz;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryProductDetailsParamsProductClazz;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Class<?> billingResultClazz;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryProductDetailsParamsClazz;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryPurchaseHistoryParamsClazz;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryPurchasesParamsClazz;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryProductDetailsParamsBuilderClazz;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryPurchaseHistoryParamsBuilderClazz;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryPurchasesParamsBuilderClazz;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryProductDetailsParamsProductBuilderClazz;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Class<?> billingClientStateListenerClazz;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Class<?> productDetailsResponseListenerClazz;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchasesResponseListenerClazz;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseHistoryResponseListenerClazz;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesAsyncMethod;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesParamsNewBuilderMethod;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesParamsBuilderBuildMethod;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesParamsBuilderSetProductTypeMethod;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Method purchaseGetOriginalJsonMethod;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryAsyncMethod;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryParamsNewBuilderMethod;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryParamsBuilderBuildMethod;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N */
    public static final String f6060N = C1562e.class.getCanonicalName();

    /* JADX INFO: renamed from: O */
    @NotNull
    public static final AtomicBoolean f6061O = new AtomicBoolean(false);

    /* JADX INFO: renamed from: Q */
    @NotNull
    public static final Map<String, JSONObject> f6063Q = new ConcurrentHashMap();

    /* JADX INFO: renamed from: R */
    @NotNull
    public static final Map<String, JSONObject> f6064R = new ConcurrentHashMap();

    /* JADX INFO: renamed from: S */
    @NotNull
    public static final Map<String, JSONObject> f6065S = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.facebook.appevents.iap.e$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ=\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m87232d2 = {"Lcom/facebook/appevents/iap/e$a;", "Ljava/lang/reflect/InvocationHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/appevents/iap/e;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)Lcom/facebook/appevents/iap/e;", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "b", "Ljava/lang/Class;", "billingClientClazz", "billingClientBuilderClazz", "purchasesUpdatedListenerClazz", "a", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;", "", "", "Lorg/json/JSONObject;", "iapPurchaseDetailsMap", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "subsPurchaseDetailsMap", "f", "productDetailsMap", "e", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "instance", "Lcom/facebook/appevents/iap/e;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion implements InvocationHandler {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Object m7888a(Context context, Class<?> billingClientClazz, Class<?> billingClientBuilderClazz, Class<?> purchasesUpdatedListenerClazz) {
            Object objM7819e;
            Method methodM7818d = InAppPurchaseUtils.m7818d(billingClientClazz, "newBuilder", Context.class);
            Method methodM7818d2 = InAppPurchaseUtils.m7818d(billingClientBuilderClazz, "setListener", purchasesUpdatedListenerClazz);
            Method methodM7818d3 = InAppPurchaseUtils.m7818d(billingClientBuilderClazz, "enablePendingPurchases", new Class[0]);
            Method methodM7818d4 = InAppPurchaseUtils.m7818d(billingClientBuilderClazz, "build", new Class[0]);
            if (methodM7818d4 == null || methodM7818d2 == null || methodM7818d == null || methodM7818d3 == null || (objM7819e = InAppPurchaseUtils.m7819e(billingClientBuilderClazz, methodM7818d2, InAppPurchaseUtils.m7819e(billingClientClazz, methodM7818d, null, context), Proxy.newProxyInstance(purchasesUpdatedListenerClazz.getClassLoader(), new Class[]{purchasesUpdatedListenerClazz}, this))) == null) {
                return null;
            }
            return InAppPurchaseUtils.m7819e(billingClientBuilderClazz, methodM7818d4, InAppPurchaseUtils.m7819e(billingClientBuilderClazz, methodM7818d3, objM7819e, new Object[0]), new Object[0]);
        }

        /* JADX INFO: renamed from: b */
        public final C1562e m7889b(Context context) {
            Class<?> clsM7815a = InAppPurchaseUtils.m7815a("com.android.billingclient.api.BillingClient");
            Class<?> clsM7815a2 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.Purchase");
            Class<?> clsM7815a3 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.ProductDetails");
            Class<?> clsM7815a4 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> clsM7815a5 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.QueryProductDetailsParams$Product");
            Class<?> clsM7815a6 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.BillingResult");
            Class<?> clsM7815a7 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.QueryProductDetailsParams");
            Class<?> clsM7815a8 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.QueryPurchaseHistoryParams");
            Class<?> clsM7815a9 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.QueryPurchasesParams");
            Class<?> clsM7815a10 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.QueryProductDetailsParams$Builder");
            Class<?> clsM7815a11 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
            Class<?> clsM7815a12 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.QueryPurchasesParams$Builder");
            Class<?> clsM7815a13 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
            Class<?> clsM7815a14 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsM7815a15 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.PurchasesUpdatedListener");
            Class<?> clsM7815a16 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.BillingClientStateListener");
            Class<?> clsM7815a17 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.ProductDetailsResponseListener");
            Class<?> clsM7815a18 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.PurchasesResponseListener");
            Class<?> clsM7815a19 = InAppPurchaseUtils.m7815a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsM7815a == null || clsM7815a2 == null || clsM7815a3 == null || clsM7815a4 == null || clsM7815a5 == null || clsM7815a6 == null || clsM7815a7 == null || clsM7815a8 == null || clsM7815a9 == null || clsM7815a10 == null || clsM7815a11 == null || clsM7815a12 == null || clsM7815a13 == null || clsM7815a14 == null || clsM7815a15 == null || clsM7815a16 == null || clsM7815a17 == null || clsM7815a18 == null || clsM7815a19 == null) {
                C1562e.m7869h();
                return null;
            }
            Method methodM7818d = InAppPurchaseUtils.m7818d(clsM7815a, "queryPurchasesAsync", clsM7815a9, clsM7815a18);
            Method methodM7818d2 = InAppPurchaseUtils.m7818d(clsM7815a9, "newBuilder", new Class[0]);
            Method methodM7818d3 = InAppPurchaseUtils.m7818d(clsM7815a12, "build", new Class[0]);
            Method methodM7818d4 = InAppPurchaseUtils.m7818d(clsM7815a12, "setProductType", String.class);
            Method methodM7818d5 = InAppPurchaseUtils.m7818d(clsM7815a2, "getOriginalJson", new Class[0]);
            Method methodM7818d6 = InAppPurchaseUtils.m7818d(clsM7815a, "queryPurchaseHistoryAsync", clsM7815a8, clsM7815a19);
            Method methodM7818d7 = InAppPurchaseUtils.m7818d(clsM7815a8, "newBuilder", new Class[0]);
            Method methodM7818d8 = InAppPurchaseUtils.m7818d(clsM7815a11, "build", new Class[0]);
            Method methodM7818d9 = InAppPurchaseUtils.m7818d(clsM7815a11, "setProductType", String.class);
            Method methodM7818d10 = InAppPurchaseUtils.m7818d(clsM7815a4, "getOriginalJson", new Class[0]);
            Method methodM7818d11 = InAppPurchaseUtils.m7818d(clsM7815a, "queryProductDetailsAsync", clsM7815a7, clsM7815a17);
            Method methodM7818d12 = InAppPurchaseUtils.m7818d(clsM7815a7, "newBuilder", new Class[0]);
            Method methodM7818d13 = InAppPurchaseUtils.m7818d(clsM7815a10, "build", new Class[0]);
            Method methodM7818d14 = InAppPurchaseUtils.m7818d(clsM7815a10, "setProductList", List.class);
            Method methodM7818d15 = InAppPurchaseUtils.m7818d(clsM7815a5, "newBuilder", new Class[0]);
            Method methodM7818d16 = InAppPurchaseUtils.m7818d(clsM7815a13, "build", new Class[0]);
            Method methodM7818d17 = InAppPurchaseUtils.m7818d(clsM7815a13, "setProductId", String.class);
            Method methodM7818d18 = InAppPurchaseUtils.m7818d(clsM7815a13, "setProductType", String.class);
            Method methodM7818d19 = InAppPurchaseUtils.m7818d(clsM7815a3, "toString", new Class[0]);
            Method methodM7818d20 = InAppPurchaseUtils.m7818d(clsM7815a, "startConnection", clsM7815a16);
            Method methodM7818d21 = InAppPurchaseUtils.m7818d(clsM7815a6, "getResponseCode", new Class[0]);
            if (methodM7818d == null || methodM7818d2 == null || methodM7818d3 == null || methodM7818d4 == null || methodM7818d5 == null || methodM7818d6 == null || methodM7818d7 == null || methodM7818d8 == null || methodM7818d9 == null || methodM7818d10 == null || methodM7818d11 == null || methodM7818d12 == null || methodM7818d13 == null || methodM7818d14 == null || methodM7818d15 == null || methodM7818d16 == null || methodM7818d17 == null || methodM7818d18 == null || methodM7818d19 == null || methodM7818d20 == null || methodM7818d21 == null) {
                C1562e.m7869h();
                return null;
            }
            Object objM7888a = m7888a(context, clsM7815a, clsM7815a14, clsM7815a15);
            if (objM7888a == null) {
                C1562e.m7869h();
                return null;
            }
            C1562e.m7875n(new C1562e(objM7888a, clsM7815a, clsM7815a2, clsM7815a3, clsM7815a4, clsM7815a5, clsM7815a6, clsM7815a7, clsM7815a8, clsM7815a9, clsM7815a10, clsM7815a11, clsM7815a12, clsM7815a13, clsM7815a16, clsM7815a17, clsM7815a18, clsM7815a19, methodM7818d, methodM7818d2, methodM7818d3, methodM7818d4, methodM7818d5, methodM7818d6, methodM7818d7, methodM7818d8, methodM7818d9, methodM7818d10, methodM7818d11, methodM7818d12, methodM7818d13, methodM7818d14, methodM7818d15, methodM7818d16, methodM7818d17, methodM7818d18, methodM7818d19, methodM7818d20, methodM7818d21, null));
            return C1562e.m7866e();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Map<String, JSONObject> m7890c() {
            return C1562e.m7865d();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: d */
        public final synchronized C1562e m7891d(@NotNull Context context) {
            C1562e c1562eM7866e;
            context.getClass();
            c1562eM7866e = C1562e.m7866e();
            if (c1562eM7866e == null) {
                c1562eM7866e = m7889b(context);
            }
            return c1562eM7866e;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Map<String, JSONObject> m7892e() {
            return C1562e.m7867f();
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Map<String, JSONObject> m7893f() {
            return C1562e.m7868g();
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m, @Nullable Object[] args) {
            proxy.getClass();
            m.getClass();
            return null;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.e$b */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/facebook/appevents/iap/e$b;", "Ljava/lang/reflect/InvocationHandler;", "", "", "wrapperArgs", "<init>", "(Lcom/facebook/appevents/iap/e;[Ljava/lang/Object;)V", "proxy", "Ljava/lang/reflect/Method;", "m", "listenerArgs", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "[Ljava/lang/Object;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public final class b implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Object[] wrapperArgs;

        public b(Object[] objArr) {
            this.wrapperArgs = objArr;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m, @Nullable Object[] listenerArgs) {
            proxy.getClass();
            m.getClass();
            String name = m.getName();
            if (name == null) {
                return null;
            }
            switch (name.hashCode()) {
                case -1642587947:
                    if (name.equals("onPurchaseHistoryResponse")) {
                        C1562e.m7873l(C1562e.this, this.wrapperArgs, listenerArgs);
                        break;
                    }
                    break;
                case -1599362358:
                    if (name.equals("onQueryPurchasesResponse")) {
                        C1562e.m7874m(C1562e.this, this.wrapperArgs, listenerArgs);
                        break;
                    }
                    break;
                case -79406125:
                    if (name.equals("onBillingSetupFinished")) {
                        C1562e.m7871j(C1562e.this, this.wrapperArgs, listenerArgs);
                        break;
                    }
                    break;
                case 1227540564:
                    if (name.equals("onBillingServiceDisconnected")) {
                        C1562e.m7870i(C1562e.this, this.wrapperArgs, listenerArgs);
                        break;
                    }
                    break;
                case 1940131955:
                    if (name.equals("onProductDetailsResponse")) {
                        C1562e.m7872k(C1562e.this, this.wrapperArgs, listenerArgs);
                        break;
                    }
                    break;
            }
            return null;
        }
    }

    public C1562e(Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Class<?> cls8, Class<?> cls9, Class<?> cls10, Class<?> cls11, Class<?> cls12, Class<?> cls13, Class<?> cls14, Class<?> cls15, Class<?> cls16, Class<?> cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21) {
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseClazz = cls2;
        this.productDetailsClazz = cls3;
        this.purchaseHistoryRecordClazz = cls4;
        this.queryProductDetailsParamsProductClazz = cls5;
        this.billingResultClazz = cls6;
        this.queryProductDetailsParamsClazz = cls7;
        this.queryPurchaseHistoryParamsClazz = cls8;
        this.queryPurchasesParamsClazz = cls9;
        this.queryProductDetailsParamsBuilderClazz = cls10;
        this.queryPurchaseHistoryParamsBuilderClazz = cls11;
        this.queryPurchasesParamsBuilderClazz = cls12;
        this.queryProductDetailsParamsProductBuilderClazz = cls13;
        this.billingClientStateListenerClazz = cls14;
        this.productDetailsResponseListenerClazz = cls15;
        this.purchasesResponseListenerClazz = cls16;
        this.purchaseHistoryResponseListenerClazz = cls17;
        this.queryPurchasesAsyncMethod = method;
        this.queryPurchasesParamsNewBuilderMethod = method2;
        this.queryPurchasesParamsBuilderBuildMethod = method3;
        this.queryPurchasesParamsBuilderSetProductTypeMethod = method4;
        this.purchaseGetOriginalJsonMethod = method5;
        this.queryPurchaseHistoryAsyncMethod = method6;
        this.queryPurchaseHistoryParamsNewBuilderMethod = method7;
        this.queryPurchaseHistoryParamsBuilderBuildMethod = method8;
        this.queryPurchaseHistoryParamsBuilderSetProductTypeMethod = method9;
        this.purchaseHistoryRecordGetOriginalJsonMethod = method10;
        this.queryProductDetailsAsyncMethod = method11;
        this.queryProductDetailsParamsNewBuilderMethod = method12;
        this.queryProductDetailsParamsBuilderBuildMethod = method13;
        this.queryProductDetailsParamsBuilderSetProductListMethod = method14;
        this.queryProductDetailsParamsProductNewBuilderMethod = method15;
        this.queryProductDetailsParamsProductBuilderBuildMethod = method16;
        this.queryProductDetailsParamsProductBuilderSetProductIdMethod = method17;
        this.queryProductDetailsParamsProductBuilderSetProductTypeMethod = method18;
        this.productDetailsToStringMethod = method19;
        this.billingClientStartConnectionMethod = method20;
        this.billingResultGetResponseCodeMethod = method21;
    }

    /* JADX INFO: renamed from: b */
    public static void m7863b(C1562e c1562e, Runnable runnable, InAppPurchaseUtils.IAPProductType iAPProductType, List list) {
        if (lsb.m151554d(C1562e.class)) {
            return;
        }
        try {
            c1562e.getClass();
            runnable.getClass();
            iAPProductType.getClass();
            list.getClass();
            Object objNewProxyInstance = Proxy.newProxyInstance(c1562e.productDetailsResponseListenerClazz.getClassLoader(), new Class[]{c1562e.productDetailsResponseListenerClazz}, c1562e.new b(new Object[]{runnable}));
            Object objM7880r = c1562e.m7880r(iAPProductType, list);
            if (objM7880r != null) {
                InAppPurchaseUtils.m7819e(c1562e.billingClientClazz, c1562e.queryProductDetailsAsyncMethod, c1562e.m7878p(), objM7880r, objNewProxyInstance);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7864c(C1562e c1562e, InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable) {
        if (lsb.m151554d(C1562e.class)) {
            return;
        }
        try {
            c1562e.getClass();
            iAPProductType.getClass();
            runnable.getClass();
            InAppPurchaseUtils.m7819e(c1562e.billingClientClazz, c1562e.queryPurchaseHistoryAsyncMethod, c1562e.m7878p(), c1562e.m7881s(iAPProductType), Proxy.newProxyInstance(c1562e.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{c1562e.purchaseHistoryResponseListenerClazz}, c1562e.new b(new Object[]{iAPProductType, runnable})));
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ Map m7865d() {
        if (lsb.m151554d(C1562e.class)) {
            return null;
        }
        try {
            return f6063Q;
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ C1562e m7866e() {
        if (lsb.m151554d(C1562e.class)) {
            return null;
        }
        try {
            return f6062P;
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ Map m7867f() {
        if (lsb.m151554d(C1562e.class)) {
            return null;
        }
        try {
            return f6065S;
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ Map m7868g() {
        if (lsb.m151554d(C1562e.class)) {
            return null;
        }
        try {
            return f6064R;
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ String m7869h() {
        if (lsb.m151554d(C1562e.class)) {
            return null;
        }
        try {
            return f6060N;
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ void m7870i(C1562e c1562e, Object[] objArr, Object[] objArr2) {
        if (lsb.m151554d(C1562e.class)) {
            return;
        }
        try {
            c1562e.m7882t(objArr, objArr2);
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ void m7871j(C1562e c1562e, Object[] objArr, Object[] objArr2) {
        if (lsb.m151554d(C1562e.class)) {
            return;
        }
        try {
            c1562e.m7883u(objArr, objArr2);
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ void m7872k(C1562e c1562e, Object[] objArr, Object[] objArr2) {
        if (lsb.m151554d(C1562e.class)) {
            return;
        }
        try {
            c1562e.m7884v(objArr, objArr2);
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ void m7873l(C1562e c1562e, Object[] objArr, Object[] objArr2) {
        if (lsb.m151554d(C1562e.class)) {
            return;
        }
        try {
            c1562e.m7885w(objArr, objArr2);
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ void m7874m(C1562e c1562e, Object[] objArr, Object[] objArr2) {
        if (lsb.m151554d(C1562e.class)) {
            return;
        }
        try {
            c1562e.m7886x(objArr, objArr2);
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ void m7875n(C1562e c1562e) {
        if (lsb.m151554d(C1562e.class)) {
            return;
        }
        try {
            f6062P = c1562e;
        } catch (Throwable th) {
            lsb.m151552b(th, C1562e.class);
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m7876o(Runnable runnable) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (f6061O.get()) {
                runnable.run();
            } else {
                m7877z(runnable);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: z */
    private final void m7877z(Runnable runnable) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            InAppPurchaseUtils.m7819e(this.billingClientClazz, this.billingClientStartConnectionMethod, m7878p(), Proxy.newProxyInstance(this.billingClientStateListenerClazz.getClassLoader(), new Class[]{this.billingClientStateListenerClazz}, new b(new Object[]{runnable})));
        } catch (Throwable th) {
            lsb.m151552b(th, this);
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
            m7876o(new Runnable() { // from class: l.wpm
                @Override // java.lang.Runnable
                public final void run() {
                    C1562e.m7864c(this.f187541a, productType, completionHandler);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public Object m7878p() {
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

    @Nullable
    /* JADX INFO: renamed from: q */
    public final String m7879q(@NotNull String productDetailsString) {
        List<String> listMo93364c;
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            productDetailsString.getClass();
            MatchResult matchResultFind$default = Regex.find$default(new Regex("jsonString='(.*?)'"), productDetailsString, 0, 2, null);
            if (matchResultFind$default == null || (listMo93364c = matchResultFind$default.mo93364c()) == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(listMo93364c, 1);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final Object m7880r(InAppPurchaseUtils.IAPProductType productType, List<String> productIds) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            if (productIds.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : productIds) {
                Object objM7819e = InAppPurchaseUtils.m7819e(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderBuildMethod, InAppPurchaseUtils.m7819e(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderSetProductTypeMethod, InAppPurchaseUtils.m7819e(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderSetProductIdMethod, InAppPurchaseUtils.m7819e(this.queryProductDetailsParamsProductClazz, this.queryProductDetailsParamsProductNewBuilderMethod, null, new Object[0]), str), productType.getType()), new Object[0]);
                if (objM7819e != null) {
                    arrayList.add(objM7819e);
                }
            }
            return InAppPurchaseUtils.m7819e(this.queryProductDetailsParamsBuilderClazz, this.queryProductDetailsParamsBuilderBuildMethod, InAppPurchaseUtils.m7819e(this.queryProductDetailsParamsBuilderClazz, this.queryProductDetailsParamsBuilderSetProductListMethod, InAppPurchaseUtils.m7819e(this.queryProductDetailsParamsClazz, this.queryProductDetailsParamsNewBuilderMethod, null, new Object[0]), arrayList), new Object[0]);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final Object m7881s(InAppPurchaseUtils.IAPProductType productType) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            return InAppPurchaseUtils.m7819e(this.queryPurchaseHistoryParamsBuilderClazz, this.queryPurchaseHistoryParamsBuilderBuildMethod, InAppPurchaseUtils.m7819e(this.queryPurchaseHistoryParamsBuilderClazz, this.queryPurchaseHistoryParamsBuilderSetProductTypeMethod, InAppPurchaseUtils.m7819e(this.queryPurchaseHistoryParamsClazz, this.queryPurchaseHistoryParamsNewBuilderMethod, null, new Object[0]), productType.getType()), new Object[0]);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m7882t(Object[] wrapperArgs, Object[] listenerArgs) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            f6061O.set(false);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7883u(Object[] wrapperArgs, Object[] listenerArgs) {
        Runnable runnable;
        if (lsb.m151554d(this) || listenerArgs == null) {
            return;
        }
        try {
            if (listenerArgs.length == 0) {
                return;
            }
            if (Intrinsics.m87488d(InAppPurchaseUtils.m7819e(this.billingResultClazz, this.billingResultGetResponseCodeMethod, listenerArgs[0], new Object[0]), 0)) {
                f6061O.set(true);
                if (wrapperArgs != null && wrapperArgs.length != 0) {
                    Object obj = wrapperArgs[0];
                    if (!(obj instanceof Runnable) || (runnable = (Runnable) obj) == null) {
                        return;
                    }
                    runnable.run();
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m7884v(Object[] wrapperArgs, Object[] listenerArgs) {
        Object orNull;
        String strM7879q;
        if (lsb.m151554d(this)) {
            return;
        }
        if (wrapperArgs != null) {
            try {
                orNull = ArraysKt.getOrNull(wrapperArgs, 0);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return;
            }
        } else {
            orNull = null;
        }
        Object orNull2 = listenerArgs != null ? ArraysKt.getOrNull(listenerArgs, 1) : null;
        if (orNull2 != null && (orNull2 instanceof List)) {
            Iterator it = ((List) orNull2).iterator();
            while (it.hasNext()) {
                try {
                    Object objM7819e = InAppPurchaseUtils.m7819e(this.productDetailsClazz, this.productDetailsToStringMethod, it.next(), new Object[0]);
                    String str = objM7819e instanceof String ? (String) objM7819e : null;
                    if (str != null && (strM7879q = m7879q(str)) != null) {
                        JSONObject jSONObject = new JSONObject(strM7879q);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            Map<String, JSONObject> map = f6065S;
                            string.getClass();
                            map.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (orNull == null || !(orNull instanceof Runnable)) {
                return;
            }
            ((Runnable) orNull).run();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m7885w(Object[] wrapperArgs, Object[] listenerArgs) {
        Object orNull;
        if (lsb.m151554d(this)) {
            return;
        }
        if (wrapperArgs != null) {
            try {
                orNull = ArraysKt.getOrNull(wrapperArgs, 0);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return;
            }
        } else {
            orNull = null;
        }
        if (orNull != null && (orNull instanceof InAppPurchaseUtils.IAPProductType)) {
            Object orNull2 = ArraysKt.getOrNull(wrapperArgs, 1);
            if (orNull2 instanceof Runnable) {
                Object orNull3 = listenerArgs != null ? ArraysKt.getOrNull(listenerArgs, 1) : null;
                if (orNull3 != null && (orNull3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) orNull3).iterator();
                    while (it.hasNext()) {
                        try {
                            Object objM7819e = InAppPurchaseUtils.m7819e(this.purchaseHistoryRecordClazz, this.purchaseHistoryRecordGetOriginalJsonMethod, it.next(), new Object[0]);
                            String str = objM7819e instanceof String ? (String) objM7819e : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!f6065S.containsKey(string)) {
                                        string.getClass();
                                        arrayList.add(string);
                                    }
                                    if (orNull == InAppPurchaseUtils.IAPProductType.INAPP) {
                                        Map<String, JSONObject> map = f6063Q;
                                        string.getClass();
                                        map.put(string, jSONObject);
                                    } else {
                                        Map<String, JSONObject> map2 = f6064R;
                                        string.getClass();
                                        map2.put(string, jSONObject);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((Runnable) orNull2).run();
                    } else {
                        m7887y((InAppPurchaseUtils.IAPProductType) orNull, arrayList, (Runnable) orNull2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m7886x(Object[] wrapperArgs, Object[] listenerArgs) {
        Object orNull;
        if (lsb.m151554d(this)) {
            return;
        }
        if (wrapperArgs != null) {
            try {
                orNull = ArraysKt.getOrNull(wrapperArgs, 0);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return;
            }
        } else {
            orNull = null;
        }
        if (orNull != null && (orNull instanceof InAppPurchaseUtils.IAPProductType)) {
            Object orNull2 = ArraysKt.getOrNull(wrapperArgs, 1);
            if (orNull2 instanceof Runnable) {
                Object orNull3 = listenerArgs != null ? ArraysKt.getOrNull(listenerArgs, 1) : null;
                if (orNull3 != null && (orNull3 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) orNull3).iterator();
                    while (it.hasNext()) {
                        Object objM7819e = InAppPurchaseUtils.m7819e(this.purchaseClazz, this.purchaseGetOriginalJsonMethod, it.next(), new Object[0]);
                        String str = objM7819e instanceof String ? (String) objM7819e : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                if (!f6065S.containsKey(string)) {
                                    string.getClass();
                                    arrayList.add(string);
                                }
                                if (orNull == InAppPurchaseUtils.IAPProductType.INAPP) {
                                    Map<String, JSONObject> map = f6063Q;
                                    string.getClass();
                                    map.put(string, jSONObject);
                                } else {
                                    Map<String, JSONObject> map2 = f6064R;
                                    string.getClass();
                                    map2.put(string, jSONObject);
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ((Runnable) orNull2).run();
                    } else {
                        m7887y((InAppPurchaseUtils.IAPProductType) orNull, arrayList, (Runnable) orNull2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m7887y(final InAppPurchaseUtils.IAPProductType productType, final List<String> productIds, final Runnable completionHandler) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m7876o(new Runnable() { // from class: l.xpm
                @Override // java.lang.Runnable
                public final void run() {
                    C1562e.m7863b(this.f193933a, completionHandler, productType, productIds);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    public /* synthetic */ C1562e(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, cls16, cls17, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21);
    }
}
