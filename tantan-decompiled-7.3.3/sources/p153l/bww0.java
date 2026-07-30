package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class bww0 extends luw0 {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f78796a;

    public bww0(ExecutorService executorService) {
        executorService.getClass();
        this.f78796a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f78796a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f78796a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f78796a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f78796a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f78796a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f78796a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f78796a;
        return super.toString() + "[" + String.valueOf(executorService) + Constants.AES_SUFFIX;
    }
}
