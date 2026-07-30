package p149l;

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
public abstract class q600 {

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f152845b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f152846c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    @NonNull
    @KeepForSdk
    public final jfi0 f152844a = new jfi0();

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public <T> Task<T> m173115a(@NonNull final Executor executor, @NonNull final Callable<T> callable, @NonNull final hf4 hf4Var) {
        Preconditions.checkState(this.f152845b.get() > 0);
        if (hf4Var.mo130731a()) {
            return tfi0.m188732d();
        }
        final jf4 jf4Var = new jf4();
        final sei0 sei0Var = new sei0(jf4Var.m141173b());
        this.f152844a.m141186b(new Executor() { // from class: l.n4y0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (hf4Var.mo130731a()) {
                        jf4Var.m141172a();
                    } else {
                        sei0Var.m183658b(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() { // from class: l.z7y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f202084a.m173122h(hf4Var, jf4Var, callable, sei0Var);
            }
        });
        return sei0Var.m183657a();
    }

    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public boolean m173116b() {
        return this.f152846c.get();
    }

    @KeepForSdk
    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public abstract void mo173117c() throws MlKitException;

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public void m173118d() {
        this.f152845b.incrementAndGet();
    }

    @KeepForSdk
    @WorkerThread
    /* JADX INFO: renamed from: e */
    public abstract void mo173119e();

    @KeepForSdk
    /* JADX INFO: renamed from: f */
    public void m173120f(@NonNull Executor executor) {
        m173121g(executor);
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: g */
    public Task<Void> m173121g(@NonNull Executor executor) {
        Preconditions.checkState(this.f152845b.get() > 0);
        final sei0 sei0Var = new sei0();
        this.f152844a.m141186b(executor, new Runnable() { // from class: l.nzx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f141265a.m173123i(sei0Var);
            }
        });
        return sei0Var.m183657a();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m173122h(hf4 hf4Var, jf4 jf4Var, Callable callable, sei0 sei0Var) {
        try {
            if (hf4Var.mo130731a()) {
                jf4Var.m141172a();
                return;
            }
            try {
                if (!this.f152846c.get()) {
                    mo173117c();
                    this.f152846c.set(true);
                }
                if (hf4Var.mo130731a()) {
                    jf4Var.m141172a();
                    return;
                }
                Object objCall = callable.call();
                if (hf4Var.mo130731a()) {
                    jf4Var.m141172a();
                } else {
                    sei0Var.m183659c(objCall);
                }
            } catch (RuntimeException e) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (Exception e2) {
            if (hf4Var.mo130731a()) {
                jf4Var.m141172a();
            } else {
                sei0Var.m183658b(e2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m173123i(sei0 sei0Var) {
        int iDecrementAndGet = this.f152845b.decrementAndGet();
        Preconditions.checkState(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            mo173119e();
            this.f152846c.set(false);
        }
        qky0.m175393a();
        sei0Var.m183659c(null);
    }
}
