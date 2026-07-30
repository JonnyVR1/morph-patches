package kotlinx.coroutines.flow;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.C15521a;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.h350;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/a;", "", LovePlanetStage.result, "", "<anonymous>", "(Lkotlinx/coroutines/channels/a;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m88263f = "Delay.kt", m88264l = {}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements Function2<C15521a<? extends Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
    final /* synthetic */ ReceiveChannel<Unit> $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref.ObjectRef<Object> objectRef, ReceiveChannel<Unit> receiveChannel, Continuation<? super FlowKt__DelayKt$sample$2$1$1> continuation) {
        super(2, continuation);
        this.$lastValue = objectRef;
        this.$ticker = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, continuation);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(C15521a<? extends Object> c15521a, Continuation<? super Unit> continuation) {
        return m225912invokeWpGqRn0(c15521a.getHolder(), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m225912invokeWpGqRn0(@NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(C15521a.m94883b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [T, l.goh0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        ?? holder = ((C15521a) this.L$0).getHolder();
        Ref.ObjectRef<Object> objectRef = this.$lastValue;
        boolean z = holder instanceof C15521a.c;
        if (!z) {
            objectRef.element = holder;
        }
        ReceiveChannel<Unit> receiveChannel = this.$ticker;
        if (z) {
            Throwable thM94886e = C15521a.m94886e(holder);
            if (thM94886e != null) {
                throw thM94886e;
            }
            receiveChannel.mo94782n(new ChildCancelledException());
            objectRef.element = h350.f107616c;
        }
        return Unit.INSTANCE;
    }
}
