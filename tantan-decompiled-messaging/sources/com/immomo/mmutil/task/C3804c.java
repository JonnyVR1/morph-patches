package com.immomo.mmutil.task;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.bx00;
import p149l.ev0;
import p149l.ig3;

/* JADX INFO: renamed from: com.immomo.mmutil.task.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C3804c {

    /* JADX INFO: renamed from: a */
    private static String f12993a = "ThreadUtils";

    /* JADX INFO: renamed from: b */
    @Nullable
    private static d f12994b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private static d f12995c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private static d f12996d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private static d f12997e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private static d f12998f;

    /* JADX INFO: renamed from: g */
    private static final TimeUnit f12999g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: com.immomo.mmutil.task.c$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f13000a;

        public a(Runnable runnable) {
            this.f13000a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Thread threadCurrentThread = Thread.currentThread();
            String strM118234b = ev0.m118234b();
            String name = threadCurrentThread.getName();
            long id = threadCurrentThread.getId();
            String name2 = this.f13000a.getClass().getName();
            MDLog.m7390d(C3804c.f12993a, "--> Thread start: [%s][%s][%s][%s]", name, Long.valueOf(id), strM118234b, name2);
            this.f13000a.run();
            MDLog.m7390d(C3804c.f12993a, "--> Thread end: [%s][%s][%s][%s]", name, Long.valueOf(id), strM118234b, name2);
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
        private final AtomicInteger f13001a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        private final int f13002b;

        public c(int i) {
            this.f13002b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = "MMT" + this.f13002b + " #" + this.f13001a.getAndIncrement();
            if (ev0.f93301b) {
                MDLog.m7390d(C3804c.f12993a, "MomoThreadFactory -> newThread : %s", str);
            }
            b bVar = new b(runnable, str);
            int i = this.f13002b;
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
        private bx00 f13003a = null;

        /* JADX INFO: renamed from: b */
        private final int f13004b;

        /* JADX INFO: renamed from: c */
        private final int f13005c;

        /* JADX INFO: renamed from: d */
        private final int f13006d;

        /* JADX INFO: renamed from: e */
        private final long f13007e;

        /* JADX INFO: renamed from: f */
        @NonNull
        private final TimeUnit f13008f;

        public d(int i, int i2, int i3, long j, @NonNull TimeUnit timeUnit) {
            this.f13004b = i;
            this.f13005c = i2;
            this.f13006d = i3;
            this.f13007e = j;
            this.f13008f = timeUnit;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public synchronized bx00 m18448a() {
            try {
                if (this.f13003a == null) {
                    bx00 bx00Var = new bx00("MME" + this.f13004b, this.f13005c, this.f13006d, this.f13007e, this.f13008f, new LinkedBlockingQueue(), new c(this.f13004b), new e(null));
                    this.f13003a = bx00Var;
                    bx00Var.allowCoreThreadTimeOut(true);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f13003a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m18441a(int i) {
        return m18442b(i).m18448a();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static synchronized d m18442b(int i) {
        try {
            if (i == 1) {
                if (f12994b == null) {
                    f12994b = new d(i, 2, 2, 60L, f12999g);
                }
                return f12994b;
            }
            if (i == 2) {
                if (f12996d == null) {
                    if (TextUtils.equals(ev0.m118235c(), ev0.m118234b())) {
                        f12996d = new d(i, 10, 10, 120L, f12999g);
                    } else {
                        f12996d = new d(i, 5, 5, 60L, f12999g);
                    }
                }
                return f12996d;
            }
            if (i == 3) {
                if (f12995c == null) {
                    f12995c = new d(i, 3, 3, 60L, f12999g);
                }
                return f12995c;
            }
            if (i == 4) {
                if (f12997e == null) {
                    f12997e = new d(i, 1, 1, 60L, f12999g);
                }
                return f12997e;
            }
            if (i == 5) {
                if (f12998f == null) {
                    f12998f = new d(i, 2, 2, 60L, f12999g);
                }
                return f12998f;
            }
            throw new IllegalArgumentException("type=" + i + " not recognized");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m18444d(int i, @Nullable Runnable runnable) {
        if (runnable == null) {
            ig3.m135964a("command is null");
        } else if (ev0.f93302c) {
            m18441a(i).execute(m18447g(runnable));
        } else {
            m18445e(i, runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ScheduledFuture<?> m18445e(int i, @Nullable Runnable runnable, long j, @Nullable TimeUnit timeUnit) {
        if (runnable != null) {
            return m18441a(i).schedule(m18447g(runnable), j, timeUnit);
        }
        ig3.m135964a("command is null");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static ScheduledFuture<?> m18446f(int i, @Nullable Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (runnable != null) {
            return m18441a(i).scheduleAtFixedRate(m18447g(runnable), j, j2, timeUnit);
        }
        ig3.m135964a("command is null");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    private static Runnable m18447g(@NonNull Runnable runnable) {
        return ev0.f93301b ? new a(runnable) : runnable;
    }

    /* JADX INFO: renamed from: com.immomo.mmutil.task.c$e */
    public static final class e implements RejectedExecutionHandler {
        private e() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            MDLog.m7392e(C3804c.f12993a, "Task %s rejected from %s", runnable, threadPoolExecutor);
            if (SafeExecutor.INSTANCE.m18440b(runnable)) {
                throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + threadPoolExecutor.toString());
            }
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
