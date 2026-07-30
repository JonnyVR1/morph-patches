package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1uSDK {
    private static /* synthetic */ boolean AFAdRevenueData(AFg1uSDK aFg1uSDK, String str) {
        return getMonetizationNetwork(str, TimeUnit.HOURS, 1L);
    }

    @JvmOverloads
    private static boolean getMonetizationNetwork(@Nullable String str, @NotNull TimeUnit timeUnit, long j) {
        Long lP;
        Object objM225066constructorimpl;
        timeUnit.getClass();
        if (str != null && (lP = StringsKt.m94281p(str)) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(Boolean.valueOf(Math.abs(lP.longValue() - (AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code().component3().getRevenue() / 1000)) < timeUnit.toSeconds(1L)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
            if (thM225069exceptionOrNullimpl != null) {
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(str);
                sb.append(" to TS");
                AFLogger.afErrorLog(sb.toString(), thM225069exceptionOrNullimpl);
            }
            if (Result.m225072isFailureimpl(objM225066constructorimpl)) {
                objM225066constructorimpl = null;
            }
            Boolean bool = (Boolean) objM225066constructorimpl;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    @JvmOverloads
    public final boolean getRevenue(@Nullable String str) {
        return AFAdRevenueData(this, str);
    }
}
