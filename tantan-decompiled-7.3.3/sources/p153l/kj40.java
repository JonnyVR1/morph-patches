package p153l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class kj40 extends f2e0 {

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f127072b;

    public kj40(ThreadFactory threadFactory) {
        this.f127072b = threadFactory;
    }

    @Override // p153l.f2e0
    public f2e0.AbstractC16877a createWorker() {
        return new lj40(this.f127072b);
    }
}
