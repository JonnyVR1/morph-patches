package p153l;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class jvv0 extends vav0 implements ScheduledFuture, lqv0 {

    /* JADX INFO: renamed from: b */
    public final ScheduledFuture f122841b;

    public jvv0(lqv0 lqv0Var, ScheduledFuture scheduledFuture) {
        super(lqv0Var);
        this.f122841b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = mo171392b().cancel(z);
        if (zCancel) {
            this.f122841b.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f122841b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f122841b.getDelay(timeUnit);
    }
}
