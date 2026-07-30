package androidx.work.impl;

import android.content.Context;
import androidx.work.AbstractC0762b;
import androidx.work.impl.utils.WorkForegroundKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p149l.gnr;
import p149l.haq0;
import p149l.ppb;
import p149l.pyi;
import p149l.qkq0;
import p149l.txv;
import p149l.uwp;
import p149l.zei0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/ppb;", "Landroidx/work/b$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ll/ppb;)Landroidx/work/b$a;"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", m87374f = "WorkerWrapper.kt", m87375l = {300, 311}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class WorkerWrapper$runWorker$result$1 extends SuspendLambda implements Function2<ppb, Continuation<? super AbstractC0762b.a>, Object> {
    final /* synthetic */ pyi $foregroundUpdater;
    final /* synthetic */ AbstractC0762b $worker;
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$result$1(WorkerWrapper workerWrapper, AbstractC0762b abstractC0762b, pyi pyiVar, Continuation<? super WorkerWrapper$runWorker$result$1> continuation) {
        super(2, continuation);
        this.this$0 = workerWrapper;
        this.$worker = abstractC0762b;
        this.$foregroundUpdater = pyiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkerWrapper$runWorker$result$1(this.this$0, this.$worker, this.$foregroundUpdater, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super AbstractC0762b.a> continuation) {
        return ((WorkerWrapper$runWorker$result$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m87239b(obj);
            Context context = this.this$0.appContext;
            haq0 workSpec = this.this$0.getWorkSpec();
            AbstractC0762b abstractC0762b = this.$worker;
            pyi pyiVar = this.$foregroundUpdater;
            zei0 zei0Var = this.this$0.workTaskExecutor;
            this.label = 1;
            workerWrapper$runWorker$result$1 = this;
            if (WorkForegroundKt.m4631b(context, workSpec, abstractC0762b, pyiVar, zei0Var, workerWrapper$runWorker$result$1) != objM196133e) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.m87239b(obj);
                return obj;
            }
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m87239b(obj);
        workerWrapper$runWorker$result$1 = this;
        String str = WorkerWrapperKt.f3516a;
        WorkerWrapper workerWrapper = workerWrapper$runWorker$result$1.this$0;
        txv.m190976e().mo190979a(str, "Starting work for " + workerWrapper.getWorkSpec().workerClassName);
        gnr<AbstractC0762b.a> gnrVarStartWork = workerWrapper$runWorker$result$1.$worker.startWork();
        gnrVarStartWork.getClass();
        AbstractC0762b abstractC0762b2 = workerWrapper$runWorker$result$1.$worker;
        workerWrapper$runWorker$result$1.label = 2;
        Object objM4504d = WorkerWrapperKt.m4504d(gnrVarStartWork, abstractC0762b2, workerWrapper$runWorker$result$1);
        return objM4504d == objM196133e ? objM196133e : objM4504d;
    }
}
