package p149l;

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
public class d500 extends ctr0 {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f84364b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final ThreadPoolExecutor f84365a;

    public d500() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: l.fpx0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: l.iux0
                    @Override // java.lang.Runnable
                    public final void run() {
                        d500.m110005q(runnable);
                    }
                });
            }
        });
        this.f84365a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m110005q(Runnable runnable) {
        f84364b.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: renamed from: t */
    public static void m110006t(Deque deque, Runnable runnable) {
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
        Deque deque = (Deque) f84364b.get();
        if (deque == null || deque.size() > 1) {
            this.f84365a.execute(new Runnable() { // from class: l.gkx0
                @Override // java.lang.Runnable
                public final void run() {
                    d500.m110006t((Deque) d500.f84364b.get(), runnable);
                }
            });
        } else {
            m110006t(deque, runnable);
        }
    }

    @Override // p149l.tty0
    @NonNull
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object mo110007k() {
        return this.f84365a;
    }

    @Override // p149l.ctr0
    @NonNull
    /* JADX INFO: renamed from: m */
    public final ExecutorService mo108695m() {
        return this.f84365a;
    }
}
