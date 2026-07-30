package p153l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/nr0;", "", "<init>", "()V", "Ljava/lang/Runnable;", "task", "", "b", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadFactory;", "a", "Ljava/util/concurrent/ThreadFactory;", "frameThreadFactory", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "executor", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class nr0 {

    @NotNull
    public static final nr0 INSTANCE = new nr0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ThreadFactory frameThreadFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final ExecutorService executor;

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: l.mr0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return nr0.m164437a(runnable);
            }
        };
        frameThreadFactory = threadFactory;
        executor = Executors.newCachedThreadPool(threadFactory);
    }

    /* JADX INFO: renamed from: a */
    public static Thread m164437a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }

    /* JADX INFO: renamed from: b */
    public final void m164438b(@NotNull Runnable task) {
        task.getClass();
        executor.execute(task);
    }
}
