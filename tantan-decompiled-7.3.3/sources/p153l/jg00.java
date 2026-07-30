package p153l;

import androidx.annotation.NonNull;
import com.immomo.medialog.thread.ThreadType;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class jg00 {

    /* JADX INFO: renamed from: a */
    static j510 f120659a;

    /* JADX INFO: renamed from: b */
    static j510 f120660b;

    /* JADX INFO: renamed from: c */
    static j510 f120661c;

    /* JADX INFO: renamed from: d */
    static ig00 f120662d;

    /* JADX INFO: renamed from: l.jg00$a */
    public static /* synthetic */ class C17945a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f120663a;

        static {
            int[] iArr = new int[ThreadType.values().length];
            f120663a = iArr;
            try {
                iArr[ThreadType.High.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120663a[ThreadType.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120663a[ThreadType.Low.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f120663a[ThreadType.Priority_Low.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.jg00$b */
    public static class C17946b {
        /* JADX INFO: renamed from: a */
        public static Thread m144747a(String str, Runnable runnable) {
            return new Thread(runnable, str);
        }
    }

    /* JADX INFO: renamed from: l.jg00$d */
    public static class ThreadFactoryC17948d implements ThreadFactory {

        /* JADX INFO: renamed from: b */
        private static int f120664b;

        /* JADX INFO: renamed from: a */
        String f120665a;

        public ThreadFactoryC17948d(String str) {
            this.f120665a = str;
        }

        /* JADX INFO: renamed from: a */
        private static synchronized int m144748a() {
            int i;
            i = f120664b;
            f120664b = i + 1;
            return i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return C17946b.m144747a(this.f120665a + "-" + m144748a(), runnable);
        }
    }

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactoryC17948d threadFactoryC17948d = new ThreadFactoryC17948d("live-buz-high");
        C17945a c17945a = null;
        RejectedExecutionHandlerC17947c rejectedExecutionHandlerC17947c = new RejectedExecutionHandlerC17947c(c17945a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f120659a = new j510("live-buz-high", 10, 15, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit, linkedBlockingQueue, threadFactoryC17948d, rejectedExecutionHandlerC17947c);
        f120660b = new j510("live-buz-normal", 5, 10, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC17948d("live-buz-normal"), new RejectedExecutionHandlerC17947c(c17945a));
        f120661c = new j510("live-buz-low", 2, 2, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC17948d("live-buz-low"), new RejectedExecutionHandlerC17947c(c17945a));
        f120662d = new ig00("live-buz-priority_low", 2, 2, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC17948d("live-buz-priority_low"), new RejectedExecutionHandlerC17947c(c17945a));
        f120659a.allowCoreThreadTimeOut(true);
        f120660b.allowCoreThreadTimeOut(true);
        f120661c.allowCoreThreadTimeOut(true);
        f120662d.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m144744a(ThreadType threadType, Runnable runnable) {
        int i = C17945a.f120663a[threadType.ordinal()];
        if (i == 1) {
            m144746c(f120659a, runnable);
            return;
        }
        if (i == 2) {
            m144746c(f120660b, runnable);
        } else if (i == 3) {
            m144746c(f120661c, runnable);
        } else {
            if (i != 4) {
                return;
            }
            m144745b(f120662d, runnable);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m144745b(ig00 ig00Var, Runnable runnable) {
        ig00Var.execute(runnable);
    }

    /* JADX INFO: renamed from: c */
    private static void m144746c(j510 j510Var, Runnable runnable) {
        j510Var.execute(runnable);
    }

    /* JADX INFO: renamed from: l.jg00$c */
    public static class RejectedExecutionHandlerC17947c implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC17947c() {
        }

        public /* synthetic */ RejectedExecutionHandlerC17947c(C17945a c17945a) {
            this();
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }
}
