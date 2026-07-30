package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0762b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b7j0;
import p149l.haq0;
import p149l.hh3;
import p149l.iaq0;
import p149l.qkq0;
import p149l.s9q0;
import p149l.txv;
import p149l.uaq0;
import p149l.uwp;
import p149l.vaq0;
import p149l.wz5;
import p149l.xaq0;
import p149l.z5f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/b$a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RXScreenCaptureService.KEY_INDEX, "Landroidx/work/b;", "delegate", "Landroidx/work/impl/constraints/WorkConstraintsTracker;", "workConstraintsTracker", "Ll/haq0;", "workSpec", "h", "(Landroidx/work/b;Landroidx/work/impl/constraints/WorkConstraintsTracker;Ll/haq0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "Landroidx/work/WorkerParameters;", "ConstraintUnsatisfiedException", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters workerParameters;

    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "stopReason", "", "(I)V", "getStopReason", "()I", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        public ConstraintUnsatisfiedException(int i) {
            this.stopReason = i;
        }

        public final int getStopReason() {
            return this.stopReason;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.workerParameters = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo4310b(@NotNull Continuation<? super AbstractC0762b.a> continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return hh3.m130938g(z5f.m217297b(backgroundExecutor), new ConstraintTrackingWorker$doWork$2(this, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m4634h(AbstractC0762b abstractC0762b, WorkConstraintsTracker workConstraintsTracker, haq0 haq0Var, Continuation<? super AbstractC0762b.a> continuation) throws Throwable {
        ConstraintTrackingWorker$runWorker$1 constraintTrackingWorker$runWorker$1;
        if (continuation instanceof ConstraintTrackingWorker$runWorker$1) {
            constraintTrackingWorker$runWorker$1 = (ConstraintTrackingWorker$runWorker$1) continuation;
            int i = constraintTrackingWorker$runWorker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                constraintTrackingWorker$runWorker$1.label = i - Integer.MIN_VALUE;
            } else {
                constraintTrackingWorker$runWorker$1 = new ConstraintTrackingWorker$runWorker$1(this, continuation);
            }
        } else {
            constraintTrackingWorker$runWorker$1 = new ConstraintTrackingWorker$runWorker$1(this, continuation);
        }
        Object objM94059e = constraintTrackingWorker$runWorker$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = constraintTrackingWorker$runWorker$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(objM94059e);
            ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(abstractC0762b, workConstraintsTracker, haq0Var, null);
            constraintTrackingWorker$runWorker$1.label = 1;
            objM94059e = C15424f.m94059e(constraintTrackingWorker$runWorker$2, constraintTrackingWorker$runWorker$1);
            if (objM94059e == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(objM94059e);
        }
        objM94059e.getClass();
        return objM94059e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m4635i(Continuation<? super AbstractC0762b.a> continuation) throws Throwable {
        ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
        AbstractC0762b abstractC0762bM207667b;
        CancellationException cancellationException;
        int stopReason;
        if (continuation instanceof ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1) {
            constraintTrackingWorker$setupAndRunConstraintTrackingWork$1 = (ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1) continuation;
            int i = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label = i - Integer.MIN_VALUE;
            } else {
                constraintTrackingWorker$setupAndRunConstraintTrackingWork$1 = new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1(this, continuation);
            }
        } else {
            constraintTrackingWorker$setupAndRunConstraintTrackingWork$1 = new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1(this, continuation);
        }
        Object objM130938g = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(objM130938g);
            String strM4317d = getInputData().m4317d("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (strM4317d == null || strM4317d.length() == 0) {
                txv.m190976e().mo190981c(ConstraintTrackingWorkerKt.f3622a, "No worker to delegate to.");
                AbstractC0762b.a aVarM4413a = AbstractC0762b.a.m4413a();
                aVarM4413a.getClass();
                return aVarM4413a;
            }
            s9q0 s9q0VarM182740p = s9q0.m182740p(getApplicationContext());
            s9q0VarM182740p.getClass();
            iaq0 iaq0VarWorkSpecDao = s9q0VarM182740p.m182750u().workSpecDao();
            String string = getId().toString();
            string.getClass();
            haq0 haq0VarMo135190v = iaq0VarWorkSpecDao.mo135190v(string);
            if (haq0VarMo135190v == null) {
                AbstractC0762b.a aVarM4413a2 = AbstractC0762b.a.m4413a();
                aVarM4413a2.getClass();
                return aVarM4413a2;
            }
            b7j0 b7j0VarM182749t = s9q0VarM182740p.m182749t();
            b7j0VarM182749t.getClass();
            WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(b7j0VarM182749t);
            if (!workConstraintsTracker.m4578a(haq0VarMo135190v)) {
                String str = ConstraintTrackingWorkerKt.f3622a;
                txv.m190976e().mo190979a(str, "Constraints not met for delegate " + strM4317d + ". Requesting retry.");
                AbstractC0762b.a aVarM4414b = AbstractC0762b.a.m4414b();
                aVarM4414b.getClass();
                return aVarM4414b;
            }
            String str2 = ConstraintTrackingWorkerKt.f3622a;
            txv.m190976e().mo190979a(str2, "Constraints met for delegate " + strM4317d);
            try {
                xaq0 workerFactory = getWorkerFactory();
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                abstractC0762bM207667b = workerFactory.m207667b(applicationContext, strM4317d, this.workerParameters);
                Executor executorMo187637c = this.workerParameters.m4367i().mo187637c();
                executorMo187637c.getClass();
                try {
                    CoroutineDispatcher coroutineDispatcherM217297b = z5f.m217297b(executorMo187637c);
                    try {
                        ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 constraintTrackingWorker$setupAndRunConstraintTrackingWork$5 = new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(this, abstractC0762bM207667b, workConstraintsTracker, haq0VarMo135190v, null);
                        constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.L$0 = this;
                        constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.L$1 = abstractC0762bM207667b;
                        constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label = 1;
                        objM130938g = hh3.m130938g(coroutineDispatcherM217297b, constraintTrackingWorker$setupAndRunConstraintTrackingWork$5, constraintTrackingWorker$setupAndRunConstraintTrackingWork$1);
                        if (objM130938g == objM196133e) {
                            return objM196133e;
                        }
                        this = this;
                        return (AbstractC0762b.a) objM130938g;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        this = this;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                txv.m190976e().mo190979a(ConstraintTrackingWorkerKt.f3622a, "No worker to delegate to.");
                wz5<uaq0> wz5VarM4389r = s9q0VarM182740p.m182745n().m4389r();
                if (wz5VarM4389r != null) {
                    vaq0.m197647a(wz5VarM4389r, new uaq0(strM4317d, this.workerParameters, th), ConstraintTrackingWorkerKt.f3622a);
                }
                AbstractC0762b.a aVarM4413a3 = AbstractC0762b.a.m4413a();
                aVarM4413a3.getClass();
                return aVarM4413a3;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0762b abstractC0762b = (AbstractC0762b) constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.L$1;
            ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.L$0;
            try {
                ResultKt.m87239b(objM130938g);
                abstractC0762bM207667b = abstractC0762b;
                this = constraintTrackingWorker;
                try {
                    return (AbstractC0762b.a) objM130938g;
                } catch (CancellationException e3) {
                    e = e3;
                }
            } catch (CancellationException e4) {
                cancellationException = e4;
                abstractC0762bM207667b = abstractC0762b;
                this = constraintTrackingWorker;
            }
        }
        cancellationException = e;
        if (this.isStopped() || (cancellationException instanceof ConstraintUnsatisfiedException)) {
            if (Build.VERSION.SDK_INT < 31) {
                stopReason = -512;
            } else if (this.isStopped()) {
                stopReason = this.getStopReason();
            } else {
                if (!(cancellationException instanceof ConstraintUnsatisfiedException)) {
                    qkq0.m175383a("Unreachable");
                    return null;
                }
                stopReason = ((ConstraintUnsatisfiedException) cancellationException).getStopReason();
            }
            abstractC0762bM207667b.stop(stopReason);
        }
        if (!(cancellationException instanceof ConstraintUnsatisfiedException)) {
            throw cancellationException;
        }
        AbstractC0762b.a aVarM4414b2 = AbstractC0762b.a.m4414b();
        aVarM4414b2.getClass();
        return aVarM4414b2;
    }
}
