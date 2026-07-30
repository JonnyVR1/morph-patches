package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ecg0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m88263f = "Share.kt", m88264l = {HttpStatus.METHOD_NOT_ALLOWED_405}, m88265m = "collect")
final class SubscribedSharedFlow$collect$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ecg0<Object> this$0;

    public SubscribedSharedFlow$collect$1(ecg0<Object> ecg0Var, Continuation<? super SubscribedSharedFlow$collect$1> continuation) {
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
