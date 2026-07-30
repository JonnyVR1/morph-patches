package androidx.work.impl.workers;

import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.AbstractC0762b;
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
import kotlinx.coroutines.InterfaceC15486o;
import p149l.gnr;
import p149l.haq0;
import p149l.jh3;
import p149l.ppb;
import p149l.qkq0;
import p149l.txv;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m87232d2 = {"Ll/ppb;", "Landroidx/work/b$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ll/ppb;)Landroidx/work/b$a;"}, m87233k = 3, m87234mv = {1, 8, 0})
@DebugMetadata(m87373c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", m87374f = "ConstraintTrackingWorker.kt", m87375l = {134}, m87376m = "invokeSuspend")
@SourceDebugExtension
public final class ConstraintTrackingWorker$runWorker$2 extends SuspendLambda implements Function2<ppb, Continuation<? super AbstractC0762b.a>, Object> {
    final /* synthetic */ AbstractC0762b $delegate;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ haq0 $workSpec;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$runWorker$2(AbstractC0762b abstractC0762b, WorkConstraintsTracker workConstraintsTracker, haq0 haq0Var, Continuation<? super ConstraintTrackingWorker$runWorker$2> continuation) {
        super(2, continuation);
        this.$delegate = abstractC0762b;
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = haq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
        constraintTrackingWorker$runWorker$2.L$0 = obj;
        return constraintTrackingWorker$runWorker$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ppb ppbVar, Continuation<? super AbstractC0762b.a> continuation) {
        return ((ConstraintTrackingWorker$runWorker$2) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.o] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        AtomicInteger atomicInteger;
        gnr<AbstractC0762b.a> gnrVar;
        InterfaceC15486o interfaceC15486o;
        CancellationException cancellationException;
        boolean z;
        Object objM196133e = uwp.m196133e();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.m87239b(obj);
                ppb ppbVar = (ppb) this.L$0;
                AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                gnr<AbstractC0762b.a> gnrVarStartWork = this.$delegate.startWork();
                gnrVarStartWork.getClass();
                InterfaceC15486o interfaceC15486oM141367d = jh3.m141367d(ppbVar, null, null, new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, atomicInteger2, gnrVarStartWork, null), 3, null);
                try {
                    this.L$0 = atomicInteger2;
                    this.L$1 = gnrVarStartWork;
                    this.L$2 = interfaceC15486oM141367d;
                    this.label = 1;
                    Object objM876b = ListenableFutureKt.m876b(gnrVarStartWork, this);
                    if (objM876b == objM196133e) {
                        return objM196133e;
                    }
                    gnrVar = gnrVarStartWork;
                    obj = objM876b;
                    atomicInteger = atomicInteger2;
                    interfaceC15486o = interfaceC15486oM141367d;
                } catch (CancellationException e) {
                    e = e;
                    atomicInteger = atomicInteger2;
                    gnrVar = gnrVarStartWork;
                    cancellationException = e;
                    String str = ConstraintTrackingWorkerKt.f3622a;
                    AbstractC0762b abstractC0762b = this.$delegate;
                    txv.m190976e().mo190980b(str, "Delegated worker " + abstractC0762b.getClass() + " was cancelled", cancellationException);
                    if (atomicInteger.get() != -256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (gnrVar.isCancelled()) {
                        throw cancellationException;
                    }
                    throw cancellationException;
                } catch (Throwable th2) {
                    th = th2;
                    String str2 = ConstraintTrackingWorkerKt.f3622a;
                    AbstractC0762b abstractC0762b2 = this.$delegate;
                    txv.m190976e().mo190980b(str2, "Delegated worker " + abstractC0762b2.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            } else {
                if (r1 != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC15486o = (InterfaceC15486o) this.L$2;
                gnrVar = (gnr) this.L$1;
                atomicInteger = (AtomicInteger) this.L$0;
                try {
                    ResultKt.m87239b(obj);
                } catch (CancellationException e2) {
                    e = e2;
                    cancellationException = e;
                    String str3 = ConstraintTrackingWorkerKt.f3622a;
                    AbstractC0762b abstractC0762b3 = this.$delegate;
                    txv.m190976e().mo190980b(str3, "Delegated worker " + abstractC0762b3.getClass() + " was cancelled", cancellationException);
                    if (atomicInteger.get() != -256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (gnrVar.isCancelled() || !z) {
                        throw cancellationException;
                    }
                    throw new ConstraintTrackingWorker.ConstraintUnsatisfiedException(atomicInteger.get());
                } catch (Throwable th3) {
                    th = th3;
                    String str4 = ConstraintTrackingWorkerKt.f3622a;
                    AbstractC0762b abstractC0762b4 = this.$delegate;
                    txv.m190976e().mo190980b(str4, "Delegated worker " + abstractC0762b4.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            }
            AbstractC0762b.a aVar = (AbstractC0762b.a) obj;
            InterfaceC15486o.a.m94245a(interfaceC15486o, null, 1, null);
            return aVar;
        } catch (Throwable th4) {
            InterfaceC15486o.a.m94245a(r1, null, 1, null);
            throw th4;
        }
    }
}
