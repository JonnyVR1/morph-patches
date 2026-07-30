package androidx.work.impl.constraints;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import p153l.drb;
import p153l.el90;
import p153l.qzv;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", m88263f = "WorkConstraintsTracker.kt", m88264l = {149}, m88265m = "invokeSuspend")
public final class NetworkRequestConstraintController$track$1$timeoutJob$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ el90<AbstractC0789a> $$this$callbackFlow;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkRequestConstraintController$track$1$timeoutJob$1(NetworkRequestConstraintController networkRequestConstraintController, el90<? super AbstractC0789a> el90Var, Continuation<? super NetworkRequestConstraintController$track$1$timeoutJob$1> continuation) {
        super(2, continuation);
        this.this$0 = networkRequestConstraintController;
        this.$$this$callbackFlow = el90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, this.$$this$callbackFlow, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((NetworkRequestConstraintController$track$1$timeoutJob$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            long j = this.this$0.timeoutMs;
            this.label = 1;
            if (DelayKt.m94502b(j, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.this$0.timeoutMs + " ms");
        this.$$this$callbackFlow.mo94683l(new AbstractC0789a.b(7));
        return Unit.INSTANCE;
    }
}
