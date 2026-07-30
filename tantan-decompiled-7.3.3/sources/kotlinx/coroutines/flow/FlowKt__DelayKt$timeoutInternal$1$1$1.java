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
import kotlinx.coroutines.channels.C15521a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bui;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/a;", "value", "", "<anonymous>", "(Lkotlinx/coroutines/channels/a;)Z"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", m88263f = "Delay.kt", m88264l = {395}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements Function2<C15521a<Object>, Continuation<? super Boolean>, Object> {
    final /* synthetic */ bui<Object> $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(bui<Object> buiVar, Continuation<? super FlowKt__DelayKt$timeoutInternal$1$1$1> continuation) {
        super(2, continuation);
        this.$downStream = buiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, continuation);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(C15521a<Object> c15521a, Continuation<? super Boolean> continuation) {
        return m225913invokeWpGqRn0(c15521a.getHolder(), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m225913invokeWpGqRn0(@NotNull Object obj, @Nullable Continuation<? super Boolean> continuation) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(C15521a.m94883b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
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
        Throwable thM94886e;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            holder = ((C15521a) this.L$0).getHolder();
            bui<Object> buiVar = this.$downStream;
            if (!(holder instanceof C15521a.c)) {
                this.L$0 = holder;
                this.label = 1;
                if (buiVar.emit(holder, this) == objM198688e) {
                    return objM198688e;
                }
                obj2 = holder;
            }
            if (holder instanceof C15521a.a) {
                return Boxing.m88259a(true);
            }
            thM94886e = C15521a.m94886e(holder);
            if (thM94886e == null) {
                return Boxing.m88259a(false);
            }
            throw thM94886e;
        }
        if (i != 1) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj2 = this.L$0;
        ResultKt.m88128b(obj);
        holder = obj2;
        if (holder instanceof C15521a.a) {
            return Boxing.m88259a(true);
        }
        thM94886e = C15521a.m94886e(holder);
        if (thM94886e == null) {
            return Boxing.m88259a(false);
        }
        throw thM94886e;
    }
}
