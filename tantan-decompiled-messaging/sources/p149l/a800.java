package p149l;

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
public class a800 {

    /* JADX INFO: renamed from: a */
    static dx00 f67987a;

    /* JADX INFO: renamed from: b */
    static dx00 f67988b;

    /* JADX INFO: renamed from: c */
    static dx00 f67989c;

    /* JADX INFO: renamed from: d */
    static z700 f67990d;

    /* JADX INFO: renamed from: l.a800$a */
    public static /* synthetic */ class C15538a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f67991a;

        static {
            int[] iArr = new int[ThreadType.values().length];
            f67991a = iArr;
            try {
                iArr[ThreadType.High.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67991a[ThreadType.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67991a[ThreadType.Low.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67991a[ThreadType.Priority_Low.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.a800$b */
    public static class C15539b {
        /* JADX INFO: renamed from: a */
        public static Thread m95327a(String str, Runnable runnable) {
            return new Thread(runnable, str);
        }
    }

    /* JADX INFO: renamed from: l.a800$d */
    public static class ThreadFactoryC15541d implements ThreadFactory {

        /* JADX INFO: renamed from: b */
        private static int f67992b;

        /* JADX INFO: renamed from: a */
        String f67993a;

        public ThreadFactoryC15541d(String str) {
            this.f67993a = str;
        }

        /* JADX INFO: renamed from: a */
        private static synchronized int m95328a() {
            int i;
            i = f67992b;
            f67992b = i + 1;
            return i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return C15539b.m95327a(this.f67993a + "-" + m95328a(), runnable);
        }
    }

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactoryC15541d threadFactoryC15541d = new ThreadFactoryC15541d("live-buz-high");
        C15538a c15538a = null;
        RejectedExecutionHandlerC15540c rejectedExecutionHandlerC15540c = new RejectedExecutionHandlerC15540c(c15538a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f67987a = new dx00("live-buz-high", 10, 15, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit, linkedBlockingQueue, threadFactoryC15541d, rejectedExecutionHandlerC15540c);
        f67988b = new dx00("live-buz-normal", 5, 10, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC15541d("live-buz-normal"), new RejectedExecutionHandlerC15540c(c15538a));
        f67989c = new dx00("live-buz-low", 2, 2, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC15541d("live-buz-low"), new RejectedExecutionHandlerC15540c(c15538a));
        f67990d = new z700("live-buz-priority_low", 2, 2, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC15541d("live-buz-priority_low"), new RejectedExecutionHandlerC15540c(c15538a));
        f67987a.allowCoreThreadTimeOut(true);
        f67988b.allowCoreThreadTimeOut(true);
        f67989c.allowCoreThreadTimeOut(true);
        f67990d.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m95324a(ThreadType threadType, Runnable runnable) {
        int i = C15538a.f67991a[threadType.ordinal()];
        if (i == 1) {
            m95326c(f67987a, runnable);
            return;
        }
        if (i == 2) {
            m95326c(f67988b, runnable);
        } else if (i == 3) {
            m95326c(f67989c, runnable);
        } else {
            if (i != 4) {
                return;
            }
            m95325b(f67990d, runnable);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m95325b(z700 z700Var, Runnable runnable) {
        z700Var.execute(runnable);
    }

    /* JADX INFO: renamed from: c */
    private static void m95326c(dx00 dx00Var, Runnable runnable) {
        dx00Var.execute(runnable);
    }

    /* JADX INFO: renamed from: l.a800$c */
    public static class RejectedExecutionHandlerC15540c implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC15540c() {
        }

        public /* synthetic */ RejectedExecutionHandlerC15540c(C15538a c15538a) {
            this();
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }
}
