package p153l;

import com.facebook.C1600c;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/iyv;", p7f.GPS_DIRECTION_TRUE, "", "Ljava/util/concurrent/Callable;", "callable", "<init>", "(Ljava/util/concurrent/Callable;)V", "", "c", "()V", "a", "Ljava/lang/Object;", "storedValue", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "initLatch", "()Ljava/lang/Object;", "value", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class iyv<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public T storedValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public CountDownLatch initLatch;

    public iyv(@NotNull final Callable<T> callable) {
        callable.getClass();
        this.initLatch = new CountDownLatch(1);
        C1600c.m8110u().execute(new FutureTask(new Callable() { // from class: l.hyv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return iyv.m142745a(this.f112169a, callable);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static Void m142745a(iyv iyvVar, Callable callable) {
        iyvVar.getClass();
        callable.getClass();
        try {
            iyvVar.storedValue = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = iyvVar.initLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final T m142746b() {
        m142747c();
        return this.storedValue;
    }

    /* JADX INFO: renamed from: c */
    public final void m142747c() {
        CountDownLatch countDownLatch = this.initLatch;
        if (countDownLatch == null) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }
}
