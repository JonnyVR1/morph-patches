package p153l;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import com.immomo.resdownloader.log.MLog;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class gyi0 {

    /* JADX INFO: renamed from: a */
    private static String f107056a = "ThreadUtils";

    /* JADX INFO: renamed from: b */
    private static C17350e f107057b;

    /* JADX INFO: renamed from: c */
    private static C17350e f107058c;

    /* JADX INFO: renamed from: d */
    private static C17350e f107059d;

    /* JADX INFO: renamed from: e */
    private static C17350e f107060e;

    /* JADX INFO: renamed from: f */
    private static C17350e f107061f;

    /* JADX INFO: renamed from: g */
    private static final TimeUnit f107062g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: h */
    private static String f107063h;

    /* JADX INFO: renamed from: l.gyi0$b */
    public static final class C17347b extends Thread {
        public C17347b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* JADX INFO: renamed from: l.gyi0$c */
    public static final class ThreadFactoryC17348c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f107064a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        private final int f107065b;

        public ThreadFactoryC17348c(int i) {
            this.f107065b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C17347b c17347b = new C17347b(runnable, "MMT" + this.f107065b + " #" + this.f107064a.getAndIncrement());
            int i = this.f107065b;
            if (i == 2 || i == 3) {
                c17347b.setPriority(10);
                return c17347b;
            }
            c17347b.setPriority(1);
            return c17347b;
        }
    }

    /* JADX INFO: renamed from: l.gyi0$d */
    public static class C17349d extends ScheduledThreadPoolExecutor implements AutoCloseable {

        /* JADX INFO: renamed from: a */
        private String f107066a;

        public C17349d(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, threadFactory, rejectedExecutionHandler);
            setMaximumPoolSize(i2);
            setKeepAliveTime(j, timeUnit);
            this.f107066a = str;
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            zmg0.m220382a(this);
        }
    }

    /* JADX INFO: renamed from: l.gyi0$e */
    public static final class C17350e {

        /* JADX INFO: renamed from: a */
        private C17349d f107067a = null;

        /* JADX INFO: renamed from: b */
        private final int f107068b;

        /* JADX INFO: renamed from: c */
        private final int f107069c;

        /* JADX INFO: renamed from: d */
        private final int f107070d;

        /* JADX INFO: renamed from: e */
        private final long f107071e;

        /* JADX INFO: renamed from: f */
        private final TimeUnit f107072f;

        public C17350e(int i, int i2, int i3, long j, TimeUnit timeUnit) {
            this.f107068b = i;
            this.f107069c = i2;
            this.f107070d = i3;
            this.f107071e = j;
            this.f107072f = timeUnit;
        }

        /* JADX INFO: renamed from: a */
        public synchronized C17349d m132969a() {
            try {
                if (this.f107067a == null) {
                    C17349d c17349d = new C17349d("MME" + this.f107068b, this.f107069c, this.f107070d, this.f107071e, this.f107072f, new LinkedBlockingQueue(), new ThreadFactoryC17348c(this.f107068b), new RejectedExecutionHandlerC17351f());
                    this.f107067a = c17349d;
                    c17349d.allowCoreThreadTimeOut(true);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f107067a;
        }
    }

    /* JADX INFO: renamed from: l.gyi0$f */
    public static final class RejectedExecutionHandlerC17351f implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC17351f() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            MLog.m20461e(gyi0.f107056a, "Task %s rejected from %s", runnable, threadPoolExecutor);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m132962a(int i) {
        return m132963b(i).m132969a();
    }

    /* JADX INFO: renamed from: b */
    private static synchronized C17350e m132963b(int i) {
        try {
            if (i == 1) {
                if (f107057b == null) {
                    f107057b = new C17350e(i, 2, 2, 60L, f107062g);
                }
                return f107057b;
            }
            if (i == 2) {
                if (f107059d == null) {
                    if (TextUtils.equals(l3d0.f129865g.getPackageName(), m132966e())) {
                        f107059d = new C17350e(i, 10, 10, 120L, f107062g);
                    } else {
                        f107059d = new C17350e(i, 5, 5, 60L, f107062g);
                    }
                }
                return f107059d;
            }
            if (i == 3) {
                if (f107058c == null) {
                    f107058c = new C17350e(i, 3, 3, 60L, f107062g);
                }
                return f107058c;
            }
            if (i == 4) {
                if (f107060e == null) {
                    f107060e = new C17350e(i, 1, 1, 60L, f107062g);
                }
                return f107060e;
            }
            if (i == 5) {
                if (f107061f == null) {
                    f107061f = new C17350e(i, 2, 2, 60L, f107062g);
                }
                return f107061f;
            }
            throw new IllegalArgumentException("type=" + i + " not recognized");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m132965d(int i, Runnable runnable) {
        m132967f(i, runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: e */
    public static String m132966e() throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        int i;
        FileInputStream fileInputStream = null;
        if (l3d0.f129865g == null) {
            return null;
        }
        if (!TextUtils.isEmpty(f107063h)) {
            return f107063h;
        }
        int iMyPid = Process.myPid();
        if (iMyPid <= 0) {
            return "";
        }
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) l3d0.f129865g.getSystemService("activity")).getRunningAppProcesses().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.pid != iMyPid);
        } catch (Exception unused) {
        }
        if (next != null) {
            return next.processName;
        }
        byte[] bArr = new byte[128];
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream("/proc/" + iMyPid + "/cmdline");
                try {
                    int i2 = fileInputStream2.read(bArr);
                    if (i2 > 0) {
                        for (0; i < i2; i + 1) {
                            byte b = bArr[i];
                            i = (b <= 128 && b > 0) ? i + 1 : 0;
                            i2 = i;
                            break;
                        }
                        String str = new String(bArr, 0, i2);
                        k1m.m147893b(fileInputStream2);
                        return str;
                    }
                    k1m.m147893b(fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    MLog.printErrStackTrace(osw.class.getName(), e);
                    k1m.m147893b(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    k1m.m147893b(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static ScheduledFuture<?> m132967f(int i, Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            return m132962a(i).schedule(m132968g(runnable), j, timeUnit);
        }
        wg3.m206174a("command is null");
        return null;
    }

    /* JADX INFO: renamed from: g */
    private static Runnable m132968g(Runnable runnable) {
        return runnable;
    }
}
