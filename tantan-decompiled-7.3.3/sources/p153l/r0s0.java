package p153l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public final class r0s0 implements Runnable {
    public /* synthetic */ r0s0(q0s0 q0s0Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            s0s0.f165726b = MessageDigest.getInstance("MD5");
            countDownLatch = s0s0.f165729e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = s0s0.f165729e;
        } catch (Throwable th) {
            s0s0.f165729e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
