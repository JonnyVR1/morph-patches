package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class duv0 extends x4v0 {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f90883a;

    public duv0(ExecutorService executorService) {
        executorService.getClass();
        this.f90883a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f90883a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f90883a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f90883a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f90883a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f90883a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f90883a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f90883a;
        return super.toString() + "[" + String.valueOf(executorService) + Constants.AES_SUFFIX;
    }
}
