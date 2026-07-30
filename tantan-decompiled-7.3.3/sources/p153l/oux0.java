package p153l;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(24)
public final class oux0 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec.CryptoInfo f149219a;

    /* JADX INFO: renamed from: b */
    public final MediaCodec.CryptoInfo.Pattern f149220b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m169409a(oux0 oux0Var, int i, int i2) {
        oux0Var.f149220b.set(i, i2);
        oux0Var.f149219a.setPattern(oux0Var.f149220b);
    }
}
