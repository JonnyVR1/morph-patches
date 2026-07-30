package p153l;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class xvy0 {

    /* JADX INFO: renamed from: a */
    public final hwy0 f196444a;

    /* JADX INFO: renamed from: b */
    public final MediaFormat f196445b;

    /* JADX INFO: renamed from: c */
    public final sqr0 f196446c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Surface f196447d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final MediaCrypto f196448e = null;

    public xvy0(hwy0 hwy0Var, MediaFormat mediaFormat, sqr0 sqr0Var, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
        this.f196444a = hwy0Var;
        this.f196445b = mediaFormat;
        this.f196446c = sqr0Var;
        this.f196447d = surface;
    }

    /* JADX INFO: renamed from: a */
    public static xvy0 m213281a(hwy0 hwy0Var, MediaFormat mediaFormat, sqr0 sqr0Var, @Nullable MediaCrypto mediaCrypto) {
        return new xvy0(hwy0Var, mediaFormat, sqr0Var, null, null, 0);
    }

    /* JADX INFO: renamed from: b */
    public static xvy0 m213282b(hwy0 hwy0Var, MediaFormat mediaFormat, sqr0 sqr0Var, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new xvy0(hwy0Var, mediaFormat, sqr0Var, surface, null, 0);
    }
}
