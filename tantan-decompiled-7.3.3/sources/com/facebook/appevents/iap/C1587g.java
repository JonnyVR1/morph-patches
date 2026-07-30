package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.appevents.C1578g;
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
import p153l.asm;
import p153l.qrm;
import p153l.vj1;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.appevents.iap.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJM\u0010\u0018\u001a\u0004\u0018\u00010\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$RB\u0010(\u001a0\u0012\u0004\u0012\u00020\u000e\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\u00140&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'RB\u0010)\u001a0\u0012\u0004\u0012\u00020\u000e\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\u00140&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Lcom/facebook/appevents/iap/g;", "", "<init>", "()V", "", "a", "h", "", WBConstants.AUTH_PARAMS_VERSION, "g", "(Ljava/lang/String;)V", "e", "()Ljava/lang/String;", "", "Ll/qrm;", "purchases", "", "time", "", "isImplicitlyLogged", "Lkotlin/Pair;", "Landroid/os/Bundle;", "Lcom/facebook/appevents/g;", "purchaseParameters", "f", "(Ljava/util/List;JZLjava/util/List;)Landroid/os/Bundle;", "newPurchaseParameters", "newPurchaseOperationalData", "oldPurchaseParameters", "oldPurchaseOperationalData", "dedupingWithImplicitlyLoggedHistory", "withTestDedupeKeys", "c", "(Landroid/os/Bundle;Lcom/facebook/appevents/g;Landroid/os/Bundle;Lcom/facebook/appevents/g;ZZ)Ljava/lang/String;", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "b", "()Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "timesOfManualPurchases", "timesOfImplicitPurchases", "Ljava/lang/String;", "specificBillingLibraryVersion", "Ljava/util/concurrent/atomic/AtomicBoolean;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1587g {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static String specificBillingLibraryVersion;

    @NotNull
    public static final C1587g INSTANCE = new C1587g();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<qrm, List<Pair<Long, Pair<Bundle, C1578g>>>> timesOfManualPurchases = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<qrm, List<Pair<Long, Pair<Bundle, C1578g>>>> timesOfImplicitPurchases = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.facebook.appevents.iap.g$a */
    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6148a;

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
            f6148a = iArr;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m7957a() {
        if (ztb.m221490d(C1587g.class)) {
            return;
        }
        try {
            if (!vj1.m201431g()) {
                C1586f.m7953i();
            } else {
                enabled.set(true);
                m7962h();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1587g.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m7958d(C1587g c1587g, Bundle bundle, C1578g c1578g, Bundle bundle2, C1578g c1578g2, boolean z, boolean z2, int i, Object obj) {
        if (ztb.m221490d(C1587g.class)) {
            return null;
        }
        try {
            return c1587g.m7964c(bundle, c1578g, bundle2, c1578g2, z, (i & 32) != 0 ? false : z2);
        } catch (Throwable th) {
            ztb.m221488b(th, C1587g.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m7959e() {
        if (ztb.m221490d(C1587g.class)) {
            return null;
        }
        try {
            return specificBillingLibraryVersion;
        } catch (Throwable th) {
            ztb.m221488b(th, C1587g.class);
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
    public static final synchronized Bundle m7960f(@NotNull List<qrm> purchases, long time, boolean isImplicitlyLogged, @NotNull List<Pair<Bundle, C1578g>> purchaseParameters) {
        Bundle bundle;
        ?? r5;
        ?? ValueOf;
        ?? M7958d;
        boolean z;
        Bundle bundle2 = null;
        if (ztb.m221490d(C1587g.class)) {
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
                qrm qrmVar = purchases.get(i);
                Pair<Bundle, C1578g> pair = purchaseParameters.get(i);
                Bundle bundleComponent1 = pair.component1();
                C1578g c1578gComponent2 = pair.component2();
                bundle = bundle2;
                try {
                    int i2 = i;
                    qrm qrmVar2 = new qrm(qrmVar.getEventName(), new BigDecimal(String.valueOf(qrmVar.getAmount())).setScale(2, RoundingMode.HALF_UP).doubleValue(), qrmVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY java.lang.String());
                    List<Pair<Long, Pair<Bundle, C1578g>>> list = isImplicitlyLogged ? timesOfManualPurchases.get(qrmVar2) : timesOfImplicitPurchases.get(qrmVar2);
                    List<Pair<Long, Pair<Bundle, C1578g>>> list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        r5 = bundle;
                        ValueOf = r5;
                        M7958d = ValueOf;
                        z = false;
                    } else {
                        r5 = bundle;
                        ValueOf = r5;
                        M7958d = ValueOf;
                        z = false;
                        for (Pair<Long, Pair<Bundle, C1578g>> pair2 : list) {
                            long jLongValue = pair2.getFirst().longValue();
                            Pair<Bundle, C1578g> second = pair2.getSecond();
                            Bundle bundleComponent2 = second.component1();
                            C1578g c1578gComponent3 = second.component2();
                            if (Math.abs(time - jLongValue) <= asm.INSTANCE.m99946e() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                                C1587g c1587g = INSTANCE;
                                M7958d = m7958d(c1587g, bundleComponent1, c1578gComponent2, bundleComponent2, c1578gComponent3, !isImplicitlyLogged, false, 32, null);
                                String strM7964c = c1587g.m7964c(bundleComponent1, c1578gComponent2, bundleComponent2, c1578gComponent3, !isImplicitlyLogged, true);
                                r5 = r5;
                                if (strM7964c != null) {
                                    r5 = strM7964c;
                                }
                                if (M7958d != 0) {
                                    ValueOf = Long.valueOf(jLongValue);
                                    arrayList.add(new Pair(qrmVar2, Long.valueOf(jLongValue)));
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
                        bundle3.putString("fb_iap_actual_dedup_key_used", M7958d);
                    }
                    if (isImplicitlyLogged && !z) {
                        ConcurrentHashMap<qrm, List<Pair<Long, Pair<Bundle, C1578g>>>> concurrentHashMap = timesOfImplicitPurchases;
                        if (concurrentHashMap.get(qrmVar2) == null) {
                            concurrentHashMap.put(qrmVar2, new ArrayList());
                        }
                        List<Pair<Long, Pair<Bundle, C1578g>>> list3 = concurrentHashMap.get(qrmVar2);
                        if (list3 != null) {
                            list3.add(new Pair<>(Long.valueOf(time), new Pair(bundleComponent1, c1578gComponent2)));
                        }
                    } else if (!isImplicitlyLogged && !z) {
                        ConcurrentHashMap<qrm, List<Pair<Long, Pair<Bundle, C1578g>>>> concurrentHashMap2 = timesOfManualPurchases;
                        if (concurrentHashMap2.get(qrmVar2) == null) {
                            concurrentHashMap2.put(qrmVar2, new ArrayList());
                        }
                        List<Pair<Long, Pair<Bundle, C1578g>>> list4 = concurrentHashMap2.get(qrmVar2);
                        if (list4 != null) {
                            list4.add(new Pair<>(Long.valueOf(time), new Pair(bundleComponent1, c1578gComponent2)));
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
                List<Pair<Long, Pair<Bundle, C1578g>>> list5 = isImplicitlyLogged ? timesOfManualPurchases.get(pair3.getFirst()) : timesOfImplicitPurchases.get(pair3.getFirst());
                if (list5 != null) {
                    Iterator<Pair<Long, Pair<Bundle, C1578g>>> it = list5.iterator();
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
                            timesOfManualPurchases.put((qrm) pair3.getFirst(), list5);
                        }
                    } else if (list5.isEmpty()) {
                        timesOfImplicitPurchases.remove(pair3.getFirst());
                    } else {
                        timesOfImplicitPurchases.put((qrm) pair3.getFirst(), list5);
                    }
                }
            }
            return bundle3;
        } catch (Throwable th2) {
            th = th2;
            bundle = bundle2;
        }
        ztb.m221488b(th, C1587g.class);
        return bundle;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7961g(String version) {
        if (ztb.m221490d(C1587g.class)) {
            return;
        }
        try {
            specificBillingLibraryVersion = version;
        } catch (Throwable th) {
            ztb.m221488b(th, C1587g.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m7962h() {
        if (ztb.m221490d(C1587g.class)) {
            return;
        }
        try {
            if (enabled.get()) {
                InAppPurchaseUtils.BillingClientVersion billingClientVersionM7963b = INSTANCE.m7963b();
                int i = a.f6148a[billingClientVersionM7963b.ordinal()];
                if (i == 2) {
                    C1581a.m7878g(InAppPurchaseUtils.BillingClientVersion.V1);
                    return;
                }
                if (i != 3) {
                    if (i == 4 && FeatureManager.m8733g(FeatureManager.Feature.IapLoggingLib5To7)) {
                        C1582b.m7887e(C1600c.m8101l(), billingClientVersionM7963b);
                        return;
                    }
                    return;
                }
                if (FeatureManager.m8733g(FeatureManager.Feature.IapLoggingLib2)) {
                    C1582b.m7887e(C1600c.m8101l(), billingClientVersionM7963b);
                } else {
                    C1581a.m7878g(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                }
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1587g.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InAppPurchaseUtils.BillingClientVersion m7963b() {
        try {
            if (ztb.m221490d(this)) {
                return null;
            }
            try {
                Context contextM8101l = C1600c.m8101l();
                ApplicationInfo applicationInfo = contextM8101l.getPackageManager().getApplicationInfo(contextM8101l.getPackageName(), 128);
                applicationInfo.getClass();
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return InAppPurchaseUtils.BillingClientVersion.NONE;
                }
                List listSplit$default = StringsKt.split$default(string, new String[]{"."}, false, 3, 2, null);
                if (string.length() == 0) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                m7961g("GPBL.".concat(string));
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
            ztb.m221488b(th, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m7964c(@Nullable Bundle newPurchaseParameters, @Nullable C1578g newPurchaseOperationalData, @Nullable Bundle oldPurchaseParameters, @Nullable C1578g oldPurchaseOperationalData, boolean dedupingWithImplicitlyLoggedHistory, boolean withTestDedupeKeys) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            List<Pair<String, List<String>>> listM99947f = withTestDedupeKeys ? asm.INSTANCE.m99947f(dedupingWithImplicitlyLoggedHistory) : asm.INSTANCE.m99945d(dedupingWithImplicitlyLoggedHistory);
            if (listM99947f == null) {
                return null;
            }
            for (Pair<String, List<String>> pair : listM99947f) {
                Object objM7848c = C1578g.INSTANCE.m7848c(OperationalDataEnum.IAPParameters, pair.getFirst(), newPurchaseParameters, newPurchaseOperationalData);
                String str = objM7848c instanceof String ? (String) objM7848c : null;
                if (str != null && str.length() != 0) {
                    for (String str2 : pair.getSecond()) {
                        Object objM7848c2 = C1578g.INSTANCE.m7848c(OperationalDataEnum.IAPParameters, str2, oldPurchaseParameters, oldPurchaseOperationalData);
                        String str3 = objM7848c2 instanceof String ? (String) objM7848c2 : null;
                        if (str3 != null && str3.length() != 0 && Intrinsics.m88377d(str3, str)) {
                            return dedupingWithImplicitlyLoggedHistory ? pair.getFirst() : str2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }
}
