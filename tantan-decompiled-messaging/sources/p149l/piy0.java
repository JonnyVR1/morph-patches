package p149l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(29)
public final class piy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static zfy0 m169766a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return zfy0.f202996d;
        }
        vfy0 vfy0Var = new vfy0();
        vfy0Var.m198304a(true);
        vfy0Var.m198306c(z);
        return vfy0Var.m198307d();
    }
}
