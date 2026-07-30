package p153l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(29)
public final class vry0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static fpy0 m202567a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return fpy0.f100230d;
        }
        bpy0 bpy0Var = new bpy0();
        bpy0Var.m105865a(true);
        bpy0Var.m105867c(z);
        return bpy0Var.m105868d();
    }
}
