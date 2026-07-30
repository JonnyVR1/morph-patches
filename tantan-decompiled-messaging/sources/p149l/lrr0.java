package p149l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public final class lrr0 implements Runnable {
    public /* synthetic */ lrr0(krr0 krr0Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            mrr0.f135404b = MessageDigest.getInstance("MD5");
            countDownLatch = mrr0.f135407e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = mrr0.f135407e;
        } catch (Throwable th) {
            mrr0.f135407e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
