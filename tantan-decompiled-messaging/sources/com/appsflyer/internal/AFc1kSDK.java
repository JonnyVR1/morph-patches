package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\rR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, m87232d2 = {"Lcom/appsflyer/internal/AFc1kSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFc1oSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFc1oSDK;)V", "", "AFAdRevenueData", "(Ljava/lang/String;)Z", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/util/Map;", "getCurrencyIso4217Code", "getRevenue", "Lcom/appsflyer/internal/AFc1oSDK;", "getMediationNetwork", "AFa1vSDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final class AFc1kSDK {

    /* JADX INFO: renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @Nullable
    public final AFc1oSDK getMediationNetwork;

    public /* synthetic */ AFc1kSDK(Map map, AFc1oSDK aFc1oSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFc1oSDK);
    }

    @JvmStatic
    @NotNull
    public static final AFc1kSDK getCurrencyIso4217Code(@NotNull AFa1mSDK aFa1mSDK) {
        return Companion.getRevenue(aFa1mSDK);
    }

    @JvmStatic
    @NotNull
    public static final AFc1kSDK getRevenue(@NotNull AFc1oSDK aFc1oSDK) {
        return Companion.AFAdRevenueData(aFc1oSDK);
    }

    public final void AFAdRevenueData(@NotNull String p0, @Nullable Object p1) {
        p0.getClass();
        this.getCurrencyIso4217Code.put(p0, p1);
        AFc1oSDK aFc1oSDK = this.getMediationNetwork;
        if (aFc1oSDK != null) {
            aFc1oSDK.getMediationNetwork(this.getCurrencyIso4217Code);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1kSDK$AFa1vSDK, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, m87232d2 = {"Lcom/appsflyer/internal/AFc1kSDK$AFa1vSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFa1mSDK;", "p0", "Lcom/appsflyer/internal/AFc1kSDK;", "getRevenue", "(Lcom/appsflyer/internal/AFa1mSDK;)Lcom/appsflyer/internal/AFc1kSDK;", "Lcom/appsflyer/internal/AFc1oSDK;", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFc1oSDK;)Lcom/appsflyer/internal/AFc1kSDK;"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public static AFc1kSDK AFAdRevenueData(@NotNull AFc1oSDK p0) {
            p0.getClass();
            return new AFc1kSDK(new LinkedHashMap(), p0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public static AFc1kSDK getRevenue(@NotNull AFa1mSDK p0) {
            p0.getClass();
            Map<String, Object> revenue = p0.getRevenue();
            revenue.getClass();
            return new AFc1kSDK(revenue, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFc1kSDK(Map<String, Object> map, AFc1oSDK aFc1oSDK) {
        this.getCurrencyIso4217Code = map;
        this.getMediationNetwork = aFc1oSDK;
    }

    public /* synthetic */ AFc1kSDK(Map map, AFc1oSDK aFc1oSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1oSDK);
    }

    public final boolean AFAdRevenueData(@NotNull String p0) {
        p0.getClass();
        return this.getCurrencyIso4217Code.containsKey(p0);
    }
}
