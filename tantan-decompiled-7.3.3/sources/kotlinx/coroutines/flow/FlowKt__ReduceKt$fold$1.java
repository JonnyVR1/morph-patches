package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 176)
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m88263f = "Reduce.kt", m88264l = {40}, m88265m = "fold")
@SourceDebugExtension
public final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ReduceKt$fold$1(Continuation<? super FlowKt__ReduceKt$fold$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.m94996e(null, null, null, this);
    }
}
