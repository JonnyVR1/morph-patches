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
import p153l.aui;
import p153l.drb;
import p153l.ome0;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;
import p153l.xpe0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", m88263f = "Merge.kt", m88264l = {65}, m88265m = "invokeSuspend")
final class ChannelFlowMerge$collectTo$2$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ xpe0<Object> $collector;
    final /* synthetic */ aui<Object> $inner;
    final /* synthetic */ ome0 $semaphore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowMerge$collectTo$2$1(aui<Object> auiVar, xpe0<Object> xpe0Var, ome0 ome0Var, Continuation<? super ChannelFlowMerge$collectTo$2$1> continuation) {
        super(2, continuation);
        this.$inner = auiVar;
        this.$collector = xpe0Var;
        this.$semaphore = ome0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChannelFlowMerge$collectTo$2$1(this.$inner, this.$collector, this.$semaphore, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
        return ((ChannelFlowMerge$collectTo$2$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Unit] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m88128b(obj);
                aui<Object> auiVar = this.$inner;
                xpe0<Object> xpe0Var = this.$collector;
                this.label = 1;
                if (auiVar.collect(xpe0Var, this) == objM198688e) {
                    return objM198688e;
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
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
