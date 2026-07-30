package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.zmg0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, m88121d2 = {"Lcom/appsflyer/internal/AFd1sSDK;", "Ljava/util/concurrent/ThreadPoolExecutor;", "", "p0", "p1", "", "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "p4", "Ljava/util/Queue;", "p5", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/Queue;)V", "", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "getCurrencyIso4217Code", "Ljava/util/Queue;", "getMonetizationNetwork"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final class AFd1sSDK extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private final Queue<Runnable> getMonetizationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1sSDK(int i, int i2, long j, @NotNull TimeUnit timeUnit, @NotNull BlockingQueue<Runnable> blockingQueue, @NotNull final Queue<Runnable> queue) {
        super(i, i2, j, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.n
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFd1sSDK.getMonetizationNetwork(queue, runnable, threadPoolExecutor);
            }
        });
        timeUnit.getClass();
        blockingQueue.getClass();
        queue.getClass();
        this.getMonetizationNetwork = queue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        queue.getClass();
        runnable.getClass();
        threadPoolExecutor.getClass();
        queue.add(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(@NotNull Runnable p0, @Nullable Throwable p1) {
        p0.getClass();
        super.afterExecute(p0, p1);
        p0.getClass();
        if (p1 != null) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AFEXECUTOR, "Error while executing task: ".concat(String.valueOf(p0)), p1, true, true, true, false, 64, null);
            return;
        }
        synchronized (this) {
            while (!this.getMonetizationNetwork.isEmpty()) {
                try {
                    Runnable runnablePoll = this.getMonetizationNetwork.poll();
                    if (runnablePoll != null) {
                        AFd1qSDK.getRevenue().execute(runnablePoll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }

    public /* synthetic */ AFd1sSDK(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, timeUnit, blockingQueue, (i3 & 32) != 0 ? new LinkedList() : queue);
    }
}
