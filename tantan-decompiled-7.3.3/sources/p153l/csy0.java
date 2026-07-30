package p153l;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
public final class csy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m112441a(AudioTrack audioTrack, voy0 voy0Var) {
        LogSessionId logSessionIdM202183a = voy0Var.m202183a();
        if (logSessionIdM202183a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdM202183a);
    }
}
