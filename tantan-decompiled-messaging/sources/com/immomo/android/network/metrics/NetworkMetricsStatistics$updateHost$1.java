package com.immomo.android.network.metrics;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p149l.ru5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m87232d2 = {"<anonymous>", "", "invoke"}, m87233k = 3, m87234mv = {1, 1, 16})
final class NetworkMetricsStatistics$updateHost$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Set $hosts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkMetricsStatistics$updateHost$1(Set set) {
        super(0);
        this.$hosts = set;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NetworkMetricsStatistics networkMetricsStatistics = NetworkMetricsStatistics.INSTANCE;
        ru5 ru5VarM18176d = networkMetricsStatistics.m18176d();
        networkMetricsStatistics.m18181i(ru5VarM18176d != null ? ru5.m180850b(ru5VarM18176d, null, null, null, null, (String) CollectionsKt.firstOrNull(this.$hosts), null, 47, null) : null);
        StrategyFetcher.INSTANCE.m18265e().get().m18254p(this.$hosts);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
