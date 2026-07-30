package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0764b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.akq0;
import p153l.b16;
import p153l.ckq0;
import p153l.f7f;
import p153l.fgj0;
import p153l.mjq0;
import p153l.njq0;
import p153l.qzv;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;
import p153l.xiq0;
import p153l.zjq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/b$a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RXScreenCaptureService.KEY_INDEX, "Landroidx/work/b;", "delegate", "Landroidx/work/impl/constraints/WorkConstraintsTracker;", "workConstraintsTracker", "Ll/mjq0;", "workSpec", "h", "(Landroidx/work/b;Landroidx/work/impl/constraints/WorkConstraintsTracker;Ll/mjq0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "Landroidx/work/WorkerParameters;", "ConstraintUnsatisfiedException", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters workerParameters;

    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "stopReason", "", "(I)V", "getStopReason", "()I", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
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
    public Object mo4312b(@NotNull Continuation<? super AbstractC0764b.a> continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return vh3.m201255g(f7f.m124439b(backgroundExecutor), new ConstraintTrackingWorker$doWork$2(this, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m4636h(AbstractC0764b abstractC0764b, WorkConstraintsTracker workConstraintsTracker, mjq0 mjq0Var, Continuation<? super AbstractC0764b.a> continuation) throws Throwable {
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
        Object objM94951e = constraintTrackingWorker$runWorker$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = constraintTrackingWorker$runWorker$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objM94951e);
            ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(abstractC0764b, workConstraintsTracker, mjq0Var, null);
            constraintTrackingWorker$runWorker$1.label = 1;
            objM94951e = C15531f.m94951e(constraintTrackingWorker$runWorker$2, constraintTrackingWorker$runWorker$1);
            if (objM94951e == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(objM94951e);
        }
        objM94951e.getClass();
        return objM94951e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m4637i(Continuation<? super AbstractC0764b.a> continuation) throws Throwable {
        ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
        AbstractC0764b abstractC0764bM110385b;
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
        Object objM201255g = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objM201255g);
            String strM4319d = getInputData().m4319d("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (strM4319d == null || strM4319d.length() == 0) {
                qzv.m178829e().mo178834c(ConstraintTrackingWorkerKt.f3622a, "No worker to delegate to.");
                AbstractC0764b.a aVarM4415a = AbstractC0764b.a.m4415a();
                aVarM4415a.getClass();
                return aVarM4415a;
            }
            xiq0 xiq0VarM211153p = xiq0.m211153p(getApplicationContext());
            xiq0VarM211153p.getClass();
            njq0 njq0VarWorkSpecDao = xiq0VarM211153p.m211163u().workSpecDao();
            String string = getId().toString();
            string.getClass();
            mjq0 mjq0VarMo163457v = njq0VarWorkSpecDao.mo163457v(string);
            if (mjq0VarMo163457v == null) {
                AbstractC0764b.a aVarM4415a2 = AbstractC0764b.a.m4415a();
                aVarM4415a2.getClass();
                return aVarM4415a2;
            }
            fgj0 fgj0VarM211162t = xiq0VarM211153p.m211162t();
            fgj0VarM211162t.getClass();
            WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(fgj0VarM211162t);
            if (!workConstraintsTracker.m4580a(mjq0VarMo163457v)) {
                String str = ConstraintTrackingWorkerKt.f3622a;
                qzv.m178829e().mo178832a(str, "Constraints not met for delegate " + strM4319d + ". Requesting retry.");
                AbstractC0764b.a aVarM4416b = AbstractC0764b.a.m4416b();
                aVarM4416b.getClass();
                return aVarM4416b;
            }
            String str2 = ConstraintTrackingWorkerKt.f3622a;
            qzv.m178829e().mo178832a(str2, "Constraints met for delegate " + strM4319d);
            try {
                ckq0 workerFactory = getWorkerFactory();
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                abstractC0764bM110385b = workerFactory.m110385b(applicationContext, strM4319d, this.workerParameters);
                Executor executorMo216345c = this.workerParameters.m4369i().mo216345c();
                executorMo216345c.getClass();
                try {
                    CoroutineDispatcher coroutineDispatcherM124439b = f7f.m124439b(executorMo216345c);
                    try {
                        ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 constraintTrackingWorker$setupAndRunConstraintTrackingWork$5 = new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(this, abstractC0764bM110385b, workConstraintsTracker, mjq0VarMo163457v, null);
                        constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.L$0 = this;
                        constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.L$1 = abstractC0764bM110385b;
                        constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label = 1;
                        objM201255g = vh3.m201255g(coroutineDispatcherM124439b, constraintTrackingWorker$setupAndRunConstraintTrackingWork$5, constraintTrackingWorker$setupAndRunConstraintTrackingWork$1);
                        if (objM201255g == objM198688e) {
                            return objM198688e;
                        }
                        this = this;
                        return (AbstractC0764b.a) objM201255g;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        this = this;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                qzv.m178829e().mo178832a(ConstraintTrackingWorkerKt.f3622a, "No worker to delegate to.");
                b16<zjq0> b16VarM4391r = xiq0VarM211153p.m211158n().m4391r();
                if (b16VarM4391r != null) {
                    akq0.m98612a(b16VarM4391r, new zjq0(strM4319d, this.workerParameters, th), ConstraintTrackingWorkerKt.f3622a);
                }
                AbstractC0764b.a aVarM4415a3 = AbstractC0764b.a.m4415a();
                aVarM4415a3.getClass();
                return aVarM4415a3;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0764b abstractC0764b = (AbstractC0764b) constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.L$1;
            ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.L$0;
            try {
                ResultKt.m88128b(objM201255g);
                abstractC0764bM110385b = abstractC0764b;
                this = constraintTrackingWorker;
                try {
                    return (AbstractC0764b.a) objM201255g;
                } catch (CancellationException e3) {
                    e = e3;
                }
            } catch (CancellationException e4) {
                cancellationException = e4;
                abstractC0764bM110385b = abstractC0764b;
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
                    wtq0.m207906a("Unreachable");
                    return null;
                }
                stopReason = ((ConstraintUnsatisfiedException) cancellationException).getStopReason();
            }
            abstractC0764bM110385b.stop(stopReason);
        }
        if (!(cancellationException instanceof ConstraintUnsatisfiedException)) {
            throw cancellationException;
        }
        AbstractC0764b.a aVarM4416b2 = AbstractC0764b.a.m4416b();
        aVarM4416b2.getClass();
        return aVarM4416b2;
    }
}
