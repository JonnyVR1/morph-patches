package com.immomo.android.network.metrics;

import android.app.Application;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.apl;
import p153l.drb;
import p153l.o4f0;
import p153l.ok20;
import p153l.uyp;
import p153l.vv5;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.immomo.android.network.metrics.StrategyFetcher$fetch$1", m88263f = "StrategyFetcher.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class StrategyFetcher$fetch$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f13628p$;

    public StrategyFetcher$fetch$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        StrategyFetcher$fetch$1 strategyFetcher$fetch$1 = new StrategyFetcher$fetch$1(continuation);
        strategyFetcher$fetch$1.f13628p$ = (drb) obj;
        return strategyFetcher$fetch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((StrategyFetcher$fetch$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.StrategyFetcher$fetch$1.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NetworkMetricsStatistics.INSTANCE.m19250a(new Function2<apl, vv5, Unit>() { // from class: com.immomo.android.network.metrics.StrategyFetcher.fetch.1.1.1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull apl aplVar, @Nullable vv5 vv5Var) {
                        aplVar.getClass();
                        StrategyFetcher strategyFetcher = StrategyFetcher.INSTANCE;
                        final Strategy strategy = strategyFetcher.m19342e().get();
                        strategy.getClass();
                        String strM19339c = strategyFetcher.m19339c(aplVar, strategy, new Function0<String>() { // from class: com.immomo.android.network.metrics.StrategyFetcher$fetch$1$1$1$response$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                return strategy.m19322f();
                            }
                        }, ok20.m167976b(vv5Var));
                        if (strM19339c != null) {
                            strategyFetcher.m19342e().set(new Strategy(strM19339c));
                            Application applicationM19252c = NetworkMetricsStatistics.INSTANCE.m19252c();
                            if (applicationM19252c != null) {
                                o4f0.INSTANCE.m166001b(applicationM19252c, "MMNetworkMetrics4Android_STRATEGY", strM19339c);
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(apl aplVar, vv5 vv5Var) {
                        invoke2(aplVar, vv5Var);
                        return Unit.INSTANCE;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        return Unit.INSTANCE;
    }
}
