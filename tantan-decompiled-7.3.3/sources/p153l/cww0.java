package p153l;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class cww0 extends jvw0 implements ScheduledFuture, hpr {

    /* JADX INFO: renamed from: b */
    public final ScheduledFuture f84153b;

    public cww0(hpr hprVar, ScheduledFuture scheduledFuture) {
        super(hprVar);
        this.f84153b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = mo142363b().cancel(z);
        if (zCancel) {
            this.f84153b.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f84153b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f84153b.getDelay(timeUnit);
    }
}
