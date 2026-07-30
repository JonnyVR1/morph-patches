package p153l;

import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(29)
public final class xoy0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static int m212487a(int i, int i2, w3y0 w3y0Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM159424v = mpw0.m159424v(i3);
            if (iM159424v != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM159424v).build(), w3y0Var.m204797a().f176116a)) {
                return i3;
            }
        }
        return 0;
    }
}
