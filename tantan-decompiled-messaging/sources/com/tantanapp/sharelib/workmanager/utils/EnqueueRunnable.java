package com.tantanapp.sharelib.workmanager.utils;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.sharelib.workmanager.Constraints;
import com.tantanapp.sharelib.workmanager.Result;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import com.tantanapp.sharelib.workmanager.impl.WorkContinuationImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/utils/EnqueueRunnable;", "Ljava/lang/Runnable;", "", "run", "()V", "Lcom/tantanapp/sharelib/workmanager/impl/WorkContinuationImpl;", "workContinuation", Constants.INAPP_DATA_TAG, "(Lcom/tantanapp/sharelib/workmanager/impl/WorkContinuationImpl;)V", "Lcom/tantanapp/sharelib/workmanager/Worker;", "worker", "e", "(Lcom/tantanapp/sharelib/workmanager/Worker;)V", "c", "Lcom/tantanapp/sharelib/workmanager/Constraints;", "a", "(Lcom/tantanapp/sharelib/workmanager/Worker;)Lcom/tantanapp/sharelib/workmanager/Constraints;", "b", "Lcom/tantanapp/sharelib/workmanager/impl/WorkContinuationImpl;", "Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;", "Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;", "realResult", "", "Z", "interrupted", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class EnqueueRunnable implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkContinuationImpl workContinuation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public SettableResult realResult;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean interrupted;

    /* JADX INFO: renamed from: a */
    public final Constraints m81568a(Worker worker) {
        return worker.getInfo().getConstraints();
    }

    /* JADX INFO: renamed from: b */
    public final void m81569b(Worker worker) {
        WorkInfo info = worker.getInfo();
        Result result = this.realResult.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String();
        result.getClass();
        Throwable throwable = ((Result.Failure) result).getThrowable();
        if (throwable == null) {
            throwable = new Exception("Worker " + worker.getInfo().m81553d() + " get exception");
        }
        info.m81554e(throwable);
    }

    /* JADX INFO: renamed from: c */
    public final void m81570c(Worker worker) {
        Constraints constraintsM81568a = m81568a(worker);
        if (constraintsM81568a.m81528b().invoke(constraintsM81568a).booleanValue()) {
            return;
        }
        SettableResult settableResultStartWork = worker.startWork();
        this.realResult = settableResultStartWork;
        if (settableResultStartWork.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String() instanceof Result.Retry) {
            m81570c(worker);
        } else if (this.realResult.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String() instanceof Result.Failure) {
            m81569b(worker);
            this.interrupted = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m81571d(WorkContinuationImpl workContinuation) {
        List<WorkContinuationImpl> listM81564a = workContinuation.m81564a();
        if (listM81564a != null && !listM81564a.isEmpty()) {
            Iterator<T> it = listM81564a.iterator();
            while (it.hasNext()) {
                m81571d((WorkContinuationImpl) it.next());
            }
        }
        for (Worker worker : workContinuation.m81565b()) {
            if (m81568a(worker).getInterruptWhenFailure() && this.interrupted) {
                return;
            }
            workContinuation.m81566c(worker.getInfo());
            m81572e(worker);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m81572e(Worker worker) {
        worker.markEnqueue();
        worker.getInfo().m81555f(this.realResult.m81573a());
        m81570c(worker);
    }

    @Override // java.lang.Runnable
    public void run() {
        m81571d(this.workContinuation);
    }
}
