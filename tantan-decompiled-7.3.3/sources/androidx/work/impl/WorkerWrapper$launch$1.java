package androidx.work.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.spongycastle.asn1.eac.EACTags;
import p153l.drb;
import p153l.nbr;
import p153l.po5;
import p153l.qzv;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)Z"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.WorkerWrapper$launch$1", m88263f = "WorkerWrapper.kt", m88264l = {EACTags.FCP_TEMPLATE}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class WorkerWrapper$launch$1 extends SuspendLambda implements Function2<drb, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$launch$1(WorkerWrapper workerWrapper, Continuation<? super WorkerWrapper$launch$1> continuation) {
        super(2, continuation);
        this.this$0 = workerWrapper;
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m4502h(WorkerWrapper.AbstractC0774b abstractC0774b, WorkerWrapper workerWrapper) {
        boolean zM4483u;
        if (abstractC0774b instanceof WorkerWrapper.AbstractC0774b.b) {
            zM4483u = workerWrapper.m4480r(((WorkerWrapper.AbstractC0774b.b) abstractC0774b).getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String());
        } else if (abstractC0774b instanceof WorkerWrapper.AbstractC0774b.a) {
            workerWrapper.m4485w(((WorkerWrapper.AbstractC0774b.a) abstractC0774b).getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String());
            zM4483u = false;
        } else {
            if (!(abstractC0774b instanceof WorkerWrapper.AbstractC0774b.c)) {
                nbr.m162172a();
                return null;
            }
            zM4483u = workerWrapper.m4483u(((WorkerWrapper.AbstractC0774b.c) abstractC0774b).getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
        }
        return Boolean.valueOf(zM4483u);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkerWrapper$launch$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Boolean> continuation) {
        return ((WorkerWrapper$launch$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final WorkerWrapper.AbstractC0774b aVar;
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m88128b(obj);
                po5 po5Var = this.this$0.workerJob;
                WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(this.this$0, null);
                this.label = 1;
                obj = vh3.m201255g(po5Var, workerWrapper$launch$1$resolution$1, this);
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
            aVar = (WorkerWrapper.AbstractC0774b) obj;
        } catch (WorkerStoppedException e) {
            aVar = new WorkerWrapper.AbstractC0774b.c(e.getReason());
        } catch (CancellationException unused) {
            aVar = new WorkerWrapper.AbstractC0774b.a(null, 1, null);
        } catch (Throwable th) {
            qzv.m178829e().mo178835d(WorkerWrapperKt.f3516a, "Unexpected error in WorkerWrapper", th);
            aVar = new WorkerWrapper.AbstractC0774b.a(null, 1, null);
        }
        WorkDatabase workDatabase = this.this$0.workDatabase;
        final WorkerWrapper workerWrapper = this.this$0;
        Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WorkerWrapper$launch$1.m4502h(aVar, workerWrapper);
            }
        });
        objRunInTransaction.getClass();
        return objRunInTransaction;
    }
}
