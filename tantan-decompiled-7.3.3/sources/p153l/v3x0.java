package p153l;

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
public final class v3x0 {

    /* JADX INFO: renamed from: d */
    public static v3x0 f182308d;

    /* JADX INFO: renamed from: e */
    public static final Duration f182309e = Duration.ofMinutes(30);

    /* JADX INFO: renamed from: a */
    public final atx0 f182310a;

    /* JADX INFO: renamed from: b */
    public final TelemetryLoggingClient f182311b;

    /* JADX INFO: renamed from: c */
    public final AtomicLong f182312c = new AtomicLong(-1);

    public v3x0(Context context, atx0 atx0Var) {
        this.f182311b = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.f182310a = atx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static v3x0 m199632a(atx0 atx0Var) {
        if (f182308d == null) {
            f182308d = new v3x0(atx0Var.zza(), atx0Var);
        }
        return f182308d;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m199633b(int i, int i2, long j, long j2, int i3) {
        final long jElapsedRealtime = this.f182310a.zzb().elapsedRealtime();
        if (this.f182312c.get() != -1 && jElapsedRealtime - this.f182312c.get() <= f182309e.toMillis()) {
            return;
        }
        this.f182311b.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i2, 0, j, j2, null, null, 0, i3)))).mo15419d(new fm50() { // from class: l.o2x0
            @Override // p153l.fm50
            public final void onFailure(Exception exc) {
                this.f144805a.m199634c(jElapsedRealtime, exc);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m199634c(long j, Exception exc) {
        this.f182312c.set(j);
    }
}
