package androidx.work.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "androidx.work.impl.WorkerWrapper", m87374f = "WorkerWrapper.kt", m87375l = {299}, m87376m = "runWorker")
public final class WorkerWrapper$runWorker$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$1(WorkerWrapper workerWrapper, Continuation<? super WorkerWrapper$runWorker$1> continuation) {
        super(continuation);
        this.this$0 = workerWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m4482v(this);
    }
}
