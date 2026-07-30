package p149l;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class pie0 implements oie0 {

    /* JADX INFO: renamed from: b */
    public final Executor f149548b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("mLock")
    public Runnable f149549c;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<RunnableC19233a> f149547a = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final Object f149550d = new Object();

    /* JADX INFO: renamed from: l.pie0$a */
    public static class RunnableC19233a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final pie0 f149551a;

        /* JADX INFO: renamed from: b */
        public final Runnable f149552b;

        public RunnableC19233a(@NonNull pie0 pie0Var, @NonNull Runnable runnable) {
            this.f149551a = pie0Var;
            this.f149552b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f149552b.run();
                synchronized (this.f149551a.f149550d) {
                    this.f149551a.m169599b();
                }
            } catch (Throwable th) {
                synchronized (this.f149551a.f149550d) {
                    this.f149551a.m169599b();
                    throw th;
                }
            }
        }
    }

    public pie0(@NonNull Executor executor) {
        this.f149548b = executor;
    }

    @Override // p149l.oie0
    /* JADX INFO: renamed from: B */
    public boolean mo164507B() {
        boolean z;
        synchronized (this.f149550d) {
            z = !this.f149547a.isEmpty();
        }
        return z;
    }

    @GuardedBy("mLock")
    /* JADX INFO: renamed from: b */
    public void m169599b() {
        RunnableC19233a runnableC19233aPoll = this.f149547a.poll();
        this.f149549c = runnableC19233aPoll;
        if (runnableC19233aPoll != null) {
            this.f149548b.execute(runnableC19233aPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        synchronized (this.f149550d) {
            try {
                this.f149547a.add(new RunnableC19233a(this, runnable));
                if (this.f149549c == null) {
                    m169599b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
