package com.immomo.android.network.metrics;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;
import p149l.d4e;
import p149l.ig3;
import p149l.jh3;
import p149l.oml;
import p149l.t1k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0011\u001a\u0004\u0018\u00010\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0003J1\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Lcom/immomo/android/network/metrics/StrategyFetcher;", "", "<init>", "()V", "", "percentage", "", "f", "(I)Z", "Ll/oml;", "Lcom/immomo/android/network/metrics/Strategy;", "strategy", "Lkotlin/Function0;", "", "url", "", "map", "c", "(Ll/oml;Lcom/immomo/android/network/metrics/Strategy;Lkotlin/jvm/functions/Function0;Ljava/util/Map;)Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "success", "", "totalTimeMillis", "g", "(ZJLjava/util/Map;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "e", "()Ljava/util/concurrent/atomic/AtomicReference;", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class StrategyFetcher {
    public static final StrategyFetcher INSTANCE = new StrategyFetcher();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final AtomicReference<Strategy> strategy = new AtomicReference<>(new Strategy());

    private StrategyFetcher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final String m18262c(@NotNull oml omlVar, Strategy strategy2, Function0<String> function0, Map<String, String> map) {
        boolean z = false;
        String strMo143069a = null;
        for (int size = strategy2.m18247h().size(); !z && size > 0; size--) {
            try {
                strMo143069a = omlVar.mo143069a(function0.invoke(), map);
                if (strMo143069a != null) {
                    z = true;
                }
            } catch (Exception unused) {
                NetworkMetricsStatistics.INSTANCE.m18178f();
                strategy2.m18244e();
            }
        }
        return strMo143069a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final boolean m18263f(int percentage) {
        if (percentage >= 0 && 100 >= percentage) {
            return RandomKt.m87567a(System.currentTimeMillis()).nextDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 100.0d) <= ((double) percentage);
        }
        ig3.m135964a("Percentage must be between 0 and 100");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m18264d() {
        jh3.m141367d(t1k.INSTANCE, d4e.m109981b(), null, new StrategyFetcher$fetch$1(null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final AtomicReference<Strategy> m18265e() {
        return strategy;
    }

    /* JADX INFO: renamed from: g */
    public final void m18266g(boolean success, long totalTimeMillis, @NotNull Map<String, String> map) {
        map.getClass();
        jh3.m141367d(t1k.INSTANCE, d4e.m109981b(), null, new StrategyFetcher$submit$1(map, success, totalTimeMillis, null), 2, null);
    }
}
