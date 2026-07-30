package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class tvt0 implements z7s0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f176296a;

    /* JADX INFO: renamed from: b */
    public final Clock f176297b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ScheduledFuture f176298c;

    /* JADX INFO: renamed from: d */
    public long f176299d = -1;

    /* JADX INFO: renamed from: e */
    public long f176300e = -1;

    /* JADX INFO: renamed from: f */
    public Runnable f176301f = null;

    /* JADX INFO: renamed from: g */
    public boolean f176302g = false;

    public tvt0(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.f176296a = scheduledExecutorService;
        this.f176297b = clock;
        bxy0.m106920d().m96485c(this);
    }

    @Override // p153l.z7s0
    /* JADX INFO: renamed from: a */
    public final void mo120216a(boolean z) {
        if (z) {
            m192834c();
        } else {
            m192833b();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final synchronized void m192833b() {
        try {
            if (this.f176302g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f176298c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f176300e = -1L;
            } else {
                this.f176298c.cancel(true);
                this.f176300e = this.f176299d - this.f176297b.elapsedRealtime();
            }
            this.f176302g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final synchronized void m192834c() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.f176302g) {
                if (this.f176300e > 0 && (scheduledFuture = this.f176298c) != null && scheduledFuture.isCancelled()) {
                    this.f176298c = this.f176296a.schedule(this.f176301f, this.f176300e, TimeUnit.MILLISECONDS);
                }
                this.f176302g = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m192835d(int i, Runnable runnable) {
        this.f176301f = runnable;
        long j = i;
        this.f176299d = this.f176297b.elapsedRealtime() + j;
        this.f176298c = this.f176296a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
