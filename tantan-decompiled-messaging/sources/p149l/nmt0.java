package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class nmt0 implements tyr0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f139661a;

    /* JADX INFO: renamed from: b */
    public final Clock f139662b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ScheduledFuture f139663c;

    /* JADX INFO: renamed from: d */
    public long f139664d = -1;

    /* JADX INFO: renamed from: e */
    public long f139665e = -1;

    /* JADX INFO: renamed from: f */
    public Runnable f139666f = null;

    /* JADX INFO: renamed from: g */
    public boolean f139667g = false;

    public nmt0(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.f139661a = scheduledExecutorService;
        this.f139662b = clock;
        vny0.m199066d().m196345c(this);
    }

    @Override // p149l.tyr0
    /* JADX INFO: renamed from: a */
    public final void mo104920a(boolean z) {
        if (z) {
            m160157c();
        } else {
            m160156b();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final synchronized void m160156b() {
        try {
            if (this.f139667g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f139663c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f139665e = -1L;
            } else {
                this.f139663c.cancel(true);
                this.f139665e = this.f139664d - this.f139662b.elapsedRealtime();
            }
            this.f139667g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final synchronized void m160157c() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.f139667g) {
                if (this.f139665e > 0 && (scheduledFuture = this.f139663c) != null && scheduledFuture.isCancelled()) {
                    this.f139663c = this.f139661a.schedule(this.f139666f, this.f139665e, TimeUnit.MILLISECONDS);
                }
                this.f139667g = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m160158d(int i, Runnable runnable) {
        this.f139666f = runnable;
        long j = i;
        this.f139664d = this.f139662b.elapsedRealtime() + j;
        this.f139663c = this.f139661a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
