package androidx.work.impl.workers;

import androidx.work.impl.constraints.AbstractC0789a;
import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.mjq0;
import p153l.qzv;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Landroidx/work/impl/constraints/a;", Careers.f39580it, "", "<anonymous>", "(Landroidx/work/impl/constraints/a;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", m88263f = "ConstraintTrackingWorker.kt", m88264l = {}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2 extends SuspendLambda implements Function2<AbstractC0789a, Continuation<? super Unit>, Object> {
    final /* synthetic */ mjq0 $workSpec;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(mjq0 mjq0Var, Continuation<? super ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2> continuation) {
        super(2, continuation);
        this.$workSpec = mjq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(this.$workSpec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC0789a abstractC0789a, Continuation<? super Unit> continuation) {
        return ((ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2) create(abstractC0789a, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        uyp.m198688e();
        if (this.label != 0) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        String str = ConstraintTrackingWorkerKt.f3622a;
        mjq0 mjq0Var = this.$workSpec;
        qzv.m178829e().mo178832a(str, "Constraints changed for " + mjq0Var);
        return Unit.INSTANCE;
    }
}
