package p153l;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class vsm {

    /* JADX INFO: renamed from: b */
    private final Activity f185636b;

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f185635a = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC20926b());

    /* JADX INFO: renamed from: c */
    private ScheduledFuture<?> f185637c = null;

    /* JADX INFO: renamed from: l.vsm$b */
    public static final class ThreadFactoryC20926b implements ThreadFactory {
        private ThreadFactoryC20926b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    public vsm(Activity activity) {
        this.f185636b = activity;
        m202639b();
    }

    /* JADX INFO: renamed from: a */
    private void m202638a() {
        ScheduledFuture<?> scheduledFuture = this.f185637c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f185637c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m202639b() {
        m202638a();
        this.f185637c = this.f185635a.schedule(new moi(this.f185636b), 300L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: c */
    public void m202640c() {
        m202638a();
        this.f185635a.shutdown();
    }
}
