package p153l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class kct0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f125097a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f125098b;

    public kct0(String str) {
        this.f125098b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f125098b + ") #" + this.f125097a.getAndIncrement());
    }
}
