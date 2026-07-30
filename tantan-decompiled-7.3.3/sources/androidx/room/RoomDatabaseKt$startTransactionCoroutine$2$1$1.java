package androidx.room;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ag4;
import p153l.drb;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"R", "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", m88263f = "RoomDatabaseExt.kt", m88264l = {103}, m88265m = "invokeSuspend")
final class RoomDatabaseKt$startTransactionCoroutine$2$1$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ ag4<Object> $continuation;
    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
    final /* synthetic */ Function2<drb, Continuation<Object>, Object> $transactionBlock;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$startTransactionCoroutine$2$1$1(RoomDatabase roomDatabase, ag4<Object> ag4Var, Function2<? super drb, ? super Continuation<Object>, ? extends Object> function2, Continuation<? super RoomDatabaseKt$startTransactionCoroutine$2$1$1> continuation) {
        super(2, continuation);
        this.$this_startTransactionCoroutine = roomDatabase;
        this.$continuation = ag4Var;
        this.$transactionBlock = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RoomDatabaseKt$startTransactionCoroutine$2$1$1 roomDatabaseKt$startTransactionCoroutine$2$1$1 = new RoomDatabaseKt$startTransactionCoroutine$2$1$1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, continuation);
        roomDatabaseKt$startTransactionCoroutine$2$1$1.L$0 = obj;
        return roomDatabaseKt$startTransactionCoroutine$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((RoomDatabaseKt$startTransactionCoroutine$2$1$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Continuation continuation;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            CoroutineContext.Element element = ((drb) this.L$0).getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
            element.getClass();
            CoroutineContext coroutineContextM3996b = C0673h.m3996b(this.$this_startTransactionCoroutine, (ContinuationInterceptor) element);
            ag4<Object> ag4Var = this.$continuation;
            Result.Companion companion = Result.INSTANCE;
            Function2<drb, Continuation<Object>, Object> function2 = this.$transactionBlock;
            this.L$0 = ag4Var;
            this.label = 1;
            obj = vh3.m201255g(coroutineContextM3996b, function2, this);
            if (obj == objM198688e) {
                return objM198688e;
            }
            continuation = ag4Var;
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            continuation = (Continuation) this.L$0;
            ResultKt.m88128b(obj);
        }
        continuation.resumeWith(Result.m225066constructorimpl(obj));
        return Unit.INSTANCE;
    }
}
