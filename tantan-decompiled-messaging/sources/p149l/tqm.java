package p149l;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class tqm {

    /* JADX INFO: renamed from: b */
    private final Activity f171602b;

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f171601a = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC20250b());

    /* JADX INFO: renamed from: c */
    private ScheduledFuture<?> f171603c = null;

    /* JADX INFO: renamed from: l.tqm$b */
    public static final class ThreadFactoryC20250b implements ThreadFactory {
        private ThreadFactoryC20250b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    public tqm(Activity activity) {
        this.f171602b = activity;
        m190125b();
    }

    /* JADX INFO: renamed from: a */
    private void m190124a() {
        ScheduledFuture<?> scheduledFuture = this.f171603c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f171603c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m190125b() {
        m190124a();
        this.f171603c = this.f171601a.schedule(new qli(this.f171602b), 300L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: c */
    public void m190126c() {
        m190124a();
        this.f171601a.shutdown();
    }
}
