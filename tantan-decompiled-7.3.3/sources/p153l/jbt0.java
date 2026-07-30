package p153l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class jbt0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f119992a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f119993b;

    public jbt0(String str) {
        this.f119993b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f119993b + ") #" + this.f119992a.getAndIncrement());
    }
}
