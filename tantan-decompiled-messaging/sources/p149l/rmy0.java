package p149l;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class rmy0 {

    /* JADX INFO: renamed from: a */
    public final bny0 f160222a;

    /* JADX INFO: renamed from: b */
    public final MediaFormat f160223b;

    /* JADX INFO: renamed from: c */
    public final mhr0 f160224c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Surface f160225d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final MediaCrypto f160226e = null;

    public rmy0(bny0 bny0Var, MediaFormat mediaFormat, mhr0 mhr0Var, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
        this.f160222a = bny0Var;
        this.f160223b = mediaFormat;
        this.f160224c = mhr0Var;
        this.f160225d = surface;
    }

    /* JADX INFO: renamed from: a */
    public static rmy0 m180051a(bny0 bny0Var, MediaFormat mediaFormat, mhr0 mhr0Var, @Nullable MediaCrypto mediaCrypto) {
        return new rmy0(bny0Var, mediaFormat, mhr0Var, null, null, 0);
    }

    /* JADX INFO: renamed from: b */
    public static rmy0 m180052b(bny0 bny0Var, MediaFormat mediaFormat, mhr0 mhr0Var, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new rmy0(bny0Var, mediaFormat, mhr0Var, surface, null, 0);
    }
}
