package androidx.work.impl.workers;

import androidx.work.AbstractC0764b;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import com.momo.momortc.MMConstants;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p153l.drb;
import p153l.hpr;
import p153l.mjq0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1", m88263f = "ConstraintTrackingWorker.kt", m88264l = {MMConstants.ERR_WATERMARK_READ}, m88265m = "invokeSuspend")
public final class ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ AtomicInteger $atomicReason;
    final /* synthetic */ hpr<AbstractC0764b.a> $future;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ mjq0 $workSpec;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(WorkConstraintsTracker workConstraintsTracker, mjq0 mjq0Var, AtomicInteger atomicInteger, hpr<AbstractC0764b.a> hprVar, Continuation<? super ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1> continuation) {
        super(2, continuation);
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = mjq0Var;
        this.$atomicReason = atomicInteger;
        this.$future = hprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, this.$atomicReason, this.$future, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            WorkConstraintsTracker workConstraintsTracker = this.$workConstraintsTracker;
            mjq0 mjq0Var = this.$workSpec;
            this.label = 1;
            obj = ConstraintTrackingWorkerKt.m4640c(workConstraintsTracker, mjq0Var, this);
            if (obj == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        this.$atomicReason.set(((Number) obj).intValue());
        this.$future.cancel(true);
        return Unit.INSTANCE;
    }
}
