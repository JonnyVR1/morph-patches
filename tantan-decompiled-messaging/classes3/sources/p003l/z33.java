package p003l;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class z33 {
    /* JADX INFO: renamed from: a */
    public static void m9239a(CountDownLatch countDownLatch, c4g0 c4g0Var) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            c4g0Var.unsubscribe();
            Thread.currentThread().interrupt();
            byv.m3203a("Interrupted while waiting for subscription to complete.", e);
        }
    }
}
