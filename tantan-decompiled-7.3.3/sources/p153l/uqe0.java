package p153l;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class uqe0 implements tqe0 {

    /* JADX INFO: renamed from: b */
    public final Executor f180445b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("mLock")
    public Runnable f180446c;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<RunnableC20632a> f180444a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final Object f180447d = new Object();

    /* JADX INFO: renamed from: l.uqe0$a */
    public static class RunnableC20632a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final uqe0 f180448a;

        /* JADX INFO: renamed from: b */
        public final Runnable f180449b;

        public RunnableC20632a(@NonNull uqe0 uqe0Var, @NonNull Runnable runnable) {
            this.f180448a = uqe0Var;
            this.f180449b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f180449b.run();
                synchronized (this.f180448a.f180447d) {
                    this.f180448a.m197329b();
                }
            } catch (Throwable th) {
                synchronized (this.f180448a.f180447d) {
                    this.f180448a.m197329b();
                    throw th;
                }
            }
        }
    }

    public uqe0(@NonNull Executor executor) {
        this.f180445b = executor;
    }

    @Override // p153l.tqe0
    /* JADX INFO: renamed from: B */
    public boolean mo192279B() {
        boolean z;
        synchronized (this.f180447d) {
            z = !this.f180444a.isEmpty();
        }
        return z;
    }

    @GuardedBy("mLock")
    /* JADX INFO: renamed from: b */
    public void m197329b() {
        RunnableC20632a runnableC20632aPoll = this.f180444a.poll();
        this.f180446c = runnableC20632aPoll;
        if (runnableC20632aPoll != null) {
            this.f180445b.execute(runnableC20632aPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        synchronized (this.f180447d) {
            try {
                this.f180444a.add(new RunnableC20632a(this, runnable));
                if (this.f180446c == null) {
                    m197329b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
