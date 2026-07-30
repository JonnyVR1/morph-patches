package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class xkv0 extends rvu0 {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f193362a;

    public xkv0(ExecutorService executorService) {
        executorService.getClass();
        this.f193362a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f193362a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f193362a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f193362a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f193362a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f193362a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f193362a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f193362a;
        return super.toString() + "[" + String.valueOf(executorService) + Constants.AES_SUFFIX;
    }
}
