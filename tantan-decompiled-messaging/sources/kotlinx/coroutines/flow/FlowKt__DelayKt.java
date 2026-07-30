package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import p149l.ppb;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/ppb;", "", "delayMillis", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "a", "(Ll/ppb;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__DelayKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ReceiveChannel<Unit> m94080a(@NotNull ppb ppbVar, long j) {
        return ProduceKt.m93982d(ppbVar, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(j, null), 1, null);
    }
}
