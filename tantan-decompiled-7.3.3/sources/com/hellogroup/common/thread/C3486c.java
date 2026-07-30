package com.hellogroup.common.thread;

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
import p153l.lv0;
import p153l.myi0;
import p153l.n510;
import p153l.wg3;

/* JADX INFO: renamed from: com.hellogroup.common.thread.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C3486c {

    /* JADX INFO: renamed from: a */
    private static String f11876a = "ThreadUtils";

    /* JADX INFO: renamed from: b */
    @Nullable
    private static d f11877b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private static d f11878c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private static d f11879d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private static d f11880e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private static d f11881f;

    /* JADX INFO: renamed from: g */
    private static final TimeUnit f11882g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: com.hellogroup.common.thread.c$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f11883a;

        public a(Runnable runnable) {
            this.f11883a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Thread threadCurrentThread = Thread.currentThread();
            String strM155972b = lv0.m155972b();
            String name = threadCurrentThread.getName();
            long id = threadCurrentThread.getId();
            String name2 = this.f11883a.getClass().getName();
            String unused = C3486c.f11876a;
            String.format("--> Thread start: [%s][%s][%s][%s]", name, Long.valueOf(id), strM155972b, name2);
            this.f11883a.run();
            String unused2 = C3486c.f11876a;
            String.format("--> Thread end: [%s][%s][%s][%s]", name, Long.valueOf(id), strM155972b, name2);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.common.thread.c$b */
    public static final class b extends Thread {
        public b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.common.thread.c$c */
    public static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f11884a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        private final int f11885b;

        public c(int i) {
            this.f11885b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = "MMT" + this.f11885b + " #" + this.f11884a.getAndIncrement();
            if (lv0.f133671b) {
                String unused = C3486c.f11876a;
                String.format("MomoThreadFactory -> newThread : %s", str);
            }
            b bVar = new b(runnable, str);
            int i = this.f11885b;
            if (i == 2 || i == 3) {
                bVar.setPriority(10);
                return bVar;
            }
            bVar.setPriority(1);
            return bVar;
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.common.thread.c$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        @Nullable
        private n510 f11886a = null;

        /* JADX INFO: renamed from: b */
        private final int f11887b;

        /* JADX INFO: renamed from: c */
        private final int f11888c;

        /* JADX INFO: renamed from: d */
        private final int f11889d;

        /* JADX INFO: renamed from: e */
        private final long f11890e;

        /* JADX INFO: renamed from: f */
        @NonNull
        private final TimeUnit f11891f;

        public d(int i, int i2, int i3, long j, @NonNull TimeUnit timeUnit) {
            this.f11887b = i;
            this.f11888c = i2;
            this.f11889d = i3;
            this.f11890e = j;
            this.f11891f = timeUnit;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public synchronized n510 m17569a() {
            try {
                if (this.f11886a == null) {
                    n510 n510Var = new n510("MME" + this.f11887b, this.f11888c, this.f11889d, this.f11890e, this.f11891f, new LinkedBlockingQueue(), new c(this.f11887b), new e(null));
                    this.f11886a = n510Var;
                    n510Var.allowCoreThreadTimeOut(true);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f11886a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m17563a(int i) {
        return m17564b(i).m17569a();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static synchronized d m17564b(int i) {
        try {
            if (i == 1) {
                if (f11877b == null) {
                    f11877b = new d(i, 2, 2, 60L, f11882g);
                }
                return f11877b;
            }
            if (i == 2) {
                if (f11879d == null) {
                    if (TextUtils.equals(lv0.m155973c(), lv0.m155972b())) {
                        f11879d = new d(i, 10, 10, 120L, f11882g);
                    } else {
                        f11879d = new d(i, 5, 5, 60L, f11882g);
                    }
                }
                return f11879d;
            }
            if (i == 3) {
                if (f11878c == null) {
                    f11878c = new d(i, 3, 3, 60L, f11882g);
                }
                return f11878c;
            }
            if (i == 4) {
                if (f11880e == null) {
                    f11880e = new d(i, 1, 1, 60L, f11882g);
                }
                return f11880e;
            }
            if (i == 5) {
                if (f11881f == null) {
                    f11881f = new d(i, 2, 2, 60L, f11882g);
                }
                return f11881f;
            }
            throw new IllegalArgumentException("type=" + i + " not recognized");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m17566d(int i, @Nullable Runnable runnable) {
        if (runnable == null) {
            wg3.m206174a("command is null");
        } else if (lv0.f133672c) {
            m17563a(i).execute(m17568f(runnable));
        } else {
            m17567e(i, runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    /* JADX INFO: renamed from: e */
    public static ScheduledFuture<?> m17567e(int i, @Nullable Runnable runnable, long j, @Nullable TimeUnit timeUnit) {
        if (runnable != null) {
            return m17563a(i).schedule(m17568f(runnable), j, timeUnit);
        }
        wg3.m206174a("command is null");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    private static Runnable m17568f(@NonNull Runnable runnable) {
        return lv0.f133671b ? new a(runnable) : runnable;
    }

    /* JADX INFO: renamed from: com.hellogroup.common.thread.c$e */
    public static final class e implements RejectedExecutionHandler {
        private e() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Log.e(C3486c.f11876a, String.format("Task %s rejected from %s", runnable, threadPoolExecutor));
            if (SafeExecutor.INSTANCE.m17562b(runnable)) {
                myi0.m160795a(runnable, threadPoolExecutor);
            }
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
