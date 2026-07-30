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
import p153l.aui;
import p153l.bui;
import p153l.drb;
import p153l.fui;
import p153l.h350;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/drb;", "Ll/bui;", "downstream", "", "<anonymous>", "(Ll/drb;Ll/bui;)V"}, m88122k = 3, m88123mv = {1, 9, 0})
@DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m88263f = "Delay.kt", m88264l = {HttpStatus.UNSUPPORTED_MEDIA_TYPE_415}, m88265m = "invokeSuspend")
@SourceDebugExtension
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements Function3<drb, bui<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ aui<Object> $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, aui<Object> auiVar, Continuation<? super FlowKt__DelayKt$sample$2> continuation) {
        super(3, continuation);
        this.$periodMillis = j;
        this.$this_sample = auiVar;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull drb drbVar, @NotNull bui<Object> buiVar, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, continuation);
        flowKt__DelayKt$sample$2.L$0 = drbVar;
        flowKt__DelayKt$sample$2.L$1 = buiVar;
        return flowKt__DelayKt$sample$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ReceiveChannel receiveChannel;
        ReceiveChannel<Unit> receiveChannelM127498v;
        Ref.ObjectRef objectRef;
        bui buiVar;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = (drb) this.L$0;
            bui buiVar2 = (bui) this.L$1;
            ReceiveChannel receiveChannelM94874d = ProduceKt.m94874d(drbVar, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            receiveChannel = receiveChannelM94874d;
            receiveChannelM127498v = fui.m127498v(drbVar, this.$periodMillis);
            objectRef = objectRef2;
            buiVar = buiVar2;
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            receiveChannelM127498v = (ReceiveChannel) this.L$3;
            objectRef = (Ref.ObjectRef) this.L$2;
            receiveChannel = (ReceiveChannel) this.L$1;
            buiVar = (bui) this.L$0;
            ResultKt.m88128b(obj);
        }
        while (objectRef.element != h350.f107616c) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.mo95204e(receiveChannel.mo94785o(), new FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannelM127498v, null));
            selectImplementation.mo95204e(receiveChannelM127498v.mo94802z(), new FlowKt__DelayKt$sample$2$1$2(objectRef, buiVar, null));
            this.L$0 = buiVar;
            this.L$1 = receiveChannel;
            this.L$2 = objectRef;
            this.L$3 = receiveChannelM127498v;
            this.label = 1;
            if (selectImplementation.mo95209p(this) == objM198688e) {
                return objM198688e;
            }
        }
        return Unit.INSTANCE;
    }
}
