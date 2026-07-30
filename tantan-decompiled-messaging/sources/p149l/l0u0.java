package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class l0u0 extends e4u0 {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f125574b;

    /* JADX INFO: renamed from: c */
    public final Clock f125575c;

    /* JADX INFO: renamed from: d */
    public long f125576d;

    /* JADX INFO: renamed from: e */
    public long f125577e;

    /* JADX INFO: renamed from: f */
    public boolean f125578f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ScheduledFuture f125579g;

    public l0u0(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.EMPTY_SET);
        this.f125576d = -1L;
        this.f125577e = -1L;
        this.f125578f = false;
        this.f125574b = scheduledExecutorService;
        this.f125575c = clock;
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized void m148122w0(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f125578f) {
                long j = this.f125577e;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f125577e = millis;
                return;
            }
            long jElapsedRealtime = this.f125575c.elapsedRealtime();
            long j2 = this.f125576d;
            if (jElapsedRealtime > j2 || j2 - this.f125575c.elapsedRealtime() > millis) {
                m148123z0(millis);
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final synchronized void m148123z0(long j) {
        try {
            ScheduledFuture scheduledFuture = this.f125579g;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f125579g.cancel(true);
            }
            this.f125576d = this.f125575c.elapsedRealtime() + j;
            this.f125579g = this.f125574b.schedule(new k0u0(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.f125578f = false;
        m148123z0(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.f125578f) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f125579g;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f125577e = -1L;
            } else {
                this.f125579g.cancel(true);
                this.f125577e = this.f125576d - this.f125575c.elapsedRealtime();
            }
            this.f125578f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            if (this.f125578f) {
                if (this.f125577e > 0 && this.f125579g.isCancelled()) {
                    m148123z0(this.f125577e);
                }
                this.f125578f = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
