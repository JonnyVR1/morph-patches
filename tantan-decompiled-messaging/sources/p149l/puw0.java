package p149l;

import android.content.Context;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class puw0 {

    /* JADX INFO: renamed from: d */
    public static puw0 f151364d;

    /* JADX INFO: renamed from: e */
    public static final Duration f151365e = Duration.ofMinutes(30);

    /* JADX INFO: renamed from: a */
    public final ujx0 f151366a;

    /* JADX INFO: renamed from: b */
    public final TelemetryLoggingClient f151367b;

    /* JADX INFO: renamed from: c */
    public final AtomicLong f151368c = new AtomicLong(-1);

    public puw0(Context context, ujx0 ujx0Var) {
        this.f151367b = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.f151366a = ujx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static puw0 m171484a(ujx0 ujx0Var) {
        if (f151364d == null) {
            f151364d = new puw0(ujx0Var.zza(), ujx0Var);
        }
        return f151364d;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m171485b(int i, int i2, long j, long j2, int i3) {
        final long jElapsedRealtime = this.f151366a.zzb().elapsedRealtime();
        if (this.f151368c.get() != -1 && jElapsedRealtime - this.f151368c.get() <= f151365e.toMillis()) {
            return;
        }
        this.f151367b.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i2, 0, j, j2, null, null, 0, i3)))).mo15365d(new yd50() { // from class: l.itw0
            @Override // p149l.yd50
            public final void onFailure(Exception exc) {
                this.f114949a.m171486c(jElapsedRealtime, exc);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m171486c(long j, Exception exc) {
        this.f151368c.set(j);
    }
}
