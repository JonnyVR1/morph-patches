package androidx.work.impl.workers;

import androidx.work.impl.constraints.AbstractC0787a;
import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p149l.haq0;
import p149l.qkq0;
import p149l.txv;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Landroidx/work/impl/constraints/a;", Careers.f38732it, "", "<anonymous>", "(Landroidx/work/impl/constraints/a;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", m87374f = "ConstraintTrackingWorker.kt", m87375l = {}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2 extends SuspendLambda implements Function2<AbstractC0787a, Continuation<? super Unit>, Object> {
    final /* synthetic */ haq0 $workSpec;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(haq0 haq0Var, Continuation<? super ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2> continuation) {
        super(2, continuation);
        this.$workSpec = haq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(this.$workSpec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC0787a abstractC0787a, Continuation<? super Unit> continuation) {
        return ((ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2) create(abstractC0787a, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uwp.m196133e();
        if (this.label != 0) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        String str = ConstraintTrackingWorkerKt.f3622a;
        haq0 haq0Var = this.$workSpec;
        txv.m190976e().mo190979a(str, "Constraints changed for " + haq0Var);
        return Unit.INSTANCE;
    }
}
