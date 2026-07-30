package p149l;

import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
public final class cny0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m107837a(rmy0 rmy0Var, pfy0 pfy0Var) {
        LogSessionId logSessionIdM168660a = pfy0Var.m168660a();
        if (logSessionIdM168660a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        rmy0Var.f160223b.setString("log-session-id", logSessionIdM168660a.getStringId());
    }
}
