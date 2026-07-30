package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ag4;
import p153l.drb;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"R", "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", m88263f = "CoroutinesRoom.kt", m88264l = {}, m88265m = "invokeSuspend")
final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Callable<Object> $callable;
    final /* synthetic */ ag4<Object> $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<Object> callable, ag4<Object> ag4Var, Continuation<? super CoroutinesRoom$Companion$execute$4$job$1> continuation) {
        super(2, continuation);
        this.$callable = callable;
        this.$continuation = ag4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        try {
            this.$continuation.resumeWith(Result.m225066constructorimpl(this.$callable.call()));
        } catch (Throwable th) {
            ag4<Object> ag4Var = this.$continuation;
            Result.Companion companion = Result.INSTANCE;
            ag4Var.resumeWith(Result.m225066constructorimpl(ResultKt.m88127a(th)));
        }
        return Unit.INSTANCE;
    }
}
