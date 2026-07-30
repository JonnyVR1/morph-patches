package com.immomo.android.network.metrics;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;
import p153l.apl;
import p153l.l4k;
import p153l.r5e;
import p153l.wg3;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0011\u001a\u0004\u0018\u00010\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0003J1\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Lcom/immomo/android/network/metrics/StrategyFetcher;", "", "<init>", "()V", "", "percentage", "", "f", "(I)Z", "Ll/apl;", "Lcom/immomo/android/network/metrics/Strategy;", "strategy", "Lkotlin/Function0;", "", "url", "", "map", "c", "(Ll/apl;Lcom/immomo/android/network/metrics/Strategy;Lkotlin/jvm/functions/Function0;Ljava/util/Map;)Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "success", "", "totalTimeMillis", "g", "(ZJLjava/util/Map;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "e", "()Ljava/util/concurrent/atomic/AtomicReference;", "sdk_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class StrategyFetcher {
    public static final StrategyFetcher INSTANCE = new StrategyFetcher();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final AtomicReference<Strategy> strategy = new AtomicReference<>(new Strategy());

    private StrategyFetcher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final String m19339c(@NotNull apl aplVar, Strategy strategy2, Function0<String> function0, Map<String, String> map) {
        boolean z = false;
        String strMo99322a = null;
        for (int size = strategy2.m19324h().size(); !z && size > 0; size--) {
            try {
                strMo99322a = aplVar.mo99322a(function0.invoke(), map);
                if (strMo99322a != null) {
                    z = true;
                }
            } catch (Exception unused) {
                NetworkMetricsStatistics.INSTANCE.m19255f();
                strategy2.m19321e();
            }
        }
        return strMo99322a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final boolean m19340f(int percentage) {
        if (percentage >= 0 && 100 >= percentage) {
            return RandomKt.m88457a(System.currentTimeMillis()).nextDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 100.0d) <= ((double) percentage);
        }
        wg3.m206174a("Percentage must be between 0 and 100");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m19341d() {
        xh3.m210980d(l4k.INSTANCE, r5e.m179861b(), null, new StrategyFetcher$fetch$1(null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final AtomicReference<Strategy> m19342e() {
        return strategy;
    }

    /* JADX INFO: renamed from: g */
    public final void m19343g(boolean success, long totalTimeMillis, @NotNull Map<String, String> map) {
        map.getClass();
        xh3.m210980d(l4k.INSTANCE, r5e.m179861b(), null, new StrategyFetcher$submit$1(map, success, totalTimeMillis, null), 2, null);
    }
}
