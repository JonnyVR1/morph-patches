package p003l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class wa40 extends bud0 {

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f8525b;

    public wa40(ThreadFactory threadFactory) {
        this.f8525b = threadFactory;
    }

    @Override // p003l.bud0
    public bud0.AbstractC0185a createWorker() {
        return new xa40(this.f8525b);
    }
}
