package p149l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class d2t0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f83431a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f83432b;

    public d2t0(String str) {
        this.f83432b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f83432b + ") #" + this.f83431a.getAndIncrement());
    }
}
