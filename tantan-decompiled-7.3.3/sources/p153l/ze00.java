package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public abstract class ze00 {

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f203968b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f203969c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    @NonNull
    @KeepForSdk
    public final joi0 f203967a = new joi0();

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public <T> Task<T> m219393a(@NonNull final Executor executor, @NonNull final Callable<T> callable, @NonNull final gg4 gg4Var) {
        Preconditions.checkState(this.f203968b.get() > 0);
        if (gg4Var.mo130138a()) {
            return toi0.m192066d();
        }
        final ig4 ig4Var = new ig4();
        final sni0 sni0Var = new sni0(ig4Var.m139764b());
        this.f203967a.m146466b(new Executor() { // from class: l.tdy0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (gg4Var.mo130138a()) {
                        ig4Var.m139763a();
                    } else {
                        sni0Var.m186940b(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() { // from class: l.fhy0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99127a.m219398h(gg4Var, ig4Var, callable, sni0Var);
            }
        });
        return sni0Var.m186939a();
    }

    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public boolean m219394b() {
        return this.f203969c.get();
    }

    @KeepForSdk
    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public abstract void mo117710c() throws MlKitException;

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m219395d() {
        this.f203968b.incrementAndGet();
    }

    @KeepForSdk
    @WorkerThread
    /* JADX INFO: renamed from: e */
    public abstract void mo117711e();

    @KeepForSdk
    /* JADX INFO: renamed from: f */
    public void m219396f(@NonNull Executor executor) {
        m219397g(executor);
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: g */
    public Task<Void> m219397g(@NonNull Executor executor) {
        Preconditions.checkState(this.f203968b.get() > 0);
        final sni0 sni0Var = new sni0();
        this.f203967a.m146466b(executor, new Runnable() { // from class: l.t8y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f172588a.m219399i(sni0Var);
            }
        });
        return sni0Var.m186939a();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m219398h(gg4 gg4Var, ig4 ig4Var, Callable callable, sni0 sni0Var) {
        try {
            if (gg4Var.mo130138a()) {
                ig4Var.m139763a();
                return;
            }
            try {
                if (!this.f203969c.get()) {
                    mo117710c();
                    this.f203969c.set(true);
                }
                if (gg4Var.mo130138a()) {
                    ig4Var.m139763a();
                    return;
                }
                Object objCall = callable.call();
                if (gg4Var.mo130138a()) {
                    ig4Var.m139763a();
                } else {
                    sni0Var.m186941c(objCall);
                }
            } catch (RuntimeException e) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (Exception e2) {
            if (gg4Var.mo130138a()) {
                ig4Var.m139763a();
            } else {
                sni0Var.m186940b(e2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m219399i(sni0 sni0Var) {
        int iDecrementAndGet = this.f203968b.decrementAndGet();
        Preconditions.checkState(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            mo117711e();
            this.f203969c.set(false);
        }
        wty0.m207915a();
        sni0Var.m186941c(null);
    }
}
