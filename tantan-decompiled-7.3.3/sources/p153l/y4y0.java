package p153l;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
public final class y4y0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static voy0 m214280a(Context context, n6y0 n6y0Var, boolean z) {
        sny0 sny0VarM187029n = sny0.m187029n(context);
        if (sny0VarM187029n == null) {
            y4w0.m214278f("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new voy0(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            n6y0Var.mo156547h(sny0VarM187029n);
        }
        return new voy0(sny0VarM187029n.m187033l());
    }
}
