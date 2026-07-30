package com.immomo.mwc.sdk.utils.thread;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p153l.m510;
import p153l.myi0;
import p153l.rqw;
import p153l.wg3;

/* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C4079b {

    /* JADX INFO: renamed from: a */
    private static String f14736a = "ThreadUtils";

    /* JADX INFO: renamed from: b */
    @Nullable
    private static d f14737b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private static d f14738c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private static d f14739d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private static d f14740e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private static d f14741f;

    /* JADX INFO: renamed from: g */
    private static final TimeUnit f14742g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.b$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f14743a;

        public a(Runnable runnable) {
            this.f14743a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Thread threadCurrentThread = Thread.currentThread();
            String strM182677b = rqw.m182677b();
            String name = threadCurrentThread.getName();
            long id = threadCurrentThread.getId();
            String name2 = this.f14743a.getClass().getName();
            String unused = C4079b.f14736a;
            String.format("--> Thread start: [%s][%s][%s][%s]", name, Long.valueOf(id), strM182677b, name2);
            this.f14743a.run();
            String unused2 = C4079b.f14736a;
            String.format("--> Thread end: [%s][%s][%s][%s]", name, Long.valueOf(id), strM182677b, name2);
        }
    }

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.b$b */
    public static final class b extends Thread {
        public b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.b$c */
    public static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f14744a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        private final int f14745b;

        public c(int i) {
            this.f14745b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = "MMT" + this.f14745b + " #" + this.f14744a.getAndIncrement();
            if (rqw.f164527b) {
                String unused = C4079b.f14736a;
                String.format("MomoThreadFactory -> newThread : %s", str);
            }
            b bVar = new b(runnable, str);
            int i = this.f14745b;
            if (i == 2 || i == 3) {
                bVar.setPriority(10);
                return bVar;
            }
            bVar.setPriority(1);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.b$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        @Nullable
        private m510 f14746a = null;

        /* JADX INFO: renamed from: b */
        private final int f14747b;

        /* JADX INFO: renamed from: c */
        private final int f14748c;

        /* JADX INFO: renamed from: d */
        private final int f14749d;

        /* JADX INFO: renamed from: e */
        private final long f14750e;

        /* JADX INFO: renamed from: f */
        @NonNull
        private final TimeUnit f14751f;

        public d(int i, int i2, int i3, long j, @NonNull TimeUnit timeUnit) {
            this.f14747b = i;
            this.f14748c = i2;
            this.f14749d = i3;
            this.f14750e = j;
            this.f14751f = timeUnit;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public synchronized m510 m20453a() {
            try {
                if (this.f14746a == null) {
                    m510 m510Var = new m510("MME" + this.f14747b, this.f14748c, this.f14749d, this.f14750e, this.f14751f, new LinkedBlockingQueue(), new c(this.f14747b), new e(null));
                    this.f14746a = m510Var;
                    m510Var.allowCoreThreadTimeOut(true);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f14746a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m20447a(int i) {
        return m20448b(i).m20453a();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static synchronized d m20448b(int i) {
        try {
            if (i == 1) {
                if (f14737b == null) {
                    f14737b = new d(i, 2, 2, 60L, f14742g);
                }
                return f14737b;
            }
            if (i == 2) {
                if (f14739d == null) {
                    if (TextUtils.equals(rqw.m182678c(), rqw.m182677b())) {
                        f14739d = new d(i, 10, 10, 120L, f14742g);
                    } else {
                        f14739d = new d(i, 5, 5, 60L, f14742g);
                    }
                }
                return f14739d;
            }
            if (i == 3) {
                if (f14738c == null) {
                    f14738c = new d(i, 3, 3, 60L, f14742g);
                }
                return f14738c;
            }
            if (i == 4) {
                if (f14740e == null) {
                    f14740e = new d(i, 1, 1, 60L, f14742g);
                }
                return f14740e;
            }
            if (i == 5) {
                if (f14741f == null) {
                    f14741f = new d(i, 2, 2, 60L, f14742g);
                }
                return f14741f;
            }
            throw new IllegalArgumentException("type=" + i + " not recognized");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m20450d(int i, @Nullable Runnable runnable) {
        if (runnable == null) {
            wg3.m206174a("command is null");
        } else if (rqw.f164528c) {
            m20447a(i).execute(m20452f(runnable));
        } else {
            m20451e(i, runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ScheduledFuture<?> m20451e(int i, @Nullable Runnable runnable, long j, @Nullable TimeUnit timeUnit) {
        if (runnable != null) {
            return m20447a(i).schedule(m20452f(runnable), j, timeUnit);
        }
        wg3.m206174a("command is null");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    private static Runnable m20452f(@NonNull Runnable runnable) {
        return rqw.f164527b ? new a(runnable) : runnable;
    }

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.utils.thread.b$e */
    public static final class e implements RejectedExecutionHandler {
        private e() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Log.e(C4079b.f14736a, String.format("Task %s rejected from %s", runnable, threadPoolExecutor));
            if (SafeExecutor.INSTANCE.m20446b(runnable)) {
                myi0.m160795a(runnable, threadPoolExecutor);
            }
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
