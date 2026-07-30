package androidx.work;

import android.content.Context;
import androidx.annotation.WorkerThread;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.hkq0;
import p153l.hpr;
import p153l.i1j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Landroidx/work/Worker;", "Landroidx/work/b;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/b$a;", "doWork", "()Landroidx/work/b$a;", "Ll/hpr;", "startWork", "()Ll/hpr;", "Ll/i1j;", "getForegroundInfoAsync", "getForegroundInfo", "()Ll/i1j;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class Worker extends AbstractC0764b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @WorkerThread
    @NotNull
    public abstract AbstractC0764b.a doWork();

    @WorkerThread
    @NotNull
    public i1j getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.AbstractC0764b
    @NotNull
    public hpr<i1j> getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return hkq0.m135643e(backgroundExecutor, new Function0<i1j>() { // from class: androidx.work.Worker.getForegroundInfoAsync.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final i1j invoke() {
                return Worker.this.getForegroundInfo();
            }
        });
    }

    @Override // androidx.work.AbstractC0764b
    @NotNull
    public final hpr<AbstractC0764b.a> startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return hkq0.m135643e(backgroundExecutor, new Function0<AbstractC0764b.a>() { // from class: androidx.work.Worker.startWork.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AbstractC0764b.a invoke() {
                return Worker.this.doWork();
            }
        });
    }
}
