package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;
import p149l.vzm;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "<anonymous>"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m87374f = "Interruptible.kt", m87375l = {}, m87376m = "invokeSuspend")
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements Function2<ppb, Continuation<Object>, Object> {
    final /* synthetic */ Function0<Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(Function0<Object> function0, Continuation<? super InterruptibleKt$runInterruptible$2> continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, continuation);
        interruptibleKt$runInterruptible$2.L$0 = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<Object> continuation) {
        return ((InterruptibleKt$runInterruptible$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label == 0) {
            ResultKt.m87239b(obj);
            return vzm.m200773b(((ppb) this.L$0).getCoroutineContext(), this.$block);
        }
        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
