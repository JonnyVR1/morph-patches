package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\t\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, m88121d2 = {"Lcom/appsflyer/internal/AFg1vSDK;", "", "Lcom/appsflyer/internal/AFd1pSDK;", "p0", "Lcom/appsflyer/internal/AFg1tSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1pSDK;Lcom/appsflyer/internal/AFg1tSDK;)V", "", "getCurrencyIso4217Code", "()J", "", "getMediationNetwork", "()Z", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFd1pSDK;", "getRevenue", "Lkotlin/Lazy;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFg1tSDK;", "AFa1uSDK"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final class AFg1vSDK {
    private static final long getMediationNetwork = 86400;

    @NotNull
    private final AFg1tSDK AFAdRevenueData;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private final Lazy getRevenue;

    @NotNull
    private final AFd1pSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final Lazy getCurrencyIso4217Code;

    public AFg1vSDK(@NotNull AFd1pSDK aFd1pSDK, @NotNull AFg1tSDK aFg1tSDK) {
        aFd1pSDK.getClass();
        aFg1tSDK.getClass();
        this.getMonetizationNetwork = aFd1pSDK;
        this.AFAdRevenueData = aFg1tSDK;
        this.getCurrencyIso4217Code = LazyKt__LazyJVMKt.m88118b(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFg1vSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFg1vSDK.this.getMonetizationNetwork.getRevenue("com.appsflyer.rc.sandbox")));
            }
        });
        this.getRevenue = LazyKt__LazyJVMKt.m88118b(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFg1vSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFg1vSDK.this.getMonetizationNetwork.getRevenue("com.appsflyer.rc.staging")));
            }
        });
    }

    @JvmName
    public final boolean AFAdRevenueData() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    public final long getCurrencyIso4217Code() {
        Object objM225066constructorimpl;
        String revenue = this.getMonetizationNetwork.getRevenue("com.appsflyer.rc.cache.max-age-fallback");
        if (revenue == null) {
            return getMediationNetwork;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(Long.valueOf(Long.parseLong(revenue)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
        if (thM225069exceptionOrNullimpl != null) {
            StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb.append(thM225069exceptionOrNullimpl.getMessage());
            AFLogger.afErrorLog(sb.toString(), thM225069exceptionOrNullimpl);
            objM225066constructorimpl = Long.valueOf(getMediationNetwork);
        }
        return ((Number) objM225066constructorimpl).longValue();
    }

    public final boolean getMediationNetwork() {
        AFi1zSDK aFi1zSDK;
        AFh1aSDK aFh1aSDK = this.AFAdRevenueData.getCurrencyIso4217Code;
        if (aFh1aSDK == null) {
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1bSDK aFh1bSDK = aFh1aSDK.getMonetizationNetwork;
        boolean zAFAdRevenueData = (aFh1bSDK == null || (aFi1zSDK = aFh1bSDK.getMediationNetwork) == null) ? false : aFi1zSDK.AFAdRevenueData();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFg1tSDK aFg1tSDK = this.AFAdRevenueData;
        return zAFAdRevenueData || jCurrentTimeMillis - aFg1tSDK.getMonetizationNetwork > TimeUnit.SECONDS.toMillis(aFg1tSDK.getRevenue);
    }

    @JvmName
    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }
}
