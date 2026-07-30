package p149l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
public final class qiy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static zfy0 m174924a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zfy0.f202996d;
        }
        vfy0 vfy0Var = new vfy0();
        boolean z2 = false;
        if (ggw0.f102568a > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        vfy0Var.m198304a(true);
        vfy0Var.m198305b(z2);
        vfy0Var.m198306c(z);
        return vfy0Var.m198307d();
    }
}
