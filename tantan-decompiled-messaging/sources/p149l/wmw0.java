package p149l;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class wmw0 extends dmw0 implements ScheduledFuture, gnr {

    /* JADX INFO: renamed from: b */
    public final ScheduledFuture f187171b;

    public wmw0(gnr gnrVar, ScheduledFuture scheduledFuture) {
        super(gnrVar);
        this.f187171b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = mo107700b().cancel(z);
        if (zCancel) {
            this.f187171b.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f187171b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f187171b.getDelay(timeUnit);
    }
}
