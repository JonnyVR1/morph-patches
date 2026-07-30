package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.j6f;
import p149l.jee0;
import p149l.ppb;
import p149l.qkq0;
import p149l.she0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", m87374f = "Merge.kt", m87375l = {65}, m87376m = "invokeSuspend")
final class ChannelFlowMerge$collectTo$2$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ she0<Object> $collector;
    final /* synthetic */ eri<Object> $inner;
    final /* synthetic */ jee0 $semaphore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowMerge$collectTo$2$1(eri<Object> eriVar, she0<Object> she0Var, jee0 jee0Var, Continuation<? super ChannelFlowMerge$collectTo$2$1> continuation) {
        super(2, continuation);
        this.$inner = eriVar;
        this.$collector = she0Var;
        this.$semaphore = jee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChannelFlowMerge$collectTo$2$1(this.$inner, this.$collector, this.$semaphore, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelFlowMerge$collectTo$2$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Unit] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m87239b(obj);
                eri<Object> eriVar = this.$inner;
                she0<Object> she0Var = this.$collector;
                this.label = 1;
                if (eriVar.collect(she0Var, this) == objM196133e) {
                    return objM196133e;
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            this.$semaphore.release();
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.$semaphore.release();
            throw th;
        }
    }
}
