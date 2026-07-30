package p149l;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
public final class wiy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m203359a(AudioTrack audioTrack, pfy0 pfy0Var) {
        LogSessionId logSessionIdM168660a = pfy0Var.m168660a();
        if (logSessionIdM168660a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdM168660a);
    }
}
