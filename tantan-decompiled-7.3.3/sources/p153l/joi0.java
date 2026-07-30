package p153l;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.aspectj.lang.JoinPoint;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class joi0 {

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f122030b;

    /* JADX INFO: renamed from: a */
    public final Object f122029a = new Object();

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final Queue f122031c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f122032d = new AtomicReference();

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public void m146465a() {
        Preconditions.checkState(Thread.currentThread().equals(this.f122032d.get()));
    }

    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public void m146466b(@NonNull Executor executor, @NonNull Runnable runnable) {
        synchronized (this.f122029a) {
            try {
                if (this.f122030b) {
                    this.f122031c.add(new a0z0(executor, runnable, null));
                } else {
                    this.f122030b = true;
                    m146468f(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m146467e() {
        synchronized (this.f122029a) {
            try {
                if (this.f122031c.isEmpty()) {
                    this.f122030b = false;
                } else {
                    a0z0 a0z0Var = (a0z0) this.f122031c.remove();
                    m146468f(a0z0Var.f67769a, a0z0Var.f67770b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m146468f(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: l.rwy0
                @Override // java.lang.Runnable
                public final void run() {
                    c3z0 c3z0Var = new c3z0(this.f165257a, null);
                    try {
                        runnable.run();
                        c3z0Var.close();
                    } catch (Throwable th) {
                        try {
                            c3z0Var.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            m146467e();
        }
    }
}
