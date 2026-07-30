package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class wqd implements ThreadFactory {

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f187683d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f187684a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final ThreadGroup f187685b;

    /* JADX INFO: renamed from: c */
    public final String f187686c;

    /* JADX INFO: renamed from: l.wqd$a */
    public class C20943a implements Thread.UncaughtExceptionHandler {
        public C20943a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            ksm.f124490c.info("Injecter::", "Running task appeared exception! Thread [" + thread.getName() + "], because [" + th.getMessage() + Constants.AES_SUFFIX);
        }
    }

    public wqd() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f187685b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.f187686c = "Injecter task pool No." + f187683d.getAndIncrement() + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f187686c + this.f187684a.getAndIncrement();
        ksm.f124490c.info("Injecter::", "Thread production, name is [" + str + Constants.AES_SUFFIX);
        Thread thread = new Thread(this.f187685b, runnable, str, 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        thread.setUncaughtExceptionHandler(new C20943a());
        return thread;
    }
}
