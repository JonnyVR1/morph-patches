package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.dcg0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m88263f = "Share.kt", m88264l = {HttpStatus.UNSUPPORTED_MEDIA_TYPE_415, 419}, m88265m = "onSubscription")
final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ dcg0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(dcg0<Object> dcg0Var, Continuation<? super SubscribedFlowCollector$onSubscription$1> continuation) {
        super(continuation);
        this.this$0 = dcg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m115273a(this);
    }
}
