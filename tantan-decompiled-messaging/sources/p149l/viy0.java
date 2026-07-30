package p149l;

import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(23)
public final class viy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static void m198613a(AudioTrack audioTrack, @Nullable xiy0 xiy0Var) {
        audioTrack.setPreferredDevice(xiy0Var == null ? null : xiy0Var.f193165a);
    }
}
