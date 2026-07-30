package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.asi;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 176)
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", m87374f = "Emitters.kt", m87375l = {49}, m87376m = "emit")
@SourceDebugExtension
public final class FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ asi<Object> this$0;

    public FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(asi<Object> asiVar, Continuation<? super FlowKt__EmittersKt$unsafeTransform$1$1$emit$1> continuation) {
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
