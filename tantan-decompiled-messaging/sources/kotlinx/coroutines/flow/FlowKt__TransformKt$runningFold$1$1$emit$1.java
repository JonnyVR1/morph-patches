package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.usi;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", m87374f = "Transform.kt", m87375l = {105, 106}, m87376m = "emit")
final class FlowKt__TransformKt$runningFold$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ usi<Object> this$0;

    public FlowKt__TransformKt$runningFold$1$1$emit$1(usi<Object> usiVar, Continuation<? super FlowKt__TransformKt$runningFold$1$1$emit$1> continuation) {
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
