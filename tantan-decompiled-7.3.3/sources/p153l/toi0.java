package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class toi0 {
    /* JADX INFO: renamed from: a */
    public static <TResult> TResult m192063a(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.mo15430o()) {
            return (TResult) m192074l(task);
        }
        wer0 wer0Var = new wer0(null);
        m192075m(task, wer0Var);
        wer0Var.m206029a();
        return (TResult) m192074l(task);
    }

    /* JADX INFO: renamed from: b */
    public static <TResult> TResult m192064b(@NonNull Task<TResult> task, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.mo15430o()) {
            return (TResult) m192074l(task);
        }
        wer0 wer0Var = new wer0(null);
        m192075m(task, wer0Var);
        if (wer0Var.m206030b(j, timeUnit)) {
            return (TResult) m192074l(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: c */
    public static <TResult> Task<TResult> m192065c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        m1z0 m1z0Var = new m1z0();
        executor.execute(new g6z0(m1z0Var, callable));
        return m1z0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <TResult> Task<TResult> m192066d() {
        m1z0 m1z0Var = new m1z0();
        m1z0Var.m156731u();
        return m1z0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <TResult> Task<TResult> m192067e(@NonNull Exception exc) {
        m1z0 m1z0Var = new m1z0();
        m1z0Var.m156729s(exc);
        return m1z0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <TResult> Task<TResult> m192068f(TResult tresult) {
        m1z0 m1z0Var = new m1z0();
        m1z0Var.m156730t(tresult);
        return m1z0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static Task<Void> m192069g(@Nullable Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m192068f(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                mnd0.m159157a("null tasks are not accepted");
                return null;
            }
        }
        m1z0 m1z0Var = new m1z0();
        thr0 thr0Var = new thr0(collection.size(), m1z0Var);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            m192075m(it2.next(), thr0Var);
        }
        return m1z0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static Task<Void> m192070h(@Nullable Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? m192068f(null) : m192069g(Arrays.asList(taskArr));
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static Task<List<Task<?>>> m192071i(@Nullable Collection<? extends Task<?>> collection) {
        return m192072j(boi0.f77686a, collection);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static Task<List<Task<?>>> m192072j(@NonNull Executor executor, @Nullable Collection<? extends Task<?>> collection) {
        return (collection == null || collection.isEmpty()) ? m192068f(Collections.EMPTY_LIST) : m192069g(collection).mo15424i(executor, new acr0(collection));
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static Task<List<Task<?>>> m192073k(@Nullable Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? m192068f(Collections.EMPTY_LIST) : m192071i(Arrays.asList(taskArr));
    }

    /* JADX INFO: renamed from: l */
    public static Object m192074l(@NonNull Task task) throws ExecutionException {
        if (task.mo15431p()) {
            return task.mo15427l();
        }
        if (task.mo15429n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo15426k());
    }

    /* JADX INFO: renamed from: m */
    public static void m192075m(Task task, hgr0 hgr0Var) {
        Executor executor = boi0.f77687b;
        task.mo15420e(executor, hgr0Var);
        task.mo15418c(executor, hgr0Var);
        task.mo15416a(executor, hgr0Var);
    }
}
