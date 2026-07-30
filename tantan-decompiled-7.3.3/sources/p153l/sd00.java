package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class sd00 extends i2s0 {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f167366b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final ThreadPoolExecutor f167367a;

    public sd00() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: l.lyx0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: l.o3y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        sd00.m185412q(runnable);
                    }
                });
            }
        });
        this.f167367a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m185412q(Runnable runnable) {
        f167366b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: renamed from: t */
    public static void m185413t(Deque deque, Runnable runnable) {
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull final Runnable runnable) {
        Deque deque = (Deque) f167366b.get();
        if (deque == null || deque.size() > 1) {
            this.f167367a.execute(new Runnable() { // from class: l.mtx0
                @Override // java.lang.Runnable
                public final void run() {
                    sd00.m185413t((Deque) sd00.f167366b.get(), runnable);
                }
            });
        } else {
            m185413t(deque, runnable);
        }
    }

    @Override // p153l.z2z0
    @NonNull
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object mo185414k() {
        return this.f167367a;
    }

    @Override // p153l.i2s0
    @NonNull
    /* JADX INFO: renamed from: m */
    public final ExecutorService mo138235m() {
        return this.f167367a;
    }
}
