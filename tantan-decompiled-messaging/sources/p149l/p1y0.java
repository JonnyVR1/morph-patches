package p149l;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class p1y0 {

    /* JADX INFO: renamed from: a */
    public final TelemetryLoggingClient f146780a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f146781b = new AtomicLong(-1);

    @VisibleForTesting
    public p1y0(Context context, String str) {
        this.f146780a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:natural_language").build());
    }

    /* JADX INFO: renamed from: a */
    public static p1y0 m167120a(Context context) {
        return new p1y0(context, "mlkit:natural_language");
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m167121b(long j, Exception exc) {
        this.f146781b.set(j);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m167122c(int i, int i2, long j, long j2) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f146781b.get() != -1 && jElapsedRealtime - this.f146781b.get() <= 1800000) {
            return;
        }
        this.f146780a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0)))).mo15365d(new yd50() { // from class: l.k1y0
            @Override // p149l.yd50
            public final void onFailure(Exception exc) {
                this.f120670a.m167121b(jElapsedRealtime, exc);
            }
        });
    }
}
