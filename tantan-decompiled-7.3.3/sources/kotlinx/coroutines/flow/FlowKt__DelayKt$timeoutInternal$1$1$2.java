package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.p7f;
import p153l.uyp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", m88263f = "Delay.kt", m88264l = {}, m88265m = "invokeSuspend")
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements Function1<Continuation<?>, Object> {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, Continuation<? super FlowKt__DelayKt$timeoutInternal$1$1$2> continuation) {
        super(1, continuation);
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<?> continuation) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m88128b(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) Duration.m94410P(this.$timeout)));
    }
}
