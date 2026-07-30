package p149l;

import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(29)
public final class rfy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static int m179152a(int i, int i2, qux0 qux0Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM126080v = ggw0.m126080v(i3);
            if (iM126080v != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM126080v).build(), qux0Var.m176664a().f139488a)) {
                return i3;
            }
        }
        return 0;
    }
}
