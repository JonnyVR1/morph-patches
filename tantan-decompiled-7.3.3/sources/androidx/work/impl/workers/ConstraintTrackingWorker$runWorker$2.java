package androidx.work.impl.workers;

import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.AbstractC0764b;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC15593o;
import p153l.drb;
import p153l.hpr;
import p153l.mjq0;
import p153l.qzv;
import p153l.uyp;
import p153l.wtq0;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m88121d2 = {"Ll/drb;", "Landroidx/work/b$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ll/drb;)Landroidx/work/b$a;"}, m88122k = 3, m88123mv = {1, 8, 0})
@DebugMetadata(m88262c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", m88263f = "ConstraintTrackingWorker.kt", m88264l = {134}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class ConstraintTrackingWorker$runWorker$2 extends SuspendLambda implements Function2<drb, Continuation<? super AbstractC0764b.a>, Object> {
    final /* synthetic */ AbstractC0764b $delegate;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ mjq0 $workSpec;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$runWorker$2(AbstractC0764b abstractC0764b, WorkConstraintsTracker workConstraintsTracker, mjq0 mjq0Var, Continuation<? super ConstraintTrackingWorker$runWorker$2> continuation) {
        super(2, continuation);
        this.$delegate = abstractC0764b;
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = mjq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
        constraintTrackingWorker$runWorker$2.L$0 = obj;
        return constraintTrackingWorker$runWorker$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super AbstractC0764b.a> continuation) {
        return ((ConstraintTrackingWorker$runWorker$2) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.o] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        AtomicInteger atomicInteger;
        hpr<AbstractC0764b.a> hprVar;
        InterfaceC15593o interfaceC15593o;
        CancellationException cancellationException;
        boolean z;
        Object objM198688e = uyp.m198688e();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.m88128b(obj);
                drb drbVar = (drb) this.L$0;
                AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                hpr<AbstractC0764b.a> hprVarStartWork = this.$delegate.startWork();
                hprVarStartWork.getClass();
                InterfaceC15593o interfaceC15593oM210980d = xh3.m210980d(drbVar, null, null, new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, atomicInteger2, hprVarStartWork, null), 3, null);
                try {
                    this.L$0 = atomicInteger2;
                    this.L$1 = hprVarStartWork;
                    this.L$2 = interfaceC15593oM210980d;
                    this.label = 1;
                    Object objM877b = ListenableFutureKt.m877b(hprVarStartWork, this);
                    if (objM877b == objM198688e) {
                        return objM198688e;
                    }
                    hprVar = hprVarStartWork;
                    obj = objM877b;
                    atomicInteger = atomicInteger2;
                    interfaceC15593o = interfaceC15593oM210980d;
                } catch (CancellationException e) {
                    e = e;
                    atomicInteger = atomicInteger2;
                    hprVar = hprVarStartWork;
                    cancellationException = e;
                    String str = ConstraintTrackingWorkerKt.f3622a;
                    AbstractC0764b abstractC0764b = this.$delegate;
                    qzv.m178829e().mo178833b(str, "Delegated worker " + abstractC0764b.getClass() + " was cancelled", cancellationException);
                    if (atomicInteger.get() != -256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (hprVar.isCancelled()) {
                        throw cancellationException;
                    }
                    throw cancellationException;
                } catch (Throwable th2) {
                    th = th2;
                    String str2 = ConstraintTrackingWorkerKt.f3622a;
                    AbstractC0764b abstractC0764b2 = this.$delegate;
                    qzv.m178829e().mo178833b(str2, "Delegated worker " + abstractC0764b2.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            } else {
                if (r1 != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC15593o = (InterfaceC15593o) this.L$2;
                hprVar = (hpr) this.L$1;
                atomicInteger = (AtomicInteger) this.L$0;
                try {
                    ResultKt.m88128b(obj);
                } catch (CancellationException e2) {
                    e = e2;
                    cancellationException = e;
                    String str3 = ConstraintTrackingWorkerKt.f3622a;
                    AbstractC0764b abstractC0764b3 = this.$delegate;
                    qzv.m178829e().mo178833b(str3, "Delegated worker " + abstractC0764b3.getClass() + " was cancelled", cancellationException);
                    if (atomicInteger.get() != -256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (hprVar.isCancelled() || !z) {
                        throw cancellationException;
                    }
                    throw new ConstraintTrackingWorker.ConstraintUnsatisfiedException(atomicInteger.get());
                } catch (Throwable th3) {
                    th = th3;
                    String str4 = ConstraintTrackingWorkerKt.f3622a;
                    AbstractC0764b abstractC0764b4 = this.$delegate;
                    qzv.m178829e().mo178833b(str4, "Delegated worker " + abstractC0764b4.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            }
            AbstractC0764b.a aVar = (AbstractC0764b.a) obj;
            InterfaceC15593o.a.m95138a(interfaceC15593o, null, 1, null);
            return aVar;
        } catch (Throwable th4) {
            InterfaceC15593o.a.m95138a(r1, null, 1, null);
            throw th4;
        }
    }
}
