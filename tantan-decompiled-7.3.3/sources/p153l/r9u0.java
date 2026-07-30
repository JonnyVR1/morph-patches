package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class r9u0 extends kdu0 {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f161871b;

    /* JADX INFO: renamed from: c */
    public final Clock f161872c;

    /* JADX INFO: renamed from: d */
    public long f161873d;

    /* JADX INFO: renamed from: e */
    public long f161874e;

    /* JADX INFO: renamed from: f */
    public boolean f161875f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ScheduledFuture f161876g;

    public r9u0(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.EMPTY_SET);
        this.f161873d = -1L;
        this.f161874e = -1L;
        this.f161875f = false;
        this.f161871b = scheduledExecutorService;
        this.f161872c = clock;
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized void m180659w0(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f161875f) {
                long j = this.f161874e;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f161874e = millis;
                return;
            }
            long jElapsedRealtime = this.f161872c.elapsedRealtime();
            long j2 = this.f161873d;
            if (jElapsedRealtime > j2 || j2 - this.f161872c.elapsedRealtime() > millis) {
                m180660z0(millis);
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final synchronized void m180660z0(long j) {
        try {
            ScheduledFuture scheduledFuture = this.f161876g;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f161876g.cancel(true);
            }
            this.f161873d = this.f161872c.elapsedRealtime() + j;
            this.f161876g = this.f161871b.schedule(new q9u0(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.f161875f = false;
        m180660z0(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.f161875f) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f161876g;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f161874e = -1L;
            } else {
                this.f161876g.cancel(true);
                this.f161874e = this.f161873d - this.f161872c.elapsedRealtime();
            }
            this.f161875f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            if (this.f161875f) {
                if (this.f161874e > 0 && this.f161876g.isCancelled()) {
                    m180660z0(this.f161874e);
                }
                this.f161875f = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
