package androidx.work.impl.workers;

import androidx.work.AbstractC0762b;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.spongycastle.asn1.eac.EACTags;
import p149l.haq0;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "Landroidx/work/b$a;", "<anonymous>", "(Ll/ppb;)Landroidx/work/b$a;"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", m87374f = "ConstraintTrackingWorker.kt", m87375l = {EACTags.FCP_TEMPLATE}, m87376m = "invokeSuspend")
public final class ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 extends SuspendLambda implements Function2<ppb, Continuation<? super AbstractC0762b.a>, Object> {
    final /* synthetic */ AbstractC0762b $delegate;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ haq0 $workSpec;
    int label;
    final /* synthetic */ ConstraintTrackingWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(ConstraintTrackingWorker constraintTrackingWorker, AbstractC0762b abstractC0762b, WorkConstraintsTracker workConstraintsTracker, haq0 haq0Var, Continuation<? super ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5> continuation) {
        super(2, continuation);
        this.this$0 = constraintTrackingWorker;
        this.$delegate = abstractC0762b;
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = haq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(this.this$0, this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super AbstractC0762b.a> continuation) {
        return ((ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.m87239b(obj);
                return obj;
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        ConstraintTrackingWorker constraintTrackingWorker = this.this$0;
        AbstractC0762b abstractC0762b = this.$delegate;
        WorkConstraintsTracker workConstraintsTracker = this.$workConstraintsTracker;
        haq0 haq0Var = this.$workSpec;
        this.label = 1;
        Object objM4634h = constraintTrackingWorker.m4634h(abstractC0762b, workConstraintsTracker, haq0Var, this);
        return objM4634h == objM196133e ? objM196133e : objM4634h;
    }
}
