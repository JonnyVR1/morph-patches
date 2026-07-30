package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class lyi0 {

    /* JADX INFO: renamed from: a */
    private static String f134064a = "ThreadUtils";

    /* JADX INFO: renamed from: b */
    @Nullable
    private static C18499d f134065b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private static C18499d f134066c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private static C18499d f134067d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private static C18499d f134068e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private static C18499d f134069f;

    /* JADX INFO: renamed from: g */
    private static final TimeUnit f134070g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: l.lyi0$a */
    public static class RunnableC18496a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f134071a;

        public RunnableC18496a(Runnable runnable) {
            this.f134071a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Thread threadCurrentThread = Thread.currentThread();
            String strM151648b = kv0.m151648b();
            String name = threadCurrentThread.getName();
            long id = threadCurrentThread.getId();
            String name2 = this.f134071a.getClass().getName();
            MDLog.m7444d(lyi0.f134064a, "--> Thread start: [%s][%s][%s][%s]", name, Long.valueOf(id), strM151648b, name2);
            this.f134071a.run();
            MDLog.m7444d(lyi0.f134064a, "--> Thread end: [%s][%s][%s][%s]", name, Long.valueOf(id), strM151648b, name2);
        }
    }

    /* JADX INFO: renamed from: l.lyi0$b */
    public static final class C18497b extends Thread {
        public C18497b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* JADX INFO: renamed from: l.lyi0$c */
    public static final class ThreadFactoryC18498c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f134072a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        private final int f134073b;

        public ThreadFactoryC18498c(int i) {
            this.f134073b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = "MMT" + this.f134073b + " #" + this.f134072a.getAndIncrement();
            if (kv0.f128936c) {
                MDLog.m7444d(lyi0.f134064a, "MomoThreadFactory -> newThread : %s", str);
            }
            C18497b c18497b = new C18497b(runnable, str);
            int i = this.f134073b;
            if (i == 2 || i == 3) {
                c18497b.setPriority(10);
                return c18497b;
            }
            c18497b.setPriority(1);
            return c18497b;
        }
    }

    /* JADX INFO: renamed from: l.lyi0$d */
    public static final class C18499d {

        /* JADX INFO: renamed from: a */
        @Nullable
        private l510 f134074a = null;

        /* JADX INFO: renamed from: b */
        private final int f134075b;

        /* JADX INFO: renamed from: c */
        private final int f134076c;

        /* JADX INFO: renamed from: d */
        private final int f134077d;

        /* JADX INFO: renamed from: e */
        private final long f134078e;

        /* JADX INFO: renamed from: f */
        @NonNull
        private final TimeUnit f134079f;

        public C18499d(int i, int i2, int i3, long j, @NonNull TimeUnit timeUnit) {
            this.f134075b = i;
            this.f134076c = i2;
            this.f134077d = i3;
            this.f134078e = j;
            this.f134079f = timeUnit;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public synchronized l510 m156292a() {
            try {
                if (this.f134074a == null) {
                    l510 l510Var = new l510("MME" + this.f134075b, this.f134076c, this.f134077d, this.f134078e, this.f134079f, new LinkedBlockingQueue(), new ThreadFactoryC18498c(this.f134075b), new RejectedExecutionHandlerC18500e(null));
                    this.f134074a = l510Var;
                    l510Var.allowCoreThreadTimeOut(true);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f134074a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m156286a(int i) {
        return m156287b(i).m156292a();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static synchronized C18499d m156287b(int i) {
        try {
            if (i == 1) {
                if (f134065b == null) {
                    f134065b = new C18499d(i, 2, 2, 60L, f134070g);
                }
                return f134065b;
            }
            if (i == 2) {
                if (f134067d == null) {
                    if (TextUtils.equals(kv0.m151649c(), kv0.m151648b())) {
                        f134067d = new C18499d(i, 10, 10, 120L, f134070g);
                    } else {
                        f134067d = new C18499d(i, 5, 5, 60L, f134070g);
                    }
                }
                return f134067d;
            }
            if (i == 3) {
                if (f134066c == null) {
                    f134066c = new C18499d(i, 3, 3, 60L, f134070g);
                }
                return f134066c;
            }
            if (i == 4) {
                if (f134068e == null) {
                    f134068e = new C18499d(i, 1, 1, 60L, f134070g);
                }
                return f134068e;
            }
            if (i == 5) {
                if (f134069f == null) {
                    f134069f = new C18499d(i, 2, 2, 60L, f134070g);
                }
                return f134069f;
            }
            throw new IllegalArgumentException("type=" + i + " not recognized");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m156289d(int i, @Nullable Runnable runnable) {
        if (runnable == null) {
            wg3.m206174a("command is null");
        } else if (kv0.f128937d) {
            m156286a(i).execute(m156291f(runnable));
        } else {
            m156290e(i, runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ScheduledFuture<?> m156290e(int i, @Nullable Runnable runnable, long j, @Nullable TimeUnit timeUnit) {
        if (runnable != null) {
            return m156286a(i).schedule(m156291f(runnable), j, timeUnit);
        }
        wg3.m206174a("command is null");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    private static Runnable m156291f(@NonNull Runnable runnable) {
        return kv0.f128936c ? new RunnableC18496a(runnable) : runnable;
    }

    /* JADX INFO: renamed from: l.lyi0$e */
    public static final class RejectedExecutionHandlerC18500e implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC18500e() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            MDLog.m7446e(lyi0.f134064a, "Task %s rejected from %s", runnable, threadPoolExecutor);
        }

        public /* synthetic */ RejectedExecutionHandlerC18500e(RunnableC18496a runnableC18496a) {
            this();
        }
    }
}
