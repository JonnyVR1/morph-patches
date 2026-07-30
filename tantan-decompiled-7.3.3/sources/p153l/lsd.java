package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class lsd implements ThreadFactory {

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f133414d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f133415a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final ThreadGroup f133416b;

    /* JADX INFO: renamed from: c */
    public final String f133417c;

    /* JADX INFO: renamed from: l.lsd$a */
    public class C18449a implements Thread.UncaughtExceptionHandler {
        public C18449a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            mum.f138826c.info("Injecter::", "Running task appeared exception! Thread [" + thread.getName() + "], because [" + th.getMessage() + Constants.AES_SUFFIX);
        }
    }

    public lsd() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f133416b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.f133417c = "Injecter task pool No." + f133414d.getAndIncrement() + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f133417c + this.f133415a.getAndIncrement();
        mum.f138826c.info("Injecter::", "Thread production, name is [" + str + Constants.AES_SUFFIX);
        Thread thread = new Thread(this.f133416b, runnable, str, 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        thread.setUncaughtExceptionHandler(new C18449a());
        return thread;
    }
}
