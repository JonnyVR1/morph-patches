package androidx.work.impl.workers;

import androidx.work.AbstractC0764b;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.spongycastle.asn1.eac.EACTags;
import p153l.drb;
import p153l.mjq0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "Landroidx/work/b$a;", "<anonymous>", "(Ll/drb;)Landroidx/work/b$a;"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", m88263f = "ConstraintTrackingWorker.kt", m88264l = {EACTags.FCP_TEMPLATE}, m88265m = "invokeSuspend")
public final class ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 extends SuspendLambda implements Function2<drb, Continuation<? super AbstractC0764b.a>, Object> {
    final /* synthetic */ AbstractC0764b $delegate;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ mjq0 $workSpec;
    int label;
    final /* synthetic */ ConstraintTrackingWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(ConstraintTrackingWorker constraintTrackingWorker, AbstractC0764b abstractC0764b, WorkConstraintsTracker workConstraintsTracker, mjq0 mjq0Var, Continuation<? super ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5> continuation) {
        super(2, continuation);
        this.this$0 = constraintTrackingWorker;
        this.$delegate = abstractC0764b;
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = mjq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(this.this$0, this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super AbstractC0764b.a> continuation) {
        return ((ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m88128b(obj);
                return obj;
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        ConstraintTrackingWorker constraintTrackingWorker = this.this$0;
        AbstractC0764b abstractC0764b = this.$delegate;
        WorkConstraintsTracker workConstraintsTracker = this.$workConstraintsTracker;
        mjq0 mjq0Var = this.$workSpec;
        this.label = 1;
        Object objM4636h = constraintTrackingWorker.m4636h(abstractC0764b, workConstraintsTracker, mjq0Var, this);
        return objM4636h == objM198688e ? objM198688e : objM4636h;
    }
}
