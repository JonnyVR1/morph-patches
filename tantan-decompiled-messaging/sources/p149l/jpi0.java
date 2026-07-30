package p149l;

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
public final class jpi0 {

    /* JADX INFO: renamed from: a */
    private static String f119189a = "ThreadUtils";

    /* JADX INFO: renamed from: b */
    @Nullable
    private static C17839d f119190b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private static C17839d f119191c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private static C17839d f119192d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private static C17839d f119193e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private static C17839d f119194f;

    /* JADX INFO: renamed from: g */
    private static final TimeUnit f119195g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: l.jpi0$a */
    public static class RunnableC17836a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f119196a;

        public RunnableC17836a(Runnable runnable) {
            this.f119196a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Thread threadCurrentThread = Thread.currentThread();
            String strM113758b = dv0.m113758b();
            String name = threadCurrentThread.getName();
            long id = threadCurrentThread.getId();
            String name2 = this.f119196a.getClass().getName();
            MDLog.m7390d(jpi0.f119189a, "--> Thread start: [%s][%s][%s][%s]", name, Long.valueOf(id), strM113758b, name2);
            this.f119196a.run();
            MDLog.m7390d(jpi0.f119189a, "--> Thread end: [%s][%s][%s][%s]", name, Long.valueOf(id), strM113758b, name2);
        }
    }

    /* JADX INFO: renamed from: l.jpi0$b */
    public static final class C17837b extends Thread {
        public C17837b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* JADX INFO: renamed from: l.jpi0$c */
    public static final class ThreadFactoryC17838c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f119197a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        private final int f119198b;

        public ThreadFactoryC17838c(int i) {
            this.f119198b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = "MMT" + this.f119198b + " #" + this.f119197a.getAndIncrement();
            if (dv0.f88024c) {
                MDLog.m7390d(jpi0.f119189a, "MomoThreadFactory -> newThread : %s", str);
            }
            C17837b c17837b = new C17837b(runnable, str);
            int i = this.f119198b;
            if (i == 2 || i == 3) {
                c17837b.setPriority(10);
                return c17837b;
            }
            c17837b.setPriority(1);
            return c17837b;
        }
    }

    /* JADX INFO: renamed from: l.jpi0$d */
    public static final class C17839d {

        /* JADX INFO: renamed from: a */
        @Nullable
        private cx00 f119199a = null;

        /* JADX INFO: renamed from: b */
        private final int f119200b;

        /* JADX INFO: renamed from: c */
        private final int f119201c;

        /* JADX INFO: renamed from: d */
        private final int f119202d;

        /* JADX INFO: renamed from: e */
        private final long f119203e;

        /* JADX INFO: renamed from: f */
        @NonNull
        private final TimeUnit f119204f;

        public C17839d(int i, int i2, int i3, long j, @NonNull TimeUnit timeUnit) {
            this.f119200b = i;
            this.f119201c = i2;
            this.f119202d = i3;
            this.f119203e = j;
            this.f119204f = timeUnit;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public synchronized cx00 m142743a() {
            try {
                if (this.f119199a == null) {
                    cx00 cx00Var = new cx00("MME" + this.f119200b, this.f119201c, this.f119202d, this.f119203e, this.f119204f, new LinkedBlockingQueue(), new ThreadFactoryC17838c(this.f119200b), new RejectedExecutionHandlerC17840e(null));
                    this.f119199a = cx00Var;
                    cx00Var.allowCoreThreadTimeOut(true);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f119199a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m142737a(int i) {
        return m142738b(i).m142743a();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static synchronized C17839d m142738b(int i) {
        try {
            if (i == 1) {
                if (f119190b == null) {
                    f119190b = new C17839d(i, 2, 2, 60L, f119195g);
                }
                return f119190b;
            }
            if (i == 2) {
                if (f119192d == null) {
                    if (TextUtils.equals(dv0.m113759c(), dv0.m113758b())) {
                        f119192d = new C17839d(i, 10, 10, 120L, f119195g);
                    } else {
                        f119192d = new C17839d(i, 5, 5, 60L, f119195g);
                    }
                }
                return f119192d;
            }
            if (i == 3) {
                if (f119191c == null) {
                    f119191c = new C17839d(i, 3, 3, 60L, f119195g);
                }
                return f119191c;
            }
            if (i == 4) {
                if (f119193e == null) {
                    f119193e = new C17839d(i, 1, 1, 60L, f119195g);
                }
                return f119193e;
            }
            if (i == 5) {
                if (f119194f == null) {
                    f119194f = new C17839d(i, 2, 2, 60L, f119195g);
                }
                return f119194f;
            }
            throw new IllegalArgumentException("type=" + i + " not recognized");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m142740d(int i, @Nullable Runnable runnable) {
        if (runnable == null) {
            ig3.m135964a("command is null");
        } else if (dv0.f88025d) {
            m142737a(i).execute(m142742f(runnable));
        } else {
            m142741e(i, runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ScheduledFuture<?> m142741e(int i, @Nullable Runnable runnable, long j, @Nullable TimeUnit timeUnit) {
        if (runnable != null) {
            return m142737a(i).schedule(m142742f(runnable), j, timeUnit);
        }
        ig3.m135964a("command is null");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    private static Runnable m142742f(@NonNull Runnable runnable) {
        return dv0.f88024c ? new RunnableC17836a(runnable) : runnable;
    }

    /* JADX INFO: renamed from: l.jpi0$e */
    public static final class RejectedExecutionHandlerC17840e implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC17840e() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            MDLog.m7392e(jpi0.f119189a, "Task %s rejected from %s", runnable, threadPoolExecutor);
        }

        public /* synthetic */ RejectedExecutionHandlerC17840e(RunnableC17836a runnableC17836a) {
            this();
        }
    }
}
