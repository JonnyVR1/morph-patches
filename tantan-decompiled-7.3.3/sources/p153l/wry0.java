package p153l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
public final class wry0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static fpy0 m207712a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return fpy0.f100230d;
        }
        bpy0 bpy0Var = new bpy0();
        boolean z2 = false;
        if (mpw0.f137957a > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        bpy0Var.m105865a(true);
        bpy0Var.m105866b(z2);
        bpy0Var.m105867c(z);
        return bpy0Var.m105868d();
    }
}
