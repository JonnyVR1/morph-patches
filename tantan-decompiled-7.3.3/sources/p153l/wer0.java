package p153l;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class wer0<T> implements hgr0<T> {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f188721a = new CountDownLatch(1);

    public /* synthetic */ wer0(kdr0 kdr0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final void m206029a() throws InterruptedException {
        this.f188721a.await();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m206030b(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f188721a.await(j, timeUnit);
    }

    @Override // p153l.ol50
    public final void onCanceled() {
        this.f188721a.countDown();
    }

    @Override // p153l.fm50
    public final void onFailure(@NonNull Exception exc) {
        this.f188721a.countDown();
    }

    @Override // p153l.to50
    public final void onSuccess(T t) {
        this.f188721a.countDown();
    }
}
