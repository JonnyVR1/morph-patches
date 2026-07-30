package com.immomo.android.network.metrics;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p153l.vv5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "invoke"}, m88122k = 3, m88123mv = {1, 1, 16})
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
        vv5 vv5VarM19253d = networkMetricsStatistics.m19253d();
        networkMetricsStatistics.m19258i(vv5VarM19253d != null ? vv5.m202995b(vv5VarM19253d, null, null, null, null, (String) CollectionsKt.firstOrNull(this.$hosts), null, 47, null) : null);
        StrategyFetcher.INSTANCE.m19342e().get().m19331p(this.$hosts);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
