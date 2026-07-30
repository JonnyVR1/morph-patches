package androidx.work.impl.workers;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt", m88263f = "ConstraintTrackingWorker.kt", m88264l = {160}, m88265m = "awaitConstraintsNotMet")
public final class ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1(Continuation<? super ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ConstraintTrackingWorkerKt.m4640c(null, null, this);
    }
}
