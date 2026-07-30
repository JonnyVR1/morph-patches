package p153l;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class jct0 extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public jct0(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        zmg0.m220382a(this);
    }
}
