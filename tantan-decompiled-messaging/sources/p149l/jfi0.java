package p149l;

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
public class jfi0 {

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public boolean f117667b;

    /* JADX INFO: renamed from: a */
    public final Object f117666a = new Object();

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public final Queue f117668c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f117669d = new AtomicReference();

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public void m141185a() {
        Preconditions.checkState(Thread.currentThread().equals(this.f117669d.get()));
    }

    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public void m141186b(@NonNull Executor executor, @NonNull Runnable runnable) {
        synchronized (this.f117666a) {
            try {
                if (this.f117667b) {
                    this.f117668c.add(new uqy0(executor, runnable, null));
                } else {
                    this.f117667b = true;
                    m141188f(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m141187e() {
        synchronized (this.f117666a) {
            try {
                if (this.f117668c.isEmpty()) {
                    this.f117667b = false;
                } else {
                    uqy0 uqy0Var = (uqy0) this.f117668c.remove();
                    m141188f(uqy0Var.f177794a, uqy0Var.f177795b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m141188f(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: l.lny0
                @Override // java.lang.Runnable
                public final void run() {
                    wty0 wty0Var = new wty0(this.f129042a, null);
                    try {
                        runnable.run();
                        wty0Var.close();
                    } catch (Throwable th) {
                        try {
                            wty0Var.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            m141187e();
        }
    }
}
