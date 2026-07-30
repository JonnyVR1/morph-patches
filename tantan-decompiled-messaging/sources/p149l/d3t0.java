package p149l;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class d3t0 extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public d3t0(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        reg0.m179043a(this);
    }
}
