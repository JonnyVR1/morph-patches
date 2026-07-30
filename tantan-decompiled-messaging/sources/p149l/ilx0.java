package p149l;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(24)
public final class ilx0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec.CryptoInfo f113883a;

    /* JADX INFO: renamed from: b */
    public final MediaCodec.CryptoInfo.Pattern f113884b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m137057a(ilx0 ilx0Var, int i, int i2) {
        ilx0Var.f113884b.set(i, i2);
        ilx0Var.f113883a.setPattern(ilx0Var.f113884b);
    }
}
