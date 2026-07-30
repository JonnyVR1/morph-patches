package com.immomo.android.network.metrics;

import java.util.Map;
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
import p153l.ok20;
import p153l.uyp;
import p153l.vv5;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.immomo.android.network.metrics.StrategyFetcher$submit$1", m88263f = "StrategyFetcher.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class StrategyFetcher$submit$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map $map;
    final /* synthetic */ boolean $success;
    final /* synthetic */ long $totalTimeMillis;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f13629p$;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyFetcher$submit$1(Map map, boolean z, long j, Continuation continuation) {
        super(2, continuation);
        this.$map = map;
        this.$success = z;
        this.$totalTimeMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        StrategyFetcher$submit$1 strategyFetcher$submit$1 = new StrategyFetcher$submit$1(this.$map, this.$success, this.$totalTimeMillis, continuation);
        strategyFetcher$submit$1.f13629p$ = (drb) obj;
        return strategyFetcher$submit$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((StrategyFetcher$submit$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.StrategyFetcher$submit$1.1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final Strategy strategy = StrategyFetcher.INSTANCE.m19342e().get();
                if (strategy.getEnabled()) {
                    NetworkMetricsStatistics.INSTANCE.m19250a(new Function2<apl, vv5, Unit>() { // from class: com.immomo.android.network.metrics.StrategyFetcher.submit.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull apl aplVar, @Nullable vv5 vv5Var) {
                            aplVar.getClass();
                            try {
                                StrategyFetcher$submit$1.this.$map.putAll(ok20.m167976b(vv5Var));
                                StrategyFetcher$submit$1 strategyFetcher$submit$1 = StrategyFetcher$submit$1.this;
                                if (strategyFetcher$submit$1.$success && strategyFetcher$submit$1.$totalTimeMillis <= strategy.getErrorMaxTime()) {
                                    StrategyFetcher strategyFetcher = StrategyFetcher.INSTANCE;
                                    if (strategyFetcher.m19340f(strategy.getSuccessRate())) {
                                        Strategy strategy2 = strategy;
                                        strategy2.getClass();
                                        strategyFetcher.m19339c(aplVar, strategy2, new Function0<String>() { // from class: com.immomo.android.network.metrics.StrategyFetcher.submit.1.1.1.2
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final String invoke() {
                                                return strategy.m19336u();
                                            }
                                        }, StrategyFetcher$submit$1.this.$map);
                                        return;
                                    }
                                    return;
                                }
                                StrategyFetcher strategyFetcher2 = StrategyFetcher.INSTANCE;
                                if (strategyFetcher2.m19340f(strategy.getErrorRate())) {
                                    Strategy strategy3 = strategy;
                                    strategy3.getClass();
                                    strategyFetcher2.m19339c(aplVar, strategy3, new Function0<String>() { // from class: com.immomo.android.network.metrics.StrategyFetcher.submit.1.1.1.1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final String invoke() {
                                            return strategy.m19336u();
                                        }
                                    }, StrategyFetcher$submit$1.this.$map);
                                }
                            } catch (Exception unused) {
                                NetworkMetricsStatistics.INSTANCE.m19255f();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(apl aplVar, vv5 vv5Var) {
                            invoke2(aplVar, vv5Var);
                            return Unit.INSTANCE;
                        }
                    });
                }
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
