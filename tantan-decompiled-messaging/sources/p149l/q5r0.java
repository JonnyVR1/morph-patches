package p149l;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class q5r0<T> implements b7r0<T> {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f152819a = new CountDownLatch(1);

    public /* synthetic */ q5r0(e4r0 e4r0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final void m173099a() throws InterruptedException {
        this.f152819a.await();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m173100b(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f152819a.await(j, timeUnit);
    }

    @Override // p149l.hd50
    public final void onCanceled() {
        this.f152819a.countDown();
    }

    @Override // p149l.yd50
    public final void onFailure(@NonNull Exception exc) {
        this.f152819a.countDown();
    }

    @Override // p149l.ng50
    public final void onSuccess(T t) {
        this.f152819a.countDown();
    }
}
