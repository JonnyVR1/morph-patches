package p149l;

import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(30)
public final class k2r0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m144338a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            svv0.m186109d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
