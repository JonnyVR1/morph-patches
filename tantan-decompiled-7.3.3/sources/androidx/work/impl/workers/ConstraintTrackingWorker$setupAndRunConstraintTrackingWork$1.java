package androidx.work.impl.workers;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "androidx.work.impl.workers.ConstraintTrackingWorker", m88263f = "ConstraintTrackingWorker.kt", m88264l = {EACTags.APPLICATION_TEMPLATE}, m88265m = "setupAndRunConstraintTrackingWork")
public final class ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConstraintTrackingWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1(ConstraintTrackingWorker constraintTrackingWorker, Continuation<? super ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1> continuation) {
        super(continuation);
        this.this$0 = constraintTrackingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m4637i(this);
    }
}
