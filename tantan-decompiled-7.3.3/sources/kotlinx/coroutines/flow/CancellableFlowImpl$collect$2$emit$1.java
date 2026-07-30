package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.dg4;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m88263f = "Context.kt", m88264l = {271}, m88265m = "emit")
final class CancellableFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dg4<Object> this$0;

    public CancellableFlowImpl$collect$2$emit$1(dg4<Object> dg4Var, Continuation<? super CancellableFlowImpl$collect$2$emit$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
