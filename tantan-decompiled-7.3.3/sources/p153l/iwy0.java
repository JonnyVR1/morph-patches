package p153l;

import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
public final class iwy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m142396a(xvy0 xvy0Var, voy0 voy0Var) {
        LogSessionId logSessionIdM202183a = voy0Var.m202183a();
        if (logSessionIdM202183a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        xvy0Var.f196445b.setString("log-session-id", logSessionIdM202183a.getStringId());
    }
}
