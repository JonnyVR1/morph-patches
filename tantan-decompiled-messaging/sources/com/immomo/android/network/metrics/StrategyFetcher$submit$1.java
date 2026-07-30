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
import p149l.fc20;
import p149l.oml;
import p149l.ppb;
import p149l.qkq0;
import p149l.ru5;
import p149l.uwp;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 4, 0})
@DebugMetadata(m87373c = "com.immomo.android.network.metrics.StrategyFetcher$submit$1", m87374f = "StrategyFetcher.kt", m87375l = {}, m87376m = "invokeSuspend")
public final class StrategyFetcher$submit$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map $map;
    final /* synthetic */ boolean $success;
    final /* synthetic */ long $totalTimeMillis;
    int label;

    /* JADX INFO: renamed from: p$ */
    private ppb f12890p$;

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
        strategyFetcher$submit$1.f12890p$ = (ppb) obj;
        return strategyFetcher$submit$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((StrategyFetcher$submit$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.StrategyFetcher$submit$1.1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final Strategy strategy = StrategyFetcher.INSTANCE.m18265e().get();
                if (strategy.getEnabled()) {
                    NetworkMetricsStatistics.INSTANCE.m18173a(new Function2<oml, ru5, Unit>() { // from class: com.immomo.android.network.metrics.StrategyFetcher.submit.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull oml omlVar, @Nullable ru5 ru5Var) {
                            omlVar.getClass();
                            try {
                                StrategyFetcher$submit$1.this.$map.putAll(fc20.m120419b(ru5Var));
                                StrategyFetcher$submit$1 strategyFetcher$submit$1 = StrategyFetcher$submit$1.this;
                                if (strategyFetcher$submit$1.$success && strategyFetcher$submit$1.$totalTimeMillis <= strategy.getErrorMaxTime()) {
                                    StrategyFetcher strategyFetcher = StrategyFetcher.INSTANCE;
                                    if (strategyFetcher.m18263f(strategy.getSuccessRate())) {
                                        Strategy strategy2 = strategy;
                                        strategy2.getClass();
                                        strategyFetcher.m18262c(omlVar, strategy2, new Function0<String>() { // from class: com.immomo.android.network.metrics.StrategyFetcher.submit.1.1.1.2
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final String invoke() {
                                                return strategy.m18259u();
                                            }
                                        }, StrategyFetcher$submit$1.this.$map);
                                        return;
                                    }
                                    return;
                                }
                                StrategyFetcher strategyFetcher2 = StrategyFetcher.INSTANCE;
                                if (strategyFetcher2.m18263f(strategy.getErrorRate())) {
                                    Strategy strategy3 = strategy;
                                    strategy3.getClass();
                                    strategyFetcher2.m18262c(omlVar, strategy3, new Function0<String>() { // from class: com.immomo.android.network.metrics.StrategyFetcher.submit.1.1.1.1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final String invoke() {
                                            return strategy.m18259u();
                                        }
                                    }, StrategyFetcher$submit$1.this.$map);
                                }
                            } catch (Exception unused) {
                                NetworkMetricsStatistics.INSTANCE.m18178f();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(oml omlVar, ru5 ru5Var) {
                            invoke2(omlVar, ru5Var);
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
