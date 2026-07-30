package androidx.tracing;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 176)
@DebugMetadata(m87373c = "androidx.tracing.TraceKt", m87374f = "Trace.kt", m87375l = {76}, m87376m = "traceAsync")
@SourceDebugExtension
public final class TraceKt$traceAsync$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TraceKt$traceAsync$1(Continuation<? super TraceKt$traceAsync$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TraceKt.m4095a(null, 0, null, this);
    }
}
