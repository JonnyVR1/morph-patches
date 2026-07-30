package androidx.work.impl;

import android.content.Context;
import androidx.work.AbstractC0764b;
import androidx.work.impl.utils.WorkForegroundKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.drb;
import p153l.hpr;
import p153l.k1j;
import p153l.mjq0;
import p153l.qzv;
import p153l.uyp;
import p153l.wtq0;
import p153l.zni0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/drb;", "Landroidx/work/b$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ll/drb;)Landroidx/work/b$a;"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", m88263f = "WorkerWrapper.kt", m88264l = {300, 311}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class WorkerWrapper$runWorker$result$1 extends SuspendLambda implements Function2<drb, Continuation<? super AbstractC0764b.a>, Object> {
    final /* synthetic */ k1j $foregroundUpdater;
    final /* synthetic */ AbstractC0764b $worker;
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$result$1(WorkerWrapper workerWrapper, AbstractC0764b abstractC0764b, k1j k1jVar, Continuation<? super WorkerWrapper$runWorker$result$1> continuation) {
        super(2, continuation);
        this.this$0 = workerWrapper;
        this.$worker = abstractC0764b;
        this.$foregroundUpdater = k1jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkerWrapper$runWorker$result$1(this.this$0, this.$worker, this.$foregroundUpdater, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super AbstractC0764b.a> continuation) {
        return ((WorkerWrapper$runWorker$result$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            Context context = this.this$0.appContext;
            mjq0 workSpec = this.this$0.getWorkSpec();
            AbstractC0764b abstractC0764b = this.$worker;
            k1j k1jVar = this.$foregroundUpdater;
            zni0 zni0Var = this.this$0.workTaskExecutor;
            this.label = 1;
            workerWrapper$runWorker$result$1 = this;
            if (WorkForegroundKt.m4633b(context, workSpec, abstractC0764b, k1jVar, zni0Var, workerWrapper$runWorker$result$1) != objM198688e) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.m88128b(obj);
                return obj;
            }
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.m88128b(obj);
        workerWrapper$runWorker$result$1 = this;
        String str = WorkerWrapperKt.f3516a;
        WorkerWrapper workerWrapper = workerWrapper$runWorker$result$1.this$0;
        qzv.m178829e().mo178832a(str, "Starting work for " + workerWrapper.getWorkSpec().workerClassName);
        hpr<AbstractC0764b.a> hprVarStartWork = workerWrapper$runWorker$result$1.$worker.startWork();
        hprVarStartWork.getClass();
        AbstractC0764b abstractC0764b2 = workerWrapper$runWorker$result$1.$worker;
        workerWrapper$runWorker$result$1.label = 2;
        Object objM4506d = WorkerWrapperKt.m4506d(hprVarStartWork, abstractC0764b2, workerWrapper$runWorker$result$1);
        return objM4506d == objM198688e ? objM198688e : objM4506d;
    }
}
