package androidx.work.impl.workers;

import androidx.work.AbstractC0762b;
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
import p149l.gnr;
import p149l.haq0;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1", m87374f = "ConstraintTrackingWorker.kt", m87375l = {MMConstants.ERR_WATERMARK_READ}, m87376m = "invokeSuspend")
public final class ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
    final /* synthetic */ AtomicInteger $atomicReason;
    final /* synthetic */ gnr<AbstractC0762b.a> $future;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ haq0 $workSpec;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(WorkConstraintsTracker workConstraintsTracker, haq0 haq0Var, AtomicInteger atomicInteger, gnr<AbstractC0762b.a> gnrVar, Continuation<? super ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1> continuation) {
        super(2, continuation);
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = haq0Var;
        this.$atomicReason = atomicInteger;
        this.$future = gnrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, this.$atomicReason, this.$future, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
        return ((ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            WorkConstraintsTracker workConstraintsTracker = this.$workConstraintsTracker;
            haq0 haq0Var = this.$workSpec;
            this.label = 1;
            obj = ConstraintTrackingWorkerKt.m4638c(workConstraintsTracker, haq0Var, this);
            if (obj == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(obj);
        }
        this.$atomicReason.set(((Number) obj).intValue());
        this.$future.cancel(true);
        return Unit.INSTANCE;
    }
}
