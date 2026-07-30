package p149l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class wa40 extends bud0 {

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f185430b;

    public wa40(ThreadFactory threadFactory) {
        this.f185430b = threadFactory;
    }

    @Override // p149l.bud0
    public bud0.AbstractC15976a createWorker() {
        return new xa40(this.f185430b);
    }
}
