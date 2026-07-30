package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.fvi;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 176)
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", m88263f = "Transform.kt", m88264l = {219}, m88265m = "emit")
@SourceDebugExtension
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ fvi this$0;

    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1(fvi fviVar, Continuation continuation) {
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
