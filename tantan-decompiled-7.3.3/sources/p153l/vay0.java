package p153l;

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
public final class vay0 {

    /* JADX INFO: renamed from: a */
    public final TelemetryLoggingClient f183177a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f183178b = new AtomicLong(-1);

    @VisibleForTesting
    public vay0(Context context, String str) {
        this.f183177a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:natural_language").build());
    }

    /* JADX INFO: renamed from: a */
    public static vay0 m200635a(Context context) {
        return new vay0(context, "mlkit:natural_language");
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m200636b(long j, Exception exc) {
        this.f183178b.set(j);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m200637c(int i, int i2, long j, long j2) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f183178b.get() != -1 && jElapsedRealtime - this.f183178b.get() <= 1800000) {
            return;
        }
        this.f183177a.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0)))).mo15419d(new fm50() { // from class: l.qay0
            @Override // p153l.fm50
            public final void onFailure(Exception exc) {
                this.f156440a.m200636b(jElapsedRealtime, exc);
            }
        });
    }
}
