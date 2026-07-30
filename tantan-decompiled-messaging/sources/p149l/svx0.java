package p149l;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
public final class svx0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static pfy0 m186113a(Context context, hxx0 hxx0Var, boolean z) {
        mey0 mey0VarM154342n = mey0.m154342n(context);
        if (mey0VarM154342n == null) {
            svv0.m186111f("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new pfy0(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            hxx0Var.mo124676h(mey0VarM154342n);
        }
        return new pfy0(mey0VarM154342n.m154355l());
    }
}
