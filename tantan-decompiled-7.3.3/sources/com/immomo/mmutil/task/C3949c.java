package com.immomo.mmutil.task;

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
import p153l.jv0;
import p153l.k510;
import p153l.myi0;
import p153l.wg3;

/* JADX INFO: renamed from: com.immomo.mmutil.task.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C3949c {

    /* JADX INFO: renamed from: a */
    private static String f13687a = "ThreadUtils";

    /* JADX INFO: renamed from: b */
    @Nullable
    private static d f13688b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private static d f13689c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private static d f13690d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private static d f13691e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private static d f13692f;

    /* JADX INFO: renamed from: g */
    private static final TimeUnit f13693g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: com.immomo.mmutil.task.c$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f13694a;

        public a(Runnable runnable) {
            this.f13694a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Thread threadCurrentThread = Thread.currentThread();
            String strM147002b = jv0.m147002b();
            String name = threadCurrentThread.getName();
            long id = threadCurrentThread.getId();
            String name2 = this.f13694a.getClass().getName();
            MDLog.m7444d(C3949c.f13687a, "--> Thread start: [%s][%s][%s][%s]", name, Long.valueOf(id), strM147002b, name2);
            this.f13694a.run();
            MDLog.m7444d(C3949c.f13687a, "--> Thread end: [%s][%s][%s][%s]", name, Long.valueOf(id), strM147002b, name2);
        }
    }

    /* JADX INFO: renamed from: com.immomo.mmutil.task.c$b */
    public static final class b extends Thread {
        public b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* JADX INFO: renamed from: com.immomo.mmutil.task.c$c */
    public static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f13695a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        private final int f13696b;

        public c(int i) {
            this.f13696b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = "MMT" + this.f13696b + " #" + this.f13695a.getAndIncrement();
            if (jv0.f122756b) {
                MDLog.m7444d(C3949c.f13687a, "MomoThreadFactory -> newThread : %s", str);
            }
            b bVar = new b(runnable, str);
            int i = this.f13696b;
            if (i == 2 || i == 3) {
                bVar.setPriority(10);
                return bVar;
            }
            bVar.setPriority(1);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.immomo.mmutil.task.c$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        @Nullable
        private k510 f13697a = null;

        /* JADX INFO: renamed from: b */
        private final int f13698b;

        /* JADX INFO: renamed from: c */
        private final int f13699c;

        /* JADX INFO: renamed from: d */
        private final int f13700d;

        /* JADX INFO: renamed from: e */
        private final long f13701e;

        /* JADX INFO: renamed from: f */
        @NonNull
        private final TimeUnit f13702f;

        public d(int i, int i2, int i3, long j, @NonNull TimeUnit timeUnit) {
            this.f13698b = i;
            this.f13699c = i2;
            this.f13700d = i3;
            this.f13701e = j;
            this.f13702f = timeUnit;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public synchronized k510 m19431a() {
            try {
                if (this.f13697a == null) {
                    k510 k510Var = new k510("MME" + this.f13698b, this.f13699c, this.f13700d, this.f13701e, this.f13702f, new LinkedBlockingQueue(), new c(this.f13698b), new e(null));
                    this.f13697a = k510Var;
                    k510Var.allowCoreThreadTimeOut(true);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f13697a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m19424a(int i) {
        return m19425b(i).m19431a();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static synchronized d m19425b(int i) {
        try {
            if (i == 1) {
                if (f13688b == null) {
                    f13688b = new d(i, 2, 2, 60L, f13693g);
                }
                return f13688b;
            }
            if (i == 2) {
                if (f13690d == null) {
                    if (TextUtils.equals(jv0.m147003c(), jv0.m147002b())) {
                        f13690d = new d(i, 10, 10, 120L, f13693g);
                    } else {
                        f13690d = new d(i, 5, 5, 60L, f13693g);
                    }
                }
                return f13690d;
            }
            if (i == 3) {
                if (f13689c == null) {
                    f13689c = new d(i, 3, 3, 60L, f13693g);
                }
                return f13689c;
            }
            if (i == 4) {
                if (f13691e == null) {
                    f13691e = new d(i, 1, 1, 60L, f13693g);
                }
                return f13691e;
            }
            if (i == 5) {
                if (f13692f == null) {
                    f13692f = new d(i, 2, 2, 60L, f13693g);
                }
                return f13692f;
            }
            throw new IllegalArgumentException("type=" + i + " not recognized");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m19427d(int i, @Nullable Runnable runnable) {
        if (runnable == null) {
            wg3.m206174a("command is null");
        } else if (jv0.f122757c) {
            m19424a(i).execute(m19430g(runnable));
        } else {
            m19428e(i, runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ScheduledFuture<?> m19428e(int i, @Nullable Runnable runnable, long j, @Nullable TimeUnit timeUnit) {
        if (runnable != null) {
            return m19424a(i).schedule(m19430g(runnable), j, timeUnit);
        }
        wg3.m206174a("command is null");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static ScheduledFuture<?> m19429f(int i, @Nullable Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (runnable != null) {
            return m19424a(i).scheduleAtFixedRate(m19430g(runnable), j, j2, timeUnit);
        }
        wg3.m206174a("command is null");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    private static Runnable m19430g(@NonNull Runnable runnable) {
        return jv0.f122756b ? new a(runnable) : runnable;
    }

    /* JADX INFO: renamed from: com.immomo.mmutil.task.c$e */
    public static final class e implements RejectedExecutionHandler {
        private e() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            MDLog.m7446e(C3949c.f13687a, "Task %s rejected from %s", runnable, threadPoolExecutor);
            if (SafeExecutor.INSTANCE.m19423b(runnable)) {
                myi0.m160795a(runnable, threadPoolExecutor);
            }
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
