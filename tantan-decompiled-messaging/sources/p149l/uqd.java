package p149l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class uqd extends afi0 {

    /* JADX INFO: renamed from: a */
    public final Object f177737a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f177738b = Executors.newFixedThreadPool(4, new ThreadFactoryC20484a());

    /* JADX INFO: renamed from: c */
    @Nullable
    public volatile Handler f177739c;

    /* JADX INFO: renamed from: l.uqd$a */
    public class ThreadFactoryC20484a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f177740a = new AtomicInteger(0);

        public ThreadFactoryC20484a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f177740a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: l.uqd$b */
    @RequiresApi(28)
    public static class C20485b {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static Handler m194989a(@NonNull Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static Handler m194988d(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20485b.m194989a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p149l.afi0
    /* JADX INFO: renamed from: a */
    public void mo96226a(@NonNull Runnable runnable) {
        this.f177738b.execute(runnable);
    }

    @Override // p149l.afi0
    /* JADX INFO: renamed from: b */
    public boolean mo96227b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p149l.afi0
    /* JADX INFO: renamed from: c */
    public void mo96228c(@NonNull Runnable runnable) {
        if (this.f177739c == null) {
            synchronized (this.f177737a) {
                try {
                    if (this.f177739c == null) {
                        this.f177739c = m194988d(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f177739c.post(runnable);
    }
}
