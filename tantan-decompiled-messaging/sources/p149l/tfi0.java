package p149l;

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
public final class tfi0 {
    /* JADX INFO: renamed from: a */
    public static <TResult> TResult m188729a(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.mo15376o()) {
            return (TResult) m188740l(task);
        }
        q5r0 q5r0Var = new q5r0(null);
        m188741m(task, q5r0Var);
        q5r0Var.m173099a();
        return (TResult) m188740l(task);
    }

    /* JADX INFO: renamed from: b */
    public static <TResult> TResult m188730b(@NonNull Task<TResult> task, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.mo15376o()) {
            return (TResult) m188740l(task);
        }
        q5r0 q5r0Var = new q5r0(null);
        m188741m(task, q5r0Var);
        if (q5r0Var.m173100b(j, timeUnit)) {
            return (TResult) m188740l(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: c */
    public static <TResult> Task<TResult> m188731c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        gsy0 gsy0Var = new gsy0();
        executor.execute(new axy0(gsy0Var, callable));
        return gsy0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <TResult> Task<TResult> m188732d() {
        gsy0 gsy0Var = new gsy0();
        gsy0Var.m127861u();
        return gsy0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <TResult> Task<TResult> m188733e(@NonNull Exception exc) {
        gsy0 gsy0Var = new gsy0();
        gsy0Var.m127859s(exc);
        return gsy0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <TResult> Task<TResult> m188734f(TResult tresult) {
        gsy0 gsy0Var = new gsy0();
        gsy0Var.m127860t(tresult);
        return gsy0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static Task<Void> m188735g(@Nullable Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m188734f(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                jfd0.m141176a("null tasks are not accepted");
                return null;
            }
        }
        gsy0 gsy0Var = new gsy0();
        n8r0 n8r0Var = new n8r0(collection.size(), gsy0Var);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            m188741m(it2.next(), n8r0Var);
        }
        return gsy0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static Task<Void> m188736h(@Nullable Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? m188734f(null) : m188735g(Arrays.asList(taskArr));
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static Task<List<Task<?>>> m188737i(@Nullable Collection<? extends Task<?>> collection) {
        return m188738j(bfi0.f75320a, collection);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static Task<List<Task<?>>> m188738j(@NonNull Executor executor, @Nullable Collection<? extends Task<?>> collection) {
        return (collection == null || collection.isEmpty()) ? m188734f(Collections.EMPTY_LIST) : m188735g(collection).mo15370i(executor, new u2r0(collection));
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static Task<List<Task<?>>> m188739k(@Nullable Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? m188734f(Collections.EMPTY_LIST) : m188737i(Arrays.asList(taskArr));
    }

    /* JADX INFO: renamed from: l */
    public static Object m188740l(@NonNull Task task) throws ExecutionException {
        if (task.mo15377p()) {
            return task.mo15373l();
        }
        if (task.mo15375n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo15372k());
    }

    /* JADX INFO: renamed from: m */
    public static void m188741m(Task task, b7r0 b7r0Var) {
        Executor executor = bfi0.f75321b;
        task.mo15366e(executor, b7r0Var);
        task.mo15364c(executor, b7r0Var);
        task.mo15362a(executor, b7r0Var);
    }
}
