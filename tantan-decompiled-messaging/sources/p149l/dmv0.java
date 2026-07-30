package p149l;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class dmv0 extends p1v0 implements ScheduledFuture, fhv0 {

    /* JADX INFO: renamed from: b */
    public final ScheduledFuture f86993b;

    public dmv0(fhv0 fhv0Var, ScheduledFuture scheduledFuture) {
        super(fhv0Var);
        this.f86993b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = mo139204b().cancel(z);
        if (zCancel) {
            this.f86993b.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f86993b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f86993b.getDelay(timeUnit);
    }
}
