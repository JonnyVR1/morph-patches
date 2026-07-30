package p153l;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class p43 {
    /* JADX INFO: renamed from: a */
    public static void m170541a(CountDownLatch countDownLatch, kcg0 kcg0Var) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            kcg0Var.unsubscribe();
            Thread.currentThread().interrupt();
            yzv.m218057a("Interrupted while waiting for subscription to complete.", e);
        }
    }
}
