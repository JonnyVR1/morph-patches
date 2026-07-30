package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.C15414a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/a;", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/a;)Z"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", m87374f = "Delay.kt", m87375l = {395}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements Function2<C15414a<Object>, Continuation<? super Boolean>, Object> {
    final /* synthetic */ fri<Object> $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(fri<Object> friVar, Continuation<? super FlowKt__DelayKt$timeoutInternal$1$1$1> continuation) {
        super(2, continuation);
        this.$downStream = friVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, continuation);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(C15414a<Object> c15414a, Continuation<? super Boolean> continuation) {
        return m224667invokeWpGqRn0(c15414a.getHolder(), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m224667invokeWpGqRn0(@NotNull Object obj, @Nullable Continuation<? super Boolean> continuation) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(C15414a.m93991b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object holder;
        Object obj2;
        Throwable thM93994e;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            holder = ((C15414a) this.L$0).getHolder();
            fri<Object> friVar = this.$downStream;
            if (!(holder instanceof C15414a.c)) {
                this.L$0 = holder;
                this.label = 1;
                if (friVar.emit(holder, this) == objM196133e) {
                    return objM196133e;
                }
                obj2 = holder;
            }
            if (holder instanceof C15414a.a) {
                return Boxing.m87370a(true);
            }
            thM93994e = C15414a.m93994e(holder);
            if (thM93994e == null) {
                return Boxing.m87370a(false);
            }
            throw thM93994e;
        }
        if (i != 1) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj2 = this.L$0;
        ResultKt.m87239b(obj);
        holder = obj2;
        if (holder instanceof C15414a.a) {
            return Boxing.m87370a(true);
        }
        thM93994e = C15414a.m93994e(holder);
        if (thM93994e == null) {
            return Boxing.m87370a(false);
        }
        throw thM93994e;
    }
}
