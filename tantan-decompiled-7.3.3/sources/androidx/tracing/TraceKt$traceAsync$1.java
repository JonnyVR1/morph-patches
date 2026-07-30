package androidx.tracing;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 176)
@DebugMetadata(m88262c = "androidx.tracing.TraceKt", m88263f = "Trace.kt", m88264l = {76}, m88265m = "traceAsync")
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
        return TraceKt.m4097a(null, 0, null, this);
    }
}
