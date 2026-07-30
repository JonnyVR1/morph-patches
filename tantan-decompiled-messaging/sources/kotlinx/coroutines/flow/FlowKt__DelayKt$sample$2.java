package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.SelectImplementation;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.jri;
import p149l.ppb;
import p149l.qkq0;
import p149l.su40;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/ppb;", "Ll/fri;", "downstream", "", "<anonymous>", "(Ll/ppb;Ll/fri;)V"}, m87233k = 3, m87234mv = {1, 9, 0})
@DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m87374f = "Delay.kt", m87375l = {HttpStatus.UNSUPPORTED_MEDIA_TYPE_415}, m87376m = "invokeSuspend")
@SourceDebugExtension
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements Function3<ppb, fri<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ eri<Object> $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, eri<Object> eriVar, Continuation<? super FlowKt__DelayKt$sample$2> continuation) {
        super(3, continuation);
        this.$periodMillis = j;
        this.$this_sample = eriVar;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull ppb ppbVar, @NotNull fri<Object> friVar, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, continuation);
        flowKt__DelayKt$sample$2.L$0 = ppbVar;
        flowKt__DelayKt$sample$2.L$1 = friVar;
        return flowKt__DelayKt$sample$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ReceiveChannel receiveChannel;
        ReceiveChannel<Unit> receiveChannelM142963v;
        Ref.ObjectRef objectRef;
        fri friVar;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            ppb ppbVar = (ppb) this.L$0;
            fri friVar2 = (fri) this.L$1;
            ReceiveChannel receiveChannelM93982d = ProduceKt.m93982d(ppbVar, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            receiveChannel = receiveChannelM93982d;
            receiveChannelM142963v = jri.m142963v(ppbVar, this.$periodMillis);
            objectRef = objectRef2;
            friVar = friVar2;
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            receiveChannelM142963v = (ReceiveChannel) this.L$3;
            objectRef = (Ref.ObjectRef) this.L$2;
            receiveChannel = (ReceiveChannel) this.L$1;
            friVar = (fri) this.L$0;
            ResultKt.m87239b(obj);
        }
        while (objectRef.element != su40.f166435c) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.mo94311e(receiveChannel.mo93893o(), new FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannelM142963v, null));
            selectImplementation.mo94311e(receiveChannelM142963v.mo93910z(), new FlowKt__DelayKt$sample$2$1$2(objectRef, friVar, null));
            this.L$0 = friVar;
            this.L$1 = receiveChannel;
            this.L$2 = objectRef;
            this.L$3 = receiveChannelM142963v;
            this.label = 1;
            if (selectImplementation.mo94316p(this) == objM196133e) {
                return objM196133e;
            }
        }
        return Unit.INSTANCE;
    }
}
