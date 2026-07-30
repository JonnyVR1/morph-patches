package p153l;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a4k implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b */
    private static final long f68405b = 10000;

    /* JADX INFO: renamed from: c */
    private static volatile int f68406c;

    /* JADX INFO: renamed from: a */
    private final ExecutorService f68407a;

    /* JADX INFO: renamed from: l.a4k$b */
    public static final class C15641b {

        /* JADX INFO: renamed from: a */
        private final boolean f68408a;

        /* JADX INFO: renamed from: b */
        private int f68409b;

        /* JADX INFO: renamed from: c */
        private int f68410c;

        /* JADX INFO: renamed from: d */
        @NonNull
        private final ThreadFactory f68411d = new ThreadFactoryC15642c();

        /* JADX INFO: renamed from: e */
        @NonNull
        private InterfaceC15644e f68412e = InterfaceC15644e.f68426d;

        /* JADX INFO: renamed from: f */
        private String f68413f;

        /* JADX INFO: renamed from: g */
        private long f68414g;

        public C15641b(boolean z) {
            this.f68408a = z;
        }

        /* JADX INFO: renamed from: a */
        public a4k m95979a() {
            if (TextUtils.isEmpty(this.f68413f)) {
                yg3.m215829a("Name must be non-null and non-empty, but given: ", this.f68413f);
                return null;
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f68409b, this.f68410c, this.f68414g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC15643d(this.f68411d, this.f68413f, this.f68412e, this.f68408a));
            if (this.f68414g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a4k(threadPoolExecutor);
        }

        /* JADX INFO: renamed from: b */
        public C15641b m95980b(String str) {
            this.f68413f = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C15641b m95981c(@IntRange(from = 1) int i) {
            this.f68409b = i;
            this.f68410c = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.a4k$c */
    public static final class ThreadFactoryC15642c implements ThreadFactory {

        /* JADX INFO: renamed from: l.a4k$c$a */
        public class a extends Thread {
            public a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private ThreadFactoryC15642c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new a(runnable);
        }
    }

    /* JADX INFO: renamed from: l.a4k$d */
    public static final class ThreadFactoryC15643d implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final ThreadFactory f68416a;

        /* JADX INFO: renamed from: b */
        private final String f68417b;

        /* JADX INFO: renamed from: c */
        final InterfaceC15644e f68418c;

        /* JADX INFO: renamed from: d */
        final boolean f68419d;

        /* JADX INFO: renamed from: e */
        private final AtomicInteger f68420e = new AtomicInteger();

        /* JADX INFO: renamed from: l.a4k$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Runnable f68421a;

            public a(Runnable runnable) {
                this.f68421a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ThreadFactoryC15643d.this.f68419d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f68421a.run();
                } catch (Throwable th) {
                    ThreadFactoryC15643d.this.f68418c.mo95982a(th);
                }
            }
        }

        public ThreadFactoryC15643d(ThreadFactory threadFactory, String str, InterfaceC15644e interfaceC15644e, boolean z) {
            this.f68416a = threadFactory;
            this.f68417b = str;
            this.f68418c = interfaceC15644e;
            this.f68419d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = this.f68416a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f68417b + "-thread-" + this.f68420e.getAndIncrement());
            return threadNewThread;
        }
    }

    @VisibleForTesting
    public a4k(ExecutorService executorService) {
        this.f68407a = executorService;
    }

    /* JADX INFO: renamed from: F */
    public static a4k m95971F() {
        return new a4k(new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, f68405b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC15643d(new ThreadFactoryC15642c(), "source-unlimited", InterfaceC15644e.f68426d, false)));
    }

    /* JADX INFO: renamed from: k */
    public static int m95972k() {
        if (f68406c == 0) {
            f68406c = Math.min(4, wqd0.m207505a());
        }
        return f68406c;
    }

    /* JADX INFO: renamed from: m */
    public static C15641b m95973m() {
        return new C15641b(true).m95981c(m95972k() >= 4 ? 2 : 1).m95980b("animation");
    }

    /* JADX INFO: renamed from: n */
    public static a4k m95974n() {
        return m95973m().m95979a();
    }

    /* JADX INFO: renamed from: q */
    public static C15641b m95975q() {
        return new C15641b(true).m95981c(1).m95980b("disk-cache");
    }

    /* JADX INFO: renamed from: t */
    public static a4k m95976t() {
        return m95975q().m95979a();
    }

    /* JADX INFO: renamed from: u */
    public static C15641b m95977u() {
        return new C15641b(false).m95981c(m95972k()).m95980b("source");
    }

    /* JADX INFO: renamed from: v */
    public static a4k m95978v() {
        return m95977u().m95979a();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f68407a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f68407a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f68407a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f68407a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f68407a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f68407a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f68407a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f68407a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f68407a.submit(runnable);
    }

    public String toString() {
        return this.f68407a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f68407a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f68407a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f68407a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f68407a.submit(callable);
    }

    /* JADX INFO: renamed from: l.a4k$e */
    public interface InterfaceC15644e {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC15644e f68423a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC15644e f68424b;

        /* JADX INFO: renamed from: c */
        public static final InterfaceC15644e f68425c;

        /* JADX INFO: renamed from: d */
        public static final InterfaceC15644e f68426d;

        /* JADX INFO: renamed from: l.a4k$e$b */
        public class b implements InterfaceC15644e {
            @Override // p153l.a4k.InterfaceC15644e
            /* JADX INFO: renamed from: a */
            public void mo95982a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* JADX INFO: renamed from: l.a4k$e$c */
        public class c implements InterfaceC15644e {
            @Override // p153l.a4k.InterfaceC15644e
            /* JADX INFO: renamed from: a */
            public void mo95982a(Throwable th) {
                if (th == null) {
                    return;
                }
                vtq0.m202761a("Request threw uncaught throwable", th);
            }
        }

        static {
            b bVar = new b();
            f68424b = bVar;
            f68425c = new c();
            f68426d = bVar;
        }

        /* JADX INFO: renamed from: a */
        void mo95982a(Throwable th);

        /* JADX INFO: renamed from: l.a4k$e$a */
        public class a implements InterfaceC15644e {
            @Override // p153l.a4k.InterfaceC15644e
            /* JADX INFO: renamed from: a */
            public void mo95982a(Throwable th) {
            }
        }
    }
}
