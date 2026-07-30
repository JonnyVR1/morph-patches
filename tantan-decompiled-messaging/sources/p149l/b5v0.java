package p149l;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class b5v0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public ThreadFactory f73702a = Executors.defaultThreadFactory();

    public b5v0(tpu0 tpu0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f73702a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
