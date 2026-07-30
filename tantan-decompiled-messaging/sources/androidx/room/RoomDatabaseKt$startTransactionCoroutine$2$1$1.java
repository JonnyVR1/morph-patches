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
import p149l.bf4;
import p149l.hh3;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"R", "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", m87374f = "RoomDatabaseExt.kt", m87375l = {103}, m87376m = "invokeSuspend")
final class RoomDatabaseKt$startTransactionCoroutine$2$1$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ bf4<Object> $continuation;
    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
    final /* synthetic */ Function2<ppb, Continuation<Object>, Object> $transactionBlock;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$startTransactionCoroutine$2$1$1(RoomDatabase roomDatabase, bf4<Object> bf4Var, Function2<? super ppb, ? super Continuation<Object>, ? extends Object> function2, Continuation<? super RoomDatabaseKt$startTransactionCoroutine$2$1$1> continuation) {
        super(2, continuation);
        this.$this_startTransactionCoroutine = roomDatabase;
        this.$continuation = bf4Var;
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
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((RoomDatabaseKt$startTransactionCoroutine$2$1$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Continuation continuation;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            CoroutineContext.Element element = ((ppb) this.L$0).getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
            element.getClass();
            CoroutineContext coroutineContextM3994b = C0671h.m3994b(this.$this_startTransactionCoroutine, (ContinuationInterceptor) element);
            bf4<Object> bf4Var = this.$continuation;
            Result.Companion companion = Result.INSTANCE;
            Function2<ppb, Continuation<Object>, Object> function2 = this.$transactionBlock;
            this.L$0 = bf4Var;
            this.label = 1;
            obj = hh3.m130938g(coroutineContextM3994b, function2, this);
            if (obj == objM196133e) {
                return objM196133e;
            }
            continuation = bf4Var;
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            continuation = (Continuation) this.L$0;
            ResultKt.m87239b(obj);
        }
        continuation.resumeWith(Result.m223820constructorimpl(obj));
        return Unit.INSTANCE;
    }
}
