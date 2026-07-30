package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.C1555g;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.internal.FeatureManager;
import com.sina.weibo.sdk.constant.WBConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.lsb;
import p149l.oj1;
import p149l.opm;
import p149l.ypm;

/* JADX INFO: renamed from: com.facebook.appevents.iap.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJM\u0010\u0018\u001a\u0004\u0018\u00010\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$RB\u0010(\u001a0\u0012\u0004\u0012\u00020\u000e\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\u00140&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'RB\u0010)\u001a0\u0012\u0004\u0012\u00020\u000e\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\u00140&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Lcom/facebook/appevents/iap/g;", "", "<init>", "()V", "", "a", "h", "", WBConstants.AUTH_PARAMS_VERSION, "g", "(Ljava/lang/String;)V", "e", "()Ljava/lang/String;", "", "Ll/opm;", "purchases", "", "time", "", "isImplicitlyLogged", "Lkotlin/Pair;", "Landroid/os/Bundle;", "Lcom/facebook/appevents/g;", "purchaseParameters", "f", "(Ljava/util/List;JZLjava/util/List;)Landroid/os/Bundle;", "newPurchaseParameters", "newPurchaseOperationalData", "oldPurchaseParameters", "oldPurchaseOperationalData", "dedupingWithImplicitlyLoggedHistory", "withTestDedupeKeys", "c", "(Landroid/os/Bundle;Lcom/facebook/appevents/g;Landroid/os/Bundle;Lcom/facebook/appevents/g;ZZ)Ljava/lang/String;", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "b", "()Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "timesOfManualPurchases", "timesOfImplicitPurchases", "Ljava/lang/String;", "specificBillingLibraryVersion", "Ljava/util/concurrent/atomic/AtomicBoolean;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1564g {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static String specificBillingLibraryVersion;

    @NotNull
    public static final C1564g INSTANCE = new C1564g();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<opm, List<Pair<Long, Pair<Bundle, C1555g>>>> timesOfManualPurchases = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<opm, List<Pair<Long, Pair<Bundle, C1555g>>>> timesOfImplicitPurchases = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.facebook.appevents.iap.g$a */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6111a;

        static {
            int[] iArr = new int[InAppPurchaseUtils.BillingClientVersion.values().length];
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6111a = iArr;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m7903a() {
        if (lsb.m151554d(C1564g.class)) {
            return;
        }
        try {
            if (!oj1.m164591g()) {
                C1563f.m7899i();
            } else {
                enabled.set(true);
                m7908h();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1564g.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m7904d(C1564g c1564g, Bundle bundle, C1555g c1555g, Bundle bundle2, C1555g c1555g2, boolean z, boolean z2, int i, Object obj) {
        if (lsb.m151554d(C1564g.class)) {
            return null;
        }
        try {
            return c1564g.m7910c(bundle, c1555g, bundle2, c1555g2, z, (i & 32) != 0 ? false : z2);
        } catch (Throwable th) {
            lsb.m151552b(th, C1564g.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m7905e() {
        if (lsb.m151554d(C1564g.class)) {
            return null;
        }
        try {
            return specificBillingLibraryVersion;
        } catch (Throwable th) {
            lsb.m151552b(th, C1564g.class);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final synchronized Bundle m7906f(@NotNull List<opm> purchases, long time, boolean isImplicitlyLogged, @NotNull List<Pair<Bundle, C1555g>> purchaseParameters) {
        Bundle bundle;
        ?? r5;
        ?? ValueOf;
        ?? M7904d;
        boolean z;
        Bundle bundle2 = null;
        if (lsb.m151554d(C1564g.class)) {
            return null;
        }
        try {
            purchases.getClass();
            purchaseParameters.getClass();
            if (purchaseParameters.isEmpty()) {
                return null;
            }
            if (purchases.size() != purchaseParameters.size()) {
                return null;
            }
            ArrayList<Pair> arrayList = new ArrayList();
            int size = purchases.size();
            ?? bundle3 = 0;
            int i = 0;
            while (i < size) {
                opm opmVar = purchases.get(i);
                Pair<Bundle, C1555g> pair = purchaseParameters.get(i);
                Bundle bundleComponent1 = pair.component1();
                C1555g c1555gComponent2 = pair.component2();
                bundle = bundle2;
                try {
                    int i2 = i;
                    opm opmVar2 = new opm(opmVar.getEventName(), new BigDecimal(String.valueOf(opmVar.getAmount())).setScale(2, RoundingMode.HALF_UP).doubleValue(), opmVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String());
                    List<Pair<Long, Pair<Bundle, C1555g>>> list = isImplicitlyLogged ? timesOfManualPurchases.get(opmVar2) : timesOfImplicitPurchases.get(opmVar2);
                    List<Pair<Long, Pair<Bundle, C1555g>>> list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        r5 = bundle;
                        ValueOf = r5;
                        M7904d = ValueOf;
                        z = false;
                    } else {
                        r5 = bundle;
                        ValueOf = r5;
                        M7904d = ValueOf;
                        z = false;
                        for (Pair<Long, Pair<Bundle, C1555g>> pair2 : list) {
                            long jLongValue = pair2.getFirst().longValue();
                            Pair<Bundle, C1555g> second = pair2.getSecond();
                            Bundle bundleComponent2 = second.component1();
                            C1555g c1555gComponent3 = second.component2();
                            if (Math.abs(time - jLongValue) <= ypm.INSTANCE.m215645e() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                                C1564g c1564g = INSTANCE;
                                M7904d = m7904d(c1564g, bundleComponent1, c1555gComponent2, bundleComponent2, c1555gComponent3, !isImplicitlyLogged, false, 32, null);
                                String strM7910c = c1564g.m7910c(bundleComponent1, c1555gComponent2, bundleComponent2, c1555gComponent3, !isImplicitlyLogged, true);
                                r5 = r5;
                                if (strM7910c != null) {
                                    r5 = strM7910c;
                                }
                                if (M7904d != 0) {
                                    ValueOf = Long.valueOf(jLongValue);
                                    arrayList.add(new Pair(opmVar2, Long.valueOf(jLongValue)));
                                    z = true;
                                }
                            }
                        }
                    }
                    if (r5 != 0) {
                        if (bundle3 == 0) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putString("fb_iap_test_dedup_result", "1");
                        bundle3.putString("fb_iap_test_dedup_key_used", r5);
                    }
                    if (z) {
                        if (bundle3 == 0) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putString("fb_iap_non_deduped_event_time", String.valueOf(ValueOf != 0 ? ValueOf.longValue() / 1000 : 0L));
                        bundle3.putString("fb_iap_actual_dedup_result", "1");
                        bundle3.putString("fb_iap_actual_dedup_key_used", M7904d);
                    }
                    if (isImplicitlyLogged && !z) {
                        ConcurrentHashMap<opm, List<Pair<Long, Pair<Bundle, C1555g>>>> concurrentHashMap = timesOfImplicitPurchases;
                        if (concurrentHashMap.get(opmVar2) == null) {
                            concurrentHashMap.put(opmVar2, new ArrayList());
                        }
                        List<Pair<Long, Pair<Bundle, C1555g>>> list3 = concurrentHashMap.get(opmVar2);
                        if (list3 != null) {
                            list3.add(new Pair<>(Long.valueOf(time), new Pair(bundleComponent1, c1555gComponent2)));
                        }
                    } else if (!isImplicitlyLogged && !z) {
                        ConcurrentHashMap<opm, List<Pair<Long, Pair<Bundle, C1555g>>>> concurrentHashMap2 = timesOfManualPurchases;
                        if (concurrentHashMap2.get(opmVar2) == null) {
                            concurrentHashMap2.put(opmVar2, new ArrayList());
                        }
                        List<Pair<Long, Pair<Bundle, C1555g>>> list4 = concurrentHashMap2.get(opmVar2);
                        if (list4 != null) {
                            list4.add(new Pair<>(Long.valueOf(time), new Pair(bundleComponent1, c1555gComponent2)));
                        }
                    }
                    i = i2 + 1;
                    bundle2 = bundle;
                    bundle3 = bundle3;
                } catch (Throwable th) {
                    th = th;
                }
            }
            bundle = bundle2;
            for (Pair pair3 : arrayList) {
                List<Pair<Long, Pair<Bundle, C1555g>>> list5 = isImplicitlyLogged ? timesOfManualPurchases.get(pair3.getFirst()) : timesOfImplicitPurchases.get(pair3.getFirst());
                if (list5 != null) {
                    Iterator<Pair<Long, Pair<Bundle, C1555g>>> it = list5.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        int i4 = i3 + 1;
                        if (it.next().getFirst().longValue() == ((Number) pair3.getSecond()).longValue()) {
                            list5.remove(i3);
                            break;
                        }
                        i3 = i4;
                    }
                    if (isImplicitlyLogged) {
                        if (list5.isEmpty()) {
                            timesOfManualPurchases.remove(pair3.getFirst());
                        } else {
                            timesOfManualPurchases.put((opm) pair3.getFirst(), list5);
                        }
                    } else if (list5.isEmpty()) {
                        timesOfImplicitPurchases.remove(pair3.getFirst());
                    } else {
                        timesOfImplicitPurchases.put((opm) pair3.getFirst(), list5);
                    }
                }
            }
            return bundle3;
        } catch (Throwable th2) {
            th = th2;
            bundle = bundle2;
        }
        lsb.m151552b(th, C1564g.class);
        return bundle;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7907g(String version) {
        if (lsb.m151554d(C1564g.class)) {
            return;
        }
        try {
            specificBillingLibraryVersion = version;
        } catch (Throwable th) {
            lsb.m151552b(th, C1564g.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m7908h() {
        if (lsb.m151554d(C1564g.class)) {
            return;
        }
        try {
            if (enabled.get()) {
                InAppPurchaseUtils.BillingClientVersion billingClientVersionM7909b = INSTANCE.m7909b();
                int i = a.f6111a[billingClientVersionM7909b.ordinal()];
                if (i == 2) {
                    C1558a.m7824g(InAppPurchaseUtils.BillingClientVersion.V1);
                    return;
                }
                if (i != 3) {
                    if (i == 4 && FeatureManager.m8679g(FeatureManager.Feature.IapLoggingLib5To7)) {
                        C1559b.m7833e(C1577c.m8047l(), billingClientVersionM7909b);
                        return;
                    }
                    return;
                }
                if (FeatureManager.m8679g(FeatureManager.Feature.IapLoggingLib2)) {
                    C1559b.m7833e(C1577c.m8047l(), billingClientVersionM7909b);
                } else {
                    C1558a.m7824g(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1564g.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InAppPurchaseUtils.BillingClientVersion m7909b() {
        try {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                Context contextM8047l = C1577c.m8047l();
                ApplicationInfo applicationInfo = contextM8047l.getPackageManager().getApplicationInfo(contextM8047l.getPackageName(), 128);
                applicationInfo.getClass();
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return InAppPurchaseUtils.BillingClientVersion.NONE;
                }
                List listSplit$default = StringsKt.split$default(string, new String[]{"."}, false, 3, 2, null);
                if (string.length() == 0) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                m7907g("GPBL.".concat(string));
                Integer intOrNull = StringsKt.toIntOrNull((String) listSplit$default.get(0));
                if (intOrNull == null) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                int iIntValue = intOrNull.intValue();
                if (iIntValue == 1) {
                    return InAppPurchaseUtils.BillingClientVersion.V1;
                }
                return iIntValue < 5 ? InAppPurchaseUtils.BillingClientVersion.V2_V4 : InAppPurchaseUtils.BillingClientVersion.V5_V7;
            } catch (Exception unused) {
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m7910c(@Nullable Bundle newPurchaseParameters, @Nullable C1555g newPurchaseOperationalData, @Nullable Bundle oldPurchaseParameters, @Nullable C1555g oldPurchaseOperationalData, boolean dedupingWithImplicitlyLoggedHistory, boolean withTestDedupeKeys) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            List<Pair<String, List<String>>> listM215646f = withTestDedupeKeys ? ypm.INSTANCE.m215646f(dedupingWithImplicitlyLoggedHistory) : ypm.INSTANCE.m215644d(dedupingWithImplicitlyLoggedHistory);
            if (listM215646f == null) {
                return null;
            }
            for (Pair<String, List<String>> pair : listM215646f) {
                Object objM7794c = C1555g.INSTANCE.m7794c(OperationalDataEnum.IAPParameters, pair.getFirst(), newPurchaseParameters, newPurchaseOperationalData);
                String str = objM7794c instanceof String ? (String) objM7794c : null;
                if (str != null && str.length() != 0) {
                    for (String str2 : pair.getSecond()) {
                        Object objM7794c2 = C1555g.INSTANCE.m7794c(OperationalDataEnum.IAPParameters, str2, oldPurchaseParameters, oldPurchaseOperationalData);
                        String str3 = objM7794c2 instanceof String ? (String) objM7794c2 : null;
                        if (str3 != null && str3.length() != 0 && Intrinsics.m87488d(str3, str)) {
                            return dedupingWithImplicitlyLoggedHistory ? pair.getFirst() : str2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }
}
