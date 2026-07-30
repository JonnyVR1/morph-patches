package com.immomo.android.network.metrics;

import android.app.Application;
import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fc20;
import p149l.jt0;
import p149l.oml;
import p149l.ru5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0003J0\u0010\u0019\u001a\u00020\b2\u001f\u0010\u0018\u001a\u001b\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0002\b\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b+\u0010,R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00065"}, m87232d2 = {"Lcom/immomo/android/network/metrics/NetworkMetricsStatistics;", "", "<init>", "()V", "Landroid/app/Application;", "app", "Ll/ru5;", Constants.KEY_CONFIG, "", "g", "(Landroid/app/Application;Ll/ru5;)V", "", "success", "", "totalTimeMillis", "", "", "map", "j", "(ZJLjava/util/Map;)V", "b", "Lkotlin/Function2;", "Ll/oml;", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/jvm/functions/Function2;)V", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Ll/ru5;", Constants.INAPP_DATA_TAG, "()Ll/ru5;", RXScreenCaptureService.KEY_INDEX, "(Ll/ru5;)V", "c", "Landroid/app/Application;", "()Landroid/app/Application;", "h", "(Landroid/app/Application;)V", "Ll/jt0;", "Ll/jt0;", "e", "()Ll/jt0;", "defaultApi", "Lcom/immomo/android/network/metrics/NetworkMetricsStatistics$a;", "logger", "Lcom/immomo/android/network/metrics/NetworkMetricsStatistics$a;", "f", "()Lcom/immomo/android/network/metrics/NetworkMetricsStatistics$a;", "setLogger", "(Lcom/immomo/android/network/metrics/NetworkMetricsStatistics$a;)V", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class NetworkMetricsStatistics {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static ru5 config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static Application app;
    public static final NetworkMetricsStatistics INSTANCE = new NetworkMetricsStatistics();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static final String TAG = Reflection.m87507b(NetworkMetricsStatistics.class).mo87471s();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final jt0 defaultApi = new jt0();

    /* JADX INFO: renamed from: com.immomo.android.network.metrics.NetworkMetricsStatistics$a */
    @Metadata(m87231d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"Lcom/immomo/android/network/metrics/NetworkMetricsStatistics$a;", "", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public interface InterfaceC3739a {
    }

    private NetworkMetricsStatistics() {
    }

    /* JADX INFO: renamed from: a */
    public final void m18173a(@NotNull final Function2<? super oml, ? super ru5, Unit> block) {
        block.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsStatistics$apiSelector$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                oml omlVarM18177e;
                Object objM223820constructorimpl;
                NetworkMetricsStatistics networkMetricsStatistics = NetworkMetricsStatistics.INSTANCE;
                ru5 ru5VarM18176d = networkMetricsStatistics.m18176d();
                if (ru5VarM18176d == null || (omlVarM18177e = ru5VarM18176d.getSubmitAlternative()) == null) {
                    omlVarM18177e = networkMetricsStatistics.m18177e();
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    block.invoke(omlVarM18177e, ru5VarM18176d);
                    objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
                }
                if (Result.m223823exceptionOrNullimpl(objM223820constructorimpl) != null) {
                    NetworkMetricsStatistics.INSTANCE.m18178f();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m18174b() {
        StrategyFetcher.INSTANCE.m18264d();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Application m18175c() {
        return app;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final ru5 m18176d() {
        return config;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final jt0 m18177e() {
        return defaultApi;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final InterfaceC3739a m18178f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m18179g(@NotNull final Application app2, @NotNull final ru5 config2) {
        app2.getClass();
        config2.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsStatistics$init$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NetworkMetricsStatistics networkMetricsStatistics = NetworkMetricsStatistics.INSTANCE;
                networkMetricsStatistics.m18181i(config2);
                networkMetricsStatistics.m18180h(app2);
                Strategy strategy = new Strategy();
                StrategyFetcher strategyFetcher = StrategyFetcher.INSTANCE;
                strategyFetcher.m18265e().set(strategy);
                strategyFetcher.m18264d();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m18180h(@Nullable Application application) {
        app = application;
    }

    /* JADX INFO: renamed from: i */
    public final void m18181i(@Nullable ru5 ru5Var) {
        config = ru5Var;
    }

    /* JADX INFO: renamed from: j */
    public final void m18182j(boolean success, long totalTimeMillis, @NotNull Map<String, String> map) {
        map.getClass();
        StrategyFetcher.INSTANCE.m18266g(success, totalTimeMillis, map);
    }
}
