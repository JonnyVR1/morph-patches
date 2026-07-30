package p153l;

import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(30)
public final class qbr0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m176067a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            y4w0.m214276d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
