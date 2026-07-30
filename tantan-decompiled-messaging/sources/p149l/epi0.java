package p149l;

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
public final class epi0 {

    /* JADX INFO: renamed from: a */
    private static String f92664a = "ThreadUtils";

    /* JADX INFO: renamed from: b */
    private static C16661e f92665b;

    /* JADX INFO: renamed from: c */
    private static C16661e f92666c;

    /* JADX INFO: renamed from: d */
    private static C16661e f92667d;

    /* JADX INFO: renamed from: e */
    private static C16661e f92668e;

    /* JADX INFO: renamed from: f */
    private static C16661e f92669f;

    /* JADX INFO: renamed from: g */
    private static final TimeUnit f92670g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: h */
    private static String f92671h;

    /* JADX INFO: renamed from: l.epi0$b */
    public static final class C16658b extends Thread {
        public C16658b(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    /* JADX INFO: renamed from: l.epi0$c */
    public static final class ThreadFactoryC16659c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f92672a = new AtomicInteger(1);

        /* JADX INFO: renamed from: b */
        private final int f92673b;

        public ThreadFactoryC16659c(int i) {
            this.f92673b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C16658b c16658b = new C16658b(runnable, "MMT" + this.f92673b + " #" + this.f92672a.getAndIncrement());
            int i = this.f92673b;
            if (i == 2 || i == 3) {
                c16658b.setPriority(10);
                return c16658b;
            }
            c16658b.setPriority(1);
            return c16658b;
        }
    }

    /* JADX INFO: renamed from: l.epi0$d */
    public static class C16660d extends ScheduledThreadPoolExecutor implements AutoCloseable {

        /* JADX INFO: renamed from: a */
        private String f92674a;

        public C16660d(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, threadFactory, rejectedExecutionHandler);
            setMaximumPoolSize(i2);
            setKeepAliveTime(j, timeUnit);
            this.f92674a = str;
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            reg0.m179043a(this);
        }
    }

    /* JADX INFO: renamed from: l.epi0$e */
    public static final class C16661e {

        /* JADX INFO: renamed from: a */
        private C16660d f92675a = null;

        /* JADX INFO: renamed from: b */
        private final int f92676b;

        /* JADX INFO: renamed from: c */
        private final int f92677c;

        /* JADX INFO: renamed from: d */
        private final int f92678d;

        /* JADX INFO: renamed from: e */
        private final long f92679e;

        /* JADX INFO: renamed from: f */
        private final TimeUnit f92680f;

        public C16661e(int i, int i2, int i3, long j, TimeUnit timeUnit) {
            this.f92676b = i;
            this.f92677c = i2;
            this.f92678d = i3;
            this.f92679e = j;
            this.f92680f = timeUnit;
        }

        /* JADX INFO: renamed from: a */
        public synchronized C16660d m117643a() {
            try {
                if (this.f92675a == null) {
                    C16660d c16660d = new C16660d("MME" + this.f92676b, this.f92677c, this.f92678d, this.f92679e, this.f92680f, new LinkedBlockingQueue(), new ThreadFactoryC16659c(this.f92676b), new RejectedExecutionHandlerC16662f());
                    this.f92675a = c16660d;
                    c16660d.allowCoreThreadTimeOut(true);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f92675a;
        }
    }

    /* JADX INFO: renamed from: l.epi0$f */
    public static final class RejectedExecutionHandlerC16662f implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC16662f() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            MLog.m19462e(epi0.f92664a, "Task %s rejected from %s", runnable, threadPoolExecutor);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m117636a(int i) {
        return m117637b(i).m117643a();
    }

    /* JADX INFO: renamed from: b */
    private static synchronized C16661e m117637b(int i) {
        try {
            if (i == 1) {
                if (f92665b == null) {
                    f92665b = new C16661e(i, 2, 2, 60L, f92670g);
                }
                return f92665b;
            }
            if (i == 2) {
                if (f92667d == null) {
                    if (TextUtils.equals(ivc0.f115118g.getPackageName(), m117640e())) {
                        f92667d = new C16661e(i, 10, 10, 120L, f92670g);
                    } else {
                        f92667d = new C16661e(i, 5, 5, 60L, f92670g);
                    }
                }
                return f92667d;
            }
            if (i == 3) {
                if (f92666c == null) {
                    f92666c = new C16661e(i, 3, 3, 60L, f92670g);
                }
                return f92666c;
            }
            if (i == 4) {
                if (f92668e == null) {
                    f92668e = new C16661e(i, 1, 1, 60L, f92670g);
                }
                return f92668e;
            }
            if (i == 5) {
                if (f92669f == null) {
                    f92669f = new C16661e(i, 2, 2, 60L, f92670g);
                }
                return f92669f;
            }
            throw new IllegalArgumentException("type=" + i + " not recognized");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m117639d(int i, Runnable runnable) {
        m117641f(i, runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: e */
    public static String m117640e() throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        int i;
        FileInputStream fileInputStream = null;
        if (ivc0.f115118g == null) {
            return null;
        }
        if (!TextUtils.isEmpty(f92671h)) {
            return f92671h;
        }
        int iMyPid = Process.myPid();
        if (iMyPid <= 0) {
            return "";
        }
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) ivc0.f115118g.getSystemService("activity")).getRunningAppProcesses().iterator();
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
                        pyl.m172132b(fileInputStream2);
                        return str;
                    }
                    pyl.m172132b(fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    MLog.printErrStackTrace(ppw.class.getName(), e);
                    pyl.m172132b(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    pyl.m172132b(fileInputStream);
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
    public static ScheduledFuture<?> m117641f(int i, Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            return m117636a(i).schedule(m117642g(runnable), j, timeUnit);
        }
        ig3.m135964a("command is null");
        return null;
    }

    /* JADX INFO: renamed from: g */
    private static Runnable m117642g(Runnable runnable) {
        return runnable;
    }
}
