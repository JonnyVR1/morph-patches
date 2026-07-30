package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class vmw0 extends flw0 {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f182167a;

    public vmw0(ExecutorService executorService) {
        executorService.getClass();
        this.f182167a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f182167a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f182167a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f182167a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f182167a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f182167a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f182167a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f182167a;
        return super.toString() + "[" + String.valueOf(executorService) + Constants.AES_SUFFIX;
    }
}
