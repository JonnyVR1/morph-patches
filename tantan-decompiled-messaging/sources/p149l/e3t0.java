package p149l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class e3t0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f89214a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f89215b;

    public e3t0(String str) {
        this.f89215b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f89215b + ") #" + this.f89214a.getAndIncrement());
    }
}
