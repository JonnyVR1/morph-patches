package p149l;

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

/* JADX INFO: loaded from: classes.dex */
public final class k1k implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b */
    private static final long f120592b = 10000;

    /* JADX INFO: renamed from: c */
    private static volatile int f120593c;

    /* JADX INFO: renamed from: a */
    private final ExecutorService f120594a;

    /* JADX INFO: renamed from: l.k1k$a */
    public static final class C17905a {

        /* JADX INFO: renamed from: a */
        private final boolean f120595a;

        /* JADX INFO: renamed from: b */
        private int f120596b;

        /* JADX INFO: renamed from: c */
        private int f120597c;

        /* JADX INFO: renamed from: d */
        @NonNull
        private InterfaceC17907c f120598d = InterfaceC17907c.f120609d;

        /* JADX INFO: renamed from: e */
        private String f120599e;

        /* JADX INFO: renamed from: f */
        private long f120600f;

        public C17905a(boolean z) {
            this.f120595a = z;
        }

        /* JADX INFO: renamed from: a */
        public k1k m144177a() {
            if (TextUtils.isEmpty(this.f120599e)) {
                kg3.m145878a("Name must be non-null and non-empty, but given: ", this.f120599e);
                return null;
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f120596b, this.f120597c, this.f120600f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC17906b(this.f120599e, this.f120598d, this.f120595a));
            if (this.f120600f != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new k1k(threadPoolExecutor);
        }

        /* JADX INFO: renamed from: b */
        public C17905a m144178b(String str) {
            this.f120599e = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C17905a m144179c(@IntRange(from = 1) int i) {
            this.f120596b = i;
            this.f120597c = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.k1k$b */
    public static final class ThreadFactoryC17906b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final String f120601a;

        /* JADX INFO: renamed from: b */
        final InterfaceC17907c f120602b;

        /* JADX INFO: renamed from: c */
        final boolean f120603c;

        /* JADX INFO: renamed from: d */
        private int f120604d;

        /* JADX INFO: renamed from: l.k1k$b$a */
        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC17906b.this.f120603c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    ThreadFactoryC17906b.this.f120602b.mo144180a(th);
                }
            }
        }

        public ThreadFactoryC17906b(String str, InterfaceC17907c interfaceC17907c, boolean z) {
            this.f120601a = str;
            this.f120602b = interfaceC17907c;
            this.f120603c = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(@NonNull Runnable runnable) {
            a aVar;
            aVar = new a(runnable, "glide-" + this.f120601a + "-thread-" + this.f120604d);
            this.f120604d = this.f120604d + 1;
            return aVar;
        }
    }

    @VisibleForTesting
    public k1k(ExecutorService executorService) {
        this.f120594a = executorService;
    }

    /* JADX INFO: renamed from: F */
    public static k1k m144169F() {
        return new k1k(new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, f120592b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC17906b("source-unlimited", InterfaceC17907c.f120609d, false)));
    }

    /* JADX INFO: renamed from: k */
    public static int m144170k() {
        if (f120593c == 0) {
            f120593c = Math.min(4, tid0.m189175a());
        }
        return f120593c;
    }

    /* JADX INFO: renamed from: m */
    public static C17905a m144171m() {
        return new C17905a(true).m144179c(m144170k() >= 4 ? 2 : 1).m144178b("animation");
    }

    /* JADX INFO: renamed from: n */
    public static k1k m144172n() {
        return m144171m().m144177a();
    }

    /* JADX INFO: renamed from: q */
    public static C17905a m144173q() {
        return new C17905a(true).m144179c(1).m144178b("disk-cache");
    }

    /* JADX INFO: renamed from: t */
    public static k1k m144174t() {
        return m144173q().m144177a();
    }

    /* JADX INFO: renamed from: u */
    public static C17905a m144175u() {
        return new C17905a(false).m144179c(m144170k()).m144178b("source");
    }

    /* JADX INFO: renamed from: v */
    public static k1k m144176v() {
        return m144175u().m144177a();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f120594a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f120594a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f120594a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f120594a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f120594a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f120594a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f120594a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f120594a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f120594a.submit(runnable);
    }

    public String toString() {
        return this.f120594a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f120594a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f120594a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f120594a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f120594a.submit(callable);
    }

    /* JADX INFO: renamed from: l.k1k$c */
    public interface InterfaceC17907c {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC17907c f120606a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC17907c f120607b;

        /* JADX INFO: renamed from: c */
        public static final InterfaceC17907c f120608c;

        /* JADX INFO: renamed from: d */
        public static final InterfaceC17907c f120609d;

        /* JADX INFO: renamed from: l.k1k$c$b */
        public class b implements InterfaceC17907c {
            @Override // p149l.k1k.InterfaceC17907c
            /* JADX INFO: renamed from: a */
            public void mo144180a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* JADX INFO: renamed from: l.k1k$c$c */
        public class c implements InterfaceC17907c {
            @Override // p149l.k1k.InterfaceC17907c
            /* JADX INFO: renamed from: a */
            public void mo144180a(Throwable th) {
                if (th == null) {
                    return;
                }
                pkq0.m170054a("Request threw uncaught throwable", th);
            }
        }

        static {
            b bVar = new b();
            f120607b = bVar;
            f120608c = new c();
            f120609d = bVar;
        }

        /* JADX INFO: renamed from: a */
        void mo144180a(Throwable th);

        /* JADX INFO: renamed from: l.k1k$c$a */
        public class a implements InterfaceC17907c {
            @Override // p149l.k1k.InterfaceC17907c
            /* JADX INFO: renamed from: a */
            public void mo144180a(Throwable th) {
            }
        }
    }
}
