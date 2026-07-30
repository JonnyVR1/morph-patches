package p153l;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class hev0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public ThreadFactory f109189a = Executors.defaultThreadFactory();

    public hev0(zyu0 zyu0Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f109189a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
