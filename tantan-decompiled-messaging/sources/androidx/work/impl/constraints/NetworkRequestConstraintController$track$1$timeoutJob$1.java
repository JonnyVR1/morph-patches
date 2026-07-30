package androidx.work.impl.constraints;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import p149l.ad90;
import p149l.ppb;
import p149l.qkq0;
import p149l.txv;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", m87374f = "WorkConstraintsTracker.kt", m87375l = {149}, m87376m = "invokeSuspend")
public final class NetworkRequestConstraintController$track$1$timeoutJob$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ ad90<AbstractC0787a> $$this$callbackFlow;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkRequestConstraintController$track$1$timeoutJob$1(NetworkRequestConstraintController networkRequestConstraintController, ad90<? super AbstractC0787a> ad90Var, Continuation<? super NetworkRequestConstraintController$track$1$timeoutJob$1> continuation) {
        super(2, continuation);
        this.this$0 = networkRequestConstraintController;
        this.$$this$callbackFlow = ad90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, this.$$this$callbackFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((NetworkRequestConstraintController$track$1$timeoutJob$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            long j = this.this$0.timeoutMs;
            this.label = 1;
            if (DelayKt.m93611b(j, this) == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        txv.m190976e().mo190979a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.this$0.timeoutMs + " ms");
        this.$$this$callbackFlow.mo93791l(new AbstractC0787a.b(7));
        return Unit.INSTANCE;
    }
}
