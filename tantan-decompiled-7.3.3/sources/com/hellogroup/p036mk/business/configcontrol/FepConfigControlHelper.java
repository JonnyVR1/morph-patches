package com.hellogroup.p036mk.business.configcontrol;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p153l.e7e;
import p153l.jzv;
import p153l.sjw;
import p153l.xjw;
import p153l.yfi;
import p153l.yym;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R!\u0010\u0013\u001a\u00020\n8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u0018\u001a\u00020\n8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0016\u0010\u0014R!\u0010\u001a\u001a\u00020\n8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\u0014R!\u0010\u001e\u001a\u00020\n8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\u0014R\u001b\u0010!\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0019\u0010 ¨\u0006\""}, m88121d2 = {"Lcom/hellogroup/mk/business/configcontrol/FepConfigControlHelper;", "", "<init>", "()V", "", "jsonStr", "defaultValue", "e", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "url", "", "c", "(Ljava/lang/String;)Z", "host", "b", "a", "Ljava/lang/String;", "TAG", "Lkotlin/Lazy;", "isAndroidDisableJsLocationReplace", "()Z", "isAndroidDisableJsLocationReplace$annotations", "f", "isAndroidUseNewCleanWebview$annotations", "isAndroidUseNewCleanWebview", Constants.INAPP_DATA_TAG, "isAndroidDisableCheckUrlOnNewCleanWebview", "isAndroidDisableCheckUrlOnNewCleanWebview$annotations", "g", "isUseDnsDefaultWhiteHosts$annotations", "isUseDnsDefaultWhiteHosts", "Ll/e7e;", "()Ll/e7e;", "mkDefaultWhiteHosts", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class FepConfigControlHelper {
    public static final FepConfigControlHelper INSTANCE = new FepConfigControlHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "FepConfigControlHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy isAndroidDisableJsLocationReplace = LazyKt__LazyJVMKt.m88118b(new Function0<Boolean>() { // from class: com.hellogroup.mk.business.configcontrol.FepConfigControlHelper$isAndroidDisableJsLocationReplace$2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            int iM215592h = yfi.m215592h();
            return iM215592h > 0 && C15274a.m88495k(new IntRange(1, 100), Random.INSTANCE) <= iM215592h;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy isAndroidUseNewCleanWebview = LazyKt__LazyJVMKt.m88118b(new Function0<Boolean>() { // from class: com.hellogroup.mk.business.configcontrol.FepConfigControlHelper$isAndroidUseNewCleanWebview$2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            int iM215593i = yfi.m215593i();
            return iM215593i > 0 && C15274a.m88495k(new IntRange(1, 100), Random.INSTANCE) <= iM215593i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy isAndroidDisableCheckUrlOnNewCleanWebview = LazyKt__LazyJVMKt.m88118b(new Function0<Boolean>() { // from class: com.hellogroup.mk.business.configcontrol.FepConfigControlHelper$isAndroidDisableCheckUrlOnNewCleanWebview$2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            int iM215591g = yfi.m215591g();
            return iM215591g > 0 && C15274a.m88495k(new IntRange(1, 100), Random.INSTANCE) <= iM215591g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy isUseDnsDefaultWhiteHosts = LazyKt__LazyJVMKt.m88118b(new Function0<Boolean>() { // from class: com.hellogroup.mk.business.configcontrol.FepConfigControlHelper$isUseDnsDefaultWhiteHosts$2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            int iM215601q = yfi.m215601q();
            return iM215601q > 0 && C15274a.m88495k(new IntRange(1, 100), Random.INSTANCE) <= iM215601q;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final Lazy mkDefaultWhiteHosts = LazyKt__LazyJVMKt.m88118b(new Function0<e7e>() { // from class: com.hellogroup.mk.business.configcontrol.FepConfigControlHelper$mkDefaultWhiteHosts$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final e7e invoke() {
            try {
                JSONArray jSONArray = new JSONArray(yfi.m215596l());
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strOptString = jSONArray.optString(i, "");
                    if (strOptString != null && strOptString.length() != 0) {
                        arrayList.add(strOptString);
                    }
                }
                return new e7e(arrayList);
            } catch (Exception e) {
                FepConfigControlHelper fepConfigControlHelper = FepConfigControlHelper.INSTANCE;
                jzv.m147729b(FepConfigControlHelper.TAG, "getMKDnsDefaultWhiteHosts error: " + e.getMessage());
                return new e7e(CollectionsKt.emptyList());
            }
        }
    });

    private FepConfigControlHelper() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m18021b(@Nullable String host) {
        if (host != null && host.length() != 0) {
            if (!m18026g()) {
                return xjw.m211265a().m211269e(host);
            }
            yym yymVarM186318g = sjw.m186318g();
            if ((yymVarM186318g != null && yymVarM186318g.m217997a(host)) || INSTANCE.m18023d().m119705a(host)) {
                return true;
            }
            try {
                String[] strArrM211267c = xjw.m211265a().m211267c(host, false);
                strArrM211267c.getClass();
                ArrayList arrayList = new ArrayList();
                for (String str : strArrM211267c) {
                    if (str != null && str.length() != 0 && !Intrinsics.m88377d(str, host)) {
                        arrayList.add(str);
                    }
                }
                return !arrayList.isEmpty();
            } catch (Exception e) {
                jzv.m147729b(TAG, "checkWebDnsEnabled error: " + e.getMessage());
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m18022c(@Nullable String url) {
        return m18021b(sjw.m186317f(url));
    }

    /* JADX INFO: renamed from: d */
    private final e7e m18023d() {
        return (e7e) mkDefaultWhiteHosts.getValue();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m18024e(@Nullable String jsonStr, @NotNull String defaultValue) {
        defaultValue.getClass();
        if (jsonStr != null && jsonStr.length() != 0) {
            try {
                new JSONArray(jsonStr);
                return jsonStr;
            } catch (Exception e) {
                jzv.m147729b(TAG, "getSafeJsonString error: " + e.getMessage());
            }
        }
        return defaultValue;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m18025f() {
        return ((Boolean) isAndroidUseNewCleanWebview.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m18026g() {
        return ((Boolean) isUseDnsDefaultWhiteHosts.getValue()).booleanValue();
    }
}
