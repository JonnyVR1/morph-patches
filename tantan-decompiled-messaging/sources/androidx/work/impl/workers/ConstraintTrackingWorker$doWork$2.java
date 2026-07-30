package androidx.work.impl.workers;

import androidx.work.AbstractC0762b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p149l.ppb;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "Landroidx/work/b$a;", "<anonymous>", "(Ll/ppb;)Landroidx/work/b$a;"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2", m87374f = "ConstraintTrackingWorker.kt", m87375l = {58}, m87376m = "invokeSuspend")
public final class ConstraintTrackingWorker$doWork$2 extends SuspendLambda implements Function2<ppb, Continuation<? super AbstractC0762b.a>, Object> {
    int label;
    final /* synthetic */ ConstraintTrackingWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$doWork$2(ConstraintTrackingWorker constraintTrackingWorker, Continuation<? super ConstraintTrackingWorker$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = constraintTrackingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConstraintTrackingWorker$doWork$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super AbstractC0762b.a> continuation) {
        return ((ConstraintTrackingWorker$doWork$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        this.label = 1;
        Object objM4635i = constraintTrackingWorker.m4635i(this);
        return objM4635i == objM196133e ? objM196133e : objM4635i;
    }
}
