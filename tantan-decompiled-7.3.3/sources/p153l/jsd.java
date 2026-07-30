package p153l;

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
public class jsd extends aoi0 {

    /* JADX INFO: renamed from: a */
    public final Object f122449a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f122450b = Executors.newFixedThreadPool(4, new ThreadFactoryC18022a());

    /* JADX INFO: renamed from: c */
    @Nullable
    public volatile Handler f122451c;

    /* JADX INFO: renamed from: l.jsd$a */
    public class ThreadFactoryC18022a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f122452a = new AtomicInteger(0);

        public ThreadFactoryC18022a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f122452a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: l.jsd$b */
    @RequiresApi(28)
    public static class C18023b {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static Handler m146837a(@NonNull Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static Handler m146836d(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18023b.m146837a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p153l.aoi0
    /* JADX INFO: renamed from: a */
    public void mo99083a(@NonNull Runnable runnable) {
        this.f122450b.execute(runnable);
    }

    @Override // p153l.aoi0
    /* JADX INFO: renamed from: b */
    public boolean mo99084b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p153l.aoi0
    /* JADX INFO: renamed from: c */
    public void mo99085c(@NonNull Runnable runnable) {
        if (this.f122451c == null) {
            synchronized (this.f122449a) {
                try {
                    if (this.f122451c == null) {
                        this.f122451c = m146836d(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f122451c.post(runnable);
    }
}
