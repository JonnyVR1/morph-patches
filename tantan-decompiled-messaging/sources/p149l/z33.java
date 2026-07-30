package p149l;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class z33 {
    /* JADX INFO: renamed from: a */
    public static void m217013a(CountDownLatch countDownLatch, c4g0 c4g0Var) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            c4g0Var.unsubscribe();
            Thread.currentThread().interrupt();
            byv.m104511a("Interrupted while waiting for subscription to complete.", e);
        }
    }
}
