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
import p149l.hh3;
import p149l.l9r;
import p149l.ln5;
import p149l.ppb;
import p149l.qkq0;
import p149l.txv;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)Z"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.WorkerWrapper$launch$1", m87374f = "WorkerWrapper.kt", m87375l = {EACTags.FCP_TEMPLATE}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class WorkerWrapper$launch$1 extends SuspendLambda implements Function2<ppb, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$launch$1(WorkerWrapper workerWrapper, Continuation<? super WorkerWrapper$launch$1> continuation) {
        super(2, continuation);
        this.this$0 = workerWrapper;
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m4500h(WorkerWrapper.AbstractC0772b abstractC0772b, WorkerWrapper workerWrapper) {
        boolean zM4481u;
        if (abstractC0772b instanceof WorkerWrapper.AbstractC0772b.b) {
            zM4481u = workerWrapper.m4478r(((WorkerWrapper.AbstractC0772b.b) abstractC0772b).getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String());
        } else if (abstractC0772b instanceof WorkerWrapper.AbstractC0772b.a) {
            workerWrapper.m4483w(((WorkerWrapper.AbstractC0772b.a) abstractC0772b).getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String());
            zM4481u = false;
        } else {
            if (!(abstractC0772b instanceof WorkerWrapper.AbstractC0772b.c)) {
                l9r.m149037a();
                return null;
            }
            zM4481u = workerWrapper.m4481u(((WorkerWrapper.AbstractC0772b.c) abstractC0772b).getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
        }
        return Boolean.valueOf(zM4481u);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkerWrapper$launch$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super Boolean> continuation) {
        return ((WorkerWrapper$launch$1) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final WorkerWrapper.AbstractC0772b aVar;
        Object objM196133e = uwp.m196133e();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.m87239b(obj);
                ln5 ln5Var = this.this$0.workerJob;
                WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(this.this$0, null);
                this.label = 1;
                obj = hh3.m130938g(ln5Var, workerWrapper$launch$1$resolution$1, this);
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
            aVar = (WorkerWrapper.AbstractC0772b) obj;
        } catch (WorkerStoppedException e) {
            aVar = new WorkerWrapper.AbstractC0772b.c(e.getReason());
        } catch (CancellationException unused) {
            aVar = new WorkerWrapper.AbstractC0772b.a(null, 1, null);
        } catch (Throwable th) {
            txv.m190976e().mo190982d(WorkerWrapperKt.f3516a, "Unexpected error in WorkerWrapper", th);
            aVar = new WorkerWrapper.AbstractC0772b.a(null, 1, null);
        }
        WorkDatabase workDatabase = this.this$0.workDatabase;
        final WorkerWrapper workerWrapper = this.this$0;
        Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WorkerWrapper$launch$1.m4500h(aVar, workerWrapper);
            }
        });
        objRunInTransaction.getClass();
        return objRunInTransaction;
    }
}
