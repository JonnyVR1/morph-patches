package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bsi;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", m87374f = "Limit.kt", m87375l = {21}, m87376m = "emit")
final class FlowKt__LimitKt$drop$2$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bsi<Object> this$0;

    public FlowKt__LimitKt$drop$2$1$emit$1(bsi<Object> bsiVar, Continuation<? super FlowKt__LimitKt$drop$2$1$emit$1> continuation) {
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
