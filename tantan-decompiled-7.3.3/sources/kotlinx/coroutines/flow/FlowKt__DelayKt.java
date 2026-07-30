package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import p153l.drb;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/drb;", "", "delayMillis", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "a", "(Ll/drb;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__DelayKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ReceiveChannel<Unit> m94973a(@NotNull drb drbVar, long j) {
        return ProduceKt.m94874d(drbVar, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(j, null), 1, null);
    }
}
