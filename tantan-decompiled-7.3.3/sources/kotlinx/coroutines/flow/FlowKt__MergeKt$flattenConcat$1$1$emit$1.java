package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.cvi;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m88263f = "Merge.kt", m88264l = {79}, m88265m = "emit")
final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cvi<Object> this$0;

    public FlowKt__MergeKt$flattenConcat$1$1$emit$1(cvi<Object> cviVar, Continuation<? super FlowKt__MergeKt$flattenConcat$1$1$emit$1> continuation) {
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
