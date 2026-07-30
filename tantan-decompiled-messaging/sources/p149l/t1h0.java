package p149l;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t1h0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CountDownLatch f167346a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f167346a.countDown();
    }
}
