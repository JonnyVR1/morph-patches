package p153l;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bah0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CountDownLatch f75694a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f75694a.countDown();
    }
}
