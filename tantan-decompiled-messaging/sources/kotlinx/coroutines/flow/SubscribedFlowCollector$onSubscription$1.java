package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.w3g0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m87374f = "Share.kt", m87375l = {HttpStatus.UNSUPPORTED_MEDIA_TYPE_415, 419}, m87376m = "onSubscription")
final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w3g0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(w3g0<Object> w3g0Var, Continuation<? super SubscribedFlowCollector$onSubscription$1> continuation) {
        super(continuation);
        this.this$0 = w3g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m201316a(this);
    }
}
